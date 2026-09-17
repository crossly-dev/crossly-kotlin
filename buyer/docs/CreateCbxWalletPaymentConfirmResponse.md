
# CreateCbxWalletPaymentConfirmResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentId** | **kotlin.String** |  | 
**duplicate** | **kotlin.Boolean** |  | 
**releaseDecision** | [**inline**](#ReleaseDecision) |  | 
**releaseReason** | **kotlin.String** |  | 
**baseUnits** | **kotlin.String** |  | 
**valueCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**centsPerToken** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**payerAddress** | **kotlin.String** |  | 
**riskExposures** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**riskLevel** | **kotlin.String** |  |  [optional]
**screeningProvider** | **kotlin.String** |  |  [optional]


<a name="ReleaseDecision"></a>
## Enum: releaseDecision
Name | Value
---- | -----
releaseDecision | review, release, refuse



