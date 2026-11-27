package net.crossly.client

/**
 * Auto-pagination over Crossly list endpoints, which all answer `{ data, pagination }` and page with `page`
 * (1-based) and `limit`.
 *
 * Pages are fetched lazily, one request per page, as the sequence is consumed. It stops at
 * `pagination.totalPages`; when the response carries no pagination the endpoint returned everything in one page;
 * when it carries pagination without a total, a short page is the last one.
 *
 * Shared, byte for byte, by the seller and buyer packages. Use it through `Crossly.paginate` (seller) or
 * `CrosslyBuyer.paginate` (buyer), which turn API failures into [CrosslyException].
 */
object Pages {
    /** The default page size: the API's own default, and inside every list endpoint's maximum. */
    const val DEFAULT_LIMIT = 25

    fun <R, T> sequence(limit: Int, fetch: (page: Int, limit: Int) -> R, items: (R) -> List<T>?): Sequence<T> {
        require(limit >= 1) { "limit must be >= 1" }
        return kotlin.sequences.sequence {
            var page = 1
            while (true) {
                val response = fetch(page, limit)
                val data = items(response).orEmpty()
                yieldAll(data)
                if (isLast(response, page, data.size, limit)) break
                page++
            }
        }
    }

    /** Whether [page] (which returned [count] items) was the last one. */
    fun isLast(response: Any?, page: Int, count: Int, limit: Int): Boolean {
        val pagination = call(response, "getPagination") ?: return true
        if (count == 0) return true
        (call(pagination, "getTotalPages") as? Number)?.let { return page >= it.toInt() }
        val pageLimit = (call(pagination, "getLimit") as? Number)?.toInt() ?: limit
        return count < pageLimit
    }

    private fun call(target: Any?, getter: String): Any? =
        if (target == null) {
            null
        } else {
            try {
                target.javaClass.getMethod(getter).invoke(target)
            } catch (e: ReflectiveOperationException) {
                null
            }
        }
}
