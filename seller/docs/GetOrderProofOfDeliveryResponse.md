
# GetOrderProofOfDeliveryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **kotlin.String** |  | 
**platform** | **kotlin.String** |  | 
**scans** | [**kotlin.collections.List&lt;GetOrderProofOfDeliveryResponseScans&gt;**](GetOrderProofOfDeliveryResponseScans.md) |  | 
**gaps** | **kotlin.collections.List&lt;kotlin.String&gt;** | Why this document is weak, stated plainly so the seller isn&#39;t surprised  by the marketplace&#39;s response. | 
**platformOrderId** | **kotlin.String** |  |  [optional]
**itemTitle** | **kotlin.String** |  |  [optional]
**buyerUsername** | **kotlin.String** |  |  [optional]
**shipToPostalCode** | **kotlin.String** | The ZIP we shipped to, for comparison against the delivery scan. |  [optional]
**shipToCityState** | **kotlin.String** |  |  [optional]
**carrier** | **kotlin.String** |  |  [optional]
**trackingNumber** | **kotlin.String** |  |  [optional]
**trackingUrl** | **kotlin.String** |  |  [optional]
**shippedAt** | **kotlin.String** |  |  [optional]
**deliveredAt** | **kotlin.String** |  |  [optional]
**deliveryLocation** | **kotlin.String** |  |  [optional]
**signature** | **kotlin.String** | Null means the carrier captured none — NOT that delivery is unproven. |  [optional]



