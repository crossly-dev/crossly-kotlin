# DefaultApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListingVariationGroup**](DefaultApi.md#getListingVariationGroup) | **GET** /v1/listings/{id}/variation-group | 
[**getMarketProduct**](DefaultApi.md#getMarketProduct) | **GET** /v1/market/products/{id} | 
[**getMarketVariantBook**](DefaultApi.md#getMarketVariantBook) | **GET** /v1/market/variants/{id}/book | 
[**getVariationGroup**](DefaultApi.md#getVariationGroup) | **GET** /v1/variation-groups/{id} | 
[**getVariationGroupPublishPlan**](DefaultApi.md#getVariationGroupPublishPlan) | **GET** /v1/variation-groups/{id}/publish-plan | 
[**listMarketGraders**](DefaultApi.md#listMarketGraders) | **GET** /v1/market/graders | 
[**listMarketProducts**](DefaultApi.md#listMarketProducts) | **GET** /v1/market/products | 
[**listMarketVariantTiers**](DefaultApi.md#listMarketVariantTiers) | **GET** /v1/market/variants/{id}/tiers | 
[**listVariationGroups**](DefaultApi.md#listVariationGroups) | **GET** /v1/variation-groups | 


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

[**GetListingVariationGroupResponse**](GetListingVariationGroupResponse.md)

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

[**GetMarketProductResponse**](GetMarketProductResponse.md)

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

[**GetMarketVariantBookResponse**](GetMarketVariantBookResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVariationGroup"></a>
# **getVariationGroup**
> GetVariationGroupResponse getVariationGroup(id)



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVariationGroupResponse = apiInstance.getVariationGroup(id)
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

[**GetVariationGroupResponse**](GetVariationGroupResponse.md)

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

[**GetVariationGroupPublishPlanResponse**](GetVariationGroupPublishPlanResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMarketGraders"></a>
# **listMarketGraders**
> V1List listMarketGraders()



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
try {
    val result : V1List = apiInstance.listMarketGraders()
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMarketProducts"></a>
# **listMarketProducts**
> V1List listMarketProducts()



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
try {
    val result : V1List = apiInstance.listMarketProducts()
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMarketVariantTiers"></a>
# **listMarketVariantTiers**
> V1List listMarketVariantTiers(id)



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : V1List = apiInstance.listMarketVariantTiers(id)
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVariationGroups"></a>
# **listVariationGroups**
> V1List listVariationGroups()



### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DefaultApi()
try {
    val result : V1List = apiInstance.listVariationGroups()
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

