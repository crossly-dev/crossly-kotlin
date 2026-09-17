
# CreateMagicScanResponsePossibleDuplicates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **kotlin.String** |  | 
**matchType** | [**inline**](#MatchType) |  | 
**score** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | 0–1 confidence. Image matches report 1; title matches the similarity. | 
**listingId** | **kotlin.String** | The seller&#39;s existing listing this scan probably duplicates (null if the  match landed only on an inventory item with no listing row). |  [optional]
**inventoryItemId** | **kotlin.String** | The inventory item behind that listing, when linked. Drives the  \&quot;View inventory\&quot; button. |  [optional]
**imageUrl** | **kotlin.String** |  |  [optional]
**variationGroupId** | **kotlin.String** | The variation group the matched listing already belongs to, if any.    This is what turns \&quot;you already have this\&quot; into something useful for a  seller scanning a size run. Scan the Medium, scan the Large, and the  second scan lands here — the honest answer is usually neither \&quot;it&#39;s the  same one\&quot; nor \&quot;it&#39;s different\&quot;, it&#39;s \&quot;it&#39;s another size of that\&quot;. Which  of the two offers to make depends entirely on this field:      null      → offer to CREATE a group from the match and the new listing    set       → offer to ADD the new listing to the group that exists    Without it the UI would have to guess, and guessing wrong means either a  second group beside the first or a silent no-op. |  [optional]


<a name="MatchType"></a>
## Enum: matchType
Name | Value
---- | -----
matchType | title, image



