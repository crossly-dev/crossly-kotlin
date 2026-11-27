package net.crossly.webhooks.ktor

import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.ApplicationCall
import io.ktor.server.application.createRouteScopedPlugin
import io.ktor.server.request.receive
import io.ktor.server.response.respondText
import io.ktor.util.AttributeKey
import net.crossly.webhooks.CrosslyWebhooks

/** Configuration of [CrosslyWebhookVerification]. */
class CrosslyWebhookConfig {
    /** The endpoint's signing secret (Settings -> Webhooks). Required. */
    var secret: String = ""

    /** Largest accepted clock drift, in seconds. */
    var toleranceSeconds: Int = CrosslyWebhooks.DEFAULT_TOLERANCE_SECONDS
}

/** Where the plugin leaves the verified body; read it with [crosslyWebhookBody]. */
val CrosslyWebhookBodyKey: AttributeKey<String> = AttributeKey("CrosslyWebhookBody")

/**
 * Ktor (3.x) plugin that verifies the `Crossly-Signature` of every call on the route it is installed on, over the
 * raw body, before your handler runs. A call that does not verify is answered 400 with
 * `{"error":{"code":"<reason>"}}`; one that does carries the verified JSON in [crosslyWebhookBody].
 *
 * ```kotlin
 * routing {
 *     route("/webhooks/crossly") {
 *         install(CrosslyWebhookVerification) { secret = System.getenv("CROSSLY_WEBHOOK_SECRET") }
 *         post {
 *             val event = call.crosslyWebhookBody   // the verified JSON
 *             call.respond(HttpStatusCode.NoContent)
 *         }
 *     }
 * }
 * ```
 *
 * Ktor is not a dependency of the SDK: your app brings its own.
 */
val CrosslyWebhookVerification = createRouteScopedPlugin("CrosslyWebhookVerification", ::CrosslyWebhookConfig) {
    val secret = pluginConfig.secret
    val tolerance = pluginConfig.toleranceSeconds
    require(secret.isNotEmpty()) { "CrosslyWebhookVerification needs a secret (Settings -> Webhooks)" }

    onCall { call ->
        val raw = call.receive<ByteArray>()
        try {
            val body = CrosslyWebhooks.verify(raw, call.request.headers["Crossly-Signature"], secret, tolerance)
            call.attributes.put(CrosslyWebhookBodyKey, body)
        } catch (e: CrosslyWebhooks.VerificationException) {
            call.respondText(
                """{"error":{"code":"${e.reason}","message":"Crossly webhook rejected"}}""",
                ContentType.Application.Json,
                HttpStatusCode.BadRequest,
            )
        }
    }
}

/** The verified webhook body, on a route with [CrosslyWebhookVerification] installed. */
val ApplicationCall.crosslyWebhookBody: String
    get() = attributes[CrosslyWebhookBodyKey]
