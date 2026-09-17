
# ListSourcingDemandItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**namespace** | **kotlin.String** |  | 
**identifierValue** | **kotlin.String** |  | 
**looks** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | How many times anybody looked, in the window. | 
**misses** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | How many of those we had nothing for. | 
**retailers** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Distinct retailers it was seen on — breadth, not just volume. | 
**lastSeenAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**medianPageCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What the retailers were charging, median of what we saw. |  [optional]



