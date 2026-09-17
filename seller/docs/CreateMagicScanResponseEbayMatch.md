
# CreateMagicScanResponseEbayMatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **kotlin.String** |  | 
**title** | **kotlin.String** |  | 
**itemUrl** | **kotlin.String** |  | 
**legacyItemId** | **kotlin.String** |  |  [optional]
**brand** | **kotlin.String** |  |  [optional]
**priceCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Normalized cents. eBay returns string + currency on &#x60;price.value&#x60;. |  [optional]
**currency** | **kotlin.String** |  |  [optional]
**condition** | **kotlin.String** |  |  [optional]
**categoryId** | **kotlin.String** | Top-level category eBay assigned to the match (id + path). |  [optional]
**categoryPath** | **kotlin.String** |  |  [optional]
**thumbnailUrl** | **kotlin.String** |  |  [optional]
**aspects** | [**kotlin.Any**](.md) | Loosely-typed aspect bag — Brand, Color, Material, etc. when eBay inlines them. Always inspected defensively by the synthesizer. |  [optional]



