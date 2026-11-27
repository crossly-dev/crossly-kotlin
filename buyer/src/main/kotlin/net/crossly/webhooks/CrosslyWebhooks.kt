package net.crossly.webhooks

import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.time.Instant
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import kotlin.math.abs

/**
 * Verify a Crossly webhook.
 *
 * ```
 * Crossly-Signature: t=<unix seconds>,v1=<hex HMAC-SHA256>
 * ```
 *
 * signed over `"$t.$rawBody"` with the endpoint's signing secret.
 *
 * Three ways to get this wrong, all silent:
 *
 * 1. Verifying a re-serialised body. Any JSON library's parse-then-write
 *    reorders keys and reformats numbers, so genuine payloads fail and the
 *    usual fix is to stop verifying. In Ktor use `call.receiveText()`; in
 *    Spring, `@RequestBody ByteArray`.
 * 2. Comparing with `==`. String equality returns early on the first differing
 *    character; [MessageDigest.isEqual] does not.
 * 3. Ignoring the timestamp. Without it a captured request replays forever. The
 *    timestamp is INSIDE the signed message, so it cannot be edited to look
 *    fresh.
 *
 * JDK only — no dependencies. Returns the raw body rather than a parsed object
 * so this has no opinion about your serialisation library.
 */
object CrosslyWebhooks {

    const val DEFAULT_TOLERANCE_SECONDS = 300

    /**
     * Thrown when a webhook does not verify.
     *
     * [reason] is stable across every language port, so a shared alerting rule
     * can distinguish a forged request from a clock problem.
     */
    class VerificationException(
        /** malformed_header | bad_signature | timestamp_out_of_tolerance | missing_secret */
        val reason: String,
        message: String,
    ) : Exception(message)

    /**
     * Verify a webhook and return the raw body.
     *
     * Throws rather than returning a Boolean so a caller who forgets to check a
     * return value does not silently accept forged events.
     *
     * @param rawBody the EXACT bytes received
     * @param signatureHeader the `Crossly-Signature` header, verbatim
     * @param secret the endpoint's signing secret
     * @param now override the clock, for tests
     */
    @JvmStatic
    @JvmOverloads
    @Throws(VerificationException::class)
    fun verify(
        rawBody: ByteArray,
        signatureHeader: String?,
        secret: String,
        toleranceSeconds: Int = DEFAULT_TOLERANCE_SECONDS,
        now: Long? = null,
    ): String {
        if (secret.isEmpty()) {
            throw VerificationException("missing_secret", "A webhook signing secret is required.")
        }
        if (signatureHeader.isNullOrEmpty()) {
            throw VerificationException(
                "malformed_header",
                "No Crossly-Signature header on the request.",
            )
        }

        var timestamp: Long? = null
        var provided: String? = null

        // Field-wise rather than one regex, so a future v2= alongside v1= does
        // not break existing verifiers — the entire reason the scheme is
        // versioned.
        for (part in signatureHeader.split(",")) {
            val eq = part.indexOf('=')
            if (eq < 0) continue
            val key = part.substring(0, eq).trim()
            val value = part.substring(eq + 1).trim()

            when (key) {
                "t" -> timestamp = value.toLongOrNull()
                    ?: throw VerificationException(
                        "malformed_header",
                        "Crossly-Signature carries a non-numeric timestamp.",
                    )
                "v1" -> provided = value
            }
        }

        if (timestamp == null || provided.isNullOrEmpty()) {
            throw VerificationException(
                "malformed_header",
                """Could not parse Crossly-Signature: expected "t=<unix>,v1=<hex>", got """ +
                    "\"${signatureHeader.take(60)}\".",
            )
        }

        val body = String(rawBody, StandardCharsets.UTF_8)
        val expected = hmacHex(secret, "$timestamp.$body")

        // MessageDigest.isEqual is the JDK's constant-time compare, and is safe
        // on a length mismatch — which a truncated signature produces.
        if (!MessageDigest.isEqual(
                expected.toByteArray(StandardCharsets.UTF_8),
                provided.toByteArray(StandardCharsets.UTF_8),
            )
        ) {
            throw VerificationException(
                "bad_signature",
                "Signature did not match. If genuine payloads are failing, you are almost " +
                    "certainly verifying a re-serialised body — pass the bytes you read off the wire.",
            )
        }

        // Freshness AFTER the signature, so an attacker learns nothing about
        // timestamps without already holding a valid signature.
        val current = now ?: Instant.now().epochSecond
        val drift = abs(current - timestamp)
        if (drift > toleranceSeconds) {
            throw VerificationException(
                "timestamp_out_of_tolerance",
                "Timestamp is ${drift}s away from now (tolerance ${toleranceSeconds}s). " +
                    "This is a replay guard — if it fires on live traffic, check your server clock.",
            )
        }

        return body
    }

    private fun hmacHex(secret: String, message: String): String {
        val mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(secret.toByteArray(StandardCharsets.UTF_8), "HmacSHA256"))
        return mac.doFinal(message.toByteArray(StandardCharsets.UTF_8))
            .joinToString("") { "%02x".format(it) }
    }
}
