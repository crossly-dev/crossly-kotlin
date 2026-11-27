# GradingApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGradingRunReserve**](GradingApi.md#createGradingRunReserve) | **POST** /v1/grading/runs/{id}/reserve | Hold a slot in a Grading Run. Free now; charged on your saved card only if the run locks. Full-access token and Idempotency-Key required.
[**createGradingSubmissionCancel**](GradingApi.md#createGradingSubmissionCancel) | **POST** /v1/grading/submissions/{id}/cancel | Pull a reserved card out of its run. Only while it is reserved; nothing was charged.
[**createGradingSubmissionShipped**](GradingApi.md#createGradingSubmissionShipped) | **POST** /v1/grading/submissions/{id}/shipped | Say you mailed a charged card to the hub, with optional tracking.
[**createGradingVerifyCert**](GradingApi.md#createGradingVerifyCert) | **POST** /v1/grading/verify-cert | Look a cert number up with its grader. found&#x3D;false when the grader has no record.
[**createVaultMarketGradingOrder**](GradingApi.md#createVaultMarketGradingOrder) | **POST** /v1/vault-markets/grading/orders | Start a grading submission: cards (vault units or inventory items) to one grader at one service. Priced from the price book; vault units are held. Nothing is charged until you pay.
[**createVaultMarketGradingOrderCancel**](GradingApi.md#createVaultMarketGradingOrderCancel) | **POST** /v1/vault-markets/grading/orders/{id}/cancel | Cancel a draft submission; its vault units go back on their shelf. A paid submission cannot be cancelled here.
[**createVaultMarketGradingOrderPay**](GradingApi.md#createVaultMarketGradingOrderPay) | **POST** /v1/vault-markets/grading/orders/{id}/pay | Pay for a draft submission. savedCard: true charges your saved card (paid, or requires_action with a client secret for 3-D Secure). Full-access token and Idempotency-Key required.
[**createVaultMarketGradingOrderPayConfirm**](GradingApi.md#createVaultMarketGradingOrderPayConfirm) | **POST** /v1/vault-markets/grading/orders/{id}/pay/confirm | After a 3-D Secure step or a card form: confirm the PaymentIntent with Stripe and mark the submission paid.
[**getGradingPriceBook**](GradingApi.md#getGradingPriceBook) | **GET** /v1/grading/price-book | The grading price book: every grader, its services (per-card price, minimum cards, max declared value, turnaround) and add-ons, plus Crossly handling. The same data the dashboard prices from.
[**getGradingWorth**](GradingApi.md#getGradingWorth) | **GET** /v1/grading/worth/{inventoryItemId} | Worth grading? Raw value vs what each grade is worth at each grader, against the cost. Never predicts the grade.
[**getVaultMarketGradingOrder**](GradingApi.md#getVaultMarketGradingOrder) | **GET** /v1/vault-markets/grading/orders/{id} | One grading submission: its timeline, every card with its grade, cert number and photos, the costs and the tracking.
[**listGradingRateCard**](GradingApi.md#listGradingRateCard) | **GET** /v1/grading/rate-card | Every grader and tier Crossly can send to, with the per-card price in cents (null &#x3D; paused at the grader).
[**listGradingRuns**](GradingApi.md#listGradingRuns) | **GET** /v1/grading/runs | Grading Runs taking reservations now, soonest cutoff first. meta.open is false while runs are switched off.
[**listGradingSubmissions**](GradingApi.md#listGradingSubmissions) | **GET** /v1/grading/submissions | Your cards out for grading (runs and Direct), newest first. active&#x3D;1 keeps only the ones still in flight.
[**listVaultMarketGradingCandidates**](GradingApi.md#listVaultMarketGradingCandidates) | **GET** /v1/vault-markets/grading/candidates | What you can send to grading: raw units already in your vault and inventory items, each with a declared value to start from and the reason when one cannot go.
[**listVaultMarketGradingOrders**](GradingApi.md#listVaultMarketGradingOrders) | **GET** /v1/vault-markets/grading/orders | Your grading submissions, newest first. Filter by status, active, grader, tier and dates; q searches the number, card names and cert numbers.


<a name="createGradingRunReserve"></a>
# **createGradingRunReserve**
> IdResponse createGradingRunReserve(id)

Hold a slot in a Grading Run. Free now; charged on your saved card only if the run locks. Full-access token and Idempotency-Key required.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : IdResponse = apiInstance.createGradingRunReserve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#createGradingRunReserve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#createGradingRunReserve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**IdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGradingSubmissionCancel"></a>
# **createGradingSubmissionCancel**
> OkResponse createGradingSubmissionCancel(id)

Pull a reserved card out of its run. Only while it is reserved; nothing was charged.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createGradingSubmissionCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#createGradingSubmissionCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#createGradingSubmissionCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGradingSubmissionShipped"></a>
# **createGradingSubmissionShipped**
> OkResponse createGradingSubmissionShipped(id)

Say you mailed a charged card to the hub, with optional tracking.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createGradingSubmissionShipped(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#createGradingSubmissionShipped")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#createGradingSubmissionShipped")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGradingVerifyCert"></a>
# **createGradingVerifyCert**
> CreateGradingVerifyCertResponse createGradingVerifyCert()

Look a cert number up with its grader. found&#x3D;false when the grader has no record.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
try {
    val result : CreateGradingVerifyCertResponse = apiInstance.createGradingVerifyCert()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#createGradingVerifyCert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#createGradingVerifyCert")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateGradingVerifyCertResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradingOrder"></a>
# **createVaultMarketGradingOrder**
> CreateVaultMarketGradingOrderResponse createVaultMarketGradingOrder()

Start a grading submission: cards (vault units or inventory items) to one grader at one service. Priced from the price book; vault units are held. Nothing is charged until you pay.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
try {
    val result : CreateVaultMarketGradingOrderResponse = apiInstance.createVaultMarketGradingOrder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#createVaultMarketGradingOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#createVaultMarketGradingOrder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketGradingOrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradingOrderCancel"></a>
# **createVaultMarketGradingOrderCancel**
> StatusResponse createVaultMarketGradingOrderCancel(id)

Cancel a draft submission; its vault units go back on their shelf. A paid submission cannot be cancelled here.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StatusResponse = apiInstance.createVaultMarketGradingOrderCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#createVaultMarketGradingOrderCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#createVaultMarketGradingOrderCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradingOrderPay"></a>
# **createVaultMarketGradingOrderPay**
> CreateVaultMarketGradingOrderPayResponse createVaultMarketGradingOrderPay(id)

Pay for a draft submission. savedCard: true charges your saved card (paid, or requires_action with a client secret for 3-D Secure). Full-access token and Idempotency-Key required.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketGradingOrderPayResponse = apiInstance.createVaultMarketGradingOrderPay(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#createVaultMarketGradingOrderPay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#createVaultMarketGradingOrderPay")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketGradingOrderPayResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradingOrderPayConfirm"></a>
# **createVaultMarketGradingOrderPayConfirm**
> StatusResponse createVaultMarketGradingOrderPayConfirm(id)

After a 3-D Secure step or a card form: confirm the PaymentIntent with Stripe and mark the submission paid.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StatusResponse = apiInstance.createVaultMarketGradingOrderPayConfirm(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#createVaultMarketGradingOrderPayConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#createVaultMarketGradingOrderPayConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGradingPriceBook"></a>
# **getGradingPriceBook**
> GetGradingPriceBookResponse getGradingPriceBook()

The grading price book: every grader, its services (per-card price, minimum cards, max declared value, turnaround) and add-ons, plus Crossly handling. The same data the dashboard prices from.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
try {
    val result : GetGradingPriceBookResponse = apiInstance.getGradingPriceBook()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#getGradingPriceBook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#getGradingPriceBook")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetGradingPriceBookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGradingWorth"></a>
# **getGradingWorth**
> GetGradingWorthResponse getGradingWorth(inventoryItemId)

Worth grading? Raw value vs what each grade is worth at each grader, against the cost. Never predicts the grade.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
val inventoryItemId : kotlin.String = inventoryItemId_example // kotlin.String | 
try {
    val result : GetGradingWorthResponse = apiInstance.getGradingWorth(inventoryItemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#getGradingWorth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#getGradingWorth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryItemId** | **kotlin.String**|  |

### Return type

**GetGradingWorthResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketGradingOrder"></a>
# **getVaultMarketGradingOrder**
> GetVaultMarketGradingOrderResponse getVaultMarketGradingOrder(id)

One grading submission: its timeline, every card with its grade, cert number and photos, the costs and the tracking.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketGradingOrderResponse = apiInstance.getVaultMarketGradingOrder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#getVaultMarketGradingOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#getVaultMarketGradingOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketGradingOrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listGradingRateCard"></a>
# **listGradingRateCard**
> ListGradingRateCardResponse listGradingRateCard()

Every grader and tier Crossly can send to, with the per-card price in cents (null &#x3D; paused at the grader).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
try {
    val result : ListGradingRateCardResponse = apiInstance.listGradingRateCard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#listGradingRateCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#listGradingRateCard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListGradingRateCardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listGradingRuns"></a>
# **listGradingRuns**
> ListGradingRunsResponse listGradingRuns()

Grading Runs taking reservations now, soonest cutoff first. meta.open is false while runs are switched off.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
try {
    val result : ListGradingRunsResponse = apiInstance.listGradingRuns()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#listGradingRuns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#listGradingRuns")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListGradingRunsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listGradingSubmissions"></a>
# **listGradingSubmissions**
> ListGradingSubmissionsResponse listGradingSubmissions(active)

Your cards out for grading (runs and Direct), newest first. active&#x3D;1 keeps only the ones still in flight.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
val active : kotlin.String = active_example // kotlin.String | Only cards that have not finished.
try {
    val result : ListGradingSubmissionsResponse = apiInstance.listGradingSubmissions(active)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#listGradingSubmissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#listGradingSubmissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **active** | **kotlin.String**| Only cards that have not finished. | [optional] [enum: 0, 1, true, false]

### Return type

**ListGradingSubmissionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketGradingCandidates"></a>
# **listVaultMarketGradingCandidates**
> ListVaultMarketGradingCandidatesResponse listVaultMarketGradingCandidates()

What you can send to grading: raw units already in your vault and inventory items, each with a declared value to start from and the reason when one cannot go.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
try {
    val result : ListVaultMarketGradingCandidatesResponse = apiInstance.listVaultMarketGradingCandidates()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#listVaultMarketGradingCandidates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#listVaultMarketGradingCandidates")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketGradingCandidatesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketGradingOrders"></a>
# **listVaultMarketGradingOrders**
> ListVaultMarketGradingOrdersResponse listVaultMarketGradingOrders()

Your grading submissions, newest first. Filter by status, active, grader, tier and dates; q searches the number, card names and cert numbers.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
try {
    val result : ListVaultMarketGradingOrdersResponse = apiInstance.listVaultMarketGradingOrders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#listVaultMarketGradingOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#listVaultMarketGradingOrders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketGradingOrdersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

