# BillingApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillingUpgrade**](BillingApi.md#createBillingUpgrade) | **POST** /v1/billing/upgrade | Start an upgrade to a higher plan.


<a name="createBillingUpgrade"></a>
# **createBillingUpgrade**
> CreateBillingUpgradeResponse createBillingUpgrade(createBillingUpgradeRequest)

Start an upgrade to a higher plan.

Returns a Stripe Checkout URL. Nothing is charged by this call — a person completes the payment. Downgrades and cancellation are not available to a token at all; they stay with the account owner.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BillingApi()
val createBillingUpgradeRequest : CreateBillingUpgradeRequest =  // CreateBillingUpgradeRequest | 
try {
    val result : CreateBillingUpgradeResponse = apiInstance.createBillingUpgrade(createBillingUpgradeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#createBillingUpgrade")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#createBillingUpgrade")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBillingUpgradeRequest** | **CreateBillingUpgradeRequest**|  |

### Return type

**CreateBillingUpgradeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

