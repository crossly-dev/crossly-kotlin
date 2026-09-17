
# GetConnectionHealthResponseExtension

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**online** | **kotlin.Boolean** | Heartbeat within the last 15 minutes. False is NOT proof of breakage — a closed browser looks the same — so it is always paired with the durable timestamp below. | 
**lastBrowserPushAgo** | **kotlin.String** |  | 
**lastBrowserPushAt** | **kotlin.String** | Newest browser push across every account. The durable answer to \&quot;when did the extension last do anything\&quot;, surviving a Redis flush. |  [optional]
**reportedVersion** | **kotlin.String** | Highest version any platform&#39;s browser report carried, or null when the extension has never told us (it does not send one today — see the service README notes in routes/extension-health.ts). |  [optional]



