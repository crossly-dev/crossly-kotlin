
# UpdateMeTemplateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  | 
**userId** | **kotlin.String** |  | 
**scope** | **kotlin.String** |  | 
**name** | **kotlin.String** |  | 
**isDefault** | **kotlin.Boolean** |  | 
**sortOrder** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Snippet ordering — kept for scope&#x3D;&#39;description&#39; back-compat with  the description_templates.sort_order behavior. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**notes** | **kotlin.String** | Optional short blurb the seller can attach to remember what it&#39;s for. |  [optional]
**description** | **kotlin.String** | Primary description body. For scope&#x3D;&#39;description&#39; this is the  snippet body; for scope&#x3D;&#39;listing&#39; this is the default description  the seller wants pre-filled. |  [optional]
**descriptionVariants** | **kotlin.collections.List&lt;kotlin.String&gt;** | A/B variants for description. Populated for scope&#x3D;&#39;listing&#39;;  typically null for scope&#x3D;&#39;description&#39; (a snippet is one string). |  [optional]
**title** | **kotlin.String** |  |  [optional]
**titleVariants** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**brand** | **kotlin.String** |  |  [optional]
**condition** | **kotlin.String** | Master condition enum — new/like_new/good/fair/poor. |  [optional]
**color** | **kotlin.String** |  |  [optional]
**material** | **kotlin.String** |  |  [optional]
**propertySize** | **kotlin.String** |  |  [optional]
**sizeSystem** | **kotlin.String** |  |  [optional]
**weightOz** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**department** | **kotlin.String** |  |  [optional]
**gender** | **kotlin.String** |  |  [optional]
**style** | **kotlin.String** |  |  [optional]
**pattern** | **kotlin.String** |  |  [optional]
**itemType** | **kotlin.String** |  |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**defaultForCategory** | **kotlin.String** | When set, form&#39;s category picker prompts \&quot;Use your default for  this category\&quot; on match. |  [optional]
**shareToken** | **kotlin.String** | URL-safe random token. Populated by POST /me/templates/:id/share;  the /public/templates/:token route surfaces a read-only view any  visitor can browse + import. |  [optional]



