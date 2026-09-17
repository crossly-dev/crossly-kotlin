# BuyerCatalogApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerIdentify**](BuyerCatalogApi.md#createBuyerIdentify) | **POST** /v1/buyer/identify | Identify a held object and return a HUD-ready answer.
[**createBuyerLockon**](BuyerCatalogApi.md#createBuyerLockon) | **POST** /v1/buyer/lockons | Lock on to an object the buyer is holding.
[**createBuyerLockonConfirm**](BuyerCatalogApi.md#createBuyerLockonConfirm) | **POST** /v1/buyer/lockons/{id}/confirm | The buyer picked one of the candidates.
[**createBuyerLockonObserve**](BuyerCatalogApi.md#createBuyerLockonObserve) | **POST** /v1/buyer/lockons/{id}/observe | Add what this frame revealed, and get the current best answer.
[**createBuyerScan**](BuyerCatalogApi.md#createBuyerScan) | **POST** /v1/buyer/scan | Identify a physical item and find the cheapest place to buy it.
[**createBuyerScanSession**](BuyerCatalogApi.md#createBuyerScanSession) | **POST** /v1/buyer/scan/sessions | Open a Live Shop session.
[**createBuyerScanSessionEnd**](BuyerCatalogApi.md#createBuyerScanSessionEnd) | **POST** /v1/buyer/scan/sessions/{id}/end | Close a Live Shop session.
[**getBuyerAnywhere**](BuyerCatalogApi.md#getBuyerAnywhere) | **GET** /v1/buyer/anywhere | Cheapest source for an item — Crossly first, then other retailers.
[**getBuyerCatalogFacet**](BuyerCatalogApi.md#getBuyerCatalogFacet) | **GET** /v1/buyer/catalog/facets | Brands, categories and conditions that currently have stock.
[**getBuyerCatalogListing**](BuyerCatalogApi.md#getBuyerCatalogListing) | **GET** /v1/buyer/catalog/listings/{slug} | One listing, in full.
[**getBuyerCatalogListingAvailability**](BuyerCatalogApi.md#getBuyerCatalogListingAvailability) | **GET** /v1/buyer/catalog/listings/{slug}/availability | Is it still buyable, and at what price.
[**getBuyerScanSession**](BuyerCatalogApi.md#getBuyerScanSession) | **GET** /v1/buyer/scan/sessions/{id} | One trip and everything it found.
[**listBuyerCatalogSearch**](BuyerCatalogApi.md#listBuyerCatalogSearch) | **GET** /v1/buyer/catalog/search | Search the Crossly catalogue.
[**listBuyerScanSessions**](BuyerCatalogApi.md#listBuyerScanSessions) | **GET** /v1/buyer/scan/sessions | Your scanning trips, newest first.


<a name="createBuyerIdentify"></a>
# **createBuyerIdentify**
> CreateBuyerIdentifyResponse createBuyerIdentify()

Identify a held object and return a HUD-ready answer.

The gesture endpoint for Live Shop. Runs a cost ladder: a decoded BARCODE resolves in ~50ms for nothing; failing that, self-hosted CLIP matches the catalogue; failing that, a vision model names it (the only rung that costs anything, capped per buyer per day). &#x60;hud&#x60; is pre-formatted for a 600×600 lens — one headline, one subline, up to three fact chips and exactly ONE action, because a pinch cannot choose between buttons. A vision label is WORDS, never an identity: it names the thing so the buyer can search, and never drives a price comparison.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : CreateBuyerIdentifyResponse = apiInstance.createBuyerIdentify()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#createBuyerIdentify")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#createBuyerIdentify")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateBuyerIdentifyResponse**](CreateBuyerIdentifyResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerLockon"></a>
# **createBuyerLockon**
> CreateBuyerLockonResponse createBuyerLockon()

Lock on to an object the buyer is holding.

Open this when on-device tracking acquires an object, then post observations to it as the buyer turns the thing over. The answer improves as evidence arrives — the style code inside a shoe settles what the front of it could not.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : CreateBuyerLockonResponse = apiInstance.createBuyerLockon()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#createBuyerLockon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#createBuyerLockon")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateBuyerLockonResponse**](CreateBuyerLockonResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerLockonConfirm"></a>
# **createBuyerLockonConfirm**
> CreateBuyerLockonConfirmResponse createBuyerLockonConfirm(id)

The buyer picked one of the candidates.

Promotes a text match to a CONFIRMED identity — the strongest evidence in the system, because a person holding the object said yes. Validated against the candidates we actually offered, so it cannot be claimed about an arbitrary product.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBuyerLockonConfirmResponse = apiInstance.createBuyerLockonConfirm(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#createBuyerLockonConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#createBuyerLockonConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateBuyerLockonConfirmResponse**](CreateBuyerLockonConfirmResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerLockonObserve"></a>
# **createBuyerLockonObserve**
> CreateBuyerLockonObserveResponse createBuyerLockonObserve(id)

Add what this frame revealed, and get the current best answer.

Send only what you LEARNED: a decoded barcode, newly-read OCR text, or a frame when neither settled it. Do not post every frame — tracking and decoding happen on-device for free, and this endpoint is for evidence, not video. Evidence is RANKED (confirmed &gt; barcode &gt; ocr &gt; visual), so a late weak reading can never overwrite a strong early one. When text evidence finds several products, &#x60;candidates&#x60; comes back for the buyer to pick from — a vision label is words, and only a human confirmation turns it into an identity we will price against.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBuyerLockonObserveResponse = apiInstance.createBuyerLockonObserve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#createBuyerLockonObserve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#createBuyerLockonObserve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateBuyerLockonObserveResponse**](CreateBuyerLockonObserveResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerScan"></a>
# **createBuyerScan**
> CreateBuyerScanResponse createBuyerScan()

Identify a physical item and find the cheapest place to buy it.

Send a barcode identifier OR a photo. A BARCODE establishes identity, so the response carries a full price verdict across Crossly and other retailers. A PHOTO establishes resemblance only: you get visual matches from the Crossly catalogue, and a price verdict ONLY if the matched listing carries a real identifier. When it does not, &#x60;comparable&#x60; is false and there is no verdict — a price comparison built on a visual guess is a claim about a different product. Most second-hand items have no identifier by nature, so this is expected rather than a failure.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : CreateBuyerScanResponse = apiInstance.createBuyerScan()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#createBuyerScan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#createBuyerScan")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateBuyerScanResponse**](CreateBuyerScanResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerScanSession"></a>
# **createBuyerScanSession**
> CreateBuyerScanSessionResponse createBuyerScanSession()

Open a Live Shop session.

Call this when the glasses connect, then pass the returned id as &#x60;sessionId&#x60; on each scan. Opening a session CLOSES any other live one — a person is in one shop at a time, and two live sessions split a trip across both.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : CreateBuyerScanSessionResponse = apiInstance.createBuyerScanSession()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#createBuyerScanSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#createBuyerScanSession")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateBuyerScanSessionResponse**](CreateBuyerScanSessionResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerScanSessionEnd"></a>
# **createBuyerScanSessionEnd**
> CreateBuyerScanSessionEndResponse createBuyerScanSessionEnd(id)

Close a Live Shop session.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBuyerScanSessionEndResponse = apiInstance.createBuyerScanSessionEnd(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#createBuyerScanSessionEnd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#createBuyerScanSessionEnd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateBuyerScanSessionEndResponse**](CreateBuyerScanSessionEndResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerAnywhere"></a>
# **getBuyerAnywhere**
> GetBuyerAnywhereResponse getBuyerAnywhere()

Cheapest source for an item — Crossly first, then other retailers.

Answers with a VERDICT, not a list: crossly_best, offsite_cheaper, offsite_only or no_match. Offsite offers come from licensed affiliate product feeds, are ranked CHEAPEST-FIRST — commission only ever breaks a sub-$1 tie — and only appear when they beat the price you passed in. &#x60;shippingUnknown: true&#x60; means a compared price omitted postage, so present the result as \&quot;before postage\&quot; rather than as a delivered total. Crossly wins ties within $1; beyond that the honest answer wins.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : GetBuyerAnywhereResponse = apiInstance.getBuyerAnywhere()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#getBuyerAnywhere")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#getBuyerAnywhere")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBuyerAnywhereResponse**](GetBuyerAnywhereResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCatalogFacet"></a>
# **getBuyerCatalogFacet**
> GetBuyerCatalogFacetResponse getBuyerCatalogFacet()

Brands, categories and conditions that currently have stock.

The vocabulary the search filters accept. Counts are live, so a filter built from this will never return an empty page for a value that has since sold out.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : GetBuyerCatalogFacetResponse = apiInstance.getBuyerCatalogFacet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#getBuyerCatalogFacet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#getBuyerCatalogFacet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBuyerCatalogFacetResponse**](GetBuyerCatalogFacetResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCatalogListing"></a>
# **getBuyerCatalogListing**
> GetBuyerCatalogListingResponse getBuyerCatalogListing(slug)

One listing, in full.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerCatalogListingResponse = apiInstance.getBuyerCatalogListing(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#getBuyerCatalogListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#getBuyerCatalogListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**GetBuyerCatalogListingResponse**](GetBuyerCatalogListingResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCatalogListingAvailability"></a>
# **getBuyerCatalogListingAvailability**
> GetBuyerCatalogListingAvailabilityResponse getBuyerCatalogListingAvailability(slug)

Is it still buyable, and at what price.

The cheapest endpoint here, and the one to poll if you are going to poll — a single indexed row, no joins beyond stock, and an ETag so an unchanged answer is a 304. If you want to be TOLD instead of asking, create a monitor.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerCatalogListingAvailabilityResponse = apiInstance.getBuyerCatalogListingAvailability(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#getBuyerCatalogListingAvailability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#getBuyerCatalogListingAvailability")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

[**GetBuyerCatalogListingAvailabilityResponse**](GetBuyerCatalogListingAvailabilityResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerScanSession"></a>
# **getBuyerScanSession**
> GetBuyerScanSessionResponse getBuyerScanSession(id)

One trip and everything it found.

Verdicts are returned EXACTLY as they were given at the time, not re-priced. A history screen that silently refreshes old prices shows a saving that was never actually on offer.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetBuyerScanSessionResponse = apiInstance.getBuyerScanSession(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#getBuyerScanSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#getBuyerScanSession")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetBuyerScanSessionResponse**](GetBuyerScanSessionResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCatalogSearch"></a>
# **listBuyerCatalogSearch**
> V1List listBuyerCatalogSearch()

Search the Crossly catalogue.

Keyset-paginated. Pass the &#x60;nextCursor&#x60; you were given back as &#x60;cursor&#x60;; page 500 costs the same as page 1. Cursors are opaque — do not parse them. Responses carry an ETag: send it back as If-None-Match and an unchanged page answers 304, which is free. &#x60;sort&#x3D;popular&#x60; is deliberately unavailable, because a cursor into a continuously-reordering list silently skips rows.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : V1List = apiInstance.listBuyerCatalogSearch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#listBuyerCatalogSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#listBuyerCatalogSearch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1List**](V1List.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerScanSessions"></a>
# **listBuyerScanSessions**
> V1List listBuyerScanSessions()

Your scanning trips, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : V1List = apiInstance.listBuyerScanSessions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#listBuyerScanSessions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#listBuyerScanSessions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1List**](V1List.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

