# net.crossly.buyer - Kotlin client library for Crossly Buyer API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://crossly.net/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BuyerApi* | [**createBuyerActivity**](docs/BuyerApi.md#createbuyeractivity) | **POST** /v1/buyer/activity | Report an item your user is looking at, and get our answer.
*BuyerApi* | [**createBuyerAuctionBid**](docs/BuyerApi.md#createbuyerauctionbid) | **POST** /v1/buyer/auctions/{slug}/bids | Place a bid, optionally with a proxy maximum. A WINNING BID IS CHARGED AUTOMATICALLY.
*BuyerApi* | [**createBuyerAuctionPay**](docs/BuyerApi.md#createbuyerauctionpay) | **POST** /v1/buyer/auctions/{slug}/pay | Pay for an auction you won whose automatic charge did not go through.
*BuyerApi* | [**createBuyerAuctionRetract**](docs/BuyerApi.md#createbuyerauctionretract) | **POST** /v1/buyer/auctions/{slug}/retract | Retract your bids under eBay’s rules — a typo, a changed listing, or an unreachable seller.
*BuyerApi* | [**createBuyerBoard**](docs/BuyerApi.md#createbuyerboard) | **POST** /v1/buyer/boards | Create an outfit board.
*BuyerApi* | [**createBuyerBoardItem**](docs/BuyerApi.md#createbuyerboarditem) | **POST** /v1/buyer/boards/{id}/items | Add a listing (by slug) to a board, at the next free spot.
*BuyerApi* | [**createBuyerBreakSpotHold**](docs/BuyerApi.md#createbuyerbreakspothold) | **POST** /v1/buyer/breaks/{id}/spots/{spotId}/hold | Hold a spot in a pick-your-spot break, then buy it through checkout before the hold lapses.
*BuyerApi* | [**createBuyerBuybackRequest**](docs/BuyerApi.md#createbuyerbuybackrequest) | **POST** /v1/buyer/buybacks/{id}/request | Ask Crossly to buy an item back under its buyback guarantee.
*BuyerApi* | [**createBuyerCartItem**](docs/BuyerApi.md#createbuyercartitem) | **POST** /v1/buyer/cart/items | Add a listing to your cart.
*BuyerApi* | [**createBuyerCartItemSaveForLater**](docs/BuyerApi.md#createbuyercartitemsaveforlater) | **POST** /v1/buyer/cart/items/{id}/save-for-later | Move a cart line to saved-for-later.
*BuyerApi* | [**createBuyerCartOptimizer**](docs/BuyerApi.md#createbuyercartoptimizer) | **POST** /v1/buyer/cart-optimizer | Cart optimizer: send a shopping list (one item per line, \"2 Charizard Base Set\") and get the cheapest delivered basket across sellers — one pick per line, items + each seller’s shipping with free-shipping thresholds applied. fewestPackages prefers fewer sellers. Nothing is added to the cart.
*BuyerApi* | [**createBuyerCartQuote**](docs/BuyerApi.md#createbuyercartquote) | **POST** /v1/buyer/cart/quote | Price the cart, delivered — item, shipping, tax, total.
*BuyerApi* | [**createBuyerCartSavedMoveToCart**](docs/BuyerApi.md#createbuyercartsavedmovetocart) | **POST** /v1/buyer/cart/saved/{id}/move-to-cart | Move a saved item back into your cart, at today’s price.
*BuyerApi* | [**createBuyerCaseCounter**](docs/BuyerApi.md#createbuyercasecounter) | **POST** /v1/buyer/cases/{id}/counter | Propose your own refund figure on a case.
*BuyerApi* | [**createBuyerCaseEscalate**](docs/BuyerApi.md#createbuyercaseescalate) | **POST** /v1/buyer/cases/{id}/escalate | Ask Crossly to step in on a case.
*BuyerApi* | [**createBuyerCaseMessage**](docs/BuyerApi.md#createbuyercasemessage) | **POST** /v1/buyer/cases/{id}/messages | Post a message on a case thread.
*BuyerApi* | [**createBuyerCaseRespond**](docs/BuyerApi.md#createbuyercaserespond) | **POST** /v1/buyer/cases/{id}/respond | Accept or reject the seller’s partial-refund offer on a case.
*BuyerApi* | [**createBuyerCaseWithdraw**](docs/BuyerApi.md#createbuyercasewithdraw) | **POST** /v1/buyer/cases/{id}/withdraw | Withdraw a case you opened.
*BuyerApi* | [**createBuyerCatalogListingRental**](docs/BuyerApi.md#createbuyercataloglistingrental) | **POST** /v1/buyer/catalog/listings/{slug}/rental | Book a rental. Returns a Stripe PaymentIntent client secret for rent + shipping both ways + deposit; the dates are held 30 minutes for payment. Crossly buys both labels; the deposit comes back after the item does.
*BuyerApi* | [**createBuyerCatalogListingRentalQuote**](docs/BuyerApi.md#createbuyercataloglistingrentalquote) | **POST** /v1/buyer/catalog/listings/{slug}/rental/quote | Price a rental: rent (the cheaper of by-the-day and by-the-week), both shipping legs once a ship-to is given, and the deposit. `problem` says why the dates can’t be booked.
*BuyerApi* | [**createBuyerCatalogListingVideoRequest**](docs/BuyerApi.md#createbuyercataloglistingvideorequest) | **POST** /v1/buyer/catalog/listings/{slug}/video-requests | Ask the seller for a video of an item (one open request per item). The seller is notified; their answer appears on the listing for every buyer.
*BuyerApi* | [**createBuyerConversationInvite**](docs/BuyerApi.md#createbuyerconversationinvite) | **POST** /v1/buyer/conversations/{id}/invite | Invite a friend into a chat with a seller: a single-use link (7 days) that makes whoever opens it a guest who can read and post. Only the thread’s buyer can invite; at most 5 guests.
*BuyerApi* | [**createBuyerConversationJoin**](docs/BuyerApi.md#createbuyerconversationjoin) | **POST** /v1/buyer/conversations/join/{token} | Join a chat you were invited into, as a guest.
*BuyerApi* | [**createBuyerFeedback**](docs/BuyerApi.md#createbuyerfeedback) | **POST** /v1/buyer/feedback | Leave feedback on up to 25 orders at once, with optional detailed seller ratings.
*BuyerApi* | [**createBuyerFitRef**](docs/BuyerApi.md#createbuyerfitref) | **POST** /v1/buyer/fit/refs | Save a reference garment (flat measurements, inches) to compare listings against.
*BuyerApi* | [**createBuyerFollowingSellerSeen**](docs/BuyerApi.md#createbuyerfollowingsellerseen) | **POST** /v1/buyer/following/sellers/seen | Clear the \"new listings\" count on a followed seller, or on all of them.
*BuyerApi* | [**createBuyerGiftCard**](docs/BuyerApi.md#createbuyergiftcard) | **POST** /v1/buyer/gift-cards | Start a gift card purchase.
*BuyerApi* | [**createBuyerGiftCardRedeem**](docs/BuyerApi.md#createbuyergiftcardredeem) | **POST** /v1/buyer/gift-cards/redeem | Redeem a gift card code into your own balance.
*BuyerApi* | [**createBuyerGroupBuyJoin**](docs/BuyerApi.md#createbuyergroupbuyjoin) | **POST** /v1/buyer/group-buys/{id}/join | Join a group buy: a hold at the starting price, captured at the price the group reaches. Checked against this key’s spending controls; send an Idempotency-Key.
*BuyerApi* | [**createBuyerGroupBuyLeave**](docs/BuyerApi.md#createbuyergroupbuyleave) | **POST** /v1/buyer/group-buys/{id}/leave | Leave a group buy and release your hold.
*BuyerApi* | [**createBuyerHunt**](docs/BuyerApi.md#createbuyerhunt) | **POST** /v1/buyer/hunts | Start a buyer-agent hunt — over a search (filters), or auto-buy on one listing (listingSlug: buy it once its price, sale applied, is within maxPriceCents). `offer` and `buy` modes also need buyer:checkout:write, and the budget is checked against this key’s spending controls.
*BuyerApi* | [**createBuyerInstantOfferAccept**](docs/BuyerApi.md#createbuyerinstantofferaccept) | **POST** /v1/buyer/instant-offers/{id}/accept | Accept Crossly’s instant offer on a collection item. Ops then send a prepaid label; the store credit is paid once the item arrives and checks out.
*BuyerApi* | [**createBuyerLayawayCancel**](docs/BuyerApi.md#createbuyerlayawaycancel) | **POST** /v1/buyer/layaways/{id}/cancel | Cancel a layaway: everything paid comes back except the layaway fee (10% of the price, at most $15).
*BuyerApi* | [**createBuyerLayawayPay**](docs/BuyerApi.md#createbuyerlayawaypay) | **POST** /v1/buyer/layaways/{id}/pay | Pay some (at least $1) or all of what is left now, on the saved card. Paid in full, it ships.
*BuyerApi* | [**createBuyerListingAudioSummary**](docs/BuyerApi.md#createbuyerlistingaudiosummary) | **POST** /v1/buyer/listings/{slug}/audio-summary | Record the spoken summary of a listing (cached per listing version). 503 naming TTS_API_KEY when no speech provider is configured.
*BuyerApi* | [**createBuyerListingSplit**](docs/BuyerApi.md#createbuyerlistingsplit) | **POST** /v1/buyer/listings/{slug}/split | Split a purchase: one pay link per person; nobody is charged until all have paid.
*BuyerApi* | [**createBuyerListingSubscribe**](docs/BuyerApi.md#createbuyerlistingsubscribe) | **POST** /v1/buyer/listings/{slug}/subscribe | Subscribe & save: a standing order charged to your saved card every interval. Checked against this key’s spending controls; send an Idempotency-Key.
*BuyerApi* | [**createBuyerListingTryOn**](docs/BuyerApi.md#createbuyerlistingtryon) | **POST** /v1/buyer/listings/{slug}/try-on | Render an AI try-on of this listing on the buyer’s own photo (base64 `photo`, or `reuseLastPhoto`). `confirmSelfAdult` must be true: the photo is of the buyer and they are 18+. Wearables only; capped per day; 503 naming TRYON_API_KEY when no image model is configured.
*BuyerApi* | [**createBuyerMarketBid**](docs/BuyerApi.md#createbuyermarketbid) | **POST** /v1/buyer/market/bids | Place a fixed-price market bid. SPENDS MONEY: it fills against the lowest ask at or under your price and charges your saved card (plus the fast-ship premium when fastShip is set and it fills from vault stock). deliverTo vault keeps it in your Crossly vault; gradeWith sends a raw card to a Grading run first. Checked against this key’s spending controls; send an Idempotency-Key.
*BuyerApi* | [**createBuyerMarketWatch**](docs/BuyerApi.md#createbuyermarketwatch) | **POST** /v1/buyer/market/watches | Watch a market variant: alert at or below a price, or on any drop.
*BuyerApi* | [**createBuyerOffer**](docs/BuyerApi.md#createbuyeroffer) | **POST** /v1/buyer/offers | Offer a price on a listing.
*BuyerApi* | [**createBuyerOfferRespond**](docs/BuyerApi.md#createbuyerofferrespond) | **POST** /v1/buyer/offers/{id}/respond | Answer a seller’s counteroffer — accept, decline, or counter back.
*BuyerApi* | [**createBuyerOrderCancel**](docs/BuyerApi.md#createbuyerordercancel) | **POST** /v1/buyer/orders/{id}/cancel | Cancel an order before it ships — refunds it in full.
*BuyerApi* | [**createBuyerOrderInr**](docs/BuyerApi.md#createbuyerorderinr) | **POST** /v1/buyer/orders/{id}/inr | Open an item-not-received case.
*BuyerApi* | [**createBuyerOrderReceived**](docs/BuyerApi.md#createbuyerorderreceived) | **POST** /v1/buyer/orders/{id}/received | Confirm you received an order.
*BuyerApi* | [**createBuyerOrderTip**](docs/BuyerApi.md#createbuyerordertip) | **POST** /v1/buyer/orders/{id}/tip | Tip the seller on one of your shipped orders, charged to your saved card. One tip per order; $1–$500; checked against this key’s spending controls.
*BuyerApi* | [**createBuyerPackFairnessRotate**](docs/BuyerApi.md#createbuyerpackfairnessrotate) | **POST** /v1/buyer/packs/fairness/rotate | Reveal your current server seed and start a new one (optionally with your own client seed). Refused while an opening is awaiting payment.
*BuyerApi* | [**createBuyerPackOpen**](docs/BuyerApi.md#createbuyerpackopen) | **POST** /v1/buyer/packs/{slug}/open | Open a pack. SPENDS MONEY: charges the pack price to your saved card, then pulls one real item by the published odds (provably fair: see /buyer/packs/fairness) into your Crossly vault. confirmAdult must be true. Checked against this key’s spending controls; send an Idempotency-Key.
*BuyerApi* | [**createBuyerPackOpeningSellBack**](docs/BuyerApi.md#createbuyerpackopeningsellback) | **POST** /v1/buyer/pack-openings/{id}/sell-back | Sell a pull straight back for Crossly credit at the pack’s buyback rate, within its window, while it is still in your vault.
*BuyerApi* | [**createBuyerPassportClaim**](docs/BuyerApi.md#createbuyerpassportclaim) | **POST** /v1/buyer/passports/{code}/claim | Claim a passport as the item’s current owner (the buyer of its latest sale) — shown as “in its owner’s hands” until it sells again.
*BuyerApi* | [**createBuyerProtectionPlanCancel**](docs/BuyerApi.md#createbuyerprotectionplancancel) | **POST** /v1/buyer/protection-plans/{id}/cancel | Cancel a protection plan. The insurer decides what is refundable (pro-rata after the free-look window); that amount goes back to the card.
*BuyerApi* | [**createBuyerPurchaseDownload**](docs/BuyerApi.md#createbuyerpurchasedownload) | **POST** /v1/buyer/purchases/{id}/download | A ten-minute link to a digital purchase’s file; each call uses one of its downloads.
*BuyerApi* | [**createBuyerPurchaseFit**](docs/BuyerApi.md#createbuyerpurchasefit) | **POST** /v1/buyer/purchases/{id}/fit | Say how a delivered purchase fit: true_to_size, small or large. It teaches your size memory and, pooled with other buyers, how the brand runs.
*BuyerApi* | [**createBuyerPurchaseReturn**](docs/BuyerApi.md#createbuyerpurchasereturn) | **POST** /v1/buyer/purchases/{id}/return | Return a purchase under the seller’s policy, or send back a try-at-home item. With reason doesnt_fit, `fit` (small | large) says which way, and it feeds your size memory.
*BuyerApi* | [**createBuyerRegistry**](docs/BuyerApi.md#createbuyerregistry) | **POST** /v1/buyer/registries | Start a gift registry (wedding, baby, birthday, housewarming, graduation, other). Items are added like any wishlist item; set shipAddressId to one of your saved addresses so guests can buy — they never see it.
*BuyerApi* | [**createBuyerRegistryGiftThanked**](docs/BuyerApi.md#createbuyerregistrygiftthanked) | **POST** /v1/buyer/registries/{id}/gifts/{giftId}/thanked | Tick a gift as thanked (or untick it).
*BuyerApi* | [**createBuyerRentalArrivalPhoto**](docs/BuyerApi.md#createbuyerrentalarrivalphoto) | **POST** /v1/buyer/rentals/{id}/arrival-photos | Photograph a rental on arrival (URLs you uploaded): your side of the condition record.
*BuyerApi* | [**createBuyerRentalCancel**](docs/BuyerApi.md#createbuyerrentalcancel) | **POST** /v1/buyer/rentals/{id}/cancel | Cancel a rental that has not shipped: everything is refunded.
*BuyerApi* | [**createBuyerRentalClaimResponse**](docs/BuyerApi.md#createbuyerrentalclaimresponse) | **POST** /v1/buyer/rentals/{id}/claim-response | Answer a deposit claim: accept (the claim is paid, the rest refunded) or dispute (Crossly decides).
*BuyerApi* | [**createBuyerRentalIdentityStart**](docs/BuyerApi.md#createbuyerrentalidentitystart) | **POST** /v1/buyer/rentals/identity/start | Start the ID check renting needs (Stripe Identity: photo ID + selfie). Open `url` (hosted) or use `clientSecret` with Stripe.js.
*BuyerApi* | [**createBuyerReturnCancel**](docs/BuyerApi.md#createbuyerreturncancel) | **POST** /v1/buyer/returns/{id}/cancel | Cancel a return before it ships.
*BuyerApi* | [**createBuyerReturnTracking**](docs/BuyerApi.md#createbuyerreturntracking) | **POST** /v1/buyer/returns/{id}/tracking | Add tracking to a return you shipped on your own label.
*BuyerApi* | [**createBuyerSellerClubJoin**](docs/BuyerApi.md#createbuyersellerclubjoin) | **POST** /v1/buyer/sellers/{sellerUserId}/club/join | Join a seller’s loyalty club (free). Your tier’s discount then applies to their items — the best of it and any other rate you have with them, never stacked.
*BuyerApi* | [**createBuyerSellerReport**](docs/BuyerApi.md#createbuyersellerreport) | **POST** /v1/buyer/sellers/{username}/report | Report a seller to Crossly’s trust team.
*BuyerApi* | [**createBuyerSplitCancel**](docs/BuyerApi.md#createbuyersplitcancel) | **POST** /v1/buyer/splits/{id}/cancel | Cancel a split you organised; every held share is released.
*BuyerApi* | [**createBuyerTogether**](docs/BuyerApi.md#createbuyertogether) | **POST** /v1/buyer/together | Start a shop-together room.
*BuyerApi* | [**createBuyerTogetherItem**](docs/BuyerApi.md#createbuyertogetheritem) | **POST** /v1/buyer/together/{code}/items | Add a listing to a shop-together board.
*BuyerApi* | [**createBuyerTogetherItemVote**](docs/BuyerApi.md#createbuyertogetheritemvote) | **POST** /v1/buyer/together/{code}/items/{id}/vote | Vote an item on a room’s board up (1), down (-1) or clear (0).
*BuyerApi* | [**createBuyerTogetherJoin**](docs/BuyerApi.md#createbuyertogetherjoin) | **POST** /v1/buyer/together/{code}/join | Join a shop-together room by its code.
*BuyerApi* | [**createBuyerTogetherLeave**](docs/BuyerApi.md#createbuyertogetherleave) | **POST** /v1/buyer/together/{code}/leave | Leave a shop-together room.
*BuyerApi* | [**createBuyerTogetherMessage**](docs/BuyerApi.md#createbuyertogethermessage) | **POST** /v1/buyer/together/{code}/messages | Say something in a shop-together room.
*BuyerApi* | [**createBuyerTotalRequest**](docs/BuyerApi.md#createbuyertotalrequest) | **POST** /v1/buyer/total-requests | Ask a seller for one combined shipping total on everything of theirs in your cart.
*BuyerApi* | [**createBuyerVaultList**](docs/BuyerApi.md#createbuyervaultlist) | **POST** /v1/buyer/vault/{id}/list | Sell a vault item on the market at your price. It is already authenticated, so when it sells nothing ships in: the buyer keeps it vaulted or it ships straight to them.
*BuyerApi* | [**createBuyerVaultUnlist**](docs/BuyerApi.md#createbuyervaultunlist) | **POST** /v1/buyer/vault/{id}/unlist | Take a vault item off the market; it stays stored.
*BuyerApi* | [**createBuyerVaultWithdraw**](docs/BuyerApi.md#createbuyervaultwithdraw) | **POST** /v1/buyer/vault/{id}/withdraw | Ship a vault item home, standard or expedited. The shipping, any storage it owes and the early-withdrawal fee (within 90 days of arriving) are charged to your saved card now, all checked against this key’s spending controls; send an Idempotency-Key.
*BuyerApi* | [**createBuyerWishlist**](docs/BuyerApi.md#createbuyerwishlist) | **POST** /v1/buyer/wishlists | Create a wishlist.
*BuyerApi* | [**createBuyerWishlistInvite**](docs/BuyerApi.md#createbuyerwishlistinvite) | **POST** /v1/buyer/wishlists/{id}/invite | Share a wishlist with a co-editor: a single-use link (14 days). Members add and remove items; only the owner renames, deletes or removes members. At most 20.
*BuyerApi* | [**createBuyerWishlistItem**](docs/BuyerApi.md#createbuyerwishlistitem) | **POST** /v1/buyer/wishlists/{id}/items | Add a listing to a wishlist.
*BuyerApi* | [**createBuyerWishlistJoin**](docs/BuyerApi.md#createbuyerwishlistjoin) | **POST** /v1/buyer/wishlists/join/{token} | Join a wishlist you were invited to edit.
*BuyerApi* | [**createBuyerWishlistShare**](docs/BuyerApi.md#createbuyerwishlistshare) | **POST** /v1/buyer/wishlists/{id}/share | Share a wishlist — makes it public and returns its link.
*BuyerApi* | [**deleteBuyerBoard**](docs/BuyerApi.md#deletebuyerboard) | **DELETE** /v1/buyer/boards/{id} | Delete a board.
*BuyerApi* | [**deleteBuyerBoardItem**](docs/BuyerApi.md#deletebuyerboarditem) | **DELETE** /v1/buyer/boards/{id}/items/{platformListingId} | Take a listing off a board.
*BuyerApi* | [**deleteBuyerBreakSpotHold**](docs/BuyerApi.md#deletebuyerbreakspothold) | **DELETE** /v1/buyer/breaks/{id}/spots/{spotId}/hold | Release a break spot you hold.
*BuyerApi* | [**deleteBuyerCartItem**](docs/BuyerApi.md#deletebuyercartitem) | **DELETE** /v1/buyer/cart/items/{id} | Remove a line from your cart.
*BuyerApi* | [**deleteBuyerCartSaved**](docs/BuyerApi.md#deletebuyercartsaved) | **DELETE** /v1/buyer/cart/saved/{id} | Remove an item from saved-for-later. Returns the remaining list.
*BuyerApi* | [**deleteBuyerConversationGuest**](docs/BuyerApi.md#deletebuyerconversationguest) | **DELETE** /v1/buyer/conversations/{id}/guests/{userId} | Remove a guest (the thread’s buyer), or leave (a guest, with your own user id).
*BuyerApi* | [**deleteBuyerFitRef**](docs/BuyerApi.md#deletebuyerfitref) | **DELETE** /v1/buyer/fit/refs/{id} | Delete a reference garment.
*BuyerApi* | [**deleteBuyerMarketBid**](docs/BuyerApi.md#deletebuyermarketbid) | **DELETE** /v1/buyer/market/bids/{id} | Cancel a resting market bid.
*BuyerApi* | [**deleteBuyerMarketWatch**](docs/BuyerApi.md#deletebuyermarketwatch) | **DELETE** /v1/buyer/market/watches/{id} | Stop watching a market variant.
*BuyerApi* | [**deleteBuyerOffer**](docs/BuyerApi.md#deletebuyeroffer) | **DELETE** /v1/buyer/offers/{id} | Withdraw an offer you made that the seller has not answered.
*BuyerApi* | [**deleteBuyerRecentlyViewed**](docs/BuyerApi.md#deletebuyerrecentlyviewed) | **DELETE** /v1/buyer/recently-viewed/{slug} | Remove one listing from your recently viewed.
*BuyerApi* | [**deleteBuyerRecentlyViewed2**](docs/BuyerApi.md#deletebuyerrecentlyviewed2) | **DELETE** /v1/buyer/recently-viewed | Clear your recently viewed list.
*BuyerApi* | [**deleteBuyerRegistry**](docs/BuyerApi.md#deletebuyerregistry) | **DELETE** /v1/buyer/registries/{id} | Delete a registry (and the wishlist behind it).
*BuyerApi* | [**deleteBuyerSellerClubJoin**](docs/BuyerApi.md#deletebuyersellerclubjoin) | **DELETE** /v1/buyer/sellers/{sellerUserId}/club/join | Leave a seller’s loyalty club.
*BuyerApi* | [**deleteBuyerTogetherItem**](docs/BuyerApi.md#deletebuyertogetheritem) | **DELETE** /v1/buyer/together/{code}/items/{id} | Take an item you added off a room’s board.
*BuyerApi* | [**deleteBuyerTotalRequest**](docs/BuyerApi.md#deletebuyertotalrequest) | **DELETE** /v1/buyer/total-requests/{id} | Cancel a total request you made.
*BuyerApi* | [**deleteBuyerTryOn**](docs/BuyerApi.md#deletebuyertryon) | **DELETE** /v1/buyer/try-ons/{id} | Delete a try-on and its images — or pass `all` to delete every photo and result.
*BuyerApi* | [**deleteBuyerWishlist**](docs/BuyerApi.md#deletebuyerwishlist) | **DELETE** /v1/buyer/wishlists/{id} | Delete a wishlist and everything on it.
*BuyerApi* | [**deleteBuyerWishlistItem**](docs/BuyerApi.md#deletebuyerwishlistitem) | **DELETE** /v1/buyer/wishlists/{id}/items/{slug} | Take a listing off a wishlist.
*BuyerApi* | [**deleteBuyerWishlistMember**](docs/BuyerApi.md#deletebuyerwishlistmember) | **DELETE** /v1/buyer/wishlists/{id}/members/{userId} | Remove a co-editor (the owner), or leave a list shared with you (your own user id).
*BuyerApi* | [**getBuyerAuctionMe**](docs/BuyerApi.md#getbuyerauctionme) | **GET** /v1/buyer/auctions/{slug}/me | Where you stand in one auction — your max, leading, won, must you pay.
*BuyerApi* | [**getBuyerBadge**](docs/BuyerApi.md#getbuyerbadge) | **GET** /v1/buyer/badges | The counts behind the account badge — unread messages, offers waiting, orders to review.
*BuyerApi* | [**getBuyerBoard**](docs/BuyerApi.md#getbuyerboard) | **GET** /v1/buyer/boards/{id} | One of your boards with its layout: each item’s x, y and width as fractions of the board, and stacking order.
*BuyerApi* | [**getBuyerBoardShared**](docs/BuyerApi.md#getbuyerboardshared) | **GET** /v1/buyer/boards/shared/{token} | A shared outfit board, by its link token.
*BuyerApi* | [**getBuyerBreak**](docs/BuyerApi.md#getbuyerbreak) | **GET** /v1/buyer/breaks/{id} | A card break’s board: spots, holders, and the seed after the draw.
*BuyerApi* | [**getBuyerCase**](docs/BuyerApi.md#getbuyercase) | **GET** /v1/buyer/cases/{id} | One case — its state, the message thread, and the return parcel if there is one.
*BuyerApi* | [**getBuyerCatalogListingMySize**](docs/BuyerApi.md#getbuyercataloglistingmysize) | **GET** /v1/buyer/catalog/listings/{slug}/my-size | This item against your size: the size you keep in this kind of item (and in this brand), whether this one is your size, smaller or larger, a warning if this brand and size ran small or large on you before, and how other buyers say the brand runs. null for an unsized item.
*BuyerApi* | [**getBuyerCatalogListingPrice**](docs/BuyerApi.md#getbuyercataloglistingprice) | **GET** /v1/buyer/catalog/listings/{slug}/price | The price today. When the seller has the same item live on another marketplace for less, this IS that price (`priceMatch` says where from), and `lowestAnywhere` lists the marketplaces it is guaranteed not to be cheaper on. `priceCheck` rates it against real sales of the same catalog item in the same condition over the last 180 days (great / good / fair / high, with the median and middle-half range in cents); null until there are 3+ sales from 2+ sellers.
*BuyerApi* | [**getBuyerCatalogListingRental**](docs/BuyerApi.md#getbuyercataloglistingrental) | **GET** /v1/buyer/catalog/listings/{slug}/rental | Whether a listing is for rent: day and week rates, the refundable deposit, length limits, the turnaround buffer, and the dates already booked. null when it is not for rent.
*BuyerApi* | [**getBuyerCheckoutUsdc**](docs/BuyerApi.md#getbuyercheckoutusdc) | **GET** /v1/buyer/checkout/usdc | Whether Crossly takes USDC (Stripe stablecoin payments: Solana, Ethereum, Base, Polygon), and its per-order limit. Paying needs the buyer’s wallet, so it happens in the browser checkout, never unattended.
*BuyerApi* | [**getBuyerCollectionOffer**](docs/BuyerApi.md#getbuyercollectionoffer) | **GET** /v1/buyer/collection/{id}/offer | What an item in your collection would fetch now: the top open bid on the market for the same variant, condition and grade, and Crossly’s instant offer in store credit when that is switched on (a quote valid for a limited time).
*BuyerApi* | [**getBuyerCollectionSet**](docs/BuyerApi.md#getbuyercollectionset) | **GET** /v1/buyer/collection/sets/{category}/{brand}/{model} | One set: every piece (owned or missing, with its lowest ask on the market), what completing it would cost now, and the leaderboard of collectors who opted in, with your rank.
*BuyerApi* | [**getBuyerCreator**](docs/BuyerApi.md#getbuyercreator) | **GET** /v1/buyer/creators/{handle} | A creator storefront: profile, affiliate code, and shelves of live picks.
*BuyerApi* | [**getBuyerFitVocabulary**](docs/BuyerApi.md#getbuyerfitvocabulary) | **GET** /v1/buyer/fit/vocabulary | Garment kinds and the measurements each takes.
*BuyerApi* | [**getBuyerGiftFinderOption**](docs/BuyerApi.md#getbuyergiftfinderoption) | **GET** /v1/buyer/gift-finder/options | The gift finder’s questions: recipients, interests, budgets.
*BuyerApi* | [**getBuyerImpact**](docs/BuyerApi.md#getbuyerimpact) | **GET** /v1/buyer/impact | The sourced footprint your secondhand purchases avoided.
*BuyerApi* | [**getBuyerLayaway**](docs/BuyerApi.md#getbuyerlayaway) | **GET** /v1/buyer/layaways/{id} | One layaway and its schedule.
*BuyerApi* | [**getBuyerListingAudioSummary**](docs/BuyerApi.md#getbuyerlistingaudiosummary) | **GET** /v1/buyer/listings/{slug}/audio-summary | A spoken summary of a listing (accessibility): the text, built only from the listing’s own fields and the seller’s description, and the recording of it when one exists.
*BuyerApi* | [**getBuyerListingBoughtTogether**](docs/BuyerApi.md#getbuyerlistingboughttogether) | **GET** /v1/buyer/listings/{slug}/bought-together | Frequently bought together / complete the look.
*BuyerApi* | [**getBuyerListingBreak**](docs/BuyerApi.md#getbuyerlistingbreak) | **GET** /v1/buyer/listings/{slug}/break | The card break this listing sells spots in, if any; the seed is revealed after the draw.
*BuyerApi* | [**getBuyerListingCert**](docs/BuyerApi.md#getbuyerlistingcert) | **GET** /v1/buyer/listings/{slug}/cert | A graded listing’s cert, checked with the grader: the seller’s claim (grader, grade, cert number), status (verified, mismatch, not_found, or unchecked where the grader has no lookup), population and how many graded higher where the grader publishes them, and the grader’s own cert page.
*BuyerApi* | [**getBuyerListingFit**](docs/BuyerApi.md#getbuyerlistingfit) | **GET** /v1/buyer/listings/{slug}/fit | A listing’s flat measurements, compared with your saved reference garments.
*BuyerApi* | [**getBuyerListingGroupBuy**](docs/BuyerApi.md#getbuyerlistinggroupbuy) | **GET** /v1/buyer/listings/{slug}/group-buy | The group buy open on this listing, if any.
*BuyerApi* | [**getBuyerListingImpact**](docs/BuyerApi.md#getbuyerlistingimpact) | **GET** /v1/buyer/listings/{slug}/impact | The sourced footprint of making a new equivalent; null when no published figure applies.
*BuyerApi* | [**getBuyerListingResaleValue**](docs/BuyerApi.md#getbuyerlistingresalevalue) | **GET** /v1/buyer/listings/{slug}/resale-value | What the same brand and category resold for on Crossly, and the buyback offer when enabled.
*BuyerApi* | [**getBuyerListingSubscribeOffer**](docs/BuyerApi.md#getbuyerlistingsubscribeoffer) | **GET** /v1/buyer/listings/{slug}/subscribe-offer | The subscribe & save discount and intervals on a listing; null when the seller has none.
*BuyerApi* | [**getBuyerListingTryOn**](docs/BuyerApi.md#getbuyerlistingtryon) | **GET** /v1/buyer/listings/{slug}/try-on | Whether an AI try-on is offered for this listing (a wearable with a photo) and whether the image model is configured.
*BuyerApi* | [**getBuyerLiveStreamAuction**](docs/BuyerApi.md#getbuyerlivestreamauction) | **GET** /v1/buyer/live-streams/{id}/auction | The auction running on a live stream right now, if any. Bid on it by its `slug` at POST /v1/buyer/auctions/:slug/bids.
*BuyerApi* | [**getBuyerMarketPurchaseOption**](docs/BuyerApi.md#getbuyermarketpurchaseoption) | **GET** /v1/buyer/market/purchase-options | Before you bid or buy: whether the lowest ask is vault stock (keep it vaulted, or pay fastShipCents to rush it), and the grading runs a raw card can go straight to (pass gradeWith on the bid).
*BuyerApi* | [**getBuyerOrderEligibility**](docs/BuyerApi.md#getbuyerordereligibility) | **GET** /v1/buyer/orders/{id}/eligibility | What you can do with one order right now — cancel, confirm receipt, report not received, leave feedback.
*BuyerApi* | [**getBuyerOrderExport**](docs/BuyerApi.md#getbuyerorderexport) | **GET** /v1/buyer/orders/export | Your order history as CSV text (up to 5,000 orders).
*BuyerApi* | [**getBuyerOrderPriceProtection**](docs/BuyerApi.md#getbuyerorderpriceprotection) | **GET** /v1/buyer/orders/{id}/price-protection | Price protection on one order: if the item gets cheaper before `until`, the difference is credited to your Bucks automatically. `creditedCents` is what it has paid so far.
*BuyerApi* | [**getBuyerPack**](docs/BuyerApi.md#getbuyerpack) | **GET** /v1/buyer/packs/{slug} | One pack: tiers and odds, items left, expected value, the chase items still in it.
*BuyerApi* | [**getBuyerPackFairness**](docs/BuyerApi.md#getbuyerpackfairness) | **GET** /v1/buyer/packs/fairness | Your provably-fair seeds: the active server-seed commitment (sha256), your client seed and nonce, and every retired seed in full so past openings can be re-run.
*BuyerApi* | [**getBuyerParty**](docs/BuyerApi.md#getbuyerparty) | **GET** /v1/buyer/parties/{slug} | One shopping party.
*BuyerApi* | [**getBuyerPassport**](docs/BuyerApi.md#getbuyerpassport) | **GET** /v1/buyer/passports/{code} | What a product passport tag opens: the item, whether it was authenticated, how many owners on Crossly and since when — never who or for how much.
*BuyerApi* | [**getBuyerPreference**](docs/BuyerApi.md#getbuyerpreference) | **GET** /v1/buyer/preferences | The shopping profile derived from that activity.
*BuyerApi* | [**getBuyerPriceGuide**](docs/BuyerApi.md#getbuyerpriceguide) | **GET** /v1/buyer/price-guide | What matching items actually sold for on Crossly: median, quartiles, by month, and recent sales. Needs q, brand or category.
*BuyerApi* | [**getBuyerProfile**](docs/BuyerApi.md#getbuyerprofile) | **GET** /v1/buyer/profile | Your Crossly shopping profile — name, email, saved address, Bucks balance.
*BuyerApi* | [**getBuyerPurchaseDelivery**](docs/BuyerApi.md#getbuyerpurchasedelivery) | **GET** /v1/buyer/purchases/{id}/delivery | Where a purchase is going when not to your door: the pickup point (with its release code) or its ship-together consolidation.
*BuyerApi* | [**getBuyerPurchaseLiveMoment**](docs/BuyerApi.md#getbuyerpurchaselivemoment) | **GET** /v1/buyer/purchases/{id}/live-moment | The live show a purchase was bought in, with the offset (seconds) into its replay where it sold. null when it was not bought in a show.
*BuyerApi* | [**getBuyerPurchaseReturn**](docs/BuyerApi.md#getbuyerpurchasereturn) | **GET** /v1/buyer/purchases/{id}/return | What a return would refund for each reason, by when, and any return already open.
*BuyerApi* | [**getBuyerPurchaseStory**](docs/BuyerApi.md#getbuyerpurchasestory) | **GET** /v1/buyer/purchases/{id}/story | Your owner story on a purchase, passed on to the next owner if you resell it.
*BuyerApi* | [**getBuyerRegistry**](docs/BuyerApi.md#getbuyerregistry) | **GET** /v1/buyer/registries/{id} | One of your registries: items with how many are wanted and bought.
*BuyerApi* | [**getBuyerRegistryByToken**](docs/BuyerApi.md#getbuyerregistrybytoken) | **GET** /v1/buyer/registry/{token} | A registry as a guest sees it: items, how many are still wanted, and whether it can ship. Never the address.
*BuyerApi* | [**getBuyerRentalEligibility**](docs/BuyerApi.md#getbuyerrentaleligibility) | **GET** /v1/buyer/rentals/eligibility | Can you rent right now: ID-verified (a photo ID and a matching selfie, once), the verified name rentals ship to, and your standing (one rental at a time until your first comes back; none after one that never did).
*BuyerApi* | [**getBuyerSellerClub**](docs/BuyerApi.md#getbuyersellerclub) | **GET** /v1/buyer/sellers/{sellerUserId}/club | A seller’s loyalty club: its tiers (spend threshold, discount, perks) and your standing. null when the seller has none.
*BuyerApi* | [**getBuyerSellerTrust**](docs/BuyerApi.md#getbuyersellertrust) | **GET** /v1/buyer/sellers/{username}/trust | Seller at a glance: member since, completed sales, independent rating, typical handling time, dispute rate, trust tier, badges — and the plain sentences the profile shows.
*BuyerApi* | [**getBuyerTogether**](docs/BuyerApi.md#getbuyertogether) | **GET** /v1/buyer/together/{code} | A shop-together room: members, the board with votes, and chat.
*BuyerApi* | [**getBuyerVaultMarketHistory**](docs/BuyerApi.md#getbuyervaultmarkethistory) | **GET** /v1/buyer/vault-markets/history | Your Vault Markets value by day at the marks (oldest first, today live) over `days` (default 90), and today’s change against yesterday’s close.
*BuyerApi* | [**getBuyerVaultMarketIndex**](docs/BuyerApi.md#getbuyervaultmarketindex) | **GET** /v1/buyer/vault-markets/indexes/{slug} | One index with its published daily closes (oldest first, `days` default 365) and its level now.
*BuyerApi* | [**getBuyerVaultMarketInstantExit**](docs/BuyerApi.md#getbuyervaultmarketinstantexit) | **GET** /v1/buyer/vault-markets/instant-exit/{id} | The Instant Exit quote for one vault unit you hold, and whether it can be sold now.
*BuyerApi* | [**getBuyerVaultMarketWorth**](docs/BuyerApi.md#getbuyervaultmarketworth) | **GET** /v1/buyer/vault-markets/worth | What your vault is worth now: value at the market prices (marks come only from trades) split into reliable and indicative marks, cost and P&L, today’s change, and an estimate of what the units free to sell would fetch from the bids resting on the book now. Read only.
*BuyerApi* | [**listBuyerActivity**](docs/BuyerApi.md#listbuyeractivity) | **GET** /v1/buyer/activity | What this buyer has compared lately.
*BuyerApi* | [**listBuyerAuctionBids**](docs/BuyerApi.md#listbuyerauctionbids) | **GET** /v1/buyer/auctions/{slug}/bids | An auction’s bid history, highest first, bidders anonymised.
*BuyerApi* | [**listBuyerAuctions**](docs/BuyerApi.md#listbuyerauctions) | **GET** /v1/buyer/auctions | Auctions you have bid in — bidding, won or lost (last 100).
*BuyerApi* | [**listBuyerBoards**](docs/BuyerApi.md#listbuyerboards) | **GET** /v1/buyer/boards | Your outfit boards: collages of listings, each with a share link.
*BuyerApi* | [**listBuyerBreaks**](docs/BuyerApi.md#listbuyerbreaks) | **GET** /v1/buyer/breaks | Card-break spots you hold or bought, with what each pulled.
*BuyerApi* | [**listBuyerBuybacks**](docs/BuyerApi.md#listbuyerbuybacks) | **GET** /v1/buyer/buybacks | Your buyback guarantees and requests.
*BuyerApi* | [**listBuyerCart**](docs/BuyerApi.md#listbuyercart) | **GET** /v1/buyer/cart | What is in your Crossly cart.
*BuyerApi* | [**listBuyerCartSaved**](docs/BuyerApi.md#listbuyercartsaved) | **GET** /v1/buyer/cart/saved | Items you saved for later out of your cart (last 200).
*BuyerApi* | [**listBuyerCases**](docs/BuyerApi.md#listbuyercases) | **GET** /v1/buyer/cases | Resolution center — every case you opened (returns, not received, problems).
*BuyerApi* | [**listBuyerCashback**](docs/BuyerApi.md#listbuyercashback) | **GET** /v1/buyer/cashback | Your Scout cashback — pending, confirmed, paid.
*BuyerApi* | [**listBuyerCatalogListingVideos**](docs/BuyerApi.md#listbuyercataloglistingvideos) | **GET** /v1/buyer/catalog/listings/{slug}/videos | Videos the seller recorded for this item on request, newest first, with the question each one answers.
*BuyerApi* | [**listBuyerClubs**](docs/BuyerApi.md#listbuyerclubs) | **GET** /v1/buyer/clubs | Sellers’ loyalty clubs you belong to: your spend with each, your tier and its discount, and the next tier.
*BuyerApi* | [**listBuyerCollectionSets**](docs/BuyerApi.md#listbuyercollectionsets) | **GET** /v1/buyer/collection/sets | Sets you are collecting — a catalogue brand + model you own at least two pieces of — with owned / total and percent complete, most complete first; and whether you show on set leaderboards.
*BuyerApi* | [**listBuyerConsolidations**](docs/BuyerApi.md#listbuyerconsolidations) | **GET** /v1/buyer/consolidations | Your ship-together orders: parcels at the hub, and the one box out.
*BuyerApi* | [**listBuyerConversationGuests**](docs/BuyerApi.md#listbuyerconversationguests) | **GET** /v1/buyer/conversations/{id}/guests | Guests in a chat.
*BuyerApi* | [**listBuyerFeedback**](docs/BuyerApi.md#listbuyerfeedback) | **GET** /v1/buyer/feedback | Feedback you have left sellers, newest first — with the ids you revise by.
*BuyerApi* | [**listBuyerFeedbackPending**](docs/BuyerApi.md#listbuyerfeedbackpending) | **GET** /v1/buyer/feedback/pending | Orders from the last 60 days that are on their way or arrived and still need your feedback.
*BuyerApi* | [**listBuyerFitRefs**](docs/BuyerApi.md#listbuyerfitrefs) | **GET** /v1/buyer/fit/refs | Your saved reference garments for fit comparison.
*BuyerApi* | [**listBuyerFollowingSellers**](docs/BuyerApi.md#listbuyerfollowingsellers) | **GET** /v1/buyer/following/sellers | Sellers you follow, with how many new listings each has since you last looked.
*BuyerApi* | [**listBuyerGiftCardCredit**](docs/BuyerApi.md#listbuyergiftcardcredit) | **GET** /v1/buyer/gift-cards/credit | Gift card credit on your account, and when it expires.
*BuyerApi* | [**listBuyerGiftCards**](docs/BuyerApi.md#listbuyergiftcards) | **GET** /v1/buyer/gift-cards | Gift cards you bought, newest first.
*BuyerApi* | [**listBuyerGiftFinder**](docs/BuyerApi.md#listbuyergiftfinder) | **GET** /v1/buyer/gift-finder | Live listings for a recipient, interest and budget.
*BuyerApi* | [**listBuyerGiftSent**](docs/BuyerApi.md#listbuyergiftsent) | **GET** /v1/buyer/gifts/sent | Items you sent as gifts: whether the teaser went out, whether it arrived and was opened, and any thank-you. Send one with `gift` on checkout.
*BuyerApi* | [**listBuyerHotspots**](docs/BuyerApi.md#listbuyerhotspots) | **GET** /v1/buyer/hotspots | Shop-the-look tags on a story or lookbook photo: each tagged listing and where it sits on the image (x, y as fractions).
*BuyerApi* | [**listBuyerHunts**](docs/BuyerApi.md#listbuyerhunts) | **GET** /v1/buyer/hunts | Your buyer-agent hunts and what they did.
*BuyerApi* | [**listBuyerInstantOffers**](docs/BuyerApi.md#listbuyerinstantoffers) | **GET** /v1/buyer/instant-offers | Your instant offers: live quotes, accepted ones awaiting a label, approved ones (with the prepaid label) and paid ones.
*BuyerApi* | [**listBuyerLayaways**](docs/BuyerApi.md#listbuyerlayaways) | **GET** /v1/buyer/layaways | Your layaways: price, paid so far, what is left, and the installment schedule. Put an item on layaway at checkout with layawayItemIds.
*BuyerApi* | [**listBuyerListingQuickQuestions**](docs/BuyerApi.md#listbuyerlistingquickquestions) | **GET** /v1/buyer/listings/{slug}/quick-questions | One-tap questions this listing supports; send one as `quick` on a message.
*BuyerApi* | [**listBuyerListingSellerReviews**](docs/BuyerApi.md#listbuyerlistingsellerreviews) | **GET** /v1/buyer/listings/{slug}/seller-reviews | The seller’s public reviews: summary, text, photos, replies.
*BuyerApi* | [**listBuyerLiveShipments**](docs/BuyerApi.md#listbuyerliveshipments) | **GET** /v1/buyer/live-shipments | Your one-box-per-show shipments: every order won in a show ships together, and postage is charged once (the rest refunded when it ships).
*BuyerApi* | [**listBuyerLiveStreamLineup**](docs/BuyerApi.md#listbuyerlivestreamlineup) | **GET** /v1/buyer/live-streams/{id}/lineup | What a live show will sell, in order: each item, its price, and whether it is still available.
*BuyerApi* | [**listBuyerMarketBids**](docs/BuyerApi.md#listbuyermarketbids) | **GET** /v1/buyer/market/bids | Your resting market bids.
*BuyerApi* | [**listBuyerMarketWatches**](docs/BuyerApi.md#listbuyermarketwatches) | **GET** /v1/buyer/market/watches | Market variants you watch, with the price you are waiting for.
*BuyerApi* | [**listBuyerOffers**](docs/BuyerApi.md#listbuyeroffers) | **GET** /v1/buyer/offers | Offers you have made, newest first (last 100).
*BuyerApi* | [**listBuyerOrders**](docs/BuyerApi.md#listbuyerorders) | **GET** /v1/buyer/orders | What you have bought on Crossly, newest first.
*BuyerApi* | [**listBuyerPackOpenings**](docs/BuyerApi.md#listbuyerpackopenings) | **GET** /v1/buyer/pack-openings | Your pulls: what you got, its value, sell-back status, and the fairness proof for each (the server seed once rotated).
*BuyerApi* | [**listBuyerPacks**](docs/BuyerApi.md#listbuyerpacks) | **GET** /v1/buyer/packs | Packs you can open: price, every tier with its published odds, what is left in it and its value range, and the expected value of one opening.
*BuyerApi* | [**listBuyerParties**](docs/BuyerApi.md#listbuyerparties) | **GET** /v1/buyer/parties | Themed shopping parties, live and upcoming.
*BuyerApi* | [**listBuyerPartyListings**](docs/BuyerApi.md#listbuyerpartylistings) | **GET** /v1/buyer/parties/{slug}/listings | Listings shared to a party, featured first.
*BuyerApi* | [**listBuyerPickupPoints**](docs/BuyerApi.md#listbuyerpickuppoints) | **GET** /v1/buyer/pickup-points | Carrier pickup points (UPS Access Point / FedEx Hold at Location) near an address; pass one as `pickupPoint` to POST /v1/buyer/checkout.
*BuyerApi* | [**listBuyerProtectionPlans**](docs/BuyerApi.md#listbuyerprotectionplans) | **GET** /v1/buyer/protection-plans | Your protection plans (bought at checkout with `protection`): status, term, coverage, contract id, and any refund.
*BuyerApi* | [**listBuyerRegistries**](docs/BuyerApi.md#listbuyerregistries) | **GET** /v1/buyer/registries | Your gift registries.
*BuyerApi* | [**listBuyerRegistryGifts**](docs/BuyerApi.md#listbuyerregistrygifts) | **GET** /v1/buyer/registries/{id}/gifts | Your thank-you list: who bought what off the registry, and whether you have thanked them.
*BuyerApi* | [**listBuyerRegistrySearch**](docs/BuyerApi.md#listbuyerregistrysearch) | **GET** /v1/buyer/registries/search | Find a registry by its name or the registrant’s name. Current and recent registries only.
*BuyerApi* | [**listBuyerRentals**](docs/BuyerApi.md#listbuyerrentals) | **GET** /v1/buyer/rentals | Your rentals: dates, status (reserved, out, returned, claimed, closed, cancelled), the return label, and what happened to the deposit.
*BuyerApi* | [**listBuyerSizeMemoryPrompts**](docs/BuyerApi.md#listbuyersizememoryprompts) | **GET** /v1/buyer/size-memory/prompts | Delivered orders with a size that you haven’t said how they fit (the last 60 days).
*BuyerApi* | [**listBuyerSizeMemorySizes**](docs/BuyerApi.md#listbuyersizememorysizes) | **GET** /v1/buyer/size-memory/sizes | The sizes learned from what you bought and kept, by kind of item (shoes, tops, bottoms, dresses, outerwear) and department.
*BuyerApi* | [**listBuyerSplits**](docs/BuyerApi.md#listbuyersplits) | **GET** /v1/buyer/splits | Purchases you split, with each share’s status.
*BuyerApi* | [**listBuyerSubscriptions**](docs/BuyerApi.md#listbuyersubscriptions) | **GET** /v1/buyer/subscriptions | Your subscribe & save standing orders.
*BuyerApi* | [**listBuyerTogether**](docs/BuyerApi.md#listbuyertogether) | **GET** /v1/buyer/together | Shop-together rooms you are in.
*BuyerApi* | [**listBuyerTotalRequests**](docs/BuyerApi.md#listbuyertotalrequests) | **GET** /v1/buyer/total-requests | Your combined-shipping total requests, newest per seller.
*BuyerApi* | [**listBuyerTryOns**](docs/BuyerApi.md#listbuyertryons) | **GET** /v1/buyer/try-ons | Your AI try-ons: the rendered images (labelled AI-generated wherever shown).
*BuyerApi* | [**listBuyerVault**](docs/BuyerApi.md#listbuyervault) | **GET** /v1/buyer/vault | What you own in the Crossly vault: stored (authenticated, on a shelf), listed for sale, or on its way home — with the price to ship one home.
*BuyerApi* | [**listBuyerVaultMarketHoldings**](docs/BuyerApi.md#listbuyervaultmarketholdings) | **GET** /v1/buyer/vault-markets/holdings | Each unit you hold in the vault at its market price, with the mark’s quality (A or B reliable, C indicative, none), cost, P&L and where it stands (stored, listed, lent, pledged, at the grader); `meta` carries the totals and the units you have out on loan.
*BuyerApi* | [**listBuyerVaultMarketIndexes**](docs/BuyerApi.md#listbuyervaultmarketindexes) | **GET** /v1/buyer/vault-markets/indexes | Crossly indexes over vault book keys (category, brand, curated, composite, segment, and your own), each with its level now and change since the last daily close. Index levels are valued only from the book’s marks.
*BuyerApi* | [**listBuyerVaultMarketInstantExit**](docs/BuyerApi.md#listbuyervaultmarketinstantexit) | **GET** /v1/buyer/vault-markets/instant-exit | Instant Exit quotes for what you hold, one per book key: the best resting bid (yours left out), its share of the mark, the bid levels, units held and which are free to sell, and why a key cannot be sold instantly. A quote, not an order.
*BuyerApi* | [**listBuyerVaultMarketWatchlist**](docs/BuyerApi.md#listbuyervaultmarketwatchlist) | **GET** /v1/buyer/vault-markets/watchlist | The book keys you watch, with mark and its quality, 24 h and 7 d change, and the last 30 daily marks.
*BuyerApi* | [**listBuyerVideoRequests**](docs/BuyerApi.md#listbuyervideorequests) | **GET** /v1/buyer/video-requests | Your video requests and their answers.
*BuyerApi* | [**listBuyerWishlistItems**](docs/BuyerApi.md#listbuyerwishlistitems) | **GET** /v1/buyer/wishlists/{id}/items | What is on one wishlist.
*BuyerApi* | [**listBuyerWishlistMembers**](docs/BuyerApi.md#listbuyerwishlistmembers) | **GET** /v1/buyer/wishlists/{id}/members | Co-editors of a shared wishlist.
*BuyerApi* | [**listBuyerWishlists**](docs/BuyerApi.md#listbuyerwishlists) | **GET** /v1/buyer/wishlists | Your wishlists.
*BuyerApi* | [**updateBuyerBoard**](docs/BuyerApi.md#updatebuyerboard) | **PATCH** /v1/buyer/boards/{id} | Rename a board, change its description, or make it public / private.
*BuyerApi* | [**updateBuyerBoardLayout**](docs/BuyerApi.md#updatebuyerboardlayout) | **PUT** /v1/buyer/boards/{id}/layout | Replace a board’s layout: items by platform listing id or slug, with x, y, w (0–1) and z. At most 40.
*BuyerApi* | [**updateBuyerCollectionSetLeaderboard**](docs/BuyerApi.md#updatebuyercollectionsetleaderboard) | **PUT** /v1/buyer/collection/sets/leaderboard | Show or hide yourself (by your public handle) on set leaderboards.
*BuyerApi* | [**updateBuyerFeedback**](docs/BuyerApi.md#updatebuyerfeedback) | **PATCH** /v1/buyer/feedback/{id} | Revise feedback you left, within 60 days.
*BuyerApi* | [**updateBuyerHunt**](docs/BuyerApi.md#updatebuyerhunt) | **PATCH** /v1/buyer/hunts/{id} | Pause, resume or stop a hunt.
*BuyerApi* | [**updateBuyerPurchaseStory**](docs/BuyerApi.md#updatebuyerpurchasestory) | **PUT** /v1/buyer/purchases/{id}/story | Write your owner story (280 characters); it travels with the item if you resell it.
*BuyerApi* | [**updateBuyerRegistry**](docs/BuyerApi.md#updatebuyerregistry) | **PATCH** /v1/buyer/registries/{id} | Edit a registry: title, kind, date, message, ship-to address.
*BuyerApi* | [**updateBuyerRegistryItem**](docs/BuyerApi.md#updatebuyerregistryitem) | **PUT** /v1/buyer/registries/{id}/items/{platformListingId} | How many of an item you want (1–50).
*BuyerApi* | [**updateBuyerSubscription**](docs/BuyerApi.md#updatebuyersubscription) | **PATCH** /v1/buyer/subscriptions/{id} | Pause, resume, skip the next delivery, change the interval, or cancel.
*BuyerApi* | [**updateBuyerWishlist**](docs/BuyerApi.md#updatebuyerwishlist) | **PATCH** /v1/buyer/wishlists/{id} | Rename a wishlist, or make it public / private.
*BuyerAgentApi* | [**createBuyerAgentSession**](docs/BuyerAgentApi.md#createbuyeragentsession) | **POST** /v1/buyer/agent/sessions | Start a shopping agent conversation.
*BuyerAgentApi* | [**createBuyerAgentSessionAct**](docs/BuyerAgentApi.md#createbuyeragentsessionact) | **POST** /v1/buyer/agent/sessions/{id}/act | Act on an option: save, cart, alert, registry, price (real-sales check), offer (prepare / confirm), or buy (quote — complete with POST /api/v1/buyer/checkout). Needs the action’s own scope too.
*BuyerAgentApi* | [**createBuyerAgentSessionReact**](docs/BuyerAgentApi.md#createbuyeragentsessionreact) | **POST** /v1/buyer/agent/sessions/{id}/react | Like or dislike an option; the next search leans toward likes and drops dislikes.
*BuyerAgentApi* | [**createBuyerAgentSessionTurn**](docs/BuyerAgentApi.md#createbuyeragentsessionturn) | **POST** /v1/buyer/agent/sessions/{id}/turns | Say something to the agent: what you want, a critique of the options (\"cheaper\", \"more like #2\"), or send a photo (imageBase64) to find things like it. Returns its reply and the new numbered options.
*BuyerAgentApi* | [**deleteBuyerAgentSession**](docs/BuyerAgentApi.md#deletebuyeragentsession) | **DELETE** /v1/buyer/agent/sessions/{id} | Delete a conversation.
*BuyerAgentApi* | [**getBuyerAgentSession**](docs/BuyerAgentApi.md#getbuyeragentsession) | **GET** /v1/buyer/agent/sessions/{id} | A conversation: its brief and turns, with each turn’s options re-read live.
*BuyerAgentApi* | [**listBuyerAgentSessions**](docs/BuyerAgentApi.md#listbuyeragentsessions) | **GET** /v1/buyer/agent/sessions | Your shopping agent conversations, newest first.
*BuyerCatalogApi* | [**createBuyerIdentify**](docs/BuyerCatalogApi.md#createbuyeridentify) | **POST** /v1/buyer/identify | Identify a held object and return a HUD-ready answer.
*BuyerCatalogApi* | [**createBuyerLockon**](docs/BuyerCatalogApi.md#createbuyerlockon) | **POST** /v1/buyer/lockons | Lock on to an object the buyer is holding.
*BuyerCatalogApi* | [**createBuyerLockonConfirm**](docs/BuyerCatalogApi.md#createbuyerlockonconfirm) | **POST** /v1/buyer/lockons/{id}/confirm | The buyer picked one of the candidates.
*BuyerCatalogApi* | [**createBuyerLockonObserve**](docs/BuyerCatalogApi.md#createbuyerlockonobserve) | **POST** /v1/buyer/lockons/{id}/observe | Add what this frame revealed, and get the current best answer.
*BuyerCatalogApi* | [**createBuyerScan**](docs/BuyerCatalogApi.md#createbuyerscan) | **POST** /v1/buyer/scan | Identify a physical item and find the cheapest place to buy it.
*BuyerCatalogApi* | [**createBuyerScanSession**](docs/BuyerCatalogApi.md#createbuyerscansession) | **POST** /v1/buyer/scan/sessions | Open a Live Shop session.
*BuyerCatalogApi* | [**createBuyerScanSessionEnd**](docs/BuyerCatalogApi.md#createbuyerscansessionend) | **POST** /v1/buyer/scan/sessions/{id}/end | Close a Live Shop session.
*BuyerCatalogApi* | [**getBuyerAnywhere**](docs/BuyerCatalogApi.md#getbuyeranywhere) | **GET** /v1/buyer/anywhere | Cheapest source for an item — Crossly first, then other retailers.
*BuyerCatalogApi* | [**getBuyerCatalogFacet**](docs/BuyerCatalogApi.md#getbuyercatalogfacet) | **GET** /v1/buyer/catalog/facets | Brands, categories and conditions that currently have stock.
*BuyerCatalogApi* | [**getBuyerCatalogFx**](docs/BuyerCatalogApi.md#getbuyercatalogfx) | **GET** /v1/buyer/catalog/fx | Display-only exchange rates (units per 1 USD).
*BuyerCatalogApi* | [**getBuyerCatalogListing**](docs/BuyerCatalogApi.md#getbuyercataloglisting) | **GET** /v1/buyer/catalog/listings/{slug} | One listing, in full.
*BuyerCatalogApi* | [**getBuyerCatalogListingAvailability**](docs/BuyerCatalogApi.md#getbuyercataloglistingavailability) | **GET** /v1/buyer/catalog/listings/{slug}/availability | Is it still buyable, and at what price.
*BuyerCatalogApi* | [**getBuyerCatalogListingShipping**](docs/BuyerCatalogApi.md#getbuyercataloglistingshipping) | **GET** /v1/buyer/catalog/listings/{slug}/shipping | Shipping services and prices to a destination.
*BuyerCatalogApi* | [**getBuyerListingLandedCost**](docs/BuyerCatalogApi.md#getbuyerlistinglandedcost) | **GET** /v1/buyer/listings/{slug}/landed-cost | Import duties, taxes and fees to a country (landed cost).
*BuyerCatalogApi* | [**getBuyerScanSession**](docs/BuyerCatalogApi.md#getbuyerscansession) | **GET** /v1/buyer/scan/sessions/{id} | One trip and everything it found.
*BuyerCatalogApi* | [**listBuyerCatalogBrowse**](docs/BuyerCatalogApi.md#listbuyercatalogbrowse) | **GET** /v1/buyer/catalog/browse | Browse the way the shop does — buying format, returns, size, color, sold items, Best Match.
*BuyerCatalogApi* | [**listBuyerCatalogListingSoldHistory**](docs/BuyerCatalogApi.md#listbuyercataloglistingsoldhistory) | **GET** /v1/buyer/catalog/listings/{slug}/sold-history | What THIS listing has sold for, newest first (last 50), with the median.
*BuyerCatalogApi* | [**listBuyerCatalogSearch**](docs/BuyerCatalogApi.md#listbuyercatalogsearch) | **GET** /v1/buyer/catalog/search | Search the Crossly catalogue.
*BuyerCatalogApi* | [**listBuyerCatalogSellers**](docs/BuyerCatalogApi.md#listbuyercatalogsellers) | **GET** /v1/buyer/catalog/sellers | Find a seller by shop handle or shop name.
*BuyerCatalogApi* | [**listBuyerScanSessions**](docs/BuyerCatalogApi.md#listbuyerscansessions) | **GET** /v1/buyer/scan/sessions | Your scanning trips, newest first.
*BuyerCheckoutApi* | [**createBuyerCheckout**](docs/BuyerCheckoutApi.md#createbuyercheckout) | **POST** /v1/buyer/checkout | Buy a listing without being present.
*BuyerCheckoutApi* | [**getBuyerCheckoutControl**](docs/BuyerCheckoutApi.md#getbuyercheckoutcontrol) | **GET** /v1/buyer/checkout/controls | What this key is allowed to spend.
*BuyerCheckoutApi* | [**updateBuyerCheckoutControl**](docs/BuyerCheckoutApi.md#updatebuyercheckoutcontrol) | **PUT** /v1/buyer/checkout/controls | Switch this key on for spending, and set its limits.
*BuyerMonitorsApi* | [**createBuyerMonitor**](docs/BuyerMonitorsApi.md#createbuyermonitor) | **POST** /v1/buyer/monitors | Watch a search, and be told when it matches.
*BuyerMonitorsApi* | [**deleteBuyerMonitor**](docs/BuyerMonitorsApi.md#deletebuyermonitor) | **DELETE** /v1/buyer/monitors/{id} | Delete a monitor.
*BuyerMonitorsApi* | [**listBuyerMonitorMatches**](docs/BuyerMonitorsApi.md#listbuyermonitormatches) | **GET** /v1/buyer/monitors/{id}/matches | What this monitor has matched.
*BuyerMonitorsApi* | [**listBuyerMonitors**](docs/BuyerMonitorsApi.md#listbuyermonitors) | **GET** /v1/buyer/monitors | Your monitors.
*BuyerMonitorsApi* | [**updateBuyerMonitor**](docs/BuyerMonitorsApi.md#updatebuyermonitor) | **PATCH** /v1/buyer/monitors/{id} | Pause, resume or rename a monitor.
*DropsApi* | [**createBuyerDropJoin**](docs/DropsApi.md#createbuyerdropjoin) | **POST** /v1/buyer/drops/{id}/join | Join a drop's line while it is open: one entry per account, the same odds as joining in the world. Repeating it returns the same entry.
*DropsApi* | [**deleteBuyerDropJoin**](docs/DropsApi.md#deletebuyerdropjoin) | **DELETE** /v1/buyer/drops/{id}/join | Leave a drop's line before the draw.
*DropsApi* | [**getBuyerDropMe**](docs/DropsApi.md#getbuyerdropme) | **GET** /v1/buyer/drops/{id}/me | Your entry in a drop: in line or not, your draw rank and outcome, and the checkout path while your 15-minute hold is live.



<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BuyerOAuth"></a>
### BuyerOAuth

- **Type**: HTTP basic authentication

## Where things are

| what | where |
|---|---|
| one class per API group (`OrdersApi`, `ListingsApi`, …) | `src/main/kotlin/net/crossly/buyer/apis/` |
| one model per response/request type, grouped by product area | `src/main/kotlin/net/crossly/buyer/models/<area>/` |
| a reference page per API group, every method with an example | `docs/` |

The area is the word after the verb in the model name: `GetVaultLendResponse`
is under `vault`, `ListOrdersItem` under `order`. Areas with only a handful of
models, and small shared shapes, are under `common`.

Models are named after where they appear: `GetOrderResponse` is what `getOrder`
returns, `GetOrderResponseDataLines` the type of its `data.lines`, `ListOrdersItem`
one row of `listOrders`. A type several endpoints share appears ONCE, under the
first name it was given — or, for small shared shapes like `{ ok }`, a name from
its fields (`OkResponse`). There is no per-model doc page: the model source file
is the reference, and your editor will jump to it.

