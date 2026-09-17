# net.crossly - Kotlin client library for Crossly Seller API

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
*AIApi* | [**createAiCategorize**](docs/AIApi.md#createaicategorize) | **POST** /v1/ai/categorize | Taxonomy guess from a single image URL.
*AIApi* | [**createAiCategorizeFromImage**](docs/AIApi.md#createaicategorizefromimage) | **POST** /v1/ai/categorize-from-image | Taxonomy guess from a single base64 image.
*AIApi* | [**createAiEnhanceDescription**](docs/AIApi.md#createaienhancedescription) | **POST** /v1/ai/enhance-description | SEO-rewrite a listing description.
*AIApi* | [**createAiEnhanceListing**](docs/AIApi.md#createaienhancelisting) | **POST** /v1/ai/enhance-listing | Rewrite title + description + tags in one call.
*AIApi* | [**createAiEnhanceTitle**](docs/AIApi.md#createaienhancetitle) | **POST** /v1/ai/enhance-title | SEO-rewrite a listing title.
*AIApi* | [**createAiExtractReceipt**](docs/AIApi.md#createaiextractreceipt) | **POST** /v1/ai/extract-receipt | Structured data extraction from a receipt photo.
*AIApi* | [**createAiGenerateListing**](docs/AIApi.md#createaigeneratelisting) | **POST** /v1/ai/generate-listing | Generate full listing fields from up to 4 image URLs.
*AIApi* | [**createAiHelp**](docs/AIApi.md#createaihelp) | **POST** /v1/ai/help | In-app help Q&A grounded in supplied docs.
*AIApi* | [**createAiMagicListing**](docs/AIApi.md#createaimagiclisting) | **POST** /v1/ai/magic-listing | Generate full listing fields from base64 photos.
*AIApi* | [**createAiTestKey**](docs/AIApi.md#createaitestkey) | **POST** /v1/ai/test-key | Live-ping a candidate BYO-key.
*AIApi* | [**deleteAiKey**](docs/AIApi.md#deleteaikey) | **DELETE** /v1/ai/key | Remove the BYO-key for a provider.
*AIApi* | [**getAiProvider**](docs/AIApi.md#getaiprovider) | **GET** /v1/ai/providers | Static catalog of supported AI providers.
*AIApi* | [**getAiStatus**](docs/AIApi.md#getaistatus) | **GET** /v1/ai/status | BYO-key state for the calling user.
*AIApi* | [**updateAiKey**](docs/AIApi.md#updateaikey) | **PUT** /v1/ai/key | Save an encrypted BYO-key for an AI provider.
*AccountApi* | [**createAccountCancelDeletion**](docs/AccountApi.md#createaccountcanceldeletion) | **POST** /v1/account/cancel-deletion | Cancel a pending account deletion.
*AccountApi* | [**createAccountLogoutAll**](docs/AccountApi.md#createaccountlogoutall) | **POST** /v1/account/logout-all | Revoke every browser auth session for this user.
*AccountApi* | [**createAccountRequestDeletion**](docs/AccountApi.md#createaccountrequestdeletion) | **POST** /v1/account/request-deletion | Schedule account deletion after a grace period.
*AccountApi* | [**deleteAuthSession**](docs/AccountApi.md#deleteauthsession) | **DELETE** /v1/auth/sessions | Revoke all active browser sessions.
*AccountApi* | [**deleteAuthSessionBySessionId**](docs/AccountApi.md#deleteauthsessionbysessionid) | **DELETE** /v1/auth/sessions/{sessionId} | Revoke a single browser session by id.
*AccountApi* | [**deleteConnectedApp**](docs/AccountApi.md#deleteconnectedapp) | **DELETE** /v1/connected-apps/{grantId} | Disconnect a third-party app. Its tokens stop working immediately.
*AccountApi* | [**getAccountDeletionStatus**](docs/AccountApi.md#getaccountdeletionstatus) | **GET** /v1/account/deletion-status | Get the currently-pending deletion request, if any.
*AccountApi* | [**getMe**](docs/AccountApi.md#getme) | **GET** /v1/me | Identity check — authenticated user + PAT scopes + account state.
*AccountApi* | [**listAuthSessions**](docs/AccountApi.md#listauthsessions) | **GET** /v1/auth/sessions | List active browser auth sessions.
*AccountApi* | [**listConnectedApps**](docs/AccountApi.md#listconnectedapps) | **GET** /v1/connected-apps | List third-party OAuth apps with access to this account.
*AccountsApi* | [**createAccount**](docs/AccountsApi.md#createaccount) | **POST** /v1/accounts | Connect a new platform account (kicks off OAuth or extension handshake).
*AccountsApi* | [**createConnectionEmailImap**](docs/AccountsApi.md#createconnectionemailimap) | **POST** /v1/connections/email/imap | Add an IMAP mailbox connection.
*AccountsApi* | [**createConnectionEmailImapTest**](docs/AccountsApi.md#createconnectionemailimaptest) | **POST** /v1/connections/email/imap/test | Validate IMAP credentials without persisting.
*AccountsApi* | [**createConnectionRequest**](docs/AccountsApi.md#createconnectionrequest) | **POST** /v1/connections/{platform}/request | Express interest in a request_only platform.
*AccountsApi* | [**createPlatformAccountConnect**](docs/AccountsApi.md#createplatformaccountconnect) | **POST** /v1/platform-accounts/{platform}/connect | Revive or initiate connection for a cookie platform.
*AccountsApi* | [**createPlatformAccountDisconnect**](docs/AccountsApi.md#createplatformaccountdisconnect) | **POST** /v1/platform-accounts/{platform}/disconnect | Archive every active account row for a platform.
*AccountsApi* | [**createPlatformAccountHistoryImport**](docs/AccountsApi.md#createplatformaccounthistoryimport) | **POST** /v1/platform-accounts/{platform}/history-import | Set how far back to backfill order history + active listings for a platform, and run it now.
*AccountsApi* | [**createPlatformAccountRefreshStatus**](docs/AccountsApi.md#createplatformaccountrefreshstatus) | **POST** /v1/platform-accounts/refresh-status | Run on-demand healthchecks across cookie accounts.
*AccountsApi* | [**deleteAccount**](docs/AccountsApi.md#deleteaccount) | **DELETE** /v1/accounts/{id} | Disconnect a platform account.
*AccountsApi* | [**deleteConnectionById**](docs/AccountsApi.md#deleteconnectionbyid) | **DELETE** /v1/connections/by-id/{id} | Disconnect a specific OAuth connection by id.
*AccountsApi* | [**deleteConnectionEmailImap**](docs/AccountsApi.md#deleteconnectionemailimap) | **DELETE** /v1/connections/email/imap/{id} | Remove an IMAP mailbox connection.
*AccountsApi* | [**getConnectionEmail**](docs/AccountsApi.md#getconnectionemail) | **GET** /v1/connections/email | List IMAP and email-OAuth connections.
*AccountsApi* | [**getConnectionExtensionOnline**](docs/AccountsApi.md#getconnectionextensiononline) | **GET** /v1/connections/extension-online | Check if the browser extension is online.
*AccountsApi* | [**getOauthInit**](docs/AccountsApi.md#getoauthinit) | **GET** /v1/oauth/{platform}/init | Return the OAuth authorize URL for an API-track platform.
*AccountsApi* | [**getPlatformLimit**](docs/AccountsApi.md#getplatformlimit) | **GET** /v1/platforms/limits | eBay free-tier + Etsy fees aggregate.
*AccountsApi* | [**listAccounts**](docs/AccountsApi.md#listaccounts) | **GET** /v1/accounts | List your connected platform accounts.
*AccountsApi* | [**listConnections**](docs/AccountsApi.md#listconnections) | **GET** /v1/connections | List OAuth-connected API platforms.
*AccountsApi* | [**updateConnectionEmailImap**](docs/AccountsApi.md#updateconnectionemailimap) | **PATCH** /v1/connections/email/imap/{id} | Edit an IMAP mailbox connection.
*AccountsApi* | [**updatePlatformPreference**](docs/AccountsApi.md#updateplatformpreference) | **PATCH** /v1/platforms/{platform}/preferences | Update per-platform connection preferences.
*ActivityApi* | [**getActionLog**](docs/ActivityApi.md#getactionlog) | **GET** /v1/action-log/{id} | Get one action-log event by id (ownership-checked).
*ActivityApi* | [**getActionLogFacet**](docs/ActivityApi.md#getactionlogfacet) | **GET** /v1/action-log/facets | Distinct platforms / actions / categories present in the caller's action log (last 90 days) — powers filter dropdowns before you query.
*ActivityApi* | [**listActionLog**](docs/ActivityApi.md#listactionlog) | **GET** /v1/action-log | List action-log events — the semantic \"what happened\" record of every user + platform action. Filter by platform / action / category / status / source / target, and a since/until created_at window.
*ActivityApi* | [**listActionLogCalls**](docs/ActivityApi.md#listactionlogcalls) | **GET** /v1/action-log/{id}/calls | The outbound platform HTTP calls under an event (oldest first) — url, method, status, latency, redacted request/response bodies, proxy + recipe/hash. Answers \"what was sent / what went wrong\".
*AdsApi* | [**createAdOffsiteCampaign**](docs/AdsApi.md#createadoffsitecampaign) | **POST** /v1/ads/offsite/campaigns | Launch an offsite campaign for an item.
*AdsApi* | [**createAdOffsiteResume**](docs/AdsApi.md#createadoffsiteresume) | **POST** /v1/ads/offsite/resume | Clear an auto-pause and resume offsite spend.
*AdsApi* | [**getAdOffsite**](docs/AdsApi.md#getadoffsite) | **GET** /v1/ads/offsite | Your offsite-ads opt-in and its terms.
*AdsApi* | [**getAdOffsiteEligibility**](docs/AdsApi.md#getadoffsiteeligibility) | **GET** /v1/ads/offsite/eligibility | Whether an item can run offsite, and why not.
*AdsApi* | [**getAdOffsiteReport**](docs/AdsApi.md#getadoffsitereport) | **GET** /v1/ads/offsite/report | What your offsite budget bought — including the misses.
*AdsApi* | [**updateAdOffsite**](docs/AdsApi.md#updateadoffsite) | **PUT** /v1/ads/offsite | Turn offsite ads on or off. Yours alone to set.
*AnalyticsApi* | [**getAnalyticBookkeeping**](docs/AnalyticsApi.md#getanalyticbookkeeping) | **GET** /v1/analytics/bookkeeping | Monthly P&L + per-platform breakdown for a calendar year.
*AnalyticsApi* | [**getAnalyticByPlatform**](docs/AnalyticsApi.md#getanalyticbyplatform) | **GET** /v1/analytics/by-platform | Sales + revenue grouped by platform for the last N days.
*AnalyticsApi* | [**getAnalyticDashboard**](docs/AnalyticsApi.md#getanalyticdashboard) | **GET** /v1/analytics/dashboard | Composite dashboard: KPIs + breakdowns + recent activity.
*AnalyticsApi* | [**getAnalyticItem**](docs/AnalyticsApi.md#getanalyticitem) | **GET** /v1/analytics/items | Per-item P&L for sold inventory.
*AnalyticsApi* | [**getAnalyticSummary**](docs/AnalyticsApi.md#getanalyticsummary) | **GET** /v1/analytics/summary | Headline KPIs for the last N days.
*AnalyticsApi* | [**getAnalyticTimesery**](docs/AnalyticsApi.md#getanalytictimesery) | **GET** /v1/analytics/timeseries | Daily sales + revenue series for the last N days.
*AnalyticsApi* | [**getAnalyticToday**](docs/AnalyticsApi.md#getanalytictoday) | **GET** /v1/analytics/today | Today's checklist + 14-day activity streak.
*AnalyticsApi* | [**listInsightByPlatform**](docs/AnalyticsApi.md#listinsightbyplatform) | **GET** /v1/insights/by-platform | Platform velocity + margin insight (90-day window).
*AutomationApi* | [**createAutomationRule**](docs/AutomationApi.md#createautomationrule) | **POST** /v1/automation/rules | Create an automation rule.
*AutomationApi* | [**createAutomationRuleImport**](docs/AutomationApi.md#createautomationruleimport) | **POST** /v1/automation/rules/import | Import one or more rules from recipe JSON (single or bundle).
*AutomationApi* | [**createAutomationRuleRunNow**](docs/AutomationApi.md#createautomationrulerunnow) | **POST** /v1/automation/rules/{id}/run-now | Fire an automation rule immediately.
*AutomationApi* | [**createAutomationRuleToggle**](docs/AutomationApi.md#createautomationruletoggle) | **POST** /v1/automation/rules/{id}/toggle | Flip an automation rule between active and inactive.
*AutomationApi* | [**createAutomationRuleValidateRecipe**](docs/AutomationApi.md#createautomationrulevalidaterecipe) | **POST** /v1/automation/rules/validate-recipe | Dry-run validate one or more recipes against the live catalog.
*AutomationApi* | [**deleteAutomationRule**](docs/AutomationApi.md#deleteautomationrule) | **DELETE** /v1/automation/rules/{id} | Delete an automation rule.
*AutomationApi* | [**getAutomationCatalog**](docs/AutomationApi.md#getautomationcatalog) | **GET** /v1/automation/catalog | Supported triggerType / actionType / conditionType values for automation rules.
*AutomationApi* | [**getAutomationRule**](docs/AutomationApi.md#getautomationrule) | **GET** /v1/automation/rules/{id} | Get a single automation rule.
*AutomationApi* | [**getAutomationRuleExport**](docs/AutomationApi.md#getautomationruleexport) | **GET** /v1/automation/rules/export | Export the user's full rule library as a portable recipe bundle.
*AutomationApi* | [**getAutomationRuleExportById**](docs/AutomationApi.md#getautomationruleexportbyid) | **GET** /v1/automation/rules/{id}/export | Export a single automation rule as a portable recipe.
*AutomationApi* | [**listAutomationRules**](docs/AutomationApi.md#listautomationrules) | **GET** /v1/automation/rules | List automation rules.
*AutomationApi* | [**listAutomationRuns**](docs/AutomationApi.md#listautomationruns) | **GET** /v1/automation/runs | Per-fire history for automation rules and workflow chain runs.
*AutomationApi* | [**updateAutomationRule**](docs/AutomationApi.md#updateautomationrule) | **PUT** /v1/automation/rules/{id} | Update an automation rule (full replace).
*BillingApi* | [**createBillingUpgrade**](docs/BillingApi.md#createbillingupgrade) | **POST** /v1/billing/upgrade | Start an upgrade to a higher plan.
*CBXApi* | [**createCbxAccrual**](docs/CBXApi.md#createcbxaccrual) | **POST** /v1/cbx/accruals | Record cashback a user earned, in cents.
*CBXApi* | [**createCbxAccrualPurchase**](docs/CBXApi.md#createcbxaccrualpurchase) | **POST** /v1/cbx/accruals/purchase | Accrue cashback for an order at the resolved rate.
*CBXApi* | [**createCbxAccrualReverse**](docs/CBXApi.md#createcbxaccrualreverse) | **POST** /v1/cbx/accruals/{accrualId}/reverse | Claw back a pending accrual — a refund, a cancellation, fraud.
*CBXApi* | [**createCbxAdCreditPurchase**](docs/CBXApi.md#createcbxadcreditpurchase) | **POST** /v1/cbx/ad-credit/purchase | Claim ad credit against a CBX transfer you sent.
*CBXApi* | [**createCbxAdCreditQuote**](docs/CBXApi.md#createcbxadcreditquote) | **POST** /v1/cbx/ad-credit/quote | What a given number of tokens buys in ad credit.
*CBXApi* | [**createCbxAdCreditSpend**](docs/CBXApi.md#createcbxadcreditspend) | **POST** /v1/cbx/ad-credit/spend | Consume credit for a billing period.
*CBXApi* | [**createCbxBoost**](docs/CBXApi.md#createcbxboost) | **POST** /v1/cbx/boosts | Fund elevated cashback on matching items.
*CBXApi* | [**createCbxBoostPause**](docs/CBXApi.md#createcbxboostpause) | **POST** /v1/cbx/boosts/{boostId}/pause | Stop a boost from matching further orders.
*CBXApi* | [**createCbxCampaign**](docs/CBXApi.md#createcbxcampaign) | **POST** /v1/cbx/campaigns | Create a campaign in draft.
*CBXApi* | [**createCbxCampaignApprove**](docs/CBXApi.md#createcbxcampaignapprove) | **POST** /v1/cbx/campaigns/{campaignId}/approve | Approve the previewed recipient list.
*CBXApi* | [**createCbxCampaignExecute**](docs/CBXApi.md#createcbxcampaignexecute) | **POST** /v1/cbx/campaigns/{campaignId}/execute | Pay an approved campaign.
*CBXApi* | [**createCbxCampaignPreview**](docs/CBXApi.md#createcbxcampaignpreview) | **POST** /v1/cbx/campaigns/{campaignId}/preview | Compute the recipient list without paying it.
*CBXApi* | [**createCbxClaim**](docs/CBXApi.md#createcbxclaim) | **POST** /v1/cbx/claims | Reserve a claim. Debits the balance and queues the transfer.
*CBXApi* | [**createCbxClaimQuote**](docs/CBXApi.md#createcbxclaimquote) | **POST** /v1/cbx/claims/quote | What a claim would cost, without committing to it.
*CBXApi* | [**createCbxClaimSend**](docs/CBXApi.md#createcbxclaimsend) | **POST** /v1/cbx/claims/{claimId}/send | Send a reserved claim on chain.
*CBXApi* | [**createCbxCreditDraw**](docs/CBXApi.md#createcbxcreditdraw) | **POST** /v1/cbx/credit/draw | Draw against a line, receiving grant credit.
*CBXApi* | [**createCbxCreditFreeze**](docs/CBXApi.md#createcbxcreditfreeze) | **POST** /v1/cbx/credit/freeze | Stop new draws. Leaves the drawn balance on its terms.
*CBXApi* | [**createCbxCreditRefresh**](docs/CBXApi.md#createcbxcreditrefresh) | **POST** /v1/cbx/credit/refresh | Recompute a limit from trading history and stake.
*CBXApi* | [**createCbxCreditRepay**](docs/CBXApi.md#createcbxcreditrepay) | **POST** /v1/cbx/credit/repay | Apply a repayment to a line.
*CBXApi* | [**createCbxDisbursementRule**](docs/CBXApi.md#createcbxdisbursementrule) | **POST** /v1/cbx/disbursement-rules | Fire a distribution when the events pool crosses a threshold.
*CBXApi* | [**createCbxDisbursementRuleActive**](docs/CBXApi.md#createcbxdisbursementruleactive) | **POST** /v1/cbx/disbursement-rules/{ruleId}/active | Enable or disable a rule.
*CBXApi* | [**createCbxDisbursementRuleCheck**](docs/CBXApi.md#createcbxdisbursementrulecheck) | **POST** /v1/cbx/disbursement-rules/{ruleId}/check | Evaluate a rule now. Fires it if every gate passes.
*CBXApi* | [**createCbxEarnTier**](docs/CBXApi.md#createcbxearntier) | **POST** /v1/cbx/earn-tiers | Define an earn term.
*CBXApi* | [**createCbxRateQuote**](docs/CBXApi.md#createcbxratequote) | **POST** /v1/cbx/rates/quote | What would this order earn, and why.
*CBXApi* | [**createCbxRedemption**](docs/CBXApi.md#createcbxredemption) | **POST** /v1/cbx/redemptions | Pay for a service in CBX.
*CBXApi* | [**createCbxRedemptionQuote**](docs/CBXApi.md#createcbxredemptionquote) | **POST** /v1/cbx/redemptions/quote | What a service costs in tokens right now.
*CBXApi* | [**createCbxRevenueSweep**](docs/CBXApi.md#createcbxrevenuesweep) | **POST** /v1/cbx/revenue/sweep | Move accrued revenue from the reserve to your revenue wallet.
*CBXApi* | [**createCbxSpend**](docs/CBXApi.md#createcbxspend) | **POST** /v1/cbx/spends | Redeem a user's CBX against an order.
*CBXApi* | [**createCbxSpendReverse**](docs/CBXApi.md#createcbxspendreverse) | **POST** /v1/cbx/spends/{externalId}/reverse | Refund a spend — give the tokens back and claw the skim back.
*CBXApi* | [**createCbxStakeTier**](docs/CBXApi.md#createcbxstaketier) | **POST** /v1/cbx/stake-tiers | Define a staking tier.
*CBXApi* | [**createCbxSubject**](docs/CBXApi.md#createcbxsubject) | **POST** /v1/cbx/subjects | Map one of your user ids to a CBX subject.
*CBXApi* | [**createCbxSubjectGrant**](docs/CBXApi.md#createcbxsubjectgrant) | **POST** /v1/cbx/subjects/{subjectId}/grants | Issue grant credit — in-platform, non-withdrawable.
*CBXApi* | [**createCbxSubjectSpendPlan**](docs/CBXApi.md#createcbxsubjectspendplan) | **POST** /v1/cbx/subjects/{subjectId}/spend-plan | Which balances would pay for a spend, and in what order.
*CBXApi* | [**createCbxSubjectStake**](docs/CBXApi.md#createcbxsubjectstake) | **POST** /v1/cbx/subjects/{subjectId}/stake | Lock a subject's tokens for a tier.
*CBXApi* | [**createCbxSubjectStakeUnstake**](docs/CBXApi.md#createcbxsubjectstakeunstake) | **POST** /v1/cbx/subjects/{subjectId}/stake/unstake | Start the cooldown. Tokens unlock when it elapses.
*CBXApi* | [**createCbxWalletChallenge**](docs/CBXApi.md#createcbxwalletchallenge) | **POST** /v1/cbx/wallets/challenge | Start wallet verification. Returns a message for the user to sign.
*CBXApi* | [**createCbxWalletPaymentConfirm**](docs/CBXApi.md#createcbxwalletpaymentconfirm) | **POST** /v1/cbx/wallet-payments/confirm | Present the signature. Returns a ship / do-not-ship decision.
*CBXApi* | [**createCbxWalletPaymentQuote**](docs/CBXApi.md#createcbxwalletpaymentquote) | **POST** /v1/cbx/wallet-payments/quote | Build a transfer for the buyer to sign themselves.
*CBXApi* | [**createCbxWalletPaymentResolve**](docs/CBXApi.md#createcbxwalletpaymentresolve) | **POST** /v1/cbx/wallet-payments/{paymentId}/resolve | A human decides on a held payment.
*CBXApi* | [**createCbxWalletVerify**](docs/CBXApi.md#createcbxwalletverify) | **POST** /v1/cbx/wallets/verify | Complete wallet verification with the user's signature.
*CBXApi* | [**getCbxAdCredit**](docs/CBXApi.md#getcbxadcredit) | **GET** /v1/cbx/ad-credit | Unspent advertising credit, in cents.
*CBXApi* | [**getCbxClaim**](docs/CBXApi.md#getcbxclaim) | **GET** /v1/cbx/claims/{claimId} | A claim's current state.
*CBXApi* | [**getCbxCredit**](docs/CBXApi.md#getcbxcredit) | **GET** /v1/cbx/credit | A seller's wholesale credit line.
*CBXApi* | [**getCbxMe**](docs/CBXApi.md#getcbxme) | **GET** /v1/cbx/me | Identity check — which merchant this key belongs to, and its terms.
*CBXApi* | [**getCbxPool**](docs/CBXApi.md#getcbxpool) | **GET** /v1/cbx/pool | Your events-pool balance.
*CBXApi* | [**getCbxRevenue**](docs/CBXApi.md#getcbxrevenue) | **GET** /v1/cbx/revenue | Operator revenue accrued and not yet withdrawn.
*CBXApi* | [**getCbxSubjectBalance**](docs/CBXApi.md#getcbxsubjectbalance) | **GET** /v1/cbx/subjects/{subjectId}/balance | What a subject holds: pending cents and available CBX.
*CBXApi* | [**getCbxSubjectBalanceBySubjectId**](docs/CBXApi.md#getcbxsubjectbalancebysubjectid) | **GET** /v1/cbx/subjects/{subjectId}/balances | All three balances a subject holds.
*CBXApi* | [**getCbxSubjectSpent**](docs/CBXApi.md#getcbxsubjectspent) | **GET** /v1/cbx/subjects/{subjectId}/spent | Total CBX a subject has spent in your marketplace.
*CBXApi* | [**getCbxSubjectStake**](docs/CBXApi.md#getcbxsubjectstake) | **GET** /v1/cbx/subjects/{subjectId}/stake | A subject's staking state and spendable balance.
*CBXApi* | [**getCbxSubjectWallet**](docs/CBXApi.md#getcbxsubjectwallet) | **GET** /v1/cbx/subjects/{subjectId}/wallet | The verified payout address for a subject, if any.
*CBXApi* | [**getCbxTreasury**](docs/CBXApi.md#getcbxtreasury) | **GET** /v1/cbx/treasury | Your most recent reserve reconciliation.
*CBXApi* | [**listCbxAdCreditLedger**](docs/CBXApi.md#listcbxadcreditledger) | **GET** /v1/cbx/ad-credit/ledger | Ad-credit movements, newest first.
*CBXApi* | [**listCbxBoosts**](docs/CBXApi.md#listcbxboosts) | **GET** /v1/cbx/boosts | Your funded cashback boosts, newest first.
*CBXApi* | [**listCbxCampaignPayouts**](docs/CBXApi.md#listcbxcampaignpayouts) | **GET** /v1/cbx/campaigns/{campaignId}/payouts | What a campaign actually paid, with the weight behind each amount.
*CBXApi* | [**listCbxCampaigns**](docs/CBXApi.md#listcbxcampaigns) | **GET** /v1/cbx/campaigns | Your campaigns, newest first.
*CBXApi* | [**listCbxDisbursementProgress**](docs/CBXApi.md#listcbxdisbursementprogress) | **GET** /v1/cbx/disbursement-progress | How close each rule is to firing — the public counter.
*CBXApi* | [**listCbxDisbursementRules**](docs/CBXApi.md#listcbxdisbursementrules) | **GET** /v1/cbx/disbursement-rules | Threshold rules that fire community distributions.
*CBXApi* | [**listCbxEarnTiers**](docs/CBXApi.md#listcbxearntiers) | **GET** /v1/cbx/earn-tiers | Earn terms on offer — longer maturation, higher rate.
*CBXApi* | [**listCbxRedemptionServices**](docs/CBXApi.md#listcbxredemptionservices) | **GET** /v1/cbx/redemptions/services | Services payable in CBX, and the discount each carries.
*CBXApi* | [**listCbxStakeTiers**](docs/CBXApi.md#listcbxstaketiers) | **GET** /v1/cbx/stake-tiers | Staking tiers — what locking tokens buys.
*CBXApi* | [**listCbxSubjectGrants**](docs/CBXApi.md#listcbxsubjectgrants) | **GET** /v1/cbx/subjects/{subjectId}/grants | Live grants, soonest-expiring first.
*CBXApi* | [**listCbxSubjectLedger**](docs/CBXApi.md#listcbxsubjectledger) | **GET** /v1/cbx/subjects/{subjectId}/ledger | A subject's CBX ledger, newest first.
*CBXApi* | [**listCbxWalletPaymentReview**](docs/CBXApi.md#listcbxwalletpaymentreview) | **GET** /v1/cbx/wallet-payments/review | Payments held for a human — the ops queue.
*CatalogApi* | [**getCatalogLookup**](docs/CatalogApi.md#getcataloglookup) | **GET** /v1/catalog/lookup | Live Crossly offers for a product identifier (barcode, style code, LEGO set…).
*CompWatchlistsApi* | [**createCompWatchlist**](docs/CompWatchlistsApi.md#createcompwatchlist) | **POST** /v1/comp-watchlists | Create a sold-comp watchlist.
*CompWatchlistsApi* | [**createCompWatchlistScrape**](docs/CompWatchlistsApi.md#createcompwatchlistscrape) | **POST** /v1/comp-watchlists/{id}/scrape | Manually trigger a watchlist scrape.
*CompWatchlistsApi* | [**deleteCompWatchlist**](docs/CompWatchlistsApi.md#deletecompwatchlist) | **DELETE** /v1/comp-watchlists/{id} | Delete a sold-comp watchlist.
*CompWatchlistsApi* | [**listCompWatchlistRecent**](docs/CompWatchlistsApi.md#listcompwatchlistrecent) | **GET** /v1/comp-watchlists/{id}/recent | Recent external sold comps matching this watchlist.
*CompWatchlistsApi* | [**listCompWatchlists**](docs/CompWatchlistsApi.md#listcompwatchlists) | **GET** /v1/comp-watchlists | List the seller's sold-comp watchlists.
*ConnectionsApi* | [**getConnectionHealth**](docs/ConnectionsApi.md#getconnectionhealth) | **GET** /v1/connection-health | Health of each connected marketplace account, with a plain-English diagnosis.
*ConnectionsApi* | [**listDevices**](docs/ConnectionsApi.md#listdevices) | **GET** /v1/devices | Machines paired to this account, and what each can do.
*CustomersApi* | [**createCustomerBulkDelete**](docs/CustomersApi.md#createcustomerbulkdelete) | **POST** /v1/customers/bulk-delete | Bulk blocklist customer handles.
*CustomersApi* | [**createCustomerBulkExport**](docs/CustomersApi.md#createcustomerbulkexport) | **POST** /v1/customers/bulk-export | Bulk export aggregated customers as CSV.
*CustomersApi* | [**getCustomer**](docs/CustomersApi.md#getcustomer) | **GET** /v1/customers/{handle} | Get one customer with their recent 50 orders.
*CustomersApi* | [**listCustomers**](docs/CustomersApi.md#listcustomers) | **GET** /v1/customers | List aggregated customers (group-by lower(buyer_username)).
*DefaultApi* | [**getListingVariationGroup**](docs/DefaultApi.md#getlistingvariationgroup) | **GET** /v1/listings/{id}/variation-group | 
*DefaultApi* | [**getMarketProduct**](docs/DefaultApi.md#getmarketproduct) | **GET** /v1/market/products/{id} | 
*DefaultApi* | [**getMarketVariantBook**](docs/DefaultApi.md#getmarketvariantbook) | **GET** /v1/market/variants/{id}/book | 
*DefaultApi* | [**getVariationGroup**](docs/DefaultApi.md#getvariationgroup) | **GET** /v1/variation-groups/{id} | 
*DefaultApi* | [**getVariationGroupPublishPlan**](docs/DefaultApi.md#getvariationgrouppublishplan) | **GET** /v1/variation-groups/{id}/publish-plan | 
*DefaultApi* | [**listMarketGraders**](docs/DefaultApi.md#listmarketgraders) | **GET** /v1/market/graders | 
*DefaultApi* | [**listMarketProducts**](docs/DefaultApi.md#listmarketproducts) | **GET** /v1/market/products | 
*DefaultApi* | [**listMarketVariantTiers**](docs/DefaultApi.md#listmarketvarianttiers) | **GET** /v1/market/variants/{id}/tiers | 
*DefaultApi* | [**listVariationGroups**](docs/DefaultApi.md#listvariationgroups) | **GET** /v1/variation-groups | 
*EmbedsApi* | [**createEmbedKey**](docs/EmbedsApi.md#createembedkey) | **POST** /v1/embeds/keys | Mint a publishable key for a site.
*EmbedsApi* | [**deleteEmbedKey**](docs/EmbedsApi.md#deleteembedkey) | **DELETE** /v1/embeds/keys/{id} | Revoke a publishable key.
*EmbedsApi* | [**listEmbedKeys**](docs/EmbedsApi.md#listembedkeys) | **GET** /v1/embeds/keys | Your publishable keys.
*ImportsApi* | [**createImport**](docs/ImportsApi.md#createimport) | **POST** /v1/imports | Start a bulk-import job for an existing platform connection.
*ImportsApi* | [**getImport**](docs/ImportsApi.md#getimport) | **GET** /v1/imports/{id} | Get one import job.
*ImportsApi* | [**listImports**](docs/ImportsApi.md#listimports) | **GET** /v1/imports | List bulk-import jobs.
*InboxApi* | [**createInboxAiSuggest**](docs/InboxApi.md#createinboxaisuggest) | **POST** /v1/inbox/ai-suggest | AI reply suggestion for a conversation.
*InboxApi* | [**createInboxCannedRespons**](docs/InboxApi.md#createinboxcannedrespons) | **POST** /v1/inbox/canned-responses | Create a canned response.
*InboxApi* | [**createInboxConversationBulk**](docs/InboxApi.md#createinboxconversationbulk) | **POST** /v1/inbox/conversations/bulk | Bulk mark read / mark unread / soft-delete conversations.
*InboxApi* | [**createInboxConversationBulkAiRespond**](docs/InboxApi.md#createinboxconversationbulkairespond) | **POST** /v1/inbox/conversations/bulk-ai-respond | AI reply suggestion for multiple conversations — draft or send.
*InboxApi* | [**createInboxConversationOfferAction**](docs/InboxApi.md#createinboxconversationofferaction) | **POST** /v1/inbox/conversations/{id}/offer-action | Accept / counter / decline an active offer on a conversation.
*InboxApi* | [**createInboxMessageTriage**](docs/InboxApi.md#createinboxmessagetriage) | **POST** /v1/inbox/messages/{id}/triage | Manually re-triage a buyer message.
*InboxApi* | [**createInboxOffer**](docs/InboxApi.md#createinboxoffer) | **POST** /v1/inbox/{id}/offer | Accept, counter, or decline an offer on a conversation.
*InboxApi* | [**createInboxReply**](docs/InboxApi.md#createinboxreply) | **POST** /v1/inbox/{id}/reply | Send a reply to a conversation thread.
*InboxApi* | [**deleteInboxCannedRespons**](docs/InboxApi.md#deleteinboxcannedrespons) | **DELETE** /v1/inbox/canned-responses/{id} | Delete a canned response.
*InboxApi* | [**getInbox**](docs/InboxApi.md#getinbox) | **GET** /v1/inbox/{id} | Get one conversation with its messages.
*InboxApi* | [**getInboxCannedRespons**](docs/InboxApi.md#getinboxcannedrespons) | **GET** /v1/inbox/canned-responses | List canned responses.
*InboxApi* | [**getInboxConversationMessage**](docs/InboxApi.md#getinboxconversationmessage) | **GET** /v1/inbox/conversations/{id}/messages | Paginated messages for a conversation.
*InboxApi* | [**getInboxConversationUnreadCount**](docs/InboxApi.md#getinboxconversationunreadcount) | **GET** /v1/inbox/conversations/unread-count | Sidebar badge: unread conversation count.
*InboxApi* | [**listInbox**](docs/InboxApi.md#listinbox) | **GET** /v1/inbox | List conversations.
*InboxApi* | [**updateInboxCannedRespons**](docs/InboxApi.md#updateinboxcannedrespons) | **PUT** /v1/inbox/canned-responses/{id} | Update a canned response.
*InboxApi* | [**updateInboxConversation**](docs/InboxApi.md#updateinboxconversation) | **PATCH** /v1/inbox/conversations/{id} | Mark read / change status / close conversation.
*IntegrationsApi* | [**createNotificationIntegration**](docs/IntegrationsApi.md#createnotificationintegration) | **POST** /v1/notification-integrations | Add a Slack/Discord/Webhook destination.
*IntegrationsApi* | [**createNotificationIntegrationTest**](docs/IntegrationsApi.md#createnotificationintegrationtest) | **POST** /v1/notification-integrations/{id}/test | Fire a canned test message to a notification destination.
*IntegrationsApi* | [**deleteNotificationIntegration**](docs/IntegrationsApi.md#deletenotificationintegration) | **DELETE** /v1/notification-integrations/{id} | Delete a notification destination.
*IntegrationsApi* | [**listNotificationIntegrations**](docs/IntegrationsApi.md#listnotificationintegrations) | **GET** /v1/notification-integrations | List Slack/Discord/Webhook destinations for notify.* automation actions.
*IntegrationsApi* | [**updateNotificationIntegration**](docs/IntegrationsApi.md#updatenotificationintegration) | **PATCH** /v1/notification-integrations/{id} | Edit a notification destination.
*InventoryApi* | [**createInventory**](docs/InventoryApi.md#createinventory) | **POST** /v1/inventory | Create a new inventory item.
*InventoryApi* | [**createInventoryBulkArchive**](docs/InventoryApi.md#createinventorybulkarchive) | **POST** /v1/inventory/bulk-archive | Bulk archive inventory items (soft).
*InventoryApi* | [**createInventoryBulkDelete**](docs/InventoryApi.md#createinventorybulkdelete) | **POST** /v1/inventory/bulk-delete | Bulk delete inventory items (delinks listings).
*InventoryApi* | [**createInventoryBulkLabel**](docs/InventoryApi.md#createinventorybulklabel) | **POST** /v1/inventory/bulk-labels | Bulk add/remove labels on inventory items.
*InventoryApi* | [**createInventoryBulkQuantity**](docs/InventoryApi.md#createinventorybulkquantity) | **POST** /v1/inventory/bulk-quantity | Set / add / subtract stock across many items, syncing live listings.
*InventoryApi* | [**createInventoryCsvExport**](docs/InventoryApi.md#createinventorycsvexport) | **POST** /v1/inventory/csv/export | Export inventory as CSV. Round-trips back through csv/import.
*InventoryApi* | [**createInventoryCsvImport**](docs/InventoryApi.md#createinventorycsvimport) | **POST** /v1/inventory/csv/import | Import a CSV. Rows whose sku matches an existing item update it; others are added. Pass dryRun to preview.
*InventoryApi* | [**createInventoryLabelRename**](docs/InventoryApi.md#createinventorylabelrename) | **POST** /v1/inventory/labels/rename | Rename a label across every inventory item.
*InventoryApi* | [**createInventoryUnitIdentifier**](docs/InventoryApi.md#createinventoryunitidentifier) | **POST** /v1/inventory/{id}/units/identifiers | Record a serial, IMEI, or licence key against an inventory item.
*InventoryApi* | [**createInventoryUnitLookup**](docs/InventoryApi.md#createinventoryunitlookup) | **POST** /v1/inventory/units/lookup | Find a unit by identifier.
*InventoryApi* | [**deleteInventory**](docs/InventoryApi.md#deleteinventory) | **DELETE** /v1/inventory/{id} | Soft-archive an inventory item.
*InventoryApi* | [**getInventory**](docs/InventoryApi.md#getinventory) | **GET** /v1/inventory/{id} | Get one inventory item with platform listings.
*InventoryApi* | [**getInventoryFacet**](docs/InventoryApi.md#getinventoryfacet) | **GET** /v1/inventory/facets | Distinct brands + categories across this user's inventory.
*InventoryApi* | [**getInventoryLabel**](docs/InventoryApi.md#getinventorylabel) | **GET** /v1/inventory/labels | List every distinct label across this user's inventory.
*InventoryApi* | [**getInventoryLabelStat**](docs/InventoryApi.md#getinventorylabelstat) | **GET** /v1/inventory/labels/stats | List distinct labels with usage counts + colors.
*InventoryApi* | [**getInventorySkuExist**](docs/InventoryApi.md#getinventoryskuexist) | **GET** /v1/inventory/sku-exists | Check whether a SKU is already in use on this user's inventory.
*InventoryApi* | [**getSpatialPublic**](docs/InventoryApi.md#getspatialpublic) | **GET** /v1/spatial/public/{slug} | A shared room, as a visitor sees it.
*InventoryApi* | [**getSpatialScene**](docs/InventoryApi.md#getspatialscene) | **GET** /v1/spatial/scenes/{id} | A solved room: every item, where it sits, and why.
*InventoryApi* | [**listInventory**](docs/InventoryApi.md#listinventory) | **GET** /v1/inventory | List inventory items.
*InventoryApi* | [**listInventoryActivity**](docs/InventoryApi.md#listinventoryactivity) | **GET** /v1/inventory/{id}/activity | Activity log for an inventory item (created/sold/edited/etc.).
*InventoryApi* | [**listInventoryIds**](docs/InventoryApi.md#listinventoryids) | **GET** /v1/inventory/ids | Filter inventory → return matching id list.
*InventoryApi* | [**listInventoryUnits**](docs/InventoryApi.md#listinventoryunits) | **GET** /v1/inventory/{id}/units | List the individually identified units of an inventory item.
*InventoryApi* | [**listSpatialPublic**](docs/InventoryApi.md#listspatialpublic) | **GET** /v1/spatial/public | Public rooms anyone can walk into.
*InventoryApi* | [**listSpatialPublicOffers**](docs/InventoryApi.md#listspatialpublicoffers) | **GET** /v1/spatial/public/{slug}/offers | What is for sale in a shared room.
*InventoryApi* | [**listSpatialSceneMovements**](docs/InventoryApi.md#listspatialscenemovements) | **GET** /v1/spatial/scenes/{id}/movements | Stock movements in a room over a time window.
*InventoryApi* | [**listSpatialScenes**](docs/InventoryApi.md#listspatialscenes) | **GET** /v1/spatial/scenes | The rooms this account has.
*InventoryApi* | [**updateInventory**](docs/InventoryApi.md#updateinventory) | **PATCH** /v1/inventory/{id} | Update an inventory item (partial).
*ListingsApi* | [**createListing**](docs/ListingsApi.md#createlisting) | **POST** /v1/listings | Create a listing and fan out crosspost jobs across platforms.
*ListingsApi* | [**createListingBulkCheckStatus**](docs/ListingsApi.md#createlistingbulkcheckstatus) | **POST** /v1/listings/bulk-check-status | Check listing status on platforms
*ListingsApi* | [**createListingBulkCrosspost**](docs/ListingsApi.md#createlistingbulkcrosspost) | **POST** /v1/listings/bulk-crosspost | Bulk crosspost (no delist phase)
*ListingsApi* | [**createListingBulkDelete**](docs/ListingsApi.md#createlistingbulkdelete) | **POST** /v1/listings/bulk-delete | Bulk archive + delist
*ListingsApi* | [**createListingBulkDelist**](docs/ListingsApi.md#createlistingbulkdelist) | **POST** /v1/listings/bulk-delist | Bulk delist from platforms
*ListingsApi* | [**createListingBulkDelistPreview**](docs/ListingsApi.md#createlistingbulkdelistpreview) | **POST** /v1/listings/bulk-delist-preview | Preview which marketplaces a delist would touch
*ListingsApi* | [**createListingBulkHardDelete**](docs/ListingsApi.md#createlistingbulkharddelete) | **POST** /v1/listings/bulk-hard-delete | Permanently delete archived listings
*ListingsApi* | [**createListingBulkRelist**](docs/ListingsApi.md#createlistingbulkrelist) | **POST** /v1/listings/bulk-relist | Bulk relist across platforms
*ListingsApi* | [**createListingBulkUpdate**](docs/ListingsApi.md#createlistingbulkupdate) | **POST** /v1/listings/bulk-update | Bulk update listing fields
*ListingsApi* | [**createListingById**](docs/ListingsApi.md#createlistingbyid) | **POST** /v1/listings/by-ids | Fetch hydrated listings by ID
*ListingsApi* | [**createListingCheckDuplicate**](docs/ListingsApi.md#createlistingcheckduplicate) | **POST** /v1/listings/check-duplicates | Check whether the seller already owns something matching this title/photo, and what to do about it.
*ListingsApi* | [**createListingCombine**](docs/ListingsApi.md#createlistingcombine) | **POST** /v1/listings/combine | Combine duplicate listings into one: sums their stock, delists and archives the rest.
*ListingsApi* | [**createListingDiscrepancyResolve**](docs/ListingsApi.md#createlistingdiscrepancyresolve) | **POST** /v1/listings/{id}/discrepancies/{discrepancyId}/resolve | Resolve a detected marketplace-drift discrepancy: accept the platform value, push ours back, relist to apply it, or dismiss.
*ListingsApi* | [**createListingImportByUrl**](docs/ListingsApi.md#createlistingimportbyurl) | **POST** /v1/listings/{id}/import-by-url | Attach a real platform listing to this listing by pasting its live URL.
*ListingsApi* | [**createListingMagicFill**](docs/ListingsApi.md#createlistingmagicfill) | **POST** /v1/listings/{id}/magic-fill | Auto-fill empty fields on one platform tab from the master listing + AI/deterministic taxonomy resolution.
*ListingsApi* | [**deleteListing**](docs/ListingsApi.md#deletelisting) | **DELETE** /v1/listings/{id} | Delist a listing (optionally narrowed to specific platforms via ?platforms=).
*ListingsApi* | [**getListing**](docs/ListingsApi.md#getlisting) | **GET** /v1/listings/{id} | Get one listing with its platform rows.
*ListingsApi* | [**getListingFacet**](docs/ListingsApi.md#getlistingfacet) | **GET** /v1/listings/facets | Distinct brands + categories across listings + inventory.
*ListingsApi* | [**getListingSkuExist**](docs/ListingsApi.md#getlistingskuexist) | **GET** /v1/listings/sku-exists | Check whether a SKU is already used by one of this user's items.
*ListingsApi* | [**listListingDiscrepancies**](docs/ListingsApi.md#listlistingdiscrepancies) | **GET** /v1/listings/{id}/discrepancies | List detected marketplace-drift discrepancies for a listing.
*ListingsApi* | [**listListingIds**](docs/ListingsApi.md#listlistingids) | **GET** /v1/listings/ids | Filter listings → return matching id list (no pagination).
*ListingsApi* | [**listListings**](docs/ListingsApi.md#listlistings) | **GET** /v1/listings | List active platform listings.
*ListingsApi* | [**updateListing**](docs/ListingsApi.md#updatelisting) | **PATCH** /v1/listings/{id} | Edit a listing and fan out update jobs to existing platform listings.
*MagicApi* | [**createMagicScan**](docs/MagicApi.md#createmagicscan) | **POST** /v1/magic/scan | Run a Magic List image scan.
*MagicApi* | [**createMagicScanSynthesize**](docs/MagicApi.md#createmagicscansynthesize) | **POST** /v1/magic/scan/{runId}/synthesize | Synthesize a draft from confirmed matches.
*MagicApi* | [**getMagicDraft**](docs/MagicApi.md#getmagicdraft) | **GET** /v1/magic/drafts/{draftId} | Get a synthesized Magic List draft.
*MagicApi* | [**listMagicRecent**](docs/MagicApi.md#listmagicrecent) | **GET** /v1/magic/recent | Recent Magic List scans for this seller.
*MobileApi* | [**createMobilePushTest**](docs/MobileApi.md#createmobilepushtest) | **POST** /v1/mobile/push-test | Fire a no-op test push to this user's devices.
*MobileApi* | [**createMobilePushToken**](docs/MobileApi.md#createmobilepushtoken) | **POST** /v1/mobile/push-token | Register an Expo push token for this user.
*MobileApi* | [**deleteMobilePushToken**](docs/MobileApi.md#deletemobilepushtoken) | **DELETE** /v1/mobile/push-tokens | Clear ALL registered push tokens for this user.
*MobileApi* | [**listMobilePushTokens**](docs/MobileApi.md#listmobilepushtokens) | **GET** /v1/mobile/push-tokens | List registered Expo push tokens (masked).
*NetworkApi* | [**createNetworkPool**](docs/NetworkApi.md#createnetworkpool) | **POST** /v1/network/pool | Join the Crossly Network reciprocal engagement pool.
*NetworkApi* | [**deleteNetworkPool**](docs/NetworkApi.md#deletenetworkpool) | **DELETE** /v1/network/pool | Leave the Crossly Network pool.
*NetworkApi* | [**getNetworkPool**](docs/NetworkApi.md#getnetworkpool) | **GET** /v1/network/pool | The seller's Crossly Network pool membership row.
*NetworkApi* | [**getNetworkPoolSize**](docs/NetworkApi.md#getnetworkpoolsize) | **GET** /v1/network/pool/size | Total members in the Crossly Network pool.
*NetworkApi* | [**listNetworkPoolLog**](docs/NetworkApi.md#listnetworkpoollog) | **GET** /v1/network/pool/log | Recent engagement history — both sent and received.
*NetworkApi* | [**updateNetworkPool**](docs/NetworkApi.md#updatenetworkpool) | **PATCH** /v1/network/pool | Update per-action toggles + platforms on pool membership.
*OffersApi* | [**createOfferRespond**](docs/OffersApi.md#createofferrespond) | **POST** /v1/offers/{id}/respond | Accept, decline, or counter a buyer offer on a Crossly marketplace listing.
*OffersApi* | [**getOffer**](docs/OffersApi.md#getoffer) | **GET** /v1/offers | List buyer offers on your Crossly marketplace listings, including bundles.
*OrdersApi* | [**createOrderBulkDelete**](docs/OrdersApi.md#createorderbulkdelete) | **POST** /v1/orders/bulk-delete | Bulk soft- or hard-delete orders by id.
*OrdersApi* | [**createOrderBulkExport**](docs/OrdersApi.md#createorderbulkexport) | **POST** /v1/orders/bulk-export | Bulk export selected orders as CSV.
*OrdersApi* | [**createOrderBulkMarkDisputed**](docs/OrdersApi.md#createorderbulkmarkdisputed) | **POST** /v1/orders/bulk-mark-disputed | Bulk mark orders as disputed with a shared reason.
*OrdersApi* | [**createOrderBulkMarkShipped**](docs/OrdersApi.md#createorderbulkmarkshipped) | **POST** /v1/orders/bulk-mark-shipped | Bulk flip status=shipped, clear the reserved-stock marker, and notify each platform.
*OrdersApi* | [**createOrderBulkPackingSlip**](docs/OrdersApi.md#createorderbulkpackingslip) | **POST** /v1/orders/bulk-packing-slips | Bulk packing slips PDF.
*OrdersApi* | [**createOrderCancel**](docs/OrdersApi.md#createordercancel) | **POST** /v1/orders/{id}/cancel | Cancel an order on its marketplace.
*OrdersApi* | [**createOrderDispute**](docs/OrdersApi.md#createorderdispute) | **POST** /v1/orders/{id}/dispute | Flag an order as disputed.
*OrdersApi* | [**createOrderImport**](docs/OrdersApi.md#createorderimport) | **POST** /v1/orders/import | Manually (re-)pull one or more connected platforms' order history for a day-window.
*OrdersApi* | [**createOrderLabel**](docs/OrdersApi.md#createorderlabel) | **POST** /v1/orders/{id}/label | Purchase EasyPost shipping label.
*OrdersApi* | [**createOrderMessage**](docs/OrdersApi.md#createordermessage) | **POST** /v1/orders/{id}/message | Message the order's buyer on the marketplace.
*OrdersApi* | [**createOrderPullPlatformLabel**](docs/OrdersApi.md#createorderpullplatformlabel) | **POST** /v1/orders/{id}/pull-platform-label | Pull a pre-paid label from cookie platforms (Poshmark/Mercari).
*OrdersApi* | [**createOrderRate**](docs/OrdersApi.md#createorderrate) | **POST** /v1/orders/{id}/rates | EasyPost rate quote for an order.
*OrdersApi* | [**createOrderRefund**](docs/OrdersApi.md#createorderrefund) | **POST** /v1/orders/{id}/refund | Issue a full or partial refund on the platform.
*OrdersApi* | [**createOrderTracking**](docs/OrdersApi.md#createordertracking) | **POST** /v1/orders/{id}/tracking | Submit tracking number + carrier and notify the platform.
*OrdersApi* | [**getOrder**](docs/OrdersApi.md#getorder) | **GET** /v1/orders/{id} | Get one order.
*OrdersApi* | [**getOrderCancelEligibility**](docs/OrdersApi.md#getordercanceleligibility) | **GET** /v1/orders/{id}/cancel-eligibility | Whether this order can be cancelled, and which reason codes the marketplace accepts.
*OrdersApi* | [**getOrderCount**](docs/OrdersApi.md#getordercount) | **GET** /v1/orders/counts | Tab badge counts by status.
*OrdersApi* | [**getOrderEvidence**](docs/OrdersApi.md#getorderevidence) | **GET** /v1/orders/{id}/evidence | Everything recorded about how this order was packed and how it arrived.
*OrdersApi* | [**getOrderPackingSlip**](docs/OrdersApi.md#getorderpackingslip) | **GET** /v1/orders/{id}/packing-slip | Single-order packing slip PDF.
*OrdersApi* | [**getOrderProofOfDelivery**](docs/OrdersApi.md#getorderproofofdelivery) | **GET** /v1/orders/{id}/proof-of-delivery | Proof-of-delivery evidence from the carrier's scan record (PDF, or JSON).
*OrdersApi* | [**getOrderShipment**](docs/OrdersApi.md#getordershipment) | **GET** /v1/orders/{id}/shipments | List the parcels an order shipped in.
*OrdersApi* | [**listOrderUnits**](docs/OrdersApi.md#listorderunits) | **GET** /v1/orders/{id}/units | List the identified units that shipped on an order.
*OrdersApi* | [**listOrders**](docs/OrdersApi.md#listorders) | **GET** /v1/orders | List orders.
*OrdersApi* | [**updateOrder**](docs/OrdersApi.md#updateorder) | **PATCH** /v1/orders/{id} | Update order (status, notes, tracking).
*PATApi* | [**createPat**](docs/PATApi.md#createpat) | **POST** /v1/pat | Mint a new PAT. Full token returned ONCE — store it on the client.
*PATApi* | [**deletePat**](docs/PATApi.md#deletepat) | **DELETE** /v1/pat/{id} | Revoke a PAT by id.
*PATApi* | [**getPatScope**](docs/PATApi.md#getpatscope) | **GET** /v1/pat/scopes | List the canonical scope catalog.
*PATApi* | [**listPat**](docs/PATApi.md#listpat) | **GET** /v1/pat | List the caller's PATs (preview only).
*PayoutApi* | [**getPayoutEstimate**](docs/PayoutApi.md#getpayoutestimate) | **GET** /v1/payout/estimate | What one platform nets at a given price, after fees and shipping.
*PayoutApi* | [**getPayoutGrossForNet**](docs/PayoutApi.md#getpayoutgrossfornet) | **GET** /v1/payout/gross-for-net | The gross price needed to clear a target net on one platform.
*PayoutApi* | [**listPayoutCompare**](docs/PayoutApi.md#listpayoutcompare) | **GET** /v1/payout/compare | Rank platforms by what they net at a given price. Defaults to connected ones.
*PolicyPresetsApi* | [**createPolicyPreset**](docs/PolicyPresetsApi.md#createpolicypreset) | **POST** /v1/policy-presets | Create a return / shipping / payment policy preset.
*PolicyPresetsApi* | [**deletePolicyPreset**](docs/PolicyPresetsApi.md#deletepolicypreset) | **DELETE** /v1/policy-presets/{id} | Delete a policy preset.
*PolicyPresetsApi* | [**listPolicyPresets**](docs/PolicyPresetsApi.md#listpolicypresets) | **GET** /v1/policy-presets | List the seller's return / shipping / payment policy presets.
*PolicyPresetsApi* | [**updatePolicyPreset**](docs/PolicyPresetsApi.md#updatepolicypreset) | **PATCH** /v1/policy-presets/{id} | Update a policy preset.
*ProfileApi* | [**updateMe**](docs/ProfileApi.md#updateme) | **PATCH** /v1/me | Update the authenticated user's profile (display name, etc).
*ReferenceApi* | [**getBrand**](docs/ReferenceApi.md#getbrand) | **GET** /v1/brands | Search the Crossly brand index. Returns up to 50 matches.
*ReferenceApi* | [**getCategory**](docs/ReferenceApi.md#getcategory) | **GET** /v1/categories | List Crossly's canonical category tree.
*ReferenceApi* | [**getDepartment**](docs/ReferenceApi.md#getdepartment) | **GET** /v1/departments | Search the eBay-sourced \"Department\" item-specific values.
*ReferenceApi* | [**getGender**](docs/ReferenceApi.md#getgender) | **GET** /v1/genders | Search the eBay-sourced \"Gender\" item-specific values.
*ReferenceApi* | [**getPattern**](docs/ReferenceApi.md#getpattern) | **GET** /v1/patterns | Search the eBay-sourced \"Pattern\" item-specific values.
*ReferenceApi* | [**getSizeSystem**](docs/ReferenceApi.md#getsizesystem) | **GET** /v1/size-systems | Search the Poshmark + Vestiaire size-system union (US/UK/EU/AU/FR/KR).
*ReferenceApi* | [**getStyle**](docs/ReferenceApi.md#getstyle) | **GET** /v1/styles | Search the eBay-sourced \"Style\" item-specific values.
*ReferenceApi* | [**getType**](docs/ReferenceApi.md#gettype) | **GET** /v1/types | Search the eBay-sourced \"Type\" item-specific values.
*RestockPromptsApi* | [**createRestockPromptDismiss**](docs/RestockPromptsApi.md#createrestockpromptdismiss) | **POST** /v1/restock-prompts/{id}/dismiss | Dismiss a pending restock prompt.
*RestockPromptsApi* | [**createRestockPromptRepublish**](docs/RestockPromptsApi.md#createrestockpromptrepublish) | **POST** /v1/restock-prompts/{id}/republish | Republish a restock prompt to platforms.
*RestockPromptsApi* | [**listRestockPrompts**](docs/RestockPromptsApi.md#listrestockprompts) | **GET** /v1/restock-prompts | List pending restock prompts.
*ReturnsApi* | [**createReturn**](docs/ReturnsApi.md#createreturn) | **POST** /v1/returns | Open a return record on an order (rejects if another open return exists).
*ReturnsApi* | [**getReturn**](docs/ReturnsApi.md#getreturn) | **GET** /v1/returns/{id} | Get one return record.
*ReturnsApi* | [**listReturns**](docs/ReturnsApi.md#listreturns) | **GET** /v1/returns | List returns (physical-return workflow). status=open|closed|<exact>.
*ReturnsApi* | [**updateReturn**](docs/ReturnsApi.md#updatereturn) | **PATCH** /v1/returns/{id} | Transition return status (received/inspected/restocked) and bump inventory on restock.
*SalesApi* | [**createSaleBulkDelete**](docs/SalesApi.md#createsalebulkdelete) | **POST** /v1/sales/bulk-delete | Bulk soft-delete sales rows.
*SalesApi* | [**listSales**](docs/SalesApi.md#listsales) | **GET** /v1/sales | List sales (each unique sale event).
*SavedViewsApi* | [**createSavedView**](docs/SavedViewsApi.md#createsavedview) | **POST** /v1/saved-views | Create a saved view preset.
*SavedViewsApi* | [**deleteSavedView**](docs/SavedViewsApi.md#deletesavedview) | **DELETE** /v1/saved-views/{id} | Delete a saved view preset.
*SavedViewsApi* | [**listSavedViews**](docs/SavedViewsApi.md#listsavedviews) | **GET** /v1/saved-views | List the seller's saved view presets.
*SavedViewsApi* | [**updateSavedView**](docs/SavedViewsApi.md#updatesavedview) | **PATCH** /v1/saved-views/{id} | Update a saved view preset.
*SourcingApi* | [**createSourcingReceipt**](docs/SourcingApi.md#createsourcingreceipt) | **POST** /v1/sourcing/receipts | Append a parsed receipt to the sourcing ledger.
*SourcingApi* | [**getSourcingReceipt**](docs/SourcingApi.md#getsourcingreceipt) | **GET** /v1/sourcing/receipts | List parsed sourcing receipts in this user's ledger.
*SourcingApi* | [**listSourcingDemand**](docs/SourcingApi.md#listsourcingdemand) | **GET** /v1/sourcing/demand | Items buyers looked for on other sites that Crossly did not have.
*SourcingApi* | [**listSourcingDemandMine**](docs/SourcingApi.md#listsourcingdemandmine) | **GET** /v1/sourcing/demand/mine | Unmet buyer demand for items you hold or have sold before.
*TaxApi* | [**createMileage**](docs/TaxApi.md#createmileage) | **POST** /v1/mileage | Create a mileage entry.
*TaxApi* | [**deleteMileage**](docs/TaxApi.md#deletemileage) | **DELETE** /v1/mileage/{id} | Delete a mileage entry.
*TaxApi* | [**getMileageSummary**](docs/TaxApi.md#getmileagesummary) | **GET** /v1/mileage/summary | Annual mileage totals + IRS deduction.
*TaxApi* | [**getTaxScheduleC**](docs/TaxApi.md#gettaxschedulec) | **GET** /v1/tax/schedule-c | Schedule C JSON for a tax year.
*TaxApi* | [**listMileage**](docs/TaxApi.md#listmileage) | **GET** /v1/mileage | List mileage entries.
*TaxApi* | [**updateMileage**](docs/TaxApi.md#updatemileage) | **PATCH** /v1/mileage/{id} | Update a mileage entry.
*TaxonomyApi* | [**getTaxonomyCategory**](docs/TaxonomyApi.md#gettaxonomycategory) | **GET** /v1/taxonomy/{platform}/categories | Categories for a platform. Default is top-level; pass `?parent=<categoryId>` to drill down one level (supported on cookie platforms whose recipe returns flat parent_id-linked rows).
*TaxonomyApi* | [**getTaxonomyCategoryAspect**](docs/TaxonomyApi.md#gettaxonomycategoryaspect) | **GET** /v1/taxonomy/{platform}/categories/{id}/aspects | Item-specific aspects (eBay) / properties (Etsy) / hard-coded enums (cookie platforms) for a category.
*TaxonomyApi* | [**getTaxonomyCategoryChildren**](docs/TaxonomyApi.md#gettaxonomycategorychildren) | **GET** /v1/taxonomy/{platform}/categories/{id}/children | Direct children of a category node.
*TaxonomyApi* | [**getTaxonomyRequiredField**](docs/TaxonomyApi.md#gettaxonomyrequiredfield) | **GET** /v1/taxonomy/{platform}/required-fields | Normalized field schema the seller needs to fill before crossposting to this platform. Combines master fields (title/description/price/condition) with platform-specific overrides.
*TaxonomyApi* | [**listTaxonomySuggest**](docs/TaxonomyApi.md#listtaxonomysuggest) | **GET** /v1/taxonomy/{platform}/suggest | Reverse lookup — suggest categories matching a search phrase. eBay-only today.
*TeamApi* | [**createTeamAccept**](docs/TeamApi.md#createteamaccept) | **POST** /v1/team/accept | Accept a pending team invitation by raw token.
*TeamApi* | [**createTeamInvite**](docs/TeamApi.md#createteaminvite) | **POST** /v1/team/invite | Mint a team invitation; returns the one-time accept URL.
*TeamApi* | [**createTeamLeave**](docs/TeamApi.md#createteamleave) | **POST** /v1/team/leave | Leave every team this user is currently a member of.
*TeamApi* | [**createTeamRevoke**](docs/TeamApi.md#createteamrevoke) | **POST** /v1/team/revoke | Revoke a pending invite OR an active team member.
*TeamApi* | [**getTeam**](docs/TeamApi.md#getteam) | **GET** /v1/team | List pending team invitations + active members.
*TeamApi* | [**updateTeam**](docs/TeamApi.md#updateteam) | **PATCH** /v1/team/{memberId} | Update a team member's scopes (owner only).
*TemplatesApi* | [**createMeTemplate**](docs/TemplatesApi.md#createmetemplate) | **POST** /v1/me/templates | Create a template.
*TemplatesApi* | [**createMeTemplateImport**](docs/TemplatesApi.md#createmetemplateimport) | **POST** /v1/me/templates/import | Bulk-create templates from an exported payload.
*TemplatesApi* | [**createMeTemplateRender**](docs/TemplatesApi.md#createmetemplaterender) | **POST** /v1/me/templates/{id}/render | Render a template's title + description against a context.
*TemplatesApi* | [**createMeTemplateShare**](docs/TemplatesApi.md#createmetemplateshare) | **POST** /v1/me/templates/{id}/share | Mint or return an existing share token for a template.
*TemplatesApi* | [**deleteMeTemplate**](docs/TemplatesApi.md#deletemetemplate) | **DELETE** /v1/me/templates/{id} | Delete a template.
*TemplatesApi* | [**deleteMeTemplateShare**](docs/TemplatesApi.md#deletemetemplateshare) | **DELETE** /v1/me/templates/{id}/share | Revoke a template share link.
*TemplatesApi* | [**getMeTemplate**](docs/TemplatesApi.md#getmetemplate) | **GET** /v1/me/templates/{id} | Fetch one template in full.
*TemplatesApi* | [**getMeTemplateSuggest**](docs/TemplatesApi.md#getmetemplatesuggest) | **GET** /v1/me/templates/suggest | The seller's default template for a category.
*TemplatesApi* | [**listMeTemplates**](docs/TemplatesApi.md#listmetemplates) | **GET** /v1/me/templates | List the seller's templates.
*TemplatesApi* | [**updateMeTemplate**](docs/TemplatesApi.md#updatemetemplate) | **PATCH** /v1/me/templates/{id} | Patch a template.
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createwebhook) | **POST** /v1/webhooks | Register a webhook endpoint (returns the signing secret once).
*WebhooksApi* | [**createWebhookTest**](docs/WebhooksApi.md#createwebhooktest) | **POST** /v1/webhooks/{id}/test | Fire a synthetic test.ping delivery to one webhook.
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deletewebhook) | **DELETE** /v1/webhooks/{id} | Delete a webhook endpoint.
*WebhooksApi* | [**getWebhookStream**](docs/WebhooksApi.md#getwebhookstream) | **GET** /v1/webhooks/stream | Stream this account's webhook events as they happen (SSE).
*WebhooksApi* | [**listWebhooks**](docs/WebhooksApi.md#listwebhooks) | **GET** /v1/webhooks | List your registered webhook endpoints.
*WorkflowsApi* | [**createWorkflowChain**](docs/WorkflowsApi.md#createworkflowchain) | **POST** /v1/workflow-chains | Create a multi-step workflow chain.
*WorkflowsApi* | [**createWorkflowChainRunNow**](docs/WorkflowsApi.md#createworkflowchainrunnow) | **POST** /v1/workflow-chains/{id}/run-now | Enqueue an ad-hoc run of a workflow chain.
*WorkflowsApi* | [**createWorkflowChainToggle**](docs/WorkflowsApi.md#createworkflowchaintoggle) | **POST** /v1/workflow-chains/{id}/toggle | Flip a workflow chain between active and inactive.
*WorkflowsApi* | [**deleteWorkflowChain**](docs/WorkflowsApi.md#deleteworkflowchain) | **DELETE** /v1/workflow-chains/{id} | Delete a workflow chain (cascades steps + runs).
*WorkflowsApi* | [**getWorkflowChain**](docs/WorkflowsApi.md#getworkflowchain) | **GET** /v1/workflow-chains/{id} | Get one workflow chain with its steps.
*WorkflowsApi* | [**listWorkflowChains**](docs/WorkflowsApi.md#listworkflowchains) | **GET** /v1/workflow-chains | List workflow chains with their step graph.
*WorkflowsApi* | [**updateWorkflowChain**](docs/WorkflowsApi.md#updateworkflowchain) | **PUT** /v1/workflow-chains/{id} | Replace a workflow chain wholesale.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [net.crossly.models.CreateAccountCancelDeletionResponse](docs/CreateAccountCancelDeletionResponse.md)
 - [net.crossly.models.CreateAccountLogoutAllResponse](docs/CreateAccountLogoutAllResponse.md)
 - [net.crossly.models.CreateAccountRequestDeletionResponse](docs/CreateAccountRequestDeletionResponse.md)
 - [net.crossly.models.CreateAccountResponse](docs/CreateAccountResponse.md)
 - [net.crossly.models.CreateAdOffsiteCampaignResponse](docs/CreateAdOffsiteCampaignResponse.md)
 - [net.crossly.models.CreateAdOffsiteResumeResponse](docs/CreateAdOffsiteResumeResponse.md)
 - [net.crossly.models.CreateAiCategorizeFromImageResponse](docs/CreateAiCategorizeFromImageResponse.md)
 - [net.crossly.models.CreateAiCategorizeResponse](docs/CreateAiCategorizeResponse.md)
 - [net.crossly.models.CreateAiEnhanceDescriptionResponse](docs/CreateAiEnhanceDescriptionResponse.md)
 - [net.crossly.models.CreateAiEnhanceListingResponse](docs/CreateAiEnhanceListingResponse.md)
 - [net.crossly.models.CreateAiEnhanceTitleResponse](docs/CreateAiEnhanceTitleResponse.md)
 - [net.crossly.models.CreateAiExtractReceiptResponse](docs/CreateAiExtractReceiptResponse.md)
 - [net.crossly.models.CreateAiExtractReceiptResponseError](docs/CreateAiExtractReceiptResponseError.md)
 - [net.crossly.models.CreateAiGenerateListingResponse](docs/CreateAiGenerateListingResponse.md)
 - [net.crossly.models.CreateAiGenerateListingResponseColors](docs/CreateAiGenerateListingResponseColors.md)
 - [net.crossly.models.CreateAiGenerateListingResponseDescription](docs/CreateAiGenerateListingResponseDescription.md)
 - [net.crossly.models.CreateAiGenerateListingResponsePriceRange](docs/CreateAiGenerateListingResponsePriceRange.md)
 - [net.crossly.models.CreateAiGenerateListingResponsePriceRangeValue](docs/CreateAiGenerateListingResponsePriceRangeValue.md)
 - [net.crossly.models.CreateAiGenerateListingResponseSuggestedPrice](docs/CreateAiGenerateListingResponseSuggestedPrice.md)
 - [net.crossly.models.CreateAiHelpResponse](docs/CreateAiHelpResponse.md)
 - [net.crossly.models.CreateAiMagicListingResponse](docs/CreateAiMagicListingResponse.md)
 - [net.crossly.models.CreateAiTestKeyResponse](docs/CreateAiTestKeyResponse.md)
 - [net.crossly.models.CreateAutomationRuleImportResponse](docs/CreateAutomationRuleImportResponse.md)
 - [net.crossly.models.CreateAutomationRuleImportResponseCreated](docs/CreateAutomationRuleImportResponseCreated.md)
 - [net.crossly.models.CreateAutomationRuleImportResponseErrors](docs/CreateAutomationRuleImportResponseErrors.md)
 - [net.crossly.models.CreateAutomationRuleResponse](docs/CreateAutomationRuleResponse.md)
 - [net.crossly.models.CreateAutomationRuleRunNowResponse](docs/CreateAutomationRuleRunNowResponse.md)
 - [net.crossly.models.CreateAutomationRuleToggleResponse](docs/CreateAutomationRuleToggleResponse.md)
 - [net.crossly.models.CreateAutomationRuleValidateRecipeResponse](docs/CreateAutomationRuleValidateRecipeResponse.md)
 - [net.crossly.models.CreateAutomationRuleValidateRecipeResponseDetails](docs/CreateAutomationRuleValidateRecipeResponseDetails.md)
 - [net.crossly.models.CreateAutomationRuleValidateRecipeResponseDetailsFieldErrors](docs/CreateAutomationRuleValidateRecipeResponseDetailsFieldErrors.md)
 - [net.crossly.models.CreateBillingUpgradeResponse](docs/CreateBillingUpgradeResponse.md)
 - [net.crossly.models.CreateBuyerActivityResponse](docs/CreateBuyerActivityResponse.md)
 - [net.crossly.models.CreateBuyerActivityResponseMatch](docs/CreateBuyerActivityResponseMatch.md)
 - [net.crossly.models.CreateBuyerActivityResponseMatchOffer](docs/CreateBuyerActivityResponseMatchOffer.md)
 - [net.crossly.models.CreateBuyerCartItemResponse](docs/CreateBuyerCartItemResponse.md)
 - [net.crossly.models.CreateBuyerCartQuoteResponse](docs/CreateBuyerCartQuoteResponse.md)
 - [net.crossly.models.CreateBuyerCheckoutResponse](docs/CreateBuyerCheckoutResponse.md)
 - [net.crossly.models.CreateBuyerIdentifyResponse](docs/CreateBuyerIdentifyResponse.md)
 - [net.crossly.models.CreateBuyerIdentifyResponseHud](docs/CreateBuyerIdentifyResponseHud.md)
 - [net.crossly.models.CreateBuyerIdentifyResponseHudAction](docs/CreateBuyerIdentifyResponseHudAction.md)
 - [net.crossly.models.CreateBuyerIdentifyResponseHudFacts](docs/CreateBuyerIdentifyResponseHudFacts.md)
 - [net.crossly.models.CreateBuyerIdentifyResponseIdentifier](docs/CreateBuyerIdentifyResponseIdentifier.md)
 - [net.crossly.models.CreateBuyerIdentifyResponseVisualMatches](docs/CreateBuyerIdentifyResponseVisualMatches.md)
 - [net.crossly.models.CreateBuyerLockonConfirmResponse](docs/CreateBuyerLockonConfirmResponse.md)
 - [net.crossly.models.CreateBuyerLockonObserveResponse](docs/CreateBuyerLockonObserveResponse.md)
 - [net.crossly.models.CreateBuyerLockonObserveResponseCandidates](docs/CreateBuyerLockonObserveResponseCandidates.md)
 - [net.crossly.models.CreateBuyerLockonResponse](docs/CreateBuyerLockonResponse.md)
 - [net.crossly.models.CreateBuyerMonitorResponse](docs/CreateBuyerMonitorResponse.md)
 - [net.crossly.models.CreateBuyerOfferResponse](docs/CreateBuyerOfferResponse.md)
 - [net.crossly.models.CreateBuyerOfferResponseData](docs/CreateBuyerOfferResponseData.md)
 - [net.crossly.models.CreateBuyerOfferResponseDataOffer](docs/CreateBuyerOfferResponseDataOffer.md)
 - [net.crossly.models.CreateBuyerScanResponse](docs/CreateBuyerScanResponse.md)
 - [net.crossly.models.CreateBuyerScanResponseIdentifier](docs/CreateBuyerScanResponseIdentifier.md)
 - [net.crossly.models.CreateBuyerScanSessionEndResponse](docs/CreateBuyerScanSessionEndResponse.md)
 - [net.crossly.models.CreateBuyerScanSessionResponse](docs/CreateBuyerScanSessionResponse.md)
 - [net.crossly.models.CreateBuyerWishlistItemResponse](docs/CreateBuyerWishlistItemResponse.md)
 - [net.crossly.models.CreateBuyerWishlistResponse](docs/CreateBuyerWishlistResponse.md)
 - [net.crossly.models.CreateCbxAccrualPurchaseResponse](docs/CreateCbxAccrualPurchaseResponse.md)
 - [net.crossly.models.CreateCbxAccrualResponse](docs/CreateCbxAccrualResponse.md)
 - [net.crossly.models.CreateCbxAccrualReverseResponse](docs/CreateCbxAccrualReverseResponse.md)
 - [net.crossly.models.CreateCbxAdCreditPurchaseResponse](docs/CreateCbxAdCreditPurchaseResponse.md)
 - [net.crossly.models.CreateCbxAdCreditQuoteResponse](docs/CreateCbxAdCreditQuoteResponse.md)
 - [net.crossly.models.CreateCbxAdCreditSpendResponse](docs/CreateCbxAdCreditSpendResponse.md)
 - [net.crossly.models.CreateCbxBoostPauseResponse](docs/CreateCbxBoostPauseResponse.md)
 - [net.crossly.models.CreateCbxBoostResponse](docs/CreateCbxBoostResponse.md)
 - [net.crossly.models.CreateCbxCampaignApproveResponse](docs/CreateCbxCampaignApproveResponse.md)
 - [net.crossly.models.CreateCbxCampaignExecuteResponse](docs/CreateCbxCampaignExecuteResponse.md)
 - [net.crossly.models.CreateCbxCampaignPreviewResponse](docs/CreateCbxCampaignPreviewResponse.md)
 - [net.crossly.models.CreateCbxCampaignPreviewResponseAllocations](docs/CreateCbxCampaignPreviewResponseAllocations.md)
 - [net.crossly.models.CreateCbxCampaignResponse](docs/CreateCbxCampaignResponse.md)
 - [net.crossly.models.CreateCbxClaimQuoteResponse](docs/CreateCbxClaimQuoteResponse.md)
 - [net.crossly.models.CreateCbxClaimResponse](docs/CreateCbxClaimResponse.md)
 - [net.crossly.models.CreateCbxClaimSendResponse](docs/CreateCbxClaimSendResponse.md)
 - [net.crossly.models.CreateCbxCreditDrawResponse](docs/CreateCbxCreditDrawResponse.md)
 - [net.crossly.models.CreateCbxCreditFreezeResponse](docs/CreateCbxCreditFreezeResponse.md)
 - [net.crossly.models.CreateCbxCreditRefreshResponse](docs/CreateCbxCreditRefreshResponse.md)
 - [net.crossly.models.CreateCbxCreditRepayResponse](docs/CreateCbxCreditRepayResponse.md)
 - [net.crossly.models.CreateCbxDisbursementRuleActiveResponse](docs/CreateCbxDisbursementRuleActiveResponse.md)
 - [net.crossly.models.CreateCbxDisbursementRuleCheckResponse](docs/CreateCbxDisbursementRuleCheckResponse.md)
 - [net.crossly.models.CreateCbxDisbursementRuleResponse](docs/CreateCbxDisbursementRuleResponse.md)
 - [net.crossly.models.CreateCbxEarnTierResponse](docs/CreateCbxEarnTierResponse.md)
 - [net.crossly.models.CreateCbxRateQuoteResponse](docs/CreateCbxRateQuoteResponse.md)
 - [net.crossly.models.CreateCbxRedemptionQuoteResponse](docs/CreateCbxRedemptionQuoteResponse.md)
 - [net.crossly.models.CreateCbxRedemptionResponse](docs/CreateCbxRedemptionResponse.md)
 - [net.crossly.models.CreateCbxRevenueSweepResponse](docs/CreateCbxRevenueSweepResponse.md)
 - [net.crossly.models.CreateCbxRevenueSweepResponseBreakdown](docs/CreateCbxRevenueSweepResponseBreakdown.md)
 - [net.crossly.models.CreateCbxSpendResponse](docs/CreateCbxSpendResponse.md)
 - [net.crossly.models.CreateCbxSpendReverseResponse](docs/CreateCbxSpendReverseResponse.md)
 - [net.crossly.models.CreateCbxStakeTierResponse](docs/CreateCbxStakeTierResponse.md)
 - [net.crossly.models.CreateCbxSubjectGrantResponse](docs/CreateCbxSubjectGrantResponse.md)
 - [net.crossly.models.CreateCbxSubjectResponse](docs/CreateCbxSubjectResponse.md)
 - [net.crossly.models.CreateCbxSubjectSpendPlanResponse](docs/CreateCbxSubjectSpendPlanResponse.md)
 - [net.crossly.models.CreateCbxSubjectSpendPlanResponseLegs](docs/CreateCbxSubjectSpendPlanResponseLegs.md)
 - [net.crossly.models.CreateCbxSubjectStakeResponse](docs/CreateCbxSubjectStakeResponse.md)
 - [net.crossly.models.CreateCbxSubjectStakeUnstakeResponse](docs/CreateCbxSubjectStakeUnstakeResponse.md)
 - [net.crossly.models.CreateCbxWalletChallengeResponse](docs/CreateCbxWalletChallengeResponse.md)
 - [net.crossly.models.CreateCbxWalletPaymentConfirmResponse](docs/CreateCbxWalletPaymentConfirmResponse.md)
 - [net.crossly.models.CreateCbxWalletPaymentQuoteResponse](docs/CreateCbxWalletPaymentQuoteResponse.md)
 - [net.crossly.models.CreateCbxWalletPaymentResolveResponse](docs/CreateCbxWalletPaymentResolveResponse.md)
 - [net.crossly.models.CreateCbxWalletVerifyResponse](docs/CreateCbxWalletVerifyResponse.md)
 - [net.crossly.models.CreateCompWatchlistResponse](docs/CreateCompWatchlistResponse.md)
 - [net.crossly.models.CreateCompWatchlistScrapeResponse](docs/CreateCompWatchlistScrapeResponse.md)
 - [net.crossly.models.CreateConnectionEmailImapResponse](docs/CreateConnectionEmailImapResponse.md)
 - [net.crossly.models.CreateConnectionEmailImapTestResponse](docs/CreateConnectionEmailImapTestResponse.md)
 - [net.crossly.models.CreateConnectionRequestResponse](docs/CreateConnectionRequestResponse.md)
 - [net.crossly.models.CreateCustomerBulkDeleteResponse](docs/CreateCustomerBulkDeleteResponse.md)
 - [net.crossly.models.CreateEmbedKeyResponse](docs/CreateEmbedKeyResponse.md)
 - [net.crossly.models.CreateImportResponse](docs/CreateImportResponse.md)
 - [net.crossly.models.CreateInboxAiSuggestResponse](docs/CreateInboxAiSuggestResponse.md)
 - [net.crossly.models.CreateInboxCannedResponsResponse](docs/CreateInboxCannedResponsResponse.md)
 - [net.crossly.models.CreateInboxConversationBulkAiRespondResponse](docs/CreateInboxConversationBulkAiRespondResponse.md)
 - [net.crossly.models.CreateInboxConversationBulkAiRespondResponseResults](docs/CreateInboxConversationBulkAiRespondResponseResults.md)
 - [net.crossly.models.CreateInboxConversationBulkResponse](docs/CreateInboxConversationBulkResponse.md)
 - [net.crossly.models.CreateInboxConversationOfferActionResponse](docs/CreateInboxConversationOfferActionResponse.md)
 - [net.crossly.models.CreateInboxMessageTriageResponse](docs/CreateInboxMessageTriageResponse.md)
 - [net.crossly.models.CreateInboxOfferResponse](docs/CreateInboxOfferResponse.md)
 - [net.crossly.models.CreateInboxReplyResponse](docs/CreateInboxReplyResponse.md)
 - [net.crossly.models.CreateInventoryBulkArchiveResponse](docs/CreateInventoryBulkArchiveResponse.md)
 - [net.crossly.models.CreateInventoryBulkDeleteResponse](docs/CreateInventoryBulkDeleteResponse.md)
 - [net.crossly.models.CreateInventoryBulkLabelResponse](docs/CreateInventoryBulkLabelResponse.md)
 - [net.crossly.models.CreateInventoryBulkQuantityResponse](docs/CreateInventoryBulkQuantityResponse.md)
 - [net.crossly.models.CreateInventoryCsvImportResponse](docs/CreateInventoryCsvImportResponse.md)
 - [net.crossly.models.CreateInventoryCsvImportResponseProblems](docs/CreateInventoryCsvImportResponseProblems.md)
 - [net.crossly.models.CreateInventoryLabelRenameResponse](docs/CreateInventoryLabelRenameResponse.md)
 - [net.crossly.models.CreateInventoryResponse](docs/CreateInventoryResponse.md)
 - [net.crossly.models.CreateInventoryUnitIdentifierResponse](docs/CreateInventoryUnitIdentifierResponse.md)
 - [net.crossly.models.CreateInventoryUnitLookupResponse](docs/CreateInventoryUnitLookupResponse.md)
 - [net.crossly.models.CreateListingBulkCheckStatusResponse](docs/CreateListingBulkCheckStatusResponse.md)
 - [net.crossly.models.CreateListingBulkCrosspostResponse](docs/CreateListingBulkCrosspostResponse.md)
 - [net.crossly.models.CreateListingBulkDeleteResponse](docs/CreateListingBulkDeleteResponse.md)
 - [net.crossly.models.CreateListingBulkDelistPreviewResponse](docs/CreateListingBulkDelistPreviewResponse.md)
 - [net.crossly.models.CreateListingBulkDelistPreviewResponseMarketplaces](docs/CreateListingBulkDelistPreviewResponseMarketplaces.md)
 - [net.crossly.models.CreateListingBulkDelistResponse](docs/CreateListingBulkDelistResponse.md)
 - [net.crossly.models.CreateListingBulkHardDeleteResponse](docs/CreateListingBulkHardDeleteResponse.md)
 - [net.crossly.models.CreateListingBulkRelistResponse](docs/CreateListingBulkRelistResponse.md)
 - [net.crossly.models.CreateListingBulkUpdateResponse](docs/CreateListingBulkUpdateResponse.md)
 - [net.crossly.models.CreateListingByIdResponse](docs/CreateListingByIdResponse.md)
 - [net.crossly.models.CreateListingByIdResponseItems](docs/CreateListingByIdResponseItems.md)
 - [net.crossly.models.CreateListingCheckDuplicateResponse](docs/CreateListingCheckDuplicateResponse.md)
 - [net.crossly.models.CreateListingCheckDuplicateResponseMatches](docs/CreateListingCheckDuplicateResponseMatches.md)
 - [net.crossly.models.CreateListingCombineResponse](docs/CreateListingCombineResponse.md)
 - [net.crossly.models.CreateListingDiscrepancyResolveResponse](docs/CreateListingDiscrepancyResolveResponse.md)
 - [net.crossly.models.CreateListingImportByUrlResponse](docs/CreateListingImportByUrlResponse.md)
 - [net.crossly.models.CreateListingImportByUrlResponseListing](docs/CreateListingImportByUrlResponseListing.md)
 - [net.crossly.models.CreateListingMagicFillResponse](docs/CreateListingMagicFillResponse.md)
 - [net.crossly.models.CreateListingResponse](docs/CreateListingResponse.md)
 - [net.crossly.models.CreateListingResponseJobs](docs/CreateListingResponseJobs.md)
 - [net.crossly.models.CreateListingResponseListing](docs/CreateListingResponseListing.md)
 - [net.crossly.models.CreateListingResponseSkipped](docs/CreateListingResponseSkipped.md)
 - [net.crossly.models.CreateMagicScanResponse](docs/CreateMagicScanResponse.md)
 - [net.crossly.models.CreateMagicScanResponseEbayHits](docs/CreateMagicScanResponseEbayHits.md)
 - [net.crossly.models.CreateMagicScanResponseEbayMatch](docs/CreateMagicScanResponseEbayMatch.md)
 - [net.crossly.models.CreateMagicScanResponsePossibleDuplicates](docs/CreateMagicScanResponsePossibleDuplicates.md)
 - [net.crossly.models.CreateMagicScanResponseTopHits](docs/CreateMagicScanResponseTopHits.md)
 - [net.crossly.models.CreateMagicScanSynthesizeResponse](docs/CreateMagicScanSynthesizeResponse.md)
 - [net.crossly.models.CreateMagicScanSynthesizeResponsePayload](docs/CreateMagicScanSynthesizeResponsePayload.md)
 - [net.crossly.models.CreateMagicScanSynthesizeResponsePayloadCategory](docs/CreateMagicScanSynthesizeResponsePayloadCategory.md)
 - [net.crossly.models.CreateMagicScanSynthesizeResponsePayloadChosenDimensions](docs/CreateMagicScanSynthesizeResponsePayloadChosenDimensions.md)
 - [net.crossly.models.CreateMagicScanSynthesizeResponsePayloadDimensions](docs/CreateMagicScanSynthesizeResponsePayloadDimensions.md)
 - [net.crossly.models.CreateMagicScanSynthesizeResponsePayloadGrading](docs/CreateMagicScanSynthesizeResponsePayloadGrading.md)
 - [net.crossly.models.CreateMagicScanSynthesizeResponsePayloadSectionApplicability](docs/CreateMagicScanSynthesizeResponsePayloadSectionApplicability.md)
 - [net.crossly.models.CreateMeTemplateImportResponse](docs/CreateMeTemplateImportResponse.md)
 - [net.crossly.models.CreateMeTemplateRenderResponse](docs/CreateMeTemplateRenderResponse.md)
 - [net.crossly.models.CreateMeTemplateResponse](docs/CreateMeTemplateResponse.md)
 - [net.crossly.models.CreateMeTemplateShareResponse](docs/CreateMeTemplateShareResponse.md)
 - [net.crossly.models.CreateMileageResponse](docs/CreateMileageResponse.md)
 - [net.crossly.models.CreateMobilePushTestResponse](docs/CreateMobilePushTestResponse.md)
 - [net.crossly.models.CreateMobilePushTokenResponse](docs/CreateMobilePushTokenResponse.md)
 - [net.crossly.models.CreateNetworkPoolResponse](docs/CreateNetworkPoolResponse.md)
 - [net.crossly.models.CreateNotificationIntegrationResponse](docs/CreateNotificationIntegrationResponse.md)
 - [net.crossly.models.CreateNotificationIntegrationTestResponse](docs/CreateNotificationIntegrationTestResponse.md)
 - [net.crossly.models.CreateOfferRespondResponse](docs/CreateOfferRespondResponse.md)
 - [net.crossly.models.CreateOrderBulkDeleteResponse](docs/CreateOrderBulkDeleteResponse.md)
 - [net.crossly.models.CreateOrderBulkMarkDisputedResponse](docs/CreateOrderBulkMarkDisputedResponse.md)
 - [net.crossly.models.CreateOrderBulkMarkShippedResponse](docs/CreateOrderBulkMarkShippedResponse.md)
 - [net.crossly.models.CreateOrderCancelResponse](docs/CreateOrderCancelResponse.md)
 - [net.crossly.models.CreateOrderDisputeResponse](docs/CreateOrderDisputeResponse.md)
 - [net.crossly.models.CreateOrderDisputeResponseError](docs/CreateOrderDisputeResponseError.md)
 - [net.crossly.models.CreateOrderImportResponse](docs/CreateOrderImportResponse.md)
 - [net.crossly.models.CreateOrderImportResponseResults](docs/CreateOrderImportResponseResults.md)
 - [net.crossly.models.CreateOrderLabelResponse](docs/CreateOrderLabelResponse.md)
 - [net.crossly.models.CreateOrderMessageResponse](docs/CreateOrderMessageResponse.md)
 - [net.crossly.models.CreateOrderPullPlatformLabelResponse](docs/CreateOrderPullPlatformLabelResponse.md)
 - [net.crossly.models.CreateOrderRateResponse](docs/CreateOrderRateResponse.md)
 - [net.crossly.models.CreateOrderRefundResponse](docs/CreateOrderRefundResponse.md)
 - [net.crossly.models.CreateOrderTrackingResponse](docs/CreateOrderTrackingResponse.md)
 - [net.crossly.models.CreatePatResponse](docs/CreatePatResponse.md)
 - [net.crossly.models.CreatePlatformAccountConnectResponse](docs/CreatePlatformAccountConnectResponse.md)
 - [net.crossly.models.CreatePlatformAccountDisconnectResponse](docs/CreatePlatformAccountDisconnectResponse.md)
 - [net.crossly.models.CreatePlatformAccountHistoryImportResponse](docs/CreatePlatformAccountHistoryImportResponse.md)
 - [net.crossly.models.CreatePlatformAccountRefreshStatusResponse](docs/CreatePlatformAccountRefreshStatusResponse.md)
 - [net.crossly.models.CreatePlatformAccountRefreshStatusResponseResults](docs/CreatePlatformAccountRefreshStatusResponseResults.md)
 - [net.crossly.models.CreatePolicyPresetResponse](docs/CreatePolicyPresetResponse.md)
 - [net.crossly.models.CreateRestockPromptDismissResponse](docs/CreateRestockPromptDismissResponse.md)
 - [net.crossly.models.CreateRestockPromptRepublishResponse](docs/CreateRestockPromptRepublishResponse.md)
 - [net.crossly.models.CreateReturnResponse](docs/CreateReturnResponse.md)
 - [net.crossly.models.CreateSaleBulkDeleteResponse](docs/CreateSaleBulkDeleteResponse.md)
 - [net.crossly.models.CreateSavedViewResponse](docs/CreateSavedViewResponse.md)
 - [net.crossly.models.CreateSourcingReceiptResponse](docs/CreateSourcingReceiptResponse.md)
 - [net.crossly.models.CreateTeamAcceptResponse](docs/CreateTeamAcceptResponse.md)
 - [net.crossly.models.CreateTeamInviteResponse](docs/CreateTeamInviteResponse.md)
 - [net.crossly.models.CreateTeamLeaveResponse](docs/CreateTeamLeaveResponse.md)
 - [net.crossly.models.CreateTeamRevokeResponse](docs/CreateTeamRevokeResponse.md)
 - [net.crossly.models.CreateWebhookResponse](docs/CreateWebhookResponse.md)
 - [net.crossly.models.CreateWebhookTestResponse](docs/CreateWebhookTestResponse.md)
 - [net.crossly.models.CreateWorkflowChainResponse](docs/CreateWorkflowChainResponse.md)
 - [net.crossly.models.CreateWorkflowChainRunNowResponse](docs/CreateWorkflowChainRunNowResponse.md)
 - [net.crossly.models.CreateWorkflowChainToggleResponse](docs/CreateWorkflowChainToggleResponse.md)
 - [net.crossly.models.CreateWorkflowChainToggleResponseChain](docs/CreateWorkflowChainToggleResponseChain.md)
 - [net.crossly.models.DeleteAccountResponse](docs/DeleteAccountResponse.md)
 - [net.crossly.models.DeleteAiKeyResponse](docs/DeleteAiKeyResponse.md)
 - [net.crossly.models.DeleteAuthSessionBySessionIdResponse](docs/DeleteAuthSessionBySessionIdResponse.md)
 - [net.crossly.models.DeleteAuthSessionResponse](docs/DeleteAuthSessionResponse.md)
 - [net.crossly.models.DeleteAutomationRuleResponse](docs/DeleteAutomationRuleResponse.md)
 - [net.crossly.models.DeleteCompWatchlistResponse](docs/DeleteCompWatchlistResponse.md)
 - [net.crossly.models.DeleteConnectedAppResponse](docs/DeleteConnectedAppResponse.md)
 - [net.crossly.models.DeleteConnectionByIdResponse](docs/DeleteConnectionByIdResponse.md)
 - [net.crossly.models.DeleteConnectionEmailImapResponse](docs/DeleteConnectionEmailImapResponse.md)
 - [net.crossly.models.DeleteInboxCannedResponsResponse](docs/DeleteInboxCannedResponsResponse.md)
 - [net.crossly.models.DeleteInventoryResponse](docs/DeleteInventoryResponse.md)
 - [net.crossly.models.DeleteListingResponse](docs/DeleteListingResponse.md)
 - [net.crossly.models.DeleteMeTemplateResponse](docs/DeleteMeTemplateResponse.md)
 - [net.crossly.models.DeleteMeTemplateShareResponse](docs/DeleteMeTemplateShareResponse.md)
 - [net.crossly.models.DeleteMileageResponse](docs/DeleteMileageResponse.md)
 - [net.crossly.models.DeleteMobilePushTokenResponse](docs/DeleteMobilePushTokenResponse.md)
 - [net.crossly.models.DeleteNetworkPoolResponse](docs/DeleteNetworkPoolResponse.md)
 - [net.crossly.models.DeleteNotificationIntegrationResponse](docs/DeleteNotificationIntegrationResponse.md)
 - [net.crossly.models.DeletePatResponse](docs/DeletePatResponse.md)
 - [net.crossly.models.DeletePolicyPresetResponse](docs/DeletePolicyPresetResponse.md)
 - [net.crossly.models.DeleteSavedViewResponse](docs/DeleteSavedViewResponse.md)
 - [net.crossly.models.DeleteWebhookResponse](docs/DeleteWebhookResponse.md)
 - [net.crossly.models.DeleteWorkflowChainResponse](docs/DeleteWorkflowChainResponse.md)
 - [net.crossly.models.Error](docs/Error.md)
 - [net.crossly.models.ErrorError](docs/ErrorError.md)
 - [net.crossly.models.GetAccountDeletionStatusResponse](docs/GetAccountDeletionStatusResponse.md)
 - [net.crossly.models.GetAccountDeletionStatusResponsePending](docs/GetAccountDeletionStatusResponsePending.md)
 - [net.crossly.models.GetActionLogFacetResponse](docs/GetActionLogFacetResponse.md)
 - [net.crossly.models.GetActionLogResponse](docs/GetActionLogResponse.md)
 - [net.crossly.models.GetAdOffsiteEligibilityResponse](docs/GetAdOffsiteEligibilityResponse.md)
 - [net.crossly.models.GetAdOffsiteReportResponse](docs/GetAdOffsiteReportResponse.md)
 - [net.crossly.models.GetAdOffsiteResponse](docs/GetAdOffsiteResponse.md)
 - [net.crossly.models.GetAdOffsiteResponseTerms](docs/GetAdOffsiteResponseTerms.md)
 - [net.crossly.models.GetAdOffsiteResponseTermsNetworks](docs/GetAdOffsiteResponseTermsNetworks.md)
 - [net.crossly.models.GetAiProviderResponse](docs/GetAiProviderResponse.md)
 - [net.crossly.models.GetAiProviderResponseProviders](docs/GetAiProviderResponseProviders.md)
 - [net.crossly.models.GetAiStatusResponse](docs/GetAiStatusResponse.md)
 - [net.crossly.models.GetAiStatusResponseCapabilities](docs/GetAiStatusResponseCapabilities.md)
 - [net.crossly.models.GetAiStatusResponseCustomConfig](docs/GetAiStatusResponseCustomConfig.md)
 - [net.crossly.models.GetAnalyticBookkeepingResponse](docs/GetAnalyticBookkeepingResponse.md)
 - [net.crossly.models.GetAnalyticBookkeepingResponseAnnualTotals](docs/GetAnalyticBookkeepingResponseAnnualTotals.md)
 - [net.crossly.models.GetAnalyticBookkeepingResponseMonthlyPL](docs/GetAnalyticBookkeepingResponseMonthlyPL.md)
 - [net.crossly.models.GetAnalyticBookkeepingResponsePlatformBreakdown](docs/GetAnalyticBookkeepingResponsePlatformBreakdown.md)
 - [net.crossly.models.GetAnalyticByPlatformResponse](docs/GetAnalyticByPlatformResponse.md)
 - [net.crossly.models.GetAnalyticByPlatformResponseBreakdown](docs/GetAnalyticByPlatformResponseBreakdown.md)
 - [net.crossly.models.GetAnalyticDashboardResponse](docs/GetAnalyticDashboardResponse.md)
 - [net.crossly.models.GetAnalyticDashboardResponseAvgSalePriceByPlatform](docs/GetAnalyticDashboardResponseAvgSalePriceByPlatform.md)
 - [net.crossly.models.GetAnalyticDashboardResponseCancelRate](docs/GetAnalyticDashboardResponseCancelRate.md)
 - [net.crossly.models.GetAnalyticDashboardResponseRecentSales](docs/GetAnalyticDashboardResponseRecentSales.md)
 - [net.crossly.models.GetAnalyticDashboardResponseRevenue](docs/GetAnalyticDashboardResponseRevenue.md)
 - [net.crossly.models.GetAnalyticDashboardResponseRevenueByDay](docs/GetAnalyticDashboardResponseRevenueByDay.md)
 - [net.crossly.models.GetAnalyticDashboardResponseSalesByPlatform](docs/GetAnalyticDashboardResponseSalesByPlatform.md)
 - [net.crossly.models.GetAnalyticDashboardResponseSellThrough](docs/GetAnalyticDashboardResponseSellThrough.md)
 - [net.crossly.models.GetAnalyticDashboardResponseTop5ItemsByRevenue](docs/GetAnalyticDashboardResponseTop5ItemsByRevenue.md)
 - [net.crossly.models.GetAnalyticDashboardResponseTopCategories](docs/GetAnalyticDashboardResponseTopCategories.md)
 - [net.crossly.models.GetAnalyticItemResponse](docs/GetAnalyticItemResponse.md)
 - [net.crossly.models.GetAnalyticItemResponseItems](docs/GetAnalyticItemResponseItems.md)
 - [net.crossly.models.GetAnalyticSummaryResponse](docs/GetAnalyticSummaryResponse.md)
 - [net.crossly.models.GetAnalyticTimeseryResponse](docs/GetAnalyticTimeseryResponse.md)
 - [net.crossly.models.GetAnalyticTimeseryResponseSeries](docs/GetAnalyticTimeseryResponseSeries.md)
 - [net.crossly.models.GetAnalyticTodayResponse](docs/GetAnalyticTodayResponse.md)
 - [net.crossly.models.GetAnalyticTodayResponseChecklist](docs/GetAnalyticTodayResponseChecklist.md)
 - [net.crossly.models.GetAnalyticTodayResponseStreak](docs/GetAnalyticTodayResponseStreak.md)
 - [net.crossly.models.GetAutomationCatalogResponse](docs/GetAutomationCatalogResponse.md)
 - [net.crossly.models.GetAutomationCatalogResponseTriggerTypes](docs/GetAutomationCatalogResponseTriggerTypes.md)
 - [net.crossly.models.GetAutomationRuleExportByIdResponse](docs/GetAutomationRuleExportByIdResponse.md)
 - [net.crossly.models.GetAutomationRuleExportResponse](docs/GetAutomationRuleExportResponse.md)
 - [net.crossly.models.GetAutomationRuleExportResponseAction](docs/GetAutomationRuleExportResponseAction.md)
 - [net.crossly.models.GetAutomationRuleExportResponseCondition](docs/GetAutomationRuleExportResponseCondition.md)
 - [net.crossly.models.GetAutomationRuleExportResponseMetadata](docs/GetAutomationRuleExportResponseMetadata.md)
 - [net.crossly.models.GetAutomationRuleExportResponseRecipes](docs/GetAutomationRuleExportResponseRecipes.md)
 - [net.crossly.models.GetAutomationRuleResponse](docs/GetAutomationRuleResponse.md)
 - [net.crossly.models.GetAutomationRuleResponseRule](docs/GetAutomationRuleResponseRule.md)
 - [net.crossly.models.GetBrandResponse](docs/GetBrandResponse.md)
 - [net.crossly.models.GetBuyerAnywhereResponse](docs/GetBuyerAnywhereResponse.md)
 - [net.crossly.models.GetBuyerAnywhereResponseAlternates](docs/GetBuyerAnywhereResponseAlternates.md)
 - [net.crossly.models.GetBuyerAnywhereResponseCrossly](docs/GetBuyerAnywhereResponseCrossly.md)
 - [net.crossly.models.GetBuyerAnywhereResponseOffsite](docs/GetBuyerAnywhereResponseOffsite.md)
 - [net.crossly.models.GetBuyerCatalogFacetResponse](docs/GetBuyerCatalogFacetResponse.md)
 - [net.crossly.models.GetBuyerCatalogFacetResponseBrands](docs/GetBuyerCatalogFacetResponseBrands.md)
 - [net.crossly.models.GetBuyerCatalogListingAvailabilityResponse](docs/GetBuyerCatalogListingAvailabilityResponse.md)
 - [net.crossly.models.GetBuyerCatalogListingResponse](docs/GetBuyerCatalogListingResponse.md)
 - [net.crossly.models.GetBuyerCheckoutControlResponse](docs/GetBuyerCheckoutControlResponse.md)
 - [net.crossly.models.GetBuyerPreferenceResponse](docs/GetBuyerPreferenceResponse.md)
 - [net.crossly.models.GetBuyerPreferenceResponseBrands](docs/GetBuyerPreferenceResponseBrands.md)
 - [net.crossly.models.GetBuyerPreferenceResponsePriceBand](docs/GetBuyerPreferenceResponsePriceBand.md)
 - [net.crossly.models.GetBuyerPreferenceResponseRetailers](docs/GetBuyerPreferenceResponseRetailers.md)
 - [net.crossly.models.GetBuyerProfileResponse](docs/GetBuyerProfileResponse.md)
 - [net.crossly.models.GetBuyerScanSessionResponse](docs/GetBuyerScanSessionResponse.md)
 - [net.crossly.models.GetBuyerScanSessionResponseCaptures](docs/GetBuyerScanSessionResponseCaptures.md)
 - [net.crossly.models.GetBuyerScanSessionResponseIdentifier](docs/GetBuyerScanSessionResponseIdentifier.md)
 - [net.crossly.models.GetCatalogLookupResponse](docs/GetCatalogLookupResponse.md)
 - [net.crossly.models.GetCatalogLookupResponseCatalog](docs/GetCatalogLookupResponseCatalog.md)
 - [net.crossly.models.GetCatalogLookupResponseIdentifier](docs/GetCatalogLookupResponseIdentifier.md)
 - [net.crossly.models.GetCatalogLookupResponseOffers](docs/GetCatalogLookupResponseOffers.md)
 - [net.crossly.models.GetCategoryResponse](docs/GetCategoryResponse.md)
 - [net.crossly.models.GetCategoryResponseMain](docs/GetCategoryResponseMain.md)
 - [net.crossly.models.GetCbxAdCreditResponse](docs/GetCbxAdCreditResponse.md)
 - [net.crossly.models.GetCbxClaimResponse](docs/GetCbxClaimResponse.md)
 - [net.crossly.models.GetCbxCreditResponse](docs/GetCbxCreditResponse.md)
 - [net.crossly.models.GetCbxMeResponse](docs/GetCbxMeResponse.md)
 - [net.crossly.models.GetCbxMeResponseTerms](docs/GetCbxMeResponseTerms.md)
 - [net.crossly.models.GetCbxPoolResponse](docs/GetCbxPoolResponse.md)
 - [net.crossly.models.GetCbxRevenueResponse](docs/GetCbxRevenueResponse.md)
 - [net.crossly.models.GetCbxSubjectBalanceBySubjectIdResponse](docs/GetCbxSubjectBalanceBySubjectIdResponse.md)
 - [net.crossly.models.GetCbxSubjectBalanceResponse](docs/GetCbxSubjectBalanceResponse.md)
 - [net.crossly.models.GetCbxSubjectSpentResponse](docs/GetCbxSubjectSpentResponse.md)
 - [net.crossly.models.GetCbxSubjectStakeResponse](docs/GetCbxSubjectStakeResponse.md)
 - [net.crossly.models.GetCbxSubjectWalletResponse](docs/GetCbxSubjectWalletResponse.md)
 - [net.crossly.models.GetCbxTreasuryResponse](docs/GetCbxTreasuryResponse.md)
 - [net.crossly.models.GetConnectionEmailResponse](docs/GetConnectionEmailResponse.md)
 - [net.crossly.models.GetConnectionEmailResponseData](docs/GetConnectionEmailResponseData.md)
 - [net.crossly.models.GetConnectionEmailResponseOauth](docs/GetConnectionEmailResponseOauth.md)
 - [net.crossly.models.GetConnectionExtensionOnlineResponse](docs/GetConnectionExtensionOnlineResponse.md)
 - [net.crossly.models.GetConnectionHealthResponse](docs/GetConnectionHealthResponse.md)
 - [net.crossly.models.GetConnectionHealthResponseAccounts](docs/GetConnectionHealthResponseAccounts.md)
 - [net.crossly.models.GetConnectionHealthResponseAnchors](docs/GetConnectionHealthResponseAnchors.md)
 - [net.crossly.models.GetConnectionHealthResponseBrowser](docs/GetConnectionHealthResponseBrowser.md)
 - [net.crossly.models.GetConnectionHealthResponseExtension](docs/GetConnectionHealthResponseExtension.md)
 - [net.crossly.models.GetConnectionHealthResponseLiveness](docs/GetConnectionHealthResponseLiveness.md)
 - [net.crossly.models.GetCustomerResponse](docs/GetCustomerResponse.md)
 - [net.crossly.models.GetCustomerResponseContact](docs/GetCustomerResponseContact.md)
 - [net.crossly.models.GetCustomerResponseContactAddress](docs/GetCustomerResponseContactAddress.md)
 - [net.crossly.models.GetCustomerResponseOrders](docs/GetCustomerResponseOrders.md)
 - [net.crossly.models.GetDepartmentResponse](docs/GetDepartmentResponse.md)
 - [net.crossly.models.GetGenderResponse](docs/GetGenderResponse.md)
 - [net.crossly.models.GetImportResponse](docs/GetImportResponse.md)
 - [net.crossly.models.GetInboxCannedResponsResponse](docs/GetInboxCannedResponsResponse.md)
 - [net.crossly.models.GetInboxCannedResponsResponseCannedResponses](docs/GetInboxCannedResponsResponseCannedResponses.md)
 - [net.crossly.models.GetInboxConversationMessageResponse](docs/GetInboxConversationMessageResponse.md)
 - [net.crossly.models.GetInboxConversationMessageResponseMessages](docs/GetInboxConversationMessageResponseMessages.md)
 - [net.crossly.models.GetInboxConversationUnreadCountResponse](docs/GetInboxConversationUnreadCountResponse.md)
 - [net.crossly.models.GetInboxResponse](docs/GetInboxResponse.md)
 - [net.crossly.models.GetInboxResponseMessages](docs/GetInboxResponseMessages.md)
 - [net.crossly.models.GetInventoryFacetResponse](docs/GetInventoryFacetResponse.md)
 - [net.crossly.models.GetInventoryLabelResponse](docs/GetInventoryLabelResponse.md)
 - [net.crossly.models.GetInventoryLabelStatResponse](docs/GetInventoryLabelStatResponse.md)
 - [net.crossly.models.GetInventoryLabelStatResponseLabels](docs/GetInventoryLabelStatResponseLabels.md)
 - [net.crossly.models.GetInventoryResponse](docs/GetInventoryResponse.md)
 - [net.crossly.models.GetInventoryResponsePlatformListings](docs/GetInventoryResponsePlatformListings.md)
 - [net.crossly.models.GetInventorySkuExistResponse](docs/GetInventorySkuExistResponse.md)
 - [net.crossly.models.GetListingFacetResponse](docs/GetListingFacetResponse.md)
 - [net.crossly.models.GetListingResponse](docs/GetListingResponse.md)
 - [net.crossly.models.GetListingResponsePlatformListings](docs/GetListingResponsePlatformListings.md)
 - [net.crossly.models.GetListingSkuExistResponse](docs/GetListingSkuExistResponse.md)
 - [net.crossly.models.GetListingVariationGroupResponse](docs/GetListingVariationGroupResponse.md)
 - [net.crossly.models.GetListingVariationGroupResponseGroup](docs/GetListingVariationGroupResponseGroup.md)
 - [net.crossly.models.GetMagicDraftResponse](docs/GetMagicDraftResponse.md)
 - [net.crossly.models.GetMagicDraftResponseDraft](docs/GetMagicDraftResponseDraft.md)
 - [net.crossly.models.GetMarketProductResponse](docs/GetMarketProductResponse.md)
 - [net.crossly.models.GetMarketProductResponseProduct](docs/GetMarketProductResponseProduct.md)
 - [net.crossly.models.GetMarketProductResponseProductProposedVariants](docs/GetMarketProductResponseProductProposedVariants.md)
 - [net.crossly.models.GetMarketProductResponseVariants](docs/GetMarketProductResponseVariants.md)
 - [net.crossly.models.GetMarketVariantBookResponse](docs/GetMarketVariantBookResponse.md)
 - [net.crossly.models.GetMarketVariantBookResponseBids](docs/GetMarketVariantBookResponseBids.md)
 - [net.crossly.models.GetMeTemplateResponse](docs/GetMeTemplateResponse.md)
 - [net.crossly.models.GetMeTemplateSuggestResponse](docs/GetMeTemplateSuggestResponse.md)
 - [net.crossly.models.GetMileageSummaryResponse](docs/GetMileageSummaryResponse.md)
 - [net.crossly.models.GetNetworkPoolResponse](docs/GetNetworkPoolResponse.md)
 - [net.crossly.models.GetNetworkPoolResponseMember](docs/GetNetworkPoolResponseMember.md)
 - [net.crossly.models.GetNetworkPoolSizeResponse](docs/GetNetworkPoolSizeResponse.md)
 - [net.crossly.models.GetOauthInitResponse](docs/GetOauthInitResponse.md)
 - [net.crossly.models.GetOauthInitResponseOneOf](docs/GetOauthInitResponseOneOf.md)
 - [net.crossly.models.GetOauthInitResponseOneOf1](docs/GetOauthInitResponseOneOf1.md)
 - [net.crossly.models.GetOauthInitResponseOneOf2](docs/GetOauthInitResponseOneOf2.md)
 - [net.crossly.models.GetOauthInitResponseOneOf3](docs/GetOauthInitResponseOneOf3.md)
 - [net.crossly.models.GetOfferResponse](docs/GetOfferResponse.md)
 - [net.crossly.models.GetOfferResponseOffers](docs/GetOfferResponseOffers.md)
 - [net.crossly.models.GetOrderCancelEligibilityResponse](docs/GetOrderCancelEligibilityResponse.md)
 - [net.crossly.models.GetOrderEvidenceResponse](docs/GetOrderEvidenceResponse.md)
 - [net.crossly.models.GetOrderEvidenceResponseArrival](docs/GetOrderEvidenceResponseArrival.md)
 - [net.crossly.models.GetOrderEvidenceResponseCaptures](docs/GetOrderEvidenceResponseCaptures.md)
 - [net.crossly.models.GetOrderEvidenceResponseGrade](docs/GetOrderEvidenceResponseGrade.md)
 - [net.crossly.models.GetOrderEvidenceResponseGradeSignals](docs/GetOrderEvidenceResponseGradeSignals.md)
 - [net.crossly.models.GetOrderEvidenceResponseSeal](docs/GetOrderEvidenceResponseSeal.md)
 - [net.crossly.models.GetOrderEvidenceResponseSealAssessment](docs/GetOrderEvidenceResponseSealAssessment.md)
 - [net.crossly.models.GetOrderEvidenceResponseUnits](docs/GetOrderEvidenceResponseUnits.md)
 - [net.crossly.models.GetOrderProofOfDeliveryResponse](docs/GetOrderProofOfDeliveryResponse.md)
 - [net.crossly.models.GetOrderProofOfDeliveryResponseScans](docs/GetOrderProofOfDeliveryResponseScans.md)
 - [net.crossly.models.GetOrderResponse](docs/GetOrderResponse.md)
 - [net.crossly.models.GetOrderShipmentResponse](docs/GetOrderShipmentResponse.md)
 - [net.crossly.models.GetOrderShipmentResponseData](docs/GetOrderShipmentResponseData.md)
 - [net.crossly.models.GetPatScopeResponse](docs/GetPatScopeResponse.md)
 - [net.crossly.models.GetPatScopeResponseScopes](docs/GetPatScopeResponseScopes.md)
 - [net.crossly.models.GetPatternResponse](docs/GetPatternResponse.md)
 - [net.crossly.models.GetPayoutEstimateResponse](docs/GetPayoutEstimateResponse.md)
 - [net.crossly.models.GetPayoutGrossForNetResponse](docs/GetPayoutGrossForNetResponse.md)
 - [net.crossly.models.GetPayoutGrossForNetResponseEstimate](docs/GetPayoutGrossForNetResponseEstimate.md)
 - [net.crossly.models.GetPlatformLimitResponse](docs/GetPlatformLimitResponse.md)
 - [net.crossly.models.GetPlatformLimitResponseEbay](docs/GetPlatformLimitResponseEbay.md)
 - [net.crossly.models.GetPlatformLimitResponseEbaySellingCap](docs/GetPlatformLimitResponseEbaySellingCap.md)
 - [net.crossly.models.GetPlatformLimitResponseEtsy](docs/GetPlatformLimitResponseEtsy.md)
 - [net.crossly.models.GetReturnResponse](docs/GetReturnResponse.md)
 - [net.crossly.models.GetSizeSystemResponse](docs/GetSizeSystemResponse.md)
 - [net.crossly.models.GetSourcingReceiptResponse](docs/GetSourcingReceiptResponse.md)
 - [net.crossly.models.GetSpatialPublicResponse](docs/GetSpatialPublicResponse.md)
 - [net.crossly.models.GetSpatialPublicResponseItems](docs/GetSpatialPublicResponseItems.md)
 - [net.crossly.models.GetSpatialPublicResponseProfile](docs/GetSpatialPublicResponseProfile.md)
 - [net.crossly.models.GetSpatialPublicResponseProfileContainers](docs/GetSpatialPublicResponseProfileContainers.md)
 - [net.crossly.models.GetSpatialPublicResponseProfileItemSize](docs/GetSpatialPublicResponseProfileItemSize.md)
 - [net.crossly.models.GetSpatialPublicResponseScene](docs/GetSpatialPublicResponseScene.md)
 - [net.crossly.models.GetSpatialPublicResponseSolved](docs/GetSpatialPublicResponseSolved.md)
 - [net.crossly.models.GetSpatialPublicResponseSolvedContainers](docs/GetSpatialPublicResponseSolvedContainers.md)
 - [net.crossly.models.GetSpatialPublicResponseSolvedDividers](docs/GetSpatialPublicResponseSolvedDividers.md)
 - [net.crossly.models.GetSpatialPublicResponseSolvedPlacements](docs/GetSpatialPublicResponseSolvedPlacements.md)
 - [net.crossly.models.GetSpatialPublicResponseStats](docs/GetSpatialPublicResponseStats.md)
 - [net.crossly.models.GetSpatialSceneResponse](docs/GetSpatialSceneResponse.md)
 - [net.crossly.models.GetSpatialSceneResponseBreakdowns](docs/GetSpatialSceneResponseBreakdowns.md)
 - [net.crossly.models.GetSpatialSceneResponseItems](docs/GetSpatialSceneResponseItems.md)
 - [net.crossly.models.GetSpatialSceneResponseScene](docs/GetSpatialSceneResponseScene.md)
 - [net.crossly.models.GetSpatialSceneResponseSize](docs/GetSpatialSceneResponseSize.md)
 - [net.crossly.models.GetSpatialSceneResponseStats](docs/GetSpatialSceneResponseStats.md)
 - [net.crossly.models.GetStyleResponse](docs/GetStyleResponse.md)
 - [net.crossly.models.GetTaxScheduleCResponse](docs/GetTaxScheduleCResponse.md)
 - [net.crossly.models.GetTaxScheduleCResponseCounts](docs/GetTaxScheduleCResponseCounts.md)
 - [net.crossly.models.GetTaxScheduleCResponseExpenses](docs/GetTaxScheduleCResponseExpenses.md)
 - [net.crossly.models.GetTaxonomyCategoryAspectResponse](docs/GetTaxonomyCategoryAspectResponse.md)
 - [net.crossly.models.GetTaxonomyCategoryAspectResponseAspects](docs/GetTaxonomyCategoryAspectResponseAspects.md)
 - [net.crossly.models.GetTaxonomyCategoryChildrenResponse](docs/GetTaxonomyCategoryChildrenResponse.md)
 - [net.crossly.models.GetTaxonomyCategoryResponse](docs/GetTaxonomyCategoryResponse.md)
 - [net.crossly.models.GetTaxonomyCategoryResponseCategories](docs/GetTaxonomyCategoryResponseCategories.md)
 - [net.crossly.models.GetTaxonomyRequiredFieldResponse](docs/GetTaxonomyRequiredFieldResponse.md)
 - [net.crossly.models.GetTaxonomyRequiredFieldResponseRequiredFields](docs/GetTaxonomyRequiredFieldResponseRequiredFields.md)
 - [net.crossly.models.GetTeamResponse](docs/GetTeamResponse.md)
 - [net.crossly.models.GetTeamResponseInvitations](docs/GetTeamResponseInvitations.md)
 - [net.crossly.models.GetTeamResponseMembers](docs/GetTeamResponseMembers.md)
 - [net.crossly.models.GetTypeResponse](docs/GetTypeResponse.md)
 - [net.crossly.models.GetVariationGroupPublishPlanResponse](docs/GetVariationGroupPublishPlanResponse.md)
 - [net.crossly.models.GetVariationGroupPublishPlanResponsePlans](docs/GetVariationGroupPublishPlanResponsePlans.md)
 - [net.crossly.models.GetVariationGroupResponse](docs/GetVariationGroupResponse.md)
 - [net.crossly.models.GetWorkflowChainResponse](docs/GetWorkflowChainResponse.md)
 - [net.crossly.models.GetWorkflowChainResponseChain](docs/GetWorkflowChainResponseChain.md)
 - [net.crossly.models.InlineObject](docs/InlineObject.md)
 - [net.crossly.models.InlineObject1](docs/InlineObject1.md)
 - [net.crossly.models.InlineObject2](docs/InlineObject2.md)
 - [net.crossly.models.InlineObject3](docs/InlineObject3.md)
 - [net.crossly.models.InlineResponse200](docs/InlineResponse200.md)
 - [net.crossly.models.ListAccountsItem](docs/ListAccountsItem.md)
 - [net.crossly.models.ListActionLogCallsItem](docs/ListActionLogCallsItem.md)
 - [net.crossly.models.ListActionLogItem](docs/ListActionLogItem.md)
 - [net.crossly.models.ListAuthSessionsItem](docs/ListAuthSessionsItem.md)
 - [net.crossly.models.ListAutomationRulesItem](docs/ListAutomationRulesItem.md)
 - [net.crossly.models.ListAutomationRunsItem](docs/ListAutomationRunsItem.md)
 - [net.crossly.models.ListBuyerActivityItem](docs/ListBuyerActivityItem.md)
 - [net.crossly.models.ListBuyerCartItem](docs/ListBuyerCartItem.md)
 - [net.crossly.models.ListBuyerCashbackItem](docs/ListBuyerCashbackItem.md)
 - [net.crossly.models.ListBuyerCatalogSearchItem](docs/ListBuyerCatalogSearchItem.md)
 - [net.crossly.models.ListBuyerMonitorMatchesItem](docs/ListBuyerMonitorMatchesItem.md)
 - [net.crossly.models.ListBuyerMonitorsItem](docs/ListBuyerMonitorsItem.md)
 - [net.crossly.models.ListBuyerOrdersItem](docs/ListBuyerOrdersItem.md)
 - [net.crossly.models.ListBuyerScanSessionsItem](docs/ListBuyerScanSessionsItem.md)
 - [net.crossly.models.ListBuyerWishlistItemsItem](docs/ListBuyerWishlistItemsItem.md)
 - [net.crossly.models.ListBuyerWishlistsItem](docs/ListBuyerWishlistsItem.md)
 - [net.crossly.models.ListCbxAdCreditLedgerItem](docs/ListCbxAdCreditLedgerItem.md)
 - [net.crossly.models.ListCbxBoostsItem](docs/ListCbxBoostsItem.md)
 - [net.crossly.models.ListCbxCampaignPayoutsItem](docs/ListCbxCampaignPayoutsItem.md)
 - [net.crossly.models.ListCbxCampaignsItem](docs/ListCbxCampaignsItem.md)
 - [net.crossly.models.ListCbxDisbursementProgressItem](docs/ListCbxDisbursementProgressItem.md)
 - [net.crossly.models.ListCbxDisbursementRulesItem](docs/ListCbxDisbursementRulesItem.md)
 - [net.crossly.models.ListCbxEarnTiersItem](docs/ListCbxEarnTiersItem.md)
 - [net.crossly.models.ListCbxRedemptionServicesItem](docs/ListCbxRedemptionServicesItem.md)
 - [net.crossly.models.ListCbxStakeTiersItem](docs/ListCbxStakeTiersItem.md)
 - [net.crossly.models.ListCbxSubjectGrantsItem](docs/ListCbxSubjectGrantsItem.md)
 - [net.crossly.models.ListCbxSubjectLedgerItem](docs/ListCbxSubjectLedgerItem.md)
 - [net.crossly.models.ListCbxWalletPaymentReviewItem](docs/ListCbxWalletPaymentReviewItem.md)
 - [net.crossly.models.ListCompWatchlistRecentItem](docs/ListCompWatchlistRecentItem.md)
 - [net.crossly.models.ListCompWatchlistsItem](docs/ListCompWatchlistsItem.md)
 - [net.crossly.models.ListConnectedAppsItem](docs/ListConnectedAppsItem.md)
 - [net.crossly.models.ListConnectionsItem](docs/ListConnectionsItem.md)
 - [net.crossly.models.ListCustomersItem](docs/ListCustomersItem.md)
 - [net.crossly.models.ListDevicesItem](docs/ListDevicesItem.md)
 - [net.crossly.models.ListEmbedKeysItem](docs/ListEmbedKeysItem.md)
 - [net.crossly.models.ListImportsItem](docs/ListImportsItem.md)
 - [net.crossly.models.ListImportsItemFilters](docs/ListImportsItemFilters.md)
 - [net.crossly.models.ListInboxItem](docs/ListInboxItem.md)
 - [net.crossly.models.ListInsightByPlatformItem](docs/ListInsightByPlatformItem.md)
 - [net.crossly.models.ListInventoryActivityItem](docs/ListInventoryActivityItem.md)
 - [net.crossly.models.ListInventoryItem](docs/ListInventoryItem.md)
 - [net.crossly.models.ListInventoryItemCategory](docs/ListInventoryItemCategory.md)
 - [net.crossly.models.ListInventoryUnitsItem](docs/ListInventoryUnitsItem.md)
 - [net.crossly.models.ListInventoryUnitsItemIdentifiers](docs/ListInventoryUnitsItemIdentifiers.md)
 - [net.crossly.models.ListListingDiscrepanciesItem](docs/ListListingDiscrepanciesItem.md)
 - [net.crossly.models.ListListingsItem](docs/ListListingsItem.md)
 - [net.crossly.models.ListListingsItemGrading](docs/ListListingsItemGrading.md)
 - [net.crossly.models.ListMagicRecentItem](docs/ListMagicRecentItem.md)
 - [net.crossly.models.ListMarketGradersItem](docs/ListMarketGradersItem.md)
 - [net.crossly.models.ListMarketProductsItem](docs/ListMarketProductsItem.md)
 - [net.crossly.models.ListMarketVariantTiersItem](docs/ListMarketVariantTiersItem.md)
 - [net.crossly.models.ListMeTemplatesItem](docs/ListMeTemplatesItem.md)
 - [net.crossly.models.ListMileageItem](docs/ListMileageItem.md)
 - [net.crossly.models.ListMobilePushTokensItem](docs/ListMobilePushTokensItem.md)
 - [net.crossly.models.ListNetworkPoolLogItem](docs/ListNetworkPoolLogItem.md)
 - [net.crossly.models.ListNotificationIntegrationsItem](docs/ListNotificationIntegrationsItem.md)
 - [net.crossly.models.ListOrderUnitsItem](docs/ListOrderUnitsItem.md)
 - [net.crossly.models.ListOrderUnitsItemIdentifiers](docs/ListOrderUnitsItemIdentifiers.md)
 - [net.crossly.models.ListOrdersItem](docs/ListOrdersItem.md)
 - [net.crossly.models.ListOrdersItemTrackingHistory](docs/ListOrdersItemTrackingHistory.md)
 - [net.crossly.models.ListPatItem](docs/ListPatItem.md)
 - [net.crossly.models.ListPayoutCompareItem](docs/ListPayoutCompareItem.md)
 - [net.crossly.models.ListPolicyPresetsItem](docs/ListPolicyPresetsItem.md)
 - [net.crossly.models.ListRestockPromptsItem](docs/ListRestockPromptsItem.md)
 - [net.crossly.models.ListReturnsItem](docs/ListReturnsItem.md)
 - [net.crossly.models.ListSalesItem](docs/ListSalesItem.md)
 - [net.crossly.models.ListSalesItemDocuments](docs/ListSalesItemDocuments.md)
 - [net.crossly.models.ListSavedViewsItem](docs/ListSavedViewsItem.md)
 - [net.crossly.models.ListSourcingDemandItem](docs/ListSourcingDemandItem.md)
 - [net.crossly.models.ListSourcingDemandMineItem](docs/ListSourcingDemandMineItem.md)
 - [net.crossly.models.ListSpatialPublicItem](docs/ListSpatialPublicItem.md)
 - [net.crossly.models.ListSpatialPublicOffersItem](docs/ListSpatialPublicOffersItem.md)
 - [net.crossly.models.ListSpatialSceneMovementsItem](docs/ListSpatialSceneMovementsItem.md)
 - [net.crossly.models.ListSpatialScenesItem](docs/ListSpatialScenesItem.md)
 - [net.crossly.models.ListTaxonomySuggestItem](docs/ListTaxonomySuggestItem.md)
 - [net.crossly.models.ListTaxonomySuggestItemCatalog](docs/ListTaxonomySuggestItemCatalog.md)
 - [net.crossly.models.ListTaxonomySuggestItemDisplays](docs/ListTaxonomySuggestItemDisplays.md)
 - [net.crossly.models.ListVariationGroupsItem](docs/ListVariationGroupsItem.md)
 - [net.crossly.models.ListVariationGroupsItemMembers](docs/ListVariationGroupsItemMembers.md)
 - [net.crossly.models.ListVariationGroupsItemRollup](docs/ListVariationGroupsItemRollup.md)
 - [net.crossly.models.ListWebhooksItem](docs/ListWebhooksItem.md)
 - [net.crossly.models.ListWorkflowChainsItem](docs/ListWorkflowChainsItem.md)
 - [net.crossly.models.ListWorkflowChainsItemSteps](docs/ListWorkflowChainsItemSteps.md)
 - [net.crossly.models.Pagination](docs/Pagination.md)
 - [net.crossly.models.UpdateAdOffsiteResponse](docs/UpdateAdOffsiteResponse.md)
 - [net.crossly.models.UpdateAiKeyResponse](docs/UpdateAiKeyResponse.md)
 - [net.crossly.models.UpdateAutomationRuleResponse](docs/UpdateAutomationRuleResponse.md)
 - [net.crossly.models.UpdateBuyerCheckoutControlResponse](docs/UpdateBuyerCheckoutControlResponse.md)
 - [net.crossly.models.UpdateBuyerMonitorResponse](docs/UpdateBuyerMonitorResponse.md)
 - [net.crossly.models.UpdateConnectionEmailImapResponse](docs/UpdateConnectionEmailImapResponse.md)
 - [net.crossly.models.UpdateInboxCannedResponsResponse](docs/UpdateInboxCannedResponsResponse.md)
 - [net.crossly.models.UpdateInboxConversationResponse](docs/UpdateInboxConversationResponse.md)
 - [net.crossly.models.UpdateInboxConversationResponseConversation](docs/UpdateInboxConversationResponseConversation.md)
 - [net.crossly.models.UpdateInventoryResponse](docs/UpdateInventoryResponse.md)
 - [net.crossly.models.UpdateListingResponse](docs/UpdateListingResponse.md)
 - [net.crossly.models.UpdateMeResponse](docs/UpdateMeResponse.md)
 - [net.crossly.models.UpdateMeTemplateResponse](docs/UpdateMeTemplateResponse.md)
 - [net.crossly.models.UpdateMileageResponse](docs/UpdateMileageResponse.md)
 - [net.crossly.models.UpdateNetworkPoolResponse](docs/UpdateNetworkPoolResponse.md)
 - [net.crossly.models.UpdateNotificationIntegrationResponse](docs/UpdateNotificationIntegrationResponse.md)
 - [net.crossly.models.UpdateOrderResponse](docs/UpdateOrderResponse.md)
 - [net.crossly.models.UpdatePlatformPreferenceResponse](docs/UpdatePlatformPreferenceResponse.md)
 - [net.crossly.models.UpdatePolicyPresetResponse](docs/UpdatePolicyPresetResponse.md)
 - [net.crossly.models.UpdateReturnResponse](docs/UpdateReturnResponse.md)
 - [net.crossly.models.UpdateSavedViewResponse](docs/UpdateSavedViewResponse.md)
 - [net.crossly.models.UpdateTeamResponse](docs/UpdateTeamResponse.md)
 - [net.crossly.models.UpdateWorkflowChainResponse](docs/UpdateWorkflowChainResponse.md)
 - [net.crossly.models.V1List](docs/V1List.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="PersonalAccessToken"></a>
### PersonalAccessToken

- **Type**: HTTP basic authentication

