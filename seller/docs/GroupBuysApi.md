# GroupBuysApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroupBuy**](GroupBuysApi.md#createGroupBuy) | **POST** /v1/group-buys | Run a group buy on a listing with stock: price tiers by committed quantity, a goal and minimum to proceed, a per-buyer max, a deadline, authorize-now or pay-now-refund-the-difference, a goal-miss policy (cancel, proceed, extend once), visibility, placement and share copy. The original body (tiers by buyer count, minBuyers, days) is still accepted.
[**createGroupBuyCancel**](GroupBuysApi.md#createGroupBuyCancel) | **POST** /v1/group-buys/{id}/cancel | Cancel a group buy: every hold is released and every charge refunded.
[**createGroupBuyClose**](GroupBuysApi.md#createGroupBuyClose) | **POST** /v1/group-buys/{id}/close | Close a group buy now: every buyer pays the price reached (the minimum and goal-miss policy still apply).
[**createGroupBuyExtend**](GroupBuysApi.md#createGroupBuyExtend) | **POST** /v1/group-buys/{id}/extend | Move the deadline later by N days (authorize-now pools run at most 6 days, pay-now pools 30).
[**createGroupBuyMessage**](GroupBuysApi.md#createGroupBuyMessage) | **POST** /v1/group-buys/{id}/message | Send a notification to every buyer committed to the group buy.
[**getGroupBuy**](GroupBuysApi.md#getGroupBuy) | **GET** /v1/group-buys/{id} | One group buy: progress towards each tier, committed buyers (masked), time left, revenue at the current tier and the activity feed.
[**getGroupBuyParticipantsCsv**](GroupBuysApi.md#getGroupBuyParticipantsCsv) | **GET** /v1/group-buys/{id}/participants.csv | Every participant of a group buy as CSV: quantity, status, amounts and ship-to.
[**listGroupBuys**](GroupBuysApi.md#listGroupBuys) | **GET** /v1/group-buys | Your group buys, open ones first: tiers, buyers joined, the price reached and when it ends.
[**updateGroupBuy**](GroupBuysApi.md#updateGroupBuy) | **PATCH** /v1/group-buys/{id} | Edit a group buy. Copy, visibility, placement and the per-buyer max change any time; tiers, goal, minimum, payment mode and goal-miss policy only before anyone commits.


<a name="createGroupBuy"></a>
# **createGroupBuy**
> CreateBreakResponse createGroupBuy()

Run a group buy on a listing with stock: price tiers by committed quantity, a goal and minimum to proceed, a per-buyer max, a deadline, authorize-now or pay-now-refund-the-difference, a goal-miss policy (cancel, proceed, extend once), visibility, placement and share copy. The original body (tiers by buyer count, minBuyers, days) is still accepted.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GroupBuysApi()
try {
    val result : CreateBreakResponse = apiInstance.createGroupBuy()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupBuysApi#createGroupBuy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupBuysApi#createGroupBuy")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBreakResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGroupBuyCancel"></a>
# **createGroupBuyCancel**
> CreateGroupBuyCancelResponse createGroupBuyCancel(id)

Cancel a group buy: every hold is released and every charge refunded.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GroupBuysApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateGroupBuyCancelResponse = apiInstance.createGroupBuyCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupBuysApi#createGroupBuyCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupBuysApi#createGroupBuyCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateGroupBuyCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGroupBuyClose"></a>
# **createGroupBuyClose**
> CreateGroupBuyCloseResponse createGroupBuyClose(id)

Close a group buy now: every buyer pays the price reached (the minimum and goal-miss policy still apply).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GroupBuysApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateGroupBuyCloseResponse = apiInstance.createGroupBuyClose(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupBuysApi#createGroupBuyClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupBuysApi#createGroupBuyClose")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateGroupBuyCloseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGroupBuyExtend"></a>
# **createGroupBuyExtend**
> CreateGroupBuyExtendResponse createGroupBuyExtend(id)

Move the deadline later by N days (authorize-now pools run at most 6 days, pay-now pools 30).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GroupBuysApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateGroupBuyExtendResponse = apiInstance.createGroupBuyExtend(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupBuysApi#createGroupBuyExtend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupBuysApi#createGroupBuyExtend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateGroupBuyExtendResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGroupBuyMessage"></a>
# **createGroupBuyMessage**
> CreateGroupBuyMessageResponse createGroupBuyMessage(id)

Send a notification to every buyer committed to the group buy.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GroupBuysApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateGroupBuyMessageResponse = apiInstance.createGroupBuyMessage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupBuysApi#createGroupBuyMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupBuysApi#createGroupBuyMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateGroupBuyMessageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupBuy"></a>
# **getGroupBuy**
> GetGroupBuyResponse getGroupBuy(id)

One group buy: progress towards each tier, committed buyers (masked), time left, revenue at the current tier and the activity feed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GroupBuysApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetGroupBuyResponse = apiInstance.getGroupBuy(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupBuysApi#getGroupBuy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupBuysApi#getGroupBuy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetGroupBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupBuyParticipantsCsv"></a>
# **getGroupBuyParticipantsCsv**
> kotlin.String getGroupBuyParticipantsCsv(id)

Every participant of a group buy as CSV: quantity, status, amounts and ship-to.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GroupBuysApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getGroupBuyParticipantsCsv(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupBuysApi#getGroupBuyParticipantsCsv")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupBuysApi#getGroupBuyParticipantsCsv")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listGroupBuys"></a>
# **listGroupBuys**
> ListGroupBuysResponse listGroupBuys()

Your group buys, open ones first: tiers, buyers joined, the price reached and when it ends.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GroupBuysApi()
try {
    val result : ListGroupBuysResponse = apiInstance.listGroupBuys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupBuysApi#listGroupBuys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupBuysApi#listGroupBuys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListGroupBuysResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGroupBuy"></a>
# **updateGroupBuy**
> UpdateGroupBuyResponse updateGroupBuy(id)

Edit a group buy. Copy, visibility, placement and the per-buyer max change any time; tiers, goal, minimum, payment mode and goal-miss policy only before anyone commits.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = GroupBuysApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.updateGroupBuy(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupBuysApi#updateGroupBuy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupBuysApi#updateGroupBuy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

