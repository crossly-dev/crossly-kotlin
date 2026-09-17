
# GetPlatformLimitResponseEbaySellingCap

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **kotlin.String** |  | 
**fetchedAt** | **kotlin.String** | ISO timestamp this was fetched (used for cache freshness display). | 
**amountLimit** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Monthly $$ ceiling — null when seller has no $$ cap set. |  [optional]
**amountUsed** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**quantityLimit** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Monthly item-count ceiling — null when seller has no qty cap. |  [optional]
**quantityUsed** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]



