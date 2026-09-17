
# CreateBuyerCartQuoteResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **kotlin.String** |  | 
**taxCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**shippingCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**totalCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**currency** | **kotlin.String** |  | 
**itemsTotalCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**pickupCartItemIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | Lines being collected in person, so a summary can name what ships free. | 
**taxComplete** | **kotlin.Boolean** | False means there is no saved delivery address, so &#x60;taxCents&#x60; is a floor rather than a final figure — not that tax is zero. | 



