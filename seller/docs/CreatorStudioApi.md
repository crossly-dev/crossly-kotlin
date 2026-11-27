# CreatorStudioApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCreatorCardSet**](CreatorStudioApi.md#createCreatorCardSet) | **POST** /v1/creator/cards/sets | Start a card set: a game id (3-24 of a-z, 0-9, -), a set code (MG1) and a name. Answers a starter draft that already passes conformance. Paid seller plans only.
[**createCreatorCardSetArt**](CreatorStudioApi.md#createCreatorCardSetArt) | **POST** /v1/creator/cards/sets/{id}/art/{slug} | One card&#39;s art: a PNG (base64, at most 1 MB and 2048 px), scanned and stored until the version is approved.
[**createCreatorCardSetCheck**](CreatorStudioApi.md#createCreatorCardSetCheck) | **POST** /v1/creator/cards/sets/{id}/check | The full check publish runs: draft issues, tcgStaticConformance and bot-vs-bot games of the set.
[**createCreatorCardSetPublish**](CreatorStudioApi.md#createCreatorCardSetPublish) | **POST** /v1/creator/cards/sets/{id}/publish | Publish: the set must pass its check; it is packaged (game.json, cards.json, the designer rules, art) and submitted as a new immutable version for review, through the same intake as a hand-made card game.
[**createCreatorCreationSubmit**](CreatorStudioApi.md#createCreatorCreationSubmit) | **POST** /v1/creator/creations/{format}/{id}/submit | Send one creation to review through its format&#39;s own submit (wearable, model, decor, interactive, card: its whole set). Games are published from world-kit.
[**createCreatorImport**](CreatorStudioApi.md#createCreatorImport) | **POST** /v1/creator/imports | Validate a filled-in template (manifest text, CSV text, every path in the upload): issues with file, line and column, and a preview. Creates nothing.
[**createCreatorImportCommit**](CreatorStudioApi.md#createCreatorImportCommit) | **POST** /v1/creator/imports/{id}/commit | Create the drafts of a validated template upload (drafts only; nothing is submitted to review).
[**createCreatorItemModel**](CreatorStudioApi.md#createCreatorItemModel) | **POST** /v1/creator/items/models | Upload a .glb (base64, 4 MB): validated, measured and stored (quarantined until approved). An over-budget model is refused with every failing number.
[**createCreatorItemModelCheck**](CreatorStudioApi.md#createCreatorItemModelCheck) | **POST** /v1/creator/items/models/check | The budget report for a .glb (base64), storing nothing: every limit (triangles, draw calls, texture edge per phone/desktop; size, nodes, meshes, images, animations; bones for wearables) with pass/fail, problems and LOD suggestions.
[**createCreatorItemModelSubmit**](CreatorStudioApi.md#createCreatorItemModelSubmit) | **POST** /v1/creator/items/models/{id}/submit | Send an uploaded model to art review.
[**createCreatorItemPreview**](CreatorStudioApi.md#createCreatorItemPreview) | **POST** /v1/creator/items/previews | Upload a preview PNG (base64, at most 1 MB and 2048 px): parsed, scanned and stored on the Crossly CDN; answers its https URL.
[**createCreatorItemWearable**](CreatorStudioApi.md#createCreatorItemWearable) | **POST** /v1/creator/items/wearables | Start a wearable from a template: slug, name, colourways (panel -&gt; #rrggbb), a COSM price and optional edition size. Text is filtered; answers the automated checks. Paid seller plans only.
[**createCreatorItemWearableSubmit**](CreatorStudioApi.md#createCreatorItemWearableSubmit) | **POST** /v1/creator/items/wearables/{id}/submit | Submit a wearable whose checks pass: each colourway becomes a COSM design (inactive) filed for review. Needs an https preview image (POST /v1/creator/items/previews).
[**createCreatorReviewHide**](CreatorStudioApi.md#createCreatorReviewHide) | **POST** /v1/creator/reviews/{reviewId}/hide | Hide a buyer review from your public page (it is kept, and its rating still counts).
[**createCreatorReviewReply**](CreatorStudioApi.md#createCreatorReviewReply) | **POST** /v1/creator/reviews/{reviewId}/reply | Reply to a buyer review of your creation (or change your reply).
[**createCreatorReviewReport**](CreatorStudioApi.md#createCreatorReviewReport) | **POST** /v1/creator/reviews/{reviewId}/report | Report a buyer review to Crossly (abuse, spam, not a real buyer).
[**createCreatorReviewUnhide**](CreatorStudioApi.md#createCreatorReviewUnhide) | **POST** /v1/creator/reviews/{reviewId}/unhide | Show a hidden buyer review on your page again.
[**deleteCreatorCardSet**](CreatorStudioApi.md#deleteCreatorCardSet) | **DELETE** /v1/creator/cards/sets/{id} | Delete a set draft that was never published.
[**deleteCreatorItemModel**](CreatorStudioApi.md#deleteCreatorItemModel) | **DELETE** /v1/creator/items/models/{id} | Delete a draft or rejected model.
[**deleteCreatorItemWearable**](CreatorStudioApi.md#deleteCreatorItemWearable) | **DELETE** /v1/creator/items/wearables/{id} | Delete a draft wearable.
[**getCreatorCardSet**](CreatorStudioApi.md#getCreatorCardSet) | **GET** /v1/creator/cards/sets/{id} | One set draft with its check: draft issues by field and tcgStaticConformance problems.
[**getCreatorCardSetProgress**](CreatorStudioApi.md#getCreatorCardSetProgress) | **GET** /v1/creator/cards/sets/{id}/progress | A set&#39;s three steps: live on COSM, the mint threshold toward NFTs, and the print-run cost (trading_cards estimate) against production funding banked.
[**getCreatorCollection**](CreatorStudioApi.md#getCreatorCollection) | **GET** /v1/creator/collections/{collectionId} | One collection (a card set, a launch or a claimed contract): its six-stage road to the chain, the launch (phase timeline, proceeds, recent mints), sales by marketplace, royalty estimate, holders, its cards or creations with their earnings, holder perks set at mint, and which actions apply.
[**getCreatorCollectionPerk**](CreatorStudioApi.md#getCreatorCollectionPerk) | **GET** /v1/creator/collections/{collectionId}/perks | A collection&#39;s holder perks (percent off at your shop, early access, a World item, a loyalty tier), whether they can be edited, and why not (a card set not started yet, a contract claimed from elsewhere).
[**getCreatorCreation**](CreatorStudioApi.md#getCreatorCreation) | **GET** /v1/creator/creations/{format}/{id} | One creation: its status timeline and review history, the files it uses, where it sells, its sales, its buyer reviews and its mint status.
[**getCreatorCreationStatus**](CreatorStudioApi.md#getCreatorCreationStatus) | **GET** /v1/creator/creations/{format}/{id}/status | Where one creation stands: its status, the reviewer&#39;s last note and its status timeline.
[**getCreatorEarningExport**](CreatorStudioApi.md#getCreatorEarningExport) | **GET** /v1/creator/earnings/export | Download your creator earnings: format&#x3D;csv (every ledger row for the filter) or format&#x3D;pdf (a statement with per-rail totals for the same filter: rail, source, group, gameId, state; period defaults to this month).
[**getCreatorEarningReconcile**](CreatorStudioApi.md#getCreatorEarningReconcile) | **GET** /v1/creator/earnings/reconcile | Reconcile your creator earnings: every source recomputed directly from its own ledger, side by side with the earnings view. ok is true when every source matches.
[**getCreatorImport**](CreatorStudioApi.md#getCreatorImport) | **GET** /v1/creator/imports/{id} | A stored template validation.
[**getCreatorItemModel**](CreatorStudioApi.md#getCreatorItemModel) | **GET** /v1/creator/items/models/{id} | One of your models with its budget report.
[**getCreatorItemTemplate**](CreatorStudioApi.md#getCreatorItemTemplate) | **GET** /v1/creator/items/templates | Wearable templates: each garment the Crossly avatar wears, its recolourable panels, default colours and measured cost (triangles, draw calls, bones, bytes, phone LOD), plus the per-wearable budget.
[**getCreatorItemWearable**](CreatorStudioApi.md#getCreatorItemWearable) | **GET** /v1/creator/items/wearables/{id} | One of your wearables with its checks, review state and note.
[**getCreatorMinting**](CreatorStudioApi.md#getCreatorMinting) | **GET** /v1/creator/minting | Everything you take on chain as collection rows with a six-stage status (designed, eligible, drafted, deploying, live, ended): gettingReady and launched. Game items (source game_item: tradeable game products, NFT declarations for your games) carry href and gameId.
[**getCreatorOverview**](CreatorStudioApi.md#getCreatorOverview) | **GET** /v1/creator/overview | Creator Studio overview: earnings this month and last by rail, live creations, review queue, publish lock and next steps.
[**getCreatorTemplate**](CreatorStudioApi.md#getCreatorTemplate) | **GET** /v1/creator/templates/{format} | The template files for a format (wearable, model, decor, interactive, card_set): crossly-creation.json, creations.csv where it applies, and a README.
[**getCreatorTemplateZip**](CreatorStudioApi.md#getCreatorTemplateZip) | **GET** /v1/creator/templates/{format}/zip | A format&#39;s template as a .zip download (the same files as GET /templates/:format, plus its empty folders).
[**listCreatorCardSets**](CreatorStudioApi.md#listCreatorCardSets) | **GET** /v1/creator/cards/sets | Your card set drafts, each with its road from COSM to print: live on COSM, the mint threshold (collectors, packs opened, resales) and the print-run cost against what NFT sales have banked.
[**listCreatorCreationReviews**](CreatorStudioApi.md#listCreatorCreationReviews) | **GET** /v1/creator/creations/{format}/{id}/reviews | Buyer reviews of one creation, newest first (hidden ones included).
[**listCreatorCreations**](CreatorStudioApi.md#listCreatorCreations) | **GET** /v1/creator/creations | Every creation of your shop in one list: wearables, 3D objects, decor, interactive objects, each card of your card sets, Classic games and card games, with status, collection, rating, earnings and mint status.
[**listCreatorEarningTrend**](CreatorStudioApi.md#listCreatorEarningTrend) | **GET** /v1/creator/earnings/trend | Your creator earnings over time: net (available + paid) per day, week or month (UTC) and rail, for the same filter as the ledger. meta.totals holds the per-rail and per-source totals of that filter.
[**listCreatorEarnings**](CreatorStudioApi.md#listCreatorEarnings) | **GET** /v1/creator/earnings | Your creator earnings ledger across every rail (cash, COSM, CBX), newest first. Each row names the source ledger row it is. meta.totals holds per-rail and per-source totals for the same filter; meta.nextCursor pages.
[**listCreatorItemModels**](CreatorStudioApi.md#listCreatorItemModels) | **GET** /v1/creator/items/models | Your uploaded 3D models with their budget reports and review state.
[**listCreatorItemWearables**](CreatorStudioApi.md#listCreatorItemWearables) | **GET** /v1/creator/items/wearables | Your wearables: drafts, in review, live or with changes requested, each with its automated checks and per-colourway designs.
[**listCreatorItems**](CreatorStudioApi.md#listCreatorItems) | **GET** /v1/creator/items | Every creation of your shop — wearables, decor, uploaded 3D models, interactive objects, Classic games, card games (incl. unpublished designer sets), physical runs — with status, price and earnings.
[**listCreatorReviews**](CreatorStudioApi.md#listCreatorReviews) | **GET** /v1/creator/reviews | Every creator submission (items, interactive objects, Classic games, card games) and its review decision with the reviewer note.
[**updateCreatorCardSet**](CreatorStudioApi.md#updateCreatorCardSet) | **PUT** /v1/creator/cards/sets/{id} | Save the whole draft: cards (name, type, rarity, rules text, flavour, power/draw/guard), COSM prices and supply, frame colours, print plan. Every word goes through the text filter. Art is merged: a card without &#x60;art&#x60; (or with art as read) keeps its stored art, &#x60;art: null&#x60; clears it; only the art upload sets art. Answers the check.
[**updateCreatorCollectionPerk**](CreatorStudioApi.md#updateCreatorCollectionPerk) | **PUT** /v1/creator/collections/{collectionId}/perks | Replace a collection&#39;s holder perks: &#x60;{ perks: [...] }&#x60;, at most one of each type: percent_off { percent 1-50 }, early_access { hours 1-720 }, world_item { creationRef, name }, loyalty_tier { tierId, tierName } (one of your loyalty tiers), each with an optional note. 409 when the collection has no launch yet.
[**updateCreatorItemWearable**](CreatorStudioApi.md#updateCreatorItemWearable) | **PATCH** /v1/creator/items/wearables/{id} | Edit a draft wearable (name, description, colourways, price, edition). Submitted wearables are frozen.


<a name="createCreatorCardSet"></a>
# **createCreatorCardSet**
> CreatorCardSetResponse createCreatorCardSet()

Start a card set: a game id (3-24 of a-z, 0-9, -), a set code (MG1) and a name. Answers a starter draft that already passes conformance. Paid seller plans only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : CreatorCardSetResponse = apiInstance.createCreatorCardSet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorCardSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorCardSet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreatorCardSetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorCardSetArt"></a>
# **createCreatorCardSetArt**
> CreatorCardSetResponse createCreatorCardSetArt(id, slug)

One card&#39;s art: a PNG (base64, at most 1 MB and 2048 px), scanned and stored until the version is approved.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreatorCardSetResponse = apiInstance.createCreatorCardSetArt(id, slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorCardSetArt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorCardSetArt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **slug** | **kotlin.String**|  |

### Return type

**CreatorCardSetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorCardSetCheck"></a>
# **createCreatorCardSetCheck**
> CreatorCardSetResponse createCreatorCardSetCheck(id)

The full check publish runs: draft issues, tcgStaticConformance and bot-vs-bot games of the set.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatorCardSetResponse = apiInstance.createCreatorCardSetCheck(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorCardSetCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorCardSetCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatorCardSetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorCardSetPublish"></a>
# **createCreatorCardSetPublish**
> CreateCreatorCardSetPublishResponse createCreatorCardSetPublish(id)

Publish: the set must pass its check; it is packaged (game.json, cards.json, the designer rules, art) and submitted as a new immutable version for review, through the same intake as a hand-made card game.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateCreatorCardSetPublishResponse = apiInstance.createCreatorCardSetPublish(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorCardSetPublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorCardSetPublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateCreatorCardSetPublishResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorCreationSubmit"></a>
# **createCreatorCreationSubmit**
> CreateCreatorCreationSubmitResponse createCreatorCreationSubmit(format, id)

Send one creation to review through its format&#39;s own submit (wearable, model, decor, interactive, card: its whole set). Games are published from world-kit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val format : kotlin.String = format_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateCreatorCreationSubmitResponse = apiInstance.createCreatorCreationSubmit(format, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorCreationSubmit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorCreationSubmit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**CreateCreatorCreationSubmitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorImport"></a>
# **createCreatorImport**
> GetCreatorImportResponse createCreatorImport()

Validate a filled-in template (manifest text, CSV text, every path in the upload): issues with file, line and column, and a preview. Creates nothing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : GetCreatorImportResponse = apiInstance.createCreatorImport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorImport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetCreatorImportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorImportCommit"></a>
# **createCreatorImportCommit**
> CreateCreatorImportCommitResponse createCreatorImportCommit(id)

Create the drafts of a validated template upload (drafts only; nothing is submitted to review).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateCreatorImportCommitResponse = apiInstance.createCreatorImportCommit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorImportCommit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorImportCommit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateCreatorImportCommitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorItemModel"></a>
# **createCreatorItemModel**
> CreatorItemModelResponse createCreatorItemModel()

Upload a .glb (base64, 4 MB): validated, measured and stored (quarantined until approved). An over-budget model is refused with every failing number.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : CreatorItemModelResponse = apiInstance.createCreatorItemModel()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorItemModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorItemModel")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreatorItemModelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorItemModelCheck"></a>
# **createCreatorItemModelCheck**
> CreateCreatorItemModelCheckResponse createCreatorItemModelCheck()

The budget report for a .glb (base64), storing nothing: every limit (triangles, draw calls, texture edge per phone/desktop; size, nodes, meshes, images, animations; bones for wearables) with pass/fail, problems and LOD suggestions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : CreateCreatorItemModelCheckResponse = apiInstance.createCreatorItemModelCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorItemModelCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorItemModelCheck")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateCreatorItemModelCheckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorItemModelSubmit"></a>
# **createCreatorItemModelSubmit**
> CreatorItemModelResponse createCreatorItemModelSubmit(id)

Send an uploaded model to art review.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatorItemModelResponse = apiInstance.createCreatorItemModelSubmit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorItemModelSubmit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorItemModelSubmit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatorItemModelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorItemPreview"></a>
# **createCreatorItemPreview**
> CreateCreatorItemPreviewResponse createCreatorItemPreview()

Upload a preview PNG (base64, at most 1 MB and 2048 px): parsed, scanned and stored on the Crossly CDN; answers its https URL.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : CreateCreatorItemPreviewResponse = apiInstance.createCreatorItemPreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorItemPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorItemPreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateCreatorItemPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorItemWearable"></a>
# **createCreatorItemWearable**
> CreatorItemWearableResponse createCreatorItemWearable()

Start a wearable from a template: slug, name, colourways (panel -&gt; #rrggbb), a COSM price and optional edition size. Text is filtered; answers the automated checks. Paid seller plans only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : CreatorItemWearableResponse = apiInstance.createCreatorItemWearable()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorItemWearable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorItemWearable")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreatorItemWearableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorItemWearableSubmit"></a>
# **createCreatorItemWearableSubmit**
> CreatorItemWearableResponse createCreatorItemWearableSubmit(id)

Submit a wearable whose checks pass: each colourway becomes a COSM design (inactive) filed for review. Needs an https preview image (POST /v1/creator/items/previews).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatorItemWearableResponse = apiInstance.createCreatorItemWearableSubmit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorItemWearableSubmit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorItemWearableSubmit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatorItemWearableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorReviewHide"></a>
# **createCreatorReviewHide**
> CreatorReviewResponse createCreatorReviewHide(reviewId)

Hide a buyer review from your public page (it is kept, and its rating still counts).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val reviewId : kotlin.String = reviewId_example // kotlin.String | 
try {
    val result : CreatorReviewResponse = apiInstance.createCreatorReviewHide(reviewId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorReviewHide")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorReviewHide")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewId** | **kotlin.String**|  |

### Return type

**CreatorReviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorReviewReply"></a>
# **createCreatorReviewReply**
> CreatorReviewResponse createCreatorReviewReply(reviewId)

Reply to a buyer review of your creation (or change your reply).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val reviewId : kotlin.String = reviewId_example // kotlin.String | 
try {
    val result : CreatorReviewResponse = apiInstance.createCreatorReviewReply(reviewId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorReviewReply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorReviewReply")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewId** | **kotlin.String**|  |

### Return type

**CreatorReviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorReviewReport"></a>
# **createCreatorReviewReport**
> CreatorReviewResponse createCreatorReviewReport(reviewId)

Report a buyer review to Crossly (abuse, spam, not a real buyer).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val reviewId : kotlin.String = reviewId_example // kotlin.String | 
try {
    val result : CreatorReviewResponse = apiInstance.createCreatorReviewReport(reviewId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorReviewReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorReviewReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewId** | **kotlin.String**|  |

### Return type

**CreatorReviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorReviewUnhide"></a>
# **createCreatorReviewUnhide**
> CreatorReviewResponse createCreatorReviewUnhide(reviewId)

Show a hidden buyer review on your page again.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val reviewId : kotlin.String = reviewId_example // kotlin.String | 
try {
    val result : CreatorReviewResponse = apiInstance.createCreatorReviewUnhide(reviewId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#createCreatorReviewUnhide")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#createCreatorReviewUnhide")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewId** | **kotlin.String**|  |

### Return type

**CreatorReviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCreatorCardSet"></a>
# **deleteCreatorCardSet**
> deleteCreatorCardSet(id)

Delete a set draft that was never published.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    apiInstance.deleteCreatorCardSet(id)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#deleteCreatorCardSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#deleteCreatorCardSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCreatorItemModel"></a>
# **deleteCreatorItemModel**
> deleteCreatorItemModel(id)

Delete a draft or rejected model.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    apiInstance.deleteCreatorItemModel(id)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#deleteCreatorItemModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#deleteCreatorItemModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCreatorItemWearable"></a>
# **deleteCreatorItemWearable**
> deleteCreatorItemWearable(id)

Delete a draft wearable.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    apiInstance.deleteCreatorItemWearable(id)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#deleteCreatorItemWearable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#deleteCreatorItemWearable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorCardSet"></a>
# **getCreatorCardSet**
> CreatorCardSetResponse getCreatorCardSet(id)

One set draft with its check: draft issues by field and tcgStaticConformance problems.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatorCardSetResponse = apiInstance.getCreatorCardSet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorCardSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorCardSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatorCardSetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorCardSetProgress"></a>
# **getCreatorCardSetProgress**
> GetCreatorCardSetProgressResponse getCreatorCardSetProgress(id)

A set&#39;s three steps: live on COSM, the mint threshold toward NFTs, and the print-run cost (trading_cards estimate) against production funding banked.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetCreatorCardSetProgressResponse = apiInstance.getCreatorCardSetProgress(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorCardSetProgress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorCardSetProgress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetCreatorCardSetProgressResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorCollection"></a>
# **getCreatorCollection**
> GetCreatorCollectionResponse getCreatorCollection(collectionId)

One collection (a card set, a launch or a claimed contract): its six-stage road to the chain, the launch (phase timeline, proceeds, recent mints), sales by marketplace, royalty estimate, holders, its cards or creations with their earnings, holder perks set at mint, and which actions apply.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val collectionId : kotlin.String = collectionId_example // kotlin.String | 
try {
    val result : GetCreatorCollectionResponse = apiInstance.getCreatorCollection(collectionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorCollection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorCollection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **kotlin.String**|  |

### Return type

**GetCreatorCollectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorCollectionPerk"></a>
# **getCreatorCollectionPerk**
> GetCreatorCollectionPerkResponse getCreatorCollectionPerk(collectionId)

A collection&#39;s holder perks (percent off at your shop, early access, a World item, a loyalty tier), whether they can be edited, and why not (a card set not started yet, a contract claimed from elsewhere).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val collectionId : kotlin.String = collectionId_example // kotlin.String | 
try {
    val result : GetCreatorCollectionPerkResponse = apiInstance.getCreatorCollectionPerk(collectionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorCollectionPerk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorCollectionPerk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **kotlin.String**|  |

### Return type

**GetCreatorCollectionPerkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorCreation"></a>
# **getCreatorCreation**
> GetCreatorCreationResponse getCreatorCreation(format, id)

One creation: its status timeline and review history, the files it uses, where it sells, its sales, its buyer reviews and its mint status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val format : kotlin.String = format_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetCreatorCreationResponse = apiInstance.getCreatorCreation(format, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorCreation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorCreation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**GetCreatorCreationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorCreationStatus"></a>
# **getCreatorCreationStatus**
> GetCreatorCreationStatusResponse getCreatorCreationStatus(format, id)

Where one creation stands: its status, the reviewer&#39;s last note and its status timeline.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val format : kotlin.String = format_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetCreatorCreationStatusResponse = apiInstance.getCreatorCreationStatus(format, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorCreationStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorCreationStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**GetCreatorCreationStatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorEarningExport"></a>
# **getCreatorEarningExport**
> kotlin.String getCreatorEarningExport(format, rail, source, state, group, gameId, from, to)

Download your creator earnings: format&#x3D;csv (every ledger row for the filter) or format&#x3D;pdf (a statement with per-rail totals for the same filter: rail, source, group, gameId, state; period defaults to this month).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val format : kotlin.String = format_example // kotlin.String | 
val rail : kotlin.String = rail_example // kotlin.String | 
val source : kotlin.String = source_example // kotlin.String | 
val state : kotlin.String = state_example // kotlin.String | 
val group : kotlin.String = group_example // kotlin.String | 
val gameId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val from : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val to : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
try {
    val result : kotlin.String = apiInstance.getCreatorEarningExport(format, rail, source, state, group, gameId, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorEarningExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorEarningExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**|  | [optional] [enum: csv, pdf]
 **rail** | **kotlin.String**|  | [optional] [enum: cash, cosm, cbx]
 **source** | **kotlin.String**|  | [optional] [enum: item_sale, classic_store, vault_creator_code, item_royalty, card_sale, resale_royalty, production_royalty, world_pass, world_product, world_subscription, world_private_server, world_paid_access, world_commerce_affiliate, toolbox_asset, creator_rewards, world_ads]
 **state** | **kotlin.String**|  | [optional] [enum: available, paid, reversed]
 **group** | **kotlin.String**|  | [optional] [enum: creator, carnival, toolbox, rewards, physical, items, cards, collections, royalties]
 **gameId** | **java.util.UUID**|  | [optional]
 **from** | **java.time.OffsetDateTime**|  | [optional]
 **to** | **java.time.OffsetDateTime**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorEarningReconcile"></a>
# **getCreatorEarningReconcile**
> GetCreatorEarningReconcileResponse getCreatorEarningReconcile()

Reconcile your creator earnings: every source recomputed directly from its own ledger, side by side with the earnings view. ok is true when every source matches.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : GetCreatorEarningReconcileResponse = apiInstance.getCreatorEarningReconcile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorEarningReconcile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorEarningReconcile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetCreatorEarningReconcileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorImport"></a>
# **getCreatorImport**
> GetCreatorImportResponse getCreatorImport(id)

A stored template validation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetCreatorImportResponse = apiInstance.getCreatorImport(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetCreatorImportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorItemModel"></a>
# **getCreatorItemModel**
> CreatorItemModelResponse getCreatorItemModel(id)

One of your models with its budget report.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatorItemModelResponse = apiInstance.getCreatorItemModel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorItemModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorItemModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatorItemModelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorItemTemplate"></a>
# **getCreatorItemTemplate**
> GetCreatorItemTemplateResponse getCreatorItemTemplate()

Wearable templates: each garment the Crossly avatar wears, its recolourable panels, default colours and measured cost (triangles, draw calls, bones, bytes, phone LOD), plus the per-wearable budget.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : GetCreatorItemTemplateResponse = apiInstance.getCreatorItemTemplate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorItemTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorItemTemplate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetCreatorItemTemplateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorItemWearable"></a>
# **getCreatorItemWearable**
> CreatorItemWearableResponse getCreatorItemWearable(id)

One of your wearables with its checks, review state and note.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatorItemWearableResponse = apiInstance.getCreatorItemWearable(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorItemWearable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorItemWearable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatorItemWearableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorMinting"></a>
# **getCreatorMinting**
> GetCreatorMintingResponse getCreatorMinting()

Everything you take on chain as collection rows with a six-stage status (designed, eligible, drafted, deploying, live, ended): gettingReady and launched. Game items (source game_item: tradeable game products, NFT declarations for your games) carry href and gameId.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : GetCreatorMintingResponse = apiInstance.getCreatorMinting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorMinting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorMinting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetCreatorMintingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorOverview"></a>
# **getCreatorOverview**
> GetCreatorOverviewResponse getCreatorOverview()

Creator Studio overview: earnings this month and last by rail, live creations, review queue, publish lock and next steps.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : GetCreatorOverviewResponse = apiInstance.getCreatorOverview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorOverview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorOverview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetCreatorOverviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorTemplate"></a>
# **getCreatorTemplate**
> GetCreatorTemplateResponse getCreatorTemplate(format)

The template files for a format (wearable, model, decor, interactive, card_set): crossly-creation.json, creations.csv where it applies, and a README.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val format : kotlin.String = format_example // kotlin.String | 
try {
    val result : GetCreatorTemplateResponse = apiInstance.getCreatorTemplate(format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**|  |

### Return type

**GetCreatorTemplateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorTemplateZip"></a>
# **getCreatorTemplateZip**
> java.io.File getCreatorTemplateZip(format)

A format&#39;s template as a .zip download (the same files as GET /templates/:format, plus its empty folders).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val format : kotlin.String = format_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.getCreatorTemplateZip(format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#getCreatorTemplateZip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#getCreatorTemplateZip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**|  |

### Return type

**java.io.File**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorCardSets"></a>
# **listCreatorCardSets**
> ListCreatorCardSetsResponse listCreatorCardSets()

Your card set drafts, each with its road from COSM to print: live on COSM, the mint threshold (collectors, packs opened, resales) and the print-run cost against what NFT sales have banked.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : ListCreatorCardSetsResponse = apiInstance.listCreatorCardSets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#listCreatorCardSets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#listCreatorCardSets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListCreatorCardSetsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorCreationReviews"></a>
# **listCreatorCreationReviews**
> ListCreatorCreationReviewsResponse listCreatorCreationReviews(format, id)

Buyer reviews of one creation, newest first (hidden ones included).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val format : kotlin.String = format_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListCreatorCreationReviewsResponse = apiInstance.listCreatorCreationReviews(format, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#listCreatorCreationReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#listCreatorCreationReviews")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**ListCreatorCreationReviewsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorCreations"></a>
# **listCreatorCreations**
> ListCreatorCreationsResponse listCreatorCreations()

Every creation of your shop in one list: wearables, 3D objects, decor, interactive objects, each card of your card sets, Classic games and card games, with status, collection, rating, earnings and mint status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : ListCreatorCreationsResponse = apiInstance.listCreatorCreations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#listCreatorCreations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#listCreatorCreations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListCreatorCreationsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorEarningTrend"></a>
# **listCreatorEarningTrend**
> ListCreatorEarningTrendResponse listCreatorEarningTrend(bucket, rail, group, gameId, from, to)

Your creator earnings over time: net (available + paid) per day, week or month (UTC) and rail, for the same filter as the ledger. meta.totals holds the per-rail and per-source totals of that filter.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val bucket : kotlin.String = bucket_example // kotlin.String | 
val rail : kotlin.String = rail_example // kotlin.String | 
val group : kotlin.String = group_example // kotlin.String | 
val gameId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val from : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val to : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
try {
    val result : ListCreatorEarningTrendResponse = apiInstance.listCreatorEarningTrend(bucket, rail, group, gameId, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#listCreatorEarningTrend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#listCreatorEarningTrend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucket** | **kotlin.String**|  | [optional] [enum: day, week, month]
 **rail** | **kotlin.String**|  | [optional] [enum: cash, cosm, cbx]
 **group** | **kotlin.String**|  | [optional] [enum: creator, carnival, toolbox, rewards, physical, items, cards, collections, royalties]
 **gameId** | **java.util.UUID**|  | [optional]
 **from** | **java.time.OffsetDateTime**|  | [optional]
 **to** | **java.time.OffsetDateTime**|  | [optional]

### Return type

**ListCreatorEarningTrendResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorEarnings"></a>
# **listCreatorEarnings**
> ListCreatorEarningsResponse listCreatorEarnings(rail, source, group, gameId, state, from, to, cursor, limit)

Your creator earnings ledger across every rail (cash, COSM, CBX), newest first. Each row names the source ledger row it is. meta.totals holds per-rail and per-source totals for the same filter; meta.nextCursor pages.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val rail : kotlin.String = rail_example // kotlin.String | 
val source : kotlin.String = source_example // kotlin.String | 
val group : kotlin.String = group_example // kotlin.String | 
val gameId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val state : kotlin.String = state_example // kotlin.String | 
val from : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val to : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListCreatorEarningsResponse = apiInstance.listCreatorEarnings(rail, source, group, gameId, state, from, to, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#listCreatorEarnings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#listCreatorEarnings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rail** | **kotlin.String**|  | [optional] [enum: cash, cosm, cbx]
 **source** | **kotlin.String**|  | [optional] [enum: item_sale, classic_store, vault_creator_code, item_royalty, card_sale, resale_royalty, production_royalty, world_pass, world_product, world_subscription, world_private_server, world_paid_access, world_commerce_affiliate, toolbox_asset, creator_rewards, world_ads]
 **group** | **kotlin.String**|  | [optional] [enum: creator, carnival, toolbox, rewards, physical, items, cards, collections, royalties]
 **gameId** | **java.util.UUID**|  | [optional]
 **state** | **kotlin.String**|  | [optional] [enum: available, paid, reversed]
 **from** | **java.time.OffsetDateTime**|  | [optional]
 **to** | **java.time.OffsetDateTime**|  | [optional]
 **cursor** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListCreatorEarningsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorItemModels"></a>
# **listCreatorItemModels**
> ListCreatorItemModelsResponse listCreatorItemModels()

Your uploaded 3D models with their budget reports and review state.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : ListCreatorItemModelsResponse = apiInstance.listCreatorItemModels()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#listCreatorItemModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#listCreatorItemModels")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListCreatorItemModelsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorItemWearables"></a>
# **listCreatorItemWearables**
> ListCreatorItemWearablesResponse listCreatorItemWearables()

Your wearables: drafts, in review, live or with changes requested, each with its automated checks and per-colourway designs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
try {
    val result : ListCreatorItemWearablesResponse = apiInstance.listCreatorItemWearables()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#listCreatorItemWearables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#listCreatorItemWearables")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListCreatorItemWearablesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorItems"></a>
# **listCreatorItems**
> ListCreatorItemsResponse listCreatorItems(kind, status, rail)

Every creation of your shop — wearables, decor, uploaded 3D models, interactive objects, Classic games, card games (incl. unpublished designer sets), physical runs — with status, price and earnings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val kind : kotlin.String = kind_example // kotlin.String | 
val status : kotlin.String = status_example // kotlin.String | 
val rail : kotlin.String = rail_example // kotlin.String | 
try {
    val result : ListCreatorItemsResponse = apiInstance.listCreatorItems(kind, status, rail)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#listCreatorItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#listCreatorItems")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kind** | **kotlin.String**|  | [optional] [enum: wearable, decor, model, interactive, classic_game, card_game, physical_run]
 **status** | **kotlin.String**|  | [optional] [enum: draft, in_review, changes_requested, live, rejected, retired]
 **rail** | **kotlin.String**|  | [optional] [enum: cash, cosm]

### Return type

**ListCreatorItemsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorReviews"></a>
# **listCreatorReviews**
> ListCreatorReviewsResponse listCreatorReviews(kind, state, limit)

Every creator submission (items, interactive objects, Classic games, card games) and its review decision with the reviewer note.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val kind : kotlin.String = kind_example // kotlin.String | 
val state : kotlin.String = state_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListCreatorReviewsResponse = apiInstance.listCreatorReviews(kind, state, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#listCreatorReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#listCreatorReviews")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kind** | **kotlin.String**|  | [optional] [enum: item, interactive, classic_game, card_game, model, toolbox]
 **state** | **kotlin.String**|  | [optional] [enum: in_review, approved, rejected, withdrawn, superseded]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListCreatorReviewsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCreatorCardSet"></a>
# **updateCreatorCardSet**
> CreatorCardSetResponse updateCreatorCardSet(id)

Save the whole draft: cards (name, type, rarity, rules text, flavour, power/draw/guard), COSM prices and supply, frame colours, print plan. Every word goes through the text filter. Art is merged: a card without &#x60;art&#x60; (or with art as read) keeps its stored art, &#x60;art: null&#x60; clears it; only the art upload sets art. Answers the check.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatorCardSetResponse = apiInstance.updateCreatorCardSet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#updateCreatorCardSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#updateCreatorCardSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatorCardSetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCreatorCollectionPerk"></a>
# **updateCreatorCollectionPerk**
> GetCreatorCollectionPerkResponse updateCreatorCollectionPerk(collectionId)

Replace a collection&#39;s holder perks: &#x60;{ perks: [...] }&#x60;, at most one of each type: percent_off { percent 1-50 }, early_access { hours 1-720 }, world_item { creationRef, name }, loyalty_tier { tierId, tierName } (one of your loyalty tiers), each with an optional note. 409 when the collection has no launch yet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val collectionId : kotlin.String = collectionId_example // kotlin.String | 
try {
    val result : GetCreatorCollectionPerkResponse = apiInstance.updateCreatorCollectionPerk(collectionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#updateCreatorCollectionPerk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#updateCreatorCollectionPerk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **kotlin.String**|  |

### Return type

**GetCreatorCollectionPerkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCreatorItemWearable"></a>
# **updateCreatorItemWearable**
> CreatorItemWearableResponse updateCreatorItemWearable(id)

Edit a draft wearable (name, description, colourways, price, edition). Submitted wearables are frozen.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorStudioApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatorItemWearableResponse = apiInstance.updateCreatorItemWearable(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorStudioApi#updateCreatorItemWearable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorStudioApi#updateCreatorItemWearable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatorItemWearableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

