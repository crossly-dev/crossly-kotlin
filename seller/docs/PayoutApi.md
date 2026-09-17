# PayoutApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPayoutEstimate**](PayoutApi.md#getPayoutEstimate) | **GET** /v1/payout/estimate | What one platform nets at a given price, after fees and shipping.
[**getPayoutGrossForNet**](PayoutApi.md#getPayoutGrossForNet) | **GET** /v1/payout/gross-for-net | The gross price needed to clear a target net on one platform.
[**listPayoutCompare**](PayoutApi.md#listPayoutCompare) | **GET** /v1/payout/compare | Rank platforms by what they net at a given price. Defaults to connected ones.


<a name="getPayoutEstimate"></a>
# **getPayoutEstimate**
> GetPayoutEstimateResponse getPayoutEstimate()

What one platform nets at a given price, after fees and shipping.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
try {
    val result : GetPayoutEstimateResponse = apiInstance.getPayoutEstimate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#getPayoutEstimate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#getPayoutEstimate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPayoutEstimateResponse**](GetPayoutEstimateResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPayoutGrossForNet"></a>
# **getPayoutGrossForNet**
> GetPayoutGrossForNetResponse getPayoutGrossForNet()

The gross price needed to clear a target net on one platform.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
try {
    val result : GetPayoutGrossForNetResponse = apiInstance.getPayoutGrossForNet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#getPayoutGrossForNet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#getPayoutGrossForNet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPayoutGrossForNetResponse**](GetPayoutGrossForNetResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPayoutCompare"></a>
# **listPayoutCompare**
> V1List listPayoutCompare()

Rank platforms by what they net at a given price. Defaults to connected ones.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
try {
    val result : V1List = apiInstance.listPayoutCompare()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#listPayoutCompare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#listPayoutCompare")
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

