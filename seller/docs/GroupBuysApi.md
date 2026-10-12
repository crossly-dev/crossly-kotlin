# GroupBuysApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroupBuy**](GroupBuysApi.md#createGroupBuy) | **POST** /v1/group-buys | Run a group buy on a listing with stock: price tiers by buyer count, a minimum, up to 6 days. Below the minimum nobody pays.


<a name="createGroupBuy"></a>
# **createGroupBuy**
> CreateBreakResponse createGroupBuy()

Run a group buy on a listing with stock: price tiers by buyer count, a minimum, up to 6 days. Below the minimum nobody pays.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GroupBuysApi()
try {
    val result : CreateBreakResponse = apiInstance.createGroupBuy()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupBuysApi#createGroupBuy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupBuysApi#createGroupBuy")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBreakResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

