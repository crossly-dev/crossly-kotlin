# TaxonomyApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTaxonomyCategory**](TaxonomyApi.md#getTaxonomyCategory) | **GET** /v1/taxonomy/{platform}/categories | Categories for a platform. Default is top-level; pass &#x60;?parent&#x3D;&lt;categoryId&gt;&#x60; to drill down one level (supported on cookie platforms whose recipe returns flat parent_id-linked rows).
[**getTaxonomyCategoryAspect**](TaxonomyApi.md#getTaxonomyCategoryAspect) | **GET** /v1/taxonomy/{platform}/categories/{id}/aspects | Item-specific aspects (eBay) / properties (Etsy) / hard-coded enums (cookie platforms) for a category.
[**getTaxonomyCategoryChildren**](TaxonomyApi.md#getTaxonomyCategoryChildren) | **GET** /v1/taxonomy/{platform}/categories/{id}/children | Direct children of a category node.
[**getTaxonomyRequiredField**](TaxonomyApi.md#getTaxonomyRequiredField) | **GET** /v1/taxonomy/{platform}/required-fields | Normalized field schema the seller needs to fill before crossposting to this platform. Combines master fields (title/description/price/condition) with platform-specific overrides.
[**listTaxonomySuggest**](TaxonomyApi.md#listTaxonomySuggest) | **GET** /v1/taxonomy/{platform}/suggest | Reverse lookup — suggest categories matching a search phrase: eBay live; Poshmark, Mercari, Depop, Grailed, Vinted, Whatnot, Vestiaire, OfferUp, Facebook and Curtsy over their harvested trees. Etsy answers an empty list (browse its tree instead).


<a name="getTaxonomyCategory"></a>
# **getTaxonomyCategory**
> GetTaxonomyCategoryResponse getTaxonomyCategory(platform, parent)

Categories for a platform. Default is top-level; pass &#x60;?parent&#x3D;&lt;categoryId&gt;&#x60; to drill down one level (supported on cookie platforms whose recipe returns flat parent_id-linked rows).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxonomyApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val parent : kotlin.String = parent_example // kotlin.String | 
try {
    val result : GetTaxonomyCategoryResponse = apiInstance.getTaxonomyCategory(platform, parent)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxonomyApi#getTaxonomyCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxonomyApi#getTaxonomyCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **parent** | **kotlin.String**|  | [optional]

### Return type

**GetTaxonomyCategoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaxonomyCategoryAspect"></a>
# **getTaxonomyCategoryAspect**
> GetTaxonomyCategoryAspectResponse getTaxonomyCategoryAspect(platform, id)

Item-specific aspects (eBay) / properties (Etsy) / hard-coded enums (cookie platforms) for a category.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxonomyApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetTaxonomyCategoryAspectResponse = apiInstance.getTaxonomyCategoryAspect(platform, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxonomyApi#getTaxonomyCategoryAspect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxonomyApi#getTaxonomyCategoryAspect")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**GetTaxonomyCategoryAspectResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaxonomyCategoryChildren"></a>
# **getTaxonomyCategoryChildren**
> GetTaxonomyCategoryChildrenResponse getTaxonomyCategoryChildren(platform, id)

Direct children of a category node.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxonomyApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetTaxonomyCategoryChildrenResponse = apiInstance.getTaxonomyCategoryChildren(platform, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxonomyApi#getTaxonomyCategoryChildren")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxonomyApi#getTaxonomyCategoryChildren")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**GetTaxonomyCategoryChildrenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaxonomyRequiredField"></a>
# **getTaxonomyRequiredField**
> GetTaxonomyRequiredFieldResponse getTaxonomyRequiredField(platform, categoryId)

Normalized field schema the seller needs to fill before crossposting to this platform. Combines master fields (title/description/price/condition) with platform-specific overrides.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxonomyApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val categoryId : kotlin.String = categoryId_example // kotlin.String | Optional — used to inline aspects when present.
try {
    val result : GetTaxonomyRequiredFieldResponse = apiInstance.getTaxonomyRequiredField(platform, categoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxonomyApi#getTaxonomyRequiredField")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxonomyApi#getTaxonomyRequiredField")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **categoryId** | **kotlin.String**| Optional — used to inline aspects when present. | [optional]

### Return type

**GetTaxonomyRequiredFieldResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTaxonomySuggest"></a>
# **listTaxonomySuggest**
> ListTaxonomySuggestResponse listTaxonomySuggest(platform, q)

Reverse lookup — suggest categories matching a search phrase: eBay live; Poshmark, Mercari, Depop, Grailed, Vinted, Whatnot, Vestiaire, OfferUp, Facebook and Curtsy over their harvested trees. Etsy answers an empty list (browse its tree instead).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxonomyApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val q : kotlin.String = q_example // kotlin.String | 
try {
    val result : ListTaxonomySuggestResponse = apiInstance.listTaxonomySuggest(platform, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxonomyApi#listTaxonomySuggest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxonomyApi#listTaxonomySuggest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **q** | **kotlin.String**|  | [optional]

### Return type

**ListTaxonomySuggestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

