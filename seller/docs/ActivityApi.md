# ActivityApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActionLog**](ActivityApi.md#getActionLog) | **GET** /v1/action-log/{id} | Get one action-log event by id (ownership-checked).
[**getActionLogFacet**](ActivityApi.md#getActionLogFacet) | **GET** /v1/action-log/facets | Distinct platforms / actions / categories present in the caller&#39;s action log (last 90 days) — powers filter dropdowns before you query.
[**listActionLog**](ActivityApi.md#listActionLog) | **GET** /v1/action-log | List action-log events — the semantic \&quot;what happened\&quot; record of every user + platform action. Filter by platform / action / category / status / source / target, and a since/until created_at window.
[**listActionLogCalls**](ActivityApi.md#listActionLogCalls) | **GET** /v1/action-log/{id}/calls | The outbound platform HTTP calls under an event (oldest first) — url, method, status, latency, redacted request/response bodies, proxy + recipe/hash. Answers \&quot;what was sent / what went wrong\&quot;.


<a name="getActionLog"></a>
# **getActionLog**
> GetActionLogResponse getActionLog(id)

Get one action-log event by id (ownership-checked).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetActionLogResponse = apiInstance.getActionLog(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#getActionLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#getActionLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetActionLogResponse**](GetActionLogResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionLogFacet"></a>
# **getActionLogFacet**
> GetActionLogFacetResponse getActionLogFacet()

Distinct platforms / actions / categories present in the caller&#39;s action log (last 90 days) — powers filter dropdowns before you query.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
try {
    val result : GetActionLogFacetResponse = apiInstance.getActionLogFacet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#getActionLogFacet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#getActionLogFacet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetActionLogFacetResponse**](GetActionLogFacetResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listActionLog"></a>
# **listActionLog**
> V1List listActionLog(platform, action, category, status, source, targetType, targetId, since, until, limit, offset)

List action-log events — the semantic \&quot;what happened\&quot; record of every user + platform action. Filter by platform / action / category / status / source / target, and a since/until created_at window.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val action : kotlin.String = action_example // kotlin.String | 
val category : kotlin.String = category_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
val source : kotlin.String = source_example // kotlin.String | 
val targetType : kotlin.String = targetType_example // kotlin.String | 
val targetId : kotlin.String = targetId_example // kotlin.String | 
val since : kotlin.String = since_example // kotlin.String | ISO lower bound (inclusive) on created_at.
val until : kotlin.String = until_example // kotlin.String | ISO upper bound (exclusive) on created_at.
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : V1List = apiInstance.listActionLog(platform, action, category, status, source, targetType, targetId, since, until, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#listActionLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#listActionLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  | [optional]
 **action** | **kotlin.String**|  | [optional]
 **category** | **kotlin.String**|  | [optional]
 **status** | **kotlin.String**|  | [optional]
 **source** | **kotlin.String**|  | [optional]
 **targetType** | **kotlin.String**|  | [optional]
 **targetId** | **kotlin.String**|  | [optional]
 **since** | **kotlin.String**| ISO lower bound (inclusive) on created_at. | [optional]
 **until** | **kotlin.String**| ISO upper bound (exclusive) on created_at. | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **offset** | **kotlin.Int**|  | [optional] [default to 0]

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listActionLogCalls"></a>
# **listActionLogCalls**
> V1List listActionLogCalls(id)

The outbound platform HTTP calls under an event (oldest first) — url, method, status, latency, redacted request/response bodies, proxy + recipe/hash. Answers \&quot;what was sent / what went wrong\&quot;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : V1List = apiInstance.listActionLogCalls(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#listActionLogCalls")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#listActionLogCalls")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

