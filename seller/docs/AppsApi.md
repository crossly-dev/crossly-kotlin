# AppsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApp**](AppsApi.md#getApp) | **GET** /v1/apps/{clientId} | Get one listed app by client id or profile slug. 404 if it is not in the directory.
[**getAppEarning**](AppsApi.md#getAppEarning) | **GET** /v1/apps/{id}/earnings | Your OAuth app&#39;s revenue-share earnings: summary + ledger. Owner only.
[**getAppListingAllowance**](AppsApi.md#getAppListingAllowance) | **GET** /v1/apps/{id}/listing-allowance | Your OAuth app&#39;s listing allowance (read-only): whether staff let sellers list above their plan through it, its limitMode (separate pool or shared with the plan), limitPeriod (total or monthly), the per-seller limit and the platform scope. Owner only.
[**listApps**](AppsApi.md#listApps) | **GET** /v1/apps | Browse the public Crossly app directories: seller apps, buyer apps or both (search, category, sort, featured, paging).


<a name="getApp"></a>
# **getApp**
> ListAppsItem getApp(clientId)

Get one listed app by client id or profile slug. 404 if it is not in the directory.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppsApi()
val clientId : kotlin.String = clientId_example // kotlin.String | 
try {
    val result : ListAppsItem = apiInstance.getApp(clientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#getApp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#getApp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**|  |

### Return type

**ListAppsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppEarning"></a>
# **getAppEarning**
> GetAppEarningResponse getAppEarning(id)

Your OAuth app&#39;s revenue-share earnings: summary + ledger. Owner only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetAppEarningResponse = apiInstance.getAppEarning(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#getAppEarning")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#getAppEarning")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetAppEarningResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAppListingAllowance"></a>
# **getAppListingAllowance**
> GetAppListingAllowanceResponse getAppListingAllowance(id)

Your OAuth app&#39;s listing allowance (read-only): whether staff let sellers list above their plan through it, its limitMode (separate pool or shared with the plan), limitPeriod (total or monthly), the per-seller limit and the platform scope. Owner only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetAppListingAllowanceResponse = apiInstance.getAppListingAllowance(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#getAppListingAllowance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#getAppListingAllowance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetAppListingAllowanceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listApps"></a>
# **listApps**
> ListAppsResponse listApps(directory, sort, featured, category, q, limit, cursor)

Browse the public Crossly app directories: seller apps, buyer apps or both (search, category, sort, featured, paging).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppsApi()
val directory : kotlin.String = directory_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val featured : kotlin.String = featured_example // kotlin.String | 
val category : kotlin.String = category_example // kotlin.String | 
val q : kotlin.String = q_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
try {
    val result : ListAppsResponse = apiInstance.listApps(directory, sort, featured, category, q, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#listApps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#listApps")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directory** | **kotlin.String**|  | [optional] [enum: seller, buyer, all]
 **sort** | **kotlin.String**|  | [optional] [enum: popular, newest, verified]
 **featured** | **kotlin.String**|  | [optional] [enum: true, false]
 **category** | **kotlin.String**|  | [optional]
 **q** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **cursor** | **kotlin.String**|  | [optional]

### Return type

**ListAppsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

