
# CreateBuyerActivityResponseMatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verdict** | [**inline**](#Verdict) |  | 
**offer** | [**CreateBuyerActivityResponseMatchOffer**](CreateBuyerActivityResponseMatchOffer.md) |  | 
**conditionComparable** | **kotlin.Boolean** | TRUE means the offer&#39;s condition and the page&#39;s are comparable. False means we matched the item but not its state — a used Crossly copy against a retailer&#39;s new one — and the UI must say so rather than claim a saving. | 
**shippingKnown** | **kotlin.Boolean** | Always false today. Crossly shipping is computed at checkout from the buyer&#39;s address, which Scout does not have and should not send. Present so the surface that renders \&quot;before shipping\&quot; is reading a fact rather than hard-coding an assumption that stops being true when we add it. | 
**alternates** | [**kotlin.collections.List&lt;CreateBuyerActivityResponseMatchOffer&gt;**](CreateBuyerActivityResponseMatchOffer.md) | Other buyable offers for the SAME item, cheapest first, best excluded.  Deliberately not \&quot;you might also like\&quot;. We have no behavioural data to build that from, and inventing it would put unrelated items under a badge whose entire value is that it only ever appears when we have the thing the buyer is actually looking at.  What these ARE is the same product from other sellers, in other conditions, at other prices — which is the choice a buyer on a product page genuinely wants, and the one a single \&quot;cheapest\&quot; result hides. | 
**savingCents** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Positive when cheaper. Null when no page price was supplied. |  [optional]
**catalog** | [**GetCatalogLookupResponseCatalog**](GetCatalogLookupResponseCatalog.md) |  |  [optional]


<a name="Verdict"></a>
## Enum: verdict
Name | Value
---- | -----
verdict | cheaper, not_cheaper, no_page_price, currency_mismatch



