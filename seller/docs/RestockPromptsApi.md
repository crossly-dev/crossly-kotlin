# RestockPromptsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRestockPromptDismiss**](RestockPromptsApi.md#createRestockPromptDismiss) | **POST** /v1/restock-prompts/{id}/dismiss | Dismiss a pending restock prompt.
[**createRestockPromptRepublish**](RestockPromptsApi.md#createRestockPromptRepublish) | **POST** /v1/restock-prompts/{id}/republish | Republish a restock prompt to platforms.
[**getRestockPromptSetting**](RestockPromptsApi.md#getRestockPromptSetting) | **GET** /v1/restock-prompts/settings | Whether restocked items are republished automatically.
[**listRestockPrompts**](RestockPromptsApi.md#listRestockPrompts) | **GET** /v1/restock-prompts | List pending restock prompts.
[**updateRestockPromptSetting**](RestockPromptsApi.md#updateRestockPromptSetting) | **PUT** /v1/restock-prompts/settings | Turn automatic republish of restocked items on or off.


<a name="createRestockPromptDismiss"></a>
# **createRestockPromptDismiss**
> OkResponse createRestockPromptDismiss(id)

Dismiss a pending restock prompt.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = RestockPromptsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.createRestockPromptDismiss(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RestockPromptsApi#createRestockPromptDismiss")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RestockPromptsApi#createRestockPromptDismiss")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRestockPromptRepublish"></a>
# **createRestockPromptRepublish**
> CreateRestockPromptRepublishResponse createRestockPromptRepublish(id)

Republish a restock prompt to platforms.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = RestockPromptsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateRestockPromptRepublishResponse = apiInstance.createRestockPromptRepublish(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RestockPromptsApi#createRestockPromptRepublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RestockPromptsApi#createRestockPromptRepublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateRestockPromptRepublishResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRestockPromptSetting"></a>
# **getRestockPromptSetting**
> GetRestockPromptSettingResponse getRestockPromptSetting()

Whether restocked items are republished automatically.

autoRepublish (default true): when an item that sold out comes back in stock, Crossly republishes it to the marketplaces it came off without asking. False: a restock prompt is raised instead. A listing the seller ended by hand is never republished automatically.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = RestockPromptsApi()
try {
    val result : GetRestockPromptSettingResponse = apiInstance.getRestockPromptSetting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RestockPromptsApi#getRestockPromptSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RestockPromptsApi#getRestockPromptSetting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetRestockPromptSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRestockPrompts"></a>
# **listRestockPrompts**
> ListRestockPromptsResponse listRestockPrompts()

List pending restock prompts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = RestockPromptsApi()
try {
    val result : ListRestockPromptsResponse = apiInstance.listRestockPrompts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RestockPromptsApi#listRestockPrompts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RestockPromptsApi#listRestockPrompts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListRestockPromptsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRestockPromptSetting"></a>
# **updateRestockPromptSetting**
> GetRestockPromptSettingResponse updateRestockPromptSetting(getRestockPromptSettingResponse)

Turn automatic republish of restocked items on or off.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = RestockPromptsApi()
val getRestockPromptSettingResponse : GetRestockPromptSettingResponse =  // GetRestockPromptSettingResponse | 
try {
    val result : GetRestockPromptSettingResponse = apiInstance.updateRestockPromptSetting(getRestockPromptSettingResponse)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RestockPromptsApi#updateRestockPromptSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RestockPromptsApi#updateRestockPromptSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getRestockPromptSettingResponse** | **GetRestockPromptSettingResponse**|  |

### Return type

**GetRestockPromptSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

