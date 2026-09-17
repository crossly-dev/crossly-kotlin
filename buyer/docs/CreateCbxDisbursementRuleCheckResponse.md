
# CreateCbxDisbursementRuleCheckResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outcome** | [**inline**](#Outcome) |  | 
**fired** | **kotlin.Boolean** |  | 
**poolBaseUnits** | **kotlin.String** |  | 
**thresholdBaseUnits** | **kotlin.String** |  | 
**distributeBaseUnits** | **kotlin.String** |  | 
**coverageBps** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**campaignId** | **kotlin.String** |  |  [optional]


<a name="Outcome"></a>
## Enum: outcome
Name | Value
---- | -----
outcome | fired, below_threshold, cadence, coverage, no_price, no_recipients, inactive



