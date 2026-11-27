# WorldsAdsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorldExperienceAd**](WorldsAdsApi.md#getWorldExperienceAd) | **GET** /v1/worlds/experiences/{experienceId}/ads | The ads for a game&#39;s in-world ad surfaces (parts tagged CrosslyAdSurface), for the token&#39;s owner: Sponsored Listings labelled \&quot;Ad\&quot;, served only to signed-in adults where the game&#39;s creator turned ads on, never to its team. A click is POST /api/public/shop/ads/click { token }.
[**getWorldExperienceAdReport**](WorldsAdsApi.md#getWorldExperienceAdReport) | **GET** /v1/worlds/experiences/{experienceId}/ads/report | In-game ads over the last N days (default 30, max 90): impressions, clicks, charged clicks, advertiser spend and your earned share, per day.
[**getWorldExperienceAdSetting**](WorldsAdsApi.md#getWorldExperienceAdSetting) | **GET** /v1/worlds/experiences/{experienceId}/ad-settings | Whether this game shows in-game ads (opt-in, default off) and the creator&#39;s share of Crossly&#39;s ad revenue in force.
[**updateWorldExperienceAdSetting**](WorldsAdsApi.md#updateWorldExperienceAdSetting) | **PUT** /v1/worlds/experiences/{experienceId}/ad-settings | Turn in-game ads on or off for this game. Ads fill the game&#39;s ad surfaces (parts tagged CrosslyAdSurface); nothing shows until it has one.


<a name="getWorldExperienceAd"></a>
# **getWorldExperienceAd**
> GetWorldExperienceAdResponse getWorldExperienceAd(experienceId)

The ads for a game&#39;s in-world ad surfaces (parts tagged CrosslyAdSurface), for the token&#39;s owner: Sponsored Listings labelled \&quot;Ad\&quot;, served only to signed-in adults where the game&#39;s creator turned ads on, never to its team. A click is POST /api/public/shop/ads/click { token }.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsAdsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceAdResponse = apiInstance.getWorldExperienceAd(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsAdsApi#getWorldExperienceAd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsAdsApi#getWorldExperienceAd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceAdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceAdReport"></a>
# **getWorldExperienceAdReport**
> GetWorldExperienceAdReportResponse getWorldExperienceAdReport(experienceId)

In-game ads over the last N days (default 30, max 90): impressions, clicks, charged clicks, advertiser spend and your earned share, per day.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsAdsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceAdReportResponse = apiInstance.getWorldExperienceAdReport(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsAdsApi#getWorldExperienceAdReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsAdsApi#getWorldExperienceAdReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceAdReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceAdSetting"></a>
# **getWorldExperienceAdSetting**
> GetWorldExperienceAdSettingResponse getWorldExperienceAdSetting(experienceId)

Whether this game shows in-game ads (opt-in, default off) and the creator&#39;s share of Crossly&#39;s ad revenue in force.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsAdsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceAdSettingResponse = apiInstance.getWorldExperienceAdSetting(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsAdsApi#getWorldExperienceAdSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsAdsApi#getWorldExperienceAdSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceAdSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceAdSetting"></a>
# **updateWorldExperienceAdSetting**
> GetWorldExperienceAdSettingResponse updateWorldExperienceAdSetting(experienceId)

Turn in-game ads on or off for this game. Ads fill the game&#39;s ad surfaces (parts tagged CrosslyAdSurface); nothing shows until it has one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsAdsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceAdSettingResponse = apiInstance.updateWorldExperienceAdSetting(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsAdsApi#updateWorldExperienceAdSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsAdsApi#updateWorldExperienceAdSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceAdSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

