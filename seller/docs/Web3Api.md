# Web3Api

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWeb3Alert**](Web3Api.md#createWeb3Alert) | **POST** /v1/web3/alerts | Set a price alert on a token, or on a whole collection without tokenId: you are notified when one is listed at or below &#x60;price&#x60; (the chain&#39;s native coin). Setting it again moves the price.
[**createWeb3Auction**](Web3Api.md#createWeb3Auction) | **POST** /v1/web3/auctions | Start an English auction on a token in your linked wallet: &#x60;reserve&#x60; is the opening bid in the chain&#39;s native coin, &#x60;hours&#x60; its length (1–720). Bids must rise 5%; a late bid extends the end by 10 minutes.
[**createWeb3AuctionCancel**](Web3Api.md#createWeb3AuctionCancel) | **POST** /v1/web3/auctions/{id}/cancel | Call off your auction while it has no bids.
[**createWeb3CreatorClaim**](Web3Api.md#createWeb3CreatorClaim) | **POST** /v1/web3/creator/claims | Claim an EVM collection as its creator: its owner() must be one of your verified wallets. Returns &#x60;{ chain, contract }&#x60;.
[**createWeb3Crosslist**](Web3Api.md#createWeb3Crosslist) | **POST** /v1/web3/crosslist | Submit signed Seaport listings for several marketplaces at once (crossly, opensea); results per marketplace.
[**createWeb3DropRemind**](Web3Api.md#createWeb3DropRemind) | **POST** /v1/web3/drops/{id}/remind | Turn the 15-minute reminder for a drop on, or off if it already is. Returns &#x60;{ remindMe }&#x60;.
[**createWeb3Favorite**](Web3Api.md#createWeb3Favorite) | **POST** /v1/web3/favorites | Favourite an NFT, or unfavourite it if it already is. Returns &#x60;{ favorited }&#x60;.
[**createWeb3Launch**](Web3Api.md#createWeb3Launch) | **POST** /v1/web3/launches | Draft a launchpad collection: name, symbol, supply, mint price (wei of the chain’s native currency), schedule, optional holder phase and royalty. Crossly takes 5% of each mint inside the contract.
[**createWeb3LaunchAirdrop**](Web3Api.md#createWeb3LaunchAirdrop) | **POST** /v1/web3/launches/{id}/airdrop | Plan an airdrop (one free NFT each, up to 500) to &#x60;addresses&#x60; and/or the holders of &#x60;holdersOf&#x60;. Returns the transactions for the owner wallet; no payment moves.
[**createWeb3LaunchArt**](Web3Api.md#createWeb3LaunchArt) | **POST** /v1/web3/launches/{id}/art | Append per-token art (image URL, name, traits), up to the supply, before the reveal. Returns &#x60;{ count }&#x60;.
[**createWeb3LaunchConfirmDeploy**](Web3Api.md#createWeb3LaunchConfirmDeploy) | **POST** /v1/web3/launches/{id}/confirm-deploy | Confirm a sent deploy transaction: the contract must be the Crossly launch contract with this draft’s settings; it then goes live.
[**createWeb3LaunchFollowCreator**](Web3Api.md#createWeb3LaunchFollowCreator) | **POST** /v1/web3/launches/{id}/follow-creator | Follow the creator of a launch: their launches are announced to you, and again when each opens. Returns &#x60;{ following }&#x60;.
[**createWeb3LaunchReveal**](Web3Api.md#createWeb3LaunchReveal) | **POST** /v1/web3/launches/{id}/reveal | Reveal the art: one random offset maps every token to its asset for good. Returns &#x60;{ revealedAt }&#x60;.
[**createWeb3Order**](Web3Api.md#createWeb3Order) | **POST** /v1/web3/orders | Place a signed Seaport 1.6 order (listing, offer or collection offer) in the Crossly book.
[**createWeb3OrderCancel**](Web3Api.md#createWeb3OrderCancel) | **POST** /v1/web3/orders/{chain}/{hash}/cancel | Take one of your orders out of the Crossly book.
[**createWeb3OrderFulfillmentBatch**](Web3Api.md#createWeb3OrderFulfillmentBatch) | **POST** /v1/web3/orders/fulfillment-batch | Fulfilments for sweeping several listings in one Seaport transaction; unfillable ones are skipped with a reason.
[**createWeb3Phygital**](Web3Api.md#createWeb3Phygital) | **POST** /v1/web3/phygitals | Make an NFT you hold redeemable for one of your physical inventory items.
[**createWeb3PhygitalRedeem**](Web3Api.md#createWeb3PhygitalRedeem) | **POST** /v1/web3/phygitals/{id}/redeem | Redeem a phygital you hold (checked on-chain) for its physical item, with a shipping address. Once per phygital.
[**createWeb3PhygitalRedemptionShip**](Web3Api.md#createWeb3PhygitalRedemptionShip) | **POST** /v1/web3/phygitals/redemptions/{id}/ship | Mark a redemption shipped with its carrier and tracking number; the redeemer is notified.
[**createWeb3RaribleDraft**](Web3Api.md#createWeb3RaribleDraft) | **POST** /v1/web3/rarible/draft | Draft a Rarible V2 listing for an NFT in your linked wallet: the EIP-712 order to sign and whether Rarible&#39;s transfer proxy is approved.
[**createWeb3RaribleListing**](Web3Api.md#createWeb3RaribleListing) | **POST** /v1/web3/rarible/listings | Submit a signed Rarible V2 listing: the signature is verified, then the order is posted to Rarible and recorded.
[**createWeb3SolanaListTx**](Web3Api.md#createWeb3SolanaListTx) | **POST** /v1/web3/solana/{marketplace}/list-tx | Build an unsigned listing transaction on the Crossly book, Tensor or Magic Eden for a Solana NFT in your linked wallet.
[**createWeb3SolanaListing**](Web3Api.md#createWeb3SolanaListing) | **POST** /v1/web3/solana/{marketplace}/listings | Record a Crossly-book, Tensor or Magic Eden listing your wallet sent (read back from the chain first).
[**createWeb3SolanaOffer**](Web3Api.md#createWeb3SolanaOffer) | **POST** /v1/web3/solana/offers | Record a sent bid; it is recorded only once its trade state exists on chain.
[**createWeb3SolanaOfferAcceptTx**](Web3Api.md#createWeb3SolanaOfferAcceptTx) | **POST** /v1/web3/solana/offers/{hash}/accept-tx | Build the sale into a bid from your linked wallet that holds the NFT (sell + execute_sale, one transaction).
[**createWeb3SolanaOfferCancelTx**](Web3Api.md#createWeb3SolanaOfferCancelTx) | **POST** /v1/web3/solana/offers/{hash}/cancel-tx | Build the cancel of your bid: the SOL your other bids do not need comes back.
[**createWeb3SolanaOfferConfirm**](Web3Api.md#createWeb3SolanaOfferConfirm) | **POST** /v1/web3/solana/offers/{hash}/confirm | Apply a sent accept or cancel once the chain shows the bid closed.
[**createWeb3SolanaOfferTx**](Web3Api.md#createWeb3SolanaOfferTx) | **POST** /v1/web3/solana/offers/tx | Build a bid on a Solana NFT on Crossly&#39;s book for your linked wallet to sign; the SOL goes into your Auction House escrow.
[**createWeb3SolanaOrderBuyTx**](Web3Api.md#createWeb3SolanaOrderBuyTx) | **POST** /v1/web3/solana/orders/{hash}/buy-tx | Build the unsigned transaction that buys a Solana listing (price capped at the listed price).
[**createWeb3SolanaOrderConfirm**](Web3Api.md#createWeb3SolanaOrderConfirm) | **POST** /v1/web3/solana/orders/{hash}/confirm | Apply a sent Solana buy or delist to the book (the transaction is read back from the chain).
[**createWeb3SolanaOrderDelistTx**](Web3Api.md#createWeb3SolanaOrderDelistTx) | **POST** /v1/web3/solana/orders/{hash}/delist-tx | Build the unsigned transaction that takes your Solana listing down.
[**createWeb3SolanaTensorBidAcceptTx**](Web3Api.md#createWeb3SolanaTensorBidAcceptTx) | **POST** /v1/web3/solana/tensor-bids/accept-tx | Build the transaction that sells your NFT into a Tensor bid, never below &#x60;minLamports&#x60;.
[**createWeb3SolanaTensorBidCancelTx**](Web3Api.md#createWeb3SolanaTensorBidCancelTx) | **POST** /v1/web3/solana/tensor-bids/cancel-tx | Build the transaction that cancels your Tensor bid.
[**createWeb3SolanaTensorBidPlaceTx**](Web3Api.md#createWeb3SolanaTensorBidPlaceTx) | **POST** /v1/web3/solana/tensor-bids/place-tx | Build a Tensor collection bid (or trait bid with &#x60;trait&#x60;) for your Solana wallet to sign. Price in lamports.
[**createWeb3TokenRefresh**](Web3Api.md#createWeb3TokenRefresh) | **POST** /v1/web3/tokens/{chain}/{contract}/{tokenId}/refresh | Re-read a token&#39;s metadata from the chain&#39;s provider (name, traits, image — a new image is copied to Crossly&#39;s CDN). Once per token per 10 minutes.
[**createWeb3Transaction**](Web3Api.md#createWeb3Transaction) | **POST** /v1/web3/transactions | Apply a Seaport transaction&#39;s fills and cancels to the Crossly book (read from the receipt).
[**createWeb3WalletChallenge**](Web3Api.md#createWeb3WalletChallenge) | **POST** /v1/web3/wallets/challenge | Start linking a wallet: returns the message the wallet must sign.
[**createWeb3WalletSync**](Web3Api.md#createWeb3WalletSync) | **POST** /v1/web3/wallets/{id}/sync | Import a linked wallet&#39;s NFTs into inventory; archives ones that have left the wallet.
[**createWeb3WalletVerify**](Web3Api.md#createWeb3WalletVerify) | **POST** /v1/web3/wallets/verify | Finish linking a wallet with its signature over the challenge message.
[**deleteWeb3Alert**](Web3Api.md#deleteWeb3Alert) | **DELETE** /v1/web3/alerts/{id} | Delete a price alert.
[**deleteWeb3HolderPerk**](Web3Api.md#deleteWeb3HolderPerk) | **DELETE** /v1/web3/holder-perks/{id} | Remove a holder perk. Returns &#x60;{ ok }&#x60;.
[**deleteWeb3Launch**](Web3Api.md#deleteWeb3Launch) | **DELETE** /v1/web3/launches/{id} | Delete a launch draft that never went live. Returns &#x60;{ ok }&#x60;.
[**deleteWeb3LaunchFollowCreator**](Web3Api.md#deleteWeb3LaunchFollowCreator) | **DELETE** /v1/web3/launches/{id}/follow-creator | Stop following the creator of a launch. Returns &#x60;{ following }&#x60;.
[**deleteWeb3MarketplaceKey**](Web3Api.md#deleteWeb3MarketplaceKey) | **DELETE** /v1/web3/marketplace-keys/{marketplace} | Remove your own key for a marketplace; Crossly&#39;s key is used again.
[**deleteWeb3Wallet**](Web3Api.md#deleteWeb3Wallet) | **DELETE** /v1/web3/wallets/{id} | Unlink a wallet. Its NFTs stay in inventory but stop syncing.
[**getWeb3Auction**](Web3Api.md#getWeb3Auction) | **GET** /v1/web3/auctions/{chain}/{contract}/{tokenId} | A token&#39;s live (or latest) auction: reserve, end, top bid, bid count and the minimum next bid.
[**getWeb3Browse**](Web3Api.md#getWeb3Browse) | **GET** /v1/web3/browse | The Web3 directory&#39;s categories and chains, with how many collections each holds.
[**getWeb3Collection**](Web3Api.md#getWeb3Collection) | **GET** /v1/web3/collections/{chain}/{contract} | A collection: metadata and Crossly stats (floor, listed, volume, best collection offer).
[**getWeb3CollectionDepth**](Web3Api.md#getWeb3CollectionDepth) | **GET** /v1/web3/collections/{chain}/{contract}/depth | A collection&#39;s Crossly order book by price level — asks cheapest first, bids dearest first, with running totals — and the floor of every trait value.
[**getWeb3CollectionInsight**](Web3Api.md#getWeb3CollectionInsight) | **GET** /v1/web3/collections/{chain}/{contract}/insights | On-chain insights for a collection: holders, trait counts across the whole collection, recent transfers and a 30-day activity series.
[**getWeb3CollectionItem**](Web3Api.md#getWeb3CollectionItem) | **GET** /v1/web3/collections/{chain}/{contract}/items | A collection&#39;s NFTs: filter by traits (repeat trait&#x3D;Type:Value; OR within a type, AND across), search by name or token id, sort by id, rarity or Crossly price. Whole-collection once indexed.
[**getWeb3CollectionTrait**](Web3Api.md#getWeb3CollectionTrait) | **GET** /v1/web3/collections/{chain}/{contract}/traits | Every trait type and value in a collection, with how many tokens have each.
[**getWeb3CollectionTraitToken**](Web3Api.md#getWeb3CollectionTraitToken) | **GET** /v1/web3/collections/{chain}/{contract}/trait-tokens | Token ids in a collection with one trait — what a trait offer commits to.
[**getWeb3Collector**](Web3Api.md#getWeb3Collector) | **GET** /v1/web3/collector | Your collector perks: how many different NFTs you bought through Crossly, your Collector pin tier, relist rewards paid, and each NFT you still hold with the Bought on Crossly mark.
[**getWeb3Creator**](Web3Api.md#getWeb3Creator) | **GET** /v1/web3/creator/{chain}/{contract} | A collection’s creator dashboard: sales by marketplace and day, estimated royalties, holders, and for a launch the mint revenue and what is waiting to be withdrawn (wei of the chain’s native currency).
[**getWeb3CrosslistQuote**](Web3Api.md#getWeb3CrosslistQuote) | **GET** /v1/web3/crosslist/quote | Each marketplace&#39;s terms for listing a token: Crossly fee, OpenSea required fees and zone, Tensor availability.
[**getWeb3Featured**](Web3Api.md#getWeb3Featured) | **GET** /v1/web3/featured | The NFT home&#39;s featured collections: chosen by Crossly, else the hottest.
[**getWeb3Inventory**](Web3Api.md#getWeb3Inventory) | **GET** /v1/web3/inventory/{itemId} | The NFT behind an inventory item: its token, wallet, and open listings on every marketplace (null if it is not an NFT).
[**getWeb3LaunchAllowlistRootTx**](Web3Api.md#getWeb3LaunchAllowlistRootTx) | **GET** /v1/web3/launches/{id}/allowlist/root-tx | The setAllowlistRoot transaction for the allowlist Crossly holds (EVM, live): &#x60;{ chain, from, to, data }&#x60;.
[**getWeb3LaunchDeployTx**](Web3Api.md#getWeb3LaunchDeployTx) | **GET** /v1/web3/launches/{id}/deploy-tx | The contract-creation transaction for the draft: send it from the owner wallet, then confirm it. Returns &#x60;{ chain, from, data }&#x60;.
[**getWeb3LaunchTool**](Web3Api.md#getWeb3LaunchTool) | **GET** /v1/web3/launches/{id}/tools | A launch’s creator tools: allowlist size and root (and whether the contract has it yet), uploaded art and reveal, supply minted.
[**getWeb3OrderFulfillment**](Web3Api.md#getWeb3OrderFulfillment) | **GET** /v1/web3/orders/{chain}/{hash}/fulfillment | The signed order a taker passes to Seaport, after re-checking it can still fill.
[**getWeb3Phygital**](Web3Api.md#getWeb3Phygital) | **GET** /v1/web3/phygitals/{chain}/{contract}/{tokenId} | A token&#39;s phygital: the physical item it can be redeemed for, and whether it has been.
[**getWeb3Phygital2**](Web3Api.md#getWeb3Phygital2) | **GET** /v1/web3/phygitals | Phygitals you linked (with each redemption and its shipping address) and ones you redeemed.
[**getWeb3Portfolio**](Web3Api.md#getWeb3Portfolio) | **GET** /v1/web3/portfolio | Your NFTs with value (Crossly floor, else recent sales) and cost (what a linked wallet paid), realised sales, and USD totals at each day’s coin price.
[**getWeb3PortfolioTax**](Web3Api.md#getWeb3PortfolioTax) | **GET** /v1/web3/portfolio/tax | One calendar year of NFT disposals from your linked wallets as CSV text: acquired, sold, proceeds, cost basis, gain (coin and USD).
[**getWeb3Profile**](Web3Api.md#getWeb3Profile) | **GET** /v1/web3/profiles/{address} | A wallet&#39;s public profile: NFTs held, open Crossly listings, and activity.
[**getWeb3Resolve**](Web3Api.md#getWeb3Resolve) | **GET** /v1/web3/resolve/{chain}/{slug} | A collection&#39;s chain and contract from its readable URL slug (e.g. eth / boredapeyachtclub).
[**getWeb3SolanaCollectionTensorBid**](Web3Api.md#getWeb3SolanaCollectionTensorBid) | **GET** /v1/web3/solana/collections/{collection}/tensor-bids | A Solana collection’s Tensor bids (collection-wide and by trait), best first; price in lamports. Needs your Tensor key.
[**getWeb3Token**](Web3Api.md#getWeb3Token) | **GET** /v1/web3/tokens/{chain}/{contract}/{tokenId} | One NFT: metadata, traits, owner, open listings and offers, activity.
[**listWeb3Activity**](Web3Api.md#listWeb3Activity) | **GET** /v1/web3/activity | Listings, offers, sales and cancels in the Crossly book, newest first.
[**listWeb3Alerts**](Web3Api.md#listWeb3Alerts) | **GET** /v1/web3/alerts | Your NFT price alerts, with the cheapest open Crossly listing each one covers now.
[**listWeb3Approvals**](Web3Api.md#listWeb3Approvals) | **GET** /v1/web3/approvals | Your collections the OpenSea conduit is approved to move, per linked wallet.
[**listWeb3Auctions**](Web3Api.md#listWeb3Auctions) | **GET** /v1/web3/auctions | Live English auctions on the Crossly book, ending soonest first, each with its top bid and the least the next bid can be.
[**listWeb3BrowseCollections**](Web3Api.md#listWeb3BrowseCollections) | **GET** /v1/web3/browse/collections | Browse NFT collections by chain, category and name; sort hot (Crossly sales, listings, favourites), new, volume, floor or name.
[**listWeb3BrowseTokens**](Web3Api.md#listWeb3BrowseTokens) | **GET** /v1/web3/browse/tokens | Hot NFTs: what is for sale on Crossly first, then tokens from the hottest collections.
[**listWeb3Bundles**](Web3Api.md#listWeb3Bundles) | **GET** /v1/web3/bundles | Open bundle listings (2–30 NFTs for one price), newest first, by chain or by a contract any item is from.
[**listWeb3CollectionHistory**](Web3Api.md#listWeb3CollectionHistory) | **GET** /v1/web3/collections/{chain}/{contract}/history | Daily floor, sales, volume, holders and listed count for a collection, oldest first (up to 365 days).
[**listWeb3Collections**](Web3Api.md#listWeb3Collections) | **GET** /v1/web3/collections | Collections ranked by 30-day Crossly volume, with floor and listed count.
[**listWeb3CreatorCollections**](Web3Api.md#listWeb3CreatorCollections) | **GET** /v1/web3/creator/collections | Collections you are the creator of: your launches, and contracts you claimed by owning them.
[**listWeb3Drops**](Web3Api.md#listWeb3Drops) | **GET** /v1/web3/drops | Upcoming and live NFT drops (curated mints on the creator&#39;s own page), soonest first, with whether you asked to be reminded.
[**listWeb3HolderPerks**](Web3Api.md#listWeb3HolderPerks) | **GET** /v1/web3/holder-perks | Your holder perks: percent off your Crossly shop for holders of an NFT collection, best first.
[**listWeb3Launches**](Web3Api.md#listWeb3Launches) | **GET** /v1/web3/launches | Your launchpad collections (drafts and live), newest first, with minted count and phase.
[**listWeb3Listings**](Web3Api.md#listWeb3Listings) | **GET** /v1/web3/listings | Open NFT listings in the Crossly book — the cheapest per token.
[**listWeb3MarketplaceKeys**](Web3Api.md#listWeb3MarketplaceKeys) | **GET** /v1/web3/marketplace-keys | Your own marketplace API keys (last four characters only) and whether Crossly&#39;s key covers each marketplace.
[**listWeb3Nfts**](Web3Api.md#listWeb3Nfts) | **GET** /v1/web3/nfts | List the NFTs in your inventory, imported from your linked wallets.
[**listWeb3Orders**](Web3Api.md#listWeb3Orders) | **GET** /v1/web3/orders | Your orders in the Crossly book (listings and offers), any status.
[**listWeb3Purchases**](Web3Api.md#listWeb3Purchases) | **GET** /v1/web3/purchases | NFTs your linked wallets bought — on Crossly or any marketplace the chain feed saw — newest first, with price and whether you still hold each.
[**listWeb3Rankings**](Web3Api.md#listWeb3Rankings) | **GET** /v1/web3/rankings | Collections by sales volume over 24h, 7d or 30d, in one coin: the ETH chains together, or Polygon / Solana on their own.
[**listWeb3Reserved**](Web3Api.md#listWeb3Reserved) | **GET** /v1/web3/reserved | Private listings reserved for one of your linked wallets — only you can see or buy them.
[**listWeb3Sales**](Web3Api.md#listWeb3Sales) | **GET** /v1/web3/sales | The latest NFT sales across the directory, from the chain (Seaport and Blur) and the Crossly book, newest first; page with &#x60;before&#x60;.
[**listWeb3Search**](Web3Api.md#listWeb3Search) | **GET** /v1/web3/search | Find collections by contract address (every chain) or by name.
[**listWeb3SearchTokens**](Web3Api.md#listWeb3SearchTokens) | **GET** /v1/web3/search/tokens | Find tokens by collection name and number: &#39;pudgy 42&#39;, &#39;Bored Ape #1234&#39;.
[**listWeb3Wallets**](Web3Api.md#listWeb3Wallets) | **GET** /v1/web3/wallets | List your verified, linked wallets (EVM and Solana).
[**listWeb3Watchlist**](Web3Api.md#listWeb3Watchlist) | **GET** /v1/web3/watchlist | Your favourited NFTs, with the cheapest open Crossly listing and the last sale of each.
[**updateWeb3HolderPerk**](Web3Api.md#updateWeb3HolderPerk) | **PUT** /v1/web3/holder-perks | Set the percent off (100–5000 bps) holders of a collection get across your Crossly shop; one perk per collection.
[**updateWeb3LaunchAllowlist**](Web3Api.md#updateWeb3LaunchAllowlist) | **PUT** /v1/web3/launches/{id}/allowlist | Replace the early-phase allowlist (up to 10,000 wallets). EVM live launches get back &#x60;rootTx&#x60;, the setAllowlistRoot transaction for the owner wallet.
[**updateWeb3MarketplaceKey**](Web3Api.md#updateWeb3MarketplaceKey) | **PUT** /v1/web3/marketplace-keys/{marketplace} | Save your own API key for a marketplace (checked against the marketplace first where it can be); stored encrypted.


<a name="createWeb3Alert"></a>
# **createWeb3Alert**
> IdResponse createWeb3Alert()

Set a price alert on a token, or on a whole collection without tokenId: you are notified when one is listed at or below &#x60;price&#x60; (the chain&#39;s native coin). Setting it again moves the price.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : IdResponse = apiInstance.createWeb3Alert()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3Alert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3Alert")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**IdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3Auction"></a>
# **createWeb3Auction**
> CreateWeb3AuctionResponse createWeb3Auction()

Start an English auction on a token in your linked wallet: &#x60;reserve&#x60; is the opening bid in the chain&#39;s native coin, &#x60;hours&#x60; its length (1–720). Bids must rise 5%; a late bid extends the end by 10 minutes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3AuctionResponse = apiInstance.createWeb3Auction()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3Auction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3Auction")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3AuctionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3AuctionCancel"></a>
# **createWeb3AuctionCancel**
> OkResponse createWeb3AuctionCancel(id)

Call off your auction while it has no bids.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createWeb3AuctionCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3AuctionCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3AuctionCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3CreatorClaim"></a>
# **createWeb3CreatorClaim**
> CreateWeb3CreatorClaimResponse createWeb3CreatorClaim()

Claim an EVM collection as its creator: its owner() must be one of your verified wallets. Returns &#x60;{ chain, contract }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3CreatorClaimResponse = apiInstance.createWeb3CreatorClaim()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3CreatorClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3CreatorClaim")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3CreatorClaimResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3Crosslist"></a>
# **createWeb3Crosslist**
> CreateWeb3CrosslistResponse createWeb3Crosslist()

Submit signed Seaport listings for several marketplaces at once (crossly, opensea); results per marketplace.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3CrosslistResponse = apiInstance.createWeb3Crosslist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3Crosslist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3Crosslist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3CrosslistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3DropRemind"></a>
# **createWeb3DropRemind**
> CreateWeb3DropRemindResponse createWeb3DropRemind(id)

Turn the 15-minute reminder for a drop on, or off if it already is. Returns &#x60;{ remindMe }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWeb3DropRemindResponse = apiInstance.createWeb3DropRemind(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3DropRemind")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3DropRemind")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWeb3DropRemindResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3Favorite"></a>
# **createWeb3Favorite**
> CreateWeb3FavoriteResponse createWeb3Favorite()

Favourite an NFT, or unfavourite it if it already is. Returns &#x60;{ favorited }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3FavoriteResponse = apiInstance.createWeb3Favorite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3Favorite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3Favorite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3FavoriteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3Launch"></a>
# **createWeb3Launch**
> ListWeb3LaunchesItem createWeb3Launch()

Draft a launchpad collection: name, symbol, supply, mint price (wei of the chain’s native currency), schedule, optional holder phase and royalty. Crossly takes 5% of each mint inside the contract.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3LaunchesItem = apiInstance.createWeb3Launch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3Launch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3Launch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3LaunchesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3LaunchAirdrop"></a>
# **createWeb3LaunchAirdrop**
> CreateWeb3LaunchAirdropResponse createWeb3LaunchAirdrop(id)

Plan an airdrop (one free NFT each, up to 500) to &#x60;addresses&#x60; and/or the holders of &#x60;holdersOf&#x60;. Returns the transactions for the owner wallet; no payment moves.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWeb3LaunchAirdropResponse = apiInstance.createWeb3LaunchAirdrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3LaunchAirdrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3LaunchAirdrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWeb3LaunchAirdropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3LaunchArt"></a>
# **createWeb3LaunchArt**
> CreateWeb3LaunchArtResponse createWeb3LaunchArt(id)

Append per-token art (image URL, name, traits), up to the supply, before the reveal. Returns &#x60;{ count }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWeb3LaunchArtResponse = apiInstance.createWeb3LaunchArt(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3LaunchArt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3LaunchArt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWeb3LaunchArtResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3LaunchConfirmDeploy"></a>
# **createWeb3LaunchConfirmDeploy**
> ListWeb3LaunchesItem createWeb3LaunchConfirmDeploy(id)

Confirm a sent deploy transaction: the contract must be the Crossly launch contract with this draft’s settings; it then goes live.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListWeb3LaunchesItem = apiInstance.createWeb3LaunchConfirmDeploy(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3LaunchConfirmDeploy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3LaunchConfirmDeploy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListWeb3LaunchesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3LaunchFollowCreator"></a>
# **createWeb3LaunchFollowCreator**
> CreateWeb3LaunchFollowCreatorResponse createWeb3LaunchFollowCreator(id)

Follow the creator of a launch: their launches are announced to you, and again when each opens. Returns &#x60;{ following }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWeb3LaunchFollowCreatorResponse = apiInstance.createWeb3LaunchFollowCreator(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3LaunchFollowCreator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3LaunchFollowCreator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWeb3LaunchFollowCreatorResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3LaunchReveal"></a>
# **createWeb3LaunchReveal**
> CreateWeb3LaunchRevealResponse createWeb3LaunchReveal(id)

Reveal the art: one random offset maps every token to its asset for good. Returns &#x60;{ revealedAt }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWeb3LaunchRevealResponse = apiInstance.createWeb3LaunchReveal(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3LaunchReveal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3LaunchReveal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWeb3LaunchRevealResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3Order"></a>
# **createWeb3Order**
> CreateWeb3OrderResponse createWeb3Order()

Place a signed Seaport 1.6 order (listing, offer or collection offer) in the Crossly book.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3OrderResponse = apiInstance.createWeb3Order()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3Order")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3Order")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3OrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3OrderCancel"></a>
# **createWeb3OrderCancel**
> OkResponse createWeb3OrderCancel(chain, hash)

Take one of your orders out of the Crossly book.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val hash : kotlin.String = hash_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createWeb3OrderCancel(chain, hash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3OrderCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3OrderCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **hash** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3OrderFulfillmentBatch"></a>
# **createWeb3OrderFulfillmentBatch**
> CreateWeb3OrderFulfillmentBatchResponse createWeb3OrderFulfillmentBatch()

Fulfilments for sweeping several listings in one Seaport transaction; unfillable ones are skipped with a reason.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3OrderFulfillmentBatchResponse = apiInstance.createWeb3OrderFulfillmentBatch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3OrderFulfillmentBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3OrderFulfillmentBatch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3OrderFulfillmentBatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3Phygital"></a>
# **createWeb3Phygital**
> CreateWeb3PhygitalResponse createWeb3Phygital()

Make an NFT you hold redeemable for one of your physical inventory items.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3PhygitalResponse = apiInstance.createWeb3Phygital()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3Phygital")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3Phygital")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3PhygitalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3PhygitalRedeem"></a>
# **createWeb3PhygitalRedeem**
> CreateWeb3PhygitalRedeemResponse createWeb3PhygitalRedeem(id)

Redeem a phygital you hold (checked on-chain) for its physical item, with a shipping address. Once per phygital.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWeb3PhygitalRedeemResponse = apiInstance.createWeb3PhygitalRedeem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3PhygitalRedeem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3PhygitalRedeem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWeb3PhygitalRedeemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3PhygitalRedemptionShip"></a>
# **createWeb3PhygitalRedemptionShip**
> OkResponse createWeb3PhygitalRedemptionShip(id)

Mark a redemption shipped with its carrier and tracking number; the redeemer is notified.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createWeb3PhygitalRedemptionShip(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3PhygitalRedemptionShip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3PhygitalRedemptionShip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3RaribleDraft"></a>
# **createWeb3RaribleDraft**
> CreateWeb3RaribleDraftResponse createWeb3RaribleDraft()

Draft a Rarible V2 listing for an NFT in your linked wallet: the EIP-712 order to sign and whether Rarible&#39;s transfer proxy is approved.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3RaribleDraftResponse = apiInstance.createWeb3RaribleDraft()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3RaribleDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3RaribleDraft")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3RaribleDraftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3RaribleListing"></a>
# **createWeb3RaribleListing**
> OrderHashResponse createWeb3RaribleListing()

Submit a signed Rarible V2 listing: the signature is verified, then the order is posted to Rarible and recorded.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : OrderHashResponse = apiInstance.createWeb3RaribleListing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3RaribleListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3RaribleListing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**OrderHashResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaListTx"></a>
# **createWeb3SolanaListTx**
> CreateWeb3SolanaListTxResponse createWeb3SolanaListTx(marketplace)

Build an unsigned listing transaction on the Crossly book, Tensor or Magic Eden for a Solana NFT in your linked wallet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val marketplace : kotlin.String = marketplace_example // kotlin.String | 
try {
    val result : CreateWeb3SolanaListTxResponse = apiInstance.createWeb3SolanaListTx(marketplace)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaListTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaListTx")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplace** | **kotlin.String**|  | [enum: crossly, tensor, magic_eden]

### Return type

**CreateWeb3SolanaListTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaListing"></a>
# **createWeb3SolanaListing**
> OrderHashResponse createWeb3SolanaListing(marketplace)

Record a Crossly-book, Tensor or Magic Eden listing your wallet sent (read back from the chain first).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val marketplace : kotlin.String = marketplace_example // kotlin.String | 
try {
    val result : OrderHashResponse = apiInstance.createWeb3SolanaListing(marketplace)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplace** | **kotlin.String**|  | [enum: crossly, tensor, magic_eden]

### Return type

**OrderHashResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaOffer"></a>
# **createWeb3SolanaOffer**
> OrderHashResponse createWeb3SolanaOffer()

Record a sent bid; it is recorded only once its trade state exists on chain.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : OrderHashResponse = apiInstance.createWeb3SolanaOffer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaOffer")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**OrderHashResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaOfferAcceptTx"></a>
# **createWeb3SolanaOfferAcceptTx**
> CreateWeb3SolanaListTxResponse createWeb3SolanaOfferAcceptTx(hash)

Build the sale into a bid from your linked wallet that holds the NFT (sell + execute_sale, one transaction).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val hash : kotlin.String = hash_example // kotlin.String | 
try {
    val result : CreateWeb3SolanaListTxResponse = apiInstance.createWeb3SolanaOfferAcceptTx(hash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaOfferAcceptTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaOfferAcceptTx")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **kotlin.String**|  |

### Return type

**CreateWeb3SolanaListTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaOfferCancelTx"></a>
# **createWeb3SolanaOfferCancelTx**
> CreateWeb3SolanaListTxResponse createWeb3SolanaOfferCancelTx(hash)

Build the cancel of your bid: the SOL your other bids do not need comes back.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val hash : kotlin.String = hash_example // kotlin.String | 
try {
    val result : CreateWeb3SolanaListTxResponse = apiInstance.createWeb3SolanaOfferCancelTx(hash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaOfferCancelTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaOfferCancelTx")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **kotlin.String**|  |

### Return type

**CreateWeb3SolanaListTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaOfferConfirm"></a>
# **createWeb3SolanaOfferConfirm**
> CreateWeb3SolanaOfferConfirmResponse createWeb3SolanaOfferConfirm(hash)

Apply a sent accept or cancel once the chain shows the bid closed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val hash : kotlin.String = hash_example // kotlin.String | 
try {
    val result : CreateWeb3SolanaOfferConfirmResponse = apiInstance.createWeb3SolanaOfferConfirm(hash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaOfferConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaOfferConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **kotlin.String**|  |

### Return type

**CreateWeb3SolanaOfferConfirmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaOfferTx"></a>
# **createWeb3SolanaOfferTx**
> CreateWeb3SolanaOfferTxResponse createWeb3SolanaOfferTx()

Build a bid on a Solana NFT on Crossly&#39;s book for your linked wallet to sign; the SOL goes into your Auction House escrow.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3SolanaOfferTxResponse = apiInstance.createWeb3SolanaOfferTx()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaOfferTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaOfferTx")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3SolanaOfferTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaOrderBuyTx"></a>
# **createWeb3SolanaOrderBuyTx**
> CreateWeb3SolanaOrderBuyTxResponse createWeb3SolanaOrderBuyTx(hash)

Build the unsigned transaction that buys a Solana listing (price capped at the listed price).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val hash : kotlin.String = hash_example // kotlin.String | 
try {
    val result : CreateWeb3SolanaOrderBuyTxResponse = apiInstance.createWeb3SolanaOrderBuyTx(hash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaOrderBuyTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaOrderBuyTx")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **kotlin.String**|  |

### Return type

**CreateWeb3SolanaOrderBuyTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaOrderConfirm"></a>
# **createWeb3SolanaOrderConfirm**
> CreateWeb3SolanaOfferConfirmResponse createWeb3SolanaOrderConfirm(hash)

Apply a sent Solana buy or delist to the book (the transaction is read back from the chain).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val hash : kotlin.String = hash_example // kotlin.String | 
try {
    val result : CreateWeb3SolanaOfferConfirmResponse = apiInstance.createWeb3SolanaOrderConfirm(hash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaOrderConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaOrderConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **kotlin.String**|  |

### Return type

**CreateWeb3SolanaOfferConfirmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaOrderDelistTx"></a>
# **createWeb3SolanaOrderDelistTx**
> CreateWeb3SolanaListTxResponse createWeb3SolanaOrderDelistTx(hash)

Build the unsigned transaction that takes your Solana listing down.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val hash : kotlin.String = hash_example // kotlin.String | 
try {
    val result : CreateWeb3SolanaListTxResponse = apiInstance.createWeb3SolanaOrderDelistTx(hash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaOrderDelistTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaOrderDelistTx")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **kotlin.String**|  |

### Return type

**CreateWeb3SolanaListTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaTensorBidAcceptTx"></a>
# **createWeb3SolanaTensorBidAcceptTx**
> CreateWeb3SolanaTensorBidPlaceTxResponse createWeb3SolanaTensorBidAcceptTx()

Build the transaction that sells your NFT into a Tensor bid, never below &#x60;minLamports&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3SolanaTensorBidPlaceTxResponse = apiInstance.createWeb3SolanaTensorBidAcceptTx()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaTensorBidAcceptTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaTensorBidAcceptTx")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3SolanaTensorBidPlaceTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaTensorBidCancelTx"></a>
# **createWeb3SolanaTensorBidCancelTx**
> CreateWeb3SolanaTensorBidPlaceTxResponse createWeb3SolanaTensorBidCancelTx()

Build the transaction that cancels your Tensor bid.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3SolanaTensorBidPlaceTxResponse = apiInstance.createWeb3SolanaTensorBidCancelTx()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaTensorBidCancelTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaTensorBidCancelTx")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3SolanaTensorBidPlaceTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3SolanaTensorBidPlaceTx"></a>
# **createWeb3SolanaTensorBidPlaceTx**
> CreateWeb3SolanaTensorBidPlaceTxResponse createWeb3SolanaTensorBidPlaceTx()

Build a Tensor collection bid (or trait bid with &#x60;trait&#x60;) for your Solana wallet to sign. Price in lamports.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3SolanaTensorBidPlaceTxResponse = apiInstance.createWeb3SolanaTensorBidPlaceTx()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3SolanaTensorBidPlaceTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3SolanaTensorBidPlaceTx")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3SolanaTensorBidPlaceTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3TokenRefresh"></a>
# **createWeb3TokenRefresh**
> CreateWeb3TokenRefreshResponse createWeb3TokenRefresh(chain, contract, tokenId)

Re-read a token&#39;s metadata from the chain&#39;s provider (name, traits, image — a new image is copied to Crossly&#39;s CDN). Once per token per 10 minutes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
val tokenId : kotlin.String = tokenId_example // kotlin.String | 
try {
    val result : CreateWeb3TokenRefreshResponse = apiInstance.createWeb3TokenRefresh(chain, contract, tokenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3TokenRefresh")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3TokenRefresh")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |
 **tokenId** | **kotlin.String**|  |

### Return type

**CreateWeb3TokenRefreshResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3Transaction"></a>
# **createWeb3Transaction**
> CreateWeb3TransactionResponse createWeb3Transaction()

Apply a Seaport transaction&#39;s fills and cancels to the Crossly book (read from the receipt).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3TransactionResponse = apiInstance.createWeb3Transaction()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3Transaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3Transaction")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3TransactionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3WalletChallenge"></a>
# **createWeb3WalletChallenge**
> CreateWeb3WalletChallengeResponse createWeb3WalletChallenge()

Start linking a wallet: returns the message the wallet must sign.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3WalletChallengeResponse = apiInstance.createWeb3WalletChallenge()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3WalletChallenge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3WalletChallenge")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3WalletChallengeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3WalletSync"></a>
# **createWeb3WalletSync**
> CreateWeb3WalletSyncResponse createWeb3WalletSync(id)

Import a linked wallet&#39;s NFTs into inventory; archives ones that have left the wallet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWeb3WalletSyncResponse = apiInstance.createWeb3WalletSync(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3WalletSync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3WalletSync")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWeb3WalletSyncResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWeb3WalletVerify"></a>
# **createWeb3WalletVerify**
> CreateWeb3WalletVerifyResponse createWeb3WalletVerify()

Finish linking a wallet with its signature over the challenge message.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : CreateWeb3WalletVerifyResponse = apiInstance.createWeb3WalletVerify()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#createWeb3WalletVerify")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#createWeb3WalletVerify")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWeb3WalletVerifyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWeb3Alert"></a>
# **deleteWeb3Alert**
> OkResponse deleteWeb3Alert(id)

Delete a price alert.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.deleteWeb3Alert(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#deleteWeb3Alert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#deleteWeb3Alert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWeb3HolderPerk"></a>
# **deleteWeb3HolderPerk**
> OkResponse deleteWeb3HolderPerk(id)

Remove a holder perk. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.deleteWeb3HolderPerk(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#deleteWeb3HolderPerk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#deleteWeb3HolderPerk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWeb3Launch"></a>
# **deleteWeb3Launch**
> OkResponse deleteWeb3Launch(id)

Delete a launch draft that never went live. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.deleteWeb3Launch(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#deleteWeb3Launch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#deleteWeb3Launch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWeb3LaunchFollowCreator"></a>
# **deleteWeb3LaunchFollowCreator**
> CreateWeb3LaunchFollowCreatorResponse deleteWeb3LaunchFollowCreator(id)

Stop following the creator of a launch. Returns &#x60;{ following }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWeb3LaunchFollowCreatorResponse = apiInstance.deleteWeb3LaunchFollowCreator(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#deleteWeb3LaunchFollowCreator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#deleteWeb3LaunchFollowCreator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWeb3LaunchFollowCreatorResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWeb3MarketplaceKey"></a>
# **deleteWeb3MarketplaceKey**
> deleteWeb3MarketplaceKey(marketplace)

Remove your own key for a marketplace; Crossly&#39;s key is used again.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val marketplace : kotlin.String = marketplace_example // kotlin.String | 
try {
    apiInstance.deleteWeb3MarketplaceKey(marketplace)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#deleteWeb3MarketplaceKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#deleteWeb3MarketplaceKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplace** | **kotlin.String**|  | [enum: opensea, tensor, magic_eden, rarible]

### Return type

null (empty response body)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWeb3Wallet"></a>
# **deleteWeb3Wallet**
> OkResponse deleteWeb3Wallet(id)

Unlink a wallet. Its NFTs stay in inventory but stop syncing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.deleteWeb3Wallet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#deleteWeb3Wallet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#deleteWeb3Wallet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Auction"></a>
# **getWeb3Auction**
> GetWeb3AuctionResponse getWeb3Auction(chain, contract, tokenId)

A token&#39;s live (or latest) auction: reserve, end, top bid, bid count and the minimum next bid.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
val tokenId : kotlin.String = tokenId_example // kotlin.String | 
try {
    val result : GetWeb3AuctionResponse = apiInstance.getWeb3Auction(chain, contract, tokenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Auction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Auction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |
 **tokenId** | **kotlin.String**|  |

### Return type

**GetWeb3AuctionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Browse"></a>
# **getWeb3Browse**
> GetWeb3BrowseResponse getWeb3Browse()

The Web3 directory&#39;s categories and chains, with how many collections each holds.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : GetWeb3BrowseResponse = apiInstance.getWeb3Browse()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Browse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Browse")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWeb3BrowseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Collection"></a>
# **getWeb3Collection**
> GetWeb3CollectionResponse getWeb3Collection(chain, contract)

A collection: metadata and Crossly stats (floor, listed, volume, best collection offer).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    val result : GetWeb3CollectionResponse = apiInstance.getWeb3Collection(chain, contract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Collection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Collection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

**GetWeb3CollectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3CollectionDepth"></a>
# **getWeb3CollectionDepth**
> GetWeb3CollectionDepthResponse getWeb3CollectionDepth(chain, contract)

A collection&#39;s Crossly order book by price level — asks cheapest first, bids dearest first, with running totals — and the floor of every trait value.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    val result : GetWeb3CollectionDepthResponse = apiInstance.getWeb3CollectionDepth(chain, contract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3CollectionDepth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3CollectionDepth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

**GetWeb3CollectionDepthResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3CollectionInsight"></a>
# **getWeb3CollectionInsight**
> GetWeb3CollectionInsightResponse getWeb3CollectionInsight(chain, contract)

On-chain insights for a collection: holders, trait counts across the whole collection, recent transfers and a 30-day activity series.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    val result : GetWeb3CollectionInsightResponse = apiInstance.getWeb3CollectionInsight(chain, contract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3CollectionInsight")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3CollectionInsight")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

**GetWeb3CollectionInsightResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3CollectionItem"></a>
# **getWeb3CollectionItem**
> GetWeb3CollectionItemResponse getWeb3CollectionItem(chain, contract)

A collection&#39;s NFTs: filter by traits (repeat trait&#x3D;Type:Value; OR within a type, AND across), search by name or token id, sort by id, rarity or Crossly price. Whole-collection once indexed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    val result : GetWeb3CollectionItemResponse = apiInstance.getWeb3CollectionItem(chain, contract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3CollectionItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3CollectionItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

**GetWeb3CollectionItemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3CollectionTrait"></a>
# **getWeb3CollectionTrait**
> GetWeb3CollectionTraitResponse getWeb3CollectionTrait(chain, contract)

Every trait type and value in a collection, with how many tokens have each.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    val result : GetWeb3CollectionTraitResponse = apiInstance.getWeb3CollectionTrait(chain, contract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3CollectionTrait")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3CollectionTrait")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

**GetWeb3CollectionTraitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3CollectionTraitToken"></a>
# **getWeb3CollectionTraitToken**
> GetWeb3CollectionTraitTokenResponse getWeb3CollectionTraitToken(chain, contract)

Token ids in a collection with one trait — what a trait offer commits to.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    val result : GetWeb3CollectionTraitTokenResponse = apiInstance.getWeb3CollectionTraitToken(chain, contract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3CollectionTraitToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3CollectionTraitToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

**GetWeb3CollectionTraitTokenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Collector"></a>
# **getWeb3Collector**
> GetWeb3CollectorResponse getWeb3Collector()

Your collector perks: how many different NFTs you bought through Crossly, your Collector pin tier, relist rewards paid, and each NFT you still hold with the Bought on Crossly mark.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : GetWeb3CollectorResponse = apiInstance.getWeb3Collector()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Collector")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Collector")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWeb3CollectorResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Creator"></a>
# **getWeb3Creator**
> GetWeb3CreatorResponse getWeb3Creator(chain, contract)

A collection’s creator dashboard: sales by marketplace and day, estimated royalties, holders, and for a launch the mint revenue and what is waiting to be withdrawn (wei of the chain’s native currency).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    val result : GetWeb3CreatorResponse = apiInstance.getWeb3Creator(chain, contract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Creator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Creator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

**GetWeb3CreatorResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3CrosslistQuote"></a>
# **getWeb3CrosslistQuote**
> GetWeb3CrosslistQuoteResponse getWeb3CrosslistQuote()

Each marketplace&#39;s terms for listing a token: Crossly fee, OpenSea required fees and zone, Tensor availability.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : GetWeb3CrosslistQuoteResponse = apiInstance.getWeb3CrosslistQuote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3CrosslistQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3CrosslistQuote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWeb3CrosslistQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Featured"></a>
# **getWeb3Featured**
> GetWeb3FeaturedResponse getWeb3Featured()

The NFT home&#39;s featured collections: chosen by Crossly, else the hottest.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : GetWeb3FeaturedResponse = apiInstance.getWeb3Featured()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Featured")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Featured")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWeb3FeaturedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Inventory"></a>
# **getWeb3Inventory**
> GetWeb3InventoryResponse getWeb3Inventory(itemId)

The NFT behind an inventory item: its token, wallet, and open listings on every marketplace (null if it is not an NFT).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val itemId : kotlin.String = itemId_example // kotlin.String | 
try {
    val result : GetWeb3InventoryResponse = apiInstance.getWeb3Inventory(itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Inventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Inventory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **kotlin.String**|  |

### Return type

**GetWeb3InventoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3LaunchAllowlistRootTx"></a>
# **getWeb3LaunchAllowlistRootTx**
> GetWeb3LaunchAllowlistRootTxResponse getWeb3LaunchAllowlistRootTx(id)

The setAllowlistRoot transaction for the allowlist Crossly holds (EVM, live): &#x60;{ chain, from, to, data }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWeb3LaunchAllowlistRootTxResponse = apiInstance.getWeb3LaunchAllowlistRootTx(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3LaunchAllowlistRootTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3LaunchAllowlistRootTx")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWeb3LaunchAllowlistRootTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3LaunchDeployTx"></a>
# **getWeb3LaunchDeployTx**
> GetWeb3LaunchDeployTxResponse getWeb3LaunchDeployTx(id)

The contract-creation transaction for the draft: send it from the owner wallet, then confirm it. Returns &#x60;{ chain, from, data }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWeb3LaunchDeployTxResponse = apiInstance.getWeb3LaunchDeployTx(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3LaunchDeployTx")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3LaunchDeployTx")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWeb3LaunchDeployTxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3LaunchTool"></a>
# **getWeb3LaunchTool**
> GetWeb3LaunchToolResponse getWeb3LaunchTool(id)

A launch’s creator tools: allowlist size and root (and whether the contract has it yet), uploaded art and reveal, supply minted.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWeb3LaunchToolResponse = apiInstance.getWeb3LaunchTool(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3LaunchTool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3LaunchTool")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWeb3LaunchToolResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3OrderFulfillment"></a>
# **getWeb3OrderFulfillment**
> GetWeb3OrderFulfillmentResponse getWeb3OrderFulfillment(chain, hash)

The signed order a taker passes to Seaport, after re-checking it can still fill.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val hash : kotlin.String = hash_example // kotlin.String | 
try {
    val result : GetWeb3OrderFulfillmentResponse = apiInstance.getWeb3OrderFulfillment(chain, hash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3OrderFulfillment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3OrderFulfillment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **hash** | **kotlin.String**|  |

### Return type

**GetWeb3OrderFulfillmentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Phygital"></a>
# **getWeb3Phygital**
> GetWeb3PhygitalResponse getWeb3Phygital(chain, contract, tokenId)

A token&#39;s phygital: the physical item it can be redeemed for, and whether it has been.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
val tokenId : kotlin.String = tokenId_example // kotlin.String | 
try {
    val result : GetWeb3PhygitalResponse = apiInstance.getWeb3Phygital(chain, contract, tokenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Phygital")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Phygital")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |
 **tokenId** | **kotlin.String**|  |

### Return type

**GetWeb3PhygitalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Phygital2"></a>
# **getWeb3Phygital2**
> GetWeb3Phygital2Response getWeb3Phygital2()

Phygitals you linked (with each redemption and its shipping address) and ones you redeemed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : GetWeb3Phygital2Response = apiInstance.getWeb3Phygital2()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Phygital2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Phygital2")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWeb3Phygital2Response**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Portfolio"></a>
# **getWeb3Portfolio**
> GetWeb3PortfolioResponse getWeb3Portfolio()

Your NFTs with value (Crossly floor, else recent sales) and cost (what a linked wallet paid), realised sales, and USD totals at each day’s coin price.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : GetWeb3PortfolioResponse = apiInstance.getWeb3Portfolio()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Portfolio")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Portfolio")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWeb3PortfolioResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3PortfolioTax"></a>
# **getWeb3PortfolioTax**
> GetWeb3PortfolioTaxResponse getWeb3PortfolioTax()

One calendar year of NFT disposals from your linked wallets as CSV text: acquired, sold, proceeds, cost basis, gain (coin and USD).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : GetWeb3PortfolioTaxResponse = apiInstance.getWeb3PortfolioTax()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3PortfolioTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3PortfolioTax")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWeb3PortfolioTaxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Profile"></a>
# **getWeb3Profile**
> GetWeb3ProfileResponse getWeb3Profile(address)

A wallet&#39;s public profile: NFTs held, open Crossly listings, and activity.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val address : kotlin.String = address_example // kotlin.String | 
try {
    val result : GetWeb3ProfileResponse = apiInstance.getWeb3Profile(address)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Profile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Profile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **kotlin.String**|  |

### Return type

**GetWeb3ProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Resolve"></a>
# **getWeb3Resolve**
> GetWeb3ResolveResponse getWeb3Resolve(chain, slug)

A collection&#39;s chain and contract from its readable URL slug (e.g. eth / boredapeyachtclub).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetWeb3ResolveResponse = apiInstance.getWeb3Resolve(chain, slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Resolve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Resolve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **slug** | **kotlin.String**|  |

### Return type

**GetWeb3ResolveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3SolanaCollectionTensorBid"></a>
# **getWeb3SolanaCollectionTensorBid**
> GetWeb3SolanaCollectionTensorBidResponse getWeb3SolanaCollectionTensorBid(collection)

A Solana collection’s Tensor bids (collection-wide and by trait), best first; price in lamports. Needs your Tensor key.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val collection : kotlin.String = collection_example // kotlin.String | 
try {
    val result : GetWeb3SolanaCollectionTensorBidResponse = apiInstance.getWeb3SolanaCollectionTensorBid(collection)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3SolanaCollectionTensorBid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3SolanaCollectionTensorBid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collection** | **kotlin.String**|  |

### Return type

**GetWeb3SolanaCollectionTensorBidResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWeb3Token"></a>
# **getWeb3Token**
> GetWeb3TokenResponse getWeb3Token(chain, contract, tokenId)

One NFT: metadata, traits, owner, open listings and offers, activity.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
val tokenId : kotlin.String = tokenId_example // kotlin.String | 
try {
    val result : GetWeb3TokenResponse = apiInstance.getWeb3Token(chain, contract, tokenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#getWeb3Token")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#getWeb3Token")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |
 **tokenId** | **kotlin.String**|  |

### Return type

**GetWeb3TokenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Activity"></a>
# **listWeb3Activity**
> ListWeb3ActivityResponse listWeb3Activity()

Listings, offers, sales and cancels in the Crossly book, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3ActivityResponse = apiInstance.listWeb3Activity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Activity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Activity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3ActivityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Alerts"></a>
# **listWeb3Alerts**
> ListWeb3AlertsResponse listWeb3Alerts()

Your NFT price alerts, with the cheapest open Crossly listing each one covers now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3AlertsResponse = apiInstance.listWeb3Alerts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Alerts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Alerts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3AlertsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Approvals"></a>
# **listWeb3Approvals**
> ListWeb3ApprovalsResponse listWeb3Approvals()

Your collections the OpenSea conduit is approved to move, per linked wallet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3ApprovalsResponse = apiInstance.listWeb3Approvals()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Approvals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Approvals")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3ApprovalsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Auctions"></a>
# **listWeb3Auctions**
> ListWeb3AuctionsResponse listWeb3Auctions()

Live English auctions on the Crossly book, ending soonest first, each with its top bid and the least the next bid can be.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3AuctionsResponse = apiInstance.listWeb3Auctions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Auctions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Auctions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3AuctionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3BrowseCollections"></a>
# **listWeb3BrowseCollections**
> ListWeb3BrowseCollectionsResponse listWeb3BrowseCollections()

Browse NFT collections by chain, category and name; sort hot (Crossly sales, listings, favourites), new, volume, floor or name.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3BrowseCollectionsResponse = apiInstance.listWeb3BrowseCollections()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3BrowseCollections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3BrowseCollections")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3BrowseCollectionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3BrowseTokens"></a>
# **listWeb3BrowseTokens**
> ListWeb3BrowseTokensResponse listWeb3BrowseTokens()

Hot NFTs: what is for sale on Crossly first, then tokens from the hottest collections.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3BrowseTokensResponse = apiInstance.listWeb3BrowseTokens()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3BrowseTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3BrowseTokens")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3BrowseTokensResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Bundles"></a>
# **listWeb3Bundles**
> ListWeb3BundlesResponse listWeb3Bundles()

Open bundle listings (2–30 NFTs for one price), newest first, by chain or by a contract any item is from.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3BundlesResponse = apiInstance.listWeb3Bundles()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Bundles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Bundles")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3BundlesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3CollectionHistory"></a>
# **listWeb3CollectionHistory**
> ListWeb3CollectionHistoryResponse listWeb3CollectionHistory(chain, contract)

Daily floor, sales, volume, holders and listed count for a collection, oldest first (up to 365 days).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    val result : ListWeb3CollectionHistoryResponse = apiInstance.listWeb3CollectionHistory(chain, contract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3CollectionHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3CollectionHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

**ListWeb3CollectionHistoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Collections"></a>
# **listWeb3Collections**
> ListWeb3CollectionsResponse listWeb3Collections()

Collections ranked by 30-day Crossly volume, with floor and listed count.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3CollectionsResponse = apiInstance.listWeb3Collections()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Collections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Collections")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3CollectionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3CreatorCollections"></a>
# **listWeb3CreatorCollections**
> ListWeb3CreatorCollectionsResponse listWeb3CreatorCollections()

Collections you are the creator of: your launches, and contracts you claimed by owning them.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3CreatorCollectionsResponse = apiInstance.listWeb3CreatorCollections()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3CreatorCollections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3CreatorCollections")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3CreatorCollectionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Drops"></a>
# **listWeb3Drops**
> ListWeb3DropsResponse listWeb3Drops()

Upcoming and live NFT drops (curated mints on the creator&#39;s own page), soonest first, with whether you asked to be reminded.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3DropsResponse = apiInstance.listWeb3Drops()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Drops")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Drops")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3DropsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3HolderPerks"></a>
# **listWeb3HolderPerks**
> ListWeb3HolderPerksResponse listWeb3HolderPerks()

Your holder perks: percent off your Crossly shop for holders of an NFT collection, best first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3HolderPerksResponse = apiInstance.listWeb3HolderPerks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3HolderPerks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3HolderPerks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3HolderPerksResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Launches"></a>
# **listWeb3Launches**
> ListWeb3LaunchesResponse listWeb3Launches()

Your launchpad collections (drafts and live), newest first, with minted count and phase.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3LaunchesResponse = apiInstance.listWeb3Launches()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Launches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Launches")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3LaunchesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Listings"></a>
# **listWeb3Listings**
> ListWeb3ListingsResponse listWeb3Listings()

Open NFT listings in the Crossly book — the cheapest per token.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3ListingsResponse = apiInstance.listWeb3Listings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Listings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Listings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3ListingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3MarketplaceKeys"></a>
# **listWeb3MarketplaceKeys**
> ListWeb3MarketplaceKeysResponse listWeb3MarketplaceKeys()

Your own marketplace API keys (last four characters only) and whether Crossly&#39;s key covers each marketplace.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3MarketplaceKeysResponse = apiInstance.listWeb3MarketplaceKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3MarketplaceKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3MarketplaceKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3MarketplaceKeysResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Nfts"></a>
# **listWeb3Nfts**
> ListWeb3NftsResponse listWeb3Nfts(chain, walletId, page, limit)

List the NFTs in your inventory, imported from your linked wallets.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val chain : kotlin.String = chain_example // kotlin.String | 
val walletId : kotlin.String = walletId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListWeb3NftsResponse = apiInstance.listWeb3Nfts(chain, walletId, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Nfts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Nfts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  | [optional] [enum: ethereum, base, polygon, arbitrum, optimism, solana]
 **walletId** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListWeb3NftsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Orders"></a>
# **listWeb3Orders**
> ListWeb3OrdersResponse listWeb3Orders()

Your orders in the Crossly book (listings and offers), any status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3OrdersResponse = apiInstance.listWeb3Orders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Orders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Orders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3OrdersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Purchases"></a>
# **listWeb3Purchases**
> ListWeb3PurchasesResponse listWeb3Purchases()

NFTs your linked wallets bought — on Crossly or any marketplace the chain feed saw — newest first, with price and whether you still hold each.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3PurchasesResponse = apiInstance.listWeb3Purchases()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Purchases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Purchases")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3PurchasesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Rankings"></a>
# **listWeb3Rankings**
> ListWeb3RankingsResponse listWeb3Rankings()

Collections by sales volume over 24h, 7d or 30d, in one coin: the ETH chains together, or Polygon / Solana on their own.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3RankingsResponse = apiInstance.listWeb3Rankings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Rankings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Rankings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3RankingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Reserved"></a>
# **listWeb3Reserved**
> ListWeb3BundlesResponse listWeb3Reserved()

Private listings reserved for one of your linked wallets — only you can see or buy them.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3BundlesResponse = apiInstance.listWeb3Reserved()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Reserved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Reserved")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3BundlesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Sales"></a>
# **listWeb3Sales**
> ListWeb3SalesResponse listWeb3Sales()

The latest NFT sales across the directory, from the chain (Seaport and Blur) and the Crossly book, newest first; page with &#x60;before&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3SalesResponse = apiInstance.listWeb3Sales()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Sales")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Sales")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3SalesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Search"></a>
# **listWeb3Search**
> ListWeb3SearchResponse listWeb3Search()

Find collections by contract address (every chain) or by name.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3SearchResponse = apiInstance.listWeb3Search()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Search")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Search")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3SearchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3SearchTokens"></a>
# **listWeb3SearchTokens**
> ListWeb3SearchTokensResponse listWeb3SearchTokens()

Find tokens by collection name and number: &#39;pudgy 42&#39;, &#39;Bored Ape #1234&#39;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3SearchTokensResponse = apiInstance.listWeb3SearchTokens()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3SearchTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3SearchTokens")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3SearchTokensResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Wallets"></a>
# **listWeb3Wallets**
> ListWeb3WalletsResponse listWeb3Wallets()

List your verified, linked wallets (EVM and Solana).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3WalletsResponse = apiInstance.listWeb3Wallets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Wallets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Wallets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3WalletsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWeb3Watchlist"></a>
# **listWeb3Watchlist**
> ListWeb3WatchlistResponse listWeb3Watchlist()

Your favourited NFTs, with the cheapest open Crossly listing and the last sale of each.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3WatchlistResponse = apiInstance.listWeb3Watchlist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#listWeb3Watchlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#listWeb3Watchlist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3WatchlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWeb3HolderPerk"></a>
# **updateWeb3HolderPerk**
> ListWeb3HolderPerksItem updateWeb3HolderPerk()

Set the percent off (100–5000 bps) holders of a collection get across your Crossly shop; one perk per collection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
try {
    val result : ListWeb3HolderPerksItem = apiInstance.updateWeb3HolderPerk()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#updateWeb3HolderPerk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#updateWeb3HolderPerk")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWeb3HolderPerksItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWeb3LaunchAllowlist"></a>
# **updateWeb3LaunchAllowlist**
> UpdateWeb3LaunchAllowlistResponse updateWeb3LaunchAllowlist(id)

Replace the early-phase allowlist (up to 10,000 wallets). EVM live launches get back &#x60;rootTx&#x60;, the setAllowlistRoot transaction for the owner wallet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateWeb3LaunchAllowlistResponse = apiInstance.updateWeb3LaunchAllowlist(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#updateWeb3LaunchAllowlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#updateWeb3LaunchAllowlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateWeb3LaunchAllowlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWeb3MarketplaceKey"></a>
# **updateWeb3MarketplaceKey**
> ListWeb3MarketplaceKeysItem updateWeb3MarketplaceKey(marketplace)

Save your own API key for a marketplace (checked against the marketplace first where it can be); stored encrypted.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = Web3Api()
val marketplace : kotlin.String = marketplace_example // kotlin.String | 
try {
    val result : ListWeb3MarketplaceKeysItem = apiInstance.updateWeb3MarketplaceKey(marketplace)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Web3Api#updateWeb3MarketplaceKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Web3Api#updateWeb3MarketplaceKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketplace** | **kotlin.String**|  | [enum: opensea, tensor, magic_eden, rarible]

### Return type

**ListWeb3MarketplaceKeysItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

