
# CreateBuyerScanResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verdict** | [**inline**](#Verdict) |  | 
**alternates** | [**kotlin.collections.List&lt;GetBuyerAnywhereResponseAlternates&gt;**](GetBuyerAnywhereResponseAlternates.md) |  | 
**shippingUnknown** | **kotlin.Boolean** |  | 
**matchMethod** | **kotlin.String** |  | 
**comparable** | **kotlin.Boolean** |  | 
**confidence** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**identifier** | [**CreateBuyerScanResponseIdentifier**](CreateBuyerScanResponseIdentifier.md) |  | 
**visualMatches** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  | 
**crossly** | [**GetBuyerAnywhereResponseCrossly**](GetBuyerAnywhereResponseCrossly.md) |  |  [optional]
**offsite** | [**GetBuyerAnywhereResponseOffsite**](GetBuyerAnywhereResponseOffsite.md) |  |  [optional]
**savingCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]


<a name="Verdict"></a>
## Enum: verdict
Name | Value
---- | -----
verdict | crossly_best, offsite_cheaper, offsite_only, no_match



