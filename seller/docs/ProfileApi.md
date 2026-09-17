# ProfileApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateMe**](ProfileApi.md#updateMe) | **PATCH** /v1/me | Update the authenticated user&#39;s profile (display name, etc).


<a name="updateMe"></a>
# **updateMe**
> UpdateMeResponse updateMe()

Update the authenticated user&#39;s profile (display name, etc).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProfileApi()
try {
    val result : UpdateMeResponse = apiInstance.updateMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#updateMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#updateMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UpdateMeResponse**](UpdateMeResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

