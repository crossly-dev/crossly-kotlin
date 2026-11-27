# WholesaleApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWholesaleBuyerInvite**](WholesaleApi.md#createWholesaleBuyerInvite) | **POST** /v1/wholesale/buyers/invite | Invite a buyer by email to one or more of your catalogs. Binds to their account now if they have one, or when they sign up.
[**createWholesaleBuyerRemove**](WholesaleApi.md#createWholesaleBuyerRemove) | **POST** /v1/wholesale/buyers/remove | Revoke every catalog grant a buyer (or invited email) has with you. Their terms and invoices are kept.
[**createWholesaleCatalog**](WholesaleApi.md#createWholesaleCatalog) | **POST** /v1/wholesale/catalogs | Create a catalog. visibility public | public_prices_private (prices for approved buyers) | private_discoverable (listed, opened on approval) | link (anyone with the URL) | invite (named buyers only; \&quot;private\&quot; is accepted as invite); autoApprove never | verified | all; the cascade terms (minOrderQuantity, casePack, leadTimeDays, verifiedOnly, priceVisibility, maxPerOrder, backorder, restockEta, preset ids) default every item; listed advertises a public catalog in the wholesale directory (never its prices).
[**createWholesaleCatalogItem**](WholesaleApi.md#createWholesaleCatalogItem) | **POST** /v1/wholesale/catalogs/{id}/items | Add your Crossly listings to a catalog (up to 500), each with an optional wholesalePriceCents, minOrderQuantity and casePack. Items already in the catalog have their terms updated.
[**createWholesaleDrop**](WholesaleApi.md#createWholesaleDrop) | **POST** /v1/wholesale/drops | Create a draft trade drop: name, dropAt (ISO; when it opens), audience trade|catalog (+ audienceCatalogId), kind release|prebook. A pre-book needs depositBps (100-9900) and shipBy (YYYY-MM-DD), and takes balanceNetDays (0-90) for the balance invoice. listingIds are your listing ids, each on Crossly. A pre-book makes its listings pre-orders, so buyers pay the deposit at checkout. Schedule it with PATCH status \&quot;scheduled\&quot;.
[**createWholesaleDropRelease**](WholesaleApi.md#createWholesaleDropRelease) | **POST** /v1/wholesale/drops/{id}/release | Release a live pre-book: every reserved balance becomes an invoice on account to its buyer (due in the drop balanceNetDays), emailed, and the drop ends. Safe to retry: only balances not yet invoiced are invoiced. Returns { invoiced, balanceCents, invoiceIds }.
[**createWholesaleFreightRequestAnswer**](WholesaleApi.md#createWholesaleFreightRequestAnswer) | **POST** /v1/wholesale/freight-requests/{id}/answer | Answer an open freight request with a figure in CENTS (and an optional note).
[**createWholesaleGroup**](WholesaleApi.md#createWholesaleGroup) | **POST** /v1/wholesale/groups | Create a customer group with a discount in basis points (up to 9000). A buyer in several groups gets the best rate, never a stacked one.
[**createWholesaleGroupMember**](WholesaleApi.md#createWholesaleGroupMember) | **POST** /v1/wholesale/groups/{id}/members | Add a buyer to a group by account id or by the email of an existing Crossly account.
[**createWholesaleInvoiceCreditNote**](WholesaleApi.md#createWholesaleInvoiceCreditNote) | **POST** /v1/wholesale/invoices/{id}/credit-notes | Issue a credit note on an on-account invoice (short shipment, damaged, pricing error, returned, goodwill, other): at most the balance due. Numbered &lt;invoice&gt;-CN&lt;n&gt;; settling the rest closes the invoice paid. Not a refund.
[**createWholesaleInvoiceLateFee**](WholesaleApi.md#createWholesaleInvoiceLateFee) | **POST** /v1/wholesale/invoices/{id}/late-fee | Add your late fee (invoice settings lateFeeBps) to an invoice by hand, once. The hourly sweep adds it automatically when an invoice goes overdue.
[**createWholesaleInvoiceMarkPaid**](WholesaleApi.md#createWholesaleInvoiceMarkPaid) | **POST** /v1/wholesale/invoices/{id}/mark-paid | Record a payment the buyer made to you directly: method ach | check | wire | card | other, a reference, and amountCents (omit for the whole balance). When the invoice is settled, Crossly&#39;s fee and the tax it remits are charged to your billing card.
[**createWholesaleInvoiceSend**](WholesaleApi.md#createWholesaleInvoiceSend) | **POST** /v1/wholesale/invoices/{id}/send | Email the invoice to the buyer again (an overdue one goes as an overdue notice), with the link to pay it.
[**createWholesaleInvoiceVoid**](WholesaleApi.md#createWholesaleInvoiceVoid) | **POST** /v1/wholesale/invoices/{id}/void | Void an invoice nobody has paid anything on (e.g. the order was cancelled). It stops counting against the buyer&#39;s credit limit.
[**createWholesaleInvoiceWriteOff**](WholesaleApi.md#createWholesaleInvoiceWriteOff) | **POST** /v1/wholesale/invoices/{id}/write-off | Write off what is left on an invoice (bad debt): it closes as written_off and stops counting against the buyer&#39;s credit.
[**createWholesaleProfileShipsFromValidate**](WholesaleApi.md#createWholesaleProfileShipsFromValidate) | **POST** /v1/wholesale/profile/ships-from/validate | Check a ships-from origin ({ postalCode, country, city?, region? }) with the shipping validator without saving it. 400 invalid_ships_from with the issues; 422 for an embargoed origin.
[**createWholesaleQuoteAnswer**](WholesaleApi.md#createWholesaleQuoteAnswer) | **POST** /v1/wholesale/quotes/{id}/answer | Answer (or revise) a quote: a unit price in CENTS per item you quote, an expiresAt (ISO, at most 90 days out) and an optional note. Items left out are not quoted. The buyer is notified and can accept until expiry.
[**createWholesaleQuoteDecline**](WholesaleApi.md#createWholesaleQuoteDecline) | **POST** /v1/wholesale/quotes/{id}/decline | Decline a quote request, with an optional reason the buyer sees.
[**createWholesaleRequestDecide**](WholesaleApi.md#createWholesaleRequestDecide) | **POST** /v1/wholesale/requests/{id}/decide | Approve (grants access to that catalog; optional groupId adds the buyer to a customer group) or decline (optional reason) an access request.
[**createWholesaleTierBulk**](WholesaleApi.md#createWholesaleTierBulk) | **POST** /v1/wholesale/tiers/bulk | One ladder for many listings: breaks as [{ minQuantity, discountBps }] off each listing&#39;s own price. Returns how many were updated and which were skipped and why.
[**deleteWholesaleBuyerTerm**](WholesaleApi.md#deleteWholesaleBuyerTerm) | **DELETE** /v1/wholesale/buyers/{buyerUserId}/terms | Switch a buyer&#39;s account terms off. Invoices already issued are unaffected.
[**deleteWholesaleCatalog**](WholesaleApi.md#deleteWholesaleCatalog) | **DELETE** /v1/wholesale/catalogs/{id} | Delete a catalog with its items, grants and access requests. Orders and invoices are untouched.
[**deleteWholesaleCatalogItem**](WholesaleApi.md#deleteWholesaleCatalogItem) | **DELETE** /v1/wholesale/catalogs/{id}/items/{platformListingId} | Take an item out of a catalog. The listing itself is untouched.
[**deleteWholesaleGroup**](WholesaleApi.md#deleteWholesaleGroup) | **DELETE** /v1/wholesale/groups/{id} | Delete a customer group. Its members keep any other group or account rate.
[**deleteWholesaleGroupMember**](WholesaleApi.md#deleteWholesaleGroupMember) | **DELETE** /v1/wholesale/groups/{id}/members/{buyerUserId} | Take a buyer out of a group.
[**getWholesaleCatalogLineSheet**](WholesaleApi.md#getWholesaleCatalogLineSheet) | **GET** /v1/wholesale/catalogs/{id}/line-sheet | The catalog&#39;s line sheet: your company details and terms, then every item with retail and trade price, minimum, case pack and quantity breaks.
[**getWholesaleCatalogShare**](WholesaleApi.md#getWholesaleCatalogShare) | **GET** /v1/wholesale/catalogs/{id}/share | The catalog&#39;s buyer link (null until you have a shop username), to share or print as a QR code.
[**getWholesaleCategory**](WholesaleApi.md#getWholesaleCategory) | **GET** /v1/wholesale/categories | The wholesale category taxonomy (id, label, group). A catalog or trade profile takes up to 12 ids, or \&quot;other:&lt;words&gt;\&quot;.
[**getWholesaleDrop**](WholesaleApi.md#getWholesaleDrop) | **GET** /v1/wholesale/drops/{id} | One trade drop with its listings and, for a pre-book, every reservation: buyer, item, quantity, deposit, balance, status and the balance invoice once released.
[**getWholesaleInvoice**](WholesaleApi.md#getWholesaleInvoice) | **GET** /v1/wholesale/invoices/{id} | One invoice with its lines, PO reference, payments and whether Crossly dues on it are collected.
[**getWholesaleOverview**](WholesaleApi.md#getWholesaleOverview) | **GET** /v1/wholesale/overview | Your wholesale store at a glance: the setup checklist, 30-day wholesale revenue, open orders, outstanding invoices, active buyers and pending access requests.
[**getWholesaleProfile**](WholesaleApi.md#getWholesaleProfile) | **GET** /v1/wholesale/profile | A store&#39;s trade profile (X-Storefront-Id; default store when omitted): company, tagline, logo and banner, contact, ships-from origin, lead time, order minimums (opening, first order, reorder), the default MOQ / case pack / max per order / backorder / price visibility, return, payment and shipping preset ids, invoicing and its settings, buyer requirements and the directory defaults.
[**getWholesaleQuote**](WholesaleApi.md#getWholesaleQuote) | **GET** /v1/wholesale/quotes/{id} | One quote request.
[**getWholesaleReserve**](WholesaleApi.md#getWholesaleReserve) | **GET** /v1/wholesale/reserve/{inventoryItemId} | How many units of an inventory item are held back for wholesale, and what retail channels advertise.
[**getWholesaleTermPreview**](WholesaleApi.md#getWholesaleTermPreview) | **GET** /v1/wholesale/terms/preview | The trade terms that apply to a catalog item (?catalogId&amp;platformListingId), a catalog (?catalogId) or the trade profile alone, each with its source (item, catalog, profile, default), plus the return, payment and shipping policies they resolve to.
[**listWholesaleBuyers**](WholesaleApi.md#listWholesaleBuyers) | **GET** /v1/wholesale/buyers | Your trade buyers: catalogs they can open, customer groups, account terms, outstanding balance, wholesale spend, business verification and resale-certificate status (read-only — Crossly reviews those).
[**listWholesaleCatalogItems**](WholesaleApi.md#listWholesaleCatalogItems) | **GET** /v1/wholesale/catalogs/{id}/items | A catalog&#39;s items in merchandising order, each with its retail price, trade price, minimum order quantity, case pack and quantity breaks.
[**listWholesaleCatalogs**](WholesaleApi.md#listWholesaleCatalogs) | **GET** /v1/wholesale/catalogs | Your wholesale catalogs with item, buyer-grant and pending-request counts.
[**listWholesaleDrops**](WholesaleApi.md#listWholesaleDrops) | **GET** /v1/wholesale/drops | Your trade drops and pre-books: audience (trade &#x3D; your approved trade buyers, catalog &#x3D; whoever can open audienceCatalogId), kind (release | prebook), deposit, ship date, status, and for a pre-book its reservation totals (buyers, units, deposits taken, balances still to invoice).
[**listWholesaleFreightRequests**](WholesaleApi.md#listWholesaleFreightRequests) | **GET** /v1/wholesale/freight-requests | Freight (LTL) quote requests from buyers whose order is over your pallet threshold.
[**listWholesaleGroups**](WholesaleApi.md#listWholesaleGroups) | **GET** /v1/wholesale/groups | Your customer groups with their discount and members.
[**listWholesaleInvoices**](WholesaleApi.md#listWholesaleInvoices) | **GET** /v1/wholesale/invoices | On-account invoices, newest first, with balance due. ?status&#x3D;unpaid for open, partial and overdue together.
[**listWholesaleOrders**](WholesaleApi.md#listWholesaleOrders) | **GET** /v1/wholesale/orders | Wholesale orders: Crossly orders priced through your trade terms (catalog price, quantity break or account rate) or placed on account. Fulfil them like any order.
[**listWholesaleQuotes**](WholesaleApi.md#listWholesaleQuotes) | **GET** /v1/wholesale/quotes | Quote requests (RFQ) from trade buyers: items with quantity and target price, your quoted prices and expiry. ?status&#x3D;open lists the ones waiting on you or the buyer.
[**listWholesaleRequests**](WholesaleApi.md#listWholesaleRequests) | **GET** /v1/wholesale/requests | Requests from buyers to open your private or trade-only catalogs, with each buyer&#39;s business-verification and tax-exempt status. ?status&#x3D;all includes decided ones.
[**listWholesaleSetupSteps**](WholesaleApi.md#listWholesaleSetupSteps) | **GET** /v1/wholesale/setup-steps | The wholesale setup checklist for a store: profile, ships-from, payment, returns, a catalog with items, visibility chosen, live. Each step is done because the thing exists.
[**updateWholesaleBuyerTerm**](WholesaleApi.md#updateWholesaleBuyerTerm) | **PUT** /v1/wholesale/buyers/{buyerUserId}/terms | Set a buyer&#39;s account terms: netDays (0-120) for paying on account, creditLimitCents (the most they may owe you at once; null &#x3D; no limit) and discountPercentBps (their negotiated rate).
[**updateWholesaleCatalog**](WholesaleApi.md#updateWholesaleCatalog) | **PATCH** /v1/wholesale/catalogs/{id} | Edit a catalog: name, slug, description, cover image, visibility, opening-order minimum, trade gate, directory listing, active.
[**updateWholesaleCatalogItem**](WholesaleApi.md#updateWholesaleCatalogItem) | **PATCH** /v1/wholesale/catalogs/{id}/items | Change many catalog items at once: items[] sets each row (trade price, MOQ, case pack, lead time, max per order, backorder, restock date, verified-only, price visibility, preset ids); or platformListingIds + set applies the same values to each, set.pctOffRetailBps pricing each from its retail price.
[**updateWholesaleCatalogItemByPlatformListingId**](WholesaleApi.md#updateWholesaleCatalogItemByPlatformListingId) | **PATCH** /v1/wholesale/catalogs/{id}/items/{platformListingId} | Change one item&#39;s trade price and its own trade terms in this catalog (MOQ, case pack, lead time, max per order, backorder, restock date, verified-only, price visibility, preset ids). null clears &#x3D; inherit from the catalog.
[**updateWholesaleCatalogItemOrder**](WholesaleApi.md#updateWholesaleCatalogItemOrder) | **PUT** /v1/wholesale/catalogs/{id}/items/order | Set the merchandising order: platform listing ids, first to last. Items left out keep their relative order after these.
[**updateWholesaleDrop**](WholesaleApi.md#updateWholesaleDrop) | **PATCH** /v1/wholesale/drops/{id} | Edit a trade drop (any create field but kind), schedule it (status \&quot;scheduled\&quot;, with dropAt in the future) or cancel it. A live drop can only be cancelled or have endsAt / perCustomerLimit changed.
[**updateWholesaleGroup**](WholesaleApi.md#updateWholesaleGroup) | **PATCH** /v1/wholesale/groups/{id} | Rename a group, change its discount, or pause it (active&#x3D;false).
[**updateWholesaleListingTier**](WholesaleApi.md#updateWholesaleListingTier) | **PUT** /v1/wholesale/listings/{platformListingId}/tiers | Replace one listing&#39;s quantity breaks: [{ minQuantity ≥ 2, unitPriceCents }], each cheaper than the last and than the list price. An empty list removes them. Applies to every buyer at checkout.
[**updateWholesaleProfile**](WholesaleApi.md#updateWholesaleProfile) | **PUT** /v1/wholesale/profile | Save a store&#39;s trade profile. Omitted fields are unchanged; null clears. shipsFrom is checked by the shipping validator (400 invalid_ships_from). The profile is the bottom of the trade-terms cascade: catalogs and items that leave a term empty inherit it — saving never rewrites catalogs. Preset ids must be your own presets of that kind.
[**updateWholesaleReserve**](WholesaleApi.md#updateWholesaleReserve) | **PUT** /v1/wholesale/reserve/{inventoryItemId} | Reserve N units of an inventory item for wholesale: retail channels advertise the rest and come down when only the reserve is left. 0 clears it.


<a name="createWholesaleBuyerInvite"></a>
# **createWholesaleBuyerInvite**
> CreateWholesaleBuyerInviteResponse createWholesaleBuyerInvite()

Invite a buyer by email to one or more of your catalogs. Binds to their account now if they have one, or when they sign up.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : CreateWholesaleBuyerInviteResponse = apiInstance.createWholesaleBuyerInvite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleBuyerInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleBuyerInvite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleBuyerInviteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleBuyerRemove"></a>
# **createWholesaleBuyerRemove**
> CreateWholesaleBuyerRemoveResponse createWholesaleBuyerRemove()

Revoke every catalog grant a buyer (or invited email) has with you. Their terms and invoices are kept.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : CreateWholesaleBuyerRemoveResponse = apiInstance.createWholesaleBuyerRemove()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleBuyerRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleBuyerRemove")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleBuyerRemoveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleCatalog"></a>
# **createWholesaleCatalog**
> CreateWholesaleCatalogResponse createWholesaleCatalog()

Create a catalog. visibility public | public_prices_private (prices for approved buyers) | private_discoverable (listed, opened on approval) | link (anyone with the URL) | invite (named buyers only; \&quot;private\&quot; is accepted as invite); autoApprove never | verified | all; the cascade terms (minOrderQuantity, casePack, leadTimeDays, verifiedOnly, priceVisibility, maxPerOrder, backorder, restockEta, preset ids) default every item; listed advertises a public catalog in the wholesale directory (never its prices).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : CreateWholesaleCatalogResponse = apiInstance.createWholesaleCatalog()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleCatalog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleCatalog")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleCatalogResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleCatalogItem"></a>
# **createWholesaleCatalogItem**
> CreateWholesaleCatalogItemResponse createWholesaleCatalogItem(id)

Add your Crossly listings to a catalog (up to 500), each with an optional wholesalePriceCents, minOrderQuantity and casePack. Items already in the catalog have their terms updated.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWholesaleCatalogItemResponse = apiInstance.createWholesaleCatalogItem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleCatalogItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleCatalogItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWholesaleCatalogItemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleDrop"></a>
# **createWholesaleDrop**
> CreateWholesaleDropResponse createWholesaleDrop()

Create a draft trade drop: name, dropAt (ISO; when it opens), audience trade|catalog (+ audienceCatalogId), kind release|prebook. A pre-book needs depositBps (100-9900) and shipBy (YYYY-MM-DD), and takes balanceNetDays (0-90) for the balance invoice. listingIds are your listing ids, each on Crossly. A pre-book makes its listings pre-orders, so buyers pay the deposit at checkout. Schedule it with PATCH status \&quot;scheduled\&quot;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : CreateWholesaleDropResponse = apiInstance.createWholesaleDrop()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleDrop")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleDropRelease"></a>
# **createWholesaleDropRelease**
> CreateWholesaleDropReleaseResponse createWholesaleDropRelease(id)

Release a live pre-book: every reserved balance becomes an invoice on account to its buyer (due in the drop balanceNetDays), emailed, and the drop ends. Safe to retry: only balances not yet invoiced are invoiced. Returns { invoiced, balanceCents, invoiceIds }.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWholesaleDropReleaseResponse = apiInstance.createWholesaleDropRelease(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleDropRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleDropRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWholesaleDropReleaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleFreightRequestAnswer"></a>
# **createWholesaleFreightRequestAnswer**
> CreateWholesaleFreightRequestAnswerResponse createWholesaleFreightRequestAnswer(id)

Answer an open freight request with a figure in CENTS (and an optional note).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWholesaleFreightRequestAnswerResponse = apiInstance.createWholesaleFreightRequestAnswer(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleFreightRequestAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleFreightRequestAnswer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWholesaleFreightRequestAnswerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleGroup"></a>
# **createWholesaleGroup**
> CreateWholesaleGroupResponse createWholesaleGroup()

Create a customer group with a discount in basis points (up to 9000). A buyer in several groups gets the best rate, never a stacked one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : CreateWholesaleGroupResponse = apiInstance.createWholesaleGroup()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleGroup")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleGroupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleGroupMember"></a>
# **createWholesaleGroupMember**
> CreateWholesaleGroupMemberResponse createWholesaleGroupMember(id)

Add a buyer to a group by account id or by the email of an existing Crossly account.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWholesaleGroupMemberResponse = apiInstance.createWholesaleGroupMember(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleGroupMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleGroupMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWholesaleGroupMemberResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleInvoiceCreditNote"></a>
# **createWholesaleInvoiceCreditNote**
> CreateWholesaleInvoiceCreditNoteResponse createWholesaleInvoiceCreditNote(id)

Issue a credit note on an on-account invoice (short shipment, damaged, pricing error, returned, goodwill, other): at most the balance due. Numbered &lt;invoice&gt;-CN&lt;n&gt;; settling the rest closes the invoice paid. Not a refund.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWholesaleInvoiceCreditNoteResponse = apiInstance.createWholesaleInvoiceCreditNote(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleInvoiceCreditNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleInvoiceCreditNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWholesaleInvoiceCreditNoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleInvoiceLateFee"></a>
# **createWholesaleInvoiceLateFee**
> WholesaleInvoiceResponse createWholesaleInvoiceLateFee(id)

Add your late fee (invoice settings lateFeeBps) to an invoice by hand, once. The hourly sweep adds it automatically when an invoice goes overdue.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : WholesaleInvoiceResponse = apiInstance.createWholesaleInvoiceLateFee(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleInvoiceLateFee")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleInvoiceLateFee")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**WholesaleInvoiceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleInvoiceMarkPaid"></a>
# **createWholesaleInvoiceMarkPaid**
> WholesaleInvoiceResponse createWholesaleInvoiceMarkPaid(id)

Record a payment the buyer made to you directly: method ach | check | wire | card | other, a reference, and amountCents (omit for the whole balance). When the invoice is settled, Crossly&#39;s fee and the tax it remits are charged to your billing card.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : WholesaleInvoiceResponse = apiInstance.createWholesaleInvoiceMarkPaid(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleInvoiceMarkPaid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleInvoiceMarkPaid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**WholesaleInvoiceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleInvoiceSend"></a>
# **createWholesaleInvoiceSend**
> CreateWholesaleInvoiceSendResponse createWholesaleInvoiceSend(id)

Email the invoice to the buyer again (an overdue one goes as an overdue notice), with the link to pay it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWholesaleInvoiceSendResponse = apiInstance.createWholesaleInvoiceSend(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleInvoiceSend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleInvoiceSend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWholesaleInvoiceSendResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleInvoiceVoid"></a>
# **createWholesaleInvoiceVoid**
> WholesaleInvoiceResponse createWholesaleInvoiceVoid(id)

Void an invoice nobody has paid anything on (e.g. the order was cancelled). It stops counting against the buyer&#39;s credit limit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : WholesaleInvoiceResponse = apiInstance.createWholesaleInvoiceVoid(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleInvoiceVoid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleInvoiceVoid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**WholesaleInvoiceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleInvoiceWriteOff"></a>
# **createWholesaleInvoiceWriteOff**
> WholesaleInvoiceResponse createWholesaleInvoiceWriteOff(id)

Write off what is left on an invoice (bad debt): it closes as written_off and stops counting against the buyer&#39;s credit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : WholesaleInvoiceResponse = apiInstance.createWholesaleInvoiceWriteOff(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleInvoiceWriteOff")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleInvoiceWriteOff")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**WholesaleInvoiceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleProfileShipsFromValidate"></a>
# **createWholesaleProfileShipsFromValidate**
> CreateWholesaleProfileShipsFromValidateResponse createWholesaleProfileShipsFromValidate()

Check a ships-from origin ({ postalCode, country, city?, region? }) with the shipping validator without saving it. 400 invalid_ships_from with the issues; 422 for an embargoed origin.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : CreateWholesaleProfileShipsFromValidateResponse = apiInstance.createWholesaleProfileShipsFromValidate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleProfileShipsFromValidate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleProfileShipsFromValidate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleProfileShipsFromValidateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleQuoteAnswer"></a>
# **createWholesaleQuoteAnswer**
> WholesaleQuoteResponse createWholesaleQuoteAnswer(id)

Answer (or revise) a quote: a unit price in CENTS per item you quote, an expiresAt (ISO, at most 90 days out) and an optional note. Items left out are not quoted. The buyer is notified and can accept until expiry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : WholesaleQuoteResponse = apiInstance.createWholesaleQuoteAnswer(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleQuoteAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleQuoteAnswer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**WholesaleQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleQuoteDecline"></a>
# **createWholesaleQuoteDecline**
> WholesaleQuoteResponse createWholesaleQuoteDecline(id)

Decline a quote request, with an optional reason the buyer sees.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : WholesaleQuoteResponse = apiInstance.createWholesaleQuoteDecline(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleQuoteDecline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleQuoteDecline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**WholesaleQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleRequestDecide"></a>
# **createWholesaleRequestDecide**
> CreateWholesaleRequestDecideResponse createWholesaleRequestDecide(id)

Approve (grants access to that catalog; optional groupId adds the buyer to a customer group) or decline (optional reason) an access request.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWholesaleRequestDecideResponse = apiInstance.createWholesaleRequestDecide(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleRequestDecide")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleRequestDecide")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWholesaleRequestDecideResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWholesaleTierBulk"></a>
# **createWholesaleTierBulk**
> CreateWholesaleTierBulkResponse createWholesaleTierBulk()

One ladder for many listings: breaks as [{ minQuantity, discountBps }] off each listing&#39;s own price. Returns how many were updated and which were skipped and why.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : CreateWholesaleTierBulkResponse = apiInstance.createWholesaleTierBulk()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#createWholesaleTierBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#createWholesaleTierBulk")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleTierBulkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWholesaleBuyerTerm"></a>
# **deleteWholesaleBuyerTerm**
> UpdateGroupBuyResponse deleteWholesaleBuyerTerm(buyerUserId)

Switch a buyer&#39;s account terms off. Invoices already issued are unaffected.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val buyerUserId : kotlin.String = buyerUserId_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.deleteWholesaleBuyerTerm(buyerUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#deleteWholesaleBuyerTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#deleteWholesaleBuyerTerm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerUserId** | **kotlin.String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWholesaleCatalog"></a>
# **deleteWholesaleCatalog**
> UpdateGroupBuyResponse deleteWholesaleCatalog(id)

Delete a catalog with its items, grants and access requests. Orders and invoices are untouched.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.deleteWholesaleCatalog(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#deleteWholesaleCatalog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#deleteWholesaleCatalog")
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

<a name="deleteWholesaleCatalogItem"></a>
# **deleteWholesaleCatalogItem**
> UpdateGroupBuyResponse deleteWholesaleCatalogItem(id, platformListingId)

Take an item out of a catalog. The listing itself is untouched.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
val platformListingId : kotlin.String = platformListingId_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.deleteWholesaleCatalogItem(id, platformListingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#deleteWholesaleCatalogItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#deleteWholesaleCatalogItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **platformListingId** | **kotlin.String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWholesaleGroup"></a>
# **deleteWholesaleGroup**
> UpdateGroupBuyResponse deleteWholesaleGroup(id)

Delete a customer group. Its members keep any other group or account rate.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.deleteWholesaleGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#deleteWholesaleGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#deleteWholesaleGroup")
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

<a name="deleteWholesaleGroupMember"></a>
# **deleteWholesaleGroupMember**
> UpdateGroupBuyResponse deleteWholesaleGroupMember(id, buyerUserId)

Take a buyer out of a group.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
val buyerUserId : kotlin.String = buyerUserId_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.deleteWholesaleGroupMember(id, buyerUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#deleteWholesaleGroupMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#deleteWholesaleGroupMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **buyerUserId** | **kotlin.String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWholesaleCatalogLineSheet"></a>
# **getWholesaleCatalogLineSheet**
> GetWholesaleCatalogLineSheetResponse getWholesaleCatalogLineSheet(id)

The catalog&#39;s line sheet: your company details and terms, then every item with retail and trade price, minimum, case pack and quantity breaks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWholesaleCatalogLineSheetResponse = apiInstance.getWholesaleCatalogLineSheet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#getWholesaleCatalogLineSheet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#getWholesaleCatalogLineSheet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWholesaleCatalogLineSheetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWholesaleCatalogShare"></a>
# **getWholesaleCatalogShare**
> GetWholesaleCatalogShareResponse getWholesaleCatalogShare(id)

The catalog&#39;s buyer link (null until you have a shop username), to share or print as a QR code.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWholesaleCatalogShareResponse = apiInstance.getWholesaleCatalogShare(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#getWholesaleCatalogShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#getWholesaleCatalogShare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWholesaleCatalogShareResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWholesaleCategory"></a>
# **getWholesaleCategory**
> GetWholesaleCategoryResponse getWholesaleCategory()

The wholesale category taxonomy (id, label, group). A catalog or trade profile takes up to 12 ids, or \&quot;other:&lt;words&gt;\&quot;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : GetWholesaleCategoryResponse = apiInstance.getWholesaleCategory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#getWholesaleCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#getWholesaleCategory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWholesaleCategoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWholesaleDrop"></a>
# **getWholesaleDrop**
> GetWholesaleDropResponse getWholesaleDrop(id)

One trade drop with its listings and, for a pre-book, every reservation: buyer, item, quantity, deposit, balance, status and the balance invoice once released.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWholesaleDropResponse = apiInstance.getWholesaleDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#getWholesaleDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#getWholesaleDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWholesaleDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWholesaleInvoice"></a>
# **getWholesaleInvoice**
> WholesaleInvoiceResponse getWholesaleInvoice(id)

One invoice with its lines, PO reference, payments and whether Crossly dues on it are collected.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : WholesaleInvoiceResponse = apiInstance.getWholesaleInvoice(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#getWholesaleInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#getWholesaleInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**WholesaleInvoiceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWholesaleOverview"></a>
# **getWholesaleOverview**
> GetWholesaleOverviewResponse getWholesaleOverview()

Your wholesale store at a glance: the setup checklist, 30-day wholesale revenue, open orders, outstanding invoices, active buyers and pending access requests.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : GetWholesaleOverviewResponse = apiInstance.getWholesaleOverview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#getWholesaleOverview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#getWholesaleOverview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWholesaleOverviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWholesaleProfile"></a>
# **getWholesaleProfile**
> GetWholesaleProfileResponse getWholesaleProfile()

A store&#39;s trade profile (X-Storefront-Id; default store when omitted): company, tagline, logo and banner, contact, ships-from origin, lead time, order minimums (opening, first order, reorder), the default MOQ / case pack / max per order / backorder / price visibility, return, payment and shipping preset ids, invoicing and its settings, buyer requirements and the directory defaults.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : GetWholesaleProfileResponse = apiInstance.getWholesaleProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#getWholesaleProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#getWholesaleProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWholesaleProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWholesaleQuote"></a>
# **getWholesaleQuote**
> WholesaleQuoteResponse getWholesaleQuote(id)

One quote request.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : WholesaleQuoteResponse = apiInstance.getWholesaleQuote(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#getWholesaleQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#getWholesaleQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**WholesaleQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWholesaleReserve"></a>
# **getWholesaleReserve**
> GetWholesaleReserveResponse getWholesaleReserve(inventoryItemId)

How many units of an inventory item are held back for wholesale, and what retail channels advertise.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val inventoryItemId : kotlin.String = inventoryItemId_example // kotlin.String | 
try {
    val result : GetWholesaleReserveResponse = apiInstance.getWholesaleReserve(inventoryItemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#getWholesaleReserve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#getWholesaleReserve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryItemId** | **kotlin.String**|  |

### Return type

**GetWholesaleReserveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWholesaleTermPreview"></a>
# **getWholesaleTermPreview**
> GetWholesaleTermPreviewResponse getWholesaleTermPreview()

The trade terms that apply to a catalog item (?catalogId&amp;platformListingId), a catalog (?catalogId) or the trade profile alone, each with its source (item, catalog, profile, default), plus the return, payment and shipping policies they resolve to.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : GetWholesaleTermPreviewResponse = apiInstance.getWholesaleTermPreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#getWholesaleTermPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#getWholesaleTermPreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWholesaleTermPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleBuyers"></a>
# **listWholesaleBuyers**
> ListWholesaleBuyersResponse listWholesaleBuyers()

Your trade buyers: catalogs they can open, customer groups, account terms, outstanding balance, wholesale spend, business verification and resale-certificate status (read-only — Crossly reviews those).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : ListWholesaleBuyersResponse = apiInstance.listWholesaleBuyers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleBuyers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleBuyers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleBuyersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleCatalogItems"></a>
# **listWholesaleCatalogItems**
> ListWholesaleCatalogItemsResponse listWholesaleCatalogItems(id)

A catalog&#39;s items in merchandising order, each with its retail price, trade price, minimum order quantity, case pack and quantity breaks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListWholesaleCatalogItemsResponse = apiInstance.listWholesaleCatalogItems(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleCatalogItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleCatalogItems")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListWholesaleCatalogItemsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleCatalogs"></a>
# **listWholesaleCatalogs**
> ListWholesaleCatalogsResponse listWholesaleCatalogs()

Your wholesale catalogs with item, buyer-grant and pending-request counts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : ListWholesaleCatalogsResponse = apiInstance.listWholesaleCatalogs()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleCatalogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleCatalogs")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleCatalogsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleDrops"></a>
# **listWholesaleDrops**
> ListWholesaleDropsResponse listWholesaleDrops()

Your trade drops and pre-books: audience (trade &#x3D; your approved trade buyers, catalog &#x3D; whoever can open audienceCatalogId), kind (release | prebook), deposit, ship date, status, and for a pre-book its reservation totals (buyers, units, deposits taken, balances still to invoice).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : ListWholesaleDropsResponse = apiInstance.listWholesaleDrops()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleDrops")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleDrops")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleDropsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleFreightRequests"></a>
# **listWholesaleFreightRequests**
> ListWholesaleFreightRequestsResponse listWholesaleFreightRequests()

Freight (LTL) quote requests from buyers whose order is over your pallet threshold.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : ListWholesaleFreightRequestsResponse = apiInstance.listWholesaleFreightRequests()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleFreightRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleFreightRequests")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleFreightRequestsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleGroups"></a>
# **listWholesaleGroups**
> ListWholesaleGroupsResponse listWholesaleGroups()

Your customer groups with their discount and members.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : ListWholesaleGroupsResponse = apiInstance.listWholesaleGroups()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleGroups")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleGroupsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleInvoices"></a>
# **listWholesaleInvoices**
> ListWholesaleInvoicesResponse listWholesaleInvoices()

On-account invoices, newest first, with balance due. ?status&#x3D;unpaid for open, partial and overdue together.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : ListWholesaleInvoicesResponse = apiInstance.listWholesaleInvoices()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleInvoices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleInvoices")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleInvoicesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleOrders"></a>
# **listWholesaleOrders**
> ListWholesaleOrdersResponse listWholesaleOrders()

Wholesale orders: Crossly orders priced through your trade terms (catalog price, quantity break or account rate) or placed on account. Fulfil them like any order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : ListWholesaleOrdersResponse = apiInstance.listWholesaleOrders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleOrders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleOrdersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleQuotes"></a>
# **listWholesaleQuotes**
> ListWholesaleQuotesResponse listWholesaleQuotes()

Quote requests (RFQ) from trade buyers: items with quantity and target price, your quoted prices and expiry. ?status&#x3D;open lists the ones waiting on you or the buyer.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : ListWholesaleQuotesResponse = apiInstance.listWholesaleQuotes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleQuotes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleQuotesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleRequests"></a>
# **listWholesaleRequests**
> ListWholesaleRequestsResponse listWholesaleRequests()

Requests from buyers to open your private or trade-only catalogs, with each buyer&#39;s business-verification and tax-exempt status. ?status&#x3D;all includes decided ones.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : ListWholesaleRequestsResponse = apiInstance.listWholesaleRequests()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleRequests")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleRequestsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWholesaleSetupSteps"></a>
# **listWholesaleSetupSteps**
> ListWholesaleSetupStepsResponse listWholesaleSetupSteps()

The wholesale setup checklist for a store: profile, ships-from, payment, returns, a catalog with items, visibility chosen, live. Each step is done because the thing exists.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : ListWholesaleSetupStepsResponse = apiInstance.listWholesaleSetupSteps()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#listWholesaleSetupSteps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#listWholesaleSetupSteps")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleSetupStepsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWholesaleBuyerTerm"></a>
# **updateWholesaleBuyerTerm**
> UpdateWholesaleBuyerTermResponse updateWholesaleBuyerTerm(buyerUserId)

Set a buyer&#39;s account terms: netDays (0-120) for paying on account, creditLimitCents (the most they may owe you at once; null &#x3D; no limit) and discountPercentBps (their negotiated rate).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val buyerUserId : kotlin.String = buyerUserId_example // kotlin.String | 
try {
    val result : UpdateWholesaleBuyerTermResponse = apiInstance.updateWholesaleBuyerTerm(buyerUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#updateWholesaleBuyerTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#updateWholesaleBuyerTerm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerUserId** | **kotlin.String**|  |

### Return type

**UpdateWholesaleBuyerTermResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWholesaleCatalog"></a>
# **updateWholesaleCatalog**
> CreateWholesaleCatalogResponse updateWholesaleCatalog(id)

Edit a catalog: name, slug, description, cover image, visibility, opening-order minimum, trade gate, directory listing, active.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWholesaleCatalogResponse = apiInstance.updateWholesaleCatalog(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#updateWholesaleCatalog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#updateWholesaleCatalog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWholesaleCatalogResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWholesaleCatalogItem"></a>
# **updateWholesaleCatalogItem**
> UpdateWholesaleCatalogItemResponse updateWholesaleCatalogItem(id)

Change many catalog items at once: items[] sets each row (trade price, MOQ, case pack, lead time, max per order, backorder, restock date, verified-only, price visibility, preset ids); or platformListingIds + set applies the same values to each, set.pctOffRetailBps pricing each from its retail price.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateWholesaleCatalogItemResponse = apiInstance.updateWholesaleCatalogItem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#updateWholesaleCatalogItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#updateWholesaleCatalogItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateWholesaleCatalogItemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWholesaleCatalogItemByPlatformListingId"></a>
# **updateWholesaleCatalogItemByPlatformListingId**
> UpdateGroupBuyResponse updateWholesaleCatalogItemByPlatformListingId(id, platformListingId)

Change one item&#39;s trade price and its own trade terms in this catalog (MOQ, case pack, lead time, max per order, backorder, restock date, verified-only, price visibility, preset ids). null clears &#x3D; inherit from the catalog.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
val platformListingId : kotlin.String = platformListingId_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.updateWholesaleCatalogItemByPlatformListingId(id, platformListingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#updateWholesaleCatalogItemByPlatformListingId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#updateWholesaleCatalogItemByPlatformListingId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **platformListingId** | **kotlin.String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWholesaleCatalogItemOrder"></a>
# **updateWholesaleCatalogItemOrder**
> ListWholesaleCatalogItemsResponse updateWholesaleCatalogItemOrder(id)

Set the merchandising order: platform listing ids, first to last. Items left out keep their relative order after these.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListWholesaleCatalogItemsResponse = apiInstance.updateWholesaleCatalogItemOrder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#updateWholesaleCatalogItemOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#updateWholesaleCatalogItemOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListWholesaleCatalogItemsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWholesaleDrop"></a>
# **updateWholesaleDrop**
> CreateWholesaleDropResponse updateWholesaleDrop(id)

Edit a trade drop (any create field but kind), schedule it (status \&quot;scheduled\&quot;, with dropAt in the future) or cancel it. A live drop can only be cancelled or have endsAt / perCustomerLimit changed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWholesaleDropResponse = apiInstance.updateWholesaleDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#updateWholesaleDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#updateWholesaleDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWholesaleDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWholesaleGroup"></a>
# **updateWholesaleGroup**
> CreateWholesaleGroupResponse updateWholesaleGroup(id)

Rename a group, change its discount, or pause it (active&#x3D;false).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWholesaleGroupResponse = apiInstance.updateWholesaleGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#updateWholesaleGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#updateWholesaleGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWholesaleGroupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWholesaleListingTier"></a>
# **updateWholesaleListingTier**
> UpdateWholesaleListingTierResponse updateWholesaleListingTier(platformListingId)

Replace one listing&#39;s quantity breaks: [{ minQuantity ≥ 2, unitPriceCents }], each cheaper than the last and than the list price. An empty list removes them. Applies to every buyer at checkout.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val platformListingId : kotlin.String = platformListingId_example // kotlin.String | 
try {
    val result : UpdateWholesaleListingTierResponse = apiInstance.updateWholesaleListingTier(platformListingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#updateWholesaleListingTier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#updateWholesaleListingTier")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platformListingId** | **kotlin.String**|  |

### Return type

**UpdateWholesaleListingTierResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWholesaleProfile"></a>
# **updateWholesaleProfile**
> UpdateWholesaleProfileResponse updateWholesaleProfile()

Save a store&#39;s trade profile. Omitted fields are unchanged; null clears. shipsFrom is checked by the shipping validator (400 invalid_ships_from). The profile is the bottom of the trade-terms cascade: catalogs and items that leave a term empty inherit it — saving never rewrites catalogs. Preset ids must be your own presets of that kind.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
try {
    val result : UpdateWholesaleProfileResponse = apiInstance.updateWholesaleProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#updateWholesaleProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#updateWholesaleProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateWholesaleProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWholesaleReserve"></a>
# **updateWholesaleReserve**
> GetWholesaleReserveResponse updateWholesaleReserve(inventoryItemId)

Reserve N units of an inventory item for wholesale: retail channels advertise the rest and come down when only the reserve is left. 0 clears it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WholesaleApi()
val inventoryItemId : kotlin.String = inventoryItemId_example // kotlin.String | 
try {
    val result : GetWholesaleReserveResponse = apiInstance.updateWholesaleReserve(inventoryItemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WholesaleApi#updateWholesaleReserve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WholesaleApi#updateWholesaleReserve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryItemId** | **kotlin.String**|  |

### Return type

**GetWholesaleReserveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

