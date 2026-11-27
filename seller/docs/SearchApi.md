# SearchApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSearch**](SearchApi.md#getSearch) | **GET** /v1/search | Search everything in your business at once: inventory, listings, orders, sales, customers, conversations, offers, shipments and returns. Exact identifiers (SKU, barcode, order number, tracking number, buyer email, marketplace listing id or a pasted listing URL) rank first, then prefixes, then fuzzy title / brand / buyer matches. Operators: sku:, order:, buyer:, tracking:, in:&lt;type&gt;, status:, platform:. Groups your token has no read scope for are left out.


<a name="getSearch"></a>
# **getSearch**
> GetSearchResponse getSearch(q, types, limit)

Search everything in your business at once: inventory, listings, orders, sales, customers, conversations, offers, shipments and returns. Exact identifiers (SKU, barcode, order number, tracking number, buyer email, marketplace listing id or a pasted listing URL) rank first, then prefixes, then fuzzy title / brand / buyer matches. Operators: sku:, order:, buyer:, tracking:, in:&lt;type&gt;, status:, platform:. Groups your token has no read scope for are left out.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SearchApi()
val q : kotlin.String = q_example // kotlin.String | What to search for (operators allowed).
val types : kotlin.String = types_example // kotlin.String | Comma-separated groups to search: inventory, listings, orders, sales, customers, conversations, offers, shipments, returns.
val limit : kotlin.Int = 56 // kotlin.Int | Hits per group.
try {
    val result : GetSearchResponse = apiInstance.getSearch(q, types, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#getSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#getSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| What to search for (operators allowed). | [optional]
 **types** | **kotlin.String**| Comma-separated groups to search: inventory, listings, orders, sales, customers, conversations, offers, shipments, returns. | [optional]
 **limit** | **kotlin.Int**| Hits per group. | [optional] [default to 5]

### Return type

**GetSearchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

