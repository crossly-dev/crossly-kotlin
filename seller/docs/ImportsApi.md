# ImportsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImport**](ImportsApi.md#createImport) | **POST** /v1/imports | Start a bulk-import job for an existing platform connection.
[**getImport**](ImportsApi.md#getImport) | **GET** /v1/imports/{id} | Get one import job.
[**listImports**](ImportsApi.md#listImports) | **GET** /v1/imports | List bulk-import jobs.


<a name="createImport"></a>
# **createImport**
> CreateImportResponse createImport()

Start a bulk-import job for an existing platform connection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ImportsApi()
try {
    val result : CreateImportResponse = apiInstance.createImport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImportsApi#createImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImportsApi#createImport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateImportResponse**](CreateImportResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getImport"></a>
# **getImport**
> GetImportResponse getImport(id)

Get one import job.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ImportsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetImportResponse = apiInstance.getImport(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImportsApi#getImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImportsApi#getImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetImportResponse**](GetImportResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listImports"></a>
# **listImports**
> V1List listImports()

List bulk-import jobs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ImportsApi()
try {
    val result : V1List = apiInstance.listImports()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImportsApi#listImports")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImportsApi#listImports")
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

