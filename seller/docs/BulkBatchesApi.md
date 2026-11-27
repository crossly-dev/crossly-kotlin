# BulkBatchesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkBatch**](BulkBatchesApi.md#createBulkBatch) | **POST** /v1/bulk-batches | Open an empty capture batch for a preset.
[**createBulkBatchIdentify**](BulkBatchesApi.md#createBulkBatchIdentify) | **POST** /v1/bulk-batches/{id}/identify | Identify items: match to Crossly Market, Magic List, or auto (by preset). Runs in the background.
[**createBulkBatchItem**](BulkBatchesApi.md#createBulkBatchItem) | **POST** /v1/bulk-batches/{id}/items | Append one item (every photo of it, primary first).
[**createBulkBatchItemBulk**](BulkBatchesApi.md#createBulkBatchItemBulk) | **POST** /v1/bulk-batches/{id}/items/bulk | Set price/quantity/condition/status on many items.
[**createBulkBatchPublish**](BulkBatchesApi.md#createBulkBatchPublish) | **POST** /v1/bulk-batches/{id}/publish | Publish reviewed items: drafts only (default) or live on destinations; adds quantity to an existing matching listing.
[**deleteBulkBatch**](BulkBatchesApi.md#deleteBulkBatch) | **DELETE** /v1/bulk-batches/{id} | Discard a batch (listings it produced stay).
[**deleteBulkBatchItem**](BulkBatchesApi.md#deleteBulkBatchItem) | **DELETE** /v1/bulk-batches/items/{id} | Remove one unpublished item.
[**getBulkBatch**](BulkBatchesApi.md#getBulkBatch) | **GET** /v1/bulk-batches/{id} | Get one bulk batch with its items (capture order) and matched catalog rows.
[**listBulkBatches**](BulkBatchesApi.md#listBulkBatches) | **GET** /v1/bulk-batches | List recent bulk list batches, newest first.
[**updateBulkBatch**](BulkBatchesApi.md#updateBulkBatch) | **PATCH** /v1/bulk-batches/{id} | Change batch settings, or set stage \&quot;identify\&quot; when capture is done.
[**updateBulkBatchItem**](BulkBatchesApi.md#updateBulkBatchItem) | **PATCH** /v1/bulk-batches/items/{id} | Correct one item (match, title, price, photos…).


<a name="createBulkBatch"></a>
# **createBulkBatch**
> ListBulkBatchesItem createBulkBatch()

Open an empty capture batch for a preset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
try {
    val result : ListBulkBatchesItem = apiInstance.createBulkBatch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#createBulkBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#createBulkBatch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBulkBatchesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBulkBatchIdentify"></a>
# **createBulkBatchIdentify**
> CreateBulkBatchIdentifyResponse createBulkBatchIdentify(id)

Identify items: match to Crossly Market, Magic List, or auto (by preset). Runs in the background.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBulkBatchIdentifyResponse = apiInstance.createBulkBatchIdentify(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#createBulkBatchIdentify")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#createBulkBatchIdentify")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateBulkBatchIdentifyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBulkBatchItem"></a>
# **createBulkBatchItem**
> CreateBulkBatchItemResponse createBulkBatchItem(id)

Append one item (every photo of it, primary first).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBulkBatchItemResponse = apiInstance.createBulkBatchItem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#createBulkBatchItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#createBulkBatchItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateBulkBatchItemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBulkBatchItemBulk"></a>
# **createBulkBatchItemBulk**
> UpdatedResponse createBulkBatchItemBulk(id)

Set price/quantity/condition/status on many items.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdatedResponse = apiInstance.createBulkBatchItemBulk(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#createBulkBatchItemBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#createBulkBatchItemBulk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**UpdatedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBulkBatchPublish"></a>
# **createBulkBatchPublish**
> CreateBulkBatchPublishResponse createBulkBatchPublish(id)

Publish reviewed items: drafts only (default) or live on destinations; adds quantity to an existing matching listing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBulkBatchPublishResponse = apiInstance.createBulkBatchPublish(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#createBulkBatchPublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#createBulkBatchPublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateBulkBatchPublishResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBulkBatch"></a>
# **deleteBulkBatch**
> OkResponse deleteBulkBatch(id)

Discard a batch (listings it produced stay).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteBulkBatch(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#deleteBulkBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#deleteBulkBatch")
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

<a name="deleteBulkBatchItem"></a>
# **deleteBulkBatchItem**
> OkResponse deleteBulkBatchItem(id)

Remove one unpublished item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteBulkBatchItem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#deleteBulkBatchItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#deleteBulkBatchItem")
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

<a name="getBulkBatch"></a>
# **getBulkBatch**
> GetBulkBatchResponse getBulkBatch(id)

Get one bulk batch with its items (capture order) and matched catalog rows.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetBulkBatchResponse = apiInstance.getBulkBatch(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#getBulkBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#getBulkBatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetBulkBatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBulkBatches"></a>
# **listBulkBatches**
> ListBulkBatchesResponse listBulkBatches(limit)

List recent bulk list batches, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListBulkBatchesResponse = apiInstance.listBulkBatches(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#listBulkBatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#listBulkBatches")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListBulkBatchesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBulkBatch"></a>
# **updateBulkBatch**
> ListBulkBatchesItem updateBulkBatch(id)

Change batch settings, or set stage \&quot;identify\&quot; when capture is done.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListBulkBatchesItem = apiInstance.updateBulkBatch(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#updateBulkBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#updateBulkBatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListBulkBatchesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBulkBatchItem"></a>
# **updateBulkBatchItem**
> CreateBulkBatchItemResponse updateBulkBatchItem(id)

Correct one item (match, title, price, photos…).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BulkBatchesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBulkBatchItemResponse = apiInstance.updateBulkBatchItem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkBatchesApi#updateBulkBatchItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkBatchesApi#updateBulkBatchItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateBulkBatchItemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

