# InboxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInboxAiSuggest**](InboxApi.md#createInboxAiSuggest) | **POST** /v1/inbox/ai-suggest | AI reply suggestion for a conversation.
[**createInboxCannedResponse**](InboxApi.md#createInboxCannedResponse) | **POST** /v1/inbox/canned-responses | Create a canned response.
[**createInboxConversationBulk**](InboxApi.md#createInboxConversationBulk) | **POST** /v1/inbox/conversations/bulk | Bulk mark read / mark unread / soft-delete conversations.
[**createInboxConversationBulkAiRespond**](InboxApi.md#createInboxConversationBulkAiRespond) | **POST** /v1/inbox/conversations/bulk-ai-respond | AI reply suggestion for multiple conversations — draft or send.
[**createInboxConversationOfferAction**](InboxApi.md#createInboxConversationOfferAction) | **POST** /v1/inbox/conversations/{id}/offer-action | Accept / counter / decline an active offer on a conversation.
[**createInboxMessageTriage**](InboxApi.md#createInboxMessageTriage) | **POST** /v1/inbox/messages/{id}/triage | Manually re-triage a buyer message.
[**createInboxOffer**](InboxApi.md#createInboxOffer) | **POST** /v1/inbox/{id}/offer | Accept, counter, or decline an offer on a conversation.
[**createInboxReply**](InboxApi.md#createInboxReply) | **POST** /v1/inbox/{id}/reply | Send a reply to a conversation thread.
[**createVideoRequestAnswer**](InboxApi.md#createVideoRequestAnswer) | **POST** /v1/video-requests/{id}/answer | Answer a video request with a clip you uploaded (POST /v1/video-requests/upload-url, then PUT the file to uploadUrl). The buyer is notified and the clip shows on the listing.
[**createVideoRequestDecline**](InboxApi.md#createVideoRequestDecline) | **POST** /v1/video-requests/{id}/decline | Decline a video request, with an optional note to the buyer.
[**createVideoRequestUploadUrl**](InboxApi.md#createVideoRequestUploadUrl) | **POST** /v1/video-requests/upload-url | A presigned upload for a video answer: PUT the file to uploadUrl with the same Content-Type and exact Content-Length, then answer with publicUrl.
[**deleteInboxCannedResponse**](InboxApi.md#deleteInboxCannedResponse) | **DELETE** /v1/inbox/canned-responses/{id} | Delete a canned response.
[**getInbox**](InboxApi.md#getInbox) | **GET** /v1/inbox/{id} | Get one conversation with its messages.
[**getInboxCannedResponse**](InboxApi.md#getInboxCannedResponse) | **GET** /v1/inbox/canned-responses | List canned responses.
[**getInboxConversationMessage**](InboxApi.md#getInboxConversationMessage) | **GET** /v1/inbox/conversations/{id}/messages | Paginated messages for a conversation.
[**getInboxConversationUnreadCount**](InboxApi.md#getInboxConversationUnreadCount) | **GET** /v1/inbox/conversations/unread-count | Sidebar badge: unread conversation count.
[**listInbox**](InboxApi.md#listInbox) | **GET** /v1/inbox | List conversations.
[**listVideoRequests**](InboxApi.md#listVideoRequests) | **GET** /v1/video-requests | Buyers asking for a video of your items. status: open (default), answered, declined or all.
[**updateInboxCannedResponse**](InboxApi.md#updateInboxCannedResponse) | **PUT** /v1/inbox/canned-responses/{id} | Update a canned response.
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

**CreateInboxAiSuggestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInboxCannedResponse"></a>
# **createInboxCannedResponse**
> CreateInboxCannedResponseResponse createInboxCannedResponse()

Create a canned response.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : CreateInboxCannedResponseResponse = apiInstance.createInboxCannedResponse()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createInboxCannedResponse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createInboxCannedResponse")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateInboxCannedResponseResponse**

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

**CreateInboxConversationBulkResponse**

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

**CreateInboxConversationBulkAiRespondResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInboxConversationOfferAction"></a>
# **createInboxConversationOfferAction**
> UpdateInboxConversationResponse createInboxConversationOfferAction(id)

Accept / counter / decline an active offer on a conversation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateInboxConversationResponse = apiInstance.createInboxConversationOfferAction(id)
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

**UpdateInboxConversationResponse**

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

**CreateInboxMessageTriageResponse**

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

**CreateInboxOfferResponse**

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

**CreateInboxReplyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVideoRequestAnswer"></a>
# **createVideoRequestAnswer**
> CreateVideoRequestAnswerResponse createVideoRequestAnswer(id)

Answer a video request with a clip you uploaded (POST /v1/video-requests/upload-url, then PUT the file to uploadUrl). The buyer is notified and the clip shows on the listing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVideoRequestAnswerResponse = apiInstance.createVideoRequestAnswer(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createVideoRequestAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createVideoRequestAnswer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVideoRequestAnswerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVideoRequestDecline"></a>
# **createVideoRequestDecline**
> CreateVideoRequestAnswerResponse createVideoRequestDecline(id)

Decline a video request, with an optional note to the buyer.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVideoRequestAnswerResponse = apiInstance.createVideoRequestDecline(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createVideoRequestDecline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createVideoRequestDecline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVideoRequestAnswerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVideoRequestUploadUrl"></a>
# **createVideoRequestUploadUrl**
> CreateVideoRequestUploadUrlResponse createVideoRequestUploadUrl()

A presigned upload for a video answer: PUT the file to uploadUrl with the same Content-Type and exact Content-Length, then answer with publicUrl.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : CreateVideoRequestUploadUrlResponse = apiInstance.createVideoRequestUploadUrl()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#createVideoRequestUploadUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#createVideoRequestUploadUrl")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVideoRequestUploadUrlResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInboxCannedResponse"></a>
# **deleteInboxCannedResponse**
> CreateOrderDisputeResponse deleteInboxCannedResponse(id)

Delete a canned response.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderDisputeResponse = apiInstance.deleteInboxCannedResponse(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#deleteInboxCannedResponse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#deleteInboxCannedResponse")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderDisputeResponse**

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

**GetInboxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInboxCannedResponse"></a>
# **getInboxCannedResponse**
> GetInboxCannedResponseResponse getInboxCannedResponse()

List canned responses.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : GetInboxCannedResponseResponse = apiInstance.getInboxCannedResponse()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getInboxCannedResponse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getInboxCannedResponse")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetInboxCannedResponseResponse**

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

**GetInboxConversationMessageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInboxConversationUnreadCount"></a>
# **getInboxConversationUnreadCount**
> CreateWeb3LaunchArtResponse getInboxConversationUnreadCount()

Sidebar badge: unread conversation count.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : CreateWeb3LaunchArtResponse = apiInstance.getInboxConversationUnreadCount()
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

**CreateWeb3LaunchArtResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInbox"></a>
# **listInbox**
> ListInboxResponse listInbox(page, limit)

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
    val result : ListInboxResponse = apiInstance.listInbox(page, limit)
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

**ListInboxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVideoRequests"></a>
# **listVideoRequests**
> ListVideoRequestsResponse listVideoRequests()

Buyers asking for a video of your items. status: open (default), answered, declined or all.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
try {
    val result : ListVideoRequestsResponse = apiInstance.listVideoRequests()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#listVideoRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#listVideoRequests")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVideoRequestsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInboxCannedResponse"></a>
# **updateInboxCannedResponse**
> CreateInboxCannedResponseResponse updateInboxCannedResponse(id)

Update a canned response.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateInboxCannedResponseResponse = apiInstance.updateInboxCannedResponse(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#updateInboxCannedResponse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#updateInboxCannedResponse")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateInboxCannedResponseResponse**

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

**UpdateInboxConversationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

