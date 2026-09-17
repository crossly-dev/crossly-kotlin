# InboxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInboxAiSuggest**](InboxApi.md#createInboxAiSuggest) | **POST** /v1/inbox/ai-suggest | AI reply suggestion for a conversation.
[**createInboxCannedRespons**](InboxApi.md#createInboxCannedRespons) | **POST** /v1/inbox/canned-responses | Create a canned response.
[**createInboxConversationBulk**](InboxApi.md#createInboxConversationBulk) | **POST** /v1/inbox/conversations/bulk | Bulk mark read / mark unread / soft-delete conversations.
[**createInboxConversationBulkAiRespond**](InboxApi.md#createInboxConversationBulkAiRespond) | **POST** /v1/inbox/conversations/bulk-ai-respond | AI reply suggestion for multiple conversations — draft or send.
[**createInboxConversationOfferAction**](InboxApi.md#createInboxConversationOfferAction) | **POST** /v1/inbox/conversations/{id}/offer-action | Accept / counter / decline an active offer on a conversation.
[**createInboxMessageTriage**](InboxApi.md#createInboxMessageTriage) | **POST** /v1/inbox/messages/{id}/triage | Manually re-triage a buyer message.
[**createInboxOffer**](InboxApi.md#createInboxOffer) | **POST** /v1/inbox/{id}/offer | Accept, counter, or decline an offer on a conversation.
[**createInboxReply**](InboxApi.md#createInboxReply) | **POST** /v1/inbox/{id}/reply | Send a reply to a conversation thread.
[**deleteInboxCannedRespons**](InboxApi.md#deleteInboxCannedRespons) | **DELETE** /v1/inbox/canned-responses/{id} | Delete a canned response.
[**getInbox**](InboxApi.md#getInbox) | **GET** /v1/inbox/{id} | Get one conversation with its messages.
[**getInboxCannedRespons**](InboxApi.md#getInboxCannedRespons) | **GET** /v1/inbox/canned-responses | List canned responses.
[**getInboxConversationMessage**](InboxApi.md#getInboxConversationMessage) | **GET** /v1/inbox/conversations/{id}/messages | Paginated messages for a conversation.
[**getInboxConversationUnreadCount**](InboxApi.md#getInboxConversationUnreadCount) | **GET** /v1/inbox/conversations/unread-count | Sidebar badge: unread conversation count.
[**listInbox**](InboxApi.md#listInbox) | **GET** /v1/inbox | List conversations.
[**updateInboxCannedRespons**](InboxApi.md#updateInboxCannedRespons) | **PUT** /v1/inbox/canned-responses/{id} | Update a canned response.
[**updateInboxConversation**](InboxApi.md#updateInboxConversation) | **PATCH** /v1/inbox/conversations/{id} | Mark read / change status / close conversation.


<a name="createInboxAiSuggest"></a>
# **createInboxAiSuggest**
> CreateInboxAiSuggestResponse createInboxAiSuggest()

AI reply suggestion for a conversation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : CreateInboxAiSuggestResponse = apiInstance.createInboxAiSuggest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createInboxAiSuggest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createInboxAiSuggest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateInboxAiSuggestResponse**](CreateInboxAiSuggestResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInboxCannedRespons"></a>
# **createInboxCannedRespons**
> CreateInboxCannedResponsResponse createInboxCannedRespons()

Create a canned response.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : CreateInboxCannedResponsResponse = apiInstance.createInboxCannedRespons()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createInboxCannedRespons")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createInboxCannedRespons")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateInboxCannedResponsResponse**](CreateInboxCannedResponsResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInboxConversationBulk"></a>
# **createInboxConversationBulk**
> CreateInboxConversationBulkResponse createInboxConversationBulk()

Bulk mark read / mark unread / soft-delete conversations.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : CreateInboxConversationBulkResponse = apiInstance.createInboxConversationBulk()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createInboxConversationBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createInboxConversationBulk")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateInboxConversationBulkResponse**](CreateInboxConversationBulkResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInboxConversationBulkAiRespond"></a>
# **createInboxConversationBulkAiRespond**
> CreateInboxConversationBulkAiRespondResponse createInboxConversationBulkAiRespond()

AI reply suggestion for multiple conversations — draft or send.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : CreateInboxConversationBulkAiRespondResponse = apiInstance.createInboxConversationBulkAiRespond()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createInboxConversationBulkAiRespond")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createInboxConversationBulkAiRespond")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateInboxConversationBulkAiRespondResponse**](CreateInboxConversationBulkAiRespondResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInboxConversationOfferAction"></a>
# **createInboxConversationOfferAction**
> CreateInboxConversationOfferActionResponse createInboxConversationOfferAction(id)

Accept / counter / decline an active offer on a conversation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateInboxConversationOfferActionResponse = apiInstance.createInboxConversationOfferAction(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createInboxConversationOfferAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createInboxConversationOfferAction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateInboxConversationOfferActionResponse**](CreateInboxConversationOfferActionResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInboxMessageTriage"></a>
# **createInboxMessageTriage**
> CreateInboxMessageTriageResponse createInboxMessageTriage(id)

Manually re-triage a buyer message.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateInboxMessageTriageResponse = apiInstance.createInboxMessageTriage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createInboxMessageTriage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createInboxMessageTriage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateInboxMessageTriageResponse**](CreateInboxMessageTriageResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInboxOffer"></a>
# **createInboxOffer**
> CreateInboxOfferResponse createInboxOffer(id)

Accept, counter, or decline an offer on a conversation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateInboxOfferResponse = apiInstance.createInboxOffer(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createInboxOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createInboxOffer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateInboxOfferResponse**](CreateInboxOfferResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInboxReply"></a>
# **createInboxReply**
> CreateInboxReplyResponse createInboxReply(id)

Send a reply to a conversation thread.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateInboxReplyResponse = apiInstance.createInboxReply(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createInboxReply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createInboxReply")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateInboxReplyResponse**](CreateInboxReplyResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInboxCannedRespons"></a>
# **deleteInboxCannedRespons**
> DeleteInboxCannedResponsResponse deleteInboxCannedRespons(id)

Delete a canned response.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteInboxCannedResponsResponse = apiInstance.deleteInboxCannedRespons(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#deleteInboxCannedRespons")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#deleteInboxCannedRespons")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**DeleteInboxCannedResponsResponse**](DeleteInboxCannedResponsResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInbox"></a>
# **getInbox**
> GetInboxResponse getInbox(id)

Get one conversation with its messages.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetInboxResponse = apiInstance.getInbox(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetInboxResponse**](GetInboxResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInboxCannedRespons"></a>
# **getInboxCannedRespons**
> GetInboxCannedResponsResponse getInboxCannedRespons()

List canned responses.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : GetInboxCannedResponsResponse = apiInstance.getInboxCannedRespons()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getInboxCannedRespons")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getInboxCannedRespons")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetInboxCannedResponsResponse**](GetInboxCannedResponsResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInboxConversationMessage"></a>
# **getInboxConversationMessage**
> GetInboxConversationMessageResponse getInboxConversationMessage(id)

Paginated messages for a conversation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetInboxConversationMessageResponse = apiInstance.getInboxConversationMessage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getInboxConversationMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getInboxConversationMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetInboxConversationMessageResponse**](GetInboxConversationMessageResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInboxConversationUnreadCount"></a>
# **getInboxConversationUnreadCount**
> GetInboxConversationUnreadCountResponse getInboxConversationUnreadCount()

Sidebar badge: unread conversation count.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : GetInboxConversationUnreadCountResponse = apiInstance.getInboxConversationUnreadCount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getInboxConversationUnreadCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getInboxConversationUnreadCount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetInboxConversationUnreadCountResponse**](GetInboxConversationUnreadCountResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInbox"></a>
# **listInbox**
> V1List listInbox(page, limit)

List conversations.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : V1List = apiInstance.listInbox(page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#listInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#listInbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional] [default to 1]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInboxCannedRespons"></a>
# **updateInboxCannedRespons**
> UpdateInboxCannedResponsResponse updateInboxCannedRespons(id)

Update a canned response.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateInboxCannedResponsResponse = apiInstance.updateInboxCannedRespons(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#updateInboxCannedRespons")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#updateInboxCannedRespons")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdateInboxCannedResponsResponse**](UpdateInboxCannedResponsResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInboxConversation"></a>
# **updateInboxConversation**
> UpdateInboxConversationResponse updateInboxConversation(id)

Mark read / change status / close conversation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateInboxConversationResponse = apiInstance.updateInboxConversation(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#updateInboxConversation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#updateInboxConversation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdateInboxConversationResponse**](UpdateInboxConversationResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

