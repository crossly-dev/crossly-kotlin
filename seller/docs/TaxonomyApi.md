# TaxonomyApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryById**](TaxonomyApi.md#getCategoryById) | **GET** /v1/categories/{id} | One canonical category and the category it maps to on each marketplace.
[**getTaxonomyCategory**](TaxonomyApi.md#getTaxonomyCategory) | **GET** /v1/taxonomy/{platform}/categories | Categories for a platform. Default is top-level; pass &#x60;?parent&#x3D;&lt;categoryId&gt;&#x60; to drill down one level (supported on cookie platforms whose recipe returns flat parent_id-linked rows).
[**getTaxonomyCategoryAspect**](TaxonomyApi.md#getTaxonomyCategoryAspect) | **GET** /v1/taxonomy/{platform}/categories/{id}/aspects | Item-specific aspects (eBay) / properties (Etsy) / hard-coded enums (cookie platforms) for a category.
[**getTaxonomyCategoryChildren**](TaxonomyApi.md#getTaxonomyCategoryChildren) | **GET** /v1/taxonomy/{platform}/categories/{id}/children | Direct children of a category node.
[**getTaxonomyRequiredField**](TaxonomyApi.md#getTaxonomyRequiredField) | **GET** /v1/taxonomy/{platform}/required-fields | Normalized field schema the seller needs to fill before crossposting to this platform. Combines master fields (title/description/price/condition) with platform-specific overrides.
[**listCategoryAspects**](TaxonomyApi.md#listCategoryAspects) | **GET** /v1/categories/{id}/aspects | Item specifics for a canonical category: required/optional, known values, per-marketplace names.
[**listCategorySearch**](TaxonomyApi.md#listCategorySearch) | **GET** /v1/categories/search | Search or browse Crossly&#39;s canonical categories (the ids listings take as categoryId).
[**listTaxonomyEbayCharities**](TaxonomyApi.md#listTaxonomyEbayCharities) | **GET** /v1/taxonomy/ebay/charities | Search eBay for Charity organisations (the charityId an eBay listing donates to).
[**listTaxonomySuggest**](TaxonomyApi.md#listTaxonomySuggest) | **GET** /v1/taxonomy/{platform}/suggest | Reverse lookup — suggest categories matching a search phrase: eBay live; Poshmark, Mercari, Depop, Grailed, Vinted, Whatnot, Vestiaire, OfferUp, Facebook and Curtsy over their harvested trees. Etsy answers an empty list (browse its tree instead).


<a name="getCategoryById"></a>
# **getCategoryById**
> GetCategoryByIdResponse getCategoryById(id)

One canonical category and the category it maps to on each marketplace.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxonomyApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetCategoryByIdResponse = apiInstance.getCategoryById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxonomyApi#getCategoryById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxonomyApi#getCategoryById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetCategoryByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

<a name="listCategoryAspects"></a>
# **listCategoryAspects**
> ListCategoryAspectsResponse listCategoryAspects(id, valuesLimit)

Item specifics for a canonical category: required/optional, known values, per-marketplace names.

Required-ness and cardinality come from the eBay category the concept maps to. &#x60;freeText&#x60; &#x3D; any text is accepted; otherwise &#x60;values&#x60; are the known values (up to &#x60;valuesLimit&#x60;). &#x60;marketplaces&#x60; gives the attribute name each marketplace uses for the aspect. Send them as &#x60;itemSpecifics&#x60; on POST /v1/listings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxonomyApi()
val id : kotlin.String = id_example // kotlin.String | 
val valuesLimit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListCategoryAspectsResponse = apiInstance.listCategoryAspects(id, valuesLimit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxonomyApi#listCategoryAspects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxonomyApi#listCategoryAspects")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **valuesLimit** | **kotlin.Int**|  | [optional] [default to 50]

### Return type

**ListCategoryAspectsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCategorySearch"></a>
# **listCategorySearch**
> ListCategorySearchResponse listCategorySearch(q, path, limit)

Search or browse Crossly&#39;s canonical categories (the ids listings take as categoryId).

&#x60;q&#x60; matches the category name and path. &#x60;path&#x60; (e.g. \&quot;Clothing &amp; Shoes &gt; Men\&quot;) limits to one branch. Without &#x60;q&#x60;, &#x60;meta.branches&#x60; lists the next level under &#x60;path&#x60; (the root when omitted) so a client can walk the tree down to a leaf.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxonomyApi()
val q : kotlin.String = q_example // kotlin.String | 
val path : kotlin.String = path_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListCategorySearchResponse = apiInstance.listCategorySearch(q, path, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxonomyApi#listCategorySearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxonomyApi#listCategorySearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**|  | [optional]
 **path** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]

### Return type

**ListCategorySearchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTaxonomyEbayCharities"></a>
# **listTaxonomyEbayCharities**
> ListTaxonomyEbayCharitiesResponse listTaxonomyEbayCharities(q, limit, marketplace)

Search eBay for Charity organisations (the charityId an eBay listing donates to).

Send the chosen &#x60;charityOrgId&#x60; as &#x60;overrides.ebay.charityId&#x60; with &#x60;overrides.ebay.donationPercentage&#x60; (10-100 in steps of 5) on a listing to donate that share of the eBay sale. &#x60;q&#x60; needs at least 2 characters.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxonomyApi()
val q : kotlin.String = q_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val marketplace : kotlin.String = marketplace_example // kotlin.String | 
try {
    val result : ListTaxonomyEbayCharitiesResponse = apiInstance.listTaxonomyEbayCharities(q, limit, marketplace)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxonomyApi#listTaxonomyEbayCharities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxonomyApi#listTaxonomyEbayCharities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 20]
 **marketplace** | **kotlin.String**|  | [optional] [default to EBAY_US] [enum: EBAY_US, EBAY_GB]

### Return type

**ListTaxonomyEbayCharitiesResponse**

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

