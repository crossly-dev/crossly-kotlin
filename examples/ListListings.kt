// Print every listing in your Crossly store; pages are fetched as the loop reaches them.
//
//   implementation("net.crossly:crossly-kotlin:<version>")
//   CROSSLY_TOKEN=crossly_pat_... ./gradlew run
package examples.listlistings

import net.crossly.Crossly
import net.crossly.apis.ListingsApi
import net.crossly.client.CrosslyException

fun main() {
    // Once, before the first call: the generated client builds its HTTP client on first use.
    Crossly.configure(token = System.getenv("CROSSLY_TOKEN"))
    val listings = ListingsApi()

    try {
        // One page, the plain generated call: (page, limit, platform, status, sku, updatedSince, kind, tag, stillLive).
        val first = Crossly.call { listings.listListings(1, 25, null, null, null, null, null, null, null) }
        println("first page: ${first.data.size} listings")

        // Every page, lazily.
        Crossly.paginate({ page, limit -> listings.listListings(page, limit, null, null, null, null, null, null, null) }) { it.data }
            .forEach { println("${it.id}  ${it.status}  ${it.title}") }
    } catch (e: CrosslyException) {
        // e.code is the API's machine code; quote e.correlationId to support.
        System.err.println("${e.status} ${e.code} ${e.message} ${e.correlationId}")
    }
}
