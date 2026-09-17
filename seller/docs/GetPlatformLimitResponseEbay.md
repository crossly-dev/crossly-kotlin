
# GetPlatformLimitResponseEbay

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platform** | **kotlin.String** |  | 
**used** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**limit** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**remaining** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**tierConfigured** | **kotlin.Boolean** | False if the user hasn&#39;t picked a tier (we default to 250 but flag it so the UI can prompt). | 
**respectQuota** | **kotlin.Boolean** |  | 
**periodStart** | **kotlin.String** |  | 
**perOverageFeeUsd** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Approximate cost if &#x60;used&#x60; overflows &#x60;limit&#x60; — informational. | 
**sellingCap** | [**GetPlatformLimitResponseEbaySellingCap**](GetPlatformLimitResponseEbaySellingCap.md) |  |  [optional]



