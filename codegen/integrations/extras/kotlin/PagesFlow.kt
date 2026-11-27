package net.crossly.client

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

/**
 * [Pages.sequence] as a cold [Flow]: each page is fetched on [Dispatchers.IO] when the collector reaches it (the
 * generated calls block). Needs kotlinx-coroutines on your classpath; the SDK does not bring it.
 *
 * ```kotlin
 * paginateFlow({ page, limit -> Crossly.call { api.listListings(page, limit, ...) } }) { it.data }
 * ```
 *
 * Its own file (and class) so the rest of the SDK loads without coroutines. Shared by the seller and buyer packages.
 */
fun <R, T> paginateFlow(
    fetch: (page: Int, limit: Int) -> R,
    limit: Int = Pages.DEFAULT_LIMIT,
    items: (R) -> List<T>?,
): Flow<T> {
    require(limit >= 1) { "limit must be >= 1" }
    return flow {
        var page = 1
        while (true) {
            val response = fetch(page, limit)
            val data = items(response).orEmpty()
            for (item in data) emit(item)
            if (Pages.isLast(response, page, data.size, limit)) break
            page++
        }
    }.flowOn(Dispatchers.IO)
}
