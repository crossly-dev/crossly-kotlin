# NetworkApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNetworkPool**](NetworkApi.md#createNetworkPool) | **POST** /v1/network/pool | Join the Crossly Network reciprocal engagement pool.
[**deleteNetworkPool**](NetworkApi.md#deleteNetworkPool) | **DELETE** /v1/network/pool | Leave the Crossly Network pool.
[**getNetworkPool**](NetworkApi.md#getNetworkPool) | **GET** /v1/network/pool | The seller&#39;s Crossly Network pool membership row.
[**getNetworkPoolSize**](NetworkApi.md#getNetworkPoolSize) | **GET** /v1/network/pool/size | Total members in the Crossly Network pool.
[**listNetworkPoolLog**](NetworkApi.md#listNetworkPoolLog) | **GET** /v1/network/pool/log | Recent engagement history — both sent and received.
[**updateNetworkPool**](NetworkApi.md#updateNetworkPool) | **PATCH** /v1/network/pool | Update per-action toggles + platforms on pool membership.


<a name="createNetworkPool"></a>
# **createNetworkPool**
> CreateNetworkPoolResponse createNetworkPool()

Join the Crossly Network reciprocal engagement pool.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NetworkApi()
try {
    val result : CreateNetworkPoolResponse = apiInstance.createNetworkPool()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkApi#createNetworkPool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkApi#createNetworkPool")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateNetworkPoolResponse**](CreateNetworkPoolResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNetworkPool"></a>
# **deleteNetworkPool**
> DeleteNetworkPoolResponse deleteNetworkPool()

Leave the Crossly Network pool.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NetworkApi()
try {
    val result : DeleteNetworkPoolResponse = apiInstance.deleteNetworkPool()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkApi#deleteNetworkPool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkApi#deleteNetworkPool")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeleteNetworkPoolResponse**](DeleteNetworkPoolResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNetworkPool"></a>
# **getNetworkPool**
> GetNetworkPoolResponse getNetworkPool()

The seller&#39;s Crossly Network pool membership row.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NetworkApi()
try {
    val result : GetNetworkPoolResponse = apiInstance.getNetworkPool()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkApi#getNetworkPool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkApi#getNetworkPool")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetNetworkPoolResponse**](GetNetworkPoolResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNetworkPoolSize"></a>
# **getNetworkPoolSize**
> GetNetworkPoolSizeResponse getNetworkPoolSize()

Total members in the Crossly Network pool.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NetworkApi()
try {
    val result : GetNetworkPoolSizeResponse = apiInstance.getNetworkPoolSize()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkApi#getNetworkPoolSize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkApi#getNetworkPoolSize")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetNetworkPoolSizeResponse**](GetNetworkPoolSizeResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNetworkPoolLog"></a>
# **listNetworkPoolLog**
> V1List listNetworkPoolLog(limit)

Recent engagement history — both sent and received.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NetworkApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : V1List = apiInstance.listNetworkPoolLog(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkApi#listNetworkPoolLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkApi#listNetworkPoolLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional] [default to 100]

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNetworkPool"></a>
# **updateNetworkPool**
> UpdateNetworkPoolResponse updateNetworkPool()

Update per-action toggles + platforms on pool membership.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NetworkApi()
try {
    val result : UpdateNetworkPoolResponse = apiInstance.updateNetworkPool()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkApi#updateNetworkPool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkApi#updateNetworkPool")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UpdateNetworkPoolResponse**](UpdateNetworkPoolResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

