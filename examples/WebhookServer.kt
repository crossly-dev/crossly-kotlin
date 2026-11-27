// A Crossly webhook receiver on Ktor 3: the plugin verifies the Crossly-Signature over the raw body before the
// handler runs, and answers 400 to anything that does not verify.
//
//   implementation("net.crossly:crossly-kotlin:<version>")
//   implementation("io.ktor:ktor-server-netty:3.1.3")
//   CROSSLY_WEBHOOK_SECRET=... ./gradlew run      # Settings -> Webhooks; point the endpoint at http://<host>:8080/webhooks/crossly
package examples.webhookserver

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.install
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.response.respond
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import net.crossly.webhooks.ktor.CrosslyWebhookVerification
import net.crossly.webhooks.ktor.crosslyWebhookBody

fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            route("/webhooks/crossly") {
                install(CrosslyWebhookVerification) { secret = System.getenv("CROSSLY_WEBHOOK_SECRET") }
                post {
                    // The verified JSON ({"id","type","created","data"}): parse it with your own serializer.
                    println(call.crosslyWebhookBody)
                    // Answer fast; do slow work after replying, or Crossly retries the delivery.
                    call.respond(HttpStatusCode.NoContent)
                }
            }
        }
    }.start(wait = true)
}
