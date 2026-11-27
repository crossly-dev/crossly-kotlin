# SourceSyncApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSourceSyncSync**](SourceSyncApi.md#createSourceSyncSync) | **POST** /v1/source-sync/{platform}/sync | Reconcile a store now: re-read its whole catalogue and apply every change (runs in the background; 202).
[**getSourceSyncLocation**](SourceSyncApi.md#getSourceSyncLocation) | **GET** /v1/source-sync/{platform}/locations | POS only (lightspeed_r, lightspeed_x, square): the shops/outlets/locations on the account and which one Crossly syncs stock and sales with.
[**listSourceSync**](SourceSyncApi.md#listSourceSync) | **GET** /v1/source-sync | List source-capable stores with their continuous-sync settings and status.
[**listSourceSyncEvents**](SourceSyncApi.md#listSourceSyncEvents) | **GET** /v1/source-sync/events | Recent source-sync activity: each webhook delivery and reconcile change, with its outcome.
[**updateSourceSync**](SourceSyncApi.md#updateSourceSync) | **PATCH** /v1/source-sync/{platform} | Update a store&#39;s source-sync settings: on/off, source-owned fields, deletion handling, auto-export channels.
[**updateSourceSyncLocation**](SourceSyncApi.md#updateSourceSyncLocation) | **PUT** /v1/source-sync/{platform}/location | POS only: choose the shop (R-Series) / outlet (X-Series) / Square location whose stock and sales Crossly syncs. Must be one GET .../locations lists.


<a name="createSourceSyncSync"></a>
# **createSourceSyncSync**
> CreateSourceSyncSyncResponse createSourceSyncSync(platform)

Reconcile a store now: re-read its whole catalogue and apply every change (runs in the background; 202).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SourceSyncApi()
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : CreateSourceSyncSyncResponse = apiInstance.createSourceSyncSync(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourceSyncApi#createSourceSyncSync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourceSyncApi#createSourceSyncSync")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  | [enum: shopify, woocommerce, bigcommerce, wix, squarespace, lightspeed_r, lightspeed_x, square]

### Return type

**CreateSourceSyncSyncResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSourceSyncLocation"></a>
# **getSourceSyncLocation**
> GetSourceSyncLocationResponse getSourceSyncLocation(platform)

POS only (lightspeed_r, lightspeed_x, square): the shops/outlets/locations on the account and which one Crossly syncs stock and sales with.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SourceSyncApi()
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : GetSourceSyncLocationResponse = apiInstance.getSourceSyncLocation(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourceSyncApi#getSourceSyncLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourceSyncApi#getSourceSyncLocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  | [enum: lightspeed_r, lightspeed_x, square]

### Return type

**GetSourceSyncLocationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSourceSync"></a>
# **listSourceSync**
> ListSourceSyncResponse listSourceSync()

List source-capable stores with their continuous-sync settings and status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SourceSyncApi()
try {
    val result : ListSourceSyncResponse = apiInstance.listSourceSync()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourceSyncApi#listSourceSync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourceSyncApi#listSourceSync")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSourceSyncResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSourceSyncEvents"></a>
# **listSourceSyncEvents**
> ListSourceSyncEventsResponse listSourceSyncEvents(platform, limit)

Recent source-sync activity: each webhook delivery and reconcile change, with its outcome.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SourceSyncApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListSourceSyncEventsResponse = apiInstance.listSourceSyncEvents(platform, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourceSyncApi#listSourceSyncEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourceSyncApi#listSourceSyncEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  | [optional] [enum: shopify, woocommerce, bigcommerce, wix, squarespace, lightspeed_r, lightspeed_x, square]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListSourceSyncEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSourceSync"></a>
# **updateSourceSync**
> ListSourceSyncItem updateSourceSync(platform)

Update a store&#39;s source-sync settings: on/off, source-owned fields, deletion handling, auto-export channels.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SourceSyncApi()
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : ListSourceSyncItem = apiInstance.updateSourceSync(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourceSyncApi#updateSourceSync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourceSyncApi#updateSourceSync")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  | [enum: shopify, woocommerce, bigcommerce, wix, squarespace, lightspeed_r, lightspeed_x, square]

### Return type

**ListSourceSyncItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSourceSyncLocation"></a>
# **updateSourceSyncLocation**
> GetSourceSyncLocationResponse updateSourceSyncLocation(platform, updateSourceSyncLocationRequest)

POS only: choose the shop (R-Series) / outlet (X-Series) / Square location whose stock and sales Crossly syncs. Must be one GET .../locations lists.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SourceSyncApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val updateSourceSyncLocationRequest : UpdateSourceSyncLocationRequest =  // UpdateSourceSyncLocationRequest | 
try {
    val result : GetSourceSyncLocationResponse = apiInstance.updateSourceSyncLocation(platform, updateSourceSyncLocationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourceSyncApi#updateSourceSyncLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourceSyncApi#updateSourceSyncLocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  | [enum: lightspeed_r, lightspeed_x, square]
 **updateSourceSyncLocationRequest** | **UpdateSourceSyncLocationRequest**|  |

### Return type

**GetSourceSyncLocationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

