# BuyerAgentApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerAgentSession**](BuyerAgentApi.md#createBuyerAgentSession) | **POST** /v1/buyer/agent/sessions | Start a shopping agent conversation.
[**createBuyerAgentSessionAct**](BuyerAgentApi.md#createBuyerAgentSessionAct) | **POST** /v1/buyer/agent/sessions/{id}/act | Act on an option: save, cart, alert, registry, price (real-sales check), offer (prepare / confirm), or buy (quote — complete with POST /api/v1/buyer/checkout). Needs the action’s own scope too.
[**createBuyerAgentSessionReact**](BuyerAgentApi.md#createBuyerAgentSessionReact) | **POST** /v1/buyer/agent/sessions/{id}/react | Like or dislike an option; the next search leans toward likes and drops dislikes.
[**createBuyerAgentSessionTurn**](BuyerAgentApi.md#createBuyerAgentSessionTurn) | **POST** /v1/buyer/agent/sessions/{id}/turns | Say something to the agent: what you want, a critique of the options (\&quot;cheaper\&quot;, \&quot;more like #2\&quot;), or send a photo (imageBase64) to find things like it. Returns its reply and the new numbered options.
[**deleteBuyerAgentSession**](BuyerAgentApi.md#deleteBuyerAgentSession) | **DELETE** /v1/buyer/agent/sessions/{id} | Delete a conversation.
[**getBuyerAgentSession**](BuyerAgentApi.md#getBuyerAgentSession) | **GET** /v1/buyer/agent/sessions/{id} | A conversation: its brief and turns, with each turn’s options re-read live.
[**listBuyerAgentSessions**](BuyerAgentApi.md#listBuyerAgentSessions) | **GET** /v1/buyer/agent/sessions | Your shopping agent conversations, newest first.


<a name="createBuyerAgentSession"></a>
# **createBuyerAgentSession**
> CreateBuyerAgentSessionResponse createBuyerAgentSession()

Start a shopping agent conversation.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerAgentApi()
try {
    val result : CreateBuyerAgentSessionResponse = apiInstance.createBuyerAgentSession()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerAgentApi#createBuyerAgentSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerAgentApi#createBuyerAgentSession")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBuyerAgentSessionResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerAgentSessionAct"></a>
# **createBuyerAgentSessionAct**
> CreateBuyerAgentSessionActResponse createBuyerAgentSessionAct(id)

Act on an option: save, cart, alert, registry, price (real-sales check), offer (prepare / confirm), or buy (quote — complete with POST /api/v1/buyer/checkout). Needs the action’s own scope too.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerAgentApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerAgentSessionActResponse = apiInstance.createBuyerAgentSessionAct(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerAgentApi#createBuyerAgentSessionAct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerAgentApi#createBuyerAgentSessionAct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerAgentSessionActResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerAgentSessionReact"></a>
# **createBuyerAgentSessionReact**
> DeleteBuyerAgentSessionResponse createBuyerAgentSessionReact(id)

Like or dislike an option; the next search leans toward likes and drops dislikes.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerAgentApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteBuyerAgentSessionResponse = apiInstance.createBuyerAgentSessionReact(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerAgentApi#createBuyerAgentSessionReact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerAgentApi#createBuyerAgentSessionReact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteBuyerAgentSessionResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerAgentSessionTurn"></a>
# **createBuyerAgentSessionTurn**
> CreateBuyerAgentSessionTurnResponse createBuyerAgentSessionTurn(id)

Say something to the agent: what you want, a critique of the options (\&quot;cheaper\&quot;, \&quot;more like #2\&quot;), or send a photo (imageBase64) to find things like it. Returns its reply and the new numbered options.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerAgentApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerAgentSessionTurnResponse = apiInstance.createBuyerAgentSessionTurn(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerAgentApi#createBuyerAgentSessionTurn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerAgentApi#createBuyerAgentSessionTurn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerAgentSessionTurnResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerAgentSession"></a>
# **deleteBuyerAgentSession**
> DeleteBuyerAgentSessionResponse deleteBuyerAgentSession(id)

Delete a conversation.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerAgentApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteBuyerAgentSessionResponse = apiInstance.deleteBuyerAgentSession(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerAgentApi#deleteBuyerAgentSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerAgentApi#deleteBuyerAgentSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteBuyerAgentSessionResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerAgentSession"></a>
# **getBuyerAgentSession**
> GetBuyerAgentSessionResponse getBuyerAgentSession(id)

A conversation: its brief and turns, with each turn’s options re-read live.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerAgentApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBuyerAgentSessionResponse = apiInstance.getBuyerAgentSession(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerAgentApi#getBuyerAgentSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerAgentApi#getBuyerAgentSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBuyerAgentSessionResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerAgentSessions"></a>
# **listBuyerAgentSessions**
> ListBuyerAgentSessionsResponse listBuyerAgentSessions()

Your shopping agent conversations, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerAgentApi()
try {
    val result : ListBuyerAgentSessionsResponse = apiInstance.listBuyerAgentSessions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerAgentApi#listBuyerAgentSessions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerAgentApi#listBuyerAgentSessions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerAgentSessionsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

