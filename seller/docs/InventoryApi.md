# InventoryApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInventory**](InventoryApi.md#createInventory) | **POST** /v1/inventory | Create a new inventory item.
[**createInventoryBulkArchive**](InventoryApi.md#createInventoryBulkArchive) | **POST** /v1/inventory/bulk-archive | Bulk archive inventory items (soft).
[**createInventoryBulkDelete**](InventoryApi.md#createInventoryBulkDelete) | **POST** /v1/inventory/bulk-delete | Bulk delete inventory items (delinks listings).
[**createInventoryBulkLabel**](InventoryApi.md#createInventoryBulkLabel) | **POST** /v1/inventory/bulk-labels | Bulk add/remove labels on inventory items.
[**createInventoryBulkQuantity**](InventoryApi.md#createInventoryBulkQuantity) | **POST** /v1/inventory/bulk-quantity | Set / add / subtract stock across many items, syncing live listings.
[**createInventoryCsvExport**](InventoryApi.md#createInventoryCsvExport) | **POST** /v1/inventory/csv/export | Export inventory as CSV. Round-trips back through csv/import.
[**createInventoryCsvImport**](InventoryApi.md#createInventoryCsvImport) | **POST** /v1/inventory/csv/import | Import a CSV. Rows whose sku matches an existing item update it; others are added. Pass dryRun to preview.
[**createInventoryLabelRename**](InventoryApi.md#createInventoryLabelRename) | **POST** /v1/inventory/labels/rename | Rename a label across every inventory item.
[**createInventoryUnitIdentifier**](InventoryApi.md#createInventoryUnitIdentifier) | **POST** /v1/inventory/{id}/units/identifiers | Record a serial, IMEI, or licence key against an inventory item.
[**createInventoryUnitLookup**](InventoryApi.md#createInventoryUnitLookup) | **POST** /v1/inventory/units/lookup | Find a unit by identifier.
[**deleteInventory**](InventoryApi.md#deleteInventory) | **DELETE** /v1/inventory/{id} | Soft-archive an inventory item.
[**getInventory**](InventoryApi.md#getInventory) | **GET** /v1/inventory/{id} | Get one inventory item with platform listings.
[**getInventoryFacet**](InventoryApi.md#getInventoryFacet) | **GET** /v1/inventory/facets | Distinct brands + categories across this user&#39;s inventory.
[**getInventoryLabel**](InventoryApi.md#getInventoryLabel) | **GET** /v1/inventory/labels | List every distinct label across this user&#39;s inventory.
[**getInventoryLabelStat**](InventoryApi.md#getInventoryLabelStat) | **GET** /v1/inventory/labels/stats | List distinct labels with usage counts + colors.
[**getInventorySkuExist**](InventoryApi.md#getInventorySkuExist) | **GET** /v1/inventory/sku-exists | Check whether a SKU is already in use on this user&#39;s inventory.
[**getSpatialPublic**](InventoryApi.md#getSpatialPublic) | **GET** /v1/spatial/public/{slug} | A shared room, as a visitor sees it.
[**getSpatialScene**](InventoryApi.md#getSpatialScene) | **GET** /v1/spatial/scenes/{id} | A solved room: every item, where it sits, and why.
[**listInventory**](InventoryApi.md#listInventory) | **GET** /v1/inventory | List inventory items.
[**listInventoryActivity**](InventoryApi.md#listInventoryActivity) | **GET** /v1/inventory/{id}/activity | Activity log for an inventory item (created/sold/edited/etc.).
[**listInventoryIds**](InventoryApi.md#listInventoryIds) | **GET** /v1/inventory/ids | Filter inventory → return matching id list.
[**listInventoryUnits**](InventoryApi.md#listInventoryUnits) | **GET** /v1/inventory/{id}/units | List the individually identified units of an inventory item.
[**listSpatialPublic**](InventoryApi.md#listSpatialPublic) | **GET** /v1/spatial/public | Public rooms anyone can walk into.
[**listSpatialPublicOffers**](InventoryApi.md#listSpatialPublicOffers) | **GET** /v1/spatial/public/{slug}/offers | What is for sale in a shared room.
[**listSpatialSceneMovements**](InventoryApi.md#listSpatialSceneMovements) | **GET** /v1/spatial/scenes/{id}/movements | Stock movements in a room over a time window.
[**listSpatialScenes**](InventoryApi.md#listSpatialScenes) | **GET** /v1/spatial/scenes | The rooms this account has.
[**updateInventory**](InventoryApi.md#updateInventory) | **PATCH** /v1/inventory/{id} | Update an inventory item (partial).


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

[**CreateInventoryResponse**](CreateInventoryResponse.md)

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

[**CreateInventoryBulkArchiveResponse**](CreateInventoryBulkArchiveResponse.md)

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

[**CreateInventoryBulkDeleteResponse**](CreateInventoryBulkDeleteResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInventoryBulkLabel"></a>
# **createInventoryBulkLabel**
> CreateInventoryBulkLabelResponse createInventoryBulkLabel()

Bulk add/remove labels on inventory items.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : CreateInventoryBulkLabelResponse = apiInstance.createInventoryBulkLabel()
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

[**CreateInventoryBulkLabelResponse**](CreateInventoryBulkLabelResponse.md)

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

[**CreateInventoryBulkQuantityResponse**](CreateInventoryBulkQuantityResponse.md)

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

[**CreateInventoryCsvImportResponse**](CreateInventoryCsvImportResponse.md)

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

[**CreateInventoryLabelRenameResponse**](CreateInventoryLabelRenameResponse.md)

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

[**CreateInventoryUnitIdentifierResponse**](CreateInventoryUnitIdentifierResponse.md)

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

[**CreateInventoryUnitLookupResponse**](CreateInventoryUnitLookupResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteInventory"></a>
# **deleteInventory**
> DeleteInventoryResponse deleteInventory(id)

Soft-archive an inventory item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteInventoryResponse = apiInstance.deleteInventory(id)
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

[**DeleteInventoryResponse**](DeleteInventoryResponse.md)

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

[**GetInventoryResponse**](GetInventoryResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventoryFacet"></a>
# **getInventoryFacet**
> GetInventoryFacetResponse getInventoryFacet()

Distinct brands + categories across this user&#39;s inventory.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : GetInventoryFacetResponse = apiInstance.getInventoryFacet()
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

[**GetInventoryFacetResponse**](GetInventoryFacetResponse.md)

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

[**GetInventoryLabelResponse**](GetInventoryLabelResponse.md)

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

[**GetInventoryLabelStatResponse**](GetInventoryLabelStatResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInventorySkuExist"></a>
# **getInventorySkuExist**
> GetInventorySkuExistResponse getInventorySkuExist(sku)

Check whether a SKU is already in use on this user&#39;s inventory.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val sku : kotlin.String = sku_example // kotlin.String | 
try {
    val result : GetInventorySkuExistResponse = apiInstance.getInventorySkuExist(sku)
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

[**GetInventorySkuExistResponse**](GetInventorySkuExistResponse.md)

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

[**GetSpatialPublicResponse**](GetSpatialPublicResponse.md)

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

[**GetSpatialSceneResponse**](GetSpatialSceneResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInventory"></a>
# **listInventory**
> V1List listInventory(page, limit, search, status)

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
try {
    val result : V1List = apiInstance.listInventory(page, limit, search, status)
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

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInventoryActivity"></a>
# **listInventoryActivity**
> V1List listInventoryActivity(id, limit)

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
    val result : V1List = apiInstance.listInventoryActivity(id, limit)
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInventoryIds"></a>
# **listInventoryIds**
> V1List listInventoryIds()

Filter inventory → return matching id list.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : V1List = apiInstance.listInventoryIds()
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInventoryUnits"></a>
# **listInventoryUnits**
> V1List listInventoryUnits(id)

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
    val result : V1List = apiInstance.listInventoryUnits(id)
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialPublic"></a>
# **listSpatialPublic**
> V1List listSpatialPublic()

Public rooms anyone can walk into.

The directory behind world-hopping. A room becomes public when its owner shares it; this lists those, newest first, with enough to draw a doorway AND enough to choose one — name, slug, category, itemCount, up to four previewImages, forSaleCount, a priceFromCents/priceToCents band and updatedAt. The band is the cheapest and dearest thing for sale in the room, never a quote for one object: /api/public/spatial/{slug}/offers is the authority on that. Fetch the room itself from /api/public/spatial/{slug}. Rooms with no items are omitted: an empty room is not a destination.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : V1List = apiInstance.listSpatialPublic()
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialPublicOffers"></a>
# **listSpatialPublicOffers**
> V1List listSpatialPublicOffers(slug)

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
    val result : V1List = apiInstance.listSpatialPublicOffers(slug)
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialSceneMovements"></a>
# **listSpatialSceneMovements**
> V1List listSpatialSceneMovements(id)

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
    val result : V1List = apiInstance.listSpatialSceneMovements(id)
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialScenes"></a>
# **listSpatialScenes**
> V1List listSpatialScenes()

The rooms this account has.

One per market category the seller holds catalog-resolved stock in, plus a warehouse. Rooms are created on first read rather than requiring setup, so this call is safe to treat as the entry point.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
try {
    val result : V1List = apiInstance.listSpatialScenes()
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateInventory"></a>
# **updateInventory**
> UpdateInventoryResponse updateInventory(id)

Update an inventory item (partial).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = InventoryApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateInventoryResponse = apiInstance.updateInventory(id)
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

[**UpdateInventoryResponse**](UpdateInventoryResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

