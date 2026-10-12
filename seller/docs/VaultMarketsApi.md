# VaultMarketsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVaultLend**](VaultMarketsApi.md#createVaultLend) | **POST** /v1/vault/{id}/lend | Turn lending on or off for a unit you own in the vault, optionally with your minimum borrow rate (APR in basis points). Returns &#x60;{ lendEnabled, minAprBps }&#x60;.
[**createVaultMarketAccount**](VaultMarketsApi.md#createVaultMarketAccount) | **POST** /v1/vault-markets/account | Open your account at the custodian partner (once). Returns &#x60;{ status }&#x60;; the custodian verifies it before it is active.
[**createVaultMarketAdminMark**](VaultMarketsApi.md#createVaultMarketAdminMark) | **POST** /v1/vault-markets/admin-marks | Upload your fund administrator&#39;s prices (&#x60;administrator&#x60;, &#x60;marks: [{ bookKey, day, cents }]&#x60;). Shown beside Crossly&#39;s marks and labelled as yours; they never change a Crossly figure.
[**createVaultMarketAdvance**](VaultMarketsApi.md#createVaultMarketAdvance) | **POST** /v1/vault-markets/advances | Take an advance against a vault unit that is listed for sale: paid into your custodian account, netted from the sale. Free for 60 days, then the pool rate. Needs a verified ID.
[**createVaultMarketAdvanceRelist**](VaultMarketsApi.md#createVaultMarketAdvanceRelist) | **POST** /v1/vault-markets/advances/{id}/relist | Relist an advance&#39;s unit at a new price (never so low its sale could not repay the advance).
[**createVaultMarketAgentDraftCancel**](VaultMarketsApi.md#createVaultMarketAgentDraftCancel) | **POST** /v1/vault-markets/agent/drafts/{id}/cancel | Throw a drafted order away (only while it is still a draft). Returns { ok, draft }.
[**createVaultMarketAgentWatch**](VaultMarketsApi.md#createVaultMarketAgentWatch) | **POST** /v1/vault-markets/agent/watches | Watch a book key: tell me once when its best bid, lowest ask, last trade or market price crosses a price (cents). Leave out direction for \&quot;crosses\&quot; (whichever way it has to move). Never trades. At most 50 live, each for 90 days.
[**createVaultMarketAlert**](VaultMarketsApi.md#createVaultMarketAlert) | **POST** /v1/vault-markets/alerts | Alert me when a key&#39;s market price goes above or below a price (fires once).
[**createVaultMarketAlertPrefTest**](VaultMarketsApi.md#createVaultMarketAlertPrefTest) | **POST** /v1/vault-markets/alert-prefs/test | Send yourself one test alert of a &#x60;kind&#x60; through your own switches. Returns &#x60;{ sent, kind, plan }&#x60;, where plan says per channel: send, off, quiet (held by quiet hours) or unavailable.
[**createVaultMarketAuctionLot**](VaultMarketsApi.md#createVaultMarketAuctionLot) | **POST** /v1/vault-markets/auctions/lots | Consign a stored, authenticated unit to the next weekly or premier event, with an optional opening price and reserve. The unit is held until the close. Returns &#x60;{ lotId, eventId, endsAt }&#x60;.
[**createVaultMarketAuctionLotBid**](VaultMarketsApi.md#createVaultMarketAuctionLotBid) | **POST** /v1/vault-markets/auctions/lots/{id}/bids | Leave or raise your maximum on a lot; the system bids for you up to it. A bid in the last 2 minutes extends the lot by 2 minutes. The winner&#39;s saved card is charged at the close through the order book. ID needed above $10,000.
[**createVaultMarketAuctionLotWithdraw**](VaultMarketsApi.md#createVaultMarketAuctionLotWithdraw) | **POST** /v1/vault-markets/auctions/lots/{id}/withdraw | Withdraw your lot before any bid; the unit goes back on your shelf. Returns &#x60;{ ok }&#x60;.
[**createVaultMarketBlock**](VaultMarketsApi.md#createVaultMarketBlock) | **POST** /v1/vault-markets/blocks | Place a block buy for an entity: one order booked to the first sub-account in &#x60;plan&#x60; (it pays from its custodian account), split across every sub-account in the plan at the average price, fees included, once it is done and the custodian confirmed each payment. Each share&#39;s cash moves between the entity&#39;s own custodian accounts; its units move only after that settles. Every sub-account must be one you may trade, and its share must fit its limits.
[**createVaultMarketBlockAllocate**](VaultMarketsApi.md#createVaultMarketBlockAllocate) | **POST** /v1/vault-markets/blocks/{orderId}/allocate | Allocate a done block now (the keeper does it too). Returns &#x60;{ outcome, block }&#x60;: allocated, waiting (a payment or transfer is not settled yet), nothing_filled or none.
[**createVaultMarketBullionFamilyPeg**](VaultMarketsApi.md#createVaultMarketBullionFamilyPeg) | **POST** /v1/vault-markets/bullion/family-pegs | Set a family-wide spot-pegged quote: one \&quot;any 1 oz gold coin\&quot; quote resting on each product book of a bullion family at the chosen condition (DS, VNDS or Used). When any leg fills it comes off the others and goes back on only for what is left; two fills at once are settled one at a time against what is left. A bid pays from your custodian account. Replaces your live family quote on the same family, condition and side. ID required.
[**createVaultMarketBullionPeg**](VaultMarketsApi.md#createVaultMarketBullionPeg) | **POST** /v1/vault-markets/bullion/pegs | Set a spot-pegged maker quote on a bullion book key: \&quot;spot plus or minus N cents\&quot; or \&quot;plus or minus N basis points\&quot;, with an optional floor and cap. It rests as a pro limit order re-priced every spot tick and is pulled while spot is stale. Replaces your live quote on the same key and side. ID required.
[**createVaultMarketCollectionWorthWatch**](VaultMarketsApi.md#createVaultMarketCollectionWorthWatch) | **POST** /v1/vault-markets/collection-worth/watch | Watch every collection item that sits on a vault book key (up to the watchlist cap). Returns &#x60;{ watched, skipped }&#x60;.
[**createVaultMarketCreatorAttribution**](VaultMarketsApi.md#createVaultMarketCreatorAttribution) | **POST** /v1/vault-markets/creators/attribution | Use a creator code: the creator earns a capped share of the fee Crossly keeps on your Vault Markets trades for a limited window (paid by Crossly, never by you). Only for people new to Vault Markets, once, and never your own code.
[**createVaultMarketCreatorCohostInviteRespond**](VaultMarketsApi.md#createVaultMarketCreatorCohostInviteRespond) | **POST** /v1/vault-markets/creators/cohost-invites/{id}/respond | For creators: accept or decline an invite to co-host a Market Open launch show (&#x60;accept&#x60; true or false). Accepting needs your vault room verified and adds you to the show as a co-host; your room and the Commons then say you co-host it, with the creator-programme disclosure when it applies.
[**createVaultMarketCreditRepay**](VaultMarketsApi.md#createVaultMarketCreditRepay) | **POST** /v1/vault-markets/credit/{id}/repay | Repay from your custodian account, interest first. Omit &#x60;amountCents&#x60; to repay everything; pass &#x60;requestId&#x60; to make a retry safe. Repaid in full, the items are free.
[**createVaultMarketDcmLink**](VaultMarketsApi.md#createVaultMarketDcmLink) | **POST** /v1/vault-markets/dcm/link | Link a partner exchange account to your account (or to a firm sub-account you manage, &#x60;subaccountId&#x60;) so Crossly can show its positions: &#x60;accountRef&#x60; (the account id there) and &#x60;code&#x60; (the one-time link code it gave you). The partner must confirm the code; the code is never stored. Read-only: Crossly never trades on it.
[**createVaultMarketDcmUnlink**](VaultMarketsApi.md#createVaultMarketDcmUnlink) | **POST** /v1/vault-markets/dcm/unlink | Unlink the partner exchange account from your account (or the firm sub-account &#x60;subaccountId&#x60;): Crossly stops reading it and its hedges leave portfolio margin.
[**createVaultMarketDealerApply**](VaultMarketsApi.md#createVaultMarketDealerApply) | **POST** /v1/vault-markets/dealer/apply | Apply to be a dealer (ID check first). Ops review; approved dealers get raised limits and their bids show as dealer bids.
[**createVaultMarketDealerBid**](VaultMarketsApi.md#createVaultMarketDealerBid) | **POST** /v1/vault-markets/dealer/bids | Place a standing dealer bid: a resting GTC/GTD limit buy, flagged as a dealer bid. Approved dealers only.
[**createVaultMarketDealerPool**](VaultMarketsApi.md#createVaultMarketDealerPool) | **POST** /v1/vault-markets/dealer/pools | Open a curve pool on a key (approved dealers, ID checked): linear (delta in cents) or exponential (delta in bps), spot, fee, levels per side, units it may sell, and a buy budget from your custodian account. Its ladder goes up at once.
[**createVaultMarketDealerPoolClose**](VaultMarketsApi.md#createVaultMarketDealerPoolClose) | **POST** /v1/vault-markets/dealer/pools/{id}/close | Close a curve pool: its legs come off the book; what filled stays filled.
[**createVaultMarketDealerPoolPreview**](VaultMarketsApi.md#createVaultMarketDealerPoolPreview) | **POST** /v1/vault-markets/dealer/pools/preview | The bids and asks a set of curve settings would show, and why each side stops where it does. Places nothing.
[**createVaultMarketDeposit**](VaultMarketsApi.md#createVaultMarketDeposit) | **POST** /v1/vault-markets/deposits | Open a ship-in deposit for an ungraded catalogue item (&#x60;skuId&#x60;, &#x60;variantId&#x60;, &#x60;condition&#x60; DS / VNDS / Used). It is inbound until the vault receives and checks it, then stored in your name. Returns &#x60;{ vaultItem: { id, status } }&#x60;.
[**createVaultMarketDonation**](VaultMarketsApi.md#createVaultMarketDonation) | **POST** /v1/vault-markets/donations | Give a unit to Crossly Cares (once the charity can receive; otherwise its gate message). Returns &#x60;{ id, markCents }&#x60;.
[**createVaultMarketEntity**](VaultMarketsApi.md#createVaultMarketEntity) | **POST** /v1/vault-markets/entities | Open an entity account: you become its admin and the custodian partner starts KYB (its own flow; Crossly keeps only its reference). Needs a verified ID and the custodian (503 names what is missing).
[**createVaultMarketEntityEcp**](VaultMarketsApi.md#createVaultMarketEntityEcp) | **POST** /v1/vault-markets/entities/{id}/ecp | Admin: record the entity&#39;s attestation that it is an eligible contract participant. Raising its caps is still an ops decision.
[**createVaultMarketEntityHalt**](VaultMarketsApi.md#createVaultMarketEntityHalt) | **POST** /v1/vault-markets/entities/{id}/halts | Admin or risk: the firm kill switch. Halts the entity (no &#x60;subaccountId&#x60;) or one sub-account: open orders on it are cancelled and no new ones are placed until cleared.
[**createVaultMarketEntityHaltClear**](VaultMarketsApi.md#createVaultMarketEntityHaltClear) | **POST** /v1/vault-markets/entities/{id}/halts/{haltId}/clear | Admin or risk: lift a firm halt.
[**createVaultMarketEntityInvitation**](VaultMarketsApi.md#createVaultMarketEntityInvitation) | **POST** /v1/vault-markets/entities/{id}/invitation | Accept or decline an invitation (&#x60;accept&#x60;). Trading, admin and risk roles need a verified ID to accept.
[**createVaultMarketEntityKyb**](VaultMarketsApi.md#createVaultMarketEntityKyb) | **POST** /v1/vault-markets/entities/{id}/kyb | Refresh the entity&#39;s KYB status from the custodian (and its onboarding link while KYB is open).
[**createVaultMarketEntityMember**](VaultMarketsApi.md#createVaultMarketEntityMember) | **POST** /v1/vault-markets/entities/{id}/members | Admin: invite a Crossly user by email as admin, trader, risk, ops or viewer (a viewer can never place an order), with optional limits and sub-accounts.
[**createVaultMarketEntitySubaccount**](VaultMarketsApi.md#createVaultMarketEntitySubaccount) | **POST** /v1/vault-markets/entities/{id}/subaccounts | Admin: open a sub-account once the custodian approved the entity; its limits are held to the entity&#39;s caps.
[**createVaultMarketEntitySubaccountClose**](VaultMarketsApi.md#createVaultMarketEntitySubaccountClose) | **POST** /v1/vault-markets/entities/{id}/subaccounts/{subId}/close | Admin: close a sub-account that holds nothing and has no open orders.
[**createVaultMarketFollowCopyWatchAlertRead**](VaultMarketsApi.md#createVaultMarketFollowCopyWatchAlertRead) | **POST** /v1/vault-markets/follows/copy-watch/alerts/read | Mark every copy-watch alert read. Returns &#x60;{ marked }&#x60;.
[**createVaultMarketGift**](VaultMarketsApi.md#createVaultMarketGift) | **POST** /v1/vault-markets/gifts | Give a unit in your vault to another Crossly user (by @username or email). It stays on its shelf; they have 7 days to accept. ID needed above $1,000 at the mark. Returns &#x60;{ id, expiresAt }&#x60;.
[**createVaultMarketGiftAccept**](VaultMarketsApi.md#createVaultMarketGiftAccept) | **POST** /v1/vault-markets/gifts/{id}/accept | Accept a gift: the unit becomes yours in place. Returns &#x60;{ status }&#x60;.
[**createVaultMarketGiftCancel**](VaultMarketsApi.md#createVaultMarketGiftCancel) | **POST** /v1/vault-markets/gifts/{id}/cancel | Cancel a gift you sent before it is accepted. Returns &#x60;{ status }&#x60;.
[**createVaultMarketGiftDecline**](VaultMarketsApi.md#createVaultMarketGiftDecline) | **POST** /v1/vault-markets/gifts/{id}/decline | Decline a gift: the unit stays with the giver. Returns &#x60;{ status }&#x60;.
[**createVaultMarketGradeToVault**](VaultMarketsApi.md#createVaultMarketGradeToVault) | **POST** /v1/vault-markets/grade-to-vault | Start Grade to Vault on one item (&#x60;source&#x60; inventory or vault_unit). With &#x60;runId&#x60; the grading slot is booked at once (free; your saved card is charged only if the run locks). Nothing is listed until you confirm a price after the grade.
[**createVaultMarketGradeToVaultBook**](VaultMarketsApi.md#createVaultMarketGradeToVaultBook) | **POST** /v1/vault-markets/grade-to-vault/{id}/book | Book (or re-book) the grading slot of a flow still at \&quot;picked\&quot;. Answers 503 naming GRADING_HUB_ADDRESS when runs are not open.
[**createVaultMarketGradeToVaultCancel**](VaultMarketsApi.md#createVaultMarketGradeToVaultCancel) | **POST** /v1/vault-markets/grade-to-vault/{id}/cancel | Stop the flow before the card goes to the grader (still picked, or its slot only reserved: nothing was charged).
[**createVaultMarketGradeToVaultKeep**](VaultMarketsApi.md#createVaultMarketGradeToVaultKeep) | **POST** /v1/vault-markets/grade-to-vault/{id}/keep | Keep the graded unit in your vault without listing it. The flow ends; list it any time from the vault.
[**createVaultMarketGradeToVaultList**](VaultMarketsApi.md#createVaultMarketGradeToVaultList) | **POST** /v1/vault-markets/grade-to-vault/{id}/list | Confirm the price for the grade the unit came back with (&#x60;confirm: true&#x60;, &#x60;gradeKey&#x60; must match the unit). Pre-trade risk, the price band and the ID line apply, then one shelf ask is placed on the Crossly order book.
[**createVaultMarketGradeToVaultShipped**](VaultMarketsApi.md#createVaultMarketGradeToVaultShipped) | **POST** /v1/vault-markets/grade-to-vault/{id}/shipped | You mailed the card to the grading hub (an inventory card, once its run locked).
[**createVaultMarketGrading**](VaultMarketsApi.md#createVaultMarketGrading) | **POST** /v1/vault-markets/grading | Send a raw vault unit on the grading hub&#39;s shelf to a Grading Run (&#x60;runId&#x60;). It is held until it comes back, graded, to the same vault item. The slot is free; your saved card is charged only if the run locks.
[**createVaultMarketGradingPull**](VaultMarketsApi.md#createVaultMarketGradingPull) | **POST** /v1/vault-markets/grading/{submissionId}/pull | Pull a vault unit out of its run before the run locks (nothing was charged). It goes back on the shelf.
[**createVaultMarketHallLoan**](VaultMarketsApi.md#createVaultMarketHallLoan) | **POST** /v1/vault-markets/hall/loans | Lend a unit in your Crossly vault to the Hall of Grails: { vaultItemId, credit: &#39;name&#39; | &#39;anonymous&#39; }. A standing loan of display rights only: the unit goes on a plinth, under a plate naming you (or \&quot;a collector\&quot;), in every weekly exhibition whose category it fits. It never moves and stays yours to list, sell or withdraw. Earns reputation per exhibition shown; no cash. Resumes a loan you opted out of while it still shows.
[**createVaultMarketHallLoanCredit**](VaultMarketsApi.md#createVaultMarketHallLoanCredit) | **POST** /v1/vault-markets/hall/loans/{id}/credit | Change how the plate on a lent unit&#39;s plinth names you, from now: { credit: &#39;name&#39; } (your display name) or { credit: &#39;anonymous&#39; } (\&quot;a collector\&quot;).
[**createVaultMarketHallLoanOptOut**](VaultMarketsApi.md#createVaultMarketHallLoanOptOut) | **POST** /v1/vault-markets/hall/loans/{id}/opt-out | Opt a Hall of Grails loan out, at any time. A unit on a plinth this week finishes this exhibition (status ending, showingUntil); otherwise the loan ends now (status ended).
[**createVaultMarketIdentityStart**](VaultMarketsApi.md#createVaultMarketIdentityStart) | **POST** /v1/vault-markets/identity/start | Start (or resume) the one-time ID check the money features and larger orders need. Returns &#x60;{ url }&#x60; to open, or &#x60;{ alreadyVerified: true }&#x60;.
[**createVaultMarketIndex**](VaultMarketsApi.md#createVaultMarketIndex) | **POST** /v1/vault-markets/indexes | Make an index of your own: 1 to 50 book keys, weighted by mark or equally. Up to 10 per account.
[**createVaultMarketIndexBuy**](VaultMarketsApi.md#createVaultMarketIndexBuy) | **POST** /v1/vault-markets/indexes/{slug}/buy | Buy the basket: one limit buy per key in the index for 1-5 whole units each, at most &#x60;maxBpsOverMark&#x60; over each key&#39;s mark, IOC or GTC. Every unit is a real item that lands in your vault. Idempotent on &#x60;clientBasketId&#x60;; returns a result per key.
[**createVaultMarketIndexComplaint**](VaultMarketsApi.md#createVaultMarketIndexComplaint) | **POST** /v1/vault-markets/index-complaints | File a complaint about an index or the method (&#x60;slug&#x60; optional). Every complaint is answered. Returns &#x60;{ id, status, createdAt }&#x60;.
[**createVaultMarketIndexConsultationComment**](VaultMarketsApi.md#createVaultMarketIndexConsultationComment) | **POST** /v1/vault-markets/index-consultations/{id}/comments | Comment on an open consultation (5 to 5,000 characters; up to 5 per person). Comments are published without your name. Returns &#x60;{ ok }&#x60;.
[**createVaultMarketInstantExit**](VaultMarketsApi.md#createVaultMarketInstantExit) | **POST** /v1/vault-markets/instant-exit | Sell a unit now at the quoted price: a sell IOC at &#x60;priceCents&#x60; through the pro engine. Refused, with the new quote, if the best bid dropped below it. Crossly never buys or funds it.
[**createVaultMarketJoint**](VaultMarketsApi.md#createVaultMarketJoint) | **POST** /v1/vault-markets/joint | Open a joint vault (ID first): you hold full rights and accept the current joint terms. &#x60;invite&#x60; sends invitations (@username or email, each with view, trade or full rights). Returns &#x60;{ id, status, invited }&#x60;.
[**createVaultMarketJointClose**](VaultMarketsApi.md#createVaultMarketJointClose) | **POST** /v1/vault-markets/joint/{id}/close | Close the joint vault (full rights): open joint orders are cancelled and every unit goes back to its owner. Returns &#x60;{ status, unitsReturned }&#x60;.
[**createVaultMarketJointInvite**](VaultMarketsApi.md#createVaultMarketJointInvite) | **POST** /v1/vault-markets/joint/{id}/invite | Invite a Crossly user (full rights only). They have 14 days and show ID to join. Returns &#x60;{ userId, rights, expiresAt }&#x60;.
[**createVaultMarketJointMemberRemove**](VaultMarketsApi.md#createVaultMarketJointMemberRemove) | **POST** /v1/vault-markets/joint/{id}/members/{userId}/remove | Remove a member (full rights), or leave when userId is you. Their units go back to their own account and their joint orders are cancelled. Returns &#x60;{ userId, status, unitsReturned, jointStatus }&#x60;.
[**createVaultMarketJointMemberRight**](VaultMarketsApi.md#createVaultMarketJointMemberRight) | **POST** /v1/vault-markets/joint/{id}/members/{userId}/rights | Set a member rights to view, trade or full (full rights only; the vault always keeps a full member). Returns &#x60;{ userId, rights }&#x60;.
[**createVaultMarketJointRespond**](VaultMarketsApi.md#createVaultMarketJointRespond) | **POST** /v1/vault-markets/joint/{id}/respond | Accept (ID first; accepts the current joint terms) or decline an invitation. Returns &#x60;{ status }&#x60;.
[**createVaultMarketJointTerm**](VaultMarketsApi.md#createVaultMarketJointTerm) | **POST** /v1/vault-markets/joint/{id}/terms | Accept the current joint terms (needed to trade after the terms version changes). Returns &#x60;{ termsVersion }&#x60;.
[**createVaultMarketJointTrade**](VaultMarketsApi.md#createVaultMarketJointTrade) | **POST** /v1/vault-markets/joint/{id}/trades | Place a limit order for the joint vault (trade or full rights, ID shown). A buy (bookKey) is placed on you, paid from your own Vault Markets account, and what it buys is booked to the joint vault. A sell (vaultItemId of a unit in it) is placed on the unit owner of record, who gets the proceeds; pre-trade checks run against you too. Returns &#x60;{ tradeId, side, bookKey, ownerUserId, order }&#x60;.
[**createVaultMarketJointTradeCancel**](VaultMarketsApi.md#createVaultMarketJointTradeCancel) | **POST** /v1/vault-markets/joint/{id}/trades/{tradeId}/cancel | Cancel a working joint order (trade or full rights); what filled stays filled. Returns &#x60;{ tradeId, order }&#x60;.
[**createVaultMarketJointUnit**](VaultMarketsApi.md#createVaultMarketJointUnit) | **POST** /v1/vault-markets/joint/{id}/units | Put units you own into the joint vault (each stored and free). They keep you as owner of record and stay on the shelf. Returns &#x60;{ added, vaultItemIds }&#x60;.
[**createVaultMarketJointUnitRemove**](VaultMarketsApi.md#createVaultMarketJointUnitRemove) | **POST** /v1/vault-markets/joint/{id}/units/remove | Take units out of the joint vault, back to their owner own account (yours at any rights; anyone else with full rights). Returns &#x60;{ removed, vaultItemIds }&#x60;.
[**createVaultMarketLargeTraderReportFile**](VaultMarketsApi.md#createVaultMarketLargeTraderReportFile) | **POST** /v1/vault-markets/large-trader-reports/{id}/file | File (or amend, or refile) a large-trader report: why you hold it (purpose), who you act for, other accounts you control, whether you plan to add, and a statement of 20+ characters. Returns the report.
[**createVaultMarketLearnQuiz**](VaultMarketsApi.md#createVaultMarketLearnQuiz) | **POST** /v1/vault-markets/learn/{concept}/quiz | Answer a concept&#39;s quiz (&#x60;answers&#x60;: the chosen choice index per question). Graded on the server; 5 tries an hour.
[**createVaultMarketLiveStreamFeaturedLot**](VaultMarketsApi.md#createVaultMarketLiveStreamFeaturedLot) | **POST** /v1/vault-markets/live-streams/{id}/featured-lot | Feature an open lot on your live show (or &#x60;lotId: null&#x60; to take it off). Viewers hear LIVE_PIN_CHANGED. Returns &#x60;{ ok }&#x60;.
[**createVaultMarketLoan**](VaultMarketsApi.md#createVaultMarketLoan) | **POST** /v1/vault-markets/loans | Borrow against stored vault units: they are pledged (no listing, lending or withdrawal) and the market pool lends &#x60;amountCents&#x60; into your custodian account. Needs a verified ID.
[**createVaultMarketLoanRecall**](VaultMarketsApi.md#createVaultMarketLoanRecall) | **POST** /v1/vault-markets/loans/{id}/recall | Recall a lent unit: the short has 3 days to return one. Returns &#x60;{ recallDueAt }&#x60;.
[**createVaultMarketLoanUnit**](VaultMarketsApi.md#createVaultMarketLoanUnit) | **POST** /v1/vault-markets/loans/{id}/units | Pledge more stored units to a loan (answers a loan call, or makes room).
[**createVaultMarketLoanUnitRelease**](VaultMarketsApi.md#createVaultMarketLoanUnitRelease) | **POST** /v1/vault-markets/loans/{id}/units/{vaultItemId}/release | Free one pledged unit, if what is owed still fits inside the other units&#39; limit.
[**createVaultMarketLoanUnitSell**](VaultMarketsApi.md#createVaultMarketLoanUnitSell) | **POST** /v1/vault-markets/loans/{id}/units/{vaultItemId}/sell | Sell a pledged unit to repay its loan: it is listed at &#x60;priceCents&#x60; (at least the sale floor) and stays pledged until it sells; the proceeds repay the loan first and the rest is yours. Calling it again re-prices it.
[**createVaultMarketLocate**](VaultMarketsApi.md#createVaultMarketLocate) | **POST** /v1/vault-markets/locates | Hold up to &#x60;qty&#x60; lendable units of &#x60;bookKey&#x60; for 15 minutes so a short can open against them (&#x60;termDays&#x60; 30/90 for a term loan). Needs lending (VAULT_LENDING_TERMS_VERSION) and the ID check. Returns the locate with how many units it holds.
[**createVaultMarketLong**](VaultMarketsApi.md#createVaultMarketLong) | **POST** /v1/vault-markets/longs | Buy &#x60;units&#x60; units (default 1; at most 25/10/3/1 by liquidity tier A/B/C/D) into your vault with leverage (up to 2x) from the market staking pool, paying up to &#x60;maxCents&#x60; each. A partial fill opens with the units bought and the rest is cancelled. Returns &#x60;{ positionId, matched, units }&#x60;.
[**createVaultMarketMidpoint**](VaultMarketsApi.md#createVaultMarketMidpoint) | **POST** /v1/vault-markets/midpoint | A hidden block order that trades only at the firm-book midpoint, with another midpoint order of at least your minimum size.
[**createVaultMarketMidpointCancel**](VaultMarketsApi.md#createVaultMarketMidpointCancel) | **POST** /v1/vault-markets/midpoint/{id}/cancel | Cancel a midpoint order.
[**createVaultMarketMmDmm**](VaultMarketsApi.md#createVaultMarketMmDmm) | **POST** /v1/vault-markets/mm/dmm | Apply to be the designated market maker on a tier B or C key. Ops approves; one per key.
[**createVaultMarketMmLeave**](VaultMarketsApi.md#createVaultMarketMmLeave) | **POST** /v1/vault-markets/mm/{id}/leave | Leave a market-maker programme.
[**createVaultMarketMmLp**](VaultMarketsApi.md#createVaultMarketMmLp) | **POST** /v1/vault-markets/mm/lp | Join a key as a Registered Liquidity Provider (ID needed). Meeting coverage earns the LP rates.
[**createVaultMarketMmMassCancel**](VaultMarketsApi.md#createVaultMarketMmMassCancel) | **POST** /v1/vault-markets/mm/mass-cancel | Cancel every open order (one key, or only quotes) and every resting leg in one statement: nothing fills between the first cancel and the last.
[**createVaultMarketMmMmpReset**](VaultMarketsApi.md#createVaultMarketMmMmpReset) | **POST** /v1/vault-markets/mm/mmp/reset | End a market-maker protection freeze early.
[**createVaultMarketOpeningWaitlist**](VaultMarketsApi.md#createVaultMarketOpeningWaitlist) | **POST** /v1/vault-markets/opening/{slug}/waitlist | Join a key&#39;s waitlist, optionally with a friend&#39;s invite code (&#x60;ref&#x60;). Inviting moves you up the queue; nobody is paid. Returns your place and your own code.
[**createVaultMarketP2pLoanCall**](VaultMarketsApi.md#createVaultMarketP2pLoanCall) | **POST** /v1/vault-markets/p2p/loans/{id}/call | Lender: call the loan (once it is a day old). A refinancing auction runs for about 30 hours, the rate a new lender gets climbing to the ceiling; repaid or refinanced, you are paid in full; neither by the end, the unit moves to your vault.
[**createVaultMarketP2pLoanCancelCall**](VaultMarketsApi.md#createVaultMarketP2pLoanCancelCall) | **POST** /v1/vault-markets/p2p/loans/{id}/cancel-call | Lender: take back your call before any other lender has taken the loan over. The refinancing auction stops and the loan carries on as before on its terms.
[**createVaultMarketP2pLoanRefiAuction**](VaultMarketsApi.md#createVaultMarketP2pLoanRefiAuction) | **POST** /v1/vault-markets/p2p/loans/{id}/refi-auction | Borrower: look for a cheaper lender. A refinancing auction runs for &#x60;hours&#x60; (1-72, default 24); the rate a new lender gets climbs from &#x60;startAprBps&#x60; (default half the loan rate) to just under the loan rate now. The first lender to take it pays your lender off and the loan carries on at that lower rate. Nobody by the end: nothing changes.
[**createVaultMarketP2pLoanRefiAuctionCancel**](VaultMarketsApi.md#createVaultMarketP2pLoanRefiAuctionCancel) | **POST** /v1/vault-markets/p2p/loans/{id}/refi-auction/cancel | Borrower: stop looking for a cheaper lender before anyone has taken the loan over. The loan carries on unchanged.
[**createVaultMarketP2pLoanRefinance**](VaultMarketsApi.md#createVaultMarketP2pLoanRefinance) | **POST** /v1/vault-markets/p2p/loans/{id}/refinance | Take over a loan in a refinancing auction (a lender call or a borrower search for a cheaper lender): you pay the old lender everything owed now (refused above &#x60;maxPayoffCents&#x60;), which becomes your loan to the same borrower at the auction rate now. Needs a verified ID, an active account and the current lending terms. Pass &#x60;requestId&#x60; to make a retry safe.
[**createVaultMarketP2pLoanRepay**](VaultMarketsApi.md#createVaultMarketP2pLoanRepay) | **POST** /v1/vault-markets/p2p/loans/{id}/repay | Borrower: repay from your custodian account to the lender. Without &#x60;amountCents&#x60;, in full (principal plus interest to the second; the unit is free once the custodian has it). With &#x60;amountCents&#x60; below what is owed, a part payment: interest first, then principal, at least the interest owed now and at least $1; the loan stays open on the principal left. Pass &#x60;requestId&#x60; to make a retry safe.
[**createVaultMarketP2pOffer**](VaultMarketsApi.md#createVaultMarketP2pOffer) | **POST** /v1/vault-markets/p2p/offers | Offer to lend: &#x60;principalCents&#x60; per loan at &#x60;aprBps&#x60; a year against an item (&#x60;bookKey&#x60;) or one unit (&#x60;vaultItemId&#x60;), for up to &#x60;maxLoans&#x60; loans, lasting &#x60;expiresInDays&#x60; (default 90). Nothing is held: the custodian pays from your own account when a borrower takes it. Needs a verified ID, an active account and the current lending terms.
[**createVaultMarketP2pOfferCancel**](VaultMarketsApi.md#createVaultMarketP2pOfferCancel) | **POST** /v1/vault-markets/p2p/offers/{id}/cancel | Withdraw one of your open offers. Loans already taken from it carry on.
[**createVaultMarketP2pOfferTake**](VaultMarketsApi.md#createVaultMarketP2pOfferTake) | **POST** /v1/vault-markets/p2p/offers/{id}/take | Borrow: take an offer against one of your stored vault units (&#x60;vaultItemId&#x60;). The unit is pledged (no listing, lending or withdrawal) and the principal is paid into your custodian account. Interest accrues by the second; repay any time. Pass &#x60;requestId&#x60; to make a retry safe.
[**createVaultMarketPaperMissionMarkCheck**](VaultMarketsApi.md#createVaultMarketPaperMissionMarkCheck) | **POST** /v1/vault-markets/paper/missions/mark-check | Answer the \&quot;Read the mark\&quot; mission: the quality letter (A, B or C) you read on a market page, checked against the stored mark. One answer per market, 10 a day. Returns &#x60;{ bookKey, answer, correct, quality, mission, next }&#x60;.
[**createVaultMarketPaperOrder**](VaultMarketsApi.md#createVaultMarketPaperOrder) | **POST** /v1/vault-markets/paper/orders | Place a paper order (play money only). It takes visible real liquidity now at book prices with the taker fee simulated; a GTC limit rests the rest with a queue-position estimate, filled later as the real tape reaches it. Sells only paper units you hold (no paper shorts). Never touches the real book. Returns &#x60;{ order, fills }&#x60;.
[**createVaultMarketPaperOrderCancel**](VaultMarketsApi.md#createVaultMarketPaperOrderCancel) | **POST** /v1/vault-markets/paper/orders/{id}/cancel | Cancel a working paper order: the play cash or paper units it held come back. Returns &#x60;{ order }&#x60;.
[**createVaultMarketPaperReset**](VaultMarketsApi.md#createVaultMarketPaperReset) | **POST** /v1/vault-markets/paper/reset | Reset your paper account to $10,000 of play money: working paper orders are cancelled, paper positions cleared, and your leaderboard week starts again. Once a day.
[**createVaultMarketPartnerApply**](VaultMarketsApi.md#createVaultMarketPartnerApply) | **POST** /v1/vault-markets/partners/apply | Apply as a Vault Drop-off Partner (a card shop that takes walk-ins for the vault). Needs the one-time ID check; ops approve.
[**createVaultMarketPartnerBatch**](VaultMarketsApi.md#createVaultMarketPartnerBatch) | **POST** /v1/vault-markets/partners/batches | An approved partner sends walk-ins in under its code: each item (catalogue variant, condition, grade, photos) becomes an inbound vault unit; the box gets one prepaid label. The partner earns a capped share of Crossly&#39;s fee on each unit&#39;s first sale.
[**createVaultMarketPoolStake**](VaultMarketsApi.md#createVaultMarketPoolStake) | **POST** /v1/vault-markets/pool/stakes | Stake CBX you hold at the custodian into the market pool (base units, as a string). Returns &#x60;{ stakeId, shares }&#x60;.
[**createVaultMarketPoolStakeUnstake**](VaultMarketsApi.md#createVaultMarketPoolStakeUnstake) | **POST** /v1/vault-markets/pool/stakes/{id}/unstake | Unstake: paid out after the 7-day cooldown. Returns &#x60;{ cooldownUntil }&#x60;.
[**createVaultMarketPortfolioMarginEnroll**](VaultMarketsApi.md#createVaultMarketPortfolioMarginEnroll) | **POST** /v1/vault-markets/portfolio-margin/enroll | Admin: put a firm sub-account under portfolio margin. Needs VAULT_LEVERAGE_VENUE, your ID, an ECP-attested entity that passed KYB, and the minimum equity. Its positions are then margined on the whole account, recalculated every 5 minutes; calls and auctions are unchanged. Audited.
[**createVaultMarketPortfolioMarginLeave**](VaultMarketsApi.md#createVaultMarketPortfolioMarginLeave) | **POST** /v1/vault-markets/portfolio-margin/leave | Admin: take a firm sub-account off portfolio margin. Each position is then held to its own tier floors again and may be called at once. Audited.
[**createVaultMarketPortfolioMarginWhatIf**](VaultMarketsApi.md#createVaultMarketPortfolioMarginWhatIf) | **POST** /v1/vault-markets/portfolio-margin/what-if | The portfolio margin requirement of a firm sub-account before and after a trade (&#x60;bookKey&#x60;, &#x60;side&#x60; buy or sell, &#x60;units&#x60;), at the Crossly mark with fees left out. Changes nothing.
[**createVaultMarketPositionCancel**](VaultMarketsApi.md#createVaultMarketPositionCancel) | **POST** /v1/vault-markets/positions/{id}/cancel | Cancel the working order: an unfilled opening order cancels the position; an unfilled cover or close leaves it open. Returns &#x60;{ ok }&#x60;.
[**createVaultMarketPositionClose**](VaultMarketsApi.md#createVaultMarketPositionClose) | **POST** /v1/vault-markets/positions/{id}/close | Close a leveraged long: all its units, or &#x60;units&#x60; of them, each sold for at least &#x60;minCents&#x60;; each sale repays the pool first.
[**createVaultMarketPositionCollateral**](VaultMarketsApi.md#createVaultMarketPositionCollateral) | **POST** /v1/vault-markets/positions/{id}/collateral | Answer a margin call: a short posts more collateral (USD, or CBX at half value); a leveraged long pays down its pool loan. Returns the position.
[**createVaultMarketPositionCover**](VaultMarketsApi.md#createVaultMarketPositionCover) | **POST** /v1/vault-markets/positions/{id}/cover | Cover a short: all its units, or &#x60;units&#x60; of them, each buying any unit of the key into the vault for up to &#x60;maxCents&#x60;; each goes back to its lender.
[**createVaultMarketPriceWidget**](VaultMarketsApi.md#createVaultMarketPriceWidget) | **POST** /v1/vault-markets/price-widgets | Make a price widget for one vault market (&#x60;kind&#x60; mark + &#x60;bookKey&#x60;) or one public index (&#x60;kind&#x60; index + &#x60;indexSlug&#x60;): range, layout (compact or chart), theme (auto, light, dark), optionally your own affiliate code for the link back and the sites allowed to show it (empty &#x3D; any). Returns the widget with its snippets.
[**createVaultMarketPriceWidgetPreview**](VaultMarketsApi.md#createVaultMarketPriceWidgetPreview) | **POST** /v1/vault-markets/price-widgets/preview | What a widget would show before you save it: &#x60;view&#x60; (value, move, quality, n, as-of, link back) and &#x60;html&#x60;, the exact page the iframe serves. Nothing is stored.
[**createVaultMarketProBracket**](VaultMarketsApi.md#createVaultMarketProBracket) | **POST** /v1/vault-markets/pro/brackets | A buy order with a take-profit and/or stop-loss attached; the exits arm as an OCO pair for what the entry fills.
[**createVaultMarketProLinkCancel**](VaultMarketsApi.md#createVaultMarketProLinkCancel) | **POST** /v1/vault-markets/pro/links/{id}/cancel | Cancel a linked order: its open child orders come off; a bracket&#39;s entry stays.
[**createVaultMarketProOco**](VaultMarketsApi.md#createVaultMarketProOco) | **POST** /v1/vault-markets/pro/oco | Two orders on one key, one cancels the other: when one fills or its stop triggers, the other is cancelled (a partial fill shrinks it).
[**createVaultMarketProOrder**](VaultMarketsApi.md#createVaultMarketProOrder) | **POST** /v1/vault-markets/pro/orders | Place an order on a vault book: limit, market (protected, IOC), stop or stop-limit; GTC, GTD, IOC or FOK; post-only; an iceberg &#x60;displayQuantity&#x60;; a TWAP or VWAP algo over a window. Idempotent on &#x60;clientOrderId&#x60;. &#x60;subaccountId&#x60; trades for a firm sub-account you may trade (your role, its KYB, its limits, no firm halt; buys pay from its custodian account and land in it).
[**createVaultMarketProOrderCancel**](VaultMarketsApi.md#createVaultMarketProOrderCancel) | **POST** /v1/vault-markets/pro/orders/{id}/cancel | Cancel an order; what filled stays filled.
[**createVaultMarketProOrderCancelAll**](VaultMarketsApi.md#createVaultMarketProOrderCancelAll) | **POST** /v1/vault-markets/pro/orders/cancel-all | Cancel every open order, or every one on a book key. Returns &#x60;{ cancelled }&#x60;.
[**createVaultMarketProOrderReplace**](VaultMarketsApi.md#createVaultMarketProOrderReplace) | **POST** /v1/vault-markets/pro/orders/{id}/replace | Amend an order&#39;s price, stop or quantity (cancel-replace: it re-queues at its new price).
[**createVaultMarketProQuote**](VaultMarketsApi.md#createVaultMarketProQuote) | **POST** /v1/vault-markets/pro/quotes | Market makers: set a two-sided post-only quote on a book key (replaces the last). With cancel-on-disconnect (default) heartbeat every 30 s or it is pulled.
[**createVaultMarketProQuoteHeartbeat**](VaultMarketsApi.md#createVaultMarketProQuoteHeartbeat) | **POST** /v1/vault-markets/pro/quotes/heartbeat | Keep your quotes alive (cancel-on-disconnect). Returns &#x60;{ quotes, at }&#x60;.
[**createVaultMarketProTrailingStop**](VaultMarketsApi.md#createVaultMarketProTrailingStop) | **POST** /v1/vault-markets/pro/trailing-stops | A trailing stop: its stop follows the best price since it was placed, &#x60;trailBps&#x60; or &#x60;trailCents&#x60; behind (under the high for a sell, over the low for a buy).
[**createVaultMarketProfileFollow**](VaultMarketsApi.md#createVaultMarketProfileFollow) | **POST** /v1/vault-markets/profiles/{handle}/follow | Follow someone with a public vault: their new vault buys appear in your feed. No copy trading.
[**createVaultMarketRecurring**](VaultMarketsApi.md#createVaultMarketRecurring) | **POST** /v1/vault-markets/recurring | Start a recurring buy: one whole unit of a key every week, two weeks or month, at no more than &#x60;maxPriceCents&#x60; and/or the mark plus &#x60;capBpsOverMark&#x60;; card (with an optional backup) or custodian; optional auto-lend.
[**createVaultMarketRfq**](VaultMarketsApi.md#createVaultMarketRfq) | **POST** /v1/vault-markets/rfq | Ask for a quote on a block: dealers, the key&#39;s DMM and LPs, and holders are told, anonymously. Answers are firm for 60 s. Your limit is never shown.
[**createVaultMarketRfqAccept**](VaultMarketsApi.md#createVaultMarketRfqAccept) | **POST** /v1/vault-markets/rfq/{id}/accept | Take one answer: it fills as a block through the normal fill path (fees by role, self-trade prevention, halts, LULD).
[**createVaultMarketRfqCancel**](VaultMarketsApi.md#createVaultMarketRfqCancel) | **POST** /v1/vault-markets/rfq/{id}/cancel | Cancel your open quote request.
[**createVaultMarketRfqRespond**](VaultMarketsApi.md#createVaultMarketRfqRespond) | **POST** /v1/vault-markets/rfq/{id}/respond | Answer a quote request for the full quantity with a firm price, good for 60 s. Selling needs the units free in your vault; buying pays from your Vault Markets custodian account.
[**createVaultMarketRfqResponseWithdraw**](VaultMarketsApi.md#createVaultMarketRfqResponseWithdraw) | **POST** /v1/vault-markets/rfq/responses/{id}/withdraw | Withdraw your live answer to a quote request.
[**createVaultMarketSetGoal**](VaultMarketsApi.md#createVaultMarketSetGoal) | **POST** /v1/vault-markets/set-goals | Start a goal on a catalogue set (category, brandSlug, modelSlug from the set search), optionally with a target: one condition, and any grade, ungraded, or one exact grade. One live goal per set.
[**createVaultMarketSetGoalBasket**](VaultMarketsApi.md#createVaultMarketSetGoalBasket) | **POST** /v1/vault-markets/set-goals/{id}/basket | Place the \&quot;complete my set\&quot; basket bid: one GTC limit buy per missing piece, under a hard budget, paid by one of your saved cards or your custodian account. Every leg passes pre-trade risk and the ID line like any order. Idempotent on clientBasketId. One working basket per goal; its legs are cancelled once the set is complete.
[**createVaultMarketSetGoalBasketCancel**](VaultMarketsApi.md#createVaultMarketSetGoalBasketCancel) | **POST** /v1/vault-markets/set-goals/{id}/basket/cancel | Cancel the goal working basket bid: every working leg comes off the book; what already filled stays in your vault.
[**createVaultMarketShareCard**](VaultMarketsApi.md#createVaultMarketShareCard) | **POST** /v1/vault-markets/share-cards | Make a verified share card of a position, a vault unit, a public index or your portfolio (&#x60;kind&#x60;, &#x60;refId&#x60;). The % on it is the price move since your real fill; amounts stay hidden unless &#x60;showAmounts&#x60;.
[**createVaultMarketShort**](VaultMarketsApi.md#createVaultMarketShort) | **POST** /v1/vault-markets/shorts | Short a book key: borrow &#x60;units&#x60; lent units (default 1; at most 25/10/3/1 by liquidity tier A/B/C/D) and sell each at &#x60;limitCents&#x60; or better, posting collateral for all of them (50% of the mark each; CBX counts at half, up to 30%). All units are borrowed or none unless &#x60;allowPartial&#x60;. A partial sale opens with the units sold. Returns &#x60;{ positionId, matched, units }&#x60;.
[**createVaultMarketSupplyBatchLabel**](VaultMarketsApi.md#createVaultMarketSupplyBatchLabel) | **POST** /v1/vault-markets/supply/batches/{id}/label | Buy a box&#39;s prepaid label again after it failed (for example once a ship-from address is saved). A box that has a label keeps it.
[**createVaultMarketSupplyInvite**](VaultMarketsApi.md#createVaultMarketSupplyInvite) | **POST** /v1/vault-markets/supply/invites/{id} | Accept or decline a Market Open invite (&#x60;accept&#x60;).
[**createVaultMarketSupplySend**](VaultMarketsApi.md#createVaultMarketSupplySend) | **POST** /v1/vault-markets/supply/send | Send inventory items matched to a catalogue variant to the vault as one box: each becomes an inbound vault unit, and the box gets one prepaid inbound label (a PDF to print). Optional: auto-list each unit in the vault book at a share of the mark once stored, and lend when idle. Items that cannot go say why. Crosslisted listings stay live.
[**createVaultMarketTerm**](VaultMarketsApi.md#createVaultMarketTerm) | **POST** /v1/vault-markets/terms | Accept the current lending terms (needed to lend or short). Returns &#x60;{ termsVersion }&#x60;.
[**createVaultMarketTodClaimObject**](VaultMarketsApi.md#createVaultMarketTodClaimObject) | **POST** /v1/vault-markets/tod/claims/{id}/object | Stop a transfer-on-death claim made on your own account. Returns &#x60;{ id, status, estateUnlocked }&#x60;.
[**createVaultMarketTodMyClaim**](VaultMarketsApi.md#createVaultMarketTodMyClaim) | **POST** /v1/vault-markets/tod/my-claims | Start a claim as a named beneficiary (ID first), naming the account holder by @username or email. It stays a draft until you add documents and submit. Returns &#x60;{ id, status, existing }&#x60;.
[**createVaultMarketTodMyClaimDocument**](VaultMarketsApi.md#createVaultMarketTodMyClaimDocument) | **POST** /v1/vault-markets/tod/my-claims/{id}/documents | Add one document to a draft claim (or one ops asked more of): kind, filename and the file as base64 (PDF, JPEG or PNG, up to 8 MB). Kept privately for ops review. Returns &#x60;{ id, kind, label, filename, bytes }&#x60;.
[**createVaultMarketTodMyClaimSubmit**](VaultMarketsApi.md#createVaultMarketTodMyClaimSubmit) | **POST** /v1/vault-markets/tod/my-claims/{id}/submit | Send a claim for ops review (it needs a death certificate). The account holder is told and can stop it. Returns &#x60;{ id, status }&#x60;.
[**createVaultMarketTodMyClaimWithdraw**](VaultMarketsApi.md#createVaultMarketTodMyClaimWithdraw) | **POST** /v1/vault-markets/tod/my-claims/{id}/withdraw | Withdraw a claim before it is released. Returns &#x60;{ id, status }&#x60;.
[**createVaultMarketTodTerm**](VaultMarketsApi.md#createVaultMarketTodTerm) | **POST** /v1/vault-markets/tod/terms | Accept the current transfer-on-death terms. Returns &#x60;{ termsVersion }&#x60;.
[**createVaultMarketUnitEvidenceScan**](VaultMarketsApi.md#createVaultMarketUnitEvidenceScan) | **POST** /v1/vault-markets/units/{id}/evidence/scans | Add a finished scan of your own (&#x60;captureId&#x60;, of the same catalogue item) to your vault unit. Shown as added by the owner, not as intake evidence.
[**createVaultMarketUnitSellNow**](VaultMarketsApi.md#createVaultMarketUnitSellNow) | **POST** /v1/vault-markets/units/{id}/sell-now | Sell one unit of this item now into the best bid (Instant Exit: an immediate-or-cancel pro order), never below &#x60;minCents&#x60;. Returns &#x60;{ status: filled | missed, filledCents, quote, order }&#x60;.
[**createVaultMarketValuationStatement**](VaultMarketsApi.md#createVaultMarketValuationStatement) | **POST** /v1/vault-markets/valuation-statements | Issue an insurance or appraisal statement for a day: frozen with the sha256 of its record, sealed in the Crossly audit chain, with a public verify link. preparedFor and policyRef are printed on it and never shown on verify. Moves no money.
[**createVaultMarketWatchlist**](VaultMarketsApi.md#createVaultMarketWatchlist) | **POST** /v1/vault-markets/watchlist | Watch a book key. Returns &#x60;{ bookKey, watching }&#x60;.
[**createVaultMarketWidgetToken**](VaultMarketsApi.md#createVaultMarketWidgetToken) | **POST** /v1/vault-markets/widget/tokens | Mint a widget token for one phone (&#x60;deviceName&#x60;, &#x60;installId&#x60;); minting again with the same pair replaces that phone token. The token reads the widget summary and nothing else, and is returned once. At most five phones.
[**createVaultReceiptTokenConfirm**](VaultMarketsApi.md#createVaultReceiptTokenConfirm) | **POST** /v1/vault/receipt-tokens/{id}/confirm | After your wallet sent the export: read the chain and mark the token live once its one token exists. Pass the &#x60;signature&#x60; your wallet returned to record it (kept only if it landed).
[**createVaultReceiptTokenExport**](VaultMarketsApi.md#createVaultReceiptTokenExport) | **POST** /v1/vault/receipt-tokens/export | Send one unit (&#x60;vaultItemId&#x60;) warehouse receipt to one of your verified Solana wallets (&#x60;wallet&#x60;) as a token, accepting the current terms (&#x60;acceptTerms&#x60;). Returns a base64 transaction already signed by the new mint and the receipts authority: your wallet pays the rent and must sign and send it within about two minutes, then call confirm. Nothing is minted until it does. Needs a verified ID; the unit must be stored, unpledged, not lent and not for sale.
[**createVaultReceiptTokenRedeem**](VaultMarketsApi.md#createVaultReceiptTokenRedeem) | **POST** /v1/vault/receipt-tokens/{id}/redeem | Redeem a receipt token held in one of your verified Solana wallets (&#x60;wallet&#x60;): returns an unsigned base64 burn your wallet signs and sends (it also closes the token account and returns its rent to you). Once it lands, call redeem/confirm and the unit is yours in the vault. Refused while the token is frozen.
[**createVaultReceiptTokenRedeemConfirm**](VaultMarketsApi.md#createVaultReceiptTokenRedeemConfirm) | **POST** /v1/vault/receipt-tokens/{id}/redeem/confirm | After your wallet sent the redeem: read the chain; once the token is burned the unit moves into your vault (if it was not yours already). Pass the &#x60;signature&#x60; to record it.
[**createVaultReceiptTokenWalletAllow**](VaultMarketsApi.md#createVaultReceiptTokenWalletAllow) | **POST** /v1/vault/receipt-tokens/wallets/allow | Put one of your verified Solana wallets (&#x60;wallet&#x60;) on the receipt-token allow-list so it can hold and receive receipt tokens. Returns a base64 transaction already signed by the receipts authority: the wallet pays the small rent (about 0.001 SOL) and must sign and send it within about two minutes. Needs a verified ID and a wallet that passes the sanctions screen.
[**deleteVaultMarketAgentWatch**](VaultMarketsApi.md#deleteVaultMarketAgentWatch) | **DELETE** /v1/vault-markets/agent/watches/{id} | Cancel a live price watch. Returns the watch.
[**deleteVaultMarketAlert**](VaultMarketsApi.md#deleteVaultMarketAlert) | **DELETE** /v1/vault-markets/alerts/{id} | Delete a price alert. Returns &#x60;{ ok }&#x60;.
[**deleteVaultMarketBullionFamilyPeg**](VaultMarketsApi.md#deleteVaultMarketBullionFamilyPeg) | **DELETE** /v1/vault-markets/bullion/family-pegs/{id} | Stop a family-wide quote: every leg order comes off the book; what filled stays filled.
[**deleteVaultMarketBullionPeg**](VaultMarketsApi.md#deleteVaultMarketBullionPeg) | **DELETE** /v1/vault-markets/bullion/pegs/{id} | Stop a spot-pegged quote: its resting order comes off the book; what filled stays filled.
[**deleteVaultMarketDealerBand**](VaultMarketsApi.md#deleteVaultMarketDealerBand) | **DELETE** /v1/vault-markets/dealer/bands | Stop a band on a key; its standing bid comes off.
[**deleteVaultMarketEntityMember**](VaultMarketsApi.md#deleteVaultMarketEntityMember) | **DELETE** /v1/vault-markets/entities/{id}/members/{memberId} | Admin: remove a member (or leave, yourself). An entity always keeps one admin.
[**deleteVaultMarketFollowCopyWatch**](VaultMarketsApi.md#deleteVaultMarketFollowCopyWatch) | **DELETE** /v1/vault-markets/follows/copy-watch/{handle} | Stop copy-watching a collector.
[**deleteVaultMarketIndex**](VaultMarketsApi.md#deleteVaultMarketIndex) | **DELETE** /v1/vault-markets/indexes/{slug} | Delete an index of your own. Returns &#x60;{ ok }&#x60;.
[**deleteVaultMarketLocate**](VaultMarketsApi.md#deleteVaultMarketLocate) | **DELETE** /v1/vault-markets/locates/{id} | Release a live locate before it lapses.
[**deleteVaultMarketOpeningWaitlist**](VaultMarketsApi.md#deleteVaultMarketOpeningWaitlist) | **DELETE** /v1/vault-markets/opening/{slug}/waitlist | Leave a key&#39;s waitlist.
[**deleteVaultMarketPriceWidget**](VaultMarketsApi.md#deleteVaultMarketPriceWidget) | **DELETE** /v1/vault-markets/price-widgets/{id} | Delete a widget. Pages that still paste it show that it is no longer available. Returns &#x60;{ id, archived }&#x60;.
[**deleteVaultMarketProQuote**](VaultMarketsApi.md#deleteVaultMarketProQuote) | **DELETE** /v1/vault-markets/pro/quotes | Pull your quote on a book key, or every quote. Returns &#x60;{ pulled }&#x60;.
[**deleteVaultMarketProfileFollow**](VaultMarketsApi.md#deleteVaultMarketProfileFollow) | **DELETE** /v1/vault-markets/profiles/{handle}/follow | Stop following someone.
[**deleteVaultMarketRecurring**](VaultMarketsApi.md#deleteVaultMarketRecurring) | **DELETE** /v1/vault-markets/recurring/{id} | Stop a recurring buy for good; its history stays.
[**deleteVaultMarketSetGoal**](VaultMarketsApi.md#deleteVaultMarketSetGoal) | **DELETE** /v1/vault-markets/set-goals/{id} | Remove a set goal. A working basket bid is cancelled first; what filled stays in your vault.
[**deleteVaultMarketShareCard**](VaultMarketsApi.md#deleteVaultMarketShareCard) | **DELETE** /v1/vault-markets/share-cards/{id} | Take a share card down: its link and image stop working. Returns &#x60;{ ok }&#x60;.
[**deleteVaultMarketSupplyRoundUp**](VaultMarketsApi.md#deleteVaultMarketSupplyRoundUp) | **DELETE** /v1/vault-markets/supply/round-up | Stop the round-up (its history stays; an armed buy is cancelled).
[**deleteVaultMarketUnitEvidence**](VaultMarketsApi.md#deleteVaultMarketUnitEvidence) | **DELETE** /v1/vault-markets/units/{id}/evidence/{evidenceId} | Take back a scan you added to your vault unit (intake evidence stays).
[**deleteVaultMarketWatchlist**](VaultMarketsApi.md#deleteVaultMarketWatchlist) | **DELETE** /v1/vault-markets/watchlist | Stop watching a book key (&#x60;?bookKey&#x3D;&#x60;). Returns &#x60;{ bookKey, watching }&#x60;.
[**deleteVaultMarketWidgetToken**](VaultMarketsApi.md#deleteVaultMarketWidgetToken) | **DELETE** /v1/vault-markets/widget/tokens | Turn the widget off on every phone: revokes all your widget tokens. Returns &#x60;{ revoked }&#x60;, how many.
[**deleteVaultMarketWidgetTokenById**](VaultMarketsApi.md#deleteVaultMarketWidgetTokenById) | **DELETE** /v1/vault-markets/widget/tokens/{id} | Turn the widget off on one phone: revokes that widget token at once. Only a widget token can be revoked here.
[**getVaultAttestation**](VaultMarketsApi.md#getVaultAttestation) | **GET** /v1/vault/attestations | Vault attestations: independent physical counts, the insurance certificate (with a warning when insured value in the vault exceeds its aggregate or per-occurrence limit), SOC 1 Type II and SOC 2 reports. Each carries its signed document.
[**getVaultMarketAccount**](VaultMarketsApi.md#getVaultMarketAccount) | **GET** /v1/vault-markets/account | Which Vault Markets registrations are live (and the env each waits on), your custodian account, limits and balances.
[**getVaultMarketAdl**](VaultMarketsApi.md#getVaultMarketAdl) | **GET** /v1/vault-markets/adl | The insurance fund (booked and free to draw), the most one event may draw before auto-deleveraging (ADL) starts, the loss waterfall in order, and the latest ADL events (no user or position ids). Money in cents.
[**getVaultMarketAdlPosition**](VaultMarketsApi.md#getVaultMarketAdlPosition) | **GET** /v1/vault-markets/adl/positions/{id} | One of your positions with its ADL lights (0 once it has ended).
[**getVaultMarketAdvanceQuote**](VaultMarketsApi.md#getVaultMarketAdvanceQuote) | **GET** /v1/vault-markets/advances/quote | What an advance on a vault unit for sale could be: up to half of the lower of its mark and asking price, free for 60 days.
[**getVaultMarketAgentDraft**](VaultMarketsApi.md#getVaultMarketAgentDraft) | **GET** /v1/vault-markets/agent/drafts/{id} | One drafted order: item, side, units, limit (cents), the book when drafted, status, and the orderBody that places it.
[**getVaultMarketAlertPref**](VaultMarketsApi.md#getVaultMarketAlertPref) | **GET** /v1/vault-markets/alert-prefs | Your vault alert settings: every kind (price, fill, margin_call, adl, p2p_loan, auction, market_open, receipt_token, set_goal, follow, account), every channel (push, telegram, terminal, email, webhook) with whether it is set up, the full on/off grid, the locked switches (a critical kind always pushes) and quiet hours.
[**getVaultMarketAuctionLot**](VaultMarketsApi.md#getVaultMarketAuctionLot) | **GET** /v1/vault-markets/auctions/lots/{id} | One lot: the price showing, the next minimum bid, whether a reserve exists and is met, the end (extended by late bids), the bid history and your standing.
[**getVaultMarketAuctionMine**](VaultMarketsApi.md#getVaultMarketAuctionMine) | **GET** /v1/vault-markets/auctions/mine | Lots you consigned (with your reserve) and lots you bid on (with your maximum and whether you lead).
[**getVaultMarketBlock**](VaultMarketsApi.md#getVaultMarketBlock) | **GET** /v1/vault-markets/blocks/{orderId} | One block order: its order, plan lines (planned and allocated units, average price, cash share, status).
[**getVaultMarketBullionFor**](VaultMarketsApi.md#getVaultMarketBullionFor) | **GET** /v1/vault-markets/bullion/for | The bullion key families one book key belongs to, with spot for its metal as a labelled reference and its melt value at that spot. Empty families when the item is not keyed bullion.
[**getVaultMarketBullionKey**](VaultMarketsApi.md#getVaultMarketBullionKey) | **GET** /v1/vault-markets/bullion/keys/{slug} | One bullion key family: its catalogue products, every live book key with best bid, best ask, vault units and its mark (from the book only), live pegged quote counts, and spot as a labelled reference.
[**getVaultMarketBullionPegPreview**](VaultMarketsApi.md#getVaultMarketBullionPegPreview) | **GET** /v1/vault-markets/bullion/pegs/preview | The price a spot-pegged quote would rest at now (spot plus a premium in cents or basis points, clamped to floor and cap). No price when spot is stale or missing: such a quote waits off the book.
[**getVaultMarketCall**](VaultMarketsApi.md#getVaultMarketCall) | **GET** /v1/vault-markets/calls/{bookKey} | Recent call-auction uncrosses on a book key: kind (open, reopen, periodic, daily, buy-in, sell-off), clearing price in cents and units.
[**getVaultMarketCapacity**](VaultMarketsApi.md#getVaultMarketCapacity) | **GET** /v1/vault-markets/capacity | Capacity from the book: &#x60;bookKey&#x60; (+ &#x60;units&#x60;) gives ADV, depth within ±5% of the mark, vault stock, lendable units and days to liquidate at 20% of ADV; &#x60;index&#x60; + &#x60;notional&#x60; (cents) gives how much of the basket the asks fill now and the days the rest needs.
[**getVaultMarketChannel**](VaultMarketsApi.md#getVaultMarketChannel) | **GET** /v1/vault-markets/channels | Your Vault Markets channel switches: Telegram alerts and digest, the daily cap on vault nudges by push (default 5), whether a Telegram chat is linked, and how many nudges went out today.
[**getVaultMarketCompare**](VaultMarketsApi.md#getVaultMarketCompare) | **GET** /v1/vault-markets/compare | Up to 5 book keys and/or index slugs (&#x60;items&#x60;, comma-separated) as daily series on the same days, each rebased to 100.
[**getVaultMarketConfirmation**](VaultMarketsApi.md#getVaultMarketConfirmation) | **GET** /v1/vault-markets/confirmations/{tradeId} | One trade confirmation.
[**getVaultMarketConfirmationPdf**](VaultMarketsApi.md#getVaultMarketConfirmationPdf) | **GET** /v1/vault-markets/confirmations/{tradeId}/pdf | One trade confirmation as a PDF.
[**getVaultMarketCorrelation**](VaultMarketsApi.md#getVaultMarketCorrelation) | **GET** /v1/vault-markets/correlations | The correlation matrix of the sector indexes&#39; weekly returns over &#x60;weeks&#x60; (default 52), pairwise-complete, with n per pair; a pair under 26 shared weeks has no number.
[**getVaultMarketCreatorAttribution**](VaultMarketsApi.md#getVaultMarketCreatorAttribution) | **GET** /v1/vault-markets/creators/attribution | The creator who brought you to Vault Markets, when one did: when it started and ends, whether it still earns, and the disclosure. Your prices and fees are the same either way.
[**getVaultMarketCreatorDashboard**](VaultMarketsApi.md#getVaultMarketCreatorDashboard) | **GET** /v1/vault-markets/creators/dashboard | For creators: whether you joined the programme, each of your codes with traders attributed and still earning (counts only), shares accrued, paid and voided (cents) and the latest shares.
[**getVaultMarketCreatorProgramme**](VaultMarketsApi.md#getVaultMarketCreatorProgramme) | **GET** /v1/vault-markets/creators/programme | The Vault Markets creator programme: the share of the fee Crossly keeps that a creator earns, the per-fill and lifetime caps (cents), the attribution window in days, the 2% net floor it sits under, and the disclosure words.
[**getVaultMarketCreatorRoom**](VaultMarketsApi.md#getVaultMarketCreatorRoom) | **GET** /v1/vault-markets/creators/room | For creators: your vault shelf room (applied, verified, rejected or paused) and whether your public vault profile is on, which the room needs.
[**getVaultMarketCredit**](VaultMarketsApi.md#getVaultMarketCredit) | **GET** /v1/vault-markets/credit/{id} | One loan or advance with its pledged units and its money log (draws, interest, repayments, sale proceeds).
[**getVaultMarketDcm**](VaultMarketsApi.md#getVaultMarketDcm) | **GET** /v1/vault-markets/dcm | The partner exchange (DCM) that lists and clears futures and options on Crossly indexes (needs VAULT_INDEX_DCM + VAULT_INDEX_DCM_API_URL + VAULT_INDEX_DCM_API_KEY), and its contracts as last read: perps, futures and options with the index each settles on, multiplier, tick, expiry and strike. Read-only: Crossly is the licensor and data provider, never the venue.
[**getVaultMarketDcmContract**](VaultMarketsApi.md#getVaultMarketDcmContract) | **GET** /v1/vault-markets/dcm/contracts/{symbol} | One partner contract: its spec, its funding prints (newest first; the partner computes and settles funding), annualised funding over the last 21 prints, and the Crossly index level it settles on.
[**getVaultMarketDcmContractBook**](VaultMarketsApi.md#getVaultMarketDcmContractBook) | **GET** /v1/vault-markets/dcm/contracts/{symbol}/book | The partner exchange live order book for a contract (cached 5 seconds), with mark, index, last, open interest, 24 h volume, spread in bps and the basis of its mark over the Crossly index in bps. Prices are index points.
[**getVaultMarketDcmOptionsInput**](VaultMarketsApi.md#getVaultMarketDcmOptionsInput) | **GET** /v1/vault-markets/dcm/options-inputs/{slug} | Options inputs for an index (indexes only, never a single item): Crossly realised volatility (raw and Geltner-desmoothed, from weekly returns), the forward (the partner future mark, else the Crossly close), Black-76 greeks on a strike x expiry grid and on every option the partner lists on the index. Model inputs, not quotes.
[**getVaultMarketDcmPosition**](VaultMarketsApi.md#getVaultMarketDcmPosition) | **GET** /v1/vault-markets/dcm/positions | The partner exchange account linked to your account (or to the firm sub-account &#x60;subaccountId&#x60;) and its positions, read-only (cached 15 seconds); index futures on category indexes count as portfolio-margin hedges for that account: contracts, side, entry and mark price, unrealised P&amp;L and margin in cents, liquidation price and notional in cents. Not linked: &#x60;linked: false&#x60;.
[**getVaultMarketDealer**](VaultMarketsApi.md#getVaultMarketDealer) | **GET** /v1/vault-markets/dealer | Your dealer status (applied, approved, revoked) and your Instant Exit bands.
[**getVaultMarketDealerPool**](VaultMarketsApi.md#getVaultMarketDealerPool) | **GET** /v1/vault-markets/dealer/pools/{id} | One of your curve pools, with its ladder and live legs.
[**getVaultMarketDigestPreview**](VaultMarketsApi.md#getVaultMarketDigestPreview) | **GET** /v1/vault-markets/digest/preview | This week&#39;s vault digest as it would go out: units at the display marks (unmarked units counted, not valued), the like-for-like change from a week ago, offers on your units, watched keys that got a first mark, and one Learn card.
[**getVaultMarketEntity**](VaultMarketsApi.md#getVaultMarketEntity) | **GET** /v1/vault-markets/entities | The entities (funds, LLCs, trusts, SPVs) you belong to, and invitations waiting for you.
[**getVaultMarketEntityById**](VaultMarketsApi.md#getVaultMarketEntityById) | **GET** /v1/vault-markets/entities/{id} | One entity: members and roles, sub-accounts with their limits, firm halts, caps.
[**getVaultMarketEstimate**](VaultMarketsApi.md#getVaultMarketEstimate) | **GET** /v1/vault-markets/estimates/{bookKey} | The Crossly Estimate for a book key — a model, not a price. Method (own trades, index-adjusted last trade, grade ratio), cents with 68% and 95% bands, High/Medium/Low from the walk-forward backtest&#39;s FSD, and n. Hidden (&#x60;available: false&#x60;) under 50 backtested trades or when FSD &gt; 0.30. Never used for margin, loans or settlement.
[**getVaultMarketExecutionQuality**](VaultMarketsApi.md#getVaultMarketExecutionQuality) | **GET** /v1/vault-markets/execution-quality | The quarterly execution-quality report (Rule 605 style): fill rates, speed, effective vs quoted spread and shortfall by order type and size, and the busiest keys. &#x60;quarter&#x60; like 2026-Q4; the current quarter is provisional.
[**getVaultMarketFeeQuote**](VaultMarketsApi.md#getVaultMarketFeeQuote) | **GET** /v1/vault-markets/fees/quote | Your fee for an order at a price: as maker (the order rests) and as taker (it fills at once), with the programme that sets your rate and any Crossly One trim. A buyer&#39;s fee is added to the price; a seller&#39;s comes out of the proceeds.
[**getVaultMarketFeeSchedule**](VaultMarketsApi.md#getVaultMarketFeeSchedule) | **GET** /v1/vault-markets/fees/schedule | The fee schedule by role: maker and taker rates for retail, 30-day volume, Registered LPs and DMMs, the CBX discount, the referral share and the 2% net floor Crossly always keeps.
[**getVaultMarketFollowSharing**](VaultMarketsApi.md#getVaultMarketFollowSharing) | **GET** /v1/vault-markets/follows/sharing | Your sharing switches: the public vault profile, new buys, units sent in, sales, Hall loans, bids and asks for copy-watchers, and the leaderboards. All off until you turn them on.
[**getVaultMarketGemRate**](VaultMarketsApi.md#getVaultMarketGemRate) | **GET** /v1/vault-markets/gem-rate/{bookKey} | The Crossly gem rate: of cards graded through Crossly, the share that came back at each grader&#39;s gem grade, for this item and its category, with a Wilson 95% band. 10 returns per grader or no number. Not a grader population report.
[**getVaultMarketGradeToVault**](VaultMarketsApi.md#getVaultMarketGradeToVault) | **GET** /v1/vault-markets/grade-to-vault/{id} | One Grade to Vault flow, brought up to date with its submission and unit.
[**getVaultMarketGradeToVaultCandidate**](VaultMarketsApi.md#getVaultMarketGradeToVaultCandidate) | **GET** /v1/vault-markets/grade-to-vault/candidates | What you can start Grade to Vault on: raw inventory matched to a catalogue item, and raw vault units on the grading hub shelf; plus whether Grading Runs are open.
[**getVaultMarketGradingSignal**](VaultMarketsApi.md#getVaultMarketGradingSignal) | **GET** /v1/vault-markets/grading-signal | For a raw book key: the marks of the same item&#39;s graded keys, the spread over raw, grading cost per grader, the margin tier grading lifts it to, your raw vault units it pays to grade, and where to act.
[**getVaultMarketHallLoan**](VaultMarketsApi.md#getVaultMarketHallLoan) | **GET** /v1/vault-markets/hall/loans | Your Hall of Grails desk: this week&#39;s exhibition, the rules (maxLive loans, shownPerHolder per exhibition, repPoints per exhibition shown), reputation (exhibitions finished), your loans (status active, ending or ended; onShowNow, showingUntil, exhibitions, the next exhibition it fits, the Lent to the Hall badge) and the vault units you could lend (canLend, or the blocker in words, and the next exhibition each fits). Display only.
[**getVaultMarketHealth**](VaultMarketsApi.md#getVaultMarketHealth) | **GET** /v1/vault-markets/health | Portfolio health of your vault holdings at Crossly marks: concentration by single item, category, grade and grader (shares, HHI on 0 to 10000, its band and effective number of holdings), value by liquidity tier, the stress grid (each category and everything down 10, 20 and 30 percent), value by mark quality, plain observations, and the held items a what-if can run on. Information only, not advice.
[**getVaultMarketHealthWhatIf**](VaultMarketsApi.md#getVaultMarketHealthWhatIf) | **GET** /v1/vault-markets/health/what-if | What if one held item moved by moveBps (-10000 to 10000 basis points of its mark): the item, your vault total, the item and its category share of the vault, and the single-item HHI, before and after. A scenario on the mark, not a price you could sell at.
[**getVaultMarketHomeUnit**](VaultMarketsApi.md#getVaultMarketHomeUnit) | **GET** /v1/vault-markets/home/units | \&quot;Show my vault\&quot;: the vault units you hold, the ones standing in your Crossly World home first. Each: vaultItemId, title, grade, imageUrl, bookKey (its market), inHome, visitors (visitors to your home see it). Also your home (slug, privacy, path), max units one home shows, shown, visitorsSee and a note on who sees what. Your home is made on first read. No prices.
[**getVaultMarketIndex**](VaultMarketsApi.md#getVaultMarketIndex) | **GET** /v1/vault-markets/indexes/{slug} | One index with its daily closes (oldest first) and its level now.
[**getVaultMarketIndexCalendar**](VaultMarketsApi.md#getVaultMarketIndexCalendar) | **GET** /v1/vault-markets/index-calendar | The next four quarterly reviews: reference day (2nd Friday of Mar/Jun/Sep/Dec), announcement day, last close under the old membership and the effective day; June and December also review the Blue-chip 50.
[**getVaultMarketIndexConsultation**](VaultMarketsApi.md#getVaultMarketIndexConsultation) | **GET** /v1/vault-markets/index-consultations/{id} | One consultation with its proposal, versions, dates, outcome and the public comments.
[**getVaultMarketIndexFeed**](VaultMarketsApi.md#getVaultMarketIndexFeed) | **GET** /v1/vault-markets/index-feed/{slug} | The licensed index feed for one built-in index (needs VAULT_INDEX_DCM + VAULT_INDEX_FEED_SECRET): the level now (intraday from A/B marks, or the last close below 50% constituent coverage), the last close, the frozen 7-day TWAP settlement value and every constituent with its mark source, quality and trade count. Signed: &#x60;x-crossly-signature: t&#x3D;&lt;ms&gt;,v1&#x3D;&lt;hex HMAC-SHA256(secret, t + \&quot;.\&quot; + body)&gt;&#x60;. Every read is logged for the licence. Crossly is the licensor and data feed only.
[**getVaultMarketIndexFeedFunding**](VaultMarketsApi.md#getVaultMarketIndexFeedFunding) | **GET** /v1/vault-markets/index-feed/{slug}/funding | Reference funding for a perpetual-style future on the index: your premium &#x60;premiumBps&#x60; (TWAP of (impact mid - index)/index) through F &#x3D; P + clamp(I - P, ±0.05%) per 8 h, |F| capped at 0.5%/day, with the index level it is relative to. The partner DCM computes and settles funding; this is the reference math.
[**getVaultMarketIndexFeedSettlement**](VaultMarketsApi.md#getVaultMarketIndexFeedSettlement) | **GET** /v1/vault-markets/index-feed/{slug}/settlement | The frozen 7-day TWAP settlement series for a licensed index (written once a day, never restated), with the closes behind each value. Signed like the feed.
[**getVaultMarketIndexLevel**](VaultMarketsApi.md#getVaultMarketIndexLevel) | **GET** /v1/vault-markets/indexes/{slug}/levels | An index&#39;s daily closes (up to 5 years), oldest first.
[**getVaultMarketIndexLicenceUsage**](VaultMarketsApi.md#getVaultMarketIndexLicenceUsage) | **GET** /v1/vault-markets/index-licence/usage | Your licensed index feed reads over &#x60;days&#x60;, per index and endpoint (licence-usage report).
[**getVaultMarketIndexMethodology**](VaultMarketsApi.md#getVaultMarketIndexMethodology) | **GET** /v1/vault-markets/index-methodology | The index method in machine-readable form: version (semver), inputs, weightings and caps, the family and its screens, the engines and their publication gate, revisions and the settlement series, the calendar, governance and limitations.
[**getVaultMarketInstantExit**](VaultMarketsApi.md#getVaultMarketInstantExit) | **GET** /v1/vault-markets/instant-exit | The Instant Exit quote for one vault unit you hold: the best resting bid on its book key (anyone&#39;s, dealers&#39; included), its share of the mark, the bid depth, and whether it can be taken now.
[**getVaultMarketJoint**](VaultMarketsApi.md#getVaultMarketJoint) | **GET** /v1/vault-markets/joint | Your joint vaults and the invitations waiting for you, with the gate (open, missing env), the joint terms in words and what each right allows. A JointVaultsHome object, not a collection.
[**getVaultMarketJointById**](VaultMarketsApi.md#getVaultMarketJointById) | **GET** /v1/vault-markets/joint/{id} | One joint vault (active members only): members and rights, the units in it at the mark with each owner of record, totals, recent joint trades, and the activity from the audit trail.
[**getVaultMarketKeyStat**](VaultMarketsApi.md#getVaultMarketKeyStat) | **GET** /v1/vault-markets/key-stats/{bookKey} | Everything derived about one book key in one read: the Crossly Estimate, the liquidity score, risk statistics and the gem rate. A part that cannot be read is &#x60;{ error }&#x60;.
[**getVaultMarketLearn**](VaultMarketsApi.md#getVaultMarketLearn) | **GET** /v1/vault-markets/learn | The Learn hub: each concept with whether you passed its quiz. Passing earns cosmetic pins only.
[**getVaultMarketLearnByConcept**](VaultMarketsApi.md#getVaultMarketLearnByConcept) | **GET** /v1/vault-markets/learn/{concept} | One Learn concept: its sections and quiz questions (no answers).
[**getVaultMarketLendingElection**](VaultMarketsApi.md#getVaultMarketLendingElection) | **GET** /v1/vault-markets/lending/election | Your lender election: &#x60;returnInKind&#x60; (shorts post 175% collateral, a 14-day buy-in, never cash-settled) and &#x60;allowTerm&#x60; (your units may go out on 30/90-day fixed-rate term loans, not recallable before term).
[**getVaultMarketLendingProgramme**](VaultMarketsApi.md#getVaultMarketLendingProgramme) | **GET** /v1/vault-markets/lending/programme | Your lender programme report: lendable units, units out, utilisation, fee revenue (accrued / paid), term loans and return-in-kind loans in force, and each loan&#39;s rate against the key&#39;s rate today.
[**getVaultMarketLendingStatement**](VaultMarketsApi.md#getVaultMarketLendingStatement) | **GET** /v1/vault-markets/lending/statement | Your daily collateral statement as a lender (today live, or &#x60;day&#x60;): per open loan the mark and its quality, fees owed to you, the short&#39;s collateral share at the custodian and its coverage against 105% of mark + fees. A unit without a mark usable for risk shows no coverage number.
[**getVaultMarketLiquidity**](VaultMarketsApi.md#getVaultMarketLiquidity) | **GET** /v1/vault-markets/liquidity/{bookKey} | The liquidity score (0-100) of a book key and every component behind it: trades in 30/90 days, distinct counterparties, median days between trades, time-weighted quoted spread, two-sided share and depth within 5% (hourly book snapshots), Amihud and Roll. Each component is a percentile within the category. No score under the data threshold.
[**getVaultMarketLoanQuote**](VaultMarketsApi.md#getVaultMarketLoanQuote) | **GET** /v1/vault-markets/loans/quote | How much you can borrow against vault units (&#x60;vaultItemIds&#x60;, comma-separated; none &#x3D; every stored unit you hold): each unit&#39;s tier, mark and limit, the pool&#39;s rate and yours.
[**getVaultMarketLoanUnitSaleFloor**](VaultMarketsApi.md#getVaultMarketLoanUnitSaleFloor) | **GET** /v1/vault-markets/loans/{id}/units/{vaultItemId}/sale-floor | The lowest price a pledged unit can be sold at to repay its loan: after the sale (less the vault fee and storage) what is still owed must fit inside the other units&#39; limit.
[**getVaultMarketLocate**](VaultMarketsApi.md#getVaultMarketLocate) | **GET** /v1/vault-markets/locates | A locate quote: how many units of &#x60;key&#x60; (a book key) you could borrow now (up to &#x60;qty&#x60;), the indicative rate (APR bps; &#x60;termDays&#x60; 30 or 90 for a fixed-rate term loan), and the collateral they need (150%, or 175% for units whose lenders elected return in kind only). Holds nothing; POST to hold.
[**getVaultMarketMark**](VaultMarketsApi.md#getVaultMarketMark) | **GET** /v1/vault-markets/marks/{bookKey} | One book key mark with everything behind it: the price in cents, its quality (A trade-anchored, B firm two-sided, C indicative, none), its confidence in bps and the band in cents, when it was computed, whether risk may act on it (judged for margin), the related key it was implied from (impliedFrom: a grade, the model median of the other sizes, or an index; null when none), every stored input, and the learned relations it may be implied from.
[**getVaultMarketMarket**](VaultMarketsApi.md#getVaultMarketMarket) | **GET** /v1/vault-markets/market | One book key (variantId:condition:gradeKey): its mark and history, lending depth and borrow rate, open interest and live auctions.
[**getVaultMarketMarketModel**](VaultMarketsApi.md#getVaultMarketMarketModel) | **GET** /v1/vault-markets/market-model/{bookKey} | How a book key trades: its liquidity tier (A continuous, B call auction every 15 minutes, C daily call, D listings only), the call collecting now with its indicative price and volume and nominal close, the next call, the LULD band and any limit state, pause or halt.
[**getVaultMarketMm**](VaultMarketsApi.md#getVaultMarketMm) | **GET** /v1/vault-markets/mm | Your market-maker programmes, the last 30 days of obligations, rebates earned (paid only from fees already taken), and the rules.
[**getVaultMarketMmKey**](VaultMarketsApi.md#getVaultMarketMmKey) | **GET** /v1/vault-markets/mm/key | A key&#39;s designated market maker (by the name it chose) and how many LPs quote it.
[**getVaultMarketMmMmp**](VaultMarketsApi.md#getVaultMarketMmMmp) | **GET** /v1/vault-markets/mm/mmp | Your market-maker protection: the fill trigger, the freeze, and whether you are frozen now.
[**getVaultMarketMode**](VaultMarketsApi.md#getVaultMarketMode) | **GET** /v1/vault-markets/mode | Your Vault Markets mode: simple (buy, sell and what it is worth) or pro (the full terminal), whether you chose it or it was set for you (new people start in simple; people already trading start in pro), and when.
[**getVaultMarketNav**](VaultMarketsApi.md#getVaultMarketNav) | **GET** /v1/vault-markets/nav | Mark NAV, bid NAV (the resting bids) and liquidation NAV (the bids at 20% of ADV for 10 days), holding by holding, each with its ASC 820 level, mark quality and source, and your administrator&#39;s price when uploaded.
[**getVaultMarketNavFile**](VaultMarketsApi.md#getVaultMarketNavFile) | **GET** /v1/vault-markets/nav/file/{format} | The NAV as a csv, pdf or json file.
[**getVaultMarketOpening**](VaultMarketsApi.md#getVaultMarketOpening) | **GET** /v1/vault-markets/opening/{slug} | One opening key.
[**getVaultMarketOracle**](VaultMarketsApi.md#getVaultMarketOracle) | **GET** /v1/vault-markets/oracle | Crossly as an oracle publisher (needs CROSSLY_ORACLE_PUBLISHER_KEY + CROSSLY_ORACLE_NETWORK): the network (pyth or switchboard), the ed25519 key every value is signed with, each published index feed with its latest attempt, and 24 h counts of published, skipped and failed. Only built-in indexes priced from A/B marks are published; Crossly never reads its own feed back.
[**getVaultMarketOracleBySlug**](VaultMarketsApi.md#getVaultMarketOracleBySlug) | **GET** /v1/vault-markets/oracle/{slug} | The latest published oracle value for an index: level, fixed-point price and confidence at the feed exponent, confidence in bps, staleness in seconds, coverage, the exact signed message and its ed25519 signature with the signer key, and whether it is fresh.
[**getVaultMarketOrderHandling**](VaultMarketsApi.md#getVaultMarketOrderHandling) | **GET** /v1/vault-markets/order-handling | How orders are handled (the 606/607-style disclosure): one book, self-trade prevention, protected market orders, liquidations by auction, halts, dealers and fees.
[**getVaultMarketP2pDashboard**](VaultMarketsApi.md#getVaultMarketP2pDashboard) | **GET** /v1/vault-markets/p2p/dashboard | Peer-to-peer vault loans at a glance: what you owe as a borrower and are owed as a lender (principal + interest to the second), daily interest, called loans, your open offers, the gates and the rules (auction hours, rate ceiling, size bounds, call grace).
[**getVaultMarketP2pLoan**](VaultMarketsApi.md#getVaultMarketP2pLoan) | **GET** /v1/vault-markets/p2p/loans/{id} | One P2P loan with its money log (fund, repay, refinance). A loan in a running refinancing auction can be read by any lender, without the log.
[**getVaultMarketPaper**](VaultMarketsApi.md#getVaultMarketPaper) | **GET** /v1/vault-markets/paper | Your paper trading account (play money only, never real or convertible; opened at $10,000 the first time): play cash, buying power, paper positions at the real marks, P&amp;L, working paper orders, recent paper fills and this week on the leaderboard.
[**getVaultMarketPaperQuote**](VaultMarketsApi.md#getVaultMarketPaperQuote) | **GET** /v1/vault-markets/paper/quote | What a paper order would fill against the real book now, without placing it: units fillable inside the limit (a market order uses the 5% protection band around the mark), average price, simulated fee, and the queue ahead of any rest.
[**getVaultMarketPartnerMe**](VaultMarketsApi.md#getVaultMarketPartnerMe) | **GET** /v1/vault-markets/partners/me | Your Vault Drop-off Partnership (null when you never applied): status, partner code, fee share and cap, totals and batches.
[**getVaultMarketPool**](VaultMarketsApi.md#getVaultMarketPool) | **GET** /v1/vault-markets/pool | The CBX market staking pool: size, value, what it lends, utilisation, rate, insurance fund.
[**getVaultMarketPopReport**](VaultMarketsApi.md#getVaultMarketPopReport) | **GET** /v1/vault-markets/pop-reports | Grading population report for one market (&#x60;bookKey&#x60;): focus (on a graded market: its grade, pop &#x3D; copies graded at exactly that grade, higher &#x3D; copies graded better by the same grader, total, asOf and source), graders (each grader ladder for the card, best grade first, from one report: the newest, the population feed over a hand entry on the same date), provider.connected, and status (ok, not_synced, no_report or no_source) with explain, which says in plain words what is missing. source is provider (the population feed) or ops (entered by Crossly from the grader published report). Counts only, never a price.
[**getVaultMarketPortfolio**](VaultMarketsApi.md#getVaultMarketPortfolio) | **GET** /v1/vault-markets/portfolio | Your vault holdings at the market price, with cost and P&amp;L, and units you have out on loan.
[**getVaultMarketPortfolioHistory**](VaultMarketsApi.md#getVaultMarketPortfolioHistory) | **GET** /v1/vault-markets/portfolio/history | Your Vault Markets value by day at the marks (vault units, units on loan, positions) and today&#39;s return against yesterday&#39;s close.
[**getVaultMarketPortfolioMargin**](VaultMarketsApi.md#getVaultMarketPortfolioMargin) | **GET** /v1/vault-markets/portfolio-margin | Portfolio margin for a firm sub-account (&#x60;subaccountId&#x60;): eligibility with every reason (ECP, KYB, minimum equity $500k or $100k with evidenced intraday monitoring), whether it is enrolled, the latest requirement, equity, excess and state (healthy, call or buy_in), the breakdown by category and item, the partner index futures counted, and the policy. Before enrolling, a live preview.
[**getVaultMarketPosition**](VaultMarketsApi.md#getVaultMarketPosition) | **GET** /v1/vault-markets/positions/{id} | One position with its loans, auctions and custodian instruction log.
[**getVaultMarketPositionExit**](VaultMarketsApi.md#getVaultMarketPositionExit) | **GET** /v1/vault-markets/positions/{id}/exits | A position&#39;s take-profit / stop-loss, if set.
[**getVaultMarketPositionRisk**](VaultMarketsApi.md#getVaultMarketPositionRisk) | **GET** /v1/vault-markets/positions/{id}/risk | One position&#39;s call and liquidation marks.
[**getVaultMarketPress**](VaultMarketsApi.md#getVaultMarketPress) | **GET** /v1/vault-markets/press | The press kit: each built-in index with level, quality, n, CSV link and a \&quot;cite as\&quot; line, plus the methodology links.
[**getVaultMarketPriceWidget**](VaultMarketsApi.md#getVaultMarketPriceWidget) | **GET** /v1/vault-markets/price-widgets/{id} | One of your price widgets, with its iframe and script-tag snippets and URLs.
[**getVaultMarketProDepth**](VaultMarketsApi.md#getVaultMarketProDepth) | **GET** /v1/vault-markets/pro/depth | The L2 depth ladder: price levels and units per side, best first; asks show how many units are authenticated vault stock.
[**getVaultMarketProOrder**](VaultMarketsApi.md#getVaultMarketProOrder) | **GET** /v1/vault-markets/pro/orders/{id} | One order with its full event log.
[**getVaultMarketProSnapshot**](VaultMarketsApi.md#getVaultMarketProSnapshot) | **GET** /v1/vault-markets/pro/snapshot | A book key&#39;s depth (20 levels a side), last 50 trades, 24 h stats, mark and any halt, in one call.
[**getVaultMarketProStat**](VaultMarketsApi.md#getVaultMarketProStat) | **GET** /v1/vault-markets/pro/stats | 24 h open, high, low, last, volume and change on a book key.
[**getVaultMarketProStream**](VaultMarketsApi.md#getVaultMarketProStream) | **GET** /v1/vault-markets/pro/stream | A long-lived text/event-stream for a book key: &#x60;snapshot&#x60; first, then &#x60;depth&#x60;, &#x60;trades&#x60;, &#x60;mark&#x60; and &#x60;halt&#x60; events as they change.
[**getVaultMarketProfile**](VaultMarketsApi.md#getVaultMarketProfile) | **GET** /v1/vault-markets/profile | Your public vault profile switch: on or off, whether followers see new buys, your profile URL and follower count.
[**getVaultMarketProfileByHandle**](VaultMarketsApi.md#getVaultMarketProfileByHandle) | **GET** /v1/vault-markets/profiles/{handle} | Someone&#39;s public vault: each market&#39;s weight (bps of the marked value), followers, whether you follow, their recent buys (no prices).
[**getVaultMarketProofOfReserve**](VaultMarketsApi.md#getVaultMarketProofOfReserve) | **GET** /v1/vault-markets/proof-of-reserves | Proof of reserves: the latest daily Merkle root over every unit in custody (leaf count, stored / listed / grading / withdrawing, pledged, on loan, open loans, receipts, insured value), its Solana memo anchor when VAULT_POR_ANCHOR_KEY is set, the last &#x60;days&#x60; roots, and the exact hashing method.
[**getVaultMarketProofOfReserveByDay**](VaultMarketsApi.md#getVaultMarketProofOfReserveByDay) | **GET** /v1/vault-markets/proof-of-reserves/{day} | One day&#39;s proof-of-reserves snapshot (root, counts, anchor).
[**getVaultMarketProofOfReserveMe**](VaultMarketsApi.md#getVaultMarketProofOfReserveMe) | **GET** /v1/vault-markets/proof-of-reserves/me | Your inclusion proofs for a day (latest by default): each of your units&#39; leaf fields, salt, owner commitment, leaf hash and sibling path. Verify with your OWN user id: commitment &#x3D; SHA-256(JSON[\&quot;crossly-por-owner-v1\&quot;, userId, salt]); then the leaf; then climb the path to the published root.
[**getVaultMarketRate**](VaultMarketsApi.md#getVaultMarketRate) | **GET** /v1/vault-markets/rates | Daily borrow APR (lent units) and pool APR on a book key, with the pool as a whole, oldest first.
[**getVaultMarketReport**](VaultMarketsApi.md#getVaultMarketReport) | **GET** /v1/vault-markets/report | The quarterly Crossly Vault Report (&#x60;quarter&#x60; like 2026-q3; default the latest): index levels, top movers, most-lent markets, grade premiums. Book data only.
[**getVaultMarketRfq**](VaultMarketsApi.md#getVaultMarketRfq) | **GET** /v1/vault-markets/rfq/{id} | One quote request: the requester sees every answer (anonymous); a responder sees the request and their own answer.
[**getVaultMarketRiskReport**](VaultMarketsApi.md#getVaultMarketRiskReport) | **GET** /v1/vault-markets/risk-report | Historical VaR 95/99 1d/10d and Bangia LVaR (model figures: labelled, with n and a band, null below the data threshold), stress scenarios (category −30%, CBX −50%, books thin to 25%, index drawdowns), concentration and counterparty exposure.
[**getVaultMarketRiskStat**](VaultMarketsApi.md#getVaultMarketRiskStat) | **GET** /v1/vault-markets/risk-stats/{bookKey} | Risk statistics for a book key (weekly returns from A-quality marks only) or an index slug (its closes): annualised volatility raw and Geltner-desmoothed (labelled), max drawdown and beta to the Composite. Needs 26 weekly returns, else no numbers.
[**getVaultMarketSetGoal**](VaultMarketsApi.md#getVaultMarketSetGoal) | **GET** /v1/vault-markets/set-goals/{id} | One set goal: every piece in the set order, held (with the vault unit) or missing (with the cheapest marked book key that meets the target and its mark), the conditions and grades seen, and the working basket bid with its legs.
[**getVaultMarketSetGoalBasketPlan**](VaultMarketsApi.md#getVaultMarketSetGoalBasketPlan) | **GET** /v1/vault-markets/set-goals/{id}/basket-plan | What a basket bid would place now, without placing it: one leg per missing piece (cheapest first, the mark plus maxBpsOverMark as the limit), the pieces skipped and why, and the most it can cost (limits plus the worst-case buyer fee), never more than budgetCents.
[**getVaultMarketShareCard**](VaultMarketsApi.md#getVaultMarketShareCard) | **GET** /v1/vault-markets/share-cards/{id} | One share card as the public sees it, with its image and link paths.
[**getVaultMarketStatement**](VaultMarketsApi.md#getVaultMarketStatement) | **GET** /v1/vault-markets/statements | The last 24 months with whether each statement is issued (frozen, with its sha256).
[**getVaultMarketStatementByMonth**](VaultMarketsApi.md#getVaultMarketStatementByMonth) | **GET** /v1/vault-markets/statements/{month} | A monthly statement (&#x60;month&#x60; like 2026-10): units held at month end, loans, pledges, positions, fills, fees, storage, and cash quoted from the custodian and labelled as its record. Issued (frozen) once the month ends.
[**getVaultMarketStatementFile**](VaultMarketsApi.md#getVaultMarketStatementFile) | **GET** /v1/vault-markets/statements/{month}/file/{format} | A monthly statement as a csv, pdf or json file.
[**getVaultMarketSupply**](VaultMarketsApi.md#getVaultMarketSupply) | **GET** /v1/vault-markets/supply | A book key&#39;s units in the vault and authentications passed, by day (oldest first, today live).
[**getVaultMarketSupplyBatch**](VaultMarketsApi.md#getVaultMarketSupplyBatch) | **GET** /v1/vault-markets/supply/batches/{id} | A box sent to the vault: its prepaid label and tracking, or why it has no label.
[**getVaultMarketSupplyRoundUp**](VaultMarketsApi.md#getVaultMarketSupplyRoundUp) | **GET** /v1/vault-markets/supply/round-up | Your seller round-up: the share of each payout that sets a vault buy&#39;s budget, the budget so far and what it is doing. &#x60;roundUp&#x60; is null when none is set.
[**getVaultMarketTax**](VaultMarketsApi.md#getVaultMarketTax) | **GET** /v1/vault-markets/tax | Your tax year on the vault markets: units bought and sold with cost, proceeds, gain and term; lending fees, staking interest (estimate), market-maker rewards; closed positions. Links to the CSV and PDF.
[**getVaultMarketTaxCsv**](VaultMarketsApi.md#getVaultMarketTaxCsv) | **GET** /v1/vault-markets/tax.csv | The tax year as a CSV: one row per sale, purchase, gift, income line and closed position.
[**getVaultMarketTaxLossSuggestion**](VaultMarketsApi.md#getVaultMarketTaxLossSuggestion) | **GET** /v1/vault-markets/tax/loss-suggestions | Tax-loss suggestions: the units you hold whose mark is below your cost, each with its lot (acquired when and how, cost in cents), short or long term if sold today and the day a short lot turns long, the estimated loss at the mark before selling fees, mark quality, what stops a sale, and a link to the ordinary sell ticket. With totals by term, the gains realised so far this year, and a not-tax-advice disclosure. Never sells.
[**getVaultMarketTaxPdf**](VaultMarketsApi.md#getVaultMarketTaxPdf) | **GET** /v1/vault-markets/tax.pdf | The tax year as a PDF summary.
[**getVaultMarketTca**](VaultMarketsApi.md#getVaultMarketTca) | **GET** /v1/vault-markets/tca | Your pro orders in a window (&#x60;from&#x60;, &#x60;to&#x60;; default 90 days) with arrival mark and mid, average fill, implementation shortfall, slippage, fill rate and time to fill.
[**getVaultMarketTcaByOrderId**](VaultMarketsApi.md#getVaultMarketTcaByOrderId) | **GET** /v1/vault-markets/tca/{orderId} | One order&#39;s TCA, including slippage against the VWAP of eligible trades while it worked.
[**getVaultMarketTod**](VaultMarketsApi.md#getVaultMarketTod) | **GET** /v1/vault-markets/tod | Your transfer-on-death setup: the gate and terms, whether you accepted them, your beneficiaries and shares, units with their designations and who the plan gives them to today, and open claims on your account (which you can stop). A TodOverview object, not a collection.
[**getVaultMarketTodMyClaim**](VaultMarketsApi.md#getVaultMarketTodMyClaim) | **GET** /v1/vault-markets/tod/my-claims | Claims you filed as a beneficiary: status in words, documents sent (names only), the waiting period, and units moved or held. A TodMyClaims object, not a collection.
[**getVaultMarketUnitAr**](VaultMarketsApi.md#getVaultMarketUnitAr) | **GET** /v1/vault-markets/units/{id}/ar | A vault unit as an AR model, for \&quot;See it in your room\&quot; (the web&#39;s /ar/vault-&lt;id&gt; page hands it to Scene Viewer, WebXR or Quick Look): title, model (a path under /models, without .glb, at real size), scanUrl (the unit&#39;s own captured mesh, when it has one), imageUrl, art, tint, scale, bookKey, backPath and mine. Your own units always; somebody else&#39;s only while they show it to visitors in a home you may enter (else 404).
[**getVaultMarketUnitEvidence**](VaultMarketsApi.md#getVaultMarketUnitEvidence) | **GET** /v1/vault-markets/units/{id}/evidence | Evidence on a vault unit:its 3D scans (model, texture, listing photos) and its grade report (grader, grade, cert, verified against the grader record, hub intake photos). No owner identity.
[**getVaultMarketUnitQuote**](VaultMarketsApi.md#getVaultMarketUnitQuote) | **GET** /v1/vault-markets/units/{id}/quote | The market around a vault unit: its mark and source, the best bid that could take it, the Instant Exit price (the best bid) and a pack pull&#39;s own sell-back credit.
[**getVaultMarketUnitStory**](VaultMarketsApi.md#getVaultMarketUnitStory) | **GET** /v1/vault-markets/units/{id}/story | One vault unit&#39;s story, oldest first: intake (with scan and grade evidence when it has some), grades, owners, sales at their prices, loans, pledges, Hall of Grails exhibitions, receipt-token exports and redemptions, and each warehouse-receipt hash-chain step (re-verified on read: chain.ok). People are named only while their public vault profile is on; others are &#39;A collector&#39;.
[**getVaultMarketValuationStatement**](VaultMarketsApi.md#getVaultMarketValuationStatement) | **GET** /v1/vault-markets/valuation-statements/{id} | One statement you issued: every unit, the totals by mark quality, the methodology, its sha256, its audit-chain seal and the verify link.
[**getVaultMarketValuationStatementPdf**](VaultMarketsApi.md#getVaultMarketValuationStatementPdf) | **GET** /v1/vault-markets/valuation-statements/{id}/pdf | One statement you issued as a PDF.
[**getVaultMarketValuationStatementPreview**](VaultMarketsApi.md#getVaultMarketValuationStatementPreview) | **GET** /v1/vault-markets/valuation-statements/preview | An insurance or appraisal statement for a day (purpose, asOf YYYY-MM-DD, default today), built but not issued: every unit you held that day at its mark, with quality, last trade, grade and cert, and the total. No id, no hash.
[**getVaultMarketValuationStatementVerify**](VaultMarketsApi.md#getVaultMarketValuationStatementVerify) | **GET** /v1/vault-markets/valuation-statements/{id}/verify | Check any issued statement by its id, as an insurer would: purpose, date, totals by mark quality and the sha256; intact (the stored record still hashes to it), seal.ok (its audit-chain entry still carries it) and, with ?hash&#x3D;, whether yours matches. Never the holder or the units.
[**getVaultMarketValue**](VaultMarketsApi.md#getVaultMarketValue) | **GET** /v1/vault-markets/value | A catalogue item&#39;s vault book keys (&#x60;?skuId&#x3D;&#x60;, optional &#x60;variantId&#x60;): each key&#39;s display mark with quality and n, units in the vault, the Instant Exit price a holder would get now, and whether it can be shipped in (ungraded keys).
[**getVaultMarketVaultSuggestionItem**](VaultMarketsApi.md#getVaultMarketVaultSuggestionItem) | **GET** /v1/vault-markets/vault-suggestions/items/{id} | One inventory item: its vault suggestion, or in plain words why there is none (&#x60;status&#x60;: suggested, not_found, no_stock, not_matched, in_vault or no_market).
[**getVaultMarketWidgetIndex**](VaultMarketsApi.md#getVaultMarketWidgetIndex) | **GET** /v1/vault-markets/widgets/index/{slug} | What the &lt;crossly-index&gt; widget shows: level, closes, quality, n, as-of, or &#x60;insufficient&#x60;.
[**getVaultMarketWidgetMark**](VaultMarketsApi.md#getVaultMarketWidgetMark) | **GET** /v1/vault-markets/widgets/mark | What the &lt;crossly-mark&gt; widget shows for &#x60;bookKey&#x60;: mark, quality, trades over 30 days, as-of, sparkline, or &#x60;insufficient&#x60;.
[**getVaultMarketWidgetSummary**](VaultMarketsApi.md#getVaultMarketWidgetSummary) | **GET** /v1/vault-markets/widget/summary | The home-screen widget summary: portfolio value at the mark with its move since the previous marks (cents and bps) and the share resting on reliable A/B marks, the three biggest movers among what you hold (the market movers when you hold nothing; &#x60;movers.source&#x60; says which), and one watchlist key (&#x60;?key&#x3D;&#x60; a book key on your watchlist; else your newest watch) with a 14-day sparkline. Every price is from the Crossly order book and carries its mark quality (A, B, C or none). Cached for five minutes.
[**getVaultMarketWorldFloor**](VaultMarketsApi.md#getVaultMarketWorldFloor) | **GET** /v1/vault-markets/world/floor | The Trading Floor in Crossly World: trades (the newest trades on every vault book in the last day, at most 40, newest first: bookKey, name, priceCents, priceText, side -- buy when a buyer took an ask, sell when a seller hit a bid, cross for an auction -- and ageS), tickers (the big board: the most-traded markets, each with its last trade price, the change from the last trade before today in basis points, trades today and the display mark with its quality), bell (Market Open: ringing for ten minutes after a new key opens, with the key and its market link, and what opens next) and trades24h. Every price is a trade on the Crossly order book; it never shows who traded. Nothing can be traded in the room.
[**getVaultMarketWorldLounge**](VaultMarketsApi.md#getVaultMarketWorldLounge) | **GET** /v1/vault-markets/world/lounge | The Vault Holders Lounge: the rule to join (held value at reliable marks, or a unit count), whether you may join now and what you hold toward it. Anyone may look in; only holders are seen there. No perks, nothing to trade.
[**getVaultMarketWorldPlaceVaultGate**](VaultMarketsApi.md#getVaultMarketWorldPlaceVaultGate) | **GET** /v1/vault-markets/world/places/{place}/vault-gate | The vault-holder door on a Crossly World room or Space, by its presence slug (a room share slug, or space-&lt;slug&gt;): the rule (minValueCents held at reliable A/B marks and/or minUnits units, mode any or all, optionally one product, bullion family or category), the rule in words, and whether you may join now with what you hold toward it. gate is null when the place has no vault door. Anyone may look in; only holders join.
[**getVaultMarketWorth**](VaultMarketsApi.md#getVaultMarketWorth) | **GET** /v1/vault-markets/worth | What one book key (variantId:condition:gradeKey, &#x60;bookKey&#x60;) is worth: the mark in cents with its quality (A from trades, B from firm quotes, C indicative, none) and band, what Instant Exit would pay for one unit now from the best resting bid (yours left out), and your units: how many you hold, how many are free to sell, their value at the mark and what selling every free one now would fetch from today’s bids. Plain-words &#x60;headline&#x60; and &#x60;lines&#x60;. Read only.
[**getVaultMarketWorthVault**](VaultMarketsApi.md#getVaultMarketWorthVault) | **GET** /v1/vault-markets/worth/vault | What your whole vault is worth now: value at the marks split into reliable and indicative marks, cost and P&amp;L, today’s change, and an estimate of what the units free to sell would fetch from the bids resting on the book now. Read only.
[**getVaultReceipt**](VaultMarketsApi.md#getVaultReceipt) | **GET** /v1/vault/receipts/{receiptNo} | One of your receipts with its full hash chain (issued, transferred, pledged, released, surrendered), re-verified on read: &#x60;chain.ok&#x60; is false if any event was altered.
[**getVaultReceiptToken**](VaultMarketsApi.md#getVaultReceiptToken) | **GET** /v1/vault/receipt-tokens/{id} | One receipt token (yours, or on a unit you own now) with its chain log: built, minted, frozen, thawed, new holder seen, redeem built, burned, with explorer links.
[**getVaultReceiptTokenByMint**](VaultMarketsApi.md#getVaultReceiptTokenByMint) | **GET** /v1/vault/receipt-tokens/by-mint/{mint} | What a Solana mint is: the warehouse receipt number and item it stands for, and whether the token is live, frozen (unit pledged or lent) or burned, and whether the unit is still on a vault shelf. Names no person and no wallet.
[**listVaultMarketAccounts**](VaultMarketsApi.md#listVaultMarketAccounts) | **GET** /v1/vault-markets/accounts | Every account you can act on: your own, and each sub-account your entity memberships reach, with your role.
[**listVaultMarketAdlEvents**](VaultMarketsApi.md#listVaultMarketAdlEvents) | **GET** /v1/vault-markets/adl/events | The ADL events your positions were part of, newest first: role bankrupt (yours went under water) or counterparty (yours was first in line), the price both closed at and the transfer status.
[**listVaultMarketAdlPositions**](VaultMarketsApi.md#listVaultMarketAdlPositions) | **GET** /v1/vault-markets/adl/positions | Your live positions, each with its place in its item ADL queue: lights 5 (first in line) to 1 (last), 0 when not in the queue (only profitable positions are), ranked by P&amp;L% x effective leverage.
[**listVaultMarketAgentDrafts**](VaultMarketsApi.md#listVaultMarketAgentDrafts) | **GET** /v1/vault-markets/agent/drafts | Limit orders the shopping agent drafted for you, newest first. A draft places nothing: send its orderBody to POST /api/v1/vault-markets/pro/orders to place it.
[**listVaultMarketAgentWatches**](VaultMarketsApi.md#listVaultMarketAgentWatches) | **GET** /v1/vault-markets/agent/watches | Your price watches on book keys (best bid, lowest ask, last trade or market price, in cents), live ones first. &#x60;?live&#x3D;true&#x60; for live only.
[**listVaultMarketAlertLog**](VaultMarketsApi.md#listVaultMarketAlertLog) | **GET** /v1/vault-markets/alert-log | What the alerts hub did with your recent vault alerts (&#x60;?limit&#x3D;&#x60; 1 to 200, default 50): kind, title, the channels it went to, what was held (channel:reason) and the email digest state.
[**listVaultMarketAlerts**](VaultMarketsApi.md#listVaultMarketAlerts) | **GET** /v1/vault-markets/alerts | Your price alerts on book keys.
[**listVaultMarketAuctions**](VaultMarketsApi.md#listVaultMarketAuctions) | **GET** /v1/vault-markets/auctions | Open vault auction events (weekly, ending Sunday; premier, units marked $10,000+) and their lots, soonest ending first.
[**listVaultMarketBlocks**](VaultMarketsApi.md#listVaultMarketBlocks) | **GET** /v1/vault-markets/blocks | An entity&#39;s block orders, newest first, each with its plan and how it was allocated.
[**listVaultMarketBullionFamilyPegs**](VaultMarketsApi.md#listVaultMarketBullionFamilyPegs) | **GET** /v1/vault-markets/bullion/family-pegs | Your family-wide spot-pegged quotes (live, or all with status&#x3D;all): one quote resting across a bullion family books at one condition, with units left, the peg, its status and every leg (the pegged quote on each book).
[**listVaultMarketBullionKeys**](VaultMarketsApi.md#listVaultMarketBullionKeys) | **GET** /v1/vault-markets/bullion/keys | Bullion key families (metal, form, size, mint or any mint): members, vault units, best resting bid and ask across their books, and spot as a labelled reference with what one unit of metal is worth at it. Spot is never a Crossly price.
[**listVaultMarketBullionPegs**](VaultMarketsApi.md#listVaultMarketBullionPegs) | **GET** /v1/vault-markets/bullion/pegs | Your spot-pegged quotes (live, or all with status&#x3D;all): side, units, the peg, the order it rests as, the last price and spot it was priced from, and why it is pulled when it is.
[**listVaultMarketCollectionWorth**](VaultMarketsApi.md#listVaultMarketCollectionWorth) | **GET** /v1/vault-markets/collection-worth | Your collection valued at the display marks: rows on a vault book key with a mark are summed; rows with no mark or no key are counted, never valued.
[**listVaultMarketConfirmations**](VaultMarketsApi.md#listVaultMarketConfirmations) | **GET** /v1/vault-markets/confirmations | Trade confirmations for your fills in a window (default 31 days): price, sale fee, maker or taker, order, vault unit and warehouse receipt.
[**listVaultMarketCreatorCohostInvites**](VaultMarketsApi.md#listVaultMarketCreatorCohostInvites) | **GET** /v1/vault-markets/creators/cohost-invites | For creators: your invites from Crossly to co-host a Market Open launch show (invited, accepted, declined or withdrawn), each with the key, its show and the guidance for co-hosts.
[**listVaultMarketCredit**](VaultMarketsApi.md#listVaultMarketCredit) | **GET** /v1/vault-markets/credit | Your vault loans and advances (live by default): what is owed, interest accrued, loan-to-value, the liquidation line and the collateral value it is called at.
[**listVaultMarketDealerBands**](VaultMarketsApi.md#listVaultMarketDealerBands) | **GET** /v1/vault-markets/dealer/bands | Your Instant Exit bands and whether each is being kept now.
[**listVaultMarketDealerBids**](VaultMarketsApi.md#listVaultMarketDealerBids) | **GET** /v1/vault-markets/dealer/bids | Your standing dealer bids: open (default) or all.
[**listVaultMarketDealerPoolFills**](VaultMarketsApi.md#listVaultMarketDealerPoolFills) | **GET** /v1/vault-markets/dealer/pools/{id}/fills | A curve pool&#39;s fills, newest first: side, price and spot after.
[**listVaultMarketDealerPools**](VaultMarketsApi.md#listVaultMarketDealerPools) | **GET** /v1/vault-markets/dealer/pools | Your curve pools: open (default) or all, each with its curve, spot, units, buy budget, running totals, the ladder it shows and its live legs.
[**listVaultMarketDigestHistory**](VaultMarketsApi.md#listVaultMarketDigestHistory) | **GET** /v1/vault-markets/digest/history | Past weekly digests: week, status (sent / skipped / failed), the channels used and a summary.
[**listVaultMarketEntityAudit**](VaultMarketsApi.md#listVaultMarketEntityAudit) | **GET** /v1/vault-markets/entities/{id}/audit | The entity&#39;s audit trail, newest first: hash-chained rows with actor, account, API key, IP, session and source.
[**listVaultMarketEntityConversions**](VaultMarketsApi.md#listVaultMarketEntityConversions) | **GET** /v1/vault-markets/entities/{id}/conversions | The custodian&#39;s CBX-to-USD reward conversions for an entity that elected USD, newest first, with their status.
[**listVaultMarketEstimatesAccuracy**](VaultMarketsApi.md#listVaultMarketEstimatesAccuracy) | **GET** /v1/vault-markets/estimates-accuracy | The Crossly Estimate&#39;s track record: walk-forward backtest n, FSD and bias per method, category and liquidity bucket, and whether estimates in that cell are shown.
[**listVaultMarketFeed**](VaultMarketsApi.md#listVaultMarketFeed) | **GET** /v1/vault-markets/feed | New vault buys by the people you follow who share them, newest first (no prices). Page with &#x60;before&#x60; (the last item&#39;s &#x60;at&#x60;).
[**listVaultMarketFollowCopyWatch**](VaultMarketsApi.md#listVaultMarketFollowCopyWatch) | **GET** /v1/vault-markets/follows/copy-watch | The collectors you copy-watch and whether each still shares bids and asks.
[**listVaultMarketFollowCopyWatchAlerts**](VaultMarketsApi.md#listVaultMarketFollowCopyWatchAlerts) | **GET** /v1/vault-markets/follows/copy-watch/alerts | Your copy-watch alerts, newest first: who, bid or ask, quantity, limit price, market, and whether it still rests. Page with &#x60;before&#x60;.
[**listVaultMarketFollowFeed**](VaultMarketsApi.md#listVaultMarketFollowFeed) | **GET** /v1/vault-markets/follows/feed | Public vault activity of the collectors you follow (buys, units sent in, sales, Hall loans), newest first, never a price. Filter with &#x60;kinds&#x60;; page with &#x60;before&#x60;.
[**listVaultMarketFollowFollowing**](VaultMarketsApi.md#listVaultMarketFollowFollowing) | **GET** /v1/vault-markets/follows/following | The collectors you follow who have a public vault: what each shares and whether you copy-watch them.
[**listVaultMarketFollowLeaderboards**](VaultMarketsApi.md#listVaultMarketFollowLeaderboards) | **GET** /v1/vault-markets/follows/leaderboards | An opt-in return leaderboard (&#x60;period&#x60; 30d, 90d or 365d; &#x60;category&#x60; all or a category slug), ranked by risk-adjusted return from the book A/B marks. Percent and risk only: no dollars, no volume.
[**listVaultMarketFollowProfileActivity**](VaultMarketsApi.md#listVaultMarketFollowProfileActivity) | **GET** /v1/vault-markets/follows/profiles/{handle}/activity | One collector public vault activity, newest first, never a price. 404 when their vault is not public.
[**listVaultMarketGifts**](VaultMarketsApi.md#listVaultMarketGifts) | **GET** /v1/vault-markets/gifts | Gifts you sent and received, newest first, with their status.
[**listVaultMarketGradeToVault**](VaultMarketsApi.md#listVaultMarketGradeToVault) | **GET** /v1/vault-markets/grade-to-vault | Your Grade to Vault flows, newest first, each brought up to date: its step, the grading submission, the unit, the grade, the market for it, and the ask once listed. &#x60;live&#x3D;1&#x60; for those still going.
[**listVaultMarketGrading**](VaultMarketsApi.md#listVaultMarketGrading) | **GET** /v1/vault-markets/grading | Your vault units sent to grading: where each card is in its run, and the grade once it is back.
[**listVaultMarketHallLenders**](VaultMarketsApi.md#listVaultMarketHallLenders) | **GET** /v1/vault-markets/hall/lenders | The vault units lent to this week&#39;s Hall of Grails exhibition and on show now, in plinth order: the item (skuId, name, imageUrl, grade), the lender as the plate names them (a display name, or \&quot;a collector\&quot;), the plate lines and how many exhibitions the unit has stood in. meta.exhibition is the week (key, title, endsAt). Names no ids and no amounts.
[**listVaultMarketIndexCommitteeMinutes**](VaultMarketsApi.md#listVaultMarketIndexCommitteeMinutes) | **GET** /v1/vault-markets/index-committee/minutes | Published Index Committee minutes, newest first: attendees (names and roles), quorum, agenda, minutes and decisions.
[**listVaultMarketIndexComplaints**](VaultMarketsApi.md#listVaultMarketIndexComplaints) | **GET** /v1/vault-markets/index-complaints | Your complaints and their answers, newest first.
[**listVaultMarketIndexConstituents**](VaultMarketsApi.md#listVaultMarketIndexConstituents) | **GET** /v1/vault-markets/indexes/{slug}/constituents | The book keys in an index with their weight, move since the last close and contribution to the index&#39;s move (basis points).
[**listVaultMarketIndexConsultations**](VaultMarketsApi.md#listVaultMarketIndexConsultations) | **GET** /v1/vault-markets/index-consultations | Consultations on index method changes (open for at least 30 days), newest first. Filter by &#x60;status&#x60;.
[**listVaultMarketIndexEvents**](VaultMarketsApi.md#listVaultMarketIndexEvents) | **GET** /v1/vault-markets/index-events | Every index event, newest first: add, delete, rebalance, method, correction, halt; each with when it was announced, when it takes effect, the detail and the reason. Filter by &#x60;kind&#x60;.
[**listVaultMarketIndexEventsBySlug**](VaultMarketsApi.md#listVaultMarketIndexEventsBySlug) | **GET** /v1/vault-markets/indexes/{slug}/events | One index&#39;s events, newest first.
[**listVaultMarketIndexJudgments**](VaultMarketsApi.md#listVaultMarketIndexJudgments) | **GET** /v1/vault-markets/index-judgments | The expert-judgment log: every Index Committee action (halt, resume, exclude a key, void a trade, restate, retire) with its written reason.
[**listVaultMarketIndexLevelSeries**](VaultMarketsApi.md#listVaultMarketIndexLevelSeries) | **GET** /v1/vault-markets/indexes/{slug}/level-series | An index&#39;s published levels. &#x60;engine&#x3D;chain&#x60; (default): daily closes. &#x60;engine&#x3D;tpd|repeat_sales&#x60;: weekly (else monthly) model estimates with a 95% band and n; labelled, never a price. &#x60;series&#x3D;settlement&#x60; returns each value as first published (never restated). Below the data gate &#x60;data&#x60; is empty and &#x60;notice&#x60; explains.
[**listVaultMarketIndexLicenceMine**](VaultMarketsApi.md#listVaultMarketIndexLicenceMine) | **GET** /v1/vault-markets/index-licence/mine | Your index feed licences (the indexes each covers, or all), as ops recorded them. No licence: the feed answers 403 not_a_licensee.
[**listVaultMarketIndexMembers**](VaultMarketsApi.md#listVaultMarketIndexMembers) | **GET** /v1/vault-markets/indexes/{slug}/members | The members of an index on a day (&#x60;asOf&#x60;, default today) with their weights, shares, moves and contributions; for a past day, the inputs stored with that day&#39;s close and each member&#39;s effective dates.
[**listVaultMarketIndexMovers**](VaultMarketsApi.md#listVaultMarketIndexMovers) | **GET** /v1/vault-markets/indexes/movers | The built-in indexes that moved most since their last daily close.
[**listVaultMarketIndexes**](VaultMarketsApi.md#listVaultMarketIndexes) | **GET** /v1/vault-markets/indexes | Indexes over book keys: per category, per top brand, the Crossly 50 and your own. Each with its level now (base 1000 at inception) and change since the last daily close.
[**listVaultMarketInstantExitHistory**](VaultMarketsApi.md#listVaultMarketInstantExitHistory) | **GET** /v1/vault-markets/instant-exit/history | Your Instant Exits, newest first: quoted price, mark, and whether it filled.
[**listVaultMarketInstantExitHoldings**](VaultMarketsApi.md#listVaultMarketInstantExitHoldings) | **GET** /v1/vault-markets/instant-exit/holdings | Instant Exit quotes for everything you hold in the vault, one per book key, with units held and which are free to sell.
[**listVaultMarketJointTrades**](VaultMarketsApi.md#listVaultMarketJointTrades) | **GET** /v1/vault-markets/joint/{id}/trades | The joint vault trades, newest first: side, book key, limit, who started it, whose account the order sits on, and the order standing on the book.
[**listVaultMarketLargeTraderReports**](VaultMarketsApi.md#listVaultMarketLargeTraderReports) | **GET** /v1/vault-markets/large-trader-reports | Your large-trader reports (with any linked accounts, as one party): due first, then filed, then cleared in the last 90 days. Each has &#x60;action&#x60;: file | amend | refile | none.
[**listVaultMarketLendingStatements**](VaultMarketsApi.md#listVaultMarketLendingStatements) | **GET** /v1/vault-markets/lending/statements | The days you have stored collateral statements for, newest first, with their summary.
[**listVaultMarketLoans**](VaultMarketsApi.md#listVaultMarketLoans) | **GET** /v1/vault-markets/loans | Units you lent: rate, fees earned, recall due.
[**listVaultMarketLocateMine**](VaultMarketsApi.md#listVaultMarketLocateMine) | **GET** /v1/vault-markets/locates/mine | Your locates, newest first (held / used / released / expired).
[**listVaultMarketMidpoint**](VaultMarketsApi.md#listVaultMarketMidpoint) | **GET** /v1/vault-markets/midpoint | Your midpoint block orders.
[**listVaultMarketMovers**](VaultMarketsApi.md#listVaultMarketMovers) | **GET** /v1/vault-markets/movers | Vault items with the biggest 24 h moves in their market price (from the order book), with units in the vault.
[**listVaultMarketNavHistory**](VaultMarketsApi.md#listVaultMarketNavHistory) | **GET** /v1/vault-markets/nav/history | Daily NAV snapshots (mark, bid, liquidation, Level 2 / Level 3).
[**listVaultMarketOffers**](VaultMarketsApi.md#listVaultMarketOffers) | **GET** /v1/vault-markets/offers | The offers inbox: for each book key you hold, the best bid from someone else, units at it, the top bid levels, the mark, and your alert.
[**listVaultMarketOpening**](VaultMarketsApi.md#listVaultMarketOpening) | **GET** /v1/vault-markets/opening | Keys opening soon on the vault book (and just opened): units on the shelf, dealers quoting, the waitlist, the mark when the book has one, and your place.
[**listVaultMarketOracleHistory**](VaultMarketsApi.md#listVaultMarketOracleHistory) | **GET** /v1/vault-markets/oracle/{slug}/history | Recent publish attempts for an index over 30 days, newest first: published, skipped (with the reason: too few items priced, stale marks, confidence too wide...) or failed (with the error). Filter with &#x60;status&#x60;, cap with &#x60;limit&#x60; (default 100).
[**listVaultMarketP2pAuctions**](VaultMarketsApi.md#listVaultMarketP2pAuctions) | **GET** /v1/vault-markets/p2p/auctions | Running refinancing auctions, soonest to end first: lenders calls (&#x60;auction&#x60;) and borrowers looking for a cheaper lender (&#x60;refiAuction&#x60;). The payoff now, the rate a new lender gets now, when it ends, and the item.
[**listVaultMarketP2pLoans**](VaultMarketsApi.md#listVaultMarketP2pLoans) | **GET** /v1/vault-markets/p2p/loans | Your P2P loans as borrower and/or lender (&#x60;role&#x60;), live by default (&#x60;status&#x60;): what is owed now, daily interest, the refinancing auction when called, and the item mark for information only (it never triggers anything).
[**listVaultMarketP2pOfferMine**](VaultMarketsApi.md#listVaultMarketP2pOfferMine) | **GET** /v1/vault-markets/p2p/offers/mine | Your P2P loan offers, newest first, with how many loans each has funded.
[**listVaultMarketP2pOffers**](VaultMarketsApi.md#listVaultMarketP2pOffers) | **GET** /v1/vault-markets/p2p/offers | The open P2P loan offers book, lowest rate first: cents offered per loan, APR (bps), loans left, and the item (book key) or unit each lends against. &#x60;bookKey&#x60; narrows to one item. Lender identities are never shown.
[**listVaultMarketP2pUnits**](VaultMarketsApi.md#listVaultMarketP2pUnits) | **GET** /v1/vault-markets/p2p/units | Your vault units for P2P borrowing: whether each can be pledged now (and why not), the best offers covering it, and its loan when it has one.
[**listVaultMarketPaperFills**](VaultMarketsApi.md#listVaultMarketPaperFills) | **GET** /v1/vault-markets/paper/fills | Your paper fills since your last reset, newest first: price, simulated fee, taker or maker, and whether a visible real order (book) or a real trade (tape) filled it. Play money only.
[**listVaultMarketPaperLeaderboard**](VaultMarketsApi.md#listVaultMarketPaperLeaderboard) | **GET** /v1/vault-markets/paper/leaderboard | The weekly paper trading leaderboard (opt-in, display names only): best return on play equity this week (or a past &#x60;week&#x60;, its Monday as YYYY-MM-DD), with your own line. Nothing is won or paid.
[**listVaultMarketPaperMissions**](VaultMarketsApi.md#listVaultMarketPaperMissions) | **GET** /v1/vault-markets/paper/missions | Your paper-trading missions (play money only): each mission with what to do, your count toward its target, whether it is done and when, plus a suggested market for the \&quot;Read the mark\&quot; mission. Progress is observed by the server from your paper orders and fills, price watches, set goals and graded mark checks. Missions earn world quest progress and cosmetic pins, never money.
[**listVaultMarketPaperOrders**](VaultMarketsApi.md#listVaultMarketPaperOrders) | **GET** /v1/vault-markets/paper/orders | Your paper orders since your last reset, newest first: working, done (filled, cancelled, expired) or all. Play money only.
[**listVaultMarketPartnerAccruals**](VaultMarketsApi.md#listVaultMarketPartnerAccruals) | **GET** /v1/vault-markets/partners/accruals | Your partner fee shares, newest first: accrued on a unit&#39;s first sale, paid in Bucks once the sale is final, void if it was refunded.
[**listVaultMarketPoolStakes**](VaultMarketsApi.md#listVaultMarketPoolStakes) | **GET** /v1/vault-markets/pool/stakes | Your stakes in the market pool and what each redeems for now.
[**listVaultMarketPortfolioMarginHistory**](VaultMarketsApi.md#listVaultMarketPortfolioMarginHistory) | **GET** /v1/vault-markets/portfolio-margin/history | The 5-minute portfolio margin recalculations for a firm sub-account over the last &#x60;hours&#x60; (default 24, at most 720), newest first: equity, requirement, excess, scenario and floor figures, gross and state.
[**listVaultMarketPositionUnits**](VaultMarketsApi.md#listVaultMarketPositionUnits) | **GET** /v1/vault-markets/positions/{id}/units | The vault units of one of your positions that you hold (a leveraged long&#39;s collateral), each with its story link.
[**listVaultMarketPositions**](VaultMarketsApi.md#listVaultMarketPositions) | **GET** /v1/vault-markets/positions | Your positions, live (default) or closed.
[**listVaultMarketPositionsRisk**](VaultMarketsApi.md#listVaultMarketPositionsRisk) | **GET** /v1/vault-markets/positions-risk | For each live position: its tier, health, margin state, the mark at which it is called and the mark at which it is liquidated, and the distance to it.
[**listVaultMarketPriceWidgets**](VaultMarketsApi.md#listVaultMarketPriceWidgets) | **GET** /v1/vault-markets/price-widgets | Your price widgets, newest first, each with its iframe and script-tag snippets. &#x60;meta.codes&#x60; lists your affiliate codes a widget can link through; &#x60;meta.max&#x60; is the cap on live widgets.
[**listVaultMarketProCandles**](VaultMarketsApi.md#listVaultMarketProCandles) | **GET** /v1/vault-markets/pro/candles | OHLCV candles (1m, 5m, 15m, 1h, 4h, 1d) from the trades on a book key.
[**listVaultMarketProEvents**](VaultMarketsApi.md#listVaultMarketProEvents) | **GET** /v1/vault-markets/pro/events | Your order event log after a sequence number (new, leg, fill, replaced, cancelled, expired, done): a replayable drop copy.
[**listVaultMarketProLinks**](VaultMarketsApi.md#listVaultMarketProLinks) | **GET** /v1/vault-markets/pro/links | Your linked orders (brackets, OCO pairs, trailing stops, position exits): live (default) or done.
[**listVaultMarketProOrders**](VaultMarketsApi.md#listVaultMarketProOrders) | **GET** /v1/vault-markets/pro/orders | Your orders: open (default) or done, optionally on one book key, or only those booked to one sub-account (&#x60;subaccountId&#x60;).
[**listVaultMarketProQuotes**](VaultMarketsApi.md#listVaultMarketProQuotes) | **GET** /v1/vault-markets/pro/quotes | Your live quotes.
[**listVaultMarketProRewards**](VaultMarketsApi.md#listVaultMarketProRewards) | **GET** /v1/vault-markets/pro/rewards | Your daily market-maker liquidity rewards (paid in CBX).
[**listVaultMarketProTape**](VaultMarketsApi.md#listVaultMarketProTape) | **GET** /v1/vault-markets/pro/tape | The latest trades on a book key, newest first, with which side made and which took.
[**listVaultMarketProofOfReserveLeaves**](VaultMarketsApi.md#listVaultMarketProofOfReserveLeaves) | **GET** /v1/vault-markets/proof-of-reserves/{day}/leaves | One day&#39;s leaf hashes in tree order, a page at a time: enough to recount the units and rebuild the root yourself. Leaves are salted, so they name no owner.
[**listVaultMarketRecurring**](VaultMarketsApi.md#listVaultMarketRecurring) | **GET** /v1/vault-markets/recurring | Your recurring buys: key, schedule, price cap, payment, auto-lend, next run.
[**listVaultMarketRecurringRuns**](VaultMarketsApi.md#listVaultMarketRecurringRuns) | **GET** /v1/vault-markets/recurring/{id}/runs | One recurring buy&#39;s runs: filled, skipped (with the reason, e.g. the price was over the cap) or failed.
[**listVaultMarketRecurringRuns2**](VaultMarketsApi.md#listVaultMarketRecurringRuns2) | **GET** /v1/vault-markets/recurring-runs | Every run of all your recurring buys, newest first.
[**listVaultMarketRfq**](VaultMarketsApi.md#listVaultMarketRfq) | **GET** /v1/vault-markets/rfq | Your quote requests, newest first.
[**listVaultMarketRfqInbox**](VaultMarketsApi.md#listVaultMarketRfqInbox) | **GET** /v1/vault-markets/rfq/inbox | Open quote requests you were sent (as a dealer, DMM, LP or holder), with your live answer.
[**listVaultMarketRfqOpen**](VaultMarketsApi.md#listVaultMarketRfqOpen) | **GET** /v1/vault-markets/rfq/open | Open quote requests on one key (all-to-all: anyone with ID may answer). Anonymous.
[**listVaultMarketSetGoalBaskets**](VaultMarketsApi.md#listVaultMarketSetGoalBaskets) | **GET** /v1/vault-markets/set-goals/{id}/baskets | A set goal basket bids, newest first, each with its budget, what it committed and spent, and every leg (piece, book key, limit, pro order id, status).
[**listVaultMarketSetGoalSets**](VaultMarketsApi.md#listVaultMarketSetGoalSets) | **GET** /v1/vault-markets/set-goals/sets | Sets to start a goal on. With q (2+ characters): a word-start search of every catalogue set. Without: the sets you hold pieces of in the vault, then the collections you are building. Each with your live goal on it, if any.
[**listVaultMarketSetGoals**](VaultMarketsApi.md#listVaultMarketSetGoals) | **GET** /v1/vault-markets/set-goals | Your set goals: the set, the target a piece must meet, pieces held of the total (from your vault), and the working basket bid.
[**listVaultMarketShareCards**](VaultMarketsApi.md#listVaultMarketShareCards) | **GET** /v1/vault-markets/share-cards | Your share cards (not taken down), each as the public sees it.
[**listVaultMarketSupplyDeposits**](VaultMarketsApi.md#listVaultMarketSupplyDeposits) | **GET** /v1/vault-markets/supply/deposits | Your units sent to the vault, newest first, each with its state and its key&#39;s Instant Exit line (\&quot;Instant Exit now: $X (N% of mark)\&quot; or \&quot;No market yet\&quot;). Filter with &#x60;inventoryItemIds&#x60; (comma-separated).
[**listVaultMarketSupplyInvites**](VaultMarketsApi.md#listVaultMarketSupplyInvites) | **GET** /v1/vault-markets/supply/invites | Market Open invites to you as a dealer: keys Crossly is opening and asks you to quote.
[**listVaultMarketValuationStatements**](VaultMarketsApi.md#listVaultMarketValuationStatements) | **GET** /v1/vault-markets/valuation-statements | The insurance and appraisal statements you issued, newest first: purpose, date, units, total at the marks, hash and verify link.
[**listVaultMarketVaultSuggestions**](VaultMarketsApi.md#listVaultMarketVaultSuggestions) | **GET** /v1/vault-markets/vault-suggestions | What to send to the vault: your inventory items whose book key has a liquid vault market (tier A, B or C), best first. Each has a score (0 to 100) and its reasons, the market (tier, mark and its quality, best bid, best vault ask, spread), Instant Exit now, your list price, days listed without selling, and the vault fee. &#x60;meta.summary&#x60; counts what was left out and why. Inform only; send with POST /api/v1/vault-markets/supply/send.
[**listVaultMarketWatchlist**](VaultMarketsApi.md#listVaultMarketWatchlist) | **GET** /v1/vault-markets/watchlist | Your watched book keys with mark, 24 h and 7 d change, and the last 30 daily marks (sparkline).
[**listVaultMarketWidgetTokens**](VaultMarketsApi.md#listVaultMarketWidgetTokens) | **GET** /v1/vault-markets/widget/tokens | Your live home-screen widget tokens, one per phone: id, name (the phone), public prefix, created and last used. The secret is never returned again.
[**listVaultMarketWorldCohosts**](VaultMarketsApi.md#listVaultMarketWorldCohosts) | **GET** /v1/vault-markets/world/cohosts | Market Open launch shows a verified creator co-hosts that are on now or opening soon: the key, its phase, the show, the creator (named only while their vault profile is public), their room link and, when the creator is in the creator programme, the disclosure that they may earn a share of the fee Crossly keeps. Never a prompt to trade.
[**listVaultMarketWorldCreatorRooms**](VaultMarketsApi.md#listVaultMarketWorldCreatorRooms) | **GET** /v1/vault-markets/world/creator-rooms | Verified creators whose public vault shelf is a world room: title, the creator, the room link and the disclosure. Rooms show each market share of the shelf, never amounts.
[**listVaultMarketWorldMarketOpen**](VaultMarketsApi.md#listVaultMarketWorldMarketOpen) | **GET** /v1/vault-markets/world/market-open | Market Open events in the Crossly World Commons: keys opening soon and those that opened in the last few hours, live first then soonest, each with its board line, units on the shelf, dealers quoting and the launch show when there is one. Never a prompt to trade.
[**listVaultReceiptTokenWallets**](VaultMarketsApi.md#listVaultReceiptTokenWallets) | **GET** /v1/vault/receipt-tokens/wallets | Your verified Solana wallets and whether each is on the receipt-token allow-list (receipt tokens move only between allow-listed wallets). meta.state is the gate.
[**listVaultReceiptTokens**](VaultMarketsApi.md#listVaultReceiptTokens) | **GET** /v1/vault/receipt-tokens | Your vault units with their warehouse receipt and receipt-token state (not exported, waiting for a signature, in a wallet, frozen, redeemed), whether each can be exported now and why not. meta.state is the gate (open, missing envs, program id, authority, terms version, cluster); meta.history is your last 50 exports.
[**listVaultReceipts**](VaultMarketsApi.md#listVaultReceipts) | **GET** /v1/vault/receipts | Your warehouse receipts (documents of title for your vault units), live first. meta.receipts says whether receipts are registered (VAULT_WAREHOUSE_ISSUER) and their terms version.
[**listVaultUnitList**](VaultMarketsApi.md#listVaultUnitList) | **GET** /v1/vault/unit-list | The published unit list (bar-list equivalent): every unit on a vault shelf with its warehouse receipt number (when receipts are registered), book key, shelf location code, insured value, status, pledged / on-loan flags and a per-receipt hashed holder (never a name or id). Filter with &#x60;bookKey&#x60;; pages with &#x60;page&#x60; / &#x60;limit&#x60;.
[**updateVaultMarketAlertPref**](VaultMarketsApi.md#updateVaultMarketAlertPref) | **PUT** /v1/vault-markets/alert-prefs | Change vault alert settings: &#x60;matrix&#x60; ({ kind: { channel: true|false } }, merged onto what is set), &#x60;quietHours&#x60; ({ start: \&quot;HH:MM\&quot;, end: \&quot;HH:MM\&quot;, tz } or null to clear) and &#x60;telegram&#x60; (the Telegram master switch). Locked switches are ignored. Returns the new settings.
[**updateVaultMarketBlockAllocation**](VaultMarketsApi.md#updateVaultMarketBlockAllocation) | **PUT** /v1/vault-markets/blocks/{orderId}/allocation | Post-trade allocation: set or replace the plan for a buy you placed for one of the entity&#39;s sub-accounts (that sub-account leads). Refused once any share has moved.
[**updateVaultMarketChannel**](VaultMarketsApi.md#updateVaultMarketChannel) | **PUT** /v1/vault-markets/channels | Change the switches: &#x60;telegramAlerts&#x60;, &#x60;telegramDigest&#x60;, &#x60;pushCapPerDay&#x60; (0 to 20). Margin calls and recalls are never capped. Returns the new view.
[**updateVaultMarketDealerBand**](VaultMarketsApi.md#updateVaultMarketDealerBand) | **PUT** /v1/vault-markets/dealer/bands | Commit to an Instant Exit band on a key: a standing bid for &#x60;units&#x60; kept at &#x60;bandBps&#x60; of the mark, never above &#x60;maxPriceCents&#x60;, re-quoted as the mark moves.
[**updateVaultMarketDealerPool**](VaultMarketsApi.md#updateVaultMarketDealerPool) | **PATCH** /v1/vault-markets/dealer/pools/{id} | Change a curve pool: spot, step, fee, levels, units, buy budget, floor, ceiling, or pause / resume. Re-quoted at once.
[**updateVaultMarketEntityMember**](VaultMarketsApi.md#updateVaultMarketEntityMember) | **PATCH** /v1/vault-markets/entities/{id}/members/{memberId} | Admin: change a member&#39;s role, limits or sub-accounts. The last admin cannot be demoted.
[**updateVaultMarketEntitySubaccountLimit**](VaultMarketsApi.md#updateVaultMarketEntitySubaccountLimit) | **PUT** /v1/vault-markets/entities/{id}/subaccounts/{subId}/limits | Admin: set a sub-account&#39;s limits (per-order notional, units per key, gross, net, leverage), held to the entity&#39;s caps. &#x60;limits: null&#x60; clears them.
[**updateVaultMarketEntityUsdElection**](VaultMarketsApi.md#updateVaultMarketEntityUsdElection) | **PUT** /v1/vault-markets/entities/{id}/usd-election | Admin: elect USD for the entity (&#x60;usdOnly&#x60;). Its sub-accounts then post collateral in USD only and pay every fee in USD, and any CBX reward paid to one of them is converted to USD by the custodian in that account. Audited; it can be turned off again.
[**updateVaultMarketFollowCopyWatch**](VaultMarketsApi.md#updateVaultMarketFollowCopyWatch) | **PUT** /v1/vault-markets/follows/copy-watch/{handle} | Copy-watch a collector who shares bids and asks: you get an alert when they rest a new one. It never places an order for you.
[**updateVaultMarketFollowSharing**](VaultMarketsApi.md#updateVaultMarketFollowSharing) | **PUT** /v1/vault-markets/follows/sharing | Turn sharing switches on or off (&#x60;isPublic&#x60;, &#x60;showBuys&#x60;, &#x60;deposits&#x60;, &#x60;sales&#x60;, &#x60;hallLoans&#x60;, &#x60;orders&#x60;, &#x60;leaderboard&#x60;). A switch shows only what happens after it goes on; all but the profile itself need the profile public.
[**updateVaultMarketHomeUnit**](VaultMarketsApi.md#updateVaultMarketHomeUnit) | **PUT** /v1/vault-markets/home/units | Show exactly these vault units in your Crossly World home: { units: [{ vaultItemId, visitors }] }. Units left out come out of their cases; units already standing stay where they are; new ones go into a free display-case or shelf slot, else a glass case of their own along a wall. visitors: true lets people who may enter your home see that unit (default false: only you). Returns placed, unplaced (no free case: the home is full), refused (with why) and the desk. Display only: nothing moves.
[**updateVaultMarketIndex**](VaultMarketsApi.md#updateVaultMarketIndex) | **PATCH** /v1/vault-markets/indexes/{slug} | Rename, re-weight, share or change the keys of an index of your own; its level carries on.
[**updateVaultMarketLendingElection**](VaultMarketsApi.md#updateVaultMarketLendingElection) | **PUT** /v1/vault-markets/lending/election | Change your lender election (applies to loans opened after the change). Needs lending.
[**updateVaultMarketMmMmp**](VaultMarketsApi.md#updateVaultMarketMmMmp) | **PUT** /v1/vault-markets/mm/mmp | Set market-maker protection: N units or $X filled on your quotes within T seconds pulls every quote and freezes quoting for a set time.
[**updateVaultMarketMode**](VaultMarketsApi.md#updateVaultMarketMode) | **PUT** /v1/vault-markets/mode | Choose your Vault Markets mode: &#x60;mode&#x60; simple or pro. Remembered for you on the web and in the app. A display preference only: it places nothing and moves no money.
[**updateVaultMarketOfferAlert**](VaultMarketsApi.md#updateVaultMarketOfferAlert) | **PUT** /v1/vault-markets/offers/alert | Set (or clear with null) the bid price that should always notify you on a key you hold, and mute or unmute offer notices on it.
[**updateVaultMarketPaperLeaderboard**](VaultMarketsApi.md#updateVaultMarketPaperLeaderboard) | **PUT** /v1/vault-markets/paper/leaderboard | Join or leave the weekly paper leaderboard. Joining needs a display name (2 to 24 letters, numbers, spaces, dots, dashes or underscores), never your real name. Returns &#x60;{ optIn, displayName }&#x60;.
[**updateVaultMarketPositionExit**](VaultMarketsApi.md#updateVaultMarketPositionExit) | **PUT** /v1/vault-markets/positions/{id}/exits | Set a position&#39;s take-profit / stop-loss: a long is closed, a short covered, when the last trade reaches one. Both null clears them.
[**updateVaultMarketPriceWidget**](VaultMarketsApi.md#updateVaultMarketPriceWidget) | **PATCH** /v1/vault-markets/price-widgets/{id} | Change a widget: name, range, layout, theme, affiliate code (null for none) or allowed sites. The market or index it shows never changes: make a new widget for another.
[**updateVaultMarketProfile**](VaultMarketsApi.md#updateVaultMarketProfile) | **PUT** /v1/vault-markets/profile | Turn your public vault profile on or off (&#x60;isPublic&#x60;) and whether followers see your new buys (&#x60;showBuys&#x60;). It shows weights by market, never dollars.
[**updateVaultMarketRecurring**](VaultMarketsApi.md#updateVaultMarketRecurring) | **PATCH** /v1/vault-markets/recurring/{id} | Change a recurring buy&#39;s schedule, caps, cards or auto-lend, or pause / resume it.
[**updateVaultMarketSetGoal**](VaultMarketsApi.md#updateVaultMarketSetGoal) | **PATCH** /v1/vault-markets/set-goals/{id} | Change what a piece must be to count (condition, grade mode, grade). Refused while a basket bid works: cancel it first.
[**updateVaultMarketShareCard**](VaultMarketsApi.md#updateVaultMarketShareCard) | **PATCH** /v1/vault-markets/share-cards/{id} | Show or hide the dollar amounts on one of your share cards (&#x60;showAmounts&#x60;).
[**updateVaultMarketSupplyDeposit**](VaultMarketsApi.md#updateVaultMarketSupplyDeposit) | **PATCH** /v1/vault-markets/supply/deposits/{id} | Change a deposit&#39;s toggles: &#x60;autoListBps&#x60; (list at that share of the mark once stored; null &#x3D; do not) and &#x60;lendWhenIdle&#x60;.
[**updateVaultMarketSupplyRoundUp**](VaultMarketsApi.md#updateVaultMarketSupplyRoundUp) | **PUT** /v1/vault-markets/supply/round-up | Set the round-up: &#x60;shareBps&#x60; (1%-50%) of each payout released to you adds to a budget; when it covers the cheapest vault unit on &#x60;bookKey&#x60;, one unit is bought with your saved card, never above the budget.
[**updateVaultMarketTodBeneficiary**](VaultMarketsApi.md#updateVaultMarketTodBeneficiary) | **PUT** /v1/vault-markets/tod/beneficiaries | Replace your beneficiary list (keep an id to edit one): full name, contact (email or @username), relationship, and share in basis points; shares add up to 10000. Returns &#x60;{ beneficiaries, removed }&#x60;.
[**updateVaultMarketTodDesignation**](VaultMarketsApi.md#updateVaultMarketTodDesignation) | **PUT** /v1/vault-markets/tod/designations | Leave one of your units to one beneficiary (beneficiaryId null clears it; the unit then follows the shares). Returns &#x60;{ vaultItemId, beneficiaryId }&#x60;.
[**updateVaultMarketWorldRoomVaultGate**](VaultMarketsApi.md#updateVaultMarketWorldRoomVaultGate) | **PUT** /v1/vault-markets/world/rooms/{id}/vault-gate | Set the vault-holder door on your own room (its collection rooms follow): visitors must hold minValueCents (cents, at reliable A/B marks) and/or minUnits units in the Crossly vault, mode any (either) or all (both), optionally only one product (scope kind product, ref the catalogue product id), bullion family (bullion, the family slug) or category (category, the slug). Send null to open it again. Returns &#x60;{ gate }&#x60;. Moves no money.
[**updateVaultMarketWorldSpaceVaultGate**](VaultMarketsApi.md#updateVaultMarketWorldSpaceVaultGate) | **PUT** /v1/vault-markets/world/spaces/{slug}/vault-gate | Set the vault-holder door on a Space you host: the same rule as a room (minValueCents at reliable marks and/or minUnits, mode, optional scope). Send null to open it again. Returns &#x60;{ gate }&#x60;. Moves no money.


<a name="createVaultLend"></a>
# **createVaultLend**
> CreateVaultLendResponse createVaultLend(id)

Turn lending on or off for a unit you own in the vault, optionally with your minimum borrow rate (APR in basis points). Returns &#x60;{ lendEnabled, minAprBps }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultLendResponse = apiInstance.createVaultLend(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultLend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultLend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultLendResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAccount"></a>
# **createVaultMarketAccount**
> StatusResponse createVaultMarketAccount()

Open your account at the custodian partner (once). Returns &#x60;{ status }&#x60;; the custodian verifies it before it is active.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : StatusResponse = apiInstance.createVaultMarketAccount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAccount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAdminMark"></a>
# **createVaultMarketAdminMark**
> CreateVaultMarketAdminMarkResponse createVaultMarketAdminMark()

Upload your fund administrator&#39;s prices (&#x60;administrator&#x60;, &#x60;marks: [{ bookKey, day, cents }]&#x60;). Shown beside Crossly&#39;s marks and labelled as yours; they never change a Crossly figure.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketAdminMarkResponse = apiInstance.createVaultMarketAdminMark()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAdminMark")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAdminMark")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketAdminMarkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAdvance"></a>
# **createVaultMarketAdvance**
> GetVaultMarketCreditResponse createVaultMarketAdvance()

Take an advance against a vault unit that is listed for sale: paid into your custodian account, netted from the sale. Free for 60 days, then the pool rate. Needs a verified ID.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketCreditResponse = apiInstance.createVaultMarketAdvance()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAdvance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAdvance")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketCreditResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAdvanceRelist"></a>
# **createVaultMarketAdvanceRelist**
> CreateVaultMarketAdvanceRelistResponse createVaultMarketAdvanceRelist(id)

Relist an advance&#39;s unit at a new price (never so low its sale could not repay the advance).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketAdvanceRelistResponse = apiInstance.createVaultMarketAdvanceRelist(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAdvanceRelist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAdvanceRelist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketAdvanceRelistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAgentDraftCancel"></a>
# **createVaultMarketAgentDraftCancel**
> CreateVaultMarketAgentDraftCancelResponse createVaultMarketAgentDraftCancel(id)

Throw a drafted order away (only while it is still a draft). Returns { ok, draft }.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketAgentDraftCancelResponse = apiInstance.createVaultMarketAgentDraftCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAgentDraftCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAgentDraftCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketAgentDraftCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAgentWatch"></a>
# **createVaultMarketAgentWatch**
> CreateVaultMarketAgentWatchResponse createVaultMarketAgentWatch()

Watch a book key: tell me once when its best bid, lowest ask, last trade or market price crosses a price (cents). Leave out direction for \&quot;crosses\&quot; (whichever way it has to move). Never trades. At most 50 live, each for 90 days.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketAgentWatchResponse = apiInstance.createVaultMarketAgentWatch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAgentWatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAgentWatch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketAgentWatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAlert"></a>
# **createVaultMarketAlert**
> ListVaultMarketAlertsItem createVaultMarketAlert()

Alert me when a key&#39;s market price goes above or below a price (fires once).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketAlertsItem = apiInstance.createVaultMarketAlert()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAlert")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketAlertsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAlertPrefTest"></a>
# **createVaultMarketAlertPrefTest**
> CreateVaultMarketAlertPrefTestResponse createVaultMarketAlertPrefTest()

Send yourself one test alert of a &#x60;kind&#x60; through your own switches. Returns &#x60;{ sent, kind, plan }&#x60;, where plan says per channel: send, off, quiet (held by quiet hours) or unavailable.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketAlertPrefTestResponse = apiInstance.createVaultMarketAlertPrefTest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAlertPrefTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAlertPrefTest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketAlertPrefTestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAuctionLot"></a>
# **createVaultMarketAuctionLot**
> CreateVaultMarketAuctionLotResponse createVaultMarketAuctionLot()

Consign a stored, authenticated unit to the next weekly or premier event, with an optional opening price and reserve. The unit is held until the close. Returns &#x60;{ lotId, eventId, endsAt }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketAuctionLotResponse = apiInstance.createVaultMarketAuctionLot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAuctionLot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAuctionLot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketAuctionLotResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAuctionLotBid"></a>
# **createVaultMarketAuctionLotBid**
> CreateVaultMarketAuctionLotBidResponse createVaultMarketAuctionLotBid(id)

Leave or raise your maximum on a lot; the system bids for you up to it. A bid in the last 2 minutes extends the lot by 2 minutes. The winner&#39;s saved card is charged at the close through the order book. ID needed above $10,000.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketAuctionLotBidResponse = apiInstance.createVaultMarketAuctionLotBid(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAuctionLotBid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAuctionLotBid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketAuctionLotBidResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketAuctionLotWithdraw"></a>
# **createVaultMarketAuctionLotWithdraw**
> OkResponse createVaultMarketAuctionLotWithdraw(id)

Withdraw your lot before any bid; the unit goes back on your shelf. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createVaultMarketAuctionLotWithdraw(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketAuctionLotWithdraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketAuctionLotWithdraw")
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

<a name="createVaultMarketBlock"></a>
# **createVaultMarketBlock**
> ListVaultMarketBlocksItem createVaultMarketBlock()

Place a block buy for an entity: one order booked to the first sub-account in &#x60;plan&#x60; (it pays from its custodian account), split across every sub-account in the plan at the average price, fees included, once it is done and the custodian confirmed each payment. Each share&#39;s cash moves between the entity&#39;s own custodian accounts; its units move only after that settles. Every sub-account must be one you may trade, and its share must fit its limits.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketBlocksItem = apiInstance.createVaultMarketBlock()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketBlock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketBlock")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketBlocksItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketBlockAllocate"></a>
# **createVaultMarketBlockAllocate**
> CreateVaultMarketBlockAllocateResponse createVaultMarketBlockAllocate(orderId)

Allocate a done block now (the keeper does it too). Returns &#x60;{ outcome, block }&#x60;: allocated, waiting (a payment or transfer is not settled yet), nothing_filled or none.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val orderId : kotlin.String = orderId_example // kotlin.String | 
try {
    val result : CreateVaultMarketBlockAllocateResponse = apiInstance.createVaultMarketBlockAllocate(orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketBlockAllocate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketBlockAllocate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **kotlin.String**|  |

### Return type

**CreateVaultMarketBlockAllocateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketBullionFamilyPeg"></a>
# **createVaultMarketBullionFamilyPeg**
> ListVaultMarketBullionFamilyPegsItem createVaultMarketBullionFamilyPeg()

Set a family-wide spot-pegged quote: one \&quot;any 1 oz gold coin\&quot; quote resting on each product book of a bullion family at the chosen condition (DS, VNDS or Used). When any leg fills it comes off the others and goes back on only for what is left; two fills at once are settled one at a time against what is left. A bid pays from your custodian account. Replaces your live family quote on the same family, condition and side. ID required.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketBullionFamilyPegsItem = apiInstance.createVaultMarketBullionFamilyPeg()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketBullionFamilyPeg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketBullionFamilyPeg")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketBullionFamilyPegsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketBullionPeg"></a>
# **createVaultMarketBullionPeg**
> ListVaultMarketBullionPegsItem createVaultMarketBullionPeg()

Set a spot-pegged maker quote on a bullion book key: \&quot;spot plus or minus N cents\&quot; or \&quot;plus or minus N basis points\&quot;, with an optional floor and cap. It rests as a pro limit order re-priced every spot tick and is pulled while spot is stale. Replaces your live quote on the same key and side. ID required.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketBullionPegsItem = apiInstance.createVaultMarketBullionPeg()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketBullionPeg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketBullionPeg")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketBullionPegsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketCollectionWorthWatch"></a>
# **createVaultMarketCollectionWorthWatch**
> CreateVaultMarketCollectionWorthWatchResponse createVaultMarketCollectionWorthWatch()

Watch every collection item that sits on a vault book key (up to the watchlist cap). Returns &#x60;{ watched, skipped }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketCollectionWorthWatchResponse = apiInstance.createVaultMarketCollectionWorthWatch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketCollectionWorthWatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketCollectionWorthWatch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketCollectionWorthWatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketCreatorAttribution"></a>
# **createVaultMarketCreatorAttribution**
> CreateVaultMarketCreatorAttributionResponse createVaultMarketCreatorAttribution()

Use a creator code: the creator earns a capped share of the fee Crossly keeps on your Vault Markets trades for a limited window (paid by Crossly, never by you). Only for people new to Vault Markets, once, and never your own code.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketCreatorAttributionResponse = apiInstance.createVaultMarketCreatorAttribution()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketCreatorAttribution")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketCreatorAttribution")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketCreatorAttributionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketCreatorCohostInviteRespond"></a>
# **createVaultMarketCreatorCohostInviteRespond**
> CreateVaultMarketCreatorCohostInviteRespondResponse createVaultMarketCreatorCohostInviteRespond(id)

For creators: accept or decline an invite to co-host a Market Open launch show (&#x60;accept&#x60; true or false). Accepting needs your vault room verified and adds you to the show as a co-host; your room and the Commons then say you co-host it, with the creator-programme disclosure when it applies.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketCreatorCohostInviteRespondResponse = apiInstance.createVaultMarketCreatorCohostInviteRespond(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketCreatorCohostInviteRespond")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketCreatorCohostInviteRespond")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketCreatorCohostInviteRespondResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketCreditRepay"></a>
# **createVaultMarketCreditRepay**
> CreateVaultMarketCreditRepayResponse createVaultMarketCreditRepay(id)

Repay from your custodian account, interest first. Omit &#x60;amountCents&#x60; to repay everything; pass &#x60;requestId&#x60; to make a retry safe. Repaid in full, the items are free.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketCreditRepayResponse = apiInstance.createVaultMarketCreditRepay(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketCreditRepay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketCreditRepay")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketCreditRepayResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketDcmLink"></a>
# **createVaultMarketDcmLink**
> CreateVaultMarketDcmLinkResponse createVaultMarketDcmLink()

Link a partner exchange account to your account (or to a firm sub-account you manage, &#x60;subaccountId&#x60;) so Crossly can show its positions: &#x60;accountRef&#x60; (the account id there) and &#x60;code&#x60; (the one-time link code it gave you). The partner must confirm the code; the code is never stored. Read-only: Crossly never trades on it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketDcmLinkResponse = apiInstance.createVaultMarketDcmLink()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketDcmLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketDcmLink")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketDcmLinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketDcmUnlink"></a>
# **createVaultMarketDcmUnlink**
> CreateVaultMarketDcmUnlinkResponse createVaultMarketDcmUnlink()

Unlink the partner exchange account from your account (or the firm sub-account &#x60;subaccountId&#x60;): Crossly stops reading it and its hedges leave portfolio margin.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketDcmUnlinkResponse = apiInstance.createVaultMarketDcmUnlink()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketDcmUnlink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketDcmUnlink")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketDcmUnlinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketDealerApply"></a>
# **createVaultMarketDealerApply**
> CreateVaultMarketDealerApplyResponse createVaultMarketDealerApply()

Apply to be a dealer (ID check first). Ops review; approved dealers get raised limits and their bids show as dealer bids.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketDealerApplyResponse = apiInstance.createVaultMarketDealerApply()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketDealerApply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketDealerApply")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketDealerApplyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketDealerBid"></a>
# **createVaultMarketDealerBid**
> CreateVaultMarketProOrderResponse createVaultMarketDealerBid()

Place a standing dealer bid: a resting GTC/GTD limit buy, flagged as a dealer bid. Approved dealers only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketProOrderResponse = apiInstance.createVaultMarketDealerBid()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketDealerBid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketDealerBid")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketProOrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketDealerPool"></a>
# **createVaultMarketDealerPool**
> ListVaultMarketDealerPoolsItem createVaultMarketDealerPool()

Open a curve pool on a key (approved dealers, ID checked): linear (delta in cents) or exponential (delta in bps), spot, fee, levels per side, units it may sell, and a buy budget from your custodian account. Its ladder goes up at once.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketDealerPoolsItem = apiInstance.createVaultMarketDealerPool()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketDealerPool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketDealerPool")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketDealerPoolsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketDealerPoolClose"></a>
# **createVaultMarketDealerPoolClose**
> ListVaultMarketDealerPoolsItem createVaultMarketDealerPoolClose(id)

Close a curve pool: its legs come off the book; what filled stays filled.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketDealerPoolsItem = apiInstance.createVaultMarketDealerPoolClose(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketDealerPoolClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketDealerPoolClose")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketDealerPoolsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketDealerPoolPreview"></a>
# **createVaultMarketDealerPoolPreview**
> CreateVaultMarketDealerPoolPreviewResponse createVaultMarketDealerPoolPreview()

The bids and asks a set of curve settings would show, and why each side stops where it does. Places nothing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketDealerPoolPreviewResponse = apiInstance.createVaultMarketDealerPoolPreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketDealerPoolPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketDealerPoolPreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketDealerPoolPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketDeposit"></a>
# **createVaultMarketDeposit**
> CreateVaultMarketDepositResponse createVaultMarketDeposit()

Open a ship-in deposit for an ungraded catalogue item (&#x60;skuId&#x60;, &#x60;variantId&#x60;, &#x60;condition&#x60; DS / VNDS / Used). It is inbound until the vault receives and checks it, then stored in your name. Returns &#x60;{ vaultItem: { id, status } }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketDepositResponse = apiInstance.createVaultMarketDeposit()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketDeposit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketDeposit")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketDepositResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketDonation"></a>
# **createVaultMarketDonation**
> CreateVaultMarketDonationResponse createVaultMarketDonation()

Give a unit to Crossly Cares (once the charity can receive; otherwise its gate message). Returns &#x60;{ id, markCents }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketDonationResponse = apiInstance.createVaultMarketDonation()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketDonation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketDonation")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketDonationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketEntity"></a>
# **createVaultMarketEntity**
> CreateVaultMarketEntityResponse createVaultMarketEntity()

Open an entity account: you become its admin and the custodian partner starts KYB (its own flow; Crossly keeps only its reference). Needs a verified ID and the custodian (503 names what is missing).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketEntityResponse = apiInstance.createVaultMarketEntity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketEntity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketEntity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketEntityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketEntityEcp"></a>
# **createVaultMarketEntityEcp**
> GetVaultMarketEntityByIdResponse createVaultMarketEntityEcp(id)

Admin: record the entity&#39;s attestation that it is an eligible contract participant. Raising its caps is still an ops decision.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketEntityByIdResponse = apiInstance.createVaultMarketEntityEcp(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketEntityEcp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketEntityEcp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketEntityByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketEntityHalt"></a>
# **createVaultMarketEntityHalt**
> CreateVaultMarketEntityHaltResponse createVaultMarketEntityHalt(id)

Admin or risk: the firm kill switch. Halts the entity (no &#x60;subaccountId&#x60;) or one sub-account: open orders on it are cancelled and no new ones are placed until cleared.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketEntityHaltResponse = apiInstance.createVaultMarketEntityHalt(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketEntityHalt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketEntityHalt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketEntityHaltResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketEntityHaltClear"></a>
# **createVaultMarketEntityHaltClear**
> GetVaultMarketEntityByIdResponse createVaultMarketEntityHaltClear(id, haltId)

Admin or risk: lift a firm halt.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val haltId : kotlin.String = haltId_example // kotlin.String | 
try {
    val result : GetVaultMarketEntityByIdResponse = apiInstance.createVaultMarketEntityHaltClear(id, haltId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketEntityHaltClear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketEntityHaltClear")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **haltId** | **kotlin.String**|  |

### Return type

**GetVaultMarketEntityByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketEntityInvitation"></a>
# **createVaultMarketEntityInvitation**
> GetVaultMarketEntityResponse createVaultMarketEntityInvitation(id)

Accept or decline an invitation (&#x60;accept&#x60;). Trading, admin and risk roles need a verified ID to accept.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketEntityResponse = apiInstance.createVaultMarketEntityInvitation(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketEntityInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketEntityInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketEntityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketEntityKyb"></a>
# **createVaultMarketEntityKyb**
> CreateVaultMarketEntityKybResponse createVaultMarketEntityKyb(id)

Refresh the entity&#39;s KYB status from the custodian (and its onboarding link while KYB is open).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketEntityKybResponse = apiInstance.createVaultMarketEntityKyb(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketEntityKyb")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketEntityKyb")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketEntityKybResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketEntityMember"></a>
# **createVaultMarketEntityMember**
> GetVaultMarketEntityByIdResponse createVaultMarketEntityMember(id)

Admin: invite a Crossly user by email as admin, trader, risk, ops or viewer (a viewer can never place an order), with optional limits and sub-accounts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketEntityByIdResponse = apiInstance.createVaultMarketEntityMember(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketEntityMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketEntityMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketEntityByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketEntitySubaccount"></a>
# **createVaultMarketEntitySubaccount**
> GetVaultMarketEntityByIdResponse createVaultMarketEntitySubaccount(id)

Admin: open a sub-account once the custodian approved the entity; its limits are held to the entity&#39;s caps.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketEntityByIdResponse = apiInstance.createVaultMarketEntitySubaccount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketEntitySubaccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketEntitySubaccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketEntityByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketEntitySubaccountClose"></a>
# **createVaultMarketEntitySubaccountClose**
> GetVaultMarketEntityByIdResponse createVaultMarketEntitySubaccountClose(id, subId)

Admin: close a sub-account that holds nothing and has no open orders.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val subId : kotlin.String = subId_example // kotlin.String | 
try {
    val result : GetVaultMarketEntityByIdResponse = apiInstance.createVaultMarketEntitySubaccountClose(id, subId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketEntitySubaccountClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketEntitySubaccountClose")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **subId** | **kotlin.String**|  |

### Return type

**GetVaultMarketEntityByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketFollowCopyWatchAlertRead"></a>
# **createVaultMarketFollowCopyWatchAlertRead**
> CreateVaultMarketFollowCopyWatchAlertReadResponse createVaultMarketFollowCopyWatchAlertRead()

Mark every copy-watch alert read. Returns &#x60;{ marked }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketFollowCopyWatchAlertReadResponse = apiInstance.createVaultMarketFollowCopyWatchAlertRead()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketFollowCopyWatchAlertRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketFollowCopyWatchAlertRead")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketFollowCopyWatchAlertReadResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGift"></a>
# **createVaultMarketGift**
> CreateVaultMarketGiftResponse createVaultMarketGift()

Give a unit in your vault to another Crossly user (by @username or email). It stays on its shelf; they have 7 days to accept. ID needed above $1,000 at the mark. Returns &#x60;{ id, expiresAt }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketGiftResponse = apiInstance.createVaultMarketGift()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGift")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGift")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketGiftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGiftAccept"></a>
# **createVaultMarketGiftAccept**
> StatusResponse createVaultMarketGiftAccept(id)

Accept a gift: the unit becomes yours in place. Returns &#x60;{ status }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StatusResponse = apiInstance.createVaultMarketGiftAccept(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGiftAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGiftAccept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGiftCancel"></a>
# **createVaultMarketGiftCancel**
> StatusResponse createVaultMarketGiftCancel(id)

Cancel a gift you sent before it is accepted. Returns &#x60;{ status }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StatusResponse = apiInstance.createVaultMarketGiftCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGiftCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGiftCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGiftDecline"></a>
# **createVaultMarketGiftDecline**
> StatusResponse createVaultMarketGiftDecline(id)

Decline a gift: the unit stays with the giver. Returns &#x60;{ status }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StatusResponse = apiInstance.createVaultMarketGiftDecline(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGiftDecline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGiftDecline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradeToVault"></a>
# **createVaultMarketGradeToVault**
> ListVaultMarketGradeToVaultItem createVaultMarketGradeToVault()

Start Grade to Vault on one item (&#x60;source&#x60; inventory or vault_unit). With &#x60;runId&#x60; the grading slot is booked at once (free; your saved card is charged only if the run locks). Nothing is listed until you confirm a price after the grade.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketGradeToVaultItem = apiInstance.createVaultMarketGradeToVault()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGradeToVault")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGradeToVault")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketGradeToVaultItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradeToVaultBook"></a>
# **createVaultMarketGradeToVaultBook**
> ListVaultMarketGradeToVaultItem createVaultMarketGradeToVaultBook(id)

Book (or re-book) the grading slot of a flow still at \&quot;picked\&quot;. Answers 503 naming GRADING_HUB_ADDRESS when runs are not open.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketGradeToVaultItem = apiInstance.createVaultMarketGradeToVaultBook(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGradeToVaultBook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGradeToVaultBook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketGradeToVaultItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradeToVaultCancel"></a>
# **createVaultMarketGradeToVaultCancel**
> ListVaultMarketGradeToVaultItem createVaultMarketGradeToVaultCancel(id)

Stop the flow before the card goes to the grader (still picked, or its slot only reserved: nothing was charged).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketGradeToVaultItem = apiInstance.createVaultMarketGradeToVaultCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGradeToVaultCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGradeToVaultCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketGradeToVaultItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradeToVaultKeep"></a>
# **createVaultMarketGradeToVaultKeep**
> ListVaultMarketGradeToVaultItem createVaultMarketGradeToVaultKeep(id)

Keep the graded unit in your vault without listing it. The flow ends; list it any time from the vault.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketGradeToVaultItem = apiInstance.createVaultMarketGradeToVaultKeep(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGradeToVaultKeep")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGradeToVaultKeep")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketGradeToVaultItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradeToVaultList"></a>
# **createVaultMarketGradeToVaultList**
> ListVaultMarketGradeToVaultItem createVaultMarketGradeToVaultList(id)

Confirm the price for the grade the unit came back with (&#x60;confirm: true&#x60;, &#x60;gradeKey&#x60; must match the unit). Pre-trade risk, the price band and the ID line apply, then one shelf ask is placed on the Crossly order book.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketGradeToVaultItem = apiInstance.createVaultMarketGradeToVaultList(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGradeToVaultList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGradeToVaultList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketGradeToVaultItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradeToVaultShipped"></a>
# **createVaultMarketGradeToVaultShipped**
> ListVaultMarketGradeToVaultItem createVaultMarketGradeToVaultShipped(id)

You mailed the card to the grading hub (an inventory card, once its run locked).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketGradeToVaultItem = apiInstance.createVaultMarketGradeToVaultShipped(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGradeToVaultShipped")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGradeToVaultShipped")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketGradeToVaultItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGrading"></a>
# **createVaultMarketGrading**
> CreateVaultMarketGradingResponse createVaultMarketGrading()

Send a raw vault unit on the grading hub&#39;s shelf to a Grading Run (&#x60;runId&#x60;). It is held until it comes back, graded, to the same vault item. The slot is free; your saved card is charged only if the run locks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketGradingResponse = apiInstance.createVaultMarketGrading()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGrading")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGrading")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketGradingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketGradingPull"></a>
# **createVaultMarketGradingPull**
> StatusResponse createVaultMarketGradingPull(submissionId)

Pull a vault unit out of its run before the run locks (nothing was charged). It goes back on the shelf.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val submissionId : kotlin.String = submissionId_example // kotlin.String | 
try {
    val result : StatusResponse = apiInstance.createVaultMarketGradingPull(submissionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketGradingPull")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketGradingPull")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submissionId** | **kotlin.String**|  |

### Return type

**StatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketHallLoan"></a>
# **createVaultMarketHallLoan**
> CreateVaultMarketHallLoanResponse createVaultMarketHallLoan()

Lend a unit in your Crossly vault to the Hall of Grails: { vaultItemId, credit: &#39;name&#39; | &#39;anonymous&#39; }. A standing loan of display rights only: the unit goes on a plinth, under a plate naming you (or \&quot;a collector\&quot;), in every weekly exhibition whose category it fits. It never moves and stays yours to list, sell or withdraw. Earns reputation per exhibition shown; no cash. Resumes a loan you opted out of while it still shows.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketHallLoanResponse = apiInstance.createVaultMarketHallLoan()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketHallLoan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketHallLoan")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketHallLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketHallLoanCredit"></a>
# **createVaultMarketHallLoanCredit**
> CreateVaultMarketHallLoanCreditResponse createVaultMarketHallLoanCredit(id)

Change how the plate on a lent unit&#39;s plinth names you, from now: { credit: &#39;name&#39; } (your display name) or { credit: &#39;anonymous&#39; } (\&quot;a collector\&quot;).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketHallLoanCreditResponse = apiInstance.createVaultMarketHallLoanCredit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketHallLoanCredit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketHallLoanCredit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketHallLoanCreditResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketHallLoanOptOut"></a>
# **createVaultMarketHallLoanOptOut**
> CreateVaultMarketHallLoanOptOutResponse createVaultMarketHallLoanOptOut(id)

Opt a Hall of Grails loan out, at any time. A unit on a plinth this week finishes this exhibition (status ending, showingUntil); otherwise the loan ends now (status ended).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketHallLoanOptOutResponse = apiInstance.createVaultMarketHallLoanOptOut(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketHallLoanOptOut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketHallLoanOptOut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketHallLoanOptOutResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketIdentityStart"></a>
# **createVaultMarketIdentityStart**
> CreateVaultMarketIdentityStartResponse createVaultMarketIdentityStart()

Start (or resume) the one-time ID check the money features and larger orders need. Returns &#x60;{ url }&#x60; to open, or &#x60;{ alreadyVerified: true }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketIdentityStartResponse = apiInstance.createVaultMarketIdentityStart()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketIdentityStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketIdentityStart")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketIdentityStartResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketIndex"></a>
# **createVaultMarketIndex**
> GetVaultMarketIndexResponse createVaultMarketIndex()

Make an index of your own: 1 to 50 book keys, weighted by mark or equally. Up to 10 per account.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketIndexResponse = apiInstance.createVaultMarketIndex()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketIndex")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketIndex")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketIndexResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketIndexBuy"></a>
# **createVaultMarketIndexBuy**
> CreateVaultMarketIndexBuyResponse createVaultMarketIndexBuy(slug)

Buy the basket: one limit buy per key in the index for 1-5 whole units each, at most &#x60;maxBpsOverMark&#x60; over each key&#39;s mark, IOC or GTC. Every unit is a real item that lands in your vault. Idempotent on &#x60;clientBasketId&#x60;; returns a result per key.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateVaultMarketIndexBuyResponse = apiInstance.createVaultMarketIndexBuy(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketIndexBuy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketIndexBuy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateVaultMarketIndexBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketIndexComplaint"></a>
# **createVaultMarketIndexComplaint**
> CreateVaultMarketIndexComplaintResponse createVaultMarketIndexComplaint()

File a complaint about an index or the method (&#x60;slug&#x60; optional). Every complaint is answered. Returns &#x60;{ id, status, createdAt }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketIndexComplaintResponse = apiInstance.createVaultMarketIndexComplaint()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketIndexComplaint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketIndexComplaint")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketIndexComplaintResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketIndexConsultationComment"></a>
# **createVaultMarketIndexConsultationComment**
> OkResponse createVaultMarketIndexConsultationComment(id)

Comment on an open consultation (5 to 5,000 characters; up to 5 per person). Comments are published without your name. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createVaultMarketIndexConsultationComment(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketIndexConsultationComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketIndexConsultationComment")
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

<a name="createVaultMarketInstantExit"></a>
# **createVaultMarketInstantExit**
> CreateVaultMarketInstantExitResponse createVaultMarketInstantExit()

Sell a unit now at the quoted price: a sell IOC at &#x60;priceCents&#x60; through the pro engine. Refused, with the new quote, if the best bid dropped below it. Crossly never buys or funds it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketInstantExitResponse = apiInstance.createVaultMarketInstantExit()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketInstantExit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketInstantExit")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketInstantExitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJoint"></a>
# **createVaultMarketJoint**
> CreateVaultMarketJointResponse createVaultMarketJoint()

Open a joint vault (ID first): you hold full rights and accept the current joint terms. &#x60;invite&#x60; sends invitations (@username or email, each with view, trade or full rights). Returns &#x60;{ id, status, invited }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketJointResponse = apiInstance.createVaultMarketJoint()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJoint")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketJointResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJointClose"></a>
# **createVaultMarketJointClose**
> CreateVaultMarketJointCloseResponse createVaultMarketJointClose(id)

Close the joint vault (full rights): open joint orders are cancelled and every unit goes back to its owner. Returns &#x60;{ status, unitsReturned }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketJointCloseResponse = apiInstance.createVaultMarketJointClose(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJointClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJointClose")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketJointCloseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJointInvite"></a>
# **createVaultMarketJointInvite**
> CreateVaultMarketJointInviteResponse createVaultMarketJointInvite(id)

Invite a Crossly user (full rights only). They have 14 days and show ID to join. Returns &#x60;{ userId, rights, expiresAt }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketJointInviteResponse = apiInstance.createVaultMarketJointInvite(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJointInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJointInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketJointInviteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJointMemberRemove"></a>
# **createVaultMarketJointMemberRemove**
> CreateVaultMarketJointMemberRemoveResponse createVaultMarketJointMemberRemove(id, userId)

Remove a member (full rights), or leave when userId is you. Their units go back to their own account and their joint orders are cancelled. Returns &#x60;{ userId, status, unitsReturned, jointStatus }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : CreateVaultMarketJointMemberRemoveResponse = apiInstance.createVaultMarketJointMemberRemove(id, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJointMemberRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJointMemberRemove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **userId** | **kotlin.String**|  |

### Return type

**CreateVaultMarketJointMemberRemoveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJointMemberRight"></a>
# **createVaultMarketJointMemberRight**
> CreateVaultMarketJointMemberRightResponse createVaultMarketJointMemberRight(id, userId)

Set a member rights to view, trade or full (full rights only; the vault always keeps a full member). Returns &#x60;{ userId, rights }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : CreateVaultMarketJointMemberRightResponse = apiInstance.createVaultMarketJointMemberRight(id, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJointMemberRight")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJointMemberRight")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **userId** | **kotlin.String**|  |

### Return type

**CreateVaultMarketJointMemberRightResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJointRespond"></a>
# **createVaultMarketJointRespond**
> CreateVaultMarketJointRespondResponse createVaultMarketJointRespond(id)

Accept (ID first; accepts the current joint terms) or decline an invitation. Returns &#x60;{ status }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketJointRespondResponse = apiInstance.createVaultMarketJointRespond(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJointRespond")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJointRespond")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketJointRespondResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJointTerm"></a>
# **createVaultMarketJointTerm**
> TermsVersionResponse createVaultMarketJointTerm(id)

Accept the current joint terms (needed to trade after the terms version changes). Returns &#x60;{ termsVersion }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : TermsVersionResponse = apiInstance.createVaultMarketJointTerm(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJointTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJointTerm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**TermsVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJointTrade"></a>
# **createVaultMarketJointTrade**
> CreateVaultMarketJointTradeResponse createVaultMarketJointTrade(id)

Place a limit order for the joint vault (trade or full rights, ID shown). A buy (bookKey) is placed on you, paid from your own Vault Markets account, and what it buys is booked to the joint vault. A sell (vaultItemId of a unit in it) is placed on the unit owner of record, who gets the proceeds; pre-trade checks run against you too. Returns &#x60;{ tradeId, side, bookKey, ownerUserId, order }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketJointTradeResponse = apiInstance.createVaultMarketJointTrade(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJointTrade")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJointTrade")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketJointTradeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJointTradeCancel"></a>
# **createVaultMarketJointTradeCancel**
> CreateVaultMarketJointTradeCancelResponse createVaultMarketJointTradeCancel(id, tradeId)

Cancel a working joint order (trade or full rights); what filled stays filled. Returns &#x60;{ tradeId, order }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tradeId : kotlin.String = tradeId_example // kotlin.String | 
try {
    val result : CreateVaultMarketJointTradeCancelResponse = apiInstance.createVaultMarketJointTradeCancel(id, tradeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJointTradeCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJointTradeCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **tradeId** | **kotlin.String**|  |

### Return type

**CreateVaultMarketJointTradeCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJointUnit"></a>
# **createVaultMarketJointUnit**
> CreateVaultMarketJointUnitResponse createVaultMarketJointUnit(id)

Put units you own into the joint vault (each stored and free). They keep you as owner of record and stay on the shelf. Returns &#x60;{ added, vaultItemIds }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketJointUnitResponse = apiInstance.createVaultMarketJointUnit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJointUnit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJointUnit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketJointUnitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketJointUnitRemove"></a>
# **createVaultMarketJointUnitRemove**
> CreateVaultMarketJointUnitRemoveResponse createVaultMarketJointUnitRemove(id)

Take units out of the joint vault, back to their owner own account (yours at any rights; anyone else with full rights). Returns &#x60;{ removed, vaultItemIds }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketJointUnitRemoveResponse = apiInstance.createVaultMarketJointUnitRemove(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketJointUnitRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketJointUnitRemove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketJointUnitRemoveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketLargeTraderReportFile"></a>
# **createVaultMarketLargeTraderReportFile**
> ListVaultMarketLargeTraderReportsItem createVaultMarketLargeTraderReportFile(id)

File (or amend, or refile) a large-trader report: why you hold it (purpose), who you act for, other accounts you control, whether you plan to add, and a statement of 20+ characters. Returns the report.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketLargeTraderReportsItem = apiInstance.createVaultMarketLargeTraderReportFile(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketLargeTraderReportFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketLargeTraderReportFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketLargeTraderReportsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketLearnQuiz"></a>
# **createVaultMarketLearnQuiz**
> CreateVaultMarketLearnQuizResponse createVaultMarketLearnQuiz(concept)

Answer a concept&#39;s quiz (&#x60;answers&#x60;: the chosen choice index per question). Graded on the server; 5 tries an hour.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val concept : kotlin.String = concept_example // kotlin.String | 
try {
    val result : CreateVaultMarketLearnQuizResponse = apiInstance.createVaultMarketLearnQuiz(concept)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketLearnQuiz")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketLearnQuiz")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **concept** | **kotlin.String**|  |

### Return type

**CreateVaultMarketLearnQuizResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketLiveStreamFeaturedLot"></a>
# **createVaultMarketLiveStreamFeaturedLot**
> OkResponse createVaultMarketLiveStreamFeaturedLot(id)

Feature an open lot on your live show (or &#x60;lotId: null&#x60; to take it off). Viewers hear LIVE_PIN_CHANGED. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createVaultMarketLiveStreamFeaturedLot(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketLiveStreamFeaturedLot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketLiveStreamFeaturedLot")
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

<a name="createVaultMarketLoan"></a>
# **createVaultMarketLoan**
> GetVaultMarketCreditResponse createVaultMarketLoan()

Borrow against stored vault units: they are pledged (no listing, lending or withdrawal) and the market pool lends &#x60;amountCents&#x60; into your custodian account. Needs a verified ID.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketCreditResponse = apiInstance.createVaultMarketLoan()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketLoan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketLoan")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketCreditResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketLoanRecall"></a>
# **createVaultMarketLoanRecall**
> CreateVaultMarketLoanRecallResponse createVaultMarketLoanRecall(id)

Recall a lent unit: the short has 3 days to return one. Returns &#x60;{ recallDueAt }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketLoanRecallResponse = apiInstance.createVaultMarketLoanRecall(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketLoanRecall")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketLoanRecall")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketLoanRecallResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketLoanUnit"></a>
# **createVaultMarketLoanUnit**
> GetVaultMarketCreditResponse createVaultMarketLoanUnit(id)

Pledge more stored units to a loan (answers a loan call, or makes room).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketCreditResponse = apiInstance.createVaultMarketLoanUnit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketLoanUnit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketLoanUnit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketCreditResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketLoanUnitRelease"></a>
# **createVaultMarketLoanUnitRelease**
> GetVaultMarketCreditResponse createVaultMarketLoanUnitRelease(id, vaultItemId)

Free one pledged unit, if what is owed still fits inside the other units&#39; limit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val vaultItemId : kotlin.String = vaultItemId_example // kotlin.String | 
try {
    val result : GetVaultMarketCreditResponse = apiInstance.createVaultMarketLoanUnitRelease(id, vaultItemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketLoanUnitRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketLoanUnitRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **vaultItemId** | **kotlin.String**|  |

### Return type

**GetVaultMarketCreditResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketLoanUnitSell"></a>
# **createVaultMarketLoanUnitSell**
> CreateVaultMarketLoanUnitSellResponse createVaultMarketLoanUnitSell(id, vaultItemId)

Sell a pledged unit to repay its loan: it is listed at &#x60;priceCents&#x60; (at least the sale floor) and stays pledged until it sells; the proceeds repay the loan first and the rest is yours. Calling it again re-prices it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val vaultItemId : kotlin.String = vaultItemId_example // kotlin.String | 
try {
    val result : CreateVaultMarketLoanUnitSellResponse = apiInstance.createVaultMarketLoanUnitSell(id, vaultItemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketLoanUnitSell")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketLoanUnitSell")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **vaultItemId** | **kotlin.String**|  |

### Return type

**CreateVaultMarketLoanUnitSellResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketLocate"></a>
# **createVaultMarketLocate**
> ListVaultMarketLocateMineItem createVaultMarketLocate()

Hold up to &#x60;qty&#x60; lendable units of &#x60;bookKey&#x60; for 15 minutes so a short can open against them (&#x60;termDays&#x60; 30/90 for a term loan). Needs lending (VAULT_LENDING_TERMS_VERSION) and the ID check. Returns the locate with how many units it holds.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketLocateMineItem = apiInstance.createVaultMarketLocate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketLocate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketLocate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketLocateMineItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketLong"></a>
# **createVaultMarketLong**
> CreateVaultMarketLongResponse createVaultMarketLong()

Buy &#x60;units&#x60; units (default 1; at most 25/10/3/1 by liquidity tier A/B/C/D) into your vault with leverage (up to 2x) from the market staking pool, paying up to &#x60;maxCents&#x60; each. A partial fill opens with the units bought and the rest is cancelled. Returns &#x60;{ positionId, matched, units }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketLongResponse = apiInstance.createVaultMarketLong()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketLong")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketLong")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketLongResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketMidpoint"></a>
# **createVaultMarketMidpoint**
> ListVaultMarketMidpointItem createVaultMarketMidpoint()

A hidden block order that trades only at the firm-book midpoint, with another midpoint order of at least your minimum size.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketMidpointItem = apiInstance.createVaultMarketMidpoint()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketMidpoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketMidpoint")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketMidpointItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketMidpointCancel"></a>
# **createVaultMarketMidpointCancel**
> ListVaultMarketMidpointItem createVaultMarketMidpointCancel(id)

Cancel a midpoint order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketMidpointItem = apiInstance.createVaultMarketMidpointCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketMidpointCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketMidpointCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketMidpointItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketMmDmm"></a>
# **createVaultMarketMmDmm**
> CreateVaultMarketMmLpResponse createVaultMarketMmDmm()

Apply to be the designated market maker on a tier B or C key. Ops approves; one per key.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketMmLpResponse = apiInstance.createVaultMarketMmDmm()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketMmDmm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketMmDmm")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketMmLpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketMmLeave"></a>
# **createVaultMarketMmLeave**
> CreateVaultMarketMmLpResponse createVaultMarketMmLeave(id)

Leave a market-maker programme.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketMmLpResponse = apiInstance.createVaultMarketMmLeave(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketMmLeave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketMmLeave")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketMmLpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketMmLp"></a>
# **createVaultMarketMmLp**
> CreateVaultMarketMmLpResponse createVaultMarketMmLp()

Join a key as a Registered Liquidity Provider (ID needed). Meeting coverage earns the LP rates.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketMmLpResponse = apiInstance.createVaultMarketMmLp()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketMmLp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketMmLp")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketMmLpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketMmMassCancel"></a>
# **createVaultMarketMmMassCancel**
> CreateVaultMarketMmMassCancelResponse createVaultMarketMmMassCancel()

Cancel every open order (one key, or only quotes) and every resting leg in one statement: nothing fills between the first cancel and the last.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketMmMassCancelResponse = apiInstance.createVaultMarketMmMassCancel()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketMmMassCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketMmMassCancel")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketMmMassCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketMmMmpReset"></a>
# **createVaultMarketMmMmpReset**
> GetVaultMarketMmMmpResponse createVaultMarketMmMmpReset()

End a market-maker protection freeze early.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketMmMmpResponse = apiInstance.createVaultMarketMmMmpReset()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketMmMmpReset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketMmMmpReset")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketMmMmpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketOpeningWaitlist"></a>
# **createVaultMarketOpeningWaitlist**
> CreateVaultMarketOpeningWaitlistResponse createVaultMarketOpeningWaitlist(slug)

Join a key&#39;s waitlist, optionally with a friend&#39;s invite code (&#x60;ref&#x60;). Inviting moves you up the queue; nobody is paid. Returns your place and your own code.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateVaultMarketOpeningWaitlistResponse = apiInstance.createVaultMarketOpeningWaitlist(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketOpeningWaitlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketOpeningWaitlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateVaultMarketOpeningWaitlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketP2pLoanCall"></a>
# **createVaultMarketP2pLoanCall**
> GetVaultMarketP2pLoanResponse createVaultMarketP2pLoanCall(id)

Lender: call the loan (once it is a day old). A refinancing auction runs for about 30 hours, the rate a new lender gets climbing to the ceiling; repaid or refinanced, you are paid in full; neither by the end, the unit moves to your vault.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketP2pLoanResponse = apiInstance.createVaultMarketP2pLoanCall(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketP2pLoanCall")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketP2pLoanCall")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketP2pLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketP2pLoanCancelCall"></a>
# **createVaultMarketP2pLoanCancelCall**
> GetVaultMarketP2pLoanResponse createVaultMarketP2pLoanCancelCall(id)

Lender: take back your call before any other lender has taken the loan over. The refinancing auction stops and the loan carries on as before on its terms.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketP2pLoanResponse = apiInstance.createVaultMarketP2pLoanCancelCall(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketP2pLoanCancelCall")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketP2pLoanCancelCall")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketP2pLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketP2pLoanRefiAuction"></a>
# **createVaultMarketP2pLoanRefiAuction**
> GetVaultMarketP2pLoanResponse createVaultMarketP2pLoanRefiAuction(id)

Borrower: look for a cheaper lender. A refinancing auction runs for &#x60;hours&#x60; (1-72, default 24); the rate a new lender gets climbs from &#x60;startAprBps&#x60; (default half the loan rate) to just under the loan rate now. The first lender to take it pays your lender off and the loan carries on at that lower rate. Nobody by the end: nothing changes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketP2pLoanResponse = apiInstance.createVaultMarketP2pLoanRefiAuction(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketP2pLoanRefiAuction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketP2pLoanRefiAuction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketP2pLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketP2pLoanRefiAuctionCancel"></a>
# **createVaultMarketP2pLoanRefiAuctionCancel**
> GetVaultMarketP2pLoanResponse createVaultMarketP2pLoanRefiAuctionCancel(id)

Borrower: stop looking for a cheaper lender before anyone has taken the loan over. The loan carries on unchanged.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketP2pLoanResponse = apiInstance.createVaultMarketP2pLoanRefiAuctionCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketP2pLoanRefiAuctionCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketP2pLoanRefiAuctionCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketP2pLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketP2pLoanRefinance"></a>
# **createVaultMarketP2pLoanRefinance**
> GetVaultMarketP2pLoanResponse createVaultMarketP2pLoanRefinance(id)

Take over a loan in a refinancing auction (a lender call or a borrower search for a cheaper lender): you pay the old lender everything owed now (refused above &#x60;maxPayoffCents&#x60;), which becomes your loan to the same borrower at the auction rate now. Needs a verified ID, an active account and the current lending terms. Pass &#x60;requestId&#x60; to make a retry safe.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketP2pLoanResponse = apiInstance.createVaultMarketP2pLoanRefinance(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketP2pLoanRefinance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketP2pLoanRefinance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketP2pLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketP2pLoanRepay"></a>
# **createVaultMarketP2pLoanRepay**
> GetVaultMarketP2pLoanResponse createVaultMarketP2pLoanRepay(id)

Borrower: repay from your custodian account to the lender. Without &#x60;amountCents&#x60;, in full (principal plus interest to the second; the unit is free once the custodian has it). With &#x60;amountCents&#x60; below what is owed, a part payment: interest first, then principal, at least the interest owed now and at least $1; the loan stays open on the principal left. Pass &#x60;requestId&#x60; to make a retry safe.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketP2pLoanResponse = apiInstance.createVaultMarketP2pLoanRepay(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketP2pLoanRepay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketP2pLoanRepay")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketP2pLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketP2pOffer"></a>
# **createVaultMarketP2pOffer**
> ListVaultMarketP2pOffersItem createVaultMarketP2pOffer()

Offer to lend: &#x60;principalCents&#x60; per loan at &#x60;aprBps&#x60; a year against an item (&#x60;bookKey&#x60;) or one unit (&#x60;vaultItemId&#x60;), for up to &#x60;maxLoans&#x60; loans, lasting &#x60;expiresInDays&#x60; (default 90). Nothing is held: the custodian pays from your own account when a borrower takes it. Needs a verified ID, an active account and the current lending terms.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketP2pOffersItem = apiInstance.createVaultMarketP2pOffer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketP2pOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketP2pOffer")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketP2pOffersItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketP2pOfferCancel"></a>
# **createVaultMarketP2pOfferCancel**
> ListVaultMarketP2pOffersItem createVaultMarketP2pOfferCancel(id)

Withdraw one of your open offers. Loans already taken from it carry on.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketP2pOffersItem = apiInstance.createVaultMarketP2pOfferCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketP2pOfferCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketP2pOfferCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketP2pOffersItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketP2pOfferTake"></a>
# **createVaultMarketP2pOfferTake**
> GetVaultMarketP2pLoanResponse createVaultMarketP2pOfferTake(id)

Borrow: take an offer against one of your stored vault units (&#x60;vaultItemId&#x60;). The unit is pledged (no listing, lending or withdrawal) and the principal is paid into your custodian account. Interest accrues by the second; repay any time. Pass &#x60;requestId&#x60; to make a retry safe.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketP2pLoanResponse = apiInstance.createVaultMarketP2pOfferTake(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketP2pOfferTake")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketP2pOfferTake")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketP2pLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPaperMissionMarkCheck"></a>
# **createVaultMarketPaperMissionMarkCheck**
> CreateVaultMarketPaperMissionMarkCheckResponse createVaultMarketPaperMissionMarkCheck()

Answer the \&quot;Read the mark\&quot; mission: the quality letter (A, B or C) you read on a market page, checked against the stored mark. One answer per market, 10 a day. Returns &#x60;{ bookKey, answer, correct, quality, mission, next }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketPaperMissionMarkCheckResponse = apiInstance.createVaultMarketPaperMissionMarkCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPaperMissionMarkCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPaperMissionMarkCheck")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketPaperMissionMarkCheckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPaperOrder"></a>
# **createVaultMarketPaperOrder**
> CreateVaultMarketPaperOrderResponse createVaultMarketPaperOrder()

Place a paper order (play money only). It takes visible real liquidity now at book prices with the taker fee simulated; a GTC limit rests the rest with a queue-position estimate, filled later as the real tape reaches it. Sells only paper units you hold (no paper shorts). Never touches the real book. Returns &#x60;{ order, fills }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketPaperOrderResponse = apiInstance.createVaultMarketPaperOrder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPaperOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPaperOrder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketPaperOrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPaperOrderCancel"></a>
# **createVaultMarketPaperOrderCancel**
> CreateVaultMarketPaperOrderCancelResponse createVaultMarketPaperOrderCancel(id)

Cancel a working paper order: the play cash or paper units it held come back. Returns &#x60;{ order }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketPaperOrderCancelResponse = apiInstance.createVaultMarketPaperOrderCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPaperOrderCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPaperOrderCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketPaperOrderCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPaperReset"></a>
# **createVaultMarketPaperReset**
> CreateVaultMarketPaperResetResponse createVaultMarketPaperReset()

Reset your paper account to $10,000 of play money: working paper orders are cancelled, paper positions cleared, and your leaderboard week starts again. Once a day.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketPaperResetResponse = apiInstance.createVaultMarketPaperReset()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPaperReset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPaperReset")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketPaperResetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPartnerApply"></a>
# **createVaultMarketPartnerApply**
> CreateVaultMarketPartnerApplyResponse createVaultMarketPartnerApply()

Apply as a Vault Drop-off Partner (a card shop that takes walk-ins for the vault). Needs the one-time ID check; ops approve.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketPartnerApplyResponse = apiInstance.createVaultMarketPartnerApply()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPartnerApply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPartnerApply")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketPartnerApplyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPartnerBatch"></a>
# **createVaultMarketPartnerBatch**
> CreateVaultMarketPartnerBatchResponse createVaultMarketPartnerBatch()

An approved partner sends walk-ins in under its code: each item (catalogue variant, condition, grade, photos) becomes an inbound vault unit; the box gets one prepaid label. The partner earns a capped share of Crossly&#39;s fee on each unit&#39;s first sale.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketPartnerBatchResponse = apiInstance.createVaultMarketPartnerBatch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPartnerBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPartnerBatch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketPartnerBatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPoolStake"></a>
# **createVaultMarketPoolStake**
> CreateVaultMarketPoolStakeResponse createVaultMarketPoolStake()

Stake CBX you hold at the custodian into the market pool (base units, as a string). Returns &#x60;{ stakeId, shares }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketPoolStakeResponse = apiInstance.createVaultMarketPoolStake()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPoolStake")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPoolStake")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketPoolStakeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPoolStakeUnstake"></a>
# **createVaultMarketPoolStakeUnstake**
> CreateVaultMarketPoolStakeUnstakeResponse createVaultMarketPoolStakeUnstake(id)

Unstake: paid out after the 7-day cooldown. Returns &#x60;{ cooldownUntil }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketPoolStakeUnstakeResponse = apiInstance.createVaultMarketPoolStakeUnstake(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPoolStakeUnstake")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPoolStakeUnstake")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketPoolStakeUnstakeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPortfolioMarginEnroll"></a>
# **createVaultMarketPortfolioMarginEnroll**
> CreateVaultMarketPortfolioMarginEnrollResponse createVaultMarketPortfolioMarginEnroll()

Admin: put a firm sub-account under portfolio margin. Needs VAULT_LEVERAGE_VENUE, your ID, an ECP-attested entity that passed KYB, and the minimum equity. Its positions are then margined on the whole account, recalculated every 5 minutes; calls and auctions are unchanged. Audited.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketPortfolioMarginEnrollResponse = apiInstance.createVaultMarketPortfolioMarginEnroll()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPortfolioMarginEnroll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPortfolioMarginEnroll")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketPortfolioMarginEnrollResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPortfolioMarginLeave"></a>
# **createVaultMarketPortfolioMarginLeave**
> CreateVaultMarketPortfolioMarginLeaveResponse createVaultMarketPortfolioMarginLeave()

Admin: take a firm sub-account off portfolio margin. Each position is then held to its own tier floors again and may be called at once. Audited.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketPortfolioMarginLeaveResponse = apiInstance.createVaultMarketPortfolioMarginLeave()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPortfolioMarginLeave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPortfolioMarginLeave")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketPortfolioMarginLeaveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPortfolioMarginWhatIf"></a>
# **createVaultMarketPortfolioMarginWhatIf**
> CreateVaultMarketPortfolioMarginWhatIfResponse createVaultMarketPortfolioMarginWhatIf()

The portfolio margin requirement of a firm sub-account before and after a trade (&#x60;bookKey&#x60;, &#x60;side&#x60; buy or sell, &#x60;units&#x60;), at the Crossly mark with fees left out. Changes nothing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketPortfolioMarginWhatIfResponse = apiInstance.createVaultMarketPortfolioMarginWhatIf()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPortfolioMarginWhatIf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPortfolioMarginWhatIf")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketPortfolioMarginWhatIfResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPositionCancel"></a>
# **createVaultMarketPositionCancel**
> OkResponse createVaultMarketPositionCancel(id)

Cancel the working order: an unfilled opening order cancels the position; an unfilled cover or close leaves it open. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createVaultMarketPositionCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPositionCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPositionCancel")
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

<a name="createVaultMarketPositionClose"></a>
# **createVaultMarketPositionClose**
> CreateVaultMarketPositionCloseResponse createVaultMarketPositionClose(id)

Close a leveraged long: all its units, or &#x60;units&#x60; of them, each sold for at least &#x60;minCents&#x60;; each sale repays the pool first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketPositionCloseResponse = apiInstance.createVaultMarketPositionClose(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPositionClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPositionClose")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketPositionCloseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPositionCollateral"></a>
# **createVaultMarketPositionCollateral**
> CreateVaultMarketPositionCollateralResponse createVaultMarketPositionCollateral(id)

Answer a margin call: a short posts more collateral (USD, or CBX at half value); a leveraged long pays down its pool loan. Returns the position.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketPositionCollateralResponse = apiInstance.createVaultMarketPositionCollateral(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPositionCollateral")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPositionCollateral")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketPositionCollateralResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPositionCover"></a>
# **createVaultMarketPositionCover**
> CreateVaultMarketPositionCloseResponse createVaultMarketPositionCover(id)

Cover a short: all its units, or &#x60;units&#x60; of them, each buying any unit of the key into the vault for up to &#x60;maxCents&#x60;; each goes back to its lender.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketPositionCloseResponse = apiInstance.createVaultMarketPositionCover(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPositionCover")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPositionCover")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketPositionCloseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPriceWidget"></a>
# **createVaultMarketPriceWidget**
> ListVaultMarketPriceWidgetsItem createVaultMarketPriceWidget()

Make a price widget for one vault market (&#x60;kind&#x60; mark + &#x60;bookKey&#x60;) or one public index (&#x60;kind&#x60; index + &#x60;indexSlug&#x60;): range, layout (compact or chart), theme (auto, light, dark), optionally your own affiliate code for the link back and the sites allowed to show it (empty &#x3D; any). Returns the widget with its snippets.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPriceWidgetsItem = apiInstance.createVaultMarketPriceWidget()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPriceWidget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPriceWidget")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPriceWidgetsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketPriceWidgetPreview"></a>
# **createVaultMarketPriceWidgetPreview**
> CreateVaultMarketPriceWidgetPreviewResponse createVaultMarketPriceWidgetPreview()

What a widget would show before you save it: &#x60;view&#x60; (value, move, quality, n, as-of, link back) and &#x60;html&#x60;, the exact page the iframe serves. Nothing is stored.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketPriceWidgetPreviewResponse = apiInstance.createVaultMarketPriceWidgetPreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketPriceWidgetPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketPriceWidgetPreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketPriceWidgetPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProBracket"></a>
# **createVaultMarketProBracket**
> CreateVaultMarketProBracketResponse createVaultMarketProBracket()

A buy order with a take-profit and/or stop-loss attached; the exits arm as an OCO pair for what the entry fills.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketProBracketResponse = apiInstance.createVaultMarketProBracket()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProBracket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProBracket")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketProBracketResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProLinkCancel"></a>
# **createVaultMarketProLinkCancel**
> ListVaultMarketProLinksItem createVaultMarketProLinkCancel(id)

Cancel a linked order: its open child orders come off; a bracket&#39;s entry stays.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketProLinksItem = apiInstance.createVaultMarketProLinkCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProLinkCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProLinkCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketProLinksItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProOco"></a>
# **createVaultMarketProOco**
> CreateVaultMarketProOcoResponse createVaultMarketProOco()

Two orders on one key, one cancels the other: when one fills or its stop triggers, the other is cancelled (a partial fill shrinks it).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketProOcoResponse = apiInstance.createVaultMarketProOco()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProOco")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProOco")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketProOcoResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProOrder"></a>
# **createVaultMarketProOrder**
> CreateVaultMarketProOrderResponse createVaultMarketProOrder()

Place an order on a vault book: limit, market (protected, IOC), stop or stop-limit; GTC, GTD, IOC or FOK; post-only; an iceberg &#x60;displayQuantity&#x60;; a TWAP or VWAP algo over a window. Idempotent on &#x60;clientOrderId&#x60;. &#x60;subaccountId&#x60; trades for a firm sub-account you may trade (your role, its KYB, its limits, no firm halt; buys pay from its custodian account and land in it).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketProOrderResponse = apiInstance.createVaultMarketProOrder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProOrder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketProOrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProOrderCancel"></a>
# **createVaultMarketProOrderCancel**
> CreateVaultMarketProOrderResponse createVaultMarketProOrderCancel(id)

Cancel an order; what filled stays filled.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketProOrderResponse = apiInstance.createVaultMarketProOrderCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProOrderCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProOrderCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketProOrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProOrderCancelAll"></a>
# **createVaultMarketProOrderCancelAll**
> CreateVaultMarketProOrderCancelAllResponse createVaultMarketProOrderCancelAll()

Cancel every open order, or every one on a book key. Returns &#x60;{ cancelled }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketProOrderCancelAllResponse = apiInstance.createVaultMarketProOrderCancelAll()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProOrderCancelAll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProOrderCancelAll")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketProOrderCancelAllResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProOrderReplace"></a>
# **createVaultMarketProOrderReplace**
> CreateVaultMarketProOrderResponse createVaultMarketProOrderReplace(id)

Amend an order&#39;s price, stop or quantity (cancel-replace: it re-queues at its new price).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketProOrderResponse = apiInstance.createVaultMarketProOrderReplace(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProOrderReplace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProOrderReplace")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketProOrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProQuote"></a>
# **createVaultMarketProQuote**
> CreateVaultMarketProQuoteResponse createVaultMarketProQuote()

Market makers: set a two-sided post-only quote on a book key (replaces the last). With cancel-on-disconnect (default) heartbeat every 30 s or it is pulled.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketProQuoteResponse = apiInstance.createVaultMarketProQuote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProQuote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketProQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProQuoteHeartbeat"></a>
# **createVaultMarketProQuoteHeartbeat**
> CreateVaultMarketProQuoteHeartbeatResponse createVaultMarketProQuoteHeartbeat()

Keep your quotes alive (cancel-on-disconnect). Returns &#x60;{ quotes, at }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketProQuoteHeartbeatResponse = apiInstance.createVaultMarketProQuoteHeartbeat()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProQuoteHeartbeat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProQuoteHeartbeat")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketProQuoteHeartbeatResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProTrailingStop"></a>
# **createVaultMarketProTrailingStop**
> CreateVaultMarketProTrailingStopResponse createVaultMarketProTrailingStop()

A trailing stop: its stop follows the best price since it was placed, &#x60;trailBps&#x60; or &#x60;trailCents&#x60; behind (under the high for a sell, over the low for a buy).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketProTrailingStopResponse = apiInstance.createVaultMarketProTrailingStop()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProTrailingStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProTrailingStop")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketProTrailingStopResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketProfileFollow"></a>
# **createVaultMarketProfileFollow**
> CreateVaultMarketProfileFollowResponse createVaultMarketProfileFollow(handle)

Follow someone with a public vault: their new vault buys appear in your feed. No copy trading.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : CreateVaultMarketProfileFollowResponse = apiInstance.createVaultMarketProfileFollow(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketProfileFollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketProfileFollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**CreateVaultMarketProfileFollowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketRecurring"></a>
# **createVaultMarketRecurring**
> ListVaultMarketRecurringItem createVaultMarketRecurring()

Start a recurring buy: one whole unit of a key every week, two weeks or month, at no more than &#x60;maxPriceCents&#x60; and/or the mark plus &#x60;capBpsOverMark&#x60;; card (with an optional backup) or custodian; optional auto-lend.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketRecurringItem = apiInstance.createVaultMarketRecurring()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketRecurring")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketRecurring")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketRecurringItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketRfq"></a>
# **createVaultMarketRfq**
> CreateVaultMarketRfqResponse createVaultMarketRfq()

Ask for a quote on a block: dealers, the key&#39;s DMM and LPs, and holders are told, anonymously. Answers are firm for 60 s. Your limit is never shown.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketRfqResponse = apiInstance.createVaultMarketRfq()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketRfq")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketRfq")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketRfqResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketRfqAccept"></a>
# **createVaultMarketRfqAccept**
> CreateVaultMarketRfqAcceptResponse createVaultMarketRfqAccept(id)

Take one answer: it fills as a block through the normal fill path (fees by role, self-trade prevention, halts, LULD).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketRfqAcceptResponse = apiInstance.createVaultMarketRfqAccept(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketRfqAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketRfqAccept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketRfqAcceptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketRfqCancel"></a>
# **createVaultMarketRfqCancel**
> ListVaultMarketRfqItem createVaultMarketRfqCancel(id)

Cancel your open quote request.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketRfqItem = apiInstance.createVaultMarketRfqCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketRfqCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketRfqCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketRfqItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketRfqRespond"></a>
# **createVaultMarketRfqRespond**
> CreateVaultMarketRfqRespondResponse createVaultMarketRfqRespond(id)

Answer a quote request for the full quantity with a firm price, good for 60 s. Selling needs the units free in your vault; buying pays from your Vault Markets custodian account.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketRfqRespondResponse = apiInstance.createVaultMarketRfqRespond(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketRfqRespond")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketRfqRespond")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketRfqRespondResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketRfqResponseWithdraw"></a>
# **createVaultMarketRfqResponseWithdraw**
> CreateVaultMarketRfqRespondResponse createVaultMarketRfqResponseWithdraw(id)

Withdraw your live answer to a quote request.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketRfqRespondResponse = apiInstance.createVaultMarketRfqResponseWithdraw(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketRfqResponseWithdraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketRfqResponseWithdraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketRfqRespondResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketSetGoal"></a>
# **createVaultMarketSetGoal**
> GetVaultMarketSetGoalResponse createVaultMarketSetGoal()

Start a goal on a catalogue set (category, brandSlug, modelSlug from the set search), optionally with a target: one condition, and any grade, ungraded, or one exact grade. One live goal per set.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketSetGoalResponse = apiInstance.createVaultMarketSetGoal()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketSetGoal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketSetGoal")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketSetGoalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketSetGoalBasket"></a>
# **createVaultMarketSetGoalBasket**
> ListVaultMarketSetGoalBasketsItem createVaultMarketSetGoalBasket(id)

Place the \&quot;complete my set\&quot; basket bid: one GTC limit buy per missing piece, under a hard budget, paid by one of your saved cards or your custodian account. Every leg passes pre-trade risk and the ID line like any order. Idempotent on clientBasketId. One working basket per goal; its legs are cancelled once the set is complete.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketSetGoalBasketsItem = apiInstance.createVaultMarketSetGoalBasket(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketSetGoalBasket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketSetGoalBasket")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketSetGoalBasketsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketSetGoalBasketCancel"></a>
# **createVaultMarketSetGoalBasketCancel**
> ListVaultMarketSetGoalBasketsItem createVaultMarketSetGoalBasketCancel(id)

Cancel the goal working basket bid: every working leg comes off the book; what already filled stays in your vault.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketSetGoalBasketsItem = apiInstance.createVaultMarketSetGoalBasketCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketSetGoalBasketCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketSetGoalBasketCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketSetGoalBasketsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketShareCard"></a>
# **createVaultMarketShareCard**
> ListVaultMarketShareCardsItem createVaultMarketShareCard()

Make a verified share card of a position, a vault unit, a public index or your portfolio (&#x60;kind&#x60;, &#x60;refId&#x60;). The % on it is the price move since your real fill; amounts stay hidden unless &#x60;showAmounts&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketShareCardsItem = apiInstance.createVaultMarketShareCard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketShareCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketShareCard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketShareCardsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketShort"></a>
# **createVaultMarketShort**
> CreateVaultMarketLongResponse createVaultMarketShort()

Short a book key: borrow &#x60;units&#x60; lent units (default 1; at most 25/10/3/1 by liquidity tier A/B/C/D) and sell each at &#x60;limitCents&#x60; or better, posting collateral for all of them (50% of the mark each; CBX counts at half, up to 30%). All units are borrowed or none unless &#x60;allowPartial&#x60;. A partial sale opens with the units sold. Returns &#x60;{ positionId, matched, units }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketLongResponse = apiInstance.createVaultMarketShort()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketShort")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketShort")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketLongResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketSupplyBatchLabel"></a>
# **createVaultMarketSupplyBatchLabel**
> GetVaultMarketSupplyBatchResponse createVaultMarketSupplyBatchLabel(id)

Buy a box&#39;s prepaid label again after it failed (for example once a ship-from address is saved). A box that has a label keeps it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketSupplyBatchResponse = apiInstance.createVaultMarketSupplyBatchLabel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketSupplyBatchLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketSupplyBatchLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketSupplyBatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketSupplyInvite"></a>
# **createVaultMarketSupplyInvite**
> IdStatusResponse createVaultMarketSupplyInvite(id)

Accept or decline a Market Open invite (&#x60;accept&#x60;).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : IdStatusResponse = apiInstance.createVaultMarketSupplyInvite(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketSupplyInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketSupplyInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**IdStatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketSupplySend"></a>
# **createVaultMarketSupplySend**
> CreateVaultMarketSupplySendResponse createVaultMarketSupplySend()

Send inventory items matched to a catalogue variant to the vault as one box: each becomes an inbound vault unit, and the box gets one prepaid inbound label (a PDF to print). Optional: auto-list each unit in the vault book at a share of the mark once stored, and lend when idle. Items that cannot go say why. Crosslisted listings stay live.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketSupplySendResponse = apiInstance.createVaultMarketSupplySend()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketSupplySend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketSupplySend")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketSupplySendResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketTerm"></a>
# **createVaultMarketTerm**
> TermsVersionResponse createVaultMarketTerm()

Accept the current lending terms (needed to lend or short). Returns &#x60;{ termsVersion }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : TermsVersionResponse = apiInstance.createVaultMarketTerm()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketTerm")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**TermsVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketTodClaimObject"></a>
# **createVaultMarketTodClaimObject**
> CreateVaultMarketTodClaimObjectResponse createVaultMarketTodClaimObject(id)

Stop a transfer-on-death claim made on your own account. Returns &#x60;{ id, status, estateUnlocked }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketTodClaimObjectResponse = apiInstance.createVaultMarketTodClaimObject(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketTodClaimObject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketTodClaimObject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketTodClaimObjectResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketTodMyClaim"></a>
# **createVaultMarketTodMyClaim**
> CreateVaultMarketTodMyClaimResponse createVaultMarketTodMyClaim()

Start a claim as a named beneficiary (ID first), naming the account holder by @username or email. It stays a draft until you add documents and submit. Returns &#x60;{ id, status, existing }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketTodMyClaimResponse = apiInstance.createVaultMarketTodMyClaim()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketTodMyClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketTodMyClaim")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketTodMyClaimResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketTodMyClaimDocument"></a>
# **createVaultMarketTodMyClaimDocument**
> CreateVaultMarketTodMyClaimDocumentResponse createVaultMarketTodMyClaimDocument(id)

Add one document to a draft claim (or one ops asked more of): kind, filename and the file as base64 (PDF, JPEG or PNG, up to 8 MB). Kept privately for ops review. Returns &#x60;{ id, kind, label, filename, bytes }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketTodMyClaimDocumentResponse = apiInstance.createVaultMarketTodMyClaimDocument(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketTodMyClaimDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketTodMyClaimDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketTodMyClaimDocumentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketTodMyClaimSubmit"></a>
# **createVaultMarketTodMyClaimSubmit**
> IdStatusResponse createVaultMarketTodMyClaimSubmit(id)

Send a claim for ops review (it needs a death certificate). The account holder is told and can stop it. Returns &#x60;{ id, status }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : IdStatusResponse = apiInstance.createVaultMarketTodMyClaimSubmit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketTodMyClaimSubmit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketTodMyClaimSubmit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**IdStatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketTodMyClaimWithdraw"></a>
# **createVaultMarketTodMyClaimWithdraw**
> IdStatusResponse createVaultMarketTodMyClaimWithdraw(id)

Withdraw a claim before it is released. Returns &#x60;{ id, status }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : IdStatusResponse = apiInstance.createVaultMarketTodMyClaimWithdraw(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketTodMyClaimWithdraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketTodMyClaimWithdraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**IdStatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketTodTerm"></a>
# **createVaultMarketTodTerm**
> TermsVersionResponse createVaultMarketTodTerm()

Accept the current transfer-on-death terms. Returns &#x60;{ termsVersion }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : TermsVersionResponse = apiInstance.createVaultMarketTodTerm()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketTodTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketTodTerm")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**TermsVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketUnitEvidenceScan"></a>
# **createVaultMarketUnitEvidenceScan**
> GetVaultMarketUnitEvidenceResponse createVaultMarketUnitEvidenceScan(id)

Add a finished scan of your own (&#x60;captureId&#x60;, of the same catalogue item) to your vault unit. Shown as added by the owner, not as intake evidence.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketUnitEvidenceResponse = apiInstance.createVaultMarketUnitEvidenceScan(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketUnitEvidenceScan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketUnitEvidenceScan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketUnitEvidenceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketUnitSellNow"></a>
# **createVaultMarketUnitSellNow**
> CreateVaultMarketInstantExitResponse createVaultMarketUnitSellNow(id)

Sell one unit of this item now into the best bid (Instant Exit: an immediate-or-cancel pro order), never below &#x60;minCents&#x60;. Returns &#x60;{ status: filled | missed, filledCents, quote, order }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultMarketInstantExitResponse = apiInstance.createVaultMarketUnitSellNow(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketUnitSellNow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketUnitSellNow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultMarketInstantExitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketValuationStatement"></a>
# **createVaultMarketValuationStatement**
> CreateVaultMarketValuationStatementResponse createVaultMarketValuationStatement()

Issue an insurance or appraisal statement for a day: frozen with the sha256 of its record, sealed in the Crossly audit chain, with a public verify link. preparedFor and policyRef are printed on it and never shown on verify. Moves no money.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketValuationStatementResponse = apiInstance.createVaultMarketValuationStatement()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketValuationStatement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketValuationStatement")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketValuationStatementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketWatchlist"></a>
# **createVaultMarketWatchlist**
> CreateVaultMarketWatchlistResponse createVaultMarketWatchlist()

Watch a book key. Returns &#x60;{ bookKey, watching }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketWatchlistResponse = apiInstance.createVaultMarketWatchlist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketWatchlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketWatchlist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketWatchlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultMarketWidgetToken"></a>
# **createVaultMarketWidgetToken**
> CreateVaultMarketWidgetTokenResponse createVaultMarketWidgetToken()

Mint a widget token for one phone (&#x60;deviceName&#x60;, &#x60;installId&#x60;); minting again with the same pair replaces that phone token. The token reads the widget summary and nothing else, and is returned once. At most five phones.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketWidgetTokenResponse = apiInstance.createVaultMarketWidgetToken()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultMarketWidgetToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultMarketWidgetToken")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketWidgetTokenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultReceiptTokenConfirm"></a>
# **createVaultReceiptTokenConfirm**
> CreateVaultReceiptTokenConfirmResponse createVaultReceiptTokenConfirm(id)

After your wallet sent the export: read the chain and mark the token live once its one token exists. Pass the &#x60;signature&#x60; your wallet returned to record it (kept only if it landed).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultReceiptTokenConfirmResponse = apiInstance.createVaultReceiptTokenConfirm(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultReceiptTokenConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultReceiptTokenConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultReceiptTokenConfirmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultReceiptTokenExport"></a>
# **createVaultReceiptTokenExport**
> CreateVaultReceiptTokenExportResponse createVaultReceiptTokenExport()

Send one unit (&#x60;vaultItemId&#x60;) warehouse receipt to one of your verified Solana wallets (&#x60;wallet&#x60;) as a token, accepting the current terms (&#x60;acceptTerms&#x60;). Returns a base64 transaction already signed by the new mint and the receipts authority: your wallet pays the rent and must sign and send it within about two minutes, then call confirm. Nothing is minted until it does. Needs a verified ID; the unit must be stored, unpledged, not lent and not for sale.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultReceiptTokenExportResponse = apiInstance.createVaultReceiptTokenExport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultReceiptTokenExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultReceiptTokenExport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultReceiptTokenExportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultReceiptTokenRedeem"></a>
# **createVaultReceiptTokenRedeem**
> CreateVaultReceiptTokenRedeemResponse createVaultReceiptTokenRedeem(id)

Redeem a receipt token held in one of your verified Solana wallets (&#x60;wallet&#x60;): returns an unsigned base64 burn your wallet signs and sends (it also closes the token account and returns its rent to you). Once it lands, call redeem/confirm and the unit is yours in the vault. Refused while the token is frozen.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultReceiptTokenRedeemResponse = apiInstance.createVaultReceiptTokenRedeem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultReceiptTokenRedeem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultReceiptTokenRedeem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultReceiptTokenRedeemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultReceiptTokenRedeemConfirm"></a>
# **createVaultReceiptTokenRedeemConfirm**
> CreateVaultReceiptTokenRedeemConfirmResponse createVaultReceiptTokenRedeemConfirm(id)

After your wallet sent the redeem: read the chain; once the token is burned the unit moves into your vault (if it was not yours already). Pass the &#x60;signature&#x60; to record it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateVaultReceiptTokenRedeemConfirmResponse = apiInstance.createVaultReceiptTokenRedeemConfirm(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultReceiptTokenRedeemConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultReceiptTokenRedeemConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateVaultReceiptTokenRedeemConfirmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVaultReceiptTokenWalletAllow"></a>
# **createVaultReceiptTokenWalletAllow**
> CreateVaultReceiptTokenWalletAllowResponse createVaultReceiptTokenWalletAllow()

Put one of your verified Solana wallets (&#x60;wallet&#x60;) on the receipt-token allow-list so it can hold and receive receipt tokens. Returns a base64 transaction already signed by the receipts authority: the wallet pays the small rent (about 0.001 SOL) and must sign and send it within about two minutes. Needs a verified ID and a wallet that passes the sanctions screen.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultReceiptTokenWalletAllowResponse = apiInstance.createVaultReceiptTokenWalletAllow()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#createVaultReceiptTokenWalletAllow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#createVaultReceiptTokenWalletAllow")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultReceiptTokenWalletAllowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketAgentWatch"></a>
# **deleteVaultMarketAgentWatch**
> ListVaultMarketAgentWatchesItem deleteVaultMarketAgentWatch(id)

Cancel a live price watch. Returns the watch.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketAgentWatchesItem = apiInstance.deleteVaultMarketAgentWatch(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketAgentWatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketAgentWatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketAgentWatchesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketAlert"></a>
# **deleteVaultMarketAlert**
> OkResponse deleteVaultMarketAlert(id)

Delete a price alert. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.deleteVaultMarketAlert(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketAlert")
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

<a name="deleteVaultMarketBullionFamilyPeg"></a>
# **deleteVaultMarketBullionFamilyPeg**
> ListVaultMarketBullionFamilyPegsItem deleteVaultMarketBullionFamilyPeg(id)

Stop a family-wide quote: every leg order comes off the book; what filled stays filled.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketBullionFamilyPegsItem = apiInstance.deleteVaultMarketBullionFamilyPeg(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketBullionFamilyPeg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketBullionFamilyPeg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketBullionFamilyPegsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketBullionPeg"></a>
# **deleteVaultMarketBullionPeg**
> ListVaultMarketBullionPegsItem deleteVaultMarketBullionPeg(id)

Stop a spot-pegged quote: its resting order comes off the book; what filled stays filled.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketBullionPegsItem = apiInstance.deleteVaultMarketBullionPeg(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketBullionPeg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketBullionPeg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketBullionPegsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketDealerBand"></a>
# **deleteVaultMarketDealerBand**
> ListVaultMarketDealerBandsItem deleteVaultMarketDealerBand()

Stop a band on a key; its standing bid comes off.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketDealerBandsItem = apiInstance.deleteVaultMarketDealerBand()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketDealerBand")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketDealerBand")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketDealerBandsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketEntityMember"></a>
# **deleteVaultMarketEntityMember**
> OkResponse deleteVaultMarketEntityMember(id, memberId)

Admin: remove a member (or leave, yourself). An entity always keeps one admin.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val memberId : kotlin.String = memberId_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.deleteVaultMarketEntityMember(id, memberId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketEntityMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketEntityMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **memberId** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketFollowCopyWatch"></a>
# **deleteVaultMarketFollowCopyWatch**
> DeleteVaultMarketFollowCopyWatchResponse deleteVaultMarketFollowCopyWatch(handle)

Stop copy-watching a collector.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : DeleteVaultMarketFollowCopyWatchResponse = apiInstance.deleteVaultMarketFollowCopyWatch(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketFollowCopyWatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketFollowCopyWatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**DeleteVaultMarketFollowCopyWatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketIndex"></a>
# **deleteVaultMarketIndex**
> OkResponse deleteVaultMarketIndex(slug)

Delete an index of your own. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.deleteVaultMarketIndex(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketIndex")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketIndex")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketLocate"></a>
# **deleteVaultMarketLocate**
> ListVaultMarketLocateMineItem deleteVaultMarketLocate(id)

Release a live locate before it lapses.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketLocateMineItem = apiInstance.deleteVaultMarketLocate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketLocate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketLocate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketLocateMineItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketOpeningWaitlist"></a>
# **deleteVaultMarketOpeningWaitlist**
> DeleteVaultMarketOpeningWaitlistResponse deleteVaultMarketOpeningWaitlist(slug)

Leave a key&#39;s waitlist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : DeleteVaultMarketOpeningWaitlistResponse = apiInstance.deleteVaultMarketOpeningWaitlist(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketOpeningWaitlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketOpeningWaitlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**DeleteVaultMarketOpeningWaitlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketPriceWidget"></a>
# **deleteVaultMarketPriceWidget**
> DeleteVaultMarketPriceWidgetResponse deleteVaultMarketPriceWidget(id)

Delete a widget. Pages that still paste it show that it is no longer available. Returns &#x60;{ id, archived }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteVaultMarketPriceWidgetResponse = apiInstance.deleteVaultMarketPriceWidget(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketPriceWidget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketPriceWidget")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteVaultMarketPriceWidgetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketProQuote"></a>
# **deleteVaultMarketProQuote**
> DeleteVaultMarketProQuoteResponse deleteVaultMarketProQuote()

Pull your quote on a book key, or every quote. Returns &#x60;{ pulled }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : DeleteVaultMarketProQuoteResponse = apiInstance.deleteVaultMarketProQuote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketProQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketProQuote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**DeleteVaultMarketProQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketProfileFollow"></a>
# **deleteVaultMarketProfileFollow**
> CreateVaultMarketProfileFollowResponse deleteVaultMarketProfileFollow(handle)

Stop following someone.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : CreateVaultMarketProfileFollowResponse = apiInstance.deleteVaultMarketProfileFollow(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketProfileFollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketProfileFollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**CreateVaultMarketProfileFollowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketRecurring"></a>
# **deleteVaultMarketRecurring**
> ListVaultMarketRecurringItem deleteVaultMarketRecurring(id)

Stop a recurring buy for good; its history stays.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketRecurringItem = apiInstance.deleteVaultMarketRecurring(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketRecurring")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketRecurring")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketRecurringItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketSetGoal"></a>
# **deleteVaultMarketSetGoal**
> DeleteVaultMarketSetGoalResponse deleteVaultMarketSetGoal(id)

Remove a set goal. A working basket bid is cancelled first; what filled stays in your vault.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteVaultMarketSetGoalResponse = apiInstance.deleteVaultMarketSetGoal(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketSetGoal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketSetGoal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteVaultMarketSetGoalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketShareCard"></a>
# **deleteVaultMarketShareCard**
> OkResponse deleteVaultMarketShareCard(id)

Take a share card down: its link and image stop working. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteVaultMarketShareCard(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketShareCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketShareCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketSupplyRoundUp"></a>
# **deleteVaultMarketSupplyRoundUp**
> GetVaultMarketSupplyRoundUpResponse deleteVaultMarketSupplyRoundUp()

Stop the round-up (its history stays; an armed buy is cancelled).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketSupplyRoundUpResponse = apiInstance.deleteVaultMarketSupplyRoundUp()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketSupplyRoundUp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketSupplyRoundUp")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketSupplyRoundUpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketUnitEvidence"></a>
# **deleteVaultMarketUnitEvidence**
> GetVaultMarketUnitEvidenceResponse deleteVaultMarketUnitEvidence(id, evidenceId)

Take back a scan you added to your vault unit (intake evidence stays).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val evidenceId : kotlin.String = evidenceId_example // kotlin.String | 
try {
    val result : GetVaultMarketUnitEvidenceResponse = apiInstance.deleteVaultMarketUnitEvidence(id, evidenceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketUnitEvidence")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketUnitEvidence")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **evidenceId** | **kotlin.String**|  |

### Return type

**GetVaultMarketUnitEvidenceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketWatchlist"></a>
# **deleteVaultMarketWatchlist**
> CreateVaultMarketWatchlistResponse deleteVaultMarketWatchlist()

Stop watching a book key (&#x60;?bookKey&#x3D;&#x60;). Returns &#x60;{ bookKey, watching }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : CreateVaultMarketWatchlistResponse = apiInstance.deleteVaultMarketWatchlist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketWatchlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketWatchlist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateVaultMarketWatchlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketWidgetToken"></a>
# **deleteVaultMarketWidgetToken**
> DeleteVaultMarketWidgetTokenResponse deleteVaultMarketWidgetToken()

Turn the widget off on every phone: revokes all your widget tokens. Returns &#x60;{ revoked }&#x60;, how many.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : DeleteVaultMarketWidgetTokenResponse = apiInstance.deleteVaultMarketWidgetToken()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketWidgetToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketWidgetToken")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**DeleteVaultMarketWidgetTokenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVaultMarketWidgetTokenById"></a>
# **deleteVaultMarketWidgetTokenById**
> DeleteVaultMarketWidgetTokenByIdResponse deleteVaultMarketWidgetTokenById(id)

Turn the widget off on one phone: revokes that widget token at once. Only a widget token can be revoked here.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteVaultMarketWidgetTokenByIdResponse = apiInstance.deleteVaultMarketWidgetTokenById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#deleteVaultMarketWidgetTokenById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#deleteVaultMarketWidgetTokenById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteVaultMarketWidgetTokenByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultAttestation"></a>
# **getVaultAttestation**
> GetVaultAttestationResponse getVaultAttestation()

Vault attestations: independent physical counts, the insurance certificate (with a warning when insured value in the vault exceeds its aggregate or per-occurrence limit), SOC 1 Type II and SOC 2 reports. Each carries its signed document.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultAttestationResponse = apiInstance.getVaultAttestation()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultAttestation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultAttestation")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultAttestationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketAccount"></a>
# **getVaultMarketAccount**
> GetVaultMarketAccountResponse getVaultMarketAccount()

Which Vault Markets registrations are live (and the env each waits on), your custodian account, limits and balances.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketAccountResponse = apiInstance.getVaultMarketAccount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketAccount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketAccountResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketAdl"></a>
# **getVaultMarketAdl**
> GetVaultMarketAdlResponse getVaultMarketAdl()

The insurance fund (booked and free to draw), the most one event may draw before auto-deleveraging (ADL) starts, the loss waterfall in order, and the latest ADL events (no user or position ids). Money in cents.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketAdlResponse = apiInstance.getVaultMarketAdl()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketAdl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketAdl")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketAdlResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketAdlPosition"></a>
# **getVaultMarketAdlPosition**
> ListVaultMarketAdlPositionsItem getVaultMarketAdlPosition(id)

One of your positions with its ADL lights (0 once it has ended).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketAdlPositionsItem = apiInstance.getVaultMarketAdlPosition(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketAdlPosition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketAdlPosition")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketAdlPositionsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketAdvanceQuote"></a>
# **getVaultMarketAdvanceQuote**
> GetVaultMarketAdvanceQuoteResponse getVaultMarketAdvanceQuote()

What an advance on a vault unit for sale could be: up to half of the lower of its mark and asking price, free for 60 days.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketAdvanceQuoteResponse = apiInstance.getVaultMarketAdvanceQuote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketAdvanceQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketAdvanceQuote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketAdvanceQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketAgentDraft"></a>
# **getVaultMarketAgentDraft**
> ListVaultMarketAgentDraftsItem getVaultMarketAgentDraft(id)

One drafted order: item, side, units, limit (cents), the book when drafted, status, and the orderBody that places it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketAgentDraftsItem = apiInstance.getVaultMarketAgentDraft(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketAgentDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketAgentDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketAgentDraftsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketAlertPref"></a>
# **getVaultMarketAlertPref**
> GetVaultMarketAlertPrefResponse getVaultMarketAlertPref()

Your vault alert settings: every kind (price, fill, margin_call, adl, p2p_loan, auction, market_open, receipt_token, set_goal, follow, account), every channel (push, telegram, terminal, email, webhook) with whether it is set up, the full on/off grid, the locked switches (a critical kind always pushes) and quiet hours.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketAlertPrefResponse = apiInstance.getVaultMarketAlertPref()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketAlertPref")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketAlertPref")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketAlertPrefResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketAuctionLot"></a>
# **getVaultMarketAuctionLot**
> GetVaultMarketAuctionLotResponse getVaultMarketAuctionLot(id)

One lot: the price showing, the next minimum bid, whether a reserve exists and is met, the end (extended by late bids), the bid history and your standing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketAuctionLotResponse = apiInstance.getVaultMarketAuctionLot(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketAuctionLot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketAuctionLot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketAuctionLotResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketAuctionMine"></a>
# **getVaultMarketAuctionMine**
> GetVaultMarketAuctionMineResponse getVaultMarketAuctionMine()

Lots you consigned (with your reserve) and lots you bid on (with your maximum and whether you lead).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketAuctionMineResponse = apiInstance.getVaultMarketAuctionMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketAuctionMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketAuctionMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketAuctionMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketBlock"></a>
# **getVaultMarketBlock**
> ListVaultMarketBlocksItem getVaultMarketBlock(orderId)

One block order: its order, plan lines (planned and allocated units, average price, cash share, status).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val orderId : kotlin.String = orderId_example // kotlin.String | 
try {
    val result : ListVaultMarketBlocksItem = apiInstance.getVaultMarketBlock(orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketBlock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketBlock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **kotlin.String**|  |

### Return type

**ListVaultMarketBlocksItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketBullionFor"></a>
# **getVaultMarketBullionFor**
> GetVaultMarketBullionForResponse getVaultMarketBullionFor()

The bullion key families one book key belongs to, with spot for its metal as a labelled reference and its melt value at that spot. Empty families when the item is not keyed bullion.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketBullionForResponse = apiInstance.getVaultMarketBullionFor()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketBullionFor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketBullionFor")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketBullionForResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketBullionKey"></a>
# **getVaultMarketBullionKey**
> GetVaultMarketBullionKeyResponse getVaultMarketBullionKey(slug)

One bullion key family: its catalogue products, every live book key with best bid, best ask, vault units and its mark (from the book only), live pegged quote counts, and spot as a labelled reference.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetVaultMarketBullionKeyResponse = apiInstance.getVaultMarketBullionKey(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketBullionKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketBullionKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetVaultMarketBullionKeyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketBullionPegPreview"></a>
# **getVaultMarketBullionPegPreview**
> GetVaultMarketBullionPegPreviewResponse getVaultMarketBullionPegPreview()

The price a spot-pegged quote would rest at now (spot plus a premium in cents or basis points, clamped to floor and cap). No price when spot is stale or missing: such a quote waits off the book.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketBullionPegPreviewResponse = apiInstance.getVaultMarketBullionPegPreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketBullionPegPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketBullionPegPreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketBullionPegPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketCall"></a>
# **getVaultMarketCall**
> GetVaultMarketCallResponse getVaultMarketCall(bookKey)

Recent call-auction uncrosses on a book key: kind (open, reopen, periodic, daily, buy-in, sell-off), clearing price in cents and units.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val bookKey : kotlin.String = bookKey_example // kotlin.String | 
try {
    val result : GetVaultMarketCallResponse = apiInstance.getVaultMarketCall(bookKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketCall")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketCall")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookKey** | **kotlin.String**|  |

### Return type

**GetVaultMarketCallResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketCapacity"></a>
# **getVaultMarketCapacity**
> GetVaultMarketCapacityResponse getVaultMarketCapacity()

Capacity from the book: &#x60;bookKey&#x60; (+ &#x60;units&#x60;) gives ADV, depth within ±5% of the mark, vault stock, lendable units and days to liquidate at 20% of ADV; &#x60;index&#x60; + &#x60;notional&#x60; (cents) gives how much of the basket the asks fill now and the days the rest needs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketCapacityResponse = apiInstance.getVaultMarketCapacity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketCapacity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketCapacity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketCapacityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketChannel"></a>
# **getVaultMarketChannel**
> GetVaultMarketChannelResponse getVaultMarketChannel()

Your Vault Markets channel switches: Telegram alerts and digest, the daily cap on vault nudges by push (default 5), whether a Telegram chat is linked, and how many nudges went out today.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketChannelResponse = apiInstance.getVaultMarketChannel()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketChannel")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketChannelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketCompare"></a>
# **getVaultMarketCompare**
> GetVaultMarketCompareResponse getVaultMarketCompare()

Up to 5 book keys and/or index slugs (&#x60;items&#x60;, comma-separated) as daily series on the same days, each rebased to 100.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketCompareResponse = apiInstance.getVaultMarketCompare()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketCompare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketCompare")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketCompareResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketConfirmation"></a>
# **getVaultMarketConfirmation**
> GetVaultMarketConfirmationResponse getVaultMarketConfirmation(tradeId)

One trade confirmation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val tradeId : kotlin.String = tradeId_example // kotlin.String | 
try {
    val result : GetVaultMarketConfirmationResponse = apiInstance.getVaultMarketConfirmation(tradeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketConfirmation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketConfirmation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **kotlin.String**|  |

### Return type

**GetVaultMarketConfirmationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketConfirmationPdf"></a>
# **getVaultMarketConfirmationPdf**
> java.io.File getVaultMarketConfirmationPdf(tradeId)

One trade confirmation as a PDF.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val tradeId : kotlin.String = tradeId_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.getVaultMarketConfirmationPdf(tradeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketConfirmationPdf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketConfirmationPdf")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tradeId** | **kotlin.String**|  |

### Return type

**java.io.File**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketCorrelation"></a>
# **getVaultMarketCorrelation**
> GetVaultMarketCorrelationResponse getVaultMarketCorrelation()

The correlation matrix of the sector indexes&#39; weekly returns over &#x60;weeks&#x60; (default 52), pairwise-complete, with n per pair; a pair under 26 shared weeks has no number.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketCorrelationResponse = apiInstance.getVaultMarketCorrelation()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketCorrelation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketCorrelation")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketCorrelationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketCreatorAttribution"></a>
# **getVaultMarketCreatorAttribution**
> GetVaultMarketCreatorAttributionResponse getVaultMarketCreatorAttribution()

The creator who brought you to Vault Markets, when one did: when it started and ends, whether it still earns, and the disclosure. Your prices and fees are the same either way.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketCreatorAttributionResponse = apiInstance.getVaultMarketCreatorAttribution()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketCreatorAttribution")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketCreatorAttribution")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketCreatorAttributionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketCreatorDashboard"></a>
# **getVaultMarketCreatorDashboard**
> GetVaultMarketCreatorDashboardResponse getVaultMarketCreatorDashboard()

For creators: whether you joined the programme, each of your codes with traders attributed and still earning (counts only), shares accrued, paid and voided (cents) and the latest shares.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketCreatorDashboardResponse = apiInstance.getVaultMarketCreatorDashboard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketCreatorDashboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketCreatorDashboard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketCreatorDashboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketCreatorProgramme"></a>
# **getVaultMarketCreatorProgramme**
> GetVaultMarketCreatorProgrammeResponse getVaultMarketCreatorProgramme()

The Vault Markets creator programme: the share of the fee Crossly keeps that a creator earns, the per-fill and lifetime caps (cents), the attribution window in days, the 2% net floor it sits under, and the disclosure words.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketCreatorProgrammeResponse = apiInstance.getVaultMarketCreatorProgramme()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketCreatorProgramme")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketCreatorProgramme")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketCreatorProgrammeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketCreatorRoom"></a>
# **getVaultMarketCreatorRoom**
> GetVaultMarketCreatorRoomResponse getVaultMarketCreatorRoom()

For creators: your vault shelf room (applied, verified, rejected or paused) and whether your public vault profile is on, which the room needs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketCreatorRoomResponse = apiInstance.getVaultMarketCreatorRoom()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketCreatorRoom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketCreatorRoom")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketCreatorRoomResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketCredit"></a>
# **getVaultMarketCredit**
> GetVaultMarketCreditResponse getVaultMarketCredit(id)

One loan or advance with its pledged units and its money log (draws, interest, repayments, sale proceeds).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketCreditResponse = apiInstance.getVaultMarketCredit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketCredit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketCredit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketCreditResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketDcm"></a>
# **getVaultMarketDcm**
> GetVaultMarketDcmResponse getVaultMarketDcm()

The partner exchange (DCM) that lists and clears futures and options on Crossly indexes (needs VAULT_INDEX_DCM + VAULT_INDEX_DCM_API_URL + VAULT_INDEX_DCM_API_KEY), and its contracts as last read: perps, futures and options with the index each settles on, multiplier, tick, expiry and strike. Read-only: Crossly is the licensor and data provider, never the venue.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketDcmResponse = apiInstance.getVaultMarketDcm()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketDcm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketDcm")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketDcmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketDcmContract"></a>
# **getVaultMarketDcmContract**
> GetVaultMarketDcmContractResponse getVaultMarketDcmContract(symbol)

One partner contract: its spec, its funding prints (newest first; the partner computes and settles funding), annualised funding over the last 21 prints, and the Crossly index level it settles on.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val symbol : kotlin.String = symbol_example // kotlin.String | 
try {
    val result : GetVaultMarketDcmContractResponse = apiInstance.getVaultMarketDcmContract(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketDcmContract")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketDcmContract")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**|  |

### Return type

**GetVaultMarketDcmContractResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketDcmContractBook"></a>
# **getVaultMarketDcmContractBook**
> GetVaultMarketDcmContractBookResponse getVaultMarketDcmContractBook(symbol)

The partner exchange live order book for a contract (cached 5 seconds), with mark, index, last, open interest, 24 h volume, spread in bps and the basis of its mark over the Crossly index in bps. Prices are index points.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val symbol : kotlin.String = symbol_example // kotlin.String | 
try {
    val result : GetVaultMarketDcmContractBookResponse = apiInstance.getVaultMarketDcmContractBook(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketDcmContractBook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketDcmContractBook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**|  |

### Return type

**GetVaultMarketDcmContractBookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketDcmOptionsInput"></a>
# **getVaultMarketDcmOptionsInput**
> GetVaultMarketDcmOptionsInputResponse getVaultMarketDcmOptionsInput(slug)

Options inputs for an index (indexes only, never a single item): Crossly realised volatility (raw and Geltner-desmoothed, from weekly returns), the forward (the partner future mark, else the Crossly close), Black-76 greeks on a strike x expiry grid and on every option the partner lists on the index. Model inputs, not quotes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetVaultMarketDcmOptionsInputResponse = apiInstance.getVaultMarketDcmOptionsInput(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketDcmOptionsInput")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketDcmOptionsInput")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetVaultMarketDcmOptionsInputResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketDcmPosition"></a>
# **getVaultMarketDcmPosition**
> GetVaultMarketDcmPositionResponse getVaultMarketDcmPosition()

The partner exchange account linked to your account (or to the firm sub-account &#x60;subaccountId&#x60;) and its positions, read-only (cached 15 seconds); index futures on category indexes count as portfolio-margin hedges for that account: contracts, side, entry and mark price, unrealised P&amp;L and margin in cents, liquidation price and notional in cents. Not linked: &#x60;linked: false&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketDcmPositionResponse = apiInstance.getVaultMarketDcmPosition()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketDcmPosition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketDcmPosition")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketDcmPositionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketDealer"></a>
# **getVaultMarketDealer**
> GetVaultMarketDealerResponse getVaultMarketDealer()

Your dealer status (applied, approved, revoked) and your Instant Exit bands.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketDealerResponse = apiInstance.getVaultMarketDealer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketDealer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketDealer")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketDealerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketDealerPool"></a>
# **getVaultMarketDealerPool**
> ListVaultMarketDealerPoolsItem getVaultMarketDealerPool(id)

One of your curve pools, with its ladder and live legs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketDealerPoolsItem = apiInstance.getVaultMarketDealerPool(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketDealerPool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketDealerPool")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketDealerPoolsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketDigestPreview"></a>
# **getVaultMarketDigestPreview**
> GetVaultMarketDigestPreviewResponse getVaultMarketDigestPreview()

This week&#39;s vault digest as it would go out: units at the display marks (unmarked units counted, not valued), the like-for-like change from a week ago, offers on your units, watched keys that got a first mark, and one Learn card.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketDigestPreviewResponse = apiInstance.getVaultMarketDigestPreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketDigestPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketDigestPreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketDigestPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketEntity"></a>
# **getVaultMarketEntity**
> GetVaultMarketEntityResponse getVaultMarketEntity()

The entities (funds, LLCs, trusts, SPVs) you belong to, and invitations waiting for you.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketEntityResponse = apiInstance.getVaultMarketEntity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketEntity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketEntity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketEntityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketEntityById"></a>
# **getVaultMarketEntityById**
> GetVaultMarketEntityByIdResponse getVaultMarketEntityById(id)

One entity: members and roles, sub-accounts with their limits, firm halts, caps.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketEntityByIdResponse = apiInstance.getVaultMarketEntityById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketEntityById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketEntityById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketEntityByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketEstimate"></a>
# **getVaultMarketEstimate**
> GetVaultMarketEstimateResponse getVaultMarketEstimate(bookKey)

The Crossly Estimate for a book key — a model, not a price. Method (own trades, index-adjusted last trade, grade ratio), cents with 68% and 95% bands, High/Medium/Low from the walk-forward backtest&#39;s FSD, and n. Hidden (&#x60;available: false&#x60;) under 50 backtested trades or when FSD &gt; 0.30. Never used for margin, loans or settlement.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val bookKey : kotlin.String = bookKey_example // kotlin.String | 
try {
    val result : GetVaultMarketEstimateResponse = apiInstance.getVaultMarketEstimate(bookKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketEstimate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketEstimate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookKey** | **kotlin.String**|  |

### Return type

**GetVaultMarketEstimateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketExecutionQuality"></a>
# **getVaultMarketExecutionQuality**
> GetVaultMarketExecutionQualityResponse getVaultMarketExecutionQuality()

The quarterly execution-quality report (Rule 605 style): fill rates, speed, effective vs quoted spread and shortfall by order type and size, and the busiest keys. &#x60;quarter&#x60; like 2026-Q4; the current quarter is provisional.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketExecutionQualityResponse = apiInstance.getVaultMarketExecutionQuality()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketExecutionQuality")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketExecutionQuality")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketExecutionQualityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketFeeQuote"></a>
# **getVaultMarketFeeQuote**
> GetVaultMarketFeeQuoteResponse getVaultMarketFeeQuote()

Your fee for an order at a price: as maker (the order rests) and as taker (it fills at once), with the programme that sets your rate and any Crossly One trim. A buyer&#39;s fee is added to the price; a seller&#39;s comes out of the proceeds.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketFeeQuoteResponse = apiInstance.getVaultMarketFeeQuote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketFeeQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketFeeQuote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketFeeQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketFeeSchedule"></a>
# **getVaultMarketFeeSchedule**
> GetVaultMarketFeeScheduleResponse getVaultMarketFeeSchedule()

The fee schedule by role: maker and taker rates for retail, 30-day volume, Registered LPs and DMMs, the CBX discount, the referral share and the 2% net floor Crossly always keeps.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketFeeScheduleResponse = apiInstance.getVaultMarketFeeSchedule()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketFeeSchedule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketFeeSchedule")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketFeeScheduleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketFollowSharing"></a>
# **getVaultMarketFollowSharing**
> GetVaultMarketFollowSharingResponse getVaultMarketFollowSharing()

Your sharing switches: the public vault profile, new buys, units sent in, sales, Hall loans, bids and asks for copy-watchers, and the leaderboards. All off until you turn them on.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketFollowSharingResponse = apiInstance.getVaultMarketFollowSharing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketFollowSharing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketFollowSharing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketFollowSharingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketGemRate"></a>
# **getVaultMarketGemRate**
> GetVaultMarketGemRateResponse getVaultMarketGemRate(bookKey)

The Crossly gem rate: of cards graded through Crossly, the share that came back at each grader&#39;s gem grade, for this item and its category, with a Wilson 95% band. 10 returns per grader or no number. Not a grader population report.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val bookKey : kotlin.String = bookKey_example // kotlin.String | 
try {
    val result : GetVaultMarketGemRateResponse = apiInstance.getVaultMarketGemRate(bookKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketGemRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketGemRate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookKey** | **kotlin.String**|  |

### Return type

**GetVaultMarketGemRateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketGradeToVault"></a>
# **getVaultMarketGradeToVault**
> ListVaultMarketGradeToVaultItem getVaultMarketGradeToVault(id)

One Grade to Vault flow, brought up to date with its submission and unit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketGradeToVaultItem = apiInstance.getVaultMarketGradeToVault(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketGradeToVault")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketGradeToVault")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketGradeToVaultItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketGradeToVaultCandidate"></a>
# **getVaultMarketGradeToVaultCandidate**
> GetVaultMarketGradeToVaultCandidateResponse getVaultMarketGradeToVaultCandidate()

What you can start Grade to Vault on: raw inventory matched to a catalogue item, and raw vault units on the grading hub shelf; plus whether Grading Runs are open.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketGradeToVaultCandidateResponse = apiInstance.getVaultMarketGradeToVaultCandidate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketGradeToVaultCandidate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketGradeToVaultCandidate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketGradeToVaultCandidateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketGradingSignal"></a>
# **getVaultMarketGradingSignal**
> GetVaultMarketGradingSignalResponse getVaultMarketGradingSignal()

For a raw book key: the marks of the same item&#39;s graded keys, the spread over raw, grading cost per grader, the margin tier grading lifts it to, your raw vault units it pays to grade, and where to act.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketGradingSignalResponse = apiInstance.getVaultMarketGradingSignal()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketGradingSignal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketGradingSignal")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketGradingSignalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketHallLoan"></a>
# **getVaultMarketHallLoan**
> GetVaultMarketHallLoanResponse getVaultMarketHallLoan()

Your Hall of Grails desk: this week&#39;s exhibition, the rules (maxLive loans, shownPerHolder per exhibition, repPoints per exhibition shown), reputation (exhibitions finished), your loans (status active, ending or ended; onShowNow, showingUntil, exhibitions, the next exhibition it fits, the Lent to the Hall badge) and the vault units you could lend (canLend, or the blocker in words, and the next exhibition each fits). Display only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketHallLoanResponse = apiInstance.getVaultMarketHallLoan()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketHallLoan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketHallLoan")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketHallLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketHealth"></a>
# **getVaultMarketHealth**
> GetVaultMarketHealthResponse getVaultMarketHealth()

Portfolio health of your vault holdings at Crossly marks: concentration by single item, category, grade and grader (shares, HHI on 0 to 10000, its band and effective number of holdings), value by liquidity tier, the stress grid (each category and everything down 10, 20 and 30 percent), value by mark quality, plain observations, and the held items a what-if can run on. Information only, not advice.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketHealthResponse = apiInstance.getVaultMarketHealth()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketHealth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketHealth")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketHealthResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketHealthWhatIf"></a>
# **getVaultMarketHealthWhatIf**
> GetVaultMarketHealthWhatIfResponse getVaultMarketHealthWhatIf(bookKey, moveBps)

What if one held item moved by moveBps (-10000 to 10000 basis points of its mark): the item, your vault total, the item and its category share of the vault, and the single-item HHI, before and after. A scenario on the mark, not a price you could sell at.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val bookKey : kotlin.String = bookKey_example // kotlin.String | 
val moveBps : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : GetVaultMarketHealthWhatIfResponse = apiInstance.getVaultMarketHealthWhatIf(bookKey, moveBps)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketHealthWhatIf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketHealthWhatIf")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookKey** | **kotlin.String**|  |
 **moveBps** | **kotlin.Int**|  |

### Return type

**GetVaultMarketHealthWhatIfResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketHomeUnit"></a>
# **getVaultMarketHomeUnit**
> GetVaultMarketHomeUnitResponse getVaultMarketHomeUnit()

\&quot;Show my vault\&quot;: the vault units you hold, the ones standing in your Crossly World home first. Each: vaultItemId, title, grade, imageUrl, bookKey (its market), inHome, visitors (visitors to your home see it). Also your home (slug, privacy, path), max units one home shows, shown, visitorsSee and a note on who sees what. Your home is made on first read. No prices.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketHomeUnitResponse = apiInstance.getVaultMarketHomeUnit()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketHomeUnit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketHomeUnit")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketHomeUnitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketIndex"></a>
# **getVaultMarketIndex**
> GetVaultMarketIndexResponse getVaultMarketIndex(slug)

One index with its daily closes (oldest first) and its level now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetVaultMarketIndexResponse = apiInstance.getVaultMarketIndex(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketIndex")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketIndex")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetVaultMarketIndexResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketIndexCalendar"></a>
# **getVaultMarketIndexCalendar**
> GetVaultMarketIndexCalendarResponse getVaultMarketIndexCalendar()

The next four quarterly reviews: reference day (2nd Friday of Mar/Jun/Sep/Dec), announcement day, last close under the old membership and the effective day; June and December also review the Blue-chip 50.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketIndexCalendarResponse = apiInstance.getVaultMarketIndexCalendar()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketIndexCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketIndexCalendar")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketIndexCalendarResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketIndexConsultation"></a>
# **getVaultMarketIndexConsultation**
> ListVaultMarketIndexConsultationsItem getVaultMarketIndexConsultation(id)

One consultation with its proposal, versions, dates, outcome and the public comments.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketIndexConsultationsItem = apiInstance.getVaultMarketIndexConsultation(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketIndexConsultation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketIndexConsultation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketIndexConsultationsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketIndexFeed"></a>
# **getVaultMarketIndexFeed**
> GetVaultMarketIndexFeedResponse getVaultMarketIndexFeed(slug)

The licensed index feed for one built-in index (needs VAULT_INDEX_DCM + VAULT_INDEX_FEED_SECRET): the level now (intraday from A/B marks, or the last close below 50% constituent coverage), the last close, the frozen 7-day TWAP settlement value and every constituent with its mark source, quality and trade count. Signed: &#x60;x-crossly-signature: t&#x3D;&lt;ms&gt;,v1&#x3D;&lt;hex HMAC-SHA256(secret, t + \&quot;.\&quot; + body)&gt;&#x60;. Every read is logged for the licence. Crossly is the licensor and data feed only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetVaultMarketIndexFeedResponse = apiInstance.getVaultMarketIndexFeed(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketIndexFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketIndexFeed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetVaultMarketIndexFeedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketIndexFeedFunding"></a>
# **getVaultMarketIndexFeedFunding**
> GetVaultMarketIndexFeedFundingResponse getVaultMarketIndexFeedFunding(slug)

Reference funding for a perpetual-style future on the index: your premium &#x60;premiumBps&#x60; (TWAP of (impact mid - index)/index) through F &#x3D; P + clamp(I - P, ±0.05%) per 8 h, |F| capped at 0.5%/day, with the index level it is relative to. The partner DCM computes and settles funding; this is the reference math.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetVaultMarketIndexFeedFundingResponse = apiInstance.getVaultMarketIndexFeedFunding(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketIndexFeedFunding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketIndexFeedFunding")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetVaultMarketIndexFeedFundingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketIndexFeedSettlement"></a>
# **getVaultMarketIndexFeedSettlement**
> GetVaultMarketIndexFeedSettlementResponse getVaultMarketIndexFeedSettlement(slug)

The frozen 7-day TWAP settlement series for a licensed index (written once a day, never restated), with the closes behind each value. Signed like the feed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetVaultMarketIndexFeedSettlementResponse = apiInstance.getVaultMarketIndexFeedSettlement(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketIndexFeedSettlement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketIndexFeedSettlement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetVaultMarketIndexFeedSettlementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketIndexLevel"></a>
# **getVaultMarketIndexLevel**
> GetVaultMarketIndexLevelResponse getVaultMarketIndexLevel(slug)

An index&#39;s daily closes (up to 5 years), oldest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetVaultMarketIndexLevelResponse = apiInstance.getVaultMarketIndexLevel(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketIndexLevel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketIndexLevel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetVaultMarketIndexLevelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketIndexLicenceUsage"></a>
# **getVaultMarketIndexLicenceUsage**
> GetVaultMarketIndexLicenceUsageResponse getVaultMarketIndexLicenceUsage()

Your licensed index feed reads over &#x60;days&#x60;, per index and endpoint (licence-usage report).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketIndexLicenceUsageResponse = apiInstance.getVaultMarketIndexLicenceUsage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketIndexLicenceUsage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketIndexLicenceUsage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketIndexLicenceUsageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketIndexMethodology"></a>
# **getVaultMarketIndexMethodology**
> GetVaultMarketIndexMethodologyResponse getVaultMarketIndexMethodology()

The index method in machine-readable form: version (semver), inputs, weightings and caps, the family and its screens, the engines and their publication gate, revisions and the settlement series, the calendar, governance and limitations.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketIndexMethodologyResponse = apiInstance.getVaultMarketIndexMethodology()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketIndexMethodology")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketIndexMethodology")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketIndexMethodologyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketInstantExit"></a>
# **getVaultMarketInstantExit**
> GetVaultMarketInstantExitResponse getVaultMarketInstantExit()

The Instant Exit quote for one vault unit you hold: the best resting bid on its book key (anyone&#39;s, dealers&#39; included), its share of the mark, the bid depth, and whether it can be taken now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketInstantExitResponse = apiInstance.getVaultMarketInstantExit()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketInstantExit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketInstantExit")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketInstantExitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketJoint"></a>
# **getVaultMarketJoint**
> GetVaultMarketJointResponse getVaultMarketJoint()

Your joint vaults and the invitations waiting for you, with the gate (open, missing env), the joint terms in words and what each right allows. A JointVaultsHome object, not a collection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketJointResponse = apiInstance.getVaultMarketJoint()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketJoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketJoint")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketJointResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketJointById"></a>
# **getVaultMarketJointById**
> GetVaultMarketJointByIdResponse getVaultMarketJointById(id)

One joint vault (active members only): members and rights, the units in it at the mark with each owner of record, totals, recent joint trades, and the activity from the audit trail.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketJointByIdResponse = apiInstance.getVaultMarketJointById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketJointById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketJointById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketJointByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketKeyStat"></a>
# **getVaultMarketKeyStat**
> GetVaultMarketKeyStatResponse getVaultMarketKeyStat(bookKey)

Everything derived about one book key in one read: the Crossly Estimate, the liquidity score, risk statistics and the gem rate. A part that cannot be read is &#x60;{ error }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val bookKey : kotlin.String = bookKey_example // kotlin.String | 
try {
    val result : GetVaultMarketKeyStatResponse = apiInstance.getVaultMarketKeyStat(bookKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketKeyStat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketKeyStat")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookKey** | **kotlin.String**|  |

### Return type

**GetVaultMarketKeyStatResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketLearn"></a>
# **getVaultMarketLearn**
> GetVaultMarketLearnResponse getVaultMarketLearn()

The Learn hub: each concept with whether you passed its quiz. Passing earns cosmetic pins only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketLearnResponse = apiInstance.getVaultMarketLearn()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketLearn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketLearn")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketLearnResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketLearnByConcept"></a>
# **getVaultMarketLearnByConcept**
> GetVaultMarketLearnByConceptResponse getVaultMarketLearnByConcept(concept)

One Learn concept: its sections and quiz questions (no answers).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val concept : kotlin.String = concept_example // kotlin.String | 
try {
    val result : GetVaultMarketLearnByConceptResponse = apiInstance.getVaultMarketLearnByConcept(concept)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketLearnByConcept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketLearnByConcept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **concept** | **kotlin.String**|  |

### Return type

**GetVaultMarketLearnByConceptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketLendingElection"></a>
# **getVaultMarketLendingElection**
> GetVaultMarketLendingElectionResponse getVaultMarketLendingElection()

Your lender election: &#x60;returnInKind&#x60; (shorts post 175% collateral, a 14-day buy-in, never cash-settled) and &#x60;allowTerm&#x60; (your units may go out on 30/90-day fixed-rate term loans, not recallable before term).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketLendingElectionResponse = apiInstance.getVaultMarketLendingElection()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketLendingElection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketLendingElection")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketLendingElectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketLendingProgramme"></a>
# **getVaultMarketLendingProgramme**
> GetVaultMarketLendingProgrammeResponse getVaultMarketLendingProgramme()

Your lender programme report: lendable units, units out, utilisation, fee revenue (accrued / paid), term loans and return-in-kind loans in force, and each loan&#39;s rate against the key&#39;s rate today.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketLendingProgrammeResponse = apiInstance.getVaultMarketLendingProgramme()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketLendingProgramme")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketLendingProgramme")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketLendingProgrammeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketLendingStatement"></a>
# **getVaultMarketLendingStatement**
> GetVaultMarketLendingStatementResponse getVaultMarketLendingStatement()

Your daily collateral statement as a lender (today live, or &#x60;day&#x60;): per open loan the mark and its quality, fees owed to you, the short&#39;s collateral share at the custodian and its coverage against 105% of mark + fees. A unit without a mark usable for risk shows no coverage number.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketLendingStatementResponse = apiInstance.getVaultMarketLendingStatement()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketLendingStatement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketLendingStatement")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketLendingStatementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketLiquidity"></a>
# **getVaultMarketLiquidity**
> GetVaultMarketLiquidityResponse getVaultMarketLiquidity(bookKey)

The liquidity score (0-100) of a book key and every component behind it: trades in 30/90 days, distinct counterparties, median days between trades, time-weighted quoted spread, two-sided share and depth within 5% (hourly book snapshots), Amihud and Roll. Each component is a percentile within the category. No score under the data threshold.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val bookKey : kotlin.String = bookKey_example // kotlin.String | 
try {
    val result : GetVaultMarketLiquidityResponse = apiInstance.getVaultMarketLiquidity(bookKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketLiquidity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketLiquidity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookKey** | **kotlin.String**|  |

### Return type

**GetVaultMarketLiquidityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketLoanQuote"></a>
# **getVaultMarketLoanQuote**
> GetVaultMarketLoanQuoteResponse getVaultMarketLoanQuote()

How much you can borrow against vault units (&#x60;vaultItemIds&#x60;, comma-separated; none &#x3D; every stored unit you hold): each unit&#39;s tier, mark and limit, the pool&#39;s rate and yours.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketLoanQuoteResponse = apiInstance.getVaultMarketLoanQuote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketLoanQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketLoanQuote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketLoanQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketLoanUnitSaleFloor"></a>
# **getVaultMarketLoanUnitSaleFloor**
> GetVaultMarketLoanUnitSaleFloorResponse getVaultMarketLoanUnitSaleFloor(id, vaultItemId)

The lowest price a pledged unit can be sold at to repay its loan: after the sale (less the vault fee and storage) what is still owed must fit inside the other units&#39; limit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val vaultItemId : kotlin.String = vaultItemId_example // kotlin.String | 
try {
    val result : GetVaultMarketLoanUnitSaleFloorResponse = apiInstance.getVaultMarketLoanUnitSaleFloor(id, vaultItemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketLoanUnitSaleFloor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketLoanUnitSaleFloor")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **vaultItemId** | **kotlin.String**|  |

### Return type

**GetVaultMarketLoanUnitSaleFloorResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketLocate"></a>
# **getVaultMarketLocate**
> GetVaultMarketLocateResponse getVaultMarketLocate()

A locate quote: how many units of &#x60;key&#x60; (a book key) you could borrow now (up to &#x60;qty&#x60;), the indicative rate (APR bps; &#x60;termDays&#x60; 30 or 90 for a fixed-rate term loan), and the collateral they need (150%, or 175% for units whose lenders elected return in kind only). Holds nothing; POST to hold.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketLocateResponse = apiInstance.getVaultMarketLocate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketLocate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketLocate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketLocateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketMark"></a>
# **getVaultMarketMark**
> GetVaultMarketMarkResponse getVaultMarketMark(bookKey)

One book key mark with everything behind it: the price in cents, its quality (A trade-anchored, B firm two-sided, C indicative, none), its confidence in bps and the band in cents, when it was computed, whether risk may act on it (judged for margin), the related key it was implied from (impliedFrom: a grade, the model median of the other sizes, or an index; null when none), every stored input, and the learned relations it may be implied from.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val bookKey : kotlin.String = bookKey_example // kotlin.String | 
try {
    val result : GetVaultMarketMarkResponse = apiInstance.getVaultMarketMark(bookKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketMark")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketMark")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookKey** | **kotlin.String**|  |

### Return type

**GetVaultMarketMarkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketMarket"></a>
# **getVaultMarketMarket**
> GetVaultMarketMarketResponse getVaultMarketMarket()

One book key (variantId:condition:gradeKey): its mark and history, lending depth and borrow rate, open interest and live auctions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketMarketResponse = apiInstance.getVaultMarketMarket()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketMarket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketMarket")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketMarketResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketMarketModel"></a>
# **getVaultMarketMarketModel**
> GetVaultMarketMarketModelResponse getVaultMarketMarketModel(bookKey)

How a book key trades: its liquidity tier (A continuous, B call auction every 15 minutes, C daily call, D listings only), the call collecting now with its indicative price and volume and nominal close, the next call, the LULD band and any limit state, pause or halt.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val bookKey : kotlin.String = bookKey_example // kotlin.String | 
try {
    val result : GetVaultMarketMarketModelResponse = apiInstance.getVaultMarketMarketModel(bookKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketMarketModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketMarketModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookKey** | **kotlin.String**|  |

### Return type

**GetVaultMarketMarketModelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketMm"></a>
# **getVaultMarketMm**
> GetVaultMarketMmResponse getVaultMarketMm()

Your market-maker programmes, the last 30 days of obligations, rebates earned (paid only from fees already taken), and the rules.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketMmResponse = apiInstance.getVaultMarketMm()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketMm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketMm")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketMmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketMmKey"></a>
# **getVaultMarketMmKey**
> GetVaultMarketMmKeyResponse getVaultMarketMmKey()

A key&#39;s designated market maker (by the name it chose) and how many LPs quote it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketMmKeyResponse = apiInstance.getVaultMarketMmKey()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketMmKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketMmKey")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketMmKeyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketMmMmp"></a>
# **getVaultMarketMmMmp**
> GetVaultMarketMmMmpResponse getVaultMarketMmMmp()

Your market-maker protection: the fill trigger, the freeze, and whether you are frozen now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketMmMmpResponse = apiInstance.getVaultMarketMmMmp()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketMmMmp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketMmMmp")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketMmMmpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketMode"></a>
# **getVaultMarketMode**
> GetVaultMarketModeResponse getVaultMarketMode()

Your Vault Markets mode: simple (buy, sell and what it is worth) or pro (the full terminal), whether you chose it or it was set for you (new people start in simple; people already trading start in pro), and when.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketModeResponse = apiInstance.getVaultMarketMode()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketMode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketMode")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketModeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketNav"></a>
# **getVaultMarketNav**
> GetVaultMarketNavResponse getVaultMarketNav()

Mark NAV, bid NAV (the resting bids) and liquidation NAV (the bids at 20% of ADV for 10 days), holding by holding, each with its ASC 820 level, mark quality and source, and your administrator&#39;s price when uploaded.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketNavResponse = apiInstance.getVaultMarketNav()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketNav")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketNav")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketNavResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketNavFile"></a>
# **getVaultMarketNavFile**
> kotlin.String getVaultMarketNavFile(format)

The NAV as a csv, pdf or json file.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val format : kotlin.String = format_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getVaultMarketNavFile(format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketNavFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketNavFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketOpening"></a>
# **getVaultMarketOpening**
> ListVaultMarketOpeningItem getVaultMarketOpening(slug)

One opening key.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListVaultMarketOpeningItem = apiInstance.getVaultMarketOpening(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketOpening")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketOpening")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListVaultMarketOpeningItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketOracle"></a>
# **getVaultMarketOracle**
> GetVaultMarketOracleResponse getVaultMarketOracle()

Crossly as an oracle publisher (needs CROSSLY_ORACLE_PUBLISHER_KEY + CROSSLY_ORACLE_NETWORK): the network (pyth or switchboard), the ed25519 key every value is signed with, each published index feed with its latest attempt, and 24 h counts of published, skipped and failed. Only built-in indexes priced from A/B marks are published; Crossly never reads its own feed back.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketOracleResponse = apiInstance.getVaultMarketOracle()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketOracle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketOracle")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketOracleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketOracleBySlug"></a>
# **getVaultMarketOracleBySlug**
> GetVaultMarketOracleBySlugResponse getVaultMarketOracleBySlug(slug)

The latest published oracle value for an index: level, fixed-point price and confidence at the feed exponent, confidence in bps, staleness in seconds, coverage, the exact signed message and its ed25519 signature with the signer key, and whether it is fresh.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetVaultMarketOracleBySlugResponse = apiInstance.getVaultMarketOracleBySlug(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketOracleBySlug")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketOracleBySlug")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetVaultMarketOracleBySlugResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketOrderHandling"></a>
# **getVaultMarketOrderHandling**
> GetVaultMarketOrderHandlingResponse getVaultMarketOrderHandling()

How orders are handled (the 606/607-style disclosure): one book, self-trade prevention, protected market orders, liquidations by auction, halts, dealers and fees.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketOrderHandlingResponse = apiInstance.getVaultMarketOrderHandling()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketOrderHandling")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketOrderHandling")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketOrderHandlingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketP2pDashboard"></a>
# **getVaultMarketP2pDashboard**
> GetVaultMarketP2pDashboardResponse getVaultMarketP2pDashboard()

Peer-to-peer vault loans at a glance: what you owe as a borrower and are owed as a lender (principal + interest to the second), daily interest, called loans, your open offers, the gates and the rules (auction hours, rate ceiling, size bounds, call grace).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketP2pDashboardResponse = apiInstance.getVaultMarketP2pDashboard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketP2pDashboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketP2pDashboard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketP2pDashboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketP2pLoan"></a>
# **getVaultMarketP2pLoan**
> GetVaultMarketP2pLoanResponse getVaultMarketP2pLoan(id)

One P2P loan with its money log (fund, repay, refinance). A loan in a running refinancing auction can be read by any lender, without the log.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketP2pLoanResponse = apiInstance.getVaultMarketP2pLoan(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketP2pLoan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketP2pLoan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketP2pLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPaper"></a>
# **getVaultMarketPaper**
> GetVaultMarketPaperResponse getVaultMarketPaper()

Your paper trading account (play money only, never real or convertible; opened at $10,000 the first time): play cash, buying power, paper positions at the real marks, P&amp;L, working paper orders, recent paper fills and this week on the leaderboard.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketPaperResponse = apiInstance.getVaultMarketPaper()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPaper")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPaper")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketPaperResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPaperQuote"></a>
# **getVaultMarketPaperQuote**
> GetVaultMarketPaperQuoteResponse getVaultMarketPaperQuote()

What a paper order would fill against the real book now, without placing it: units fillable inside the limit (a market order uses the 5% protection band around the mark), average price, simulated fee, and the queue ahead of any rest.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketPaperQuoteResponse = apiInstance.getVaultMarketPaperQuote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPaperQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPaperQuote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketPaperQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPartnerMe"></a>
# **getVaultMarketPartnerMe**
> GetVaultMarketPartnerMeResponse getVaultMarketPartnerMe()

Your Vault Drop-off Partnership (null when you never applied): status, partner code, fee share and cap, totals and batches.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketPartnerMeResponse = apiInstance.getVaultMarketPartnerMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPartnerMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPartnerMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketPartnerMeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPool"></a>
# **getVaultMarketPool**
> GetVaultMarketPoolResponse getVaultMarketPool()

The CBX market staking pool: size, value, what it lends, utilisation, rate, insurance fund.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketPoolResponse = apiInstance.getVaultMarketPool()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPool")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketPoolResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPopReport"></a>
# **getVaultMarketPopReport**
> GetVaultMarketPopReportResponse getVaultMarketPopReport(bookKey)

Grading population report for one market (&#x60;bookKey&#x60;): focus (on a graded market: its grade, pop &#x3D; copies graded at exactly that grade, higher &#x3D; copies graded better by the same grader, total, asOf and source), graders (each grader ladder for the card, best grade first, from one report: the newest, the population feed over a hand entry on the same date), provider.connected, and status (ok, not_synced, no_report or no_source) with explain, which says in plain words what is missing. source is provider (the population feed) or ops (entered by Crossly from the grader published report). Counts only, never a price.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val bookKey : kotlin.String = bookKey_example // kotlin.String | variantId:condition:gradeKey, grade \"-\" when ungraded.
try {
    val result : GetVaultMarketPopReportResponse = apiInstance.getVaultMarketPopReport(bookKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPopReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPopReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookKey** | **kotlin.String**| variantId:condition:gradeKey, grade \&quot;-\&quot; when ungraded. |

### Return type

**GetVaultMarketPopReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPortfolio"></a>
# **getVaultMarketPortfolio**
> GetVaultMarketPortfolioResponse getVaultMarketPortfolio()

Your vault holdings at the market price, with cost and P&amp;L, and units you have out on loan.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketPortfolioResponse = apiInstance.getVaultMarketPortfolio()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPortfolio")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPortfolio")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketPortfolioResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPortfolioHistory"></a>
# **getVaultMarketPortfolioHistory**
> GetVaultMarketPortfolioHistoryResponse getVaultMarketPortfolioHistory()

Your Vault Markets value by day at the marks (vault units, units on loan, positions) and today&#39;s return against yesterday&#39;s close.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketPortfolioHistoryResponse = apiInstance.getVaultMarketPortfolioHistory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPortfolioHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPortfolioHistory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketPortfolioHistoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPortfolioMargin"></a>
# **getVaultMarketPortfolioMargin**
> GetVaultMarketPortfolioMarginResponse getVaultMarketPortfolioMargin()

Portfolio margin for a firm sub-account (&#x60;subaccountId&#x60;): eligibility with every reason (ECP, KYB, minimum equity $500k or $100k with evidenced intraday monitoring), whether it is enrolled, the latest requirement, equity, excess and state (healthy, call or buy_in), the breakdown by category and item, the partner index futures counted, and the policy. Before enrolling, a live preview.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketPortfolioMarginResponse = apiInstance.getVaultMarketPortfolioMargin()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPortfolioMargin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPortfolioMargin")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketPortfolioMarginResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPosition"></a>
# **getVaultMarketPosition**
> GetVaultMarketPositionResponse getVaultMarketPosition(id)

One position with its loans, auctions and custodian instruction log.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketPositionResponse = apiInstance.getVaultMarketPosition(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPosition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPosition")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketPositionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPositionExit"></a>
# **getVaultMarketPositionExit**
> GetVaultMarketPositionExitResponse getVaultMarketPositionExit(id)

A position&#39;s take-profit / stop-loss, if set.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketPositionExitResponse = apiInstance.getVaultMarketPositionExit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPositionExit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPositionExit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketPositionExitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPositionRisk"></a>
# **getVaultMarketPositionRisk**
> ListVaultMarketPositionsRiskItem getVaultMarketPositionRisk(id)

One position&#39;s call and liquidation marks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketPositionsRiskItem = apiInstance.getVaultMarketPositionRisk(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPositionRisk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPositionRisk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketPositionsRiskItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPress"></a>
# **getVaultMarketPress**
> GetVaultMarketPressResponse getVaultMarketPress()

The press kit: each built-in index with level, quality, n, CSV link and a \&quot;cite as\&quot; line, plus the methodology links.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketPressResponse = apiInstance.getVaultMarketPress()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPress")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketPressResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketPriceWidget"></a>
# **getVaultMarketPriceWidget**
> ListVaultMarketPriceWidgetsItem getVaultMarketPriceWidget(id)

One of your price widgets, with its iframe and script-tag snippets and URLs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketPriceWidgetsItem = apiInstance.getVaultMarketPriceWidget(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketPriceWidget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketPriceWidget")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketPriceWidgetsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketProDepth"></a>
# **getVaultMarketProDepth**
> GetVaultMarketProDepthResponse getVaultMarketProDepth()

The L2 depth ladder: price levels and units per side, best first; asks show how many units are authenticated vault stock.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketProDepthResponse = apiInstance.getVaultMarketProDepth()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketProDepth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketProDepth")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketProDepthResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketProOrder"></a>
# **getVaultMarketProOrder**
> GetVaultMarketProOrderResponse getVaultMarketProOrder(id)

One order with its full event log.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketProOrderResponse = apiInstance.getVaultMarketProOrder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketProOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketProOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketProOrderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketProSnapshot"></a>
# **getVaultMarketProSnapshot**
> GetVaultMarketProSnapshotResponse getVaultMarketProSnapshot()

A book key&#39;s depth (20 levels a side), last 50 trades, 24 h stats, mark and any halt, in one call.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketProSnapshotResponse = apiInstance.getVaultMarketProSnapshot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketProSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketProSnapshot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketProSnapshotResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketProStat"></a>
# **getVaultMarketProStat**
> GetVaultMarketProStatResponse getVaultMarketProStat()

24 h open, high, low, last, volume and change on a book key.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketProStatResponse = apiInstance.getVaultMarketProStat()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketProStat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketProStat")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketProStatResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketProStream"></a>
# **getVaultMarketProStream**
> kotlin.String getVaultMarketProStream()

A long-lived text/event-stream for a book key: &#x60;snapshot&#x60; first, then &#x60;depth&#x60;, &#x60;trades&#x60;, &#x60;mark&#x60; and &#x60;halt&#x60; events as they change.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : kotlin.String = apiInstance.getVaultMarketProStream()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketProStream")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketProStream")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketProfile"></a>
# **getVaultMarketProfile**
> GetVaultMarketProfileResponse getVaultMarketProfile()

Your public vault profile switch: on or off, whether followers see new buys, your profile URL and follower count.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketProfileResponse = apiInstance.getVaultMarketProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketProfileByHandle"></a>
# **getVaultMarketProfileByHandle**
> GetVaultMarketProfileByHandleResponse getVaultMarketProfileByHandle(handle)

Someone&#39;s public vault: each market&#39;s weight (bps of the marked value), followers, whether you follow, their recent buys (no prices).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : GetVaultMarketProfileByHandleResponse = apiInstance.getVaultMarketProfileByHandle(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketProfileByHandle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketProfileByHandle")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**GetVaultMarketProfileByHandleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketProofOfReserve"></a>
# **getVaultMarketProofOfReserve**
> GetVaultMarketProofOfReserveResponse getVaultMarketProofOfReserve()

Proof of reserves: the latest daily Merkle root over every unit in custody (leaf count, stored / listed / grading / withdrawing, pledged, on loan, open loans, receipts, insured value), its Solana memo anchor when VAULT_POR_ANCHOR_KEY is set, the last &#x60;days&#x60; roots, and the exact hashing method.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketProofOfReserveResponse = apiInstance.getVaultMarketProofOfReserve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketProofOfReserve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketProofOfReserve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketProofOfReserveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketProofOfReserveByDay"></a>
# **getVaultMarketProofOfReserveByDay**
> GetVaultMarketProofOfReserveByDayResponse getVaultMarketProofOfReserveByDay(day)

One day&#39;s proof-of-reserves snapshot (root, counts, anchor).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val day : kotlin.String = day_example // kotlin.String | 
try {
    val result : GetVaultMarketProofOfReserveByDayResponse = apiInstance.getVaultMarketProofOfReserveByDay(day)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketProofOfReserveByDay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketProofOfReserveByDay")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **day** | **kotlin.String**|  |

### Return type

**GetVaultMarketProofOfReserveByDayResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketProofOfReserveMe"></a>
# **getVaultMarketProofOfReserveMe**
> GetVaultMarketProofOfReserveMeResponse getVaultMarketProofOfReserveMe()

Your inclusion proofs for a day (latest by default): each of your units&#39; leaf fields, salt, owner commitment, leaf hash and sibling path. Verify with your OWN user id: commitment &#x3D; SHA-256(JSON[\&quot;crossly-por-owner-v1\&quot;, userId, salt]); then the leaf; then climb the path to the published root.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketProofOfReserveMeResponse = apiInstance.getVaultMarketProofOfReserveMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketProofOfReserveMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketProofOfReserveMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketProofOfReserveMeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketRate"></a>
# **getVaultMarketRate**
> GetVaultMarketRateResponse getVaultMarketRate()

Daily borrow APR (lent units) and pool APR on a book key, with the pool as a whole, oldest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketRateResponse = apiInstance.getVaultMarketRate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketRate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketRateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketReport"></a>
# **getVaultMarketReport**
> GetVaultMarketReportResponse getVaultMarketReport()

The quarterly Crossly Vault Report (&#x60;quarter&#x60; like 2026-q3; default the latest): index levels, top movers, most-lent markets, grade premiums. Book data only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketReportResponse = apiInstance.getVaultMarketReport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketReport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketRfq"></a>
# **getVaultMarketRfq**
> GetVaultMarketRfqResponse getVaultMarketRfq(id)

One quote request: the requester sees every answer (anonymous); a responder sees the request and their own answer.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketRfqResponse = apiInstance.getVaultMarketRfq(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketRfq")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketRfq")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketRfqResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketRiskReport"></a>
# **getVaultMarketRiskReport**
> GetVaultMarketRiskReportResponse getVaultMarketRiskReport()

Historical VaR 95/99 1d/10d and Bangia LVaR (model figures: labelled, with n and a band, null below the data threshold), stress scenarios (category −30%, CBX −50%, books thin to 25%, index drawdowns), concentration and counterparty exposure.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketRiskReportResponse = apiInstance.getVaultMarketRiskReport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketRiskReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketRiskReport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketRiskReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketRiskStat"></a>
# **getVaultMarketRiskStat**
> GetVaultMarketRiskStatResponse getVaultMarketRiskStat(bookKey)

Risk statistics for a book key (weekly returns from A-quality marks only) or an index slug (its closes): annualised volatility raw and Geltner-desmoothed (labelled), max drawdown and beta to the Composite. Needs 26 weekly returns, else no numbers.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val bookKey : kotlin.String = bookKey_example // kotlin.String | 
try {
    val result : GetVaultMarketRiskStatResponse = apiInstance.getVaultMarketRiskStat(bookKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketRiskStat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketRiskStat")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookKey** | **kotlin.String**|  |

### Return type

**GetVaultMarketRiskStatResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketSetGoal"></a>
# **getVaultMarketSetGoal**
> GetVaultMarketSetGoalResponse getVaultMarketSetGoal(id)

One set goal: every piece in the set order, held (with the vault unit) or missing (with the cheapest marked book key that meets the target and its mark), the conditions and grades seen, and the working basket bid with its legs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketSetGoalResponse = apiInstance.getVaultMarketSetGoal(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketSetGoal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketSetGoal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketSetGoalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketSetGoalBasketPlan"></a>
# **getVaultMarketSetGoalBasketPlan**
> GetVaultMarketSetGoalBasketPlanResponse getVaultMarketSetGoalBasketPlan(id)

What a basket bid would place now, without placing it: one leg per missing piece (cheapest first, the mark plus maxBpsOverMark as the limit), the pieces skipped and why, and the most it can cost (limits plus the worst-case buyer fee), never more than budgetCents.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketSetGoalBasketPlanResponse = apiInstance.getVaultMarketSetGoalBasketPlan(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketSetGoalBasketPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketSetGoalBasketPlan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketSetGoalBasketPlanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketShareCard"></a>
# **getVaultMarketShareCard**
> ListVaultMarketShareCardsItem getVaultMarketShareCard(id)

One share card as the public sees it, with its image and link paths.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListVaultMarketShareCardsItem = apiInstance.getVaultMarketShareCard(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketShareCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketShareCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListVaultMarketShareCardsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketStatement"></a>
# **getVaultMarketStatement**
> GetVaultMarketStatementResponse getVaultMarketStatement()

The last 24 months with whether each statement is issued (frozen, with its sha256).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketStatementResponse = apiInstance.getVaultMarketStatement()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketStatement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketStatement")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketStatementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketStatementByMonth"></a>
# **getVaultMarketStatementByMonth**
> GetVaultMarketStatementByMonthResponse getVaultMarketStatementByMonth(month)

A monthly statement (&#x60;month&#x60; like 2026-10): units held at month end, loans, pledges, positions, fills, fees, storage, and cash quoted from the custodian and labelled as its record. Issued (frozen) once the month ends.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val month : kotlin.String = month_example // kotlin.String | 
try {
    val result : GetVaultMarketStatementByMonthResponse = apiInstance.getVaultMarketStatementByMonth(month)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketStatementByMonth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketStatementByMonth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **month** | **kotlin.String**|  |

### Return type

**GetVaultMarketStatementByMonthResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketStatementFile"></a>
# **getVaultMarketStatementFile**
> kotlin.String getVaultMarketStatementFile(month, format)

A monthly statement as a csv, pdf or json file.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val month : kotlin.String = month_example // kotlin.String | 
val format : kotlin.String = format_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getVaultMarketStatementFile(month, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketStatementFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketStatementFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **month** | **kotlin.String**|  |
 **format** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketSupply"></a>
# **getVaultMarketSupply**
> GetVaultMarketSupplyResponse getVaultMarketSupply()

A book key&#39;s units in the vault and authentications passed, by day (oldest first, today live).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketSupplyResponse = apiInstance.getVaultMarketSupply()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketSupply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketSupply")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketSupplyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketSupplyBatch"></a>
# **getVaultMarketSupplyBatch**
> GetVaultMarketSupplyBatchResponse getVaultMarketSupplyBatch(id)

A box sent to the vault: its prepaid label and tracking, or why it has no label.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketSupplyBatchResponse = apiInstance.getVaultMarketSupplyBatch(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketSupplyBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketSupplyBatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketSupplyBatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketSupplyRoundUp"></a>
# **getVaultMarketSupplyRoundUp**
> GetVaultMarketSupplyRoundUpResponse getVaultMarketSupplyRoundUp()

Your seller round-up: the share of each payout that sets a vault buy&#39;s budget, the budget so far and what it is doing. &#x60;roundUp&#x60; is null when none is set.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketSupplyRoundUpResponse = apiInstance.getVaultMarketSupplyRoundUp()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketSupplyRoundUp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketSupplyRoundUp")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketSupplyRoundUpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketTax"></a>
# **getVaultMarketTax**
> GetVaultMarketTaxResponse getVaultMarketTax()

Your tax year on the vault markets: units bought and sold with cost, proceeds, gain and term; lending fees, staking interest (estimate), market-maker rewards; closed positions. Links to the CSV and PDF.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketTaxResponse = apiInstance.getVaultMarketTax()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketTax")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketTaxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketTaxCsv"></a>
# **getVaultMarketTaxCsv**
> kotlin.String getVaultMarketTaxCsv()

The tax year as a CSV: one row per sale, purchase, gift, income line and closed position.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : kotlin.String = apiInstance.getVaultMarketTaxCsv()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketTaxCsv")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketTaxCsv")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketTaxLossSuggestion"></a>
# **getVaultMarketTaxLossSuggestion**
> GetVaultMarketTaxLossSuggestionResponse getVaultMarketTaxLossSuggestion()

Tax-loss suggestions: the units you hold whose mark is below your cost, each with its lot (acquired when and how, cost in cents), short or long term if sold today and the day a short lot turns long, the estimated loss at the mark before selling fees, mark quality, what stops a sale, and a link to the ordinary sell ticket. With totals by term, the gains realised so far this year, and a not-tax-advice disclosure. Never sells.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketTaxLossSuggestionResponse = apiInstance.getVaultMarketTaxLossSuggestion()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketTaxLossSuggestion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketTaxLossSuggestion")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketTaxLossSuggestionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketTaxPdf"></a>
# **getVaultMarketTaxPdf**
> java.io.File getVaultMarketTaxPdf()

The tax year as a PDF summary.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : java.io.File = apiInstance.getVaultMarketTaxPdf()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketTaxPdf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketTaxPdf")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**java.io.File**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketTca"></a>
# **getVaultMarketTca**
> GetVaultMarketTcaResponse getVaultMarketTca()

Your pro orders in a window (&#x60;from&#x60;, &#x60;to&#x60;; default 90 days) with arrival mark and mid, average fill, implementation shortfall, slippage, fill rate and time to fill.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketTcaResponse = apiInstance.getVaultMarketTca()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketTca")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketTca")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketTcaResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketTcaByOrderId"></a>
# **getVaultMarketTcaByOrderId**
> GetVaultMarketTcaByOrderIdResponse getVaultMarketTcaByOrderId(orderId)

One order&#39;s TCA, including slippage against the VWAP of eligible trades while it worked.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val orderId : kotlin.String = orderId_example // kotlin.String | 
try {
    val result : GetVaultMarketTcaByOrderIdResponse = apiInstance.getVaultMarketTcaByOrderId(orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketTcaByOrderId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketTcaByOrderId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **kotlin.String**|  |

### Return type

**GetVaultMarketTcaByOrderIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketTod"></a>
# **getVaultMarketTod**
> GetVaultMarketTodResponse getVaultMarketTod()

Your transfer-on-death setup: the gate and terms, whether you accepted them, your beneficiaries and shares, units with their designations and who the plan gives them to today, and open claims on your account (which you can stop). A TodOverview object, not a collection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketTodResponse = apiInstance.getVaultMarketTod()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketTod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketTod")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketTodResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketTodMyClaim"></a>
# **getVaultMarketTodMyClaim**
> GetVaultMarketTodMyClaimResponse getVaultMarketTodMyClaim()

Claims you filed as a beneficiary: status in words, documents sent (names only), the waiting period, and units moved or held. A TodMyClaims object, not a collection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketTodMyClaimResponse = apiInstance.getVaultMarketTodMyClaim()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketTodMyClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketTodMyClaim")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketTodMyClaimResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketUnitAr"></a>
# **getVaultMarketUnitAr**
> GetVaultMarketUnitArResponse getVaultMarketUnitAr(id)

A vault unit as an AR model, for \&quot;See it in your room\&quot; (the web&#39;s /ar/vault-&lt;id&gt; page hands it to Scene Viewer, WebXR or Quick Look): title, model (a path under /models, without .glb, at real size), scanUrl (the unit&#39;s own captured mesh, when it has one), imageUrl, art, tint, scale, bookKey, backPath and mine. Your own units always; somebody else&#39;s only while they show it to visitors in a home you may enter (else 404).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetVaultMarketUnitArResponse = apiInstance.getVaultMarketUnitAr(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketUnitAr")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketUnitAr")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetVaultMarketUnitArResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketUnitEvidence"></a>
# **getVaultMarketUnitEvidence**
> GetVaultMarketUnitEvidenceResponse getVaultMarketUnitEvidence(id)

Evidence on a vault unit:its 3D scans (model, texture, listing photos) and its grade report (grader, grade, cert, verified against the grader record, hub intake photos). No owner identity.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketUnitEvidenceResponse = apiInstance.getVaultMarketUnitEvidence(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketUnitEvidence")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketUnitEvidence")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketUnitEvidenceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketUnitQuote"></a>
# **getVaultMarketUnitQuote**
> GetVaultMarketUnitQuoteResponse getVaultMarketUnitQuote(id)

The market around a vault unit: its mark and source, the best bid that could take it, the Instant Exit price (the best bid) and a pack pull&#39;s own sell-back credit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketUnitQuoteResponse = apiInstance.getVaultMarketUnitQuote(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketUnitQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketUnitQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketUnitQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketUnitStory"></a>
# **getVaultMarketUnitStory**
> GetVaultMarketUnitStoryResponse getVaultMarketUnitStory(id)

One vault unit&#39;s story, oldest first: intake (with scan and grade evidence when it has some), grades, owners, sales at their prices, loans, pledges, Hall of Grails exhibitions, receipt-token exports and redemptions, and each warehouse-receipt hash-chain step (re-verified on read: chain.ok). People are named only while their public vault profile is on; others are &#39;A collector&#39;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetVaultMarketUnitStoryResponse = apiInstance.getVaultMarketUnitStory(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketUnitStory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketUnitStory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetVaultMarketUnitStoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketValuationStatement"></a>
# **getVaultMarketValuationStatement**
> GetVaultMarketValuationStatementResponse getVaultMarketValuationStatement(id)

One statement you issued: every unit, the totals by mark quality, the methodology, its sha256, its audit-chain seal and the verify link.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetVaultMarketValuationStatementResponse = apiInstance.getVaultMarketValuationStatement(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketValuationStatement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketValuationStatement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetVaultMarketValuationStatementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketValuationStatementPdf"></a>
# **getVaultMarketValuationStatementPdf**
> java.io.File getVaultMarketValuationStatementPdf(id)

One statement you issued as a PDF.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : java.io.File = apiInstance.getVaultMarketValuationStatementPdf(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketValuationStatementPdf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketValuationStatementPdf")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**java.io.File**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketValuationStatementPreview"></a>
# **getVaultMarketValuationStatementPreview**
> GetVaultMarketValuationStatementPreviewResponse getVaultMarketValuationStatementPreview()

An insurance or appraisal statement for a day (purpose, asOf YYYY-MM-DD, default today), built but not issued: every unit you held that day at its mark, with quality, last trade, grade and cert, and the total. No id, no hash.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketValuationStatementPreviewResponse = apiInstance.getVaultMarketValuationStatementPreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketValuationStatementPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketValuationStatementPreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketValuationStatementPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketValuationStatementVerify"></a>
# **getVaultMarketValuationStatementVerify**
> GetVaultMarketValuationStatementVerifyResponse getVaultMarketValuationStatementVerify(id)

Check any issued statement by its id, as an insurer would: purpose, date, totals by mark quality and the sha256; intact (the stored record still hashes to it), seal.ok (its audit-chain entry still carries it) and, with ?hash&#x3D;, whether yours matches. Never the holder or the units.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetVaultMarketValuationStatementVerifyResponse = apiInstance.getVaultMarketValuationStatementVerify(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketValuationStatementVerify")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketValuationStatementVerify")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetVaultMarketValuationStatementVerifyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketValue"></a>
# **getVaultMarketValue**
> GetVaultMarketValueResponse getVaultMarketValue()

A catalogue item&#39;s vault book keys (&#x60;?skuId&#x3D;&#x60;, optional &#x60;variantId&#x60;): each key&#39;s display mark with quality and n, units in the vault, the Instant Exit price a holder would get now, and whether it can be shipped in (ungraded keys).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketValueResponse = apiInstance.getVaultMarketValue()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketValue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketValue")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketValueResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketVaultSuggestionItem"></a>
# **getVaultMarketVaultSuggestionItem**
> GetVaultMarketVaultSuggestionItemResponse getVaultMarketVaultSuggestionItem(id)

One inventory item: its vault suggestion, or in plain words why there is none (&#x60;status&#x60;: suggested, not_found, no_stock, not_matched, in_vault or no_market).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketVaultSuggestionItemResponse = apiInstance.getVaultMarketVaultSuggestionItem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketVaultSuggestionItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketVaultSuggestionItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketVaultSuggestionItemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketWidgetIndex"></a>
# **getVaultMarketWidgetIndex**
> GetVaultMarketWidgetIndexResponse getVaultMarketWidgetIndex(slug)

What the &lt;crossly-index&gt; widget shows: level, closes, quality, n, as-of, or &#x60;insufficient&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetVaultMarketWidgetIndexResponse = apiInstance.getVaultMarketWidgetIndex(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketWidgetIndex")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketWidgetIndex")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetVaultMarketWidgetIndexResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketWidgetMark"></a>
# **getVaultMarketWidgetMark**
> GetVaultMarketWidgetMarkResponse getVaultMarketWidgetMark()

What the &lt;crossly-mark&gt; widget shows for &#x60;bookKey&#x60;: mark, quality, trades over 30 days, as-of, sparkline, or &#x60;insufficient&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketWidgetMarkResponse = apiInstance.getVaultMarketWidgetMark()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketWidgetMark")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketWidgetMark")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketWidgetMarkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketWidgetSummary"></a>
# **getVaultMarketWidgetSummary**
> GetVaultMarketWidgetSummaryResponse getVaultMarketWidgetSummary()

The home-screen widget summary: portfolio value at the mark with its move since the previous marks (cents and bps) and the share resting on reliable A/B marks, the three biggest movers among what you hold (the market movers when you hold nothing; &#x60;movers.source&#x60; says which), and one watchlist key (&#x60;?key&#x3D;&#x60; a book key on your watchlist; else your newest watch) with a 14-day sparkline. Every price is from the Crossly order book and carries its mark quality (A, B, C or none). Cached for five minutes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketWidgetSummaryResponse = apiInstance.getVaultMarketWidgetSummary()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketWidgetSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketWidgetSummary")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketWidgetSummaryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketWorldFloor"></a>
# **getVaultMarketWorldFloor**
> GetVaultMarketWorldFloorResponse getVaultMarketWorldFloor()

The Trading Floor in Crossly World: trades (the newest trades on every vault book in the last day, at most 40, newest first: bookKey, name, priceCents, priceText, side -- buy when a buyer took an ask, sell when a seller hit a bid, cross for an auction -- and ageS), tickers (the big board: the most-traded markets, each with its last trade price, the change from the last trade before today in basis points, trades today and the display mark with its quality), bell (Market Open: ringing for ten minutes after a new key opens, with the key and its market link, and what opens next) and trades24h. Every price is a trade on the Crossly order book; it never shows who traded. Nothing can be traded in the room.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketWorldFloorResponse = apiInstance.getVaultMarketWorldFloor()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketWorldFloor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketWorldFloor")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketWorldFloorResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketWorldLounge"></a>
# **getVaultMarketWorldLounge**
> GetVaultMarketWorldLoungeResponse getVaultMarketWorldLounge()

The Vault Holders Lounge: the rule to join (held value at reliable marks, or a unit count), whether you may join now and what you hold toward it. Anyone may look in; only holders are seen there. No perks, nothing to trade.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketWorldLoungeResponse = apiInstance.getVaultMarketWorldLounge()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketWorldLounge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketWorldLounge")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketWorldLoungeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketWorldPlaceVaultGate"></a>
# **getVaultMarketWorldPlaceVaultGate**
> GetVaultMarketWorldPlaceVaultGateResponse getVaultMarketWorldPlaceVaultGate(place)

The vault-holder door on a Crossly World room or Space, by its presence slug (a room share slug, or space-&lt;slug&gt;): the rule (minValueCents held at reliable A/B marks and/or minUnits units, mode any or all, optionally one product, bullion family or category), the rule in words, and whether you may join now with what you hold toward it. gate is null when the place has no vault door. Anyone may look in; only holders join.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val place : kotlin.String = place_example // kotlin.String | 
try {
    val result : GetVaultMarketWorldPlaceVaultGateResponse = apiInstance.getVaultMarketWorldPlaceVaultGate(place)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketWorldPlaceVaultGate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketWorldPlaceVaultGate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **place** | **kotlin.String**|  |

### Return type

**GetVaultMarketWorldPlaceVaultGateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketWorth"></a>
# **getVaultMarketWorth**
> GetVaultMarketWorthResponse getVaultMarketWorth()

What one book key (variantId:condition:gradeKey, &#x60;bookKey&#x60;) is worth: the mark in cents with its quality (A from trades, B from firm quotes, C indicative, none) and band, what Instant Exit would pay for one unit now from the best resting bid (yours left out), and your units: how many you hold, how many are free to sell, their value at the mark and what selling every free one now would fetch from today’s bids. Plain-words &#x60;headline&#x60; and &#x60;lines&#x60;. Read only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketWorthResponse = apiInstance.getVaultMarketWorth()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketWorth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketWorth")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketWorthResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultMarketWorthVault"></a>
# **getVaultMarketWorthVault**
> GetVaultMarketWorthVaultResponse getVaultMarketWorthVault()

What your whole vault is worth now: value at the marks split into reliable and indicative marks, cost and P&amp;L, today’s change, and an estimate of what the units free to sell would fetch from the bids resting on the book now. Read only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketWorthVaultResponse = apiInstance.getVaultMarketWorthVault()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultMarketWorthVault")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultMarketWorthVault")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketWorthVaultResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultReceipt"></a>
# **getVaultReceipt**
> GetVaultReceiptResponse getVaultReceipt(receiptNo)

One of your receipts with its full hash chain (issued, transferred, pledged, released, surrendered), re-verified on read: &#x60;chain.ok&#x60; is false if any event was altered.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val receiptNo : kotlin.String = receiptNo_example // kotlin.String | 
try {
    val result : GetVaultReceiptResponse = apiInstance.getVaultReceipt(receiptNo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultReceipt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultReceipt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptNo** | **kotlin.String**|  |

### Return type

**GetVaultReceiptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultReceiptToken"></a>
# **getVaultReceiptToken**
> GetVaultReceiptTokenResponse getVaultReceiptToken(id)

One receipt token (yours, or on a unit you own now) with its chain log: built, minted, frozen, thawed, new holder seen, redeem built, burned, with explorer links.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultReceiptTokenResponse = apiInstance.getVaultReceiptToken(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultReceiptToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultReceiptToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultReceiptTokenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVaultReceiptTokenByMint"></a>
# **getVaultReceiptTokenByMint**
> GetVaultReceiptTokenByMintResponse getVaultReceiptTokenByMint(mint)

What a Solana mint is: the warehouse receipt number and item it stands for, and whether the token is live, frozen (unit pledged or lent) or burned, and whether the unit is still on a vault shelf. Names no person and no wallet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val mint : kotlin.String = mint_example // kotlin.String | 
try {
    val result : GetVaultReceiptTokenByMintResponse = apiInstance.getVaultReceiptTokenByMint(mint)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#getVaultReceiptTokenByMint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#getVaultReceiptTokenByMint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mint** | **kotlin.String**|  |

### Return type

**GetVaultReceiptTokenByMintResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketAccounts"></a>
# **listVaultMarketAccounts**
> ListVaultMarketAccountsResponse listVaultMarketAccounts()

Every account you can act on: your own, and each sub-account your entity memberships reach, with your role.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketAccountsResponse = apiInstance.listVaultMarketAccounts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketAccounts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketAccountsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketAdlEvents"></a>
# **listVaultMarketAdlEvents**
> ListVaultMarketAdlEventsResponse listVaultMarketAdlEvents()

The ADL events your positions were part of, newest first: role bankrupt (yours went under water) or counterparty (yours was first in line), the price both closed at and the transfer status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketAdlEventsResponse = apiInstance.listVaultMarketAdlEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketAdlEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketAdlEvents")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketAdlEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketAdlPositions"></a>
# **listVaultMarketAdlPositions**
> ListVaultMarketAdlPositionsResponse listVaultMarketAdlPositions()

Your live positions, each with its place in its item ADL queue: lights 5 (first in line) to 1 (last), 0 when not in the queue (only profitable positions are), ranked by P&amp;L% x effective leverage.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketAdlPositionsResponse = apiInstance.listVaultMarketAdlPositions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketAdlPositions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketAdlPositions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketAdlPositionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketAgentDrafts"></a>
# **listVaultMarketAgentDrafts**
> ListVaultMarketAgentDraftsResponse listVaultMarketAgentDrafts()

Limit orders the shopping agent drafted for you, newest first. A draft places nothing: send its orderBody to POST /api/v1/vault-markets/pro/orders to place it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketAgentDraftsResponse = apiInstance.listVaultMarketAgentDrafts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketAgentDrafts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketAgentDrafts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketAgentDraftsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketAgentWatches"></a>
# **listVaultMarketAgentWatches**
> ListVaultMarketAgentWatchesResponse listVaultMarketAgentWatches()

Your price watches on book keys (best bid, lowest ask, last trade or market price, in cents), live ones first. &#x60;?live&#x3D;true&#x60; for live only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketAgentWatchesResponse = apiInstance.listVaultMarketAgentWatches()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketAgentWatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketAgentWatches")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketAgentWatchesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketAlertLog"></a>
# **listVaultMarketAlertLog**
> ListVaultMarketAlertLogResponse listVaultMarketAlertLog()

What the alerts hub did with your recent vault alerts (&#x60;?limit&#x3D;&#x60; 1 to 200, default 50): kind, title, the channels it went to, what was held (channel:reason) and the email digest state.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketAlertLogResponse = apiInstance.listVaultMarketAlertLog()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketAlertLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketAlertLog")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketAlertLogResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketAlerts"></a>
# **listVaultMarketAlerts**
> ListVaultMarketAlertsResponse listVaultMarketAlerts()

Your price alerts on book keys.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketAlertsResponse = apiInstance.listVaultMarketAlerts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketAlerts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketAlerts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketAlertsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketAuctions"></a>
# **listVaultMarketAuctions**
> ListVaultMarketAuctionsResponse listVaultMarketAuctions()

Open vault auction events (weekly, ending Sunday; premier, units marked $10,000+) and their lots, soonest ending first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketAuctionsResponse = apiInstance.listVaultMarketAuctions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketAuctions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketAuctions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketAuctionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketBlocks"></a>
# **listVaultMarketBlocks**
> ListVaultMarketBlocksResponse listVaultMarketBlocks()

An entity&#39;s block orders, newest first, each with its plan and how it was allocated.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketBlocksResponse = apiInstance.listVaultMarketBlocks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketBlocks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketBlocks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketBlocksResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketBullionFamilyPegs"></a>
# **listVaultMarketBullionFamilyPegs**
> ListVaultMarketBullionFamilyPegsResponse listVaultMarketBullionFamilyPegs()

Your family-wide spot-pegged quotes (live, or all with status&#x3D;all): one quote resting across a bullion family books at one condition, with units left, the peg, its status and every leg (the pegged quote on each book).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketBullionFamilyPegsResponse = apiInstance.listVaultMarketBullionFamilyPegs()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketBullionFamilyPegs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketBullionFamilyPegs")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketBullionFamilyPegsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketBullionKeys"></a>
# **listVaultMarketBullionKeys**
> ListVaultMarketBullionKeysResponse listVaultMarketBullionKeys()

Bullion key families (metal, form, size, mint or any mint): members, vault units, best resting bid and ask across their books, and spot as a labelled reference with what one unit of metal is worth at it. Spot is never a Crossly price.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketBullionKeysResponse = apiInstance.listVaultMarketBullionKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketBullionKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketBullionKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketBullionKeysResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketBullionPegs"></a>
# **listVaultMarketBullionPegs**
> ListVaultMarketBullionPegsResponse listVaultMarketBullionPegs()

Your spot-pegged quotes (live, or all with status&#x3D;all): side, units, the peg, the order it rests as, the last price and spot it was priced from, and why it is pulled when it is.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketBullionPegsResponse = apiInstance.listVaultMarketBullionPegs()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketBullionPegs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketBullionPegs")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketBullionPegsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketCollectionWorth"></a>
# **listVaultMarketCollectionWorth**
> ListVaultMarketCollectionWorthResponse listVaultMarketCollectionWorth()

Your collection valued at the display marks: rows on a vault book key with a mark are summed; rows with no mark or no key are counted, never valued.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketCollectionWorthResponse = apiInstance.listVaultMarketCollectionWorth()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketCollectionWorth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketCollectionWorth")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketCollectionWorthResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketConfirmations"></a>
# **listVaultMarketConfirmations**
> ListVaultMarketConfirmationsResponse listVaultMarketConfirmations()

Trade confirmations for your fills in a window (default 31 days): price, sale fee, maker or taker, order, vault unit and warehouse receipt.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketConfirmationsResponse = apiInstance.listVaultMarketConfirmations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketConfirmations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketConfirmations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketConfirmationsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketCreatorCohostInvites"></a>
# **listVaultMarketCreatorCohostInvites**
> ListVaultMarketCreatorCohostInvitesResponse listVaultMarketCreatorCohostInvites()

For creators: your invites from Crossly to co-host a Market Open launch show (invited, accepted, declined or withdrawn), each with the key, its show and the guidance for co-hosts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketCreatorCohostInvitesResponse = apiInstance.listVaultMarketCreatorCohostInvites()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketCreatorCohostInvites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketCreatorCohostInvites")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketCreatorCohostInvitesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketCredit"></a>
# **listVaultMarketCredit**
> ListVaultMarketCreditResponse listVaultMarketCredit()

Your vault loans and advances (live by default): what is owed, interest accrued, loan-to-value, the liquidation line and the collateral value it is called at.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketCreditResponse = apiInstance.listVaultMarketCredit()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketCredit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketCredit")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketCreditResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketDealerBands"></a>
# **listVaultMarketDealerBands**
> ListVaultMarketDealerBandsResponse listVaultMarketDealerBands()

Your Instant Exit bands and whether each is being kept now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketDealerBandsResponse = apiInstance.listVaultMarketDealerBands()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketDealerBands")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketDealerBands")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketDealerBandsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketDealerBids"></a>
# **listVaultMarketDealerBids**
> ListVaultMarketDealerBidsResponse listVaultMarketDealerBids()

Your standing dealer bids: open (default) or all.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketDealerBidsResponse = apiInstance.listVaultMarketDealerBids()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketDealerBids")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketDealerBids")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketDealerBidsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketDealerPoolFills"></a>
# **listVaultMarketDealerPoolFills**
> ListVaultMarketDealerPoolFillsResponse listVaultMarketDealerPoolFills(id)

A curve pool&#39;s fills, newest first: side, price and spot after.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketDealerPoolFillsResponse = apiInstance.listVaultMarketDealerPoolFills(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketDealerPoolFills")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketDealerPoolFills")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketDealerPoolFillsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketDealerPools"></a>
# **listVaultMarketDealerPools**
> ListVaultMarketDealerPoolsResponse listVaultMarketDealerPools()

Your curve pools: open (default) or all, each with its curve, spot, units, buy budget, running totals, the ladder it shows and its live legs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketDealerPoolsResponse = apiInstance.listVaultMarketDealerPools()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketDealerPools")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketDealerPools")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketDealerPoolsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketDigestHistory"></a>
# **listVaultMarketDigestHistory**
> ListVaultMarketDigestHistoryResponse listVaultMarketDigestHistory()

Past weekly digests: week, status (sent / skipped / failed), the channels used and a summary.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketDigestHistoryResponse = apiInstance.listVaultMarketDigestHistory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketDigestHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketDigestHistory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketDigestHistoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketEntityAudit"></a>
# **listVaultMarketEntityAudit**
> ListVaultMarketEntityAuditResponse listVaultMarketEntityAudit(id)

The entity&#39;s audit trail, newest first: hash-chained rows with actor, account, API key, IP, session and source.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketEntityAuditResponse = apiInstance.listVaultMarketEntityAudit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketEntityAudit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketEntityAudit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketEntityAuditResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketEntityConversions"></a>
# **listVaultMarketEntityConversions**
> ListVaultMarketEntityConversionsResponse listVaultMarketEntityConversions(id)

The custodian&#39;s CBX-to-USD reward conversions for an entity that elected USD, newest first, with their status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketEntityConversionsResponse = apiInstance.listVaultMarketEntityConversions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketEntityConversions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketEntityConversions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketEntityConversionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketEstimatesAccuracy"></a>
# **listVaultMarketEstimatesAccuracy**
> ListVaultMarketEstimatesAccuracyResponse listVaultMarketEstimatesAccuracy()

The Crossly Estimate&#39;s track record: walk-forward backtest n, FSD and bias per method, category and liquidity bucket, and whether estimates in that cell are shown.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketEstimatesAccuracyResponse = apiInstance.listVaultMarketEstimatesAccuracy()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketEstimatesAccuracy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketEstimatesAccuracy")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketEstimatesAccuracyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketFeed"></a>
# **listVaultMarketFeed**
> ListVaultMarketFeedResponse listVaultMarketFeed()

New vault buys by the people you follow who share them, newest first (no prices). Page with &#x60;before&#x60; (the last item&#39;s &#x60;at&#x60;).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketFeedResponse = apiInstance.listVaultMarketFeed()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketFeed")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketFeedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketFollowCopyWatch"></a>
# **listVaultMarketFollowCopyWatch**
> ListVaultMarketFollowCopyWatchResponse listVaultMarketFollowCopyWatch()

The collectors you copy-watch and whether each still shares bids and asks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketFollowCopyWatchResponse = apiInstance.listVaultMarketFollowCopyWatch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketFollowCopyWatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketFollowCopyWatch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketFollowCopyWatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketFollowCopyWatchAlerts"></a>
# **listVaultMarketFollowCopyWatchAlerts**
> ListVaultMarketFollowCopyWatchAlertsResponse listVaultMarketFollowCopyWatchAlerts()

Your copy-watch alerts, newest first: who, bid or ask, quantity, limit price, market, and whether it still rests. Page with &#x60;before&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketFollowCopyWatchAlertsResponse = apiInstance.listVaultMarketFollowCopyWatchAlerts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketFollowCopyWatchAlerts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketFollowCopyWatchAlerts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketFollowCopyWatchAlertsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketFollowFeed"></a>
# **listVaultMarketFollowFeed**
> ListVaultMarketFollowFeedResponse listVaultMarketFollowFeed()

Public vault activity of the collectors you follow (buys, units sent in, sales, Hall loans), newest first, never a price. Filter with &#x60;kinds&#x60;; page with &#x60;before&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketFollowFeedResponse = apiInstance.listVaultMarketFollowFeed()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketFollowFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketFollowFeed")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketFollowFeedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketFollowFollowing"></a>
# **listVaultMarketFollowFollowing**
> ListVaultMarketFollowFollowingResponse listVaultMarketFollowFollowing()

The collectors you follow who have a public vault: what each shares and whether you copy-watch them.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketFollowFollowingResponse = apiInstance.listVaultMarketFollowFollowing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketFollowFollowing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketFollowFollowing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketFollowFollowingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketFollowLeaderboards"></a>
# **listVaultMarketFollowLeaderboards**
> ListVaultMarketFollowLeaderboardsResponse listVaultMarketFollowLeaderboards()

An opt-in return leaderboard (&#x60;period&#x60; 30d, 90d or 365d; &#x60;category&#x60; all or a category slug), ranked by risk-adjusted return from the book A/B marks. Percent and risk only: no dollars, no volume.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketFollowLeaderboardsResponse = apiInstance.listVaultMarketFollowLeaderboards()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketFollowLeaderboards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketFollowLeaderboards")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketFollowLeaderboardsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketFollowProfileActivity"></a>
# **listVaultMarketFollowProfileActivity**
> ListVaultMarketFollowFeedResponse listVaultMarketFollowProfileActivity(handle)

One collector public vault activity, newest first, never a price. 404 when their vault is not public.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : ListVaultMarketFollowFeedResponse = apiInstance.listVaultMarketFollowProfileActivity(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketFollowProfileActivity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketFollowProfileActivity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**ListVaultMarketFollowFeedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketGifts"></a>
# **listVaultMarketGifts**
> ListVaultMarketGiftsResponse listVaultMarketGifts()

Gifts you sent and received, newest first, with their status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketGiftsResponse = apiInstance.listVaultMarketGifts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketGifts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketGifts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketGiftsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketGradeToVault"></a>
# **listVaultMarketGradeToVault**
> ListVaultMarketGradeToVaultResponse listVaultMarketGradeToVault()

Your Grade to Vault flows, newest first, each brought up to date: its step, the grading submission, the unit, the grade, the market for it, and the ask once listed. &#x60;live&#x3D;1&#x60; for those still going.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketGradeToVaultResponse = apiInstance.listVaultMarketGradeToVault()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketGradeToVault")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketGradeToVault")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketGradeToVaultResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketGrading"></a>
# **listVaultMarketGrading**
> ListVaultMarketGradingResponse listVaultMarketGrading()

Your vault units sent to grading: where each card is in its run, and the grade once it is back.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketGradingResponse = apiInstance.listVaultMarketGrading()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketGrading")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketGrading")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketGradingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketHallLenders"></a>
# **listVaultMarketHallLenders**
> ListVaultMarketHallLendersResponse listVaultMarketHallLenders()

The vault units lent to this week&#39;s Hall of Grails exhibition and on show now, in plinth order: the item (skuId, name, imageUrl, grade), the lender as the plate names them (a display name, or \&quot;a collector\&quot;), the plate lines and how many exhibitions the unit has stood in. meta.exhibition is the week (key, title, endsAt). Names no ids and no amounts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketHallLendersResponse = apiInstance.listVaultMarketHallLenders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketHallLenders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketHallLenders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketHallLendersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexCommitteeMinutes"></a>
# **listVaultMarketIndexCommitteeMinutes**
> ListVaultMarketIndexCommitteeMinutesResponse listVaultMarketIndexCommitteeMinutes()

Published Index Committee minutes, newest first: attendees (names and roles), quorum, agenda, minutes and decisions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketIndexCommitteeMinutesResponse = apiInstance.listVaultMarketIndexCommitteeMinutes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexCommitteeMinutes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexCommitteeMinutes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketIndexCommitteeMinutesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexComplaints"></a>
# **listVaultMarketIndexComplaints**
> ListVaultMarketIndexComplaintsResponse listVaultMarketIndexComplaints()

Your complaints and their answers, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketIndexComplaintsResponse = apiInstance.listVaultMarketIndexComplaints()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexComplaints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexComplaints")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketIndexComplaintsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexConstituents"></a>
# **listVaultMarketIndexConstituents**
> ListVaultMarketIndexMembersResponse listVaultMarketIndexConstituents(slug)

The book keys in an index with their weight, move since the last close and contribution to the index&#39;s move (basis points).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListVaultMarketIndexMembersResponse = apiInstance.listVaultMarketIndexConstituents(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexConstituents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexConstituents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListVaultMarketIndexMembersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexConsultations"></a>
# **listVaultMarketIndexConsultations**
> ListVaultMarketIndexConsultationsResponse listVaultMarketIndexConsultations()

Consultations on index method changes (open for at least 30 days), newest first. Filter by &#x60;status&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketIndexConsultationsResponse = apiInstance.listVaultMarketIndexConsultations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexConsultations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexConsultations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketIndexConsultationsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexEvents"></a>
# **listVaultMarketIndexEvents**
> ListVaultMarketIndexEventsResponse listVaultMarketIndexEvents()

Every index event, newest first: add, delete, rebalance, method, correction, halt; each with when it was announced, when it takes effect, the detail and the reason. Filter by &#x60;kind&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketIndexEventsResponse = apiInstance.listVaultMarketIndexEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexEvents")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketIndexEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexEventsBySlug"></a>
# **listVaultMarketIndexEventsBySlug**
> ListVaultMarketIndexEventsResponse listVaultMarketIndexEventsBySlug(slug)

One index&#39;s events, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListVaultMarketIndexEventsResponse = apiInstance.listVaultMarketIndexEventsBySlug(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexEventsBySlug")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexEventsBySlug")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListVaultMarketIndexEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexJudgments"></a>
# **listVaultMarketIndexJudgments**
> ListVaultMarketIndexJudgmentsResponse listVaultMarketIndexJudgments()

The expert-judgment log: every Index Committee action (halt, resume, exclude a key, void a trade, restate, retire) with its written reason.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketIndexJudgmentsResponse = apiInstance.listVaultMarketIndexJudgments()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexJudgments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexJudgments")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketIndexJudgmentsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexLevelSeries"></a>
# **listVaultMarketIndexLevelSeries**
> ListVaultMarketIndexLevelSeriesResponse listVaultMarketIndexLevelSeries(slug)

An index&#39;s published levels. &#x60;engine&#x3D;chain&#x60; (default): daily closes. &#x60;engine&#x3D;tpd|repeat_sales&#x60;: weekly (else monthly) model estimates with a 95% band and n; labelled, never a price. &#x60;series&#x3D;settlement&#x60; returns each value as first published (never restated). Below the data gate &#x60;data&#x60; is empty and &#x60;notice&#x60; explains.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListVaultMarketIndexLevelSeriesResponse = apiInstance.listVaultMarketIndexLevelSeries(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexLevelSeries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexLevelSeries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListVaultMarketIndexLevelSeriesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexLicenceMine"></a>
# **listVaultMarketIndexLicenceMine**
> ListVaultMarketIndexLicenceMineResponse listVaultMarketIndexLicenceMine()

Your index feed licences (the indexes each covers, or all), as ops recorded them. No licence: the feed answers 403 not_a_licensee.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketIndexLicenceMineResponse = apiInstance.listVaultMarketIndexLicenceMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexLicenceMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexLicenceMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketIndexLicenceMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexMembers"></a>
# **listVaultMarketIndexMembers**
> ListVaultMarketIndexMembersResponse listVaultMarketIndexMembers(slug)

The members of an index on a day (&#x60;asOf&#x60;, default today) with their weights, shares, moves and contributions; for a past day, the inputs stored with that day&#39;s close and each member&#39;s effective dates.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListVaultMarketIndexMembersResponse = apiInstance.listVaultMarketIndexMembers(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListVaultMarketIndexMembersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexMovers"></a>
# **listVaultMarketIndexMovers**
> ListVaultMarketIndexesResponse listVaultMarketIndexMovers()

The built-in indexes that moved most since their last daily close.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketIndexesResponse = apiInstance.listVaultMarketIndexMovers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexMovers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexMovers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketIndexesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketIndexes"></a>
# **listVaultMarketIndexes**
> ListVaultMarketIndexesResponse listVaultMarketIndexes()

Indexes over book keys: per category, per top brand, the Crossly 50 and your own. Each with its level now (base 1000 at inception) and change since the last daily close.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketIndexesResponse = apiInstance.listVaultMarketIndexes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketIndexes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketIndexes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketIndexesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketInstantExitHistory"></a>
# **listVaultMarketInstantExitHistory**
> ListVaultMarketInstantExitHistoryResponse listVaultMarketInstantExitHistory()

Your Instant Exits, newest first: quoted price, mark, and whether it filled.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketInstantExitHistoryResponse = apiInstance.listVaultMarketInstantExitHistory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketInstantExitHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketInstantExitHistory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketInstantExitHistoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketInstantExitHoldings"></a>
# **listVaultMarketInstantExitHoldings**
> ListVaultMarketInstantExitHoldingsResponse listVaultMarketInstantExitHoldings()

Instant Exit quotes for everything you hold in the vault, one per book key, with units held and which are free to sell.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketInstantExitHoldingsResponse = apiInstance.listVaultMarketInstantExitHoldings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketInstantExitHoldings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketInstantExitHoldings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketInstantExitHoldingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketJointTrades"></a>
# **listVaultMarketJointTrades**
> ListVaultMarketJointTradesResponse listVaultMarketJointTrades(id)

The joint vault trades, newest first: side, book key, limit, who started it, whose account the order sits on, and the order standing on the book.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketJointTradesResponse = apiInstance.listVaultMarketJointTrades(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketJointTrades")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketJointTrades")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketJointTradesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketLargeTraderReports"></a>
# **listVaultMarketLargeTraderReports**
> ListVaultMarketLargeTraderReportsResponse listVaultMarketLargeTraderReports()

Your large-trader reports (with any linked accounts, as one party): due first, then filed, then cleared in the last 90 days. Each has &#x60;action&#x60;: file | amend | refile | none.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketLargeTraderReportsResponse = apiInstance.listVaultMarketLargeTraderReports()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketLargeTraderReports")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketLargeTraderReports")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketLargeTraderReportsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketLendingStatements"></a>
# **listVaultMarketLendingStatements**
> ListVaultMarketLendingStatementsResponse listVaultMarketLendingStatements()

The days you have stored collateral statements for, newest first, with their summary.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketLendingStatementsResponse = apiInstance.listVaultMarketLendingStatements()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketLendingStatements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketLendingStatements")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketLendingStatementsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketLoans"></a>
# **listVaultMarketLoans**
> ListVaultMarketLoansResponse listVaultMarketLoans()

Units you lent: rate, fees earned, recall due.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketLoansResponse = apiInstance.listVaultMarketLoans()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketLoans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketLoans")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketLoansResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketLocateMine"></a>
# **listVaultMarketLocateMine**
> ListVaultMarketLocateMineResponse listVaultMarketLocateMine()

Your locates, newest first (held / used / released / expired).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketLocateMineResponse = apiInstance.listVaultMarketLocateMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketLocateMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketLocateMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketLocateMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketMidpoint"></a>
# **listVaultMarketMidpoint**
> ListVaultMarketMidpointResponse listVaultMarketMidpoint()

Your midpoint block orders.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketMidpointResponse = apiInstance.listVaultMarketMidpoint()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketMidpoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketMidpoint")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketMidpointResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketMovers"></a>
# **listVaultMarketMovers**
> ListVaultMarketMoversResponse listVaultMarketMovers()

Vault items with the biggest 24 h moves in their market price (from the order book), with units in the vault.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketMoversResponse = apiInstance.listVaultMarketMovers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketMovers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketMovers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketMoversResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketNavHistory"></a>
# **listVaultMarketNavHistory**
> ListVaultMarketNavHistoryResponse listVaultMarketNavHistory()

Daily NAV snapshots (mark, bid, liquidation, Level 2 / Level 3).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketNavHistoryResponse = apiInstance.listVaultMarketNavHistory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketNavHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketNavHistory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketNavHistoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketOffers"></a>
# **listVaultMarketOffers**
> ListVaultMarketOffersResponse listVaultMarketOffers()

The offers inbox: for each book key you hold, the best bid from someone else, units at it, the top bid levels, the mark, and your alert.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketOffersResponse = apiInstance.listVaultMarketOffers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketOffers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketOffersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketOpening"></a>
# **listVaultMarketOpening**
> ListVaultMarketOpeningResponse listVaultMarketOpening()

Keys opening soon on the vault book (and just opened): units on the shelf, dealers quoting, the waitlist, the mark when the book has one, and your place.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketOpeningResponse = apiInstance.listVaultMarketOpening()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketOpening")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketOpening")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketOpeningResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketOracleHistory"></a>
# **listVaultMarketOracleHistory**
> ListVaultMarketOracleHistoryResponse listVaultMarketOracleHistory(slug)

Recent publish attempts for an index over 30 days, newest first: published, skipped (with the reason: too few items priced, stale marks, confidence too wide...) or failed (with the error). Filter with &#x60;status&#x60;, cap with &#x60;limit&#x60; (default 100).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListVaultMarketOracleHistoryResponse = apiInstance.listVaultMarketOracleHistory(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketOracleHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketOracleHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListVaultMarketOracleHistoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketP2pAuctions"></a>
# **listVaultMarketP2pAuctions**
> ListVaultMarketP2pLoansResponse listVaultMarketP2pAuctions()

Running refinancing auctions, soonest to end first: lenders calls (&#x60;auction&#x60;) and borrowers looking for a cheaper lender (&#x60;refiAuction&#x60;). The payoff now, the rate a new lender gets now, when it ends, and the item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketP2pLoansResponse = apiInstance.listVaultMarketP2pAuctions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketP2pAuctions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketP2pAuctions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketP2pLoansResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketP2pLoans"></a>
# **listVaultMarketP2pLoans**
> ListVaultMarketP2pLoansResponse listVaultMarketP2pLoans()

Your P2P loans as borrower and/or lender (&#x60;role&#x60;), live by default (&#x60;status&#x60;): what is owed now, daily interest, the refinancing auction when called, and the item mark for information only (it never triggers anything).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketP2pLoansResponse = apiInstance.listVaultMarketP2pLoans()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketP2pLoans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketP2pLoans")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketP2pLoansResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketP2pOfferMine"></a>
# **listVaultMarketP2pOfferMine**
> ListVaultMarketP2pOffersResponse listVaultMarketP2pOfferMine()

Your P2P loan offers, newest first, with how many loans each has funded.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketP2pOffersResponse = apiInstance.listVaultMarketP2pOfferMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketP2pOfferMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketP2pOfferMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketP2pOffersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketP2pOffers"></a>
# **listVaultMarketP2pOffers**
> ListVaultMarketP2pOffersResponse listVaultMarketP2pOffers()

The open P2P loan offers book, lowest rate first: cents offered per loan, APR (bps), loans left, and the item (book key) or unit each lends against. &#x60;bookKey&#x60; narrows to one item. Lender identities are never shown.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketP2pOffersResponse = apiInstance.listVaultMarketP2pOffers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketP2pOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketP2pOffers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketP2pOffersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketP2pUnits"></a>
# **listVaultMarketP2pUnits**
> ListVaultMarketP2pUnitsResponse listVaultMarketP2pUnits()

Your vault units for P2P borrowing: whether each can be pledged now (and why not), the best offers covering it, and its loan when it has one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketP2pUnitsResponse = apiInstance.listVaultMarketP2pUnits()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketP2pUnits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketP2pUnits")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketP2pUnitsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPaperFills"></a>
# **listVaultMarketPaperFills**
> ListVaultMarketPaperFillsResponse listVaultMarketPaperFills()

Your paper fills since your last reset, newest first: price, simulated fee, taker or maker, and whether a visible real order (book) or a real trade (tape) filled it. Play money only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPaperFillsResponse = apiInstance.listVaultMarketPaperFills()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPaperFills")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPaperFills")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPaperFillsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPaperLeaderboard"></a>
# **listVaultMarketPaperLeaderboard**
> ListVaultMarketPaperLeaderboardResponse listVaultMarketPaperLeaderboard()

The weekly paper trading leaderboard (opt-in, display names only): best return on play equity this week (or a past &#x60;week&#x60;, its Monday as YYYY-MM-DD), with your own line. Nothing is won or paid.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPaperLeaderboardResponse = apiInstance.listVaultMarketPaperLeaderboard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPaperLeaderboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPaperLeaderboard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPaperLeaderboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPaperMissions"></a>
# **listVaultMarketPaperMissions**
> ListVaultMarketPaperMissionsResponse listVaultMarketPaperMissions()

Your paper-trading missions (play money only): each mission with what to do, your count toward its target, whether it is done and when, plus a suggested market for the \&quot;Read the mark\&quot; mission. Progress is observed by the server from your paper orders and fills, price watches, set goals and graded mark checks. Missions earn world quest progress and cosmetic pins, never money.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPaperMissionsResponse = apiInstance.listVaultMarketPaperMissions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPaperMissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPaperMissions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPaperMissionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPaperOrders"></a>
# **listVaultMarketPaperOrders**
> ListVaultMarketPaperOrdersResponse listVaultMarketPaperOrders()

Your paper orders since your last reset, newest first: working, done (filled, cancelled, expired) or all. Play money only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPaperOrdersResponse = apiInstance.listVaultMarketPaperOrders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPaperOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPaperOrders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPaperOrdersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPartnerAccruals"></a>
# **listVaultMarketPartnerAccruals**
> ListVaultMarketPartnerAccrualsResponse listVaultMarketPartnerAccruals()

Your partner fee shares, newest first: accrued on a unit&#39;s first sale, paid in Bucks once the sale is final, void if it was refunded.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPartnerAccrualsResponse = apiInstance.listVaultMarketPartnerAccruals()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPartnerAccruals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPartnerAccruals")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPartnerAccrualsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPoolStakes"></a>
# **listVaultMarketPoolStakes**
> ListVaultMarketPoolStakesResponse listVaultMarketPoolStakes()

Your stakes in the market pool and what each redeems for now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPoolStakesResponse = apiInstance.listVaultMarketPoolStakes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPoolStakes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPoolStakes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPoolStakesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPortfolioMarginHistory"></a>
# **listVaultMarketPortfolioMarginHistory**
> ListVaultMarketPortfolioMarginHistoryResponse listVaultMarketPortfolioMarginHistory()

The 5-minute portfolio margin recalculations for a firm sub-account over the last &#x60;hours&#x60; (default 24, at most 720), newest first: equity, requirement, excess, scenario and floor figures, gross and state.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPortfolioMarginHistoryResponse = apiInstance.listVaultMarketPortfolioMarginHistory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPortfolioMarginHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPortfolioMarginHistory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPortfolioMarginHistoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPositionUnits"></a>
# **listVaultMarketPositionUnits**
> ListVaultMarketPositionUnitsResponse listVaultMarketPositionUnits(id)

The vault units of one of your positions that you hold (a leveraged long&#39;s collateral), each with its story link.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListVaultMarketPositionUnitsResponse = apiInstance.listVaultMarketPositionUnits(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPositionUnits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPositionUnits")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListVaultMarketPositionUnitsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPositions"></a>
# **listVaultMarketPositions**
> ListVaultMarketPositionsResponse listVaultMarketPositions()

Your positions, live (default) or closed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPositionsResponse = apiInstance.listVaultMarketPositions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPositions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPositions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPositionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPositionsRisk"></a>
# **listVaultMarketPositionsRisk**
> ListVaultMarketPositionsRiskResponse listVaultMarketPositionsRisk()

For each live position: its tier, health, margin state, the mark at which it is called and the mark at which it is liquidated, and the distance to it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPositionsRiskResponse = apiInstance.listVaultMarketPositionsRisk()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPositionsRisk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPositionsRisk")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPositionsRiskResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketPriceWidgets"></a>
# **listVaultMarketPriceWidgets**
> ListVaultMarketPriceWidgetsResponse listVaultMarketPriceWidgets()

Your price widgets, newest first, each with its iframe and script-tag snippets. &#x60;meta.codes&#x60; lists your affiliate codes a widget can link through; &#x60;meta.max&#x60; is the cap on live widgets.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketPriceWidgetsResponse = apiInstance.listVaultMarketPriceWidgets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketPriceWidgets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketPriceWidgets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketPriceWidgetsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketProCandles"></a>
# **listVaultMarketProCandles**
> ListVaultMarketProCandlesResponse listVaultMarketProCandles()

OHLCV candles (1m, 5m, 15m, 1h, 4h, 1d) from the trades on a book key.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketProCandlesResponse = apiInstance.listVaultMarketProCandles()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketProCandles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketProCandles")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketProCandlesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketProEvents"></a>
# **listVaultMarketProEvents**
> ListVaultMarketProEventsResponse listVaultMarketProEvents()

Your order event log after a sequence number (new, leg, fill, replaced, cancelled, expired, done): a replayable drop copy.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketProEventsResponse = apiInstance.listVaultMarketProEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketProEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketProEvents")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketProEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketProLinks"></a>
# **listVaultMarketProLinks**
> ListVaultMarketProLinksResponse listVaultMarketProLinks()

Your linked orders (brackets, OCO pairs, trailing stops, position exits): live (default) or done.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketProLinksResponse = apiInstance.listVaultMarketProLinks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketProLinks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketProLinks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketProLinksResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketProOrders"></a>
# **listVaultMarketProOrders**
> ListVaultMarketProOrdersResponse listVaultMarketProOrders()

Your orders: open (default) or done, optionally on one book key, or only those booked to one sub-account (&#x60;subaccountId&#x60;).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketProOrdersResponse = apiInstance.listVaultMarketProOrders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketProOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketProOrders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketProOrdersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketProQuotes"></a>
# **listVaultMarketProQuotes**
> ListVaultMarketProQuotesResponse listVaultMarketProQuotes()

Your live quotes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketProQuotesResponse = apiInstance.listVaultMarketProQuotes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketProQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketProQuotes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketProQuotesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketProRewards"></a>
# **listVaultMarketProRewards**
> ListVaultMarketProRewardsResponse listVaultMarketProRewards()

Your daily market-maker liquidity rewards (paid in CBX).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketProRewardsResponse = apiInstance.listVaultMarketProRewards()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketProRewards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketProRewards")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketProRewardsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketProTape"></a>
# **listVaultMarketProTape**
> ListVaultMarketProTapeResponse listVaultMarketProTape()

The latest trades on a book key, newest first, with which side made and which took.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketProTapeResponse = apiInstance.listVaultMarketProTape()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketProTape")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketProTape")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketProTapeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketProofOfReserveLeaves"></a>
# **listVaultMarketProofOfReserveLeaves**
> ListVaultMarketProofOfReserveLeavesResponse listVaultMarketProofOfReserveLeaves(day)

One day&#39;s leaf hashes in tree order, a page at a time: enough to recount the units and rebuild the root yourself. Leaves are salted, so they name no owner.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val day : kotlin.String = day_example // kotlin.String | 
try {
    val result : ListVaultMarketProofOfReserveLeavesResponse = apiInstance.listVaultMarketProofOfReserveLeaves(day)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketProofOfReserveLeaves")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketProofOfReserveLeaves")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **day** | **kotlin.String**|  |

### Return type

**ListVaultMarketProofOfReserveLeavesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketRecurring"></a>
# **listVaultMarketRecurring**
> ListVaultMarketRecurringResponse listVaultMarketRecurring()

Your recurring buys: key, schedule, price cap, payment, auto-lend, next run.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketRecurringResponse = apiInstance.listVaultMarketRecurring()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketRecurring")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketRecurring")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketRecurringResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketRecurringRuns"></a>
# **listVaultMarketRecurringRuns**
> ListVaultMarketRecurringRunsResponse listVaultMarketRecurringRuns(id)

One recurring buy&#39;s runs: filled, skipped (with the reason, e.g. the price was over the cap) or failed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketRecurringRunsResponse = apiInstance.listVaultMarketRecurringRuns(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketRecurringRuns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketRecurringRuns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketRecurringRunsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketRecurringRuns2"></a>
# **listVaultMarketRecurringRuns2**
> ListVaultMarketRecurringRunsResponse listVaultMarketRecurringRuns2()

Every run of all your recurring buys, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketRecurringRunsResponse = apiInstance.listVaultMarketRecurringRuns2()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketRecurringRuns2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketRecurringRuns2")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketRecurringRunsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketRfq"></a>
# **listVaultMarketRfq**
> ListVaultMarketRfqResponse listVaultMarketRfq()

Your quote requests, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketRfqResponse = apiInstance.listVaultMarketRfq()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketRfq")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketRfq")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketRfqResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketRfqInbox"></a>
# **listVaultMarketRfqInbox**
> ListVaultMarketRfqInboxResponse listVaultMarketRfqInbox()

Open quote requests you were sent (as a dealer, DMM, LP or holder), with your live answer.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketRfqInboxResponse = apiInstance.listVaultMarketRfqInbox()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketRfqInbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketRfqInbox")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketRfqInboxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketRfqOpen"></a>
# **listVaultMarketRfqOpen**
> ListVaultMarketRfqResponse listVaultMarketRfqOpen()

Open quote requests on one key (all-to-all: anyone with ID may answer). Anonymous.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketRfqResponse = apiInstance.listVaultMarketRfqOpen()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketRfqOpen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketRfqOpen")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketRfqResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketSetGoalBaskets"></a>
# **listVaultMarketSetGoalBaskets**
> ListVaultMarketSetGoalBasketsResponse listVaultMarketSetGoalBaskets(id)

A set goal basket bids, newest first, each with its budget, what it committed and spent, and every leg (piece, book key, limit, pro order id, status).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketSetGoalBasketsResponse = apiInstance.listVaultMarketSetGoalBaskets(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketSetGoalBaskets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketSetGoalBaskets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketSetGoalBasketsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketSetGoalSets"></a>
# **listVaultMarketSetGoalSets**
> ListVaultMarketSetGoalSetsResponse listVaultMarketSetGoalSets()

Sets to start a goal on. With q (2+ characters): a word-start search of every catalogue set. Without: the sets you hold pieces of in the vault, then the collections you are building. Each with your live goal on it, if any.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketSetGoalSetsResponse = apiInstance.listVaultMarketSetGoalSets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketSetGoalSets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketSetGoalSets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketSetGoalSetsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketSetGoals"></a>
# **listVaultMarketSetGoals**
> ListVaultMarketSetGoalsResponse listVaultMarketSetGoals()

Your set goals: the set, the target a piece must meet, pieces held of the total (from your vault), and the working basket bid.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketSetGoalsResponse = apiInstance.listVaultMarketSetGoals()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketSetGoals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketSetGoals")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketSetGoalsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketShareCards"></a>
# **listVaultMarketShareCards**
> ListVaultMarketShareCardsResponse listVaultMarketShareCards()

Your share cards (not taken down), each as the public sees it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketShareCardsResponse = apiInstance.listVaultMarketShareCards()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketShareCards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketShareCards")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketShareCardsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketSupplyDeposits"></a>
# **listVaultMarketSupplyDeposits**
> ListVaultMarketSupplyDepositsResponse listVaultMarketSupplyDeposits()

Your units sent to the vault, newest first, each with its state and its key&#39;s Instant Exit line (\&quot;Instant Exit now: $X (N% of mark)\&quot; or \&quot;No market yet\&quot;). Filter with &#x60;inventoryItemIds&#x60; (comma-separated).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketSupplyDepositsResponse = apiInstance.listVaultMarketSupplyDeposits()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketSupplyDeposits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketSupplyDeposits")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketSupplyDepositsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketSupplyInvites"></a>
# **listVaultMarketSupplyInvites**
> ListVaultMarketSupplyInvitesResponse listVaultMarketSupplyInvites()

Market Open invites to you as a dealer: keys Crossly is opening and asks you to quote.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketSupplyInvitesResponse = apiInstance.listVaultMarketSupplyInvites()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketSupplyInvites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketSupplyInvites")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketSupplyInvitesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketValuationStatements"></a>
# **listVaultMarketValuationStatements**
> ListVaultMarketValuationStatementsResponse listVaultMarketValuationStatements()

The insurance and appraisal statements you issued, newest first: purpose, date, units, total at the marks, hash and verify link.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketValuationStatementsResponse = apiInstance.listVaultMarketValuationStatements()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketValuationStatements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketValuationStatements")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketValuationStatementsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketVaultSuggestions"></a>
# **listVaultMarketVaultSuggestions**
> ListVaultMarketVaultSuggestionsResponse listVaultMarketVaultSuggestions()

What to send to the vault: your inventory items whose book key has a liquid vault market (tier A, B or C), best first. Each has a score (0 to 100) and its reasons, the market (tier, mark and its quality, best bid, best vault ask, spread), Instant Exit now, your list price, days listed without selling, and the vault fee. &#x60;meta.summary&#x60; counts what was left out and why. Inform only; send with POST /api/v1/vault-markets/supply/send.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketVaultSuggestionsResponse = apiInstance.listVaultMarketVaultSuggestions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketVaultSuggestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketVaultSuggestions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketVaultSuggestionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketWatchlist"></a>
# **listVaultMarketWatchlist**
> ListVaultMarketWatchlistResponse listVaultMarketWatchlist()

Your watched book keys with mark, 24 h and 7 d change, and the last 30 daily marks (sparkline).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketWatchlistResponse = apiInstance.listVaultMarketWatchlist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketWatchlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketWatchlist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketWatchlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketWidgetTokens"></a>
# **listVaultMarketWidgetTokens**
> ListVaultMarketWidgetTokensResponse listVaultMarketWidgetTokens()

Your live home-screen widget tokens, one per phone: id, name (the phone), public prefix, created and last used. The secret is never returned again.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketWidgetTokensResponse = apiInstance.listVaultMarketWidgetTokens()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketWidgetTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketWidgetTokens")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketWidgetTokensResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketWorldCohosts"></a>
# **listVaultMarketWorldCohosts**
> ListVaultMarketWorldCohostsResponse listVaultMarketWorldCohosts()

Market Open launch shows a verified creator co-hosts that are on now or opening soon: the key, its phase, the show, the creator (named only while their vault profile is public), their room link and, when the creator is in the creator programme, the disclosure that they may earn a share of the fee Crossly keeps. Never a prompt to trade.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketWorldCohostsResponse = apiInstance.listVaultMarketWorldCohosts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketWorldCohosts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketWorldCohosts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketWorldCohostsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketWorldCreatorRooms"></a>
# **listVaultMarketWorldCreatorRooms**
> ListVaultMarketWorldCreatorRoomsResponse listVaultMarketWorldCreatorRooms()

Verified creators whose public vault shelf is a world room: title, the creator, the room link and the disclosure. Rooms show each market share of the shelf, never amounts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketWorldCreatorRoomsResponse = apiInstance.listVaultMarketWorldCreatorRooms()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketWorldCreatorRooms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketWorldCreatorRooms")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketWorldCreatorRoomsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultMarketWorldMarketOpen"></a>
# **listVaultMarketWorldMarketOpen**
> ListVaultMarketWorldMarketOpenResponse listVaultMarketWorldMarketOpen()

Market Open events in the Crossly World Commons: keys opening soon and those that opened in the last few hours, live first then soonest, each with its board line, units on the shelf, dealers quoting and the launch show when there is one. Never a prompt to trade.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketWorldMarketOpenResponse = apiInstance.listVaultMarketWorldMarketOpen()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultMarketWorldMarketOpen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultMarketWorldMarketOpen")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketWorldMarketOpenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultReceiptTokenWallets"></a>
# **listVaultReceiptTokenWallets**
> ListVaultReceiptTokenWalletsResponse listVaultReceiptTokenWallets()

Your verified Solana wallets and whether each is on the receipt-token allow-list (receipt tokens move only between allow-listed wallets). meta.state is the gate.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultReceiptTokenWalletsResponse = apiInstance.listVaultReceiptTokenWallets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultReceiptTokenWallets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultReceiptTokenWallets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultReceiptTokenWalletsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultReceiptTokens"></a>
# **listVaultReceiptTokens**
> ListVaultReceiptTokensResponse listVaultReceiptTokens()

Your vault units with their warehouse receipt and receipt-token state (not exported, waiting for a signature, in a wallet, frozen, redeemed), whether each can be exported now and why not. meta.state is the gate (open, missing envs, program id, authority, terms version, cluster); meta.history is your last 50 exports.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultReceiptTokensResponse = apiInstance.listVaultReceiptTokens()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultReceiptTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultReceiptTokens")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultReceiptTokensResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultReceipts"></a>
# **listVaultReceipts**
> ListVaultReceiptsResponse listVaultReceipts()

Your warehouse receipts (documents of title for your vault units), live first. meta.receipts says whether receipts are registered (VAULT_WAREHOUSE_ISSUER) and their terms version.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultReceiptsResponse = apiInstance.listVaultReceipts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultReceipts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultReceipts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultReceiptsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVaultUnitList"></a>
# **listVaultUnitList**
> ListVaultUnitListResponse listVaultUnitList()

The published unit list (bar-list equivalent): every unit on a vault shelf with its warehouse receipt number (when receipts are registered), book key, shelf location code, insured value, status, pledged / on-loan flags and a per-receipt hashed holder (never a name or id). Filter with &#x60;bookKey&#x60;; pages with &#x60;page&#x60; / &#x60;limit&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultUnitListResponse = apiInstance.listVaultUnitList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#listVaultUnitList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#listVaultUnitList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultUnitListResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketAlertPref"></a>
# **updateVaultMarketAlertPref**
> GetVaultMarketAlertPrefResponse updateVaultMarketAlertPref()

Change vault alert settings: &#x60;matrix&#x60; ({ kind: { channel: true|false } }, merged onto what is set), &#x60;quietHours&#x60; ({ start: \&quot;HH:MM\&quot;, end: \&quot;HH:MM\&quot;, tz } or null to clear) and &#x60;telegram&#x60; (the Telegram master switch). Locked switches are ignored. Returns the new settings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketAlertPrefResponse = apiInstance.updateVaultMarketAlertPref()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketAlertPref")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketAlertPref")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketAlertPrefResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketBlockAllocation"></a>
# **updateVaultMarketBlockAllocation**
> ListVaultMarketBlocksItem updateVaultMarketBlockAllocation(orderId)

Post-trade allocation: set or replace the plan for a buy you placed for one of the entity&#39;s sub-accounts (that sub-account leads). Refused once any share has moved.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val orderId : kotlin.String = orderId_example // kotlin.String | 
try {
    val result : ListVaultMarketBlocksItem = apiInstance.updateVaultMarketBlockAllocation(orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketBlockAllocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketBlockAllocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **kotlin.String**|  |

### Return type

**ListVaultMarketBlocksItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketChannel"></a>
# **updateVaultMarketChannel**
> GetVaultMarketChannelResponse updateVaultMarketChannel()

Change the switches: &#x60;telegramAlerts&#x60;, &#x60;telegramDigest&#x60;, &#x60;pushCapPerDay&#x60; (0 to 20). Margin calls and recalls are never capped. Returns the new view.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketChannelResponse = apiInstance.updateVaultMarketChannel()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketChannel")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketChannelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketDealerBand"></a>
# **updateVaultMarketDealerBand**
> ListVaultMarketDealerBandsItem updateVaultMarketDealerBand()

Commit to an Instant Exit band on a key: a standing bid for &#x60;units&#x60; kept at &#x60;bandBps&#x60; of the mark, never above &#x60;maxPriceCents&#x60;, re-quoted as the mark moves.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : ListVaultMarketDealerBandsItem = apiInstance.updateVaultMarketDealerBand()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketDealerBand")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketDealerBand")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListVaultMarketDealerBandsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketDealerPool"></a>
# **updateVaultMarketDealerPool**
> ListVaultMarketDealerPoolsItem updateVaultMarketDealerPool(id)

Change a curve pool: spot, step, fee, levels, units, buy budget, floor, ceiling, or pause / resume. Re-quoted at once.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketDealerPoolsItem = apiInstance.updateVaultMarketDealerPool(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketDealerPool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketDealerPool")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketDealerPoolsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketEntityMember"></a>
# **updateVaultMarketEntityMember**
> GetVaultMarketEntityByIdResponse updateVaultMarketEntityMember(id, memberId)

Admin: change a member&#39;s role, limits or sub-accounts. The last admin cannot be demoted.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val memberId : kotlin.String = memberId_example // kotlin.String | 
try {
    val result : GetVaultMarketEntityByIdResponse = apiInstance.updateVaultMarketEntityMember(id, memberId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketEntityMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketEntityMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **memberId** | **kotlin.String**|  |

### Return type

**GetVaultMarketEntityByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketEntitySubaccountLimit"></a>
# **updateVaultMarketEntitySubaccountLimit**
> GetVaultMarketEntityByIdResponse updateVaultMarketEntitySubaccountLimit(id, subId)

Admin: set a sub-account&#39;s limits (per-order notional, units per key, gross, net, leverage), held to the entity&#39;s caps. &#x60;limits: null&#x60; clears them.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
val subId : kotlin.String = subId_example // kotlin.String | 
try {
    val result : GetVaultMarketEntityByIdResponse = apiInstance.updateVaultMarketEntitySubaccountLimit(id, subId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketEntitySubaccountLimit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketEntitySubaccountLimit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **subId** | **kotlin.String**|  |

### Return type

**GetVaultMarketEntityByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketEntityUsdElection"></a>
# **updateVaultMarketEntityUsdElection**
> GetVaultMarketEntityByIdResponse updateVaultMarketEntityUsdElection(id)

Admin: elect USD for the entity (&#x60;usdOnly&#x60;). Its sub-accounts then post collateral in USD only and pay every fee in USD, and any CBX reward paid to one of them is converted to USD by the custodian in that account. Audited; it can be turned off again.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketEntityByIdResponse = apiInstance.updateVaultMarketEntityUsdElection(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketEntityUsdElection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketEntityUsdElection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketEntityByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketFollowCopyWatch"></a>
# **updateVaultMarketFollowCopyWatch**
> DeleteVaultMarketFollowCopyWatchResponse updateVaultMarketFollowCopyWatch(handle)

Copy-watch a collector who shares bids and asks: you get an alert when they rest a new one. It never places an order for you.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : DeleteVaultMarketFollowCopyWatchResponse = apiInstance.updateVaultMarketFollowCopyWatch(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketFollowCopyWatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketFollowCopyWatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**DeleteVaultMarketFollowCopyWatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketFollowSharing"></a>
# **updateVaultMarketFollowSharing**
> GetVaultMarketFollowSharingResponse updateVaultMarketFollowSharing()

Turn sharing switches on or off (&#x60;isPublic&#x60;, &#x60;showBuys&#x60;, &#x60;deposits&#x60;, &#x60;sales&#x60;, &#x60;hallLoans&#x60;, &#x60;orders&#x60;, &#x60;leaderboard&#x60;). A switch shows only what happens after it goes on; all but the profile itself need the profile public.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketFollowSharingResponse = apiInstance.updateVaultMarketFollowSharing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketFollowSharing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketFollowSharing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketFollowSharingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketHomeUnit"></a>
# **updateVaultMarketHomeUnit**
> UpdateVaultMarketHomeUnitResponse updateVaultMarketHomeUnit()

Show exactly these vault units in your Crossly World home: { units: [{ vaultItemId, visitors }] }. Units left out come out of their cases; units already standing stay where they are; new ones go into a free display-case or shelf slot, else a glass case of their own along a wall. visitors: true lets people who may enter your home see that unit (default false: only you). Returns placed, unplaced (no free case: the home is full), refused (with why) and the desk. Display only: nothing moves.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : UpdateVaultMarketHomeUnitResponse = apiInstance.updateVaultMarketHomeUnit()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketHomeUnit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketHomeUnit")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateVaultMarketHomeUnitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketIndex"></a>
# **updateVaultMarketIndex**
> GetVaultMarketIndexResponse updateVaultMarketIndex(slug)

Rename, re-weight, share or change the keys of an index of your own; its level carries on.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetVaultMarketIndexResponse = apiInstance.updateVaultMarketIndex(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketIndex")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketIndex")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetVaultMarketIndexResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketLendingElection"></a>
# **updateVaultMarketLendingElection**
> GetVaultMarketLendingElectionResponse updateVaultMarketLendingElection()

Change your lender election (applies to loans opened after the change). Needs lending.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketLendingElectionResponse = apiInstance.updateVaultMarketLendingElection()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketLendingElection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketLendingElection")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketLendingElectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketMmMmp"></a>
# **updateVaultMarketMmMmp**
> GetVaultMarketMmMmpResponse updateVaultMarketMmMmp()

Set market-maker protection: N units or $X filled on your quotes within T seconds pulls every quote and freezes quoting for a set time.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketMmMmpResponse = apiInstance.updateVaultMarketMmMmp()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketMmMmp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketMmMmp")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketMmMmpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketMode"></a>
# **updateVaultMarketMode**
> GetVaultMarketModeResponse updateVaultMarketMode()

Choose your Vault Markets mode: &#x60;mode&#x60; simple or pro. Remembered for you on the web and in the app. A display preference only: it places nothing and moves no money.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketModeResponse = apiInstance.updateVaultMarketMode()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketMode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketMode")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketModeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketOfferAlert"></a>
# **updateVaultMarketOfferAlert**
> UpdateVaultMarketOfferAlertResponse updateVaultMarketOfferAlert()

Set (or clear with null) the bid price that should always notify you on a key you hold, and mute or unmute offer notices on it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : UpdateVaultMarketOfferAlertResponse = apiInstance.updateVaultMarketOfferAlert()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketOfferAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketOfferAlert")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateVaultMarketOfferAlertResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketPaperLeaderboard"></a>
# **updateVaultMarketPaperLeaderboard**
> UpdateVaultMarketPaperLeaderboardResponse updateVaultMarketPaperLeaderboard()

Join or leave the weekly paper leaderboard. Joining needs a display name (2 to 24 letters, numbers, spaces, dots, dashes or underscores), never your real name. Returns &#x60;{ optIn, displayName }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : UpdateVaultMarketPaperLeaderboardResponse = apiInstance.updateVaultMarketPaperLeaderboard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketPaperLeaderboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketPaperLeaderboard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateVaultMarketPaperLeaderboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketPositionExit"></a>
# **updateVaultMarketPositionExit**
> UpdateVaultMarketPositionExitResponse updateVaultMarketPositionExit(id)

Set a position&#39;s take-profit / stop-loss: a long is closed, a short covered, when the last trade reaches one. Both null clears them.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateVaultMarketPositionExitResponse = apiInstance.updateVaultMarketPositionExit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketPositionExit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketPositionExit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateVaultMarketPositionExitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketPriceWidget"></a>
# **updateVaultMarketPriceWidget**
> ListVaultMarketPriceWidgetsItem updateVaultMarketPriceWidget(id)

Change a widget: name, range, layout, theme, affiliate code (null for none) or allowed sites. The market or index it shows never changes: make a new widget for another.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketPriceWidgetsItem = apiInstance.updateVaultMarketPriceWidget(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketPriceWidget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketPriceWidget")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketPriceWidgetsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketProfile"></a>
# **updateVaultMarketProfile**
> GetVaultMarketProfileResponse updateVaultMarketProfile()

Turn your public vault profile on or off (&#x60;isPublic&#x60;) and whether followers see your new buys (&#x60;showBuys&#x60;). It shows weights by market, never dollars.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketProfileResponse = apiInstance.updateVaultMarketProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketRecurring"></a>
# **updateVaultMarketRecurring**
> ListVaultMarketRecurringItem updateVaultMarketRecurring(id)

Change a recurring buy&#39;s schedule, caps, cards or auto-lend, or pause / resume it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListVaultMarketRecurringItem = apiInstance.updateVaultMarketRecurring(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketRecurring")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketRecurring")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListVaultMarketRecurringItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketSetGoal"></a>
# **updateVaultMarketSetGoal**
> GetVaultMarketSetGoalResponse updateVaultMarketSetGoal(id)

Change what a piece must be to count (condition, grade mode, grade). Refused while a basket bid works: cancel it first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetVaultMarketSetGoalResponse = apiInstance.updateVaultMarketSetGoal(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketSetGoal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketSetGoal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetVaultMarketSetGoalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketShareCard"></a>
# **updateVaultMarketShareCard**
> ListVaultMarketShareCardsItem updateVaultMarketShareCard(id)

Show or hide the dollar amounts on one of your share cards (&#x60;showAmounts&#x60;).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListVaultMarketShareCardsItem = apiInstance.updateVaultMarketShareCard(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketShareCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketShareCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListVaultMarketShareCardsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketSupplyDeposit"></a>
# **updateVaultMarketSupplyDeposit**
> UpdateVaultMarketSupplyDepositResponse updateVaultMarketSupplyDeposit(id)

Change a deposit&#39;s toggles: &#x60;autoListBps&#x60; (list at that share of the mark once stored; null &#x3D; do not) and &#x60;lendWhenIdle&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateVaultMarketSupplyDepositResponse = apiInstance.updateVaultMarketSupplyDeposit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketSupplyDeposit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketSupplyDeposit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateVaultMarketSupplyDepositResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketSupplyRoundUp"></a>
# **updateVaultMarketSupplyRoundUp**
> GetVaultMarketSupplyRoundUpResponse updateVaultMarketSupplyRoundUp()

Set the round-up: &#x60;shareBps&#x60; (1%-50%) of each payout released to you adds to a budget; when it covers the cheapest vault unit on &#x60;bookKey&#x60;, one unit is bought with your saved card, never above the budget.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : GetVaultMarketSupplyRoundUpResponse = apiInstance.updateVaultMarketSupplyRoundUp()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketSupplyRoundUp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketSupplyRoundUp")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetVaultMarketSupplyRoundUpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketTodBeneficiary"></a>
# **updateVaultMarketTodBeneficiary**
> UpdateVaultMarketTodBeneficiaryResponse updateVaultMarketTodBeneficiary()

Replace your beneficiary list (keep an id to edit one): full name, contact (email or @username), relationship, and share in basis points; shares add up to 10000. Returns &#x60;{ beneficiaries, removed }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : UpdateVaultMarketTodBeneficiaryResponse = apiInstance.updateVaultMarketTodBeneficiary()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketTodBeneficiary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketTodBeneficiary")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateVaultMarketTodBeneficiaryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketTodDesignation"></a>
# **updateVaultMarketTodDesignation**
> UpdateVaultMarketTodDesignationResponse updateVaultMarketTodDesignation()

Leave one of your units to one beneficiary (beneficiaryId null clears it; the unit then follows the shares). Returns &#x60;{ vaultItemId, beneficiaryId }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
try {
    val result : UpdateVaultMarketTodDesignationResponse = apiInstance.updateVaultMarketTodDesignation()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketTodDesignation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketTodDesignation")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateVaultMarketTodDesignationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketWorldRoomVaultGate"></a>
# **updateVaultMarketWorldRoomVaultGate**
> UpdateVaultMarketWorldRoomVaultGateResponse updateVaultMarketWorldRoomVaultGate(id)

Set the vault-holder door on your own room (its collection rooms follow): visitors must hold minValueCents (cents, at reliable A/B marks) and/or minUnits units in the Crossly vault, mode any (either) or all (both), optionally only one product (scope kind product, ref the catalogue product id), bullion family (bullion, the family slug) or category (category, the slug). Send null to open it again. Returns &#x60;{ gate }&#x60;. Moves no money.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateVaultMarketWorldRoomVaultGateResponse = apiInstance.updateVaultMarketWorldRoomVaultGate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketWorldRoomVaultGate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketWorldRoomVaultGate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateVaultMarketWorldRoomVaultGateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVaultMarketWorldSpaceVaultGate"></a>
# **updateVaultMarketWorldSpaceVaultGate**
> UpdateVaultMarketWorldRoomVaultGateResponse updateVaultMarketWorldSpaceVaultGate(slug)

Set the vault-holder door on a Space you host: the same rule as a room (minValueCents at reliable marks and/or minUnits, mode, optional scope). Send null to open it again. Returns &#x60;{ gate }&#x60;. Moves no money.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = VaultMarketsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : UpdateVaultMarketWorldRoomVaultGateResponse = apiInstance.updateVaultMarketWorldSpaceVaultGate(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VaultMarketsApi#updateVaultMarketWorldSpaceVaultGate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VaultMarketsApi#updateVaultMarketWorldSpaceVaultGate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**UpdateVaultMarketWorldRoomVaultGateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

