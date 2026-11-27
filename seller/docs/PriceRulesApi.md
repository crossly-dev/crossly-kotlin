# PriceRulesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPriceRulePreview**](PriceRulesApi.md#createPriceRulePreview) | **POST** /v1/price-rules/preview | Compute the price each marketplace would list a listing (or a price) at.
[**deletePriceRule**](PriceRulesApi.md#deletePriceRule) | **DELETE** /v1/price-rules/{id} | Delete a price rule.
[**listPriceRules**](PriceRulesApi.md#listPriceRules) | **GET** /v1/price-rules | List the seller&#39;s per-channel price rules.
[**updatePriceRule**](PriceRulesApi.md#updatePriceRule) | **PUT** /v1/price-rules | Create or replace the price rule for a platform (and optional account / category).
[**updatePriceRuleById**](PriceRulesApi.md#updatePriceRuleById) | **PATCH** /v1/price-rules/{id} | Update a price rule.


<a name="createPriceRulePreview"></a>
# **createPriceRulePreview**
> CreatePriceRulePreviewResponse createPriceRulePreview()

Compute the price each marketplace would list a listing (or a price) at.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PriceRulesApi()
try {
    val result : CreatePriceRulePreviewResponse = apiInstance.createPriceRulePreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceRulesApi#createPriceRulePreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceRulesApi#createPriceRulePreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreatePriceRulePreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePriceRule"></a>
# **deletePriceRule**
> OkResponse deletePriceRule(id)

Delete a price rule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PriceRulesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deletePriceRule(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceRulesApi#deletePriceRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceRulesApi#deletePriceRule")
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

<a name="listPriceRules"></a>
# **listPriceRules**
> ListPriceRulesResponse listPriceRules(platform)

List the seller&#39;s per-channel price rules.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PriceRulesApi()
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : ListPriceRulesResponse = apiInstance.listPriceRules(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceRulesApi#listPriceRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceRulesApi#listPriceRules")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  | [optional]

### Return type

**ListPriceRulesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePriceRule"></a>
# **updatePriceRule**
> ListPriceRulesItem updatePriceRule()

Create or replace the price rule for a platform (and optional account / category).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PriceRulesApi()
try {
    val result : ListPriceRulesItem = apiInstance.updatePriceRule()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceRulesApi#updatePriceRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceRulesApi#updatePriceRule")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListPriceRulesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePriceRuleById"></a>
# **updatePriceRuleById**
> ListPriceRulesItem updatePriceRuleById(id)

Update a price rule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PriceRulesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListPriceRulesItem = apiInstance.updatePriceRuleById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceRulesApi#updatePriceRuleById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceRulesApi#updatePriceRuleById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListPriceRulesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

