# AnalyticsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAnalyticBookkeeping**](AnalyticsApi.md#getAnalyticBookkeeping) | **GET** /v1/analytics/bookkeeping | Monthly P&amp;L + per-platform breakdown for a calendar year.
[**getAnalyticByPlatform**](AnalyticsApi.md#getAnalyticByPlatform) | **GET** /v1/analytics/by-platform | Sales + revenue grouped by platform for the last N days.
[**getAnalyticDashboard**](AnalyticsApi.md#getAnalyticDashboard) | **GET** /v1/analytics/dashboard | Composite dashboard: KPIs + breakdowns + recent activity.
[**getAnalyticItem**](AnalyticsApi.md#getAnalyticItem) | **GET** /v1/analytics/items | Per-item P&amp;L for sold inventory.
[**getAnalyticSummary**](AnalyticsApi.md#getAnalyticSummary) | **GET** /v1/analytics/summary | Headline KPIs for the last N days.
[**getAnalyticTimesery**](AnalyticsApi.md#getAnalyticTimesery) | **GET** /v1/analytics/timeseries | Daily sales + revenue series for the last N days.
[**getAnalyticToday**](AnalyticsApi.md#getAnalyticToday) | **GET** /v1/analytics/today | Today&#39;s checklist + 14-day activity streak.
[**listInsightByPlatform**](AnalyticsApi.md#listInsightByPlatform) | **GET** /v1/insights/by-platform | Platform velocity + margin insight (90-day window).


<a name="getAnalyticBookkeeping"></a>
# **getAnalyticBookkeeping**
> GetAnalyticBookkeepingResponse getAnalyticBookkeeping()

Monthly P&amp;L + per-platform breakdown for a calendar year.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
try {
    val result : GetAnalyticBookkeepingResponse = apiInstance.getAnalyticBookkeeping()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticBookkeeping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticBookkeeping")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAnalyticBookkeepingResponse**](GetAnalyticBookkeepingResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticByPlatform"></a>
# **getAnalyticByPlatform**
> GetAnalyticByPlatformResponse getAnalyticByPlatform()

Sales + revenue grouped by platform for the last N days.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
try {
    val result : GetAnalyticByPlatformResponse = apiInstance.getAnalyticByPlatform()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticByPlatform")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticByPlatform")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAnalyticByPlatformResponse**](GetAnalyticByPlatformResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticDashboard"></a>
# **getAnalyticDashboard**
> GetAnalyticDashboardResponse getAnalyticDashboard()

Composite dashboard: KPIs + breakdowns + recent activity.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
try {
    val result : GetAnalyticDashboardResponse = apiInstance.getAnalyticDashboard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticDashboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticDashboard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAnalyticDashboardResponse**](GetAnalyticDashboardResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticItem"></a>
# **getAnalyticItem**
> GetAnalyticItemResponse getAnalyticItem()

Per-item P&amp;L for sold inventory.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
try {
    val result : GetAnalyticItemResponse = apiInstance.getAnalyticItem()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticItem")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAnalyticItemResponse**](GetAnalyticItemResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticSummary"></a>
# **getAnalyticSummary**
> GetAnalyticSummaryResponse getAnalyticSummary(days)

Headline KPIs for the last N days.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val days : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : GetAnalyticSummaryResponse = apiInstance.getAnalyticSummary(days)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticSummary")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **days** | **kotlin.Int**|  | [optional] [default to 30]

### Return type

[**GetAnalyticSummaryResponse**](GetAnalyticSummaryResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticTimesery"></a>
# **getAnalyticTimesery**
> GetAnalyticTimeseryResponse getAnalyticTimesery()

Daily sales + revenue series for the last N days.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
try {
    val result : GetAnalyticTimeseryResponse = apiInstance.getAnalyticTimesery()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticTimesery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticTimesery")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAnalyticTimeseryResponse**](GetAnalyticTimeseryResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticToday"></a>
# **getAnalyticToday**
> GetAnalyticTodayResponse getAnalyticToday()

Today&#39;s checklist + 14-day activity streak.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
try {
    val result : GetAnalyticTodayResponse = apiInstance.getAnalyticToday()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticToday")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticToday")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAnalyticTodayResponse**](GetAnalyticTodayResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInsightByPlatform"></a>
# **listInsightByPlatform**
> V1List listInsightByPlatform()

Platform velocity + margin insight (90-day window).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
try {
    val result : V1List = apiInstance.listInsightByPlatform()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#listInsightByPlatform")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#listInsightByPlatform")
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

