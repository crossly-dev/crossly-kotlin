# ProductSetsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductSet**](ProductSetsApi.md#createProductSet) | **POST** /v1/product-sets | Create a product set (filters, explicit picks, or both).
[**createProductSetBulk**](ProductSetsApi.md#createProductSetBulk) | **POST** /v1/product-sets/{id}/bulk | Run a bulk action (delist / relist / check-status) against the set&#39;s current members.
[**createProductSetMember**](ProductSetsApi.md#createProductSetMember) | **POST** /v1/product-sets/{id}/members | Add / exclude / remove explicit picks for a set.
[**deleteProductSet**](ProductSetsApi.md#deleteProductSet) | **DELETE** /v1/product-sets/{id} | Delete a product set (its id is also dropped from any channel exclusion lists).
[**getProductSet**](ProductSetsApi.md#getProductSet) | **GET** /v1/product-sets/{id} | Get one product set (its filters and pick counts).
[**listProductSetMembers**](ProductSetsApi.md#listProductSetMembers) | **GET** /v1/product-sets/{id}/members | Evaluate a set now and return a page of its member listings.
[**listProductSets**](ProductSetsApi.md#listProductSets) | **GET** /v1/product-sets | List your saved product sets with their live member counts.
[**updateProductSet**](ProductSetsApi.md#updateProductSet) | **PATCH** /v1/product-sets/{id} | Update a set: rename, description, or replace its filters.


<a name="createProductSet"></a>
# **createProductSet**
> ListProductSetsItem createProductSet()

Create a product set (filters, explicit picks, or both).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductSetsApi()
try {
    val result : ListProductSetsItem = apiInstance.createProductSet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSetsApi#createProductSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSetsApi#createProductSet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListProductSetsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProductSetBulk"></a>
# **createProductSetBulk**
> CreateProductSetBulkResponse createProductSetBulk(id)

Run a bulk action (delist / relist / check-status) against the set&#39;s current members.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductSetsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateProductSetBulkResponse = apiInstance.createProductSetBulk(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSetsApi#createProductSetBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSetsApi#createProductSetBulk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateProductSetBulkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProductSetMember"></a>
# **createProductSetMember**
> ListProductSetsItem createProductSetMember(id)

Add / exclude / remove explicit picks for a set.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductSetsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListProductSetsItem = apiInstance.createProductSetMember(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSetsApi#createProductSetMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSetsApi#createProductSetMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListProductSetsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProductSet"></a>
# **deleteProductSet**
> OkResponse deleteProductSet(id)

Delete a product set (its id is also dropped from any channel exclusion lists).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductSetsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteProductSet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSetsApi#deleteProductSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSetsApi#deleteProductSet")
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

<a name="getProductSet"></a>
# **getProductSet**
> ListProductSetsItem getProductSet(id)

Get one product set (its filters and pick counts).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductSetsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListProductSetsItem = apiInstance.getProductSet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSetsApi#getProductSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSetsApi#getProductSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListProductSetsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listProductSetMembers"></a>
# **listProductSetMembers**
> ListProductSetMembersResponse listProductSetMembers(id, page, limit)

Evaluate a set now and return a page of its member listings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductSetsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListProductSetMembersResponse = apiInstance.listProductSetMembers(id, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSetsApi#listProductSetMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSetsApi#listProductSetMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListProductSetMembersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listProductSets"></a>
# **listProductSets**
> ListProductSetsResponse listProductSets()

List your saved product sets with their live member counts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductSetsApi()
try {
    val result : ListProductSetsResponse = apiInstance.listProductSets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSetsApi#listProductSets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSetsApi#listProductSets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListProductSetsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProductSet"></a>
# **updateProductSet**
> ListProductSetsItem updateProductSet(id)

Update a set: rename, description, or replace its filters.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ProductSetsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListProductSetsItem = apiInstance.updateProductSet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSetsApi#updateProductSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSetsApi#updateProductSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListProductSetsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

