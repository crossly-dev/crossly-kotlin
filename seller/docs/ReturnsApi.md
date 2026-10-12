# ReturnsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPolicyReturnReceived**](ReturnsApi.md#createPolicyReturnReceived) | **POST** /v1/policy-returns/{id}/received | Mark a return received: refunds the buyer, less the restocking or try fee you keep.
[**createReturn**](ReturnsApi.md#createReturn) | **POST** /v1/returns | Open a return record on an order (rejects if another open return exists).
[**getReturn**](ReturnsApi.md#getReturn) | **GET** /v1/returns/{id} | Get one return record.
[**listPolicyReturns**](ReturnsApi.md#listPolicyReturns) | **GET** /v1/policy-returns | Returns Crossly buyers opened under your return policy or try at home; filter by orderId.
[**listReturns**](ReturnsApi.md#listReturns) | **GET** /v1/returns | List returns (physical-return workflow). status&#x3D;open|closed|&lt;exact&gt;.
[**updateReturn**](ReturnsApi.md#updateReturn) | **PATCH** /v1/returns/{id} | Transition return status (received/inspected/restocked) and bump inventory on restock.


<a name="createPolicyReturnReceived"></a>
# **createPolicyReturnReceived**
> CreatePolicyReturnReceivedResponse createPolicyReturnReceived(id)

Mark a return received: refunds the buyer, less the restocking or try fee you keep.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatePolicyReturnReceivedResponse = apiInstance.createPolicyReturnReceived(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#createPolicyReturnReceived")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#createPolicyReturnReceived")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatePolicyReturnReceivedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createReturn"></a>
# **createReturn**
> ListReturnsItem createReturn()

Open a return record on an order (rejects if another open return exists).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
try {
    val result : ListReturnsItem = apiInstance.createReturn()
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

**ListReturnsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReturn"></a>
# **getReturn**
> ListReturnsItem getReturn(id)

Get one return record.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListReturnsItem = apiInstance.getReturn(id)
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

**ListReturnsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPolicyReturns"></a>
# **listPolicyReturns**
> ListPolicyReturnsResponse listPolicyReturns()

Returns Crossly buyers opened under your return policy or try at home; filter by orderId.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
try {
    val result : ListPolicyReturnsResponse = apiInstance.listPolicyReturns()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#listPolicyReturns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#listPolicyReturns")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListPolicyReturnsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listReturns"></a>
# **listReturns**
> ListReturnsResponse listReturns()

List returns (physical-return workflow). status&#x3D;open|closed|&lt;exact&gt;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
try {
    val result : ListReturnsResponse = apiInstance.listReturns()
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

**ListReturnsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReturn"></a>
# **updateReturn**
> ListReturnsItem updateReturn(id)

Transition return status (received/inspected/restocked) and bump inventory on restock.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListReturnsItem = apiInstance.updateReturn(id)
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

**ListReturnsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

