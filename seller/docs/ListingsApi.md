# ListingsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createListing**](ListingsApi.md#createListing) | **POST** /v1/listings | Create a listing and fan out crosspost jobs across platforms.
[**createListingBulkCheckStatus**](ListingsApi.md#createListingBulkCheckStatus) | **POST** /v1/listings/bulk-check-status | Check listing status on platforms
[**createListingBulkCrosspost**](ListingsApi.md#createListingBulkCrosspost) | **POST** /v1/listings/bulk-crosspost | Bulk crosspost (no delist phase)
[**createListingBulkDelete**](ListingsApi.md#createListingBulkDelete) | **POST** /v1/listings/bulk-delete | Bulk archive + delist
[**createListingBulkDelist**](ListingsApi.md#createListingBulkDelist) | **POST** /v1/listings/bulk-delist | Bulk delist from platforms
[**createListingBulkDelistPreview**](ListingsApi.md#createListingBulkDelistPreview) | **POST** /v1/listings/bulk-delist-preview | Preview which marketplaces a delist would touch
[**createListingBulkHardDelete**](ListingsApi.md#createListingBulkHardDelete) | **POST** /v1/listings/bulk-hard-delete | Permanently delete archived listings
[**createListingBulkRelist**](ListingsApi.md#createListingBulkRelist) | **POST** /v1/listings/bulk-relist | Bulk relist across platforms
[**createListingBulkUpdate**](ListingsApi.md#createListingBulkUpdate) | **POST** /v1/listings/bulk-update | Bulk update listing fields
[**createListingById**](ListingsApi.md#createListingById) | **POST** /v1/listings/by-ids | Fetch hydrated listings by ID
[**createListingCheckDuplicate**](ListingsApi.md#createListingCheckDuplicate) | **POST** /v1/listings/check-duplicates | Check whether the seller already owns something matching this title/photo, and what to do about it.
[**createListingCombine**](ListingsApi.md#createListingCombine) | **POST** /v1/listings/combine | Combine duplicate listings into one: sums their stock, delists and archives the rest.
[**createListingDiscrepancyResolve**](ListingsApi.md#createListingDiscrepancyResolve) | **POST** /v1/listings/{id}/discrepancies/{discrepancyId}/resolve | Resolve a detected marketplace-drift discrepancy: accept the platform value, push ours back, relist to apply it, or dismiss.
[**createListingImportByUrl**](ListingsApi.md#createListingImportByUrl) | **POST** /v1/listings/{id}/import-by-url | Attach a real platform listing to this listing by pasting its live URL.
[**createListingMagicFill**](ListingsApi.md#createListingMagicFill) | **POST** /v1/listings/{id}/magic-fill | Auto-fill empty fields on one platform tab from the master listing + AI/deterministic taxonomy resolution.
[**deleteListing**](ListingsApi.md#deleteListing) | **DELETE** /v1/listings/{id} | Delist a listing (optionally narrowed to specific platforms via ?platforms&#x3D;).
[**getListing**](ListingsApi.md#getListing) | **GET** /v1/listings/{id} | Get one listing with its platform rows.
[**getListingFacet**](ListingsApi.md#getListingFacet) | **GET** /v1/listings/facets | Distinct brands + categories across listings + inventory.
[**getListingSkuExist**](ListingsApi.md#getListingSkuExist) | **GET** /v1/listings/sku-exists | Check whether a SKU is already used by one of this user&#39;s items.
[**listListingDiscrepancies**](ListingsApi.md#listListingDiscrepancies) | **GET** /v1/listings/{id}/discrepancies | List detected marketplace-drift discrepancies for a listing.
[**listListingIds**](ListingsApi.md#listListingIds) | **GET** /v1/listings/ids | Filter listings → return matching id list (no pagination).
[**listListings**](ListingsApi.md#listListings) | **GET** /v1/listings | List active platform listings.
[**updateListing**](ListingsApi.md#updateListing) | **PATCH** /v1/listings/{id} | Edit a listing and fan out update jobs to existing platform listings.


<a name="createListing"></a>
# **createListing**
> CreateListingResponse createListing()

Create a listing and fan out crosspost jobs across platforms.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingResponse = apiInstance.createListing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingResponse**](CreateListingResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkCheckStatus"></a>
# **createListingBulkCheckStatus**
> CreateListingBulkCheckStatusResponse createListingBulkCheckStatus()

Check listing status on platforms

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkCheckStatusResponse = apiInstance.createListingBulkCheckStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingBulkCheckStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingBulkCheckStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingBulkCheckStatusResponse**](CreateListingBulkCheckStatusResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkCrosspost"></a>
# **createListingBulkCrosspost**
> CreateListingBulkCrosspostResponse createListingBulkCrosspost()

Bulk crosspost (no delist phase)

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkCrosspostResponse = apiInstance.createListingBulkCrosspost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingBulkCrosspost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingBulkCrosspost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingBulkCrosspostResponse**](CreateListingBulkCrosspostResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkDelete"></a>
# **createListingBulkDelete**
> CreateListingBulkDeleteResponse createListingBulkDelete()

Bulk archive + delist

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkDeleteResponse = apiInstance.createListingBulkDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingBulkDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingBulkDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingBulkDeleteResponse**](CreateListingBulkDeleteResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkDelist"></a>
# **createListingBulkDelist**
> CreateListingBulkDelistResponse createListingBulkDelist()

Bulk delist from platforms

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkDelistResponse = apiInstance.createListingBulkDelist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingBulkDelist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingBulkDelist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingBulkDelistResponse**](CreateListingBulkDelistResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkDelistPreview"></a>
# **createListingBulkDelistPreview**
> CreateListingBulkDelistPreviewResponse createListingBulkDelistPreview()

Preview which marketplaces a delist would touch

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkDelistPreviewResponse = apiInstance.createListingBulkDelistPreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingBulkDelistPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingBulkDelistPreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingBulkDelistPreviewResponse**](CreateListingBulkDelistPreviewResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkHardDelete"></a>
# **createListingBulkHardDelete**
> CreateListingBulkHardDeleteResponse createListingBulkHardDelete()

Permanently delete archived listings

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkHardDeleteResponse = apiInstance.createListingBulkHardDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingBulkHardDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingBulkHardDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingBulkHardDeleteResponse**](CreateListingBulkHardDeleteResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkRelist"></a>
# **createListingBulkRelist**
> CreateListingBulkRelistResponse createListingBulkRelist()

Bulk relist across platforms

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkRelistResponse = apiInstance.createListingBulkRelist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingBulkRelist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingBulkRelist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingBulkRelistResponse**](CreateListingBulkRelistResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkUpdate"></a>
# **createListingBulkUpdate**
> CreateListingBulkUpdateResponse createListingBulkUpdate()

Bulk update listing fields

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkUpdateResponse = apiInstance.createListingBulkUpdate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingBulkUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingBulkUpdate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingBulkUpdateResponse**](CreateListingBulkUpdateResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingById"></a>
# **createListingById**
> CreateListingByIdResponse createListingById()

Fetch hydrated listings by ID

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingByIdResponse = apiInstance.createListingById()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingById")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingByIdResponse**](CreateListingByIdResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingCheckDuplicate"></a>
# **createListingCheckDuplicate**
> CreateListingCheckDuplicateResponse createListingCheckDuplicate()

Check whether the seller already owns something matching this title/photo, and what to do about it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingCheckDuplicateResponse = apiInstance.createListingCheckDuplicate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingCheckDuplicate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingCheckDuplicate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingCheckDuplicateResponse**](CreateListingCheckDuplicateResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingCombine"></a>
# **createListingCombine**
> CreateListingCombineResponse createListingCombine()

Combine duplicate listings into one: sums their stock, delists and archives the rest.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingCombineResponse = apiInstance.createListingCombine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingCombine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingCombine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateListingCombineResponse**](CreateListingCombineResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingDiscrepancyResolve"></a>
# **createListingDiscrepancyResolve**
> CreateListingDiscrepancyResolveResponse createListingDiscrepancyResolve(id, discrepancyId)

Resolve a detected marketplace-drift discrepancy: accept the platform value, push ours back, relist to apply it, or dismiss.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discrepancyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateListingDiscrepancyResolveResponse = apiInstance.createListingDiscrepancyResolve(id, discrepancyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingDiscrepancyResolve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingDiscrepancyResolve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **discrepancyId** | **java.util.UUID**|  |

### Return type

[**CreateListingDiscrepancyResolveResponse**](CreateListingDiscrepancyResolveResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingImportByUrl"></a>
# **createListingImportByUrl**
> CreateListingImportByUrlResponse createListingImportByUrl(id)

Attach a real platform listing to this listing by pasting its live URL.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateListingImportByUrlResponse = apiInstance.createListingImportByUrl(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingImportByUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingImportByUrl")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateListingImportByUrlResponse**](CreateListingImportByUrlResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingMagicFill"></a>
# **createListingMagicFill**
> CreateListingMagicFillResponse createListingMagicFill(id)

Auto-fill empty fields on one platform tab from the master listing + AI/deterministic taxonomy resolution.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateListingMagicFillResponse = apiInstance.createListingMagicFill(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingMagicFill")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingMagicFill")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateListingMagicFillResponse**](CreateListingMagicFillResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteListing"></a>
# **deleteListing**
> DeleteListingResponse deleteListing(id, platforms)

Delist a listing (optionally narrowed to specific platforms via ?platforms&#x3D;).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val platforms : kotlin.String = platforms_example // kotlin.String | Comma-separated platform slugs to limit the delist fan-out.
try {
    val result : DeleteListingResponse = apiInstance.deleteListing(id, platforms)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#deleteListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#deleteListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **platforms** | **kotlin.String**| Comma-separated platform slugs to limit the delist fan-out. | [optional]

### Return type

[**DeleteListingResponse**](DeleteListingResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListing"></a>
# **getListing**
> GetListingResponse getListing(id)

Get one listing with its platform rows.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetListingResponse = apiInstance.getListing(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetListingResponse**](GetListingResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListingFacet"></a>
# **getListingFacet**
> GetListingFacetResponse getListingFacet()

Distinct brands + categories across listings + inventory.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : GetListingFacetResponse = apiInstance.getListingFacet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getListingFacet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getListingFacet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetListingFacetResponse**](GetListingFacetResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListingSkuExist"></a>
# **getListingSkuExist**
> GetListingSkuExistResponse getListingSkuExist(sku)

Check whether a SKU is already used by one of this user&#39;s items.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val sku : kotlin.String = sku_example // kotlin.String | 
try {
    val result : GetListingSkuExistResponse = apiInstance.getListingSkuExist(sku)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getListingSkuExist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getListingSkuExist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sku** | **kotlin.String**|  |

### Return type

[**GetListingSkuExistResponse**](GetListingSkuExistResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListingDiscrepancies"></a>
# **listListingDiscrepancies**
> V1List listListingDiscrepancies(id)

List detected marketplace-drift discrepancies for a listing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : V1List = apiInstance.listListingDiscrepancies(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listListingDiscrepancies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listListingDiscrepancies")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListingIds"></a>
# **listListingIds**
> V1List listListingIds()

Filter listings → return matching id list (no pagination).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : V1List = apiInstance.listListingIds()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listListingIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listListingIds")
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

<a name="listListings"></a>
# **listListings**
> V1List listListings(page, limit, platform, status)

List active platform listings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val platform : kotlin.String = platform_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
try {
    val result : V1List = apiInstance.listListings(page, limit, platform, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listListings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional] [default to 1]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]
 **platform** | **kotlin.String**|  | [optional]
 **status** | **kotlin.String**|  | [optional]

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateListing"></a>
# **updateListing**
> UpdateListingResponse updateListing(id)

Edit a listing and fan out update jobs to existing platform listings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateListingResponse = apiInstance.updateListing(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updateListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updateListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdateListingResponse**](UpdateListingResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

