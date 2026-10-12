# BuyerApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerActivity**](BuyerApi.md#createBuyerActivity) | **POST** /v1/buyer/activity | Report an item your user is looking at, and get our answer.
[**createBuyerAuctionBid**](BuyerApi.md#createBuyerAuctionBid) | **POST** /v1/buyer/auctions/{slug}/bids | Place a bid, optionally with a proxy maximum. A WINNING BID IS CHARGED AUTOMATICALLY.
[**createBuyerAuctionPay**](BuyerApi.md#createBuyerAuctionPay) | **POST** /v1/buyer/auctions/{slug}/pay | Pay for an auction you won whose automatic charge did not go through.
[**createBuyerAuctionRetract**](BuyerApi.md#createBuyerAuctionRetract) | **POST** /v1/buyer/auctions/{slug}/retract | Retract your bids under eBay’s rules — a typo, a changed listing, or an unreachable seller.
[**createBuyerBoard**](BuyerApi.md#createBuyerBoard) | **POST** /v1/buyer/boards | Create an outfit board.
[**createBuyerBoardItem**](BuyerApi.md#createBuyerBoardItem) | **POST** /v1/buyer/boards/{id}/items | Add a listing (by slug) to a board, at the next free spot.
[**createBuyerBreakSpotHold**](BuyerApi.md#createBuyerBreakSpotHold) | **POST** /v1/buyer/breaks/{id}/spots/{spotId}/hold | Hold a spot in a pick-your-spot break, then buy it through checkout before the hold lapses.
[**createBuyerBuybackRequest**](BuyerApi.md#createBuyerBuybackRequest) | **POST** /v1/buyer/buybacks/{id}/request | Ask Crossly to buy an item back under its buyback guarantee.
[**createBuyerCartItem**](BuyerApi.md#createBuyerCartItem) | **POST** /v1/buyer/cart/items | Add a listing to your cart.
[**createBuyerCartItemSaveForLater**](BuyerApi.md#createBuyerCartItemSaveForLater) | **POST** /v1/buyer/cart/items/{id}/save-for-later | Move a cart line to saved-for-later.
[**createBuyerCartOptimizer**](BuyerApi.md#createBuyerCartOptimizer) | **POST** /v1/buyer/cart-optimizer | Cart optimizer: send a shopping list (one item per line, \&quot;2 Charizard Base Set\&quot;) and get the cheapest delivered basket across sellers — one pick per line, items + each seller’s shipping with free-shipping thresholds applied. fewestPackages prefers fewer sellers. Nothing is added to the cart.
[**createBuyerCartQuote**](BuyerApi.md#createBuyerCartQuote) | **POST** /v1/buyer/cart/quote | Price the cart, delivered — item, shipping, tax, total.
[**createBuyerCartSavedMoveToCart**](BuyerApi.md#createBuyerCartSavedMoveToCart) | **POST** /v1/buyer/cart/saved/{id}/move-to-cart | Move a saved item back into your cart, at today’s price.
[**createBuyerCaseCounter**](BuyerApi.md#createBuyerCaseCounter) | **POST** /v1/buyer/cases/{id}/counter | Propose your own refund figure on a case.
[**createBuyerCaseEscalate**](BuyerApi.md#createBuyerCaseEscalate) | **POST** /v1/buyer/cases/{id}/escalate | Ask Crossly to step in on a case.
[**createBuyerCaseMessage**](BuyerApi.md#createBuyerCaseMessage) | **POST** /v1/buyer/cases/{id}/messages | Post a message on a case thread.
[**createBuyerCaseRespond**](BuyerApi.md#createBuyerCaseRespond) | **POST** /v1/buyer/cases/{id}/respond | Accept or reject the seller’s partial-refund offer on a case.
[**createBuyerCaseWithdraw**](BuyerApi.md#createBuyerCaseWithdraw) | **POST** /v1/buyer/cases/{id}/withdraw | Withdraw a case you opened.
[**createBuyerCatalogListingRental**](BuyerApi.md#createBuyerCatalogListingRental) | **POST** /v1/buyer/catalog/listings/{slug}/rental | Book a rental. Returns a Stripe PaymentIntent client secret for rent + shipping both ways + deposit; the dates are held 30 minutes for payment. Crossly buys both labels; the deposit comes back after the item does.
[**createBuyerCatalogListingRentalQuote**](BuyerApi.md#createBuyerCatalogListingRentalQuote) | **POST** /v1/buyer/catalog/listings/{slug}/rental/quote | Price a rental: rent (the cheaper of by-the-day and by-the-week), both shipping legs once a ship-to is given, and the deposit. &#x60;problem&#x60; says why the dates can’t be booked.
[**createBuyerCatalogListingVideoRequest**](BuyerApi.md#createBuyerCatalogListingVideoRequest) | **POST** /v1/buyer/catalog/listings/{slug}/video-requests | Ask the seller for a video of an item (one open request per item). The seller is notified; their answer appears on the listing for every buyer.
[**createBuyerConversationInvite**](BuyerApi.md#createBuyerConversationInvite) | **POST** /v1/buyer/conversations/{id}/invite | Invite a friend into a chat with a seller: a single-use link (7 days) that makes whoever opens it a guest who can read and post. Only the thread’s buyer can invite; at most 5 guests.
[**createBuyerConversationJoin**](BuyerApi.md#createBuyerConversationJoin) | **POST** /v1/buyer/conversations/join/{token} | Join a chat you were invited into, as a guest.
[**createBuyerFeedback**](BuyerApi.md#createBuyerFeedback) | **POST** /v1/buyer/feedback | Leave feedback on up to 25 orders at once, with optional detailed seller ratings.
[**createBuyerFitRef**](BuyerApi.md#createBuyerFitRef) | **POST** /v1/buyer/fit/refs | Save a reference garment (flat measurements, inches) to compare listings against.
[**createBuyerFollowingSellerSeen**](BuyerApi.md#createBuyerFollowingSellerSeen) | **POST** /v1/buyer/following/sellers/seen | Clear the \&quot;new listings\&quot; count on a followed seller, or on all of them.
[**createBuyerGiftCard**](BuyerApi.md#createBuyerGiftCard) | **POST** /v1/buyer/gift-cards | Start a gift card purchase.
[**createBuyerGiftCardRedeem**](BuyerApi.md#createBuyerGiftCardRedeem) | **POST** /v1/buyer/gift-cards/redeem | Redeem a gift card code into your own balance.
[**createBuyerGroupBuyJoin**](BuyerApi.md#createBuyerGroupBuyJoin) | **POST** /v1/buyer/group-buys/{id}/join | Join a group buy: a hold at the starting price, captured at the price the group reaches. Checked against this key’s spending controls; send an Idempotency-Key.
[**createBuyerGroupBuyLeave**](BuyerApi.md#createBuyerGroupBuyLeave) | **POST** /v1/buyer/group-buys/{id}/leave | Leave a group buy and release your hold.
[**createBuyerHunt**](BuyerApi.md#createBuyerHunt) | **POST** /v1/buyer/hunts | Start a buyer-agent hunt — over a search (filters), or auto-buy on one listing (listingSlug: buy it once its price, sale applied, is within maxPriceCents). &#x60;offer&#x60; and &#x60;buy&#x60; modes also need buyer:checkout:write, and the budget is checked against this key’s spending controls.
[**createBuyerInstantOfferAccept**](BuyerApi.md#createBuyerInstantOfferAccept) | **POST** /v1/buyer/instant-offers/{id}/accept | Accept Crossly’s instant offer on a collection item. Ops then send a prepaid label; the store credit is paid once the item arrives and checks out.
[**createBuyerLayawayCancel**](BuyerApi.md#createBuyerLayawayCancel) | **POST** /v1/buyer/layaways/{id}/cancel | Cancel a layaway: everything paid comes back except the layaway fee (10% of the price, at most $15).
[**createBuyerLayawayPay**](BuyerApi.md#createBuyerLayawayPay) | **POST** /v1/buyer/layaways/{id}/pay | Pay some (at least $1) or all of what is left now, on the saved card. Paid in full, it ships.
[**createBuyerListingAudioSummary**](BuyerApi.md#createBuyerListingAudioSummary) | **POST** /v1/buyer/listings/{slug}/audio-summary | Record the spoken summary of a listing (cached per listing version). 503 naming TTS_API_KEY when no speech provider is configured.
[**createBuyerListingSplit**](BuyerApi.md#createBuyerListingSplit) | **POST** /v1/buyer/listings/{slug}/split | Split a purchase: one pay link per person; nobody is charged until all have paid.
[**createBuyerListingSubscribe**](BuyerApi.md#createBuyerListingSubscribe) | **POST** /v1/buyer/listings/{slug}/subscribe | Subscribe &amp; save: a standing order charged to your saved card every interval. Checked against this key’s spending controls; send an Idempotency-Key.
[**createBuyerListingTryOn**](BuyerApi.md#createBuyerListingTryOn) | **POST** /v1/buyer/listings/{slug}/try-on | Render an AI try-on of this listing on the buyer’s own photo (base64 &#x60;photo&#x60;, or &#x60;reuseLastPhoto&#x60;). &#x60;confirmSelfAdult&#x60; must be true: the photo is of the buyer and they are 18+. Wearables only; capped per day; 503 naming TRYON_API_KEY when no image model is configured.
[**createBuyerMarketBid**](BuyerApi.md#createBuyerMarketBid) | **POST** /v1/buyer/market/bids | Place a fixed-price market bid. SPENDS MONEY: it fills against the lowest ask at or under your price and charges your saved card (plus the fast-ship premium when fastShip is set and it fills from vault stock). deliverTo vault keeps it in your Crossly vault; gradeWith sends a raw card to a Grading run first. Checked against this key’s spending controls; send an Idempotency-Key.
[**createBuyerMarketWatch**](BuyerApi.md#createBuyerMarketWatch) | **POST** /v1/buyer/market/watches | Watch a market variant: alert at or below a price, or on any drop.
[**createBuyerOffer**](BuyerApi.md#createBuyerOffer) | **POST** /v1/buyer/offers | Offer a price on a listing.
[**createBuyerOfferRespond**](BuyerApi.md#createBuyerOfferRespond) | **POST** /v1/buyer/offers/{id}/respond | Answer a seller’s counteroffer — accept, decline, or counter back.
[**createBuyerOrderCancel**](BuyerApi.md#createBuyerOrderCancel) | **POST** /v1/buyer/orders/{id}/cancel | Cancel an order before it ships — refunds it in full.
[**createBuyerOrderInr**](BuyerApi.md#createBuyerOrderInr) | **POST** /v1/buyer/orders/{id}/inr | Open an item-not-received case.
[**createBuyerOrderReceived**](BuyerApi.md#createBuyerOrderReceived) | **POST** /v1/buyer/orders/{id}/received | Confirm you received an order.
[**createBuyerOrderTip**](BuyerApi.md#createBuyerOrderTip) | **POST** /v1/buyer/orders/{id}/tip | Tip the seller on one of your shipped orders, charged to your saved card. One tip per order; $1–$500; checked against this key’s spending controls.
[**createBuyerPackFairnessRotate**](BuyerApi.md#createBuyerPackFairnessRotate) | **POST** /v1/buyer/packs/fairness/rotate | Reveal your current server seed and start a new one (optionally with your own client seed). Refused while an opening is awaiting payment.
[**createBuyerPackOpen**](BuyerApi.md#createBuyerPackOpen) | **POST** /v1/buyer/packs/{slug}/open | Open a pack. SPENDS MONEY: charges the pack price to your saved card, then pulls one real item by the published odds (provably fair: see /buyer/packs/fairness) into your Crossly vault. confirmAdult must be true. Checked against this key’s spending controls; send an Idempotency-Key.
[**createBuyerPackOpeningSellBack**](BuyerApi.md#createBuyerPackOpeningSellBack) | **POST** /v1/buyer/pack-openings/{id}/sell-back | Sell a pull straight back for Crossly credit at the pack’s buyback rate, within its window, while it is still in your vault.
[**createBuyerPassportClaim**](BuyerApi.md#createBuyerPassportClaim) | **POST** /v1/buyer/passports/{code}/claim | Claim a passport as the item’s current owner (the buyer of its latest sale) — shown as “in its owner’s hands” until it sells again.
[**createBuyerProtectionPlanCancel**](BuyerApi.md#createBuyerProtectionPlanCancel) | **POST** /v1/buyer/protection-plans/{id}/cancel | Cancel a protection plan. The insurer decides what is refundable (pro-rata after the free-look window); that amount goes back to the card.
[**createBuyerPurchaseDownload**](BuyerApi.md#createBuyerPurchaseDownload) | **POST** /v1/buyer/purchases/{id}/download | A ten-minute link to a digital purchase’s file; each call uses one of its downloads.
[**createBuyerPurchaseFit**](BuyerApi.md#createBuyerPurchaseFit) | **POST** /v1/buyer/purchases/{id}/fit | Say how a delivered purchase fit: true_to_size, small or large. It teaches your size memory and, pooled with other buyers, how the brand runs.
[**createBuyerPurchaseReturn**](BuyerApi.md#createBuyerPurchaseReturn) | **POST** /v1/buyer/purchases/{id}/return | Return a purchase under the seller’s policy, or send back a try-at-home item. With reason doesnt_fit, &#x60;fit&#x60; (small | large) says which way, and it feeds your size memory.
[**createBuyerRegistry**](BuyerApi.md#createBuyerRegistry) | **POST** /v1/buyer/registries | Start a gift registry (wedding, baby, birthday, housewarming, graduation, other). Items are added like any wishlist item; set shipAddressId to one of your saved addresses so guests can buy — they never see it.
[**createBuyerRegistryGiftThanked**](BuyerApi.md#createBuyerRegistryGiftThanked) | **POST** /v1/buyer/registries/{id}/gifts/{giftId}/thanked | Tick a gift as thanked (or untick it).
[**createBuyerRentalArrivalPhoto**](BuyerApi.md#createBuyerRentalArrivalPhoto) | **POST** /v1/buyer/rentals/{id}/arrival-photos | Photograph a rental on arrival (URLs you uploaded): your side of the condition record.
[**createBuyerRentalCancel**](BuyerApi.md#createBuyerRentalCancel) | **POST** /v1/buyer/rentals/{id}/cancel | Cancel a rental that has not shipped: everything is refunded.
[**createBuyerRentalClaimResponse**](BuyerApi.md#createBuyerRentalClaimResponse) | **POST** /v1/buyer/rentals/{id}/claim-response | Answer a deposit claim: accept (the claim is paid, the rest refunded) or dispute (Crossly decides).
[**createBuyerRentalIdentityStart**](BuyerApi.md#createBuyerRentalIdentityStart) | **POST** /v1/buyer/rentals/identity/start | Start the ID check renting needs (Stripe Identity: photo ID + selfie). Open &#x60;url&#x60; (hosted) or use &#x60;clientSecret&#x60; with Stripe.js.
[**createBuyerReturnCancel**](BuyerApi.md#createBuyerReturnCancel) | **POST** /v1/buyer/returns/{id}/cancel | Cancel a return before it ships.
[**createBuyerReturnTracking**](BuyerApi.md#createBuyerReturnTracking) | **POST** /v1/buyer/returns/{id}/tracking | Add tracking to a return you shipped on your own label.
[**createBuyerSellerClubJoin**](BuyerApi.md#createBuyerSellerClubJoin) | **POST** /v1/buyer/sellers/{sellerUserId}/club/join | Join a seller’s loyalty club (free). Your tier’s discount then applies to their items — the best of it and any other rate you have with them, never stacked.
[**createBuyerSellerReport**](BuyerApi.md#createBuyerSellerReport) | **POST** /v1/buyer/sellers/{username}/report | Report a seller to Crossly’s trust team.
[**createBuyerSplitCancel**](BuyerApi.md#createBuyerSplitCancel) | **POST** /v1/buyer/splits/{id}/cancel | Cancel a split you organised; every held share is released.
[**createBuyerTogether**](BuyerApi.md#createBuyerTogether) | **POST** /v1/buyer/together | Start a shop-together room.
[**createBuyerTogetherItem**](BuyerApi.md#createBuyerTogetherItem) | **POST** /v1/buyer/together/{code}/items | Add a listing to a shop-together board.
[**createBuyerTogetherItemVote**](BuyerApi.md#createBuyerTogetherItemVote) | **POST** /v1/buyer/together/{code}/items/{id}/vote | Vote an item on a room’s board up (1), down (-1) or clear (0).
[**createBuyerTogetherJoin**](BuyerApi.md#createBuyerTogetherJoin) | **POST** /v1/buyer/together/{code}/join | Join a shop-together room by its code.
[**createBuyerTogetherLeave**](BuyerApi.md#createBuyerTogetherLeave) | **POST** /v1/buyer/together/{code}/leave | Leave a shop-together room.
[**createBuyerTogetherMessage**](BuyerApi.md#createBuyerTogetherMessage) | **POST** /v1/buyer/together/{code}/messages | Say something in a shop-together room.
[**createBuyerTotalRequest**](BuyerApi.md#createBuyerTotalRequest) | **POST** /v1/buyer/total-requests | Ask a seller for one combined shipping total on everything of theirs in your cart.
[**createBuyerVaultList**](BuyerApi.md#createBuyerVaultList) | **POST** /v1/buyer/vault/{id}/list | Sell a vault item on the market at your price. It is already authenticated, so when it sells nothing ships in: the buyer keeps it vaulted or it ships straight to them.
[**createBuyerVaultUnlist**](BuyerApi.md#createBuyerVaultUnlist) | **POST** /v1/buyer/vault/{id}/unlist | Take a vault item off the market; it stays stored.
[**createBuyerVaultWithdraw**](BuyerApi.md#createBuyerVaultWithdraw) | **POST** /v1/buyer/vault/{id}/withdraw | Ship a vault item home, standard or expedited. The shipping, any storage it owes and the early-withdrawal fee (within 90 days of arriving) are charged to your saved card now, all checked against this key’s spending controls; send an Idempotency-Key.
[**createBuyerWishlist**](BuyerApi.md#createBuyerWishlist) | **POST** /v1/buyer/wishlists | Create a wishlist.
[**createBuyerWishlistInvite**](BuyerApi.md#createBuyerWishlistInvite) | **POST** /v1/buyer/wishlists/{id}/invite | Share a wishlist with a co-editor: a single-use link (14 days). Members add and remove items; only the owner renames, deletes or removes members. At most 20.
[**createBuyerWishlistItem**](BuyerApi.md#createBuyerWishlistItem) | **POST** /v1/buyer/wishlists/{id}/items | Add a listing to a wishlist.
[**createBuyerWishlistJoin**](BuyerApi.md#createBuyerWishlistJoin) | **POST** /v1/buyer/wishlists/join/{token} | Join a wishlist you were invited to edit.
[**createBuyerWishlistShare**](BuyerApi.md#createBuyerWishlistShare) | **POST** /v1/buyer/wishlists/{id}/share | Share a wishlist — makes it public and returns its link.
[**deleteBuyerBoard**](BuyerApi.md#deleteBuyerBoard) | **DELETE** /v1/buyer/boards/{id} | Delete a board.
[**deleteBuyerBoardItem**](BuyerApi.md#deleteBuyerBoardItem) | **DELETE** /v1/buyer/boards/{id}/items/{platformListingId} | Take a listing off a board.
[**deleteBuyerBreakSpotHold**](BuyerApi.md#deleteBuyerBreakSpotHold) | **DELETE** /v1/buyer/breaks/{id}/spots/{spotId}/hold | Release a break spot you hold.
[**deleteBuyerCartItem**](BuyerApi.md#deleteBuyerCartItem) | **DELETE** /v1/buyer/cart/items/{id} | Remove a line from your cart.
[**deleteBuyerCartSaved**](BuyerApi.md#deleteBuyerCartSaved) | **DELETE** /v1/buyer/cart/saved/{id} | Remove an item from saved-for-later. Returns the remaining list.
[**deleteBuyerConversationGuest**](BuyerApi.md#deleteBuyerConversationGuest) | **DELETE** /v1/buyer/conversations/{id}/guests/{userId} | Remove a guest (the thread’s buyer), or leave (a guest, with your own user id).
[**deleteBuyerFitRef**](BuyerApi.md#deleteBuyerFitRef) | **DELETE** /v1/buyer/fit/refs/{id} | Delete a reference garment.
[**deleteBuyerMarketBid**](BuyerApi.md#deleteBuyerMarketBid) | **DELETE** /v1/buyer/market/bids/{id} | Cancel a resting market bid.
[**deleteBuyerMarketWatch**](BuyerApi.md#deleteBuyerMarketWatch) | **DELETE** /v1/buyer/market/watches/{id} | Stop watching a market variant.
[**deleteBuyerOffer**](BuyerApi.md#deleteBuyerOffer) | **DELETE** /v1/buyer/offers/{id} | Withdraw an offer you made that the seller has not answered.
[**deleteBuyerRecentlyViewed**](BuyerApi.md#deleteBuyerRecentlyViewed) | **DELETE** /v1/buyer/recently-viewed/{slug} | Remove one listing from your recently viewed.
[**deleteBuyerRecentlyViewed2**](BuyerApi.md#deleteBuyerRecentlyViewed2) | **DELETE** /v1/buyer/recently-viewed | Clear your recently viewed list.
[**deleteBuyerRegistry**](BuyerApi.md#deleteBuyerRegistry) | **DELETE** /v1/buyer/registries/{id} | Delete a registry (and the wishlist behind it).
[**deleteBuyerSellerClubJoin**](BuyerApi.md#deleteBuyerSellerClubJoin) | **DELETE** /v1/buyer/sellers/{sellerUserId}/club/join | Leave a seller’s loyalty club.
[**deleteBuyerTogetherItem**](BuyerApi.md#deleteBuyerTogetherItem) | **DELETE** /v1/buyer/together/{code}/items/{id} | Take an item you added off a room’s board.
[**deleteBuyerTotalRequest**](BuyerApi.md#deleteBuyerTotalRequest) | **DELETE** /v1/buyer/total-requests/{id} | Cancel a total request you made.
[**deleteBuyerTryOn**](BuyerApi.md#deleteBuyerTryOn) | **DELETE** /v1/buyer/try-ons/{id} | Delete a try-on and its images — or pass &#x60;all&#x60; to delete every photo and result.
[**deleteBuyerWishlist**](BuyerApi.md#deleteBuyerWishlist) | **DELETE** /v1/buyer/wishlists/{id} | Delete a wishlist and everything on it.
[**deleteBuyerWishlistItem**](BuyerApi.md#deleteBuyerWishlistItem) | **DELETE** /v1/buyer/wishlists/{id}/items/{slug} | Take a listing off a wishlist.
[**deleteBuyerWishlistMember**](BuyerApi.md#deleteBuyerWishlistMember) | **DELETE** /v1/buyer/wishlists/{id}/members/{userId} | Remove a co-editor (the owner), or leave a list shared with you (your own user id).
[**getBuyerAuctionMe**](BuyerApi.md#getBuyerAuctionMe) | **GET** /v1/buyer/auctions/{slug}/me | Where you stand in one auction — your max, leading, won, must you pay.
[**getBuyerBadge**](BuyerApi.md#getBuyerBadge) | **GET** /v1/buyer/badges | The counts behind the account badge — unread messages, offers waiting, orders to review.
[**getBuyerBoard**](BuyerApi.md#getBuyerBoard) | **GET** /v1/buyer/boards/{id} | One of your boards with its layout: each item’s x, y and width as fractions of the board, and stacking order.
[**getBuyerBoardShared**](BuyerApi.md#getBuyerBoardShared) | **GET** /v1/buyer/boards/shared/{token} | A shared outfit board, by its link token.
[**getBuyerBreak**](BuyerApi.md#getBuyerBreak) | **GET** /v1/buyer/breaks/{id} | A card break’s board: spots, holders, and the seed after the draw.
[**getBuyerCase**](BuyerApi.md#getBuyerCase) | **GET** /v1/buyer/cases/{id} | One case — its state, the message thread, and the return parcel if there is one.
[**getBuyerCatalogListingMySize**](BuyerApi.md#getBuyerCatalogListingMySize) | **GET** /v1/buyer/catalog/listings/{slug}/my-size | This item against your size: the size you keep in this kind of item (and in this brand), whether this one is your size, smaller or larger, a warning if this brand and size ran small or large on you before, and how other buyers say the brand runs. null for an unsized item.
[**getBuyerCatalogListingPrice**](BuyerApi.md#getBuyerCatalogListingPrice) | **GET** /v1/buyer/catalog/listings/{slug}/price | The price today. When the seller has the same item live on another marketplace for less, this IS that price (&#x60;priceMatch&#x60; says where from), and &#x60;lowestAnywhere&#x60; lists the marketplaces it is guaranteed not to be cheaper on. &#x60;priceCheck&#x60; rates it against real sales of the same catalog item in the same condition over the last 180 days (great / good / fair / high, with the median and middle-half range in cents); null until there are 3+ sales from 2+ sellers.
[**getBuyerCatalogListingRental**](BuyerApi.md#getBuyerCatalogListingRental) | **GET** /v1/buyer/catalog/listings/{slug}/rental | Whether a listing is for rent: day and week rates, the refundable deposit, length limits, the turnaround buffer, and the dates already booked. null when it is not for rent.
[**getBuyerCheckoutUsdc**](BuyerApi.md#getBuyerCheckoutUsdc) | **GET** /v1/buyer/checkout/usdc | Whether Crossly takes USDC (Stripe stablecoin payments: Solana, Ethereum, Base, Polygon), and its per-order limit. Paying needs the buyer’s wallet, so it happens in the browser checkout, never unattended.
[**getBuyerCollectionOffer**](BuyerApi.md#getBuyerCollectionOffer) | **GET** /v1/buyer/collection/{id}/offer | What an item in your collection would fetch now: the top open bid on the market for the same variant, condition and grade, and Crossly’s instant offer in store credit when that is switched on (a quote valid for a limited time).
[**getBuyerCollectionSet**](BuyerApi.md#getBuyerCollectionSet) | **GET** /v1/buyer/collection/sets/{category}/{brand}/{model} | One set: every piece (owned or missing, with its lowest ask on the market), what completing it would cost now, and the leaderboard of collectors who opted in, with your rank.
[**getBuyerCreator**](BuyerApi.md#getBuyerCreator) | **GET** /v1/buyer/creators/{handle} | A creator storefront: profile, affiliate code, and shelves of live picks.
[**getBuyerFitVocabulary**](BuyerApi.md#getBuyerFitVocabulary) | **GET** /v1/buyer/fit/vocabulary | Garment kinds and the measurements each takes.
[**getBuyerGiftFinderOption**](BuyerApi.md#getBuyerGiftFinderOption) | **GET** /v1/buyer/gift-finder/options | The gift finder’s questions: recipients, interests, budgets.
[**getBuyerImpact**](BuyerApi.md#getBuyerImpact) | **GET** /v1/buyer/impact | The sourced footprint your secondhand purchases avoided.
[**getBuyerLayaway**](BuyerApi.md#getBuyerLayaway) | **GET** /v1/buyer/layaways/{id} | One layaway and its schedule.
[**getBuyerListingAudioSummary**](BuyerApi.md#getBuyerListingAudioSummary) | **GET** /v1/buyer/listings/{slug}/audio-summary | A spoken summary of a listing (accessibility): the text, built only from the listing’s own fields and the seller’s description, and the recording of it when one exists.
[**getBuyerListingBoughtTogether**](BuyerApi.md#getBuyerListingBoughtTogether) | **GET** /v1/buyer/listings/{slug}/bought-together | Frequently bought together / complete the look.
[**getBuyerListingBreak**](BuyerApi.md#getBuyerListingBreak) | **GET** /v1/buyer/listings/{slug}/break | The card break this listing sells spots in, if any; the seed is revealed after the draw.
[**getBuyerListingCert**](BuyerApi.md#getBuyerListingCert) | **GET** /v1/buyer/listings/{slug}/cert | A graded listing’s cert, checked with the grader: the seller’s claim (grader, grade, cert number), status (verified, mismatch, not_found, or unchecked where the grader has no lookup), population and how many graded higher where the grader publishes them, and the grader’s own cert page.
[**getBuyerListingFit**](BuyerApi.md#getBuyerListingFit) | **GET** /v1/buyer/listings/{slug}/fit | A listing’s flat measurements, compared with your saved reference garments.
[**getBuyerListingGroupBuy**](BuyerApi.md#getBuyerListingGroupBuy) | **GET** /v1/buyer/listings/{slug}/group-buy | The group buy open on this listing, if any.
[**getBuyerListingImpact**](BuyerApi.md#getBuyerListingImpact) | **GET** /v1/buyer/listings/{slug}/impact | The sourced footprint of making a new equivalent; null when no published figure applies.
[**getBuyerListingResaleValue**](BuyerApi.md#getBuyerListingResaleValue) | **GET** /v1/buyer/listings/{slug}/resale-value | What the same brand and category resold for on Crossly, and the buyback offer when enabled.
[**getBuyerListingSubscribeOffer**](BuyerApi.md#getBuyerListingSubscribeOffer) | **GET** /v1/buyer/listings/{slug}/subscribe-offer | The subscribe &amp; save discount and intervals on a listing; null when the seller has none.
[**getBuyerListingTryOn**](BuyerApi.md#getBuyerListingTryOn) | **GET** /v1/buyer/listings/{slug}/try-on | Whether an AI try-on is offered for this listing (a wearable with a photo) and whether the image model is configured.
[**getBuyerLiveStreamAuction**](BuyerApi.md#getBuyerLiveStreamAuction) | **GET** /v1/buyer/live-streams/{id}/auction | The auction running on a live stream right now, if any. Bid on it by its &#x60;slug&#x60; at POST /v1/buyer/auctions/:slug/bids.
[**getBuyerMarketPurchaseOption**](BuyerApi.md#getBuyerMarketPurchaseOption) | **GET** /v1/buyer/market/purchase-options | Before you bid or buy: whether the lowest ask is vault stock (keep it vaulted, or pay fastShipCents to rush it), and the grading runs a raw card can go straight to (pass gradeWith on the bid).
[**getBuyerOrderEligibility**](BuyerApi.md#getBuyerOrderEligibility) | **GET** /v1/buyer/orders/{id}/eligibility | What you can do with one order right now — cancel, confirm receipt, report not received, leave feedback.
[**getBuyerOrderExport**](BuyerApi.md#getBuyerOrderExport) | **GET** /v1/buyer/orders/export | Your order history as CSV text (up to 5,000 orders).
[**getBuyerOrderPriceProtection**](BuyerApi.md#getBuyerOrderPriceProtection) | **GET** /v1/buyer/orders/{id}/price-protection | Price protection on one order: if the item gets cheaper before &#x60;until&#x60;, the difference is credited to your Bucks automatically. &#x60;creditedCents&#x60; is what it has paid so far.
[**getBuyerPack**](BuyerApi.md#getBuyerPack) | **GET** /v1/buyer/packs/{slug} | One pack: tiers and odds, items left, expected value, the chase items still in it.
[**getBuyerPackFairness**](BuyerApi.md#getBuyerPackFairness) | **GET** /v1/buyer/packs/fairness | Your provably-fair seeds: the active server-seed commitment (sha256), your client seed and nonce, and every retired seed in full so past openings can be re-run.
[**getBuyerParty**](BuyerApi.md#getBuyerParty) | **GET** /v1/buyer/parties/{slug} | One shopping party.
[**getBuyerPassport**](BuyerApi.md#getBuyerPassport) | **GET** /v1/buyer/passports/{code} | What a product passport tag opens: the item, whether it was authenticated, how many owners on Crossly and since when — never who or for how much.
[**getBuyerPreference**](BuyerApi.md#getBuyerPreference) | **GET** /v1/buyer/preferences | The shopping profile derived from that activity.
[**getBuyerPriceGuide**](BuyerApi.md#getBuyerPriceGuide) | **GET** /v1/buyer/price-guide | What matching items actually sold for on Crossly: median, quartiles, by month, and recent sales. Needs q, brand or category.
[**getBuyerProfile**](BuyerApi.md#getBuyerProfile) | **GET** /v1/buyer/profile | Your Crossly shopping profile — name, email, saved address, Bucks balance.
[**getBuyerPurchaseDelivery**](BuyerApi.md#getBuyerPurchaseDelivery) | **GET** /v1/buyer/purchases/{id}/delivery | Where a purchase is going when not to your door: the pickup point (with its release code) or its ship-together consolidation.
[**getBuyerPurchaseLiveMoment**](BuyerApi.md#getBuyerPurchaseLiveMoment) | **GET** /v1/buyer/purchases/{id}/live-moment | The live show a purchase was bought in, with the offset (seconds) into its replay where it sold. null when it was not bought in a show.
[**getBuyerPurchaseReturn**](BuyerApi.md#getBuyerPurchaseReturn) | **GET** /v1/buyer/purchases/{id}/return | What a return would refund for each reason, by when, and any return already open.
[**getBuyerPurchaseStory**](BuyerApi.md#getBuyerPurchaseStory) | **GET** /v1/buyer/purchases/{id}/story | Your owner story on a purchase, passed on to the next owner if you resell it.
[**getBuyerRegistry**](BuyerApi.md#getBuyerRegistry) | **GET** /v1/buyer/registries/{id} | One of your registries: items with how many are wanted and bought.
[**getBuyerRegistryByToken**](BuyerApi.md#getBuyerRegistryByToken) | **GET** /v1/buyer/registry/{token} | A registry as a guest sees it: items, how many are still wanted, and whether it can ship. Never the address.
[**getBuyerRentalEligibility**](BuyerApi.md#getBuyerRentalEligibility) | **GET** /v1/buyer/rentals/eligibility | Can you rent right now: ID-verified (a photo ID and a matching selfie, once), the verified name rentals ship to, and your standing (one rental at a time until your first comes back; none after one that never did).
[**getBuyerSellerClub**](BuyerApi.md#getBuyerSellerClub) | **GET** /v1/buyer/sellers/{sellerUserId}/club | A seller’s loyalty club: its tiers (spend threshold, discount, perks) and your standing. null when the seller has none.
[**getBuyerSellerTrust**](BuyerApi.md#getBuyerSellerTrust) | **GET** /v1/buyer/sellers/{username}/trust | Seller at a glance: member since, completed sales, independent rating, typical handling time, dispute rate, trust tier, badges — and the plain sentences the profile shows.
[**getBuyerTogether**](BuyerApi.md#getBuyerTogether) | **GET** /v1/buyer/together/{code} | A shop-together room: members, the board with votes, and chat.
[**getBuyerVaultMarketHistory**](BuyerApi.md#getBuyerVaultMarketHistory) | **GET** /v1/buyer/vault-markets/history | Your Vault Markets value by day at the marks (oldest first, today live) over &#x60;days&#x60; (default 90), and today’s change against yesterday’s close.
[**getBuyerVaultMarketIndex**](BuyerApi.md#getBuyerVaultMarketIndex) | **GET** /v1/buyer/vault-markets/indexes/{slug} | One index with its published daily closes (oldest first, &#x60;days&#x60; default 365) and its level now.
[**getBuyerVaultMarketInstantExit**](BuyerApi.md#getBuyerVaultMarketInstantExit) | **GET** /v1/buyer/vault-markets/instant-exit/{id} | The Instant Exit quote for one vault unit you hold, and whether it can be sold now.
[**getBuyerVaultMarketWorth**](BuyerApi.md#getBuyerVaultMarketWorth) | **GET** /v1/buyer/vault-markets/worth | What your vault is worth now: value at the market prices (marks come only from trades) split into reliable and indicative marks, cost and P&amp;L, today’s change, and an estimate of what the units free to sell would fetch from the bids resting on the book now. Read only.
[**listBuyerActivity**](BuyerApi.md#listBuyerActivity) | **GET** /v1/buyer/activity | What this buyer has compared lately.
[**listBuyerAuctionBids**](BuyerApi.md#listBuyerAuctionBids) | **GET** /v1/buyer/auctions/{slug}/bids | An auction’s bid history, highest first, bidders anonymised.
[**listBuyerAuctions**](BuyerApi.md#listBuyerAuctions) | **GET** /v1/buyer/auctions | Auctions you have bid in — bidding, won or lost (last 100).
[**listBuyerBoards**](BuyerApi.md#listBuyerBoards) | **GET** /v1/buyer/boards | Your outfit boards: collages of listings, each with a share link.
[**listBuyerBreaks**](BuyerApi.md#listBuyerBreaks) | **GET** /v1/buyer/breaks | Card-break spots you hold or bought, with what each pulled.
[**listBuyerBuybacks**](BuyerApi.md#listBuyerBuybacks) | **GET** /v1/buyer/buybacks | Your buyback guarantees and requests.
[**listBuyerCart**](BuyerApi.md#listBuyerCart) | **GET** /v1/buyer/cart | What is in your Crossly cart.
[**listBuyerCartSaved**](BuyerApi.md#listBuyerCartSaved) | **GET** /v1/buyer/cart/saved | Items you saved for later out of your cart (last 200).
[**listBuyerCases**](BuyerApi.md#listBuyerCases) | **GET** /v1/buyer/cases | Resolution center — every case you opened (returns, not received, problems).
[**listBuyerCashback**](BuyerApi.md#listBuyerCashback) | **GET** /v1/buyer/cashback | Your Scout cashback — pending, confirmed, paid.
[**listBuyerCatalogListingVideos**](BuyerApi.md#listBuyerCatalogListingVideos) | **GET** /v1/buyer/catalog/listings/{slug}/videos | Videos the seller recorded for this item on request, newest first, with the question each one answers.
[**listBuyerClubs**](BuyerApi.md#listBuyerClubs) | **GET** /v1/buyer/clubs | Sellers’ loyalty clubs you belong to: your spend with each, your tier and its discount, and the next tier.
[**listBuyerCollectionSets**](BuyerApi.md#listBuyerCollectionSets) | **GET** /v1/buyer/collection/sets | Sets you are collecting — a catalogue brand + model you own at least two pieces of — with owned / total and percent complete, most complete first; and whether you show on set leaderboards.
[**listBuyerConsolidations**](BuyerApi.md#listBuyerConsolidations) | **GET** /v1/buyer/consolidations | Your ship-together orders: parcels at the hub, and the one box out.
[**listBuyerConversationGuests**](BuyerApi.md#listBuyerConversationGuests) | **GET** /v1/buyer/conversations/{id}/guests | Guests in a chat.
[**listBuyerFeedback**](BuyerApi.md#listBuyerFeedback) | **GET** /v1/buyer/feedback | Feedback you have left sellers, newest first — with the ids you revise by.
[**listBuyerFeedbackPending**](BuyerApi.md#listBuyerFeedbackPending) | **GET** /v1/buyer/feedback/pending | Orders from the last 60 days that are on their way or arrived and still need your feedback.
[**listBuyerFitRefs**](BuyerApi.md#listBuyerFitRefs) | **GET** /v1/buyer/fit/refs | Your saved reference garments for fit comparison.
[**listBuyerFollowingSellers**](BuyerApi.md#listBuyerFollowingSellers) | **GET** /v1/buyer/following/sellers | Sellers you follow, with how many new listings each has since you last looked.
[**listBuyerGiftCardCredit**](BuyerApi.md#listBuyerGiftCardCredit) | **GET** /v1/buyer/gift-cards/credit | Gift card credit on your account, and when it expires.
[**listBuyerGiftCards**](BuyerApi.md#listBuyerGiftCards) | **GET** /v1/buyer/gift-cards | Gift cards you bought, newest first.
[**listBuyerGiftFinder**](BuyerApi.md#listBuyerGiftFinder) | **GET** /v1/buyer/gift-finder | Live listings for a recipient, interest and budget.
[**listBuyerGiftSent**](BuyerApi.md#listBuyerGiftSent) | **GET** /v1/buyer/gifts/sent | Items you sent as gifts: whether the teaser went out, whether it arrived and was opened, and any thank-you. Send one with &#x60;gift&#x60; on checkout.
[**listBuyerHotspots**](BuyerApi.md#listBuyerHotspots) | **GET** /v1/buyer/hotspots | Shop-the-look tags on a story or lookbook photo: each tagged listing and where it sits on the image (x, y as fractions).
[**listBuyerHunts**](BuyerApi.md#listBuyerHunts) | **GET** /v1/buyer/hunts | Your buyer-agent hunts and what they did.
[**listBuyerInstantOffers**](BuyerApi.md#listBuyerInstantOffers) | **GET** /v1/buyer/instant-offers | Your instant offers: live quotes, accepted ones awaiting a label, approved ones (with the prepaid label) and paid ones.
[**listBuyerLayaways**](BuyerApi.md#listBuyerLayaways) | **GET** /v1/buyer/layaways | Your layaways: price, paid so far, what is left, and the installment schedule. Put an item on layaway at checkout with layawayItemIds.
[**listBuyerListingQuickQuestions**](BuyerApi.md#listBuyerListingQuickQuestions) | **GET** /v1/buyer/listings/{slug}/quick-questions | One-tap questions this listing supports; send one as &#x60;quick&#x60; on a message.
[**listBuyerListingSellerReviews**](BuyerApi.md#listBuyerListingSellerReviews) | **GET** /v1/buyer/listings/{slug}/seller-reviews | The seller’s public reviews: summary, text, photos, replies.
[**listBuyerLiveShipments**](BuyerApi.md#listBuyerLiveShipments) | **GET** /v1/buyer/live-shipments | Your one-box-per-show shipments: every order won in a show ships together, and postage is charged once (the rest refunded when it ships).
[**listBuyerLiveStreamLineup**](BuyerApi.md#listBuyerLiveStreamLineup) | **GET** /v1/buyer/live-streams/{id}/lineup | What a live show will sell, in order: each item, its price, and whether it is still available.
[**listBuyerMarketBids**](BuyerApi.md#listBuyerMarketBids) | **GET** /v1/buyer/market/bids | Your resting market bids.
[**listBuyerMarketWatches**](BuyerApi.md#listBuyerMarketWatches) | **GET** /v1/buyer/market/watches | Market variants you watch, with the price you are waiting for.
[**listBuyerOffers**](BuyerApi.md#listBuyerOffers) | **GET** /v1/buyer/offers | Offers you have made, newest first (last 100).
[**listBuyerOrders**](BuyerApi.md#listBuyerOrders) | **GET** /v1/buyer/orders | What you have bought on Crossly, newest first.
[**listBuyerPackOpenings**](BuyerApi.md#listBuyerPackOpenings) | **GET** /v1/buyer/pack-openings | Your pulls: what you got, its value, sell-back status, and the fairness proof for each (the server seed once rotated).
[**listBuyerPacks**](BuyerApi.md#listBuyerPacks) | **GET** /v1/buyer/packs | Packs you can open: price, every tier with its published odds, what is left in it and its value range, and the expected value of one opening.
[**listBuyerParties**](BuyerApi.md#listBuyerParties) | **GET** /v1/buyer/parties | Themed shopping parties, live and upcoming.
[**listBuyerPartyListings**](BuyerApi.md#listBuyerPartyListings) | **GET** /v1/buyer/parties/{slug}/listings | Listings shared to a party, featured first.
[**listBuyerPickupPoints**](BuyerApi.md#listBuyerPickupPoints) | **GET** /v1/buyer/pickup-points | Carrier pickup points (UPS Access Point / FedEx Hold at Location) near an address; pass one as &#x60;pickupPoint&#x60; to POST /v1/buyer/checkout.
[**listBuyerProtectionPlans**](BuyerApi.md#listBuyerProtectionPlans) | **GET** /v1/buyer/protection-plans | Your protection plans (bought at checkout with &#x60;protection&#x60;): status, term, coverage, contract id, and any refund.
[**listBuyerRegistries**](BuyerApi.md#listBuyerRegistries) | **GET** /v1/buyer/registries | Your gift registries.
[**listBuyerRegistryGifts**](BuyerApi.md#listBuyerRegistryGifts) | **GET** /v1/buyer/registries/{id}/gifts | Your thank-you list: who bought what off the registry, and whether you have thanked them.
[**listBuyerRegistrySearch**](BuyerApi.md#listBuyerRegistrySearch) | **GET** /v1/buyer/registries/search | Find a registry by its name or the registrant’s name. Current and recent registries only.
[**listBuyerRentals**](BuyerApi.md#listBuyerRentals) | **GET** /v1/buyer/rentals | Your rentals: dates, status (reserved, out, returned, claimed, closed, cancelled), the return label, and what happened to the deposit.
[**listBuyerSizeMemoryPrompts**](BuyerApi.md#listBuyerSizeMemoryPrompts) | **GET** /v1/buyer/size-memory/prompts | Delivered orders with a size that you haven’t said how they fit (the last 60 days).
[**listBuyerSizeMemorySizes**](BuyerApi.md#listBuyerSizeMemorySizes) | **GET** /v1/buyer/size-memory/sizes | The sizes learned from what you bought and kept, by kind of item (shoes, tops, bottoms, dresses, outerwear) and department.
[**listBuyerSplits**](BuyerApi.md#listBuyerSplits) | **GET** /v1/buyer/splits | Purchases you split, with each share’s status.
[**listBuyerSubscriptions**](BuyerApi.md#listBuyerSubscriptions) | **GET** /v1/buyer/subscriptions | Your subscribe &amp; save standing orders.
[**listBuyerTogether**](BuyerApi.md#listBuyerTogether) | **GET** /v1/buyer/together | Shop-together rooms you are in.
[**listBuyerTotalRequests**](BuyerApi.md#listBuyerTotalRequests) | **GET** /v1/buyer/total-requests | Your combined-shipping total requests, newest per seller.
[**listBuyerTryOns**](BuyerApi.md#listBuyerTryOns) | **GET** /v1/buyer/try-ons | Your AI try-ons: the rendered images (labelled AI-generated wherever shown).
[**listBuyerVault**](BuyerApi.md#listBuyerVault) | **GET** /v1/buyer/vault | What you own in the Crossly vault: stored (authenticated, on a shelf), listed for sale, or on its way home — with the price to ship one home.
[**listBuyerVaultMarketHoldings**](BuyerApi.md#listBuyerVaultMarketHoldings) | **GET** /v1/buyer/vault-markets/holdings | Each unit you hold in the vault at its market price, with the mark’s quality (A or B reliable, C indicative, none), cost, P&amp;L and where it stands (stored, listed, lent, pledged, at the grader); &#x60;meta&#x60; carries the totals and the units you have out on loan.
[**listBuyerVaultMarketIndexes**](BuyerApi.md#listBuyerVaultMarketIndexes) | **GET** /v1/buyer/vault-markets/indexes | Crossly indexes over vault book keys (category, brand, curated, composite, segment, and your own), each with its level now and change since the last daily close. Index levels are valued only from the book’s marks.
[**listBuyerVaultMarketInstantExit**](BuyerApi.md#listBuyerVaultMarketInstantExit) | **GET** /v1/buyer/vault-markets/instant-exit | Instant Exit quotes for what you hold, one per book key: the best resting bid (yours left out), its share of the mark, the bid levels, units held and which are free to sell, and why a key cannot be sold instantly. A quote, not an order.
[**listBuyerVaultMarketWatchlist**](BuyerApi.md#listBuyerVaultMarketWatchlist) | **GET** /v1/buyer/vault-markets/watchlist | The book keys you watch, with mark and its quality, 24 h and 7 d change, and the last 30 daily marks.
[**listBuyerVideoRequests**](BuyerApi.md#listBuyerVideoRequests) | **GET** /v1/buyer/video-requests | Your video requests and their answers.
[**listBuyerWishlistItems**](BuyerApi.md#listBuyerWishlistItems) | **GET** /v1/buyer/wishlists/{id}/items | What is on one wishlist.
[**listBuyerWishlistMembers**](BuyerApi.md#listBuyerWishlistMembers) | **GET** /v1/buyer/wishlists/{id}/members | Co-editors of a shared wishlist.
[**listBuyerWishlists**](BuyerApi.md#listBuyerWishlists) | **GET** /v1/buyer/wishlists | Your wishlists.
[**updateBuyerBoard**](BuyerApi.md#updateBuyerBoard) | **PATCH** /v1/buyer/boards/{id} | Rename a board, change its description, or make it public / private.
[**updateBuyerBoardLayout**](BuyerApi.md#updateBuyerBoardLayout) | **PUT** /v1/buyer/boards/{id}/layout | Replace a board’s layout: items by platform listing id or slug, with x, y, w (0–1) and z. At most 40.
[**updateBuyerCollectionSetLeaderboard**](BuyerApi.md#updateBuyerCollectionSetLeaderboard) | **PUT** /v1/buyer/collection/sets/leaderboard | Show or hide yourself (by your public handle) on set leaderboards.
[**updateBuyerFeedback**](BuyerApi.md#updateBuyerFeedback) | **PATCH** /v1/buyer/feedback/{id} | Revise feedback you left, within 60 days.
[**updateBuyerHunt**](BuyerApi.md#updateBuyerHunt) | **PATCH** /v1/buyer/hunts/{id} | Pause, resume or stop a hunt.
[**updateBuyerPurchaseStory**](BuyerApi.md#updateBuyerPurchaseStory) | **PUT** /v1/buyer/purchases/{id}/story | Write your owner story (280 characters); it travels with the item if you resell it.
[**updateBuyerRegistry**](BuyerApi.md#updateBuyerRegistry) | **PATCH** /v1/buyer/registries/{id} | Edit a registry: title, kind, date, message, ship-to address.
[**updateBuyerRegistryItem**](BuyerApi.md#updateBuyerRegistryItem) | **PUT** /v1/buyer/registries/{id}/items/{platformListingId} | How many of an item you want (1–50).
[**updateBuyerSubscription**](BuyerApi.md#updateBuyerSubscription) | **PATCH** /v1/buyer/subscriptions/{id} | Pause, resume, skip the next delivery, change the interval, or cancel.
[**updateBuyerWishlist**](BuyerApi.md#updateBuyerWishlist) | **PATCH** /v1/buyer/wishlists/{id} | Rename a wishlist, or make it public / private.


<a name="createBuyerActivity"></a>
# **createBuyerActivity**
> CreateBuyerActivityResponse createBuyerActivity(createBuyerActivityRequest)

Report an item your user is looking at, and get our answer.

Records the look and returns whether Crossly has the item and at what price. Send an identifier and a store DOMAIN — a full URL is refused. Nothing about the page itself is stored.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val createBuyerActivityRequest : CreateBuyerActivityRequest =  // CreateBuyerActivityRequest | 
try {
    val result : CreateBuyerActivityResponse = apiInstance.createBuyerActivity(createBuyerActivityRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerActivity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerActivity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBuyerActivityRequest** | **CreateBuyerActivityRequest**|  |

### Return type

**CreateBuyerActivityResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerAuctionBid"></a>
# **createBuyerAuctionBid**
> CreateBuyerAuctionBidResponse createBuyerAuctionBid(slug, createBuyerAuctionBidRequest)

Place a bid, optionally with a proxy maximum. A WINNING BID IS CHARGED AUTOMATICALLY.

Spends money: if you win, your saved card is charged when the auction closes, with nobody present. Requires buyer:checkout:write AND this key switched on at PUT /v1/buyer/checkout/controls; the bid’s maximum (or amount) is checked against the key’s per-order and daily ceilings. Amounts are integer cents. &#x60;leading: false&#x60; means a standing proxy bid outbid you at once. Send an Idempotency-Key: a retried bid is a second bid.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | The auction listing slug.
val createBuyerAuctionBidRequest : CreateBuyerAuctionBidRequest =  // CreateBuyerAuctionBidRequest | 
try {
    val result : CreateBuyerAuctionBidResponse = apiInstance.createBuyerAuctionBid(slug, createBuyerAuctionBidRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerAuctionBid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerAuctionBid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**| The auction listing slug. |
 **createBuyerAuctionBidRequest** | **CreateBuyerAuctionBidRequest**|  |

### Return type

**CreateBuyerAuctionBidResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerAuctionPay"></a>
# **createBuyerAuctionPay**
> CreateBuyerAuctionPayResponse createBuyerAuctionPay(slug)

Pay for an auction you won whose automatic charge did not go through.

Returns a Stripe client secret to confirm on the buyer’s device (3-D Secure, a new card). Charges nothing by itself. &#x60;paid: true&#x60; means there is nothing left to pay.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | The auction listing slug.
try {
    val result : CreateBuyerAuctionPayResponse = apiInstance.createBuyerAuctionPay(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerAuctionPay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerAuctionPay")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**| The auction listing slug. |

### Return type

**CreateBuyerAuctionPayResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerAuctionRetract"></a>
# **createBuyerAuctionRetract**
> CreateBuyerAuctionRetractResponse createBuyerAuctionRetract(slug, createBuyerAuctionRetractRequest)

Retract your bids under eBay’s rules — a typo, a changed listing, or an unreachable seller.

With 12 hours or more left every bid of yours is withdrawn; inside 12 hours only bids placed in the last hour. Proxy answers your bid triggered are withdrawn with it.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | The auction listing slug.
val createBuyerAuctionRetractRequest : CreateBuyerAuctionRetractRequest =  // CreateBuyerAuctionRetractRequest | 
try {
    val result : CreateBuyerAuctionRetractResponse = apiInstance.createBuyerAuctionRetract(slug, createBuyerAuctionRetractRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerAuctionRetract")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerAuctionRetract")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**| The auction listing slug. |
 **createBuyerAuctionRetractRequest** | **CreateBuyerAuctionRetractRequest**|  |

### Return type

**CreateBuyerAuctionRetractResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerBoard"></a>
# **createBuyerBoard**
> CreateBuyerBoardResponse createBuyerBoard()

Create an outfit board.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : CreateBuyerBoardResponse = apiInstance.createBuyerBoard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerBoard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerBoard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBuyerBoardResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerBoardItem"></a>
# **createBuyerBoardItem**
> BuyerResponse createBuyerBoardItem(id)

Add a listing (by slug) to a board, at the next free spot.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerBoardItem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerBoardItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerBoardItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerBreakSpotHold"></a>
# **createBuyerBreakSpotHold**
> CreateBuyerBreakSpotHoldResponse createBuyerBreakSpotHold(id, spotId)

Hold a spot in a pick-your-spot break, then buy it through checkout before the hold lapses.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
val spotId : kotlin.String = spotId_example // kotlin.String | 
try {
    val result : CreateBuyerBreakSpotHoldResponse = apiInstance.createBuyerBreakSpotHold(id, spotId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerBreakSpotHold")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerBreakSpotHold")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **spotId** | **kotlin.String**|  |

### Return type

**CreateBuyerBreakSpotHoldResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerBuybackRequest"></a>
# **createBuyerBuybackRequest**
> BuyerResponse createBuyerBuybackRequest(id)

Ask Crossly to buy an item back under its buyback guarantee.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerBuybackRequest(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerBuybackRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerBuybackRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerCartItem"></a>
# **createBuyerCartItem**
> CreateBuyerCartItemResponse createBuyerCartItem(createBuyerCartItemRequest)

Add a listing to your cart.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val createBuyerCartItemRequest : CreateBuyerCartItemRequest =  // CreateBuyerCartItemRequest | 
try {
    val result : CreateBuyerCartItemResponse = apiInstance.createBuyerCartItem(createBuyerCartItemRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCartItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCartItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBuyerCartItemRequest** | **CreateBuyerCartItemRequest**|  |

### Return type

**CreateBuyerCartItemResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerCartItemSaveForLater"></a>
# **createBuyerCartItemSaveForLater**
> BuyerCartResponse createBuyerCartItemSaveForLater(id)

Move a cart line to saved-for-later.

Returns the whole saved list. A line from an accepted offer cannot be saved — its price only holds in the cart.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : BuyerCartResponse = apiInstance.createBuyerCartItemSaveForLater(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCartItemSaveForLater")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCartItemSaveForLater")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**BuyerCartResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerCartOptimizer"></a>
# **createBuyerCartOptimizer**
> CreateBuyerCartOptimizerResponse createBuyerCartOptimizer()

Cart optimizer: send a shopping list (one item per line, \&quot;2 Charizard Base Set\&quot;) and get the cheapest delivered basket across sellers — one pick per line, items + each seller’s shipping with free-shipping thresholds applied. fewestPackages prefers fewer sellers. Nothing is added to the cart.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : CreateBuyerCartOptimizerResponse = apiInstance.createBuyerCartOptimizer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCartOptimizer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCartOptimizer")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBuyerCartOptimizerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerCartQuote"></a>
# **createBuyerCartQuote**
> CreateBuyerCartQuoteResponse createBuyerCartQuote()

Price the cart, delivered — item, shipping, tax, total.

Runs the real checkout cascade and returns the totals instead of charging. Nothing is purchased. &#x60;taxComplete: false&#x60; means there is no saved delivery address, so the total is a floor rather than a final figure. &#x60;shippingOptions&#x60; lists each seller’s shipping services; send &#x60;shippingServiceBySeller&#x60; to price a different speed (an id the seller does not offer to the destination is a 400). Optional body: &#x60;{ \&quot;shippingServiceBySeller\&quot;: { \&quot;&lt;sellerUserId&gt;\&quot;: \&quot;&lt;serviceId&gt;\&quot; } }&#x60; — omitted sellers get the cheapest service; &#x60;registryToken&#x60; prices it as a gift shipped to that registry. (No body JSON schema: existing callers POST with none.)

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : CreateBuyerCartQuoteResponse = apiInstance.createBuyerCartQuote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCartQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCartQuote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBuyerCartQuoteResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerCartSavedMoveToCart"></a>
# **createBuyerCartSavedMoveToCart**
> BuyerCartResponse createBuyerCartSavedMoveToCart(id)

Move a saved item back into your cart, at today’s price.

Refused when the item has sold or delisted. Returns the remaining saved list.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : BuyerCartResponse = apiInstance.createBuyerCartSavedMoveToCart(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCartSavedMoveToCart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCartSavedMoveToCart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**BuyerCartResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerCaseCounter"></a>
# **createBuyerCaseCounter**
> BuyerResponse createBuyerCaseCounter(id, createBuyerCaseCounterRequest)

Propose your own refund figure on a case.

In cents, at most what you paid. The case goes back to the seller for 72 hours.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
val createBuyerCaseCounterRequest : CreateBuyerCaseCounterRequest =  // CreateBuyerCaseCounterRequest | 
try {
    val result : BuyerResponse = apiInstance.createBuyerCaseCounter(id, createBuyerCaseCounterRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCaseCounter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCaseCounter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |
 **createBuyerCaseCounterRequest** | **CreateBuyerCaseCounterRequest**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerCaseEscalate"></a>
# **createBuyerCaseEscalate**
> BuyerResponse createBuyerCaseEscalate(id)

Ask Crossly to step in on a case.

Hands the case to Crossly’s reviewers. Refused once it is closed or already escalated.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : BuyerResponse = apiInstance.createBuyerCaseEscalate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCaseEscalate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCaseEscalate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerCaseMessage"></a>
# **createBuyerCaseMessage**
> BuyerResponse createBuyerCaseMessage(id, createBuyerCaseMessageRequest)

Post a message on a case thread.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
val createBuyerCaseMessageRequest : CreateBuyerCaseMessageRequest =  // CreateBuyerCaseMessageRequest | 
try {
    val result : BuyerResponse = apiInstance.createBuyerCaseMessage(id, createBuyerCaseMessageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCaseMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCaseMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |
 **createBuyerCaseMessageRequest** | **CreateBuyerCaseMessageRequest**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerCaseRespond"></a>
# **createBuyerCaseRespond**
> BuyerResponse createBuyerCaseRespond(id, createBuyerCaseRespondRequest)

Accept or reject the seller’s partial-refund offer on a case.

Accepting refunds the offered amount and closes the case. Rejecting hands it back to the seller for 72 hours. To propose your own figure instead, use the counter endpoint.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
val createBuyerCaseRespondRequest : CreateBuyerCaseRespondRequest =  // CreateBuyerCaseRespondRequest | 
try {
    val result : BuyerResponse = apiInstance.createBuyerCaseRespond(id, createBuyerCaseRespondRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCaseRespond")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCaseRespond")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |
 **createBuyerCaseRespondRequest** | **CreateBuyerCaseRespondRequest**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerCaseWithdraw"></a>
# **createBuyerCaseWithdraw**
> BuyerResponse createBuyerCaseWithdraw(id)

Withdraw a case you opened.

Closes it with no refund and lets the order complete normally. Cannot be reopened — one case per order.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : BuyerResponse = apiInstance.createBuyerCaseWithdraw(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCaseWithdraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCaseWithdraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerCatalogListingRental"></a>
# **createBuyerCatalogListingRental**
> CreateBuyerCatalogListingRentalResponse createBuyerCatalogListingRental(slug)

Book a rental. Returns a Stripe PaymentIntent client secret for rent + shipping both ways + deposit; the dates are held 30 minutes for payment. Crossly buys both labels; the deposit comes back after the item does.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateBuyerCatalogListingRentalResponse = apiInstance.createBuyerCatalogListingRental(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCatalogListingRental")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCatalogListingRental")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateBuyerCatalogListingRentalResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerCatalogListingRentalQuote"></a>
# **createBuyerCatalogListingRentalQuote**
> CreateBuyerCatalogListingRentalQuoteResponse createBuyerCatalogListingRentalQuote(slug)

Price a rental: rent (the cheaper of by-the-day and by-the-week), both shipping legs once a ship-to is given, and the deposit. &#x60;problem&#x60; says why the dates can’t be booked.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateBuyerCatalogListingRentalQuoteResponse = apiInstance.createBuyerCatalogListingRentalQuote(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCatalogListingRentalQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCatalogListingRentalQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateBuyerCatalogListingRentalQuoteResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerCatalogListingVideoRequest"></a>
# **createBuyerCatalogListingVideoRequest**
> CreateBuyerCatalogListingVideoRequestResponse createBuyerCatalogListingVideoRequest(slug)

Ask the seller for a video of an item (one open request per item). The seller is notified; their answer appears on the listing for every buyer.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateBuyerCatalogListingVideoRequestResponse = apiInstance.createBuyerCatalogListingVideoRequest(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerCatalogListingVideoRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerCatalogListingVideoRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateBuyerCatalogListingVideoRequestResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerConversationInvite"></a>
# **createBuyerConversationInvite**
> CreateBuyerWishlistInviteResponse createBuyerConversationInvite(id)

Invite a friend into a chat with a seller: a single-use link (7 days) that makes whoever opens it a guest who can read and post. Only the thread’s buyer can invite; at most 5 guests.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerWishlistInviteResponse = apiInstance.createBuyerConversationInvite(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerConversationInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerConversationInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerWishlistInviteResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerConversationJoin"></a>
# **createBuyerConversationJoin**
> CreateBuyerConversationJoinResponse createBuyerConversationJoin(token)

Join a chat you were invited into, as a guest.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : CreateBuyerConversationJoinResponse = apiInstance.createBuyerConversationJoin(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerConversationJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerConversationJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

**CreateBuyerConversationJoinResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerFeedback"></a>
# **createBuyerFeedback**
> CreateBuyerFeedbackResponse createBuyerFeedback(createBuyerFeedbackRequest)

Leave feedback on up to 25 orders at once, with optional detailed seller ratings.

Each entry is checked on its own — one refused comment never sinks the others; read &#x60;data[].ok&#x60;. Orders to review come from GET /v1/buyer/feedback/pending.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val createBuyerFeedbackRequest : CreateBuyerFeedbackRequest =  // CreateBuyerFeedbackRequest | 
try {
    val result : CreateBuyerFeedbackResponse = apiInstance.createBuyerFeedback(createBuyerFeedbackRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerFeedback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerFeedback")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBuyerFeedbackRequest** | **CreateBuyerFeedbackRequest**|  |

### Return type

**CreateBuyerFeedbackResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerFitRef"></a>
# **createBuyerFitRef**
> BuyerResponse2 createBuyerFitRef()

Save a reference garment (flat measurements, inches) to compare listings against.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse2 = apiInstance.createBuyerFitRef()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerFitRef")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerFitRef")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse2**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerFollowingSellerSeen"></a>
# **createBuyerFollowingSellerSeen**
> CreateBuyerFollowingSellerSeenResponse createBuyerFollowingSellerSeen(createBuyerFollowingSellerSeenRequest)

Clear the \&quot;new listings\&quot; count on a followed seller, or on all of them.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val createBuyerFollowingSellerSeenRequest : CreateBuyerFollowingSellerSeenRequest =  // CreateBuyerFollowingSellerSeenRequest | 
try {
    val result : CreateBuyerFollowingSellerSeenResponse = apiInstance.createBuyerFollowingSellerSeen(createBuyerFollowingSellerSeenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerFollowingSellerSeen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerFollowingSellerSeen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBuyerFollowingSellerSeenRequest** | **CreateBuyerFollowingSellerSeenRequest**|  |

### Return type

**CreateBuyerFollowingSellerSeenResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerGiftCard"></a>
# **createBuyerGiftCard**
> CreateBuyerGiftCardResponse createBuyerGiftCard(createBuyerGiftCardRequest)

Start a gift card purchase.

Creates an unpaid card and a Stripe PaymentIntent, and returns its client secret. Nothing is charged until the PaymentIntent is confirmed; the code is emailed to the recipient once payment clears (at deliverAt, if given) and is never returned here. $10–$500. Cards and their credit expire 5 years after purchase. Idempotency-Key required.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val createBuyerGiftCardRequest : CreateBuyerGiftCardRequest =  // CreateBuyerGiftCardRequest | 
try {
    val result : CreateBuyerGiftCardResponse = apiInstance.createBuyerGiftCard(createBuyerGiftCardRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerGiftCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerGiftCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBuyerGiftCardRequest** | **CreateBuyerGiftCardRequest**|  |

### Return type

**CreateBuyerGiftCardResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerGiftCardRedeem"></a>
# **createBuyerGiftCardRedeem**
> CreateBuyerGiftCardRedeemResponse createBuyerGiftCardRedeem(createBuyerGiftCardRedeemRequest)

Redeem a gift card code into your own balance.

Adds the card’s value to the token owner’s Crossly balance (Crossly Bucks today; CBX granted balance when Crossly issues CBX), spendable at checkout. One redemption per card. The credit keeps the card’s expiry date. Refusals: 404 invalid_code, 409 already_redeemed / not_paid / void / expired.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val createBuyerGiftCardRedeemRequest : CreateBuyerGiftCardRedeemRequest =  // CreateBuyerGiftCardRedeemRequest | 
try {
    val result : CreateBuyerGiftCardRedeemResponse = apiInstance.createBuyerGiftCardRedeem(createBuyerGiftCardRedeemRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerGiftCardRedeem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerGiftCardRedeem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBuyerGiftCardRedeemRequest** | **CreateBuyerGiftCardRedeemRequest**|  |

### Return type

**CreateBuyerGiftCardRedeemResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerGroupBuyJoin"></a>
# **createBuyerGroupBuyJoin**
> CreateBuyerGroupBuyJoinResponse createBuyerGroupBuyJoin(id)

Join a group buy: a hold at the starting price, captured at the price the group reaches. Checked against this key’s spending controls; send an Idempotency-Key.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerGroupBuyJoinResponse = apiInstance.createBuyerGroupBuyJoin(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerGroupBuyJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerGroupBuyJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerGroupBuyJoinResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerGroupBuyLeave"></a>
# **createBuyerGroupBuyLeave**
> BuyerResponse createBuyerGroupBuyLeave(id)

Leave a group buy and release your hold.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerGroupBuyLeave(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerGroupBuyLeave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerGroupBuyLeave")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerHunt"></a>
# **createBuyerHunt**
> BuyerResponse2 createBuyerHunt()

Start a buyer-agent hunt — over a search (filters), or auto-buy on one listing (listingSlug: buy it once its price, sale applied, is within maxPriceCents). &#x60;offer&#x60; and &#x60;buy&#x60; modes also need buyer:checkout:write, and the budget is checked against this key’s spending controls.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse2 = apiInstance.createBuyerHunt()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerHunt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerHunt")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse2**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerInstantOfferAccept"></a>
# **createBuyerInstantOfferAccept**
> BuyerResponse createBuyerInstantOfferAccept(id)

Accept Crossly’s instant offer on a collection item. Ops then send a prepaid label; the store credit is paid once the item arrives and checks out.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerInstantOfferAccept(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerInstantOfferAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerInstantOfferAccept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerLayawayCancel"></a>
# **createBuyerLayawayCancel**
> BuyerLayawayResponse createBuyerLayawayCancel(id)

Cancel a layaway: everything paid comes back except the layaway fee (10% of the price, at most $15).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerLayawayResponse = apiInstance.createBuyerLayawayCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerLayawayCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerLayawayCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerLayawayResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerLayawayPay"></a>
# **createBuyerLayawayPay**
> BuyerLayawayResponse createBuyerLayawayPay(id)

Pay some (at least $1) or all of what is left now, on the saved card. Paid in full, it ships.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerLayawayResponse = apiInstance.createBuyerLayawayPay(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerLayawayPay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerLayawayPay")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerLayawayResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerListingAudioSummary"></a>
# **createBuyerListingAudioSummary**
> GetBuyerListingAudioSummaryResponse createBuyerListingAudioSummary(slug)

Record the spoken summary of a listing (cached per listing version). 503 naming TTS_API_KEY when no speech provider is configured.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingAudioSummaryResponse = apiInstance.createBuyerListingAudioSummary(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerListingAudioSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerListingAudioSummary")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingAudioSummaryResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerListingSplit"></a>
# **createBuyerListingSplit**
> CreateBuyerListingSplitResponse createBuyerListingSplit(slug)

Split a purchase: one pay link per person; nobody is charged until all have paid.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateBuyerListingSplitResponse = apiInstance.createBuyerListingSplit(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerListingSplit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerListingSplit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateBuyerListingSplitResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerListingSubscribe"></a>
# **createBuyerListingSubscribe**
> BuyerResponse2 createBuyerListingSubscribe(slug)

Subscribe &amp; save: a standing order charged to your saved card every interval. Checked against this key’s spending controls; send an Idempotency-Key.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : BuyerResponse2 = apiInstance.createBuyerListingSubscribe(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerListingSubscribe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerListingSubscribe")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**BuyerResponse2**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerListingTryOn"></a>
# **createBuyerListingTryOn**
> CreateBuyerListingTryOnResponse createBuyerListingTryOn(slug)

Render an AI try-on of this listing on the buyer’s own photo (base64 &#x60;photo&#x60;, or &#x60;reuseLastPhoto&#x60;). &#x60;confirmSelfAdult&#x60; must be true: the photo is of the buyer and they are 18+. Wearables only; capped per day; 503 naming TRYON_API_KEY when no image model is configured.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateBuyerListingTryOnResponse = apiInstance.createBuyerListingTryOn(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerListingTryOn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerListingTryOn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateBuyerListingTryOnResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerMarketBid"></a>
# **createBuyerMarketBid**
> CreateBuyerMarketBidResponse createBuyerMarketBid()

Place a fixed-price market bid. SPENDS MONEY: it fills against the lowest ask at or under your price and charges your saved card (plus the fast-ship premium when fastShip is set and it fills from vault stock). deliverTo vault keeps it in your Crossly vault; gradeWith sends a raw card to a Grading run first. Checked against this key’s spending controls; send an Idempotency-Key.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : CreateBuyerMarketBidResponse = apiInstance.createBuyerMarketBid()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerMarketBid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerMarketBid")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBuyerMarketBidResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerMarketWatch"></a>
# **createBuyerMarketWatch**
> BuyerResponse createBuyerMarketWatch()

Watch a market variant: alert at or below a price, or on any drop.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse = apiInstance.createBuyerMarketWatch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerMarketWatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerMarketWatch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerOffer"></a>
# **createBuyerOffer**
> CreateBuyerOfferResponse createBuyerOffer(createBuyerOfferRequest)

Offer a price on a listing.

Sends an offer to the seller. Spends nothing — a seller accepting still leaves you to complete checkout. Offers at or above the asking price are refused; buy it instead.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val createBuyerOfferRequest : CreateBuyerOfferRequest =  // CreateBuyerOfferRequest | 
try {
    val result : CreateBuyerOfferResponse = apiInstance.createBuyerOffer(createBuyerOfferRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerOffer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBuyerOfferRequest** | **CreateBuyerOfferRequest**|  |

### Return type

**CreateBuyerOfferResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerOfferRespond"></a>
# **createBuyerOfferRespond**
> CreateBuyerOfferRespondResponse createBuyerOfferRespond(id, createBuyerOfferRespondRequest)

Answer a seller’s counteroffer — accept, decline, or counter back.

Only an offer with &#x60;awaitingBuyer: true&#x60; can be answered. Accepting opens a 48-hour window to pay on Crossly; it charges nothing. A counter must be below the seller’s price (in cents) and becomes a new offer waiting on the seller.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The offer id.
val createBuyerOfferRespondRequest : CreateBuyerOfferRespondRequest =  // CreateBuyerOfferRespondRequest | 
try {
    val result : CreateBuyerOfferRespondResponse = apiInstance.createBuyerOfferRespond(id, createBuyerOfferRespondRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerOfferRespond")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerOfferRespond")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The offer id. |
 **createBuyerOfferRespondRequest** | **CreateBuyerOfferRespondRequest**|  |

### Return type

**CreateBuyerOfferRespondResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerOrderCancel"></a>
# **createBuyerOrderCancel**
> CreateBuyerOrderCancelResponse createBuyerOrderCancel(id)

Cancel an order before it ships — refunds it in full.

Instant while the seller has not bought a label or shipped. Refused with 409 once they have (&#x60;details.shopCode&#x60;: already_shipped, label_purchased, disputed, already_refunded). Check GET /v1/buyer/orders/{id}/eligibility first.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : CreateBuyerOrderCancelResponse = apiInstance.createBuyerOrderCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerOrderCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerOrderCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**CreateBuyerOrderCancelResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerOrderInr"></a>
# **createBuyerOrderInr**
> CreateBuyerOrderInrResponse createBuyerOrderInr(id, createBuyerOrderInrRequest)

Open an item-not-received case.

Only after the expected delivery window — a 409 carries &#x60;details.reason&#x60; and &#x60;details.opensAt&#x60; when it is too early. The seller then has 72 hours to respond. One case per order, ever.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
val createBuyerOrderInrRequest : CreateBuyerOrderInrRequest =  // CreateBuyerOrderInrRequest | 
try {
    val result : CreateBuyerOrderInrResponse = apiInstance.createBuyerOrderInr(id, createBuyerOrderInrRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerOrderInr")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerOrderInr")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |
 **createBuyerOrderInrRequest** | **CreateBuyerOrderInrRequest**|  |

### Return type

**CreateBuyerOrderInrResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerOrderReceived"></a>
# **createBuyerOrderReceived**
> CreateBuyerOrderReceivedResponse createBuyerOrderReceived(id)

Confirm you received an order.

Records receipt and opens feedback. It does NOT release the seller’s money sooner or shorten your buyer protection. Closes the item-not-received entry point.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : CreateBuyerOrderReceivedResponse = apiInstance.createBuyerOrderReceived(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerOrderReceived")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerOrderReceived")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**CreateBuyerOrderReceivedResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerOrderTip"></a>
# **createBuyerOrderTip**
> CreateBuyerOrderTipResponse createBuyerOrderTip(id)

Tip the seller on one of your shipped orders, charged to your saved card. One tip per order; $1–$500; checked against this key’s spending controls.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerOrderTipResponse = apiInstance.createBuyerOrderTip(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerOrderTip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerOrderTip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerOrderTipResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerPackFairnessRotate"></a>
# **createBuyerPackFairnessRotate**
> GetBuyerPackFairnessResponse createBuyerPackFairnessRotate()

Reveal your current server seed and start a new one (optionally with your own client seed). Refused while an opening is awaiting payment.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerPackFairnessResponse = apiInstance.createBuyerPackFairnessRotate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerPackFairnessRotate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerPackFairnessRotate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerPackFairnessResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerPackOpen"></a>
# **createBuyerPackOpen**
> CreateBuyerPackOpenResponse createBuyerPackOpen(slug)

Open a pack. SPENDS MONEY: charges the pack price to your saved card, then pulls one real item by the published odds (provably fair: see /buyer/packs/fairness) into your Crossly vault. confirmAdult must be true. Checked against this key’s spending controls; send an Idempotency-Key.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateBuyerPackOpenResponse = apiInstance.createBuyerPackOpen(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerPackOpen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerPackOpen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateBuyerPackOpenResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerPackOpeningSellBack"></a>
# **createBuyerPackOpeningSellBack**
> CreateBuyerPackOpeningSellBackResponse createBuyerPackOpeningSellBack(id)

Sell a pull straight back for Crossly credit at the pack’s buyback rate, within its window, while it is still in your vault.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerPackOpeningSellBackResponse = apiInstance.createBuyerPackOpeningSellBack(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerPackOpeningSellBack")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerPackOpeningSellBack")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerPackOpeningSellBackResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerPassportClaim"></a>
# **createBuyerPassportClaim**
> GetBuyerPassportResponse createBuyerPassportClaim(code)

Claim a passport as the item’s current owner (the buyer of its latest sale) — shown as “in its owner’s hands” until it sells again.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : GetBuyerPassportResponse = apiInstance.createBuyerPassportClaim(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerPassportClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerPassportClaim")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

**GetBuyerPassportResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerProtectionPlanCancel"></a>
# **createBuyerProtectionPlanCancel**
> CreateBuyerProtectionPlanCancelResponse createBuyerProtectionPlanCancel(id)

Cancel a protection plan. The insurer decides what is refundable (pro-rata after the free-look window); that amount goes back to the card.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerProtectionPlanCancelResponse = apiInstance.createBuyerProtectionPlanCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerProtectionPlanCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerProtectionPlanCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerProtectionPlanCancelResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerPurchaseDownload"></a>
# **createBuyerPurchaseDownload**
> CreateBuyerPurchaseDownloadResponse createBuyerPurchaseDownload(id)

A ten-minute link to a digital purchase’s file; each call uses one of its downloads.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerPurchaseDownloadResponse = apiInstance.createBuyerPurchaseDownload(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerPurchaseDownload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerPurchaseDownload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerPurchaseDownloadResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerPurchaseFit"></a>
# **createBuyerPurchaseFit**
> BuyerResponse createBuyerPurchaseFit(id)

Say how a delivered purchase fit: true_to_size, small or large. It teaches your size memory and, pooled with other buyers, how the brand runs.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerPurchaseFit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerPurchaseFit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerPurchaseFit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerPurchaseReturn"></a>
# **createBuyerPurchaseReturn**
> BuyerResponse2 createBuyerPurchaseReturn(id)

Return a purchase under the seller’s policy, or send back a try-at-home item. With reason doesnt_fit, &#x60;fit&#x60; (small | large) says which way, and it feeds your size memory.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse2 = apiInstance.createBuyerPurchaseReturn(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerPurchaseReturn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerPurchaseReturn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse2**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerRegistry"></a>
# **createBuyerRegistry**
> CreateBuyerRegistryResponse createBuyerRegistry()

Start a gift registry (wedding, baby, birthday, housewarming, graduation, other). Items are added like any wishlist item; set shipAddressId to one of your saved addresses so guests can buy — they never see it.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : CreateBuyerRegistryResponse = apiInstance.createBuyerRegistry()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerRegistry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerRegistry")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBuyerRegistryResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerRegistryGiftThanked"></a>
# **createBuyerRegistryGiftThanked**
> CreateBuyerRegistryGiftThankedResponse createBuyerRegistryGiftThanked(id, giftId)

Tick a gift as thanked (or untick it).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
val giftId : kotlin.String = giftId_example // kotlin.String | 
try {
    val result : CreateBuyerRegistryGiftThankedResponse = apiInstance.createBuyerRegistryGiftThanked(id, giftId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerRegistryGiftThanked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerRegistryGiftThanked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **giftId** | **kotlin.String**|  |

### Return type

**CreateBuyerRegistryGiftThankedResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerRentalArrivalPhoto"></a>
# **createBuyerRentalArrivalPhoto**
> CreateBuyerRentalArrivalPhotoResponse createBuyerRentalArrivalPhoto(id)

Photograph a rental on arrival (URLs you uploaded): your side of the condition record.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerRentalArrivalPhotoResponse = apiInstance.createBuyerRentalArrivalPhoto(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerRentalArrivalPhoto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerRentalArrivalPhoto")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerRentalArrivalPhotoResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerRentalCancel"></a>
# **createBuyerRentalCancel**
> BuyerResponse createBuyerRentalCancel(id)

Cancel a rental that has not shipped: everything is refunded.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerRentalCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerRentalCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerRentalCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerRentalClaimResponse"></a>
# **createBuyerRentalClaimResponse**
> BuyerResponse createBuyerRentalClaimResponse(id)

Answer a deposit claim: accept (the claim is paid, the rest refunded) or dispute (Crossly decides).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerRentalClaimResponse(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerRentalClaimResponse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerRentalClaimResponse")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerRentalIdentityStart"></a>
# **createBuyerRentalIdentityStart**
> CreateBuyerRentalIdentityStartResponse createBuyerRentalIdentityStart()

Start the ID check renting needs (Stripe Identity: photo ID + selfie). Open &#x60;url&#x60; (hosted) or use &#x60;clientSecret&#x60; with Stripe.js.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : CreateBuyerRentalIdentityStartResponse = apiInstance.createBuyerRentalIdentityStart()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerRentalIdentityStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerRentalIdentityStart")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBuyerRentalIdentityStartResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerReturnCancel"></a>
# **createBuyerReturnCancel**
> BuyerResponse createBuyerReturnCancel(id)

Cancel a return before it ships.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerReturnCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerReturnCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerReturnCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerReturnTracking"></a>
# **createBuyerReturnTracking**
> BuyerResponse createBuyerReturnTracking(id)

Add tracking to a return you shipped on your own label.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerReturnTracking(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerReturnTracking")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerReturnTracking")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerSellerClubJoin"></a>
# **createBuyerSellerClubJoin**
> CreateBuyerSellerClubJoinResponse createBuyerSellerClubJoin(sellerUserId)

Join a seller’s loyalty club (free). Your tier’s discount then applies to their items — the best of it and any other rate you have with them, never stacked.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val sellerUserId : kotlin.String = sellerUserId_example // kotlin.String | 
try {
    val result : CreateBuyerSellerClubJoinResponse = apiInstance.createBuyerSellerClubJoin(sellerUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerSellerClubJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerSellerClubJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerUserId** | **kotlin.String**|  |

### Return type

**CreateBuyerSellerClubJoinResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerSellerReport"></a>
# **createBuyerSellerReport**
> CreateBuyerSellerReportResponse createBuyerSellerReport(username, createBuyerSellerReportRequest)

Report a seller to Crossly’s trust team.

A second report while your first is still under review updates that report instead of filing another. &#x60;purchaseId&#x60; is attached only if it is your order from this seller.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val username : kotlin.String = username_example // kotlin.String | The seller’s shop handle.
val createBuyerSellerReportRequest : CreateBuyerSellerReportRequest =  // CreateBuyerSellerReportRequest | 
try {
    val result : CreateBuyerSellerReportResponse = apiInstance.createBuyerSellerReport(username, createBuyerSellerReportRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerSellerReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerSellerReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The seller’s shop handle. |
 **createBuyerSellerReportRequest** | **CreateBuyerSellerReportRequest**|  |

### Return type

**CreateBuyerSellerReportResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerSplitCancel"></a>
# **createBuyerSplitCancel**
> BuyerResponse createBuyerSplitCancel(id)

Cancel a split you organised; every held share is released.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerSplitCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerSplitCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerSplitCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerTogether"></a>
# **createBuyerTogether**
> CreateBuyerTogetherResponse createBuyerTogether()

Start a shop-together room.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : CreateBuyerTogetherResponse = apiInstance.createBuyerTogether()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerTogether")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerTogether")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBuyerTogetherResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerTogetherItem"></a>
# **createBuyerTogetherItem**
> BuyerResponse createBuyerTogetherItem(code)

Add a listing to a shop-together board.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerTogetherItem(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerTogetherItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerTogetherItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerTogetherItemVote"></a>
# **createBuyerTogetherItemVote**
> BuyerResponse createBuyerTogetherItemVote(code, id)

Vote an item on a room’s board up (1), down (-1) or clear (0).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val code : kotlin.String = code_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerTogetherItemVote(code, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerTogetherItemVote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerTogetherItemVote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerTogetherJoin"></a>
# **createBuyerTogetherJoin**
> CreateBuyerTogetherResponse createBuyerTogetherJoin(code)

Join a shop-together room by its code.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : CreateBuyerTogetherResponse = apiInstance.createBuyerTogetherJoin(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerTogetherJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerTogetherJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

**CreateBuyerTogetherResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerTogetherLeave"></a>
# **createBuyerTogetherLeave**
> BuyerResponse createBuyerTogetherLeave(code)

Leave a shop-together room.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerTogetherLeave(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerTogetherLeave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerTogetherLeave")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerTogetherMessage"></a>
# **createBuyerTogetherMessage**
> BuyerResponse createBuyerTogetherMessage(code)

Say something in a shop-together room.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerTogetherMessage(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerTogetherMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerTogetherMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerTotalRequest"></a>
# **createBuyerTotalRequest**
> CreateBuyerTotalRequestResponse createBuyerTotalRequest(createBuyerTotalRequestRequest)

Ask a seller for one combined shipping total on everything of theirs in your cart.

Needs two or more of the seller’s items in your cart. Spends nothing; the quote applies at checkout on Crossly.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val createBuyerTotalRequestRequest : CreateBuyerTotalRequestRequest =  // CreateBuyerTotalRequestRequest | 
try {
    val result : CreateBuyerTotalRequestResponse = apiInstance.createBuyerTotalRequest(createBuyerTotalRequestRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerTotalRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerTotalRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBuyerTotalRequestRequest** | **CreateBuyerTotalRequestRequest**|  |

### Return type

**CreateBuyerTotalRequestResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerVaultList"></a>
# **createBuyerVaultList**
> CreateBuyerVaultListResponse createBuyerVaultList(id)

Sell a vault item on the market at your price. It is already authenticated, so when it sells nothing ships in: the buyer keeps it vaulted or it ships straight to them.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerVaultListResponse = apiInstance.createBuyerVaultList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerVaultList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerVaultList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerVaultListResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerVaultUnlist"></a>
# **createBuyerVaultUnlist**
> BuyerResponse createBuyerVaultUnlist(id)

Take a vault item off the market; it stays stored.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.createBuyerVaultUnlist(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerVaultUnlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerVaultUnlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerVaultWithdraw"></a>
# **createBuyerVaultWithdraw**
> CreateBuyerVaultWithdrawResponse createBuyerVaultWithdraw(id)

Ship a vault item home, standard or expedited. The shipping, any storage it owes and the early-withdrawal fee (within 90 days of arriving) are charged to your saved card now, all checked against this key’s spending controls; send an Idempotency-Key.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerVaultWithdrawResponse = apiInstance.createBuyerVaultWithdraw(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerVaultWithdraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerVaultWithdraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerVaultWithdrawResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerWishlist"></a>
# **createBuyerWishlist**
> CreateBuyerWishlistResponse createBuyerWishlist(createBuyerWishlistRequest)

Create a wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val createBuyerWishlistRequest : CreateBuyerWishlistRequest =  // CreateBuyerWishlistRequest | 
try {
    val result : CreateBuyerWishlistResponse = apiInstance.createBuyerWishlist(createBuyerWishlistRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerWishlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerWishlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBuyerWishlistRequest** | **CreateBuyerWishlistRequest**|  |

### Return type

**CreateBuyerWishlistResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerWishlistInvite"></a>
# **createBuyerWishlistInvite**
> CreateBuyerWishlistInviteResponse createBuyerWishlistInvite(id)

Share a wishlist with a co-editor: a single-use link (14 days). Members add and remove items; only the owner renames, deletes or removes members. At most 20.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBuyerWishlistInviteResponse = apiInstance.createBuyerWishlistInvite(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerWishlistInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerWishlistInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBuyerWishlistInviteResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerWishlistItem"></a>
# **createBuyerWishlistItem**
> BuyerResponse2 createBuyerWishlistItem(id, createBuyerWishlistItemRequest)

Add a listing to a wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createBuyerWishlistItemRequest : CreateBuyerWishlistItemRequest =  // CreateBuyerWishlistItemRequest | 
try {
    val result : BuyerResponse2 = apiInstance.createBuyerWishlistItem(id, createBuyerWishlistItemRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerWishlistItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerWishlistItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **createBuyerWishlistItemRequest** | **CreateBuyerWishlistItemRequest**|  |

### Return type

**BuyerResponse2**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerWishlistJoin"></a>
# **createBuyerWishlistJoin**
> CreateBuyerWishlistJoinResponse createBuyerWishlistJoin(token)

Join a wishlist you were invited to edit.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : CreateBuyerWishlistJoinResponse = apiInstance.createBuyerWishlistJoin(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerWishlistJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerWishlistJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

**CreateBuyerWishlistJoinResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerWishlistShare"></a>
# **createBuyerWishlistShare**
> CreateBuyerWishlistShareResponse createBuyerWishlistShare(id, createBuyerWishlistShareRequest)

Share a wishlist — makes it public and returns its link.

&#x60;resetLink: true&#x60; issues a new link and kills the old one, for a link that went further than intended. To stop sharing, PATCH the list with isPublic: false.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
val createBuyerWishlistShareRequest : CreateBuyerWishlistShareRequest =  // CreateBuyerWishlistShareRequest | 
try {
    val result : CreateBuyerWishlistShareResponse = apiInstance.createBuyerWishlistShare(id, createBuyerWishlistShareRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createBuyerWishlistShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createBuyerWishlistShare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |
 **createBuyerWishlistShareRequest** | **CreateBuyerWishlistShareRequest**|  |

### Return type

**CreateBuyerWishlistShareResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBuyerBoard"></a>
# **deleteBuyerBoard**
> BuyerResponse deleteBuyerBoard(id)

Delete a board.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerBoard(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerBoard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerBoard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerBoardItem"></a>
# **deleteBuyerBoardItem**
> BuyerResponse deleteBuyerBoardItem(id, platformListingId)

Take a listing off a board.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
val platformListingId : kotlin.String = platformListingId_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerBoardItem(id, platformListingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerBoardItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerBoardItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **platformListingId** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerBreakSpotHold"></a>
# **deleteBuyerBreakSpotHold**
> BuyerResponse deleteBuyerBreakSpotHold(id, spotId)

Release a break spot you hold.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
val spotId : kotlin.String = spotId_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerBreakSpotHold(id, spotId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerBreakSpotHold")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerBreakSpotHold")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **spotId** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerCartItem"></a>
# **deleteBuyerCartItem**
> deleteBuyerCartItem(id)

Remove a line from your cart.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteBuyerCartItem(id)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerCartItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerCartItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

null (empty response body)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerCartSaved"></a>
# **deleteBuyerCartSaved**
> BuyerCartResponse deleteBuyerCartSaved(id)

Remove an item from saved-for-later. Returns the remaining list.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : BuyerCartResponse = apiInstance.deleteBuyerCartSaved(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerCartSaved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerCartSaved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**BuyerCartResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerConversationGuest"></a>
# **deleteBuyerConversationGuest**
> BuyerResponse deleteBuyerConversationGuest(id, userId)

Remove a guest (the thread’s buyer), or leave (a guest, with your own user id).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerConversationGuest(id, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerConversationGuest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerConversationGuest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **userId** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerFitRef"></a>
# **deleteBuyerFitRef**
> BuyerResponse deleteBuyerFitRef(id)

Delete a reference garment.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerFitRef(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerFitRef")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerFitRef")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerMarketBid"></a>
# **deleteBuyerMarketBid**
> BuyerResponse deleteBuyerMarketBid(id)

Cancel a resting market bid.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerMarketBid(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerMarketBid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerMarketBid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerMarketWatch"></a>
# **deleteBuyerMarketWatch**
> BuyerResponse deleteBuyerMarketWatch(id)

Stop watching a market variant.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerMarketWatch(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerMarketWatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerMarketWatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerOffer"></a>
# **deleteBuyerOffer**
> BuyerResponse deleteBuyerOffer(id)

Withdraw an offer you made that the seller has not answered.

Only a pending offer can be withdrawn — an accepted price the seller agreed to cannot be taken back here.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The offer id.
try {
    val result : BuyerResponse = apiInstance.deleteBuyerOffer(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerOffer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The offer id. |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerRecentlyViewed"></a>
# **deleteBuyerRecentlyViewed**
> BuyerResponse deleteBuyerRecentlyViewed(slug)

Remove one listing from your recently viewed.

Viewing it again brings it back. Sellers’ view counts are unaffected.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | The listing slug.
try {
    val result : BuyerResponse = apiInstance.deleteBuyerRecentlyViewed(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerRecentlyViewed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerRecentlyViewed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**| The listing slug. |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerRecentlyViewed2"></a>
# **deleteBuyerRecentlyViewed2**
> BuyerResponse deleteBuyerRecentlyViewed2()

Clear your recently viewed list.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse = apiInstance.deleteBuyerRecentlyViewed2()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerRecentlyViewed2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerRecentlyViewed2")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerRegistry"></a>
# **deleteBuyerRegistry**
> BuyerResponse deleteBuyerRegistry(id)

Delete a registry (and the wishlist behind it).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerRegistry(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerRegistry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerRegistry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerSellerClubJoin"></a>
# **deleteBuyerSellerClubJoin**
> BuyerResponse deleteBuyerSellerClubJoin(sellerUserId)

Leave a seller’s loyalty club.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val sellerUserId : kotlin.String = sellerUserId_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerSellerClubJoin(sellerUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerSellerClubJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerSellerClubJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerUserId** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerTogetherItem"></a>
# **deleteBuyerTogetherItem**
> BuyerResponse deleteBuyerTogetherItem(code, id)

Take an item you added off a room’s board.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val code : kotlin.String = code_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerTogetherItem(code, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerTogetherItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerTogetherItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerTotalRequest"></a>
# **deleteBuyerTotalRequest**
> BuyerResponse deleteBuyerTotalRequest(id)

Cancel a total request you made.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : BuyerResponse = apiInstance.deleteBuyerTotalRequest(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerTotalRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerTotalRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerTryOn"></a>
# **deleteBuyerTryOn**
> DeleteBuyerTryOnResponse deleteBuyerTryOn(id)

Delete a try-on and its images — or pass &#x60;all&#x60; to delete every photo and result.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteBuyerTryOnResponse = apiInstance.deleteBuyerTryOn(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerTryOn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerTryOn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteBuyerTryOnResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerWishlist"></a>
# **deleteBuyerWishlist**
> BuyerResponse deleteBuyerWishlist(id)

Delete a wishlist and everything on it.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : BuyerResponse = apiInstance.deleteBuyerWishlist(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerWishlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerWishlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerWishlistItem"></a>
# **deleteBuyerWishlistItem**
> DeleteBuyerWishlistItemResponse deleteBuyerWishlistItem(id, slug)

Take a listing off a wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The wishlist id.
val slug : kotlin.String = slug_example // kotlin.String | The listing slug.
try {
    val result : DeleteBuyerWishlistItemResponse = apiInstance.deleteBuyerWishlistItem(id, slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerWishlistItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerWishlistItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The wishlist id. |
 **slug** | **kotlin.String**| The listing slug. |

### Return type

**DeleteBuyerWishlistItemResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerWishlistMember"></a>
# **deleteBuyerWishlistMember**
> BuyerResponse deleteBuyerWishlistMember(id, userId)

Remove a co-editor (the owner), or leave a list shared with you (your own user id).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.deleteBuyerWishlistMember(id, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#deleteBuyerWishlistMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#deleteBuyerWishlistMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **userId** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerAuctionMe"></a>
# **getBuyerAuctionMe**
> GetBuyerAuctionMeResponse getBuyerAuctionMe(slug)

Where you stand in one auction — your max, leading, won, must you pay.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | The auction listing slug.
try {
    val result : GetBuyerAuctionMeResponse = apiInstance.getBuyerAuctionMe(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerAuctionMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerAuctionMe")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**| The auction listing slug. |

### Return type

**GetBuyerAuctionMeResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerBadge"></a>
# **getBuyerBadge**
> GetBuyerBadgeResponse getBuyerBadge()

The counts behind the account badge — unread messages, offers waiting, orders to review.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerBadgeResponse = apiInstance.getBuyerBadge()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerBadge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerBadge")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerBadgeResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerBoard"></a>
# **getBuyerBoard**
> BuyerBoardResponse getBuyerBoard(id)

One of your boards with its layout: each item’s x, y and width as fractions of the board, and stacking order.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerBoardResponse = apiInstance.getBuyerBoard(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerBoard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerBoard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerBoardResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerBoardShared"></a>
# **getBuyerBoardShared**
> BuyerBoardResponse getBuyerBoardShared(token)

A shared outfit board, by its link token.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : BuyerBoardResponse = apiInstance.getBuyerBoardShared(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerBoardShared")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerBoardShared")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

**BuyerBoardResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerBreak"></a>
# **getBuyerBreak**
> GetBuyerBreakResponse getBuyerBreak(id)

A card break’s board: spots, holders, and the seed after the draw.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBuyerBreakResponse = apiInstance.getBuyerBreak(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerBreak")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerBreak")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBuyerBreakResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCase"></a>
# **getBuyerCase**
> GetBuyerCaseResponse getBuyerCase(id)

One case — its state, the message thread, and the return parcel if there is one.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : GetBuyerCaseResponse = apiInstance.getBuyerCase(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerCase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerCase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**GetBuyerCaseResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCatalogListingMySize"></a>
# **getBuyerCatalogListingMySize**
> GetBuyerCatalogListingMySizeResponse getBuyerCatalogListingMySize(slug)

This item against your size: the size you keep in this kind of item (and in this brand), whether this one is your size, smaller or larger, a warning if this brand and size ran small or large on you before, and how other buyers say the brand runs. null for an unsized item.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerCatalogListingMySizeResponse = apiInstance.getBuyerCatalogListingMySize(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerCatalogListingMySize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerCatalogListingMySize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerCatalogListingMySizeResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCatalogListingPrice"></a>
# **getBuyerCatalogListingPrice**
> GetBuyerCatalogListingPriceResponse getBuyerCatalogListingPrice(slug)

The price today. When the seller has the same item live on another marketplace for less, this IS that price (&#x60;priceMatch&#x60; says where from), and &#x60;lowestAnywhere&#x60; lists the marketplaces it is guaranteed not to be cheaper on. &#x60;priceCheck&#x60; rates it against real sales of the same catalog item in the same condition over the last 180 days (great / good / fair / high, with the median and middle-half range in cents); null until there are 3+ sales from 2+ sellers.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerCatalogListingPriceResponse = apiInstance.getBuyerCatalogListingPrice(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerCatalogListingPrice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerCatalogListingPrice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerCatalogListingPriceResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCatalogListingRental"></a>
# **getBuyerCatalogListingRental**
> GetBuyerCatalogListingRentalResponse getBuyerCatalogListingRental(slug)

Whether a listing is for rent: day and week rates, the refundable deposit, length limits, the turnaround buffer, and the dates already booked. null when it is not for rent.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerCatalogListingRentalResponse = apiInstance.getBuyerCatalogListingRental(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerCatalogListingRental")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerCatalogListingRental")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerCatalogListingRentalResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCheckoutUsdc"></a>
# **getBuyerCheckoutUsdc**
> GetBuyerCheckoutUsdcResponse getBuyerCheckoutUsdc()

Whether Crossly takes USDC (Stripe stablecoin payments: Solana, Ethereum, Base, Polygon), and its per-order limit. Paying needs the buyer’s wallet, so it happens in the browser checkout, never unattended.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerCheckoutUsdcResponse = apiInstance.getBuyerCheckoutUsdc()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerCheckoutUsdc")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerCheckoutUsdc")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerCheckoutUsdcResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCollectionOffer"></a>
# **getBuyerCollectionOffer**
> GetBuyerCollectionOfferResponse getBuyerCollectionOffer(id)

What an item in your collection would fetch now: the top open bid on the market for the same variant, condition and grade, and Crossly’s instant offer in store credit when that is switched on (a quote valid for a limited time).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBuyerCollectionOfferResponse = apiInstance.getBuyerCollectionOffer(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerCollectionOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerCollectionOffer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBuyerCollectionOfferResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCollectionSet"></a>
# **getBuyerCollectionSet**
> GetBuyerCollectionSetResponse getBuyerCollectionSet(category, brand, model)

One set: every piece (owned or missing, with its lowest ask on the market), what completing it would cost now, and the leaderboard of collectors who opted in, with your rank.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val category : kotlin.String = category_example // kotlin.String | 
val brand : kotlin.String = brand_example // kotlin.String | 
val model : kotlin.String = model_example // kotlin.String | 
try {
    val result : GetBuyerCollectionSetResponse = apiInstance.getBuyerCollectionSet(category, brand, model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerCollectionSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerCollectionSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **kotlin.String**|  |
 **brand** | **kotlin.String**|  |
 **model** | **kotlin.String**|  |

### Return type

**GetBuyerCollectionSetResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCreator"></a>
# **getBuyerCreator**
> GetBuyerCreatorResponse getBuyerCreator(handle)

A creator storefront: profile, affiliate code, and shelves of live picks.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : GetBuyerCreatorResponse = apiInstance.getBuyerCreator(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerCreator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerCreator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**GetBuyerCreatorResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerFitVocabulary"></a>
# **getBuyerFitVocabulary**
> GetBuyerFitVocabularyResponse getBuyerFitVocabulary()

Garment kinds and the measurements each takes.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerFitVocabularyResponse = apiInstance.getBuyerFitVocabulary()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerFitVocabulary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerFitVocabulary")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerFitVocabularyResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerGiftFinderOption"></a>
# **getBuyerGiftFinderOption**
> GetBuyerGiftFinderOptionResponse getBuyerGiftFinderOption()

The gift finder’s questions: recipients, interests, budgets.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerGiftFinderOptionResponse = apiInstance.getBuyerGiftFinderOption()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerGiftFinderOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerGiftFinderOption")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerGiftFinderOptionResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerImpact"></a>
# **getBuyerImpact**
> GetBuyerImpactResponse getBuyerImpact()

The sourced footprint your secondhand purchases avoided.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerImpactResponse = apiInstance.getBuyerImpact()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerImpact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerImpact")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerImpactResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerLayaway"></a>
# **getBuyerLayaway**
> BuyerLayawayResponse getBuyerLayaway(id)

One layaway and its schedule.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerLayawayResponse = apiInstance.getBuyerLayaway(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerLayaway")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerLayaway")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerLayawayResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingAudioSummary"></a>
# **getBuyerListingAudioSummary**
> GetBuyerListingAudioSummaryResponse getBuyerListingAudioSummary(slug)

A spoken summary of a listing (accessibility): the text, built only from the listing’s own fields and the seller’s description, and the recording of it when one exists.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingAudioSummaryResponse = apiInstance.getBuyerListingAudioSummary(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerListingAudioSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerListingAudioSummary")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingAudioSummaryResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingBoughtTogether"></a>
# **getBuyerListingBoughtTogether**
> GetBuyerListingBoughtTogetherResponse getBuyerListingBoughtTogether(slug)

Frequently bought together / complete the look.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingBoughtTogetherResponse = apiInstance.getBuyerListingBoughtTogether(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerListingBoughtTogether")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerListingBoughtTogether")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingBoughtTogetherResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingBreak"></a>
# **getBuyerListingBreak**
> GetBuyerListingBreakResponse getBuyerListingBreak(slug)

The card break this listing sells spots in, if any; the seed is revealed after the draw.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingBreakResponse = apiInstance.getBuyerListingBreak(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerListingBreak")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerListingBreak")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingBreakResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingCert"></a>
# **getBuyerListingCert**
> GetBuyerListingCertResponse getBuyerListingCert(slug)

A graded listing’s cert, checked with the grader: the seller’s claim (grader, grade, cert number), status (verified, mismatch, not_found, or unchecked where the grader has no lookup), population and how many graded higher where the grader publishes them, and the grader’s own cert page.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingCertResponse = apiInstance.getBuyerListingCert(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerListingCert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerListingCert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingCertResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingFit"></a>
# **getBuyerListingFit**
> GetBuyerListingFitResponse getBuyerListingFit(slug)

A listing’s flat measurements, compared with your saved reference garments.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingFitResponse = apiInstance.getBuyerListingFit(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerListingFit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerListingFit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingFitResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingGroupBuy"></a>
# **getBuyerListingGroupBuy**
> GetBuyerListingGroupBuyResponse getBuyerListingGroupBuy(slug)

The group buy open on this listing, if any.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingGroupBuyResponse = apiInstance.getBuyerListingGroupBuy(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerListingGroupBuy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerListingGroupBuy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingGroupBuyResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingImpact"></a>
# **getBuyerListingImpact**
> GetBuyerListingImpactResponse getBuyerListingImpact(slug)

The sourced footprint of making a new equivalent; null when no published figure applies.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingImpactResponse = apiInstance.getBuyerListingImpact(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerListingImpact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerListingImpact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingImpactResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingResaleValue"></a>
# **getBuyerListingResaleValue**
> GetBuyerListingResaleValueResponse getBuyerListingResaleValue(slug)

What the same brand and category resold for on Crossly, and the buyback offer when enabled.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingResaleValueResponse = apiInstance.getBuyerListingResaleValue(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerListingResaleValue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerListingResaleValue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingResaleValueResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingSubscribeOffer"></a>
# **getBuyerListingSubscribeOffer**
> GetBuyerListingSubscribeOfferResponse getBuyerListingSubscribeOffer(slug)

The subscribe &amp; save discount and intervals on a listing; null when the seller has none.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingSubscribeOfferResponse = apiInstance.getBuyerListingSubscribeOffer(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerListingSubscribeOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerListingSubscribeOffer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingSubscribeOfferResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerListingTryOn"></a>
# **getBuyerListingTryOn**
> GetBuyerListingTryOnResponse getBuyerListingTryOn(slug)

Whether an AI try-on is offered for this listing (a wearable with a photo) and whether the image model is configured.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerListingTryOnResponse = apiInstance.getBuyerListingTryOn(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerListingTryOn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerListingTryOn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerListingTryOnResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerLiveStreamAuction"></a>
# **getBuyerLiveStreamAuction**
> GetBuyerLiveStreamAuctionResponse getBuyerLiveStreamAuction(id)

The auction running on a live stream right now, if any. Bid on it by its &#x60;slug&#x60; at POST /v1/buyer/auctions/:slug/bids.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBuyerLiveStreamAuctionResponse = apiInstance.getBuyerLiveStreamAuction(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerLiveStreamAuction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerLiveStreamAuction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBuyerLiveStreamAuctionResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerMarketPurchaseOption"></a>
# **getBuyerMarketPurchaseOption**
> GetBuyerMarketPurchaseOptionResponse getBuyerMarketPurchaseOption()

Before you bid or buy: whether the lowest ask is vault stock (keep it vaulted, or pay fastShipCents to rush it), and the grading runs a raw card can go straight to (pass gradeWith on the bid).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerMarketPurchaseOptionResponse = apiInstance.getBuyerMarketPurchaseOption()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerMarketPurchaseOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerMarketPurchaseOption")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerMarketPurchaseOptionResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerOrderEligibility"></a>
# **getBuyerOrderEligibility**
> GetBuyerOrderEligibilityResponse getBuyerOrderEligibility(id)

What you can do with one order right now — cancel, confirm receipt, report not received, leave feedback.

&#x60;inr.eligible&#x60; says whether an item-not-received case can be opened; when it cannot, &#x60;inr.reason&#x60; says why and &#x60;inr.opensAt&#x60; when it will. The same rules the order page and the action routes enforce.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
try {
    val result : GetBuyerOrderEligibilityResponse = apiInstance.getBuyerOrderEligibility(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerOrderEligibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerOrderEligibility")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |

### Return type

**GetBuyerOrderEligibilityResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerOrderExport"></a>
# **getBuyerOrderExport**
> GetBuyerOrderExportResponse getBuyerOrderExport(from, to)

Your order history as CSV text (up to 5,000 orders).

The same CSV the shop downloads, returned as a string in &#x60;data.csv&#x60; so a program or agent can read it without a file download. Money columns are dollars, as a spreadsheet expects.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val from : kotlin.String = from_example // kotlin.String | First day to include, YYYY-MM-DD.
val to : kotlin.String = to_example // kotlin.String | Last day to include, YYYY-MM-DD (inclusive).
try {
    val result : GetBuyerOrderExportResponse = apiInstance.getBuyerOrderExport(from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerOrderExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerOrderExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.String**| First day to include, YYYY-MM-DD. | [optional]
 **to** | **kotlin.String**| Last day to include, YYYY-MM-DD (inclusive). | [optional]

### Return type

**GetBuyerOrderExportResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerOrderPriceProtection"></a>
# **getBuyerOrderPriceProtection**
> GetBuyerOrderPriceProtectionResponse getBuyerOrderPriceProtection(id)

Price protection on one order: if the item gets cheaper before &#x60;until&#x60;, the difference is credited to your Bucks automatically. &#x60;creditedCents&#x60; is what it has paid so far.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBuyerOrderPriceProtectionResponse = apiInstance.getBuyerOrderPriceProtection(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerOrderPriceProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerOrderPriceProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBuyerOrderPriceProtectionResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerPack"></a>
# **getBuyerPack**
> GetBuyerPackResponse getBuyerPack(slug)

One pack: tiers and odds, items left, expected value, the chase items still in it.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerPackResponse = apiInstance.getBuyerPack(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerPack")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerPack")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerPackResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerPackFairness"></a>
# **getBuyerPackFairness**
> GetBuyerPackFairnessResponse getBuyerPackFairness()

Your provably-fair seeds: the active server-seed commitment (sha256), your client seed and nonce, and every retired seed in full so past openings can be re-run.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerPackFairnessResponse = apiInstance.getBuyerPackFairness()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerPackFairness")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerPackFairness")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerPackFairnessResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerParty"></a>
# **getBuyerParty**
> GetBuyerPartyResponse getBuyerParty(slug)

One shopping party.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerPartyResponse = apiInstance.getBuyerParty(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerParty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerParty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerPartyResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerPassport"></a>
# **getBuyerPassport**
> GetBuyerPassportResponse getBuyerPassport(code)

What a product passport tag opens: the item, whether it was authenticated, how many owners on Crossly and since when — never who or for how much.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : GetBuyerPassportResponse = apiInstance.getBuyerPassport(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerPassport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerPassport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

**GetBuyerPassportResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerPreference"></a>
# **getBuyerPreference**
> GetBuyerPreferenceResponse getBuyerPreference()

The shopping profile derived from that activity.

Derived, never declared — there is no preferences form anywhere. &#x60;matchRate&#x60; is the share of this person&#39;s searches Crossly could answer; a low number is an inventory problem, not a personalisation one, which is why it is here.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerPreferenceResponse = apiInstance.getBuyerPreference()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerPreference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerPreference")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerPreferenceResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerPriceGuide"></a>
# **getBuyerPriceGuide**
> GetBuyerPriceGuideResponse getBuyerPriceGuide()

What matching items actually sold for on Crossly: median, quartiles, by month, and recent sales. Needs q, brand or category.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerPriceGuideResponse = apiInstance.getBuyerPriceGuide()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerPriceGuide")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerPriceGuide")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerPriceGuideResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerProfile"></a>
# **getBuyerProfile**
> GetBuyerProfileResponse getBuyerProfile()

Your Crossly shopping profile — name, email, saved address, Bucks balance.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerProfileResponse = apiInstance.getBuyerProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerProfileResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerPurchaseDelivery"></a>
# **getBuyerPurchaseDelivery**
> GetBuyerPurchaseDeliveryResponse getBuyerPurchaseDelivery(id)

Where a purchase is going when not to your door: the pickup point (with its release code) or its ship-together consolidation.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBuyerPurchaseDeliveryResponse = apiInstance.getBuyerPurchaseDelivery(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerPurchaseDelivery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerPurchaseDelivery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBuyerPurchaseDeliveryResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerPurchaseLiveMoment"></a>
# **getBuyerPurchaseLiveMoment**
> GetBuyerPurchaseLiveMomentResponse getBuyerPurchaseLiveMoment(id)

The live show a purchase was bought in, with the offset (seconds) into its replay where it sold. null when it was not bought in a show.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBuyerPurchaseLiveMomentResponse = apiInstance.getBuyerPurchaseLiveMoment(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerPurchaseLiveMoment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerPurchaseLiveMoment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBuyerPurchaseLiveMomentResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerPurchaseReturn"></a>
# **getBuyerPurchaseReturn**
> GetBuyerPurchaseReturnResponse getBuyerPurchaseReturn(id)

What a return would refund for each reason, by when, and any return already open.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBuyerPurchaseReturnResponse = apiInstance.getBuyerPurchaseReturn(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerPurchaseReturn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerPurchaseReturn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBuyerPurchaseReturnResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerPurchaseStory"></a>
# **getBuyerPurchaseStory**
> GetBuyerPurchaseStoryResponse getBuyerPurchaseStory(id)

Your owner story on a purchase, passed on to the next owner if you resell it.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBuyerPurchaseStoryResponse = apiInstance.getBuyerPurchaseStory(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerPurchaseStory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerPurchaseStory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBuyerPurchaseStoryResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerRegistry"></a>
# **getBuyerRegistry**
> BuyerRegistryResponse getBuyerRegistry(id)

One of your registries: items with how many are wanted and bought.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerRegistryResponse = apiInstance.getBuyerRegistry(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerRegistry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerRegistry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerRegistryResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerRegistryByToken"></a>
# **getBuyerRegistryByToken**
> BuyerRegistryResponse getBuyerRegistryByToken(token)

A registry as a guest sees it: items, how many are still wanted, and whether it can ship. Never the address.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : BuyerRegistryResponse = apiInstance.getBuyerRegistryByToken(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerRegistryByToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerRegistryByToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

**BuyerRegistryResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerRentalEligibility"></a>
# **getBuyerRentalEligibility**
> GetBuyerRentalEligibilityResponse getBuyerRentalEligibility()

Can you rent right now: ID-verified (a photo ID and a matching selfie, once), the verified name rentals ship to, and your standing (one rental at a time until your first comes back; none after one that never did).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerRentalEligibilityResponse = apiInstance.getBuyerRentalEligibility()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerRentalEligibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerRentalEligibility")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerRentalEligibilityResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerSellerClub"></a>
# **getBuyerSellerClub**
> GetBuyerSellerClubResponse getBuyerSellerClub(sellerUserId)

A seller’s loyalty club: its tiers (spend threshold, discount, perks) and your standing. null when the seller has none.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val sellerUserId : kotlin.String = sellerUserId_example // kotlin.String | 
try {
    val result : GetBuyerSellerClubResponse = apiInstance.getBuyerSellerClub(sellerUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerSellerClub")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerSellerClub")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerUserId** | **kotlin.String**|  |

### Return type

**GetBuyerSellerClubResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerSellerTrust"></a>
# **getBuyerSellerTrust**
> GetBuyerSellerTrustResponse getBuyerSellerTrust(username)

Seller at a glance: member since, completed sales, independent rating, typical handling time, dispute rate, trust tier, badges — and the plain sentences the profile shows.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : GetBuyerSellerTrustResponse = apiInstance.getBuyerSellerTrust(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerSellerTrust")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerSellerTrust")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**|  |

### Return type

**GetBuyerSellerTrustResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerTogether"></a>
# **getBuyerTogether**
> GetBuyerTogetherResponse getBuyerTogether(code)

A shop-together room: members, the board with votes, and chat.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : GetBuyerTogetherResponse = apiInstance.getBuyerTogether(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerTogether")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerTogether")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  |

### Return type

**GetBuyerTogetherResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerVaultMarketHistory"></a>
# **getBuyerVaultMarketHistory**
> GetBuyerVaultMarketHistoryResponse getBuyerVaultMarketHistory()

Your Vault Markets value by day at the marks (oldest first, today live) over &#x60;days&#x60; (default 90), and today’s change against yesterday’s close.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerVaultMarketHistoryResponse = apiInstance.getBuyerVaultMarketHistory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerVaultMarketHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerVaultMarketHistory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerVaultMarketHistoryResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerVaultMarketIndex"></a>
# **getBuyerVaultMarketIndex**
> GetBuyerVaultMarketIndexResponse getBuyerVaultMarketIndex(slug)

One index with its published daily closes (oldest first, &#x60;days&#x60; default 365) and its level now.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetBuyerVaultMarketIndexResponse = apiInstance.getBuyerVaultMarketIndex(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerVaultMarketIndex")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerVaultMarketIndex")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetBuyerVaultMarketIndexResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerVaultMarketInstantExit"></a>
# **getBuyerVaultMarketInstantExit**
> GetBuyerVaultMarketInstantExitResponse getBuyerVaultMarketInstantExit(id)

The Instant Exit quote for one vault unit you hold, and whether it can be sold now.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetBuyerVaultMarketInstantExitResponse = apiInstance.getBuyerVaultMarketInstantExit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerVaultMarketInstantExit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerVaultMarketInstantExit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetBuyerVaultMarketInstantExitResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerVaultMarketWorth"></a>
# **getBuyerVaultMarketWorth**
> GetBuyerVaultMarketWorthResponse getBuyerVaultMarketWorth()

What your vault is worth now: value at the market prices (marks come only from trades) split into reliable and indicative marks, cost and P&amp;L, today’s change, and an estimate of what the units free to sell would fetch from the bids resting on the book now. Read only.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : GetBuyerVaultMarketWorthResponse = apiInstance.getBuyerVaultMarketWorth()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#getBuyerVaultMarketWorth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#getBuyerVaultMarketWorth")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBuyerVaultMarketWorthResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerActivity"></a>
# **listBuyerActivity**
> ListBuyerActivityResponse listBuyerActivity()

What this buyer has compared lately.

Newest first, and only as far back as the retention window — the link between a person and a comparison is dropped after 180 days, so this thins out rather than growing forever.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerActivityResponse = apiInstance.listBuyerActivity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerActivity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerActivity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerActivityResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerAuctionBids"></a>
# **listBuyerAuctionBids**
> ListBuyerAuctionBidsResponse listBuyerAuctionBids(slug)

An auction’s bid history, highest first, bidders anonymised.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | The auction listing slug.
try {
    val result : ListBuyerAuctionBidsResponse = apiInstance.listBuyerAuctionBids(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerAuctionBids")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerAuctionBids")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**| The auction listing slug. |

### Return type

**ListBuyerAuctionBidsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerAuctions"></a>
# **listBuyerAuctions**
> ListBuyerAuctionsResponse listBuyerAuctions(tab)

Auctions you have bid in — bidding, won or lost (last 100).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val tab : kotlin.String = tab_example // kotlin.String | bidding = still running; won = you are the winner; lost = ended, someone else won.
try {
    val result : ListBuyerAuctionsResponse = apiInstance.listBuyerAuctions(tab)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerAuctions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerAuctions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tab** | **kotlin.String**| bidding &#x3D; still running; won &#x3D; you are the winner; lost &#x3D; ended, someone else won. | [optional] [default to bidding] [enum: bidding, won, lost]

### Return type

**ListBuyerAuctionsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerBoards"></a>
# **listBuyerBoards**
> ListBuyerBoardsResponse listBuyerBoards()

Your outfit boards: collages of listings, each with a share link.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerBoardsResponse = apiInstance.listBuyerBoards()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerBoards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerBoards")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerBoardsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerBreaks"></a>
# **listBuyerBreaks**
> BuyerResponse3 listBuyerBreaks()

Card-break spots you hold or bought, with what each pulled.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse3 = apiInstance.listBuyerBreaks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerBreaks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerBreaks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerBuybacks"></a>
# **listBuyerBuybacks**
> BuyerResponse3 listBuyerBuybacks()

Your buyback guarantees and requests.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse3 = apiInstance.listBuyerBuybacks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerBuybacks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerBuybacks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCart"></a>
# **listBuyerCart**
> ListBuyerCartResponse listBuyerCart()

What is in your Crossly cart.

Line items with the price captured when each was added. This is NOT a quote — shipping, tax and any discounts are computed at checkout against a delivery address, and the sum of these lines is not what you will be charged.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerCartResponse = apiInstance.listBuyerCart()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerCart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerCart")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerCartResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCartSaved"></a>
# **listBuyerCartSaved**
> BuyerCartResponse listBuyerCartSaved()

Items you saved for later out of your cart (last 200).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerCartResponse = apiInstance.listBuyerCartSaved()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerCartSaved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerCartSaved")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerCartResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCases"></a>
# **listBuyerCases**
> ListBuyerCasesResponse listBuyerCases(status)

Resolution center — every case you opened (returns, not received, problems).

&#x60;yourTurn: true&#x60; means the case is waiting on you. &#x60;meta.counts&#x60; covers every case, not just this status.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val status : kotlin.String = status_example // kotlin.String | open = still being worked; closed = resolved or withdrawn; all = both.
try {
    val result : ListBuyerCasesResponse = apiInstance.listBuyerCases(status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerCases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerCases")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **kotlin.String**| open &#x3D; still being worked; closed &#x3D; resolved or withdrawn; all &#x3D; both. | [optional] [default to open] [enum: open, closed, all]

### Return type

**ListBuyerCasesResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCashback"></a>
# **listBuyerCashback**
> ListBuyerCashbackResponse listBuyerCashback(status, page, limit)

Your Scout cashback — pending, confirmed, paid.

Newest first. &#x60;pending&#x60; means an order was reported and the retailer&#39;s return window has not closed; nothing is paid until it does. &#x60;expired&#x60; means a click was never reported as converting, which is the ordinary outcome for most clicks.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val status : kotlin.String = status_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListBuyerCashbackResponse = apiInstance.listBuyerCashback(status, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerCashback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerCashback")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **kotlin.String**|  | [optional] [enum: pending, confirmed, rejected, paid, expired]
 **page** | **kotlin.Int**|  | [optional] [default to 1]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]

### Return type

**ListBuyerCashbackResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCatalogListingVideos"></a>
# **listBuyerCatalogListingVideos**
> ListBuyerCatalogListingVideosResponse listBuyerCatalogListingVideos(slug)

Videos the seller recorded for this item on request, newest first, with the question each one answers.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListBuyerCatalogListingVideosResponse = apiInstance.listBuyerCatalogListingVideos(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerCatalogListingVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerCatalogListingVideos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListBuyerCatalogListingVideosResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerClubs"></a>
# **listBuyerClubs**
> ListBuyerClubsResponse listBuyerClubs()

Sellers’ loyalty clubs you belong to: your spend with each, your tier and its discount, and the next tier.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerClubsResponse = apiInstance.listBuyerClubs()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerClubs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerClubs")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerClubsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCollectionSets"></a>
# **listBuyerCollectionSets**
> BuyerResponse3 listBuyerCollectionSets()

Sets you are collecting — a catalogue brand + model you own at least two pieces of — with owned / total and percent complete, most complete first; and whether you show on set leaderboards.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse3 = apiInstance.listBuyerCollectionSets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerCollectionSets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerCollectionSets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerConsolidations"></a>
# **listBuyerConsolidations**
> BuyerResponse3 listBuyerConsolidations()

Your ship-together orders: parcels at the hub, and the one box out.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse3 = apiInstance.listBuyerConsolidations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerConsolidations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerConsolidations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerConversationGuests"></a>
# **listBuyerConversationGuests**
> ListBuyerWishlistMembersResponse listBuyerConversationGuests(id)

Guests in a chat.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListBuyerWishlistMembersResponse = apiInstance.listBuyerConversationGuests(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerConversationGuests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerConversationGuests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListBuyerWishlistMembersResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerFeedback"></a>
# **listBuyerFeedback**
> ListBuyerFeedbackResponse listBuyerFeedback()

Feedback you have left sellers, newest first — with the ids you revise by.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerFeedbackResponse = apiInstance.listBuyerFeedback()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerFeedback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerFeedback")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerFeedbackResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerFeedbackPending"></a>
# **listBuyerFeedbackPending**
> ListBuyerFeedbackPendingResponse listBuyerFeedbackPending()

Orders from the last 60 days that are on their way or arrived and still need your feedback.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerFeedbackPendingResponse = apiInstance.listBuyerFeedbackPending()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerFeedbackPending")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerFeedbackPending")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerFeedbackPendingResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerFitRefs"></a>
# **listBuyerFitRefs**
> BuyerResponse3 listBuyerFitRefs()

Your saved reference garments for fit comparison.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse3 = apiInstance.listBuyerFitRefs()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerFitRefs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerFitRefs")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerFollowingSellers"></a>
# **listBuyerFollowingSellers**
> ListBuyerFollowingSellersResponse listBuyerFollowingSellers()

Sellers you follow, with how many new listings each has since you last looked.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerFollowingSellersResponse = apiInstance.listBuyerFollowingSellers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerFollowingSellers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerFollowingSellers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerFollowingSellersResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerGiftCardCredit"></a>
# **listBuyerGiftCardCredit**
> ListBuyerGiftCardCreditResponse listBuyerGiftCardCredit()

Gift card credit on your account, and when it expires.

One row per gift card you redeemed. &#x60;meta.giftCreditCents&#x60; is the unspent, unexpired gift credit in your Crossly Bucks balance; &#x60;meta.nextExpiresAt&#x60; is the soonest date any of it lapses. Spending at checkout uses gift credit first.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerGiftCardCreditResponse = apiInstance.listBuyerGiftCardCredit()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerGiftCardCredit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerGiftCardCredit")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerGiftCardCreditResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerGiftCards"></a>
# **listBuyerGiftCards**
> ListBuyerGiftCardsResponse listBuyerGiftCards()

Gift cards you bought, newest first.

Status, recipient and delivery for each card you paid for. The code is masked unless you sent the card to your own email address. Abandoned (unpaid) checkouts are omitted.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerGiftCardsResponse = apiInstance.listBuyerGiftCards()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerGiftCards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerGiftCards")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerGiftCardsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerGiftFinder"></a>
# **listBuyerGiftFinder**
> ListBuyerGiftFinderResponse listBuyerGiftFinder()

Live listings for a recipient, interest and budget.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerGiftFinderResponse = apiInstance.listBuyerGiftFinder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerGiftFinder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerGiftFinder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerGiftFinderResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerGiftSent"></a>
# **listBuyerGiftSent**
> ListBuyerGiftSentResponse listBuyerGiftSent()

Items you sent as gifts: whether the teaser went out, whether it arrived and was opened, and any thank-you. Send one with &#x60;gift&#x60; on checkout.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerGiftSentResponse = apiInstance.listBuyerGiftSent()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerGiftSent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerGiftSent")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerGiftSentResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerHotspots"></a>
# **listBuyerHotspots**
> ListBuyerHotspotsResponse listBuyerHotspots()

Shop-the-look tags on a story or lookbook photo: each tagged listing and where it sits on the image (x, y as fractions).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerHotspotsResponse = apiInstance.listBuyerHotspots()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerHotspots")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerHotspots")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerHotspotsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerHunts"></a>
# **listBuyerHunts**
> ListBuyerHuntsResponse listBuyerHunts()

Your buyer-agent hunts and what they did.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerHuntsResponse = apiInstance.listBuyerHunts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerHunts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerHunts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerHuntsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerInstantOffers"></a>
# **listBuyerInstantOffers**
> BuyerResponse3 listBuyerInstantOffers()

Your instant offers: live quotes, accepted ones awaiting a label, approved ones (with the prepaid label) and paid ones.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse3 = apiInstance.listBuyerInstantOffers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerInstantOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerInstantOffers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerLayaways"></a>
# **listBuyerLayaways**
> ListBuyerLayawaysResponse listBuyerLayaways()

Your layaways: price, paid so far, what is left, and the installment schedule. Put an item on layaway at checkout with layawayItemIds.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerLayawaysResponse = apiInstance.listBuyerLayaways()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerLayaways")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerLayaways")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerLayawaysResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerListingQuickQuestions"></a>
# **listBuyerListingQuickQuestions**
> ListBuyerListingQuickQuestionsResponse listBuyerListingQuickQuestions(slug)

One-tap questions this listing supports; send one as &#x60;quick&#x60; on a message.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListBuyerListingQuickQuestionsResponse = apiInstance.listBuyerListingQuickQuestions(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerListingQuickQuestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerListingQuickQuestions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListBuyerListingQuickQuestionsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerListingSellerReviews"></a>
# **listBuyerListingSellerReviews**
> ListBuyerListingSellerReviewsResponse listBuyerListingSellerReviews(slug)

The seller’s public reviews: summary, text, photos, replies.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListBuyerListingSellerReviewsResponse = apiInstance.listBuyerListingSellerReviews(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerListingSellerReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerListingSellerReviews")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListBuyerListingSellerReviewsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerLiveShipments"></a>
# **listBuyerLiveShipments**
> ListBuyerLiveShipmentsResponse listBuyerLiveShipments()

Your one-box-per-show shipments: every order won in a show ships together, and postage is charged once (the rest refunded when it ships).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerLiveShipmentsResponse = apiInstance.listBuyerLiveShipments()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerLiveShipments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerLiveShipments")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerLiveShipmentsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerLiveStreamLineup"></a>
# **listBuyerLiveStreamLineup**
> ListBuyerLiveStreamLineupResponse listBuyerLiveStreamLineup(id)

What a live show will sell, in order: each item, its price, and whether it is still available.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListBuyerLiveStreamLineupResponse = apiInstance.listBuyerLiveStreamLineup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerLiveStreamLineup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerLiveStreamLineup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListBuyerLiveStreamLineupResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerMarketBids"></a>
# **listBuyerMarketBids**
> BuyerResponse3 listBuyerMarketBids()

Your resting market bids.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse3 = apiInstance.listBuyerMarketBids()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerMarketBids")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerMarketBids")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerMarketWatches"></a>
# **listBuyerMarketWatches**
> BuyerResponse3 listBuyerMarketWatches()

Market variants you watch, with the price you are waiting for.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse3 = apiInstance.listBuyerMarketWatches()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerMarketWatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerMarketWatches")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerOffers"></a>
# **listBuyerOffers**
> ListBuyerOffersResponse listBuyerOffers(awaitingBuyer)

Offers you have made, newest first (last 100).

&#x60;awaitingBuyer: true&#x60; is a seller counter waiting on you — answer it with POST /v1/buyer/offers/{id}/respond. &#x60;redeemable: true&#x60; is an accepted offer you can pay for on Crossly. Amounts are integer cents.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val awaitingBuyer : kotlin.String = awaitingBuyer_example // kotlin.String | true returns only seller counters waiting on you.
try {
    val result : ListBuyerOffersResponse = apiInstance.listBuyerOffers(awaitingBuyer)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerOffers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **awaitingBuyer** | **kotlin.String**| true returns only seller counters waiting on you. | [optional] [enum: true, false]

### Return type

**ListBuyerOffersResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerOrders"></a>
# **listBuyerOrders**
> ListBuyerOrdersResponse listBuyerOrders(page, limit)

What you have bought on Crossly, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListBuyerOrdersResponse = apiInstance.listBuyerOrders(page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**|  | [optional] [default to 1]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]

### Return type

**ListBuyerOrdersResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerPackOpenings"></a>
# **listBuyerPackOpenings**
> ListBuyerPackOpeningsResponse listBuyerPackOpenings()

Your pulls: what you got, its value, sell-back status, and the fairness proof for each (the server seed once rotated).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerPackOpeningsResponse = apiInstance.listBuyerPackOpenings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerPackOpenings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerPackOpenings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerPackOpeningsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerPacks"></a>
# **listBuyerPacks**
> ListBuyerPacksResponse listBuyerPacks()

Packs you can open: price, every tier with its published odds, what is left in it and its value range, and the expected value of one opening.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerPacksResponse = apiInstance.listBuyerPacks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerPacks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerPacks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerPacksResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerParties"></a>
# **listBuyerParties**
> ListBuyerPartiesResponse listBuyerParties()

Themed shopping parties, live and upcoming.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerPartiesResponse = apiInstance.listBuyerParties()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerParties")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerParties")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerPartiesResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerPartyListings"></a>
# **listBuyerPartyListings**
> BuyerResponse3 listBuyerPartyListings(slug)

Listings shared to a party, featured first.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : BuyerResponse3 = apiInstance.listBuyerPartyListings(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerPartyListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerPartyListings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerPickupPoints"></a>
# **listBuyerPickupPoints**
> BuyerResponse3 listBuyerPickupPoints()

Carrier pickup points (UPS Access Point / FedEx Hold at Location) near an address; pass one as &#x60;pickupPoint&#x60; to POST /v1/buyer/checkout.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse3 = apiInstance.listBuyerPickupPoints()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerPickupPoints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerPickupPoints")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerProtectionPlans"></a>
# **listBuyerProtectionPlans**
> ListBuyerProtectionPlansResponse listBuyerProtectionPlans()

Your protection plans (bought at checkout with &#x60;protection&#x60;): status, term, coverage, contract id, and any refund.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerProtectionPlansResponse = apiInstance.listBuyerProtectionPlans()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerProtectionPlans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerProtectionPlans")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerProtectionPlansResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerRegistries"></a>
# **listBuyerRegistries**
> ListBuyerRegistriesResponse listBuyerRegistries()

Your gift registries.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerRegistriesResponse = apiInstance.listBuyerRegistries()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerRegistries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerRegistries")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerRegistriesResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerRegistryGifts"></a>
# **listBuyerRegistryGifts**
> ListBuyerRegistryGiftsResponse listBuyerRegistryGifts(id)

Your thank-you list: who bought what off the registry, and whether you have thanked them.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListBuyerRegistryGiftsResponse = apiInstance.listBuyerRegistryGifts(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerRegistryGifts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerRegistryGifts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListBuyerRegistryGiftsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerRegistrySearch"></a>
# **listBuyerRegistrySearch**
> ListBuyerRegistrySearchResponse listBuyerRegistrySearch()

Find a registry by its name or the registrant’s name. Current and recent registries only.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerRegistrySearchResponse = apiInstance.listBuyerRegistrySearch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerRegistrySearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerRegistrySearch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerRegistrySearchResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerRentals"></a>
# **listBuyerRentals**
> ListBuyerRentalsResponse listBuyerRentals()

Your rentals: dates, status (reserved, out, returned, claimed, closed, cancelled), the return label, and what happened to the deposit.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerRentalsResponse = apiInstance.listBuyerRentals()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerRentals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerRentals")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerRentalsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerSizeMemoryPrompts"></a>
# **listBuyerSizeMemoryPrompts**
> ListBuyerSizeMemoryPromptsResponse listBuyerSizeMemoryPrompts()

Delivered orders with a size that you haven’t said how they fit (the last 60 days).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerSizeMemoryPromptsResponse = apiInstance.listBuyerSizeMemoryPrompts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerSizeMemoryPrompts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerSizeMemoryPrompts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerSizeMemoryPromptsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerSizeMemorySizes"></a>
# **listBuyerSizeMemorySizes**
> ListBuyerSizeMemorySizesResponse listBuyerSizeMemorySizes()

The sizes learned from what you bought and kept, by kind of item (shoes, tops, bottoms, dresses, outerwear) and department.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerSizeMemorySizesResponse = apiInstance.listBuyerSizeMemorySizes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerSizeMemorySizes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerSizeMemorySizes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerSizeMemorySizesResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerSplits"></a>
# **listBuyerSplits**
> BuyerResponse3 listBuyerSplits()

Purchases you split, with each share’s status.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : BuyerResponse3 = apiInstance.listBuyerSplits()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerSplits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerSplits")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BuyerResponse3**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerSubscriptions"></a>
# **listBuyerSubscriptions**
> ListBuyerSubscriptionsResponse listBuyerSubscriptions()

Your subscribe &amp; save standing orders.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerSubscriptionsResponse = apiInstance.listBuyerSubscriptions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerSubscriptions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerSubscriptionsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerTogether"></a>
# **listBuyerTogether**
> ListBuyerTogetherResponse listBuyerTogether()

Shop-together rooms you are in.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerTogetherResponse = apiInstance.listBuyerTogether()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerTogether")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerTogether")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerTogetherResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerTotalRequests"></a>
# **listBuyerTotalRequests**
> ListBuyerTotalRequestsResponse listBuyerTotalRequests()

Your combined-shipping total requests, newest per seller.

A seller answers a request by quoting one shipping figure for every item of theirs in your cart. &#x60;matchesCart: false&#x60; means the cart changed since, so the quote will not apply at checkout.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerTotalRequestsResponse = apiInstance.listBuyerTotalRequests()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerTotalRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerTotalRequests")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerTotalRequestsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerTryOns"></a>
# **listBuyerTryOns**
> ListBuyerTryOnsResponse listBuyerTryOns()

Your AI try-ons: the rendered images (labelled AI-generated wherever shown).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerTryOnsResponse = apiInstance.listBuyerTryOns()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerTryOns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerTryOns")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerTryOnsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerVault"></a>
# **listBuyerVault**
> ListBuyerVaultResponse listBuyerVault()

What you own in the Crossly vault: stored (authenticated, on a shelf), listed for sale, or on its way home — with the price to ship one home.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerVaultResponse = apiInstance.listBuyerVault()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerVault")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerVault")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerVaultResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerVaultMarketHoldings"></a>
# **listBuyerVaultMarketHoldings**
> ListBuyerVaultMarketHoldingsResponse listBuyerVaultMarketHoldings()

Each unit you hold in the vault at its market price, with the mark’s quality (A or B reliable, C indicative, none), cost, P&amp;L and where it stands (stored, listed, lent, pledged, at the grader); &#x60;meta&#x60; carries the totals and the units you have out on loan.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerVaultMarketHoldingsResponse = apiInstance.listBuyerVaultMarketHoldings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerVaultMarketHoldings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerVaultMarketHoldings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerVaultMarketHoldingsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerVaultMarketIndexes"></a>
# **listBuyerVaultMarketIndexes**
> ListBuyerVaultMarketIndexesResponse listBuyerVaultMarketIndexes()

Crossly indexes over vault book keys (category, brand, curated, composite, segment, and your own), each with its level now and change since the last daily close. Index levels are valued only from the book’s marks.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerVaultMarketIndexesResponse = apiInstance.listBuyerVaultMarketIndexes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerVaultMarketIndexes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerVaultMarketIndexes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerVaultMarketIndexesResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerVaultMarketInstantExit"></a>
# **listBuyerVaultMarketInstantExit**
> ListBuyerVaultMarketInstantExitResponse listBuyerVaultMarketInstantExit()

Instant Exit quotes for what you hold, one per book key: the best resting bid (yours left out), its share of the mark, the bid levels, units held and which are free to sell, and why a key cannot be sold instantly. A quote, not an order.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerVaultMarketInstantExitResponse = apiInstance.listBuyerVaultMarketInstantExit()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerVaultMarketInstantExit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerVaultMarketInstantExit")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerVaultMarketInstantExitResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerVaultMarketWatchlist"></a>
# **listBuyerVaultMarketWatchlist**
> ListBuyerVaultMarketWatchlistResponse listBuyerVaultMarketWatchlist()

The book keys you watch, with mark and its quality, 24 h and 7 d change, and the last 30 daily marks.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerVaultMarketWatchlistResponse = apiInstance.listBuyerVaultMarketWatchlist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerVaultMarketWatchlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerVaultMarketWatchlist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerVaultMarketWatchlistResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerVideoRequests"></a>
# **listBuyerVideoRequests**
> ListBuyerVideoRequestsResponse listBuyerVideoRequests()

Your video requests and their answers.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerVideoRequestsResponse = apiInstance.listBuyerVideoRequests()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerVideoRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerVideoRequests")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerVideoRequestsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerWishlistItems"></a>
# **listBuyerWishlistItems**
> ListBuyerWishlistItemsResponse listBuyerWishlistItems(id)

What is on one wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListBuyerWishlistItemsResponse = apiInstance.listBuyerWishlistItems(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerWishlistItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerWishlistItems")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListBuyerWishlistItemsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerWishlistMembers"></a>
# **listBuyerWishlistMembers**
> ListBuyerWishlistMembersResponse listBuyerWishlistMembers(id)

Co-editors of a shared wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListBuyerWishlistMembersResponse = apiInstance.listBuyerWishlistMembers(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerWishlistMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerWishlistMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListBuyerWishlistMembersResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerWishlists"></a>
# **listBuyerWishlists**
> ListBuyerWishlistsResponse listBuyerWishlists()

Your wishlists.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : ListBuyerWishlistsResponse = apiInstance.listBuyerWishlists()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#listBuyerWishlists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#listBuyerWishlists")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBuyerWishlistsResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerBoard"></a>
# **updateBuyerBoard**
> BuyerResponse updateBuyerBoard(id)

Rename a board, change its description, or make it public / private.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.updateBuyerBoard(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#updateBuyerBoard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#updateBuyerBoard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerBoardLayout"></a>
# **updateBuyerBoardLayout**
> BuyerBoardResponse updateBuyerBoardLayout(id)

Replace a board’s layout: items by platform listing id or slug, with x, y, w (0–1) and z. At most 40.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerBoardResponse = apiInstance.updateBuyerBoardLayout(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#updateBuyerBoardLayout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#updateBuyerBoardLayout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerBoardResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerCollectionSetLeaderboard"></a>
# **updateBuyerCollectionSetLeaderboard**
> UpdateBuyerCollectionSetLeaderboardResponse updateBuyerCollectionSetLeaderboard()

Show or hide yourself (by your public handle) on set leaderboards.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : UpdateBuyerCollectionSetLeaderboardResponse = apiInstance.updateBuyerCollectionSetLeaderboard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#updateBuyerCollectionSetLeaderboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#updateBuyerCollectionSetLeaderboard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateBuyerCollectionSetLeaderboardResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerFeedback"></a>
# **updateBuyerFeedback**
> BuyerResponse updateBuyerFeedback(id, updateBuyerFeedbackRequest)

Revise feedback you left, within 60 days.

Replaces the stars and comment; detailed ratings you omit stay as they were.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
val updateBuyerFeedbackRequest : UpdateBuyerFeedbackRequest =  // UpdateBuyerFeedbackRequest | 
try {
    val result : BuyerResponse = apiInstance.updateBuyerFeedback(id, updateBuyerFeedbackRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#updateBuyerFeedback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#updateBuyerFeedback")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |
 **updateBuyerFeedbackRequest** | **UpdateBuyerFeedbackRequest**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBuyerHunt"></a>
# **updateBuyerHunt**
> BuyerResponse updateBuyerHunt(id)

Pause, resume or stop a hunt.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.updateBuyerHunt(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#updateBuyerHunt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#updateBuyerHunt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerPurchaseStory"></a>
# **updateBuyerPurchaseStory**
> BuyerResponse updateBuyerPurchaseStory(id)

Write your owner story (280 characters); it travels with the item if you resell it.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.updateBuyerPurchaseStory(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#updateBuyerPurchaseStory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#updateBuyerPurchaseStory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerRegistry"></a>
# **updateBuyerRegistry**
> BuyerRegistryResponse updateBuyerRegistry(id)

Edit a registry: title, kind, date, message, ship-to address.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerRegistryResponse = apiInstance.updateBuyerRegistry(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#updateBuyerRegistry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#updateBuyerRegistry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerRegistryResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerRegistryItem"></a>
# **updateBuyerRegistryItem**
> UpdateBuyerRegistryItemResponse updateBuyerRegistryItem(id, platformListingId)

How many of an item you want (1–50).

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
val platformListingId : kotlin.String = platformListingId_example // kotlin.String | 
try {
    val result : UpdateBuyerRegistryItemResponse = apiInstance.updateBuyerRegistryItem(id, platformListingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#updateBuyerRegistryItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#updateBuyerRegistryItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **platformListingId** | **kotlin.String**|  |

### Return type

**UpdateBuyerRegistryItemResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerSubscription"></a>
# **updateBuyerSubscription**
> BuyerResponse updateBuyerSubscription(id)

Pause, resume, skip the next delivery, change the interval, or cancel.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : BuyerResponse = apiInstance.updateBuyerSubscription(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#updateBuyerSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#updateBuyerSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**BuyerResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerWishlist"></a>
# **updateBuyerWishlist**
> UpdateBuyerWishlistResponse updateBuyerWishlist(id, updateBuyerWishlistRequest)

Rename a wishlist, or make it public / private.

A public list can be opened by anyone holding its share link; making it private again stops that link working.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The id.
val updateBuyerWishlistRequest : UpdateBuyerWishlistRequest =  // UpdateBuyerWishlistRequest | 
try {
    val result : UpdateBuyerWishlistResponse = apiInstance.updateBuyerWishlist(id, updateBuyerWishlistRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#updateBuyerWishlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#updateBuyerWishlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The id. |
 **updateBuyerWishlistRequest** | **UpdateBuyerWishlistRequest**|  |

### Return type

**UpdateBuyerWishlistResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

