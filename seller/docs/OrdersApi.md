# OrdersApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrderBulkDelete**](OrdersApi.md#createOrderBulkDelete) | **POST** /v1/orders/bulk-delete | Bulk soft- or hard-delete orders by id.
[**createOrderBulkExport**](OrdersApi.md#createOrderBulkExport) | **POST** /v1/orders/bulk-export | Bulk export selected orders as CSV.
[**createOrderBulkMarkDisputed**](OrdersApi.md#createOrderBulkMarkDisputed) | **POST** /v1/orders/bulk-mark-disputed | Bulk mark orders as disputed with a shared reason.
[**createOrderBulkMarkShipped**](OrdersApi.md#createOrderBulkMarkShipped) | **POST** /v1/orders/bulk-mark-shipped | Bulk flip status&#x3D;shipped, clear the reserved-stock marker, and notify each platform.
[**createOrderBulkPackingSlip**](OrdersApi.md#createOrderBulkPackingSlip) | **POST** /v1/orders/bulk-packing-slips | Bulk packing slips PDF.
[**createOrderCancel**](OrdersApi.md#createOrderCancel) | **POST** /v1/orders/{id}/cancel | Cancel an order on its marketplace.
[**createOrderDispute**](OrdersApi.md#createOrderDispute) | **POST** /v1/orders/{id}/dispute | Flag an order as disputed.
[**createOrderImport**](OrdersApi.md#createOrderImport) | **POST** /v1/orders/import | Manually (re-)pull one or more connected platforms&#39; order history for a day-window.
[**createOrderLabel**](OrdersApi.md#createOrderLabel) | **POST** /v1/orders/{id}/label | Purchase EasyPost shipping label.
[**createOrderMessage**](OrdersApi.md#createOrderMessage) | **POST** /v1/orders/{id}/message | Message the order&#39;s buyer on the marketplace.
[**createOrderPullPlatformLabel**](OrdersApi.md#createOrderPullPlatformLabel) | **POST** /v1/orders/{id}/pull-platform-label | Pull a pre-paid label from cookie platforms (Poshmark/Mercari).
[**createOrderRate**](OrdersApi.md#createOrderRate) | **POST** /v1/orders/{id}/rates | EasyPost rate quote for an order.
[**createOrderRefund**](OrdersApi.md#createOrderRefund) | **POST** /v1/orders/{id}/refund | Issue a full or partial refund on the platform.
[**createOrderTracking**](OrdersApi.md#createOrderTracking) | **POST** /v1/orders/{id}/tracking | Submit tracking number + carrier and notify the platform.
[**getOrder**](OrdersApi.md#getOrder) | **GET** /v1/orders/{id} | Get one order.
[**getOrderCancelEligibility**](OrdersApi.md#getOrderCancelEligibility) | **GET** /v1/orders/{id}/cancel-eligibility | Whether this order can be cancelled, and which reason codes the marketplace accepts.
[**getOrderCount**](OrdersApi.md#getOrderCount) | **GET** /v1/orders/counts | Tab badge counts by status.
[**getOrderEvidence**](OrdersApi.md#getOrderEvidence) | **GET** /v1/orders/{id}/evidence | Everything recorded about how this order was packed and how it arrived.
[**getOrderPackingSlip**](OrdersApi.md#getOrderPackingSlip) | **GET** /v1/orders/{id}/packing-slip | Single-order packing slip PDF.
[**getOrderProofOfDelivery**](OrdersApi.md#getOrderProofOfDelivery) | **GET** /v1/orders/{id}/proof-of-delivery | Proof-of-delivery evidence from the carrier&#39;s scan record (PDF, or JSON).
[**getOrderShipment**](OrdersApi.md#getOrderShipment) | **GET** /v1/orders/{id}/shipments | List the parcels an order shipped in.
[**listOrderUnits**](OrdersApi.md#listOrderUnits) | **GET** /v1/orders/{id}/units | List the identified units that shipped on an order.
[**listOrders**](OrdersApi.md#listOrders) | **GET** /v1/orders | List orders.
[**updateOrder**](OrdersApi.md#updateOrder) | **PATCH** /v1/orders/{id} | Update order (status, notes, tracking).


<a name="createOrderBulkDelete"></a>
# **createOrderBulkDelete**
> CreateOrderBulkDeleteResponse createOrderBulkDelete()

Bulk soft- or hard-delete orders by id.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : CreateOrderBulkDeleteResponse = apiInstance.createOrderBulkDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderBulkDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderBulkDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateOrderBulkDeleteResponse**](CreateOrderBulkDeleteResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderBulkExport"></a>
# **createOrderBulkExport**
> kotlin.String createOrderBulkExport()

Bulk export selected orders as CSV.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : kotlin.String = apiInstance.createOrderBulkExport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderBulkExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderBulkExport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderBulkMarkDisputed"></a>
# **createOrderBulkMarkDisputed**
> CreateOrderBulkMarkDisputedResponse createOrderBulkMarkDisputed()

Bulk mark orders as disputed with a shared reason.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : CreateOrderBulkMarkDisputedResponse = apiInstance.createOrderBulkMarkDisputed()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderBulkMarkDisputed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderBulkMarkDisputed")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateOrderBulkMarkDisputedResponse**](CreateOrderBulkMarkDisputedResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderBulkMarkShipped"></a>
# **createOrderBulkMarkShipped**
> CreateOrderBulkMarkShippedResponse createOrderBulkMarkShipped()

Bulk flip status&#x3D;shipped, clear the reserved-stock marker, and notify each platform.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : CreateOrderBulkMarkShippedResponse = apiInstance.createOrderBulkMarkShipped()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderBulkMarkShipped")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderBulkMarkShipped")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateOrderBulkMarkShippedResponse**](CreateOrderBulkMarkShippedResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderBulkPackingSlip"></a>
# **createOrderBulkPackingSlip**
> java.io.File createOrderBulkPackingSlip()

Bulk packing slips PDF.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : java.io.File = apiInstance.createOrderBulkPackingSlip()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderBulkPackingSlip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderBulkPackingSlip")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderCancel"></a>
# **createOrderCancel**
> CreateOrderCancelResponse createOrderCancel(id)

Cancel an order on its marketplace.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderCancelResponse = apiInstance.createOrderCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateOrderCancelResponse**](CreateOrderCancelResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderDispute"></a>
# **createOrderDispute**
> CreateOrderDisputeResponse createOrderDispute(id)

Flag an order as disputed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderDisputeResponse = apiInstance.createOrderDispute(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderDispute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderDispute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateOrderDisputeResponse**](CreateOrderDisputeResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderImport"></a>
# **createOrderImport**
> CreateOrderImportResponse createOrderImport()

Manually (re-)pull one or more connected platforms&#39; order history for a day-window.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : CreateOrderImportResponse = apiInstance.createOrderImport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderImport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateOrderImportResponse**](CreateOrderImportResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderLabel"></a>
# **createOrderLabel**
> CreateOrderLabelResponse createOrderLabel(id)

Purchase EasyPost shipping label.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderLabelResponse = apiInstance.createOrderLabel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateOrderLabelResponse**](CreateOrderLabelResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderMessage"></a>
# **createOrderMessage**
> CreateOrderMessageResponse createOrderMessage(id)

Message the order&#39;s buyer on the marketplace.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderMessageResponse = apiInstance.createOrderMessage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateOrderMessageResponse**](CreateOrderMessageResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderPullPlatformLabel"></a>
# **createOrderPullPlatformLabel**
> CreateOrderPullPlatformLabelResponse createOrderPullPlatformLabel(id)

Pull a pre-paid label from cookie platforms (Poshmark/Mercari).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderPullPlatformLabelResponse = apiInstance.createOrderPullPlatformLabel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderPullPlatformLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderPullPlatformLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateOrderPullPlatformLabelResponse**](CreateOrderPullPlatformLabelResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderRate"></a>
# **createOrderRate**
> CreateOrderRateResponse createOrderRate(id)

EasyPost rate quote for an order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderRateResponse = apiInstance.createOrderRate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderRate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateOrderRateResponse**](CreateOrderRateResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderRefund"></a>
# **createOrderRefund**
> CreateOrderRefundResponse createOrderRefund(id)

Issue a full or partial refund on the platform.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderRefundResponse = apiInstance.createOrderRefund(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderRefund")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderRefund")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateOrderRefundResponse**](CreateOrderRefundResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderTracking"></a>
# **createOrderTracking**
> CreateOrderTrackingResponse createOrderTracking(id)

Submit tracking number + carrier and notify the platform.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderTrackingResponse = apiInstance.createOrderTracking(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderTracking")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderTracking")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateOrderTrackingResponse**](CreateOrderTrackingResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrder"></a>
# **getOrder**
> GetOrderResponse getOrder(id)

Get one order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderResponse = apiInstance.getOrder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetOrderResponse**](GetOrderResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderCancelEligibility"></a>
# **getOrderCancelEligibility**
> GetOrderCancelEligibilityResponse getOrderCancelEligibility(id)

Whether this order can be cancelled, and which reason codes the marketplace accepts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderCancelEligibilityResponse = apiInstance.getOrderCancelEligibility(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderCancelEligibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderCancelEligibility")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetOrderCancelEligibilityResponse**](GetOrderCancelEligibilityResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderCount"></a>
# **getOrderCount**
> kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt; getOrderCount()

Tab badge counts by status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : kotlin.collections.Map<kotlin.String, java.math.BigDecimal> = apiInstance.getOrderCount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderCount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderEvidence"></a>
# **getOrderEvidence**
> GetOrderEvidenceResponse getOrderEvidence(id)

Everything recorded about how this order was packed and how it arrived.

Returns the packing capture and its attestation verdict, the seal comparison (dispatch vs arrival), the buyer&#39;s arrival-condition state, and the identified units that shipped. Absence is reported as absence — an empty section means nothing was recorded, never that nothing happened.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetOrderEvidenceResponse = apiInstance.getOrderEvidence(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderEvidence")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderEvidence")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**GetOrderEvidenceResponse**](GetOrderEvidenceResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderPackingSlip"></a>
# **getOrderPackingSlip**
> java.io.File getOrderPackingSlip(id)

Single-order packing slip PDF.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : java.io.File = apiInstance.getOrderPackingSlip(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderPackingSlip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderPackingSlip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderProofOfDelivery"></a>
# **getOrderProofOfDelivery**
> GetOrderProofOfDeliveryResponse getOrderProofOfDelivery(id)

Proof-of-delivery evidence from the carrier&#39;s scan record (PDF, or JSON).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderProofOfDeliveryResponse = apiInstance.getOrderProofOfDelivery(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderProofOfDelivery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderProofOfDelivery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetOrderProofOfDeliveryResponse**](GetOrderProofOfDeliveryResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderShipment"></a>
# **getOrderShipment**
> GetOrderShipmentResponse getOrderShipment(id)

List the parcels an order shipped in.

An order can ship in more than one box: eBay allows a second label, Poshmark sells up to ten additional ones, and a bundle can need two. The order record carries only the PRIMARY parcel, so this is the only place the rest are visible. totalLabelCostCents sums every non-voided parcel — reading label cost off the order understates a multi-parcel order by a whole label.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderShipmentResponse = apiInstance.getOrderShipment(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderShipment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderShipment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetOrderShipmentResponse**](GetOrderShipmentResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrderUnits"></a>
# **listOrderUnits**
> V1List listOrderUnits(id)

List the identified units that shipped on an order.

The dispute-time read: what physically went out. An empty list means no identity was recorded, which is not the same as the order having no units.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : V1List = apiInstance.listOrderUnits(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listOrderUnits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listOrderUnits")
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

<a name="listOrders"></a>
# **listOrders**
> V1List listOrders(page, limit, status, platform)

List orders.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val status : kotlin.String = status_example // kotlin.String | 
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : V1List = apiInstance.listOrders(page, limit, status, platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional] [default to 1]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]
 **status** | **kotlin.String**|  | [optional]
 **platform** | **kotlin.String**|  | [optional]

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrder"></a>
# **updateOrder**
> UpdateOrderResponse updateOrder(id)

Update order (status, notes, tracking).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateOrderResponse = apiInstance.updateOrder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#updateOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#updateOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdateOrderResponse**](UpdateOrderResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

