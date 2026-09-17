# RestockPromptsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRestockPromptDismiss**](RestockPromptsApi.md#createRestockPromptDismiss) | **POST** /v1/restock-prompts/{id}/dismiss | Dismiss a pending restock prompt.
[**createRestockPromptRepublish**](RestockPromptsApi.md#createRestockPromptRepublish) | **POST** /v1/restock-prompts/{id}/republish | Republish a restock prompt to platforms.
[**listRestockPrompts**](RestockPromptsApi.md#listRestockPrompts) | **GET** /v1/restock-prompts | List pending restock prompts.


<a name="createRestockPromptDismiss"></a>
# **createRestockPromptDismiss**
> CreateRestockPromptDismissResponse createRestockPromptDismiss(id)

Dismiss a pending restock prompt.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = RestockPromptsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateRestockPromptDismissResponse = apiInstance.createRestockPromptDismiss(id)
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

[**CreateRestockPromptDismissResponse**](CreateRestockPromptDismissResponse.md)

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

[**CreateRestockPromptRepublishResponse**](CreateRestockPromptRepublishResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRestockPrompts"></a>
# **listRestockPrompts**
> V1List listRestockPrompts()

List pending restock prompts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = RestockPromptsApi()
try {
    val result : V1List = apiInstance.listRestockPrompts()
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

