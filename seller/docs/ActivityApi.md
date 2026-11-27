# ActivityApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActionLogExport**](ActivityApi.md#createActionLogExport) | **POST** /v1/action-log/exports | Queue an export of the Activity Log: every event (csv, ndjson, pdf) or a summary report (pdf, ndjson). Poll GET /api/v1/action-log/exports/{exportId}, then download it. Exports never contain IP addresses.
[**createActionLogSearchTranslate**](ActivityApi.md#createActionLogSearchTranslate) | **POST** /v1/action-log/search/translate | Turn a question in words (\&quot;failed delists on Mercari last week\&quot;) into an Activity Log search: pass the returned &#x60;q&#x60; to GET /api/v1/action-log (or the histogram and csv/ndjson exports). Nothing is run. A 404 with details.code &#x60;not_enabled&#x60; means natural-language search is off for this account.
[**createDetectedEventEventConfirm**](ActivityApi.md#createDetectedEventEventConfirm) | **POST** /v1/detected-events/events/{id}/confirm | Answer an open ask (canConfirm true): optionally which item it is (itemId, one of the match candidates) and which actions to run instead of the ask&#39;s preselected ones. Returns the event. 409 ask_not_open when the event is not waiting.
[**createDetectedEventEventUndo**](ActivityApi.md#createDetectedEventEventUndo) | **POST** /v1/detected-events/events/{id}/undo | Undo what Crossly did for an event (canUndo true): every executed action&#39;s stored inverse runs, newest first (restore stock, relist, unlink…). Returns the event. 409 nothing_to_undo when nothing is reversible.
[**createDetectedEventRule**](ActivityApi.md#createDetectedEventRule) | **POST** /v1/detected-events/rules | Create a detection rule: which detected events it applies to (filter + optional condition over any event axis) and what Crossly does then (and else). Without order it is placed most-specific-first, above the default set. Returns the stored rule with its id.
[**createDetectedEventRulePlace**](ActivityApi.md#createDetectedEventRulePlace) | **POST** /v1/detected-events/rules/place | Save one rule and the whole evaluation order in one transaction: rule.id is an existing id (replace) or any new client id (create); ids is every rule id top-down, naming the rule by that id. Returns the stored rule and the list.
[**createDetectedEventRuleReorder**](ActivityApi.md#createDetectedEventRuleReorder) | **POST** /v1/detected-events/rules/reorder | Set the evaluation order: ids top-down, defaults included (ids from the rules list). Rules are re-numbered 10, 20, 30…; a default moved above one of your rules is stored as your edit. Returns the list.
[**createDetectedEventRuleResetDefault**](ActivityApi.md#createDetectedEventRuleResetDefault) | **POST** /v1/detected-events/rules/reset-defaults | Drop your edits of the shipped default rules (keys, or all when omitted). Returns the list.
[**createDetectedEventSimulate**](ActivityApi.md#createDetectedEventSimulate) | **POST** /v1/detected-events/simulate | Run one event through the rules without acting: the winning rule, rules it shadowed, the trace, the guards that held actions back and the plan per target with how it would run (direct / relay / ask / skip). event needs only kind; every axis left out takes its default. rules &#x3D; an unsaved draft list.
[**createDetectedEventSimulateImpact**](ActivityApi.md#createDetectedEventSimulateImpact) | **POST** /v1/detected-events/simulate/impact | What a rule edit would change: your detected events of the last days (default 30, at most 500) re-resolved against the draft rules and against the stored ones. Per event: winning rule and actions before and after, and whether it changed. Nothing runs.
[**createEmailEventConfirm**](ActivityApi.md#createEmailEventConfirm) | **POST** /v1/email-events/{id}/confirm | Confirm an email-detected event: re-run it as certain (a possible sale records the sale and delists the item elsewhere). When several listings could be meant, pass platformListingDbId to choose one.
[**createEmailEventDismiss**](ActivityApi.md#createEmailEventDismiss) | **POST** /v1/email-events/{id}/dismiss | Dismiss an email-detected event (\&quot;not a sale\&quot;): closes the card without acting.
[**createEventPolicyDecisionConfirm**](ActivityApi.md#createEventPolicyDecisionConfirm) | **POST** /v1/event-policies/decisions/{id}/confirm | Confirm a review decision from a webhook, order poller or app relay (canConfirm true): the event runs again with the seller confirmed, so a review rule runs the strongest allowed non-review action for that cell. Returns the new decision. 409 when the decision was already confirmed or is not confirmable (email review decisions are confirmed on their review card).
[**deleteDetectedEventRule**](ActivityApi.md#deleteDetectedEventRule) | **DELETE** /v1/detected-events/rules/{id} | Delete a detection rule. Deleting your edit of a default (its id, or default:&lt;key&gt;) brings the shipped default back; deleting a translated event-policy rule deletes that policy rule too.
[**deleteEventPolicyRule**](ActivityApi.md#deleteEventPolicyRule) | **DELETE** /v1/event-policies/rules/{id} | Delete a rule: its cell falls back to the next scope (platform → global → the built-in default).
[**getActionLog**](ActivityApi.md#getActionLog) | **GET** /v1/action-log/{id} | One Activity Log event by id, with &#x60;view&#x60; including its steps and, for bulk jobs, its children.
[**getActionLogExport**](ActivityApi.md#getActionLogExport) | **GET** /v1/action-log/exports/{exportId} | The state of one Activity Log export.
[**getActionLogExportDownload**](ActivityApi.md#getActionLogExportDownload) | **GET** /v1/action-log/exports/{exportId}/download | Download a finished Activity Log export (for 24 hours after it completes).
[**getActionLogFacet**](ActivityApi.md#getActionLogFacet) | **GET** /v1/action-log/facets | Filter options of the caller&#39;s Activity Log (last 90 days): areas with their actions and counts, the team members who acted, platforms and outcomes.
[**getDetectedEventEvent**](ActivityApi.md#getDetectedEventEvent) | **GET** /v1/detected-events/events/{id} | One detected event with every report of it (first + corroborations, with correlation and contradiction), the guards that held actions back, the plan and each executed action&#39;s outcome and reversibility.
[**getEventPolicy**](ActivityApi.md#getEventPolicy) | **GET** /v1/event-policies | What Crossly does with each detected marketplace event (sale, listing ended, offer, cancellation, label, shipped, delivered, refund, return, payout, message), per who owns the item (crossly, imported, app_managed, other_tool, untracked). Each matrix cell lists the allowed actions and the effective one, with the scope it comes from (app &gt; platform &gt; global &gt; default). Pass platform (or appId) to see the matrix as that platform&#39;s (or app&#39;s) items see it. Also returns the rules, platforms and connected apps.
[**listActionLog**](ActivityApi.md#listActionLog) | **GET** /v1/action-log | List Activity Log events, newest first. Each event carries &#x60;view&#x60; (title, sentence, fields, failure advice, who did it) and typed &#x60;detail&#x60;. Page with &#x60;cursor&#x60;; &#x60;pagination.total&#x60; counts matches.
[**listActionLogCalls**](ActivityApi.md#listActionLogCalls) | **GET** /v1/action-log/{id}/calls | The outbound platform HTTP calls under an event (oldest first) — platform, operation, method, host, status, latency, error class/message, proxy + recipe id. Answers \&quot;what was sent / what went wrong\&quot;. The URL path, request/response bodies and persisted-query hash are never returned.
[**listActionLogHistogram**](ActivityApi.md#listActionLogHistogram) | **GET** /v1/action-log/histogram | Events per UTC day for the list filters (default: the last 30 days; at most 366).
[**listDetectedEventEvents**](ActivityApi.md#listDetectedEventEvents) | **GET** /v1/detected-events/events | Every event Crossly detected (sales, order changes, listing changes, offers, messages, account notices), newest first: all its axes, the rule that decided it, its corroborating reports, the plan per target and how each action went, with canConfirm (an open ask) and canUndo. Cursor-paged; filter by kinds, platforms statuses and accounts (comma-separated) and since (ISO time).
[**listDetectedEventRules**](ActivityApi.md#listDetectedEventRules) | **GET** /v1/detected-events/rules | The seller&#39;s detection rules, top-down in the order they are evaluated (first match wins unless a rule says continue): the seller&#39;s own rules, translations of their event-policy rules (source legacy), then the shipped default set (source default, ids default:&lt;key&gt;; a stored edit of a default replaces it). Each rule has a filter (event kinds, platforms, accounts, apps, tags, items), an optional condition over any event axis, the actions it runs (then / else) and its guard loosenings.
[**listEmailEvents**](ActivityApi.md#listEmailEvents) | **GET** /v1/email-events | List email-detected events waiting for the seller (status&#x3D;needs_review): a possible sale, ended listing, cancellation or other event an email reported that was not certain enough to act on automatically.
[**listEventPolicyDecisions**](ActivityApi.md#listEventPolicyDecisions) | **GET** /v1/event-policies/decisions | The decision log, newest first: for each detected event, what the rule or default asked for, what was done (after capability fallback and the email confidence ceiling), the rule that decided it, and the outcome (done / skipped / failed / review). Cursor-paged; filter by event, ownership, platform or outcome (outcome&#x3D;review: still waiting for the seller). Kept 90 days.
[**updateDetectedEventRule**](ActivityApi.md#updateDetectedEventRule) | **PUT** /v1/detected-events/rules/{id} | Replace a detection rule. An id default:&lt;key&gt; stores your edit of that shipped default (delete it, or reset-defaults, to go back to the shipped one).
[**updateEventPolicyRule**](ActivityApi.md#updateEventPolicyRule) | **PUT** /v1/event-policies/rules | Set what Crossly does with one kind of detected event for one kind of item: scope global (scopeValue null), platform (scopeValue &#x3D; platform id) or app (scopeValue &#x3D; OAuth app id, app_managed items only). Replaces the rule for the same cell and scope. The action must be one the matrix allows for that cell; import actions exist only for untracked items.


<a name="createActionLogExport"></a>
# **createActionLogExport**
> GetActionLogExportResponse createActionLogExport(createActionLogExportRequest)

Queue an export of the Activity Log: every event (csv, ndjson, pdf) or a summary report (pdf, ndjson). Poll GET /api/v1/action-log/exports/{exportId}, then download it. Exports never contain IP addresses.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val createActionLogExportRequest : CreateActionLogExportRequest =  // CreateActionLogExportRequest | 
try {
    val result : GetActionLogExportResponse = apiInstance.createActionLogExport(createActionLogExportRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createActionLogExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createActionLogExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createActionLogExportRequest** | **CreateActionLogExportRequest**|  |

### Return type

**GetActionLogExportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createActionLogSearchTranslate"></a>
# **createActionLogSearchTranslate**
> CreateActionLogSearchTranslateResponse createActionLogSearchTranslate(createActionLogSearchTranslateRequest)

Turn a question in words (\&quot;failed delists on Mercari last week\&quot;) into an Activity Log search: pass the returned &#x60;q&#x60; to GET /api/v1/action-log (or the histogram and csv/ndjson exports). Nothing is run. A 404 with details.code &#x60;not_enabled&#x60; means natural-language search is off for this account.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val createActionLogSearchTranslateRequest : CreateActionLogSearchTranslateRequest =  // CreateActionLogSearchTranslateRequest | 
try {
    val result : CreateActionLogSearchTranslateResponse = apiInstance.createActionLogSearchTranslate(createActionLogSearchTranslateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createActionLogSearchTranslate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createActionLogSearchTranslate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createActionLogSearchTranslateRequest** | **CreateActionLogSearchTranslateRequest**|  |

### Return type

**CreateActionLogSearchTranslateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDetectedEventEventConfirm"></a>
# **createDetectedEventEventConfirm**
> CreateDetectedEventEventUndoResponse createDetectedEventEventConfirm(id, createDetectedEventEventConfirmRequest)

Answer an open ask (canConfirm true): optionally which item it is (itemId, one of the match candidates) and which actions to run instead of the ask&#39;s preselected ones. Returns the event. 409 ask_not_open when the event is not waiting.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDetectedEventEventConfirmRequest : CreateDetectedEventEventConfirmRequest =  // CreateDetectedEventEventConfirmRequest | 
try {
    val result : CreateDetectedEventEventUndoResponse = apiInstance.createDetectedEventEventConfirm(id, createDetectedEventEventConfirmRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createDetectedEventEventConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createDetectedEventEventConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **createDetectedEventEventConfirmRequest** | **CreateDetectedEventEventConfirmRequest**|  |

### Return type

**CreateDetectedEventEventUndoResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDetectedEventEventUndo"></a>
# **createDetectedEventEventUndo**
> CreateDetectedEventEventUndoResponse createDetectedEventEventUndo(id)

Undo what Crossly did for an event (canUndo true): every executed action&#39;s stored inverse runs, newest first (restore stock, relist, unlink…). Returns the event. 409 nothing_to_undo when nothing is reversible.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateDetectedEventEventUndoResponse = apiInstance.createDetectedEventEventUndo(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createDetectedEventEventUndo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createDetectedEventEventUndo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateDetectedEventEventUndoResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDetectedEventRule"></a>
# **createDetectedEventRule**
> CreateDetectedEventRuleResponse createDetectedEventRule(createDetectedEventRuleRequest)

Create a detection rule: which detected events it applies to (filter + optional condition over any event axis) and what Crossly does then (and else). Without order it is placed most-specific-first, above the default set. Returns the stored rule with its id.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val createDetectedEventRuleRequest : CreateDetectedEventRuleRequest =  // CreateDetectedEventRuleRequest | 
try {
    val result : CreateDetectedEventRuleResponse = apiInstance.createDetectedEventRule(createDetectedEventRuleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createDetectedEventRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createDetectedEventRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDetectedEventRuleRequest** | **CreateDetectedEventRuleRequest**|  |

### Return type

**CreateDetectedEventRuleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDetectedEventRulePlace"></a>
# **createDetectedEventRulePlace**
> CreateDetectedEventRulePlaceResponse createDetectedEventRulePlace(createDetectedEventRulePlaceRequest)

Save one rule and the whole evaluation order in one transaction: rule.id is an existing id (replace) or any new client id (create); ids is every rule id top-down, naming the rule by that id. Returns the stored rule and the list.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val createDetectedEventRulePlaceRequest : CreateDetectedEventRulePlaceRequest =  // CreateDetectedEventRulePlaceRequest | 
try {
    val result : CreateDetectedEventRulePlaceResponse = apiInstance.createDetectedEventRulePlace(createDetectedEventRulePlaceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createDetectedEventRulePlace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createDetectedEventRulePlace")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDetectedEventRulePlaceRequest** | **CreateDetectedEventRulePlaceRequest**|  |

### Return type

**CreateDetectedEventRulePlaceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDetectedEventRuleReorder"></a>
# **createDetectedEventRuleReorder**
> CreateDetectedEventRuleReorderResponse createDetectedEventRuleReorder(createDetectedEventRuleReorderRequest)

Set the evaluation order: ids top-down, defaults included (ids from the rules list). Rules are re-numbered 10, 20, 30…; a default moved above one of your rules is stored as your edit. Returns the list.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val createDetectedEventRuleReorderRequest : CreateDetectedEventRuleReorderRequest =  // CreateDetectedEventRuleReorderRequest | 
try {
    val result : CreateDetectedEventRuleReorderResponse = apiInstance.createDetectedEventRuleReorder(createDetectedEventRuleReorderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createDetectedEventRuleReorder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createDetectedEventRuleReorder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDetectedEventRuleReorderRequest** | **CreateDetectedEventRuleReorderRequest**|  |

### Return type

**CreateDetectedEventRuleReorderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDetectedEventRuleResetDefault"></a>
# **createDetectedEventRuleResetDefault**
> CreateDetectedEventRuleReorderResponse createDetectedEventRuleResetDefault(createDetectedEventRuleResetDefaultRequest)

Drop your edits of the shipped default rules (keys, or all when omitted). Returns the list.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val createDetectedEventRuleResetDefaultRequest : CreateDetectedEventRuleResetDefaultRequest =  // CreateDetectedEventRuleResetDefaultRequest | 
try {
    val result : CreateDetectedEventRuleReorderResponse = apiInstance.createDetectedEventRuleResetDefault(createDetectedEventRuleResetDefaultRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createDetectedEventRuleResetDefault")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createDetectedEventRuleResetDefault")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDetectedEventRuleResetDefaultRequest** | **CreateDetectedEventRuleResetDefaultRequest**|  |

### Return type

**CreateDetectedEventRuleReorderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDetectedEventSimulate"></a>
# **createDetectedEventSimulate**
> CreateDetectedEventSimulateResponse createDetectedEventSimulate(createDetectedEventSimulateRequest)

Run one event through the rules without acting: the winning rule, rules it shadowed, the trace, the guards that held actions back and the plan per target with how it would run (direct / relay / ask / skip). event needs only kind; every axis left out takes its default. rules &#x3D; an unsaved draft list.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val createDetectedEventSimulateRequest : CreateDetectedEventSimulateRequest =  // CreateDetectedEventSimulateRequest | 
try {
    val result : CreateDetectedEventSimulateResponse = apiInstance.createDetectedEventSimulate(createDetectedEventSimulateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createDetectedEventSimulate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createDetectedEventSimulate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDetectedEventSimulateRequest** | **CreateDetectedEventSimulateRequest**|  |

### Return type

**CreateDetectedEventSimulateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDetectedEventSimulateImpact"></a>
# **createDetectedEventSimulateImpact**
> CreateDetectedEventSimulateImpactResponse createDetectedEventSimulateImpact(createDetectedEventSimulateImpactRequest)

What a rule edit would change: your detected events of the last days (default 30, at most 500) re-resolved against the draft rules and against the stored ones. Per event: winning rule and actions before and after, and whether it changed. Nothing runs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val createDetectedEventSimulateImpactRequest : CreateDetectedEventSimulateImpactRequest =  // CreateDetectedEventSimulateImpactRequest | 
try {
    val result : CreateDetectedEventSimulateImpactResponse = apiInstance.createDetectedEventSimulateImpact(createDetectedEventSimulateImpactRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createDetectedEventSimulateImpact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createDetectedEventSimulateImpact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDetectedEventSimulateImpactRequest** | **CreateDetectedEventSimulateImpactRequest**|  |

### Return type

**CreateDetectedEventSimulateImpactResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEmailEventConfirm"></a>
# **createEmailEventConfirm**
> CreateEmailEventConfirmResponse createEmailEventConfirm(id, createEmailEventConfirmRequest)

Confirm an email-detected event: re-run it as certain (a possible sale records the sale and delists the item elsewhere). When several listings could be meant, pass platformListingDbId to choose one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createEmailEventConfirmRequest : CreateEmailEventConfirmRequest =  // CreateEmailEventConfirmRequest | 
try {
    val result : CreateEmailEventConfirmResponse = apiInstance.createEmailEventConfirm(id, createEmailEventConfirmRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createEmailEventConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createEmailEventConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **createEmailEventConfirmRequest** | **CreateEmailEventConfirmRequest**|  |

### Return type

**CreateEmailEventConfirmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEmailEventDismiss"></a>
# **createEmailEventDismiss**
> IdStatusResponse createEmailEventDismiss(id)

Dismiss an email-detected event (\&quot;not a sale\&quot;): closes the card without acting.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : IdStatusResponse = apiInstance.createEmailEventDismiss(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createEmailEventDismiss")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createEmailEventDismiss")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**IdStatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createEventPolicyDecisionConfirm"></a>
# **createEventPolicyDecisionConfirm**
> CreateEventPolicyDecisionConfirmResponse createEventPolicyDecisionConfirm(id)

Confirm a review decision from a webhook, order poller or app relay (canConfirm true): the event runs again with the seller confirmed, so a review rule runs the strongest allowed non-review action for that cell. Returns the new decision. 409 when the decision was already confirmed or is not confirmable (email review decisions are confirmed on their review card).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateEventPolicyDecisionConfirmResponse = apiInstance.createEventPolicyDecisionConfirm(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#createEventPolicyDecisionConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#createEventPolicyDecisionConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateEventPolicyDecisionConfirmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDetectedEventRule"></a>
# **deleteDetectedEventRule**
> DeleteStoryResponse deleteDetectedEventRule(id)

Delete a detection rule. Deleting your edit of a default (its id, or default:&lt;key&gt;) brings the shipped default back; deleting a translated event-policy rule deletes that policy rule too.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteStoryResponse = apiInstance.deleteDetectedEventRule(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#deleteDetectedEventRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#deleteDetectedEventRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteStoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteEventPolicyRule"></a>
# **deleteEventPolicyRule**
> DeleteStoryResponse deleteEventPolicyRule(id)

Delete a rule: its cell falls back to the next scope (platform → global → the built-in default).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteStoryResponse = apiInstance.deleteEventPolicyRule(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#deleteEventPolicyRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#deleteEventPolicyRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**DeleteStoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionLog"></a>
# **getActionLog**
> ListActionLogItem getActionLog(id)

One Activity Log event by id, with &#x60;view&#x60; including its steps and, for bulk jobs, its children.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListActionLogItem = apiInstance.getActionLog(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#getActionLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#getActionLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListActionLogItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionLogExport"></a>
# **getActionLogExport**
> GetActionLogExportResponse getActionLogExport(exportId)

The state of one Activity Log export.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val exportId : kotlin.String = exportId_example // kotlin.String | 
try {
    val result : GetActionLogExportResponse = apiInstance.getActionLogExport(exportId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#getActionLogExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#getActionLogExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportId** | **kotlin.String**|  |

### Return type

**GetActionLogExportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionLogExportDownload"></a>
# **getActionLogExportDownload**
> GetActionLogExportDownloadResponse getActionLogExportDownload(exportId)

Download a finished Activity Log export (for 24 hours after it completes).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val exportId : kotlin.String = exportId_example // kotlin.String | 
try {
    val result : GetActionLogExportDownloadResponse = apiInstance.getActionLogExportDownload(exportId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#getActionLogExportDownload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#getActionLogExportDownload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportId** | **kotlin.String**|  |

### Return type

**GetActionLogExportDownloadResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionLogFacet"></a>
# **getActionLogFacet**
> GetActionLogFacetResponse getActionLogFacet()

Filter options of the caller&#39;s Activity Log (last 90 days): areas with their actions and counts, the team members who acted, platforms and outcomes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
try {
    val result : GetActionLogFacetResponse = apiInstance.getActionLogFacet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#getActionLogFacet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#getActionLogFacet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetActionLogFacetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDetectedEventEvent"></a>
# **getDetectedEventEvent**
> GetDetectedEventEventResponse getDetectedEventEvent(id)

One detected event with every report of it (first + corroborations, with correlation and contradiction), the guards that held actions back, the plan and each executed action&#39;s outcome and reversibility.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetDetectedEventEventResponse = apiInstance.getDetectedEventEvent(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#getDetectedEventEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#getDetectedEventEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetDetectedEventEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventPolicy"></a>
# **getEventPolicy**
> GetEventPolicyResponse getEventPolicy(platform, appId)

What Crossly does with each detected marketplace event (sale, listing ended, offer, cancellation, label, shipped, delivered, refund, return, payout, message), per who owns the item (crossly, imported, app_managed, other_tool, untracked). Each matrix cell lists the allowed actions and the effective one, with the scope it comes from (app &gt; platform &gt; global &gt; default). Pass platform (or appId) to see the matrix as that platform&#39;s (or app&#39;s) items see it. Also returns the rules, platforms and connected apps.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val appId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetEventPolicyResponse = apiInstance.getEventPolicy(platform, appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#getEventPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#getEventPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  | [optional]
 **appId** | **java.util.UUID**|  | [optional]

### Return type

**GetEventPolicyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listActionLog"></a>
# **listActionLog**
> ListActionLogResponse listActionLog(platform, action, category, area, status, source, targetType, targetId, actorUserId, q, since, until, at, cursor, limit, offset)

List Activity Log events, newest first. Each event carries &#x60;view&#x60; (title, sentence, fields, failure advice, who did it) and typed &#x60;detail&#x60;. Page with &#x60;cursor&#x60;; &#x60;pagination.total&#x60; counts matches.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val platform : kotlin.String = platform_example // kotlin.String | Platform id (`ebay`, `poshmark`, ...).
val action : kotlin.String = action_example // kotlin.String | A canonical action key (`listing.delist`, see the public action catalog) or a legacy action word.
val category : kotlin.String = category_example // kotlin.String | 
val area : kotlin.String = area_example // kotlin.String | A seller area: every action of that area (the grouped filter of the dashboard).
val status : kotlin.String = status_example // kotlin.String | 
val source : kotlin.String = source_example // kotlin.String | 
val targetType : kotlin.String = targetType_example // kotlin.String | With targetId: events about that object (any of their targets).
val targetId : kotlin.String = targetId_example // kotlin.String | 
val actorUserId : kotlin.String = actorUserId_example // kotlin.String | Only what one team member did.
val q : kotlin.String = q_example // kotlin.String | A search in the activity query language (`action:listing.* -outcome:failure \"free text\"`), ANDed with the other filters. POST /api/v1/action-log/search/translate turns a question in words into one.
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Inclusive lower bound on when the action happened.
val until : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Exclusive upper bound.
val at : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Jump to a time: the page starts at the newest event at or before it.
val cursor : kotlin.String = cursor_example // kotlin.String | `pagination.nextCursor` of the previous page.
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | Deprecated: use cursor. offset + limit may reach at most 1000 events.
try {
    val result : ListActionLogResponse = apiInstance.listActionLog(platform, action, category, area, status, source, targetType, targetId, actorUserId, q, since, until, at, cursor, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#listActionLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#listActionLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**| Platform id (&#x60;ebay&#x60;, &#x60;poshmark&#x60;, ...). | [optional]
 **action** | **kotlin.String**| A canonical action key (&#x60;listing.delist&#x60;, see the public action catalog) or a legacy action word. | [optional]
 **category** | **kotlin.String**|  | [optional]
 **area** | **kotlin.String**| A seller area: every action of that area (the grouped filter of the dashboard). | [optional] [enum: listings, inventory, orders, shipping, messages, automations, connections, settings, billing, account, emails]
 **status** | **kotlin.String**|  | [optional] [enum: pending, success, failure, partial, skipped]
 **source** | **kotlin.String**|  | [optional]
 **targetType** | **kotlin.String**| With targetId: events about that object (any of their targets). | [optional]
 **targetId** | **kotlin.String**|  | [optional]
 **actorUserId** | **kotlin.String**| Only what one team member did. | [optional]
 **q** | **kotlin.String**| A search in the activity query language (&#x60;action:listing.* -outcome:failure \&quot;free text\&quot;&#x60;), ANDed with the other filters. POST /api/v1/action-log/search/translate turns a question in words into one. | [optional]
 **since** | **java.time.OffsetDateTime**| Inclusive lower bound on when the action happened. | [optional]
 **until** | **java.time.OffsetDateTime**| Exclusive upper bound. | [optional]
 **at** | **java.time.OffsetDateTime**| Jump to a time: the page starts at the newest event at or before it. | [optional]
 **cursor** | **kotlin.String**| &#x60;pagination.nextCursor&#x60; of the previous page. | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **offset** | **kotlin.Int**| Deprecated: use cursor. offset + limit may reach at most 1000 events. | [optional]

### Return type

**ListActionLogResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listActionLogCalls"></a>
# **listActionLogCalls**
> ListActionLogCallsResponse listActionLogCalls(id)

The outbound platform HTTP calls under an event (oldest first) — platform, operation, method, host, status, latency, error class/message, proxy + recipe id. Answers \&quot;what was sent / what went wrong\&quot;. The URL path, request/response bodies and persisted-query hash are never returned.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListActionLogCallsResponse = apiInstance.listActionLogCalls(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#listActionLogCalls")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#listActionLogCalls")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListActionLogCallsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listActionLogHistogram"></a>
# **listActionLogHistogram**
> ListActionLogHistogramResponse listActionLogHistogram(platform, action, category, area, status, source, targetType, targetId, actorUserId, q, since, until)

Events per UTC day for the list filters (default: the last 30 days; at most 366).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val platform : kotlin.String = platform_example // kotlin.String | Platform id (`ebay`, `poshmark`, ...).
val action : kotlin.String = action_example // kotlin.String | A canonical action key (`listing.delist`, see the public action catalog) or a legacy action word.
val category : kotlin.String = category_example // kotlin.String | 
val area : kotlin.String = area_example // kotlin.String | A seller area: every action of that area (the grouped filter of the dashboard).
val status : kotlin.String = status_example // kotlin.String | 
val source : kotlin.String = source_example // kotlin.String | 
val targetType : kotlin.String = targetType_example // kotlin.String | With targetId: events about that object (any of their targets).
val targetId : kotlin.String = targetId_example // kotlin.String | 
val actorUserId : kotlin.String = actorUserId_example // kotlin.String | Only what one team member did.
val q : kotlin.String = q_example // kotlin.String | A search in the activity query language (`action:listing.* -outcome:failure \"free text\"`), ANDed with the other filters. POST /api/v1/action-log/search/translate turns a question in words into one.
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Inclusive lower bound on when the action happened.
val until : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Exclusive upper bound.
try {
    val result : ListActionLogHistogramResponse = apiInstance.listActionLogHistogram(platform, action, category, area, status, source, targetType, targetId, actorUserId, q, since, until)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#listActionLogHistogram")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#listActionLogHistogram")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**| Platform id (&#x60;ebay&#x60;, &#x60;poshmark&#x60;, ...). | [optional]
 **action** | **kotlin.String**| A canonical action key (&#x60;listing.delist&#x60;, see the public action catalog) or a legacy action word. | [optional]
 **category** | **kotlin.String**|  | [optional]
 **area** | **kotlin.String**| A seller area: every action of that area (the grouped filter of the dashboard). | [optional] [enum: listings, inventory, orders, shipping, messages, automations, connections, settings, billing, account, emails]
 **status** | **kotlin.String**|  | [optional] [enum: pending, success, failure, partial, skipped]
 **source** | **kotlin.String**|  | [optional]
 **targetType** | **kotlin.String**| With targetId: events about that object (any of their targets). | [optional]
 **targetId** | **kotlin.String**|  | [optional]
 **actorUserId** | **kotlin.String**| Only what one team member did. | [optional]
 **q** | **kotlin.String**| A search in the activity query language (&#x60;action:listing.* -outcome:failure \&quot;free text\&quot;&#x60;), ANDed with the other filters. POST /api/v1/action-log/search/translate turns a question in words into one. | [optional]
 **since** | **java.time.OffsetDateTime**| Inclusive lower bound on when the action happened. | [optional]
 **until** | **java.time.OffsetDateTime**| Exclusive upper bound. | [optional]

### Return type

**ListActionLogHistogramResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDetectedEventEvents"></a>
# **listDetectedEventEvents**
> ListDetectedEventEventsResponse listDetectedEventEvents(kinds, platforms, accounts, statuses, since, cursor, limit)

Every event Crossly detected (sales, order changes, listing changes, offers, messages, account notices), newest first: all its axes, the rule that decided it, its corroborating reports, the plan per target and how each action went, with canConfirm (an open ask) and canUndo. Cursor-paged; filter by kinds, platforms statuses and accounts (comma-separated) and since (ISO time).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val kinds : kotlin.String = kinds_example // kotlin.String | 
val platforms : kotlin.String = platforms_example // kotlin.String | 
val accounts : kotlin.String = accounts_example // kotlin.String | Comma-separated platform account ids (scope.account).
val statuses : kotlin.String = statuses_example // kotlin.String | Comma-separated: acted, held, asked, confirmed, ignored, undone, failed, received, corrected
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListDetectedEventEventsResponse = apiInstance.listDetectedEventEvents(kinds, platforms, accounts, statuses, since, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#listDetectedEventEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#listDetectedEventEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kinds** | **kotlin.String**|  | [optional]
 **platforms** | **kotlin.String**|  | [optional]
 **accounts** | **kotlin.String**| Comma-separated platform account ids (scope.account). | [optional]
 **statuses** | **kotlin.String**| Comma-separated: acted, held, asked, confirmed, ignored, undone, failed, received, corrected | [optional]
 **since** | **java.time.OffsetDateTime**|  | [optional]
 **cursor** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListDetectedEventEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDetectedEventRules"></a>
# **listDetectedEventRules**
> ListDetectedEventRulesResponse listDetectedEventRules()

The seller&#39;s detection rules, top-down in the order they are evaluated (first match wins unless a rule says continue): the seller&#39;s own rules, translations of their event-policy rules (source legacy), then the shipped default set (source default, ids default:&lt;key&gt;; a stored edit of a default replaces it). Each rule has a filter (event kinds, platforms, accounts, apps, tags, items), an optional condition over any event axis, the actions it runs (then / else) and its guard loosenings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
try {
    val result : ListDetectedEventRulesResponse = apiInstance.listDetectedEventRules()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#listDetectedEventRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#listDetectedEventRules")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListDetectedEventRulesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEmailEvents"></a>
# **listEmailEvents**
> ListEmailEventsResponse listEmailEvents(status)

List email-detected events waiting for the seller (status&#x3D;needs_review): a possible sale, ended listing, cancellation or other event an email reported that was not certain enough to act on automatically.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val status : kotlin.String = status_example // kotlin.String | 
try {
    val result : ListEmailEventsResponse = apiInstance.listEmailEvents(status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#listEmailEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#listEmailEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **kotlin.String**|  | [optional] [default to needs_review] [enum: needs_review]

### Return type

**ListEmailEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEventPolicyDecisions"></a>
# **listEventPolicyDecisions**
> ListEventPolicyDecisionsResponse listEventPolicyDecisions(cursor, limit, event, ownership, platform, outcome)

The decision log, newest first: for each detected event, what the rule or default asked for, what was done (after capability fallback and the email confidence ceiling), the rule that decided it, and the outcome (done / skipped / failed / review). Cursor-paged; filter by event, ownership, platform or outcome (outcome&#x3D;review: still waiting for the seller). Kept 90 days.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val cursor : kotlin.String = cursor_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val event : kotlin.String = event_example // kotlin.String | 
val ownership : kotlin.String = ownership_example // kotlin.String | 
val platform : kotlin.String = platform_example // kotlin.String | 
val outcome : kotlin.String = outcome_example // kotlin.String | 
try {
    val result : ListEventPolicyDecisionsResponse = apiInstance.listEventPolicyDecisions(cursor, limit, event, ownership, platform, outcome)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#listEventPolicyDecisions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#listEventPolicyDecisions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]
 **event** | **kotlin.String**|  | [optional] [enum: sale, listing_ended, offer, order_cancelled, label_ready, shipped, delivered, refunded, return_opened, payout_sent, message]
 **ownership** | **kotlin.String**|  | [optional] [enum: crossly, imported, app_managed, other_tool, untracked]
 **platform** | **kotlin.String**|  | [optional]
 **outcome** | **kotlin.String**|  | [optional] [enum: done, skipped, failed, review]

### Return type

**ListEventPolicyDecisionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDetectedEventRule"></a>
# **updateDetectedEventRule**
> CreateDetectedEventRuleResponse updateDetectedEventRule(id, createDetectedEventRuleRequest)

Replace a detection rule. An id default:&lt;key&gt; stores your edit of that shipped default (delete it, or reset-defaults, to go back to the shipped one).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val id : kotlin.String = id_example // kotlin.String | 
val createDetectedEventRuleRequest : CreateDetectedEventRuleRequest =  // CreateDetectedEventRuleRequest | 
try {
    val result : CreateDetectedEventRuleResponse = apiInstance.updateDetectedEventRule(id, createDetectedEventRuleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#updateDetectedEventRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#updateDetectedEventRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **createDetectedEventRuleRequest** | **CreateDetectedEventRuleRequest**|  |

### Return type

**CreateDetectedEventRuleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEventPolicyRule"></a>
# **updateEventPolicyRule**
> UpdateEventPolicyRuleResponse updateEventPolicyRule(updateEventPolicyRuleRequest)

Set what Crossly does with one kind of detected event for one kind of item: scope global (scopeValue null), platform (scopeValue &#x3D; platform id) or app (scopeValue &#x3D; OAuth app id, app_managed items only). Replaces the rule for the same cell and scope. The action must be one the matrix allows for that cell; import actions exist only for untracked items.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ActivityApi()
val updateEventPolicyRuleRequest : UpdateEventPolicyRuleRequest =  // UpdateEventPolicyRuleRequest | 
try {
    val result : UpdateEventPolicyRuleResponse = apiInstance.updateEventPolicyRule(updateEventPolicyRuleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#updateEventPolicyRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#updateEventPolicyRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateEventPolicyRuleRequest** | **UpdateEventPolicyRuleRequest**|  |

### Return type

**UpdateEventPolicyRuleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

