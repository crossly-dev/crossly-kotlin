# ListingsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAiDetectionDispute**](ListingsApi.md#createAiDetectionDispute) | **POST** /v1/ai-detections/{id}/dispute | Dispute an AI-image detection on your photo (sends it to Crossly review).
[**createEvent**](ListingsApi.md#createEvent) | **POST** /v1/events | Create an event. A draft unless publish:true. Linked listings, the live show, the drop and the discount code must all be yours.
[**createEventPublish**](ListingsApi.md#createEventPublish) | **POST** /v1/events/{id}/publish | Publish an event: its page goes live, and with notifyFollowers your followers are told once.
[**createListing**](ListingsApi.md#createListing) | **POST** /v1/listings | Create a listing and fan out crosspost jobs across platforms.
[**createListingBulk**](ListingsApi.md#createListingBulk) | **POST** /v1/listings/bulk | Create up to 50 listings in one call, with a result per item.
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
[**createListingTagBulk**](ListingsApi.md#createListingTagBulk) | **POST** /v1/listings/tags/bulk | Add and/or remove tags on many listings (yours only; max 30 tags a listing, 40 chars a tag). &#x60;dryRun&#x60; reports what would change.
[**createListingTagRename**](ListingsApi.md#createListingTagRename) | **POST** /v1/listings/tags/rename | Rename a tag on every listing; merges into &#x60;to&#x60; when it already exists.
[**createLiveStream**](ListingsApi.md#createLiveStream) | **POST** /v1/live-streams | Schedule a live show: title, start time, optional cover, category and the listings to feature (becomes the lineup, in order).
[**createLiveStreamConnection**](ListingsApi.md#createLiveStreamConnection) | **POST** /v1/live-streams/{id}/connection | The show’s video connection, minted on first call and identical after: RTMP(S) server + stream key, SRT URL, WHIP URL for browser publishing (null where the ingest has none) and the HLS playback URL. configured&#x3D;false (with a reason) when the deployment has no streaming provider.
[**createLiveStreamConnectionRotate**](ListingsApi.md#createLiveStreamConnectionRotate) | **POST** /v1/live-streams/{id}/connection/rotate | Replace the show’s stream key (e.g. after it was shown on screen). Refused while the show is live.
[**createLiveStreamEnd**](ListingsApi.md#createLiveStreamEnd) | **POST** /v1/live-streams/{id}/end | End the show. Idempotent.
[**createLiveStreamPinLaunch**](ListingsApi.md#createLiveStreamPinLaunch) | **POST** /v1/live-streams/{id}/pin-launch | Pin one of your live NFT launches on your live show; viewers mint it from the stream. Returns &#x60;{ ok }&#x60;.
[**createLiveStreamStart**](ListingsApi.md#createLiveStreamStart) | **POST** /v1/live-streams/{id}/start | Go live: the show’s status becomes live and followers are notified once. Idempotent while live; refused once ended.
[**createPassport**](ListingsApi.md#createPassport) | **POST** /v1/passports | Register a product passport for a Crossly listing or an inventory item you sell, optionally bound to an NFC tag UID (hex). Active at once. Returns the URL to write to the NFC tag or print as a QR; ownership then follows the item’s sales. For several items with photos and labels, use the drafts flow (POST /passports/drafts).
[**createPassportDraft**](ListingsApi.md#createPassportDraft) | **POST** /v1/passports/drafts | Start a passport draft for up to 100 inventory items (or Crossly listings): one draft passport per item with its code reserved. Items whose every unit already has a passport come back in skipped.
[**createPassportDraftActivate**](ListingsApi.md#createPassportDraftActivate) | **POST** /v1/passports/drafts/{id}/activate | Activate every passport of a draft: their pages open for anyone who scans the tag or QR. Closes the draft’s capture link.
[**createPassportDraftCaptureLink**](ListingsApi.md#createPassportDraftCaptureLink) | **POST** /v1/passports/drafts/{id}/capture-link | A link (and its QR as SVG) any phone opens with no sign-in to add photos, serials and NFC tags to this draft. Open 30 minutes after its last use, 4 hours at most; minting a new one closes the old.
[**createPassportPrint**](ListingsApi.md#createPassportPrint) | **POST** /v1/passports/print | Print passport labels: sent to your printer agent (the Crossly desktop app includes one) when it is online and prints the template, else a signed PDF link with the reason. Templates: sticker-2in, sticker-1in, label-4x6, hang-tag, sheet-letter, sheet-a4, transfer-card.
[**createPassportRevoke**](ListingsApi.md#createPassportRevoke) | **POST** /v1/passports/{id}/revoke | Revoke a passport (a lost or misprinted tag). Refused once the item has sold — the passport is then part of its history.
[**createPassportTag**](ListingsApi.md#createPassportTag) | **POST** /v1/passports/{id}/tag | Bind (or re-bind) a passport to the NFC tag you wrote its nfcUrl to: the tag UID (hex), and whether you locked the tag read-only. Refused once the item has sold, for a locked tag, or a tag already on another item.
[**createRentalBulkRentable**](ListingsApi.md#createRentalBulkRentable) | **POST** /v1/rentals/bulk-rentable | Make up to 200 Crossly listings rentable with the same options (a day rate, or a share of each price).
[**createShopLimitRequest**](ListingsApi.md#createShopLimitRequest) | **POST** /v1/shop-limits/requests | Ask for a higher Crossly Shop selling limit.
[**createStory**](ListingsApi.md#createStory) | **POST** /v1/stories | Share a story: 1–10 slides played in order. Each slide is a photo or video plus optional overlays (positions are fractions of the 9:16 frame). Listing stickers must be your own Crossly listings and also tag the slide; @mentions must be real shops. audience: everyone | followers; expiresInHours: 6, 12, 24 or 48.
[**createVariationGroup**](ListingsApi.md#createVariationGroup) | **POST** /v1/variation-groups | Group listings you already have: a variation (one product, an axis such as Size) or a purchase-rule group (\&quot;buy any 3\&quot;).
[**createVariationGroupGenerate**](ListingsApi.md#createVariationGroupGenerate) | **POST** /v1/variation-groups/generate | Turn one listing into a variation group: each new value becomes its own listing (a copy, with its own price, quantity and SKU) and all of them one group.
[**createVariationGroupGenerateMatrix**](ListingsApi.md#createVariationGroupGenerateMatrix) | **POST** /v1/variation-groups/generate-matrix | Turn one listing into a variation group over up to three axes (Size × Color): each other cell is a listing you already have (listingId) or a new copy of this one with its own price, quantity and SKU.
[**createVariationGroupPublish**](ListingsApi.md#createVariationGroupPublish) | **POST** /v1/variation-groups/{id}/publish | Publish a variation group per platform: one listing with a variation picker where the platform supports it (eBay, Shopify, Etsy), one per option elsewhere. Each platform reports its own outcome.
[**createVideoStudioFinalize**](ListingsApi.md#createVideoStudioFinalize) | **POST** /v1/video-studio/finalize | Check an uploaded listing video (exists, MP4, size) and, with listingId, set it as that listing&#39;s video.
[**createVideoStudioUploadUrl**](ListingsApi.md#createVideoStudioUploadUrl) | **POST** /v1/video-studio/upload-url | Presign an R2 PUT (video/mp4, 15 min) for a listing video; finalize it after the upload.
[**deleteEvent**](ListingsApi.md#deleteEvent) | **DELETE** /v1/events/{id} | Delete a draft, or cancel a published event (its page then says it was called off).
[**deleteListing**](ListingsApi.md#deleteListing) | **DELETE** /v1/listings/{id} | Delist a listing (optionally narrowed to specific platforms via ?platforms&#x3D;).
[**deleteListingTag**](ListingsApi.md#deleteListingTag) | **DELETE** /v1/listings/tags/{tag} | Remove a tag (any case) from every listing.
[**deleteLiveStreamPinLaunch**](ListingsApi.md#deleteLiveStreamPinLaunch) | **DELETE** /v1/live-streams/{id}/pin-launch | Unpin the launch from your live show. Returns &#x60;{ ok }&#x60;.
[**deleteRentalOffer**](ListingsApi.md#deleteRentalOffer) | **DELETE** /v1/rentals/offers/{platformListingId} | Stop offering a listing for rent (existing bookings stand).
[**deleteStory**](ListingsApi.md#deleteStory) | **DELETE** /v1/stories/{id} | Take one story slide down before it expires.
[**deleteVariationGroup**](ListingsApi.md#deleteVariationGroup) | **DELETE** /v1/variation-groups/{id} | Dissolve a group. Its options stay as ordinary listings.
[**getEvent**](ListingsApi.md#getEvent) | **GET** /v1/events/{id} | One of your events.
[**getEventAnalytic**](ListingsApi.md#getEventAnalytic) | **GET** /v1/events/{id}/analytics | Views, RSVPs, and what the linked listings sold on Crossly during the event (orders, units, revenue in cents).
[**getListing**](ListingsApi.md#getListing) | **GET** /v1/listings/{id} | Get one listing with its platform rows.
[**getListingFacet**](ListingsApi.md#getListingFacet) | **GET** /v1/listings/facets | Distinct brands + categories across listings + inventory.
[**getListingSkuExist**](ListingsApi.md#getListingSkuExist) | **GET** /v1/listings/sku-exists | Check whether a SKU is already used by one of this user&#39;s items.
[**getLiveStreamRecap**](ListingsApi.md#getLiveStreamRecap) | **GET** /v1/live-streams/{id}/recap | The show’s numbers: duration, peak viewers, items sold and gross, tips, chat messages, auctions run, lineup size and the replay URL.
[**getPassport**](ListingsApi.md#getPassport) | **GET** /v1/passports/{id} | One passport: its item and every listing of it, the event history (created, printed, tag bound, transferred, claimed…), scans per day for 30 days, custody, grading.
[**getPassportDraft**](ListingsApi.md#getPassportDraft) | **GET** /v1/passports/drafts/{id} | A passport draft and its passports (photos, serial, tag and label state of each).
[**getPassportPrint**](ListingsApi.md#getPassportPrint) | **GET** /v1/passports/print/{jobId} | Where a passport print job sent to your agent is: queued, sent, done, failed, expired or duplicate.
[**getPricingSetting**](ListingsApi.md#getPricingSetting) | **GET** /v1/pricing/settings | Selling options: own-price match (Crossly sells your items at your own lower price for the same item on another marketplace; dollar-priced copies only) and layaway (buyers may put items on layaway). Both on by default.
[**getPricingSoldComp**](ListingsApi.md#getPricingSoldComp) | **GET** /v1/pricing/sold-comps | What one catalog product (market_sku_id, in one condition) actually sold for across Crossly in the last 180 days: median, p25/p75, p10/p90 (null under 10 sales), sale count, last sold, and days from listing to sale (median, p25, p75). Pass marketSkuId (+ optional condition) or one of your listingIds. comps is null until there are 3+ sales from 2+ sellers; holdCode says why there is nothing (no_market_sku, mixed_inventory, below_privacy_floor) — the same reasons a sold_median reprice rule holds.
[**getRentalSetting**](ListingsApi.md#getRentalSetting) | **GET** /v1/rentals/settings | The store’s rental defaults (every item inherits them) and its payout timing.
[**getShopLimit**](ListingsApi.md#getShopLimit) | **GET** /v1/shop-limits | Your Crossly Shop selling limit: live listings and listed value, used of limit, per store, and the next step.
[**listEventAttendees**](ListingsApi.md#listEventAttendees) | **GET** /v1/events/{id}/attendees | Who RSVPd: display name, avatar, going or interested, and when. No contact details.
[**listEvents**](ListingsApi.md#listEvents) | **GET** /v1/events | Your events (launches, sales, live shows, drops, meetups, pop-ups, workshops, parties): schedule, status, phase, and going/interested counts.
[**listListingAiDetections**](ListingsApi.md#listListingAiDetections) | **GET** /v1/listings/{id}/ai-detections | Crossly&#39;s AI-image detections for a listing&#39;s photos.
[**listListingDiscrepancies**](ListingsApi.md#listListingDiscrepancies) | **GET** /v1/listings/{id}/discrepancies | List detected marketplace-drift discrepancies for a listing.
[**listListingIds**](ListingsApi.md#listListingIds) | **GET** /v1/listings/ids | Filter listings → return matching id list (no pagination).
[**listListingTagSuggest**](ListingsApi.md#listListingTagSuggest) | **GET** /v1/listings/tags/suggest | Deterministic tag suggestions for one listing (brand, category, size, condition, colors, style tags, era words in the title); &#x60;known&#x60; &#x3D; you already use the tag.
[**listListingTags**](ListingsApi.md#listListingTags) | **GET** /v1/listings/tags | Your listing tags with how many listings carry each, most used first (case-insensitive; &#x60;q&#x60; filters).
[**listListings**](ListingsApi.md#listListings) | **GET** /v1/listings | List active platform listings.
[**listLiveStreams**](ListingsApi.md#listLiveStreams) | **GET** /v1/live-streams | Your live shows, newest scheduled first: status, cover, category, connection method and peak viewers.
[**listPassportEvents**](ListingsApi.md#listPassportEvents) | **GET** /v1/passports/{id}/events | A passport’s event history, newest first (never a buyer or a price).
[**listPassportPrintTargets**](ListingsApi.md#listPassportPrintTargets) | **GET** /v1/passports/print-targets | Your printer agents (online, printers, default) and the passport label templates each can print.
[**listPassports**](ListingsApi.md#listPassports) | **GET** /v1/passports | Product passports you registered (optionally for one Crossly listing): the code and URL each tag carries.
[**listRentalOffers**](ListingsApi.md#listRentalOffers) | **GET** /v1/rentals/offers | What you offer for rent.
[**listStories**](ListingsApi.md#listStories) | **GET** /v1/stories | Your active story slides (newest run first, each run in play order), with their overlays: text, listing stickers, @mentions, links, emoji and drawing.
[**updateEvent**](ListingsApi.md#updateEvent) | **PATCH** /v1/events/{id} | Edit an event. Omitted fields are unchanged; null clears.
[**updateHotspot**](ListingsApi.md#updateHotspot) | **PUT** /v1/hotspots | Tag your listings at points on a story or lookbook photo (shop the look). Replaces that photo’s tags; at most 12.
[**updateListing**](ListingsApi.md#updateListing) | **PATCH** /v1/listings/{id} | Edit a listing and fan out update jobs to existing platform listings.
[**updateListingCustom**](ListingsApi.md#updateListingCustom) | **PUT** /v1/listings/{id}/customs | Set a listing’s customs: HS code (6–10 digits), country of origin, and countries this item must not ship to on Crossly. Omitted fields are left alone; null (or [] for restrictedCountries) clears.
[**updateListingPlatformListing**](ListingsApi.md#updateListingPlatformListing) | **PATCH** /v1/listings/{id}/platform-listings/{plId} | Set one marketplace copy&#39;s price (e.g. the ebay.com copy of a listing also live on ebay.co.uk), in that copy&#39;s own currency.
[**updateLiveStream**](ListingsApi.md#updateLiveStream) | **PATCH** /v1/live-streams/{id} | Edit a show that has not ended: title, description, cover, category, start time (not once live) or connection method (browser | phone | encoder).
[**updateLiveStreamLineup**](ListingsApi.md#updateLiveStreamLineup) | **PUT** /v1/live-streams/{id}/lineup | Set a live show’s lineup: your Crossly listings, in the order you will sell them. Buyers see it before they join; a sale of a lineup item while the show is live is recorded at its replay moment.
[**updatePassport**](ListingsApi.md#updatePassport) | **PATCH** /v1/passports/{id} | Change what a passport says (title, condition, maker, year, materials, notes) or add photo URLs (photos append: a passport keeps the ones it was registered with).
[**updatePassportDraft**](ListingsApi.md#updatePassportDraft) | **PATCH** /v1/passports/drafts/{id} | Move a draft to a step, pick its label template, add items or remove draft passports.
[**updatePricingSetting**](ListingsApi.md#updatePricingSetting) | **PUT** /v1/pricing/settings | Turn own-price match and/or layaway on or off for every one of your stores. One store: PUT /v1/storefronts/{id}/settings.
[**updateRentalOffer**](ListingsApi.md#updateRentalOffer) | **PUT** /v1/rentals/offers/{platformListingId} | Offer a Crossly listing for rent: day rate, optional week rate, deposit, min/max days, turnaround buffer, rent-only (off sale while offered), seller approval, unavailable date ranges (blackoutRanges, inclusive YYYY-MM-DD) and a return policy. Keeps the listing’s own rental terms in step. Needs a ship-from address.
[**updateRentalSetting**](ListingsApi.md#updateRentalSetting) | **PUT** /v1/rentals/settings | Set the store’s rental defaults and payout timing (on_start needs 3 rentals that came back).
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

<a name="createEvent"></a>
# **createEvent**
> EventResponse createEvent()

Create an event. A draft unless publish:true. Linked listings, the live show, the drop and the discount code must all be yours.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : EventResponse = apiInstance.createEvent()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createEvent")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**EventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createEventPublish"></a>
# **createEventPublish**
> EventResponse createEventPublish(id)

Publish an event: its page goes live, and with notifyFollowers your followers are told once.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : EventResponse = apiInstance.createEventPublish(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createEventPublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createEventPublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**EventResponse**

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

Listing fields go in &#x60;data&#x60;. Channel apps can also send &#x60;categoryId&#x60; (GET /v1/categories/search), &#x60;itemSpecifics&#x60; (validated against GET /v1/categories/:id/aspects; &#x60;warnings&#x60; lists soft problems), &#x60;condition&#x60;, &#x60;brand&#x60;, per-marketplace &#x60;overrides&#x60; and &#x60;policies&#x60; (preset ids from GET /v1/policies), folded in the way the web form does: an override replaces the master value on that marketplace, anything derived only fills blanks.

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

<a name="createListingBulk"></a>
# **createListingBulk**
> CreateListingBulkResponse createListingBulk()

Create up to 50 listings in one call, with a result per item.

Each item is a POST /v1/listings body plus a required &#x60;clientReferenceId&#x60; (your id for it). Items run in order and independently: &#x60;data[i].status&#x60; is &#x60;created&#x60;, &#x60;existing&#x60; (that reference was already used — the listing is returned, nothing is created) or &#x60;error&#x60; with the code the single route would give. &#x60;error&#x60; means no listing exists for the item. A listing that was saved but could not be sent to a platform (e.g. no weight) is &#x60;created&#x60;, with that platform in &#x60;skipped&#x60; (reason, code, details). &#x60;meta&#x60; counts each. Retrying a batch only creates what is missing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingBulkResponse = apiInstance.createListingBulk()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingBulk")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateListingBulkResponse**

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

<a name="createListingTagBulk"></a>
# **createListingTagBulk**
> CreateListingTagBulkResponse createListingTagBulk()

Add and/or remove tags on many listings (yours only; max 30 tags a listing, 40 chars a tag). &#x60;dryRun&#x60; reports what would change.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingTagBulkResponse = apiInstance.createListingTagBulk()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingTagBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingTagBulk")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateListingTagBulkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingTagRename"></a>
# **createListingTagRename**
> CreateListingTagRenameResponse createListingTagRename()

Rename a tag on every listing; merges into &#x60;to&#x60; when it already exists.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateListingTagRenameResponse = apiInstance.createListingTagRename()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createListingTagRename")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createListingTagRename")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateListingTagRenameResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLiveStream"></a>
# **createLiveStream**
> LiveStreamResponse createLiveStream()

Schedule a live show: title, start time, optional cover, category and the listings to feature (becomes the lineup, in order).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : LiveStreamResponse = apiInstance.createLiveStream()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createLiveStream")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createLiveStream")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**LiveStreamResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLiveStreamConnection"></a>
# **createLiveStreamConnection**
> CreateLiveStreamConnectionResponse createLiveStreamConnection(id)

The show’s video connection, minted on first call and identical after: RTMP(S) server + stream key, SRT URL, WHIP URL for browser publishing (null where the ingest has none) and the HLS playback URL. configured&#x3D;false (with a reason) when the deployment has no streaming provider.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateLiveStreamConnectionResponse = apiInstance.createLiveStreamConnection(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createLiveStreamConnection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createLiveStreamConnection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateLiveStreamConnectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLiveStreamConnectionRotate"></a>
# **createLiveStreamConnectionRotate**
> CreateLiveStreamConnectionResponse createLiveStreamConnectionRotate(id)

Replace the show’s stream key (e.g. after it was shown on screen). Refused while the show is live.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateLiveStreamConnectionResponse = apiInstance.createLiveStreamConnectionRotate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createLiveStreamConnectionRotate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createLiveStreamConnectionRotate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateLiveStreamConnectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLiveStreamEnd"></a>
# **createLiveStreamEnd**
> LiveStreamResponse createLiveStreamEnd(id)

End the show. Idempotent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : LiveStreamResponse = apiInstance.createLiveStreamEnd(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createLiveStreamEnd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createLiveStreamEnd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**LiveStreamResponse**

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

<a name="createLiveStreamStart"></a>
# **createLiveStreamStart**
> LiveStreamResponse createLiveStreamStart(id)

Go live: the show’s status becomes live and followers are notified once. Idempotent while live; refused once ended.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : LiveStreamResponse = apiInstance.createLiveStreamStart(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createLiveStreamStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createLiveStreamStart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**LiveStreamResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPassport"></a>
# **createPassport**
> PassportResponse createPassport()

Register a product passport for a Crossly listing or an inventory item you sell, optionally bound to an NFC tag UID (hex). Active at once. Returns the URL to write to the NFC tag or print as a QR; ownership then follows the item’s sales. For several items with photos and labels, use the drafts flow (POST /passports/drafts).

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

<a name="createPassportDraft"></a>
# **createPassportDraft**
> PassportDraftResponse createPassportDraft()

Start a passport draft for up to 100 inventory items (or Crossly listings): one draft passport per item with its code reserved. Items whose every unit already has a passport come back in skipped.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : PassportDraftResponse = apiInstance.createPassportDraft()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createPassportDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createPassportDraft")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**PassportDraftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPassportDraftActivate"></a>
# **createPassportDraftActivate**
> PassportDraftResponse createPassportDraftActivate(id)

Activate every passport of a draft: their pages open for anyone who scans the tag or QR. Closes the draft’s capture link.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : PassportDraftResponse = apiInstance.createPassportDraftActivate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createPassportDraftActivate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createPassportDraftActivate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**PassportDraftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPassportDraftCaptureLink"></a>
# **createPassportDraftCaptureLink**
> CreatePassportDraftCaptureLinkResponse createPassportDraftCaptureLink(id)

A link (and its QR as SVG) any phone opens with no sign-in to add photos, serials and NFC tags to this draft. Open 30 minutes after its last use, 4 hours at most; minting a new one closes the old.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatePassportDraftCaptureLinkResponse = apiInstance.createPassportDraftCaptureLink(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createPassportDraftCaptureLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createPassportDraftCaptureLink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatePassportDraftCaptureLinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPassportPrint"></a>
# **createPassportPrint**
> CreatePassportPrintResponse createPassportPrint()

Print passport labels: sent to your printer agent (the Crossly desktop app includes one) when it is online and prints the template, else a signed PDF link with the reason. Templates: sticker-2in, sticker-1in, label-4x6, hang-tag, sheet-letter, sheet-a4, transfer-card.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreatePassportPrintResponse = apiInstance.createPassportPrint()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createPassportPrint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createPassportPrint")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreatePassportPrintResponse**

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

<a name="createRentalBulkRentable"></a>
# **createRentalBulkRentable**
> CreateRentalBulkRentableResponse createRentalBulkRentable()

Make up to 200 Crossly listings rentable with the same options (a day rate, or a share of each price).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateRentalBulkRentableResponse = apiInstance.createRentalBulkRentable()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createRentalBulkRentable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createRentalBulkRentable")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateRentalBulkRentableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createShopLimitRequest"></a>
# **createShopLimitRequest**
> CreateShopLimitRequestResponse createShopLimitRequest(createShopLimitRequestRequest)

Ask for a higher Crossly Shop selling limit.

One pending request at a time (409 otherwise). Approved on the spot when your last 90 days are clean (no auto-cancelled orders, disputes lost or chargebacks lost) and every number asked is at most twice your current limit; otherwise Crossly staff review it. &#x60;valueCents&#x60; is US cents.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val createShopLimitRequestRequest : CreateShopLimitRequestRequest =  // CreateShopLimitRequestRequest | 
try {
    val result : CreateShopLimitRequestResponse = apiInstance.createShopLimitRequest(createShopLimitRequestRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createShopLimitRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createShopLimitRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createShopLimitRequestRequest** | **CreateShopLimitRequestRequest**|  |

### Return type

**CreateShopLimitRequestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStory"></a>
# **createStory**
> CreateStoryResponse createStory()

Share a story: 1–10 slides played in order. Each slide is a photo or video plus optional overlays (positions are fractions of the 9:16 frame). Listing stickers must be your own Crossly listings and also tag the slide; @mentions must be real shops. audience: everyone | followers; expiresInHours: 6, 12, 24 or 48.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateStoryResponse = apiInstance.createStory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createStory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createStory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStoryResponse**

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

<a name="createVariationGroupGenerateMatrix"></a>
# **createVariationGroupGenerateMatrix**
> CreateVariationGroupGenerateMatrixResponse createVariationGroupGenerateMatrix()

Turn one listing into a variation group over up to three axes (Size × Color): each other cell is a listing you already have (listingId) or a new copy of this one with its own price, quantity and SKU.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateVariationGroupGenerateMatrixResponse = apiInstance.createVariationGroupGenerateMatrix()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createVariationGroupGenerateMatrix")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createVariationGroupGenerateMatrix")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVariationGroupGenerateMatrixResponse**

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

<a name="createVideoStudioFinalize"></a>
# **createVideoStudioFinalize**
> CreateVideoStudioFinalizeResponse createVideoStudioFinalize()

Check an uploaded listing video (exists, MP4, size) and, with listingId, set it as that listing&#39;s video.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateVideoStudioFinalizeResponse = apiInstance.createVideoStudioFinalize()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createVideoStudioFinalize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createVideoStudioFinalize")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVideoStudioFinalizeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVideoStudioUploadUrl"></a>
# **createVideoStudioUploadUrl**
> CreateVideoStudioUploadUrlResponse createVideoStudioUploadUrl()

Presign an R2 PUT (video/mp4, 15 min) for a listing video; finalize it after the upload.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : CreateVideoStudioUploadUrlResponse = apiInstance.createVideoStudioUploadUrl()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#createVideoStudioUploadUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#createVideoStudioUploadUrl")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVideoStudioUploadUrlResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteEvent"></a>
# **deleteEvent**
> DeleteEventResponse deleteEvent(id)

Delete a draft, or cancel a published event (its page then says it was called off).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteEventResponse = apiInstance.deleteEvent(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#deleteEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#deleteEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteEventResponse**

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

<a name="deleteListingTag"></a>
# **deleteListingTag**
> UpdatedResponse deleteListingTag(tag)

Remove a tag (any case) from every listing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val tag : kotlin.String = tag_example // kotlin.String | 
try {
    val result : UpdatedResponse = apiInstance.deleteListingTag(tag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#deleteListingTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#deleteListingTag")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **kotlin.String**|  |

### Return type

**UpdatedResponse**

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
> UpdateGroupBuyResponse deleteRentalOffer(platformListingId)

Stop offering a listing for rent (existing bookings stand).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val platformListingId : kotlin.String = platformListingId_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.deleteRentalOffer(platformListingId)
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

**UpdateGroupBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteStory"></a>
# **deleteStory**
> DeleteStoryResponse deleteStory(id)

Take one story slide down before it expires.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteStoryResponse = apiInstance.deleteStory(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#deleteStory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#deleteStory")
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

<a name="deleteVariationGroup"></a>
# **deleteVariationGroup**
> UpdateGroupBuyResponse deleteVariationGroup(id)

Dissolve a group. Its options stay as ordinary listings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.deleteVariationGroup(id)
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

**UpdateGroupBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvent"></a>
# **getEvent**
> EventResponse getEvent(id)

One of your events.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : EventResponse = apiInstance.getEvent(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**EventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventAnalytic"></a>
# **getEventAnalytic**
> GetEventAnalyticResponse getEventAnalytic(id)

Views, RSVPs, and what the linked listings sold on Crossly during the event (orders, units, revenue in cents).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetEventAnalyticResponse = apiInstance.getEventAnalytic(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getEventAnalytic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getEventAnalytic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetEventAnalyticResponse**

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

<a name="getLiveStreamRecap"></a>
# **getLiveStreamRecap**
> GetLiveStreamRecapResponse getLiveStreamRecap(id)

The show’s numbers: duration, peak viewers, items sold and gross, tips, chat messages, auctions run, lineup size and the replay URL.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetLiveStreamRecapResponse = apiInstance.getLiveStreamRecap(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getLiveStreamRecap")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getLiveStreamRecap")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetLiveStreamRecapResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPassport"></a>
# **getPassport**
> GetPassportResponse getPassport(id)

One passport: its item and every listing of it, the event history (created, printed, tag bound, transferred, claimed…), scans per day for 30 days, custody, grading.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetPassportResponse = apiInstance.getPassport(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getPassport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getPassport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetPassportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPassportDraft"></a>
# **getPassportDraft**
> PassportDraftResponse getPassportDraft(id)

A passport draft and its passports (photos, serial, tag and label state of each).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : PassportDraftResponse = apiInstance.getPassportDraft(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getPassportDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getPassportDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**PassportDraftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPassportPrint"></a>
# **getPassportPrint**
> GetPassportPrintResponse getPassportPrint(jobId)

Where a passport print job sent to your agent is: queued, sent, done, failed, expired or duplicate.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val jobId : kotlin.String = jobId_example // kotlin.String | 
try {
    val result : GetPassportPrintResponse = apiInstance.getPassportPrint(jobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getPassportPrint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getPassportPrint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **kotlin.String**|  |

### Return type

**GetPassportPrintResponse**

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

<a name="getRentalSetting"></a>
# **getRentalSetting**
> GetRentalSettingResponse getRentalSetting()

The store’s rental defaults (every item inherits them) and its payout timing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : GetRentalSettingResponse = apiInstance.getRentalSetting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getRentalSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getRentalSetting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetRentalSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShopLimit"></a>
# **getShopLimit**
> GetShopLimitResponse getShopLimit()

Your Crossly Shop selling limit: live listings and listed value, used of limit, per store, and the next step.

Per seller account, shared by all your stores. Counts live + scheduled Crossly Shop listings once each; value is the US-dollar shop price x quantity (an auction at max(start, reserve, buy-now)). Drafts, sold/ended listings and Trade Block posts are not counted, and selling frees space at once. &#x60;unlimited&#x60; is true for sandbox sellers.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : GetShopLimitResponse = apiInstance.getShopLimit()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#getShopLimit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#getShopLimit")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetShopLimitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEventAttendees"></a>
# **listEventAttendees**
> ListEventAttendeesResponse listEventAttendees(id)

Who RSVPd: display name, avatar, going or interested, and when. No contact details.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListEventAttendeesResponse = apiInstance.listEventAttendees(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listEventAttendees")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listEventAttendees")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListEventAttendeesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEvents"></a>
# **listEvents**
> ListEventsResponse listEvents()

Your events (launches, sales, live shows, drops, meetups, pop-ups, workshops, parties): schedule, status, phase, and going/interested counts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : ListEventsResponse = apiInstance.listEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listEvents")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListEventsResponse**

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

<a name="listListingTagSuggest"></a>
# **listListingTagSuggest**
> ListListingTagSuggestResponse listListingTagSuggest(listingId)

Deterministic tag suggestions for one listing (brand, category, size, condition, colors, style tags, era words in the title); &#x60;known&#x60; &#x3D; you already use the tag.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val listingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListListingTagSuggestResponse = apiInstance.listListingTagSuggest(listingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listListingTagSuggest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listListingTagSuggest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listingId** | **java.util.UUID**|  |

### Return type

**ListListingTagSuggestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListingTags"></a>
# **listListingTags**
> ListListingTagsResponse listListingTags(q, limit)

Your listing tags with how many listings carry each, most used first (case-insensitive; &#x60;q&#x60; filters).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val q : kotlin.String = q_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListListingTagsResponse = apiInstance.listListingTags(q, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listListingTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listListingTags")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListListingTagsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listListings"></a>
# **listListings**
> ListListingsResponse listListings(page, limit, platform, status, sku, updatedSince, kind, tag, stillLive)

List active platform listings.

Each row carries &#x60;pricing&#x60;: &#x60;avgAsking&#x60; (average price across its active marketplace rows, per-platform overrides and price rules applied) and &#x60;avgSale&#x60; (average price per unit sold, refunds netted), each &#x60;{ amount, currency, count }&#x60; or null. Never averaged across currencies.

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
val sku : kotlin.String = sku_example // kotlin.String | Exact SKU match: look up the row a supplier product maps to.
val updatedSince : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Only rows created or changed at or after this time (ISO 8601), oldest change first. Poll with the updatedAt of the last row you saw.
val kind : kotlin.String = kind_example // kotlin.String | Physical goods or Web3 assets (NFT listings). Omit for both.
val tag : AnyOfLessThanStringCommaArrayGreaterThan =  // AnyOfLessThanStringCommaArrayGreaterThan | Only listings carrying ANY of these tags (case-insensitive): repeat `tag` or comma-separate.
val stillLive : kotlin.Boolean = true // kotlin.Boolean | Only listings still active on at least one marketplace. With status=sold: sold items still buyable somewhere (a delist failed, is pending or never ran).
try {
    val result : ListListingsResponse = apiInstance.listListings(page, limit, platform, status, sku, updatedSince, kind, tag, stillLive)
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
 **sku** | **kotlin.String**| Exact SKU match: look up the row a supplier product maps to. | [optional]
 **updatedSince** | **java.time.OffsetDateTime**| Only rows created or changed at or after this time (ISO 8601), oldest change first. Poll with the updatedAt of the last row you saw. | [optional]
 **kind** | **kotlin.String**| Physical goods or Web3 assets (NFT listings). Omit for both. | [optional] [enum: physical, web3]
 **tag** | **AnyOfLessThanStringCommaArrayGreaterThan**| Only listings carrying ANY of these tags (case-insensitive): repeat &#x60;tag&#x60; or comma-separate. | [optional]
 **stillLive** | **kotlin.Boolean**| Only listings still active on at least one marketplace. With status&#x3D;sold: sold items still buyable somewhere (a delist failed, is pending or never ran). | [optional]

### Return type

**ListListingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLiveStreams"></a>
# **listLiveStreams**
> ListLiveStreamsResponse listLiveStreams()

Your live shows, newest scheduled first: status, cover, category, connection method and peak viewers.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : ListLiveStreamsResponse = apiInstance.listLiveStreams()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listLiveStreams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listLiveStreams")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListLiveStreamsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPassportEvents"></a>
# **listPassportEvents**
> ListPassportEventsResponse listPassportEvents(id)

A passport’s event history, newest first (never a buyer or a price).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListPassportEventsResponse = apiInstance.listPassportEvents(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listPassportEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listPassportEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListPassportEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPassportPrintTargets"></a>
# **listPassportPrintTargets**
> ListPassportPrintTargetsResponse listPassportPrintTargets()

Your printer agents (online, printers, default) and the passport label templates each can print.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : ListPassportPrintTargetsResponse = apiInstance.listPassportPrintTargets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listPassportPrintTargets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listPassportPrintTargets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListPassportPrintTargetsResponse**

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

<a name="listStories"></a>
# **listStories**
> ListStoriesResponse listStories()

Your active story slides (newest run first, each run in play order), with their overlays: text, listing stickers, @mentions, links, emoji and drawing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : ListStoriesResponse = apiInstance.listStories()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#listStories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#listStories")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStoriesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEvent"></a>
# **updateEvent**
> EventResponse updateEvent(id)

Edit an event. Omitted fields are unchanged; null clears.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : EventResponse = apiInstance.updateEvent(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updateEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updateEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**EventResponse**

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

The fields to change go in &#x60;changes&#x60; (a sparse object, e.g. &#x60;{ \&quot;changes\&quot;: { \&quot;price\&quot;: 24.99 } }&#x60;). &#x60;data&#x60; is accepted as an alias of &#x60;changes&#x60; (the name create and bulk create use); sending both is a 400. Omit &#x60;platforms&#x60; to push the edit everywhere the listing is live.

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

<a name="updateLiveStream"></a>
# **updateLiveStream**
> LiveStreamResponse updateLiveStream(id)

Edit a show that has not ended: title, description, cover, category, start time (not once live) or connection method (browser | phone | encoder).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : LiveStreamResponse = apiInstance.updateLiveStream(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updateLiveStream")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updateLiveStream")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**LiveStreamResponse**

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

<a name="updatePassport"></a>
# **updatePassport**
> UpdatePassportResponse updatePassport(id)

Change what a passport says (title, condition, maker, year, materials, notes) or add photo URLs (photos append: a passport keeps the ones it was registered with).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdatePassportResponse = apiInstance.updatePassport(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updatePassport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updatePassport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdatePassportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePassportDraft"></a>
# **updatePassportDraft**
> PassportDraftResponse updatePassportDraft(id)

Move a draft to a step, pick its label template, add items or remove draft passports.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : PassportDraftResponse = apiInstance.updatePassportDraft(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updatePassportDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updatePassportDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**PassportDraftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePricingSetting"></a>
# **updatePricingSetting**
> GetPricingSettingResponse updatePricingSetting()

Turn own-price match and/or layaway on or off for every one of your stores. One store: PUT /v1/storefronts/{id}/settings.

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

Offer a Crossly listing for rent: day rate, optional week rate, deposit, min/max days, turnaround buffer, rent-only (off sale while offered), seller approval, unavailable date ranges (blackoutRanges, inclusive YYYY-MM-DD) and a return policy. Keeps the listing’s own rental terms in step. Needs a ship-from address.

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

<a name="updateRentalSetting"></a>
# **updateRentalSetting**
> GetRentalSettingResponse updateRentalSetting()

Set the store’s rental defaults and payout timing (on_start needs 3 rentals that came back).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ListingsApi()
try {
    val result : GetRentalSettingResponse = apiInstance.updateRentalSetting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListingsApi#updateRentalSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListingsApi#updateRentalSetting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetRentalSettingResponse**

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

