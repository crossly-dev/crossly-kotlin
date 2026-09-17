
# ListBuyerCatalogSearchItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**slug** | **kotlin.String** |  | 
**title** | **kotlin.String** |  | 
**priceCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**currency** | **kotlin.String** |  | 
**images** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**quantityAvailable** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Units a buyer can actually take right now. Reserved units are excluded. | 
**url** | **kotlin.String** | Canonical buyer-facing URL, so a client never has to build one. | 
**compareAtCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | MSRP above the ask, or null. Never fabricated from a stale value. |  [optional]
**condition** | **kotlin.String** |  |  [optional]
**brand** | **kotlin.String** |  |  [optional]
**categoryMain** | **kotlin.String** |  |  [optional]
**categorySub** | **kotlin.String** |  |  [optional]
**thumbnail** | **kotlin.String** |  |  [optional]
**sellerUsername** | **kotlin.String** |  |  [optional]
**sellerDisplayName** | **kotlin.String** |  |  [optional]
**listedAt** | **kotlin.String** |  |  [optional]



