
# CreateListingCheckDuplicateResponseMatches

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**suggested** | [**inline**](#Suggested) | What we&#39;d offer to do about this match. A suggestion for which button to  feature — never a decision. All three actions stay available. | 
**title** | **kotlin.String** |  | 
**matchType** | [**inline**](#MatchType) |  | 
**score** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | 0–1 confidence. Image matches report 1; title matches the similarity. | 
**variationGroupId** | **kotlin.String** | The variation group to ADD to, when the match already belongs to one.  Null means there is no group yet and choosing &#x60;variation&#x60; creates one from  the match plus the new listing. Without this the UI has to guess, and  guessing wrong means either a second group beside the first or a silent  no-op. |  [optional]
**listingId** | **kotlin.String** | The seller&#39;s existing listing this scan probably duplicates (null if the  match landed only on an inventory item with no listing row). |  [optional]
**inventoryItemId** | **kotlin.String** | The inventory item behind that listing, when linked. Drives the  \&quot;View inventory\&quot; button. |  [optional]
**imageUrl** | **kotlin.String** |  |  [optional]


<a name="Suggested"></a>
## Enum: suggested
Name | Value
---- | -----
suggested | variation, restock, duplicate


<a name="MatchType"></a>
## Enum: matchType
Name | Value
---- | -----
matchType | title, image



