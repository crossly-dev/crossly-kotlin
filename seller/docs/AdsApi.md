# AdsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAdOffsiteCampaign**](AdsApi.md#createAdOffsiteCampaign) | **POST** /v1/ads/offsite/campaigns | Launch an offsite campaign for an item.
[**createAdOffsiteResume**](AdsApi.md#createAdOffsiteResume) | **POST** /v1/ads/offsite/resume | Clear an auto-pause and resume offsite spend.
[**createListingAdBulkAdd**](AdsApi.md#createListingAdBulkAdd) | **POST** /v1/listing-ads/bulk-add | Add listings to a campaign by master listing id: each listing&#39;s live row on &#x60;platform&#x60; joins campaignId (a Crossly campaign uuid, or the marketplace&#39;s campaign id). A listing not live there is its own failed result.
[**createListingAdCampaign**](AdsApi.md#createListingAdCampaign) | **POST** /v1/listing-ads/{platform}/campaigns | Create a campaign on the marketplace: program (promoted_listing_rate &#x3D; eBay General, a % of the sale; cpc_campaign &#x3D; eBay Priority, a daily budget), name, ratePct or dailyBudgetCents, startsAt/endsAt, and the program fields. Idempotency-Key supported.
[**createListingAdCampaignListing**](AdsApi.md#createListingAdCampaignListing) | **POST** /v1/listing-ads/{platform}/campaigns/{campaignId}/listings | Promote listings in a marketplace campaign. platformListingIds are Crossly platform-listing ids on that marketplace; ratePct sets the ad rate (eBay General). One result per listing.
[**createListingAdCampaignListingRemove**](AdsApi.md#createListingAdCampaignListingRemove) | **POST** /v1/listing-ads/{platform}/campaigns/{campaignId}/listings/remove | Stop promoting listings in a marketplace campaign. One result per listing.
[**createSponsoredAdBillingTopupLink**](AdsApi.md#createSponsoredAdBillingTopupLink) | **POST** /v1/sponsored-ads/billing/topup-link | A Stripe Checkout link that adds amountCents ($5–$10,000) to the ad balance when the seller pays it. Nothing is charged until they do. Use an Idempotency-Key to get the same link back on a retry.
[**createSponsoredAdBoostRemove**](AdsApi.md#createSponsoredAdBoostRemove) | **POST** /v1/sponsored-ads/boosts/remove | Stop boosting listings in bulk.
[**createSponsoredAdCampaign**](AdsApi.md#createSponsoredAdCampaign) | **POST** /v1/sponsored-ads/campaigns | Create a Sponsored Listings campaign: name, dailyBudgetCents (≥100), optional totalBudgetCents, defaultBidCents (5–10000; the max bid under bidStrategy \&quot;auto\&quot;), placements (search, browse, product_page, home_rail, storefront, worlds_surface), goal (sales | visits), optional targetCategories / targetRegions (ISO countries) / targetDevices (mobile, desktop, app), optional startsAt/endsAt, listings [{platformListingId, bidCents?, boostBps? (100–2000, pay-on-sale Boost; null clears)}], keywords [{keyword, matchType broad|phrase|exact, negative?, bidCents?}], worldTargets [{kind showroom|convention, id, bidCents?, status?}] (your showroom or a convention you host, promoted in the Crossly World directory; at least one listing or world target), status active|draft. A catalog boost: targetType \&quot;wholesale_catalog\&quot; + targetCatalogId (your catalog), no listings, keywords or world targets; it ranks Sponsored in the wholesale directory. bidStrategy defaults to your account default. Clicks are charged from your ad funds (ad balance and/or CBX, ad credit first); with none it waits as out_of_budget.
[**createSponsoredAdCampaignDuplicate**](AdsApi.md#createSponsoredAdCampaignDuplicate) | **POST** /v1/sponsored-ads/campaigns/{id}/duplicate | Copy a campaign (settings, listings, keywords) as a new draft.
[**createSponsoredAdCampaignStatus**](AdsApi.md#createSponsoredAdCampaignStatus) | **POST** /v1/sponsored-ads/campaigns/{id}/status | Set a campaign active (launch/resume), paused, or ended (final). Resuming with no ad funds to pay for clicks leaves it out_of_budget until you top up.
[**getAdOffsite**](AdsApi.md#getAdOffsite) | **GET** /v1/ads/offsite | Your offsite-ads opt-in and its terms.
[**getAdOffsiteEligibility**](AdsApi.md#getAdOffsiteEligibility) | **GET** /v1/ads/offsite/eligibility | Whether an item can run offsite, and why not.
[**getAdOffsiteReport**](AdsApi.md#getAdOffsiteReport) | **GET** /v1/ads/offsite/report | What your offsite budget bought — including the misses.
[**getListingAdListing**](AdsApi.md#getListingAdListing) | **GET** /v1/listing-ads/listings/{listingId} | Every promotion of one listing: its Crossly campaigns and Boost, and each marketplace ad with status, campaign, rate and last sync.
[**getSponsoredAdBilling**](AdsApi.md#getSponsoredAdBilling) | **GET** /v1/sponsored-ads/billing | What pays for your ads: headroom across the billing rails (ad balance and/or CBX), unbilled click spend, settlement charges, daily spend, Boost fees and CBX ad-credit grants; funds is the full funds summary (same as /v1/sponsored-ads/funds). refresh&#x3D;true re-reads the balance.
[**getSponsoredAdBillingStatement**](AdsApi.md#getSponsoredAdBillingStatement) | **GET** /v1/sponsored-ads/billing/statements/{month} | One month&#39;s ads statement: opening and closing ad balance, top-ups, click spend by campaign, how clicks were paid, credits, refunds and Boost fees.
[**getSponsoredAdBillingStatementPdf**](AdsApi.md#getSponsoredAdBillingStatementPdf) | **GET** /v1/sponsored-ads/billing/statements/{month}/pdf | One month&#39;s ads statement as a PDF.
[**getSponsoredAdBillingTopupReceipt**](AdsApi.md#getSponsoredAdBillingTopupReceipt) | **GET** /v1/sponsored-ads/billing/topups/{id}/receipt | One ad balance top-up&#39;s receipt as a PDF (each top-up in the billing history carries its id and receipt number).
[**getSponsoredAdCampaign**](AdsApi.md#getSponsoredAdCampaign) | **GET** /v1/sponsored-ads/campaigns/{id} | One campaign: settings, its listings (bid, suggested bid, live, per-listing stats) and keywords. A catalog boost (targetType wholesale_catalog) has &#x60;catalogs&#x60;: per boosted catalog impressions, clicks, spend, attributed trade orders and revenue, CTR and ROAS.
[**getSponsoredAdFund**](AdsApi.md#getSponsoredAdFund) | **GET** /v1/sponsored-ads/funds | What can pay for clicks now: the billing rails in effect (ad balance and/or CBX), the ad balance and ad credit, CBX headroom, unbilled clicks, available cents, auto top-up, the saved payment method and the refundable balance. refresh&#x3D;true re-reads CBX.
[**getSponsoredAdReport**](AdsApi.md#getSponsoredAdReport) | **GET** /v1/sponsored-ads/report | Sponsored report for a range: totals (spend, impressions, clicks, CTR, average CPC, attributed orders and revenue, ROAS), a zero-filled daily series, per-campaign rows (targetType listings | wholesale_catalog) and &#x60;catalogs&#x60;, one row per boosted catalog. Listing orders are Crossly purchases of the advertised listing within 7 days of a click by the same buyer; catalog orders are trade orders with that seller within 7 days of a catalog click by the same buyer. Catalog impressions count once per viewer per day.
[**getSponsoredAdSetting**](AdsApi.md#getSponsoredAdSetting) | **GET** /v1/sponsored-ads/settings | Ads quick settings: adsPaused, accountDailyCapCents and spentTodayCents, defaultBidStrategy, autoTopup.
[**listListingAdCampaigns**](AdsApi.md#listListingAdCampaigns) | **GET** /v1/listing-ads/{platform}/campaigns | Your ad campaigns on one marketplace (cached up to 15 minutes; refresh&#x3D;true asks the marketplace now).
[**listListingAdPlatforms**](AdsApi.md#listListingAdPlatforms) | **GET** /v1/listing-ads/platforms | The ads registry: each marketplace that sells promotion, its programs (kind, scope, campaign and listing fields), which verbs are wired / need a capture / are unsupported, and whether you are connected there.
[**listSponsoredAdBillingHistory**](AdsApi.md#listSponsoredAdBillingHistory) | **GET** /v1/sponsored-ads/billing/history | Billing history newest first: top-ups (status, receipt number), click charges (how each was paid: ad balance, credit, CBX, written off), credits, refunds and Boost fees. kind filters; before (ISO time) pages; limit ≤ 100.
[**listSponsoredAdBillingStatements**](AdsApi.md#listSponsoredAdBillingStatements) | **GET** /v1/sponsored-ads/billing/statements | Months (YYYY-MM) with any ad billing activity, newest first.
[**listSponsoredAdBoosts**](AdsApi.md#listSponsoredAdBoosts) | **GET** /v1/sponsored-ads/boosts | Boosted (pay-on-sale) listings: the rate, sales and fees taken so far. A boost lifts organic ranking by up to 10% and costs its rate only when the listing sells on Crossly.
[**listSponsoredAdCampaigns**](AdsApi.md#listSponsoredAdCampaigns) | **GET** /v1/sponsored-ads/campaigns | Your Sponsored Listings campaigns with status, pacing (spent today, daily cap reached), budgets, bids, placements and stats for the range (from/to, YYYY-MM-DD; default last 30 days).
[**listSponsoredAdListings**](AdsApi.md#listSponsoredAdListings) | **GET** /v1/sponsored-ads/listings | Per-listing ad performance across campaigns for a range, plus suggestions: live listings with views but few sales that are not sponsored yet, with a suggested bid.
[**updateAdOffsite**](AdsApi.md#updateAdOffsite) | **PUT** /v1/ads/offsite | Turn offsite ads on or off. Yours alone to set.
[**updateListingAdCampaign**](AdsApi.md#updateListingAdCampaign) | **PATCH** /v1/listing-ads/{platform}/campaigns/{campaignId} | Change a marketplace campaign: name, dailyBudgetCents, endsAt (null clears), status paused | running | ended.
[**updateListingAdListingRate**](AdsApi.md#updateListingAdListingRate) | **PUT** /v1/listing-ads/{platform}/listings/{platformListingId}/rate | Change one promoted listing&#39;s ad rate (percent of the sale) in the campaign it is in.
[**updateSponsoredAdBillingAutoTopup**](AdsApi.md#updateSponsoredAdBillingAutoTopup) | **PUT** /v1/sponsored-ads/billing/auto-topup | Auto top-up: enabled, thresholdCents (top up when the ad balance drops below it), amountCents (how much). Needs a saved payment method (the first top-up saves it).
[**updateSponsoredAdBoost**](AdsApi.md#updateSponsoredAdBoost) | **PUT** /v1/sponsored-ads/boosts | Boost listings in bulk (platformListingIds, upliftBps 100–2000 &#x3D; 1–20%), or change their rate. Your own live Crossly listings only.
[**updateSponsoredAdCampaign**](AdsApi.md#updateSponsoredAdCampaign) | **PATCH** /v1/sponsored-ads/campaigns/{id} | Edit a campaign. Any of the create fields; listings and keywords, when given, replace the current set. Raising the total budget resumes a campaign stopped by it.
[**updateSponsoredAdSetting**](AdsApi.md#updateSponsoredAdSetting) | **PATCH** /v1/sponsored-ads/settings | Change ads quick settings: adsPaused (pause / resume every ad), accountDailyCapCents (null &#x3D; no cap), defaultBidStrategy (auto | manual) for new campaigns, autoTopup {enabled, thresholdCents?, amountCents?}, railPreference (cash_first | cbx_first, both rails live only).


<a name="createAdOffsiteCampaign"></a>
# **createAdOffsiteCampaign**
> CreateAdOffsiteCampaignResponse createAdOffsiteCampaign()

Launch an offsite campaign for an item.

Creative is built from the structured fields you pass — title, condition as you recorded it, price, image. We generate no prose and invent no claims about condition or authenticity: an ad saying \&quot;mint\&quot; or \&quot;authenticated\&quot; when your listing says neither is a misrepresentation we authored and YOU would take the dispute for. Refuses with 403 when no ad network is wired, rather than returning a campaign that does not exist — a campaign row marked live with nothing behind it would read as spending your money when it is not.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : CreateAdOffsiteCampaignResponse = apiInstance.createAdOffsiteCampaign()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createAdOffsiteCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createAdOffsiteCampaign")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAdOffsiteCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAdOffsiteResume"></a>
# **createAdOffsiteResume**
> CreateAdOffsiteResumeResponse createAdOffsiteResume()

Clear an auto-pause and resume offsite spend.

Returns 409 when you are not actually paused. The pause reason is worth reading first — resuming without changing anything will usually just trip the floor again over the next window.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : CreateAdOffsiteResumeResponse = apiInstance.createAdOffsiteResume()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createAdOffsiteResume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createAdOffsiteResume")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAdOffsiteResumeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingAdBulkAdd"></a>
# **createListingAdBulkAdd**
> CreateListingAdBulkAddResponse createListingAdBulkAdd()

Add listings to a campaign by master listing id: each listing&#39;s live row on &#x60;platform&#x60; joins campaignId (a Crossly campaign uuid, or the marketplace&#39;s campaign id). A listing not live there is its own failed result.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : CreateListingAdBulkAddResponse = apiInstance.createListingAdBulkAdd()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createListingAdBulkAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createListingAdBulkAdd")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateListingAdBulkAddResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingAdCampaign"></a>
# **createListingAdCampaign**
> CreateListingAdCampaignResponse createListingAdCampaign(platform)

Create a campaign on the marketplace: program (promoted_listing_rate &#x3D; eBay General, a % of the sale; cpc_campaign &#x3D; eBay Priority, a daily budget), name, ratePct or dailyBudgetCents, startsAt/endsAt, and the program fields. Idempotency-Key supported.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : CreateListingAdCampaignResponse = apiInstance.createListingAdCampaign(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createListingAdCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createListingAdCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |

### Return type

**CreateListingAdCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingAdCampaignListing"></a>
# **createListingAdCampaignListing**
> CreateListingAdCampaignListingResponse createListingAdCampaignListing(platform, campaignId)

Promote listings in a marketplace campaign. platformListingIds are Crossly platform-listing ids on that marketplace; ratePct sets the ad rate (eBay General). One result per listing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val campaignId : kotlin.String = campaignId_example // kotlin.String | 
try {
    val result : CreateListingAdCampaignListingResponse = apiInstance.createListingAdCampaignListing(platform, campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createListingAdCampaignListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createListingAdCampaignListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **campaignId** | **kotlin.String**|  |

### Return type

**CreateListingAdCampaignListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingAdCampaignListingRemove"></a>
# **createListingAdCampaignListingRemove**
> CreateListingAdCampaignListingResponse createListingAdCampaignListingRemove(platform, campaignId)

Stop promoting listings in a marketplace campaign. One result per listing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val campaignId : kotlin.String = campaignId_example // kotlin.String | 
try {
    val result : CreateListingAdCampaignListingResponse = apiInstance.createListingAdCampaignListingRemove(platform, campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createListingAdCampaignListingRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createListingAdCampaignListingRemove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **campaignId** | **kotlin.String**|  |

### Return type

**CreateListingAdCampaignListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSponsoredAdBillingTopupLink"></a>
# **createSponsoredAdBillingTopupLink**
> CreateSponsoredAdBillingTopupLinkResponse createSponsoredAdBillingTopupLink()

A Stripe Checkout link that adds amountCents ($5–$10,000) to the ad balance when the seller pays it. Nothing is charged until they do. Use an Idempotency-Key to get the same link back on a retry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : CreateSponsoredAdBillingTopupLinkResponse = apiInstance.createSponsoredAdBillingTopupLink()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createSponsoredAdBillingTopupLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createSponsoredAdBillingTopupLink")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSponsoredAdBillingTopupLinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSponsoredAdBoostRemove"></a>
# **createSponsoredAdBoostRemove**
> CreateSponsoredAdBoostRemoveResponse createSponsoredAdBoostRemove()

Stop boosting listings in bulk.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : CreateSponsoredAdBoostRemoveResponse = apiInstance.createSponsoredAdBoostRemove()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createSponsoredAdBoostRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createSponsoredAdBoostRemove")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSponsoredAdBoostRemoveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSponsoredAdCampaign"></a>
# **createSponsoredAdCampaign**
> SponsoredAdCampaignResponse createSponsoredAdCampaign()

Create a Sponsored Listings campaign: name, dailyBudgetCents (≥100), optional totalBudgetCents, defaultBidCents (5–10000; the max bid under bidStrategy \&quot;auto\&quot;), placements (search, browse, product_page, home_rail, storefront, worlds_surface), goal (sales | visits), optional targetCategories / targetRegions (ISO countries) / targetDevices (mobile, desktop, app), optional startsAt/endsAt, listings [{platformListingId, bidCents?, boostBps? (100–2000, pay-on-sale Boost; null clears)}], keywords [{keyword, matchType broad|phrase|exact, negative?, bidCents?}], worldTargets [{kind showroom|convention, id, bidCents?, status?}] (your showroom or a convention you host, promoted in the Crossly World directory; at least one listing or world target), status active|draft. A catalog boost: targetType \&quot;wholesale_catalog\&quot; + targetCatalogId (your catalog), no listings, keywords or world targets; it ranks Sponsored in the wholesale directory. bidStrategy defaults to your account default. Clicks are charged from your ad funds (ad balance and/or CBX, ad credit first); with none it waits as out_of_budget.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : SponsoredAdCampaignResponse = apiInstance.createSponsoredAdCampaign()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createSponsoredAdCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createSponsoredAdCampaign")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**SponsoredAdCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSponsoredAdCampaignDuplicate"></a>
# **createSponsoredAdCampaignDuplicate**
> SponsoredAdCampaignResponse createSponsoredAdCampaignDuplicate(id)

Copy a campaign (settings, listings, keywords) as a new draft.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : SponsoredAdCampaignResponse = apiInstance.createSponsoredAdCampaignDuplicate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createSponsoredAdCampaignDuplicate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createSponsoredAdCampaignDuplicate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**SponsoredAdCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSponsoredAdCampaignStatus"></a>
# **createSponsoredAdCampaignStatus**
> SponsoredAdCampaignResponse createSponsoredAdCampaignStatus(id)

Set a campaign active (launch/resume), paused, or ended (final). Resuming with no ad funds to pay for clicks leaves it out_of_budget until you top up.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : SponsoredAdCampaignResponse = apiInstance.createSponsoredAdCampaignStatus(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#createSponsoredAdCampaignStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#createSponsoredAdCampaignStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**SponsoredAdCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAdOffsite"></a>
# **getAdOffsite**
> GetAdOffsiteResponse getAdOffsite()

Your offsite-ads opt-in and its terms.

Offsite ads spend your CBX advertising budget on external networks — Google, Meta and similar — at our discretion. Your item gets promoted, and the traffic lands on Crossly. OFF unless you turn it on, and there is no path that enables it on your behalf. Media is passed through AT COST with a separate, disclosed management fee, so you can always see how much of your budget reached the auction. &#x60;minReturnBps&#x60; is a STOP, not a guarantee: below it, offsite spend auto-pauses and the rest of your budget reverts to on-platform placement. Nobody can honestly promise ad performance; what we can promise is that it stops.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : GetAdOffsiteResponse = apiInstance.getAdOffsite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getAdOffsite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getAdOffsite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetAdOffsiteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAdOffsiteEligibility"></a>
# **getAdOffsiteEligibility**
> GetAdOffsiteEligibilityResponse getAdOffsiteEligibility()

Whether an item can run offsite, and why not.

Reasons: &#x60;not_opted_in&#x60;, &#x60;auto_paused&#x60;, &#x60;network_not_allowed&#x60;, &#x60;category_not_allowlisted&#x60;, &#x60;no_adapter&#x60;, &#x60;no_budget&#x60;. The category check is an ALLOWLIST, so an unclassified category is not eligible. That is not bureaucracy: ad networks suspend the ACCOUNT over a prohibited item, and the account is one shared resource across every merchant using this — so one listing could take offsite ads away from all of them. A blocklist would fail open on the first category nobody thought of.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : GetAdOffsiteEligibilityResponse = apiInstance.getAdOffsiteEligibility()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getAdOffsiteEligibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getAdOffsiteEligibility")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetAdOffsiteEligibilityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAdOffsiteReport"></a>
# **getAdOffsiteReport**
> GetAdOffsiteReportResponse getAdOffsiteReport()

What your offsite budget bought — including the misses.

Spend, impressions and clicks are reported whether or not anything converted. A report showing only conversions is a report nobody can audit, and this is a feature where you handed over discretion over your money. &#x60;mediaCostCents&#x60; versus &#x60;managementFeeCents&#x60; answers \&quot;how much of my budget reached the auction\&quot; — the two are recorded separately so the answer survives. &#x60;spilloverConversions&#x60; is sales your ads produced on OTHER sellers&#39; items. Reported so you can see whether offsite traffic is reaching buyers who want your item — a high spillover rate is the signal to turn it off. &#x60;returnBps&#x60; is attributed revenue as bps of spend; compare it with your &#x60;minReturnBps&#x60; floor.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : GetAdOffsiteReportResponse = apiInstance.getAdOffsiteReport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getAdOffsiteReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getAdOffsiteReport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetAdOffsiteReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListingAdListing"></a>
# **getListingAdListing**
> GetListingAdListingResponse getListingAdListing(listingId)

Every promotion of one listing: its Crossly campaigns and Boost, and each marketplace ad with status, campaign, rate and last sync.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val listingId : kotlin.String = listingId_example // kotlin.String | 
try {
    val result : GetListingAdListingResponse = apiInstance.getListingAdListing(listingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getListingAdListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getListingAdListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listingId** | **kotlin.String**|  |

### Return type

**GetListingAdListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSponsoredAdBilling"></a>
# **getSponsoredAdBilling**
> GetSponsoredAdBillingResponse getSponsoredAdBilling()

What pays for your ads: headroom across the billing rails (ad balance and/or CBX), unbilled click spend, settlement charges, daily spend, Boost fees and CBX ad-credit grants; funds is the full funds summary (same as /v1/sponsored-ads/funds). refresh&#x3D;true re-reads the balance.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : GetSponsoredAdBillingResponse = apiInstance.getSponsoredAdBilling()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getSponsoredAdBilling")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getSponsoredAdBilling")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSponsoredAdBillingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSponsoredAdBillingStatement"></a>
# **getSponsoredAdBillingStatement**
> GetSponsoredAdBillingStatementResponse getSponsoredAdBillingStatement(month)

One month&#39;s ads statement: opening and closing ad balance, top-ups, click spend by campaign, how clicks were paid, credits, refunds and Boost fees.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val month : kotlin.String = month_example // kotlin.String | 
try {
    val result : GetSponsoredAdBillingStatementResponse = apiInstance.getSponsoredAdBillingStatement(month)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getSponsoredAdBillingStatement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getSponsoredAdBillingStatement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **month** | **kotlin.String**|  |

### Return type

**GetSponsoredAdBillingStatementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSponsoredAdBillingStatementPdf"></a>
# **getSponsoredAdBillingStatementPdf**
> java.io.File getSponsoredAdBillingStatementPdf(month)

One month&#39;s ads statement as a PDF.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val month : kotlin.String = month_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.getSponsoredAdBillingStatementPdf(month)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getSponsoredAdBillingStatementPdf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getSponsoredAdBillingStatementPdf")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **month** | **kotlin.String**|  |

### Return type

**java.io.File**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSponsoredAdBillingTopupReceipt"></a>
# **getSponsoredAdBillingTopupReceipt**
> java.io.File getSponsoredAdBillingTopupReceipt(id)

One ad balance top-up&#39;s receipt as a PDF (each top-up in the billing history carries its id and receipt number).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.getSponsoredAdBillingTopupReceipt(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getSponsoredAdBillingTopupReceipt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getSponsoredAdBillingTopupReceipt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**java.io.File**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSponsoredAdCampaign"></a>
# **getSponsoredAdCampaign**
> SponsoredAdCampaignResponse getSponsoredAdCampaign(id)

One campaign: settings, its listings (bid, suggested bid, live, per-listing stats) and keywords. A catalog boost (targetType wholesale_catalog) has &#x60;catalogs&#x60;: per boosted catalog impressions, clicks, spend, attributed trade orders and revenue, CTR and ROAS.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : SponsoredAdCampaignResponse = apiInstance.getSponsoredAdCampaign(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getSponsoredAdCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getSponsoredAdCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**SponsoredAdCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSponsoredAdFund"></a>
# **getSponsoredAdFund**
> GetSponsoredAdFundResponse getSponsoredAdFund()

What can pay for clicks now: the billing rails in effect (ad balance and/or CBX), the ad balance and ad credit, CBX headroom, unbilled clicks, available cents, auto top-up, the saved payment method and the refundable balance. refresh&#x3D;true re-reads CBX.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : GetSponsoredAdFundResponse = apiInstance.getSponsoredAdFund()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getSponsoredAdFund")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getSponsoredAdFund")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSponsoredAdFundResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSponsoredAdReport"></a>
# **getSponsoredAdReport**
> GetSponsoredAdReportResponse getSponsoredAdReport()

Sponsored report for a range: totals (spend, impressions, clicks, CTR, average CPC, attributed orders and revenue, ROAS), a zero-filled daily series, per-campaign rows (targetType listings | wholesale_catalog) and &#x60;catalogs&#x60;, one row per boosted catalog. Listing orders are Crossly purchases of the advertised listing within 7 days of a click by the same buyer; catalog orders are trade orders with that seller within 7 days of a catalog click by the same buyer. Catalog impressions count once per viewer per day.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : GetSponsoredAdReportResponse = apiInstance.getSponsoredAdReport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getSponsoredAdReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getSponsoredAdReport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSponsoredAdReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSponsoredAdSetting"></a>
# **getSponsoredAdSetting**
> SponsoredAdResponse getSponsoredAdSetting()

Ads quick settings: adsPaused, accountDailyCapCents and spentTodayCents, defaultBidStrategy, autoTopup.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : SponsoredAdResponse = apiInstance.getSponsoredAdSetting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#getSponsoredAdSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#getSponsoredAdSetting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**SponsoredAdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListingAdCampaigns"></a>
# **listListingAdCampaigns**
> ListListingAdCampaignsResponse listListingAdCampaigns(platform)

Your ad campaigns on one marketplace (cached up to 15 minutes; refresh&#x3D;true asks the marketplace now).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : ListListingAdCampaignsResponse = apiInstance.listListingAdCampaigns(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#listListingAdCampaigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#listListingAdCampaigns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |

### Return type

**ListListingAdCampaignsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListingAdPlatforms"></a>
# **listListingAdPlatforms**
> ListListingAdPlatformsResponse listListingAdPlatforms()

The ads registry: each marketplace that sells promotion, its programs (kind, scope, campaign and listing fields), which verbs are wired / need a capture / are unsupported, and whether you are connected there.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : ListListingAdPlatformsResponse = apiInstance.listListingAdPlatforms()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#listListingAdPlatforms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#listListingAdPlatforms")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListListingAdPlatformsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSponsoredAdBillingHistory"></a>
# **listSponsoredAdBillingHistory**
> ListSponsoredAdBillingHistoryResponse listSponsoredAdBillingHistory()

Billing history newest first: top-ups (status, receipt number), click charges (how each was paid: ad balance, credit, CBX, written off), credits, refunds and Boost fees. kind filters; before (ISO time) pages; limit ≤ 100.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : ListSponsoredAdBillingHistoryResponse = apiInstance.listSponsoredAdBillingHistory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#listSponsoredAdBillingHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#listSponsoredAdBillingHistory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSponsoredAdBillingHistoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSponsoredAdBillingStatements"></a>
# **listSponsoredAdBillingStatements**
> ListSponsoredAdBillingStatementsResponse listSponsoredAdBillingStatements()

Months (YYYY-MM) with any ad billing activity, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : ListSponsoredAdBillingStatementsResponse = apiInstance.listSponsoredAdBillingStatements()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#listSponsoredAdBillingStatements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#listSponsoredAdBillingStatements")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSponsoredAdBillingStatementsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSponsoredAdBoosts"></a>
# **listSponsoredAdBoosts**
> ListSponsoredAdBoostsResponse listSponsoredAdBoosts()

Boosted (pay-on-sale) listings: the rate, sales and fees taken so far. A boost lifts organic ranking by up to 10% and costs its rate only when the listing sells on Crossly.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : ListSponsoredAdBoostsResponse = apiInstance.listSponsoredAdBoosts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#listSponsoredAdBoosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#listSponsoredAdBoosts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSponsoredAdBoostsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSponsoredAdCampaigns"></a>
# **listSponsoredAdCampaigns**
> ListSponsoredAdCampaignsResponse listSponsoredAdCampaigns()

Your Sponsored Listings campaigns with status, pacing (spent today, daily cap reached), budgets, bids, placements and stats for the range (from/to, YYYY-MM-DD; default last 30 days).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : ListSponsoredAdCampaignsResponse = apiInstance.listSponsoredAdCampaigns()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#listSponsoredAdCampaigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#listSponsoredAdCampaigns")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSponsoredAdCampaignsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSponsoredAdListings"></a>
# **listSponsoredAdListings**
> ListSponsoredAdListingsResponse listSponsoredAdListings()

Per-listing ad performance across campaigns for a range, plus suggestions: live listings with views but few sales that are not sponsored yet, with a suggested bid.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : ListSponsoredAdListingsResponse = apiInstance.listSponsoredAdListings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#listSponsoredAdListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#listSponsoredAdListings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSponsoredAdListingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAdOffsite"></a>
# **updateAdOffsite**
> UpdateAdOffsiteResponse updateAdOffsite()

Turn offsite ads on or off. Yours alone to set.

The toggle. Nothing else in the system sets &#x60;enabled&#x60; — no onboarding default, no bulk enable, no admin override. &#x60;maxOffsiteShareBps&#x60; caps how much of your budget may leave the platform, so opting in does not mean discovering the whole thing went to Google. &#x60;minReturnBps&#x60; sets the floor below which offsite spend auto-pauses: 20000 means we must return $2 of attributed revenue per $1 spent over the window. Toggling either way clears any existing auto-pause, so turning it back on later does not inherit a pause from months ago. When one of your ads brings a buyer who purchases somebody ELSE&#39;s item, that is reported to you as spillover so you can judge whether offsite traffic is reaching buyers who want YOUR item, and switch it off if not. It is not credited back — you bought clicks, which is how every ad market works.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : UpdateAdOffsiteResponse = apiInstance.updateAdOffsite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#updateAdOffsite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#updateAdOffsite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateAdOffsiteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateListingAdCampaign"></a>
# **updateListingAdCampaign**
> CreateListingAdCampaignResponse updateListingAdCampaign(platform, campaignId)

Change a marketplace campaign: name, dailyBudgetCents, endsAt (null clears), status paused | running | ended.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val campaignId : kotlin.String = campaignId_example // kotlin.String | 
try {
    val result : CreateListingAdCampaignResponse = apiInstance.updateListingAdCampaign(platform, campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#updateListingAdCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#updateListingAdCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **campaignId** | **kotlin.String**|  |

### Return type

**CreateListingAdCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateListingAdListingRate"></a>
# **updateListingAdListingRate**
> UpdateListingAdListingRateResponse updateListingAdListingRate(platform, platformListingId)

Change one promoted listing&#39;s ad rate (percent of the sale) in the campaign it is in.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val platformListingId : kotlin.String = platformListingId_example // kotlin.String | 
try {
    val result : UpdateListingAdListingRateResponse = apiInstance.updateListingAdListingRate(platform, platformListingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#updateListingAdListingRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#updateListingAdListingRate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **platformListingId** | **kotlin.String**|  |

### Return type

**UpdateListingAdListingRateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSponsoredAdBillingAutoTopup"></a>
# **updateSponsoredAdBillingAutoTopup**
> SponsoredAdResponse updateSponsoredAdBillingAutoTopup()

Auto top-up: enabled, thresholdCents (top up when the ad balance drops below it), amountCents (how much). Needs a saved payment method (the first top-up saves it).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : SponsoredAdResponse = apiInstance.updateSponsoredAdBillingAutoTopup()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#updateSponsoredAdBillingAutoTopup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#updateSponsoredAdBillingAutoTopup")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**SponsoredAdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSponsoredAdBoost"></a>
# **updateSponsoredAdBoost**
> UpdateSponsoredAdBoostResponse updateSponsoredAdBoost()

Boost listings in bulk (platformListingIds, upliftBps 100–2000 &#x3D; 1–20%), or change their rate. Your own live Crossly listings only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : UpdateSponsoredAdBoostResponse = apiInstance.updateSponsoredAdBoost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#updateSponsoredAdBoost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#updateSponsoredAdBoost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateSponsoredAdBoostResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSponsoredAdCampaign"></a>
# **updateSponsoredAdCampaign**
> SponsoredAdCampaignResponse updateSponsoredAdCampaign(id)

Edit a campaign. Any of the create fields; listings and keywords, when given, replace the current set. Raising the total budget resumes a campaign stopped by it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : SponsoredAdCampaignResponse = apiInstance.updateSponsoredAdCampaign(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#updateSponsoredAdCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#updateSponsoredAdCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**SponsoredAdCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSponsoredAdSetting"></a>
# **updateSponsoredAdSetting**
> SponsoredAdResponse updateSponsoredAdSetting()

Change ads quick settings: adsPaused (pause / resume every ad), accountDailyCapCents (null &#x3D; no cap), defaultBidStrategy (auto | manual) for new campaigns, autoTopup {enabled, thresholdCents?, amountCents?}, railPreference (cash_first | cbx_first, both rails live only).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AdsApi()
try {
    val result : SponsoredAdResponse = apiInstance.updateSponsoredAdSetting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdsApi#updateSponsoredAdSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdsApi#updateSponsoredAdSetting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**SponsoredAdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

