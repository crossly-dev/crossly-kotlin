# GradingApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGradingDirect**](GradingApi.md#createGradingDirect) | **POST** /v1/grading/direct | Track a card you sent on your own grader account (Direct). Crossly takes no money; it verifies the cert when it comes back.
[**createGradingRunReserve**](GradingApi.md#createGradingRunReserve) | **POST** /v1/grading/runs/{id}/reserve | Hold a slot in a Grading Run. Free now; charged on your saved card only if the run locks. Full-access token and Idempotency-Key required.
[**createGradingSubmissionCancel**](GradingApi.md#createGradingSubmissionCancel) | **POST** /v1/grading/submissions/{id}/cancel | Pull a reserved card out of its run. Only while it is reserved; nothing was charged.
[**createGradingSubmissionResult**](GradingApi.md#createGradingSubmissionResult) | **POST** /v1/grading/submissions/{id}/result | Direct only: enter the grade that came back. Writes it to the item and its listings, verified when the cert agrees.
[**createGradingSubmissionShipped**](GradingApi.md#createGradingSubmissionShipped) | **POST** /v1/grading/submissions/{id}/shipped | Say you mailed a charged card to the hub, with optional tracking.
[**createGradingVerifyCert**](GradingApi.md#createGradingVerifyCert) | **POST** /v1/grading/verify-cert | Look a cert number up with its grader. found&#x3D;false when the grader has no record.
[**getGradingWorth**](GradingApi.md#getGradingWorth) | **GET** /v1/grading/worth/{inventoryItemId} | Worth grading? Raw value vs what each grade is worth at each grader, against the cost. Never predicts the grade.
[**listGradingRateCard**](GradingApi.md#listGradingRateCard) | **GET** /v1/grading/rate-card | Every grader and tier Crossly can send to, with the per-card price in cents (null &#x3D; paused at the grader).
[**listGradingRuns**](GradingApi.md#listGradingRuns) | **GET** /v1/grading/runs | Grading Runs taking reservations now, soonest cutoff first. meta.open is false while runs are switched off.
[**listGradingSubmissions**](GradingApi.md#listGradingSubmissions) | **GET** /v1/grading/submissions | Your cards out for grading (runs and Direct), newest first. active&#x3D;1 keeps only the ones still in flight.


<a name="createGradingDirect"></a>
# **createGradingDirect**
> IdResponse createGradingDirect()

Track a card you sent on your own grader account (Direct). Crossly takes no money; it verifies the cert when it comes back.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
try {
    val result : IdResponse = apiInstance.createGradingDirect()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#createGradingDirect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#createGradingDirect")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**IdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

<a name="createGradingSubmissionResult"></a>
# **createGradingSubmissionResult**
> CreateGradingSubmissionResultResponse createGradingSubmissionResult(id)

Direct only: enter the grade that came back. Writes it to the item and its listings, verified when the cert agrees.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GradingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateGradingSubmissionResultResponse = apiInstance.createGradingSubmissionResult(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GradingApi#createGradingSubmissionResult")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GradingApi#createGradingSubmissionResult")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateGradingSubmissionResultResponse**

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

