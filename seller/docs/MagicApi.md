# MagicApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMagicAutoDecisionUndo**](MagicApi.md#createMagicAutoDecisionUndo) | **POST** /v1/magic/auto/decisions/{decisionId}/undo | Undo an automated Magic List decision, deleting its unpublished draft.
[**createMagicAutoItem**](MagicApi.md#createMagicAutoItem) | **POST** /v1/magic/auto/items | Scan one item and match it automatically (drafts only, never publishes).
[**createMagicAutoRun**](MagicApi.md#createMagicAutoRun) | **POST** /v1/magic/auto/runs/{runId} | Score a Magic List run automatically; a confident match in auto mode becomes a draft.
[**createMagicAutoRunSwipe**](MagicApi.md#createMagicAutoRunSwipe) | **POST** /v1/magic/auto/runs/{runId}/swipes | Record a seller swipe session (kept and rejected match keys) for a Magic List run.
[**createMagicScan**](MagicApi.md#createMagicScan) | **POST** /v1/magic/scan | Run a Magic List image scan.
[**createMagicScanSynthesize**](MagicApi.md#createMagicScanSynthesize) | **POST** /v1/magic/scan/{runId}/synthesize | Synthesize a draft from confirmed matches.
[**getMagicAutoSetting**](MagicApi.md#getMagicAutoSetting) | **GET** /v1/magic/auto/settings | The seller’s Magic List automated-matching mode.
[**getMagicDraft**](MagicApi.md#getMagicDraft) | **GET** /v1/magic/drafts/{draftId} | Get a synthesized Magic List draft.
[**listMagicAutoRunDecisions**](MagicApi.md#listMagicAutoRunDecisions) | **GET** /v1/magic/auto/runs/{runId}/decisions | Every match decision round (automated and seller) for a Magic List run.
[**listMagicRecent**](MagicApi.md#listMagicRecent) | **GET** /v1/magic/recent | Recent Magic List scans for this seller.
[**updateMagicAutoSetting**](MagicApi.md#updateMagicAutoSetting) | **PUT** /v1/magic/auto/settings | Set the Magic List automated-matching mode (off | auto | review_all).


<a name="createMagicAutoDecisionUndo"></a>
# **createMagicAutoDecisionUndo**
> CreateMagicAutoDecisionUndoResponse createMagicAutoDecisionUndo(decisionId)

Undo an automated Magic List decision, deleting its unpublished draft.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
val decisionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateMagicAutoDecisionUndoResponse = apiInstance.createMagicAutoDecisionUndo(decisionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#createMagicAutoDecisionUndo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#createMagicAutoDecisionUndo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionId** | **java.util.UUID**|  |

### Return type

**CreateMagicAutoDecisionUndoResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMagicAutoItem"></a>
# **createMagicAutoItem**
> CreateMagicAutoItemResponse createMagicAutoItem()

Scan one item and match it automatically (drafts only, never publishes).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
try {
    val result : CreateMagicAutoItemResponse = apiInstance.createMagicAutoItem()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#createMagicAutoItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#createMagicAutoItem")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateMagicAutoItemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMagicAutoRun"></a>
# **createMagicAutoRun**
> CreateMagicAutoRunResponse createMagicAutoRun(runId)

Score a Magic List run automatically; a confident match in auto mode becomes a draft.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
val runId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateMagicAutoRunResponse = apiInstance.createMagicAutoRun(runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#createMagicAutoRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#createMagicAutoRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **java.util.UUID**|  |

### Return type

**CreateMagicAutoRunResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMagicAutoRunSwipe"></a>
# **createMagicAutoRunSwipe**
> CreateMagicAutoRunSwipeResponse createMagicAutoRunSwipe(runId)

Record a seller swipe session (kept and rejected match keys) for a Magic List run.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
val runId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateMagicAutoRunSwipeResponse = apiInstance.createMagicAutoRunSwipe(runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#createMagicAutoRunSwipe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#createMagicAutoRunSwipe")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **java.util.UUID**|  |

### Return type

**CreateMagicAutoRunSwipeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMagicScan"></a>
# **createMagicScan**
> CreateMagicScanResponse createMagicScan()

Run a Magic List image scan.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
try {
    val result : CreateMagicScanResponse = apiInstance.createMagicScan()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#createMagicScan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#createMagicScan")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateMagicScanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMagicScanSynthesize"></a>
# **createMagicScanSynthesize**
> CreateMagicScanSynthesizeResponse createMagicScanSynthesize(runId)

Synthesize a draft from confirmed matches.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
val runId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateMagicScanSynthesizeResponse = apiInstance.createMagicScanSynthesize(runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#createMagicScanSynthesize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#createMagicScanSynthesize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **java.util.UUID**|  |

### Return type

**CreateMagicScanSynthesizeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMagicAutoSetting"></a>
# **getMagicAutoSetting**
> GetMagicAutoSettingResponse getMagicAutoSetting()

The seller’s Magic List automated-matching mode.

mode: off (every match is swiped by hand), auto (confident matches become DRAFTS on their own, never published, always undoable) or review_all (Crossly pre-marks its picks; the seller confirms). Default review_all.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
try {
    val result : GetMagicAutoSettingResponse = apiInstance.getMagicAutoSetting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#getMagicAutoSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#getMagicAutoSetting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetMagicAutoSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMagicDraft"></a>
# **getMagicDraft**
> GetMagicDraftResponse getMagicDraft(draftId)

Get a synthesized Magic List draft.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
val draftId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetMagicDraftResponse = apiInstance.getMagicDraft(draftId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#getMagicDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#getMagicDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **java.util.UUID**|  |

### Return type

**GetMagicDraftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMagicAutoRunDecisions"></a>
# **listMagicAutoRunDecisions**
> ListMagicAutoRunDecisionsResponse listMagicAutoRunDecisions(runId)

Every match decision round (automated and seller) for a Magic List run.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
val runId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListMagicAutoRunDecisionsResponse = apiInstance.listMagicAutoRunDecisions(runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#listMagicAutoRunDecisions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#listMagicAutoRunDecisions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **java.util.UUID**|  |

### Return type

**ListMagicAutoRunDecisionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMagicRecent"></a>
# **listMagicRecent**
> ListMagicRecentResponse listMagicRecent()

Recent Magic List scans for this seller.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
try {
    val result : ListMagicRecentResponse = apiInstance.listMagicRecent()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#listMagicRecent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#listMagicRecent")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListMagicRecentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMagicAutoSetting"></a>
# **updateMagicAutoSetting**
> GetMagicAutoSettingResponse updateMagicAutoSetting(updateMagicAutoSettingRequest)

Set the Magic List automated-matching mode (off | auto | review_all).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
val updateMagicAutoSettingRequest : UpdateMagicAutoSettingRequest =  // UpdateMagicAutoSettingRequest | 
try {
    val result : GetMagicAutoSettingResponse = apiInstance.updateMagicAutoSetting(updateMagicAutoSettingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MagicApi#updateMagicAutoSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MagicApi#updateMagicAutoSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateMagicAutoSettingRequest** | **UpdateMagicAutoSettingRequest**|  |

### Return type

**GetMagicAutoSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

