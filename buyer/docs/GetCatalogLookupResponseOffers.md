
# GetCatalogLookupResponseOffers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | [**inline**](#Kind) |  | 
**priceCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**currency** | **kotlin.String** |  | 
**url** | **kotlin.String** |  | 
**condition** | **kotlin.String** |  |  [optional]
**title** | **kotlin.String** |  |  [optional]
**imageUrl** | **kotlin.String** |  |  [optional]
**listingSlug** | **kotlin.String** | Null on an order-book ask, which is a price rather than a purchasable listing. |  [optional]
**available** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**catalog** | [**GetCatalogLookupResponseCatalog**](GetCatalogLookupResponseCatalog.md) |  |  [optional]


<a name="Kind"></a>
## Enum: kind
Name | Value
---- | -----
kind | listing, ask



