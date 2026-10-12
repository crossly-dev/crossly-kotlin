# InventoryApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCatalogMatchConfirm**](InventoryApi.md#createCatalogMatchConfirm) | **POST** /v1/catalog-matches/{id}/confirm | Confirm a catalog-match suggestion: links the item to the catalog product (sets its market_sku_id), so sold comps and market pricing apply to it.
[**createCatalogMatchDismiss**](InventoryApi.md#createCatalogMatchDismiss) | **POST** /v1/catalog-matches/{id}/dismiss | Dismiss a catalog-match suggestion. That product is never suggested for this item again.
[**createInventory**](InventoryApi.md#createInventory) | **POST** /v1/inventory | Create a new inventory item.
[**createInventoryBulkArchive**](InventoryApi.md#createInventoryBulkArchive) | **POST** /v1/inventory/bulk-archive | Bulk archive inventory items (soft).
[**createInventoryBulkDelete**](InventoryApi.md#createInventoryBulkDelete) | **POST** /v1/inventory/bulk-delete | Bulk delete inventory items (delinks listings).
[**createInventoryBulkLabel**](InventoryApi.md#createInventoryBulkLabel) | **POST** /v1/inventory/bulk-labels | Bulk add/remove labels on inventory items.
[**createInventoryBulkQuantity**](InventoryApi.md#createInventoryBulkQuantity) | **POST** /v1/inventory/bulk-quantity | Set / add / subtract stock across many items, syncing live listings.
[**createInventoryCatalogMatchRefresh**](InventoryApi.md#createInventoryCatalogMatchRefresh) | **POST** /v1/inventory/{id}/catalog-matches/refresh | Run catalog matching for one item now. An identifier (UPC, style code, catalogue number) that resolves to exactly one product links it; otherwise likely products are returned as suggestions to confirm.
[**createInventoryCsvExport**](InventoryApi.md#createInventoryCsvExport) | **POST** /v1/inventory/csv/export | Export inventory as CSV. Round-trips back through csv/import.
[**createInventoryCsvImport**](InventoryApi.md#createInventoryCsvImport) | **POST** /v1/inventory/csv/import | Import a CSV. Rows whose sku matches an existing item update it; others are added. Pass dryRun to preview.
[**createInventoryLabelRename**](InventoryApi.md#createInventoryLabelRename) | **POST** /v1/inventory/labels/rename | Rename a label across every inventory item.
[**createInventoryMerge**](InventoryApi.md#createInventoryMerge) | **POST** /v1/inventory/merge | Merge inventory items that are the same physical item into one (stock is not summed).
[**createInventoryUnitIdentifier**](InventoryApi.md#createInventoryUnitIdentifier) | **POST** /v1/inventory/{id}/units/identifiers | Record a serial, IMEI, or licence key against an inventory item.
[**createInventoryUnitLookup**](InventoryApi.md#createInventoryUnitLookup) | **POST** /v1/inventory/units/lookup | Find a unit by identifier.
[**createSpatialPropertyDeedLease**](InventoryApi.md#createSpatialPropertyDeedLease) | **POST** /v1/spatial/property/deeds/{id}/lease | Offer your plot for lease.
[**createSpatialPropertyDeedList**](InventoryApi.md#createSpatialPropertyDeedList) | **POST** /v1/spatial/property/deeds/{id}/list | List your plot for resale.
[**createSpatialPropertyDeedMaintenance**](InventoryApi.md#createSpatialPropertyDeedMaintenance) | **POST** /v1/spatial/property/deeds/{id}/maintenance | Pay a plot&#39;s maintenance forward.
[**createSpatialPropertyLeaseAccept**](InventoryApi.md#createSpatialPropertyLeaseAccept) | **POST** /v1/spatial/property/leases/{id}/accept | Take a plot on lease.
[**createSpatialPropertyLeaseEnd**](InventoryApi.md#createSpatialPropertyLeaseEnd) | **POST** /v1/spatial/property/leases/{id}/end | End a lease (owner or tenant).
[**createSpatialPropertyLeaseRent**](InventoryApi.md#createSpatialPropertyLeaseRent) | **POST** /v1/spatial/property/leases/{id}/rent | Pay rent forward.
[**createSpatialPropertyListingBuy**](InventoryApi.md#createSpatialPropertyListingBuy) | **POST** /v1/spatial/property/listings/{id}/buy | Buy a plot on the resale market, in CBX.
[**createSpatialPropertyListingCancel**](InventoryApi.md#createSpatialPropertyListingCancel) | **POST** /v1/spatial/property/listings/{id}/cancel | Take your plot off the market.
[**createSpatialShopStaffPay**](InventoryApi.md#createSpatialShopStaffPay) | **POST** /v1/spatial/shop/staff/{grantId}/pay | Pay a staff member&#39;s wage forward.
[**createSpatialStreetClaim**](InventoryApi.md#createSpatialStreetClaim) | **POST** /v1/spatial/streets/{slug}/claim | Put your shop on a street.
[**createSpatialStreetOwnedUpkeep**](InventoryApi.md#createSpatialStreetOwnedUpkeep) | **POST** /v1/spatial/streets/owned/{id}/upkeep | Pay a street&#39;s upkeep forward.
[**createSpatialStreetPlotBuy**](InventoryApi.md#createSpatialStreetPlotBuy) | **POST** /v1/spatial/streets/{slug}/plots/{number}/buy | Buy a vacant plot from Crossly, in CBX.
[**createSpatialStreetRequest**](InventoryApi.md#createSpatialStreetRequest) | **POST** /v1/spatial/streets/requests | Ask to found a street.
[**createSpatialStreetRequestFound**](InventoryApi.md#createSpatialStreetRequestFound) | **POST** /v1/spatial/streets/requests/{id}/found | Found an approved street, in CBX.
[**deleteInventory**](InventoryApi.md#deleteInventory) | **DELETE** /v1/inventory/{id} | Soft-archive an inventory item.
[**deleteSpatialStreetPlot**](InventoryApi.md#deleteSpatialStreetPlot) | **DELETE** /v1/spatial/streets/{slug}/plot | Take your shop off a street.
[**getGameLeaderboard**](InventoryApi.md#getGameLeaderboard) | **GET** /v1/games/leaderboards | Game leaderboards: for each of Price Guess (wins, then points), scavenger hunts (finished) and speed trades (won), the top ten this week (Monday 00:00 UTC on) under week and of all time under all -- rank, name, named, value and, for Price Guess, score. A name appears only for somebody who chose to be seen by name in Crossly World; everyone else is \&quot;A player\&quot; in their place.
[**getHome**](InventoryApi.md#getHome) | **GET** /v1/homes/{slug} | A home by its address, as you may see it: open homes to anybody, friends-only homes to mutual follows, locked homes to their owner. 404 when you may not enter.
[**getHomeMine**](InventoryApi.md#getHomeMine) | **GET** /v1/homes/mine | Your Crossly World home: its address, privacy (open / friends / locked), theme, the room, the layout (each piece with what it shows -- things you no longer own are left out at read time) and the guestbook. Made on first read.
[**getInventory**](InventoryApi.md#getInventory) | **GET** /v1/inventory/{id} | Get one inventory item with platform listings.
[**getInventoryAging**](InventoryApi.md#getInventoryAging) | **GET** /v1/inventory/aging | Unsold stock by age (0-7, 7-30, 30-90, 90+ days, unlisted), each bucket with a recommendation.
[**getInventoryCatalogMatch**](InventoryApi.md#getInventoryCatalogMatch) | **GET** /v1/inventory/{id}/catalog-matches | One inventory item&#39;s catalog binding (if confirmed) and its pending match suggestions.
[**getInventoryFacet**](InventoryApi.md#getInventoryFacet) | **GET** /v1/inventory/facets | Distinct brands + categories across this user&#39;s inventory.
[**getInventoryLabel**](InventoryApi.md#getInventoryLabel) | **GET** /v1/inventory/labels | List every distinct label across this user&#39;s inventory.
[**getInventoryLabelStat**](InventoryApi.md#getInventoryLabelStat) | **GET** /v1/inventory/labels/stats | List distinct labels with usage counts + colors.
[**getInventorySellThrough**](InventoryApi.md#getInventorySellThrough) | **GET** /v1/inventory/sell-through | Cohort sell-through for a window (default: the 30 days ending 30 days ago) against the previous window of the same length.
[**getInventorySkuExist**](InventoryApi.md#getInventorySkuExist) | **GET** /v1/inventory/sku-exists | Check whether a SKU is already in use on this user&#39;s inventory.
[**getInventoryValueHistory**](InventoryApi.md#getInventoryValueHistory) | **GET** /v1/inventory/value-history | Portfolio value of unsold stock over time, oldest first (one point per nightly snapshot).
[**getMainStage**](InventoryApi.md#getMainStage) | **GET** /v1/main-stage | The Crossly World Main Stage right now: the live show (title, kind, host lineup), the stream on its big screen while a lineup host is on air, how many people are there (it holds 64 per copy and opens copies as it fills) and what is on next.
[**getPetMine**](InventoryApi.md#getPetMine) | **GET** /v1/pets/mine | Your Crossly World pets: every kind (cat, dog, slab bot) with whether you own it, when it was earned and the ways to earn it (a quest or a reputation level -- pets are never sold), plus the pet walking beside you and the one greeting visitors at your shop door.
[**getReputation**](InventoryApi.md#getReputation) | **GET** /v1/reputation/{profile} | Somebody&#39;s public reputation levels by their storefront handle: the level on each track and their nameplate badge. 404 for an unknown handle.
[**getReputationMine**](InventoryApi.md#getReputationMine) | **GET** /v1/reputation/mine | Your Crossly World reputation: four tracks (trader, collector, seller, host) with points, level, what each level has unlocked and the next unlock, and how the points were earned (recency-weighted; a lost dispute or a failed authentication costs points). Earned from real activity only; nothing buys a level.
[**getSpatialAddress**](InventoryApi.md#getSpatialAddress) | **GET** /v1/spatial/address/{street}/{number} | The shop at an address.
[**getSpatialAuctionPublic**](InventoryApi.md#getSpatialAuctionPublic) | **GET** /v1/spatial/auction/public/{slug} | A shared saleroom, opened by its public share handle.
[**getSpatialAuctionRoom**](InventoryApi.md#getSpatialAuctionRoom) | **GET** /v1/spatial/auction/rooms/{sceneId} | What the rostrum says in this room, right now.
[**getSpatialEmote**](InventoryApi.md#getSpatialEmote) | **GET** /v1/spatial/emotes | Your Crossly World emotes: every emote pack (unlocked or not, with the quest that unlocks it), your 8-slot emote wheel as stored and as it shows (labels, locks, ready dots), and the moments earned and not yet played.
[**getSpatialEmployeeConfig**](InventoryApi.md#getSpatialEmployeeConfig) | **GET** /v1/spatial/employee/config | How the shop employee in one of your rooms is configured.
[**getSpatialParty**](InventoryApi.md#getSpatialParty) | **GET** /v1/spatial/party | Your Crossly World party: party is null when you are in none, else its id, leader and up to 8 members (each with the place and copy they are in right now, or null), plus the invites it has out. invites lists the invites waiting for you.
[**getSpatialProperty**](InventoryApi.md#getSpatialProperty) | **GET** /v1/spatial/property | Your plots and tenancies.
[**getSpatialPublic**](InventoryApi.md#getSpatialPublic) | **GET** /v1/spatial/public/{slug} | A shared room, as a visitor sees it.
[**getSpatialScene**](InventoryApi.md#getSpatialScene) | **GET** /v1/spatial/scenes/{id} | A solved room: every item, where it sits, and why.
[**getSpatialSceneWarehouse**](InventoryApi.md#getSpatialSceneWarehouse) | **GET** /v1/spatial/scenes/{id}/warehouse | A warehouse room: your racks, where they stand, and what is on each.
[**getSpatialShopStaff**](InventoryApi.md#getSpatialShopStaff) | **GET** /v1/spatial/shop/staff | Your shop&#39;s staff and their wages.
[**getSpatialStreet**](InventoryApi.md#getSpatialStreet) | **GET** /v1/spatial/streets/{slug} | A street: every plot and the shop open on each.
[**getSpatialStreetFounding**](InventoryApi.md#getSpatialStreetFounding) | **GET** /v1/spatial/streets/founding | What founding a street costs.
[**getSpatialStreetPlotQuote**](InventoryApi.md#getSpatialStreetPlotQuote) | **GET** /v1/spatial/streets/{slug}/plots/{number}/quote | What a plot costs.
[**getWorldRoomFunnel**](InventoryApi.md#getWorldRoomFunnel) | **GET** /v1/world/rooms/{sceneId}/funnel | Your room&#39;s funnel over the last &#x60;days&#x60; (1-35, default 30): visitors (people, once a day), looks, items opened, checkouts started from the room, paid sales and revenueCents. Sales count only lines the room itself put in a cart.
[**getWorldShelf**](InventoryApi.md#getWorldShelf) | **GET** /v1/world/shelf/{listingSlug} | Where a Crossly listing sits on a shelf in a public room right now (roomSlug, roomName, itemId), or data:null when it is in no room.
[**getWorldSkusCheapest**](InventoryApi.md#getWorldSkusCheapest) | **GET** /v1/world/skus/{skuId}/cheapest | The cheapest copy of a catalogue piece for sale on Crossly now, matched by the catalogue id (listingSlug, priceCents, and the room and item when it stands on a shelf), or data:null.
[**listCatalogMatches**](InventoryApi.md#listCatalogMatches) | **GET** /v1/catalog-matches | Pending catalog-match suggestions: inventory items that look like a catalog product, awaiting your confirm.
[**listFestivals**](InventoryApi.md#listFestivals) | **GET** /v1/festivals | Live and upcoming Crossly World festivals, soonest first: a weekend when every street wears one decor and the festival quest line (limited pins) counts. meta.live is the festival on now, if any.
[**listGameBreakUpcoming**](InventoryApi.md#listGameBreakUpcoming) | **GET** /v1/games/breaks/upcoming | Pack breaks staged on shop stages in Crossly World, live first then soonest: the break, its shop, start time, spots (taken or not, buyer masked), hits revealed so far, and buyUrl -- the break&#39;s page on crossly.net, the only place a spot is bought (null once every spot has sold).
[**listGameHunts**](InventoryApi.md#listGameHunts) | **GET** /v1/games/hunts | Scavenger hunts running now in Crossly World shops and pop-up stalls, ending soonest first: title, shop (name and slug -- for a hunt at a stall, the street slug, with stall.bookingId set), how many tokens, what finishing unlocks (\&quot;10% off\&quot; -- never the code), when it ends and how many people have finished. Optional place filters to one shop or street slug.
[**listGameResultMine**](InventoryApi.md#listGameResultMine) | **GET** /v1/games/results/mine | Your market-game results, newest first: game (price_guess, price_guess_solo, hunt, speed_trade, break_host), the round/hunt/trade/break id, score, whether you won, Bucks prize in cents (0 while prizes are pins only) and detail. meta.unlocks lists the hunt coupons you earned (with their codes); meta.hits the break hits pulled for spots you bought, with the order each ships with.
[**listHomeMineBuilders**](InventoryApi.md#listHomeMineBuilders) | **GET** /v1/homes/mine/builders | Your co-builders: friends you let rearrange your home in the world (move, turn, take out your things, add free furniture; never your bought pieces). Each: userId, name, friends (false once the friendship ended: listed but powerless).
[**listHomeOfTheWeek**](InventoryApi.md#listHomeOfTheWeek) | **GET** /v1/homes/of-the-week | Home of the week: open homes by how many different people signed their guestbook in the last 7 days, most first.
[**listInventory**](InventoryApi.md#listInventory) | **GET** /v1/inventory | List inventory items.
[**listInventoryActivity**](InventoryApi.md#listInventoryActivity) | **GET** /v1/inventory/{id}/activity | Activity log for an inventory item (created/sold/edited/etc.).
[**listInventoryIds**](InventoryApi.md#listInventoryIds) | **GET** /v1/inventory/ids | Filter inventory → return matching id list.
[**listInventoryUnits**](InventoryApi.md#listInventoryUnits) | **GET** /v1/inventory/{id}/units | List the individually identified units of an inventory item.
[**listJobAppraisals**](InventoryApi.md#listJobAppraisals) | **GET** /v1/jobs/appraisals | Open price checks appraisers can answer (Collector level 3+ holding 3+ pieces in the category), newest first, optionally one market category. Each has its bounty; meta.payOn says whether bounties are paid yet.
[**listJobShifts**](InventoryApi.md#listJobShifts) | **GET** /v1/jobs/shifts | Open shifts on the Crossly World Jobs board, soonest first: shop staff shifts in boutiques and grading-desk helper shifts, each with its window, place and pay. meta.payOn says whether Crossly is paying jobs yet.
[**listMainStageEvents**](InventoryApi.md#listMainStageEvents) | **GET** /v1/main-stage/events | Live and upcoming Main Stage events, soonest first: brand launches, creator meetups, talks, live sales and festival shows, each with its window and host lineup.
[**listSpatialAuctionRoomLots**](InventoryApi.md#listSpatialAuctionRoomLots) | **GET** /v1/spatial/auction/rooms/{sceneId}/lots | The catalogue: every lot in the session this room is hosting.
[**listSpatialAuctionRooms**](InventoryApi.md#listSpatialAuctionRooms) | **GET** /v1/spatial/auction/rooms | Rooms of yours that are hosting an auction.
[**listSpatialDeedListings**](InventoryApi.md#listSpatialDeedListings) | **GET** /v1/spatial/deeds/listings | Plots for resale.
[**listSpatialEmployeeSessions**](InventoryApi.md#listSpatialEmployeeSessions) | **GET** /v1/spatial/employee/sessions | The itemised bill: one row per customer-conversation.
[**listSpatialEmployeeUsage**](InventoryApi.md#listSpatialEmployeeUsage) | **GET** /v1/spatial/employee/usage | What your shop employees cost over a period, per room.
[**listSpatialMoments**](InventoryApi.md#listSpatialMoments) | **GET** /v1/spatial/moments | Your moment emotes, newest first: unbox (a Crossly purchase delivered), slab_flip (a card graded through Crossly Grading), handshake (a trade-table shake settled). Each plays once in a room; playedAt is null until then. ready&#x3D;true lists only the unplayed ones.
[**listSpatialPartyWishlist**](InventoryApi.md#listSpatialPartyWishlist) | **GET** /v1/spatial/party/wishlist | Your party&#39;s shared wishlist, newest first: each listing (title, price in cents, image, shop slug while it is live), who added it, and every member&#39;s thumb up or down with the totals. Empty when you are in no party.
[**listSpatialPublic**](InventoryApi.md#listSpatialPublic) | **GET** /v1/spatial/public | Public rooms anyone can walk into.
[**listSpatialPublicOffers**](InventoryApi.md#listSpatialPublicOffers) | **GET** /v1/spatial/public/{slug}/offers | What is for sale in a shared room.
[**listSpatialSceneMovements**](InventoryApi.md#listSpatialSceneMovements) | **GET** /v1/spatial/scenes/{id}/movements | Stock movements in a room over a time window.
[**listSpatialScenes**](InventoryApi.md#listSpatialScenes) | **GET** /v1/spatial/scenes | The rooms this account has.
[**listSpatialShopAddresses**](InventoryApi.md#listSpatialShopAddresses) | **GET** /v1/spatial/shop/addresses | Your shop&#39;s addresses.
[**listSpatialStaffing**](InventoryApi.md#listSpatialStaffing) | **GET** /v1/spatial/staffing | Shops you work in.
[**listSpatialStreetMine**](InventoryApi.md#listSpatialStreetMine) | **GET** /v1/spatial/streets/mine | Your streets.
[**listSpatialStreets**](InventoryApi.md#listSpatialStreets) | **GET** /v1/spatial/streets | Every street in the world.
[**listWorldBlocks**](InventoryApi.md#listWorldBlocks) | **GET** /v1/world/blocks | The people you blocked in Crossly World, as you saw them (label, never the account behind a pseudonym), oldest first. Blocks are made in a room, on the person.
[**listWorldItemSearch**](InventoryApi.md#listWorldItemSearch) | **GET** /v1/world/items/search | Find an item on a shelf anywhere in Crossly World: what public rooms have for sale now, by title or catalogue name (q, 2+ characters). Each hit names the room (roomSlug) and the item (itemId); /c/&lt;roomSlug&gt;?item&#x3D;&lt;itemId&gt; opens it there.
[**listWorldRoomWants**](InventoryApi.md#listWorldRoomWants) | **GET** /v1/world/rooms/{sceneId}/wants | Items your room shows but does not sell that visitors said they would buy (\&quot;I&#39;d buy this\&quot;), most wanted first: itemId and how many people.
[**updateInventory**](InventoryApi.md#updateInventory) | **PATCH** /v1/inventory/{id} | Update an inventory item (partial).
[**updateSpatialEmployeeConfig**](InventoryApi.md#updateSpatialEmployeeConfig) | **PUT** /v1/spatial/employee/config | Create or replace the shop employee in one of your rooms.
[**updateSpatialShopStaffWage**](InventoryApi.md#updateSpatialShopStaffWage) | **PUT** /v1/spatial/shop/staff/{grantId}/wage | Set a staff member&#39;s weekly wage.


<a name="createCatalogMatchConfirm"></a>
# **createCatalogMatchConfirm**
> CreateCatalogMatchConfirmResponse createCatalogMatchConfirm(id)

Confirm a catalog-match suggestion: links the item to the catalog product (sets its market_sku_id), so sold comps and market pricing apply to it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateCatalogMatchConfirmResponse = apiInstance.createCatalogMatchConfirm(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createCatalogMatchConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createCatalogMatchConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateCatalogMatchConfirmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCatalogMatchDismiss"></a>
# **createCatalogMatchDismiss**
> CreateCatalogMatchConfirmResponse createCatalogMatchDismiss(id)

Dismiss a catalog-match suggestion. That product is never suggested for this item again.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateCatalogMatchConfirmResponse = apiInstance.createCatalogMatchDismiss(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createCatalogMatchDismiss")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createCatalogMatchDismiss")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateCatalogMatchConfirmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventory"></a>
# **createInventory**
> CreateInventoryResponse createInventory()

Create a new inventory item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateInventoryResponse = apiInstance.createInventory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateInventoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryBulkArchive"></a>
# **createInventoryBulkArchive**
> CreateInventoryBulkArchiveResponse createInventoryBulkArchive()

Bulk archive inventory items (soft).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateInventoryBulkArchiveResponse = apiInstance.createInventoryBulkArchive()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryBulkArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryBulkArchive")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateInventoryBulkArchiveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryBulkDelete"></a>
# **createInventoryBulkDelete**
> CreateInventoryBulkDeleteResponse createInventoryBulkDelete()

Bulk delete inventory items (delinks listings).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateInventoryBulkDeleteResponse = apiInstance.createInventoryBulkDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryBulkDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryBulkDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateInventoryBulkDeleteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryBulkLabel"></a>
# **createInventoryBulkLabel**
> CreateListingBulkUpdateResponse createInventoryBulkLabel()

Bulk add/remove labels on inventory items.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateListingBulkUpdateResponse = apiInstance.createInventoryBulkLabel()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryBulkLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryBulkLabel")
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

<a name="createInventoryBulkQuantity"></a>
# **createInventoryBulkQuantity**
> CreateInventoryBulkQuantityResponse createInventoryBulkQuantity()

Set / add / subtract stock across many items, syncing live listings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateInventoryBulkQuantityResponse = apiInstance.createInventoryBulkQuantity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryBulkQuantity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryBulkQuantity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateInventoryBulkQuantityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryCatalogMatchRefresh"></a>
# **createInventoryCatalogMatchRefresh**
> CreateInventoryCatalogMatchRefreshResponse createInventoryCatalogMatchRefresh(id)

Run catalog matching for one item now. An identifier (UPC, style code, catalogue number) that resolves to exactly one product links it; otherwise likely products are returned as suggestions to confirm.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateInventoryCatalogMatchRefreshResponse = apiInstance.createInventoryCatalogMatchRefresh(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryCatalogMatchRefresh")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryCatalogMatchRefresh")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateInventoryCatalogMatchRefreshResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryCsvExport"></a>
# **createInventoryCsvExport**
> kotlin.String createInventoryCsvExport()

Export inventory as CSV. Round-trips back through csv/import.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : kotlin.String = apiInstance.createInventoryCsvExport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryCsvExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryCsvExport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryCsvImport"></a>
# **createInventoryCsvImport**
> CreateInventoryCsvImportResponse createInventoryCsvImport()

Import a CSV. Rows whose sku matches an existing item update it; others are added. Pass dryRun to preview.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateInventoryCsvImportResponse = apiInstance.createInventoryCsvImport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryCsvImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryCsvImport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateInventoryCsvImportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryLabelRename"></a>
# **createInventoryLabelRename**
> CreateInventoryLabelRenameResponse createInventoryLabelRename()

Rename a label across every inventory item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateInventoryLabelRenameResponse = apiInstance.createInventoryLabelRename()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryLabelRename")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryLabelRename")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateInventoryLabelRenameResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryMerge"></a>
# **createInventoryMerge**
> CreateInventoryMergeResponse createInventoryMerge()

Merge inventory items that are the same physical item into one (stock is not summed).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateInventoryMergeResponse = apiInstance.createInventoryMerge()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryMerge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryMerge")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateInventoryMergeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryUnitIdentifier"></a>
# **createInventoryUnitIdentifier**
> CreateInventoryUnitIdentifierResponse createInventoryUnitIdentifier(id)

Record a serial, IMEI, or licence key against an inventory item.

Creates the unit lazily if no &#x60;unitId&#x60; is given. Recording BEFORE the item sells is what makes the identifier usable as evidence on a return — one first recorded after a dispute opens is graded &#x60;weak&#x60; and says so.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateInventoryUnitIdentifierResponse = apiInstance.createInventoryUnitIdentifier(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryUnitIdentifier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryUnitIdentifier")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateInventoryUnitIdentifierResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryUnitLookup"></a>
# **createInventoryUnitLookup**
> CreateInventoryUnitLookupResponse createInventoryUnitLookup()

Find a unit by identifier.

\&quot;Have I ever seen this serial?\&quot; — for when something arrives back and nobody knows which order it belongs to. Scoped to the caller, so it can never be used to probe another seller&#39;s stock.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateInventoryUnitLookupResponse = apiInstance.createInventoryUnitLookup()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createInventoryUnitLookup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createInventoryUnitLookup")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateInventoryUnitLookupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialPropertyDeedLease"></a>
# **createSpatialPropertyDeedLease**
> CreateSpatialPropertyDeedLeaseResponse createSpatialPropertyDeedLease(id)

Offer your plot for lease.

Body &#x60;{ rentWeeklyCents }&#x60; ($1-$5,000). The plot must be vacant and its maintenance current. Terms freeze when a tenant accepts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateSpatialPropertyDeedLeaseResponse = apiInstance.createSpatialPropertyDeedLease(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialPropertyDeedLease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialPropertyDeedLease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateSpatialPropertyDeedLeaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialPropertyDeedList"></a>
# **createSpatialPropertyDeedList**
> CreateSpatialPropertyDeedListResponse createSpatialPropertyDeedList(id)

List your plot for resale.

Body &#x60;{ priceCents }&#x60; ($1-$100,000). The deed&#39;s maintenance must be current. A lease on it carries on with the buyer.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateSpatialPropertyDeedListResponse = apiInstance.createSpatialPropertyDeedList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialPropertyDeedList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialPropertyDeedList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateSpatialPropertyDeedListResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialPropertyDeedMaintenance"></a>
# **createSpatialPropertyDeedMaintenance**
> CreateSpatialPropertyDeedMaintenanceResponse createSpatialPropertyDeedMaintenance(id)

Pay a plot&#39;s maintenance forward.

Body &#x60;{ weeks }&#x60; (1-12). Extends &#x60;paidThrough&#x60; from the later of now and the current date.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateSpatialPropertyDeedMaintenanceResponse = apiInstance.createSpatialPropertyDeedMaintenance(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialPropertyDeedMaintenance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialPropertyDeedMaintenance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateSpatialPropertyDeedMaintenanceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialPropertyLeaseAccept"></a>
# **createSpatialPropertyLeaseAccept**
> CreateSpatialPropertyLeaseAcceptResponse createSpatialPropertyLeaseAccept(id)

Take a plot on lease.

Pays the first week to the owner from your EARNED CBX and moves your (public) shop onto the plot.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateSpatialPropertyLeaseAcceptResponse = apiInstance.createSpatialPropertyLeaseAccept(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialPropertyLeaseAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialPropertyLeaseAccept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateSpatialPropertyLeaseAcceptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialPropertyLeaseEnd"></a>
# **createSpatialPropertyLeaseEnd**
> CreateSpatialPropertyLeaseEndResponse createSpatialPropertyLeaseEnd(id)

End a lease (owner or tenant).

The tenant&#39;s shop gets a free Main Street address again.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateSpatialPropertyLeaseEndResponse = apiInstance.createSpatialPropertyLeaseEnd(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialPropertyLeaseEnd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialPropertyLeaseEnd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateSpatialPropertyLeaseEndResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialPropertyLeaseRent"></a>
# **createSpatialPropertyLeaseRent**
> CreateSpatialPropertyLeaseRentResponse createSpatialPropertyLeaseRent(id)

Pay rent forward.

Body &#x60;{ weeks }&#x60; (1-12). While the owner&#39;s deed is delinquent rent is WAIVED (&#x60;waived: true&#x60;), never collected.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateSpatialPropertyLeaseRentResponse = apiInstance.createSpatialPropertyLeaseRent(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialPropertyLeaseRent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialPropertyLeaseRent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateSpatialPropertyLeaseRentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialPropertyListingBuy"></a>
# **createSpatialPropertyListingBuy**
> CreateSpatialPropertyListingBuyResponse createSpatialPropertyListingBuy(id)

Buy a plot on the resale market, in CBX.

Pays the asking price from your EARNED CBX to the seller (Crossly takes the 2% skim). The deed, its maintenance clock and any lease pass to you; your shop moves onto the plot if it is vacant. 409 if it has just sold.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateSpatialPropertyListingBuyResponse = apiInstance.createSpatialPropertyListingBuy(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialPropertyListingBuy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialPropertyListingBuy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateSpatialPropertyListingBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialPropertyListingCancel"></a>
# **createSpatialPropertyListingCancel**
> DeleteWorldJobShiftResponse createSpatialPropertyListingCancel(id)

Take your plot off the market.

Only a listing nobody is buying right now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteWorldJobShiftResponse = apiInstance.createSpatialPropertyListingCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialPropertyListingCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialPropertyListingCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteWorldJobShiftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialShopStaffPay"></a>
# **createSpatialShopStaffPay**
> CreateSpatialShopStaffPayResponse createSpatialShopStaffPay(grantId)

Pay a staff member&#39;s wage forward.

Body &#x60;{ weeks }&#x60; (1-4). Paid from your EARNED CBX to theirs. 403 while paying staff is not open.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val grantId : kotlin.String = grantId_example // kotlin.String | 
try {
    val result : CreateSpatialShopStaffPayResponse = apiInstance.createSpatialShopStaffPay(grantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialShopStaffPay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialShopStaffPay")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantId** | **kotlin.String**|  |

### Return type

**CreateSpatialShopStaffPayResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialStreetClaim"></a>
# **createSpatialStreetClaim**
> CreateSpatialStreetClaimResponse createSpatialStreetClaim(slug)

Put your shop on a street.

Seats your shop on the lowest vacant plot of an OPEN street and returns its &#x60;index&#x60; and &#x60;address&#x60;; calling it again returns the plot you already have. Your shop must be public (400 otherwise). A street that takes shops by application or invitation answers 400; a full street you do not own answers 409. Main Street grows instead of filling.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateSpatialStreetClaimResponse = apiInstance.createSpatialStreetClaim(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialStreetClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialStreetClaim")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateSpatialStreetClaimResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialStreetOwnedUpkeep"></a>
# **createSpatialStreetOwnedUpkeep**
> CreateSpatialStreetOwnedUpkeepResponse createSpatialStreetOwnedUpkeep(id)

Pay a street&#39;s upkeep forward.

Body &#x60;{ weeks }&#x60; (1-12). Extends &#x60;paidThrough&#x60; from the later of now and the current date.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateSpatialStreetOwnedUpkeepResponse = apiInstance.createSpatialStreetOwnedUpkeep(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialStreetOwnedUpkeep")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialStreetOwnedUpkeep")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateSpatialStreetOwnedUpkeepResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialStreetPlotBuy"></a>
# **createSpatialStreetPlotBuy**
> CreateSpatialStreetPlotBuyResponse createSpatialStreetPlotBuy(slug, number)

Buy a vacant plot from Crossly, in CBX.

Pays the quoted price from your EARNED CBX at spot and moves your shop onto the plot. Includes the first weeks of maintenance. 409 if the plot is taken or was just bought; 403 while property is not open.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val number : kotlin.String = number_example // kotlin.String | 
try {
    val result : CreateSpatialStreetPlotBuyResponse = apiInstance.createSpatialStreetPlotBuy(slug, number)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialStreetPlotBuy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialStreetPlotBuy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **number** | **kotlin.String**|  |

### Return type

**CreateSpatialStreetPlotBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialStreetRequest"></a>
# **createSpatialStreetRequest**
> SpatialStreetResponse createSpatialStreetRequest()

Ask to found a street.

Body &#x60;{ name, slug?, admission? }&#x60;. Free: the name (3-32 letters, numbers, spaces and &#39; &amp; . -) and its web address (derived from the name when omitted) are held for Crossly&#39;s review. Crossly&#39;s own streets and room addresses are never available. You need a public shop, and hold one street at most. 409 when the address is taken or you already hold one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : SpatialStreetResponse = apiInstance.createSpatialStreetRequest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialStreetRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialStreetRequest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**SpatialStreetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialStreetRequestFound"></a>
# **createSpatialStreetRequestFound**
> SpatialStreetResponse createSpatialStreetRequestFound(id)

Found an approved street, in CBX.

Pays the founding premium from your EARNED CBX at spot and opens the street: its plots exist, the first weeks of upkeep are included, and your shop stands on it. 403 \&quot;CBX opens at mint\&quot; until the token is live; 409 before approval.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SpatialStreetResponse = apiInstance.createSpatialStreetRequestFound(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#createSpatialStreetRequestFound")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#createSpatialStreetRequestFound")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**SpatialStreetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInventory"></a>
# **deleteInventory**
> OkResponse deleteInventory(id)

Soft-archive an inventory item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteInventory(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#deleteInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#deleteInventory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSpatialStreetPlot"></a>
# **deleteSpatialStreetPlot**
> CreateWorldCrewLeaveResponse deleteSpatialStreetPlot(slug)

Take your shop off a street.

The plot goes vacant and its address may be taken by another shop. &#x60;left: false&#x60; when your shop was not on it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateWorldCrewLeaveResponse = apiInstance.deleteSpatialStreetPlot(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#deleteSpatialStreetPlot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#deleteSpatialStreetPlot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateWorldCrewLeaveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGameLeaderboard"></a>
# **getGameLeaderboard**
> GetGameLeaderboardResponse getGameLeaderboard()

Game leaderboards: for each of Price Guess (wins, then points), scavenger hunts (finished) and speed trades (won), the top ten this week (Monday 00:00 UTC on) under week and of all time under all -- rank, name, named, value and, for Price Guess, score. A name appears only for somebody who chose to be seen by name in Crossly World; everyone else is \&quot;A player\&quot; in their place.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetGameLeaderboardResponse = apiInstance.getGameLeaderboard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getGameLeaderboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getGameLeaderboard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetGameLeaderboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHome"></a>
# **getHome**
> GetHomeResponse getHome(slug)

A home by its address, as you may see it: open homes to anybody, friends-only homes to mutual follows, locked homes to their owner. 404 when you may not enter.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetHomeResponse = apiInstance.getHome(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getHome")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getHome")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetHomeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHomeMine"></a>
# **getHomeMine**
> GetHomeResponse getHomeMine()

Your Crossly World home: its address, privacy (open / friends / locked), theme, the room, the layout (each piece with what it shows -- things you no longer own are left out at read time) and the guestbook. Made on first read.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetHomeResponse = apiInstance.getHomeMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getHomeMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getHomeMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetHomeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventory"></a>
# **getInventory**
> GetInventoryResponse getInventory(id)

Get one inventory item with platform listings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetInventoryResponse = apiInstance.getInventory(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getInventory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetInventoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryAging"></a>
# **getInventoryAging**
> GetInventoryAgingResponse getInventoryAging()

Unsold stock by age (0-7, 7-30, 30-90, 90+ days, unlisted), each bucket with a recommendation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetInventoryAgingResponse = apiInstance.getInventoryAging()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getInventoryAging")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getInventoryAging")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetInventoryAgingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryCatalogMatch"></a>
# **getInventoryCatalogMatch**
> GetInventoryCatalogMatchResponse getInventoryCatalogMatch(id)

One inventory item&#39;s catalog binding (if confirmed) and its pending match suggestions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetInventoryCatalogMatchResponse = apiInstance.getInventoryCatalogMatch(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getInventoryCatalogMatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getInventoryCatalogMatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetInventoryCatalogMatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryFacet"></a>
# **getInventoryFacet**
> GetListingFacetResponse getInventoryFacet()

Distinct brands + categories across this user&#39;s inventory.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetListingFacetResponse = apiInstance.getInventoryFacet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getInventoryFacet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getInventoryFacet")
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

<a name="getInventoryLabel"></a>
# **getInventoryLabel**
> GetInventoryLabelResponse getInventoryLabel()

List every distinct label across this user&#39;s inventory.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetInventoryLabelResponse = apiInstance.getInventoryLabel()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getInventoryLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getInventoryLabel")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetInventoryLabelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryLabelStat"></a>
# **getInventoryLabelStat**
> GetInventoryLabelStatResponse getInventoryLabelStat()

List distinct labels with usage counts + colors.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetInventoryLabelStatResponse = apiInstance.getInventoryLabelStat()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getInventoryLabelStat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getInventoryLabelStat")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetInventoryLabelStatResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventorySellThrough"></a>
# **getInventorySellThrough**
> GetInventorySellThroughResponse getInventorySellThrough()

Cohort sell-through for a window (default: the 30 days ending 30 days ago) against the previous window of the same length.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetInventorySellThroughResponse = apiInstance.getInventorySellThrough()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getInventorySellThrough")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getInventorySellThrough")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetInventorySellThroughResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventorySkuExist"></a>
# **getInventorySkuExist**
> GetListingSkuExistResponse getInventorySkuExist(sku)

Check whether a SKU is already in use on this user&#39;s inventory.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val sku : kotlin.String = sku_example // kotlin.String | 
try {
    val result : GetListingSkuExistResponse = apiInstance.getInventorySkuExist(sku)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getInventorySkuExist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getInventorySkuExist")
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

<a name="getInventoryValueHistory"></a>
# **getInventoryValueHistory**
> GetInventoryValueHistoryResponse getInventoryValueHistory()

Portfolio value of unsold stock over time, oldest first (one point per nightly snapshot).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetInventoryValueHistoryResponse = apiInstance.getInventoryValueHistory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getInventoryValueHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getInventoryValueHistory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetInventoryValueHistoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMainStage"></a>
# **getMainStage**
> GetMainStageResponse getMainStage()

The Crossly World Main Stage right now: the live show (title, kind, host lineup), the stream on its big screen while a lineup host is on air, how many people are there (it holds 64 per copy and opens copies as it fills) and what is on next.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetMainStageResponse = apiInstance.getMainStage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getMainStage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getMainStage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetMainStageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPetMine"></a>
# **getPetMine**
> GetPetMineResponse getPetMine()

Your Crossly World pets: every kind (cat, dog, slab bot) with whether you own it, when it was earned and the ways to earn it (a quest or a reputation level -- pets are never sold), plus the pet walking beside you and the one greeting visitors at your shop door.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetPetMineResponse = apiInstance.getPetMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getPetMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getPetMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetPetMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReputation"></a>
# **getReputation**
> GetReputationResponse getReputation(profile)

Somebody&#39;s public reputation levels by their storefront handle: the level on each track and their nameplate badge. 404 for an unknown handle.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val profile : kotlin.String = profile_example // kotlin.String | 
try {
    val result : GetReputationResponse = apiInstance.getReputation(profile)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getReputation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getReputation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profile** | **kotlin.String**|  |

### Return type

**GetReputationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReputationMine"></a>
# **getReputationMine**
> GetReputationMineResponse getReputationMine()

Your Crossly World reputation: four tracks (trader, collector, seller, host) with points, level, what each level has unlocked and the next unlock, and how the points were earned (recency-weighted; a lost dispute or a failed authentication costs points). Earned from real activity only; nothing buys a level.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetReputationMineResponse = apiInstance.getReputationMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getReputationMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getReputationMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetReputationMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialAddress"></a>
# **getSpatialAddress**
> GetSpatialAddressResponse getSpatialAddress(street, number)

The shop at an address.

Resolves &#x60;&lt;street&gt;/&lt;number&gt;&#x60; to the shop&#39;s &#x60;publicSlug&#x60; and &#x60;name&#x60;. 404 when the plot is vacant or its shop is not public.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val street : kotlin.String = street_example // kotlin.String | 
val number : kotlin.String = number_example // kotlin.String | 
try {
    val result : GetSpatialAddressResponse = apiInstance.getSpatialAddress(street, number)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialAddress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **street** | **kotlin.String**|  |
 **number** | **kotlin.String**|  |

### Return type

**GetSpatialAddressResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialAuctionPublic"></a>
# **getSpatialAuctionPublic**
> GetSpatialAuctionPublicResponse getSpatialAuctionPublic(slug)

A shared saleroom, opened by its public share handle.

The bridge between the public room directory and this auction surface: /api/v1/spatial/public hands out SLUGS, while everything else here is keyed by scene id, and the two are deliberately not interchangeable. Resolves &#x60;public&#x60; rooms ONLY — an &#x60;unlisted&#x60; room is a bearer link, and crowd-shaped features stay off in those — so a slug that works on /api/v1/spatial/public/{slug} may still answer 404 here. The reply carries the &#x60;sceneId&#x60; you then pass to the room state, lots and bid endpoints. Same reading rules as the room state: amounts in CENTS, &#x60;minimumNextBidCents&#x60; rather than your own arithmetic, no reserve amount.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetSpatialAuctionPublicResponse = apiInstance.getSpatialAuctionPublic(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialAuctionPublic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialAuctionPublic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetSpatialAuctionPublicResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialAuctionRoom"></a>
# **getSpatialAuctionRoom**
> GetSpatialAuctionRoomResponse getSpatialAuctionRoom(sceneId)

What the rostrum says in this room, right now.

Serves whoever may ENTER the room, not only its owner — a saleroom restricted to the host would leave every visitor polling a 404 while standing in it. &#x60;hosting: false&#x60; with a null &#x60;auction&#x60; is a described empty answer, not an error. READ &#x60;currentLot.minimumNextBidCents&#x60;, never &#x60;currentBidCents + bidIncrementCents&#x60;: the first bid on a lot is floored at the START price rather than start + step, so deriving it locally raises the entry price on any lot with a real increment. All amounts are CENTS. &#x60;reserveMet&#x60; says whether the seller&#39;s floor has been cleared; the floor ITSELF is never published, because a crowd that can read it bids to it and stops. &#x60;serverTime&#x60; is this server&#39;s clock, handed over so you can age the session without trusting your own — there is no per-lot deadline to report, because a lot closes when a human drops the hammer and not when a timer expires. A room you may not enter answers 404, the same as one that does not exist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val sceneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetSpatialAuctionRoomResponse = apiInstance.getSpatialAuctionRoom(sceneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialAuctionRoom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialAuctionRoom")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **java.util.UUID**|  |

### Return type

**GetSpatialAuctionRoomResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialEmote"></a>
# **getSpatialEmote**
> GetSpatialEmoteResponse getSpatialEmote()

Your Crossly World emotes: every emote pack (unlocked or not, with the quest that unlocks it), your 8-slot emote wheel as stored and as it shows (labels, locks, ready dots), and the moments earned and not yet played.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetSpatialEmoteResponse = apiInstance.getSpatialEmote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialEmote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialEmote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSpatialEmoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialEmployeeConfig"></a>
# **getSpatialEmployeeConfig**
> GetSpatialEmployeeConfigResponse getSpatialEmployeeConfig(sceneId)

How the shop employee in one of your rooms is configured.

Owner-only, and 404 for a room this account does not own — the same answer a room that does not exist gives, so this cannot be used to discover scene ids. &#x60;config: null&#x60; means the room has never had an employee configured, which is different from one that exists and is switched off (&#x60;enabled: false&#x60;). THE SIGNING SECRET IS NEVER RETURNED, here or anywhere else. It is encrypted at rest and handed back in plaintext exactly once, in the response to the PUT that minted it; &#x60;hasAgentSecret&#x60; is the only thing any read path will say about it, and re-reading it is impossible by construction rather than by omission. &#x60;suspendedAt&#x60; non-null means the employee is off the floor because a charge was refused — &#x60;suspendedReason&#x60; says which — and saving the config again clears it. &#x60;brainKind&#x60; is idle (stands there), rules (the list in &#x60;rules&#x60;, evaluated in order, first match wins) or agent (your own endpoint decides).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val sceneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetSpatialEmployeeConfigResponse = apiInstance.getSpatialEmployeeConfig(sceneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialEmployeeConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialEmployeeConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **java.util.UUID**|  |

### Return type

**GetSpatialEmployeeConfigResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialParty"></a>
# **getSpatialParty**
> GetSpatialPartyResponse getSpatialParty()

Your Crossly World party: party is null when you are in none, else its id, leader and up to 8 members (each with the place and copy they are in right now, or null), plus the invites it has out. invites lists the invites waiting for you.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetSpatialPartyResponse = apiInstance.getSpatialParty()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialParty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialParty")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSpatialPartyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialProperty"></a>
# **getSpatialProperty**
> GetSpatialPropertyResponse getSpatialProperty()

Your plots and tenancies.

Each deed with its address, price, weekly maintenance, &#x60;paidThrough&#x60;, &#x60;status&#x60; (active, grace, delinquent — a delinquent owner cannot collect rent; past three weeks late a deed is foreclosed) and any lease; plus the leases you rent as a tenant.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetSpatialPropertyResponse = apiInstance.getSpatialProperty()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialProperty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialProperty")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSpatialPropertyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialPublic"></a>
# **getSpatialPublic**
> GetSpatialPublicResponse getSpatialPublic(slug)

A shared room, as a visitor sees it.

The room behind a share link: container geometry in METRES matching the real physical object, the solved arrangement, and one row per object on the shelves. REDACTED relative to the owner&#39;s view — no cost, no storage location, no listing status — so do not expect the fields /v1/spatial/scenes/{id} returns. Each placement carries &#x60;pinned&#x60;: true means a HUMAN put it there and it will not move; false means a layout SOLVER chose, and it may choose differently once the stock changes, so an unpinned placement is never a statement about where something physically is. &#x60;solved.overflow&#x60; lists what did not fit — a non-empty array means the room is INCOMPLETE and &#x60;stats.itemCount&#x60; exceeds what is on screen. Resolves rooms shared as &#x60;unlisted&#x60; as well as &#x60;public&#x60;: holding the link is the permission.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetSpatialPublicResponse = apiInstance.getSpatialPublic(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialPublic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialPublic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetSpatialPublicResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialScene"></a>
# **getSpatialScene**
> GetSpatialSceneResponse getSpatialScene(id)

A solved room: every item, where it sits, and why.

Returns the space profile (container geometry in METRES, matching the real physical object), the solved placements, and the items. Placements carry a &#x60;pinned&#x60; flag: true means a human put it there and the layout solver will not move it; false means the solver chose, and it may choose differently once the stock changes. &#x60;overflow&#x60; lists anything that did not fit — it is reported, never silently dropped.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetSpatialSceneResponse = apiInstance.getSpatialScene(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialScene")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialScene")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetSpatialSceneResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialSceneWarehouse"></a>
# **getSpatialSceneWarehouse**
> GetSpatialSceneWarehouseResponse getSpatialSceneWarehouse(id)

A warehouse room: your racks, where they stand, and what is on each.

For a room of kind &#x60;warehouse&#x60;. Racks are your own storage units (pallet racks, shelving, garment rails, floor totes) with their location &#x60;code&#x60; (the one written to each item&#39;s storage location when stock is placed), a floor position in METRES, and &#x60;capacity&#x60; / &#x60;stocked&#x60; / &#x60;fill&#x60;. &#x60;positioned: false&#x60; means you never stood the rack anywhere and it was laid out for you. Each rack lists the items on it with the full code of the level or bin they sit in. A non-warehouse room is a 400.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetSpatialSceneWarehouseResponse = apiInstance.getSpatialSceneWarehouse(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialSceneWarehouse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialSceneWarehouse")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetSpatialSceneWarehouseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialShopStaff"></a>
# **getSpatialShopStaff**
> GetSpatialShopStaffResponse getSpatialShopStaff()

Your shop&#39;s staff and their wages.

Staff are people holding a &#x60;staff&#x60; grant on your shop (invite them through the room-sharing flow). They may arrange the shop and move its stock, nothing else. &#x60;wageWeeklyCents&#x60; is paid by you in CBX; &#x60;pending&#x60; is an invite not yet accepted.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetSpatialShopStaffResponse = apiInstance.getSpatialShopStaff()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialShopStaff")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialShopStaff")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSpatialShopStaffResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialStreet"></a>
# **getSpatialStreet**
> GetSpatialStreetResponse getSpatialStreet(slug)

A street: every plot and the shop open on each.

Plots in order from the entrance. Each has its &#x60;index&#x60; (0-based), house &#x60;number&#x60; (1-based), &#x60;address&#x60; (&#x60;&lt;street&gt;/&lt;number&gt;&#x60;, stable for as long as the shop stands there) and &#x60;label&#x60; (\&quot;12 Main Street\&quot;). &#x60;shop&#x60; is the open shop&#39;s directory entry, or null for a vacant plot; &#x60;shuttered: true&#x60; is a plot whose shop is not public right now — it keeps its address. &#x60;reserved&#x60; plots are newcomer plots: occupiable, never sold or leased. Each open shop&#39;s plot carries &#x60;life&#x60;: &#x60;soldToday&#x60; (the seller&#39;s sales today, America/New_York) and &#x60;window&#x60; (up to three live listings: listingId, slug, title, priceCents, imageUrl). The street carries &#x60;life.billboards&#x60; (promoted listings, paid per sale, then Crossly house ads) and &#x60;life.buskers&#x60; (shop owners on it who are live now).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetSpatialStreetResponse = apiInstance.getSpatialStreet(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialStreet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialStreet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetSpatialStreetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialStreetFounding"></a>
# **getSpatialStreetFounding**
> GetSpatialStreetFoundingResponse getSpatialStreetFounding()

What founding a street costs.

The founding premium &#x60;priceCents&#x60; (paid in CBX at spot, from EARNED balance), weekly upkeep &#x60;maintenanceWeeklyCents&#x60;, &#x60;includedWeeks&#x60; of upkeep included, &#x60;plots&#x60; on a founded street, &#x60;maxPerOwner&#x60;, the &#x60;admissions&#x60; an owner may pick (open | apply | invite), &#x60;cbx&#x60; {open, reason} -- closed until mint -- and, for the token owner, &#x60;refusal&#x60;: why they cannot ask yet (no public shop, already holding a street), or null.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetSpatialStreetFoundingResponse = apiInstance.getSpatialStreetFounding()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialStreetFounding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialStreetFounding")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSpatialStreetFoundingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialStreetPlotQuote"></a>
# **getSpatialStreetPlotQuote**
> GetSpatialStreetPlotQuoteResponse getSpatialStreetPlotQuote(slug, number)

What a plot costs.

Price in CENTS (paid in CBX at spot), weekly maintenance in cents, weeks included with a purchase, and whether it can be bought now. Newcomer plots (1-2) are never sold.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val number : kotlin.String = number_example // kotlin.String | 
try {
    val result : GetSpatialStreetPlotQuoteResponse = apiInstance.getSpatialStreetPlotQuote(slug, number)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getSpatialStreetPlotQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getSpatialStreetPlotQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **number** | **kotlin.String**|  |

### Return type

**GetSpatialStreetPlotQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldRoomFunnel"></a>
# **getWorldRoomFunnel**
> GetWorldRoomFunnelResponse getWorldRoomFunnel(sceneId, days)

Your room&#39;s funnel over the last &#x60;days&#x60; (1-35, default 30): visitors (people, once a day), looks, items opened, checkouts started from the room, paid sales and revenueCents. Sales count only lines the room itself put in a cart.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val sceneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val days : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : GetWorldRoomFunnelResponse = apiInstance.getWorldRoomFunnel(sceneId, days)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getWorldRoomFunnel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getWorldRoomFunnel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **java.util.UUID**|  |
 **days** | **kotlin.Int**|  | [optional]

### Return type

**GetWorldRoomFunnelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldShelf"></a>
# **getWorldShelf**
> GetWorldShelfResponse getWorldShelf(listingSlug)

Where a Crossly listing sits on a shelf in a public room right now (roomSlug, roomName, itemId), or data:null when it is in no room.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val listingSlug : kotlin.String = listingSlug_example // kotlin.String | 
try {
    val result : GetWorldShelfResponse = apiInstance.getWorldShelf(listingSlug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getWorldShelf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getWorldShelf")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listingSlug** | **kotlin.String**|  |

### Return type

**GetWorldShelfResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldSkusCheapest"></a>
# **getWorldSkusCheapest**
> GetWorldSkusCheapestResponse getWorldSkusCheapest(skuId)

The cheapest copy of a catalogue piece for sale on Crossly now, matched by the catalogue id (listingSlug, priceCents, and the room and item when it stands on a shelf), or data:null.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val skuId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetWorldSkusCheapestResponse = apiInstance.getWorldSkusCheapest(skuId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getWorldSkusCheapest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getWorldSkusCheapest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skuId** | **java.util.UUID**|  |

### Return type

**GetWorldSkusCheapestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCatalogMatches"></a>
# **listCatalogMatches**
> ListCatalogMatchesResponse listCatalogMatches(limit, before)

Pending catalog-match suggestions: inventory items that look like a catalog product, awaiting your confirm.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Keyset cursor: createdAt of the last row seen.
try {
    val result : ListCatalogMatchesResponse = apiInstance.listCatalogMatches(limit, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listCatalogMatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listCatalogMatches")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional]
 **before** | **java.time.OffsetDateTime**| Keyset cursor: createdAt of the last row seen. | [optional]

### Return type

**ListCatalogMatchesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFestivals"></a>
# **listFestivals**
> ListFestivalsResponse listFestivals()

Live and upcoming Crossly World festivals, soonest first: a weekend when every street wears one decor and the festival quest line (limited pins) counts. meta.live is the festival on now, if any.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListFestivalsResponse = apiInstance.listFestivals()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listFestivals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listFestivals")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListFestivalsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listGameBreakUpcoming"></a>
# **listGameBreakUpcoming**
> ListGameBreakUpcomingResponse listGameBreakUpcoming()

Pack breaks staged on shop stages in Crossly World, live first then soonest: the break, its shop, start time, spots (taken or not, buyer masked), hits revealed so far, and buyUrl -- the break&#39;s page on crossly.net, the only place a spot is bought (null once every spot has sold).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListGameBreakUpcomingResponse = apiInstance.listGameBreakUpcoming()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listGameBreakUpcoming")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listGameBreakUpcoming")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListGameBreakUpcomingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listGameHunts"></a>
# **listGameHunts**
> ListGameHuntsResponse listGameHunts(place)

Scavenger hunts running now in Crossly World shops and pop-up stalls, ending soonest first: title, shop (name and slug -- for a hunt at a stall, the street slug, with stall.bookingId set), how many tokens, what finishing unlocks (\&quot;10% off\&quot; -- never the code), when it ends and how many people have finished. Optional place filters to one shop or street slug.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val place : kotlin.String = place_example // kotlin.String | 
try {
    val result : ListGameHuntsResponse = apiInstance.listGameHunts(place)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listGameHunts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listGameHunts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **place** | **kotlin.String**|  | [optional]

### Return type

**ListGameHuntsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listGameResultMine"></a>
# **listGameResultMine**
> ListGameResultMineResponse listGameResultMine()

Your market-game results, newest first: game (price_guess, price_guess_solo, hunt, speed_trade, break_host), the round/hunt/trade/break id, score, whether you won, Bucks prize in cents (0 while prizes are pins only) and detail. meta.unlocks lists the hunt coupons you earned (with their codes); meta.hits the break hits pulled for spots you bought, with the order each ships with.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListGameResultMineResponse = apiInstance.listGameResultMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listGameResultMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listGameResultMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListGameResultMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listHomeMineBuilders"></a>
# **listHomeMineBuilders**
> ListHomeMineBuildersResponse listHomeMineBuilders()

Your co-builders: friends you let rearrange your home in the world (move, turn, take out your things, add free furniture; never your bought pieces). Each: userId, name, friends (false once the friendship ended: listed but powerless).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListHomeMineBuildersResponse = apiInstance.listHomeMineBuilders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listHomeMineBuilders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listHomeMineBuilders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListHomeMineBuildersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listHomeOfTheWeek"></a>
# **listHomeOfTheWeek**
> ListHomeOfTheWeekResponse listHomeOfTheWeek()

Home of the week: open homes by how many different people signed their guestbook in the last 7 days, most first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListHomeOfTheWeekResponse = apiInstance.listHomeOfTheWeek()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listHomeOfTheWeek")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listHomeOfTheWeek")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListHomeOfTheWeekResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInventory"></a>
# **listInventory**
> ListInventoryResponse listInventory(page, limit, search, status, kind, platforms, platformMode)

List inventory items.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val search : kotlin.String = search_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
val kind : kotlin.String = kind_example // kotlin.String | Physical goods or Web3 assets (NFTs). Omit for both.
val platforms : kotlin.String = platforms_example // kotlin.String | Comma-separated marketplaces, e.g. \"ebay,vinted\". Items live (an active listing) on any of them.
val platformMode : kotlin.String = platformMode_example // kotlin.String | \"not_listed\" inverts `platforms`: items live on none of them. Default \"listed\".
try {
    val result : ListInventoryResponse = apiInstance.listInventory(page, limit, search, status, kind, platforms, platformMode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listInventory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional] [default to 1]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]
 **search** | **kotlin.String**|  | [optional]
 **status** | **kotlin.String**|  | [optional]
 **kind** | **kotlin.String**| Physical goods or Web3 assets (NFTs). Omit for both. | [optional] [enum: physical, web3]
 **platforms** | **kotlin.String**| Comma-separated marketplaces, e.g. \&quot;ebay,vinted\&quot;. Items live (an active listing) on any of them. | [optional]
 **platformMode** | **kotlin.String**| \&quot;not_listed\&quot; inverts &#x60;platforms&#x60;: items live on none of them. Default \&quot;listed\&quot;. | [optional] [enum: listed, not_listed]

### Return type

**ListInventoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInventoryActivity"></a>
# **listInventoryActivity**
> ListInventoryActivityResponse listInventoryActivity(id, limit)

Activity log for an inventory item (created/sold/edited/etc.).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListInventoryActivityResponse = apiInstance.listInventoryActivity(id, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listInventoryActivity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listInventoryActivity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **limit** | **kotlin.Int**|  | [optional] [default to 50]

### Return type

**ListInventoryActivityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInventoryIds"></a>
# **listInventoryIds**
> ListListingIdsResponse listInventoryIds()

Filter inventory → return matching id list.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListListingIdsResponse = apiInstance.listInventoryIds()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listInventoryIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listInventoryIds")
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

<a name="listInventoryUnits"></a>
# **listInventoryUnits**
> ListInventoryUnitsResponse listInventoryUnits(id)

List the individually identified units of an inventory item.

Each identifier carries a &#x60;strength&#x60; describing what it proves: &#x60;strong&#x60; was recorded before the item sold, &#x60;good&#x60; at packing, &#x60;weak&#x60; only after it shipped. The grade is derived from when it was recorded, never from the value itself.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListInventoryUnitsResponse = apiInstance.listInventoryUnits(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listInventoryUnits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listInventoryUnits")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListInventoryUnitsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listJobAppraisals"></a>
# **listJobAppraisals**
> ListJobAppraisalsResponse listJobAppraisals(category, limit)

Open price checks appraisers can answer (Collector level 3+ holding 3+ pieces in the category), newest first, optionally one market category. Each has its bounty; meta.payOn says whether bounties are paid yet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val category : kotlin.String = category_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListJobAppraisalsResponse = apiInstance.listJobAppraisals(category, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listJobAppraisals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listJobAppraisals")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListJobAppraisalsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listJobShifts"></a>
# **listJobShifts**
> ListJobShiftsResponse listJobShifts(limit)

Open shifts on the Crossly World Jobs board, soonest first: shop staff shifts in boutiques and grading-desk helper shifts, each with its window, place and pay. meta.payOn says whether Crossly is paying jobs yet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListJobShiftsResponse = apiInstance.listJobShifts(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listJobShifts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listJobShifts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListJobShiftsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMainStageEvents"></a>
# **listMainStageEvents**
> ListMainStageEventsResponse listMainStageEvents()

Live and upcoming Main Stage events, soonest first: brand launches, creator meetups, talks, live sales and festival shows, each with its window and host lineup.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListMainStageEventsResponse = apiInstance.listMainStageEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listMainStageEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listMainStageEvents")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListMainStageEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialAuctionRoomLots"></a>
# **listSpatialAuctionRoomLots**
> ListSpatialAuctionRoomLotsResponse listSpatialAuctionRoomLots(sceneId)

The catalogue: every lot in the session this room is hosting.

In lot-number order, which is the order the auctioneer reaches them. Each row carries the same fields as the current lot — &#x60;minimumNextBidCents&#x60; is the figure the bid transaction evaluates against, and every amount is CENTS. A lot with a &#x60;hammerAt&#x60; has been sold and one with &#x60;skipped: true&#x60; failed its reserve; neither takes further bids. The reserve AMOUNT is absent by design and &#x60;reserveMet&#x60; is the only thing said about it. Which lot is UP is not derivable from this list — the auctioneer is the authority and may skip ahead — so take that from the room state endpoint rather than from the lowest open lot number. A room hosting nothing answers an empty list, not a 404: 404 here means the room does not exist or you may not enter it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val sceneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListSpatialAuctionRoomLotsResponse = apiInstance.listSpatialAuctionRoomLots(sceneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialAuctionRoomLots")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialAuctionRoomLots")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **java.util.UUID**|  |

### Return type

**ListSpatialAuctionRoomLotsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialAuctionRooms"></a>
# **listSpatialAuctionRooms**
> ListSpatialAuctionRoomsResponse listSpatialAuctionRooms()

Rooms of yours that are hosting an auction.

One row per room you OWN that currently has a live-auction session bound into it, with that session&#39;s title, status and schedule joined in so you do not have to fetch each one to find out whether anything is running. Empty is the ordinary answer: hosting nothing is the normal state of every room on the platform. This is deliberately not \&quot;rooms I could bid in\&quot; — that is the public directory at /api/v1/spatial/public, and enumerating every stranger&#39;s saleroom here would be a different endpoint wearing this one&#39;s name. &#x60;topics.auction&#x60; is the WebSocket topic the price moves on; &#x60;topics.room&#x60; is null until the room has been shared.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListSpatialAuctionRoomsResponse = apiInstance.listSpatialAuctionRooms()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialAuctionRooms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialAuctionRooms")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSpatialAuctionRoomsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialDeedListings"></a>
# **listSpatialDeedListings**
> ListSpatialDeedListingsResponse listSpatialDeedListings()

Plots for resale.

Live resale listings, cheapest first: address, &#x60;priceCents&#x60; (paid in CBX at spot), Crossly&#39;s &#x60;feeCents&#x60; (the 2% CBX skim), weekly maintenance, and the deed&#39;s &#x60;status&#x60; and &#x60;paidThrough&#x60; — a buyer inherits the maintenance clock. &#x60;?street&#x3D;&#x60; narrows to one street.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListSpatialDeedListingsResponse = apiInstance.listSpatialDeedListings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialDeedListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialDeedListings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSpatialDeedListingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialEmployeeSessions"></a>
# **listSpatialEmployeeSessions**
> ListSpatialEmployeeSessionsResponse listSpatialEmployeeSessions(since, until, sceneId, unpaidOnly, page, limit)

The itemised bill: one row per customer-conversation.

Newest first, filtered by &#x60;since&#x60;/&#x60;until&#x60; (ISO 8601, default 30 days, max 366) and optionally by &#x60;sceneId&#x60;. &#x60;unpaidOnly&#x60; narrows to the conversations that settled without payment. This is what makes a usage total checkable by hand: each row carries the interval it was priced from. &#x60;engagedMs&#x60; is SERVER-measured, from two timestamps this server wrote — no client reports its own duration anywhere in this feature — and it is null, not zero, while the conversation is still running. &#x60;settledAt&#x60; null with an &#x60;endedAt&#x60; set means billing has not yet run; &#x60;unpaidReason&#x60; set means it ran and moved nothing. Base units are STRINGS (64-bit integers). THE CUSTOMER IS NOT NAMED. Billing is per customer, but no row here carries a visitor identity — a bill is an account of what was spent, not a list of who walked in, and publishing the user ids of strangers through a seller API key is a different feature with a different consent question.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val since : kotlin.String = since_example // kotlin.String | 
val until : kotlin.String = until_example // kotlin.String | 
val sceneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val unpaidOnly : kotlin.Boolean = true // kotlin.Boolean | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListSpatialEmployeeSessionsResponse = apiInstance.listSpatialEmployeeSessions(since, until, sceneId, unpaidOnly, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialEmployeeSessions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialEmployeeSessions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **kotlin.String**|  | [optional]
 **until** | **kotlin.String**|  | [optional]
 **sceneId** | **java.util.UUID**|  | [optional]
 **unpaidOnly** | **kotlin.Boolean**|  | [optional] [default to false]
 **page** | **kotlin.Int**|  | [optional] [default to 1]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]

### Return type

**ListSpatialEmployeeSessionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialEmployeeUsage"></a>
# **listSpatialEmployeeUsage**
> ListSpatialEmployeeUsageResponse listSpatialEmployeeUsage(since, until, sceneId)

What your shop employees cost over a period, per room.

One row per room that had at least one conversation in the window; rooms with none are ABSENT rather than reported as zero. &#x60;since&#x60;/&#x60;until&#x60; are ISO 8601 and default to the last 30 days, and a window may span at most 366 days — longer is a 400, not a silently shortened period. Money: &#x60;billedCents&#x60; is COSM cents that were actually charged, and it is the figure to report. &#x60;burnBaseUnits&#x60; and &#x60;poolBaseUnits&#x60; are COSM base units as STRINGS because they are 64-bit integers — half the fee is destroyed and half moves to the employee-tax pool. &#x60;openConversations&#x60; are running right now: measured, not yet billed, and contributing 0 to every money field until they settle, so a total read mid-conversation is a floor rather than a final figure. &#x60;unpaidConversations&#x60; were settled WITHOUT payment — the seller was short of COSM or COSM is not live on this deployment — and each of those also suspended the employee in that room; they are not a debt and will never be retried. &#x60;meta.totals&#x60; is the same window summed in the database, not the sum of the rows. &#x60;meta.rate&#x60; restates the price so a figure can be checked by hand: billing is per STARTED minute, per CUSTOMER, only while somebody is engaged. An employee standing in an empty shop costs nothing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val since : kotlin.String = since_example // kotlin.String | 
val until : kotlin.String = until_example // kotlin.String | 
val sceneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListSpatialEmployeeUsageResponse = apiInstance.listSpatialEmployeeUsage(since, until, sceneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialEmployeeUsage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialEmployeeUsage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **kotlin.String**|  | [optional]
 **until** | **kotlin.String**|  | [optional]
 **sceneId** | **java.util.UUID**|  | [optional]

### Return type

**ListSpatialEmployeeUsageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialMoments"></a>
# **listSpatialMoments**
> ListSpatialMomentsResponse listSpatialMoments(limit, ready)

Your moment emotes, newest first: unbox (a Crossly purchase delivered), slab_flip (a card graded through Crossly Grading), handshake (a trade-table shake settled). Each plays once in a room; playedAt is null until then. ready&#x3D;true lists only the unplayed ones.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val ready : kotlin.String = ready_example // kotlin.String | 
try {
    val result : ListSpatialMomentsResponse = apiInstance.listSpatialMoments(limit, ready)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialMoments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialMoments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional]
 **ready** | **kotlin.String**|  | [optional] [enum: true, false]

### Return type

**ListSpatialMomentsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialPartyWishlist"></a>
# **listSpatialPartyWishlist**
> CreateWorldPartyWishlistResponse listSpatialPartyWishlist()

Your party&#39;s shared wishlist, newest first: each listing (title, price in cents, image, shop slug while it is live), who added it, and every member&#39;s thumb up or down with the totals. Empty when you are in no party.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateWorldPartyWishlistResponse = apiInstance.listSpatialPartyWishlist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialPartyWishlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialPartyWishlist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldPartyWishlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialPublic"></a>
# **listSpatialPublic**
> ListSpatialPublicResponse listSpatialPublic()

Public rooms anyone can walk into.

The directory behind world-hopping. A room becomes public when its owner shares it; this lists those, newest first, with enough to draw a doorway AND enough to choose one — name, slug, category, itemCount, up to four previewImages, forSaleCount, a priceFromCents/priceToCents band and updatedAt. The band is the cheapest and dearest thing for sale in the room, never a quote for one object: /api/public/spatial/{slug}/offers is the authority on that. Fetch the room itself from /api/public/spatial/{slug}. Rooms with no items are omitted: an empty room is not a destination.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListSpatialPublicResponse = apiInstance.listSpatialPublic()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialPublic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialPublic")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSpatialPublicResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialPublicOffers"></a>
# **listSpatialPublicOffers**
> ListSpatialPublicOffersResponse listSpatialPublicOffers(slug)

What is for sale in a shared room.

Price, stock, condition and grade for everything in the room its owner is actually selling. Correlate to the room by &#x60;itemId&#x60;, which is the SAME id the scene payload publishes per item — never by title. An item in the room with no row here is not for sale; an empty array means the owner is showing the collection rather than selling it, which is a different answer from a 404 (no such shared room). SEPARATE CALL ON PURPOSE: the room&#39;s geometry is stable for minutes, a price is not — it changes whenever the seller edits a listing. Re-read this before quoting, and do not cache a price alongside a cached room. &#x60;priceCents&#x60; is CENTS. &#x60;available&#x60; is remaining stock, or null when the listing declares none; null is unknown, not zero. Where an item sits inside more than one active listing, the offer quoted is the one for that item alone rather than a bundle it belongs to.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListSpatialPublicOffersResponse = apiInstance.listSpatialPublicOffers(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialPublicOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialPublicOffers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListSpatialPublicOffersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialSceneMovements"></a>
# **listSpatialSceneMovements**
> ListSpatialSceneMovementsResponse listSpatialSceneMovements(id)

Stock movements in a room over a time window.

One row per physical transition: which item, from which node, to which node, when, and of what kind (placed/moved/picked/shipped/received/removed). Nodes are referenced by id; the &#x60;fromCode&#x60;/&#x60;toCode&#x60; strings are display snapshots of the location code AT THE TIME and are not stable identifiers — correlate on the node ids. &#x60;since&#x60;/&#x60;until&#x60; are ISO timestamps, defaulting to the last seven days and clamped to 90. Movements are NOT attributed to individual team members on this surface: a token has no team role, so there is no honest way to decide whether its holder may see who did the work.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListSpatialSceneMovementsResponse = apiInstance.listSpatialSceneMovements(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialSceneMovements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialSceneMovements")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListSpatialSceneMovementsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialScenes"></a>
# **listSpatialScenes**
> ListSpatialScenesResponse listSpatialScenes()

The rooms this account has.

The seller&#39;s ONE shop (kind &#x60;shop&#x60;, every display in one boutique) and their warehouse. Both are created on first read rather than requiring setup, so this call is safe to treat as the entry point. Older per-category rooms may also be listed as kind &#x60;collection&#x60;; they are no longer created or shown to visitors.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListSpatialScenesResponse = apiInstance.listSpatialScenes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialScenes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialScenes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSpatialScenesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialShopAddresses"></a>
# **listSpatialShopAddresses**
> ListSpatialShopAddressesResponse listSpatialShopAddresses()

Your shop&#39;s addresses.

One per street your shop stands on, Main Street first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListSpatialShopAddressesResponse = apiInstance.listSpatialShopAddresses()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialShopAddresses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialShopAddresses")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSpatialShopAddressesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialStaffing"></a>
# **listSpatialStaffing**
> ListSpatialStaffingResponse listSpatialStaffing()

Shops you work in.

Each shop you hold a live staff grant on, with your wage.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListSpatialStaffingResponse = apiInstance.listSpatialStaffing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialStaffing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialStaffing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSpatialStaffingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialStreetMine"></a>
# **listSpatialStreetMine**
> ListSpatialStreetMineResponse listSpatialStreetMine()

Your streets.

Streets you hold or asked to found, newest first: &#x60;status&#x60; (pending review, approved, founding, active, dormant, rejected, released), &#x60;upkeep&#x60; (active, grace, delinquent -- a delinquent owner collects no stall rent; three weeks late the street is foreclosed and closed), &#x60;paidThrough&#x60;, &#x60;admission&#x60;, &#x60;occupied&#x60; of &#x60;plotCount&#x60;, &#x60;pendingApplications&#x60;, and Crossly&#39;s &#x60;reviewNote&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListSpatialStreetMineResponse = apiInstance.listSpatialStreetMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialStreetMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialStreetMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSpatialStreetMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialStreets"></a>
# **listSpatialStreets**
> ListSpatialStreetsResponse listSpatialStreets()

Every street in the world.

Active streets with &#x60;plotCount&#x60; and how many plots are &#x60;occupied&#x60;. &#x60;platform: true&#x60; is Crossly&#39;s own street (Main Street), where every public shop has a plot.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListSpatialStreetsResponse = apiInstance.listSpatialStreets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listSpatialStreets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listSpatialStreets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSpatialStreetsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldBlocks"></a>
# **listWorldBlocks**
> ListWorldBlocksResponse listWorldBlocks()

The people you blocked in Crossly World, as you saw them (label, never the account behind a pseudonym), oldest first. Blocks are made in a room, on the person.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : ListWorldBlocksResponse = apiInstance.listWorldBlocks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listWorldBlocks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listWorldBlocks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldBlocksResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldItemSearch"></a>
# **listWorldItemSearch**
> ListWorldItemSearchResponse listWorldItemSearch(q)

Find an item on a shelf anywhere in Crossly World: what public rooms have for sale now, by title or catalogue name (q, 2+ characters). Each hit names the room (roomSlug) and the item (itemId); /c/&lt;roomSlug&gt;?item&#x3D;&lt;itemId&gt; opens it there.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val q : kotlin.String = q_example // kotlin.String | 
try {
    val result : ListWorldItemSearchResponse = apiInstance.listWorldItemSearch(q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listWorldItemSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listWorldItemSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**|  | [optional]

### Return type

**ListWorldItemSearchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldRoomWants"></a>
# **listWorldRoomWants**
> ListWorldRoomWantsResponse listWorldRoomWants(sceneId)

Items your room shows but does not sell that visitors said they would buy (\&quot;I&#39;d buy this\&quot;), most wanted first: itemId and how many people.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val sceneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListWorldRoomWantsResponse = apiInstance.listWorldRoomWants(sceneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#listWorldRoomWants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#listWorldRoomWants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **java.util.UUID**|  |

### Return type

**ListWorldRoomWantsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInventory"></a>
# **updateInventory**
> CreateInventoryResponse updateInventory(id)

Update an inventory item (partial).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateInventoryResponse = apiInstance.updateInventory(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#updateInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#updateInventory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateInventoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpatialEmployeeConfig"></a>
# **updateSpatialEmployeeConfig**
> UpdateSpatialEmployeeConfigResponse updateSpatialEmployeeConfig()

Create or replace the shop employee in one of your rooms.

A full replace, not a patch: every field is written from this body, so read GET /api/v1/spatial/employee/config first and send it back changed. Owner-only — a room this account does not own answers 404, the same as one that does not exist. &#x60;brainKind&#x60; is idle (stands there), rules (&#x60;rules&#x60; evaluated in order, first match wins, max 12) or agent (your endpoint decides, and an endpoint URL is then required). A rule is &#x60;{ when, afterSeconds?, do: { act, line?, offerId?, itemId? } }&#x60;; &#x60;when&#x60; and &#x60;do.act&#x60; must come from the published vocabularies and anything else is a 400. NOTHING IN A RULE CARRIES A PRICE — &#x60;do.offerId&#x60; is a key into your own offers and the server prices it, so an employee can propose a discount it cannot grant. &#x60;displayName&#x60; and &#x60;do.line&#x60; must be printable ASCII: they are drawn in the room from a fixed glyph atlas and anything else renders as a floating box, so they are refused rather than silently rewritten. &#x60;agentEndpointUrl&#x60; is resolved and validated before it is stored — a public-looking hostname that answers with a private address is refused here rather than accepted and then never called. THE SIGNING SECRET IS RETURNED AT MOST ONCE, in the response that MINTS it: when you pass &#x60;rotateSecret: true&#x60;, or when you set an agent endpoint on a room that had no secret. Store it then — there is no read path that will ever return it again, and &#x60;hasAgentSecret&#x60; is all any GET will say. Send an Idempotency-Key if you might retry a rotation: without one, a retried rotate mints a SECOND secret and invalidates the one you just received. Saving anything also CLEARS a suspension — if the employee was paused for want of COSM it is back on the floor, and will be paused again by the next refused charge. Note what this endpoint cannot do: it cannot start a conversation. Engagements are emitted by the room as it is drawn, and they are what costs money.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : UpdateSpatialEmployeeConfigResponse = apiInstance.updateSpatialEmployeeConfig()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#updateSpatialEmployeeConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#updateSpatialEmployeeConfig")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateSpatialEmployeeConfigResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpatialShopStaffWage"></a>
# **updateSpatialShopStaffWage**
> UpdateSpatialShopStaffWageResponse updateSpatialShopStaffWage(grantId)

Set a staff member&#39;s weekly wage.

Body &#x60;{ wageWeeklyCents }&#x60; ($1-$2,000), or null to clear it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val grantId : kotlin.String = grantId_example // kotlin.String | 
try {
    val result : UpdateSpatialShopStaffWageResponse = apiInstance.updateSpatialShopStaffWage(grantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#updateSpatialShopStaffWage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#updateSpatialShopStaffWage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantId** | **kotlin.String**|  |

### Return type

**UpdateSpatialShopStaffWageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

