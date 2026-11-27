# ToolboxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToolboxAsset**](ToolboxApi.md#createToolboxAsset) | **POST** /v1/toolbox/assets | Publish an asset (place nodes). Scanned (lint, text, credits, uploads) then reviewed. Free by default; paid needs Pro and a verified identity.
[**createToolboxAssetPurchase**](ToolboxApi.md#createToolboxAssetPurchase) | **POST** /v1/toolbox/assets/{assetId}/purchase | Open a Crossly checkout for a paid asset. Nothing is charged here: a person pays at checkoutUrl. The author earns 80% of net; the licence is use in your own experiences.
[**createToolboxAssetRetire**](ToolboxApi.md#createToolboxAssetRetire) | **POST** /v1/toolbox/assets/{assetId}/retire | Take an asset off the store for good. Licences already sold keep working.
[**createToolboxAssetUse**](ToolboxApi.md#createToolboxAssetUse) | **POST** /v1/toolbox/assets/{assetId}/use | Get the asset&#39;s nodes stamped with its id for a place you can edit; insert:true also inserts them into the place&#39;s live session. Paid assets need the experience owner&#39;s licence.
[**createToolboxAssetVersion**](ToolboxApi.md#createToolboxAssetVersion) | **POST** /v1/toolbox/assets/{assetId}/versions | A new version (reviewed); the live one keeps serving until it is approved.
[**createToolboxPurchaseRefund**](ToolboxApi.md#createToolboxPurchaseRefund) | **POST** /v1/toolbox/purchases/{purchaseId}/refund | Refund a licence within 14 days while no published version of yours uses the asset. Ends the licence; the author&#39;s share is reversed.
[**deleteToolboxAssetRatingMine**](ToolboxApi.md#deleteToolboxAssetRatingMine) | **DELETE** /v1/toolbox/assets/{assetId}/ratings/mine | Remove your rating of an asset.
[**getToolboxAsset**](ToolboxApi.md#getToolboxAsset) | **GET** /v1/toolbox/assets/{assetId} | One asset: versions, credits (assets it includes), licence, contents, your purchase.
[**getToolboxAssetRating**](ToolboxApi.md#getToolboxAssetRating) | **GET** /v1/toolbox/assets/{assetId}/ratings | Ratings of an asset: average stars, breakdown, recent reviews, yours, and whether you may rate it.
[**getToolboxPurchase**](ToolboxApi.md#getToolboxPurchase) | **GET** /v1/toolbox/purchases/{purchaseId} | A purchase: status, price, tax, refundable until.
[**listToolboxAssets**](ToolboxApi.md#listToolboxAssets) | **GET** /v1/toolbox/assets | Search the Toolbox: models, scripts, sounds, images, packages. Free and paid; &#x60;owned&#x60; says whether you may insert it now.
[**listToolboxLibrary**](ToolboxApi.md#listToolboxLibrary) | **GET** /v1/toolbox/library | Assets you may insert: licences you bought, your own, free ones you used.
[**listToolboxMine**](ToolboxApi.md#listToolboxMine) | **GET** /v1/toolbox/mine | Your published assets: review state, reviewer note, what each earned you.
[**listToolboxSales**](ToolboxApi.md#listToolboxSales) | **GET** /v1/toolbox/sales | Your Toolbox sales: gross, net, your 80% share after refunds. Never who bought.
[**updateToolboxAsset**](ToolboxApi.md#updateToolboxAsset) | **PATCH** /v1/toolbox/assets/{assetId} | Edit name, description, tags, thumbnail or price.
[**updateToolboxAssetRatingMine**](ToolboxApi.md#updateToolboxAssetRatingMine) | **PUT** /v1/toolbox/assets/{assetId}/ratings/mine | Rate an asset you bought or installed: 1–5 stars and an optional review (1000 characters). Not your own.


<a name="createToolboxAsset"></a>
# **createToolboxAsset**
> ToolboxAssetResponse createToolboxAsset()

Publish an asset (place nodes). Scanned (lint, text, credits, uploads) then reviewed. Free by default; paid needs Pro and a verified identity.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
try {
    val result : ToolboxAssetResponse = apiInstance.createToolboxAsset()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#createToolboxAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#createToolboxAsset")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ToolboxAssetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createToolboxAssetPurchase"></a>
# **createToolboxAssetPurchase**
> GetToolboxPurchaseResponse createToolboxAssetPurchase(assetId)

Open a Crossly checkout for a paid asset. Nothing is charged here: a person pays at checkoutUrl. The author earns 80% of net; the licence is use in your own experiences.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val assetId : kotlin.String = assetId_example // kotlin.String | 
try {
    val result : GetToolboxPurchaseResponse = apiInstance.createToolboxAssetPurchase(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#createToolboxAssetPurchase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#createToolboxAssetPurchase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **kotlin.String**|  |

### Return type

**GetToolboxPurchaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createToolboxAssetRetire"></a>
# **createToolboxAssetRetire**
> ToolboxAssetResponse createToolboxAssetRetire(assetId)

Take an asset off the store for good. Licences already sold keep working.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val assetId : kotlin.String = assetId_example // kotlin.String | 
try {
    val result : ToolboxAssetResponse = apiInstance.createToolboxAssetRetire(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#createToolboxAssetRetire")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#createToolboxAssetRetire")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **kotlin.String**|  |

### Return type

**ToolboxAssetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createToolboxAssetUse"></a>
# **createToolboxAssetUse**
> CreateToolboxAssetUseResponse createToolboxAssetUse(assetId)

Get the asset&#39;s nodes stamped with its id for a place you can edit; insert:true also inserts them into the place&#39;s live session. Paid assets need the experience owner&#39;s licence.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val assetId : kotlin.String = assetId_example // kotlin.String | 
try {
    val result : CreateToolboxAssetUseResponse = apiInstance.createToolboxAssetUse(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#createToolboxAssetUse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#createToolboxAssetUse")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **kotlin.String**|  |

### Return type

**CreateToolboxAssetUseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createToolboxAssetVersion"></a>
# **createToolboxAssetVersion**
> ToolboxAssetResponse createToolboxAssetVersion(assetId)

A new version (reviewed); the live one keeps serving until it is approved.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val assetId : kotlin.String = assetId_example // kotlin.String | 
try {
    val result : ToolboxAssetResponse = apiInstance.createToolboxAssetVersion(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#createToolboxAssetVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#createToolboxAssetVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **kotlin.String**|  |

### Return type

**ToolboxAssetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createToolboxPurchaseRefund"></a>
# **createToolboxPurchaseRefund**
> CreateWorldMeReceiptRefundResponse createToolboxPurchaseRefund(purchaseId)

Refund a licence within 14 days while no published version of yours uses the asset. Ends the licence; the author&#39;s share is reversed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | 
try {
    val result : CreateWorldMeReceiptRefundResponse = apiInstance.createToolboxPurchaseRefund(purchaseId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#createToolboxPurchaseRefund")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#createToolboxPurchaseRefund")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.String**|  |

### Return type

**CreateWorldMeReceiptRefundResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteToolboxAssetRatingMine"></a>
# **deleteToolboxAssetRatingMine**
> DeleteSpatialSceneGrantResponse deleteToolboxAssetRatingMine(assetId)

Remove your rating of an asset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val assetId : kotlin.String = assetId_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneGrantResponse = apiInstance.deleteToolboxAssetRatingMine(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#deleteToolboxAssetRatingMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#deleteToolboxAssetRatingMine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getToolboxAsset"></a>
# **getToolboxAsset**
> GetToolboxAssetResponse getToolboxAsset(assetId)

One asset: versions, credits (assets it includes), licence, contents, your purchase.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val assetId : kotlin.String = assetId_example // kotlin.String | 
try {
    val result : GetToolboxAssetResponse = apiInstance.getToolboxAsset(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#getToolboxAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#getToolboxAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **kotlin.String**|  |

### Return type

**GetToolboxAssetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getToolboxAssetRating"></a>
# **getToolboxAssetRating**
> GetToolboxAssetRatingResponse getToolboxAssetRating(assetId)

Ratings of an asset: average stars, breakdown, recent reviews, yours, and whether you may rate it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val assetId : kotlin.String = assetId_example // kotlin.String | 
try {
    val result : GetToolboxAssetRatingResponse = apiInstance.getToolboxAssetRating(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#getToolboxAssetRating")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#getToolboxAssetRating")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **kotlin.String**|  |

### Return type

**GetToolboxAssetRatingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getToolboxPurchase"></a>
# **getToolboxPurchase**
> GetToolboxPurchaseResponse getToolboxPurchase(purchaseId)

A purchase: status, price, tax, refundable until.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | 
try {
    val result : GetToolboxPurchaseResponse = apiInstance.getToolboxPurchase(purchaseId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#getToolboxPurchase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#getToolboxPurchase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.String**|  |

### Return type

**GetToolboxPurchaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listToolboxAssets"></a>
# **listToolboxAssets**
> ListToolboxAssetsResponse listToolboxAssets()

Search the Toolbox: models, scripts, sounds, images, packages. Free and paid; &#x60;owned&#x60; says whether you may insert it now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
try {
    val result : ListToolboxAssetsResponse = apiInstance.listToolboxAssets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#listToolboxAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#listToolboxAssets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListToolboxAssetsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listToolboxLibrary"></a>
# **listToolboxLibrary**
> ListToolboxLibraryResponse listToolboxLibrary()

Assets you may insert: licences you bought, your own, free ones you used.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
try {
    val result : ListToolboxLibraryResponse = apiInstance.listToolboxLibrary()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#listToolboxLibrary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#listToolboxLibrary")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListToolboxLibraryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listToolboxMine"></a>
# **listToolboxMine**
> ListToolboxMineResponse listToolboxMine()

Your published assets: review state, reviewer note, what each earned you.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
try {
    val result : ListToolboxMineResponse = apiInstance.listToolboxMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#listToolboxMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#listToolboxMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListToolboxMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listToolboxSales"></a>
# **listToolboxSales**
> ListToolboxSalesResponse listToolboxSales()

Your Toolbox sales: gross, net, your 80% share after refunds. Never who bought.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
try {
    val result : ListToolboxSalesResponse = apiInstance.listToolboxSales()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#listToolboxSales")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#listToolboxSales")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListToolboxSalesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateToolboxAsset"></a>
# **updateToolboxAsset**
> ToolboxAssetResponse updateToolboxAsset(assetId)

Edit name, description, tags, thumbnail or price.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val assetId : kotlin.String = assetId_example // kotlin.String | 
try {
    val result : ToolboxAssetResponse = apiInstance.updateToolboxAsset(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#updateToolboxAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#updateToolboxAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **kotlin.String**|  |

### Return type

**ToolboxAssetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateToolboxAssetRatingMine"></a>
# **updateToolboxAssetRatingMine**
> UpdateToolboxAssetRatingMineResponse updateToolboxAssetRatingMine(assetId)

Rate an asset you bought or installed: 1–5 stars and an optional review (1000 characters). Not your own.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ToolboxApi()
val assetId : kotlin.String = assetId_example // kotlin.String | 
try {
    val result : UpdateToolboxAssetRatingMineResponse = apiInstance.updateToolboxAssetRatingMine(assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ToolboxApi#updateToolboxAssetRatingMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ToolboxApi#updateToolboxAssetRatingMine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **kotlin.String**|  |

### Return type

**UpdateToolboxAssetRatingMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

