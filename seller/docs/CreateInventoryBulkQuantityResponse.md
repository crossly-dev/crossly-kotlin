
# CreateInventoryBulkQuantityResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affected** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Rows whose available stock actually changed. | 
**skipped** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Ids that did not move. Either they were already at that number, or they  aren&#39;t this seller&#39;s. The two are deliberately not distinguished: telling  a caller \&quot;that id isn&#39;t yours\&quot; confirms the id exists. | 
**bulkJobId** | **kotlin.String** | Watchable job for the marketplace fan-out, when one was started. |  [optional]



