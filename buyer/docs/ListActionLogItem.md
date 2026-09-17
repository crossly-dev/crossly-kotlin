
# ListActionLogItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**status** | **kotlin.String** |  | 
**source** | **kotlin.String** |  | 
**action** | **kotlin.String** |  | 
**category** | **kotlin.String** |  | 
**correlationId** | **kotlin.String** |  | 
**userId** | **kotlin.String** |  |  [optional]
**platform** | **kotlin.String** |  |  [optional]
**latencyMs** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**errorClass** | **kotlin.String** |  |  [optional]
**errorMessage** | **kotlin.String** |  |  [optional]
**ipAddress** | **kotlin.String** |  |  [optional]
**userAgent** | **kotlin.String** |  |  [optional]
**oauthAppId** | **kotlin.String** |  |  [optional]
**actorUserId** | **kotlin.String** |  |  [optional]
**finishedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**track** | **kotlin.String** |  |  [optional]
**targetType** | **kotlin.String** |  |  [optional]
**targetId** | **kotlin.String** |  |  [optional]
**httpStatus** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**actorEmail** | **kotlin.String** | Resolved from actorUserId so the UI can say \&quot;Jane relisted this\&quot; rather than printing a UUID. Null for worker/system actions, which genuinely had no human actor. |  [optional]
**actorDisplayName** | **kotlin.String** |  |  [optional]



