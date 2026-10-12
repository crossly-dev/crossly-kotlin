# ProductionApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductionCandidateAccept**](ProductionApi.md#createProductionCandidateAccept) | **POST** /v1/production/candidates/{id}/accept | Accept a graduated design&#39;s production terms (edition size, cost, holder access).
[**createProductionCandidatePo**](ProductionApi.md#createProductionCandidatePo) | **POST** /v1/production/candidates/{id}/po | Ops: open a purchase order for a candidate. Admin PAT only.
[**createProductionCandidateVote**](ProductionApi.md#createProductionCandidateVote) | **POST** /v1/production/candidates/{id}/vote | Back (support: true) or un-back a design on the production ballot. One vote per person per design; voters must have bought on Crossly.
[**createProductionDesignBrief**](ProductionApi.md#createProductionDesignBrief) | **POST** /v1/production/designs/{cosmeticId}/brief | Set a design&#39;s production brief (materials, finish, box, reference images).
[**createProductionDesignConsent**](ProductionApi.md#createProductionDesignConsent) | **POST** /v1/production/designs/{cosmeticId}/consent | Opt a design in or out of physical production.
[**createProductionDesignSpec**](ProductionApi.md#createProductionDesignSpec) | **POST** /v1/production/designs/{cosmeticId}/spec | Set a design&#39;s production spec (category, materials, complexity, packaging).
[**createProductionEstimate**](ProductionApi.md#createProductionEstimate) | **POST** /v1/production/estimate | Estimate a run&#39;s landed cost from a spec + edition size (overshoots for safety).
[**createProductionRunPurchase**](ProductionApi.md#createProductionRunPurchase) | **POST** /v1/production/runs/{id}/purchase | Buy a limited-edition unit of a physical run (holder pricing applies).
[**createReceiptRelist**](ProductionApi.md#createReceiptRelist) | **POST** /v1/receipts/{id}/relist | Sell it again: a draft listing of something you bought on Crossly, carrying its purchase receipt so the next buyer inherits its provenance.
[**getProductionBallot**](ProductionApi.md#getProductionBallot) | **GET** /v1/production/ballot | The ballot: designs waiting for a physical run, most backed first, and whether you may vote.
[**getProductionCandidate**](ProductionApi.md#getProductionCandidate) | **GET** /v1/production/candidates | Your designs that have graduated toward a physical run.
[**getProductionDesignPref**](ProductionApi.md#getProductionDesignPref) | **GET** /v1/production/designs/{cosmeticId}/prefs | Read a design&#39;s production preferences (spec, brief, opt-out).
[**getProductionDrop**](ProductionApi.md#getProductionDrop) | **GET** /v1/production/drops | Limited-edition units you own, with fulfillment status.
[**getProductionEarning**](ProductionApi.md#getProductionEarning) | **GET** /v1/production/earnings | Your CBX earnings from physical production (royalties + balance + lines).
[**getProductionLine**](ProductionApi.md#getProductionLine) | **GET** /v1/production/lines | Your production lines dashboard (candidate + run + inventory).
[**getProductionPo**](ProductionApi.md#getProductionPo) | **GET** /v1/production/pos | Ops: list purchase orders (optionally for one candidate). Admin PAT only.
[**getProductionPoReconcile**](ProductionApi.md#getProductionPoReconcile) | **GET** /v1/production/pos/{poId}/reconcile | Ops: reconcile a PO&#39;s actuals against the estimate. Admin PAT only.
[**getProductionRun**](ProductionApi.md#getProductionRun) | **GET** /v1/production/runs | Browse open limited-edition physical runs (graduated designs).
[**getShopListingProvenance**](ProductionApi.md#getShopListingProvenance) | **GET** /v1/shop/listings/{slug}/provenance | Crossly provenance behind a shop listing: owners on Crossly and since when (never who or for how much). Null when not bought here.
[**updateProductionPo**](ProductionApi.md#updateProductionPo) | **PATCH** /v1/production/pos/{poId} | Ops: update a PO (supplier, freight, actuals, QC, status). Admin PAT only.


<a name="createProductionCandidateAccept"></a>
# **createProductionCandidateAccept**
> CreateProductionCandidateAcceptResponse createProductionCandidateAccept(id)

Accept a graduated design&#39;s production terms (edition size, cost, holder access).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateProductionCandidateAcceptResponse = apiInstance.createProductionCandidateAccept(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#createProductionCandidateAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#createProductionCandidateAccept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateProductionCandidateAcceptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProductionCandidatePo"></a>
# **createProductionCandidatePo**
> UpdateProductionPoResponse createProductionCandidatePo(id)

Ops: open a purchase order for a candidate. Admin PAT only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateProductionPoResponse = apiInstance.createProductionCandidatePo(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#createProductionCandidatePo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#createProductionCandidatePo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateProductionPoResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProductionCandidateVote"></a>
# **createProductionCandidateVote**
> CreateProductionCandidateVoteResponse createProductionCandidateVote(id)

Back (support: true) or un-back a design on the production ballot. One vote per person per design; voters must have bought on Crossly.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateProductionCandidateVoteResponse = apiInstance.createProductionCandidateVote(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#createProductionCandidateVote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#createProductionCandidateVote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateProductionCandidateVoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProductionDesignBrief"></a>
# **createProductionDesignBrief**
> CreateProductionDesignSpecResponse createProductionDesignBrief(cosmeticId)

Set a design&#39;s production brief (materials, finish, box, reference images).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val cosmeticId : kotlin.String = cosmeticId_example // kotlin.String | 
try {
    val result : CreateProductionDesignSpecResponse = apiInstance.createProductionDesignBrief(cosmeticId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#createProductionDesignBrief")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#createProductionDesignBrief")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cosmeticId** | **kotlin.String**|  |

### Return type

**CreateProductionDesignSpecResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProductionDesignConsent"></a>
# **createProductionDesignConsent**
> CreateProductionDesignSpecResponse createProductionDesignConsent(cosmeticId)

Opt a design in or out of physical production.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val cosmeticId : kotlin.String = cosmeticId_example // kotlin.String | 
try {
    val result : CreateProductionDesignSpecResponse = apiInstance.createProductionDesignConsent(cosmeticId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#createProductionDesignConsent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#createProductionDesignConsent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cosmeticId** | **kotlin.String**|  |

### Return type

**CreateProductionDesignSpecResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProductionDesignSpec"></a>
# **createProductionDesignSpec**
> CreateProductionDesignSpecResponse createProductionDesignSpec(cosmeticId)

Set a design&#39;s production spec (category, materials, complexity, packaging).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val cosmeticId : kotlin.String = cosmeticId_example // kotlin.String | 
try {
    val result : CreateProductionDesignSpecResponse = apiInstance.createProductionDesignSpec(cosmeticId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#createProductionDesignSpec")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#createProductionDesignSpec")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cosmeticId** | **kotlin.String**|  |

### Return type

**CreateProductionDesignSpecResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProductionEstimate"></a>
# **createProductionEstimate**
> CreateProductionEstimateResponse createProductionEstimate()

Estimate a run&#39;s landed cost from a spec + edition size (overshoots for safety).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
try {
    val result : CreateProductionEstimateResponse = apiInstance.createProductionEstimate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#createProductionEstimate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#createProductionEstimate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateProductionEstimateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProductionRunPurchase"></a>
# **createProductionRunPurchase**
> CreateProductionRunPurchaseResponse createProductionRunPurchase(id)

Buy a limited-edition unit of a physical run (holder pricing applies).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateProductionRunPurchaseResponse = apiInstance.createProductionRunPurchase(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#createProductionRunPurchase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#createProductionRunPurchase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateProductionRunPurchaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createReceiptRelist"></a>
# **createReceiptRelist**
> CreateReceiptRelistResponse createReceiptRelist(id)

Sell it again: a draft listing of something you bought on Crossly, carrying its purchase receipt so the next buyer inherits its provenance.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateReceiptRelistResponse = apiInstance.createReceiptRelist(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#createReceiptRelist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#createReceiptRelist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateReceiptRelistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionBallot"></a>
# **getProductionBallot**
> GetProductionBallotResponse getProductionBallot()

The ballot: designs waiting for a physical run, most backed first, and whether you may vote.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
try {
    val result : GetProductionBallotResponse = apiInstance.getProductionBallot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#getProductionBallot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#getProductionBallot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetProductionBallotResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionCandidate"></a>
# **getProductionCandidate**
> GetProductionCandidateResponse getProductionCandidate()

Your designs that have graduated toward a physical run.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
try {
    val result : GetProductionCandidateResponse = apiInstance.getProductionCandidate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#getProductionCandidate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#getProductionCandidate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetProductionCandidateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionDesignPref"></a>
# **getProductionDesignPref**
> GetProductionDesignPrefResponse getProductionDesignPref(cosmeticId)

Read a design&#39;s production preferences (spec, brief, opt-out).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val cosmeticId : kotlin.String = cosmeticId_example // kotlin.String | 
try {
    val result : GetProductionDesignPrefResponse = apiInstance.getProductionDesignPref(cosmeticId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#getProductionDesignPref")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#getProductionDesignPref")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cosmeticId** | **kotlin.String**|  |

### Return type

**GetProductionDesignPrefResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionDrop"></a>
# **getProductionDrop**
> GetProductionDropResponse getProductionDrop()

Limited-edition units you own, with fulfillment status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
try {
    val result : GetProductionDropResponse = apiInstance.getProductionDrop()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#getProductionDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#getProductionDrop")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetProductionDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionEarning"></a>
# **getProductionEarning**
> GetProductionEarningResponse getProductionEarning()

Your CBX earnings from physical production (royalties + balance + lines).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
try {
    val result : GetProductionEarningResponse = apiInstance.getProductionEarning()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#getProductionEarning")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#getProductionEarning")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetProductionEarningResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionLine"></a>
# **getProductionLine**
> GetProductionLineResponse getProductionLine()

Your production lines dashboard (candidate + run + inventory).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
try {
    val result : GetProductionLineResponse = apiInstance.getProductionLine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#getProductionLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#getProductionLine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetProductionLineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionPo"></a>
# **getProductionPo**
> GetProductionPoResponse getProductionPo(candidateId)

Ops: list purchase orders (optionally for one candidate). Admin PAT only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val candidateId : kotlin.String = candidateId_example // kotlin.String | 
try {
    val result : GetProductionPoResponse = apiInstance.getProductionPo(candidateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#getProductionPo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#getProductionPo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candidateId** | **kotlin.String**|  | [optional]

### Return type

**GetProductionPoResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionPoReconcile"></a>
# **getProductionPoReconcile**
> GetProductionPoReconcileResponse getProductionPoReconcile(poId)

Ops: reconcile a PO&#39;s actuals against the estimate. Admin PAT only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val poId : kotlin.String = poId_example // kotlin.String | 
try {
    val result : GetProductionPoReconcileResponse = apiInstance.getProductionPoReconcile(poId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#getProductionPoReconcile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#getProductionPoReconcile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poId** | **kotlin.String**|  |

### Return type

**GetProductionPoReconcileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductionRun"></a>
# **getProductionRun**
> GetProductionRunResponse getProductionRun()

Browse open limited-edition physical runs (graduated designs).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
try {
    val result : GetProductionRunResponse = apiInstance.getProductionRun()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#getProductionRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#getProductionRun")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetProductionRunResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShopListingProvenance"></a>
# **getShopListingProvenance**
> GetShopListingProvenanceResponse getShopListingProvenance(slug)

Crossly provenance behind a shop listing: owners on Crossly and since when (never who or for how much). Null when not bought here.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetShopListingProvenanceResponse = apiInstance.getShopListingProvenance(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#getShopListingProvenance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#getShopListingProvenance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetShopListingProvenanceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProductionPo"></a>
# **updateProductionPo**
> UpdateProductionPoResponse updateProductionPo(poId)

Ops: update a PO (supplier, freight, actuals, QC, status). Admin PAT only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductionApi()
val poId : kotlin.String = poId_example // kotlin.String | 
try {
    val result : UpdateProductionPoResponse = apiInstance.updateProductionPo(poId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionApi#updateProductionPo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionApi#updateProductionPo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poId** | **kotlin.String**|  |

### Return type

**UpdateProductionPoResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

