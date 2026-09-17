
# CreateMagicScanResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **kotlin.String** |  | 
**topHits** | [**kotlin.collections.List&lt;CreateMagicScanResponseTopHits&gt;**](CreateMagicScanResponseTopHits.md) | Unified top-10-globally list, ranked by CLIP visual similarity to  the seller&#39;s source photo. Each hit carries its origin platform. | 
**ebayHits** | [**kotlin.collections.List&lt;CreateMagicScanResponseEbayHits&gt;**](CreateMagicScanResponseEbayHits.md) | Legacy compat — UI&#39;s existing render. ebayHits now &#x3D;&#x3D; visually-  validated eBay subset; otherMatches is re-grouped from topHits. | 
**otherMatches** | [**kotlin.Any**](.md) |  | 
**imageUrls** | **kotlin.collections.List&lt;kotlin.String&gt;** | Every photo the seller uploaded for this scan, primary first. | 
**visionAspects** | [**kotlin.Any**](.md) | Vision-LLM aspects extracted across all photos. Populated only  when the seller has magic-list-vision-aspects enabled + a vision  provider configured. Empty otherwise. | 
**possibleDuplicates** | [**kotlin.collections.List&lt;CreateMagicScanResponsePossibleDuplicates&gt;**](CreateMagicScanResponsePossibleDuplicates.md) | The seller&#39;s OWN listings/inventory that this scan probably duplicates  (image + fuzzy-title self-dedup). Empty when nothing matched. Drives the  \&quot;you may already have this\&quot; prompt. | 
**cached** | **kotlin.Boolean** |  | 
**ebayMatch** | [**CreateMagicScanResponseEbayMatch**](CreateMagicScanResponseEbayMatch.md) |  |  [optional]



