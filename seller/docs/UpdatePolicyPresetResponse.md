
# UpdatePolicyPresetResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  | 
**userId** | **kotlin.String** |  | 
**kind** | **kotlin.String** | &#39;return&#39; | &#39;shipping&#39; | &#39;payment&#39; — validated at the route layer. | 
**name** | **kotlin.String** |  | 
**isDefault** | **kotlin.Boolean** | Auto-selected on new listings. At most one true per (user, kind). | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 



