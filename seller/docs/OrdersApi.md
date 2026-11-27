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
[**createOrderCancel**](OrdersApi.md#createOrderCancel) | **POST** /v1/orders/{id}/cancel | Cancel an order before it ships. Crossly-marketplace orders refund the buyer (also needs orders:refund) and restock; crossposted orders go to the marketplace, or fail not_supported_on_platform (recordOnly: true records a cancel made on the marketplace). Fires order.cancelled.
[**createOrderCorrectTracking**](OrdersApi.md#createOrderCorrectTracking) | **POST** /v1/orders/{id}/correct-tracking | Correct a wrong tracking number the marketplace already holds.
[**createOrderDispute**](OrdersApi.md#createOrderDispute) | **POST** /v1/orders/{id}/dispute | Flag an order as disputed.
[**createOrderImport**](OrdersApi.md#createOrderImport) | **POST** /v1/orders/import | Manually (re-)pull one or more connected platforms&#39; order history for a day-window.
[**createOrderLabel**](OrdersApi.md#createOrderLabel) | **POST** /v1/orders/{id}/label | Purchase a Crossly Shipping label. An order that already has a label answers 409 label_exists unless allowSecondLabel is true.
[**createOrderLabelVoid**](OrdersApi.md#createOrderLabelVoid) | **POST** /v1/orders/{id}/label/void | Void a Crossly Shipping label and refund it to the shipping wallet.
[**createOrderLinkListing**](OrdersApi.md#createOrderLinkListing) | **POST** /v1/orders/{id}/link-listing | Link an unmatched sale to one of your listings (marks it sold, delists it elsewhere).
[**createOrderMessage**](OrdersApi.md#createOrderMessage) | **POST** /v1/orders/{id}/message | Message the order&#39;s buyer on the marketplace.
[**createOrderOrderChat**](OrdersApi.md#createOrderOrderChat) | **POST** /v1/orders/{id}/order-chat | Send a message to the order&#39;s buyer chat on the marketplace. Mirrored into the Crossly inbox.
[**createOrderPickup**](OrdersApi.md#createOrderPickup) | **POST** /v1/orders/pickups | Book a carrier pickup for labelled orders (one carrier per pickup; window at least an hour, up to 14 days ahead).
[**createOrderPickupLabel**](OrdersApi.md#createOrderPickupLabel) | **POST** /v1/orders/{id}/pickup-label | Buy the carrier label for a Crossly order the buyer collects from a pickup point (debits your shipping wallet). 402 when the wallet is short. An order that already has a label answers 409 label_exists unless allowSecondLabel is true.
[**createOrderPlatformLabelPackage**](OrdersApi.md#createOrderPlatformLabelPackage) | **POST** /v1/orders/{id}/platform-label/package | Save the package (weight oz, box inches) the marketplace prices the label from.
[**createOrderPlatformLabelPackageQuote**](OrdersApi.md#createOrderPlatformLabelPackageQuote) | **POST** /v1/orders/{id}/platform-label/package/quote | Quote what a change to the marketplace shipment&#39;s package costs (cents).
[**createOrderPlatformLabelPull**](OrdersApi.md#createOrderPlatformLabelPull) | **POST** /v1/orders/{id}/platform-label/pull | Pull the marketplace&#39;s prepaid label into Crossly (every platform with a label descriptor).
[**createOrderPlatformLabelPurchase**](OrdersApi.md#createOrderPlatformLabelPurchase) | **POST** /v1/orders/{id}/platform-label/purchase | Buy a replacement / extra marketplace label, or have the marketplace generate it, and record it.
[**createOrderPlatformLabelQuote**](OrdersApi.md#createOrderPlatformLabelQuote) | **POST** /v1/orders/{id}/platform-label/quote | Quote what buying a marketplace label costs, before you are charged.
[**createOrderPullPlatformLabel**](OrdersApi.md#createOrderPullPlatformLabel) | **POST** /v1/orders/{id}/pull-platform-label | Pull a pre-paid label from cookie platforms (Poshmark/Mercari).
[**createOrderRate**](OrdersApi.md#createOrderRate) | **POST** /v1/orders/{id}/rates | Crossly Shipping rate quote for an order.
[**createOrderRefund**](OrdersApi.md#createOrderRefund) | **POST** /v1/orders/{id}/refund | DEPRECATED: use POST /v1/orders/{id}/refunds. Full or partial refund (amount in dollars). Same idempotency and cap as /refunds: the same request twice refunds once (Idempotency-Key, else the body), never past what the buyer paid.
[**createOrderRefundById**](OrdersApi.md#createOrderRefundById) | **POST** /v1/orders/{id}/refunds | Refund an order, in full or in part. &#x60;amount&#x60; is dollars; omit it for everything left (or the line items&#39; value). Crossly-marketplace orders refund the buyer&#39;s card; crossposted orders refund through the marketplace, or fail not_supported_on_platform. Never refunds past the order (refund_exceeds_remaining). The same request twice refunds once: send an Idempotency-Key (without one, the body is the key). A partial refund keeps the order&#39;s status. What the platform takes (full/partial, its own reason keys, a comment) is GET /v1/orders/{id}/refund-options; a request outside it fails partial_refund_unsupported, invalid_refund_reason or refund_exceeds_item_amount. Fires order.refunded.
[**createOrderRefundResolve**](OrdersApi.md#createOrderRefundResolve) | **POST** /v1/orders/{id}/refunds/{refundId}/resolve | Settle an &#x60;unverified&#x60; refund (one Crossly could not confirm with the marketplace after its request was interrupted) once you have checked the marketplace: succeeded (with the amount actually refunded, dollars) or failed (nothing moved; the same Idempotency-Key can then try again). Crossly-marketplace refunds are confirmed by support instead.
[**createOrderScanForm**](OrdersApi.md#createOrderScanForm) | **POST** /v1/orders/scan-forms | Create SCAN forms (one per carrier account and ship-from address) for labels the carrier has not scanned yet.
[**createOrderTracking**](OrdersApi.md#createOrderTracking) | **POST** /v1/orders/{id}/tracking | Submit tracking number + carrier and notify the platform.
[**createOrderWhatnotLabel**](OrdersApi.md#createOrderWhatnotLabel) | **POST** /v1/orders/{id}/whatnot/label | Generate the Whatnot shipping label and record it on the order.
[**createOrderWhatnotPackage**](OrdersApi.md#createOrderWhatnotPackage) | **POST** /v1/orders/{id}/whatnot/package | Save a Whatnot shipment package (weight oz, box inches).
[**createOrderWhatnotPackageQuote**](OrdersApi.md#createOrderWhatnotPackageQuote) | **POST** /v1/orders/{id}/whatnot/package/quote | Quote what a Whatnot package change costs (cents).
[**createRentalApprove**](OrdersApi.md#createRentalApprove) | **POST** /v1/rentals/{id}/approve | Approve a requested rental (offers with requireApproval): the renter’s held card is charged.
[**createRentalCancel**](OrdersApi.md#createRentalCancel) | **POST** /v1/rentals/{id}/cancel | Cancel a booked rental that has not shipped: the renter is refunded in full.
[**createRentalClaim**](OrdersApi.md#createRentalClaim) | **POST** /v1/rentals/{id}/claim | Claim part or all of the deposit (cents, a note, photo URLs): within 3 days of the return, or 14 days after the end if it never came back.
[**createRentalDecline**](OrdersApi.md#createRentalDecline) | **POST** /v1/rentals/{id}/decline | Decline a requested rental: the hold on the renter’s card is released.
[**createRentalDelivered**](OrdersApi.md#createRentalDelivered) | **POST** /v1/rentals/{id}/delivered | Mark a rental delivered to the renter.
[**createRentalExtensionDecide**](OrdersApi.md#createRentalExtensionDecide) | **POST** /v1/rentals/{id}/extensions/{extensionId}/decide | Approve or decline a renter’s request for more days.
[**createRentalInspect**](OrdersApi.md#createRentalInspect) | **POST** /v1/rentals/{id}/inspect | Record the return inspection: the checklist, photos, and optionally release the deposit.
[**createRentalLabel**](OrdersApi.md#createRentalLabel) | **POST** /v1/rentals/{id}/labels | Buy both labels for a booked rental: outbound to the renter, and the return label they use.
[**createRentalNotReturned**](OrdersApi.md#createRentalNotReturned) | **POST** /v1/rentals/{id}/not-returned | Report a rental not returned (14 days past due): the deposit goes to you.
[**createRentalReleaseDeposit**](OrdersApi.md#createRentalReleaseDeposit) | **POST** /v1/rentals/{id}/release-deposit | Release the deposit now, without a claim.
[**createRentalReturned**](OrdersApi.md#createRentalReturned) | **POST** /v1/rentals/{id}/returned | Mark a rental back with you. You then have 3 days to claim damage before the deposit goes back.
[**createRentalShipped**](OrdersApi.md#createRentalShipped) | **POST** /v1/rentals/{id}/shipped | Mark a booked rental shipped, with at least 2 photos of its condition as it leaves (URLs you uploaded) — the evidence any later claim is judged against.
[**getOrder**](OrdersApi.md#getOrder) | **GET** /v1/orders/{id} | Get one order, with its sale price, fees, SKU and line items.
[**getOrderCancelEligibility**](OrdersApi.md#getOrderCancelEligibility) | **GET** /v1/orders/{id}/cancel-eligibility | Whether this order can be cancelled, and which reason codes the marketplace accepts.
[**getOrderCount**](OrdersApi.md#getOrderCount) | **GET** /v1/orders/counts | Tab badge counts by status.
[**getOrderDeliveryPhoto**](OrdersApi.md#getOrderDeliveryPhoto) | **GET** /v1/orders/{id}/delivery-photo | The courier&#39;s delivery photo for this order, pulled automatically, with where it came from.
[**getOrderEvidence**](OrdersApi.md#getOrderEvidence) | **GET** /v1/orders/{id}/evidence | Everything recorded about how this order was packed and how it arrived.
[**getOrderLabelPrint**](OrdersApi.md#getOrderLabelPrint) | **GET** /v1/orders/{id}/label/print | The order&#39;s shipping label as a PDF sized for printing (cropped, upright, fitted).
[**getOrderOrderChat**](OrdersApi.md#getOrderOrderChat) | **GET** /v1/orders/{id}/order-chat | The order&#39;s buyer chat thread on the marketplace (separate from listing comments): { orderId, platform, messages: [{ id, sender (buyer|seller|platform), body, sentAt, attachments? }], canSend }, oldest message first.
[**getOrderPackingSlip**](OrdersApi.md#getOrderPackingSlip) | **GET** /v1/orders/{id}/packing-slip | Single-order packing slip PDF.
[**getOrderPlatformLabelOption**](OrdersApi.md#getOrderPlatformLabelOption) | **GET** /v1/orders/{id}/platform-label/options | What buying a marketplace label offers for this order (weight tiers, mailbox state).
[**getOrderPlatformLabelPackingSlip**](OrdersApi.md#getOrderPlatformLabelPackingSlip) | **GET** /v1/orders/{id}/platform-label/packing-slip | A fresh link to the marketplace&#39;s own packing slip PDF.
[**getOrderPlatformLabelState**](OrdersApi.md#getOrderPlatformLabelState) | **GET** /v1/orders/{id}/platform-label/state | The marketplace&#39;s shipment for an order (package, label, tracking). Records a label found on it.
[**getOrderPlatformLabelUrl**](OrdersApi.md#getOrderPlatformLabelUrl) | **GET** /v1/orders/{id}/platform-label/url | A fresh, short-lived link to the marketplace&#39;s label sheet. Never stored.
[**getOrderProofOfDelivery**](OrdersApi.md#getOrderProofOfDelivery) | **GET** /v1/orders/{id}/proof-of-delivery | Proof-of-delivery evidence from the carrier&#39;s scan record (PDF, or JSON).
[**getOrderRefundOption**](OrdersApi.md#getOrderRefundOption) | **GET** /v1/orders/{id}/refund-options | What a refund on this order may be, from the platform&#39;s declared capability: whether Crossly can refund it at all, full and/or partial, what a partial is measured against (total &#x3D; what the buyer paid, item &#x3D; the item price only), whether it may precede shipment, the platform&#39;s own reason keys (when listed, a refund&#39;s reason must be one of them), whether a comment is sent, whether the refund IS cancelling the sale (cancelsSale: Mercari, full only), whether the window closes when the order completes (untilCompleted; windowClosed &#x3D; it has) and a one-line note on what the platform does not allow.
[**getOrderSalesTax**](OrdersApi.md#getOrderSalesTax) | **GET** /v1/orders/{id}/sales-tax | Who collected sales tax on one Crossly marketplace order, where, and the seller notice.
[**getOrderScanForm**](OrdersApi.md#getOrderScanForm) | **GET** /v1/orders/scan-forms/{id} | One SCAN form; a queued form is re-read from the carrier and its PDF appears once built.
[**getOrderShipment**](OrdersApi.md#getOrderShipment) | **GET** /v1/orders/{id}/shipments | List the parcels an order shipped in.
[**getOrderWhatnotPackingSlip**](OrdersApi.md#getOrderWhatnotPackingSlip) | **GET** /v1/orders/{id}/whatnot/packing-slip | A fresh link to Whatnot&#39;s packing slip PDF.
[**getOrderWhatnotShipment**](OrdersApi.md#getOrderWhatnotShipment) | **GET** /v1/orders/{id}/whatnot/shipment | Whatnot shipment for an order (package, label, tracking). Records a label found on it.
[**getRental**](OrdersApi.md#getRental) | **GET** /v1/rentals/{id} | One rental: its timeline, both sides’ condition photos, payments, extensions and what can be done next.
[**getRentalCalendar**](OrdersApi.md#getRentalCalendar) | **GET** /v1/rentals/calendar | Every rentable item’s bookings (per unit), turnaround buffers and blackouts between two dates (≤ 93 days).
[**listLayaways**](OrdersApi.md#listLayaways) | **GET** /v1/layaways | Your items on layaway (active and paid off). Do not ship an active one: its order moves to needs_fulfillment when paid in full.
[**listLiveShipments**](OrdersApi.md#listLiveShipments) | **GET** /v1/live-shipments | Your show boxes: every buyer’s orders from one live show, to ship together.
[**listOrderPickupReady**](OrdersApi.md#listOrderPickupReady) | **GET** /v1/orders/pickup-ready | Orders with a purchased Crossly Shipping label a courier can collect or a SCAN form can cover, grouped by carrier.
[**listOrderPickups**](OrdersApi.md#listOrderPickups) | **GET** /v1/orders/pickups | Booked carrier pickups, newest first.
[**listOrderRefunds**](OrdersApi.md#listOrderRefunds) | **GET** /v1/orders/{id}/refunds | Every refund requested on this order through the API or a cancel, newest first (amounts in dollars).
[**listOrderScanForms**](OrdersApi.md#listOrderScanForms) | **GET** /v1/orders/scan-forms | SCAN forms, newest first.
[**listOrderUnits**](OrdersApi.md#listOrderUnits) | **GET** /v1/orders/{id}/units | List the identified units that shipped on an order.
[**listOrders**](OrdersApi.md#listOrders) | **GET** /v1/orders | List orders, each with its sale price, fees, SKU and line items.
[**listRentalHistory**](OrdersApi.md#listRentalHistory) | **GET** /v1/rentals/history | Active rentals and history, filtered by view, status, dates, item or a search.
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
> UpdatedResponse createOrderBulkMarkDisputed()

Bulk mark orders as disputed with a shared reason.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : UpdatedResponse = apiInstance.createOrderBulkMarkDisputed()
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

**UpdatedResponse**

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

Cancel an order before it ships. Crossly-marketplace orders refund the buyer (also needs orders:refund) and restock; crossposted orders go to the marketplace, or fail not_supported_on_platform (recordOnly: true records a cancel made on the marketplace). Fires order.cancelled.

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

<a name="createOrderCorrectTracking"></a>
# **createOrderCorrectTracking**
> CreateOrderCorrectTrackingResponse createOrderCorrectTracking(id)

Correct a wrong tracking number the marketplace already holds.

Replaces the order&#39;s tracking number with &#x60;trackingNumber&#x60;, on Crossly and on the marketplace, where the platform can change tracking it already has (its trackingCorrection capability): &#x60;correction&#x60; is replace (overwritten), remove_then_submit (the old number removed, then the new one sent) or submit (the platform held none). Refused with validation_error where the platform cannot change it (update it there), when the order has no tracking, its tracking came with a label (void the label instead), or it is closed or delivered; conflict while the previous tracking update is still in flight.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderCorrectTrackingResponse = apiInstance.createOrderCorrectTracking(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderCorrectTracking")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderCorrectTracking")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderCorrectTrackingResponse**

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

Purchase a Crossly Shipping label. An order that already has a label answers 409 label_exists unless allowSecondLabel is true.

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

<a name="createOrderLabelVoid"></a>
# **createOrderLabelVoid**
> CreateOrderLabelVoidResponse createOrderLabelVoid(id)

Void a Crossly Shipping label and refund it to the shipping wallet.

Voids the order&#39;s unused label, owes the wallet charge back in full (markup included) and sets the order back to needs_fulfillment. The refund is held as pending (&#x60;refundPendingCents&#x60;; &#x60;refundedCents&#x60; stays 0) and is credited to the shipping wallet when Crossly releases held credits. Only while the carrier has not scanned the parcel and within 30 days of purchase. &#x60;tracking.outcome&#x60; says what happens to tracking already sent to the marketplace: not_submitted, removal_queued, replace_on_next_label, or update_manually (with &#x60;platformOrderUrl&#x60;). Repeating the call returns the same result with &#x60;alreadyVoided: true&#x60; and refunds nothing again.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderLabelVoidResponse = apiInstance.createOrderLabelVoid(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderLabelVoid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderLabelVoid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderLabelVoidResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderLinkListing"></a>
# **createOrderLinkListing**
> CreateOrderLinkListingResponse createOrderLinkListing(id)

Link an unmatched sale to one of your listings (marks it sold, delists it elsewhere).

For an order whose listing is an auto-created external-sale stub. Body: { listingId, platformListingId? }. Moves the sale onto the listing&#39;s row on the order&#39;s platform (or moves the stub&#39;s row under the listing when it has none), decrements its stock like a detected sale, archives the stub, and delists the item from every other marketplace once no unit is left. 409 when the order is already linked.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderLinkListingResponse = apiInstance.createOrderLinkListing(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderLinkListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderLinkListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderLinkListingResponse**

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

<a name="createOrderOrderChat"></a>
# **createOrderOrderChat**
> OkResponse createOrderOrderChat(id, createOrderOrderChatRequest)

Send a message to the order&#39;s buyer chat on the marketplace. Mirrored into the Crossly inbox.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createOrderOrderChatRequest : CreateOrderOrderChatRequest =  // CreateOrderOrderChatRequest | 
try {
    val result : OkResponse = apiInstance.createOrderOrderChat(id, createOrderOrderChatRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderOrderChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderOrderChat")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **createOrderOrderChatRequest** | **CreateOrderOrderChatRequest**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
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

Buy the carrier label for a Crossly order the buyer collects from a pickup point (debits your shipping wallet). 402 when the wallet is short. An order that already has a label answers 409 label_exists unless allowSecondLabel is true.

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

<a name="createOrderPlatformLabelPackage"></a>
# **createOrderPlatformLabelPackage**
> GetOrderWhatnotShipmentResponse createOrderPlatformLabelPackage(id)

Save the package (weight oz, box inches) the marketplace prices the label from.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderWhatnotShipmentResponse = apiInstance.createOrderPlatformLabelPackage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderPlatformLabelPackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderPlatformLabelPackage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetOrderWhatnotShipmentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderPlatformLabelPackageQuote"></a>
# **createOrderPlatformLabelPackageQuote**
> CreateOrderWhatnotPackageQuoteResponse createOrderPlatformLabelPackageQuote(id)

Quote what a change to the marketplace shipment&#39;s package costs (cents).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderWhatnotPackageQuoteResponse = apiInstance.createOrderPlatformLabelPackageQuote(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderPlatformLabelPackageQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderPlatformLabelPackageQuote")
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

<a name="createOrderPlatformLabelPull"></a>
# **createOrderPlatformLabelPull**
> CreateOrderPlatformLabelPullResponse createOrderPlatformLabelPull(id)

Pull the marketplace&#39;s prepaid label into Crossly (every platform with a label descriptor).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderPlatformLabelPullResponse = apiInstance.createOrderPlatformLabelPull(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderPlatformLabelPull")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderPlatformLabelPull")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderPlatformLabelPullResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderPlatformLabelPurchase"></a>
# **createOrderPlatformLabelPurchase**
> CreateOrderPlatformLabelPurchaseResponse createOrderPlatformLabelPurchase(id)

Buy a replacement / extra marketplace label, or have the marketplace generate it, and record it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderPlatformLabelPurchaseResponse = apiInstance.createOrderPlatformLabelPurchase(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderPlatformLabelPurchase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderPlatformLabelPurchase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderPlatformLabelPurchaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderPlatformLabelQuote"></a>
# **createOrderPlatformLabelQuote**
> CreateOrderPlatformLabelQuoteResponse createOrderPlatformLabelQuote(id)

Quote what buying a marketplace label costs, before you are charged.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderPlatformLabelQuoteResponse = apiInstance.createOrderPlatformLabelQuote(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderPlatformLabelQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderPlatformLabelQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderPlatformLabelQuoteResponse**

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

Crossly Shipping rate quote for an order.

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

DEPRECATED: use POST /v1/orders/{id}/refunds. Full or partial refund (amount in dollars). Same idempotency and cap as /refunds: the same request twice refunds once (Idempotency-Key, else the body), never past what the buyer paid.

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

<a name="createOrderRefundById"></a>
# **createOrderRefundById**
> CreateOrderRefundByIdResponse createOrderRefundById(id)

Refund an order, in full or in part. &#x60;amount&#x60; is dollars; omit it for everything left (or the line items&#39; value). Crossly-marketplace orders refund the buyer&#39;s card; crossposted orders refund through the marketplace, or fail not_supported_on_platform. Never refunds past the order (refund_exceeds_remaining). The same request twice refunds once: send an Idempotency-Key (without one, the body is the key). A partial refund keeps the order&#39;s status. What the platform takes (full/partial, its own reason keys, a comment) is GET /v1/orders/{id}/refund-options; a request outside it fails partial_refund_unsupported, invalid_refund_reason or refund_exceeds_item_amount. Fires order.refunded.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateOrderRefundByIdResponse = apiInstance.createOrderRefundById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderRefundById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderRefundById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateOrderRefundByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrderRefundResolve"></a>
# **createOrderRefundResolve**
> ListOrderRefundsItem createOrderRefundResolve(id, refundId)

Settle an &#x60;unverified&#x60; refund (one Crossly could not confirm with the marketplace after its request was interrupted) once you have checked the marketplace: succeeded (with the amount actually refunded, dollars) or failed (nothing moved; the same Idempotency-Key can then try again). Crossly-marketplace refunds are confirmed by support instead.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val refundId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListOrderRefundsItem = apiInstance.createOrderRefundResolve(id, refundId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderRefundResolve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderRefundResolve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **refundId** | **java.util.UUID**|  |

### Return type

**ListOrderRefundsItem**

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

**CreateOrderTrackingResponse**

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
> GetOrderWhatnotShipmentResponse createOrderWhatnotPackage(id)

Save a Whatnot shipment package (weight oz, box inches).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderWhatnotShipmentResponse = apiInstance.createOrderWhatnotPackage(id)
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

**GetOrderWhatnotShipmentResponse**

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

<a name="createRentalDelivered"></a>
# **createRentalDelivered**
> RentalResponse createRentalDelivered(id)

Mark a rental delivered to the renter.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalDelivered(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalDelivered")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalDelivered")
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

<a name="createRentalExtensionDecide"></a>
# **createRentalExtensionDecide**
> CreateRentalExtensionDecideResponse createRentalExtensionDecide(id, extensionId)

Approve or decline a renter’s request for more days.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
val extensionId : kotlin.String = extensionId_example // kotlin.String | 
try {
    val result : CreateRentalExtensionDecideResponse = apiInstance.createRentalExtensionDecide(id, extensionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalExtensionDecide")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalExtensionDecide")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **extensionId** | **kotlin.String**|  |

### Return type

**CreateRentalExtensionDecideResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRentalInspect"></a>
# **createRentalInspect**
> RentalResponse createRentalInspect(id)

Record the return inspection: the checklist, photos, and optionally release the deposit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalInspect(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalInspect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalInspect")
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

<a name="createRentalNotReturned"></a>
# **createRentalNotReturned**
> RentalResponse createRentalNotReturned(id)

Report a rental not returned (14 days past due): the deposit goes to you.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalNotReturned(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalNotReturned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalNotReturned")
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

<a name="createRentalReleaseDeposit"></a>
# **createRentalReleaseDeposit**
> RentalResponse createRentalReleaseDeposit(id)

Release the deposit now, without a claim.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : RentalResponse = apiInstance.createRentalReleaseDeposit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createRentalReleaseDeposit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createRentalReleaseDeposit")
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
> GetOrderResponse getOrder(id)

Get one order, with its sale price, fees, SKU and line items.

Each order carries its sale exactly as the order.created webhook sent it: salePrice, platformFee, taxCollected and shippingCharged in DOLLARS as JSON numbers (not decimal strings), feeSource (\&quot;exact\&quot; &#x3D; the fee the marketplace charged, \&quot;estimated\&quot;), sku (the SKU of the listing), quantity (units), and lineItems: one entry per order row {lineKey, listingId, inventoryItemId, platformListingId (the MARKETPLACE listing id), sku (variant SKU, else the listing SKU), variantId, quantity, unitPrice (dollars per unit, rounded to the cent), total (dollars)}. A multi-item marketplace order is one order row per line sharing platformOrderId, each with its own lineKey. detailsPending: true (the sale was recorded before its price and buyer loaded), an order with no sale, or a sale with no listing behind it has null money and lineItems [] (sku and quantity are still given when known). channel is the business channel that sold it (retail, wholesale, auction, live, world, pos), purchaseOrderRef the buyer&#39;s PO number, and trade the on-account invoice behind a wholesale order {invoiceId, invoiceNumber, invoiceStatus (open, partial, overdue, paid, void), netDays, dueAt, totalCents, amountPaidCents, balanceCents} or null.

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

**GetOrderResponse**

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

<a name="getOrderDeliveryPhoto"></a>
# **getOrderDeliveryPhoto**
> GetOrderDeliveryPhotoResponse getOrderDeliveryPhoto(id)

The courier&#39;s delivery photo for this order, pulled automatically, with where it came from.

Crossly pulls the doorstep photo from whoever has it (the carrier API, e.g. UPS; Trackified when its tracking carries one; the marketplace when its payload does) and stores it on the order. state is found | none | not_delivered; source / sourceLabel say where it came from (\&quot;From UPS\&quot;, \&quot;Added by you\&quot;); checked lists who was asked when there is none. Carriers often attach the photo hours after delivery.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetOrderDeliveryPhotoResponse = apiInstance.getOrderDeliveryPhoto(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderDeliveryPhoto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderDeliveryPhoto")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetOrderDeliveryPhotoResponse**

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

<a name="getOrderOrderChat"></a>
# **getOrderOrderChat**
> GetOrderOrderChatResponse getOrderOrderChat(id)

The order&#39;s buyer chat thread on the marketplace (separate from listing comments): { orderId, platform, messages: [{ id, sender (buyer|seller|platform), body, sentAt, attachments? }], canSend }, oldest message first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderOrderChatResponse = apiInstance.getOrderOrderChat(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderOrderChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderOrderChat")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetOrderOrderChatResponse**

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

<a name="getOrderPlatformLabelOption"></a>
# **getOrderPlatformLabelOption**
> GetOrderPlatformLabelOptionResponse getOrderPlatformLabelOption(id)

What buying a marketplace label offers for this order (weight tiers, mailbox state).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderPlatformLabelOptionResponse = apiInstance.getOrderPlatformLabelOption(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderPlatformLabelOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderPlatformLabelOption")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetOrderPlatformLabelOptionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderPlatformLabelPackingSlip"></a>
# **getOrderPlatformLabelPackingSlip**
> UrlExpiresInSecondsResponse getOrderPlatformLabelPackingSlip(id)

A fresh link to the marketplace&#39;s own packing slip PDF.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UrlExpiresInSecondsResponse = apiInstance.getOrderPlatformLabelPackingSlip(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderPlatformLabelPackingSlip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderPlatformLabelPackingSlip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**UrlExpiresInSecondsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderPlatformLabelState"></a>
# **getOrderPlatformLabelState**
> GetOrderWhatnotShipmentResponse getOrderPlatformLabelState(id)

The marketplace&#39;s shipment for an order (package, label, tracking). Records a label found on it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderWhatnotShipmentResponse = apiInstance.getOrderPlatformLabelState(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderPlatformLabelState")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderPlatformLabelState")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetOrderWhatnotShipmentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderPlatformLabelUrl"></a>
# **getOrderPlatformLabelUrl**
> UrlExpiresInSecondsResponse getOrderPlatformLabelUrl(id)

A fresh, short-lived link to the marketplace&#39;s label sheet. Never stored.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UrlExpiresInSecondsResponse = apiInstance.getOrderPlatformLabelUrl(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderPlatformLabelUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderPlatformLabelUrl")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**UrlExpiresInSecondsResponse**

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

<a name="getOrderRefundOption"></a>
# **getOrderRefundOption**
> GetOrderRefundOptionResponse getOrderRefundOption(id)

What a refund on this order may be, from the platform&#39;s declared capability: whether Crossly can refund it at all, full and/or partial, what a partial is measured against (total &#x3D; what the buyer paid, item &#x3D; the item price only), whether it may precede shipment, the platform&#39;s own reason keys (when listed, a refund&#39;s reason must be one of them), whether a comment is sent, whether the refund IS cancelling the sale (cancelsSale: Mercari, full only), whether the window closes when the order completes (untilCompleted; windowClosed &#x3D; it has) and a one-line note on what the platform does not allow.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderRefundOptionResponse = apiInstance.getOrderRefundOption(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderRefundOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderRefundOption")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetOrderRefundOptionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSalesTax"></a>
# **getOrderSalesTax**
> GetOrderSalesTaxResponse getOrderSalesTax(id)

Who collected sales tax on one Crossly marketplace order, where, and the seller notice.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderSalesTaxResponse = apiInstance.getOrderSalesTax(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderSalesTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderSalesTax")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetOrderSalesTaxResponse**

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
> UrlExpiresInSecondsResponse getOrderWhatnotPackingSlip(id)

A fresh link to Whatnot&#39;s packing slip PDF.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UrlExpiresInSecondsResponse = apiInstance.getOrderWhatnotPackingSlip(id)
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

**UrlExpiresInSecondsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderWhatnotShipment"></a>
# **getOrderWhatnotShipment**
> GetOrderWhatnotShipmentResponse getOrderWhatnotShipment(id)

Whatnot shipment for an order (package, label, tracking). Records a label found on it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderWhatnotShipmentResponse = apiInstance.getOrderWhatnotShipment(id)
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

**GetOrderWhatnotShipmentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRental"></a>
# **getRental**
> GetRentalResponse getRental(id)

One rental: its timeline, both sides’ condition photos, payments, extensions and what can be done next.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetRentalResponse = apiInstance.getRental(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getRental")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getRental")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetRentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRentalCalendar"></a>
# **getRentalCalendar**
> GetRentalCalendarResponse getRentalCalendar()

Every rentable item’s bookings (per unit), turnaround buffers and blackouts between two dates (≤ 93 days).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : GetRentalCalendarResponse = apiInstance.getRentalCalendar()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getRentalCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getRentalCalendar")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetRentalCalendarResponse**

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

Orders with a purchased Crossly Shipping label a courier can collect or a SCAN form can cover, grouped by carrier.

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

<a name="listOrderRefunds"></a>
# **listOrderRefunds**
> ListOrderRefundsResponse listOrderRefunds(id)

Every refund requested on this order through the API or a cancel, newest first (amounts in dollars).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListOrderRefundsResponse = apiInstance.listOrderRefunds(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listOrderRefunds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listOrderRefunds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListOrderRefundsResponse**

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
> ListOrdersResponse listOrders(page, limit, status, platform, channel, details, unlinked, updatedSince)

List orders, each with its sale price, fees, SKU and line items.

Each order carries its sale exactly as the order.created webhook sent it: salePrice, platformFee, taxCollected and shippingCharged in DOLLARS as JSON numbers (not decimal strings), feeSource (\&quot;exact\&quot; &#x3D; the fee the marketplace charged, \&quot;estimated\&quot;), sku (the SKU of the listing), quantity (units), and lineItems: one entry per order row {lineKey, listingId, inventoryItemId, platformListingId (the MARKETPLACE listing id), sku (variant SKU, else the listing SKU), variantId, quantity, unitPrice (dollars per unit, rounded to the cent), total (dollars)}. A multi-item marketplace order is one order row per line sharing platformOrderId, each with its own lineKey. detailsPending: true (the sale was recorded before its price and buyer loaded), an order with no sale, or a sale with no listing behind it has null money and lineItems [] (sku and quantity are still given when known). channel is the business channel that sold it (retail, wholesale, auction, live, world, pos), purchaseOrderRef the buyer&#39;s PO number, and trade the on-account invoice behind a wholesale order {invoiceId, invoiceNumber, invoiceStatus (open, partial, overdue, paid, void), netDays, dueAt, totalCents, amountPaidCents, balanceCents} or null.

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
val channel : kotlin.String = channel_example // kotlin.String | Only orders sold through this business channel (e.g. wholesale).
val details : kotlin.String = details_example // kotlin.String | pending = only orders whose sale details (price, buyer) have not loaded yet.
val unlinked : kotlin.String = unlinked_example // kotlin.String | 1 or true = only orders whose sale is not linked to any listing (an orphan sale).
val updatedSince : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Only orders created or changed at or after this time (ISO 8601): poll with the time of your last call to catch new orders and status/tracking changes.
try {
    val result : ListOrdersResponse = apiInstance.listOrders(page, limit, status, platform, channel, details, unlinked, updatedSince)
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
 **channel** | **kotlin.String**| Only orders sold through this business channel (e.g. wholesale). | [optional] [enum: retail, wholesale, auction, live, world, pos, rental]
 **details** | **kotlin.String**| pending &#x3D; only orders whose sale details (price, buyer) have not loaded yet. | [optional] [enum: pending]
 **unlinked** | **kotlin.String**| 1 or true &#x3D; only orders whose sale is not linked to any listing (an orphan sale). | [optional] [enum: 1, true, 0, false]
 **updatedSince** | **java.time.OffsetDateTime**| Only orders created or changed at or after this time (ISO 8601): poll with the time of your last call to catch new orders and status/tracking changes. | [optional]

### Return type

**ListOrdersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRentalHistory"></a>
# **listRentalHistory**
> ListRentalHistoryResponse listRentalHistory()

Active rentals and history, filtered by view, status, dates, item or a search.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OrdersApi()
try {
    val result : ListRentalHistoryResponse = apiInstance.listRentalHistory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listRentalHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listRentalHistory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListRentalHistoryResponse**

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

**UpdateOrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

