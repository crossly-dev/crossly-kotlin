# SavedViewsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSavedView**](SavedViewsApi.md#createSavedView) | **POST** /v1/saved-views | Create a saved view preset.
[**deleteSavedView**](SavedViewsApi.md#deleteSavedView) | **DELETE** /v1/saved-views/{id} | Delete a saved view preset.
[**listSavedViews**](SavedViewsApi.md#listSavedViews) | **GET** /v1/saved-views | List the seller&#39;s saved view presets.
[**updateSavedView**](SavedViewsApi.md#updateSavedView) | **PATCH** /v1/saved-views/{id} | Update a saved view preset.


<a name="createSavedView"></a>
# **createSavedView**
> CreateSavedViewResponse createSavedView()

Create a saved view preset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SavedViewsApi()
try {
    val result : CreateSavedViewResponse = apiInstance.createSavedView()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SavedViewsApi#createSavedView")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SavedViewsApi#createSavedView")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateSavedViewResponse**](CreateSavedViewResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSavedView"></a>
# **deleteSavedView**
> DeleteSavedViewResponse deleteSavedView(id)

Delete a saved view preset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SavedViewsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteSavedViewResponse = apiInstance.deleteSavedView(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SavedViewsApi#deleteSavedView")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SavedViewsApi#deleteSavedView")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**DeleteSavedViewResponse**](DeleteSavedViewResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSavedViews"></a>
# **listSavedViews**
> V1List listSavedViews(resource)

List the seller&#39;s saved view presets.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SavedViewsApi()
val resource : kotlin.String = resource_example // kotlin.String | 
try {
    val result : V1List = apiInstance.listSavedViews(resource)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SavedViewsApi#listSavedViews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SavedViewsApi#listSavedViews")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **kotlin.String**|  | [optional]

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSavedView"></a>
# **updateSavedView**
> UpdateSavedViewResponse updateSavedView(id)

Update a saved view preset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SavedViewsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateSavedViewResponse = apiInstance.updateSavedView(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SavedViewsApi#updateSavedView")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SavedViewsApi#updateSavedView")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdateSavedViewResponse**](UpdateSavedViewResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

