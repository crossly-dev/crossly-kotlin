
# ListSpatialPublicItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** |  | 
**publicSlug** | **kotlin.String** |  | 
**categorySlug** | **kotlin.String** |  | 
**itemCount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Unsold stock that lands in this room. The same predicate the room uses. | 
**forSaleCount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | How many of those a visitor could buy right now. | 
**previewImages** | **kotlin.collections.List&lt;kotlin.String&gt;** | Up to PREVIEW_IMAGES item images. Catalog art first, seller photo else. | 
**priceFromCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The cheapest and dearest thing for sale, in cents.  A BAND, deliberately, and never a quote: &#x60;listPublicSceneOffers&#x60; is the only authority on what a given object costs. Null when nothing is for sale — zero would read as free. |  [optional]
**priceToCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**updatedAt** | **kotlin.String** | Last time the room itself changed. ISO, or null if the row has no date. |  [optional]



