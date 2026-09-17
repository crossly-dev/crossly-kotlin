# WebhooksApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /v1/webhooks | Register a webhook endpoint (returns the signing secret once).
[**createWebhookTest**](WebhooksApi.md#createWebhookTest) | **POST** /v1/webhooks/{id}/test | Fire a synthetic test.ping delivery to one webhook.
[**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /v1/webhooks/{id} | Delete a webhook endpoint.
[**getWebhookStream**](WebhooksApi.md#getWebhookStream) | **GET** /v1/webhooks/stream | Stream this account&#39;s webhook events as they happen (SSE).
[**listWebhooks**](WebhooksApi.md#listWebhooks) | **GET** /v1/webhooks | List your registered webhook endpoints.


<a name="createWebhook"></a>
# **createWebhook**
> CreateWebhookResponse createWebhook()

Register a webhook endpoint (returns the signing secret once).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WebhooksApi()
try {
    val result : CreateWebhookResponse = apiInstance.createWebhook()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#createWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#createWebhook")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateWebhookResponse**](CreateWebhookResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWebhookTest"></a>
# **createWebhookTest**
> CreateWebhookTestResponse createWebhookTest(id)

Fire a synthetic test.ping delivery to one webhook.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WebhooksApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateWebhookTestResponse = apiInstance.createWebhookTest(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#createWebhookTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#createWebhookTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateWebhookTestResponse**](CreateWebhookTestResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWebhook"></a>
# **deleteWebhook**
> DeleteWebhookResponse deleteWebhook(id)

Delete a webhook endpoint.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WebhooksApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteWebhookResponse = apiInstance.deleteWebhook(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**DeleteWebhookResponse**](DeleteWebhookResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhookStream"></a>
# **getWebhookStream**
> kotlin.String getWebhookStream()

Stream this account&#39;s webhook events as they happen (SSE).

A long-lived text/event-stream. Each event is one &#x60;data:&#x60; line of JSON: {eventName, eventId, createdAt, payload}. Used by &#x60;crossly dev&#x60; to forward live events to a local URL without exposing the machine to the internet. Does not replay history — you see what happens from the moment you connect.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WebhooksApi()
try {
    val result : kotlin.String = apiInstance.getWebhookStream()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhookStream")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhookStream")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWebhooks"></a>
# **listWebhooks**
> V1List listWebhooks()

List your registered webhook endpoints.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WebhooksApi()
try {
    val result : V1List = apiInstance.listWebhooks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#listWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#listWebhooks")
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

