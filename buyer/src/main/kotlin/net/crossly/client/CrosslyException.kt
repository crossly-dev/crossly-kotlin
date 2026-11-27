package net.crossly.client

import com.squareup.moshi.Moshi

/**
 * A failed Crossly API call, read from the API's error envelope:
 * `{ "error": { "code", "message", "details" }, "correlationId" }`.
 *
 * [code] is the stable machine code to branch on (`validation_error`, `not_found`, `rate_limited`, ...);
 * [correlationId] is what Crossly support needs to find the request. A request that never got a response (DNS, TLS,
 * a timeout after every retry) has [status] 0 and code `network_error`.
 *
 * Shared, byte for byte, by the seller and buyer packages.
 */
class CrosslyException(
    /** HTTP status, or 0 when no response arrived. */
    val status: Int,
    /** The API's machine-readable error code, e.g. `validation_error`. */
    val code: String,
    message: String,
    /** `error.details` from the envelope (field errors, limits, ...): maps, lists, strings, numbers. */
    val details: Any? = null,
    /** Quote this to Crossly support; it threads the request through the server logs. */
    val correlationId: String? = null,
    /** Seconds the API asked to wait (429 / 503), or null. */
    val retryAfterSeconds: Long? = null,
    /** The raw response body, or null. */
    val responseBody: String? = null,
    cause: Throwable? = null,
) : RuntimeException(message, cause) {

    companion object {
        private val envelope by lazy { Moshi.Builder().build().adapter(Map::class.java) }

        /** Build one from an HTTP status, the response body and headers (any of them may be null). */
        @JvmStatic
        fun of(status: Int, body: String?, headers: Map<String, List<String>>?, cause: Throwable?): CrosslyException {
            var code = if (status == 0) "network_error" else "http_$status"
            var message: String? = null
            var details: Any? = null
            var correlationId = header(headers, "x-correlation-id")
            if (!body.isNullOrEmpty()) {
                try {
                    val root = envelope.fromJson(body)
                    (root?.get("correlationId") as? String)?.let { correlationId = it }
                    when (val error = root?.get("error")) {
                        is Map<*, *> -> {
                            (error["code"] as? String)?.let { code = it }
                            message = error["message"] as? String
                            details = error["details"]
                        }
                        is String -> message = error
                    }
                } catch (notJson: Exception) {
                    message = body.take(300)
                }
            }
            val text = message ?: if (status == 0) cause?.message ?: "request failed" else "HTTP $status"
            val retryMillis = CrosslyInterceptor.retryAfterMillis(header(headers, "retry-after"))
            val full = "$code: $text" + (if (status > 0) " (HTTP $status)" else "") +
                (correlationId?.let { " [correlationId $it]" } ?: "")
            return CrosslyException(
                status, code, full, details, correlationId,
                if (retryMillis < 0) null else (retryMillis + 999) / 1000, body, cause,
            )
        }

        private fun header(headers: Map<String, List<String>>?, name: String): String? =
            headers?.entries?.firstOrNull { it.key.equals(name, ignoreCase = true) }?.value?.firstOrNull()
    }
}
