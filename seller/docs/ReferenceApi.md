# ReferenceApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBrand**](ReferenceApi.md#getBrand) | **GET** /v1/brands | Search the Crossly brand index. Returns up to 50 matches.
[**getCategory**](ReferenceApi.md#getCategory) | **GET** /v1/categories | List Crossly&#39;s canonical category tree.
[**getDepartment**](ReferenceApi.md#getDepartment) | **GET** /v1/departments | Search the eBay-sourced \&quot;Department\&quot; item-specific values.
[**getGender**](ReferenceApi.md#getGender) | **GET** /v1/genders | Search the eBay-sourced \&quot;Gender\&quot; item-specific values.
[**getPattern**](ReferenceApi.md#getPattern) | **GET** /v1/patterns | Search the eBay-sourced \&quot;Pattern\&quot; item-specific values.
[**getSizeSystem**](ReferenceApi.md#getSizeSystem) | **GET** /v1/size-systems | Search the Poshmark + Vestiaire size-system union (US/UK/EU/AU/FR/KR).
[**getStyle**](ReferenceApi.md#getStyle) | **GET** /v1/styles | Search the eBay-sourced \&quot;Style\&quot; item-specific values.
[**getType**](ReferenceApi.md#getType) | **GET** /v1/types | Search the eBay-sourced \&quot;Type\&quot; item-specific values.
[**listReferenceCountries**](ReferenceApi.md#listReferenceCountries) | **GET** /v1/reference/countries | Every country with its delivery-address rules.


<a name="getBrand"></a>
# **getBrand**
> GetBrandResponse getBrand()

Search the Crossly brand index. Returns up to 50 matches.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReferenceApi()
try {
    val result : GetBrandResponse = apiInstance.getBrand()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferenceApi#getBrand")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferenceApi#getBrand")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBrandResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCategory"></a>
# **getCategory**
> GetCategoryResponse getCategory()

List Crossly&#39;s canonical category tree.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReferenceApi()
try {
    val result : GetCategoryResponse = apiInstance.getCategory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferenceApi#getCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferenceApi#getCategory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetCategoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDepartment"></a>
# **getDepartment**
> GetDepartmentResponse getDepartment()

Search the eBay-sourced \&quot;Department\&quot; item-specific values.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReferenceApi()
try {
    val result : GetDepartmentResponse = apiInstance.getDepartment()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferenceApi#getDepartment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferenceApi#getDepartment")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetDepartmentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGender"></a>
# **getGender**
> GetGenderResponse getGender()

Search the eBay-sourced \&quot;Gender\&quot; item-specific values.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReferenceApi()
try {
    val result : GetGenderResponse = apiInstance.getGender()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferenceApi#getGender")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferenceApi#getGender")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetGenderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPattern"></a>
# **getPattern**
> GetPatternResponse getPattern()

Search the eBay-sourced \&quot;Pattern\&quot; item-specific values.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReferenceApi()
try {
    val result : GetPatternResponse = apiInstance.getPattern()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferenceApi#getPattern")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferenceApi#getPattern")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetPatternResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSizeSystem"></a>
# **getSizeSystem**
> GetSizeSystemResponse getSizeSystem()

Search the Poshmark + Vestiaire size-system union (US/UK/EU/AU/FR/KR).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReferenceApi()
try {
    val result : GetSizeSystemResponse = apiInstance.getSizeSystem()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferenceApi#getSizeSystem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferenceApi#getSizeSystem")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSizeSystemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStyle"></a>
# **getStyle**
> GetStyleResponse getStyle()

Search the eBay-sourced \&quot;Style\&quot; item-specific values.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReferenceApi()
try {
    val result : GetStyleResponse = apiInstance.getStyle()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferenceApi#getStyle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferenceApi#getStyle")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStyleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getType"></a>
# **getType**
> GetTypeResponse getType()

Search the eBay-sourced \&quot;Type\&quot; item-specific values.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReferenceApi()
try {
    val result : GetTypeResponse = apiInstance.getType()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferenceApi#getType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferenceApi#getType")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetTypeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listReferenceCountries"></a>
# **listReferenceCountries**
> ListReferenceCountriesResponse listReferenceCountries()

Every country with its delivery-address rules.

ISO 3166-1 alpha-2 code, name, main currency and region tags, plus what a delivery address there needs: whether a postal code / state is required, what they are called locally, and the fixed state list where carriers want one. &#x60;embargoed&#x60; marks destinations Crossly cannot deliver to.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReferenceApi()
try {
    val result : ListReferenceCountriesResponse = apiInstance.listReferenceCountries()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReferenceApi#listReferenceCountries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReferenceApi#listReferenceCountries")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListReferenceCountriesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

