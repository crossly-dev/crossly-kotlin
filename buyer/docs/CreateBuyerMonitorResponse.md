
# CreateBuyerMonitorResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **kotlin.Boolean** |  | 
**matchCount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**createdAt** | **kotlin.String** |  | 
**id** | **kotlin.String** |  | 
**name** | **kotlin.String** |  | 
**kind** | [**inline**](#Kind) |  | 
**delivery** | [**inline**](#Delivery) |  | 
**pausedReason** | **kotlin.String** |  |  [optional]
**lastCheckedAt** | **kotlin.String** |  |  [optional]
**lastMatchAt** | **kotlin.String** |  |  [optional]
**webhookSecret** | **kotlin.String** |  |  [optional]
**webhookUrl** | **kotlin.String** |  |  [optional]


<a name="Kind"></a>
## Enum: kind
Name | Value
---- | -----
kind | new_listing, price_drop, back_in_stock


<a name="Delivery"></a>
## Enum: delivery
Name | Value
---- | -----
delivery | webhook, poll



