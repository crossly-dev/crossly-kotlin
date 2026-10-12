# DefaultApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCosmDesignerChainAutoUnlock**](DefaultApi.md#createCosmDesignerChainAutoUnlock) | **POST** /v1/cosm/designer/chain-auto-unlock | 
[**createCosmDesignerChainUnlock**](DefaultApi.md#createCosmDesignerChainUnlock) | **POST** /v1/cosm/designer/chain-unlock | 
[**createCosmDesignerMaterialise**](DefaultApi.md#createCosmDesignerMaterialise) | **POST** /v1/cosm/designer/materialise | 
[**createCosmDesignerMaterialiseConfirm**](DefaultApi.md#createCosmDesignerMaterialiseConfirm) | **POST** /v1/cosm/designer/materialise/confirm | 
[**createCosmDesignerMaterialiseRelease**](DefaultApi.md#createCosmDesignerMaterialiseRelease) | **POST** /v1/cosm/designer/materialise/release | 
[**createCosmDesignerSubmitForReview**](DefaultApi.md#createCosmDesignerSubmitForReview) | **POST** /v1/cosm/designer/submit-for-review | 
[**createCosmDesignerTerm**](DefaultApi.md#createCosmDesignerTerm) | **POST** /v1/cosm/designer/terms | 
[**getCosmDesignerCopyState**](DefaultApi.md#getCosmDesignerCopyState) | **GET** /v1/cosm/designer/copy-state | 
[**getCosmDesignerEarning**](DefaultApi.md#getCosmDesignerEarning) | **GET** /v1/cosm/designer/earnings | 
[**getCosmDesignerTerm**](DefaultApi.md#getCosmDesignerTerm) | **GET** /v1/cosm/designer/terms | 
[**getListingVariationGroup**](DefaultApi.md#getListingVariationGroup) | **GET** /v1/listings/{id}/variation-group | 
[**getMarketMetalSpotHistory**](DefaultApi.md#getMarketMetalSpotHistory) | **GET** /v1/market/metals/spot/history | 
[**getMarketProduct**](DefaultApi.md#getMarketProduct) | **GET** /v1/market/products/{id} | 
[**getMarketProductRelated**](DefaultApi.md#getMarketProductRelated) | **GET** /v1/market/products/{id}/related | 
[**getMarketScrapQuote**](DefaultApi.md#getMarketScrapQuote) | **GET** /v1/market/scrap/quote | 
[**getMarketVariantBook**](DefaultApi.md#getMarketVariantBook) | **GET** /v1/market/variants/{id}/book | 
[**getVariationGroup**](DefaultApi.md#getVariationGroup) | **GET** /v1/variation-groups/{id} | 
[**getVariationGroupPublishPlan**](DefaultApi.md#getVariationGroupPublishPlan) | **GET** /v1/variation-groups/{id}/publish-plan | 
[**listMarketBullion**](DefaultApi.md#listMarketBullion) | **GET** /v1/market/bullion | 
[**listMarketGraders**](DefaultApi.md#listMarketGraders) | **GET** /v1/market/graders | 
[**listMarketMetalSpot**](DefaultApi.md#listMarketMetalSpot) | **GET** /v1/market/metals/spot | 
[**listMarketProducts**](DefaultApi.md#listMarketProducts) | **GET** /v1/market/products | 
[**listMarketVariantTiers**](DefaultApi.md#listMarketVariantTiers) | **GET** /v1/market/variants/{id}/tiers | 
[**listVariationGroups**](DefaultApi.md#listVariationGroups) | **GET** /v1/variation-groups | 


<a name="createCosmDesignerChainAutoUnlock"></a>
# **createCosmDesignerChainAutoUnlock**
> CreateCosmDesignerChainAutoUnlockResponse createCosmDesignerChainAutoUnlock(requestBody)



Opt a design in or out of the free chain unlock a popular limited design earns (on by default). Designer-only. Answers the popularity of the design toward the bar.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> =  // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : CreateCosmDesignerChainAutoUnlockResponse = apiInstance.createCosmDesignerChainAutoUnlock(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#createCosmDesignerChainAutoUnlock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#createCosmDesignerChainAutoUnlock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**|  |

### Return type

**CreateCosmDesignerChainAutoUnlockResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCosmDesignerChainUnlock"></a>
# **createCosmDesignerChainUnlock**
> CreateCosmDesignerChainUnlockResponse createCosmDesignerChainUnlock(requestBody)



Burn COSM to make a design mintable on chain. Designer-only and idempotent: paying twice is impossible, and a second call returns the existing unlock without charging. The fee is DESTROYED rather than collected. Limited editions only. Once unlocked, any holder may take their own copy on chain.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> =  // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : CreateCosmDesignerChainUnlockResponse = apiInstance.createCosmDesignerChainUnlock(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#createCosmDesignerChainUnlock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#createCosmDesignerChainUnlock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**|  |

### Return type

**CreateCosmDesignerChainUnlockResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCosmDesignerMaterialise"></a>
# **createCosmDesignerMaterialise**
> CreateCosmDesignerMaterialiseResponse createCosmDesignerMaterialise(requestBody)



Lock a copy and return an UNSIGNED Metaplex Core mint for the holder to sign. One call: it resolves the designer royalty, locks the copy, publishes immutable content-addressed metadata and builds the transaction — so a lock is never taken without a transaction to go with it, and a failure after the lock releases it. Does NOT void the copy; call confirm once the chain reaches FINALIZED commitment. Every royalty recipient needs a connected wallet first, and the designer must have unlocked the design.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> =  // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : CreateCosmDesignerMaterialiseResponse = apiInstance.createCosmDesignerMaterialise(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#createCosmDesignerMaterialise")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#createCosmDesignerMaterialise")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**|  |

### Return type

**CreateCosmDesignerMaterialiseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCosmDesignerMaterialiseConfirm"></a>
# **createCosmDesignerMaterialiseConfirm**
> CreateCosmDesignerMaterialiseConfirmResponse createCosmDesignerMaterialiseConfirm(requestBody)



Record a confirmed mint and void the in-world copy, in one transaction. The caller MUST have verified the transaction at finalized commitment first — an NFT recorded against a transaction that never landed cannot be recalled, and the copy it voided is gone. Idempotent on an already-confirmed request.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> =  // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : CreateCosmDesignerMaterialiseConfirmResponse = apiInstance.createCosmDesignerMaterialiseConfirm(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#createCosmDesignerMaterialiseConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#createCosmDesignerMaterialiseConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**|  |

### Return type

**CreateCosmDesignerMaterialiseConfirmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCosmDesignerMaterialiseRelease"></a>
# **createCosmDesignerMaterialiseRelease**
> CreateWorldJobShiftReleaseResponse createCosmDesignerMaterialiseRelease(requestBody)



Release a mint lock that was never signed. The ordinary outcome of somebody closing a wallet prompt, and it leaves the copy exactly as it was. Refuses a request that has already minted, because releasing one would unlock a copy that is on chain.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> =  // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : CreateWorldJobShiftReleaseResponse = apiInstance.createCosmDesignerMaterialiseRelease(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#createCosmDesignerMaterialiseRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#createCosmDesignerMaterialiseRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**|  |

### Return type

**CreateWorldJobShiftReleaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCosmDesignerSubmitForReview"></a>
# **createCosmDesignerSubmitForReview**
> CreateCosmDesignerSubmitForReviewResponse createCosmDesignerSubmitForReview(requestBody)



Submit a user-authored design for moderation. Designer-only, and refuses a design with no preview image HERE rather than at approval so the designer learns what is missing while they can still fix it. Submitting twice returns the existing pending review instead of queueing a second one — a moderator facing two reviews of one piece does not know which they are deciding. A design already on sale is refused.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> =  // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : CreateCosmDesignerSubmitForReviewResponse = apiInstance.createCosmDesignerSubmitForReview(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#createCosmDesignerSubmitForReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#createCosmDesignerSubmitForReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**|  |

### Return type

**CreateCosmDesignerSubmitForReviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCosmDesignerTerm"></a>
# **createCosmDesignerTerm**
> CreateCosmDesignerTermResponse createCosmDesignerTerm(requestBody)



Publish terms for a design. Never edits: every change is a new version, and a copy sold under an earlier one keeps those terms forever. Only the designer may call it. Collaborator shares are of the ROYALTY rather than the sale price and may total at most 100%, with the remainder staying with the designer; a total above 100% is refused rather than scaled down.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> =  // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : CreateCosmDesignerTermResponse = apiInstance.createCosmDesignerTerm(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#createCosmDesignerTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#createCosmDesignerTerm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**|  |

### Return type

**CreateCosmDesignerTermResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCosmDesignerCopyState"></a>
# **getCosmDesignerCopyState**
> GetCosmDesignerCopyStateResponse getCosmDesignerCopyState(ownershipId)



Where a copy currently is: held (in-world, wearable, listable for COSM), minting (locked while a mint is in flight) or materialised (an NFT in the holder wallet). A copy is in exactly one of these, never two.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val ownershipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetCosmDesignerCopyStateResponse = apiInstance.getCosmDesignerCopyState(ownershipId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCosmDesignerCopyState")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCosmDesignerCopyState")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ownershipId** | **java.util.UUID**|  |

### Return type

**GetCosmDesignerCopyStateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCosmDesignerEarning"></a>
# **getCosmDesignerEarning**
> GetCosmDesignerEarningResponse getCosmDesignerEarning(subjectId)



What a designer has earned, in both denominations. COSM royalties come from COSM-priced sales; cash earnings come from cash-priced sales and are funded by the buyer payment itself. The two are never converted into one another, and COSM is never cashed out.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val subjectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetCosmDesignerEarningResponse = apiInstance.getCosmDesignerEarning(subjectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCosmDesignerEarning")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCosmDesignerEarning")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectId** | **java.util.UUID**|  |

### Return type

**GetCosmDesignerEarningResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCosmDesignerTerm"></a>
# **getCosmDesignerTerm**
> GetCosmDesignerTermResponse getCosmDesignerTerm(cosmeticId)



The published terms for a design: resale, price window, secondary royalty and collaborator splits. Also reports the platform rates a designer does not control, and whether the terms are enforceable on chain — inside Crossly every rule is enforced, but a third-party marketplace honours a royalty voluntarily at best.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val cosmeticId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetCosmDesignerTermResponse = apiInstance.getCosmDesignerTerm(cosmeticId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCosmDesignerTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCosmDesignerTerm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cosmeticId** | **java.util.UUID**|  |

### Return type

**GetCosmDesignerTermResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListingVariationGroup"></a>
# **getListingVariationGroup**
> GetListingVariationGroupResponse getListingVariationGroup(id)



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetListingVariationGroupResponse = apiInstance.getListingVariationGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getListingVariationGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getListingVariationGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetListingVariationGroupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketMetalSpotHistory"></a>
# **getMarketMetalSpotHistory**
> GetMarketMetalSpotHistoryResponse getMarketMetalSpotHistory()



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
try {
    val result : GetMarketMetalSpotHistoryResponse = apiInstance.getMarketMetalSpotHistory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getMarketMetalSpotHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getMarketMetalSpotHistory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetMarketMetalSpotHistoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketProduct"></a>
# **getMarketProduct**
> GetMarketProductResponse getMarketProduct(id)



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetMarketProductResponse = apiInstance.getMarketProduct(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getMarketProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getMarketProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetMarketProductResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketProductRelated"></a>
# **getMarketProductRelated**
> GetMarketProductRelatedResponse getMarketProductRelated(id)



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetMarketProductRelatedResponse = apiInstance.getMarketProductRelated(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getMarketProductRelated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getMarketProductRelated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetMarketProductRelatedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketScrapQuote"></a>
# **getMarketScrapQuote**
> GetMarketScrapQuoteResponse getMarketScrapQuote()



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
try {
    val result : GetMarketScrapQuoteResponse = apiInstance.getMarketScrapQuote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getMarketScrapQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getMarketScrapQuote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetMarketScrapQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketVariantBook"></a>
# **getMarketVariantBook**
> GetMarketVariantBookResponse getMarketVariantBook(id)



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetMarketVariantBookResponse = apiInstance.getMarketVariantBook(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getMarketVariantBook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getMarketVariantBook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetMarketVariantBookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVariationGroup"></a>
# **getVariationGroup**
> ListVariationGroupsItem getVariationGroup(id)



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVariationGroupsItem = apiInstance.getVariationGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getVariationGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getVariationGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVariationGroupsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVariationGroupPublishPlan"></a>
# **getVariationGroupPublishPlan**
> GetVariationGroupPublishPlanResponse getVariationGroupPublishPlan(id)



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVariationGroupPublishPlanResponse = apiInstance.getVariationGroupPublishPlan(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getVariationGroupPublishPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getVariationGroupPublishPlan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVariationGroupPublishPlanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMarketBullion"></a>
# **listMarketBullion**
> ListMarketBullionResponse listMarketBullion()



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
try {
    val result : ListMarketBullionResponse = apiInstance.listMarketBullion()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listMarketBullion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listMarketBullion")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListMarketBullionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMarketGraders"></a>
# **listMarketGraders**
> ListMarketGradersResponse listMarketGraders()



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
try {
    val result : ListMarketGradersResponse = apiInstance.listMarketGraders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listMarketGraders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listMarketGraders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListMarketGradersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMarketMetalSpot"></a>
# **listMarketMetalSpot**
> ListMarketMetalSpotResponse listMarketMetalSpot()



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
try {
    val result : ListMarketMetalSpotResponse = apiInstance.listMarketMetalSpot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listMarketMetalSpot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listMarketMetalSpot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListMarketMetalSpotResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMarketProducts"></a>
# **listMarketProducts**
> ListMarketProductsResponse listMarketProducts()



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
try {
    val result : ListMarketProductsResponse = apiInstance.listMarketProducts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listMarketProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listMarketProducts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListMarketProductsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMarketVariantTiers"></a>
# **listMarketVariantTiers**
> ListMarketVariantTiersResponse listMarketVariantTiers(id)



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListMarketVariantTiersResponse = apiInstance.listMarketVariantTiers(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listMarketVariantTiers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listMarketVariantTiers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListMarketVariantTiersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVariationGroups"></a>
# **listVariationGroups**
> ListVariationGroupsResponse listVariationGroups()



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
try {
    val result : ListVariationGroupsResponse = apiInstance.listVariationGroups()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listVariationGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listVariationGroups")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVariationGroupsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

