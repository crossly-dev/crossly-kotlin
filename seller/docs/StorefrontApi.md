# StorefrontApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStorefrontHighlight**](StorefrontApi.md#createStorefrontHighlight) | **POST** /v1/storefront/highlights | Create a highlight: title (up to 24 characters), optional coverUrl, and optional storyIds (your live or archived stories) to save into it. Up to 50 per store.
[**createStorefrontHighlightItem**](StorefrontApi.md#createStorefrontHighlightItem) | **POST** /v1/storefront/highlights/{id}/items | Save stories into a highlight (appended in the order given). Each is copied, so it stays after the story expires. A story already in the highlight is skipped.
[**createStorefrontProfileSuggestShelve**](StorefrontApi.md#createStorefrontProfileSuggestShelve) | **POST** /v1/storefront/profile/suggest-shelves | Profile shelves proposed from your top tags and categories (not saved).
[**createStorefrontSection**](StorefrontApi.md#createStorefrontSection) | **POST** /v1/storefront/sections | Add a section at the bottom: kind hero | listings | collections | about | policies | social | announcement | faq (default listings), with its config.
[**createStorefrontSitePreview**](StorefrontApi.md#createStorefrontSitePreview) | **POST** /v1/storefront/site/preview | Resolve an unsaved design page like the live site would: every section with its listings and extras (preview: true).
[**createStorefrontSitePublish**](StorefrontApi.md#createStorefrontSitePublish) | **POST** /v1/storefront/site/publish | Publish the draft: it becomes the live site and a publish version is kept (the last 30 versions are kept).
[**createStorefrontSiteResolve**](StorefrontApi.md#createStorefrontSiteResolve) | **POST** /v1/storefront/site/resolve | The live listings a ListingSource (manual, tags, category, smart rule or all) selects from your store, and how many match.
[**createStorefrontSiteStarter**](StorefrontApi.md#createStorefrontSiteStarter) | **POST** /v1/storefront/site/starter | Replace the draft with a starter site (vintage, sneakers, streetwear, collectibles, boutique, home, minimal, drop, general). The current draft is kept as a version first.
[**createStorefrontSiteSuggest**](StorefrontApi.md#createStorefrontSiteSuggest) | **POST** /v1/storefront/site/suggest | Auto-build: website sections proposed from your top tags and categories (not saved).
[**createStorefrontSiteVersionRestore**](StorefrontApi.md#createStorefrontSiteVersionRestore) | **POST** /v1/storefront/site/versions/{id}/restore | Copy a saved version into the draft (the current draft is kept as a version first). Publish to make it live.
[**createStorefrontTradeSitePublish**](StorefrontApi.md#createStorefrontTradeSitePublish) | **POST** /v1/storefront/trade-site/publish | Publish the trade site draft (a version is kept).
[**createStorefrontTradeSiteResolve**](StorefrontApi.md#createStorefrontTradeSiteResolve) | **POST** /v1/storefront/trade-site/resolve | The listings a ListingSource selects on your trade site: only items in your active wholesale catalogs (narrowed further by source.catalogIds), and how many match.
[**createStorefrontTradeSiteStarter**](StorefrontApi.md#createStorefrontTradeSiteStarter) | **POST** /v1/storefront/trade-site/starter | Replace the trade site draft with a trade starter (trade_classic, trade_line_sheet, trade_brand_house, trade_apply_first). The current draft is kept as a version first.
[**createStorefrontTradeSiteSuggest**](StorefrontApi.md#createStorefrontTradeSiteSuggest) | **POST** /v1/storefront/trade-site/suggest | Trade Auto-build: trade site sections proposed from your wholesale catalogs (a spotlight, a rail per catalog, terms, apply banner). Not saved.
[**deleteStorefrontHighlight**](StorefrontApi.md#deleteStorefrontHighlight) | **DELETE** /v1/storefront/highlights/{id} | Delete a highlight and its saved stories. The original stories are unaffected.
[**deleteStorefrontHighlightItem**](StorefrontApi.md#deleteStorefrontHighlightItem) | **DELETE** /v1/storefront/highlights/{id}/items/{itemId} | Remove one saved story from a highlight.
[**deleteStorefrontSection**](StorefrontApi.md#deleteStorefrontSection) | **DELETE** /v1/storefront/sections/{id} | Remove a section. Listings on a removed shelf stay live.
[**getStorefront**](StorefrontApi.md#getStorefront) | **GET** /v1/storefront | Your storefront design: banner, logo, tagline, bio, theme, SEO title and description, social links, and whether it is published.
[**getStorefrontMerch**](StorefrontApi.md#getStorefrontMerch) | **GET** /v1/storefront/merch | Your store&#39;s live listings by tag, category, condition and brand, with the price range: what product sources can select.
[**getStorefrontProfile**](StorefrontApi.md#getStorefrontProfile) | **GET** /v1/storefront/profile | Your shop profile (the Crossly Shop page): banner, logo, tagline, bio, accent, announcement, shelves, blocks and All items options.
[**getStorefrontShipping**](StorefrontApi.md#getStorefrontShipping) | **GET** /v1/storefront/shipping | Your Crossly shipping policy (domestic and international services, which countries you ship to) and your default ship-from address.
[**getStorefrontSite**](StorefrontApi.md#getStorefrontSite) | **GET** /v1/storefront/site | Your store website: the draft design, what is live, when each changed, whether the site is switched on, and its custom domain.
[**getStorefrontTradeSite**](StorefrontApi.md#getStorefrontTradeSite) | **GET** /v1/storefront/trade-site | Your store&#39;s trade (wholesale) site at /site/:slug/trade: the draft, what is live, whether it is on and its gating (public | prices_private | approved_only).
[**listStorefrontHighlights**](StorefrontApi.md#listStorefrontHighlights) | **GET** /v1/storefront/highlights | Your store’s story highlights in display order, each with its saved stories (media, overlays, product tie-in, when posted). Empty highlights included.
[**listStorefrontSections**](StorefrontApi.md#listStorefrontSections) | **GET** /v1/storefront/sections | Your storefront sections in display order: kind, title, visible, config, and listing ids for listings shelves.
[**listStorefrontSiteVersions**](StorefrontApi.md#listStorefrontSiteVersions) | **GET** /v1/storefront/site/versions | Saved versions of the website, newest first (publish, restore and template points; up to 30).
[**listStorefrontStoryArchive**](StorefrontApi.md#listStorefrontStoryArchive) | **GET** /v1/storefront/stories/archive | Your stories, live and expired, newest first: what can be saved to a highlight. Paginated: pass before &#x3D; meta.nextCursor of the previous page.
[**updateStorefront**](StorefrontApi.md#updateStorefront) | **PUT** /v1/storefront | Update your storefront design. Omitted fields are unchanged, null clears. published&#x3D;false keeps the design as a draft and buyers see the standard storefront.
[**updateStorefrontHighlight**](StorefrontApi.md#updateStorefrontHighlight) | **PATCH** /v1/storefront/highlights/{id} | Rename a highlight or change its cover (coverUrl null &#x3D; use the first story).
[**updateStorefrontHighlightItemOrder**](StorefrontApi.md#updateStorefrontHighlightItemOrder) | **PUT** /v1/storefront/highlights/{id}/items/order | Set the order of a highlight’s saved stories: every item id, first to last.
[**updateStorefrontHighlightOrder**](StorefrontApi.md#updateStorefrontHighlightOrder) | **PUT** /v1/storefront/highlights/order | Set the highlight order in one call: every highlight id, first to last.
[**updateStorefrontProfile**](StorefrontApi.md#updateStorefrontProfile) | **PUT** /v1/storefront/profile | Replace your shop profile (a complete ShopProfile). Saved straight away.
[**updateStorefrontSection**](StorefrontApi.md#updateStorefrontSection) | **PATCH** /v1/storefront/sections/{id} | Rename, show/hide, refill (listings shelves) or reconfigure a section.
[**updateStorefrontSectionReorder**](StorefrontApi.md#updateStorefrontSectionReorder) | **PUT** /v1/storefront/sections/reorder | Set the section order in one atomic call: every section id, top to bottom.
[**updateStorefrontShipping**](StorefrontApi.md#updateStorefrontShipping) | **PUT** /v1/storefront/shipping | Set your shipping policy (international.enabled, shipsTo worldwide or ISO codes, excludes) and/or your default ship-from address (any country; 422 for a sanctioned origin).
[**updateStorefrontSiteDraft**](StorefrontApi.md#updateStorefrontSiteDraft) | **PUT** /v1/storefront/site/draft | Save the website draft (a complete SiteDesign). Validated strictly (a bad field is a 400 naming its path) and sanitized; buyers see nothing until you publish.
[**updateStorefrontSiteEnabled**](StorefrontApi.md#updateStorefrontSiteEnabled) | **PUT** /v1/storefront/site/enabled | Switch the website on or off. On requires a publish first; off makes /site/:slug 404 and the custom domain show the shop profile.
[**updateStorefrontTradeSiteDraft**](StorefrontApi.md#updateStorefrontTradeSiteDraft) | **PUT** /v1/storefront/trade-site/draft | Save the trade site draft (a complete SiteDesign; trade sections included). Validated strictly and sanitized.
[**updateStorefrontTradeSiteEnabled**](StorefrontApi.md#updateStorefrontTradeSiteEnabled) | **PUT** /v1/storefront/trade-site/enabled | Switch the trade site on (needs a publish first) or off.
[**updateStorefrontTradeSiteGating**](StorefrontApi.md#updateStorefrontTradeSiteGating) | **PUT** /v1/storefront/trade-site/gating | Who sees the trade site: public (everyone, with prices), prices_private (everyone, prices for approved buyers) or approved_only (approved buyers; others get the apply page).


<a name="createStorefrontHighlight"></a>
# **createStorefrontHighlight**
> CreateStorefrontHighlightResponse createStorefrontHighlight()

Create a highlight: title (up to 24 characters), optional coverUrl, and optional storyIds (your live or archived stories) to save into it. Up to 50 per store.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : CreateStorefrontHighlightResponse = apiInstance.createStorefrontHighlight()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontHighlight")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontHighlight")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontHighlightResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontHighlightItem"></a>
# **createStorefrontHighlightItem**
> StorefrontHighlightResponse createStorefrontHighlightItem(id)

Save stories into a highlight (appended in the order given). Each is copied, so it stays after the story expires. A story already in the highlight is skipped.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontHighlightResponse = apiInstance.createStorefrontHighlightItem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontHighlightItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontHighlightItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontHighlightResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontProfileSuggestShelve"></a>
# **createStorefrontProfileSuggestShelve**
> CreateStorefrontProfileSuggestShelveResponse createStorefrontProfileSuggestShelve()

Profile shelves proposed from your top tags and categories (not saved).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : CreateStorefrontProfileSuggestShelveResponse = apiInstance.createStorefrontProfileSuggestShelve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontProfileSuggestShelve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontProfileSuggestShelve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontProfileSuggestShelveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontSection"></a>
# **createStorefrontSection**
> StorefrontSectionResponse createStorefrontSection()

Add a section at the bottom: kind hero | listings | collections | about | policies | social | announcement | faq (default listings), with its config.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontSectionResponse = apiInstance.createStorefrontSection()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontSection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontSection")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontSectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontSitePreview"></a>
# **createStorefrontSitePreview**
> CreateStorefrontSitePreviewResponse createStorefrontSitePreview()

Resolve an unsaved design page like the live site would: every section with its listings and extras (preview: true).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : CreateStorefrontSitePreviewResponse = apiInstance.createStorefrontSitePreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontSitePreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontSitePreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontSitePreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontSitePublish"></a>
# **createStorefrontSitePublish**
> StorefrontResponse2 createStorefrontSitePublish()

Publish the draft: it becomes the live site and a publish version is kept (the last 30 versions are kept).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse2 = apiInstance.createStorefrontSitePublish()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontSitePublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontSitePublish")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontSiteResolve"></a>
# **createStorefrontSiteResolve**
> CreateStorefrontSiteResolveResponse createStorefrontSiteResolve()

The live listings a ListingSource (manual, tags, category, smart rule or all) selects from your store, and how many match.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : CreateStorefrontSiteResolveResponse = apiInstance.createStorefrontSiteResolve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontSiteResolve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontSiteResolve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontSiteResolveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontSiteStarter"></a>
# **createStorefrontSiteStarter**
> StorefrontResponse2 createStorefrontSiteStarter()

Replace the draft with a starter site (vintage, sneakers, streetwear, collectibles, boutique, home, minimal, drop, general). The current draft is kept as a version first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse2 = apiInstance.createStorefrontSiteStarter()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontSiteStarter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontSiteStarter")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontSiteSuggest"></a>
# **createStorefrontSiteSuggest**
> CreateStorefrontSiteSuggestResponse createStorefrontSiteSuggest()

Auto-build: website sections proposed from your top tags and categories (not saved).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : CreateStorefrontSiteSuggestResponse = apiInstance.createStorefrontSiteSuggest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontSiteSuggest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontSiteSuggest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontSiteSuggestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontSiteVersionRestore"></a>
# **createStorefrontSiteVersionRestore**
> StorefrontResponse3 createStorefrontSiteVersionRestore(id)

Copy a saved version into the draft (the current draft is kept as a version first). Publish to make it live.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontResponse3 = apiInstance.createStorefrontSiteVersionRestore(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontSiteVersionRestore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontSiteVersionRestore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontResponse3**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontTradeSitePublish"></a>
# **createStorefrontTradeSitePublish**
> StorefrontResponse2 createStorefrontTradeSitePublish()

Publish the trade site draft (a version is kept).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse2 = apiInstance.createStorefrontTradeSitePublish()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontTradeSitePublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontTradeSitePublish")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontTradeSiteResolve"></a>
# **createStorefrontTradeSiteResolve**
> CreateStorefrontSiteResolveResponse createStorefrontTradeSiteResolve()

The listings a ListingSource selects on your trade site: only items in your active wholesale catalogs (narrowed further by source.catalogIds), and how many match.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : CreateStorefrontSiteResolveResponse = apiInstance.createStorefrontTradeSiteResolve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontTradeSiteResolve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontTradeSiteResolve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontSiteResolveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontTradeSiteStarter"></a>
# **createStorefrontTradeSiteStarter**
> StorefrontResponse2 createStorefrontTradeSiteStarter()

Replace the trade site draft with a trade starter (trade_classic, trade_line_sheet, trade_brand_house, trade_apply_first). The current draft is kept as a version first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse2 = apiInstance.createStorefrontTradeSiteStarter()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontTradeSiteStarter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontTradeSiteStarter")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontTradeSiteSuggest"></a>
# **createStorefrontTradeSiteSuggest**
> CreateStorefrontSiteSuggestResponse createStorefrontTradeSiteSuggest()

Trade Auto-build: trade site sections proposed from your wholesale catalogs (a spotlight, a rail per catalog, terms, apply banner). Not saved.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : CreateStorefrontSiteSuggestResponse = apiInstance.createStorefrontTradeSiteSuggest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#createStorefrontTradeSiteSuggest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#createStorefrontTradeSiteSuggest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontSiteSuggestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteStorefrontHighlight"></a>
# **deleteStorefrontHighlight**
> DeleteStoryResponse deleteStorefrontHighlight(id)

Delete a highlight and its saved stories. The original stories are unaffected.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteStoryResponse = apiInstance.deleteStorefrontHighlight(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#deleteStorefrontHighlight")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#deleteStorefrontHighlight")
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

<a name="deleteStorefrontHighlightItem"></a>
# **deleteStorefrontHighlightItem**
> StorefrontHighlightResponse deleteStorefrontHighlightItem(id, itemId)

Remove one saved story from a highlight.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
val id : kotlin.String = id_example // kotlin.String | 
val itemId : kotlin.String = itemId_example // kotlin.String | 
try {
    val result : StorefrontHighlightResponse = apiInstance.deleteStorefrontHighlightItem(id, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#deleteStorefrontHighlightItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#deleteStorefrontHighlightItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **itemId** | **kotlin.String**|  |

### Return type

**StorefrontHighlightResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteStorefrontSection"></a>
# **deleteStorefrontSection**
> UpdateGroupBuyResponse deleteStorefrontSection(id)

Remove a section. Listings on a removed shelf stay live.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.deleteStorefrontSection(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#deleteStorefrontSection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#deleteStorefrontSection")
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

<a name="getStorefront"></a>
# **getStorefront**
> GetStorefrontResponse getStorefront()

Your storefront design: banner, logo, tagline, bio, theme, SEO title and description, social links, and whether it is published.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : GetStorefrontResponse = apiInstance.getStorefront()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#getStorefront")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#getStorefront")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontMerch"></a>
# **getStorefrontMerch**
> GetStorefrontMerchResponse getStorefrontMerch()

Your store&#39;s live listings by tag, category, condition and brand, with the price range: what product sources can select.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : GetStorefrontMerchResponse = apiInstance.getStorefrontMerch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#getStorefrontMerch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#getStorefrontMerch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontMerchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontProfile"></a>
# **getStorefrontProfile**
> GetStorefrontProfileResponse getStorefrontProfile()

Your shop profile (the Crossly Shop page): banner, logo, tagline, bio, accent, announcement, shelves, blocks and All items options.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : GetStorefrontProfileResponse = apiInstance.getStorefrontProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#getStorefrontProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#getStorefrontProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontShipping"></a>
# **getStorefrontShipping**
> GetStorefrontShippingResponse getStorefrontShipping()

Your Crossly shipping policy (domestic and international services, which countries you ship to) and your default ship-from address.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : GetStorefrontShippingResponse = apiInstance.getStorefrontShipping()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#getStorefrontShipping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#getStorefrontShipping")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontShippingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontSite"></a>
# **getStorefrontSite**
> StorefrontResponse3 getStorefrontSite()

Your store website: the draft design, what is live, when each changed, whether the site is switched on, and its custom domain.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse3 = apiInstance.getStorefrontSite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#getStorefrontSite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#getStorefrontSite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse3**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontTradeSite"></a>
# **getStorefrontTradeSite**
> StorefrontResponse3 getStorefrontTradeSite()

Your store&#39;s trade (wholesale) site at /site/:slug/trade: the draft, what is live, whether it is on and its gating (public | prices_private | approved_only).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse3 = apiInstance.getStorefrontTradeSite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#getStorefrontTradeSite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#getStorefrontTradeSite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse3**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStorefrontHighlights"></a>
# **listStorefrontHighlights**
> ListStorefrontHighlightsResponse listStorefrontHighlights()

Your store’s story highlights in display order, each with its saved stories (media, overlays, product tie-in, when posted). Empty highlights included.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : ListStorefrontHighlightsResponse = apiInstance.listStorefrontHighlights()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#listStorefrontHighlights")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#listStorefrontHighlights")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStorefrontHighlightsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStorefrontSections"></a>
# **listStorefrontSections**
> StorefrontResponse4 listStorefrontSections()

Your storefront sections in display order: kind, title, visible, config, and listing ids for listings shelves.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse4 = apiInstance.listStorefrontSections()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#listStorefrontSections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#listStorefrontSections")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse4**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStorefrontSiteVersions"></a>
# **listStorefrontSiteVersions**
> ListStorefrontSiteVersionsResponse listStorefrontSiteVersions()

Saved versions of the website, newest first (publish, restore and template points; up to 30).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : ListStorefrontSiteVersionsResponse = apiInstance.listStorefrontSiteVersions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#listStorefrontSiteVersions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#listStorefrontSiteVersions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStorefrontSiteVersionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStorefrontStoryArchive"></a>
# **listStorefrontStoryArchive**
> ListStorefrontStoryArchiveResponse listStorefrontStoryArchive()

Your stories, live and expired, newest first: what can be saved to a highlight. Paginated: pass before &#x3D; meta.nextCursor of the previous page.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : ListStorefrontStoryArchiveResponse = apiInstance.listStorefrontStoryArchive()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#listStorefrontStoryArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#listStorefrontStoryArchive")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStorefrontStoryArchiveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefront"></a>
# **updateStorefront**
> GetStorefrontResponse updateStorefront()

Update your storefront design. Omitted fields are unchanged, null clears. published&#x3D;false keeps the design as a draft and buyers see the standard storefront.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : GetStorefrontResponse = apiInstance.updateStorefront()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefront")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefront")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontHighlight"></a>
# **updateStorefrontHighlight**
> StorefrontHighlightResponse updateStorefrontHighlight(id)

Rename a highlight or change its cover (coverUrl null &#x3D; use the first story).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontHighlightResponse = apiInstance.updateStorefrontHighlight(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontHighlight")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontHighlight")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontHighlightResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontHighlightItemOrder"></a>
# **updateStorefrontHighlightItemOrder**
> StorefrontHighlightResponse updateStorefrontHighlightItemOrder(id)

Set the order of a highlight’s saved stories: every item id, first to last.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontHighlightResponse = apiInstance.updateStorefrontHighlightItemOrder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontHighlightItemOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontHighlightItemOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontHighlightResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontHighlightOrder"></a>
# **updateStorefrontHighlightOrder**
> ListStorefrontHighlightsResponse updateStorefrontHighlightOrder()

Set the highlight order in one call: every highlight id, first to last.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : ListStorefrontHighlightsResponse = apiInstance.updateStorefrontHighlightOrder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontHighlightOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontHighlightOrder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStorefrontHighlightsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontProfile"></a>
# **updateStorefrontProfile**
> UpdateStorefrontProfileResponse updateStorefrontProfile()

Replace your shop profile (a complete ShopProfile). Saved straight away.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : UpdateStorefrontProfileResponse = apiInstance.updateStorefrontProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateStorefrontProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontSection"></a>
# **updateStorefrontSection**
> StorefrontSectionResponse updateStorefrontSection(id)

Rename, show/hide, refill (listings shelves) or reconfigure a section.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontSectionResponse = apiInstance.updateStorefrontSection(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontSection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontSection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontSectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontSectionReorder"></a>
# **updateStorefrontSectionReorder**
> StorefrontResponse4 updateStorefrontSectionReorder()

Set the section order in one atomic call: every section id, top to bottom.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse4 = apiInstance.updateStorefrontSectionReorder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontSectionReorder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontSectionReorder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse4**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontShipping"></a>
# **updateStorefrontShipping**
> GetStorefrontShippingResponse updateStorefrontShipping()

Set your shipping policy (international.enabled, shipsTo worldwide or ISO codes, excludes) and/or your default ship-from address (any country; 422 for a sanctioned origin).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : GetStorefrontShippingResponse = apiInstance.updateStorefrontShipping()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontShipping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontShipping")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontShippingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontSiteDraft"></a>
# **updateStorefrontSiteDraft**
> StorefrontResponse2 updateStorefrontSiteDraft()

Save the website draft (a complete SiteDesign). Validated strictly (a bad field is a 400 naming its path) and sanitized; buyers see nothing until you publish.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse2 = apiInstance.updateStorefrontSiteDraft()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontSiteDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontSiteDraft")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontSiteEnabled"></a>
# **updateStorefrontSiteEnabled**
> StorefrontResponse3 updateStorefrontSiteEnabled()

Switch the website on or off. On requires a publish first; off makes /site/:slug 404 and the custom domain show the shop profile.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse3 = apiInstance.updateStorefrontSiteEnabled()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontSiteEnabled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontSiteEnabled")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse3**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontTradeSiteDraft"></a>
# **updateStorefrontTradeSiteDraft**
> StorefrontResponse2 updateStorefrontTradeSiteDraft()

Save the trade site draft (a complete SiteDesign; trade sections included). Validated strictly and sanitized.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse2 = apiInstance.updateStorefrontTradeSiteDraft()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontTradeSiteDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontTradeSiteDraft")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontTradeSiteEnabled"></a>
# **updateStorefrontTradeSiteEnabled**
> StorefrontResponse3 updateStorefrontTradeSiteEnabled()

Switch the trade site on (needs a publish first) or off.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse3 = apiInstance.updateStorefrontTradeSiteEnabled()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontTradeSiteEnabled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontTradeSiteEnabled")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse3**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontTradeSiteGating"></a>
# **updateStorefrontTradeSiteGating**
> StorefrontResponse3 updateStorefrontTradeSiteGating()

Who sees the trade site: public (everyone, with prices), prices_private (everyone, prices for approved buyers) or approved_only (approved buyers; others get the apply page).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : StorefrontResponse3 = apiInstance.updateStorefrontTradeSiteGating()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontTradeSiteGating")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontTradeSiteGating")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse3**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

