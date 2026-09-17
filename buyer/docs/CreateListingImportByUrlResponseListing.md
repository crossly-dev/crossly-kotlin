
# CreateListingImportByUrlResponseListing

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platformListingId** | **kotlin.String** |  | 
**title** | **kotlin.String** |  | 
**description** | **kotlin.String** |  |  [optional]
**price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**images** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**brand** | **kotlin.String** |  |  [optional]
**condition** | **kotlin.String** |  |  [optional]
**propertySize** | **kotlin.String** |  |  [optional]
**color** | **kotlin.collections.List&lt;kotlin.String&gt;** | Color(s) the platform&#39;s own response exposes (e.g. Poshmark&#39;s  &#x60;colors&#x60; array). Only set when actually present in the scrape. |  [optional]
**sku** | **kotlin.String** |  |  [optional]
**url** | **kotlin.String** |  |  [optional]
**category** | **kotlin.collections.List&lt;kotlin.String&gt;** | The platform&#39;s OWN category, as a top-down path (e.g. Poshmark&#39;s  [\&quot;Kids\&quot;, \&quot;Toys\&quot;, \&quot;Dolls &amp; Accessories\&quot;] from department → category →  feature). Only set when the platform&#39;s list/scrape response actually  carries this — never guessed. Mapped onto Crossly&#39;s category.main/  sub/sub2 (listings) or categoryMain/categorySub (inventory_items) at  create/enrich time. |  [optional]
**categoryId** | **kotlin.String** | The platform&#39;s raw numeric category id, same space as  overrides.&lt;platform&gt;.categoryId — distinct from &#x60;category&#x60;&#39;s  human-readable path. Only set by platforms whose id space is directly  comparable to what we publish (currently eBay&#39;s drift-check second  call — see diff-fields/second-call.ts&#39;s ebayRemoteFields). eBay&#39;s own  CategoryName wording/depth is a different vocabulary from Crossly&#39;s  master taxonomy breadcrumb and will essentially never string-match  it, so drift-detection compares ids instead of names. |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Tag-like strings the platform&#39;s own response exposes (e.g. Poshmark&#39;s  marketing \&quot;experience\&quot; tags). Distinct from a full search-tag  generator — just whatever real tag data the scrape already carries. |  [optional]
**material** | **kotlin.String** | Structured item aspects — the same shape the listing form&#39;s Item  Details section captures (and templates already persist), now sourced  from the platform&#39;s own data instead of only manual entry. Only set  when the platform&#39;s response genuinely carries a semantically-matching  field (eBay item specifics, Facebook attributes, Poshmark catalog,  Depop&#39;s detail-call ride-along) — never derived or guessed. |  [optional]
**style** | **kotlin.String** |  |  [optional]
**pattern** | **kotlin.String** |  |  [optional]
**department** | **kotlin.String** |  |  [optional]
**gender** | **kotlin.String** |  |  [optional]
**itemType** | **kotlin.String** |  |  [optional]
**sizeSystem** | **kotlin.String** |  |  [optional]
**itemSpecifics** | [**kotlin.Any**](.md) | Category-specific facets from a per-item DETAIL call (e.g. Facebook&#39;s  Age Range/Character/Age Group), keyed the same way eBay item-specifics  are: aspect name -&gt; value array. Only set by platforms with a genuine  per-item attribute source — costs one extra call per listing, so  populated by a dedicated enrichment pass, not the main list mapper.  Maps onto listings.itemSpecifics; inventory_items has no equivalent  column. |  [optional]
**listedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the listing was first published on the platform. Used by  the Advanced filter&#39;s listedAfter / listedBefore knobs. Optional  because not every platform returns it on the listing endpoint. |  [optional]
**quantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Units this platform reports. Only meaningful for platforms  &#x60;PLATFORM_QUANTITY_SYNC&#x60; marks &#39;native&#39; — relist platforms show one item  and say 1 forever, so they leave this undefined rather than voting with  a number they cannot actually express. See &#x60;_quantity.ts&#x60;. |  [optional]
**accountSlot** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Which of the user&#39;s connected accounts on this platform this listing  was scraped from — stamped by fetchCookieListings as it loops each  connected account (see listActiveForPlatform in  user-platform-accounts/read.ts). Undefined for API-track platforms  (single connection, no multi-account concept) and for any cookie path  that hasn&#39;t been threaded yet; importOne treats undefined as slot 1,  matching the historical single-account default. |  [optional]
**weightOz** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Total item weight in ounces (already summed, not split lb+oz —  the write path converts to the DB&#39;s weightLb+weightOz split). |  [optional]
**dimensionLIn** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**dimensionWIn** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**dimensionHIn** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**handlingTimeDays** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Max days the platform&#39;s own listing commits to ship within (eBay&#39;s  DispatchTimeMax, Etsy&#39;s processing_max). |  [optional]
**bestOfferAutoAcceptCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**bestOfferAutoDeclineCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**itemLocation** | **kotlin.String** | Free text as the platform itself expresses it (e.g. eBay&#39;s &#x60;Location&#x60;  is a single seller-typed string like \&quot;Austin, TX\&quot;, not a structured  address) — never parsed into city/state. |  [optional]
**itemLocationZip** | **kotlin.String** |  |  [optional]
**itemLocationCountry** | **kotlin.String** |  |  [optional]
**declaredShippingCost** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What the platform&#39;s OWN listing declares shipping costs — reference  only, distinct from a realized post-sale shipping cost. |  [optional]
**returnPolicyText** | **kotlin.String** |  |  [optional]



