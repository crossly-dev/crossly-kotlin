# ImportsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImport**](ImportsApi.md#createImport) | **POST** /v1/imports | Start a bulk-import job for an existing platform connection.
[**getImport**](ImportsApi.md#getImport) | **GET** /v1/imports/{id} | Get one import job.
[**getImportSite**](ImportsApi.md#getImportSite) | **GET** /v1/imports/sites | Which sites (eBay marketplaces) an account&#39;s listings are on, with counts — to choose what an import brings in.
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

**CreateImportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getImport"></a>
# **getImport**
> ListImportsItem getImport(id)

Get one import job.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ImportsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListImportsItem = apiInstance.getImport(id)
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

**ListImportsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getImportSite"></a>
# **getImportSite**
> GetImportSiteResponse getImportSite(platform)

Which sites (eBay marketplaces) an account&#39;s listings are on, with counts — to choose what an import brings in.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ImportsApi()
val platform : kotlin.String = platform_example // kotlin.String | Default ebay.
try {
    val result : GetImportSiteResponse = apiInstance.getImportSite(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImportsApi#getImportSite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImportsApi#getImportSite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**| Default ebay. | [optional]

### Return type

**GetImportSiteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listImports"></a>
# **listImports**
> ListImportsResponse listImports()

List bulk-import jobs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ImportsApi()
try {
    val result : ListImportsResponse = apiInstance.listImports()
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

**ListImportsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

