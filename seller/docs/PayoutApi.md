# PayoutApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayoutConnectOnboard**](PayoutApi.md#createPayoutConnectOnboard) | **POST** /v1/payout/connect/onboard | Start or resume payout-account onboarding; returns a Stripe-hosted URL.
[**createPayoutIdentityLink**](PayoutApi.md#createPayoutIdentityLink) | **POST** /v1/payouts/identity/link | Continue with Stripe: a one-time Stripe-hosted link that collects what Stripe needs.
[**createPayoutPayout**](PayoutApi.md#createPayoutPayout) | **POST** /v1/payout/payouts | Pay out now: instant (fee, minutes, to an eligible card/bank) or standard (free, manual schedule only).
[**getPayoutConnect**](PayoutApi.md#getPayoutConnect) | **GET** /v1/payout/connect | Your Stripe payout account: status, country, agreement and payout currency.
[**getPayoutEstimate**](PayoutApi.md#getPayoutEstimate) | **GET** /v1/payout/estimate | What one platform nets at a given price, after fees and shipping.
[**getPayoutGrossForNet**](PayoutApi.md#getPayoutGrossForNet) | **GET** /v1/payout/gross-for-net | The gross price needed to clear a target net on one platform.
[**getPayoutIdentity**](PayoutApi.md#getPayoutIdentity) | **GET** /v1/payouts/identity | Stripe&#39;s verification of your payout account: status and what Stripe still needs, in plain words.
[**getPayoutWallet**](PayoutApi.md#getPayoutWallet) | **GET** /v1/payout/wallet | Your payout wallet: balances, schedule, next payout, instant-payout quote, methods, payouts, transactions.
[**listPayoutCompare**](PayoutApi.md#listPayoutCompare) | **GET** /v1/payout/compare | Rank platforms by what they net at a given price. Defaults to connected ones.
[**updatePayoutSchedule**](PayoutApi.md#updatePayoutSchedule) | **PUT** /v1/payout/schedule | Change the automatic payout schedule.


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

<a name="createPayoutIdentityLink"></a>
# **createPayoutIdentityLink**
> CreatePayoutIdentityLinkResponse createPayoutIdentityLink(createPayoutConnectOnboardRequest)

Continue with Stripe: a one-time Stripe-hosted link that collects what Stripe needs.

Creates the payout account first when there is none (country: ISO alpha-2, default the ship-from country). type is account_onboarding (Stripe shows only what is outstanding) or account_update. The link expires in minutes; ask for a new one rather than storing it. Nothing changes until a person completes it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
val createPayoutConnectOnboardRequest : CreatePayoutConnectOnboardRequest =  // CreatePayoutConnectOnboardRequest | 
try {
    val result : CreatePayoutIdentityLinkResponse = apiInstance.createPayoutIdentityLink(createPayoutConnectOnboardRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#createPayoutIdentityLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#createPayoutIdentityLink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPayoutConnectOnboardRequest** | **CreatePayoutConnectOnboardRequest**|  |

### Return type

**CreatePayoutIdentityLinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPayoutPayout"></a>
# **createPayoutPayout**
> CreatePayoutPayoutResponse createPayoutPayout(createPayoutPayoutRequest)

Pay out now: instant (fee, minutes, to an eligible card/bank) or standard (free, manual schedule only).

amountCents defaults to everything eligible. Pass idempotencyKey so a retry is the same payout. Returns { payout, feeCents }. 409 when the account cannot be paid or instant is unavailable.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
val createPayoutPayoutRequest : CreatePayoutPayoutRequest =  // CreatePayoutPayoutRequest | 
try {
    val result : CreatePayoutPayoutResponse = apiInstance.createPayoutPayout(createPayoutPayoutRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#createPayoutPayout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#createPayoutPayout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPayoutPayoutRequest** | **CreatePayoutPayoutRequest**|  |

### Return type

**CreatePayoutPayoutResponse**

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

<a name="getPayoutIdentity"></a>
# **getPayoutIdentity**
> GetPayoutIdentityResponse getPayoutIdentity(fresh)

Stripe&#39;s verification of your payout account: status and what Stripe still needs, in plain words.

status is not_started, pending (Stripe is checking), action_required (dueNow lists what to add), verified (payouts on) or restricted (disabledReasonText says why). dueNow / dueLater / inReview are Stripe&#39;s requirement keys as plain-words lines ({ keys, label }); errors carry Stripe&#39;s reason. Cached up to 60 s; fresh&#x3D;1 re-reads Stripe. Payouts are gated on payoutsEnabled only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
val fresh : kotlin.String = fresh_example // kotlin.String | 
try {
    val result : GetPayoutIdentityResponse = apiInstance.getPayoutIdentity(fresh)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#getPayoutIdentity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#getPayoutIdentity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fresh** | **kotlin.String**|  | [optional] [enum: 0, 1]

### Return type

**GetPayoutIdentityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPayoutWallet"></a>
# **getPayoutWallet**
> GetPayoutWalletResponse getPayoutWallet()

Your payout wallet: balances, schedule, next payout, instant-payout quote, methods, payouts, transactions.

connected:false (with defaultCountry) before onboarding. balance has availableCents, pendingCents and instantAvailableCents in the account currency. instant.available says whether an instant payout can be made now, with feeCents/netCents for the full instant-available amount and reason when not.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
try {
    val result : GetPayoutWalletResponse = apiInstance.getPayoutWallet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#getPayoutWallet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#getPayoutWallet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetPayoutWalletResponse**

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

<a name="updatePayoutSchedule"></a>
# **updatePayoutSchedule**
> UpdatePayoutScheduleResponse updatePayoutSchedule(updatePayoutScheduleRequest)

Change the automatic payout schedule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PayoutApi()
val updatePayoutScheduleRequest : UpdatePayoutScheduleRequest =  // UpdatePayoutScheduleRequest | 
try {
    val result : UpdatePayoutScheduleResponse = apiInstance.updatePayoutSchedule(updatePayoutScheduleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#updatePayoutSchedule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#updatePayoutSchedule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatePayoutScheduleRequest** | **UpdatePayoutScheduleRequest**|  |

### Return type

**UpdatePayoutScheduleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

