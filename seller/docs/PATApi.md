# PATApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPat**](PATApi.md#createPat) | **POST** /v1/pat | Mint a new PAT. Full token returned ONCE — store it on the client.
[**deletePat**](PATApi.md#deletePat) | **DELETE** /v1/pat/{id} | Revoke a PAT by id.
[**getPatScope**](PATApi.md#getPatScope) | **GET** /v1/pat/scopes | List the canonical scope catalog.
[**listPat**](PATApi.md#listPat) | **GET** /v1/pat | List the caller&#39;s PATs (preview only).


<a name="createPat"></a>
# **createPat**
> CreatePatResponse createPat()

Mint a new PAT. Full token returned ONCE — store it on the client.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PATApi()
try {
    val result : CreatePatResponse = apiInstance.createPat()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PATApi#createPat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PATApi#createPat")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreatePatResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePat"></a>
# **deletePat**
> OkResponse deletePat(id)

Revoke a PAT by id.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PATApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deletePat(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PATApi#deletePat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PATApi#deletePat")
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

<a name="getPatScope"></a>
# **getPatScope**
> GetPatScopeResponse getPatScope()

List the canonical scope catalog.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PATApi()
try {
    val result : GetPatScopeResponse = apiInstance.getPatScope()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PATApi#getPatScope")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PATApi#getPatScope")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetPatScopeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPat"></a>
# **listPat**
> ListPatResponse listPat()

List the caller&#39;s PATs (preview only).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PATApi()
try {
    val result : ListPatResponse = apiInstance.listPat()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PATApi#listPat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PATApi#listPat")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListPatResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

