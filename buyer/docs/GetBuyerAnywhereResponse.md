
# GetBuyerAnywhereResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verdict** | [**inline**](#Verdict) |  | 
**shippingUnknown** | **kotlin.Boolean** |  | 
**alternates** | [**kotlin.collections.List&lt;GetBuyerAnywhereResponseAlternates&gt;**](GetBuyerAnywhereResponseAlternates.md) |  | 
**savingCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**crossly** | [**GetBuyerAnywhereResponseCrossly**](GetBuyerAnywhereResponseCrossly.md) |  |  [optional]
**offsite** | [**GetBuyerAnywhereResponseOffsite**](GetBuyerAnywhereResponseOffsite.md) |  |  [optional]


<a name="Verdict"></a>
## Enum: verdict
Name | Value
---- | -----
verdict | crossly_best, offsite_cheaper, offsite_only, no_match



