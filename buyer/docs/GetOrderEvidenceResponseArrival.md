
# GetOrderEvidenceResponseArrival

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**inline**](#State) |  | 
**windowHours** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**detail** | **kotlin.String** |  | 
**photos** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**requestedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**closesAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the window shuts. Null when nothing was ever asked. |  [optional]


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | not_requested, awaiting, submitted, declined, window_closed



