# OrdersApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLiveShipmentLabel**](OrdersApi.md#createLiveShipmentLabel) | **POST** /v1/live-shipments/{id}/label | Buy ONE label for a show box, rated for all its orders packed together; every order takes its tracking and the buyer’s extra postage is refunded.
[**createLiveShipmentShip**](OrdersApi.md#createLiveShipmentShip) | **POST** /v1/live-shipments/{id}/ship | Ship a show box with your own label: every order is marked shipped with this tracking and the buyer’s extra postage is refunded.
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
[**createOrderPickup**](OrdersApi.md#createOrderPickup) | **POST** /v1/orders/pickups | Book a carrier pickup for labelled orders (one carrier per pickup; window at least an hour, up to 14 days ahead).
[**createOrderPickupLabel**](OrdersApi.md#createOrderPickupLabel) | **POST** /v1/orders/{id}/pickup-label | Buy the carrier label for a Crossly order the buyer collects from a pickup point (debits your shipping wallet). 402 when the wallet is short.
[**createOrderPullPlatformLabel**](OrdersApi.md#createOrderPullPlatformLabel) | **POST** /v1/orders/{id}/pull-platform-label | Pull a pre-paid label from cookie platforms (Poshmark/Mercari).
[**createOrderRate**](OrdersApi.md#createOrderRate) | **POST** /v1/orders/{id}/rates | EasyPost rate quote for an order.
[**createOrderRefund**](OrdersApi.md#createOrderRefund) | **POST** /v1/orders/{id}/refund | Issue a full or partial refund on the platform.
[**createOrderScanForm**](OrdersApi.md#createOrderScanForm) | **POST** /v1/orders/scan-forms | Create SCAN forms (one per carrier account and ship-from address) for labels the carrier has not scanned yet.
[**createOrderTracking**](OrdersApi.md#createOrderTracking) | **POST** /v1/orders/{id}/tracking | Submit tracking number + carrier and notify the platform.
[**createOrderWhatnotLabel**](OrdersApi.md#createOrderWhatnotLabel) | **POST** /v1/orders/{id}/whatnot/label | Generate the Whatnot shipping label and record it on the order.
[**createOrderWhatnotPackage**](OrdersApi.md#createOrderWhatnotPackage) | **POST** /v1/orders/{id}/whatnot/package | Save a Whatnot shipment package (weight oz, box inches).
[**createOrderWhatnotPackageQuote**](OrdersApi.md#createOrderWhatnotPackageQuote) | **POST** /v1/orders/{id}/whatnot/package/quote | Quote what a Whatnot package change costs (cents).
[**createRentalApprove**](OrdersApi.md#createRentalApprove) | **POST** /v1/rentals/{id}/approve | Approve a requested rental (offers with requireApproval): the renter’s held card is charged.
[**createRentalCancel**](OrdersApi.md#createRentalCancel) | **POST** /v1/rentals/{id}/cancel | Cancel a booked rental that has not shipped: the renter is refunded in full.
[**createRentalClaim**](OrdersApi.md#createRentalClaim) | **POST** /v1/rentals/{id}/claim | Claim part or all of the deposit (cents, a note, photo URLs): within 3 days of the return, or 14 days after the end if it never came back.
[**createRentalDecline**](OrdersApi.md#createRentalDecline) | **POST** /v1/rentals/{id}/decline | Decline a requested rental: the hold on the renter’s card is released.
[**createRentalLabel**](OrdersApi.md#createRentalLabel) | **POST** /v1/rentals/{id}/labels | Buy both labels for a booked rental: outbound to the renter, and the return label they use.
[**createRentalReturned**](OrdersApi.md#createRentalReturned) | **POST** /v1/rentals/{id}/returned | Mark a rental back with you. You then have 3 days to claim damage before the deposit goes back.
[**createRentalShipped**](OrdersApi.md#createRentalShipped) | **POST** /v1/rentals/{id}/shipped | Mark a booked rental shipped, with at least 2 photos of its condition as it leaves (URLs you uploaded) — the evidence any later claim is judged against.
[**getOrder**](OrdersApi.md#getOrder) | **GET** /v1/orders/{id} | Get one order.
[**getOrderCancelEligibility**](OrdersApi.md#getOrderCancelEligibility) | **GET** /v1/orders/{id}/cancel-eligibility | Whether this order can be cancelled, and which reason codes the marketplace accepts.
[**getOrderCount**](OrdersApi.md#getOrderCount) | **GET** /v1/orders/counts | Tab badge counts by status.
[**getOrderEvidence**](OrdersApi.md#getOrderEvidence) | **GET** /v1/orders/{id}/evidence | Everything recorded about how this order was packed and how it arrived.
[**getOrderLabelPrint**](OrdersApi.md#getOrderLabelPrint) | **GET** /v1/orders/{id}/label/print | The order&#39;s shipping label as a PDF sized for printing (cropped, upright, fitted).
[**getOrderPackingSlip**](OrdersApi.md#getOrderPackingSlip) | **GET** /v1/orders/{id}/packing-slip | Single-order packing slip PDF.
[**getOrderProofOfDelivery**](OrdersApi.md#getOrderProofOfDelivery) | **GET** /v1/orders/{id}/proof-of-delivery | Proof-of-delivery evidence from the carrier&#39;s scan record (PDF, or JSON).
[**getOrderScanForm**](OrdersApi.md#getOrderScanForm) | **GET** /v1/orders/scan-forms/{id} | One SCAN form; a queued form is re-read from the carrier and its PDF appears once built.
[**getOrderShipment**](OrdersApi.md#getOrderShipment) | **GET** /v1/orders/{id}/shipments | List the parcels an order shipped in.
[**getOrderWhatnotPackingSlip**](OrdersApi.md#getOrderWhatnotPackingSlip) | **GET** /v1/orders/{id}/whatnot/packing-slip | A fresh link to Whatnot&#39;s packing slip PDF.
[**getOrderWhatnotShipment**](OrdersApi.md#getOrderWhatnotShipment) | **GET** /v1/orders/{id}/whatnot/shipment | Whatnot shipment for an order (package, label, tracking). Records a label found on it.
[**listLayaways**](OrdersApi.md#listLayaways) | **GET** /v1/layaways | Your items on layaway (active and paid off). Do not ship an active one: its order moves to needs_fulfillment when paid in full.
[**listLiveShipments**](OrdersApi.md#listLiveShipments) | **GET** /v1/live-shipments | Your show boxes: every buyer’s orders from one live show, to ship together.
[**listOrderPickupReady**](OrdersApi.md#listOrderPickupReady) | **GET** /v1/orders/pickup-ready | Orders with a purchased Shippo label a courier can collect or a SCAN form can cover, grouped by carrier.
[**listOrderPickups**](OrdersApi.md#listOrderPickups) | **GET** /v1/orders/pickups | Booked carrier pickups, newest first.
[**listOrderScanForms**](OrdersApi.md#listOrderScanForms) | **GET** /v1/orders/scan-forms | SCAN forms, newest first.
[**listOrderUnits**](OrdersApi.md#listOrderUnits) | **GET** /v1/orders/{id}/units | List the identified units that shipped on an order.
[**listOrders**](OrdersApi.md#listOrders) | **GET** /v1/orders | List orders.
[**listRentals**](OrdersApi.md#listRentals) | **GET** /v1/rentals | Rentals of your items, with the ship-to and the outbound label.
[**updateOrder**](OrdersApi.md#updateOrder) | **PATCH** /v1/orders/{id} | Update order (status, notes, tracking).


<a name="createLiveShipmentLabel"></a>
# **createLiveShipmentLabel**
> CreateLiveShipmentShipResponse createLiveShipmentLabel(id)

Buy ONE label for a show box, rated for all its orders packed together; every order takes its tracking and the buyer’s extra postage is refunded.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateLiveShipmentShipResponse = apiInstance.createLiveShipmentLabel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createLiveShipmentLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createLiveShipmentLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateLiveShipmentShipResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLiveShipmentShip"></a>
# **createLiveShipmentShip**
> CreateLiveShipmentShipResponse createLiveShipmentShip(id)

Ship a show box with your own label: every order is marked shipped with this tracking and the buyer’s extra postage is refunded.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateLiveShipmentShipResponse = apiInstance.createLiveShipmentShip(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createLiveShipmentShip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createLiveShipmentShip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateLiveShipmentShipResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

**CreateOrderBulkDeleteResponse**

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
> CreateInventoryLabelRenameResponse createOrderBulkMarkDisputed()

Bulk mark orders as disputed with a shared reason.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : CreateInventoryLabelRenameResponse = apiInstance.createOrderBulkMarkDisputed()
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

**CreateInventoryLabelRenameResponse**

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

**CreateOrderBulkMarkShippedResponse**

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

**java.io.File**

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

**CreateOrderCancelResponse**

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

**CreateOrderDisputeResponse**

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

**CreateOrderImportResponse**

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

**CreateOrderLabelResponse**

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

**CreateOrderMessageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderPickup"></a>
# **createOrderPickup**
> CreateOrderPickupResponse createOrderPickup()

Book a carrier pickup for labelled orders (one carrier per pickup; window at least an hour, up to 14 days ahead).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : CreateOrderPickupResponse = apiInstance.createOrderPickup()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderPickup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderPickup")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateOrderPickupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderPickupLabel"></a>
# **createOrderPickupLabel**
> CreateOrderPickupLabelResponse createOrderPickupLabel(id)

Buy the carrier label for a Crossly order the buyer collects from a pickup point (debits your shipping wallet). 402 when the wallet is short.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateOrderPickupLabelResponse = apiInstance.createOrderPickupLabel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderPickupLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderPickupLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateOrderPickupLabelResponse**

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

**CreateOrderPullPlatformLabelResponse**

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

**CreateOrderRateResponse**

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

**CreateOrderRefundResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderScanForm"></a>
# **createOrderScanForm**
> CreateOrderScanFormResponse createOrderScanForm()

Create SCAN forms (one per carrier account and ship-from address) for labels the carrier has not scanned yet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : CreateOrderScanFormResponse = apiInstance.createOrderScanForm()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderScanForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderScanForm")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateOrderScanFormResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderTracking"></a>
# **createOrderTracking**
> CreateInboxOfferResponse createOrderTracking(id)

Submit tracking number + carrier and notify the platform.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateInboxOfferResponse = apiInstance.createOrderTracking(id)
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

**CreateInboxOfferResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderWhatnotLabel"></a>
# **createOrderWhatnotLabel**
> CreateOrderWhatnotLabelResponse createOrderWhatnotLabel(id)

Generate the Whatnot shipping label and record it on the order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderWhatnotLabelResponse = apiInstance.createOrderWhatnotLabel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderWhatnotLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderWhatnotLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderWhatnotLabelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderWhatnotPackage"></a>
# **createOrderWhatnotPackage**
> CreateOrderWhatnotLabelResponse createOrderWhatnotPackage(id)

Save a Whatnot shipment package (weight oz, box inches).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderWhatnotLabelResponse = apiInstance.createOrderWhatnotPackage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderWhatnotPackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderWhatnotPackage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderWhatnotLabelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderWhatnotPackageQuote"></a>
# **createOrderWhatnotPackageQuote**
> CreateOrderWhatnotPackageQuoteResponse createOrderWhatnotPackageQuote(id)

Quote what a Whatnot package change costs (cents).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderWhatnotPackageQuoteResponse = apiInstance.createOrderWhatnotPackageQuote(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderWhatnotPackageQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderWhatnotPackageQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderWhatnotPackageQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRentalApprove"></a>
# **createRentalApprove**
> RentalResponse createRentalApprove(id)

Approve a requested rental (offers with requireApproval): the renter’s held card is charged.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalApprove(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalApprove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalApprove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**RentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRentalCancel"></a>
# **createRentalCancel**
> RentalResponse createRentalCancel(id)

Cancel a booked rental that has not shipped: the renter is refunded in full.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**RentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRentalClaim"></a>
# **createRentalClaim**
> RentalResponse createRentalClaim(id)

Claim part or all of the deposit (cents, a note, photo URLs): within 3 days of the return, or 14 days after the end if it never came back.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalClaim(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalClaim")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**RentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRentalDecline"></a>
# **createRentalDecline**
> RentalResponse createRentalDecline(id)

Decline a requested rental: the hold on the renter’s card is released.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalDecline(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalDecline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalDecline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**RentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRentalLabel"></a>
# **createRentalLabel**
> RentalResponse createRentalLabel(id)

Buy both labels for a booked rental: outbound to the renter, and the return label they use.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalLabel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**RentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRentalReturned"></a>
# **createRentalReturned**
> RentalResponse createRentalReturned(id)

Mark a rental back with you. You then have 3 days to claim damage before the deposit goes back.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalReturned(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalReturned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalReturned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**RentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRentalShipped"></a>
# **createRentalShipped**
> RentalResponse createRentalShipped(id)

Mark a booked rental shipped, with at least 2 photos of its condition as it leaves (URLs you uploaded) — the evidence any later claim is judged against.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalShipped(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalShipped")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalShipped")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**RentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrder"></a>
# **getOrder**
> ListOrdersItem getOrder(id)

Get one order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListOrdersItem = apiInstance.getOrder(id)
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

**ListOrdersItem**

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

**GetOrderCancelEligibilityResponse**

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

**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**

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

**GetOrderEvidenceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderLabelPrint"></a>
# **getOrderLabelPrint**
> java.io.File getOrderLabelPrint(id, size, flip, parcelId)

The order&#39;s shipping label as a PDF sized for printing (cropped, upright, fitted).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val size : kotlin.String = size_example // kotlin.String | Paper. Default 4x6.
val flip : kotlin.String = flip_example // kotlin.String | Turn the label a half turn.
val parcelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | A specific parcel's label; default the order's primary.
try {
    val result : java.io.File = apiInstance.getOrderLabelPrint(id, size, flip, parcelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderLabelPrint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderLabelPrint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **size** | **kotlin.String**| Paper. Default 4x6. | [optional] [enum: 4x6, letter, a4, native]
 **flip** | **kotlin.String**| Turn the label a half turn. | [optional] [enum: 0, 1, true, false]
 **parcelId** | **java.util.UUID**| A specific parcel&#39;s label; default the order&#39;s primary. | [optional]

### Return type

**java.io.File**

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

**java.io.File**

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

**GetOrderProofOfDeliveryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderScanForm"></a>
# **getOrderScanForm**
> GetOrderScanFormResponse getOrderScanForm(id)

One SCAN form; a queued form is re-read from the carrier and its PDF appears once built.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetOrderScanFormResponse = apiInstance.getOrderScanForm(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderScanForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderScanForm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetOrderScanFormResponse**

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

**GetOrderShipmentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderWhatnotPackingSlip"></a>
# **getOrderWhatnotPackingSlip**
> GetOrderWhatnotPackingSlipResponse getOrderWhatnotPackingSlip(id)

A fresh link to Whatnot&#39;s packing slip PDF.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderWhatnotPackingSlipResponse = apiInstance.getOrderWhatnotPackingSlip(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderWhatnotPackingSlip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderWhatnotPackingSlip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetOrderWhatnotPackingSlipResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderWhatnotShipment"></a>
# **getOrderWhatnotShipment**
> CreateOrderWhatnotLabelResponse getOrderWhatnotShipment(id)

Whatnot shipment for an order (package, label, tracking). Records a label found on it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderWhatnotLabelResponse = apiInstance.getOrderWhatnotShipment(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderWhatnotShipment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderWhatnotShipment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderWhatnotLabelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLayaways"></a>
# **listLayaways**
> ListLayawaysResponse listLayaways()

Your items on layaway (active and paid off). Do not ship an active one: its order moves to needs_fulfillment when paid in full.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : ListLayawaysResponse = apiInstance.listLayaways()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listLayaways")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listLayaways")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListLayawaysResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLiveShipments"></a>
# **listLiveShipments**
> ListLiveShipmentsResponse listLiveShipments()

Your show boxes: every buyer’s orders from one live show, to ship together.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : ListLiveShipmentsResponse = apiInstance.listLiveShipments()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listLiveShipments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listLiveShipments")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListLiveShipmentsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrderPickupReady"></a>
# **listOrderPickupReady**
> ListOrderPickupReadyResponse listOrderPickupReady()

Orders with a purchased Shippo label a courier can collect or a SCAN form can cover, grouped by carrier.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : ListOrderPickupReadyResponse = apiInstance.listOrderPickupReady()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listOrderPickupReady")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listOrderPickupReady")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListOrderPickupReadyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrderPickups"></a>
# **listOrderPickups**
> ListOrderPickupsResponse listOrderPickups()

Booked carrier pickups, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : ListOrderPickupsResponse = apiInstance.listOrderPickups()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listOrderPickups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listOrderPickups")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListOrderPickupsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrderScanForms"></a>
# **listOrderScanForms**
> ListOrderScanFormsResponse listOrderScanForms()

SCAN forms, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : ListOrderScanFormsResponse = apiInstance.listOrderScanForms()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listOrderScanForms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listOrderScanForms")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListOrderScanFormsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrderUnits"></a>
# **listOrderUnits**
> ListOrderUnitsResponse listOrderUnits(id)

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
    val result : ListOrderUnitsResponse = apiInstance.listOrderUnits(id)
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

**ListOrderUnitsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrders"></a>
# **listOrders**
> ListOrdersResponse listOrders(page, limit, status, platform)

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
    val result : ListOrdersResponse = apiInstance.listOrders(page, limit, status, platform)
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

**ListOrdersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRentals"></a>
# **listRentals**
> ListRentalsResponse listRentals()

Rentals of your items, with the ship-to and the outbound label.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : ListRentalsResponse = apiInstance.listRentals()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listRentals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listRentals")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListRentalsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrder"></a>
# **updateOrder**
> ListOrdersItem updateOrder(id)

Update order (status, notes, tracking).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListOrdersItem = apiInstance.updateOrder(id)
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

**ListOrdersItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

