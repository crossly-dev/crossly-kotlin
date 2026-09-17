
# CreateBuyerIdentifyResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tier** | [**inline**](#Tier) |  | 
**confidence** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**visionQuotaExhausted** | **kotlin.Boolean** | Surfaced rather than hidden: \&quot;we could not look harder\&quot; and \&quot;we looked and found nothing\&quot; are different answers, and a client that cannot tell them apart shows the wrong message on both. | 
**visualMatches** | [**kotlin.collections.List&lt;CreateBuyerIdentifyResponseVisualMatches&gt;**](CreateBuyerIdentifyResponseVisualMatches.md) |  | 
**verdict** | [**inline**](#Verdict) |  | 
**alternates** | [**kotlin.collections.List&lt;GetBuyerAnywhereResponseAlternates&gt;**](GetBuyerAnywhereResponseAlternates.md) |  | 
**shippingUnknown** | **kotlin.Boolean** |  | 
**hud** | [**CreateBuyerIdentifyResponseHud**](CreateBuyerIdentifyResponseHud.md) |  | 
**identifier** | [**CreateBuyerIdentifyResponseIdentifier**](CreateBuyerIdentifyResponseIdentifier.md) |  |  [optional]
**visionLabel** | **kotlin.String** |  |  [optional]
**crossly** | [**GetBuyerAnywhereResponseCrossly**](GetBuyerAnywhereResponseCrossly.md) |  |  [optional]
**offsite** | [**GetBuyerAnywhereResponseOffsite**](GetBuyerAnywhereResponseOffsite.md) |  |  [optional]
**savingCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]


<a name="Tier"></a>
## Enum: tier
Name | Value
---- | -----
tier | none, visual, identifier, vision


<a name="Verdict"></a>
## Enum: verdict
Name | Value
---- | -----
verdict | crossly_best, offsite_cheaper, offsite_only, no_match



