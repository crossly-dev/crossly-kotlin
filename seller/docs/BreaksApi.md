# BreaksApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBreak**](BreaksApi.md#createBreak) | **POST** /v1/breaks | Start a break on one of your listings: pick (buyers choose a spot) or random (drawn). The seed is committed now and revealed at the draw.
[**createBreakCancel**](BreaksApi.md#createBreakCancel) | **POST** /v1/breaks/{id}/cancel | Cancel a break before any spot is paid for; after that, refund those orders instead (409).
[**createBreakDraw**](BreaksApi.md#createBreakDraw) | **POST** /v1/breaks/{id}/draw | Draw a sold-out random break: assigns spots from the committed seed and reveals it.
[**createBreakOpened**](BreaksApi.md#createBreakOpened) | **POST** /v1/breaks/{id}/opened | Mark the product opened on stream.
[**createBreakSpotHit**](BreaksApi.md#createBreakSpotHit) | **POST** /v1/breaks/{id}/spots/{spotId}/hits | Record what a spot pulled.
[**getBreak**](BreaksApi.md#getBreak) | **GET** /v1/breaks/{id} | A break’s board with every spot, its buyer and its hits.
[**listBreaks**](BreaksApi.md#listBreaks) | **GET** /v1/breaks | Your card breaks, newest first.


<a name="createBreak"></a>
# **createBreak**
> CreateBreakResponse createBreak()

Start a break on one of your listings: pick (buyers choose a spot) or random (drawn). The seed is committed now and revealed at the draw.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BreaksApi()
try {
    val result : CreateBreakResponse = apiInstance.createBreak()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BreaksApi#createBreak")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BreaksApi#createBreak")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBreakResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBreakCancel"></a>
# **createBreakCancel**
> CreateBreakCancelResponse createBreakCancel(id)

Cancel a break before any spot is paid for; after that, refund those orders instead (409).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BreaksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBreakCancelResponse = apiInstance.createBreakCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BreaksApi#createBreakCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BreaksApi#createBreakCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBreakCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBreakDraw"></a>
# **createBreakDraw**
> CreateBreakDrawResponse createBreakDraw(id)

Draw a sold-out random break: assigns spots from the committed seed and reveals it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BreaksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBreakDrawResponse = apiInstance.createBreakDraw(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BreaksApi#createBreakDraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BreaksApi#createBreakDraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBreakDrawResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBreakOpened"></a>
# **createBreakOpened**
> CreateBreakCancelResponse createBreakOpened(id)

Mark the product opened on stream.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BreaksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBreakCancelResponse = apiInstance.createBreakOpened(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BreaksApi#createBreakOpened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BreaksApi#createBreakOpened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBreakCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBreakSpotHit"></a>
# **createBreakSpotHit**
> CreateBreakCancelResponse createBreakSpotHit(id, spotId)

Record what a spot pulled.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BreaksApi()
val id : kotlin.String = id_example // kotlin.String | 
val spotId : kotlin.String = spotId_example // kotlin.String | 
try {
    val result : CreateBreakCancelResponse = apiInstance.createBreakSpotHit(id, spotId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BreaksApi#createBreakSpotHit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BreaksApi#createBreakSpotHit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **spotId** | **kotlin.String**|  |

### Return type

**CreateBreakCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBreak"></a>
# **getBreak**
> GetBreakResponse getBreak(id)

A break’s board with every spot, its buyer and its hits.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BreaksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBreakResponse = apiInstance.getBreak(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BreaksApi#getBreak")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BreaksApi#getBreak")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBreakResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBreaks"></a>
# **listBreaks**
> ListBreaksResponse listBreaks()

Your card breaks, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BreaksApi()
try {
    val result : ListBreaksResponse = apiInstance.listBreaks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BreaksApi#listBreaks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BreaksApi#listBreaks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBreaksResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

