# WorldsEngagementApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceExperienceEvent**](WorldsEngagementApi.md#createWorldExperienceExperienceEvent) | **POST** /v1/worlds/experiences/{experienceId}/experience-events | Schedule an Experience Event shown on the game&#39;s card: title, description, start/end (5 min–14 days, ≤ 180 days ahead), thumbnail, place. With liveEventId it follows that live-ops event&#39;s schedule.
[**createWorldExperienceExperienceEventCancel**](WorldsEngagementApi.md#createWorldExperienceExperienceEventCancel) | **POST** /v1/worlds/experiences/{experienceId}/experience-events/{eventId}/cancel | Cancel an event (it disappears from the game&#39;s card; no reminder goes out).
[**createWorldExperienceExperienceEventRsvp**](WorldsEngagementApi.md#createWorldExperienceExperienceEventRsvp) | **POST** /v1/worlds/experiences/{experienceId}/experience-events/{eventId}/rsvp | RSVP (going: true) or take it back. remind: true also turns the experience&#39;s notifications on, so the 15-minute reminder can reach you.
[**createWorldExperienceNotification**](WorldsEngagementApi.md#createWorldExperienceNotification) | **POST** /v1/worlds/experiences/{experienceId}/notifications | Send an approved template to one player (sub) or up to 100 (subs). Only players who turned notifications on, 13+, not banned, at most 2 a day per player and outside their quiet hours receive it; every other send is logged as suppressed with its reason.
[**createWorldExperienceNotificationTemplateRetire**](WorldsEngagementApi.md#createWorldExperienceNotificationTemplateRetire) | **POST** /v1/worlds/experiences/{experienceId}/notification-templates/{key}/retire | Retire a template: sends by its key stop.
[**getWorldExperienceNotificationOptIn**](WorldsEngagementApi.md#getWorldExperienceNotificationOptIn) | **GET** /v1/worlds/experiences/{experienceId}/notifications/opt-in | Whether you turned this experience&#39;s notifications on.
[**getWorldExperienceNotificationReport**](WorldsEngagementApi.md#getWorldExperienceNotificationReport) | **GET** /v1/worlds/experiences/{experienceId}/notifications/report | Sends over the last N days (default 7, max 90): delivered, suppressed by reason, per template, and how many players turned notifications on.
[**listWorldExperienceEventUpcoming**](WorldsEngagementApi.md#listWorldExperienceEventUpcoming) | **GET** /v1/worlds/experience-events/upcoming | Events across public experiences in the next 7 days (and live now), soonest first — the Carnival Plaza&#39;s \&quot;Coming up\&quot; board.
[**listWorldExperienceExperienceEventUpcoming**](WorldsEngagementApi.md#listWorldExperienceExperienceEventUpcoming) | **GET** /v1/worlds/experiences/{experienceId}/experience-events/upcoming | An experience&#39;s upcoming and live events as players see them, with whether you are going.
[**listWorldExperienceExperienceEvents**](WorldsEngagementApi.md#listWorldExperienceExperienceEvents) | **GET** /v1/worlds/experiences/{experienceId}/experience-events | Your scheduled Experience Events (upcoming, live and the last 30 days) with RSVP counts.
[**listWorldExperienceNotificationTemplates**](WorldsEngagementApi.md#listWorldExperienceNotificationTemplates) | **GET** /v1/worlds/experiences/{experienceId}/notification-templates | Notification templates: key, title and body with {placeholders}, review status (approved ones can be sent).
[**listWorldMeExperienceEvents**](WorldsEngagementApi.md#listWorldMeExperienceEvents) | **GET** /v1/worlds/me/experience-events | Events you are going to that have not ended.
[**listWorldMeNotificationOptIns**](WorldsEngagementApi.md#listWorldMeNotificationOptIns) | **GET** /v1/worlds/me/notification-opt-ins | Every experience whose notifications you turned on.
[**updateWorldExperienceExperienceEvent**](WorldsEngagementApi.md#updateWorldExperienceExperienceEvent) | **PATCH** /v1/worlds/experiences/{experienceId}/experience-events/{eventId} | Change an event. A started event keeps its start; a new start time earns RSVPs a new reminder.
[**updateWorldExperienceNotificationOptIn**](WorldsEngagementApi.md#updateWorldExperienceNotificationOptIn) | **PUT** /v1/worlds/experiences/{experienceId}/notifications/opt-in | Turn this experience&#39;s notifications on or off for you. timeZone (IANA) keeps them out of your night.
[**updateWorldExperienceNotificationTemplate**](WorldsEngagementApi.md#updateWorldExperienceNotificationTemplate) | **PUT** /v1/worlds/experiences/{experienceId}/notification-templates/{key} | Create or reword a template. Clean words with no link are approved at once; anything the text filter flags, or any link, waits for Crossly review (24 h). Rewording re-reviews.


<a name="createWorldExperienceExperienceEvent"></a>
# **createWorldExperienceExperienceEvent**
> WorldExperienceExperienceEventResponse createWorldExperienceExperienceEvent(experienceId)

Schedule an Experience Event shown on the game&#39;s card: title, description, start/end (5 min–14 days, ≤ 180 days ahead), thumbnail, place. With liveEventId it follows that live-ops event&#39;s schedule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceExperienceEventResponse = apiInstance.createWorldExperienceExperienceEvent(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#createWorldExperienceExperienceEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#createWorldExperienceExperienceEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceExperienceEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceExperienceEventCancel"></a>
# **createWorldExperienceExperienceEventCancel**
> WorldExperienceExperienceEventResponse createWorldExperienceExperienceEventCancel(experienceId, eventId)

Cancel an event (it disappears from the game&#39;s card; no reminder goes out).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val eventId : kotlin.String = eventId_example // kotlin.String | 
try {
    val result : WorldExperienceExperienceEventResponse = apiInstance.createWorldExperienceExperienceEventCancel(experienceId, eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#createWorldExperienceExperienceEventCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#createWorldExperienceExperienceEventCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **eventId** | **kotlin.String**|  |

### Return type

**WorldExperienceExperienceEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceExperienceEventRsvp"></a>
# **createWorldExperienceExperienceEventRsvp**
> WorldExperienceExperienceEventResponse createWorldExperienceExperienceEventRsvp(experienceId, eventId)

RSVP (going: true) or take it back. remind: true also turns the experience&#39;s notifications on, so the 15-minute reminder can reach you.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val eventId : kotlin.String = eventId_example // kotlin.String | 
try {
    val result : WorldExperienceExperienceEventResponse = apiInstance.createWorldExperienceExperienceEventRsvp(experienceId, eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#createWorldExperienceExperienceEventRsvp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#createWorldExperienceExperienceEventRsvp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **eventId** | **kotlin.String**|  |

### Return type

**WorldExperienceExperienceEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceNotification"></a>
# **createWorldExperienceNotification**
> CreateWorldExperienceNotificationResponse createWorldExperienceNotification(experienceId)

Send an approved template to one player (sub) or up to 100 (subs). Only players who turned notifications on, 13+, not banned, at most 2 a day per player and outside their quiet hours receive it; every other send is logged as suppressed with its reason.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceNotificationResponse = apiInstance.createWorldExperienceNotification(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#createWorldExperienceNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#createWorldExperienceNotification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceNotificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceNotificationTemplateRetire"></a>
# **createWorldExperienceNotificationTemplateRetire**
> UpdateWorldExperienceNotificationTemplateResponse createWorldExperienceNotificationTemplateRetire(experienceId, key)

Retire a template: sends by its key stop.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceNotificationTemplateResponse = apiInstance.createWorldExperienceNotificationTemplateRetire(experienceId, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#createWorldExperienceNotificationTemplateRetire")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#createWorldExperienceNotificationTemplateRetire")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceNotificationTemplateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceNotificationOptIn"></a>
# **getWorldExperienceNotificationOptIn**
> GetWorldExperienceNotificationOptInResponse getWorldExperienceNotificationOptIn(experienceId)

Whether you turned this experience&#39;s notifications on.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceNotificationOptInResponse = apiInstance.getWorldExperienceNotificationOptIn(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#getWorldExperienceNotificationOptIn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#getWorldExperienceNotificationOptIn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceNotificationOptInResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceNotificationReport"></a>
# **getWorldExperienceNotificationReport**
> GetWorldExperienceNotificationReportResponse getWorldExperienceNotificationReport(experienceId)

Sends over the last N days (default 7, max 90): delivered, suppressed by reason, per template, and how many players turned notifications on.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceNotificationReportResponse = apiInstance.getWorldExperienceNotificationReport(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#getWorldExperienceNotificationReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#getWorldExperienceNotificationReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceNotificationReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceEventUpcoming"></a>
# **listWorldExperienceEventUpcoming**
> ListWorldExperienceEventUpcomingResponse listWorldExperienceEventUpcoming()

Events across public experiences in the next 7 days (and live now), soonest first — the Carnival Plaza&#39;s \&quot;Coming up\&quot; board.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
try {
    val result : ListWorldExperienceEventUpcomingResponse = apiInstance.listWorldExperienceEventUpcoming()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#listWorldExperienceEventUpcoming")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#listWorldExperienceEventUpcoming")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldExperienceEventUpcomingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceExperienceEventUpcoming"></a>
# **listWorldExperienceExperienceEventUpcoming**
> ListWorldExperienceExperienceEventsResponse listWorldExperienceExperienceEventUpcoming(experienceId)

An experience&#39;s upcoming and live events as players see them, with whether you are going.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceExperienceEventsResponse = apiInstance.listWorldExperienceExperienceEventUpcoming(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#listWorldExperienceExperienceEventUpcoming")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#listWorldExperienceExperienceEventUpcoming")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceExperienceEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceExperienceEvents"></a>
# **listWorldExperienceExperienceEvents**
> ListWorldExperienceExperienceEventsResponse listWorldExperienceExperienceEvents(experienceId)

Your scheduled Experience Events (upcoming, live and the last 30 days) with RSVP counts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceExperienceEventsResponse = apiInstance.listWorldExperienceExperienceEvents(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#listWorldExperienceExperienceEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#listWorldExperienceExperienceEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceExperienceEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceNotificationTemplates"></a>
# **listWorldExperienceNotificationTemplates**
> ListWorldExperienceNotificationTemplatesResponse listWorldExperienceNotificationTemplates(experienceId)

Notification templates: key, title and body with {placeholders}, review status (approved ones can be sent).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceNotificationTemplatesResponse = apiInstance.listWorldExperienceNotificationTemplates(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#listWorldExperienceNotificationTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#listWorldExperienceNotificationTemplates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceNotificationTemplatesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldMeExperienceEvents"></a>
# **listWorldMeExperienceEvents**
> ListWorldMeExperienceEventsResponse listWorldMeExperienceEvents()

Events you are going to that have not ended.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
try {
    val result : ListWorldMeExperienceEventsResponse = apiInstance.listWorldMeExperienceEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#listWorldMeExperienceEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#listWorldMeExperienceEvents")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldMeExperienceEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldMeNotificationOptIns"></a>
# **listWorldMeNotificationOptIns**
> ListWorldMeNotificationOptInsResponse listWorldMeNotificationOptIns()

Every experience whose notifications you turned on.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
try {
    val result : ListWorldMeNotificationOptInsResponse = apiInstance.listWorldMeNotificationOptIns()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#listWorldMeNotificationOptIns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#listWorldMeNotificationOptIns")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldMeNotificationOptInsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceExperienceEvent"></a>
# **updateWorldExperienceExperienceEvent**
> WorldExperienceExperienceEventResponse updateWorldExperienceExperienceEvent(experienceId, eventId)

Change an event. A started event keeps its start; a new start time earns RSVPs a new reminder.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val eventId : kotlin.String = eventId_example // kotlin.String | 
try {
    val result : WorldExperienceExperienceEventResponse = apiInstance.updateWorldExperienceExperienceEvent(experienceId, eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#updateWorldExperienceExperienceEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#updateWorldExperienceExperienceEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **eventId** | **kotlin.String**|  |

### Return type

**WorldExperienceExperienceEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceNotificationOptIn"></a>
# **updateWorldExperienceNotificationOptIn**
> GetWorldExperienceNotificationOptInResponse updateWorldExperienceNotificationOptIn(experienceId)

Turn this experience&#39;s notifications on or off for you. timeZone (IANA) keeps them out of your night.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceNotificationOptInResponse = apiInstance.updateWorldExperienceNotificationOptIn(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#updateWorldExperienceNotificationOptIn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#updateWorldExperienceNotificationOptIn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceNotificationOptInResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceNotificationTemplate"></a>
# **updateWorldExperienceNotificationTemplate**
> UpdateWorldExperienceNotificationTemplateResponse updateWorldExperienceNotificationTemplate(experienceId, key)

Create or reword a template. Clean words with no link are approved at once; anything the text filter flags, or any link, waits for Crossly review (24 h). Rewording re-reviews.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsEngagementApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceNotificationTemplateResponse = apiInstance.updateWorldExperienceNotificationTemplate(experienceId, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsEngagementApi#updateWorldExperienceNotificationTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsEngagementApi#updateWorldExperienceNotificationTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceNotificationTemplateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

