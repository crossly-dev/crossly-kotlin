package net.crossly.client

import java.io.IOException
import java.io.InterruptedIOException
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import java.util.concurrent.ThreadLocalRandom
import okhttp3.Interceptor
import okhttp3.Response

/**
 * The OkHttp interceptor behind the Crossly facade: User-Agent, Idempotency-Key and retries.
 *
 * - Every POST and PATCH carries an `Idempotency-Key` (a fresh UUID unless [withIdempotencyKey] set one). The API
 *   replays the first response for a repeated key for 24 hours, which is what makes retrying a write safe; a few
 *   money endpoints refuse a write without one.
 * - A 429, 500, 502, 503 or 504, or a connection failure, is retried up to [maxRetries] times with exponential
 *   backoff and jitter. A `Retry-After` header (seconds or an HTTP date) is honoured; one longer than
 *   [maxRetryAfterMillis] is not waited out, and the response is returned as is.
 *
 * Shared, byte for byte, by the seller and buyer packages. It depends only on OkHttp.
 */
class CrosslyInterceptor(
    private val maxRetries: Int,
    private val maxRetryAfterMillis: Long,
    private val userAgent: String?,
) : Interceptor {

    init {
        require(maxRetries >= 0) { "maxRetries must be >= 0" }
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val builder = original.newBuilder()
        if (userAgent != null) builder.header("User-Agent", userAgent)
        val write = original.method == "POST" || original.method == "PATCH"
        if (write && original.header(IDEMPOTENCY_HEADER) == null) {
            builder.header(IDEMPOTENCY_HEADER, nextKey.get() ?: UUID.randomUUID().toString())
        }
        val request = builder.build()

        var attempt = 0
        while (true) {
            val response = try {
                chain.proceed(request)
            } catch (e: IOException) {
                if (attempt >= maxRetries || chain.call().isCanceled()) throw e
                sleep(backoffMillis(attempt))
                attempt++
                continue
            }
            if (attempt >= maxRetries || response.code !in RETRYABLE) return response
            var wait = retryAfterMillis(response.header("Retry-After"))
            if (wait > maxRetryAfterMillis) return response
            if (wait < 0) wait = backoffMillis(attempt)
            response.close()
            sleep(wait)
            attempt++
        }
    }

    companion object {
        const val IDEMPOTENCY_HEADER = "Idempotency-Key"
        private val RETRYABLE = setOf(429, 500, 502, 503, 504)
        private const val BASE_DELAY_MILLIS = 500L
        private const val MAX_DELAY_MILLIS = 20_000L
        private val nextKey = ThreadLocal<String?>()

        /**
         * Run [block] with [key] as the Idempotency-Key of the writes it makes on this thread. Use it when the key
         * must survive a process restart (derive it from your own order or job id); otherwise every write already
         * gets a fresh one.
         */
        @JvmStatic
        fun <R> withIdempotencyKey(key: String, block: () -> R): R {
            val previous = nextKey.get()
            nextKey.set(key)
            try {
                return block()
            } finally {
                if (previous == null) nextKey.remove() else nextKey.set(previous)
            }
        }

        /** Full-jitter exponential backoff: a random delay in [d/2, d], d = 500 ms * 2^attempt, capped at 20 s. */
        internal fun backoffMillis(attempt: Int): Long {
            val d = minOf(MAX_DELAY_MILLIS, BASE_DELAY_MILLIS shl minOf(attempt, 16))
            return d / 2 + ThreadLocalRandom.current().nextLong(d / 2 + 1)
        }

        /** Retry-After as milliseconds: delta-seconds or an HTTP date (RFC 9110). -1 when absent or unreadable. */
        @JvmStatic
        fun retryAfterMillis(value: String?): Long {
            val v = value?.trim().orEmpty()
            if (v.isEmpty()) return -1
            v.toDoubleOrNull()?.let { return (it * 1000).toLong() }
            return try {
                val at = ZonedDateTime.parse(v, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli()
                maxOf(0L, at - System.currentTimeMillis())
            } catch (e: RuntimeException) {
                -1
            }
        }

        private fun sleep(millis: Long) {
            try {
                Thread.sleep(millis)
            } catch (e: InterruptedException) {
                Thread.currentThread().interrupt()
                throw InterruptedIOException("interrupted while waiting to retry")
            }
        }
    }
}
