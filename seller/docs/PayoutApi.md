# PayoutApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayoutConnectOnboard**](PayoutApi.md#createPayoutConnectOnboard) | **POST** /v1/payout/connect/onboard | Start or resume payout-account onboarding; returns a Stripe-hosted URL.
[**getPayoutConnect**](PayoutApi.md#getPayoutConnect) | **GET** /v1/payout/connect | Your Stripe payout account: status, country, agreement and payout currency.
[**getPayoutEstimate**](PayoutApi.md#getPayoutEstimate) | **GET** /v1/payout/estimate | What one platform nets at a given price, after fees and shipping.
[**getPayoutGrossForNet**](PayoutApi.md#getPayoutGrossForNet) | **GET** /v1/payout/gross-for-net | The gross price needed to clear a target net on one platform.
[**listPayoutCompare**](PayoutApi.md#listPayoutCompare) | **GET** /v1/payout/compare | Rank platforms by what they net at a given price. Defaults to connected ones.


<a name="createPayoutConnectOnboard"></a>
# **createPayoutConnectOnboard**
> CreatePayoutConnectOnboardResponse createPayoutConnectOnboard(createPayoutConnectOnboardRequest)

Start or resume payout-account onboarding; returns a Stripe-hosted URL.

country (ISO 3166-1 alpha-2) defaults to the storefront ship-from country, then US. Fixed once the account exists. Nothing is set up until a person completes the link.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
val createPayoutConnectOnboardRequest : CreatePayoutConnectOnboardRequest =  // CreatePayoutConnectOnboardRequest | 
try {
    val result : CreatePayoutConnectOnboardResponse = apiInstance.createPayoutConnectOnboard(createPayoutConnectOnboardRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#createPayoutConnectOnboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#createPayoutConnectOnboard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPayoutConnectOnboardRequest** | **CreatePayoutConnectOnboardRequest**|  |

### Return type

**CreatePayoutConnectOnboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPayoutConnect"></a>
# **getPayoutConnect**
> GetPayoutConnectResponse getPayoutConnect()

Your Stripe payout account: status, country, agreement and payout currency.

status is not_started (with defaultCountry), pending, active, restricted or payouts_unavailable. Only active can be paid; payouts_unavailable means Stripe offers no payout path to the account&#39;s country yet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
try {
    val result : GetPayoutConnectResponse = apiInstance.getPayoutConnect()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#getPayoutConnect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#getPayoutConnect")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetPayoutConnectResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

**GetPayoutEstimateResponse**

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

**GetPayoutGrossForNetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPayoutCompare"></a>
# **listPayoutCompare**
> ListPayoutCompareResponse listPayoutCompare()

Rank platforms by what they net at a given price. Defaults to connected ones.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
try {
    val result : ListPayoutCompareResponse = apiInstance.listPayoutCompare()
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

**ListPayoutCompareResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

