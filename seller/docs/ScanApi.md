# ScanApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listScanCaptures**](ScanApi.md#listScanCaptures) | **GET** /v1/scan/captures | Your capture sessions and what they produced.
[**listScanModels**](ScanApi.md#listScanModels) | **GET** /v1/scan/models | Which items already have a 3D model.


<a name="listScanCaptures"></a>
# **listScanCaptures**
> ListScanCapturesResponse listScanCaptures(status, limit)

Your capture sessions and what they produced.

One row per scan, newest first. &#x60;status&#x60; is capturing | uploaded | processing | ready | failed | rejected; &#x60;rejectReason&#x60; says why in the same words the seller was shown. A capture that reports &#x60;ready&#x60; with no mesh is normal — most items are textured onto a known shape rather than having geometry generated, which is cheaper and looks the same. When an item that WOULD have been generated was not, &#x60;generationSkipped&#x60; says why: out of monthly allowance, too few distinct angles, or you had already had a model built from this object.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ScanApi()
val status : kotlin.String = status_example // kotlin.String | Filter to one status.
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListScanCapturesResponse = apiInstance.listScanCaptures(status, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScanApi#listScanCaptures")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScanApi#listScanCaptures")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **kotlin.String**| Filter to one status. | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]

### Return type

**ListScanCapturesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listScanModels"></a>
# **listScanModels**
> ListScanModelsResponse listScanModels(variantIds, inventoryItemIds)

Which items already have a 3D model.

Ask by CATALOGUE variant (&#x60;variantIds&#x60;) or by your own inventory rows (&#x60;inventoryItemIds&#x60;), comma separated, up to 200 of each. At least one is required. Returns only the ones that have a model. The two are different KINDS of answer. A catalogue model belongs to the product and is shared: a hit means your listing gets it with nothing to capture, because somebody else already paid to generate it. An inventory model belongs to one of your rows, because an object with no catalogue identity — a lamp, a one-off — is not a product anyone else can claim. &#x60;longestEdgeMm&#x60; is present only when a capture MEASURED the item against something of known size; null means the mesh has correct proportions and no real-world scale.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ScanApi()
val variantIds : kotlin.String = variantIds_example // kotlin.String | Comma-separated catalogue variant ids, max 200.
val inventoryItemIds : kotlin.String = inventoryItemIds_example // kotlin.String | Comma-separated inventory item ids, max 200.
try {
    val result : ListScanModelsResponse = apiInstance.listScanModels(variantIds, inventoryItemIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScanApi#listScanModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScanApi#listScanModels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantIds** | **kotlin.String**| Comma-separated catalogue variant ids, max 200. | [optional]
 **inventoryItemIds** | **kotlin.String**| Comma-separated inventory item ids, max 200. | [optional]

### Return type

**ListScanModelsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

