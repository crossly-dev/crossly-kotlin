
# CreateMagicScanResponseTopHits

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platform** | **kotlin.String** |  | 
**title** | **kotlin.String** |  | 
**priceCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**origin** | **kotlin.String** | Origin marker for the UI badge. | 
**state** | [**inline**](#State) | &#39;active&#39; &#x3D; currently for sale; &#39;sold&#39; &#x3D; historical comp. UI  renders distinct badges so the seller can see both at a glance. | 
**imageUrl** | **kotlin.String** |  |  [optional]
**listingUrl** | **kotlin.String** |  |  [optional]
**visualSim** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | CLIP cosine [0,1]; populated after the visual-rank pass. |  [optional]


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | active, sold



