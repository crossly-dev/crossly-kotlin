# SandboxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSandboxReset**](SandboxApi.md#createSandboxReset) | **POST** /v1/sandbox/reset | Restore the sandbox seller to its seed. Your grant and webhook subscriptions are kept.
[**createSandboxSimulateInventory**](SandboxApi.md#createSandboxSimulateInventory) | **POST** /v1/sandbox/simulate/inventory | Change stock (set, increase or decrease); the new quantity is pushed to every channel.
[**createSandboxSimulateListingSoldOut**](SandboxApi.md#createSandboxSimulateListingSoldOut) | **POST** /v1/sandbox/simulate/listing.sold_out | A listing sells out on a marketplace with no order (stock moves, other channels delist).
[**createSandboxSimulateOrder**](SandboxApi.md#createSandboxSimulateOrder) | **POST** /v1/sandbox/simulate/order | Simulate a sale through the real sale pipeline (order.created, sale.detected, stock and cross-channel updates).
[**createSandboxSimulateOrderAddress**](SandboxApi.md#createSandboxSimulateOrderAddress) | **POST** /v1/sandbox/simulate/order.address | The buyer address of an order simulated with address \&quot;delayed\&quot; arrives now (order.address_available).
[**createSandboxSimulateOrderCancelled**](SandboxApi.md#createSandboxSimulateOrderCancelled) | **POST** /v1/sandbox/simulate/order.cancelled | The buyer or the marketplace cancels an order (order.cancelled).
[**createSandboxSimulateOrderDelivered**](SandboxApi.md#createSandboxSimulateOrderDelivered) | **POST** /v1/sandbox/simulate/order.delivered | The carrier delivers a shipped order (order.delivered).
[**createSandboxSimulateRefund**](SandboxApi.md#createSandboxSimulateRefund) | **POST** /v1/sandbox/simulate/refund | Refund an order in full or in part (refund.issued).
[**getSandbox**](SandboxApi.md#getSandbox) | **GET** /v1/sandbox | The sandbox seller this token acts on, its simulated channels and the failure modes.
[**listSandboxEvents**](SandboxApi.md#listSandboxEvents) | **GET** /v1/sandbox/events | The simulated marketplaces&#39; call log: verb, channel, outcome, latency.


<a name="createSandboxReset"></a>
# **createSandboxReset**
> CreateSandboxResetResponse createSandboxReset()

Restore the sandbox seller to its seed. Your grant and webhook subscriptions are kept.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SandboxApi()
try {
    val result : CreateSandboxResetResponse = apiInstance.createSandboxReset()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SandboxApi#createSandboxReset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SandboxApi#createSandboxReset")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSandboxResetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSandboxSimulateInventory"></a>
# **createSandboxSimulateInventory**
> CreateInboxConversationBulkResponse createSandboxSimulateInventory()

Change stock (set, increase or decrease); the new quantity is pushed to every channel.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SandboxApi()
try {
    val result : CreateInboxConversationBulkResponse = apiInstance.createSandboxSimulateInventory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SandboxApi#createSandboxSimulateInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SandboxApi#createSandboxSimulateInventory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateInboxConversationBulkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSandboxSimulateListingSoldOut"></a>
# **createSandboxSimulateListingSoldOut**
> CreateSandboxSimulateListingsoldOutResponse createSandboxSimulateListingSoldOut()

A listing sells out on a marketplace with no order (stock moves, other channels delist).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SandboxApi()
try {
    val result : CreateSandboxSimulateListingsoldOutResponse = apiInstance.createSandboxSimulateListingSoldOut()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SandboxApi#createSandboxSimulateListingSoldOut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SandboxApi#createSandboxSimulateListingSoldOut")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSandboxSimulateListingsoldOutResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSandboxSimulateOrder"></a>
# **createSandboxSimulateOrder**
> CreateSandboxSimulateOrderResponse createSandboxSimulateOrder()

Simulate a sale through the real sale pipeline (order.created, sale.detected, stock and cross-channel updates).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SandboxApi()
try {
    val result : CreateSandboxSimulateOrderResponse = apiInstance.createSandboxSimulateOrder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SandboxApi#createSandboxSimulateOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SandboxApi#createSandboxSimulateOrder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSandboxSimulateOrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSandboxSimulateOrderAddress"></a>
# **createSandboxSimulateOrderAddress**
> CreateSandboxSimulateOrderaddressResponse createSandboxSimulateOrderAddress()

The buyer address of an order simulated with address \&quot;delayed\&quot; arrives now (order.address_available).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SandboxApi()
try {
    val result : CreateSandboxSimulateOrderaddressResponse = apiInstance.createSandboxSimulateOrderAddress()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SandboxApi#createSandboxSimulateOrderAddress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SandboxApi#createSandboxSimulateOrderAddress")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSandboxSimulateOrderaddressResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSandboxSimulateOrderCancelled"></a>
# **createSandboxSimulateOrderCancelled**
> CreateSandboxSimulateOrdercancelledResponse createSandboxSimulateOrderCancelled()

The buyer or the marketplace cancels an order (order.cancelled).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SandboxApi()
try {
    val result : CreateSandboxSimulateOrdercancelledResponse = apiInstance.createSandboxSimulateOrderCancelled()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SandboxApi#createSandboxSimulateOrderCancelled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SandboxApi#createSandboxSimulateOrderCancelled")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSandboxSimulateOrdercancelledResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSandboxSimulateOrderDelivered"></a>
# **createSandboxSimulateOrderDelivered**
> CreateSandboxSimulateOrderdeliveredResponse createSandboxSimulateOrderDelivered()

The carrier delivers a shipped order (order.delivered).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SandboxApi()
try {
    val result : CreateSandboxSimulateOrderdeliveredResponse = apiInstance.createSandboxSimulateOrderDelivered()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SandboxApi#createSandboxSimulateOrderDelivered")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SandboxApi#createSandboxSimulateOrderDelivered")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSandboxSimulateOrderdeliveredResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSandboxSimulateRefund"></a>
# **createSandboxSimulateRefund**
> CreateSandboxSimulateRefundResponse createSandboxSimulateRefund()

Refund an order in full or in part (refund.issued).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SandboxApi()
try {
    val result : CreateSandboxSimulateRefundResponse = apiInstance.createSandboxSimulateRefund()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SandboxApi#createSandboxSimulateRefund")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SandboxApi#createSandboxSimulateRefund")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSandboxSimulateRefundResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSandbox"></a>
# **getSandbox**
> GetSandboxResponse getSandbox()

The sandbox seller this token acts on, its simulated channels and the failure modes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SandboxApi()
try {
    val result : GetSandboxResponse = apiInstance.getSandbox()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SandboxApi#getSandbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SandboxApi#getSandbox")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSandboxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSandboxEvents"></a>
# **listSandboxEvents**
> ListSandboxEventsResponse listSandboxEvents()

The simulated marketplaces&#39; call log: verb, channel, outcome, latency.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SandboxApi()
try {
    val result : ListSandboxEventsResponse = apiInstance.listSandboxEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SandboxApi#listSandboxEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SandboxApi#listSandboxEvents")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSandboxEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

