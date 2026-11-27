# BillingApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillingUpgrade**](BillingApi.md#createBillingUpgrade) | **POST** /v1/billing/upgrade | Start an upgrade to a higher plan.
[**listBillingAppAllowances**](BillingApi.md#listBillingAppAllowances) | **GET** /v1/billing/app-allowances | Your listing allowances through OAuth apps (used of limit, per app, with its platform scope).
[**listBillingPlans**](BillingApi.md#listBillingPlans) | **GET** /v1/billing/plans | List the plans with their prices, limits and features.


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

<a name="listBillingAppAllowances"></a>
# **listBillingAppAllowances**
> ListBillingAppAllowancesResponse listBillingAppAllowances()

Your listing allowances through OAuth apps (used of limit, per app, with its platform scope).

Staff can let an OAuth app list above a seller&#39;s plan, counted apart from the plan&#39;s itemsPerMonth and only on the allowance&#39;s platforms. &#x60;label&#x60; is the sentence to show (12 of 10,000 managed by Infinity; ... this month via Infinity (resets Dec 1); or counts toward your plan for limitMode shared).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BillingApi()
try {
    val result : ListBillingAppAllowancesResponse = apiInstance.listBillingAppAllowances()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#listBillingAppAllowances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#listBillingAppAllowances")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBillingAppAllowancesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBillingPlans"></a>
# **listBillingPlans**
> ListBillingPlansResponse listBillingPlans()

List the plans with their prices, limits and features.

Prices are the Stripe Prices checkout charges (whole USD). A null limit means no cap.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BillingApi()
try {
    val result : ListBillingPlansResponse = apiInstance.listBillingPlans()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#listBillingPlans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#listBillingPlans")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBillingPlansResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

