# ProductFeedsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductFeed**](ProductFeedsApi.md#createProductFeed) | **POST** /v1/product-feeds | Create a hosted product feed for a channel. Returns its secret URL.
[**createProductFeedRotate**](ProductFeedsApi.md#createProductFeedRotate) | **POST** /v1/product-feeds/{id}/rotate | Rotate the feed token. The old URL stops answering immediately; paste the new one into the channel.
[**deleteProductFeed**](ProductFeedsApi.md#deleteProductFeed) | **DELETE** /v1/product-feeds/{id} | Delete a feed. Its URL stops answering immediately.
[**getProductFeedReport**](ProductFeedsApi.md#getProductFeedReport) | **GET** /v1/product-feeds/{id}/report | Validate a feed: per-item errors (held back) and warnings (sent, limited reach), plus sample rendered items.
[**listProductFeeds**](ProductFeedsApi.md#listProductFeeds) | **GET** /v1/product-feeds | List your hosted product feeds (Google Merchant Center, Meta catalogue, TikTok catalog) with their URLs and last-fetch stats.
[**updateProductFeed**](ProductFeedsApi.md#updateProductFeed) | **PATCH** /v1/product-feeds/{id} | Edit a feed: name, default format, enabled, listing filters, output settings.


<a name="createProductFeed"></a>
# **createProductFeed**
> ListProductFeedsItem createProductFeed()

Create a hosted product feed for a channel. Returns its secret URL.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductFeedsApi()
try {
    val result : ListProductFeedsItem = apiInstance.createProductFeed()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductFeedsApi#createProductFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductFeedsApi#createProductFeed")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListProductFeedsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProductFeedRotate"></a>
# **createProductFeedRotate**
> ListProductFeedsItem createProductFeedRotate(id)

Rotate the feed token. The old URL stops answering immediately; paste the new one into the channel.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductFeedsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListProductFeedsItem = apiInstance.createProductFeedRotate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductFeedsApi#createProductFeedRotate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductFeedsApi#createProductFeedRotate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListProductFeedsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProductFeed"></a>
# **deleteProductFeed**
> OkResponse deleteProductFeed(id)

Delete a feed. Its URL stops answering immediately.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductFeedsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteProductFeed(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductFeedsApi#deleteProductFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductFeedsApi#deleteProductFeed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductFeedReport"></a>
# **getProductFeedReport**
> GetProductFeedReportResponse getProductFeedReport(id)

Validate a feed: per-item errors (held back) and warnings (sent, limited reach), plus sample rendered items.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductFeedsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetProductFeedReportResponse = apiInstance.getProductFeedReport(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductFeedsApi#getProductFeedReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductFeedsApi#getProductFeedReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetProductFeedReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listProductFeeds"></a>
# **listProductFeeds**
> ListProductFeedsResponse listProductFeeds()

List your hosted product feeds (Google Merchant Center, Meta catalogue, TikTok catalog) with their URLs and last-fetch stats.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductFeedsApi()
try {
    val result : ListProductFeedsResponse = apiInstance.listProductFeeds()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductFeedsApi#listProductFeeds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductFeedsApi#listProductFeeds")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListProductFeedsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProductFeed"></a>
# **updateProductFeed**
> ListProductFeedsItem updateProductFeed(id)

Edit a feed: name, default format, enabled, listing filters, output settings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductFeedsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListProductFeedsItem = apiInstance.updateProductFeed(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductFeedsApi#updateProductFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductFeedsApi#updateProductFeed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListProductFeedsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

