
# GetBuyerAnywhereResponseOffsite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storeId** | **kotlin.String** |  | 
**host** | **kotlin.String** | The retailer&#39;s hostname, e.g. &#x60;rei.com&#x60;. | 
**storeName** | **kotlin.String** |  | 
**title** | **kotlin.String** |  | 
**priceCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**currency** | **kotlin.String** |  | 
**url** | **kotlin.String** |  | 
**buyerCashbackCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What the buyer gets back, in cents, if they buy through us.  Shown because a cashback figure the buyer cannot see is a figure they have no reason to believe. Derived from the store&#39;s rate, never stored per offer — rates change and a copied one goes stale silently. | 
**deliveredCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Item + shipping when known; item alone otherwise. See &#x60;shippingUnknown&#x60;. | 
**shippingUnknown** | **kotlin.Boolean** |  | 
**shippingCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Null &#x3D; UNKNOWN, never free. |  [optional]
**condition** | **kotlin.String** |  |  [optional]
**imageUrl** | **kotlin.String** |  |  [optional]



