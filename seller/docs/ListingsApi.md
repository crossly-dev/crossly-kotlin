# ListingsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAiDetectionDispute**](ListingsApi.md#createAiDetectionDispute) | **POST** /v1/ai-detections/{id}/dispute | Dispute an AI-image detection on your photo (sends it to Crossly review).
[**createListing**](ListingsApi.md#createListing) | **POST** /v1/listings | Create a listing and fan out crosspost jobs across platforms.
[**createListingBulkCheckStatus**](ListingsApi.md#createListingBulkCheckStatus) | **POST** /v1/listings/bulk-check-status | Check listing status on platforms
[**createListingBulkCrosspost**](ListingsApi.md#createListingBulkCrosspost) | **POST** /v1/listings/bulk-crosspost | Bulk crosspost (no delist phase)
[**createListingBulkDelete**](ListingsApi.md#createListingBulkDelete) | **POST** /v1/listings/bulk-delete | Bulk archive + delist
[**createListingBulkDelist**](ListingsApi.md#createListingBulkDelist) | **POST** /v1/listings/bulk-delist | Bulk delist from platforms
[**createListingBulkDelistPreview**](ListingsApi.md#createListingBulkDelistPreview) | **POST** /v1/listings/bulk-delist-preview | Preview which marketplaces a delist would touch
[**createListingBulkHardDelete**](ListingsApi.md#createListingBulkHardDelete) | **POST** /v1/listings/bulk-hard-delete | Permanently delete listings (live ones need allowLive)
[**createListingBulkRelist**](ListingsApi.md#createListingBulkRelist) | **POST** /v1/listings/bulk-relist | Bulk relist across platforms
[**createListingBulkUpdate**](ListingsApi.md#createListingBulkUpdate) | **POST** /v1/listings/bulk-update | Bulk update listing fields
[**createListingById**](ListingsApi.md#createListingById) | **POST** /v1/listings/by-ids | Fetch hydrated listings by ID
[**createListingCheckDuplicate**](ListingsApi.md#createListingCheckDuplicate) | **POST** /v1/listings/check-duplicates | Check whether the seller already owns something matching this title/photo, and what to do about it.
[**createListingCombine**](ListingsApi.md#createListingCombine) | **POST** /v1/listings/combine | Combine duplicate listings into one: sums their stock, delists and archives the rest.
[**createListingDiscrepancyResolve**](ListingsApi.md#createListingDiscrepancyResolve) | **POST** /v1/listings/{id}/discrepancies/{discrepancyId}/resolve | Resolve a detected marketplace-drift discrepancy: accept the platform value, push ours back, relist to apply it, or dismiss.
[**createListingImportByUrl**](ListingsApi.md#createListingImportByUrl) | **POST** /v1/listings/{id}/import-by-url | Attach a real platform listing to this listing by pasting its live URL.
[**createListingMagicFill**](ListingsApi.md#createListingMagicFill) | **POST** /v1/listings/{id}/magic-fill | Auto-fill empty fields on one platform tab from the master listing + AI/deterministic taxonomy resolution.
[**createListingMerge**](ListingsApi.md#createListingMerge) | **POST** /v1/listings/merge | Merge the same item listed on different marketplaces into one listing; all stay live.
[**createLiveStreamPinLaunch**](ListingsApi.md#createLiveStreamPinLaunch) | **POST** /v1/live-streams/{id}/pin-launch | Pin one of your live NFT launches on your live show; viewers mint it from the stream. Returns &#x60;{ ok }&#x60;.
[**createPassport**](ListingsApi.md#createPassport) | **POST** /v1/passports | Register a product passport for a Crossly listing you sell, optionally bound to an NFC tag UID (hex). Returns the URL to write to the NFC tag or print as a QR; ownership then follows the item’s paid sales.
[**createPassportRevoke**](ListingsApi.md#createPassportRevoke) | **POST** /v1/passports/{id}/revoke | Revoke a passport (a lost or misprinted tag). Refused once the item has sold — the passport is then part of its history.
[**createPassportTag**](ListingsApi.md#createPassportTag) | **POST** /v1/passports/{id}/tag | Bind (or re-bind) a passport to the NFC tag you wrote its nfcUrl to: the tag UID (hex), and whether you locked the tag read-only. Refused once the item has sold, for a locked tag, or a tag already on another item.
[**createVariationGroup**](ListingsApi.md#createVariationGroup) | **POST** /v1/variation-groups | Group listings you already have: a variation (one product, an axis such as Size) or a purchase-rule group (\&quot;buy any 3\&quot;).
[**createVariationGroupGenerate**](ListingsApi.md#createVariationGroupGenerate) | **POST** /v1/variation-groups/generate | Turn one listing into a variation group: each new value becomes its own listing (a copy, with its own price, quantity and SKU) and all of them one group.
[**createVariationGroupPublish**](ListingsApi.md#createVariationGroupPublish) | **POST** /v1/variation-groups/{id}/publish | Publish a variation group per platform: one listing with a variation picker where the platform supports it (eBay, Shopify, Etsy), one per option elsewhere. Each platform reports its own outcome.
[**deleteListing**](ListingsApi.md#deleteListing) | **DELETE** /v1/listings/{id} | Delist a listing (optionally narrowed to specific platforms via ?platforms&#x3D;).
[**deleteLiveStreamPinLaunch**](ListingsApi.md#deleteLiveStreamPinLaunch) | **DELETE** /v1/live-streams/{id}/pin-launch | Unpin the launch from your live show. Returns &#x60;{ ok }&#x60;.
[**deleteRentalOffer**](ListingsApi.md#deleteRentalOffer) | **DELETE** /v1/rentals/offers/{platformListingId} | Stop offering a listing for rent (existing bookings stand).
[**deleteVariationGroup**](ListingsApi.md#deleteVariationGroup) | **DELETE** /v1/variation-groups/{id} | Dissolve a group. Its options stay as ordinary listings.
[**getListing**](ListingsApi.md#getListing) | **GET** /v1/listings/{id} | Get one listing with its platform rows.
[**getListingFacet**](ListingsApi.md#getListingFacet) | **GET** /v1/listings/facets | Distinct brands + categories across listings + inventory.
[**getListingSkuExist**](ListingsApi.md#getListingSkuExist) | **GET** /v1/listings/sku-exists | Check whether a SKU is already used by one of this user&#39;s items.
[**getPricingSetting**](ListingsApi.md#getPricingSetting) | **GET** /v1/pricing/settings | Selling options: own-price match (Crossly sells your items at your own lower price for the same item on another marketplace; dollar-priced copies only) and layaway (buyers may put items on layaway). Both on by default.
[**getPricingSoldComp**](ListingsApi.md#getPricingSoldComp) | **GET** /v1/pricing/sold-comps | What one catalog product (market_sku_id, in one condition) actually sold for across Crossly in the last 180 days: median, p25/p75, p10/p90 (null under 10 sales), sale count, last sold, and days from listing to sale (median, p25, p75). Pass marketSkuId (+ optional condition) or one of your listingIds. comps is null until there are 3+ sales from 2+ sellers; holdCode says why there is nothing (no_market_sku, mixed_inventory, below_privacy_floor) — the same reasons a sold_median reprice rule holds.
[**listListingAiDetections**](ListingsApi.md#listListingAiDetections) | **GET** /v1/listings/{id}/ai-detections | Crossly&#39;s AI-image detections for a listing&#39;s photos.
[**listListingDiscrepancies**](ListingsApi.md#listListingDiscrepancies) | **GET** /v1/listings/{id}/discrepancies | List detected marketplace-drift discrepancies for a listing.
[**listListingIds**](ListingsApi.md#listListingIds) | **GET** /v1/listings/ids | Filter listings → return matching id list (no pagination).
[**listListings**](ListingsApi.md#listListings) | **GET** /v1/listings | List active platform listings.
[**listPassports**](ListingsApi.md#listPassports) | **GET** /v1/passports | Product passports you registered (optionally for one Crossly listing): the code and URL each tag carries.
[**listRentalOffers**](ListingsApi.md#listRentalOffers) | **GET** /v1/rentals/offers | What you offer for rent.
[**updateHotspot**](ListingsApi.md#updateHotspot) | **PUT** /v1/hotspots | Tag your listings at points on a story or lookbook photo (shop the look). Replaces that photo’s tags; at most 12.
[**updateListing**](ListingsApi.md#updateListing) | **PATCH** /v1/listings/{id} | Edit a listing and fan out update jobs to existing platform listings.
[**updateListingCustom**](ListingsApi.md#updateListingCustom) | **PUT** /v1/listings/{id}/customs | Set a listing’s customs: HS code (6–10 digits), country of origin, and countries this item must not ship to on Crossly. Omitted fields are left alone; null (or [] for restrictedCountries) clears.
[**updateListingPlatformListing**](ListingsApi.md#updateListingPlatformListing) | **PATCH** /v1/listings/{id}/platform-listings/{plId} | Set one marketplace copy&#39;s price (e.g. the ebay.com copy of a listing also live on ebay.co.uk), in that copy&#39;s own currency.
[**updateLiveStreamLineup**](ListingsApi.md#updateLiveStreamLineup) | **PUT** /v1/live-streams/{id}/lineup | Set a live show’s lineup: your Crossly listings, in the order you will sell them. Buyers see it before they join; a sale of a lineup item while the show is live is recorded at its replay moment.
[**updatePricingSetting**](ListingsApi.md#updatePricingSetting) | **PUT** /v1/pricing/settings | Turn own-price match and/or layaway on or off.
[**updateRentalOffer**](ListingsApi.md#updateRentalOffer) | **PUT** /v1/rentals/offers/{platformListingId} | Offer a Crossly listing for rent: day rate, optional week rate, deposit, min/max days, turnaround buffer, and rent-only (off sale while offered). Needs a ship-from address.
[**updateVariationGroup**](ListingsApi.md#updateVariationGroup) | **PATCH** /v1/variation-groups/{id} | Retitle a group, rename its axis, or change a group&#39;s purchase rule (written into every member&#39;s description).


<a name="createAiDetectionDispute"></a>
# **createAiDetectionDispute**
> CreateAiDetectionDisputeResponse createAiDetectionDispute(id)

Dispute an AI-image detection on your photo (sends it to Crossly review).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateAiDetectionDisputeResponse = apiInstance.createAiDetectionDispute(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createAiDetectionDispute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createAiDetectionDispute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateAiDetectionDisputeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

**CreateListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkCheckStatus"></a>
# **createListingBulkCheckStatus**
> CreateListingBulkDeleteResponse createListingBulkCheckStatus()

Check listing status on platforms

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkDeleteResponse = apiInstance.createListingBulkCheckStatus()
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

**CreateListingBulkDeleteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkCrosspost"></a>
# **createListingBulkCrosspost**
> CreateListingBulkDeleteResponse createListingBulkCrosspost()

Bulk crosspost (no delist phase)

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkDeleteResponse = apiInstance.createListingBulkCrosspost()
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

**CreateListingBulkDeleteResponse**

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

**CreateListingBulkDeleteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkDelist"></a>
# **createListingBulkDelist**
> CreateListingBulkDeleteResponse createListingBulkDelist()

Bulk delist from platforms

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkDeleteResponse = apiInstance.createListingBulkDelist()
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

**CreateListingBulkDeleteResponse**

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

**CreateListingBulkDelistPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkHardDelete"></a>
# **createListingBulkHardDelete**
> CreateListingBulkHardDeleteResponse createListingBulkHardDelete()

Permanently delete listings (live ones need allowLive)

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

**CreateListingBulkHardDeleteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingBulkRelist"></a>
# **createListingBulkRelist**
> CreateListingBulkDeleteResponse createListingBulkRelist()

Bulk relist across platforms

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkDeleteResponse = apiInstance.createListingBulkRelist()
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

**CreateListingBulkDeleteResponse**

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

**CreateListingBulkUpdateResponse**

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

**CreateListingByIdResponse**

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

**CreateListingCheckDuplicateResponse**

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

**CreateListingCombineResponse**

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

**CreateListingDiscrepancyResolveResponse**

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

**CreateListingImportByUrlResponse**

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

**CreateListingMagicFillResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingMerge"></a>
# **createListingMerge**
> CreateListingMergeResponse createListingMerge()

Merge the same item listed on different marketplaces into one listing; all stay live.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingMergeResponse = apiInstance.createListingMerge()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingMerge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingMerge")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateListingMergeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLiveStreamPinLaunch"></a>
# **createLiveStreamPinLaunch**
> OkResponse createLiveStreamPinLaunch(id)

Pin one of your live NFT launches on your live show; viewers mint it from the stream. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createLiveStreamPinLaunch(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createLiveStreamPinLaunch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createLiveStreamPinLaunch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPassport"></a>
# **createPassport**
> PassportResponse createPassport()

Register a product passport for a Crossly listing you sell, optionally bound to an NFC tag UID (hex). Returns the URL to write to the NFC tag or print as a QR; ownership then follows the item’s paid sales.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : PassportResponse = apiInstance.createPassport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createPassport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createPassport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**PassportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPassportRevoke"></a>
# **createPassportRevoke**
> PassportResponse createPassportRevoke(id)

Revoke a passport (a lost or misprinted tag). Refused once the item has sold — the passport is then part of its history.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : PassportResponse = apiInstance.createPassportRevoke(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createPassportRevoke")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createPassportRevoke")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**PassportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPassportTag"></a>
# **createPassportTag**
> PassportResponse createPassportTag(id)

Bind (or re-bind) a passport to the NFC tag you wrote its nfcUrl to: the tag UID (hex), and whether you locked the tag read-only. Refused once the item has sold, for a locked tag, or a tag already on another item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : PassportResponse = apiInstance.createPassportTag(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createPassportTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createPassportTag")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**PassportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVariationGroup"></a>
# **createVariationGroup**
> CreateVariationGroupResponse createVariationGroup()

Group listings you already have: a variation (one product, an axis such as Size) or a purchase-rule group (\&quot;buy any 3\&quot;).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateVariationGroupResponse = apiInstance.createVariationGroup()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createVariationGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createVariationGroup")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVariationGroupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVariationGroupGenerate"></a>
# **createVariationGroupGenerate**
> CreateVariationGroupGenerateResponse createVariationGroupGenerate()

Turn one listing into a variation group: each new value becomes its own listing (a copy, with its own price, quantity and SKU) and all of them one group.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateVariationGroupGenerateResponse = apiInstance.createVariationGroupGenerate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createVariationGroupGenerate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createVariationGroupGenerate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVariationGroupGenerateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVariationGroupPublish"></a>
# **createVariationGroupPublish**
> CreateVariationGroupPublishResponse createVariationGroupPublish(id)

Publish a variation group per platform: one listing with a variation picker where the platform supports it (eBay, Shopify, Etsy), one per option elsewhere. Each platform reports its own outcome.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVariationGroupPublishResponse = apiInstance.createVariationGroupPublish(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createVariationGroupPublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createVariationGroupPublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVariationGroupPublishResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteListing"></a>
# **deleteListing**
> DeleteListingResponse deleteListing(id, platforms, platformListingIds)

Delist a listing (optionally narrowed to specific platforms via ?platforms&#x3D;).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val platforms : kotlin.String = platforms_example // kotlin.String | Comma-separated platform slugs to limit the delist fan-out.
val platformListingIds : kotlin.String = platformListingIds_example // kotlin.String | Comma-separated platform listing ids — end only those copies (e.g. one eBay site's copy).
try {
    val result : DeleteListingResponse = apiInstance.deleteListing(id, platforms, platformListingIds)
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
 **platformListingIds** | **kotlin.String**| Comma-separated platform listing ids — end only those copies (e.g. one eBay site&#39;s copy). | [optional]

### Return type

**DeleteListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLiveStreamPinLaunch"></a>
# **deleteLiveStreamPinLaunch**
> OkResponse deleteLiveStreamPinLaunch(id)

Unpin the launch from your live show. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.deleteLiveStreamPinLaunch(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#deleteLiveStreamPinLaunch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#deleteLiveStreamPinLaunch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRentalOffer"></a>
# **deleteRentalOffer**
> CreateBreakCancelResponse deleteRentalOffer(platformListingId)

Stop offering a listing for rent (existing bookings stand).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val platformListingId : kotlin.String = platformListingId_example // kotlin.String | 
try {
    val result : CreateBreakCancelResponse = apiInstance.deleteRentalOffer(platformListingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#deleteRentalOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#deleteRentalOffer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platformListingId** | **kotlin.String**|  |

### Return type

**CreateBreakCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVariationGroup"></a>
# **deleteVariationGroup**
> CreateBreakCancelResponse deleteVariationGroup(id)

Dissolve a group. Its options stay as ordinary listings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBreakCancelResponse = apiInstance.deleteVariationGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#deleteVariationGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#deleteVariationGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBreakCancelResponse**

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

**GetListingResponse**

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

**GetListingFacetResponse**

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

**GetListingSkuExistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPricingSetting"></a>
# **getPricingSetting**
> GetPricingSettingResponse getPricingSetting()

Selling options: own-price match (Crossly sells your items at your own lower price for the same item on another marketplace; dollar-priced copies only) and layaway (buyers may put items on layaway). Both on by default.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : GetPricingSettingResponse = apiInstance.getPricingSetting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getPricingSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getPricingSetting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetPricingSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPricingSoldComp"></a>
# **getPricingSoldComp**
> GetPricingSoldCompResponse getPricingSoldComp()

What one catalog product (market_sku_id, in one condition) actually sold for across Crossly in the last 180 days: median, p25/p75, p10/p90 (null under 10 sales), sale count, last sold, and days from listing to sale (median, p25, p75). Pass marketSkuId (+ optional condition) or one of your listingIds. comps is null until there are 3+ sales from 2+ sellers; holdCode says why there is nothing (no_market_sku, mixed_inventory, below_privacy_floor) — the same reasons a sold_median reprice rule holds.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : GetPricingSoldCompResponse = apiInstance.getPricingSoldComp()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getPricingSoldComp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getPricingSoldComp")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetPricingSoldCompResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListingAiDetections"></a>
# **listListingAiDetections**
> ListListingAiDetectionsResponse listListingAiDetections(id)

Crossly&#39;s AI-image detections for a listing&#39;s photos.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListListingAiDetectionsResponse = apiInstance.listListingAiDetections(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listListingAiDetections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listListingAiDetections")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListListingAiDetectionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListingDiscrepancies"></a>
# **listListingDiscrepancies**
> ListListingDiscrepanciesResponse listListingDiscrepancies(id)

List detected marketplace-drift discrepancies for a listing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListListingDiscrepanciesResponse = apiInstance.listListingDiscrepancies(id)
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

**ListListingDiscrepanciesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListingIds"></a>
# **listListingIds**
> ListListingIdsResponse listListingIds()

Filter listings → return matching id list (no pagination).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : ListListingIdsResponse = apiInstance.listListingIds()
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

**ListListingIdsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListings"></a>
# **listListings**
> ListListingsResponse listListings(page, limit, platform, status, kind)

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
val kind : kotlin.String = kind_example // kotlin.String | Physical goods or Web3 assets (NFT listings). Omit for both.
try {
    val result : ListListingsResponse = apiInstance.listListings(page, limit, platform, status, kind)
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
 **kind** | **kotlin.String**| Physical goods or Web3 assets (NFT listings). Omit for both. | [optional] [enum: physical, web3]

### Return type

**ListListingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPassports"></a>
# **listPassports**
> ListPassportsResponse listPassports()

Product passports you registered (optionally for one Crossly listing): the code and URL each tag carries.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : ListPassportsResponse = apiInstance.listPassports()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listPassports")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listPassports")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListPassportsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRentalOffers"></a>
# **listRentalOffers**
> ListRentalOffersResponse listRentalOffers()

What you offer for rent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : ListRentalOffersResponse = apiInstance.listRentalOffers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listRentalOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listRentalOffers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListRentalOffersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateHotspot"></a>
# **updateHotspot**
> UpdateHotspotResponse updateHotspot()

Tag your listings at points on a story or lookbook photo (shop the look). Replaces that photo’s tags; at most 12.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : UpdateHotspotResponse = apiInstance.updateHotspot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updateHotspot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updateHotspot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateHotspotResponse**

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

**UpdateListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateListingCustom"></a>
# **updateListingCustom**
> UpdateListingCustomResponse updateListingCustom(id)

Set a listing’s customs: HS code (6–10 digits), country of origin, and countries this item must not ship to on Crossly. Omitted fields are left alone; null (or [] for restrictedCountries) clears.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateListingCustomResponse = apiInstance.updateListingCustom(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updateListingCustom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updateListingCustom")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**UpdateListingCustomResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateListingPlatformListing"></a>
# **updateListingPlatformListing**
> UpdateListingPlatformListingResponse updateListingPlatformListing(id, plId)

Set one marketplace copy&#39;s price (e.g. the ebay.com copy of a listing also live on ebay.co.uk), in that copy&#39;s own currency.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val plId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateListingPlatformListingResponse = apiInstance.updateListingPlatformListing(id, plId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updateListingPlatformListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updateListingPlatformListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **plId** | **java.util.UUID**|  |

### Return type

**UpdateListingPlatformListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLiveStreamLineup"></a>
# **updateLiveStreamLineup**
> UpdateLiveStreamLineupResponse updateLiveStreamLineup(id)

Set a live show’s lineup: your Crossly listings, in the order you will sell them. Buyers see it before they join; a sale of a lineup item while the show is live is recorded at its replay moment.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateLiveStreamLineupResponse = apiInstance.updateLiveStreamLineup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updateLiveStreamLineup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updateLiveStreamLineup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateLiveStreamLineupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePricingSetting"></a>
# **updatePricingSetting**
> GetPricingSettingResponse updatePricingSetting()

Turn own-price match and/or layaway on or off.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : GetPricingSettingResponse = apiInstance.updatePricingSetting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updatePricingSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updatePricingSetting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetPricingSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRentalOffer"></a>
# **updateRentalOffer**
> UpdateRentalOfferResponse updateRentalOffer(platformListingId)

Offer a Crossly listing for rent: day rate, optional week rate, deposit, min/max days, turnaround buffer, and rent-only (off sale while offered). Needs a ship-from address.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val platformListingId : kotlin.String = platformListingId_example // kotlin.String | 
try {
    val result : UpdateRentalOfferResponse = apiInstance.updateRentalOffer(platformListingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updateRentalOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updateRentalOffer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platformListingId** | **kotlin.String**|  |

### Return type

**UpdateRentalOfferResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVariationGroup"></a>
# **updateVariationGroup**
> CreateVariationGroupResponse updateVariationGroup(id)

Retitle a group, rename its axis, or change a group&#39;s purchase rule (written into every member&#39;s description).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVariationGroupResponse = apiInstance.updateVariationGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updateVariationGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updateVariationGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVariationGroupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

