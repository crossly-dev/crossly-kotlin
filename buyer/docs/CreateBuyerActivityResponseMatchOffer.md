
# CreateBuyerActivityResponseMatchOffer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | [**inline**](#Kind) |  | 
**priceCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**url** | **kotlin.String** |  | 
**condition** | **kotlin.String** | Free-text on listings, an order-book grade (&#39;DS&#39;) on asks. Never null on asks; frequently null on listings, which is itself informative. |  [optional]
**title** | **kotlin.String** |  |  [optional]
**imageUrl** | **kotlin.String** |  |  [optional]
**slug** | **kotlin.String** | The public slug, when this offer is a marketplace listing.  Present so Scout can buy it without parsing the URL it was given back. Null on an order-book ask, which is deliberate rather than an omission: an ask is a price in a book, not a thing with a checkout, and a Buy button on one would be a promise the market side cannot keep. |  [optional]
**available** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | How many the seller has. Caps the quantity stepper honestly. |  [optional]


<a name="Kind"></a>
## Enum: kind
Name | Value
---- | -----
kind | listing, ask



