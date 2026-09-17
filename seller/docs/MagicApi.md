# MagicApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMagicScan**](MagicApi.md#createMagicScan) | **POST** /v1/magic/scan | Run a Magic List image scan.
[**createMagicScanSynthesize**](MagicApi.md#createMagicScanSynthesize) | **POST** /v1/magic/scan/{runId}/synthesize | Synthesize a draft from confirmed matches.
[**getMagicDraft**](MagicApi.md#getMagicDraft) | **GET** /v1/magic/drafts/{draftId} | Get a synthesized Magic List draft.
[**listMagicRecent**](MagicApi.md#listMagicRecent) | **GET** /v1/magic/recent | Recent Magic List scans for this seller.


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

[**CreateMagicScanResponse**](CreateMagicScanResponse.md)

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

[**CreateMagicScanSynthesizeResponse**](CreateMagicScanSynthesizeResponse.md)

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

[**GetMagicDraftResponse**](GetMagicDraftResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMagicRecent"></a>
# **listMagicRecent**
> V1List listMagicRecent()

Recent Magic List scans for this seller.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MagicApi()
try {
    val result : V1List = apiInstance.listMagicRecent()
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

