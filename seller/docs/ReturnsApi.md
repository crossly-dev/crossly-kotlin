# ReturnsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReturn**](ReturnsApi.md#createReturn) | **POST** /v1/returns | Open a return record on an order (rejects if another open return exists).
[**getReturn**](ReturnsApi.md#getReturn) | **GET** /v1/returns/{id} | Get one return record.
[**listReturns**](ReturnsApi.md#listReturns) | **GET** /v1/returns | List returns (physical-return workflow). status&#x3D;open|closed|&lt;exact&gt;.
[**updateReturn**](ReturnsApi.md#updateReturn) | **PATCH** /v1/returns/{id} | Transition return status (received/inspected/restocked) and bump inventory on restock.


<a name="createReturn"></a>
# **createReturn**
> CreateReturnResponse createReturn()

Open a return record on an order (rejects if another open return exists).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
try {
    val result : CreateReturnResponse = apiInstance.createReturn()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#createReturn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#createReturn")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateReturnResponse**](CreateReturnResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturn"></a>
# **getReturn**
> GetReturnResponse getReturn(id)

Get one return record.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetReturnResponse = apiInstance.getReturn(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#getReturn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#getReturn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetReturnResponse**](GetReturnResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listReturns"></a>
# **listReturns**
> V1List listReturns()

List returns (physical-return workflow). status&#x3D;open|closed|&lt;exact&gt;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
try {
    val result : V1List = apiInstance.listReturns()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#listReturns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#listReturns")
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

<a name="updateReturn"></a>
# **updateReturn**
> UpdateReturnResponse updateReturn(id)

Transition return status (received/inspected/restocked) and bump inventory on restock.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateReturnResponse = apiInstance.updateReturn(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#updateReturn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#updateReturn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdateReturnResponse**](UpdateReturnResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

