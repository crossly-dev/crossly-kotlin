# AppManagedListingsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createListingCommandAck**](AppManagedListingsApi.md#createListingCommandAck) | **POST** /v1/listing-commands/{id}/ack | Acknowledge a command (you will act on it). Extends its deadline: 24 h for listing commands; tracking 2 h, cancel 4 h, refund 24 h, message 1 h.
[**createListingCommandComplete**](AppManagedListingsApi.md#createListingCommandComplete) | **POST** /v1/listing-commands/{id}/complete | Report a command done on the marketplace. relist: newExternalId when a new id was issued; refund_order: platformRefundId + amount (required); submit_tracking: trackingNumber/carrier as the marketplace holds them; message_buyer: platformMessageId.
[**createListingCommandFail**](AppManagedListingsApi.md#createListingCommandFail) | **POST** /v1/listing-commands/{id}/fail | Report a command failed, with a reason the seller will see.
[**createListingEvent**](AppManagedListingsApi.md#createListingEvent) | **POST** /v1/listings/{id}/events | Report a marketplace event (item.updated / ended / sold / relisted) for a listing your app manages.
[**createListingEvent2**](AppManagedListingsApi.md#createListingEvent2) | **POST** /v1/listings/events | Report up to 100 marketplace events keyed by platform + externalId. One bad event never fails the rest.
[**createListingLink**](AppManagedListingsApi.md#createListingLink) | **POST** /v1/listings/link | Link a live marketplace listing your app already manages into Crossly (no re-listing). Idempotent.
[**createListingLinkBulk**](AppManagedListingsApi.md#createListingLinkBulk) | **POST** /v1/listings/link/bulk | Link up to 100 live marketplace listings. Each item succeeds or fails on its own; re-sending is safe.
[**createListingPlatformReclone**](AppManagedListingsApi.md#createListingPlatformReclone) | **POST** /v1/listings/{id}/platforms/{platform}/reclone | End this marketplace item and relist it under Crossly. Requires consent: true.
[**createListingPlatformRecloneCancel**](AppManagedListingsApi.md#createListingPlatformRecloneCancel) | **POST** /v1/listings/{id}/platforms/{platform}/reclone/cancel | Cancel a relist still waiting for you to end the old item.
[**createListingPlatformRecloneSellerEnded**](AppManagedListingsApi.md#createListingPlatformRecloneSellerEnded) | **POST** /v1/listings/{id}/platforms/{platform}/reclone/seller-ended | You ended the old item on the marketplace yourself (Done).
[**createListingPlatformTakeOver**](AppManagedListingsApi.md#createListingPlatformTakeOver) | **POST** /v1/listings/{id}/platforms/{platform}/take-over | Take over an app-managed item: Crossly acts on the marketplace itself (needs your own connection).
[**createListingUnlink**](AppManagedListingsApi.md#createListingUnlink) | **POST** /v1/listings/{id}/unlink | Stop the app managing this listing. It stays live everywhere; the app&#39;s Crossly Shop fee ends for future sales.
[**createOrderEvent**](AppManagedListingsApi.md#createOrderEvent) | **POST** /v1/orders/events | Report up to 100 order events (shipped, cancelled, refunded, delivered) keyed by platform + platformOrderId. Each completes the matching open order command. One bad event never fails the rest.
[**createOrderTakeOver**](AppManagedListingsApi.md#createOrderTakeOver) | **POST** /v1/orders/{id}/take-over | Take over the app-managed item behind an order; its actions then go through your own connection.
[**getListingManagement**](AppManagedListingsApi.md#getListingManagement) | **GET** /v1/listings/{id}/management | Which app manages this listing (null when none). Its fee is charged only on Crossly Shop sales, never on eBay or other marketplaces.
[**getListingPlatformReclone**](AppManagedListingsApi.md#getListingPlatformReclone) | **GET** /v1/listings/{id}/platforms/{platform}/reclone | The latest relist-under-Crossly run for this listing on a platform (null when none).
[**listListingCommands**](AppManagedListingsApi.md#listListingCommands) | **GET** /v1/listing-commands | Your app&#39;s listing (delist/update/relist) and order (submit_tracking, remove_tracking, cancel_order, refund_order, message_buyer) commands for this seller (default: open ones), oldest first.


<a name="createListingCommandAck"></a>
# **createListingCommandAck**
> ListListingCommandsItem createListingCommandAck(id)

Acknowledge a command (you will act on it). Extends its deadline: 24 h for listing commands; tracking 2 h, cancel 4 h, refund 24 h, message 1 h.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListListingCommandsItem = apiInstance.createListingCommandAck(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingCommandAck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingCommandAck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListListingCommandsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingCommandComplete"></a>
# **createListingCommandComplete**
> ListListingCommandsItem createListingCommandComplete(id)

Report a command done on the marketplace. relist: newExternalId when a new id was issued; refund_order: platformRefundId + amount (required); submit_tracking: trackingNumber/carrier as the marketplace holds them; message_buyer: platformMessageId.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListListingCommandsItem = apiInstance.createListingCommandComplete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingCommandComplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingCommandComplete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListListingCommandsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingCommandFail"></a>
# **createListingCommandFail**
> ListListingCommandsItem createListingCommandFail(id)

Report a command failed, with a reason the seller will see.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListListingCommandsItem = apiInstance.createListingCommandFail(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingCommandFail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingCommandFail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListListingCommandsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingEvent"></a>
# **createListingEvent**
> CreateListingEventResponse createListingEvent(id)

Report a marketplace event (item.updated / ended / sold / relisted) for a listing your app manages.

Idempotent on &#x60;eventId&#x60;. State events apply only when &#x60;sequence&#x60; is higher than the last applied one (else &#x60;stale&#x60;, ignored). &#x60;item.sold&#x60; runs Crossly&#39;s sale cascade (other channels delist) and is never dropped as stale.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateListingEventResponse = apiInstance.createListingEvent(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateListingEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingEvent2"></a>
# **createListingEvent2**
> CreateListingEvent2Response createListingEvent2()

Report up to 100 marketplace events keyed by platform + externalId. One bad event never fails the rest.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
try {
    val result : CreateListingEvent2Response = apiInstance.createListingEvent2()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingEvent2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingEvent2")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateListingEvent2Response**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingLink"></a>
# **createListingLink**
> CreateListingLinkResponse createListingLink()

Link a live marketplace listing your app already manages into Crossly (no re-listing). Idempotent.

Direct when Crossly holds the seller&#39;s own connection (verified by item id: exists, active, theirs); relayed otherwise, on your attestation plus &#x60;snapshot&#x60;. The listing shows \&quot;Managed by &lt;your app&gt;\&quot;. Your revenue share is charged only on sales made on Crossly Shop; sales on eBay or any other marketplace never carry an app fee.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
try {
    val result : CreateListingLinkResponse = apiInstance.createListingLink()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingLink")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateListingLinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingLinkBulk"></a>
# **createListingLinkBulk**
> CreateListingLinkBulkResponse createListingLinkBulk()

Link up to 100 live marketplace listings. Each item succeeds or fails on its own; re-sending is safe.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
try {
    val result : CreateListingLinkBulkResponse = apiInstance.createListingLinkBulk()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingLinkBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingLinkBulk")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateListingLinkBulkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingPlatformReclone"></a>
# **createListingPlatformReclone**
> CreateListingPlatformRecloneResponse createListingPlatformReclone(id, platform)

End this marketplace item and relist it under Crossly. Requires consent: true.

Loses the item&#39;s watchers, sold count, sales history, Promoted Listings and open offers; the item number changes. Refused while an order awaits fulfilment or an auction has bids. The new listing is published only after the old one is confirmed ended.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : CreateListingPlatformRecloneResponse = apiInstance.createListingPlatformReclone(id, platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingPlatformReclone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingPlatformReclone")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **platform** | **kotlin.String**|  |

### Return type

**CreateListingPlatformRecloneResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingPlatformRecloneCancel"></a>
# **createListingPlatformRecloneCancel**
> CreateListingPlatformRecloneResponse createListingPlatformRecloneCancel(id, platform)

Cancel a relist still waiting for you to end the old item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : CreateListingPlatformRecloneResponse = apiInstance.createListingPlatformRecloneCancel(id, platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingPlatformRecloneCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingPlatformRecloneCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **platform** | **kotlin.String**|  |

### Return type

**CreateListingPlatformRecloneResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingPlatformRecloneSellerEnded"></a>
# **createListingPlatformRecloneSellerEnded**
> CreateListingPlatformRecloneResponse createListingPlatformRecloneSellerEnded(id, platform)

You ended the old item on the marketplace yourself (Done).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : CreateListingPlatformRecloneResponse = apiInstance.createListingPlatformRecloneSellerEnded(id, platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingPlatformRecloneSellerEnded")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingPlatformRecloneSellerEnded")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **platform** | **kotlin.String**|  |

### Return type

**CreateListingPlatformRecloneResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingPlatformTakeOver"></a>
# **createListingPlatformTakeOver**
> CreateListingPlatformTakeOverResponse createListingPlatformTakeOver(id, platform)

Take over an app-managed item: Crossly acts on the marketplace itself (needs your own connection).

Verifies the item is on your connected account first. mode &#39;direct&#39; (default) keeps the app as manager; &#39;full&#39; also unlinks it (listing.unlinked reason &#39;taken_over&#39;; its Crossly Shop fee stops). An app command already acknowledged answers 409 app_command_in_flight until you send confirm: true.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : CreateListingPlatformTakeOverResponse = apiInstance.createListingPlatformTakeOver(id, platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingPlatformTakeOver")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingPlatformTakeOver")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **platform** | **kotlin.String**|  |

### Return type

**CreateListingPlatformTakeOverResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingUnlink"></a>
# **createListingUnlink**
> CreateListingUnlinkResponse createListingUnlink(id)

Stop the app managing this listing. It stays live everywhere; the app&#39;s Crossly Shop fee ends for future sales.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateListingUnlinkResponse = apiInstance.createListingUnlink(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createListingUnlink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createListingUnlink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateListingUnlinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderEvent"></a>
# **createOrderEvent**
> CreateOrderEventResponse createOrderEvent()

Report up to 100 order events (shipped, cancelled, refunded, delivered) keyed by platform + platformOrderId. Each completes the matching open order command. One bad event never fails the rest.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
try {
    val result : CreateOrderEventResponse = apiInstance.createOrderEvent()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createOrderEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createOrderEvent")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateOrderEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderTakeOver"></a>
# **createOrderTakeOver**
> CreateOrderTakeOverResponse createOrderTakeOver(id)

Take over the app-managed item behind an order; its actions then go through your own connection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderTakeOverResponse = apiInstance.createOrderTakeOver(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#createOrderTakeOver")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#createOrderTakeOver")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderTakeOverResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListingManagement"></a>
# **getListingManagement**
> GetListingManagementResponse getListingManagement(id)

Which app manages this listing (null when none). Its fee is charged only on Crossly Shop sales, never on eBay or other marketplaces.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetListingManagementResponse = apiInstance.getListingManagement(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#getListingManagement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#getListingManagement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetListingManagementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListingPlatformReclone"></a>
# **getListingPlatformReclone**
> GetListingPlatformRecloneResponse getListingPlatformReclone(id, platform)

The latest relist-under-Crossly run for this listing on a platform (null when none).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : GetListingPlatformRecloneResponse = apiInstance.getListingPlatformReclone(id, platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#getListingPlatformReclone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#getListingPlatformReclone")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **platform** | **kotlin.String**|  |

### Return type

**GetListingPlatformRecloneResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListingCommands"></a>
# **listListingCommands**
> ListListingCommandsResponse listListingCommands(state, type, limit, page)

Your app&#39;s listing (delist/update/relist) and order (submit_tracking, remove_tracking, cancel_order, refund_order, message_buyer) commands for this seller (default: open ones), oldest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AppManagedListingsApi()
val state : kotlin.String = state_example // kotlin.String | Comma-separated: pending, acked, completed, failed, expired, cancelled
val type : kotlin.String = type_example // kotlin.String | Comma-separated: delist, update, relist, submit_tracking, remove_tracking, cancel_order, refund_order, message_buyer
val limit : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListListingCommandsResponse = apiInstance.listListingCommands(state, type, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppManagedListingsApi#listListingCommands")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppManagedListingsApi#listListingCommands")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **kotlin.String**| Comma-separated: pending, acked, completed, failed, expired, cancelled | [optional]
 **type** | **kotlin.String**| Comma-separated: delist, update, relist, submit_tracking, remove_tracking, cancel_order, refund_order, message_buyer | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]

### Return type

**ListListingCommandsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

