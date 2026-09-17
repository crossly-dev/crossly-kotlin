# CatalogApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCatalogLookup**](CatalogApi.md#getCatalogLookup) | **GET** /v1/catalog/lookup | Live Crossly offers for a product identifier (barcode, style code, LEGO set…).


<a name="getCatalogLookup"></a>
# **getCatalogLookup**
> GetCatalogLookupResponse getCatalogLookup(namespace, `value`)

Live Crossly offers for a product identifier (barcode, style code, LEGO set…).

Identifier-first: a GTIN is validated against its GS1 check digit and every length is normalised to 14 digits before lookup, so a UPC-A and its EAN-13 twin resolve to the same product. There is no fuzzy fallback — an identifier we cannot validate returns nothing rather than a guess.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CatalogApi()
val namespace : kotlin.String = namespace_example // kotlin.String | 
val `value` : kotlin.String = `value`_example // kotlin.String | 
try {
    val result : GetCatalogLookupResponse = apiInstance.getCatalogLookup(namespace, `value`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogApi#getCatalogLookup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogApi#getCatalogLookup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **kotlin.String**|  | [enum: gtin, style_code, lego_set, tcgplayer, discogs, asin]
 **&#x60;value&#x60;** | **kotlin.String**|  |

### Return type

[**GetCatalogLookupResponse**](GetCatalogLookupResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

