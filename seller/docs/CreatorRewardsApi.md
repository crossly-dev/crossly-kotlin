# CreatorRewardsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCreatorRewardFormula**](CreatorRewardsApi.md#getCreatorRewardFormula) | **GET** /v1/creator-rewards/formula | The Creator Rewards formula: the pool&#39;s share of Crossly&#39;s Crossly Carnival take in force, the counting rules, and any scheduled change (announced at least 90 days ahead).
[**getCreatorRewardMe**](CreatorRewardsApi.md#getCreatorRewardMe) | **GET** /v1/creator-rewards/me/{month} | One month of your Creator Rewards (YYYY-MM).
[**getPublicCreatorRewardReconciliation**](CreatorRewardsApi.md#getPublicCreatorRewardReconciliation) | **GET** /v1/public/creator-rewards/reconciliation | Public monthly reconciliation of Creator Rewards (no auth): per month the pool funded from Crossly&#39;s take, carried in, distributed, paid (from the ledger), carried over, the formula version and weights, eligible experiences and every check; plus the formula in force and scheduled changes (90-day notice).
[**listCreatorRewardMe**](CreatorRewardsApi.md#listCreatorRewardMe) | **GET** /v1/creator-rewards/me | Your Creator Rewards: each month, each experience you own or are paid for (counted minutes and players, exclusions, its amount, your part).
[**listCreatorRewardMonths**](CreatorRewardsApi.md#listCreatorRewardMonths) | **GET** /v1/creator-rewards/months | Every calculated month: Crossly&#39;s take, the funded share, the pool, what was distributed and carried, counted minutes and exclusions by reason.


<a name="getCreatorRewardFormula"></a>
# **getCreatorRewardFormula**
> GetCreatorRewardFormulaResponse getCreatorRewardFormula()

The Creator Rewards formula: the pool&#39;s share of Crossly&#39;s Crossly Carnival take in force, the counting rules, and any scheduled change (announced at least 90 days ahead).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorRewardsApi()
try {
    val result : GetCreatorRewardFormulaResponse = apiInstance.getCreatorRewardFormula()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorRewardsApi#getCreatorRewardFormula")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorRewardsApi#getCreatorRewardFormula")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetCreatorRewardFormulaResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorRewardMe"></a>
# **getCreatorRewardMe**
> GetCreatorRewardMeResponse getCreatorRewardMe(month)

One month of your Creator Rewards (YYYY-MM).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorRewardsApi()
val month : kotlin.String = month_example // kotlin.String | 
try {
    val result : GetCreatorRewardMeResponse = apiInstance.getCreatorRewardMe(month)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorRewardsApi#getCreatorRewardMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorRewardsApi#getCreatorRewardMe")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **month** | **kotlin.String**|  |

### Return type

**GetCreatorRewardMeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPublicCreatorRewardReconciliation"></a>
# **getPublicCreatorRewardReconciliation**
> GetPublicCreatorRewardReconciliationResponse getPublicCreatorRewardReconciliation(limit)

Public monthly reconciliation of Creator Rewards (no auth): per month the pool funded from Crossly&#39;s take, carried in, distributed, paid (from the ledger), carried over, the formula version and weights, eligible experiences and every check; plus the formula in force and scheduled changes (90-day notice).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorRewardsApi()
val limit : kotlin.Int = 56 // kotlin.Int | Months to return, newest first (default 24).
try {
    val result : GetPublicCreatorRewardReconciliationResponse = apiInstance.getPublicCreatorRewardReconciliation(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorRewardsApi#getPublicCreatorRewardReconciliation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorRewardsApi#getPublicCreatorRewardReconciliation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Months to return, newest first (default 24). | [optional]

### Return type

**GetPublicCreatorRewardReconciliationResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorRewardMe"></a>
# **listCreatorRewardMe**
> ListCreatorRewardMeResponse listCreatorRewardMe()

Your Creator Rewards: each month, each experience you own or are paid for (counted minutes and players, exclusions, its amount, your part).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorRewardsApi()
try {
    val result : ListCreatorRewardMeResponse = apiInstance.listCreatorRewardMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorRewardsApi#listCreatorRewardMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorRewardsApi#listCreatorRewardMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListCreatorRewardMeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorRewardMonths"></a>
# **listCreatorRewardMonths**
> ListCreatorRewardMonthsResponse listCreatorRewardMonths()

Every calculated month: Crossly&#39;s take, the funded share, the pool, what was distributed and carried, counted minutes and exclusions by reason.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorRewardsApi()
try {
    val result : ListCreatorRewardMonthsResponse = apiInstance.listCreatorRewardMonths()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorRewardsApi#listCreatorRewardMonths")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorRewardsApi#listCreatorRewardMonths")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListCreatorRewardMonthsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

