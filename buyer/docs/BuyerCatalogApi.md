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
[**getBuyerCatalogFx**](BuyerCatalogApi.md#getBuyerCatalogFx) | **GET** /v1/buyer/catalog/fx | Display-only exchange rates (units per 1 USD).
[**getBuyerCatalogListing**](BuyerCatalogApi.md#getBuyerCatalogListing) | **GET** /v1/buyer/catalog/listings/{slug} | One listing, in full.
[**getBuyerCatalogListingAvailability**](BuyerCatalogApi.md#getBuyerCatalogListingAvailability) | **GET** /v1/buyer/catalog/listings/{slug}/availability | Is it still buyable, and at what price.
[**getBuyerCatalogListingShipping**](BuyerCatalogApi.md#getBuyerCatalogListingShipping) | **GET** /v1/buyer/catalog/listings/{slug}/shipping | Shipping services and prices to a destination.
[**getBuyerListingLandedCost**](BuyerCatalogApi.md#getBuyerListingLandedCost) | **GET** /v1/buyer/listings/{slug}/landed-cost | Import duties, taxes and fees to a country (landed cost).
[**getBuyerScanSession**](BuyerCatalogApi.md#getBuyerScanSession) | **GET** /v1/buyer/scan/sessions/{id} | One trip and everything it found.
[**listBuyerCatalogBrowse**](BuyerCatalogApi.md#listBuyerCatalogBrowse) | **GET** /v1/buyer/catalog/browse | Browse the way the shop does — buying format, returns, size, color, sold items, Best Match.
[**listBuyerCatalogListingSoldHistory**](BuyerCatalogApi.md#listBuyerCatalogListingSoldHistory) | **GET** /v1/buyer/catalog/listings/{slug}/sold-history | What THIS listing has sold for, newest first (last 50), with the median.
[**listBuyerCatalogSearch**](BuyerCatalogApi.md#listBuyerCatalogSearch) | **GET** /v1/buyer/catalog/search | Search the Crossly catalogue.
[**listBuyerCatalogSellers**](BuyerCatalogApi.md#listBuyerCatalogSellers) | **GET** /v1/buyer/catalog/sellers | Find a seller by shop handle or shop name.
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

**CreateBuyerIdentifyResponse**

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

**CreateBuyerLockonResponse**

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

**CreateBuyerLockonConfirmResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerLockonObserve"></a>
# **createBuyerLockonObserve**
> CreateBuyerLockonConfirmResponse createBuyerLockonObserve(id)

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
    val result : CreateBuyerLockonConfirmResponse = apiInstance.createBuyerLockonObserve(id)
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

**CreateBuyerLockonConfirmResponse**

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

**CreateBuyerScanResponse**

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

**CreateBuyerScanSessionResponse**

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

**CreateBuyerScanSessionEndResponse**

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

**GetBuyerAnywhereResponse**

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

**GetBuyerCatalogFacetResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCatalogFx"></a>
# **getBuyerCatalogFx**
> GetBuyerCatalogFxResponse getBuyerCatalogFx()

Display-only exchange rates (units per 1 USD).

ECB daily reference rates rebased to US dollars: &#x60;rates.EUR &#x3D; 0.92&#x60; means $1 ≈ €0.92. &#x60;asOf&#x60; is the ECB publication date (null until the first refresh). For showing an approximate price only — every Crossly price and charge is in USD, and the card issuer sets the final exchange rate.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : GetBuyerCatalogFxResponse = apiInstance.getBuyerCatalogFx()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#getBuyerCatalogFx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#getBuyerCatalogFx")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerCatalogFxResponse**

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

**GetBuyerCatalogListingResponse**

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

**GetBuyerCatalogListingAvailabilityResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCatalogListingShipping"></a>
# **getBuyerCatalogListingShipping**
> GetBuyerCatalogListingShippingResponse getBuyerCatalogListingShipping(slug, zip, country, quantity)

Shipping services and prices to a destination.

Lists every shipping service the seller offers to &#x60;country&#x60; (default: the seller’s own country) with its price for &#x60;quantity&#x60; units and its delivery window in business days (handling included). &#x60;zip&#x60; is required for a domestic quote. &#x60;shipsToCountry: false&#x60; means the seller does not ship there. Pass a service &#x60;id&#x60; as &#x60;shippingServiceId&#x60; to POST /api/v1/buyer/checkout, or in &#x60;shippingServiceBySeller&#x60; to POST /api/v1/buyer/cart/quote.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val zip : kotlin.String = zip_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val quantity : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : GetBuyerCatalogListingShippingResponse = apiInstance.getBuyerCatalogListingShipping(slug, zip, country, quantity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#getBuyerCatalogListingShipping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#getBuyerCatalogListingShipping")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **zip** | **kotlin.String**|  | [optional]
 **country** | **kotlin.String**|  | [optional]
 **quantity** | **kotlin.Int**|  | [optional]

### Return type

**GetBuyerCatalogListingShippingResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingLandedCost"></a>
# **getBuyerListingLandedCost**
> GetBuyerListingLandedCostResponse getBuyerListingLandedCost(slug, country, postalCode, quantity)

Import duties, taxes and fees to a country (landed cost).

Quotes the import duties, import taxes and fees for this listing shipped to &#x60;country&#x60; (ISO 3166-1 alpha-2), using the cheapest shipping service the seller offers there. &#x60;status: included&#x60; means checkout charges them now and the parcel ships DDP — no bill at the door; &#x60;unavailable&#x60; means it ships DDU and &#x60;notice&#x60; says the carrier or customs may charge on delivery; &#x60;none&#x60; means the parcel does not cross a border. Amounts are US-dollar cents. Answers 503 with &#x60;missingEnv&#x60; when landed-cost quoting is not configured on this deployment.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val postalCode : kotlin.String = postalCode_example // kotlin.String | 
val quantity : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : GetBuyerListingLandedCostResponse = apiInstance.getBuyerListingLandedCost(slug, country, postalCode, quantity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#getBuyerListingLandedCost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#getBuyerListingLandedCost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **country** | **kotlin.String**|  |
 **postalCode** | **kotlin.String**|  | [optional]
 **quantity** | **kotlin.Int**|  | [optional]

### Return type

**GetBuyerListingLandedCostResponse**

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

**GetBuyerScanSessionResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCatalogBrowse"></a>
# **listBuyerCatalogBrowse**
> ListBuyerCatalogBrowseResponse listBuyerCatalogBrowse(q, format, returns, sold, size, color, shipsTo, sort, minPriceCents, maxPriceCents, page, limit)

Browse the way the shop does — buying format, returns, size, color, sold items, Best Match.

Page-numbered and capped at 50 pages of up to 60, like the storefront. For walking the whole catalogue use /v1/buyer/catalog/search, which pages by cursor. Prices are integer CENTS (&#x60;minPriceCents&#x3D;2500&#x60; is $25.00). &#x60;sold&#x3D;true&#x60; returns recent sales of matching listings (last 90 days) with &#x60;soldPriceCents&#x60; and &#x60;soldAt&#x60;, instead of live stock.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val q : kotlin.String = q_example // kotlin.String | Free text; every word must appear in the title or brand.
val format : kotlin.String = format_example // kotlin.String | auction, buy_it_now, or offers (accepts offers).
val returns : kotlin.String = returns_example // kotlin.String | true = only listings that accept returns.
val sold : kotlin.String = sold_example // kotlin.String | true = recent sales instead of live listings.
val size : kotlin.String = size_example // kotlin.String | Exact size, case-insensitive (M does not match XL).
val color : kotlin.String = color_example // kotlin.String | Exact colour, case-insensitive.
val shipsTo : kotlin.String = shipsTo_example // kotlin.String | ISO 3166-1 alpha-2 destination (e.g. GB): only listings whose seller ships there, decided as checkout decides it (the listing's shipping policy and its own restricted countries). An embargoed destination matches nothing. Omitted, or `any`, means no destination filter — the storefront grid defaults to the buyer's country, this endpoint does not.
val sort : kotlin.String = sort_example // kotlin.String | Default best_match with q, newest without.
val minPriceCents : kotlin.Int = 56 // kotlin.Int | Lowest price, in cents.
val maxPriceCents : kotlin.Int = 56 // kotlin.Int | Highest price, in cents.
val page : kotlin.Int = 56 // kotlin.Int | 1-indexed page.
val limit : kotlin.Int = 56 // kotlin.Int | Rows per page.
try {
    val result : ListBuyerCatalogBrowseResponse = apiInstance.listBuyerCatalogBrowse(q, format, returns, sold, size, color, shipsTo, sort, minPriceCents, maxPriceCents, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#listBuyerCatalogBrowse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#listBuyerCatalogBrowse")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| Free text; every word must appear in the title or brand. | [optional]
 **format** | **kotlin.String**| auction, buy_it_now, or offers (accepts offers). | [optional] [enum: auction, buy_it_now, offers]
 **returns** | **kotlin.String**| true &#x3D; only listings that accept returns. | [optional] [enum: true, false]
 **sold** | **kotlin.String**| true &#x3D; recent sales instead of live listings. | [optional] [enum: true, false]
 **size** | **kotlin.String**| Exact size, case-insensitive (M does not match XL). | [optional]
 **color** | **kotlin.String**| Exact colour, case-insensitive. | [optional]
 **shipsTo** | **kotlin.String**| ISO 3166-1 alpha-2 destination (e.g. GB): only listings whose seller ships there, decided as checkout decides it (the listing&#39;s shipping policy and its own restricted countries). An embargoed destination matches nothing. Omitted, or &#x60;any&#x60;, means no destination filter — the storefront grid defaults to the buyer&#39;s country, this endpoint does not. | [optional]
 **sort** | **kotlin.String**| Default best_match with q, newest without. | [optional] [enum: best_match, newest, price_low, price_high, popular, ending_soon]
 **minPriceCents** | **kotlin.Int**| Lowest price, in cents. | [optional]
 **maxPriceCents** | **kotlin.Int**| Highest price, in cents. | [optional]
 **page** | **kotlin.Int**| 1-indexed page. | [optional] [default to 1]
 **limit** | **kotlin.Int**| Rows per page. | [optional] [default to 24]

### Return type

**ListBuyerCatalogBrowseResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCatalogListingSoldHistory"></a>
# **listBuyerCatalogListingSoldHistory**
> ListBuyerCatalogListingSoldHistoryResponse listBuyerCatalogListingSoldHistory(slug)

What THIS listing has sold for, newest first (last 50), with the median.

This listing only — never \&quot;similar items\&quot;, which would mean matching other listings by resemblance. Prices are per unit, in cents, excluding shipping and tax.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val slug : kotlin.String = slug_example // kotlin.String | The listing slug.
try {
    val result : ListBuyerCatalogListingSoldHistoryResponse = apiInstance.listBuyerCatalogListingSoldHistory(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#listBuyerCatalogListingSoldHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#listBuyerCatalogListingSoldHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**| The listing slug. |

### Return type

**ListBuyerCatalogListingSoldHistoryResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCatalogSearch"></a>
# **listBuyerCatalogSearch**
> ListBuyerCatalogSearchResponse listBuyerCatalogSearch()

Search the Crossly catalogue.

Keyset-paginated. Pass the &#x60;nextCursor&#x60; you were given back as &#x60;cursor&#x60;; page 500 costs the same as page 1. Cursors are opaque — do not parse them. Responses carry an ETag: send it back as If-None-Match and an unchanged page answers 304, which is free. &#x60;sort&#x3D;popular&#x60; is deliberately unavailable, because a cursor into a continuously-reordering list silently skips rows.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : ListBuyerCatalogSearchResponse = apiInstance.listBuyerCatalogSearch()
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

**ListBuyerCatalogSearchResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCatalogSellers"></a>
# **listBuyerCatalogSellers**
> ListBuyerCatalogSellersResponse listBuyerCatalogSellers(q, limit)

Find a seller by shop handle or shop name.

Only shops that have listed on Crossly. Exact matches first, then prefix, then by live listing count.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
val q : kotlin.String = q_example // kotlin.String | At least two characters of a handle or shop name.
val limit : kotlin.Int = 56 // kotlin.Int | How many shops to return.
try {
    val result : ListBuyerCatalogSellersResponse = apiInstance.listBuyerCatalogSellers(q, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCatalogApi#listBuyerCatalogSellers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCatalogApi#listBuyerCatalogSellers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| At least two characters of a handle or shop name. |
 **limit** | **kotlin.Int**| How many shops to return. | [optional] [default to 12]

### Return type

**ListBuyerCatalogSellersResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerScanSessions"></a>
# **listBuyerScanSessions**
> ListBuyerScanSessionsResponse listBuyerScanSessions()

Your scanning trips, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCatalogApi()
try {
    val result : ListBuyerScanSessionsResponse = apiInstance.listBuyerScanSessions()
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

**ListBuyerScanSessionsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

