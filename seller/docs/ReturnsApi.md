# ReturnsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPolicyReturnReceived**](ReturnsApi.md#createPolicyReturnReceived) | **POST** /v1/policy-returns/{id}/received | Mark a return received: refunds the buyer, less the restocking or try fee you keep.
[**createReturn**](ReturnsApi.md#createReturn) | **POST** /v1/returns | Open a return record on an order (rejects if another open return exists).
[**createReturnAccept**](ReturnsApi.md#createReturnAccept) | **POST** /v1/returns/{id}/accept | Accept a Crossly-marketplace return request: a prepaid return label to your return address (the buyer has 14 days to ship), a return record linked to it, and optionally a refund now (refund: { amount? } in dollars; needs orders:refund). Without one, the rest is refunded when the return is delivered. Safe to repeat. Crossposted orders: not_supported_on_platform.
[**createReturnDecline**](ReturnsApi.md#createReturnDecline) | **POST** /v1/returns/{id}/decline | Decline a Crossly-marketplace return request with a reason (required, 8-2000 chars), posted to the buyer as your response. It does not close the request: the buyer can reply or ask Crossly to decide. Not after the label is issued.
[**getReturn**](ReturnsApi.md#getReturn) | **GET** /v1/returns/{id} | Get one return record.
[**listPolicyReturns**](ReturnsApi.md#listPolicyReturns) | **GET** /v1/policy-returns | Returns Crossly buyers opened under your return policy or try at home; filter by orderId.
[**listReturns**](ReturnsApi.md#listReturns) | **GET** /v1/returns | List returns. Default: your return records (the physical-return workflow), status&#x3D;open|closed|&lt;exact&gt;. source&#x3D;request: the OPEN return requests buyers made on the Crossly marketplace, newest first; accept or decline each with POST /v1/returns/{id}/accept | decline.
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
> GetReturnResponse createReturn()

Open a return record on an order (rejects if another open return exists).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
try {
    val result : GetReturnResponse = apiInstance.createReturn()
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

**GetReturnResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createReturnAccept"></a>
# **createReturnAccept**
> CreateReturnAcceptResponse createReturnAccept(id)

Accept a Crossly-marketplace return request: a prepaid return label to your return address (the buyer has 14 days to ship), a return record linked to it, and optionally a refund now (refund: { amount? } in dollars; needs orders:refund). Without one, the rest is refunded when the return is delivered. Safe to repeat. Crossposted orders: not_supported_on_platform.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateReturnAcceptResponse = apiInstance.createReturnAccept(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#createReturnAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#createReturnAccept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateReturnAcceptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createReturnDecline"></a>
# **createReturnDecline**
> ListReturnsItem createReturnDecline(id, createReturnDeclineRequest)

Decline a Crossly-marketplace return request with a reason (required, 8-2000 chars), posted to the buyer as your response. It does not close the request: the buyer can reply or ask Crossly to decide. Not after the label is issued.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createReturnDeclineRequest : CreateReturnDeclineRequest =  // CreateReturnDeclineRequest | 
try {
    val result : ListReturnsItem = apiInstance.createReturnDecline(id, createReturnDeclineRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#createReturnDecline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#createReturnDecline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **createReturnDeclineRequest** | **CreateReturnDeclineRequest**|  |

### Return type

**ListReturnsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
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

**GetReturnResponse**

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

List returns. Default: your return records (the physical-return workflow), status&#x3D;open|closed|&lt;exact&gt;. source&#x3D;request: the OPEN return requests buyers made on the Crossly marketplace, newest first; accept or decline each with POST /v1/returns/{id}/accept | decline.

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
> GetReturnResponse updateReturn(id)

Transition return status (received/inspected/restocked) and bump inventory on restock.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ReturnsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetReturnResponse = apiInstance.updateReturn(id)
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

**GetReturnResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

