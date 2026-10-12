# IntegrationsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNotificationIntegration**](IntegrationsApi.md#createNotificationIntegration) | **POST** /v1/notification-integrations | Add a Slack/Discord/Webhook destination.
[**createNotificationIntegrationTest**](IntegrationsApi.md#createNotificationIntegrationTest) | **POST** /v1/notification-integrations/{id}/test | Fire a canned test message to a notification destination.
[**deleteNotificationIntegration**](IntegrationsApi.md#deleteNotificationIntegration) | **DELETE** /v1/notification-integrations/{id} | Delete a notification destination.
[**listNotificationIntegrations**](IntegrationsApi.md#listNotificationIntegrations) | **GET** /v1/notification-integrations | List Slack/Discord/Webhook destinations for notify.* automation actions.
[**updateNotificationIntegration**](IntegrationsApi.md#updateNotificationIntegration) | **PATCH** /v1/notification-integrations/{id} | Edit a notification destination.


<a name="createNotificationIntegration"></a>
# **createNotificationIntegration**
> IdResponse createNotificationIntegration()

Add a Slack/Discord/Webhook destination.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = IntegrationsApi()
try {
    val result : IdResponse = apiInstance.createNotificationIntegration()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#createNotificationIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#createNotificationIntegration")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**IdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNotificationIntegrationTest"></a>
# **createNotificationIntegrationTest**
> CreateNotificationIntegrationTestResponse createNotificationIntegrationTest(id)

Fire a canned test message to a notification destination.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = IntegrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateNotificationIntegrationTestResponse = apiInstance.createNotificationIntegrationTest(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#createNotificationIntegrationTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#createNotificationIntegrationTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateNotificationIntegrationTestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNotificationIntegration"></a>
# **deleteNotificationIntegration**
> OkResponse deleteNotificationIntegration(id)

Delete a notification destination.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = IntegrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteNotificationIntegration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#deleteNotificationIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#deleteNotificationIntegration")
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

<a name="listNotificationIntegrations"></a>
# **listNotificationIntegrations**
> ListNotificationIntegrationsResponse listNotificationIntegrations()

List Slack/Discord/Webhook destinations for notify.* automation actions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = IntegrationsApi()
try {
    val result : ListNotificationIntegrationsResponse = apiInstance.listNotificationIntegrations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#listNotificationIntegrations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#listNotificationIntegrations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListNotificationIntegrationsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNotificationIntegration"></a>
# **updateNotificationIntegration**
> OkResponse updateNotificationIntegration(id)

Edit a notification destination.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = IntegrationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.updateNotificationIntegration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationsApi#updateNotificationIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationsApi#updateNotificationIntegration")
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

