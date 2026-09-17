
# InlineObject3

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Which site this is for, e.g. \&quot;my Squarespace shop\&quot;. | 
**allowedOrigins** | **kotlin.collections.List&lt;kotlin.String&gt;** | Origins permitted to use this key, e.g. [\&quot;https://shop.example.com\&quot;]. LEAVE EMPTY to allow any origin — necessary when embedding on a platform whose domain you do not control, and the reason this is not locked by default. |  [optional]
**environment** | [**inline**](#Environment) |  |  [optional]


<a name="Environment"></a>
## Enum: environment
Name | Value
---- | -----
environment | live, test



