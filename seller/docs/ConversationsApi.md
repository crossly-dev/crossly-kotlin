# ConversationsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConversationMessage**](ConversationsApi.md#createConversationMessage) | **POST** /v1/conversations/{id}/messages | Reply to the buyer, on the marketplace the conversation is on (Crossly marketplace: straight into the thread). The message is in the thread at once with deliveryStatus &#39;sending&#39;; it settles to &#39;sent&#39; or &#39;failed&#39;. reply_not_supported when the thread cannot take a reply (a no-reply sender, a platform with no reply wire).
[**listConversationMessages**](ConversationsApi.md#listConversationMessages) | **GET** /v1/conversations/{id}/messages | A conversation&#39;s messages, oldest first. sender is buyer | seller; a reply you sent shows deliveryStatus sending → sent | failed. since (ISO 8601): only messages sent at or after it.
[**listConversations**](ConversationsApi.md#listConversations) | **GET** /v1/conversations | List buyer conversations, newest activity first. orderId: the conversation(s) about that order (same platform, its listing, its buyer). listingId: about that listing. updatedSince (ISO 8601): only threads with activity at or after it, for polling. search: contains-match on the buyer username or the subject (case-insensitive). Pair with the message.received webhook.


<a name="createConversationMessage"></a>
# **createConversationMessage**
> CreateConversationMessageResponse createConversationMessage(id, createConversationMessageRequest)

Reply to the buyer, on the marketplace the conversation is on (Crossly marketplace: straight into the thread). The message is in the thread at once with deliveryStatus &#39;sending&#39;; it settles to &#39;sent&#39; or &#39;failed&#39;. reply_not_supported when the thread cannot take a reply (a no-reply sender, a platform with no reply wire).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ConversationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createConversationMessageRequest : CreateConversationMessageRequest =  // CreateConversationMessageRequest | 
try {
    val result : CreateConversationMessageResponse = apiInstance.createConversationMessage(id, createConversationMessageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#createConversationMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#createConversationMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **createConversationMessageRequest** | **CreateConversationMessageRequest**|  |

### Return type

**CreateConversationMessageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listConversationMessages"></a>
# **listConversationMessages**
> ListConversationMessagesResponse listConversationMessages(id, page, limit, since)

A conversation&#39;s messages, oldest first. sender is buyer | seller; a reply you sent shows deliveryStatus sending → sent | failed. since (ISO 8601): only messages sent at or after it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ConversationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
try {
    val result : ListConversationMessagesResponse = apiInstance.listConversationMessages(id, page, limit, since)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#listConversationMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#listConversationMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **page** | **kotlin.Int**|  | [optional] [default to 1]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **since** | **java.time.OffsetDateTime**|  | [optional]

### Return type

**ListConversationMessagesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listConversations"></a>
# **listConversations**
> ListConversationsResponse listConversations(page, limit, orderId, listingId, platform, updatedSince, search)

List buyer conversations, newest activity first. orderId: the conversation(s) about that order (same platform, its listing, its buyer). listingId: about that listing. updatedSince (ISO 8601): only threads with activity at or after it, for polling. search: contains-match on the buyer username or the subject (case-insensitive). Pair with the message.received webhook.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ConversationsApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val listingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val platform : kotlin.String = platform_example // kotlin.String | 
val updatedSince : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val search : kotlin.String = search_example // kotlin.String | Contains-match (case-insensitive) on the buyer username or the thread subject.
try {
    val result : ListConversationsResponse = apiInstance.listConversations(page, limit, orderId, listingId, platform, updatedSince, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#listConversations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#listConversations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional] [default to 1]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]
 **orderId** | **java.util.UUID**|  | [optional]
 **listingId** | **java.util.UUID**|  | [optional]
 **platform** | **kotlin.String**|  | [optional]
 **updatedSince** | **java.time.OffsetDateTime**|  | [optional]
 **search** | **kotlin.String**| Contains-match (case-insensitive) on the buyer username or the thread subject. | [optional]

### Return type

**ListConversationsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

