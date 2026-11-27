# WorldsMoneyApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldEarningPayoutAccountOnboard**](WorldsMoneyApi.md#createWorldEarningPayoutAccountOnboard) | **POST** /v1/worlds/earnings/payout-account/onboard | Start or resume Stripe onboarding for your creator payout account. Returns a one-time Stripe URL. Body: { country? } (fixed once the account exists).
[**createWorldExperienceDropTable**](WorldsMoneyApi.md#createWorldExperienceDropTable) | **POST** /v1/worlds/experiences/{experienceId}/drop-tables | Declare a drop table for a paid random item: cosmetic or in-experience outcomes only. Crossly pre-simulates and hashes it.
[**createWorldExperienceProduct**](WorldsMoneyApi.md#createWorldExperienceProduct) | **POST** /v1/worlds/experiences/{experienceId}/products | Create a product: price 50-100,000 cents (a private server may be free), optional per-country prices. Paid random items need an approved drop table and are never tradeable.
[**createWorldExperienceProductArchive**](WorldsMoneyApi.md#createWorldExperienceProductArchive) | **POST** /v1/worlds/experiences/{experienceId}/products/{productId}/archive | Take a product off sale for good. Owned passes and running subscriptions keep working.
[**createWorldExperiencePurchase**](WorldsMoneyApi.md#createWorldExperiencePurchase) | **POST** /v1/worlds/experiences/{experienceId}/purchases | Open a purchase sheet for a product (paid access, a pass…). Returns checkoutPath: the player pays only in the Crossly checkout.
[**createWorldExperienceReceiptAck**](WorldsMoneyApi.md#createWorldExperienceReceiptAck) | **POST** /v1/worlds/experiences/{experienceId}/receipts/{orderId}/ack | Acknowledge a grant your back-end made off-server. Idempotent: a second ack reports duplicate.
[**createWorldMeReceiptRefund**](WorldsMoneyApi.md#createWorldMeReceiptRefund) | **POST** /v1/worlds/me/receipts/{receiptId}/refund | Refund a developer product bought by mistake: within the self-refund window and before the experience granted it.
[**createWorldMeSubscriptionCancel**](WorldsMoneyApi.md#createWorldMeSubscriptionCancel) | **POST** /v1/worlds/me/subscriptions/{id}/cancel | Cancel: no more charges; the benefit lasts to the end of the paid month.
[**createWorldMeSubscriptionPrivateServerCode**](WorldsMoneyApi.md#createWorldMeSubscriptionPrivateServerCode) | **POST** /v1/worlds/me/subscriptions/{id}/private-server-code | A fresh access code for your private server (the previous one stops working). Join with reservedCode.
[**createWorldPurchaseCancel**](WorldsMoneyApi.md#createWorldPurchaseCancel) | **POST** /v1/worlds/purchases/{intentId}/cancel | Cancel an unpaid purchase sheet.
[**getWorldEarning**](WorldsMoneyApi.md#getWorldEarning) | **GET** /v1/worlds/earnings | Your Crossly Carnival earnings: pending, available, held, paid; next payout; what cashing out still needs.
[**getWorldEarningPayoutAccount**](WorldsMoneyApi.md#getWorldEarningPayoutAccount) | **GET** /v1/worlds/earnings/payout-account | Your creator payout account (your own, separate from any store payout account): not_started, pending, restricted, active or payouts_unavailable.
[**getWorldEconomy**](WorldsMoneyApi.md#getWorldEconomy) | **GET** /v1/worlds/economy | The published payout formula: splits, thresholds, scheduled changes (90-day notice) and guarantees.
[**getWorldExperienceRevenue**](WorldsMoneyApi.md#getWorldExperienceRevenue) | **GET** /v1/worlds/experiences/{experienceId}/revenue | Gross, tax, refunds, chargebacks, net and your share per product, plus pending / available / paid.
[**getWorldExperienceStore**](WorldsMoneyApi.md#getWorldExperienceStore) | **GET** /v1/worlds/experiences/{experienceId}/store | An experience&#39;s store as you see it: your regional price, odds for paid random items, what you own.
[**getWorldPurchase**](WorldsMoneyApi.md#getWorldPurchase) | **GET** /v1/worlds/purchases/{intentId} | A purchase sheet: item, price, tax, total, odds, status.
[**listWorldEarningAffiliate**](WorldsMoneyApi.md#listWorldEarningAffiliate) | **GET** /v1/worlds/earnings/affiliate | Real-goods orders attributed to your games: the fee, your 20% share, and whether it is posted.
[**listWorldEarningLedger**](WorldsMoneyApi.md#listWorldEarningLedger) | **GET** /v1/worlds/earnings/ledger | Your creator ledger, newest first: every earning and reversal. Cursor-paged.
[**listWorldEarningPayouts**](WorldsMoneyApi.md#listWorldEarningPayouts) | **GET** /v1/worlds/earnings/payouts | Your monthly Crossly Carnival payouts.
[**listWorldExperienceDropTables**](WorldsMoneyApi.md#listWorldExperienceDropTables) | **GET** /v1/worlds/experiences/{experienceId}/drop-tables | Declared drop tables with their odds, simulation (10^6 draws) and hash.
[**listWorldExperienceProducts**](WorldsMoneyApi.md#listWorldExperienceProducts) | **GET** /v1/worlds/experiences/{experienceId}/products | What an experience sells: passes, developer products, subscriptions, private servers, paid access (?includeArchived&#x3D;true).
[**listWorldExperienceReceipts**](WorldsMoneyApi.md#listWorldExperienceReceipts) | **GET** /v1/worlds/experiences/{experienceId}/receipts | Every purchase: orderId, sub, product, price, net, state (paid/delivered/granted/refunded/revoked). Cursor-paged; ?since&#x3D;.
[**listWorldMeSubscriptions**](WorldsMoneyApi.md#listWorldMeSubscriptions) | **GET** /v1/worlds/me/subscriptions | Your experience subscriptions and private servers.
[**updateWorldExperienceProduct**](WorldsMoneyApi.md#updateWorldExperienceProduct) | **PATCH** /v1/worlds/experiences/{experienceId}/products/{productId} | Edit a product: name, description, icon, price, regional prices, hourly limit, on/off sale. Kind and place never change.


<a name="createWorldEarningPayoutAccountOnboard"></a>
# **createWorldEarningPayoutAccountOnboard**
> CreateWorldEarningPayoutAccountOnboardResponse createWorldEarningPayoutAccountOnboard()

Start or resume Stripe onboarding for your creator payout account. Returns a one-time Stripe URL. Body: { country? } (fixed once the account exists).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
try {
    val result : CreateWorldEarningPayoutAccountOnboardResponse = apiInstance.createWorldEarningPayoutAccountOnboard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#createWorldEarningPayoutAccountOnboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#createWorldEarningPayoutAccountOnboard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldEarningPayoutAccountOnboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceDropTable"></a>
# **createWorldExperienceDropTable**
> CreateWorldExperienceDropTableResponse createWorldExperienceDropTable(experienceId)

Declare a drop table for a paid random item: cosmetic or in-experience outcomes only. Crossly pre-simulates and hashes it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceDropTableResponse = apiInstance.createWorldExperienceDropTable(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#createWorldExperienceDropTable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#createWorldExperienceDropTable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceDropTableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceProduct"></a>
# **createWorldExperienceProduct**
> WorldExperienceProductResponse createWorldExperienceProduct(experienceId)

Create a product: price 50-100,000 cents (a private server may be free), optional per-country prices. Paid random items need an approved drop table and are never tradeable.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceProductResponse = apiInstance.createWorldExperienceProduct(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#createWorldExperienceProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#createWorldExperienceProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceProductResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceProductArchive"></a>
# **createWorldExperienceProductArchive**
> WorldExperienceProductResponse createWorldExperienceProductArchive(experienceId, productId)

Take a product off sale for good. Owned passes and running subscriptions keep working.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val productId : kotlin.String = productId_example // kotlin.String | 
try {
    val result : WorldExperienceProductResponse = apiInstance.createWorldExperienceProductArchive(experienceId, productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#createWorldExperienceProductArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#createWorldExperienceProductArchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **productId** | **kotlin.String**|  |

### Return type

**WorldExperienceProductResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePurchase"></a>
# **createWorldExperiencePurchase**
> CreateWorldExperiencePurchaseResponse createWorldExperiencePurchase(experienceId)

Open a purchase sheet for a product (paid access, a pass…). Returns checkoutPath: the player pays only in the Crossly checkout.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePurchaseResponse = apiInstance.createWorldExperiencePurchase(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#createWorldExperiencePurchase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#createWorldExperiencePurchase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePurchaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceReceiptAck"></a>
# **createWorldExperienceReceiptAck**
> CreateWorldExperienceReceiptAckResponse createWorldExperienceReceiptAck(experienceId, orderId)

Acknowledge a grant your back-end made off-server. Idempotent: a second ack reports duplicate.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val orderId : kotlin.String = orderId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceReceiptAckResponse = apiInstance.createWorldExperienceReceiptAck(experienceId, orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#createWorldExperienceReceiptAck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#createWorldExperienceReceiptAck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **orderId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceReceiptAckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldMeReceiptRefund"></a>
# **createWorldMeReceiptRefund**
> CreateWorldMeReceiptRefundResponse createWorldMeReceiptRefund(receiptId)

Refund a developer product bought by mistake: within the self-refund window and before the experience granted it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val receiptId : kotlin.String = receiptId_example // kotlin.String | 
try {
    val result : CreateWorldMeReceiptRefundResponse = apiInstance.createWorldMeReceiptRefund(receiptId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#createWorldMeReceiptRefund")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#createWorldMeReceiptRefund")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptId** | **kotlin.String**|  |

### Return type

**CreateWorldMeReceiptRefundResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldMeSubscriptionCancel"></a>
# **createWorldMeSubscriptionCancel**
> CreateWorldMeSubscriptionCancelResponse createWorldMeSubscriptionCancel(id)

Cancel: no more charges; the benefit lasts to the end of the paid month.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldMeSubscriptionCancelResponse = apiInstance.createWorldMeSubscriptionCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#createWorldMeSubscriptionCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#createWorldMeSubscriptionCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldMeSubscriptionCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldMeSubscriptionPrivateServerCode"></a>
# **createWorldMeSubscriptionPrivateServerCode**
> CreateWorldMeSubscriptionPrivateServerCodeResponse createWorldMeSubscriptionPrivateServerCode(id)

A fresh access code for your private server (the previous one stops working). Join with reservedCode.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldMeSubscriptionPrivateServerCodeResponse = apiInstance.createWorldMeSubscriptionPrivateServerCode(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#createWorldMeSubscriptionPrivateServerCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#createWorldMeSubscriptionPrivateServerCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldMeSubscriptionPrivateServerCodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPurchaseCancel"></a>
# **createWorldPurchaseCancel**
> CreateWorldSpaceJoinResponse createWorldPurchaseCancel(intentId)

Cancel an unpaid purchase sheet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val intentId : kotlin.String = intentId_example // kotlin.String | 
try {
    val result : CreateWorldSpaceJoinResponse = apiInstance.createWorldPurchaseCancel(intentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#createWorldPurchaseCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#createWorldPurchaseCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intentId** | **kotlin.String**|  |

### Return type

**CreateWorldSpaceJoinResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldEarning"></a>
# **getWorldEarning**
> GetWorldEarningResponse getWorldEarning()

Your Crossly Carnival earnings: pending, available, held, paid; next payout; what cashing out still needs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
try {
    val result : GetWorldEarningResponse = apiInstance.getWorldEarning()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#getWorldEarning")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#getWorldEarning")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldEarningResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldEarningPayoutAccount"></a>
# **getWorldEarningPayoutAccount**
> GetWorldEarningPayoutAccountResponse getWorldEarningPayoutAccount()

Your creator payout account (your own, separate from any store payout account): not_started, pending, restricted, active or payouts_unavailable.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
try {
    val result : GetWorldEarningPayoutAccountResponse = apiInstance.getWorldEarningPayoutAccount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#getWorldEarningPayoutAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#getWorldEarningPayoutAccount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldEarningPayoutAccountResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldEconomy"></a>
# **getWorldEconomy**
> GetWorldEconomyResponse getWorldEconomy()

The published payout formula: splits, thresholds, scheduled changes (90-day notice) and guarantees.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
try {
    val result : GetWorldEconomyResponse = apiInstance.getWorldEconomy()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#getWorldEconomy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#getWorldEconomy")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldEconomyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceRevenue"></a>
# **getWorldExperienceRevenue**
> GetWorldExperienceRevenueResponse getWorldExperienceRevenue(experienceId)

Gross, tax, refunds, chargebacks, net and your share per product, plus pending / available / paid.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceRevenueResponse = apiInstance.getWorldExperienceRevenue(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#getWorldExperienceRevenue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#getWorldExperienceRevenue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceRevenueResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceStore"></a>
# **getWorldExperienceStore**
> GetWorldExperienceStoreResponse getWorldExperienceStore(experienceId)

An experience&#39;s store as you see it: your regional price, odds for paid random items, what you own.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceStoreResponse = apiInstance.getWorldExperienceStore(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#getWorldExperienceStore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#getWorldExperienceStore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceStoreResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPurchase"></a>
# **getWorldPurchase**
> GetWorldPurchaseResponse getWorldPurchase(intentId)

A purchase sheet: item, price, tax, total, odds, status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val intentId : kotlin.String = intentId_example // kotlin.String | 
try {
    val result : GetWorldPurchaseResponse = apiInstance.getWorldPurchase(intentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#getWorldPurchase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#getWorldPurchase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intentId** | **kotlin.String**|  |

### Return type

**GetWorldPurchaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldEarningAffiliate"></a>
# **listWorldEarningAffiliate**
> ListWorldEarningAffiliateResponse listWorldEarningAffiliate()

Real-goods orders attributed to your games: the fee, your 20% share, and whether it is posted.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
try {
    val result : ListWorldEarningAffiliateResponse = apiInstance.listWorldEarningAffiliate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#listWorldEarningAffiliate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#listWorldEarningAffiliate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldEarningAffiliateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldEarningLedger"></a>
# **listWorldEarningLedger**
> ListWorldEarningLedgerResponse listWorldEarningLedger()

Your creator ledger, newest first: every earning and reversal. Cursor-paged.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
try {
    val result : ListWorldEarningLedgerResponse = apiInstance.listWorldEarningLedger()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#listWorldEarningLedger")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#listWorldEarningLedger")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldEarningLedgerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldEarningPayouts"></a>
# **listWorldEarningPayouts**
> ListWorldEarningPayoutsResponse listWorldEarningPayouts()

Your monthly Crossly Carnival payouts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
try {
    val result : ListWorldEarningPayoutsResponse = apiInstance.listWorldEarningPayouts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#listWorldEarningPayouts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#listWorldEarningPayouts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldEarningPayoutsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceDropTables"></a>
# **listWorldExperienceDropTables**
> ListWorldExperienceDropTablesResponse listWorldExperienceDropTables(experienceId)

Declared drop tables with their odds, simulation (10^6 draws) and hash.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceDropTablesResponse = apiInstance.listWorldExperienceDropTables(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#listWorldExperienceDropTables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#listWorldExperienceDropTables")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceDropTablesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceProducts"></a>
# **listWorldExperienceProducts**
> ListWorldExperienceProductsResponse listWorldExperienceProducts(experienceId)

What an experience sells: passes, developer products, subscriptions, private servers, paid access (?includeArchived&#x3D;true).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceProductsResponse = apiInstance.listWorldExperienceProducts(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#listWorldExperienceProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#listWorldExperienceProducts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceProductsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceReceipts"></a>
# **listWorldExperienceReceipts**
> ListWorldExperienceReceiptsResponse listWorldExperienceReceipts(experienceId)

Every purchase: orderId, sub, product, price, net, state (paid/delivered/granted/refunded/revoked). Cursor-paged; ?since&#x3D;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceReceiptsResponse = apiInstance.listWorldExperienceReceipts(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#listWorldExperienceReceipts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#listWorldExperienceReceipts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceReceiptsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldMeSubscriptions"></a>
# **listWorldMeSubscriptions**
> ListWorldMeSubscriptionsResponse listWorldMeSubscriptions()

Your experience subscriptions and private servers.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
try {
    val result : ListWorldMeSubscriptionsResponse = apiInstance.listWorldMeSubscriptions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#listWorldMeSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#listWorldMeSubscriptions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldMeSubscriptionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceProduct"></a>
# **updateWorldExperienceProduct**
> WorldExperienceProductResponse updateWorldExperienceProduct(experienceId, productId)

Edit a product: name, description, icon, price, regional prices, hourly limit, on/off sale. Kind and place never change.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsMoneyApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val productId : kotlin.String = productId_example // kotlin.String | 
try {
    val result : WorldExperienceProductResponse = apiInstance.updateWorldExperienceProduct(experienceId, productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsMoneyApi#updateWorldExperienceProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsMoneyApi#updateWorldExperienceProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **productId** | **kotlin.String**|  |

### Return type

**WorldExperienceProductResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

