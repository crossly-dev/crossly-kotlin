
# ListSpatialPublicOffersItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **kotlin.String** |  | 
**listingSlug** | **kotlin.String** | platform_listings.platform_listing_id — what POST /cart/items takes. | 
**priceCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**currency** | **kotlin.String** |  | 
**available** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Remaining stock, when the listing declares one. Null &#x3D; unknown. |  [optional]
**condition** | **kotlin.String** | What a buyer is entitled to know before they add it. |  [optional]
**gradeKey** | **kotlin.String** | Canonical grade key when the item is slabbed, e.g. &#x60;psa-10&#x60;. |  [optional]



