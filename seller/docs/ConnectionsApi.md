# ConnectionsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConnectionHealth**](ConnectionsApi.md#getConnectionHealth) | **GET** /v1/connection-health | Health of each connected marketplace account, with a plain-English diagnosis.
[**listDevices**](ConnectionsApi.md#listDevices) | **GET** /v1/devices | Machines paired to this account, and what each can do.


<a name="getConnectionHealth"></a>
# **getConnectionHealth**
> GetConnectionHealthResponse getConnectionHealth(includeUnconnected)

Health of each connected marketplace account, with a plain-English diagnosis.

One entry per ACCOUNT, not per platform — a healthy slot 1 must not speak for a dead slot 2. States that were never measured are reported as \&quot;unknown\&quot; rather than as failures.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ConnectionsApi()
val includeUnconnected : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : GetConnectionHealthResponse = apiInstance.getConnectionHealth(includeUnconnected)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConnectionsApi#getConnectionHealth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConnectionsApi#getConnectionHealth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeUnconnected** | **kotlin.Boolean**|  | [optional]

### Return type

[**GetConnectionHealthResponse**](GetConnectionHealthResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDevices"></a>
# **listDevices**
> V1List listDevices()

Machines paired to this account, and what each can do.

Capabilities are what the machine DECLARED it can do at pairing — print, scan_watch, browser, cookie_jar, proxy_bind, scale. A machine only declares \&quot;scale\&quot; when one actually answered, never on the assumption that one might.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ConnectionsApi()
try {
    val result : V1List = apiInstance.listDevices()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConnectionsApi#listDevices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConnectionsApi#listDevices")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

