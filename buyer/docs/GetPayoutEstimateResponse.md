
# GetPayoutEstimateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platform** | **kotlin.String** |  | 
**grossCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**feeCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**feeSource** | [**inline**](#FeeSource) |  | 
**shippingCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**shippingSource** | [**inline**](#ShippingSource) |  | 
**netCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**takeHomePct** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Net as a percentage of gross, for comparing across price points. | 
**assumptions** | **kotlin.collections.List&lt;kotlin.String&gt;** | What we assumed, in the seller&#39;s words. Never empty when we guessed. | 


<a name="FeeSource"></a>
## Enum: feeSource
Name | Value
---- | -----
feeSource | exact, estimated


<a name="ShippingSource"></a>
## Enum: shippingSource
Name | Value
---- | -----
shippingSource | none, unknown, quoted, platform_label, buyer_paid



