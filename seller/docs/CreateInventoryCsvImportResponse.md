
# CreateInventoryCsvImportResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**problems** | [**kotlin.collections.List&lt;CreateInventoryCsvImportResponseProblems&gt;**](CreateInventoryCsvImportResponseProblems.md) |  | 
**problemCount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**maxRows** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**created** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**updated** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**usable** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Rows that mapped cleanly. &#x60;created + updated&#x60; when not a dry run. | 
**totalRows** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**listingsCreated** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**dryRun** | **kotlin.Boolean** | True when nothing was written — a preview pass. | 



