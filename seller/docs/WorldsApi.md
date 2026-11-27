# WorldsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperience**](WorldsApi.md#createWorldExperience) | **POST** /v1/worlds/experiences | Create an experience with a start place (no version yet). Counts against the plan&#39;s experience limit.
[**createWorldExperienceAccess**](WorldsApi.md#createWorldExperienceAccess) | **POST** /v1/worlds/experiences/{experienceId}/access | Who can play: private, friends, unlisted or public (public/unlisted need a reviewed publish).
[**createWorldExperienceAlertAck**](WorldsApi.md#createWorldExperienceAlertAck) | **POST** /v1/worlds/experiences/{experienceId}/alerts/{alertId}/ack | Acknowledge an alert.
[**createWorldExperienceAnalyticQuery**](WorldsApi.md#createWorldExperienceAnalyticQuery) | **POST** /v1/worlds/experiences/{experienceId}/analytics/query | Query one custom event over ≤ 31 days: count, sum, avg or players, by day or hour, optionally grouped by a field. Groups under 50 players are suppressed.
[**createWorldExperienceArchive**](WorldsApi.md#createWorldExperienceArchive) | **POST** /v1/worlds/experiences/{experienceId}/archive | Archive: closes it, drains its servers, frees its plan slot; data is kept.
[**createWorldExperienceBan**](WorldsApi.md#createWorldExperienceBan) | **POST** /v1/worlds/experiences/{experienceId}/bans | Ban a player from your experience: { sub, duration (seconds, null &#x3D; permanent), reason, displayReason?, applyToAlts? }. Enforced at join and on every running server.
[**createWorldExperienceClose**](WorldsApi.md#createWorldExperienceClose) | **POST** /v1/worlds/experiences/{experienceId}/close | Make the experience private again (owner-only joins).
[**createWorldExperienceConfigRollback**](WorldsApi.md#createWorldExperienceConfigRollback) | **POST** /v1/worlds/experiences/{experienceId}/configs/rollback | Instant rollback: an earlier version becomes the newest one.
[**createWorldExperienceEvent**](WorldsApi.md#createWorldExperienceEvent) | **POST** /v1/worlds/experiences/{experienceId}/events | Schedule a live event: start and end, config values while live, an optional Messaging topic the platform publishes to at start and end.
[**createWorldExperienceEventCancel**](WorldsApi.md#createWorldExperienceEventCancel) | **POST** /v1/worlds/experiences/{experienceId}/events/{eventId}/cancel | Cancel a scheduled event, or end a live one now.
[**createWorldExperienceExperiment**](WorldsApi.md#createWorldExperienceExperiment) | **POST** /v1/worlds/experiences/{experienceId}/experiments | Create a draft experiment: 2–5 variants of config values with traffic weights (+ holdout &#x3D; 100), targeting, a primary metric and guardrails, minimum 7 days.
[**createWorldExperienceExperimentShip**](WorldsApi.md#createWorldExperienceExperimentShip) | **POST** /v1/worlds/experiences/{experienceId}/experiments/{experimentId}/ship | Ship a variant: its values become the base config for everyone and the experiment ends.
[**createWorldExperienceExperimentStart**](WorldsApi.md#createWorldExperienceExperimentStart) | **POST** /v1/worlds/experiences/{experienceId}/experiments/{experimentId}/start | Start: running servers begin assigning players by their per-experience id.
[**createWorldExperienceExperimentStop**](WorldsApi.md#createWorldExperienceExperimentStop) | **POST** /v1/worlds/experiences/{experienceId}/experiments/{experimentId}/stop | Stop: every player sees the base config again.
[**createWorldExperienceJoin**](WorldsApi.md#createWorldExperienceJoin) | **POST** /v1/worlds/experiences/{experienceId}/join | Join as the token&#39;s owner: a server and a 60-second single-use ticket for wss …/v1/realtime/worlds/{serverId}. 202 while a new server boots.
[**createWorldExperienceModerationAppeal**](WorldsApi.md#createWorldExperienceModerationAppeal) | **POST** /v1/worlds/experiences/{experienceId}/moderation/appeals | Appeal a moderation decision on your game within 6 months (183 days): { kind: action | game | version | asset, targetId (from GET …/moderation/appeals targets), reason (20-4000 characters), evidence?: up to 5 https links }. The older shape { actionId, statement } still appeals an action. One open appeal per decision; a different reviewer answers and you are notified.
[**createWorldExperienceOpen**](WorldsApi.md#createWorldExperienceOpen) | **POST** /v1/worlds/experiences/{experienceId}/open | Open the experience to players (needs a published start place).
[**createWorldExperiencePlace**](WorldsApi.md#createWorldExperiencePlace) | **POST** /v1/worlds/experiences/{experienceId}/places | Add a place (at most 10 per experience in P1).
[**createWorldExperiencePlaceCheck**](WorldsApi.md#createWorldExperiencePlaceCheck) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/checks | Run the publish checks (script lint, budgets, shop-object listings) on a project. Writes nothing.
[**createWorldExperiencePlacePublish**](WorldsApi.md#createWorldExperiencePlacePublish) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/publishes | Step 1: run checks and freeze a version (the saved draft, or an uploaded versionId). Blocking problems answer 400 with the list.
[**createWorldExperiencePlaceStart**](WorldsApi.md#createWorldExperiencePlaceStart) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/start | Make this the start place (where a plain join lands).
[**createWorldExperiencePlaceTest**](WorldsApi.md#createWorldExperiencePlaceTest) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/test | Cloud playtest: a private test version from the saved draft, joined on a fleet server (owner only, never live). 202 while it boots.
[**createWorldExperiencePlaceVersion**](WorldsApi.md#createWorldExperiencePlaceVersion) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/versions | Upload a version bundle (crossly-worlds-project/1). Not live until published.
[**createWorldExperiencePlaceVersionPublish**](WorldsApi.md#createWorldExperiencePlaceVersionPublish) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/versions/{versionId}/publish | Make a version current (publish or roll back). New joins land on it; older servers drain as they empty.
[**createWorldExperiencePlaceVersionRollback**](WorldsApi.md#createWorldExperiencePlaceVersionRollback) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/versions/{versionId}/rollback | Make an earlier reviewed version current again. Unreviewed versions go through …/publishes.
[**createWorldExperiencePlaytester**](WorldsApi.md#createWorldExperiencePlaytester) | **POST** /v1/worlds/experiences/{experienceId}/playtesters | Add a playtester by Crossly handle (max 200 per game).
[**createWorldExperiencePublishCancel**](WorldsApi.md#createWorldExperiencePublishCancel) | **POST** /v1/worlds/experiences/{experienceId}/publishes/{requestId}/cancel | Give up a publish that is not live.
[**createWorldExperiencePublishHalt**](WorldsApi.md#createWorldExperiencePublishHalt) | **POST** /v1/worlds/experiences/{experienceId}/publishes/{requestId}/halt | Stop a rollout: new joins go back to the current version.
[**createWorldExperiencePublishRollout**](WorldsApi.md#createWorldExperiencePublishRollout) | **POST** /v1/worlds/experiences/{experienceId}/publishes/{requestId}/rollout | Step 7: serve the approved version to percent (1–100) of new joins; 100 makes it current. Crash-heavy rollouts halt automatically.
[**createWorldExperiencePublishSubmit**](WorldsApi.md#createWorldExperiencePublishSubmit) | **POST** /v1/worlds/experiences/{experienceId}/publishes/{requestId}/submit | Step 6: moderation. First publishes and script changes go to a person (24 h SLA); layout-only and private publishes are approved automatically.
[**createWorldExperienceReservedServer**](WorldsApi.md#createWorldExperienceReservedServer) | **POST** /v1/worlds/experiences/{experienceId}/reserved-servers | An access code for a reserved server of a place (teleports, matches, tournaments). The code is shown once.
[**createWorldExperienceRestore**](WorldsApi.md#createWorldExperienceRestore) | **POST** /v1/worlds/experiences/{experienceId}/restore | Restore an archived game, or a deleted one within 30 days; it comes back private.
[**createWorldExperienceServerShutdown**](WorldsApi.md#createWorldExperienceServerShutdown) | **POST** /v1/worlds/experiences/{experienceId}/servers/shutdown | Shut down servers: mode soft (default) teleports players to fresh servers of the current version first; hard stops now. scope all | outdated (only servers not on a served version).
[**createWorldExperienceTransferRequest**](WorldsApi.md#createWorldExperienceTransferRequest) | **POST** /v1/worlds/experiences/{experienceId}/transfer-requests | Ask another Crossly account (handle or email) to take over a 3D game you own. One waiting request per game; it expires after 14 days.
[**createWorldMatureVerify**](WorldsApi.md#createWorldMatureVerify) | **POST** /v1/worlds/mature/verify | Start the ID check Mature needs (Stripe Identity: photo ID + selfie; the date of birth is read off the ID). Returns a hosted URL and client secret, or alreadyVerified.
[**createWorldParentalAccept**](WorldsApi.md#createWorldParentalAccept) | **POST** /v1/worlds/parental/accept | Accept a child&#39;s invite as the parent: { code, pin }. The parent must be an ID-verified adult (18+ by the date of birth on the ID). The PIN protects every later change.
[**createWorldParentalChildrenPin**](WorldsApi.md#createWorldParentalChildrenPin) | **POST** /v1/worlds/parental/children/{childId}/pin | Change the parent PIN: { pin, newPin } (4-8 digits). Five wrong PINs lock changes for 15 minutes.
[**createWorldParentalChildrenUnlink**](WorldsApi.md#createWorldParentalChildrenUnlink) | **POST** /v1/worlds/parental/children/{childId}/unlink | Remove the parent link (and its limits) with your PIN: { pin }.
[**createWorldParentalInvite**](WorldsApi.md#createWorldParentalInvite) | **POST** /v1/worlds/parental/invite | An under-18 account asks for a parent: a one-time code (72 hours) the parent enters while signed in to their own account. Replaces any pending code.
[**createWorldRatingCompute**](WorldsApi.md#createWorldRatingCompute) | **POST** /v1/worlds/rating/compute | Rate a set of questionnaire answers exactly as publishing does: { answers } → rating (null when refused), reasons, content descriptors, interactive notices and refusals.
[**createWorldReport**](WorldsApi.md#createWorldReport) | **POST** /v1/worlds/reports | Report a player (targetSub), the experience, an object (targetInstanceId) or a chat line (chatLineId). Crossly attaches the server, place version and its own chat log; you send ids only.
[**createWorldTransferRequestAccept**](WorldsApi.md#createWorldTransferRequestAccept) | **POST** /v1/worlds/transfer-requests/{requestId}/accept | Accept a transfer asked of you: the game becomes yours now. Earnings already credited stay with the previous owner; new sales pay you.
[**createWorldTransferRequestCancel**](WorldsApi.md#createWorldTransferRequestCancel) | **POST** /v1/worlds/transfer-requests/{requestId}/cancel | Cancel a transfer request you sent while it waits.
[**createWorldTransferRequestDecline**](WorldsApi.md#createWorldTransferRequestDecline) | **POST** /v1/worlds/transfer-requests/{requestId}/decline | Decline a transfer asked of you; nothing changes.
[**deleteWorldExperience**](WorldsApi.md#deleteWorldExperience) | **DELETE** /v1/worlds/experiences/{experienceId} | Delete a game (a tombstone, restorable for 30 days). Body { confirmName } &#x3D; the game&#39;s name.
[**deleteWorldExperienceBan**](WorldsApi.md#deleteWorldExperienceBan) | **DELETE** /v1/worlds/experiences/{experienceId}/bans/{sub} | Lift your experience&#39;s ban on a player. Bans placed by Crossly safety are lifted only by appeal.
[**deleteWorldExperiencePlaytester**](WorldsApi.md#deleteWorldExperiencePlaytester) | **DELETE** /v1/worlds/experiences/{experienceId}/playtesters/{userId} | Remove a playtester.
[**deleteWorldParentalInvite**](WorldsApi.md#deleteWorldParentalInvite) | **DELETE** /v1/worlds/parental/invite | Withdraw a pending parent invite.
[**getWorldChart**](WorldsApi.md#getWorldChart) | **GET** /v1/worlds/charts/{chart} | A chart: top-playing (players now), trending (this week vs last, retention-weighted), top-rated (Wilson lower bound of thumbs up, 10+ votes), new-rising, friends, most-favorited; ?genre&#x3D; cuts it to one genre. Organic only: nothing paid.
[**getWorldDiscoverExperience**](WorldsApi.md#getWorldDiscoverExperience) | **GET** /v1/worlds/discover/experiences/{key} | An experience&#39;s thumbs up/down, favourites, your vote and favourite, and whether you have played enough to vote (10 minutes). key: worlds:&lt;id&gt;, classic:&lt;id&gt;, tcg:&lt;game&gt;, cards:&lt;game&gt;.
[**getWorldDiscoverRow**](WorldsApi.md#getWorldDiscoverRow) | **GET** /v1/worlds/discover/rows | The Play hub&#39;s rows for you: Continue playing, Friends are playing, Recommended for you, Featured (editorial, first-party capped), Top Playing, Trending, New &amp; Rising, Top Rated, Made in Carnival Studio, Shop the world, card games, Classic games and genre rows. At most one tile is paid, always labelled \&quot;Sponsored\&quot;, never in the first two rows or a row&#39;s first two places.
[**getWorldExperience**](WorldsApi.md#getWorldExperience) | **GET** /v1/worlds/experiences/{experienceId} | One of your experiences with its places, live CCU and server count.
[**getWorldExperienceAccessLimit**](WorldsApi.md#getWorldExperienceAccessLimit) | **GET** /v1/worlds/experiences/{experienceId}/access-limits | The game&#39;s crew-only and country limits, and the owner&#39;s crew.
[**getWorldExperienceAlertSetting**](WorldsApi.md#getWorldExperienceAlertSetting) | **GET** /v1/worlds/experiences/{experienceId}/alerts/settings | Alert rules (threshold, on/off, inbox, webhook) and quiet hours.
[**getWorldExperienceAnalytic**](WorldsApi.md#getWorldExperienceAnalytic) | **GET** /v1/worlds/experiences/{experienceId}/analytics/{report} | An analytics report: overview, engagement, retention, monetization, funnels, economy, performance, custom or costs (fleet CPU-minutes, egress, estimated cost). ?from&#x3D;&amp;to&#x3D; (YYYY-MM-DD), retention ?segment&#x3D;, funnels ?funnel&#x3D;, economy ?currency&#x3D;.
[**getWorldExperienceBan**](WorldsApi.md#getWorldExperienceBan) | **GET** /v1/worlds/experiences/{experienceId}/bans/{sub} | The live ban on one player, or 404.
[**getWorldExperienceChatSetting**](WorldsApi.md#getWorldExperienceChatSetting) | **GET** /v1/worlds/experiences/{experienceId}/chat-settings | The game&#39;s text chat setting and filter level.
[**getWorldExperienceConfig**](WorldsApi.md#getWorldExperienceConfig) | **GET** /v1/worlds/experiences/{experienceId}/configs | The remote config document ({ values, rules }) and its version.
[**getWorldExperienceExperiment**](WorldsApi.md#getWorldExperienceExperiment) | **GET** /v1/worlds/experiences/{experienceId}/experiments/{experimentId} | Results per variant: n, mean, lift, fixed and always-valid 95% intervals, the verdict and a sample-size estimate.
[**getWorldExperienceMaturity**](WorldsApi.md#getWorldExperienceMaturity) | **GET** /v1/worlds/experiences/{experienceId}/maturity | The content maturity questionnaire: questions, answers, the published rating and any rating waiting for the next publish.
[**getWorldExperienceModeration**](WorldsApi.md#getWorldExperienceModeration) | **GET** /v1/worlds/experiences/{experienceId}/moderation | Moderation status of your experience: holds (unlisted / taken down), the latest review, the automated scan, strikes, trusted-lane status, open reports and live bans.
[**getWorldExperienceModerationAppeal**](WorldsApi.md#getWorldExperienceModerationAppeal) | **GET** /v1/worlds/experiences/{experienceId}/moderation/appeals | What you can appeal on your game and every appeal of it: data.targets (Crossly&#39;s actions, a moderation hold, rejected versions, blocked assets; each with appealableUntil and its latest appeal) and data.appeals (newest first: kind, status open | upheld | overturned, reason, evidence, the reviewer&#39;s note).
[**getWorldExperiencePlaceDraft**](WorldsApi.md#getWorldExperiencePlaceDraft) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/draft | The Studio draft of a place ({ world, place }, revision). Falls back to the current version, or an empty place.
[**getWorldExperiencePublish**](WorldsApi.md#getWorldExperiencePublish) | **GET** /v1/worlds/experiences/{experienceId}/publishes/{requestId} | One publish with its review state and rollout.
[**getWorldExperienceShop**](WorldsApi.md#getWorldExperienceShop) | **GET** /v1/worlds/experiences/{experienceId}/shop | An open experience&#39;s way back to commerce: its creator&#39;s shop and how many live listings it has.
[**getWorldExperienceShowcase**](WorldsApi.md#getWorldExperienceShowcase) | **GET** /v1/worlds/experiences/{experienceId}/showcase | The listings the game&#39;s page showcases, and the owner&#39;s live Crossly listings that can be picked.
[**getWorldFriendPlaying**](WorldsApi.md#getWorldFriendPlaying) | **GET** /v1/worlds/friends/playing | Your friends (mutual follows) and where each is playing right now, with the link that joins them.
[**getWorldGameByGame**](WorldsApi.md#getWorldGameByGame) | **GET** /v1/worlds/games/{game} | A game&#39;s page, as the /games launcher shows it: the tile (players now, thumbs-up %, friends inside), description, tags, creator (Crossly for its own), rating with its content descriptors, visits, created and updated, release notes, gallery, what it sells (bought through Crossly checkout) and the Crossly World app link. :game is a Worlds experience id or any experience key.
[**getWorldGameMine**](WorldsApi.md#getWorldGameMine) | **GET** /v1/worlds/games/mine/{gameId} | A game&#39;s summary: status, timeline, the sub-pages you may open, health and next steps.
[**getWorldGameMineAssetsUsed**](WorldsApi.md#getWorldGameMineAssetsUsed) | **GET** /v1/worlds/games/mine/{gameId}/assets-used | Everything a game&#39;s published build ships (Assets used): models, sounds, images, scripts, Toolbox assets and other files, each with the places that ship it. A 3D world reads each place&#39;s current version; a Classic game its latest reviewed package version.
[**getWorldGameServer**](WorldsApi.md#getWorldGameServer) | **GET** /v1/worlds/games/{game}/servers | A Crossly Carnival game&#39;s public servers that are up: players, max, whether a stranger still fits, your friends on each (friends&#39; servers first, then the fullest with room); and the private servers you pay for. Join one with POST /v1/worlds/experiences/:id/join { serverId }.
[**getWorldLinkCardGame**](WorldsApi.md#getWorldLinkCardGame) | **GET** /v1/worlds/links/card-game/{game} | Where to play a card game: Crossly&#39;s own game, its Commons tables, and creator worlds that tag it.
[**getWorldLinkListing**](WorldsApi.md#getWorldLinkListing) | **GET** /v1/worlds/links/listing/{slug} | \&quot;Try it in Crossly Carnival\&quot;: open games whose live version shows this Crossly listing (its shop slug), then other games by the same seller. Links only: a sale is attributed to a game only through in-world touches its server reports.
[**getWorldLinkSeller**](WorldsApi.md#getWorldLinkSeller) | **GET** /v1/worlds/links/seller/{username} | \&quot;Games by this seller\&quot;: the seller&#39;s open games, best first.
[**getWorldMature**](WorldsApi.md#getWorldMature) | **GET** /v1/worlds/mature | Mature (17+) for this account: eligible or not, the steps still to take in order (birth month, ID check, opt-in; region, parental controls and safety holds are final), and the ID age check status.
[**getWorldMePref**](WorldsApi.md#getWorldMePref) | **GET** /v1/worlds/me/prefs | Your Crossly Carnival choices (whether games may see your Crossly wallet address).
[**getWorldParentalChildren**](WorldsApi.md#getWorldParentalChildren) | **GET** /v1/worlds/parental/children/{childId} | One linked account with ?days&#x3D; (1-90) of playtime per experience.
[**getWorldParentalMe**](WorldsApi.md#getWorldParentalMe) | **GET** /v1/worlds/parental/me | This account&#39;s parent link: none, pending (an invite is out) or active (the parent&#39;s name and the limits they set).
[**getWorldPlaza**](WorldsApi.md#getWorldPlaza) | **GET** /v1/worlds/plaza | The Carnival Plaza district: the twelve-portal ring (a sponsored portal can only take the last slot, labelled), the new &amp; rising row, the featured stage&#39;s editorial pick and four chart boards, with players now and friends inside.
[**getWorldPolicyMe**](WorldsApi.md#getWorldPolicyMe) | **GET** /v1/worlds/policy/me | What this account may do in experiences, by age and region: chat level, purchases, paid random items, trading, links, ads, contests, rating ceiling — with the reason for each \&quot;no\&quot;.
[**getWorldRatingQuestionnaire**](WorldsApi.md#getWorldRatingQuestionnaire) | **GET** /v1/worlds/rating/questionnaire | The content-rating questionnaire (IARC-aligned): every question and choice, the three ratings (Everyone, Teen 13+, Mature 17+), what is never allowed, and the regions where Mature is restricted.
[**getWorldSearch**](WorldsApi.md#getWorldSearch) | **GET** /v1/worlds/search | Search experiences by title, creator, tags and genre (typo-tolerant, synonyms such as obby / obstacle). Filters: genre, rating (everyone keeps to Everyone), device, players (one server holds at least N), minThumbs (percent), live, friends. No results suggests a chart.
[**getWorldTransferRequest**](WorldsApi.md#getWorldTransferRequest) | **GET** /v1/worlds/transfer-requests/{requestId} | One ownership transfer request (only its two people can read it), with the actions you may take.
[**getWorldTransparency**](WorldsApi.md#getWorldTransparency) | **GET** /v1/worlds/transparency/{month} | One month&#39;s transparency report (YYYY-MM): reports by reason and source, decisions and median time to decide, actions by kind and issuer, appeals and overturn rate, publish reviews, second reviews of creator bans.
[**listWorldAppeals**](WorldsApi.md#listWorldAppeals) | **GET** /v1/worlds/appeals | Your appeals and their decisions.
[**listWorldExperienceAlerts**](WorldsApi.md#listWorldExperienceAlerts) | **GET** /v1/worlds/experiences/{experienceId}/alerts | Alerts that fired, newest first.
[**listWorldExperienceAudit**](WorldsApi.md#listWorldExperienceAudit) | **GET** /v1/worlds/experiences/{experienceId}/audit | The live-ops audit log: every config, experiment, event and alert change, who made it, when.
[**listWorldExperienceBans**](WorldsApi.md#listWorldExperienceBans) | **GET** /v1/worlds/experiences/{experienceId}/bans | Players banned from your experience (by pairwise sub), oldest first (cursor).
[**listWorldExperienceConfigVersions**](WorldsApi.md#listWorldExperienceConfigVersions) | **GET** /v1/worlds/experiences/{experienceId}/configs/versions | Config history, newest first: who changed which keys, when.
[**listWorldExperienceEvents**](WorldsApi.md#listWorldExperienceEvents) | **GET** /v1/worlds/experiences/{experienceId}/events | Scheduled and live events (?includeEnded&#x3D;true for history).
[**listWorldExperienceExperiments**](WorldsApi.md#listWorldExperienceExperiments) | **GET** /v1/worlds/experiences/{experienceId}/experiments | A/B experiments, newest first, with their live verdict.
[**listWorldExperienceModerationReports**](WorldsApi.md#listWorldExperienceModerationReports) | **GET** /v1/worlds/experiences/{experienceId}/moderation/reports | Reports about your experience, newest first (cursor). Reporter identity, account ids and other players&#39; words are removed.
[**listWorldExperiencePlacePublishes**](WorldsApi.md#listWorldExperiencePlacePublishes) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/publishes | Publishes of a place, newest first: state, checks, rating, access, review, rollout.
[**listWorldExperiencePlaceVersions**](WorldsApi.md#listWorldExperiencePlaceVersions) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/versions | Version history of a place, newest first; &#x60;current&#x60; marks the live one.
[**listWorldExperiencePlaces**](WorldsApi.md#listWorldExperiencePlaces) | **GET** /v1/worlds/experiences/{experienceId}/places | The places of an experience, start place first.
[**listWorldExperiencePlaytesters**](WorldsApi.md#listWorldExperiencePlaytesters) | **GET** /v1/worlds/experiences/{experienceId}/playtesters | People who may join while the game is private.
[**listWorldExperienceServers**](WorldsApi.md#listWorldExperienceServers) | **GET** /v1/worlds/experiences/{experienceId}/servers | Live servers: place, version, region, players, health.
[**listWorldExperiences**](WorldsApi.md#listWorldExperiences) | **GET** /v1/worlds/experiences | Your experiences, newest first; cursor-paged (?cursor&#x3D;&amp;limit&#x3D;).
[**listWorldFavorites**](WorldsApi.md#listWorldFavorites) | **GET** /v1/worlds/favorites | Your favourite experiences that are still open, newest first.
[**listWorldGameMine**](WorldsApi.md#listWorldGameMine) | **GET** /v1/worlds/games/mine | Every game you own or collaborate on, 3D worlds and Classic, filtered (?q&amp;status&amp;engine&amp;genre&amp;template&amp;owner&amp;flag&amp;sort; sort&#x3D;revenue &#x3D; highest earning first). Each row carries revenueCents: your creator-ledger earnings from it in USD cents (null for Classic).
[**listWorldParentalChildren**](WorldsApi.md#listWorldParentalChildren) | **GET** /v1/worlds/parental/children | Accounts you are the linked parent of: limits (max rating, chat, monthly spend), spend this month, and the last 7 days of playtime per experience.
[**listWorldRecent**](WorldsApi.md#listWorldRecent) | **GET** /v1/worlds/recent | Continue playing: what you played in the last 90 days that is still open, newest first (from what the servers recorded).
[**listWorldRegions**](WorldsApi.md#listWorldRegions) | **GET** /v1/worlds/regions | Live server regions with a probe URL each: GET it a few times, send the round trips as &#x60;pings&#x60; with the join to land in the nearest region.
[**listWorldShopListings**](WorldsApi.md#listWorldShopListings) | **GET** /v1/worlds/shop-listings | Your live Crossly listings a game can show and sell (shop objects bind to their id).
[**listWorldTransferRequests**](WorldsApi.md#listWorldTransferRequests) | **GET** /v1/worlds/transfer-requests | Ownership transfer requests you were asked (incoming) or sent (outgoing), newest first (?direction&amp;status&amp;experienceId).
[**listWorldTransparency**](WorldsApi.md#listWorldTransparency) | **GET** /v1/worlds/transparency | Published monthly transparency reports, newest first: reports received and actions taken, by type (counts only).
[**updateWorldExperience**](WorldsApi.md#updateWorldExperience) | **PATCH** /v1/worlds/experiences/{experienceId} | Edit name, description, genre, rating or icon.
[**updateWorldExperienceAccessLimit**](WorldsApi.md#updateWorldExperienceAccessLimit) | **PUT** /v1/worlds/experiences/{experienceId}/access-limits | Limit who can play: { crewOnly } (only members of the owner&#39;s crew), { countryMode: all|allow|block, countries: [&#39;US&#39;, ...] }. The owner and team are never limited.
[**updateWorldExperienceAlertSetting**](WorldsApi.md#updateWorldExperienceAlertSetting) | **PUT** /v1/worlds/experiences/{experienceId}/alerts/settings | Change alert rules and quiet hours.
[**updateWorldExperienceChatSetting**](WorldsApi.md#updateWorldExperienceChatSetting) | **PUT** /v1/worlds/experiences/{experienceId}/chat-settings | Turn text chat off or use the strict filter for everyone (never looser than the platform).
[**updateWorldExperienceConfig**](WorldsApi.md#updateWorldExperienceConfig) | **PUT** /v1/worlds/experiences/{experienceId}/configs | Save the whole config document. Running servers get it within seconds (ConfigService.Changed). baseVersion guards against overwriting a newer save (409).
[**updateWorldExperienceConfigValue**](WorldsApi.md#updateWorldExperienceConfigValue) | **PATCH** /v1/worlds/experiences/{experienceId}/configs/values | Set and/or remove individual config keys.
[**updateWorldExperienceEvent**](WorldsApi.md#updateWorldExperienceEvent) | **PATCH** /v1/worlds/experiences/{experienceId}/events/{eventId} | Reschedule or change a scheduled event; a live event may only move its end.
[**updateWorldExperienceExperiment**](WorldsApi.md#updateWorldExperienceExperiment) | **PATCH** /v1/worlds/experiences/{experienceId}/experiments/{experimentId} | Edit a draft (a running experiment may only rename or reword).
[**updateWorldExperienceMaturity**](WorldsApi.md#updateWorldExperienceMaturity) | **PUT** /v1/worlds/experiences/{experienceId}/maturity | Answer the questionnaire: { answers }. A stricter rating applies now; a looser or first Mature rating waits for the next reviewed publish (takesEffect).
[**updateWorldExperiencePlace**](WorldsApi.md#updateWorldExperiencePlace) | **PATCH** /v1/worlds/experiences/{experienceId}/places/{placeId} | Place settings: name, max players (1-50), fill target, social slots, empty shutdown.
[**updateWorldExperiencePlaceDraft**](WorldsApi.md#updateWorldExperiencePlaceDraft) | **PUT** /v1/worlds/experiences/{experienceId}/places/{placeId}/draft | Save the draft. baseRevision is the revision you loaded (0 for none); a newer save elsewhere answers 409 draft_conflict.
[**updateWorldExperiencePlaceVersionNote**](WorldsApi.md#updateWorldExperiencePlaceVersionNote) | **PUT** /v1/worlds/experiences/{experienceId}/places/{placeId}/versions/{versionId}/notes | Edit a release version&#39;s changelog (the game page&#39;s What&#39;s new): { notes } up to 2000 characters.
[**updateWorldExperiencePublish**](WorldsApi.md#updateWorldExperiencePublish) | **PATCH** /v1/worlds/experiences/{experienceId}/publishes/{requestId} | Steps 2–5: details, rating questionnaire answers, access (private | friends | unlisted | public), money review acknowledgement.
[**updateWorldExperienceShowcase**](WorldsApi.md#updateWorldExperienceShowcase) | **PUT** /v1/worlds/experiences/{experienceId}/showcase | Set the showcased listings: { listingIds } (Crossly shop slugs of the owner&#39;s live listings, max 12, in order).
[**updateWorldFavorite**](WorldsApi.md#updateWorldFavorite) | **PUT** /v1/worlds/favorites | Favourite or un-favourite an experience (idempotent).
[**updateWorldMature**](WorldsApi.md#updateWorldMature) | **PUT** /v1/worlds/mature | Switch \&quot;Show Mature experiences\&quot; on or off: { showMature }. On is refused while a final step blocks (too young, region, parental controls, safety hold); it never skips the ID check.
[**updateWorldMePref**](WorldsApi.md#updateWorldMePref) | **PUT** /v1/worlds/me/prefs | Set your Crossly Carnival choices.
[**updateWorldParentalChildren**](WorldsApi.md#updateWorldParentalChildren) | **PATCH** /v1/worlds/parental/children/{childId} | Change a linked account&#39;s limits with your PIN: { pin, settings: { maxRating: everyone|teen, chat: on|friends|off, monthlySpendLimitCents (0 &#x3D; no purchases, null &#x3D; no limit) } }. Enforced server-side at join, chat, the purchase prompt and checkout.
[**updateWorldVote**](WorldsApi.md#updateWorldVote) | **PUT** /v1/worlds/votes | Thumbs up, down, or null to withdraw: one vote per player per experience, counted only after 10 minutes of play (403 vote_needs_playtime before). A light ranking signal.


<a name="createWorldExperience"></a>
# **createWorldExperience**
> CreateWorldExperienceResponse createWorldExperience()

Create an experience with a start place (no version yet). Counts against the plan&#39;s experience limit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : CreateWorldExperienceResponse = apiInstance.createWorldExperience()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperience")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperience")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldExperienceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceAccess"></a>
# **createWorldExperienceAccess**
> WorldExperienceResponse createWorldExperienceAccess(experienceId)

Who can play: private, friends, unlisted or public (public/unlisted need a reviewed publish).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse = apiInstance.createWorldExperienceAccess(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceAlertAck"></a>
# **createWorldExperienceAlertAck**
> CreateWorldExperienceAlertAckResponse createWorldExperienceAlertAck(experienceId, alertId)

Acknowledge an alert.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val alertId : kotlin.String = alertId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceAlertAckResponse = apiInstance.createWorldExperienceAlertAck(experienceId, alertId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceAlertAck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceAlertAck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **alertId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceAlertAckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceAnalyticQuery"></a>
# **createWorldExperienceAnalyticQuery**
> CreateWorldExperienceAnalyticQueryResponse createWorldExperienceAnalyticQuery(experienceId)

Query one custom event over ≤ 31 days: count, sum, avg or players, by day or hour, optionally grouped by a field. Groups under 50 players are suppressed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceAnalyticQueryResponse = apiInstance.createWorldExperienceAnalyticQuery(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceAnalyticQuery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceAnalyticQuery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceAnalyticQueryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceArchive"></a>
# **createWorldExperienceArchive**
> WorldExperienceResponse createWorldExperienceArchive(experienceId)

Archive: closes it, drains its servers, frees its plan slot; data is kept.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse = apiInstance.createWorldExperienceArchive(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceArchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceBan"></a>
# **createWorldExperienceBan**
> GetWorldExperienceBanResponse createWorldExperienceBan(experienceId)

Ban a player from your experience: { sub, duration (seconds, null &#x3D; permanent), reason, displayReason?, applyToAlts? }. Enforced at join and on every running server.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceBanResponse = apiInstance.createWorldExperienceBan(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceBan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceBan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceBanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceClose"></a>
# **createWorldExperienceClose**
> WorldExperienceResponse createWorldExperienceClose(experienceId)

Make the experience private again (owner-only joins).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse = apiInstance.createWorldExperienceClose(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceClose")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceConfigRollback"></a>
# **createWorldExperienceConfigRollback**
> WorldExperienceConfigResponse createWorldExperienceConfigRollback(experienceId)

Instant rollback: an earlier version becomes the newest one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceConfigResponse = apiInstance.createWorldExperienceConfigRollback(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceConfigRollback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceConfigRollback")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceConfigResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceEvent"></a>
# **createWorldExperienceEvent**
> WorldExperienceEventResponse createWorldExperienceEvent(experienceId)

Schedule a live event: start and end, config values while live, an optional Messaging topic the platform publishes to at start and end.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceEventResponse = apiInstance.createWorldExperienceEvent(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceEventCancel"></a>
# **createWorldExperienceEventCancel**
> WorldExperienceEventResponse createWorldExperienceEventCancel(experienceId, eventId)

Cancel a scheduled event, or end a live one now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val eventId : kotlin.String = eventId_example // kotlin.String | 
try {
    val result : WorldExperienceEventResponse = apiInstance.createWorldExperienceEventCancel(experienceId, eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceEventCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceEventCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **eventId** | **kotlin.String**|  |

### Return type

**WorldExperienceEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceExperiment"></a>
# **createWorldExperienceExperiment**
> WorldExperienceExperimentResponse createWorldExperienceExperiment(experienceId)

Create a draft experiment: 2–5 variants of config values with traffic weights (+ holdout &#x3D; 100), targeting, a primary metric and guardrails, minimum 7 days.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceExperimentResponse = apiInstance.createWorldExperienceExperiment(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceExperiment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceExperiment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceExperimentShip"></a>
# **createWorldExperienceExperimentShip**
> WorldExperienceExperimentResponse createWorldExperienceExperimentShip(experienceId, experimentId)

Ship a variant: its values become the base config for everyone and the experiment ends.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val experimentId : kotlin.String = experimentId_example // kotlin.String | 
try {
    val result : WorldExperienceExperimentResponse = apiInstance.createWorldExperienceExperimentShip(experienceId, experimentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceExperimentShip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceExperimentShip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **experimentId** | **kotlin.String**|  |

### Return type

**WorldExperienceExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceExperimentStart"></a>
# **createWorldExperienceExperimentStart**
> WorldExperienceExperimentResponse createWorldExperienceExperimentStart(experienceId, experimentId)

Start: running servers begin assigning players by their per-experience id.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val experimentId : kotlin.String = experimentId_example // kotlin.String | 
try {
    val result : WorldExperienceExperimentResponse = apiInstance.createWorldExperienceExperimentStart(experienceId, experimentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceExperimentStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceExperimentStart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **experimentId** | **kotlin.String**|  |

### Return type

**WorldExperienceExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceExperimentStop"></a>
# **createWorldExperienceExperimentStop**
> WorldExperienceExperimentResponse createWorldExperienceExperimentStop(experienceId, experimentId)

Stop: every player sees the base config again.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val experimentId : kotlin.String = experimentId_example // kotlin.String | 
try {
    val result : WorldExperienceExperimentResponse = apiInstance.createWorldExperienceExperimentStop(experienceId, experimentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceExperimentStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceExperimentStop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **experimentId** | **kotlin.String**|  |

### Return type

**WorldExperienceExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceJoin"></a>
# **createWorldExperienceJoin**
> CreateWorldExperienceJoinResponse createWorldExperienceJoin(experienceId)

Join as the token&#39;s owner: a server and a 60-second single-use ticket for wss …/v1/realtime/worlds/{serverId}. 202 while a new server boots.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceJoinResponse = apiInstance.createWorldExperienceJoin(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceJoinResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceModerationAppeal"></a>
# **createWorldExperienceModerationAppeal**
> CreateWorldExperienceModerationAppealResponse createWorldExperienceModerationAppeal(experienceId)

Appeal a moderation decision on your game within 6 months (183 days): { kind: action | game | version | asset, targetId (from GET …/moderation/appeals targets), reason (20-4000 characters), evidence?: up to 5 https links }. The older shape { actionId, statement } still appeals an action. One open appeal per decision; a different reviewer answers and you are notified.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceModerationAppealResponse = apiInstance.createWorldExperienceModerationAppeal(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceModerationAppeal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceModerationAppeal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceModerationAppealResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceOpen"></a>
# **createWorldExperienceOpen**
> WorldExperienceResponse createWorldExperienceOpen(experienceId)

Open the experience to players (needs a published start place).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse = apiInstance.createWorldExperienceOpen(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceOpen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceOpen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlace"></a>
# **createWorldExperiencePlace**
> WorldExperiencePlaceResponse createWorldExperiencePlace(experienceId)

Add a place (at most 10 per experience in P1).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperiencePlaceResponse = apiInstance.createWorldExperiencePlace(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePlace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePlace")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperiencePlaceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceCheck"></a>
# **createWorldExperiencePlaceCheck**
> CreateWorldExperiencePlaceCheckResponse createWorldExperiencePlaceCheck(experienceId, placeId)

Run the publish checks (script lint, budgets, shop-object listings) on a project. Writes nothing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceCheckResponse = apiInstance.createWorldExperiencePlaceCheck(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePlaceCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePlaceCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceCheckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlacePublish"></a>
# **createWorldExperiencePlacePublish**
> WorldExperienceResponse2 createWorldExperiencePlacePublish(experienceId, placeId)

Step 1: run checks and freeze a version (the saved draft, or an uploaded versionId). Blocking problems answer 400 with the list.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse2 = apiInstance.createWorldExperiencePlacePublish(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePlacePublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePlacePublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceStart"></a>
# **createWorldExperiencePlaceStart**
> WorldExperiencePlaceResponse createWorldExperiencePlaceStart(experienceId, placeId)

Make this the start place (where a plain join lands).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : WorldExperiencePlaceResponse = apiInstance.createWorldExperiencePlaceStart(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePlaceStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePlaceStart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**WorldExperiencePlaceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceTest"></a>
# **createWorldExperiencePlaceTest**
> CreateWorldExperiencePlaceTestResponse createWorldExperiencePlaceTest(experienceId, placeId)

Cloud playtest: a private test version from the saved draft, joined on a fleet server (owner only, never live). 202 while it boots.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceTestResponse = apiInstance.createWorldExperiencePlaceTest(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePlaceTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePlaceTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceTestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceVersion"></a>
# **createWorldExperiencePlaceVersion**
> WorldExperiencePlaceVersionResponse createWorldExperiencePlaceVersion(experienceId, placeId)

Upload a version bundle (crossly-worlds-project/1). Not live until published.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : WorldExperiencePlaceVersionResponse = apiInstance.createWorldExperiencePlaceVersion(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePlaceVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePlaceVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**WorldExperiencePlaceVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceVersionPublish"></a>
# **createWorldExperiencePlaceVersionPublish**
> WorldExperiencePlaceVersionResponse createWorldExperiencePlaceVersionPublish(experienceId, placeId, versionId)

Make a version current (publish or roll back). New joins land on it; older servers drain as they empty.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
val versionId : kotlin.String = versionId_example // kotlin.String | 
try {
    val result : WorldExperiencePlaceVersionResponse = apiInstance.createWorldExperiencePlaceVersionPublish(experienceId, placeId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePlaceVersionPublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePlaceVersionPublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |
 **versionId** | **kotlin.String**|  |

### Return type

**WorldExperiencePlaceVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceVersionRollback"></a>
# **createWorldExperiencePlaceVersionRollback**
> WorldExperiencePlaceVersionResponse createWorldExperiencePlaceVersionRollback(experienceId, placeId, versionId)

Make an earlier reviewed version current again. Unreviewed versions go through …/publishes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
val versionId : kotlin.String = versionId_example // kotlin.String | 
try {
    val result : WorldExperiencePlaceVersionResponse = apiInstance.createWorldExperiencePlaceVersionRollback(experienceId, placeId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePlaceVersionRollback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePlaceVersionRollback")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |
 **versionId** | **kotlin.String**|  |

### Return type

**WorldExperiencePlaceVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaytester"></a>
# **createWorldExperiencePlaytester**
> CreateWorldExperiencePlaytesterResponse createWorldExperiencePlaytester(experienceId)

Add a playtester by Crossly handle (max 200 per game).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaytesterResponse = apiInstance.createWorldExperiencePlaytester(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePlaytester")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePlaytester")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaytesterResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePublishCancel"></a>
# **createWorldExperiencePublishCancel**
> WorldExperienceResponse2 createWorldExperiencePublishCancel(experienceId, requestId)

Give up a publish that is not live.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse2 = apiInstance.createWorldExperiencePublishCancel(experienceId, requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePublishCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePublishCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **requestId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePublishHalt"></a>
# **createWorldExperiencePublishHalt**
> WorldExperienceResponse2 createWorldExperiencePublishHalt(experienceId, requestId)

Stop a rollout: new joins go back to the current version.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse2 = apiInstance.createWorldExperiencePublishHalt(experienceId, requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePublishHalt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePublishHalt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **requestId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePublishRollout"></a>
# **createWorldExperiencePublishRollout**
> WorldExperienceResponse2 createWorldExperiencePublishRollout(experienceId, requestId)

Step 7: serve the approved version to percent (1–100) of new joins; 100 makes it current. Crash-heavy rollouts halt automatically.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse2 = apiInstance.createWorldExperiencePublishRollout(experienceId, requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePublishRollout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePublishRollout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **requestId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePublishSubmit"></a>
# **createWorldExperiencePublishSubmit**
> WorldExperienceResponse2 createWorldExperiencePublishSubmit(experienceId, requestId)

Step 6: moderation. First publishes and script changes go to a person (24 h SLA); layout-only and private publishes are approved automatically.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse2 = apiInstance.createWorldExperiencePublishSubmit(experienceId, requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperiencePublishSubmit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperiencePublishSubmit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **requestId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceReservedServer"></a>
# **createWorldExperienceReservedServer**
> CreateWorldExperienceReservedServerResponse createWorldExperienceReservedServer(experienceId)

An access code for a reserved server of a place (teleports, matches, tournaments). The code is shown once.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceReservedServerResponse = apiInstance.createWorldExperienceReservedServer(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceReservedServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceReservedServer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceReservedServerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceRestore"></a>
# **createWorldExperienceRestore**
> WorldExperienceResponse createWorldExperienceRestore(experienceId)

Restore an archived game, or a deleted one within 30 days; it comes back private.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse = apiInstance.createWorldExperienceRestore(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceRestore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceRestore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceServerShutdown"></a>
# **createWorldExperienceServerShutdown**
> CreateWorldExperienceServerShutdownResponse createWorldExperienceServerShutdown(experienceId)

Shut down servers: mode soft (default) teleports players to fresh servers of the current version first; hard stops now. scope all | outdated (only servers not on a served version).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceServerShutdownResponse = apiInstance.createWorldExperienceServerShutdown(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceServerShutdown")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceServerShutdown")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceServerShutdownResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceTransferRequest"></a>
# **createWorldExperienceTransferRequest**
> WorldResponse2 createWorldExperienceTransferRequest(experienceId)

Ask another Crossly account (handle or email) to take over a 3D game you own. One waiting request per game; it expires after 14 days.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldResponse2 = apiInstance.createWorldExperienceTransferRequest(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldExperienceTransferRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldExperienceTransferRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldMatureVerify"></a>
# **createWorldMatureVerify**
> CreateWorldMatureVerifyResponse createWorldMatureVerify()

Start the ID check Mature needs (Stripe Identity: photo ID + selfie; the date of birth is read off the ID). Returns a hosted URL and client secret, or alreadyVerified.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : CreateWorldMatureVerifyResponse = apiInstance.createWorldMatureVerify()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldMatureVerify")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldMatureVerify")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldMatureVerifyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldParentalAccept"></a>
# **createWorldParentalAccept**
> WorldParentalResponse createWorldParentalAccept()

Accept a child&#39;s invite as the parent: { code, pin }. The parent must be an ID-verified adult (18+ by the date of birth on the ID). The PIN protects every later change.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : WorldParentalResponse = apiInstance.createWorldParentalAccept()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldParentalAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldParentalAccept")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**WorldParentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldParentalChildrenPin"></a>
# **createWorldParentalChildrenPin**
> CreateWorldParentalChildrenPinResponse createWorldParentalChildrenPin(childId)

Change the parent PIN: { pin, newPin } (4-8 digits). Five wrong PINs lock changes for 15 minutes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : CreateWorldParentalChildrenPinResponse = apiInstance.createWorldParentalChildrenPin(childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldParentalChildrenPin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldParentalChildrenPin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childId** | **kotlin.String**|  |

### Return type

**CreateWorldParentalChildrenPinResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldParentalChildrenUnlink"></a>
# **createWorldParentalChildrenUnlink**
> CreateWorldParentalChildrenUnlinkResponse createWorldParentalChildrenUnlink(childId)

Remove the parent link (and its limits) with your PIN: { pin }.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : CreateWorldParentalChildrenUnlinkResponse = apiInstance.createWorldParentalChildrenUnlink(childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldParentalChildrenUnlink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldParentalChildrenUnlink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childId** | **kotlin.String**|  |

### Return type

**CreateWorldParentalChildrenUnlinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldParentalInvite"></a>
# **createWorldParentalInvite**
> CreateWorldParentalInviteResponse createWorldParentalInvite()

An under-18 account asks for a parent: a one-time code (72 hours) the parent enters while signed in to their own account. Replaces any pending code.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : CreateWorldParentalInviteResponse = apiInstance.createWorldParentalInvite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldParentalInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldParentalInvite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldParentalInviteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldRatingCompute"></a>
# **createWorldRatingCompute**
> CreateWorldRatingComputeResponse createWorldRatingCompute()

Rate a set of questionnaire answers exactly as publishing does: { answers } → rating (null when refused), reasons, content descriptors, interactive notices and refusals.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : CreateWorldRatingComputeResponse = apiInstance.createWorldRatingCompute()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldRatingCompute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldRatingCompute")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldRatingComputeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldReport"></a>
# **createWorldReport**
> CreateWorldReportResponse createWorldReport()

Report a player (targetSub), the experience, an object (targetInstanceId) or a chat line (chatLineId). Crossly attaches the server, place version and its own chat log; you send ids only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : CreateWorldReportResponse = apiInstance.createWorldReport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldReport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldTransferRequestAccept"></a>
# **createWorldTransferRequestAccept**
> WorldResponse2 createWorldTransferRequestAccept(requestId)

Accept a transfer asked of you: the game becomes yours now. Earnings already credited stay with the previous owner; new sales pay you.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : WorldResponse2 = apiInstance.createWorldTransferRequestAccept(requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldTransferRequestAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldTransferRequestAccept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **kotlin.String**|  |

### Return type

**WorldResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldTransferRequestCancel"></a>
# **createWorldTransferRequestCancel**
> WorldResponse2 createWorldTransferRequestCancel(requestId)

Cancel a transfer request you sent while it waits.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : WorldResponse2 = apiInstance.createWorldTransferRequestCancel(requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldTransferRequestCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldTransferRequestCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **kotlin.String**|  |

### Return type

**WorldResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldTransferRequestDecline"></a>
# **createWorldTransferRequestDecline**
> WorldResponse2 createWorldTransferRequestDecline(requestId)

Decline a transfer asked of you; nothing changes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : WorldResponse2 = apiInstance.createWorldTransferRequestDecline(requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorldTransferRequestDecline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorldTransferRequestDecline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **kotlin.String**|  |

### Return type

**WorldResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperience"></a>
# **deleteWorldExperience**
> DeleteWorldExperienceResponse deleteWorldExperience(experienceId)

Delete a game (a tombstone, restorable for 30 days). Body { confirmName } &#x3D; the game&#39;s name.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : DeleteWorldExperienceResponse = apiInstance.deleteWorldExperience(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#deleteWorldExperience")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#deleteWorldExperience")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**DeleteWorldExperienceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperienceBan"></a>
# **deleteWorldExperienceBan**
> DeleteWorldExperienceBanResponse deleteWorldExperienceBan(experienceId, sub)

Lift your experience&#39;s ban on a player. Bans placed by Crossly safety are lifted only by appeal.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val sub : kotlin.String = sub_example // kotlin.String | 
try {
    val result : DeleteWorldExperienceBanResponse = apiInstance.deleteWorldExperienceBan(experienceId, sub)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#deleteWorldExperienceBan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#deleteWorldExperienceBan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **sub** | **kotlin.String**|  |

### Return type

**DeleteWorldExperienceBanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperiencePlaytester"></a>
# **deleteWorldExperiencePlaytester**
> DeleteSpatialSceneGrantResponse deleteWorldExperiencePlaytester(experienceId, userId)

Remove a playtester.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneGrantResponse = apiInstance.deleteWorldExperiencePlaytester(experienceId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#deleteWorldExperiencePlaytester")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#deleteWorldExperiencePlaytester")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **userId** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldParentalInvite"></a>
# **deleteWorldParentalInvite**
> DeleteDaoProposalResponse deleteWorldParentalInvite()

Withdraw a pending parent invite.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : DeleteDaoProposalResponse = apiInstance.deleteWorldParentalInvite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#deleteWorldParentalInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#deleteWorldParentalInvite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**DeleteDaoProposalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldChart"></a>
# **getWorldChart**
> GetWorldChartResponse getWorldChart(chart)

A chart: top-playing (players now), trending (this week vs last, retention-weighted), top-rated (Wilson lower bound of thumbs up, 10+ votes), new-rising, friends, most-favorited; ?genre&#x3D; cuts it to one genre. Organic only: nothing paid.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val chart : kotlin.String = chart_example // kotlin.String | 
try {
    val result : GetWorldChartResponse = apiInstance.getWorldChart(chart)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldChart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldChart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart** | **kotlin.String**|  |

### Return type

**GetWorldChartResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldDiscoverExperience"></a>
# **getWorldDiscoverExperience**
> WorldResponse3 getWorldDiscoverExperience(key)

An experience&#39;s thumbs up/down, favourites, your vote and favourite, and whether you have played enough to vote (10 minutes). key: worlds:&lt;id&gt;, classic:&lt;id&gt;, tcg:&lt;game&gt;, cards:&lt;game&gt;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : WorldResponse3 = apiInstance.getWorldDiscoverExperience(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldDiscoverExperience")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldDiscoverExperience")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  |

### Return type

**WorldResponse3**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldDiscoverRow"></a>
# **getWorldDiscoverRow**
> GetWorldDiscoverRowResponse getWorldDiscoverRow()

The Play hub&#39;s rows for you: Continue playing, Friends are playing, Recommended for you, Featured (editorial, first-party capped), Top Playing, Trending, New &amp; Rising, Top Rated, Made in Carnival Studio, Shop the world, card games, Classic games and genre rows. At most one tile is paid, always labelled \&quot;Sponsored\&quot;, never in the first two rows or a row&#39;s first two places.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldDiscoverRowResponse = apiInstance.getWorldDiscoverRow()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldDiscoverRow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldDiscoverRow")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldDiscoverRowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperience"></a>
# **getWorldExperience**
> GetWorldExperienceResponse getWorldExperience(experienceId)

One of your experiences with its places, live CCU and server count.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceResponse = apiInstance.getWorldExperience(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperience")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperience")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceAccessLimit"></a>
# **getWorldExperienceAccessLimit**
> GetWorldExperienceAccessLimitResponse getWorldExperienceAccessLimit(experienceId)

The game&#39;s crew-only and country limits, and the owner&#39;s crew.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceAccessLimitResponse = apiInstance.getWorldExperienceAccessLimit(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceAccessLimit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceAccessLimit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceAccessLimitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceAlertSetting"></a>
# **getWorldExperienceAlertSetting**
> GetWorldExperienceAlertSettingResponse getWorldExperienceAlertSetting(experienceId)

Alert rules (threshold, on/off, inbox, webhook) and quiet hours.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceAlertSettingResponse = apiInstance.getWorldExperienceAlertSetting(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceAlertSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceAlertSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceAlertSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceAnalytic"></a>
# **getWorldExperienceAnalytic**
> GetWorldExperienceAnalyticResponse getWorldExperienceAnalytic(experienceId, report)

An analytics report: overview, engagement, retention, monetization, funnels, economy, performance, custom or costs (fleet CPU-minutes, egress, estimated cost). ?from&#x3D;&amp;to&#x3D; (YYYY-MM-DD), retention ?segment&#x3D;, funnels ?funnel&#x3D;, economy ?currency&#x3D;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val report : kotlin.String = report_example // kotlin.String | 
try {
    val result : GetWorldExperienceAnalyticResponse = apiInstance.getWorldExperienceAnalytic(experienceId, report)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceAnalytic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceAnalytic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **report** | **kotlin.String**|  |

### Return type

**GetWorldExperienceAnalyticResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceBan"></a>
# **getWorldExperienceBan**
> GetWorldExperienceBanResponse getWorldExperienceBan(experienceId, sub)

The live ban on one player, or 404.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val sub : kotlin.String = sub_example // kotlin.String | 
try {
    val result : GetWorldExperienceBanResponse = apiInstance.getWorldExperienceBan(experienceId, sub)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceBan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceBan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **sub** | **kotlin.String**|  |

### Return type

**GetWorldExperienceBanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceChatSetting"></a>
# **getWorldExperienceChatSetting**
> GetWorldExperienceChatSettingResponse getWorldExperienceChatSetting(experienceId)

The game&#39;s text chat setting and filter level.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceChatSettingResponse = apiInstance.getWorldExperienceChatSetting(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceChatSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceChatSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceChatSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceConfig"></a>
# **getWorldExperienceConfig**
> WorldExperienceConfigResponse getWorldExperienceConfig(experienceId)

The remote config document ({ values, rules }) and its version.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceConfigResponse = apiInstance.getWorldExperienceConfig(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceConfigResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceExperiment"></a>
# **getWorldExperienceExperiment**
> GetWorldExperienceExperimentResponse getWorldExperienceExperiment(experienceId, experimentId)

Results per variant: n, mean, lift, fixed and always-valid 95% intervals, the verdict and a sample-size estimate.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val experimentId : kotlin.String = experimentId_example // kotlin.String | 
try {
    val result : GetWorldExperienceExperimentResponse = apiInstance.getWorldExperienceExperiment(experienceId, experimentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceExperiment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceExperiment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **experimentId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceMaturity"></a>
# **getWorldExperienceMaturity**
> GetWorldExperienceMaturityResponse getWorldExperienceMaturity(experienceId)

The content maturity questionnaire: questions, answers, the published rating and any rating waiting for the next publish.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceMaturityResponse = apiInstance.getWorldExperienceMaturity(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceMaturity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceMaturity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceMaturityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceModeration"></a>
# **getWorldExperienceModeration**
> GetWorldExperienceModerationResponse getWorldExperienceModeration(experienceId)

Moderation status of your experience: holds (unlisted / taken down), the latest review, the automated scan, strikes, trusted-lane status, open reports and live bans.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceModerationResponse = apiInstance.getWorldExperienceModeration(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceModeration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceModeration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceModerationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceModerationAppeal"></a>
# **getWorldExperienceModerationAppeal**
> GetWorldExperienceModerationAppealResponse getWorldExperienceModerationAppeal(experienceId)

What you can appeal on your game and every appeal of it: data.targets (Crossly&#39;s actions, a moderation hold, rejected versions, blocked assets; each with appealableUntil and its latest appeal) and data.appeals (newest first: kind, status open | upheld | overturned, reason, evidence, the reviewer&#39;s note).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceModerationAppealResponse = apiInstance.getWorldExperienceModerationAppeal(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceModerationAppeal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceModerationAppeal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceModerationAppealResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePlaceDraft"></a>
# **getWorldExperiencePlaceDraft**
> GetWorldExperiencePlaceDraftResponse getWorldExperiencePlaceDraft(experienceId, placeId)

The Studio draft of a place ({ world, place }, revision). Falls back to the current version, or an empty place.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceDraftResponse = apiInstance.getWorldExperiencePlaceDraft(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperiencePlaceDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperiencePlaceDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceDraftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePublish"></a>
# **getWorldExperiencePublish**
> WorldExperienceResponse2 getWorldExperiencePublish(experienceId, requestId)

One publish with its review state and rollout.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse2 = apiInstance.getWorldExperiencePublish(experienceId, requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperiencePublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperiencePublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **requestId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceShop"></a>
# **getWorldExperienceShop**
> GetWorldExperienceShopResponse getWorldExperienceShop(experienceId)

An open experience&#39;s way back to commerce: its creator&#39;s shop and how many live listings it has.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceShopResponse = apiInstance.getWorldExperienceShop(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceShop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceShop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceShopResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceShowcase"></a>
# **getWorldExperienceShowcase**
> GetWorldExperienceShowcaseResponse getWorldExperienceShowcase(experienceId)

The listings the game&#39;s page showcases, and the owner&#39;s live Crossly listings that can be picked.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceShowcaseResponse = apiInstance.getWorldExperienceShowcase(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldExperienceShowcase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldExperienceShowcase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceShowcaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldFriendPlaying"></a>
# **getWorldFriendPlaying**
> GetWorldFriendPlayingResponse getWorldFriendPlaying()

Your friends (mutual follows) and where each is playing right now, with the link that joins them.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldFriendPlayingResponse = apiInstance.getWorldFriendPlaying()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldFriendPlaying")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldFriendPlaying")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldFriendPlayingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldGameByGame"></a>
# **getWorldGameByGame**
> GetWorldGameByGameResponse getWorldGameByGame(game)

A game&#39;s page, as the /games launcher shows it: the tile (players now, thumbs-up %, friends inside), description, tags, creator (Crossly for its own), rating with its content descriptors, visits, created and updated, release notes, gallery, what it sells (bought through Crossly checkout) and the Crossly World app link. :game is a Worlds experience id or any experience key.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : GetWorldGameByGameResponse = apiInstance.getWorldGameByGame(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldGameByGame")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldGameByGame")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**GetWorldGameByGameResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldGameMine"></a>
# **getWorldGameMine**
> GetWorldGameMineResponse getWorldGameMine(gameId)

A game&#39;s summary: status, timeline, the sub-pages you may open, health and next steps.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val gameId : kotlin.String = gameId_example // kotlin.String | 
try {
    val result : GetWorldGameMineResponse = apiInstance.getWorldGameMine(gameId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldGameMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldGameMine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gameId** | **kotlin.String**|  |

### Return type

**GetWorldGameMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldGameMineAssetsUsed"></a>
# **getWorldGameMineAssetsUsed**
> GetWorldGameMineAssetsUsedResponse getWorldGameMineAssetsUsed(gameId)

Everything a game&#39;s published build ships (Assets used): models, sounds, images, scripts, Toolbox assets and other files, each with the places that ship it. A 3D world reads each place&#39;s current version; a Classic game its latest reviewed package version.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val gameId : kotlin.String = gameId_example // kotlin.String | 
try {
    val result : GetWorldGameMineAssetsUsedResponse = apiInstance.getWorldGameMineAssetsUsed(gameId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldGameMineAssetsUsed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldGameMineAssetsUsed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gameId** | **kotlin.String**|  |

### Return type

**GetWorldGameMineAssetsUsedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldGameServer"></a>
# **getWorldGameServer**
> GetWorldGameServerResponse getWorldGameServer(game)

A Crossly Carnival game&#39;s public servers that are up: players, max, whether a stranger still fits, your friends on each (friends&#39; servers first, then the fullest with room); and the private servers you pay for. Join one with POST /v1/worlds/experiences/:id/join { serverId }.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : GetWorldGameServerResponse = apiInstance.getWorldGameServer(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldGameServer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldGameServer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**GetWorldGameServerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldLinkCardGame"></a>
# **getWorldLinkCardGame**
> WorldLinkResponse getWorldLinkCardGame(game)

Where to play a card game: Crossly&#39;s own game, its Commons tables, and creator worlds that tag it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : WorldLinkResponse = apiInstance.getWorldLinkCardGame(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldLinkCardGame")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldLinkCardGame")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**WorldLinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldLinkListing"></a>
# **getWorldLinkListing**
> WorldLinkResponse getWorldLinkListing(slug)

\&quot;Try it in Crossly Carnival\&quot;: open games whose live version shows this Crossly listing (its shop slug), then other games by the same seller. Links only: a sale is attributed to a game only through in-world touches its server reports.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : WorldLinkResponse = apiInstance.getWorldLinkListing(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldLinkListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldLinkListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**WorldLinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldLinkSeller"></a>
# **getWorldLinkSeller**
> WorldLinkResponse getWorldLinkSeller(username)

\&quot;Games by this seller\&quot;: the seller&#39;s open games, best first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : WorldLinkResponse = apiInstance.getWorldLinkSeller(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldLinkSeller")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldLinkSeller")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**|  |

### Return type

**WorldLinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldMature"></a>
# **getWorldMature**
> GetWorldMatureResponse getWorldMature()

Mature (17+) for this account: eligible or not, the steps still to take in order (birth month, ID check, opt-in; region, parental controls and safety holds are final), and the ID age check status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldMatureResponse = apiInstance.getWorldMature()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldMature")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldMature")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldMatureResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldMePref"></a>
# **getWorldMePref**
> GetWorldMePrefResponse getWorldMePref()

Your Crossly Carnival choices (whether games may see your Crossly wallet address).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldMePrefResponse = apiInstance.getWorldMePref()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldMePref")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldMePref")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldMePrefResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldParentalChildren"></a>
# **getWorldParentalChildren**
> WorldParentalResponse getWorldParentalChildren(childId)

One linked account with ?days&#x3D; (1-90) of playtime per experience.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : WorldParentalResponse = apiInstance.getWorldParentalChildren(childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldParentalChildren")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldParentalChildren")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childId** | **kotlin.String**|  |

### Return type

**WorldParentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldParentalMe"></a>
# **getWorldParentalMe**
> GetWorldParentalMeResponse getWorldParentalMe()

This account&#39;s parent link: none, pending (an invite is out) or active (the parent&#39;s name and the limits they set).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldParentalMeResponse = apiInstance.getWorldParentalMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldParentalMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldParentalMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldParentalMeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPlaza"></a>
# **getWorldPlaza**
> GetWorldPlazaResponse getWorldPlaza()

The Carnival Plaza district: the twelve-portal ring (a sponsored portal can only take the last slot, labelled), the new &amp; rising row, the featured stage&#39;s editorial pick and four chart boards, with players now and friends inside.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldPlazaResponse = apiInstance.getWorldPlaza()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldPlaza")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldPlaza")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldPlazaResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPolicyMe"></a>
# **getWorldPolicyMe**
> GetWorldPolicyMeResponse getWorldPolicyMe()

What this account may do in experiences, by age and region: chat level, purchases, paid random items, trading, links, ads, contests, rating ceiling — with the reason for each \&quot;no\&quot;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldPolicyMeResponse = apiInstance.getWorldPolicyMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldPolicyMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldPolicyMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldPolicyMeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldRatingQuestionnaire"></a>
# **getWorldRatingQuestionnaire**
> GetWorldRatingQuestionnaireResponse getWorldRatingQuestionnaire()

The content-rating questionnaire (IARC-aligned): every question and choice, the three ratings (Everyone, Teen 13+, Mature 17+), what is never allowed, and the regions where Mature is restricted.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldRatingQuestionnaireResponse = apiInstance.getWorldRatingQuestionnaire()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldRatingQuestionnaire")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldRatingQuestionnaire")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldRatingQuestionnaireResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldSearch"></a>
# **getWorldSearch**
> GetWorldSearchResponse getWorldSearch()

Search experiences by title, creator, tags and genre (typo-tolerant, synonyms such as obby / obstacle). Filters: genre, rating (everyone keeps to Everyone), device, players (one server holds at least N), minThumbs (percent), live, friends. No results suggests a chart.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldSearchResponse = apiInstance.getWorldSearch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldSearch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldSearchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldTransferRequest"></a>
# **getWorldTransferRequest**
> WorldResponse2 getWorldTransferRequest(requestId)

One ownership transfer request (only its two people can read it), with the actions you may take.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : WorldResponse2 = apiInstance.getWorldTransferRequest(requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldTransferRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldTransferRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **kotlin.String**|  |

### Return type

**WorldResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldTransparency"></a>
# **getWorldTransparency**
> GetWorldTransparencyResponse getWorldTransparency(month)

One month&#39;s transparency report (YYYY-MM): reports by reason and source, decisions and median time to decide, actions by kind and issuer, appeals and overturn rate, publish reviews, second reviews of creator bans.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val month : kotlin.String = month_example // kotlin.String | 
try {
    val result : GetWorldTransparencyResponse = apiInstance.getWorldTransparency(month)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldTransparency")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldTransparency")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **month** | **kotlin.String**|  |

### Return type

**GetWorldTransparencyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldAppeals"></a>
# **listWorldAppeals**
> ListWorldAppealsResponse listWorldAppeals()

Your appeals and their decisions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : ListWorldAppealsResponse = apiInstance.listWorldAppeals()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldAppeals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldAppeals")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldAppealsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceAlerts"></a>
# **listWorldExperienceAlerts**
> ListWorldExperienceAlertsResponse listWorldExperienceAlerts(experienceId)

Alerts that fired, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceAlertsResponse = apiInstance.listWorldExperienceAlerts(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperienceAlerts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperienceAlerts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceAlertsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceAudit"></a>
# **listWorldExperienceAudit**
> ListWorldExperienceAuditResponse listWorldExperienceAudit(experienceId)

The live-ops audit log: every config, experiment, event and alert change, who made it, when.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceAuditResponse = apiInstance.listWorldExperienceAudit(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperienceAudit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperienceAudit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceAuditResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceBans"></a>
# **listWorldExperienceBans**
> ListWorldExperienceBansResponse listWorldExperienceBans(experienceId)

Players banned from your experience (by pairwise sub), oldest first (cursor).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceBansResponse = apiInstance.listWorldExperienceBans(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperienceBans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperienceBans")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceBansResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceConfigVersions"></a>
# **listWorldExperienceConfigVersions**
> ListWorldExperienceConfigVersionsResponse listWorldExperienceConfigVersions(experienceId)

Config history, newest first: who changed which keys, when.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceConfigVersionsResponse = apiInstance.listWorldExperienceConfigVersions(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperienceConfigVersions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperienceConfigVersions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceConfigVersionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceEvents"></a>
# **listWorldExperienceEvents**
> ListWorldExperienceEventsResponse listWorldExperienceEvents(experienceId)

Scheduled and live events (?includeEnded&#x3D;true for history).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceEventsResponse = apiInstance.listWorldExperienceEvents(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperienceEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperienceEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceExperiments"></a>
# **listWorldExperienceExperiments**
> ListWorldExperienceExperimentsResponse listWorldExperienceExperiments(experienceId)

A/B experiments, newest first, with their live verdict.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceExperimentsResponse = apiInstance.listWorldExperienceExperiments(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperienceExperiments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperienceExperiments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceExperimentsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceModerationReports"></a>
# **listWorldExperienceModerationReports**
> ListWorldExperienceModerationReportsResponse listWorldExperienceModerationReports(experienceId)

Reports about your experience, newest first (cursor). Reporter identity, account ids and other players&#39; words are removed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceModerationReportsResponse = apiInstance.listWorldExperienceModerationReports(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperienceModerationReports")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperienceModerationReports")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceModerationReportsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperiencePlacePublishes"></a>
# **listWorldExperiencePlacePublishes**
> ListWorldExperiencePlacePublishesResponse listWorldExperiencePlacePublishes(experienceId, placeId)

Publishes of a place, newest first: state, checks, rating, access, review, rollout.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : ListWorldExperiencePlacePublishesResponse = apiInstance.listWorldExperiencePlacePublishes(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperiencePlacePublishes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperiencePlacePublishes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**ListWorldExperiencePlacePublishesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperiencePlaceVersions"></a>
# **listWorldExperiencePlaceVersions**
> ListWorldExperiencePlaceVersionsResponse listWorldExperiencePlaceVersions(experienceId, placeId)

Version history of a place, newest first; &#x60;current&#x60; marks the live one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : ListWorldExperiencePlaceVersionsResponse = apiInstance.listWorldExperiencePlaceVersions(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperiencePlaceVersions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperiencePlaceVersions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**ListWorldExperiencePlaceVersionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperiencePlaces"></a>
# **listWorldExperiencePlaces**
> ListWorldExperiencePlacesResponse listWorldExperiencePlaces(experienceId)

The places of an experience, start place first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperiencePlacesResponse = apiInstance.listWorldExperiencePlaces(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperiencePlaces")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperiencePlaces")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperiencePlacesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperiencePlaytesters"></a>
# **listWorldExperiencePlaytesters**
> ListWorldExperiencePlaytestersResponse listWorldExperiencePlaytesters(experienceId)

People who may join while the game is private.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperiencePlaytestersResponse = apiInstance.listWorldExperiencePlaytesters(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperiencePlaytesters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperiencePlaytesters")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperiencePlaytestersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceServers"></a>
# **listWorldExperienceServers**
> ListWorldExperienceServersResponse listWorldExperienceServers(experienceId)

Live servers: place, version, region, players, health.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceServersResponse = apiInstance.listWorldExperienceServers(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperienceServers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperienceServers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceServersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperiences"></a>
# **listWorldExperiences**
> ListWorldExperiencesResponse listWorldExperiences()

Your experiences, newest first; cursor-paged (?cursor&#x3D;&amp;limit&#x3D;).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : ListWorldExperiencesResponse = apiInstance.listWorldExperiences()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldExperiences")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldExperiences")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldExperiencesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldFavorites"></a>
# **listWorldFavorites**
> ListWorldRecentResponse listWorldFavorites()

Your favourite experiences that are still open, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : ListWorldRecentResponse = apiInstance.listWorldFavorites()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldFavorites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldFavorites")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldRecentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldGameMine"></a>
# **listWorldGameMine**
> ListWorldGameMineResponse listWorldGameMine()

Every game you own or collaborate on, 3D worlds and Classic, filtered (?q&amp;status&amp;engine&amp;genre&amp;template&amp;owner&amp;flag&amp;sort; sort&#x3D;revenue &#x3D; highest earning first). Each row carries revenueCents: your creator-ledger earnings from it in USD cents (null for Classic).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : ListWorldGameMineResponse = apiInstance.listWorldGameMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldGameMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldGameMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldGameMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldParentalChildren"></a>
# **listWorldParentalChildren**
> ListWorldParentalChildrenResponse listWorldParentalChildren()

Accounts you are the linked parent of: limits (max rating, chat, monthly spend), spend this month, and the last 7 days of playtime per experience.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : ListWorldParentalChildrenResponse = apiInstance.listWorldParentalChildren()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldParentalChildren")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldParentalChildren")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldParentalChildrenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldRecent"></a>
# **listWorldRecent**
> ListWorldRecentResponse listWorldRecent()

Continue playing: what you played in the last 90 days that is still open, newest first (from what the servers recorded).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : ListWorldRecentResponse = apiInstance.listWorldRecent()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldRecent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldRecent")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldRecentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldRegions"></a>
# **listWorldRegions**
> ListWorldRegionsResponse listWorldRegions()

Live server regions with a probe URL each: GET it a few times, send the round trips as &#x60;pings&#x60; with the join to land in the nearest region.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : ListWorldRegionsResponse = apiInstance.listWorldRegions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldRegions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldRegions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldRegionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldShopListings"></a>
# **listWorldShopListings**
> ListWorldShopListingsResponse listWorldShopListings()

Your live Crossly listings a game can show and sell (shop objects bind to their id).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : ListWorldShopListingsResponse = apiInstance.listWorldShopListings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldShopListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldShopListings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldShopListingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldTransferRequests"></a>
# **listWorldTransferRequests**
> ListWorldTransferRequestsResponse listWorldTransferRequests()

Ownership transfer requests you were asked (incoming) or sent (outgoing), newest first (?direction&amp;status&amp;experienceId).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : ListWorldTransferRequestsResponse = apiInstance.listWorldTransferRequests()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldTransferRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldTransferRequests")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldTransferRequestsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldTransparency"></a>
# **listWorldTransparency**
> ListWorldTransparencyResponse listWorldTransparency()

Published monthly transparency reports, newest first: reports received and actions taken, by type (counts only).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : ListWorldTransparencyResponse = apiInstance.listWorldTransparency()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#listWorldTransparency")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#listWorldTransparency")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldTransparencyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperience"></a>
# **updateWorldExperience**
> WorldExperienceResponse updateWorldExperience(experienceId)

Edit name, description, genre, rating or icon.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse = apiInstance.updateWorldExperience(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperience")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperience")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceAccessLimit"></a>
# **updateWorldExperienceAccessLimit**
> GetWorldExperienceAccessLimitResponse updateWorldExperienceAccessLimit(experienceId)

Limit who can play: { crewOnly } (only members of the owner&#39;s crew), { countryMode: all|allow|block, countries: [&#39;US&#39;, ...] }. The owner and team are never limited.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceAccessLimitResponse = apiInstance.updateWorldExperienceAccessLimit(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperienceAccessLimit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperienceAccessLimit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceAccessLimitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceAlertSetting"></a>
# **updateWorldExperienceAlertSetting**
> GetWorldExperienceAlertSettingResponse updateWorldExperienceAlertSetting(experienceId)

Change alert rules and quiet hours.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceAlertSettingResponse = apiInstance.updateWorldExperienceAlertSetting(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperienceAlertSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperienceAlertSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceAlertSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceChatSetting"></a>
# **updateWorldExperienceChatSetting**
> GetWorldExperienceChatSettingResponse updateWorldExperienceChatSetting(experienceId)

Turn text chat off or use the strict filter for everyone (never looser than the platform).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceChatSettingResponse = apiInstance.updateWorldExperienceChatSetting(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperienceChatSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperienceChatSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceChatSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceConfig"></a>
# **updateWorldExperienceConfig**
> WorldExperienceConfigResponse updateWorldExperienceConfig(experienceId)

Save the whole config document. Running servers get it within seconds (ConfigService.Changed). baseVersion guards against overwriting a newer save (409).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceConfigResponse = apiInstance.updateWorldExperienceConfig(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperienceConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperienceConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceConfigResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceConfigValue"></a>
# **updateWorldExperienceConfigValue**
> WorldExperienceConfigResponse updateWorldExperienceConfigValue(experienceId)

Set and/or remove individual config keys.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceConfigResponse = apiInstance.updateWorldExperienceConfigValue(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperienceConfigValue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperienceConfigValue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceConfigResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceEvent"></a>
# **updateWorldExperienceEvent**
> WorldExperienceEventResponse updateWorldExperienceEvent(experienceId, eventId)

Reschedule or change a scheduled event; a live event may only move its end.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val eventId : kotlin.String = eventId_example // kotlin.String | 
try {
    val result : WorldExperienceEventResponse = apiInstance.updateWorldExperienceEvent(experienceId, eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperienceEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperienceEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **eventId** | **kotlin.String**|  |

### Return type

**WorldExperienceEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceExperiment"></a>
# **updateWorldExperienceExperiment**
> WorldExperienceExperimentResponse updateWorldExperienceExperiment(experienceId, experimentId)

Edit a draft (a running experiment may only rename or reword).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val experimentId : kotlin.String = experimentId_example // kotlin.String | 
try {
    val result : WorldExperienceExperimentResponse = apiInstance.updateWorldExperienceExperiment(experienceId, experimentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperienceExperiment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperienceExperiment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **experimentId** | **kotlin.String**|  |

### Return type

**WorldExperienceExperimentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceMaturity"></a>
# **updateWorldExperienceMaturity**
> UpdateWorldExperienceMaturityResponse updateWorldExperienceMaturity(experienceId)

Answer the questionnaire: { answers }. A stricter rating applies now; a looser or first Mature rating waits for the next reviewed publish (takesEffect).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceMaturityResponse = apiInstance.updateWorldExperienceMaturity(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperienceMaturity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperienceMaturity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceMaturityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperiencePlace"></a>
# **updateWorldExperiencePlace**
> WorldExperiencePlaceResponse updateWorldExperiencePlace(experienceId, placeId)

Place settings: name, max players (1-50), fill target, social slots, empty shutdown.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : WorldExperiencePlaceResponse = apiInstance.updateWorldExperiencePlace(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperiencePlace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperiencePlace")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**WorldExperiencePlaceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperiencePlaceDraft"></a>
# **updateWorldExperiencePlaceDraft**
> GetWorldExperiencePlaceDraftResponse updateWorldExperiencePlaceDraft(experienceId, placeId)

Save the draft. baseRevision is the revision you loaded (0 for none); a newer save elsewhere answers 409 draft_conflict.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceDraftResponse = apiInstance.updateWorldExperiencePlaceDraft(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperiencePlaceDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperiencePlaceDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceDraftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperiencePlaceVersionNote"></a>
# **updateWorldExperiencePlaceVersionNote**
> UpdateWorldExperiencePlaceVersionNoteResponse updateWorldExperiencePlaceVersionNote(experienceId, placeId, versionId)

Edit a release version&#39;s changelog (the game page&#39;s What&#39;s new): { notes } up to 2000 characters.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
val versionId : kotlin.String = versionId_example // kotlin.String | 
try {
    val result : UpdateWorldExperiencePlaceVersionNoteResponse = apiInstance.updateWorldExperiencePlaceVersionNote(experienceId, placeId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperiencePlaceVersionNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperiencePlaceVersionNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |
 **versionId** | **kotlin.String**|  |

### Return type

**UpdateWorldExperiencePlaceVersionNoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperiencePublish"></a>
# **updateWorldExperiencePublish**
> WorldExperienceResponse2 updateWorldExperiencePublish(experienceId, requestId)

Steps 2–5: details, rating questionnaire answers, access (private | friends | unlisted | public), money review acknowledgement.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val requestId : kotlin.String = requestId_example // kotlin.String | 
try {
    val result : WorldExperienceResponse2 = apiInstance.updateWorldExperiencePublish(experienceId, requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperiencePublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperiencePublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **requestId** | **kotlin.String**|  |

### Return type

**WorldExperienceResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceShowcase"></a>
# **updateWorldExperienceShowcase**
> UpdateWorldExperienceShowcaseResponse updateWorldExperienceShowcase(experienceId)

Set the showcased listings: { listingIds } (Crossly shop slugs of the owner&#39;s live listings, max 12, in order).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceShowcaseResponse = apiInstance.updateWorldExperienceShowcase(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldExperienceShowcase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldExperienceShowcase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceShowcaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldFavorite"></a>
# **updateWorldFavorite**
> WorldResponse3 updateWorldFavorite()

Favourite or un-favourite an experience (idempotent).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : WorldResponse3 = apiInstance.updateWorldFavorite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldFavorite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldFavorite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**WorldResponse3**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldMature"></a>
# **updateWorldMature**
> GetWorldMatureResponse updateWorldMature()

Switch \&quot;Show Mature experiences\&quot; on or off: { showMature }. On is refused while a final step blocks (too young, region, parental controls, safety hold); it never skips the ID check.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldMatureResponse = apiInstance.updateWorldMature()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldMature")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldMature")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldMatureResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldMePref"></a>
# **updateWorldMePref**
> GetWorldMePrefResponse updateWorldMePref()

Set your Crossly Carnival choices.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : GetWorldMePrefResponse = apiInstance.updateWorldMePref()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldMePref")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldMePref")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldMePrefResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldParentalChildren"></a>
# **updateWorldParentalChildren**
> WorldParentalResponse updateWorldParentalChildren(childId)

Change a linked account&#39;s limits with your PIN: { pin, settings: { maxRating: everyone|teen, chat: on|friends|off, monthlySpendLimitCents (0 &#x3D; no purchases, null &#x3D; no limit) } }. Enforced server-side at join, chat, the purchase prompt and checkout.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
val childId : kotlin.String = childId_example // kotlin.String | 
try {
    val result : WorldParentalResponse = apiInstance.updateWorldParentalChildren(childId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldParentalChildren")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldParentalChildren")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **childId** | **kotlin.String**|  |

### Return type

**WorldParentalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldVote"></a>
# **updateWorldVote**
> WorldResponse3 updateWorldVote()

Thumbs up, down, or null to withdraw: one vote per player per experience, counted only after 10 minutes of play (403 vote_needs_playtime before). A light ranking signal.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsApi()
try {
    val result : WorldResponse3 = apiInstance.updateWorldVote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorldVote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorldVote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**WorldResponse3**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

