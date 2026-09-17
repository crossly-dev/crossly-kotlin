
# ListSourcingDemandMineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierValue** | **kotlin.String** |  | 
**lookers** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | How many distinct shoppers looked, in the window. | 
**misses** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | How many of those looks Crossly could not answer at all. | 
**relation** | [**inline**](#Relation) | &#39;in_stock&#39; — it is in their inventory. &#39;sold_before&#39; — they have sold one. | 
**medianRetailCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What the retailers were charging, median of what Scout saw. |  [optional]
**inventoryItemId** | **kotlin.String** | Their own row, for the link. |  [optional]
**title** | **kotlin.String** |  |  [optional]
**lastSoldCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What they got for it last time, when they have sold one. |  [optional]
**lastSoldAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]


<a name="Relation"></a>
## Enum: relation
Name | Value
---- | -----
relation | in_stock, sold_before



