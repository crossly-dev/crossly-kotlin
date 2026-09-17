
# GetOfferResponseOffers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  | 
**status** | **kotlin.String** |  | 
**amountCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**isBundle** | **kotlin.Boolean** |  | 
**items** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  | 
**expiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**listedTotalCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Asking total when the offer was made — what the buyer responded to. |  [optional]
**message** | **kotlin.String** |  |  [optional]
**parentOfferId** | **kotlin.String** |  |  [optional]
**decidedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**consumedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Set once an accepted offer has actually been paid for. |  [optional]



