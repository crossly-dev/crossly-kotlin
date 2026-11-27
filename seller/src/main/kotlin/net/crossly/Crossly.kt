package net.crossly

import java.time.Duration
import java.util.concurrent.TimeUnit
import net.crossly.client.CrosslyException
import net.crossly.client.CrosslyInterceptor
import net.crossly.client.Pages
import net.crossly.infrastructure.ApiClient
import net.crossly.infrastructure.ClientError
import net.crossly.infrastructure.ClientException
import net.crossly.infrastructure.ServerError
import net.crossly.infrastructure.ServerException

/**
 * The Crossly seller client: configures the generated client (token, User-Agent, timeouts, retries, idempotency
 * keys) and adds auto-pagination and typed errors around the generated API classes.
 *
 * ```kotlin
 * Crossly.configure(token = System.getenv("CROSSLY_TOKEN"))
 * val listings = ListingsApi()
 * ```
 *
 * The generated client keeps its HTTP client and token in process-wide state (`ApiClient.builder`,
 * `ApiClient.accessToken`), built on first use: call [configure] once at start-up, before the first API call.
 *
 * The buyer twin is `net.crossly.buyer.CrosslyBuyer` (same file, other package): keep the two in step.
 */
object Crossly {
    /** This package's version, from the jar manifest ("dev" when run from source). */
    @JvmField
    val VERSION: String = Crossly::class.java.`package`?.implementationVersion ?: "dev"

    @JvmField
    val USER_AGENT: String = "crossly-kotlin/$VERSION"

    /**
     * Configure the generated client. [token] is a Personal Access Token (`crossly_pat_…`, Settings → Developer)
     * or a seller OAuth token. [maxRetries] retries follow a 429, a 5xx or a dropped connection; a `Retry-After`
     * longer than [maxRetryAfter] is returned as the error instead of waited out.
     */
    @JvmStatic
    @JvmOverloads
    fun configure(
        token: String?,
        baseUrl: String? = null,
        maxRetries: Int = 3,
        timeout: Duration = Duration.ofSeconds(30),
        connectTimeout: Duration = Duration.ofSeconds(10),
        maxRetryAfter: Duration = Duration.ofSeconds(60),
        userAgent: String? = null,
    ) {
        require(!token.isNullOrBlank()) {
            "A Crossly token is required: a Personal Access Token (crossly_pat_..., Settings -> Developer) " +
                "or a seller OAuth token."
        }
        ApiClient.accessToken = token.trim()
        if (baseUrl != null) System.setProperty(ApiClient.baseUrlKey, baseUrl)
        val ua = if (userAgent == null) USER_AGENT else "$USER_AGENT $userAgent"
        ApiClient.builder
            .connectTimeout(connectTimeout.toMillis(), TimeUnit.MILLISECONDS)
            .readTimeout(timeout.toMillis(), TimeUnit.MILLISECONDS)
            .writeTimeout(timeout.toMillis(), TimeUnit.MILLISECONDS)
        ApiClient.builder.interceptors().removeAll { it is CrosslyInterceptor }
        ApiClient.builder.addInterceptor(CrosslyInterceptor(maxRetries, maxRetryAfter.toMillis(), ua))
    }

    /** Run one call, turning the generated ClientException / ServerException into [CrosslyException]. */
    inline fun <T> call(block: () -> T): T =
        try {
            block()
        } catch (e: ClientException) {
            throw toCrossly(e)
        } catch (e: ServerException) {
            throw toCrossly(e)
        } catch (e: java.io.IOException) {
            throw toCrossly(e)
        }

    /** The typed form of a generated client failure. */
    @JvmStatic
    fun toCrossly(e: Exception): CrosslyException = when (e) {
        is CrosslyException -> e
        is ClientException -> (e.response as? ClientError<*>).let {
            CrosslyException.of(e.statusCode, it?.body as? String, it?.headers, e)
        }
        is ServerException -> (e.response as? ServerError<*>).let {
            CrosslyException.of(e.statusCode, it?.body as? String, it?.headers, e)
        }
        else -> CrosslyException.of(0, null, null, e)
    }

    /**
     * Every item of a list endpoint, fetched page by page as the sequence is consumed:
     * `Crossly.paginate({ page, limit -> api.listX(page, limit) }) { it.data }`.
     */
    @JvmStatic
    @JvmOverloads
    fun <R, T> paginate(
        fetch: (page: Int, limit: Int) -> R,
        limit: Int = Pages.DEFAULT_LIMIT,
        items: (R) -> List<T>?,
    ): Sequence<T> = Pages.sequence(limit, { page, size -> call { fetch(page, size) } }, items)

    /**
     * Make the writes inside [block] (on this thread) use [key] as their Idempotency-Key, so a retry after a crash
     * cannot create a second order or charge. Without it every POST/PATCH already gets a fresh key per call.
     */
    @JvmStatic
    fun <R> withIdempotencyKey(key: String, block: () -> R): R = CrosslyInterceptor.withIdempotencyKey(key, block)
}
