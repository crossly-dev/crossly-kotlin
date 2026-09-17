
# GetConnectionHealthResponseLiveness

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastBrowserPushAgo** | **kotlin.String** |  | 
**lastUsedAgo** | **kotlin.String** |  | 
**authFailureStreak** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**lastBrowserPushAt** | **kotlin.String** | The clean \&quot;the browser pushed cookies\&quot; signal. |  [optional]
**lastSyncedAt** | **kotlin.String** | Also stamped by the executor on any successful server-side call, so it is NOT evidence the extension is alive. Exposed for debugging only. |  [optional]
**lastUsedAt** | **kotlin.String** | Last server-exec attempt, success or fail. |  [optional]



