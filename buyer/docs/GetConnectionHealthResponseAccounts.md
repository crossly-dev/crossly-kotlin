
# GetConnectionHealthResponseAccounts

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platformName** | **kotlin.String** |  | 
**summary** | **kotlin.String** | Plain-English \&quot;what is true\&quot; + \&quot;what to do\&quot;. Never empty. | 
**action** | **kotlin.String** |  | 
**liveness** | [**GetConnectionHealthResponseLiveness**](GetConnectionHealthResponseLiveness.md) |  | 
**platform** | **kotlin.String** |  | 
**state** | [**inline**](#State) |  | 
**severity** | [**inline**](#Severity) |  | 
**audience** | [**inline**](#Audience) |  | 
**notes** | **kotlin.collections.List&lt;kotlin.String&gt;** | Secondary observations that do not change the verdict but change the debugging. Always safe to show; never the only thing shown. | 
**accountId** | **kotlin.String** |  |  [optional]
**accountSlot** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**label** | **kotlin.String** |  |  [optional]
**platformUsername** | **kotlin.String** |  |  [optional]
**browser** | [**GetConnectionHealthResponseBrowser**](GetConnectionHealthResponseBrowser.md) |  |  [optional]
**anchors** | [**GetConnectionHealthResponseAnchors**](GetConnectionHealthResponseAnchors.md) |  |  [optional]


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | unknown, unmonitored, disconnected, healthy, stale, partial_blank, blank_credential, signed_out, anchor_drift, no_cookies


<a name="Severity"></a>
## Enum: severity
Name | Value
---- | -----
severity | error, ok, unknown, info, warn


<a name="Audience"></a>
## Enum: audience
Name | Value
---- | -----
audience | seller, crossly, nobody



