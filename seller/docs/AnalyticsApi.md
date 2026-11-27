# AnalyticsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAnalyticExperiment**](AnalyticsApi.md#createAnalyticExperiment) | **POST** /v1/analytics/experiments | Start a listing experiment. split: 2-4 live platform listings observed over the same window; sequential: one platform listing, before vs after changeAt (optionally applying a new price).
[**createAnalyticExperimentDeclare**](AnalyticsApi.md#createAnalyticExperimentDeclare) | **POST** /v1/analytics/experiments/{id}/declare | Record the outcome: a winning arm, no difference, or inconclusive. Concludes the experiment.
[**createAnalyticExperimentStop**](AnalyticsApi.md#createAnalyticExperimentStop) | **POST** /v1/analytics/experiments/{id}/stop | Stop an experiment: no more data is counted after now.
[**deleteAnalyticExperiment**](AnalyticsApi.md#deleteAnalyticExperiment) | **DELETE** /v1/analytics/experiments/{id} | Delete an experiment. The listings are untouched.
[**getAnalyticBookkeeping**](AnalyticsApi.md#getAnalyticBookkeeping) | **GET** /v1/analytics/bookkeeping | Monthly P&amp;L + per-platform breakdown for a calendar year.
[**getAnalyticByPlatform**](AnalyticsApi.md#getAnalyticByPlatform) | **GET** /v1/analytics/by-platform | Sales, net sales, fees and net profit by platform for the last N days.
[**getAnalyticCompare**](AnalyticsApi.md#getAnalyticCompare) | **GET** /v1/analytics/compare | Compare 2-4 of your listings: columns of price, quality, channels, views, favorites, offers and outcome, engagement curves, the fields that differ, and observational tests of favorite rate, view-to-offer rate and views per day.
[**getAnalyticDashboard**](AnalyticsApi.md#getAnalyticDashboard) | **GET** /v1/analytics/dashboard | Composite dashboard: KPIs + breakdowns + recent activity.
[**getAnalyticExperiment**](AnalyticsApi.md#getAnalyticExperiment) | **GET** /v1/analytics/experiments | Your listing A/B experiments, newest first, with status, days running and the current verdict.
[**getAnalyticExperimentById**](AnalyticsApi.md#getAnalyticExperimentById) | **GET** /v1/analytics/experiments/{id} | One experiment: arms with their windows, exposure and rates, the primary-metric test per arm against A, guardrail tests, the daily series and what to do next.
[**getAnalyticInventory**](AnalyticsApi.md#getAnalyticInventory) | **GET** /v1/analytics/inventory | Unsold stock: aging buckets with cost, listed value and market value, the 20 listings most in need of attention, shelf value over time, cohort sell-through at the chosen maturity, listed vs sold velocity and data health.
[**getAnalyticItem**](AnalyticsApi.md#getAnalyticItem) | **GET** /v1/analytics/items | Per-item P&amp;L for sold inventory.
[**getAnalyticItemByListingId**](AnalyticsApi.md#getAnalyticItemByListingId) | **GET** /v1/analytics/items/{listingId} | One listing in depth: channels with views, favorites and offers, the merged timeline, engagement series, price history, comps, money waterfall, days on market, offers, messages, experiments and suggestions.
[**getAnalyticMarketplace**](AnalyticsApi.md#getAnalyticMarketplace) | **GET** /v1/analytics/marketplaces | Every marketplace side by side: net sales and profit, units, ASP, take rate, margin, shipping subsidy, days to sell, sell-through, cancel and return rates, offers and engagement; with vs&#x3D;2-3 platforms, a head-to-head over listings live on all of them.
[**getAnalyticMarketplaceByPlatform**](AnalyticsApi.md#getAnalyticMarketplaceByPlatform) | **GET** /v1/analytics/marketplaces/{platform} | One marketplace in depth: its row, the money series, fee breakdown, days-to-sell and price-realization histograms, categories, top items, at-risk listings, a day-by-hour sales heatmap and offer stats.
[**getAnalyticOverview**](AnalyticsApi.md#getAnalyticOverview) | **GET** /v1/analytics/overview | KPIs with deltas (net sales, net profit, units, ASP, margin, sell-through, median days to sell, active listings, take rate), the trend series, by-marketplace split, top categories, brands and items, sell-through cohort, data health and insights.
[**getAnalyticPerformance**](AnalyticsApi.md#getAnalyticPerformance) | **GET** /v1/analytics/performance | Per-listing performance: channels, views, favorites, offers and conversations in the period, units sold, net sales and profit, margin, days to sell and a 0-100 health score, paged and sortable.
[**getAnalyticProgram**](AnalyticsApi.md#getAnalyticProgram) | **GET** /v1/analytics/programs/{program} | One program&#39;s report over a date range (default the last 30 days, at most 366): KPIs, a daily trend and a breakdown table. Money in integer cents.
[**getAnalyticSegment**](AnalyticsApi.md#getAnalyticSegment) | **GET** /v1/analytics/segments | Niches along one dimension: listed and active counts, units sold, cohort sell-through, median days to sell, net sales and profit, margin, ROI, ASP and discount from ask; rows under minN are flagged lowSample.
[**getAnalyticSegmentByKey**](AnalyticsApi.md#getAnalyticSegmentByKey) | **GET** /v1/analytics/segments/{dim}/{key} | One niche in depth: its row, series, by-marketplace split, days-to-sell histogram, price bands, top items and the 10 oldest unsold listings in it.
[**getAnalyticSummary**](AnalyticsApi.md#getAnalyticSummary) | **GET** /v1/analytics/summary | Headline KPIs for the last N days (the same numbers as the analytics overview).
[**getAnalyticTimesery**](AnalyticsApi.md#getAnalyticTimesery) | **GET** /v1/analytics/timeseries | Sales and net sales over the last N days, zero-filled, one row per calendar day.
[**getAnalyticToday**](AnalyticsApi.md#getAnalyticToday) | **GET** /v1/analytics/today | Today&#39;s checklist + 14-day activity streak.
[**listInsightByPlatform**](AnalyticsApi.md#listInsightByPlatform) | **GET** /v1/insights/by-platform | Platform velocity + margin insight (90-day window): units, net sales, median days to sell, ASP and net after the real marketplace fees.
[**updateAnalyticExperiment**](AnalyticsApi.md#updateAnalyticExperiment) | **PATCH** /v1/analytics/experiments/{id} | Rename an experiment or change its hypothesis, notes or planned end.


<a name="createAnalyticExperiment"></a>
# **createAnalyticExperiment**
> AnalyticExperimentResponse createAnalyticExperiment()

Start a listing experiment. split: 2-4 live platform listings observed over the same window; sequential: one platform listing, before vs after changeAt (optionally applying a new price).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
try {
    val result : AnalyticExperimentResponse = apiInstance.createAnalyticExperiment()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#createAnalyticExperiment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#createAnalyticExperiment")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**AnalyticExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAnalyticExperimentDeclare"></a>
# **createAnalyticExperimentDeclare**
> AnalyticExperimentResponse createAnalyticExperimentDeclare(id)

Record the outcome: a winning arm, no difference, or inconclusive. Concludes the experiment.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val id : kotlin.String = id_example // kotlin.String | The experiment id (a uuid; any other id is a 404).
try {
    val result : AnalyticExperimentResponse = apiInstance.createAnalyticExperimentDeclare(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#createAnalyticExperimentDeclare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#createAnalyticExperimentDeclare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The experiment id (a uuid; any other id is a 404). |

### Return type

**AnalyticExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAnalyticExperimentStop"></a>
# **createAnalyticExperimentStop**
> AnalyticExperimentResponse createAnalyticExperimentStop(id)

Stop an experiment: no more data is counted after now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val id : kotlin.String = id_example // kotlin.String | The experiment id (a uuid; any other id is a 404).
try {
    val result : AnalyticExperimentResponse = apiInstance.createAnalyticExperimentStop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#createAnalyticExperimentStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#createAnalyticExperimentStop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The experiment id (a uuid; any other id is a 404). |

### Return type

**AnalyticExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAnalyticExperiment"></a>
# **deleteAnalyticExperiment**
> DeleteStoryResponse deleteAnalyticExperiment(id)

Delete an experiment. The listings are untouched.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val id : kotlin.String = id_example // kotlin.String | The experiment id (a uuid; any other id is a 404).
try {
    val result : DeleteStoryResponse = apiInstance.deleteAnalyticExperiment(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#deleteAnalyticExperiment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#deleteAnalyticExperiment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The experiment id (a uuid; any other id is a 404). |

### Return type

**DeleteStoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

**GetAnalyticBookkeepingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticByPlatform"></a>
# **getAnalyticByPlatform**
> GetAnalyticByPlatformResponse getAnalyticByPlatform(days, tz)

Sales, net sales, fees and net profit by platform for the last N days.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val days : kotlin.Int = 56 // kotlin.Int | Calendar days back, today included. Larger values are clamped to 365.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC.
try {
    val result : GetAnalyticByPlatformResponse = apiInstance.getAnalyticByPlatform(days, tz)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **days** | **kotlin.Int**| Calendar days back, today included. Larger values are clamped to 365. | [optional] [default to 30]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. | [optional]

### Return type

**GetAnalyticByPlatformResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticCompare"></a>
# **getAnalyticCompare**
> GetAnalyticCompareResponse getAnalyticCompare(ids, align, platform, tz)

Compare 2-4 of your listings: columns of price, quality, channels, views, favorites, offers and outcome, engagement curves, the fields that differ, and observational tests of favorite rate, view-to-offer rate and views per day.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val ids : kotlin.String = ids_example // kotlin.String | Comma-separated listing ids, 2 to 4. The first is arm A.
val align : kotlin.String = align_example // kotlin.String | age = x is days since first listed (default); calendar = x is the date.
val platform : kotlin.String = platform_example // kotlin.String | Restrict engagement to one channel (platform id).
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone. Default UTC.
try {
    val result : GetAnalyticCompareResponse = apiInstance.getAnalyticCompare(ids, align, platform, tz)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticCompare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticCompare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **kotlin.String**| Comma-separated listing ids, 2 to 4. The first is arm A. |
 **align** | **kotlin.String**| age &#x3D; x is days since first listed (default); calendar &#x3D; x is the date. | [optional] [enum: age, calendar]
 **platform** | **kotlin.String**| Restrict engagement to one channel (platform id). | [optional]
 **tz** | **kotlin.String**| IANA time zone. Default UTC. | [optional]

### Return type

**GetAnalyticCompareResponse**

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

**GetAnalyticDashboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticExperiment"></a>
# **getAnalyticExperiment**
> GetAnalyticExperimentResponse getAnalyticExperiment(status, page, size)

Your listing A/B experiments, newest first, with status, days running and the current verdict.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val status : kotlin.String = status_example // kotlin.String | Default all.
val page : kotlin.Int = 56 // kotlin.Int | 1-indexed page. Default 1.
val size : kotlin.Int = 56 // kotlin.Int | Rows per page. Default 20.
try {
    val result : GetAnalyticExperimentResponse = apiInstance.getAnalyticExperiment(status, page, size)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticExperiment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticExperiment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **kotlin.String**| Default all. | [optional] [enum: all, running, concluded, draft]
 **page** | **kotlin.Int**| 1-indexed page. Default 1. | [optional]
 **size** | **kotlin.Int**| Rows per page. Default 20. | [optional]

### Return type

**GetAnalyticExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticExperimentById"></a>
# **getAnalyticExperimentById**
> GetAnalyticExperimentByIdResponse getAnalyticExperimentById(id)

One experiment: arms with their windows, exposure and rates, the primary-metric test per arm against A, guardrail tests, the daily series and what to do next.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val id : kotlin.String = id_example // kotlin.String | The experiment id (a uuid).
try {
    val result : GetAnalyticExperimentByIdResponse = apiInstance.getAnalyticExperimentById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticExperimentById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticExperimentById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The experiment id (a uuid). |

### Return type

**GetAnalyticExperimentByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticInventory"></a>
# **getAnalyticInventory**
> GetAnalyticInventoryResponse getAnalyticInventory(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, maturity)

Unsold stock: aging buckets with cost, listed value and market value, the 20 listings most in need of attention, shelf value over time, cohort sell-through at the chosen maturity, listed vs sold velocity and data health.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val range : kotlin.String = range_example // kotlin.String | Reporting window. Default 30d. custom needs from and to.
val from : kotlin.String = from_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val to : kotlin.String = to_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val compare : kotlin.String = compare_example // kotlin.String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
val cmpFrom : kotlin.String = cmpFrom_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val cmpTo : kotlin.String = cmpTo_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val labels : kotlin.String = labels_example // kotlin.String | Comma-separated inventory labels (any of them).
val platforms : kotlin.String = platforms_example // kotlin.String | Comma-separated platform ids.
val category : kotlin.String = category_example // kotlin.String | Canonical main-category key.
val brand : kotlin.String = brand_example // kotlin.String | Brand name.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
val maturity : kotlin.Int = 56 // kotlin.Int | Days an item has to sell within to count as sold in the cohort. Default 30.
try {
    val result : GetAnalyticInventoryResponse = apiInstance.getAnalyticInventory(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, maturity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticInventory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **range** | **kotlin.String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **kotlin.String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **kotlin.String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **kotlin.String**| Comma-separated platform ids. | [optional]
 **category** | **kotlin.String**| Canonical main-category key. | [optional]
 **brand** | **kotlin.String**| Brand name. | [optional]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]
 **maturity** | **kotlin.Int**| Days an item has to sell within to count as sold in the cohort. Default 30. | [optional] [enum: 30, 60, 90]

### Return type

**GetAnalyticInventoryResponse**

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

**GetAnalyticItemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticItemByListingId"></a>
# **getAnalyticItemByListingId**
> GetAnalyticItemByListingIdResponse getAnalyticItemByListingId(listingId, by, tz)

One listing in depth: channels with views, favorites and offers, the merged timeline, engagement series, price history, comps, money waterfall, days on market, offers, messages, experiments and suggestions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val listingId : kotlin.String = listingId_example // kotlin.String | A listings.id you own (or an inventory item id with by=inventory).
val by : kotlin.String = by_example // kotlin.String | inventory = the id is an inventory item id; the answer is { redirectListingId }. Default listing.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC.
try {
    val result : GetAnalyticItemByListingIdResponse = apiInstance.getAnalyticItemByListingId(listingId, by, tz)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticItemByListingId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticItemByListingId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listingId** | **kotlin.String**| A listings.id you own (or an inventory item id with by&#x3D;inventory). |
 **by** | **kotlin.String**| inventory &#x3D; the id is an inventory item id; the answer is { redirectListingId }. Default listing. | [optional] [enum: listing, inventory]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. | [optional]

### Return type

**GetAnalyticItemByListingIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticMarketplace"></a>
# **getAnalyticMarketplace**
> GetAnalyticMarketplaceResponse getAnalyticMarketplace(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, vs, sort, dir)

Every marketplace side by side: net sales and profit, units, ASP, take rate, margin, shipping subsidy, days to sell, sell-through, cancel and return rates, offers and engagement; with vs&#x3D;2-3 platforms, a head-to-head over listings live on all of them.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val range : kotlin.String = range_example // kotlin.String | Reporting window. Default 30d. custom needs from and to.
val from : kotlin.String = from_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val to : kotlin.String = to_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val compare : kotlin.String = compare_example // kotlin.String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
val cmpFrom : kotlin.String = cmpFrom_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val cmpTo : kotlin.String = cmpTo_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val labels : kotlin.String = labels_example // kotlin.String | Comma-separated inventory labels (any of them).
val platforms : kotlin.String = platforms_example // kotlin.String | Comma-separated platform ids.
val category : kotlin.String = category_example // kotlin.String | Canonical main-category key.
val brand : kotlin.String = brand_example // kotlin.String | Brand name.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
val vs : kotlin.String = vs_example // kotlin.String | Comma-separated 2-3 platform ids for the head-to-head.
val sort : kotlin.String = sort_example // kotlin.String | Default netSales.
val dir : kotlin.String = dir_example // kotlin.String | Default desc.
try {
    val result : GetAnalyticMarketplaceResponse = apiInstance.getAnalyticMarketplace(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, vs, sort, dir)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticMarketplace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticMarketplace")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **range** | **kotlin.String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **kotlin.String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **kotlin.String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **kotlin.String**| Comma-separated platform ids. | [optional]
 **category** | **kotlin.String**| Canonical main-category key. | [optional]
 **brand** | **kotlin.String**| Brand name. | [optional]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]
 **vs** | **kotlin.String**| Comma-separated 2-3 platform ids for the head-to-head. | [optional]
 **sort** | **kotlin.String**| Default netSales. | [optional] [enum: netSales, netProfit, unitsSold, asp, takeRate, marginRate, shippingSubsidy, medianDaysToSell, sellThroughRate, cancelRate, returnRate, offerAcceptRate, avgOfferPctOfAsk, viewsPerListingDay, favoriteRate, platform, activeListings, staleListings]
 **dir** | **kotlin.String**| Default desc. | [optional] [enum: asc, desc]

### Return type

**GetAnalyticMarketplaceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticMarketplaceByPlatform"></a>
# **getAnalyticMarketplaceByPlatform**
> GetAnalyticMarketplaceByPlatformResponse getAnalyticMarketplaceByPlatform(platform, range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz)

One marketplace in depth: its row, the money series, fee breakdown, days-to-sell and price-realization histograms, categories, top items, at-risk listings, a day-by-hour sales heatmap and offer stats.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val platform : kotlin.String = platform_example // kotlin.String | A platform id, e.g. ebay, poshmark.
val range : kotlin.String = range_example // kotlin.String | Reporting window. Default 30d. custom needs from and to.
val from : kotlin.String = from_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val to : kotlin.String = to_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val compare : kotlin.String = compare_example // kotlin.String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
val cmpFrom : kotlin.String = cmpFrom_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val cmpTo : kotlin.String = cmpTo_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val labels : kotlin.String = labels_example // kotlin.String | Comma-separated inventory labels (any of them).
val platforms : kotlin.String = platforms_example // kotlin.String | Comma-separated platform ids.
val category : kotlin.String = category_example // kotlin.String | Canonical main-category key.
val brand : kotlin.String = brand_example // kotlin.String | Brand name.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
try {
    val result : GetAnalyticMarketplaceByPlatformResponse = apiInstance.getAnalyticMarketplaceByPlatform(platform, range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticMarketplaceByPlatform")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticMarketplaceByPlatform")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**| A platform id, e.g. ebay, poshmark. |
 **range** | **kotlin.String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **kotlin.String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **kotlin.String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **kotlin.String**| Comma-separated platform ids. | [optional]
 **category** | **kotlin.String**| Canonical main-category key. | [optional]
 **brand** | **kotlin.String**| Brand name. | [optional]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]

### Return type

**GetAnalyticMarketplaceByPlatformResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticOverview"></a>
# **getAnalyticOverview**
> GetAnalyticOverviewResponse getAnalyticOverview(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, stores)

KPIs with deltas (net sales, net profit, units, ASP, margin, sell-through, median days to sell, active listings, take rate), the trend series, by-marketplace split, top categories, brands and items, sell-through cohort, data health and insights.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val range : kotlin.String = range_example // kotlin.String | Reporting window. Default 30d. custom needs from and to.
val from : kotlin.String = from_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val to : kotlin.String = to_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val compare : kotlin.String = compare_example // kotlin.String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
val cmpFrom : kotlin.String = cmpFrom_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val cmpTo : kotlin.String = cmpTo_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val labels : kotlin.String = labels_example // kotlin.String | Comma-separated inventory labels (any of them).
val platforms : kotlin.String = platforms_example // kotlin.String | Comma-separated platform ids.
val category : kotlin.String = category_example // kotlin.String | Canonical main-category key.
val brand : kotlin.String = brand_example // kotlin.String | Brand name.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
val stores : kotlin.String = stores_example // kotlin.String | Comma-separated store ids.
try {
    val result : GetAnalyticOverviewResponse = apiInstance.getAnalyticOverview(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, stores)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticOverview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticOverview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **range** | **kotlin.String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **kotlin.String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **kotlin.String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **kotlin.String**| Comma-separated platform ids. | [optional]
 **category** | **kotlin.String**| Canonical main-category key. | [optional]
 **brand** | **kotlin.String**| Brand name. | [optional]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]
 **stores** | **kotlin.String**| Comma-separated store ids. | [optional]

### Return type

**GetAnalyticOverviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticPerformance"></a>
# **getAnalyticPerformance**
> GetAnalyticPerformanceResponse getAnalyticPerformance(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, status, q, sort, dir, page, size, minDays)

Per-listing performance: channels, views, favorites, offers and conversations in the period, units sold, net sales and profit, margin, days to sell and a 0-100 health score, paged and sortable.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val range : kotlin.String = range_example // kotlin.String | Reporting window. Default 30d. custom needs from and to.
val from : kotlin.String = from_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val to : kotlin.String = to_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val compare : kotlin.String = compare_example // kotlin.String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
val cmpFrom : kotlin.String = cmpFrom_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val cmpTo : kotlin.String = cmpTo_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val labels : kotlin.String = labels_example // kotlin.String | Comma-separated inventory labels (any of them).
val platforms : kotlin.String = platforms_example // kotlin.String | Comma-separated platform ids.
val category : kotlin.String = category_example // kotlin.String | Canonical main-category key.
val brand : kotlin.String = brand_example // kotlin.String | Brand name.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
val status : kotlin.String = status_example // kotlin.String | unsold = listed at least minDays with no completed sale.
val q : kotlin.String = q_example // kotlin.String | Title, SKU or brand contains.
val sort : kotlin.String = sort_example // kotlin.String | Default lastActivity.
val dir : kotlin.String = dir_example // kotlin.String | Default desc.
val page : kotlin.Int = 56 // kotlin.Int | 1-indexed page. Default 1.
val size : kotlin.Int = 56 // kotlin.Int | Rows per page. Default 50.
val minDays : kotlin.Int = 56 // kotlin.Int | Minimum days listed (for status=unsold). Default 0.
try {
    val result : GetAnalyticPerformanceResponse = apiInstance.getAnalyticPerformance(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, status, q, sort, dir, page, size, minDays)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticPerformance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticPerformance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **range** | **kotlin.String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **kotlin.String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **kotlin.String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **kotlin.String**| Comma-separated platform ids. | [optional]
 **category** | **kotlin.String**| Canonical main-category key. | [optional]
 **brand** | **kotlin.String**| Brand name. | [optional]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]
 **status** | **kotlin.String**| unsold &#x3D; listed at least minDays with no completed sale. | [optional] [enum: all, active, sold, unsold, ended]
 **q** | **kotlin.String**| Title, SKU or brand contains. | [optional]
 **sort** | **kotlin.String**| Default lastActivity. | [optional] [enum: lastActivity, title, price, daysListed, views, favorites, offers, unitsSold, netSales, netProfit, margin, daysToSell, health]
 **dir** | **kotlin.String**| Default desc. | [optional] [enum: asc, desc]
 **page** | **kotlin.Int**| 1-indexed page. Default 1. | [optional]
 **size** | **kotlin.Int**| Rows per page. Default 50. | [optional] [enum: 25, 50, 100]
 **minDays** | **kotlin.Int**| Minimum days listed (for status&#x3D;unsold). Default 0. | [optional]

### Return type

**GetAnalyticPerformanceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticProgram"></a>
# **getAnalyticProgram**
> GetAnalyticProgramResponse getAnalyticProgram(program, from, to, by)

One program&#39;s report over a date range (default the last 30 days, at most 366): KPIs, a daily trend and a breakdown table. Money in integer cents.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val program : kotlin.String = program_example // kotlin.String | 
val from : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | First UTC day (YYYY-MM-DD), inclusive.
val to : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Last UTC day (YYYY-MM-DD), inclusive. Default today.
val by : kotlin.String = by_example // kotlin.String | Breakdown dimension, when the program offers one (worlds: showroom, property, event).
try {
    val result : GetAnalyticProgramResponse = apiInstance.getAnalyticProgram(program, from, to, by)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticProgram")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticProgram")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program** | **kotlin.String**|  | [enum: wholesale, ads, rentals, branding, events, drops, discounts, market, worlds, funding, vault, team, referrals, developer-apps]
 **from** | **java.time.LocalDate**| First UTC day (YYYY-MM-DD), inclusive. | [optional]
 **to** | **java.time.LocalDate**| Last UTC day (YYYY-MM-DD), inclusive. Default today. | [optional]
 **by** | **kotlin.String**| Breakdown dimension, when the program offers one (worlds: showroom, property, event). | [optional]

### Return type

**GetAnalyticProgramResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticSegment"></a>
# **getAnalyticSegment**
> GetAnalyticSegmentResponse getAnalyticSegment(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, dim, sort, dir, minN, q)

Niches along one dimension: listed and active counts, units sold, cohort sell-through, median days to sell, net sales and profit, margin, ROI, ASP and discount from ask; rows under minN are flagged lowSample.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val range : kotlin.String = range_example // kotlin.String | Reporting window. Default 30d. custom needs from and to.
val from : kotlin.String = from_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val to : kotlin.String = to_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val compare : kotlin.String = compare_example // kotlin.String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
val cmpFrom : kotlin.String = cmpFrom_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val cmpTo : kotlin.String = cmpTo_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val labels : kotlin.String = labels_example // kotlin.String | Comma-separated inventory labels (any of them).
val platforms : kotlin.String = platforms_example // kotlin.String | Comma-separated platform ids.
val category : kotlin.String = category_example // kotlin.String | Canonical main-category key.
val brand : kotlin.String = brand_example // kotlin.String | Brand name.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
val dim : kotlin.String = dim_example // kotlin.String | category = main category; subcategory = main > sub; brand; condition; size; source = where you acquired it; department; priceBand = ask in <$10, $10-25, $25-50, $50-100, $100-250, $250+; ageBand = days live at sale or now (<7, 7-30, 30-90, 90+).
val sort : kotlin.String = sort_example // kotlin.String | Default netSales.
val dir : kotlin.String = dir_example // kotlin.String | Default desc.
val minN : kotlin.Int = 56 // kotlin.Int | Minimum sample for a row to count as a winner or loser. Default 3.
val q : kotlin.String = q_example // kotlin.String | Segment label contains.
try {
    val result : GetAnalyticSegmentResponse = apiInstance.getAnalyticSegment(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, dim, sort, dir, minN, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticSegment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticSegment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **range** | **kotlin.String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **kotlin.String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **kotlin.String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **kotlin.String**| Comma-separated platform ids. | [optional]
 **category** | **kotlin.String**| Canonical main-category key. | [optional]
 **brand** | **kotlin.String**| Brand name. | [optional]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]
 **dim** | **kotlin.String**| category &#x3D; main category; subcategory &#x3D; main &gt; sub; brand; condition; size; source &#x3D; where you acquired it; department; priceBand &#x3D; ask in &lt;$10, $10-25, $25-50, $50-100, $100-250, $250+; ageBand &#x3D; days live at sale or now (&lt;7, 7-30, 30-90, 90+). | [optional] [enum: category, subcategory, brand, condition, size, source, department, priceBand, ageBand]
 **sort** | **kotlin.String**| Default netSales. | [optional] [enum: label, listedCount, activeCount, unitsSold, sellThrough, medianDaysToSell, netSales, netProfit, marginRate, margin, roi, asp, share]
 **dir** | **kotlin.String**| Default desc. | [optional] [enum: asc, desc]
 **minN** | **kotlin.Int**| Minimum sample for a row to count as a winner or loser. Default 3. | [optional]
 **q** | **kotlin.String**| Segment label contains. | [optional]

### Return type

**GetAnalyticSegmentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticSegmentByKey"></a>
# **getAnalyticSegmentByKey**
> GetAnalyticSegmentByKeyResponse getAnalyticSegmentByKey(dim, key, range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz)

One niche in depth: its row, series, by-marketplace split, days-to-sell histogram, price bands, top items and the 10 oldest unsold listings in it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val dim : kotlin.String = dim_example // kotlin.String | One of category, subcategory, brand, condition, size, source, department, priceBand, ageBand. category = main category; subcategory = main > sub; brand; condition; size; source = where you acquired it; department; priceBand = ask in <$10, $10-25, $25-50, $50-100, $100-250, $250+; ageBand = days live at sale or now (<7, 7-30, 30-90, 90+).
val key : kotlin.String = key_example // kotlin.String | The segment key from a segments row (URL-encoded). A key with no data in scope is a 404.
val range : kotlin.String = range_example // kotlin.String | Reporting window. Default 30d. custom needs from and to.
val from : kotlin.String = from_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val to : kotlin.String = to_example // kotlin.String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
val compare : kotlin.String = compare_example // kotlin.String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
val cmpFrom : kotlin.String = cmpFrom_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val cmpTo : kotlin.String = cmpTo_example // kotlin.String | YYYY-MM-DD. Only with compare=custom.
val labels : kotlin.String = labels_example // kotlin.String | Comma-separated inventory labels (any of them).
val platforms : kotlin.String = platforms_example // kotlin.String | Comma-separated platform ids.
val category : kotlin.String = category_example // kotlin.String | Canonical main-category key.
val brand : kotlin.String = brand_example // kotlin.String | Brand name.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
try {
    val result : GetAnalyticSegmentByKeyResponse = apiInstance.getAnalyticSegmentByKey(dim, key, range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#getAnalyticSegmentByKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#getAnalyticSegmentByKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dim** | **kotlin.String**| One of category, subcategory, brand, condition, size, source, department, priceBand, ageBand. category &#x3D; main category; subcategory &#x3D; main &gt; sub; brand; condition; size; source &#x3D; where you acquired it; department; priceBand &#x3D; ask in &lt;$10, $10-25, $25-50, $50-100, $100-250, $250+; ageBand &#x3D; days live at sale or now (&lt;7, 7-30, 30-90, 90+). |
 **key** | **kotlin.String**| The segment key from a segments row (URL-encoded). A key with no data in scope is a 404. |
 **range** | **kotlin.String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **kotlin.String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **kotlin.String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **kotlin.String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **kotlin.String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **kotlin.String**| Comma-separated platform ids. | [optional]
 **category** | **kotlin.String**| Canonical main-category key. | [optional]
 **brand** | **kotlin.String**| Brand name. | [optional]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]

### Return type

**GetAnalyticSegmentByKeyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticSummary"></a>
# **getAnalyticSummary**
> GetAnalyticSummaryResponse getAnalyticSummary(days, tz)

Headline KPIs for the last N days (the same numbers as the analytics overview).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val days : kotlin.Int = 56 // kotlin.Int | Calendar days back, today included. Larger values are clamped to 365.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC.
try {
    val result : GetAnalyticSummaryResponse = apiInstance.getAnalyticSummary(days, tz)
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
 **days** | **kotlin.Int**| Calendar days back, today included. Larger values are clamped to 365. | [optional] [default to 30]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. | [optional]

### Return type

**GetAnalyticSummaryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticTimesery"></a>
# **getAnalyticTimesery**
> GetAnalyticTimeseryResponse getAnalyticTimesery(days, tz)

Sales and net sales over the last N days, zero-filled, one row per calendar day.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val days : kotlin.Int = 56 // kotlin.Int | Calendar days back, today included. Larger values are clamped to 365.
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC.
try {
    val result : GetAnalyticTimeseryResponse = apiInstance.getAnalyticTimesery(days, tz)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **days** | **kotlin.Int**| Calendar days back, today included. Larger values are clamped to 365. | [optional] [default to 30]
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. | [optional]

### Return type

**GetAnalyticTimeseryResponse**

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

**GetAnalyticTodayResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInsightByPlatform"></a>
# **listInsightByPlatform**
> ListInsightByPlatformResponse listInsightByPlatform(tz)

Platform velocity + margin insight (90-day window): units, net sales, median days to sell, ASP and net after the real marketplace fees.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val tz : kotlin.String = tz_example // kotlin.String | IANA time zone for day boundaries. Default UTC.
try {
    val result : ListInsightByPlatformResponse = apiInstance.listInsightByPlatform(tz)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tz** | **kotlin.String**| IANA time zone for day boundaries. Default UTC. | [optional]

### Return type

**ListInsightByPlatformResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAnalyticExperiment"></a>
# **updateAnalyticExperiment**
> AnalyticExperimentResponse updateAnalyticExperiment(id)

Rename an experiment or change its hypothesis, notes or planned end.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AnalyticsApi()
val id : kotlin.String = id_example // kotlin.String | The experiment id (a uuid; any other id is a 404).
try {
    val result : AnalyticExperimentResponse = apiInstance.updateAnalyticExperiment(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#updateAnalyticExperiment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#updateAnalyticExperiment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The experiment id (a uuid; any other id is a 404). |

### Return type

**AnalyticExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

