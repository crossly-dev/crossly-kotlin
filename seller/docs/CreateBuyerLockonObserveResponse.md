
# CreateBuyerLockonObserveResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lockonId** | **kotlin.String** |  | 
**status** | **kotlin.String** |  | 
**candidates** | [**kotlin.collections.List&lt;CreateBuyerLockonObserveResponseCandidates&gt;**](CreateBuyerLockonObserveResponseCandidates.md) | Present when we could not settle it alone. Show them; a pinch on one is the cheapest, strongest disambiguation available. | 
**observationCount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**visionCalls** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**visionQuotaExhausted** | **kotlin.Boolean** |  | 
**verdict** | [**inline**](#Verdict) |  | 
**alternates** | [**kotlin.collections.List&lt;GetBuyerAnywhereResponseAlternates&gt;**](GetBuyerAnywhereResponseAlternates.md) |  | 
**shippingUnknown** | **kotlin.Boolean** |  | 
**hud** | [**CreateBuyerIdentifyResponseHud**](CreateBuyerIdentifyResponseHud.md) |  | 
**identifier** | [**CreateBuyerIdentifyResponseIdentifier**](CreateBuyerIdentifyResponseIdentifier.md) |  |  [optional]
**crossly** | [**GetBuyerAnywhereResponseCrossly**](GetBuyerAnywhereResponseCrossly.md) |  |  [optional]
**offsite** | [**GetBuyerAnywhereResponseOffsite**](GetBuyerAnywhereResponseOffsite.md) |  |  [optional]
**savingCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]


<a name="Verdict"></a>
## Enum: verdict
Name | Value
---- | -----
verdict | crossly_best, offsite_cheaper, offsite_only, no_match



