# WorldApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpatialInviteAccept**](WorldApi.md#createSpatialInviteAccept) | **POST** /v1/spatial/invites/accept | Redeem an invite code (dashes optional); returns the room it opens.
[**createSpatialPropertyLeaseWithdraw**](WorldApi.md#createSpatialPropertyLeaseWithdraw) | **POST** /v1/spatial/property/leases/{id}/withdraw | Withdraw a lease offer nobody has accepted yet.
[**createSpatialScene**](WorldApi.md#createSpatialScene) | **POST** /v1/spatial/scenes | Start a 3D room: a collection (your items on shelves) or a warehouse (racks you arrange). Private until you make it public.
[**createSpatialSceneGrant**](WorldApi.md#createSpatialSceneGrant) | **POST** /v1/spatial/scenes/{id}/grants | Let a specific user into one of your rooms (visitor or staff), no code needed.
[**createSpatialSceneInvite**](WorldApi.md#createSpatialSceneInvite) | **POST** /v1/spatial/scenes/{id}/invites | Mint an invite code to one of your rooms (visitor or staff, optional expiry in hours). The code is in this response only: just its hash is stored.
[**createSpatialSceneNode**](WorldApi.md#createSpatialSceneNode) | **POST** /v1/spatial/scenes/{id}/nodes | Add a unit (rack, shelf, bin) to one of your warehouse rooms.
[**createSpatialScenePlace**](WorldApi.md#createSpatialScenePlace) | **POST** /v1/spatial/scenes/{id}/place | Pin an inventory item to a slot in one of your rooms: by warehouse nodeId, or by a collection container key and index.
[**createSpatialSceneRename**](WorldApi.md#createSpatialSceneRename) | **POST** /v1/spatial/scenes/{id}/rename | Rename one of your rooms.
[**createSpatialSceneShopPlace**](WorldApi.md#createSpatialSceneShopPlace) | **POST** /v1/spatial/scenes/{id}/shop/place | Place an inventory item in a section and display of your shop room.
[**createSpatialSceneUnpin**](WorldApi.md#createSpatialSceneUnpin) | **POST** /v1/spatial/scenes/{id}/unpin | Clear every pin in one of your rooms, so it arranges itself again.
[**createSpatialSceneVisibility**](WorldApi.md#createSpatialSceneVisibility) | **POST** /v1/spatial/scenes/{id}/visibility | Make one of your rooms private, unlisted (anyone with the link) or public (in the lobby and searchable).
[**createSpatialSceneWarehouseStock**](WorldApi.md#createSpatialSceneWarehouseStock) | **POST** /v1/spatial/scenes/{id}/warehouse/stock | Put an inventory item (or unit) on a rack in one of your warehouse rooms.
[**createSpatialShopNeighbourhood**](WorldApi.md#createSpatialShopNeighbourhood) | **POST** /v1/spatial/shop/neighbourhood | Move your shop to another neighbourhood (by slug).
[**createSpatialStreetApply**](WorldApi.md#createSpatialStreetApply) | **POST** /v1/spatial/streets/{slug}/apply | Ask to open your shop on a street whose owner reviews applications.
[**createSpatialStreetInvite**](WorldApi.md#createSpatialStreetInvite) | **POST** /v1/spatial/streets/{slug}/invite | Invite a shop (by its slug) to open on a street you own.
[**createWorldAvatarEquip**](WorldApi.md#createWorldAvatarEquip) | **POST** /v1/world/avatar/equip | Wear something you already own -- exactly ONE of { cosmeticId } (a cosmetic you hold), { receiptId } (a Crossly purchase from your closet) or { inventoryItemId } (your own stock). The slot comes from the thing itself; slot is only a fallback for an item with no catalog shape. Replaces whatever was in that slot. Moves no money. Answers the slot and your loadout after the change.
[**createWorldAvatarUnequip**](WorldApi.md#createWorldAvatarUnequip) | **POST** /v1/world/avatar/unequip | Take off whatever is in one slot. Idempotent: an empty slot answers removed:false. Answers your loadout after the change.
[**createWorldAvatarWearable**](WorldApi.md#createWorldAvatarWearable) | **POST** /v1/world/avatar/wearables | Author a wearable for a body slot (a mesh profile and params, an asking price in COSM base units as a string). A submission: inactive until an operator approves it.
[**createWorldContest**](WorldApi.md#createWorldContest) | **POST** /v1/world/contests | Set up a skill contest on a game placed in your place: title, game (its instance id), entry { mode, feeCents? }, prizes by place, funder, window, attempts. Paid entry needs the operator to allow it where it runs.
[**createWorldContestEntrySettlePayment**](WorldApi.md#createWorldContestEntrySettlePayment) | **POST** /v1/world/contests/entries/{id}/settle-payment | Read the fee of a paid entry back from Stripe and settle it (safe to repeat).
[**createWorldContestJoin**](WorldApi.md#createWorldContestJoin) | **POST** /v1/world/contests/{id}/join | Enter a contest. Free and sponsored contests take you in at once; a paid one answers a client secret to pay the entry fee.
[**createWorldConvention**](WorldApi.md#createWorldConvention) | **POST** /v1/world/conventions | Host a convention in one of your rooms: title, dates, tables and how sellers get one (invite, free, a fee in cents, or a revenue share in basis points).
[**createWorldConventionAccept**](WorldApi.md#createWorldConventionAccept) | **POST** /v1/world/conventions/{id}/accept | Accept: your own invitation (no body), or, as host, an application (username).
[**createWorldConventionApply**](WorldApi.md#createWorldConventionApply) | **POST** /v1/world/conventions/{id}/apply | Ask for a table at a convention.
[**createWorldConventionInvite**](WorldApi.md#createWorldConventionInvite) | **POST** /v1/world/conventions/{id}/invite | Invite a seller (by shop handle) to a convention you host.
[**createWorldConventionPaid**](WorldApi.md#createWorldConventionPaid) | **POST** /v1/world/conventions/{id}/paid | As host, record that a seller (username) paid their table fee off-platform. Moves no money.
[**createWorldConventionWithdraw**](WorldApi.md#createWorldConventionWithdraw) | **POST** /v1/world/conventions/{id}/withdraw | Withdraw your table or decline your invitation; as host, decline someone (username).
[**createWorldCrew**](WorldApi.md#createWorldCrew) | **POST** /v1/world/crews | Start a crew you own: { name (2-32 chars), tag (2-5 letters or digits, shown on members&#39; nameplates) }. Answers its id and join code. 409 when you are already in a crew.
[**createWorldCrewChat**](WorldApi.md#createWorldCrewChat) | **POST** /v1/world/crew/chat | Say a line to your crew (body: text, up to 400 characters). Returns data.messages, the crew chat ring (the last 50 lines, kept in memory only), and data.said when your line went out; a blocked or too-quick line is dropped silently. 404 when you are in no crew.
[**createWorldCrewJoin**](WorldApi.md#createWorldCrewJoin) | **POST** /v1/world/crews/join | Join a crew by the code a member gave you. 404 for an unknown code, 409 when you are already in a crew or it is full (30).
[**createWorldCrewLeave**](WorldApi.md#createWorldCrewLeave) | **POST** /v1/world/crews/leave | Leave your crew. If you own it, the crew is disbanded. Idempotent: leaving when in none succeeds.
[**createWorldDecorDesign**](WorldApi.md#createWorldDecorDesign) | **POST** /v1/world/decor/designs | Author a decor design (what it unlocks, a mesh profile and params, an asking price in COSM base units as a string). Inactive until an operator approves it.
[**createWorldDecorDesignSubmit**](WorldApi.md#createWorldDecorDesignSubmit) | **POST** /v1/world/decor/designs/{id}/submit | Send one of your decor designs to the review queue.
[**createWorldDecorRetract**](WorldApi.md#createWorldDecorRetract) | **POST** /v1/world/decor/retract | Take a placed decor piece back into your inventory; answers the inventory after.
[**createWorldDm**](WorldApi.md#createWorldDm) | **POST** /v1/world/dms/{userId} | Send a direct message to a friend (a mutual follow; never across a block), up to 400 characters, through the world chat guard. 403 when they are not a friend, 429 when sent too quickly.
[**createWorldFollow**](WorldApi.md#createWorldFollow) | **POST** /v1/world/follows/{userId} | Follow somebody. When they follow you back you are friends (friends-here, invites, messages). Idempotent.
[**createWorldFriendInvite**](WorldApi.md#createWorldFriendInvite) | **POST** /v1/world/friends/{userId}/invite | \&quot;Join me\&quot;: send one friend (a mutual follow) a notification with a link to the PUBLIC room you name by slug. 404 when they are not a friend or the room is not public; 429 when you invited them in the last minute.
[**createWorldGamePackage**](WorldApi.md#createWorldGamePackage) | **POST** /v1/world/games/packages | Submit a game package version for review: files as { path, base64 } (game.json, thumb.png, logic/, scene/, audio/, images/). Checked like the CLI, assets quarantined, the entry document dry-run, then reviewed by a person.
[**createWorldGamePackageCheck**](WorldApi.md#createWorldGamePackageCheck) | **POST** /v1/world/games/packages/check | Validate a game package exactly as a submission is checked (the shared intake report, your version still free) without storing, uploading or queuing anything: world-kit validate for an agent. Same files body as submit.
[**createWorldGameRating**](WorldApi.md#createWorldGameRating) | **POST** /v1/world/games/{id}/rating | Rate a game you played, 1 to 5 stars (rating again replaces it). Only players the runner recorded in that game can rate it.
[**createWorldGameReport**](WorldApi.md#createWorldGameReport) | **POST** /v1/world/games/{id}/report | Report a game: reason broken | unfair | offensive | scam | other, optional detail. Staff review it; the creator is told the reason, never who.
[**createWorldGameStoreCheckout**](WorldApi.md#createWorldGameStoreCheckout) | **POST** /v1/world/games/{id}/store/{item}/checkout | Buy an item or pass from a game store: answers a client secret for the payment; the item is yours once it succeeds.
[**createWorldGrailMatch**](WorldApi.md#createWorldGrailMatch) | **POST** /v1/world/grails/match | Grail glints: send the ids on show somewhere (listingIds -- listings.id, inventoryIds, skuIds -- catalogue market SKUs; up to 400 each) and get back data.listingIds / data.inventoryIds / data.skuIds: the ones that are things you already want -- an open bid, a watched or wishlisted listing (or one selling the same SKU), a market watch, or a card your deck is missing. Read-only.
[**createWorldHallLoan**](WorldApi.md#createWorldHallLoan) | **POST** /v1/world/hall/loans | Lend a piece from your vault to this week&#39;s Hall of Grails exhibition: { vaultItemId, credit: &#39;name&#39; | &#39;anonymous&#39; }. It shows under your plaque until the exhibition ends; it stays in your vault (still listable and withdrawable), and stops showing if it leaves.
[**createWorldHomeAsk**](WorldApi.md#createWorldHomeAsk) | **POST** /v1/world/homes/{slug}/ask | Ask a home owner whether they would sell a piece you saw there (an item or a decor piece).
[**createWorldHomeGuestbook**](WorldApi.md#createWorldHomeGuestbook) | **POST** /v1/world/homes/{slug}/guestbook | Sign a home guestbook (one short line).
[**createWorldHomeGuestbookReport**](WorldApi.md#createWorldHomeGuestbookReport) | **POST** /v1/world/homes/{slug}/guestbook/{id}/report | Report a guestbook entry to moderation.
[**createWorldHuntStart**](WorldApi.md#createWorldHuntStart) | **POST** /v1/world/hunt/start | Start the Great Hunt this season by reading its first riddle (the Copper key&#39;s). Idempotent: starting again answers your progress unchanged. Answers the same shape as GET /v1/world/hunt. 409 when no season is running.
[**createWorldInteractiveAsset**](WorldApi.md#createWorldInteractiveAsset) | **POST** /v1/world/interactive/assets | Upload one asset for your designs: kind glb (4 MB), wav (4 MB) or png (1 MB), the file as base64. Answers its sha256 and the path to reference from MML.
[**createWorldInteractiveDesign**](WorldApi.md#createWorldInteractiveDesign) | **POST** /v1/world/interactive/designs | Create an interactive design: name, footprint (s, m, l or f), optional tint and description, an asking price in COSM base units (a string, six decimals) and optional max supply. Inactive until ops approve a submitted version.
[**createWorldInteractiveDesignCheck**](WorldApi.md#createWorldInteractiveDesignCheck) | **POST** /v1/world/interactive/designs/{id}/check | Check the draft: static rules, that every referenced upload exists, and a sandboxed dry run. Budgeted per person.
[**createWorldInteractiveDesignPreview**](WorldApi.md#createWorldInteractiveDesignPreview) | **POST** /v1/world/interactive/designs/{id}/preview | A private preview token for the draft (author only) and the socket path that runs it. Budgeted per person.
[**createWorldInteractiveDesignSubmit**](WorldApi.md#createWorldInteractiveDesignSubmit) | **POST** /v1/world/interactive/designs/{id}/submit | Freeze the draft as a new version and send it to ops review. Up to 10 a day.
[**createWorldInteractiveReset**](WorldApi.md#createWorldInteractiveReset) | **POST** /v1/world/interactive/reset | Wipe the stored state of an interactive piece standing in a place you own (a home or your boutique).
[**createWorldJobAppraisalAnswer**](WorldApi.md#createWorldJobAppraisalAnswer) | **POST** /v1/world/jobs/appraisals/{id}/answers | Answer a price check: your estimate of the item value in CENTS and an optional note. Moves no money; the asker may accept it.
[**createWorldJobShiftClaim**](WorldApi.md#createWorldJobShiftClaim) | **POST** /v1/world/jobs/shifts/{id}/claim | Claim an open shift. You work it by being in the place while it runs.
[**createWorldJobShiftRelease**](WorldApi.md#createWorldJobShiftRelease) | **POST** /v1/world/jobs/shifts/{id}/release | Give a shift you claimed back to the board.
[**createWorldOutfit**](WorldApi.md#createWorldOutfit) | **POST** /v1/world/outfits | Save what you are wearing now as a named look: { name (1-32 chars), appearance? (skin, hair, hairColour, eyes, build -- unknown keys fall back to the default) }. Each worn thing is recorded as the door it goes back on by; one that no longer traces to something you own is listed in skipped and not saved. 409 when you already keep 6.
[**createWorldOutfitApply**](WorldApi.md#createWorldOutfitApply) | **POST** /v1/world/outfits/{id}/apply | Put a saved look on. Every item goes through the same equip as POST /v1/world/avatar/equip, so ownership still holds: something you no longer own is listed in skipped with the reason and not worn. Slots the look left empty are emptied (cleared). Answers the appearance of the look (for your character -- appearance lives on your device), applied, skipped and cleared. Moves no money.
[**createWorldParty**](WorldApi.md#createWorldParty) | **POST** /v1/world/parties | Start a party with you as leader (up to 8 members).
[**createWorldPartyChat**](WorldApi.md#createWorldPartyChat) | **POST** /v1/world/parties/{id}/chat | Say something in your party chat (up to 2000 characters).
[**createWorldPartyInvite**](WorldApi.md#createWorldPartyInvite) | **POST** /v1/world/parties/{id}/invite | Invite a friend (userId) to your party.
[**createWorldPartyInviteAccept**](WorldApi.md#createWorldPartyInviteAccept) | **POST** /v1/world/parties/invites/{inviteId}/accept | Accept a party invite.
[**createWorldPartyInviteDecline**](WorldApi.md#createWorldPartyInviteDecline) | **POST** /v1/world/parties/invites/{inviteId}/decline | Decline a party invite.
[**createWorldPartyKick**](WorldApi.md#createWorldPartyKick) | **POST** /v1/world/parties/{id}/kick | As leader, remove a member (userId).
[**createWorldPartyLeader**](WorldApi.md#createWorldPartyLeader) | **POST** /v1/world/parties/{id}/leader | As leader, pass the lead to a member (userId).
[**createWorldPartyLeave**](WorldApi.md#createWorldPartyLeave) | **POST** /v1/world/parties/{id}/leave | Leave your party (the lead passes on if you led it).
[**createWorldPartyWishlist**](WorldApi.md#createWorldPartyWishlist) | **POST** /v1/world/parties/{id}/wishlist | Add a listing (listingId, or its shop slug) to the party wishlist; answers the wishlist.
[**createWorldPartyWishlistVote**](WorldApi.md#createWorldPartyWishlistVote) | **POST** /v1/world/parties/{id}/wishlist/{listingId}/vote | Thumb a wishlist listing up or down (null clears your vote); answers the wishlist.
[**createWorldPlaceItemWant**](WorldApi.md#createWorldPlaceItemWant) | **POST** /v1/world/places/{slug}/items/{itemId}/want | Tell a room owner you would buy one of their items (once per person per item; they see the count). Moves no money.
[**createWorldSpace**](WorldApi.md#createWorldSpace) | **POST** /v1/world/spaces | Open a Space (sellers only, at most two): slug, name, venue, optional membership and about.
[**createWorldSpaceEvent**](WorldApi.md#createWorldSpaceEvent) | **POST** /v1/world/spaces/{slug}/events | As host or co-host, put an event on: title, kind, optional about, ISO start and end with offset.
[**createWorldSpaceEventRsvp**](WorldApi.md#createWorldSpaceEventRsvp) | **POST** /v1/world/spaces/{slug}/events/{id}/rsvp | Say whether you are going to an event.
[**createWorldSpaceInvite**](WorldApi.md#createWorldSpaceInvite) | **POST** /v1/world/spaces/{slug}/invite | Invite somebody (userId) to a Space.
[**createWorldSpaceJoin**](WorldApi.md#createWorldSpaceJoin) | **POST** /v1/world/spaces/{slug}/join | Join a Space, or ask to when it is request-only.
[**createWorldSpaceLeave**](WorldApi.md#createWorldSpaceLeave) | **POST** /v1/world/spaces/{slug}/leave | Leave a Space.
[**createWorldSpaceRequestByUserId**](WorldApi.md#createWorldSpaceRequestByUserId) | **POST** /v1/world/spaces/{slug}/requests/{userId} | As host or co-host, accept or turn down a request to join.
[**createWorldSpaceRole**](WorldApi.md#createWorldSpaceRole) | **POST** /v1/world/spaces/{slug}/role | As host, make a member a co-host or back to a member.
[**deleteSpatialSceneGrant**](WorldApi.md#deleteSpatialSceneGrant) | **DELETE** /v1/spatial/scenes/{id}/grants/{grantId} | Take somebody&#39;s access to your room away, or kill an invite nobody has used yet.
[**deleteSpatialSceneNode**](WorldApi.md#deleteSpatialSceneNode) | **DELETE** /v1/spatial/scenes/{id}/nodes | Remove units (by id, up to 500) from one of your warehouse rooms.
[**deleteSpatialSceneWarehouseStock**](WorldApi.md#deleteSpatialSceneWarehouseStock) | **DELETE** /v1/spatial/scenes/{id}/warehouse/stock | Take an inventory item (or unit) off its rack.
[**deleteSpatialStreetRequest**](WorldApi.md#deleteSpatialStreetRequest) | **DELETE** /v1/spatial/streets/requests/{id} | Withdraw a street request you made that has not been founded yet.
[**deleteWorldBlock**](WorldApi.md#deleteWorldBlock) | **DELETE** /v1/world/blocks/{id} | Unblock somebody (by the block id from GET /v1/world/blocks).
[**deleteWorldCollectionCapability**](WorldApi.md#deleteWorldCollectionCapability) | **DELETE** /v1/world/collections/{chain}/{contract}/capabilities | Withdraw your declaration for a collection.
[**deleteWorldFollow**](WorldApi.md#deleteWorldFollow) | **DELETE** /v1/world/follows/{userId} | Unfollow somebody. Idempotent.
[**deleteWorldHallLoan**](WorldApi.md#deleteWorldHallLoan) | **DELETE** /v1/world/hall/loans/{id} | Take one of your loans off show in the Hall of Grails.
[**deleteWorldHomeGuestbook**](WorldApi.md#deleteWorldHomeGuestbook) | **DELETE** /v1/world/homes/{slug}/guestbook/{id} | As the home owner, hide a guestbook entry.
[**deleteWorldInteractiveDesign**](WorldApi.md#deleteWorldInteractiveDesign) | **DELETE** /v1/world/interactive/designs/{id} | Delete a draft design, or archive a submitted one (off sale; owned copies keep working).
[**deleteWorldJobShift**](WorldApi.md#deleteWorldJobShift) | **DELETE** /v1/world/jobs/shifts/{id} | Cancel a shift you posted that nobody has worked yet.
[**deleteWorldOutfit**](WorldApi.md#deleteWorldOutfit) | **DELETE** /v1/world/outfits/{id} | Delete a saved look. 404 when it is not yours.
[**deleteWorldPartyWishlist**](WorldApi.md#deleteWorldPartyWishlist) | **DELETE** /v1/world/parties/{id}/wishlist/{listingId} | Take a listing you added off the party wishlist; answers the wishlist.
[**deleteWorldPlaceBan**](WorldApi.md#deleteWorldPlaceBan) | **DELETE** /v1/world/places/{slug}/bans/{userId} | Lift a ban from a place you own; they can walk in again right away.
[**deleteWorldSpace**](WorldApi.md#deleteWorldSpace) | **DELETE** /v1/world/spaces/{slug} | As host, close a Space.
[**deleteWorldSpaceEvent**](WorldApi.md#deleteWorldSpaceEvent) | **DELETE** /v1/world/spaces/{slug}/events/{id} | As host or co-host, cancel an event.
[**getSpatialSceneAttention**](WorldApi.md#getSpatialSceneAttention) | **GET** /v1/spatial/scenes/{sceneId}/attention | What visitors looked at in one of your rooms: viewers, looks, inspects and dwell per item over the last days (1-35, default 30).
[**getSpatialSceneWindow**](WorldApi.md#getSpatialSceneWindow) | **GET** /v1/spatial/scenes/{id}/window | The listings you chose for the street window of your shop, in slot order (left, middle, right; empty &#x3D; newest first), and &#x60;choices&#x60;: your listings that can go in it, newest first.
[**getSpatialShopNeighbourhood**](WorldApi.md#getSpatialShopNeighbourhood) | **GET** /v1/spatial/shop/neighbourhood | Your shop&#39;s neighbourhood, and whether and where it may move.
[**getSpatialSpace**](WorldApi.md#getSpatialSpace) | **GET** /v1/spatial/spaces | The room catalogue: every space profile (what it holds, how it is sorted, its containers) and the warehouse units.
[**getSpatialStreetAdmission**](WorldApi.md#getSpatialStreetAdmission) | **GET** /v1/spatial/streets/admissions | Street applications and invitations: yours, and those waiting on streets you own.
[**getSpatialStreetDecor**](WorldApi.md#getSpatialStreetDecor) | **GET** /v1/spatial/streets/{slug}/decor | The decor on a street you may dress, and what you can place.
[**getWorldArcade**](WorldApi.md#getWorldArcade) | **GET** /v1/world/arcade | The Arcade in Crossly World: data.cabinets (slot, where it stands, host -- piece, price_guess or empty --, game, title, blurb, the piece it hosts and where, record, packageId and thumbnail for a creator game from the Game Directory, players) and data.scores (the High Score wall: per game a title, kind -- leaderboard, record or top -- and up to five ASCII lines; a name shows only for somebody who chose to be seen by name, everyone else is \&quot;A player\&quot;), plus creatorGames (creator games with a cabinet now). Games are played in the world.
[**getWorldAurora**](WorldApi.md#getWorldAurora) | **GET** /v1/world/aurora | The Sales Aurora over the Commons in Crossly World: every real sale on Crossly in the last data.windowDays (30) days. data.total (sales in the window), data.families (key, label, colour, count per colour family: cards, coins, jewellery, electronics, media, fashion, toys, other) and data.sales (newest first, at most 48: family, ageHours, fresh -- sold in the last ten minutes, which shimmers). Aggregate only: no item, price, seller or platform. data.updatedAt is when it was read.
[**getWorldAutoShop**](WorldApi.md#getWorldAutoShop) | **GET** /v1/world/auto-shop | Whether Crossly keeps a world shop for you automatically: enabled, and the shop (id, name, visibility, autoCreated, address, label) or null. Change it with PATCH /v1/world/auto-shop.
[**getWorldAvatarIdentity**](WorldApi.md#getWorldAvatarIdentity) | **GET** /v1/world/avatar/identity | Whether others see your name in the world (named), or not (anonymous); null if you have never chosen.
[**getWorldAvatarLoadout**](WorldApi.md#getWorldAvatarLoadout) | **GET** /v1/world/avatar/loadout | What you are wearing: the rig, its slots (avatar_head, avatar_body, avatar_outer -- a jacket over the top, avatar_legs, avatar_feet, avatar_back) and each worn entry -- a cosmetic or a real item -- with its verified-purchase mark. Carries no price, receipt id, seller or order.
[**getWorldAvatarLoadoutByUserId**](WorldApi.md#getWorldAvatarLoadoutByUserId) | **GET** /v1/world/avatar/loadout/{userId} | What somebody else is wearing, with the verified-purchase mark on each real item -- public on purpose, since a check only its owner can see is not a check. No price, receipt id, seller or order.
[**getWorldAvatarLook**](WorldApi.md#getWorldAvatarLook) | **GET** /v1/world/avatar/look | Your world look on the account: the handle you chose (null if anonymous) and your appearance; null if you never made one.
[**getWorldAvatarNftBadge**](WorldApi.md#getWorldAvatarNftBadge) | **GET** /v1/world/avatar/nft-badge | The NFT you wear on your nameplate in the world, or null.
[**getWorldCapability**](WorldApi.md#getWorldCapability) | **GET** /v1/world/capabilities | What your held NFTs unlock in Crossly World: each token with the capabilities its collection declared (wear, display, emote, gate, ...). Holding is your verified wallets (their synced tokens); the capabilities of a transferred token go within five minutes.
[**getWorldCapabilityCatalogue**](WorldApi.md#getWorldCapabilityCatalogue) | **GET** /v1/world/capabilities/catalogue | The capability kinds of spec crossly.nft-capabilities/1: what each does, whether only the creator of the collection may declare it, whether it needs review, and which clients honour it.
[**getWorldCapabilityWear**](WorldApi.md#getWorldCapabilityWear) | **GET** /v1/world/capabilities/wear | What you wear from your NFTs and COSM copies: your pick per avatar slot (head, body, legs, feet, back) and what the room sees.
[**getWorldChest**](WorldApi.md#getWorldChest) | **GET** /v1/world/chests | The Commons chest: data.window (this 20-minute window, UTC), spot ([x, z] on the plaza), endsAt (when the next chest comes) and mine (openedThis, and opened -- how many windows you have opened one in; the Chest opener pin comes at 10). A chest is opened by walking up to it in Crossly World, never over the API.
[**getWorldCollectionCapability**](WorldApi.md#getWorldCollectionCapability) | **GET** /v1/world/collections/{chain}/{contract}/capabilities | The live capability declaration of a collection (404 when it has none).
[**getWorldContestMine**](WorldApi.md#getWorldContestMine) | **GET** /v1/world/contests/mine | Your contest entries (best score, attempts used, payment state) and prizes (granted, or owed until their gate opens).
[**getWorldConvention**](WorldApi.md#getWorldConvention) | **GET** /v1/world/conventions/{id} | One convention. 404 for an unknown or malformed id alike.
[**getWorldCosmBalance**](WorldApi.md#getWorldCosmBalance) | **GET** /v1/world/cosm/balance | Your COSM balance: baseUnits (a STRING -- COSM has 6 decimals and overflows a JSON number), decimals, available (false &#x3D; COSM is not provisioned on this deployment, not a zero balance).
[**getWorldCrew**](WorldApi.md#getWorldCrew) | **GET** /v1/world/crew | Your crew: data.crew is null when you are in none, else its name, tag, join code and whether you own it; data.members lists up to 30 members, each with the public room they are in right now when they chose to be seen by name (else null).
[**getWorldCrewChat**](WorldApi.md#getWorldCrewChat) | **GET** /v1/world/crew/chat | Your crew chat: data.messages is the last 50 lines (from, name, text, at), kept in memory only, so it starts empty after a restart. 404 when you are in no crew.
[**getWorldCrewLeaderboard**](WorldApi.md#getWorldCrewLeaderboard) | **GET** /v1/world/crew/leaderboards | The game leaderboards (Price Guess, hunts, speed trades; this week and all time) ranked among your crew only, each member by the name the crew sees. 404 when you are in no crew.
[**getWorldDm**](WorldApi.md#getWorldDm) | **GET** /v1/world/dms/{userId} | Your direct-message thread with one friend, oldest first (the last 100 lines: id, from, text, at, mine). Reading it marks their lines read.
[**getWorldEmoteShowable**](WorldApi.md#getWorldEmoteShowable) | **GET** /v1/world/emotes/showable | The things you own that a show-off emote can hold up.
[**getWorldFirefly**](WorldApi.md#getWorldFirefly) | **GET** /v1/world/fireflies | Fireflies on the Commons lawn: data.day (today, UTC), today (fireflies everyone has caught today) and mine (today -- your catches today, up to perDay -- total, all your catches; the Firefly Catcher pin comes at 30 -- and perDay). Fireflies are caught by walking up to a lit one in Crossly World after dark, never over the API, and nothing is spent.
[**getWorldFitStat**](WorldApi.md#getWorldFitStat) | **GET** /v1/world/fits/stats | Your walking storefront, last 7 days: distinct people who tapped \&quot;Shop this\&quot; or \&quot;Offer\&quot; on what you wore, and how many of each. Counts only; nobody is identified.
[**getWorldFitValue**](WorldApi.md#getWorldFitValue) | **GET** /v1/world/fit-value | What your outfit is worth on the market: cents (sum of each catalogued piece&#39;s order-book price -- last sale, else lowest ask), pieces worn, how many were priced, and share (whether you show it on your card).
[**getWorldGame**](WorldApi.md#getWorldGame) | **GET** /v1/world/games/{id} | One live game: its manifest, its store items and which you own.
[**getWorldGameLeaderboard**](WorldApi.md#getWorldGameLeaderboard) | **GET** /v1/world/games/{id}/leaderboard | A live game leaderboard, this week and all time, by its manifest scoring (wins, best points, or best time). Only people who chose to be named show by name. scoring is null for a game that keeps no board.
[**getWorldGamePackage**](WorldApi.md#getWorldGamePackage) | **GET** /v1/world/games/packages/{id} | One of your game packages with every version, its review state and decision note.
[**getWorldGameTemplate**](WorldApi.md#getWorldGameTemplate) | **GET** /v1/world/games/templates/{kind} | A fresh game package from a template (table, arena, object; collection is an NFT capability declaration), as { path, base64 } files: the world-kit init, for an agent with no local kit. ?id&#x3D;my-game&amp;name&#x3D;My Game.
[**getWorldHall**](WorldApi.md#getWorldHall) | **GET** /v1/world/hall | The Hall of Grails in Crossly World: data.exhibition (key, title, blurb, endsAt -- a new one every Monday UTC -- and next, the coming one&#39;s title) and data.exhibits, up to twelve real catalogue items in slot order (skuId, name, brand, imageUrl, thumbUrl, retailCents, lowestAskCents, lastSaleCents: the live order book, null when the market has none). The first stands on the centre plinth. Buy, bid or watch an exhibit through the market endpoints with its skuId.
[**getWorldHallLoan**](WorldApi.md#getWorldHallLoan) | **GET** /v1/world/hall/loans | Lend to the Hall: this week&#39;s exhibition (key, title, categorySlug, endsAt), your loans on show (id, vaultItemId, skuId, name, credit, since) and the vault pieces you can lend (eligible: vaultItemId, skuId, name, imageUrl, grade) -- held in your Crossly vault, not pledged, in the exhibition&#39;s category. perMember is how many you may lend each week.
[**getWorldHomePlaceable**](WorldApi.md#getWorldHomePlaceable) | **GET** /v1/world/home/placeable | What you can place in your home: your items and your furniture.
[**getWorldHunt**](WorldApi.md#getWorldHunt) | **GET** /v1/world/hunt | Your Great Hunt: data.season (id, name, startsAt, endsAt, the title and how many earn it, live), started (you read the first clue), held (keys held, 0-3, always in the order copper, jade, crystal), keys (each with its name, colour, its riddle once it is yours to read, and when you picked it up), and cleared (your rank through the Gate this season, when, and whether you earned the title) or null. Keys are picked up by walking to them in Crossly World; nothing here takes one.
[**getWorldHuntScoreboard**](WorldApi.md#getWorldHuntScoreboard) | **GET** /v1/world/hunt/scoreboard | The Great Hunt Scoreboard, as the monolith in the Commons shows it: data.season (the running season, or the last one between seasons), finishers (the first ten through the Gate in order: rank, name, short, named, at, titled -- a name shows only for somebody who chose to be seen by name in the world, everyone else is \&quot;A player\&quot;) and total (everybody through the Gate this season).
[**getWorldInteractiveDesign**](WorldApi.md#getWorldInteractiveDesign) | **GET** /v1/world/interactive/designs/{id} | One of your interactive designs: its draft source, the last static check, and every submitted version with its review state.
[**getWorldJob**](WorldApi.md#getWorldJob) | **GET** /v1/world/jobs | The jobs board: open staff shifts you could claim, your claimed shifts and open price checks (appraisals), as the world shows them.
[**getWorldKite**](WorldApi.md#getWorldKite) | **GET** /v1/world/kites | Kites flown on the Commons lawn: data.day (today, UTC), today (kites everyone has flown today) and mine (today -- yours today, up to perDay -- perDay, and days -- the days you have flown one on; the Kite flyer pin comes at 5). Kites are flown by standing out on the lawn in Crossly World by day, never over the API, and nothing is spent.
[**getWorldLantern**](WorldApi.md#getWorldLantern) | **GET** /v1/world/lanterns | Sky lanterns in the Commons: data.day (today, UTC), today (lanterns everyone has released today) and mine (today -- yours today, up to perDay -- perDay, and days -- the days you have released one on; the Lantern lighter pin comes at 5). Lanterns are released at the lantern stand in Crossly World, never over the API, and nothing is spent.
[**getWorldPartyChat**](WorldApi.md#getWorldPartyChat) | **GET** /v1/world/parties/{id}/chat | Your party chat: the recent lines. 404 when this is not your party.
[**getWorldPlaceBoard**](WorldApi.md#getWorldPlaceBoard) | **GET** /v1/world/places/{slug}/boards | The Trade Floor&#39;s wall of wants, its authentication desk and its Vault Markets ticker (vaultMovers: bookKey, name, label, units, markCents, change24hBps; only the trade-floor place has them).
[**getWorldPlaceCollection**](WorldApi.md#getWorldPlaceCollection) | **GET** /v1/world/places/{slug}/collections/{category}/{brand}/{model} | One collection room: every piece of the set, owned or missing. 404 for an unknown room or set.
[**getWorldPlaceDrop**](WorldApi.md#getWorldPlaceDrop) | **GET** /v1/world/places/{slug}/drop | The owner&#39;s next drop (name, cover, time, live) and how many people are waiting in the room.
[**getWorldPlaceItemInterest**](WorldApi.md#getWorldPlaceItemInterest) | **GET** /v1/world/places/{slug}/items/{itemId}/interest | How many people looked at one item in this room today.
[**getWorldPlaceLive**](WorldApi.md#getWorldPlaceLive) | **GET** /v1/world/places/{slug}/live | The owner&#39;s live sale: their stream and the lot on the block, or null.
[**getWorldPlaceSeller**](WorldApi.md#getWorldPlaceSeller) | **GET** /v1/world/places/{slug}/seller | The shop whose public room this is (username and name), or null.
[**getWorldPlaceShopPet**](WorldApi.md#getWorldPlaceShopPet) | **GET** /v1/world/places/{slug}/shop-pet | The shop&#39;s pet kind, or null.
[**getWorldSpace**](WorldApi.md#getWorldSpace) | **GET** /v1/world/spaces/{slug} | One Space: its layout, host, events and your place in it.
[**getWorldSpaceCanHost**](WorldApi.md#getWorldSpaceCanHost) | **GET** /v1/world/spaces/can-host | Whether you may open a Space: sellers only, at most two active.
[**getWorldTrialLeaderboard**](WorldApi.md#getWorldTrialLeaderboard) | **GET** /v1/world/trials/{course}/leaderboard | A Time Trials course&#39;s boards, as the board beside it in the Commons shows them: data.course, week, weekly (this week&#39;s ten fastest: rank, name, short, named, ms, at) and allTime (the ten fastest ever, each person once). A name shows only for somebody who chose to be seen by name in the world; everyone else is \&quot;A player\&quot;. 404 for an unknown course; course 1 is commons-loop.
[**getWorldTrialMine**](WorldApi.md#getWorldTrialMine) | **GET** /v1/world/trials/mine | Your Hoverboard Time Trials bests: data.week (its Monday, YYYY-MM-DD, UTC) and courses, each with course (id, name, parMs, rings, lengthM), week (your best lap this week in ms, your place on the weekly board, laps finished, and the split at each ring) or null, and allTime (your best ever in ms, your place on the all-time board, when) or null. Laps are timed by Crossly from where it saw you ride in the world; nothing here writes one.
[**getWorldWallet**](WorldApi.md#getWorldWallet) | **GET** /v1/world/wallet | Every balance you hold in Crossly World, read-only: bucksCents (Crossly Bucks, cents); cbx (available, decimals, and the three CBX balances kept apart as base-unit STRINGS -- granted (spend here only), earned (withdrawable once matured), connected (a delegation ceiling on your own wallet, not cash on hand) -- plus pendingCents of cashback not yet matured); cosm (available, decimals, baseUnits string). available:false means that currency is not provisioned on this deployment, not that you hold none.
[**getWorldWish**](WorldApi.md#getWorldWish) | **GET** /v1/world/wishes | The Wishing Fountain in the Commons: data.day (today, UTC), today (wishes everyone has made today) and mine (madeToday, days -- how many days you have wished on, the Wishmaker pin comes at 7 -- and nextAt, when tomorrow&#39;s wish opens). One wish a day; a wish is made by tossing a coin at the fountain in Crossly World, never over the API, and nothing is spent.
[**listSpatialSceneGrants**](WorldApi.md#listSpatialSceneGrants) | **GET** /v1/spatial/scenes/{id}/grants | Everyone who can currently walk into one of your rooms, and unused invites. Never returns codes.
[**listSpatialSceneWarehouseUnplaced**](WorldApi.md#listSpatialSceneWarehouseUnplaced) | **GET** /v1/spatial/scenes/{id}/warehouse/unplaced | Stock not yet on a shelf in a warehouse room you can arrange (q filters by title).
[**listSpatialSharedWithMe**](WorldApi.md#listSpatialSharedWithMe) | **GET** /v1/spatial/shared-with-me | Rooms other people let you into.
[**listSpatialStreetLeases**](WorldApi.md#listSpatialStreetLeases) | **GET** /v1/spatial/streets/{slug}/leases | Plots on a street offered for lease: weekly rent in CENTS and terms.
[**listWorldAvatarCloset**](WorldApi.md#listWorldAvatarCloset) | **GET** /v1/world/avatar/closet | Everything you can verifiably wear (your Crossly purchase receipts), newest first: receiptId, item title, brand, size, image, catalog sku/variant, quantity, purchasedAt. Pass a receiptId to POST /v1/world/avatar/equip to put one on. limit 1-200, offset for paging.
[**listWorldAvatarStock**](WorldApi.md#listWorldAvatarStock) | **GET** /v1/world/avatar/stock | Items of your OWN inventory you could wear into a room as a walking storefront: inventoryItemId, title, image and the slot it would go on. Pass an inventoryItemId to POST /v1/world/avatar/equip.
[**listWorldAvatarWearables**](WorldApi.md#listWorldAvatarWearables) | **GET** /v1/world/avatar/wearables | Wearables you have authored as a designer: id, sku, name, slot, priceBaseUnits (COSM base units, a string), maxSupply, mintedCount, active (false until reviewed). meta.available is false when COSM is not provisioned here.
[**listWorldBestDressed**](WorldApi.md#listWorldBestDressed) | **GET** /v1/world/best-dressed | This week&#39;s best-dressed board (Monday-based), top ten: name, profile username and loves. Only people still choosing to be seen by name.
[**listWorldCapabilityDeclarations**](WorldApi.md#listWorldCapabilityDeclarations) | **GET** /v1/world/capabilities/declarations | Your capability declarations, in every review state (pending, live, rejected with the note from the reviewer).
[**listWorldContestStandings**](WorldApi.md#listWorldContestStandings) | **GET** /v1/world/contests/{id}/standings | The standings of a contest now: best score first (or lowest, for a time game), ties to whoever got there first.
[**listWorldContests**](WorldApi.md#listWorldContests) | **GET** /v1/world/contests | Open skill contests on Crossly World games, soonest ending first: entry mode (free, sponsored, paid) and prizes.
[**listWorldConventionExhibitors**](WorldApi.md#listWorldConventionExhibitors) | **GET** /v1/world/conventions/{id}/exhibitors | The host roster: who applied, who was invited, who is coming (by shop handle). Host only; 404 otherwise.
[**listWorldConventionMine**](WorldApi.md#listWorldConventionMine) | **GET** /v1/world/conventions/mine | Conventions you host and conventions you are exhibiting at.
[**listWorldConventions**](WorldApi.md#listWorldConventions) | **GET** /v1/world/conventions | Conventions open to sellers now or soon: title, room, dates, and how to get a table (invite, free, fee or revenue share).
[**listWorldCosmCosmetics**](WorldApi.md#listWorldCosmCosmetics) | **GET** /v1/world/cosm/cosmetics | The active cosmetics catalogue, optionally by tier (premium | earned | stake_exclusive) or slot: sku, name, slot, tier, priceCents (premium only), priceBaseUnits (earned only, COSM base units string), supply, fusable, preview and what it unlocks. Read-only: cosmetics are bought on crossly.net. meta.available / meta.decimals.
[**listWorldCosmDesigns**](WorldApi.md#listWorldCosmDesigns) | **GET** /v1/world/cosm/designs | Your COSM designs in the world: popularity toward the free chain unlock a popular limited design earns, whether it is on chain, and your opt-out. Declare what a design does with chain cosm and the design id as the contract.
[**listWorldCosmInventory**](WorldApi.md#listWorldCosmInventory) | **GET** /v1/world/cosm/inventory | Cosmetics you hold, newest first: ownershipId, cosmeticId, sku, name, slot, tier, how it was acquired, bound, edition number, acquiredAt and what it unlocks. Pass a cosmeticId to POST /v1/world/avatar/equip to wear one. meta.available.
[**listWorldDecorCatalogue**](WorldApi.md#listWorldDecorCatalogue) | **GET** /v1/world/decor/catalogue | The Decor Shop: every active cosmetic grouped by surface (avatar | home | shop | stall | street) and slot -- name, tier, priceCents (premium: the dollar price, paid in CBX at spot) or priceBaseUnits (earned: COSM, base-unit string), edition supply and remaining, tint swatch, preview, what it unlocks, owned + your edition number, and buyWith. Read-only: buying and minting happen on crossly.net/shop/decor. meta.available, meta.mint {open, reason}, meta.cbx {open, reason} (CBX opens at mint), meta.balances (your COSM and CBX, base-unit strings), meta.surfaces. Never sold by card.
[**listWorldDecorDesigns**](WorldApi.md#listWorldDecorDesigns) | **GET** /v1/world/decor/designs | Your decor designs and their review state. available is false until COSM is provisioned.
[**listWorldDecorInventory**](WorldApi.md#listWorldDecorInventory) | **GET** /v1/world/decor/inventory | Your decor as an INVENTORY. Decor is a quantity: every copy is one unit -- a placed prop (home_prop, prop) uses one per placement, a finish (wallpaper, floor, theme, shopfront, facade, sign style, street lamp/banner/paving/arch, booth canopy/pattern/lights/counter) one per space it dresses; free values are unlimited. Per item: key, value, pair (key:value), name, sku, surface, placeable, tint, owned, placed, available, placements [{ space { kind: home | shop | stall | street, id, name }, count }], copies [{ ownershipId, editionNumber }]. meta.available, meta.spaces (every space you dress). Read-only: placing and retracting happen in the app or on crossly.net.
[**listWorldDecorMarket**](WorldApi.md#listWorldDecorMarket) | **GET** /v1/world/decor/market | Decor copies other people are reselling (asks in COSM); optional pair filter. Read only: listing and buying stay on crossly.net.
[**listWorldDecorMine**](WorldApi.md#listWorldDecorMine) | **GET** /v1/world/decor/mine | Decor you hold AND decor you have minted to your wallet, newest first: ownershipId, cosmeticId, sku, name, surface, slot, tier, acquiredVia, bound, editionNumber of maxSupply, mintState (held | minting | minted), mintAddress, mintable, and what it unlocks. meta.available, meta.mint.
[**listWorldDecorStalls**](WorldApi.md#listWorldDecorStalls) | **GET** /v1/world/decor/stalls | Your stall bookings, to dress their booths.
[**listWorldDecorStreets**](WorldApi.md#listWorldDecorStreets) | **GET** /v1/world/decor/streets | Streets you may dress.
[**listWorldDms**](WorldApi.md#listWorldDms) | **GET** /v1/world/dms | Your friends (mutual follows) for direct messages: each with userId, name, the last line between you (text, at, mine) or null, and how many of theirs you have not read; most recent first.
[**listWorldFollowingRooms**](WorldApi.md#listWorldFollowingRooms) | **GET** /v1/world/following/rooms | The public rooms of people you follow, to walk into.
[**listWorldFollows**](WorldApi.md#listWorldFollows) | **GET** /v1/world/follows | Everybody you follow in Crossly World, newest first, each with mutual: true when they follow you back (a friend).
[**listWorldFriendHere**](WorldApi.md#listWorldFriendHere) | **GET** /v1/world/friends/here | Your friends in Crossly World right now, and where (when they share it).
[**listWorldFriends**](WorldApi.md#listWorldFriends) | **GET** /v1/world/friends | Your friends (mutual follows), each with the PUBLIC room they are in right now when they chose to be seen by name there (else null), and their home address slug when they let friends visit. Invisible and anonymous friends are never located.
[**listWorldGamePackages**](WorldApi.md#listWorldGamePackages) | **GET** /v1/world/games/packages | Your game packages, each with its latest version and review state.
[**listWorldGameRewards**](WorldApi.md#listWorldGameRewards) | **GET** /v1/world/games/rewards | Rewards you won in games: granted, or recorded as unfunded for COSM and CBX (a game prints no value).
[**listWorldGames**](WorldApi.md#listWorldGames) | **GET** /v1/world/games | The Game Directory: every live, reviewed game package with its players, places, rewards, contests and the piece people place.
[**listWorldHomeBuilding**](WorldApi.md#listWorldHomeBuilding) | **GET** /v1/world/home/building | Homes whose owner made you a co-builder.
[**listWorldInteractiveCatalogue**](WorldApi.md#listWorldInteractiveCatalogue) | **GET** /v1/world/interactive/catalogue | Interactive objects: every piece that runs a shared script in a room (first-party and approved creator designs). Per item: model (the piece key a home layout or boutique prop stores), decorValue (the home_prop value its SKU claims), source (first_party | creator), name, blurb, size [x, z] metres, fallbackMesh, cosmeticId (the SKU on the Decor Shop, null when not on sale) and version (a creator design: the approved version every copy runs). Read-only: buying is on crossly.net/shop/decor.
[**listWorldInteractiveDesigns**](WorldApi.md#listWorldInteractiveDesigns) | **GET** /v1/world/interactive/designs | Your interactive-object designs (MML documents you wrote), newest first: id, handle, name, footprint (s | m | l | f), tint, priceBaseUnits (COSM, base-unit string), maxSupply, model, decorValue, cosmeticId, liveVersion (the approved version every copy runs; null &#x3D; none), withdrawnReason, archivedAt (you archived it: off sale, owned copies keep running; null &#x3D; not archived), latestVersion { version, state: pending | approved | rejected | withdrawn | cancelled, decisionNote }, inReview. &#x60;archived&#x60;: exclude (default), include or only archived designs. Read-only: writing, previewing, submitting and archiving happen on crossly.net/shop/decor?tab&#x3D;interactive.
[**listWorldJobPosted**](WorldApi.md#listWorldJobPosted) | **GET** /v1/world/jobs/posted | Shifts you posted for your rooms, with who claimed each and how it went.
[**listWorldOutfits**](WorldApi.md#listWorldOutfits) | **GET** /v1/world/outfits | Your saved outfits (up to 6, oldest first): id, name, appearance (skin, hair, hairColour, eyes, build) and items -- each worn thing as the door it goes back on by (slot, door: cosmetic | receipt | stock, id, label). Put one on with POST /v1/world/outfits/:id/apply.
[**listWorldPlaceBans**](WorldApi.md#listWorldPlaceBans) | **GET** /v1/world/places/{slug}/bans | Who is banned from a place you own (your boutique or home).
[**listWorldPlaceBundles**](WorldApi.md#listWorldPlaceBundles) | **GET** /v1/world/places/{slug}/bundles | The owner&#39;s bundle deals mapped onto this room&#39;s items (itemIds null &#x3D; any N from the shop). The discount is decided at checkout.
[**listWorldPlaceCollections**](WorldApi.md#listWorldPlaceCollections) | **GET** /v1/world/places/{slug}/collections | The owner&#39;s collection rooms: one per category, brand and model they collect.
[**listWorldPlaceOffers**](WorldApi.md#listWorldPlaceOffers) | **GET** /v1/world/places/{slug}/offers | What is for sale in a public room: price, condition and stock, with market references. 404 when no such room is shared.
[**listWorldPlaceRadar**](WorldApi.md#listWorldPlaceRadar) | **GET** /v1/world/places/{slug}/radar | What you have that someone here wants, and what is here that you want: matched on catalog ids.
[**listWorldPlaceTradeTables**](WorldApi.md#listWorldPlaceTradeTables) | **GET** /v1/world/places/{slug}/trade-tables | The open trade tables in a place: who is sitting and what is laid on the mat.
[**listWorldPlaceTrades**](WorldApi.md#listWorldPlaceTrades) | **GET** /v1/world/places/{slug}/trades | Items in this room open to trades, each with its trade post path.
[**listWorldProvenance**](WorldApi.md#listWorldProvenance) | **GET** /v1/world/provenance | Provenance trails: where in Crossly World your purchases were found, newest first (optionally ?listingIds&#x3D;a,b -- platform listing ids). data: [{ platformListingId, slug (the listing public slug), kind (room | window | stall | space | drop | auction | worn | agent), place (its name, or null when gone), at, line -- e.g. \&quot;Found at The Sneaker Vault, Oct 2026\&quot; }]. Yours only.
[**listWorldQuests**](WorldApi.md#listWorldQuests) | **GET** /v1/world/quests | Every world quest with your progress: key, the pin it earns, goal, target, count, done, colour. meta.wearing is the pin on your nameplate (or null); meta.streak your current and best daily visit streak. Progress only comes from what the server saw -- there is no write of it.
[**listWorldSpaceMine**](WorldApi.md#listWorldSpaceMine) | **GET** /v1/world/spaces/mine | Spaces you belong to.
[**listWorldSpaceRequests**](WorldApi.md#listWorldSpaceRequests) | **GET** /v1/world/spaces/{slug}/requests | As host or co-host, who asked to join.
[**listWorldSpaceWhatsOn**](WorldApi.md#listWorldSpaceWhatsOn) | **GET** /v1/world/spaces/whats-on | Live and upcoming events across Spaces (streets&#x3D;1 and stage&#x3D;1 add street and Main Stage events).
[**listWorldSpaces**](WorldApi.md#listWorldSpaces) | **GET** /v1/world/spaces | The Spaces directory: seller-hosted clubs with a venue, members and events (optional venue filter).
[**listWorldStreaks**](WorldApi.md#listWorldStreaks) | **GET** /v1/world/streaks | The longest current daily visit streaks (2+ days), top ten: name and days. Only people still choosing to be seen by name.
[**listWorldTradeMine**](WorldApi.md#listWorldTradeMine) | **GET** /v1/world/trades/mine | Your trades and each item progress through the authentication gate (verified or failed).
[**listWorldTradeTableBinder**](WorldApi.md#listWorldTradeTableBinder) | **GET** /v1/world/trade-tables/binder | Your binder: unsold collection rows that are catalog items and may be laid on a trade mat -- key, variantId, condition, grade, portfolioId, name, image and valueCents (market value, cents).
[**listWorldTradeTableListings**](WorldApi.md#listWorldTradeTableListings) | **GET** /v1/world/trade-tables/listings | Your open Trade Block trade listings a trade table can be opened on in the world, each with its items&#39; names.
[**updateSpatialSceneCosmetic**](WorldApi.md#updateSpatialSceneCosmetic) | **PATCH** /v1/spatial/scenes/{id}/cosmetics | Redecorate one of your rooms (wall, floor, lighting, trim...). Unknown keys are dropped; the response is what survived. &#x60;clear&#x60; lists keys to reset.
[**updateSpatialSceneNode**](WorldApi.md#updateSpatialSceneNode) | **PATCH** /v1/spatial/scenes/{id}/nodes/{nodeId} | Move a rack in one of your warehouse rooms (position in metres).
[**updateSpatialSceneSetting**](WorldApi.md#updateSpatialSceneSetting) | **PATCH** /v1/spatial/scenes/{id}/settings | How one of your rooms is laid out and lit: grouping and sort keys, theme, overlay and the arrival camera. Cosmetics and the shop layout have their own writers.
[**updateSpatialSceneShopLayout**](WorldApi.md#updateSpatialSceneShopLayout) | **PUT** /v1/spatial/scenes/{id}/shop/layout | Save your shop room&#39;s sections and displays (validated server-side; the response is the stored layout).
[**updateSpatialSceneWindow**](WorldApi.md#updateSpatialSceneWindow) | **PUT** /v1/spatial/scenes/{id}/window | Choose up to three of your live Crossly listings for the street window of your shop, in slot order. Picks that sell drop out and the newest fill in; an empty list goes back to newest first.
[**updateSpatialStreetDecor**](WorldApi.md#updateSpatialStreetDecor) | **PUT** /v1/spatial/streets/{slug}/decor | Dress a street you own with decor you hold (validated against your inventory).
[**updateSpatialStreetOwned**](WorldApi.md#updateSpatialStreetOwned) | **PATCH** /v1/spatial/streets/owned/{id} | Who may open a shop on a street you own (open, apply or invite).
[**updateWorldAutoShop**](WorldApi.md#updateWorldAutoShop) | **PATCH** /v1/world/auto-shop | Turn your automatic world shop off ({ enabled: false } -- an auto-created shop is made private, never deleted) or back on. Answers the new status.
[**updateWorldAvatarIdentity**](WorldApi.md#updateWorldAvatarIdentity) | **PUT** /v1/world/avatar/identity | Choose named or anonymous. Rooms you are already in keep the old answer until you rejoin.
[**updateWorldAvatarLook**](WorldApi.md#updateWorldAvatarLook) | **PUT** /v1/world/avatar/look | Save your world look to the account, so every device starts from it. look: null stays anonymous.
[**updateWorldAvatarNftBadge**](WorldApi.md#updateWorldAvatarNftBadge) | **PUT** /v1/world/avatar/nft-badge | Wear an NFT you hold on your nameplate (null to take it off). Checked again each time you join a room.
[**updateWorldCapabilityWear**](WorldApi.md#updateWorldCapabilityWear) | **PUT** /v1/world/capabilities/wear | Wear a held token on an avatar slot (refId from GET /v1/world/capabilities), or pass refId null to take it off. Its collection must declare a wear capability for that slot.
[**updateWorldCollectionCapability**](WorldApi.md#updateWorldCollectionCapability) | **PUT** /v1/world/collections/{chain}/{contract}/capabilities | Declare what the tokens of a collection can do (the whole declaration, spec crossly.nft-capabilities/1). As its creator (launched on Crossly or claimed) any kind; as a holder, cosmetic kinds only. Replaces your previous declaration; pending if it names an uploaded asset or an always-reviewed kind.
[**updateWorldConventionStatus**](WorldApi.md#updateWorldConventionStatus) | **PUT** /v1/world/conventions/{id}/status | Open, start, end or cancel a convention you host.
[**updateWorldCosmDesignChainAutoUnlock**](WorldApi.md#updateWorldCosmDesignChainAutoUnlock) | **PUT** /v1/world/cosm/designs/{id}/chain-auto-unlock | Opt one of your COSM designs in or out of the free chain unlock it earns when popular (on by default). Answers its popularity.
[**updateWorldEmoteWheel**](WorldApi.md#updateWorldEmoteWheel) | **PUT** /v1/world/emotes/wheel | Arrange your emote wheel: up to 8 slots, each an emote id, a moment slot or null. Returns the saved wheel (locked or unknown ids are dropped).
[**updateWorldFitValueShare**](WorldApi.md#updateWorldFitValueShare) | **PUT** /v1/world/fit-value/share | Whether people in a room can see what your outfit is worth.
[**updateWorldHome**](WorldApi.md#updateWorldHome) | **PATCH** /v1/world/home | Your home: privacy (open, friends, private), theme, and wall, floor and mood decor you hold.
[**updateWorldHomeBuilder**](WorldApi.md#updateWorldHomeBuilder) | **PUT** /v1/world/home/builders | Set the co-builders of your home: { userIds } -- friends (mutual follows) only, at most 4, replacing the list ([] clears it). They may rearrange your home in the world with your things and add free furniture, never your bought pieces. New co-builders get a world notice.
[**updateWorldHomeLayout**](WorldApi.md#updateWorldHomeLayout) | **PUT** /v1/world/home/layout | Arrange your home: the full layout (up to 200 pieces you own), validated server-side.
[**updateWorldHomeLayoutBySlug**](WorldApi.md#updateWorldHomeLayoutBySlug) | **PUT** /v1/world/homes/{slug}/layout | Rearrange a home you co-build (never adding the owner bought pieces).
[**updateWorldInteractiveDesignDraft**](WorldApi.md#updateWorldInteractiveDesignDraft) | **PUT** /v1/world/interactive/designs/{id}/draft | Save the draft MML source (up to 64 KB); the response carries its static check.
[**updateWorldListingHoldersOnly**](WorldApi.md#updateWorldListingHoldersOnly) | **PUT** /v1/world/listings/{id}/holders-only | Reserve one of your listings for holders of a collection you declared a holders_only perk for (or release it). Checkout refuses anybody else.
[**updateWorldOutfit**](WorldApi.md#updateWorldOutfit) | **PATCH** /v1/world/outfits/{id} | Rename a saved look: { name (1-32 chars) }. 404 when it is not yours.
[**updateWorldPetActive**](WorldApi.md#updateWorldPetActive) | **PUT** /v1/world/pets/active | Walk one of your pets with you in the world, or none (kind: null).
[**updateWorldQuestPin**](WorldApi.md#updateWorldQuestPin) | **PUT** /v1/world/quests/pin | Wear a pin you EARNED from a quest on your nameplate, or { pin: null } to wear none. 403 for a pin you have not earned. Shows from the next room you walk into.
[**updateWorldRoomHolderGate**](WorldApi.md#updateWorldRoomHolderGate) | **PUT** /v1/world/rooms/{id}/holder-gate | Make your room holders-only (its collection rooms follow). Send null to open it again. Returns &#x60;{ gate }&#x60;.
[**updateWorldSpace**](WorldApi.md#updateWorldSpace) | **PATCH** /v1/world/spaces/{slug} | As host, change a Space name, about or membership.
[**updateWorldSpaceHolderGate**](WorldApi.md#updateWorldSpaceHolderGate) | **PUT** /v1/world/spaces/{slug}/holder-gate | Make your Space holders-only: only holders of an NFT collection join it (others can look in). Send null to open it again. Returns &#x60;{ gate }&#x60;.
[**updateWorldStallBookingBooth**](WorldApi.md#updateWorldStallBookingBooth) | **PUT** /v1/world/stalls/bookings/{id}/booth | Dress the booth of a stall you booked (decor you hold).


<a name="createSpatialInviteAccept"></a>
# **createSpatialInviteAccept**
> CreateSpatialInviteAcceptResponse createSpatialInviteAccept()

Redeem an invite code (dashes optional); returns the room it opens.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateSpatialInviteAcceptResponse = apiInstance.createSpatialInviteAccept()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialInviteAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialInviteAccept")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSpatialInviteAcceptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialPropertyLeaseWithdraw"></a>
# **createSpatialPropertyLeaseWithdraw**
> DeleteDaoProposalResponse createSpatialPropertyLeaseWithdraw(id)

Withdraw a lease offer nobody has accepted yet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteDaoProposalResponse = apiInstance.createSpatialPropertyLeaseWithdraw(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialPropertyLeaseWithdraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialPropertyLeaseWithdraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteDaoProposalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialScene"></a>
# **createSpatialScene**
> SpatialSceneResponse2 createSpatialScene(createSpatialSceneRequest)

Start a 3D room: a collection (your items on shelves) or a warehouse (racks you arrange). Private until you make it public.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val createSpatialSceneRequest : CreateSpatialSceneRequest =  // CreateSpatialSceneRequest | 
try {
    val result : SpatialSceneResponse2 = apiInstance.createSpatialScene(createSpatialSceneRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialScene")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialScene")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSpatialSceneRequest** | **CreateSpatialSceneRequest**|  |

### Return type

**SpatialSceneResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSpatialSceneGrant"></a>
# **createSpatialSceneGrant**
> CreateSpatialSceneGrantResponse createSpatialSceneGrant(id)

Let a specific user into one of your rooms (visitor or staff), no code needed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateSpatialSceneGrantResponse = apiInstance.createSpatialSceneGrant(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialSceneGrant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialSceneGrant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialSceneInvite"></a>
# **createSpatialSceneInvite**
> CreateSpatialSceneInviteResponse createSpatialSceneInvite(id)

Mint an invite code to one of your rooms (visitor or staff, optional expiry in hours). The code is in this response only: just its hash is stored.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateSpatialSceneInviteResponse = apiInstance.createSpatialSceneInvite(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialSceneInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialSceneInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateSpatialSceneInviteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialSceneNode"></a>
# **createSpatialSceneNode**
> CreateSpatialSceneNodeResponse createSpatialSceneNode(id)

Add a unit (rack, shelf, bin) to one of your warehouse rooms.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateSpatialSceneNodeResponse = apiInstance.createSpatialSceneNode(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialSceneNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialSceneNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateSpatialSceneNodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialScenePlace"></a>
# **createSpatialScenePlace**
> SpatialSceneResponse createSpatialScenePlace(id)

Pin an inventory item to a slot in one of your rooms: by warehouse nodeId, or by a collection container key and index.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : SpatialSceneResponse = apiInstance.createSpatialScenePlace(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialScenePlace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialScenePlace")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**SpatialSceneResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialSceneRename"></a>
# **createSpatialSceneRename**
> SpatialSceneResponse2 createSpatialSceneRename(id, createSpatialSceneRenameRequest)

Rename one of your rooms.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
val createSpatialSceneRenameRequest : CreateSpatialSceneRenameRequest =  // CreateSpatialSceneRenameRequest | 
try {
    val result : SpatialSceneResponse2 = apiInstance.createSpatialSceneRename(id, createSpatialSceneRenameRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialSceneRename")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialSceneRename")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **createSpatialSceneRenameRequest** | **CreateSpatialSceneRenameRequest**|  |

### Return type

**SpatialSceneResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSpatialSceneShopPlace"></a>
# **createSpatialSceneShopPlace**
> SpatialSceneResponse createSpatialSceneShopPlace(id)

Place an inventory item in a section and display of your shop room.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : SpatialSceneResponse = apiInstance.createSpatialSceneShopPlace(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialSceneShopPlace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialSceneShopPlace")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**SpatialSceneResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialSceneUnpin"></a>
# **createSpatialSceneUnpin**
> DeleteSpatialSceneNodeResponse createSpatialSceneUnpin(id)

Clear every pin in one of your rooms, so it arranges itself again.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneNodeResponse = apiInstance.createSpatialSceneUnpin(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialSceneUnpin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialSceneUnpin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneNodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialSceneVisibility"></a>
# **createSpatialSceneVisibility**
> SpatialSceneResponse2 createSpatialSceneVisibility(id, createSpatialSceneVisibilityRequest)

Make one of your rooms private, unlisted (anyone with the link) or public (in the lobby and searchable).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
val createSpatialSceneVisibilityRequest : CreateSpatialSceneVisibilityRequest =  // CreateSpatialSceneVisibilityRequest | 
try {
    val result : SpatialSceneResponse2 = apiInstance.createSpatialSceneVisibility(id, createSpatialSceneVisibilityRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialSceneVisibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialSceneVisibility")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **createSpatialSceneVisibilityRequest** | **CreateSpatialSceneVisibilityRequest**|  |

### Return type

**SpatialSceneResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSpatialSceneWarehouseStock"></a>
# **createSpatialSceneWarehouseStock**
> SpatialSceneResponse createSpatialSceneWarehouseStock(id)

Put an inventory item (or unit) on a rack in one of your warehouse rooms.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : SpatialSceneResponse = apiInstance.createSpatialSceneWarehouseStock(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialSceneWarehouseStock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialSceneWarehouseStock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**SpatialSceneResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialShopNeighbourhood"></a>
# **createSpatialShopNeighbourhood**
> CreateSpatialShopNeighbourhoodResponse createSpatialShopNeighbourhood()

Move your shop to another neighbourhood (by slug).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateSpatialShopNeighbourhoodResponse = apiInstance.createSpatialShopNeighbourhood()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialShopNeighbourhood")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialShopNeighbourhood")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateSpatialShopNeighbourhoodResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialStreetApply"></a>
# **createSpatialStreetApply**
> CreateSpatialStreetApplyResponse createSpatialStreetApply(slug)

Ask to open your shop on a street whose owner reviews applications.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateSpatialStreetApplyResponse = apiInstance.createSpatialStreetApply(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialStreetApply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialStreetApply")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateSpatialStreetApplyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpatialStreetInvite"></a>
# **createSpatialStreetInvite**
> CreateSpatialStreetApplyResponse createSpatialStreetInvite(slug)

Invite a shop (by its slug) to open on a street you own.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateSpatialStreetApplyResponse = apiInstance.createSpatialStreetInvite(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createSpatialStreetInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createSpatialStreetInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateSpatialStreetApplyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldAvatarEquip"></a>
# **createWorldAvatarEquip**
> CreateWorldAvatarEquipResponse createWorldAvatarEquip(createWorldAvatarEquipRequest)

Wear something you already own -- exactly ONE of { cosmeticId } (a cosmetic you hold), { receiptId } (a Crossly purchase from your closet) or { inventoryItemId } (your own stock). The slot comes from the thing itself; slot is only a fallback for an item with no catalog shape. Replaces whatever was in that slot. Moves no money. Answers the slot and your loadout after the change.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val createWorldAvatarEquipRequest : CreateWorldAvatarEquipRequest =  // CreateWorldAvatarEquipRequest | 
try {
    val result : CreateWorldAvatarEquipResponse = apiInstance.createWorldAvatarEquip(createWorldAvatarEquipRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldAvatarEquip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldAvatarEquip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorldAvatarEquipRequest** | **CreateWorldAvatarEquipRequest**|  |

### Return type

**CreateWorldAvatarEquipResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorldAvatarUnequip"></a>
# **createWorldAvatarUnequip**
> CreateWorldAvatarUnequipResponse createWorldAvatarUnequip(createWorldAvatarUnequipRequest)

Take off whatever is in one slot. Idempotent: an empty slot answers removed:false. Answers your loadout after the change.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val createWorldAvatarUnequipRequest : CreateWorldAvatarUnequipRequest =  // CreateWorldAvatarUnequipRequest | 
try {
    val result : CreateWorldAvatarUnequipResponse = apiInstance.createWorldAvatarUnequip(createWorldAvatarUnequipRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldAvatarUnequip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldAvatarUnequip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorldAvatarUnequipRequest** | **CreateWorldAvatarUnequipRequest**|  |

### Return type

**CreateWorldAvatarUnequipResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorldAvatarWearable"></a>
# **createWorldAvatarWearable**
> CreateWorldAvatarWearableResponse createWorldAvatarWearable()

Author a wearable for a body slot (a mesh profile and params, an asking price in COSM base units as a string). A submission: inactive until an operator approves it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldAvatarWearableResponse = apiInstance.createWorldAvatarWearable()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldAvatarWearable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldAvatarWearable")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldAvatarWearableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldContest"></a>
# **createWorldContest**
> CreateWorldContestResponse createWorldContest()

Set up a skill contest on a game placed in your place: title, game (its instance id), entry { mode, feeCents? }, prizes by place, funder, window, attempts. Paid entry needs the operator to allow it where it runs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldContestResponse = apiInstance.createWorldContest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldContest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldContest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldContestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldContestEntrySettlePayment"></a>
# **createWorldContestEntrySettlePayment**
> CreateWorldContestEntrySettlePaymentResponse createWorldContestEntrySettlePayment(id)

Read the fee of a paid entry back from Stripe and settle it (safe to repeat).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldContestEntrySettlePaymentResponse = apiInstance.createWorldContestEntrySettlePayment(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldContestEntrySettlePayment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldContestEntrySettlePayment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldContestEntrySettlePaymentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldContestJoin"></a>
# **createWorldContestJoin**
> CreateWorldContestJoinResponse createWorldContestJoin(id)

Enter a contest. Free and sponsored contests take you in at once; a paid one answers a client secret to pay the entry fee.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldContestJoinResponse = apiInstance.createWorldContestJoin(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldContestJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldContestJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldContestJoinResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldConvention"></a>
# **createWorldConvention**
> CreateWorldConventionResponse createWorldConvention()

Host a convention in one of your rooms: title, dates, tables and how sellers get one (invite, free, a fee in cents, or a revenue share in basis points).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldConventionResponse = apiInstance.createWorldConvention()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldConvention")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldConvention")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldConventionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldConventionAccept"></a>
# **createWorldConventionAccept**
> CreateWorldConventionAcceptResponse createWorldConventionAccept(id)

Accept: your own invitation (no body), or, as host, an application (username).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldConventionAcceptResponse = apiInstance.createWorldConventionAccept(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldConventionAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldConventionAccept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldConventionAcceptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldConventionApply"></a>
# **createWorldConventionApply**
> CreateWorldConventionApplyResponse createWorldConventionApply(id)

Ask for a table at a convention.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldConventionApplyResponse = apiInstance.createWorldConventionApply(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldConventionApply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldConventionApply")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldConventionApplyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldConventionInvite"></a>
# **createWorldConventionInvite**
> CreateWorldSpaceInviteResponse createWorldConventionInvite(id)

Invite a seller (by shop handle) to a convention you host.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldSpaceInviteResponse = apiInstance.createWorldConventionInvite(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldConventionInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldConventionInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldSpaceInviteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldConventionPaid"></a>
# **createWorldConventionPaid**
> CreateBreakCancelResponse createWorldConventionPaid(id)

As host, record that a seller (username) paid their table fee off-platform. Moves no money.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBreakCancelResponse = apiInstance.createWorldConventionPaid(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldConventionPaid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldConventionPaid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBreakCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldConventionWithdraw"></a>
# **createWorldConventionWithdraw**
> CreateBreakCancelResponse createWorldConventionWithdraw(id)

Withdraw your table or decline your invitation; as host, decline someone (username).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBreakCancelResponse = apiInstance.createWorldConventionWithdraw(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldConventionWithdraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldConventionWithdraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBreakCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldCrew"></a>
# **createWorldCrew**
> CreateWorldCrewResponse createWorldCrew(createWorldCrewRequest)

Start a crew you own: { name (2-32 chars), tag (2-5 letters or digits, shown on members&#39; nameplates) }. Answers its id and join code. 409 when you are already in a crew.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val createWorldCrewRequest : CreateWorldCrewRequest =  // CreateWorldCrewRequest | 
try {
    val result : CreateWorldCrewResponse = apiInstance.createWorldCrew(createWorldCrewRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldCrew")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldCrew")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorldCrewRequest** | **CreateWorldCrewRequest**|  |

### Return type

**CreateWorldCrewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorldCrewChat"></a>
# **createWorldCrewChat**
> WorldResponse createWorldCrewChat(createWorldCrewChatRequest)

Say a line to your crew (body: text, up to 400 characters). Returns data.messages, the crew chat ring (the last 50 lines, kept in memory only), and data.said when your line went out; a blocked or too-quick line is dropped silently. 404 when you are in no crew.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val createWorldCrewChatRequest : CreateWorldCrewChatRequest =  // CreateWorldCrewChatRequest | 
try {
    val result : WorldResponse = apiInstance.createWorldCrewChat(createWorldCrewChatRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldCrewChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldCrewChat")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorldCrewChatRequest** | **CreateWorldCrewChatRequest**|  |

### Return type

**WorldResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorldCrewJoin"></a>
# **createWorldCrewJoin**
> CreateWorldCrewJoinResponse createWorldCrewJoin(createWorldCrewJoinRequest)

Join a crew by the code a member gave you. 404 for an unknown code, 409 when you are already in a crew or it is full (30).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val createWorldCrewJoinRequest : CreateWorldCrewJoinRequest =  // CreateWorldCrewJoinRequest | 
try {
    val result : CreateWorldCrewJoinResponse = apiInstance.createWorldCrewJoin(createWorldCrewJoinRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldCrewJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldCrewJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorldCrewJoinRequest** | **CreateWorldCrewJoinRequest**|  |

### Return type

**CreateWorldCrewJoinResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorldCrewLeave"></a>
# **createWorldCrewLeave**
> CreateWorldCrewLeaveResponse createWorldCrewLeave()

Leave your crew. If you own it, the crew is disbanded. Idempotent: leaving when in none succeeds.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldCrewLeaveResponse = apiInstance.createWorldCrewLeave()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldCrewLeave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldCrewLeave")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldCrewLeaveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldDecorDesign"></a>
# **createWorldDecorDesign**
> CreateWorldDecorDesignResponse createWorldDecorDesign()

Author a decor design (what it unlocks, a mesh profile and params, an asking price in COSM base units as a string). Inactive until an operator approves it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldDecorDesignResponse = apiInstance.createWorldDecorDesign()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldDecorDesign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldDecorDesign")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldDecorDesignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldDecorDesignSubmit"></a>
# **createWorldDecorDesignSubmit**
> CreateWorldDecorDesignSubmitResponse createWorldDecorDesignSubmit(id)

Send one of your decor designs to the review queue.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldDecorDesignSubmitResponse = apiInstance.createWorldDecorDesignSubmit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldDecorDesignSubmit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldDecorDesignSubmit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldDecorDesignSubmitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldDecorRetract"></a>
# **createWorldDecorRetract**
> CreateWorldDecorRetractResponse createWorldDecorRetract()

Take a placed decor piece back into your inventory; answers the inventory after.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldDecorRetractResponse = apiInstance.createWorldDecorRetract()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldDecorRetract")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldDecorRetract")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldDecorRetractResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldDm"></a>
# **createWorldDm**
> CreateWorldDmResponse createWorldDm(userId, createWorldCrewChatRequest)

Send a direct message to a friend (a mutual follow; never across a block), up to 400 characters, through the world chat guard. 403 when they are not a friend, 429 when sent too quickly.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val createWorldCrewChatRequest : CreateWorldCrewChatRequest =  // CreateWorldCrewChatRequest | 
try {
    val result : CreateWorldDmResponse = apiInstance.createWorldDm(userId, createWorldCrewChatRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldDm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldDm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**|  |
 **createWorldCrewChatRequest** | **CreateWorldCrewChatRequest**|  |

### Return type

**CreateWorldDmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorldFollow"></a>
# **createWorldFollow**
> CreateWorldFollowResponse createWorldFollow(userId)

Follow somebody. When they follow you back you are friends (friends-here, invites, messages). Idempotent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : CreateWorldFollowResponse = apiInstance.createWorldFollow(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldFollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldFollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**|  |

### Return type

**CreateWorldFollowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldFriendInvite"></a>
# **createWorldFriendInvite**
> CreateWorldFriendInviteResponse createWorldFriendInvite(userId, createWorldFriendInviteRequest)

\&quot;Join me\&quot;: send one friend (a mutual follow) a notification with a link to the PUBLIC room you name by slug. 404 when they are not a friend or the room is not public; 429 when you invited them in the last minute.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createWorldFriendInviteRequest : CreateWorldFriendInviteRequest =  // CreateWorldFriendInviteRequest | 
try {
    val result : CreateWorldFriendInviteResponse = apiInstance.createWorldFriendInvite(userId, createWorldFriendInviteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldFriendInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldFriendInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **java.util.UUID**|  |
 **createWorldFriendInviteRequest** | **CreateWorldFriendInviteRequest**|  |

### Return type

**CreateWorldFriendInviteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorldGamePackage"></a>
# **createWorldGamePackage**
> CreateWorldGamePackageResponse createWorldGamePackage()

Submit a game package version for review: files as { path, base64 } (game.json, thumb.png, logic/, scene/, audio/, images/). Checked like the CLI, assets quarantined, the entry document dry-run, then reviewed by a person.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldGamePackageResponse = apiInstance.createWorldGamePackage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldGamePackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldGamePackage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldGamePackageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldGamePackageCheck"></a>
# **createWorldGamePackageCheck**
> CreateWorldGamePackageCheckResponse createWorldGamePackageCheck()

Validate a game package exactly as a submission is checked (the shared intake report, your version still free) without storing, uploading or queuing anything: world-kit validate for an agent. Same files body as submit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldGamePackageCheckResponse = apiInstance.createWorldGamePackageCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldGamePackageCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldGamePackageCheck")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldGamePackageCheckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldGameRating"></a>
# **createWorldGameRating**
> CreateWorldGameRatingResponse createWorldGameRating(id)

Rate a game you played, 1 to 5 stars (rating again replaces it). Only players the runner recorded in that game can rate it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldGameRatingResponse = apiInstance.createWorldGameRating(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldGameRating")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldGameRating")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldGameRatingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldGameReport"></a>
# **createWorldGameReport**
> CreateWorldGameReportResponse createWorldGameReport(id)

Report a game: reason broken | unfair | offensive | scam | other, optional detail. Staff review it; the creator is told the reason, never who.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldGameReportResponse = apiInstance.createWorldGameReport(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldGameReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldGameReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldGameReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldGameStoreCheckout"></a>
# **createWorldGameStoreCheckout**
> CreateWorldGameStoreCheckoutResponse createWorldGameStoreCheckout(id, item)

Buy an item or pass from a game store: answers a client secret for the payment; the item is yours once it succeeds.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
val item : kotlin.String = item_example // kotlin.String | 
try {
    val result : CreateWorldGameStoreCheckoutResponse = apiInstance.createWorldGameStoreCheckout(id, item)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldGameStoreCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldGameStoreCheckout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **item** | **kotlin.String**|  |

### Return type

**CreateWorldGameStoreCheckoutResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldGrailMatch"></a>
# **createWorldGrailMatch**
> CreateWorldGrailMatchResponse createWorldGrailMatch()

Grail glints: send the ids on show somewhere (listingIds -- listings.id, inventoryIds, skuIds -- catalogue market SKUs; up to 400 each) and get back data.listingIds / data.inventoryIds / data.skuIds: the ones that are things you already want -- an open bid, a watched or wishlisted listing (or one selling the same SKU), a market watch, or a card your deck is missing. Read-only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldGrailMatchResponse = apiInstance.createWorldGrailMatch()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldGrailMatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldGrailMatch")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldGrailMatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldHallLoan"></a>
# **createWorldHallLoan**
> CreateWorldHallLoanResponse createWorldHallLoan()

Lend a piece from your vault to this week&#39;s Hall of Grails exhibition: { vaultItemId, credit: &#39;name&#39; | &#39;anonymous&#39; }. It shows under your plaque until the exhibition ends; it stays in your vault (still listable and withdrawable), and stops showing if it leaves.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldHallLoanResponse = apiInstance.createWorldHallLoan()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldHallLoan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldHallLoan")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldHallLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldHomeAsk"></a>
# **createWorldHomeAsk**
> CreateWorldHomeAskResponse createWorldHomeAsk(slug)

Ask a home owner whether they would sell a piece you saw there (an item or a decor piece).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateWorldHomeAskResponse = apiInstance.createWorldHomeAsk(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldHomeAsk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldHomeAsk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateWorldHomeAskResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldHomeGuestbook"></a>
# **createWorldHomeGuestbook**
> CreateWorldHomeGuestbookResponse createWorldHomeGuestbook(slug)

Sign a home guestbook (one short line).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateWorldHomeGuestbookResponse = apiInstance.createWorldHomeGuestbook(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldHomeGuestbook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldHomeGuestbook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateWorldHomeGuestbookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldHomeGuestbookReport"></a>
# **createWorldHomeGuestbookReport**
> CreateWorldGameReportResponse createWorldHomeGuestbookReport(slug, id)

Report a guestbook entry to moderation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldGameReportResponse = apiInstance.createWorldHomeGuestbookReport(slug, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldHomeGuestbookReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldHomeGuestbookReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldGameReportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldHuntStart"></a>
# **createWorldHuntStart**
> GetWorldHuntResponse createWorldHuntStart()

Start the Great Hunt this season by reading its first riddle (the Copper key&#39;s). Idempotent: starting again answers your progress unchanged. Answers the same shape as GET /v1/world/hunt. 409 when no season is running.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldHuntResponse = apiInstance.createWorldHuntStart()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldHuntStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldHuntStart")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldHuntResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldInteractiveAsset"></a>
# **createWorldInteractiveAsset**
> CreateWorldInteractiveAssetResponse createWorldInteractiveAsset()

Upload one asset for your designs: kind glb (4 MB), wav (4 MB) or png (1 MB), the file as base64. Answers its sha256 and the path to reference from MML.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldInteractiveAssetResponse = apiInstance.createWorldInteractiveAsset()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldInteractiveAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldInteractiveAsset")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldInteractiveAssetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldInteractiveDesign"></a>
# **createWorldInteractiveDesign**
> GetWorldInteractiveDesignResponse createWorldInteractiveDesign()

Create an interactive design: name, footprint (s, m, l or f), optional tint and description, an asking price in COSM base units (a string, six decimals) and optional max supply. Inactive until ops approve a submitted version.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldInteractiveDesignResponse = apiInstance.createWorldInteractiveDesign()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldInteractiveDesign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldInteractiveDesign")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldInteractiveDesignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldInteractiveDesignCheck"></a>
# **createWorldInteractiveDesignCheck**
> CreateWorldInteractiveDesignCheckResponse createWorldInteractiveDesignCheck(id)

Check the draft: static rules, that every referenced upload exists, and a sandboxed dry run. Budgeted per person.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldInteractiveDesignCheckResponse = apiInstance.createWorldInteractiveDesignCheck(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldInteractiveDesignCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldInteractiveDesignCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldInteractiveDesignCheckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldInteractiveDesignPreview"></a>
# **createWorldInteractiveDesignPreview**
> CreateWorldInteractiveDesignPreviewResponse createWorldInteractiveDesignPreview(id)

A private preview token for the draft (author only) and the socket path that runs it. Budgeted per person.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldInteractiveDesignPreviewResponse = apiInstance.createWorldInteractiveDesignPreview(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldInteractiveDesignPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldInteractiveDesignPreview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldInteractiveDesignPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldInteractiveDesignSubmit"></a>
# **createWorldInteractiveDesignSubmit**
> CreateWorldInteractiveDesignSubmitResponse createWorldInteractiveDesignSubmit(id)

Freeze the draft as a new version and send it to ops review. Up to 10 a day.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldInteractiveDesignSubmitResponse = apiInstance.createWorldInteractiveDesignSubmit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldInteractiveDesignSubmit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldInteractiveDesignSubmit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldInteractiveDesignSubmitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldInteractiveReset"></a>
# **createWorldInteractiveReset**
> CreateWorldInteractiveResetResponse createWorldInteractiveReset()

Wipe the stored state of an interactive piece standing in a place you own (a home or your boutique).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldInteractiveResetResponse = apiInstance.createWorldInteractiveReset()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldInteractiveReset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldInteractiveReset")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldInteractiveResetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldJobAppraisalAnswer"></a>
# **createWorldJobAppraisalAnswer**
> CreateWorldJobAppraisalAnswerResponse createWorldJobAppraisalAnswer(id)

Answer a price check: your estimate of the item value in CENTS and an optional note. Moves no money; the asker may accept it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldJobAppraisalAnswerResponse = apiInstance.createWorldJobAppraisalAnswer(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldJobAppraisalAnswer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldJobAppraisalAnswer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldJobAppraisalAnswerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldJobShiftClaim"></a>
# **createWorldJobShiftClaim**
> CreateWorldJobShiftClaimResponse createWorldJobShiftClaim(id)

Claim an open shift. You work it by being in the place while it runs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldJobShiftClaimResponse = apiInstance.createWorldJobShiftClaim(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldJobShiftClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldJobShiftClaim")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldJobShiftClaimResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldJobShiftRelease"></a>
# **createWorldJobShiftRelease**
> CreateWorldJobShiftReleaseResponse createWorldJobShiftRelease(id)

Give a shift you claimed back to the board.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldJobShiftReleaseResponse = apiInstance.createWorldJobShiftRelease(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldJobShiftRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldJobShiftRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldJobShiftReleaseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldOutfit"></a>
# **createWorldOutfit**
> CreateWorldOutfitResponse createWorldOutfit(createWorldOutfitRequest)

Save what you are wearing now as a named look: { name (1-32 chars), appearance? (skin, hair, hairColour, eyes, build -- unknown keys fall back to the default) }. Each worn thing is recorded as the door it goes back on by; one that no longer traces to something you own is listed in skipped and not saved. 409 when you already keep 6.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val createWorldOutfitRequest : CreateWorldOutfitRequest =  // CreateWorldOutfitRequest | 
try {
    val result : CreateWorldOutfitResponse = apiInstance.createWorldOutfit(createWorldOutfitRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldOutfit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldOutfit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorldOutfitRequest** | **CreateWorldOutfitRequest**|  |

### Return type

**CreateWorldOutfitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorldOutfitApply"></a>
# **createWorldOutfitApply**
> CreateWorldOutfitApplyResponse createWorldOutfitApply(id)

Put a saved look on. Every item goes through the same equip as POST /v1/world/avatar/equip, so ownership still holds: something you no longer own is listed in skipped with the reason and not worn. Slots the look left empty are emptied (cleared). Answers the appearance of the look (for your character -- appearance lives on your device), applied, skipped and cleared. Moves no money.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateWorldOutfitApplyResponse = apiInstance.createWorldOutfitApply(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldOutfitApply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldOutfitApply")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateWorldOutfitApplyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldParty"></a>
# **createWorldParty**
> CreateBreakResponse createWorldParty()

Start a party with you as leader (up to 8 members).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateBreakResponse = apiInstance.createWorldParty()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldParty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldParty")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBreakResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPartyChat"></a>
# **createWorldPartyChat**
> WorldResponse createWorldPartyChat(id)

Say something in your party chat (up to 2000 characters).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : WorldResponse = apiInstance.createWorldPartyChat(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldPartyChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldPartyChat")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**WorldResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPartyInvite"></a>
# **createWorldPartyInvite**
> CreateWorldPartyInviteResponse createWorldPartyInvite(id)

Invite a friend (userId) to your party.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldPartyInviteResponse = apiInstance.createWorldPartyInvite(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldPartyInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldPartyInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldPartyInviteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPartyInviteAccept"></a>
# **createWorldPartyInviteAccept**
> CreateWorldPartyInviteAcceptResponse createWorldPartyInviteAccept(inviteId)

Accept a party invite.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val inviteId : kotlin.String = inviteId_example // kotlin.String | 
try {
    val result : CreateWorldPartyInviteAcceptResponse = apiInstance.createWorldPartyInviteAccept(inviteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldPartyInviteAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldPartyInviteAccept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **kotlin.String**|  |

### Return type

**CreateWorldPartyInviteAcceptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPartyInviteDecline"></a>
# **createWorldPartyInviteDecline**
> CreateWorldPartyInviteAcceptResponse createWorldPartyInviteDecline(inviteId)

Decline a party invite.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val inviteId : kotlin.String = inviteId_example // kotlin.String | 
try {
    val result : CreateWorldPartyInviteAcceptResponse = apiInstance.createWorldPartyInviteDecline(inviteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldPartyInviteDecline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldPartyInviteDecline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **kotlin.String**|  |

### Return type

**CreateWorldPartyInviteAcceptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPartyKick"></a>
# **createWorldPartyKick**
> CreateWorldPartyKickResponse createWorldPartyKick(id)

As leader, remove a member (userId).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldPartyKickResponse = apiInstance.createWorldPartyKick(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldPartyKick")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldPartyKick")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldPartyKickResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPartyLeader"></a>
# **createWorldPartyLeader**
> CreateWorldPartyLeaderResponse createWorldPartyLeader(id)

As leader, pass the lead to a member (userId).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldPartyLeaderResponse = apiInstance.createWorldPartyLeader(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldPartyLeader")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldPartyLeader")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldPartyLeaderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPartyLeave"></a>
# **createWorldPartyLeave**
> CreateWorldPartyLeaveResponse createWorldPartyLeave(id)

Leave your party (the lead passes on if you led it).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldPartyLeaveResponse = apiInstance.createWorldPartyLeave(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldPartyLeave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldPartyLeave")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldPartyLeaveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPartyWishlist"></a>
# **createWorldPartyWishlist**
> CreateWorldPartyWishlistResponse createWorldPartyWishlist(id)

Add a listing (listingId, or its shop slug) to the party wishlist; answers the wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldPartyWishlistResponse = apiInstance.createWorldPartyWishlist(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldPartyWishlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldPartyWishlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldPartyWishlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPartyWishlistVote"></a>
# **createWorldPartyWishlistVote**
> CreateWorldPartyWishlistResponse createWorldPartyWishlistVote(id, listingId)

Thumb a wishlist listing up or down (null clears your vote); answers the wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
val listingId : kotlin.String = listingId_example // kotlin.String | 
try {
    val result : CreateWorldPartyWishlistResponse = apiInstance.createWorldPartyWishlistVote(id, listingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldPartyWishlistVote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldPartyWishlistVote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **listingId** | **kotlin.String**|  |

### Return type

**CreateWorldPartyWishlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPlaceItemWant"></a>
# **createWorldPlaceItemWant**
> CreateWorldPlaceItemWantResponse createWorldPlaceItemWant(slug, itemId)

Tell a room owner you would buy one of their items (once per person per item; they see the count). Moves no money.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val itemId : kotlin.String = itemId_example // kotlin.String | 
try {
    val result : CreateWorldPlaceItemWantResponse = apiInstance.createWorldPlaceItemWant(slug, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldPlaceItemWant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldPlaceItemWant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **itemId** | **kotlin.String**|  |

### Return type

**CreateWorldPlaceItemWantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldSpace"></a>
# **createWorldSpace**
> CreateWorldSpaceResponse createWorldSpace()

Open a Space (sellers only, at most two): slug, name, venue, optional membership and about.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : CreateWorldSpaceResponse = apiInstance.createWorldSpace()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldSpace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldSpace")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWorldSpaceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldSpaceEvent"></a>
# **createWorldSpaceEvent**
> CreateWorldSpaceEventResponse createWorldSpaceEvent(slug)

As host or co-host, put an event on: title, kind, optional about, ISO start and end with offset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateWorldSpaceEventResponse = apiInstance.createWorldSpaceEvent(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldSpaceEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldSpaceEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateWorldSpaceEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldSpaceEventRsvp"></a>
# **createWorldSpaceEventRsvp**
> CreateWorldSpaceEventRsvpResponse createWorldSpaceEventRsvp(slug, id)

Say whether you are going to an event.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateWorldSpaceEventRsvpResponse = apiInstance.createWorldSpaceEventRsvp(slug, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldSpaceEventRsvp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldSpaceEventRsvp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**CreateWorldSpaceEventRsvpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldSpaceInvite"></a>
# **createWorldSpaceInvite**
> CreateWorldSpaceInviteResponse createWorldSpaceInvite(slug)

Invite somebody (userId) to a Space.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateWorldSpaceInviteResponse = apiInstance.createWorldSpaceInvite(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldSpaceInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldSpaceInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateWorldSpaceInviteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldSpaceJoin"></a>
# **createWorldSpaceJoin**
> CreateWorldSpaceJoinResponse createWorldSpaceJoin(slug)

Join a Space, or ask to when it is request-only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateWorldSpaceJoinResponse = apiInstance.createWorldSpaceJoin(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldSpaceJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldSpaceJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateWorldSpaceJoinResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldSpaceLeave"></a>
# **createWorldSpaceLeave**
> CreateWorldCrewLeaveResponse createWorldSpaceLeave(slug)

Leave a Space.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateWorldCrewLeaveResponse = apiInstance.createWorldSpaceLeave(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldSpaceLeave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldSpaceLeave")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateWorldCrewLeaveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldSpaceRequestByUserId"></a>
# **createWorldSpaceRequestByUserId**
> CreateWorldSpaceRequestByUserIdResponse createWorldSpaceRequestByUserId(slug, userId)

As host or co-host, accept or turn down a request to join.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : CreateWorldSpaceRequestByUserIdResponse = apiInstance.createWorldSpaceRequestByUserId(slug, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldSpaceRequestByUserId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldSpaceRequestByUserId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **userId** | **kotlin.String**|  |

### Return type

**CreateWorldSpaceRequestByUserIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldSpaceRole"></a>
# **createWorldSpaceRole**
> CreateWorldSpaceRoleResponse createWorldSpaceRole(slug)

As host, make a member a co-host or back to a member.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : CreateWorldSpaceRoleResponse = apiInstance.createWorldSpaceRole(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#createWorldSpaceRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#createWorldSpaceRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**CreateWorldSpaceRoleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSpatialSceneGrant"></a>
# **deleteSpatialSceneGrant**
> DeleteSpatialSceneGrantResponse deleteSpatialSceneGrant(id, grantId)

Take somebody&#39;s access to your room away, or kill an invite nobody has used yet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
val grantId : kotlin.String = grantId_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneGrantResponse = apiInstance.deleteSpatialSceneGrant(id, grantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteSpatialSceneGrant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteSpatialSceneGrant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **grantId** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSpatialSceneNode"></a>
# **deleteSpatialSceneNode**
> DeleteSpatialSceneNodeResponse deleteSpatialSceneNode(id)

Remove units (by id, up to 500) from one of your warehouse rooms.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneNodeResponse = apiInstance.deleteSpatialSceneNode(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteSpatialSceneNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteSpatialSceneNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneNodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSpatialSceneWarehouseStock"></a>
# **deleteSpatialSceneWarehouseStock**
> DeleteSpatialSceneGrantResponse deleteSpatialSceneWarehouseStock(id)

Take an inventory item (or unit) off its rack.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneGrantResponse = apiInstance.deleteSpatialSceneWarehouseStock(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteSpatialSceneWarehouseStock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteSpatialSceneWarehouseStock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSpatialStreetRequest"></a>
# **deleteSpatialStreetRequest**
> DeleteDaoProposalResponse deleteSpatialStreetRequest(id)

Withdraw a street request you made that has not been founded yet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteDaoProposalResponse = apiInstance.deleteSpatialStreetRequest(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteSpatialStreetRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteSpatialStreetRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteDaoProposalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldBlock"></a>
# **deleteWorldBlock**
> DeleteWorldBlockResponse deleteWorldBlock(id)

Unblock somebody (by the block id from GET /v1/world/blocks).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteWorldBlockResponse = apiInstance.deleteWorldBlock(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldBlock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldBlock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteWorldBlockResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldCollectionCapability"></a>
# **deleteWorldCollectionCapability**
> deleteWorldCollectionCapability(chain, contract)

Withdraw your declaration for a collection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    apiInstance.deleteWorldCollectionCapability(chain, contract)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldCollectionCapability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldCollectionCapability")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldFollow"></a>
# **deleteWorldFollow**
> CreateWorldFollowResponse deleteWorldFollow(userId)

Unfollow somebody. Idempotent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : CreateWorldFollowResponse = apiInstance.deleteWorldFollow(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldFollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldFollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**|  |

### Return type

**CreateWorldFollowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldHallLoan"></a>
# **deleteWorldHallLoan**
> CreateBreakResponse deleteWorldHallLoan(id)

Take one of your loans off show in the Hall of Grails.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateBreakResponse = apiInstance.deleteWorldHallLoan(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldHallLoan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldHallLoan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateBreakResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldHomeGuestbook"></a>
# **deleteWorldHomeGuestbook**
> DeleteWorldHomeGuestbookResponse deleteWorldHomeGuestbook(slug, id)

As the home owner, hide a guestbook entry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteWorldHomeGuestbookResponse = apiInstance.deleteWorldHomeGuestbook(slug, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldHomeGuestbook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldHomeGuestbook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**DeleteWorldHomeGuestbookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldInteractiveDesign"></a>
# **deleteWorldInteractiveDesign**
> DeleteWorldInteractiveDesignResponse deleteWorldInteractiveDesign(id)

Delete a draft design, or archive a submitted one (off sale; owned copies keep working).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteWorldInteractiveDesignResponse = apiInstance.deleteWorldInteractiveDesign(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldInteractiveDesign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldInteractiveDesign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteWorldInteractiveDesignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldJobShift"></a>
# **deleteWorldJobShift**
> DeleteWorldJobShiftResponse deleteWorldJobShift(id)

Cancel a shift you posted that nobody has worked yet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteWorldJobShiftResponse = apiInstance.deleteWorldJobShift(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldJobShift")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldJobShift")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteWorldJobShiftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldOutfit"></a>
# **deleteWorldOutfit**
> DeleteWorldOutfitResponse deleteWorldOutfit(id)

Delete a saved look. 404 when it is not yours.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteWorldOutfitResponse = apiInstance.deleteWorldOutfit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldOutfit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldOutfit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**DeleteWorldOutfitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldPartyWishlist"></a>
# **deleteWorldPartyWishlist**
> CreateWorldPartyWishlistResponse deleteWorldPartyWishlist(id, listingId)

Take a listing you added off the party wishlist; answers the wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
val listingId : kotlin.String = listingId_example // kotlin.String | 
try {
    val result : CreateWorldPartyWishlistResponse = apiInstance.deleteWorldPartyWishlist(id, listingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldPartyWishlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldPartyWishlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **listingId** | **kotlin.String**|  |

### Return type

**CreateWorldPartyWishlistResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldPlaceBan"></a>
# **deleteWorldPlaceBan**
> DeleteWorldPlaceBanResponse deleteWorldPlaceBan(slug, userId)

Lift a ban from a place you own; they can walk in again right away.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : DeleteWorldPlaceBanResponse = apiInstance.deleteWorldPlaceBan(slug, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldPlaceBan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldPlaceBan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **userId** | **kotlin.String**|  |

### Return type

**DeleteWorldPlaceBanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldSpace"></a>
# **deleteWorldSpace**
> DeleteWorldSpaceResponse deleteWorldSpace(slug)

As host, close a Space.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : DeleteWorldSpaceResponse = apiInstance.deleteWorldSpace(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldSpace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldSpace")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**DeleteWorldSpaceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldSpaceEvent"></a>
# **deleteWorldSpaceEvent**
> DeleteWorldJobShiftResponse deleteWorldSpaceEvent(slug, id)

As host or co-host, cancel an event.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteWorldJobShiftResponse = apiInstance.deleteWorldSpaceEvent(slug, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#deleteWorldSpaceEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#deleteWorldSpaceEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

**DeleteWorldJobShiftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialSceneAttention"></a>
# **getSpatialSceneAttention**
> GetSpatialSceneAttentionResponse getSpatialSceneAttention(sceneId)

What visitors looked at in one of your rooms: viewers, looks, inspects and dwell per item over the last days (1-35, default 30).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val sceneId : kotlin.String = sceneId_example // kotlin.String | 
try {
    val result : GetSpatialSceneAttentionResponse = apiInstance.getSpatialSceneAttention(sceneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getSpatialSceneAttention")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getSpatialSceneAttention")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **kotlin.String**|  |

### Return type

**GetSpatialSceneAttentionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialSceneWindow"></a>
# **getSpatialSceneWindow**
> GetSpatialSceneWindowResponse getSpatialSceneWindow(id)

The listings you chose for the street window of your shop, in slot order (left, middle, right; empty &#x3D; newest first), and &#x60;choices&#x60;: your listings that can go in it, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetSpatialSceneWindowResponse = apiInstance.getSpatialSceneWindow(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getSpatialSceneWindow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getSpatialSceneWindow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetSpatialSceneWindowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialShopNeighbourhood"></a>
# **getSpatialShopNeighbourhood**
> GetSpatialShopNeighbourhoodResponse getSpatialShopNeighbourhood()

Your shop&#39;s neighbourhood, and whether and where it may move.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetSpatialShopNeighbourhoodResponse = apiInstance.getSpatialShopNeighbourhood()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getSpatialShopNeighbourhood")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getSpatialShopNeighbourhood")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSpatialShopNeighbourhoodResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialSpace"></a>
# **getSpatialSpace**
> GetSpatialSpaceResponse getSpatialSpace()

The room catalogue: every space profile (what it holds, how it is sorted, its containers) and the warehouse units.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetSpatialSpaceResponse = apiInstance.getSpatialSpace()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getSpatialSpace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getSpatialSpace")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSpatialSpaceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialStreetAdmission"></a>
# **getSpatialStreetAdmission**
> GetSpatialStreetAdmissionResponse getSpatialStreetAdmission()

Street applications and invitations: yours, and those waiting on streets you own.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetSpatialStreetAdmissionResponse = apiInstance.getSpatialStreetAdmission()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getSpatialStreetAdmission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getSpatialStreetAdmission")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetSpatialStreetAdmissionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpatialStreetDecor"></a>
# **getSpatialStreetDecor**
> GetSpatialStreetDecorResponse getSpatialStreetDecor(slug)

The decor on a street you may dress, and what you can place.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetSpatialStreetDecorResponse = apiInstance.getSpatialStreetDecor(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getSpatialStreetDecor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getSpatialStreetDecor")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetSpatialStreetDecorResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldArcade"></a>
# **getWorldArcade**
> GetWorldArcadeResponse getWorldArcade()

The Arcade in Crossly World: data.cabinets (slot, where it stands, host -- piece, price_guess or empty --, game, title, blurb, the piece it hosts and where, record, packageId and thumbnail for a creator game from the Game Directory, players) and data.scores (the High Score wall: per game a title, kind -- leaderboard, record or top -- and up to five ASCII lines; a name shows only for somebody who chose to be seen by name, everyone else is \&quot;A player\&quot;), plus creatorGames (creator games with a cabinet now). Games are played in the world.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldArcadeResponse = apiInstance.getWorldArcade()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldArcade")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldArcade")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldArcadeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldAurora"></a>
# **getWorldAurora**
> GetWorldAuroraResponse getWorldAurora()

The Sales Aurora over the Commons in Crossly World: every real sale on Crossly in the last data.windowDays (30) days. data.total (sales in the window), data.families (key, label, colour, count per colour family: cards, coins, jewellery, electronics, media, fashion, toys, other) and data.sales (newest first, at most 48: family, ageHours, fresh -- sold in the last ten minutes, which shimmers). Aggregate only: no item, price, seller or platform. data.updatedAt is when it was read.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldAuroraResponse = apiInstance.getWorldAurora()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldAurora")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldAurora")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldAuroraResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldAutoShop"></a>
# **getWorldAutoShop**
> GetWorldAutoShopResponse getWorldAutoShop()

Whether Crossly keeps a world shop for you automatically: enabled, and the shop (id, name, visibility, autoCreated, address, label) or null. Change it with PATCH /v1/world/auto-shop.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldAutoShopResponse = apiInstance.getWorldAutoShop()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldAutoShop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldAutoShop")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldAutoShopResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldAvatarIdentity"></a>
# **getWorldAvatarIdentity**
> GetWorldAvatarIdentityResponse getWorldAvatarIdentity()

Whether others see your name in the world (named), or not (anonymous); null if you have never chosen.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldAvatarIdentityResponse = apiInstance.getWorldAvatarIdentity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldAvatarIdentity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldAvatarIdentity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldAvatarIdentityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldAvatarLoadout"></a>
# **getWorldAvatarLoadout**
> GetWorldAvatarLoadoutResponse getWorldAvatarLoadout()

What you are wearing: the rig, its slots (avatar_head, avatar_body, avatar_outer -- a jacket over the top, avatar_legs, avatar_feet, avatar_back) and each worn entry -- a cosmetic or a real item -- with its verified-purchase mark. Carries no price, receipt id, seller or order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldAvatarLoadoutResponse = apiInstance.getWorldAvatarLoadout()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldAvatarLoadout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldAvatarLoadout")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldAvatarLoadoutResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldAvatarLoadoutByUserId"></a>
# **getWorldAvatarLoadoutByUserId**
> GetWorldAvatarLoadoutResponse getWorldAvatarLoadoutByUserId(userId)

What somebody else is wearing, with the verified-purchase mark on each real item -- public on purpose, since a check only its owner can see is not a check. No price, receipt id, seller or order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetWorldAvatarLoadoutResponse = apiInstance.getWorldAvatarLoadoutByUserId(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldAvatarLoadoutByUserId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldAvatarLoadoutByUserId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **java.util.UUID**|  |

### Return type

**GetWorldAvatarLoadoutResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldAvatarLook"></a>
# **getWorldAvatarLook**
> GetWorldAvatarLookResponse getWorldAvatarLook()

Your world look on the account: the handle you chose (null if anonymous) and your appearance; null if you never made one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldAvatarLookResponse = apiInstance.getWorldAvatarLook()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldAvatarLook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldAvatarLook")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldAvatarLookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldAvatarNftBadge"></a>
# **getWorldAvatarNftBadge**
> GetWorldAvatarNftBadgeResponse getWorldAvatarNftBadge()

The NFT you wear on your nameplate in the world, or null.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldAvatarNftBadgeResponse = apiInstance.getWorldAvatarNftBadge()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldAvatarNftBadge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldAvatarNftBadge")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldAvatarNftBadgeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldCapability"></a>
# **getWorldCapability**
> GetWorldCapabilityResponse getWorldCapability()

What your held NFTs unlock in Crossly World: each token with the capabilities its collection declared (wear, display, emote, gate, ...). Holding is your verified wallets (their synced tokens); the capabilities of a transferred token go within five minutes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldCapabilityResponse = apiInstance.getWorldCapability()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldCapability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldCapability")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldCapabilityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldCapabilityCatalogue"></a>
# **getWorldCapabilityCatalogue**
> GetWorldCapabilityCatalogueResponse getWorldCapabilityCatalogue()

The capability kinds of spec crossly.nft-capabilities/1: what each does, whether only the creator of the collection may declare it, whether it needs review, and which clients honour it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldCapabilityCatalogueResponse = apiInstance.getWorldCapabilityCatalogue()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldCapabilityCatalogue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldCapabilityCatalogue")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldCapabilityCatalogueResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldCapabilityWear"></a>
# **getWorldCapabilityWear**
> GetWorldCapabilityWearResponse getWorldCapabilityWear()

What you wear from your NFTs and COSM copies: your pick per avatar slot (head, body, legs, feet, back) and what the room sees.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldCapabilityWearResponse = apiInstance.getWorldCapabilityWear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldCapabilityWear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldCapabilityWear")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldCapabilityWearResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldChest"></a>
# **getWorldChest**
> GetWorldChestResponse getWorldChest()

The Commons chest: data.window (this 20-minute window, UTC), spot ([x, z] on the plaza), endsAt (when the next chest comes) and mine (openedThis, and opened -- how many windows you have opened one in; the Chest opener pin comes at 10). A chest is opened by walking up to it in Crossly World, never over the API.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldChestResponse = apiInstance.getWorldChest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldChest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldChest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldChestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldCollectionCapability"></a>
# **getWorldCollectionCapability**
> GetWorldCollectionCapabilityResponse getWorldCollectionCapability(chain, contract)

The live capability declaration of a collection (404 when it has none).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    val result : GetWorldCollectionCapabilityResponse = apiInstance.getWorldCollectionCapability(chain, contract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldCollectionCapability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldCollectionCapability")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

**GetWorldCollectionCapabilityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldContestMine"></a>
# **getWorldContestMine**
> GetWorldContestMineResponse getWorldContestMine()

Your contest entries (best score, attempts used, payment state) and prizes (granted, or owed until their gate opens).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldContestMineResponse = apiInstance.getWorldContestMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldContestMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldContestMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldContestMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldConvention"></a>
# **getWorldConvention**
> GetWorldConventionResponse getWorldConvention(id)

One convention. 404 for an unknown or malformed id alike.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWorldConventionResponse = apiInstance.getWorldConvention(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldConvention")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldConvention")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWorldConventionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldCosmBalance"></a>
# **getWorldCosmBalance**
> GetWorldCosmBalanceResponse getWorldCosmBalance()

Your COSM balance: baseUnits (a STRING -- COSM has 6 decimals and overflows a JSON number), decimals, available (false &#x3D; COSM is not provisioned on this deployment, not a zero balance).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldCosmBalanceResponse = apiInstance.getWorldCosmBalance()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldCosmBalance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldCosmBalance")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldCosmBalanceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldCrew"></a>
# **getWorldCrew**
> GetWorldCrewResponse getWorldCrew()

Your crew: data.crew is null when you are in none, else its name, tag, join code and whether you own it; data.members lists up to 30 members, each with the public room they are in right now when they chose to be seen by name (else null).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldCrewResponse = apiInstance.getWorldCrew()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldCrew")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldCrew")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldCrewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldCrewChat"></a>
# **getWorldCrewChat**
> WorldResponse getWorldCrewChat()

Your crew chat: data.messages is the last 50 lines (from, name, text, at), kept in memory only, so it starts empty after a restart. 404 when you are in no crew.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : WorldResponse = apiInstance.getWorldCrewChat()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldCrewChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldCrewChat")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**WorldResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldCrewLeaderboard"></a>
# **getWorldCrewLeaderboard**
> GetGameLeaderboardResponse getWorldCrewLeaderboard()

The game leaderboards (Price Guess, hunts, speed trades; this week and all time) ranked among your crew only, each member by the name the crew sees. 404 when you are in no crew.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetGameLeaderboardResponse = apiInstance.getWorldCrewLeaderboard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldCrewLeaderboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldCrewLeaderboard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetGameLeaderboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldDm"></a>
# **getWorldDm**
> GetWorldDmResponse getWorldDm(userId)

Your direct-message thread with one friend, oldest first (the last 100 lines: id, from, text, at, mine). Reading it marks their lines read.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : GetWorldDmResponse = apiInstance.getWorldDm(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldDm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldDm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**|  |

### Return type

**GetWorldDmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldEmoteShowable"></a>
# **getWorldEmoteShowable**
> GetWorldEmoteShowableResponse getWorldEmoteShowable()

The things you own that a show-off emote can hold up.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldEmoteShowableResponse = apiInstance.getWorldEmoteShowable()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldEmoteShowable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldEmoteShowable")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldEmoteShowableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldFirefly"></a>
# **getWorldFirefly**
> GetWorldFireflyResponse getWorldFirefly()

Fireflies on the Commons lawn: data.day (today, UTC), today (fireflies everyone has caught today) and mine (today -- your catches today, up to perDay -- total, all your catches; the Firefly Catcher pin comes at 30 -- and perDay). Fireflies are caught by walking up to a lit one in Crossly World after dark, never over the API, and nothing is spent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldFireflyResponse = apiInstance.getWorldFirefly()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldFirefly")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldFirefly")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldFireflyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldFitStat"></a>
# **getWorldFitStat**
> GetWorldFitStatResponse getWorldFitStat()

Your walking storefront, last 7 days: distinct people who tapped \&quot;Shop this\&quot; or \&quot;Offer\&quot; on what you wore, and how many of each. Counts only; nobody is identified.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldFitStatResponse = apiInstance.getWorldFitStat()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldFitStat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldFitStat")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldFitStatResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldFitValue"></a>
# **getWorldFitValue**
> GetWorldFitValueResponse getWorldFitValue()

What your outfit is worth on the market: cents (sum of each catalogued piece&#39;s order-book price -- last sale, else lowest ask), pieces worn, how many were priced, and share (whether you show it on your card).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldFitValueResponse = apiInstance.getWorldFitValue()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldFitValue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldFitValue")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldFitValueResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldGame"></a>
# **getWorldGame**
> GetWorldGameResponse getWorldGame(id)

One live game: its manifest, its store items and which you own.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWorldGameResponse = apiInstance.getWorldGame(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldGame")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldGame")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWorldGameResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldGameLeaderboard"></a>
# **getWorldGameLeaderboard**
> GetWorldGameLeaderboardResponse getWorldGameLeaderboard(id)

A live game leaderboard, this week and all time, by its manifest scoring (wins, best points, or best time). Only people who chose to be named show by name. scoring is null for a game that keeps no board.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWorldGameLeaderboardResponse = apiInstance.getWorldGameLeaderboard(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldGameLeaderboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldGameLeaderboard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWorldGameLeaderboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldGamePackage"></a>
# **getWorldGamePackage**
> GetWorldGamePackageResponse getWorldGamePackage(id)

One of your game packages with every version, its review state and decision note.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWorldGamePackageResponse = apiInstance.getWorldGamePackage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldGamePackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldGamePackage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWorldGamePackageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldGameTemplate"></a>
# **getWorldGameTemplate**
> GetWorldGameTemplateResponse getWorldGameTemplate(kind)

A fresh game package from a template (table, arena, object; collection is an NFT capability declaration), as { path, base64 } files: the world-kit init, for an agent with no local kit. ?id&#x3D;my-game&amp;name&#x3D;My Game.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val kind : kotlin.String = kind_example // kotlin.String | 
try {
    val result : GetWorldGameTemplateResponse = apiInstance.getWorldGameTemplate(kind)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldGameTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldGameTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kind** | **kotlin.String**|  |

### Return type

**GetWorldGameTemplateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldHall"></a>
# **getWorldHall**
> GetWorldHallResponse getWorldHall()

The Hall of Grails in Crossly World: data.exhibition (key, title, blurb, endsAt -- a new one every Monday UTC -- and next, the coming one&#39;s title) and data.exhibits, up to twelve real catalogue items in slot order (skuId, name, brand, imageUrl, thumbUrl, retailCents, lowestAskCents, lastSaleCents: the live order book, null when the market has none). The first stands on the centre plinth. Buy, bid or watch an exhibit through the market endpoints with its skuId.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldHallResponse = apiInstance.getWorldHall()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldHall")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldHall")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldHallResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldHallLoan"></a>
# **getWorldHallLoan**
> GetWorldHallLoanResponse getWorldHallLoan()

Lend to the Hall: this week&#39;s exhibition (key, title, categorySlug, endsAt), your loans on show (id, vaultItemId, skuId, name, credit, since) and the vault pieces you can lend (eligible: vaultItemId, skuId, name, imageUrl, grade) -- held in your Crossly vault, not pledged, in the exhibition&#39;s category. perMember is how many you may lend each week.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldHallLoanResponse = apiInstance.getWorldHallLoan()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldHallLoan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldHallLoan")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldHallLoanResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldHomePlaceable"></a>
# **getWorldHomePlaceable**
> GetWorldHomePlaceableResponse getWorldHomePlaceable()

What you can place in your home: your items and your furniture.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldHomePlaceableResponse = apiInstance.getWorldHomePlaceable()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldHomePlaceable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldHomePlaceable")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldHomePlaceableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldHunt"></a>
# **getWorldHunt**
> GetWorldHuntResponse getWorldHunt()

Your Great Hunt: data.season (id, name, startsAt, endsAt, the title and how many earn it, live), started (you read the first clue), held (keys held, 0-3, always in the order copper, jade, crystal), keys (each with its name, colour, its riddle once it is yours to read, and when you picked it up), and cleared (your rank through the Gate this season, when, and whether you earned the title) or null. Keys are picked up by walking to them in Crossly World; nothing here takes one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldHuntResponse = apiInstance.getWorldHunt()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldHunt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldHunt")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldHuntResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldHuntScoreboard"></a>
# **getWorldHuntScoreboard**
> GetWorldHuntScoreboardResponse getWorldHuntScoreboard()

The Great Hunt Scoreboard, as the monolith in the Commons shows it: data.season (the running season, or the last one between seasons), finishers (the first ten through the Gate in order: rank, name, short, named, at, titled -- a name shows only for somebody who chose to be seen by name in the world, everyone else is \&quot;A player\&quot;) and total (everybody through the Gate this season).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldHuntScoreboardResponse = apiInstance.getWorldHuntScoreboard()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldHuntScoreboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldHuntScoreboard")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldHuntScoreboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldInteractiveDesign"></a>
# **getWorldInteractiveDesign**
> GetWorldInteractiveDesignResponse getWorldInteractiveDesign(id)

One of your interactive designs: its draft source, the last static check, and every submitted version with its review state.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetWorldInteractiveDesignResponse = apiInstance.getWorldInteractiveDesign(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldInteractiveDesign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldInteractiveDesign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetWorldInteractiveDesignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldJob"></a>
# **getWorldJob**
> GetWorldJobResponse getWorldJob()

The jobs board: open staff shifts you could claim, your claimed shifts and open price checks (appraisals), as the world shows them.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldJobResponse = apiInstance.getWorldJob()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldJob")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldJobResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldKite"></a>
# **getWorldKite**
> GetWorldKiteResponse getWorldKite()

Kites flown on the Commons lawn: data.day (today, UTC), today (kites everyone has flown today) and mine (today -- yours today, up to perDay -- perDay, and days -- the days you have flown one on; the Kite flyer pin comes at 5). Kites are flown by standing out on the lawn in Crossly World by day, never over the API, and nothing is spent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldKiteResponse = apiInstance.getWorldKite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldKite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldKite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldKiteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldLantern"></a>
# **getWorldLantern**
> GetWorldKiteResponse getWorldLantern()

Sky lanterns in the Commons: data.day (today, UTC), today (lanterns everyone has released today) and mine (today -- yours today, up to perDay -- perDay, and days -- the days you have released one on; the Lantern lighter pin comes at 5). Lanterns are released at the lantern stand in Crossly World, never over the API, and nothing is spent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldKiteResponse = apiInstance.getWorldLantern()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldLantern")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldLantern")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldKiteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPartyChat"></a>
# **getWorldPartyChat**
> WorldResponse getWorldPartyChat(id)

Your party chat: the recent lines. 404 when this is not your party.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : WorldResponse = apiInstance.getWorldPartyChat(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldPartyChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldPartyChat")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**WorldResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPlaceBoard"></a>
# **getWorldPlaceBoard**
> GetWorldPlaceBoardResponse getWorldPlaceBoard(slug)

The Trade Floor&#39;s wall of wants, its authentication desk and its Vault Markets ticker (vaultMovers: bookKey, name, label, units, markCents, change24hBps; only the trade-floor place has them).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetWorldPlaceBoardResponse = apiInstance.getWorldPlaceBoard(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldPlaceBoard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldPlaceBoard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetWorldPlaceBoardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPlaceCollection"></a>
# **getWorldPlaceCollection**
> GetWorldPlaceCollectionResponse getWorldPlaceCollection(slug, category, brand, model)

One collection room: every piece of the set, owned or missing. 404 for an unknown room or set.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val category : kotlin.String = category_example // kotlin.String | 
val brand : kotlin.String = brand_example // kotlin.String | 
val model : kotlin.String = model_example // kotlin.String | 
try {
    val result : GetWorldPlaceCollectionResponse = apiInstance.getWorldPlaceCollection(slug, category, brand, model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldPlaceCollection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldPlaceCollection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **category** | **kotlin.String**|  |
 **brand** | **kotlin.String**|  |
 **model** | **kotlin.String**|  |

### Return type

**GetWorldPlaceCollectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPlaceDrop"></a>
# **getWorldPlaceDrop**
> GetWorldPlaceDropResponse getWorldPlaceDrop(slug)

The owner&#39;s next drop (name, cover, time, live) and how many people are waiting in the room.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetWorldPlaceDropResponse = apiInstance.getWorldPlaceDrop(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldPlaceDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldPlaceDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetWorldPlaceDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPlaceItemInterest"></a>
# **getWorldPlaceItemInterest**
> GetWorldPlaceItemInterestResponse getWorldPlaceItemInterest(slug, itemId)

How many people looked at one item in this room today.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
val itemId : kotlin.String = itemId_example // kotlin.String | 
try {
    val result : GetWorldPlaceItemInterestResponse = apiInstance.getWorldPlaceItemInterest(slug, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldPlaceItemInterest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldPlaceItemInterest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |
 **itemId** | **kotlin.String**|  |

### Return type

**GetWorldPlaceItemInterestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPlaceLive"></a>
# **getWorldPlaceLive**
> GetWorldPlaceLiveResponse getWorldPlaceLive(slug)

The owner&#39;s live sale: their stream and the lot on the block, or null.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetWorldPlaceLiveResponse = apiInstance.getWorldPlaceLive(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldPlaceLive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldPlaceLive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetWorldPlaceLiveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPlaceSeller"></a>
# **getWorldPlaceSeller**
> GetWorldPlaceSellerResponse getWorldPlaceSeller(slug)

The shop whose public room this is (username and name), or null.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetWorldPlaceSellerResponse = apiInstance.getWorldPlaceSeller(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldPlaceSeller")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldPlaceSeller")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetWorldPlaceSellerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPlaceShopPet"></a>
# **getWorldPlaceShopPet**
> GetWorldPlaceShopPetResponse getWorldPlaceShopPet(slug)

The shop&#39;s pet kind, or null.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetWorldPlaceShopPetResponse = apiInstance.getWorldPlaceShopPet(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldPlaceShopPet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldPlaceShopPet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetWorldPlaceShopPetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldSpace"></a>
# **getWorldSpace**
> GetWorldSpaceResponse getWorldSpace(slug)

One Space: its layout, host, events and your place in it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetWorldSpaceResponse = apiInstance.getWorldSpace(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldSpace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldSpace")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetWorldSpaceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldSpaceCanHost"></a>
# **getWorldSpaceCanHost**
> GetWorldSpaceCanHostResponse getWorldSpaceCanHost()

Whether you may open a Space: sellers only, at most two active.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldSpaceCanHostResponse = apiInstance.getWorldSpaceCanHost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldSpaceCanHost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldSpaceCanHost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldSpaceCanHostResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldTrialLeaderboard"></a>
# **getWorldTrialLeaderboard**
> GetWorldTrialLeaderboardResponse getWorldTrialLeaderboard(course)

A Time Trials course&#39;s boards, as the board beside it in the Commons shows them: data.course, week, weekly (this week&#39;s ten fastest: rank, name, short, named, ms, at) and allTime (the ten fastest ever, each person once). A name shows only for somebody who chose to be seen by name in the world; everyone else is \&quot;A player\&quot;. 404 for an unknown course; course 1 is commons-loop.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val course : kotlin.String = course_example // kotlin.String | 
try {
    val result : GetWorldTrialLeaderboardResponse = apiInstance.getWorldTrialLeaderboard(course)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldTrialLeaderboard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldTrialLeaderboard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **course** | **kotlin.String**|  |

### Return type

**GetWorldTrialLeaderboardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldTrialMine"></a>
# **getWorldTrialMine**
> GetWorldTrialMineResponse getWorldTrialMine()

Your Hoverboard Time Trials bests: data.week (its Monday, YYYY-MM-DD, UTC) and courses, each with course (id, name, parMs, rings, lengthM), week (your best lap this week in ms, your place on the weekly board, laps finished, and the split at each ring) or null, and allTime (your best ever in ms, your place on the all-time board, when) or null. Laps are timed by Crossly from where it saw you ride in the world; nothing here writes one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldTrialMineResponse = apiInstance.getWorldTrialMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldTrialMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldTrialMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldTrialMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldWallet"></a>
# **getWorldWallet**
> GetWorldWalletResponse getWorldWallet()

Every balance you hold in Crossly World, read-only: bucksCents (Crossly Bucks, cents); cbx (available, decimals, and the three CBX balances kept apart as base-unit STRINGS -- granted (spend here only), earned (withdrawable once matured), connected (a delegation ceiling on your own wallet, not cash on hand) -- plus pendingCents of cashback not yet matured); cosm (available, decimals, baseUnits string). available:false means that currency is not provisioned on this deployment, not that you hold none.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldWalletResponse = apiInstance.getWorldWallet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldWallet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldWallet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldWalletResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldWish"></a>
# **getWorldWish**
> GetWorldWishResponse getWorldWish()

The Wishing Fountain in the Commons: data.day (today, UTC), today (wishes everyone has made today) and mine (madeToday, days -- how many days you have wished on, the Wishmaker pin comes at 7 -- and nextAt, when tomorrow&#39;s wish opens). One wish a day; a wish is made by tossing a coin at the fountain in Crossly World, never over the API, and nothing is spent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldWishResponse = apiInstance.getWorldWish()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#getWorldWish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#getWorldWish")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldWishResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialSceneGrants"></a>
# **listSpatialSceneGrants**
> ListSpatialSceneGrantsResponse listSpatialSceneGrants(id)

Everyone who can currently walk into one of your rooms, and unused invites. Never returns codes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListSpatialSceneGrantsResponse = apiInstance.listSpatialSceneGrants(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listSpatialSceneGrants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listSpatialSceneGrants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListSpatialSceneGrantsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialSceneWarehouseUnplaced"></a>
# **listSpatialSceneWarehouseUnplaced**
> ListSpatialSceneWarehouseUnplacedResponse listSpatialSceneWarehouseUnplaced(id)

Stock not yet on a shelf in a warehouse room you can arrange (q filters by title).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListSpatialSceneWarehouseUnplacedResponse = apiInstance.listSpatialSceneWarehouseUnplaced(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listSpatialSceneWarehouseUnplaced")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listSpatialSceneWarehouseUnplaced")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListSpatialSceneWarehouseUnplacedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialSharedWithMe"></a>
# **listSpatialSharedWithMe**
> ListSpatialSharedWithMeResponse listSpatialSharedWithMe()

Rooms other people let you into.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListSpatialSharedWithMeResponse = apiInstance.listSpatialSharedWithMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listSpatialSharedWithMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listSpatialSharedWithMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListSpatialSharedWithMeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSpatialStreetLeases"></a>
# **listSpatialStreetLeases**
> ListSpatialStreetLeasesResponse listSpatialStreetLeases(slug)

Plots on a street offered for lease: weekly rent in CENTS and terms.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListSpatialStreetLeasesResponse = apiInstance.listSpatialStreetLeases(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listSpatialStreetLeases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listSpatialStreetLeases")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListSpatialStreetLeasesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldAvatarCloset"></a>
# **listWorldAvatarCloset**
> ListWorldAvatarClosetResponse listWorldAvatarCloset(limit, offset)

Everything you can verifiably wear (your Crossly purchase receipts), newest first: receiptId, item title, brand, size, image, catalog sku/variant, quantity, purchasedAt. Pass a receiptId to POST /v1/world/avatar/equip to put one on. limit 1-200, offset for paging.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListWorldAvatarClosetResponse = apiInstance.listWorldAvatarCloset(limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldAvatarCloset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldAvatarCloset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional]
 **offset** | **kotlin.Int**|  | [optional]

### Return type

**ListWorldAvatarClosetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldAvatarStock"></a>
# **listWorldAvatarStock**
> ListWorldAvatarStockResponse listWorldAvatarStock()

Items of your OWN inventory you could wear into a room as a walking storefront: inventoryItemId, title, image and the slot it would go on. Pass an inventoryItemId to POST /v1/world/avatar/equip.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldAvatarStockResponse = apiInstance.listWorldAvatarStock()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldAvatarStock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldAvatarStock")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldAvatarStockResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldAvatarWearables"></a>
# **listWorldAvatarWearables**
> ListWorldAvatarWearablesResponse listWorldAvatarWearables()

Wearables you have authored as a designer: id, sku, name, slot, priceBaseUnits (COSM base units, a string), maxSupply, mintedCount, active (false until reviewed). meta.available is false when COSM is not provisioned here.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldAvatarWearablesResponse = apiInstance.listWorldAvatarWearables()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldAvatarWearables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldAvatarWearables")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldAvatarWearablesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldBestDressed"></a>
# **listWorldBestDressed**
> ListWorldBestDressedResponse listWorldBestDressed()

This week&#39;s best-dressed board (Monday-based), top ten: name, profile username and loves. Only people still choosing to be seen by name.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldBestDressedResponse = apiInstance.listWorldBestDressed()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldBestDressed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldBestDressed")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldBestDressedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldCapabilityDeclarations"></a>
# **listWorldCapabilityDeclarations**
> ListWorldCapabilityDeclarationsResponse listWorldCapabilityDeclarations()

Your capability declarations, in every review state (pending, live, rejected with the note from the reviewer).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldCapabilityDeclarationsResponse = apiInstance.listWorldCapabilityDeclarations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldCapabilityDeclarations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldCapabilityDeclarations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldCapabilityDeclarationsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldContestStandings"></a>
# **listWorldContestStandings**
> ListWorldContestStandingsResponse listWorldContestStandings(id)

The standings of a contest now: best score first (or lowest, for a time game), ties to whoever got there first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListWorldContestStandingsResponse = apiInstance.listWorldContestStandings(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldContestStandings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldContestStandings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListWorldContestStandingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldContests"></a>
# **listWorldContests**
> ListWorldContestsResponse listWorldContests()

Open skill contests on Crossly World games, soonest ending first: entry mode (free, sponsored, paid) and prizes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldContestsResponse = apiInstance.listWorldContests()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldContests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldContests")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldContestsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldConventionExhibitors"></a>
# **listWorldConventionExhibitors**
> ListWorldConventionExhibitorsResponse listWorldConventionExhibitors(id)

The host roster: who applied, who was invited, who is coming (by shop handle). Host only; 404 otherwise.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListWorldConventionExhibitorsResponse = apiInstance.listWorldConventionExhibitors(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldConventionExhibitors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldConventionExhibitors")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListWorldConventionExhibitorsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldConventionMine"></a>
# **listWorldConventionMine**
> ListWorldConventionMineResponse listWorldConventionMine()

Conventions you host and conventions you are exhibiting at.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldConventionMineResponse = apiInstance.listWorldConventionMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldConventionMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldConventionMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldConventionMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldConventions"></a>
# **listWorldConventions**
> ListWorldConventionsResponse listWorldConventions()

Conventions open to sellers now or soon: title, room, dates, and how to get a table (invite, free, fee or revenue share).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldConventionsResponse = apiInstance.listWorldConventions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldConventions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldConventions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldConventionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldCosmCosmetics"></a>
# **listWorldCosmCosmetics**
> ListCosmCosmeticsResponse listWorldCosmCosmetics(tier, slot)

The active cosmetics catalogue, optionally by tier (premium | earned | stake_exclusive) or slot: sku, name, slot, tier, priceCents (premium only), priceBaseUnits (earned only, COSM base units string), supply, fusable, preview and what it unlocks. Read-only: cosmetics are bought on crossly.net. meta.available / meta.decimals.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val tier : kotlin.String = tier_example // kotlin.String | 
val slot : kotlin.String = slot_example // kotlin.String | 
try {
    val result : ListCosmCosmeticsResponse = apiInstance.listWorldCosmCosmetics(tier, slot)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldCosmCosmetics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldCosmCosmetics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tier** | **kotlin.String**|  | [optional] [enum: premium, earned, stake_exclusive]
 **slot** | **kotlin.String**|  | [optional]

### Return type

**ListCosmCosmeticsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldCosmDesigns"></a>
# **listWorldCosmDesigns**
> ListWorldCosmDesignsResponse listWorldCosmDesigns()

Your COSM designs in the world: popularity toward the free chain unlock a popular limited design earns, whether it is on chain, and your opt-out. Declare what a design does with chain cosm and the design id as the contract.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldCosmDesignsResponse = apiInstance.listWorldCosmDesigns()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldCosmDesigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldCosmDesigns")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldCosmDesignsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldCosmInventory"></a>
# **listWorldCosmInventory**
> ListWorldCosmInventoryResponse listWorldCosmInventory()

Cosmetics you hold, newest first: ownershipId, cosmeticId, sku, name, slot, tier, how it was acquired, bound, edition number, acquiredAt and what it unlocks. Pass a cosmeticId to POST /v1/world/avatar/equip to wear one. meta.available.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldCosmInventoryResponse = apiInstance.listWorldCosmInventory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldCosmInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldCosmInventory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldCosmInventoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldDecorCatalogue"></a>
# **listWorldDecorCatalogue**
> ListWorldDecorCatalogueResponse listWorldDecorCatalogue(surface)

The Decor Shop: every active cosmetic grouped by surface (avatar | home | shop | stall | street) and slot -- name, tier, priceCents (premium: the dollar price, paid in CBX at spot) or priceBaseUnits (earned: COSM, base-unit string), edition supply and remaining, tint swatch, preview, what it unlocks, owned + your edition number, and buyWith. Read-only: buying and minting happen on crossly.net/shop/decor. meta.available, meta.mint {open, reason}, meta.cbx {open, reason} (CBX opens at mint), meta.balances (your COSM and CBX, base-unit strings), meta.surfaces. Never sold by card.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val surface : kotlin.String = surface_example // kotlin.String | 
try {
    val result : ListWorldDecorCatalogueResponse = apiInstance.listWorldDecorCatalogue(surface)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldDecorCatalogue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldDecorCatalogue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surface** | **kotlin.String**|  | [optional] [enum: avatar, home, shop, stall, street]

### Return type

**ListWorldDecorCatalogueResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldDecorDesigns"></a>
# **listWorldDecorDesigns**
> ListWorldDecorDesignsResponse listWorldDecorDesigns()

Your decor designs and their review state. available is false until COSM is provisioned.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldDecorDesignsResponse = apiInstance.listWorldDecorDesigns()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldDecorDesigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldDecorDesigns")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldDecorDesignsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldDecorInventory"></a>
# **listWorldDecorInventory**
> ListWorldDecorInventoryResponse listWorldDecorInventory()

Your decor as an INVENTORY. Decor is a quantity: every copy is one unit -- a placed prop (home_prop, prop) uses one per placement, a finish (wallpaper, floor, theme, shopfront, facade, sign style, street lamp/banner/paving/arch, booth canopy/pattern/lights/counter) one per space it dresses; free values are unlimited. Per item: key, value, pair (key:value), name, sku, surface, placeable, tint, owned, placed, available, placements [{ space { kind: home | shop | stall | street, id, name }, count }], copies [{ ownershipId, editionNumber }]. meta.available, meta.spaces (every space you dress). Read-only: placing and retracting happen in the app or on crossly.net.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldDecorInventoryResponse = apiInstance.listWorldDecorInventory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldDecorInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldDecorInventory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldDecorInventoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldDecorMarket"></a>
# **listWorldDecorMarket**
> ListWorldDecorMarketResponse listWorldDecorMarket()

Decor copies other people are reselling (asks in COSM); optional pair filter. Read only: listing and buying stay on crossly.net.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldDecorMarketResponse = apiInstance.listWorldDecorMarket()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldDecorMarket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldDecorMarket")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldDecorMarketResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldDecorMine"></a>
# **listWorldDecorMine**
> ListWorldDecorMineResponse listWorldDecorMine()

Decor you hold AND decor you have minted to your wallet, newest first: ownershipId, cosmeticId, sku, name, surface, slot, tier, acquiredVia, bound, editionNumber of maxSupply, mintState (held | minting | minted), mintAddress, mintable, and what it unlocks. meta.available, meta.mint.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldDecorMineResponse = apiInstance.listWorldDecorMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldDecorMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldDecorMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldDecorMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldDecorStalls"></a>
# **listWorldDecorStalls**
> ListStallMineResponse listWorldDecorStalls()

Your stall bookings, to dress their booths.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListStallMineResponse = apiInstance.listWorldDecorStalls()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldDecorStalls")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldDecorStalls")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStallMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldDecorStreets"></a>
# **listWorldDecorStreets**
> ListWorldDecorStreetsResponse listWorldDecorStreets()

Streets you may dress.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldDecorStreetsResponse = apiInstance.listWorldDecorStreets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldDecorStreets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldDecorStreets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldDecorStreetsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldDms"></a>
# **listWorldDms**
> ListWorldDmsResponse listWorldDms()

Your friends (mutual follows) for direct messages: each with userId, name, the last line between you (text, at, mine) or null, and how many of theirs you have not read; most recent first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldDmsResponse = apiInstance.listWorldDms()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldDms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldDms")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldDmsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldFollowingRooms"></a>
# **listWorldFollowingRooms**
> ListWorldFollowingRoomsResponse listWorldFollowingRooms()

The public rooms of people you follow, to walk into.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldFollowingRoomsResponse = apiInstance.listWorldFollowingRooms()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldFollowingRooms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldFollowingRooms")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldFollowingRoomsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldFollows"></a>
# **listWorldFollows**
> ListWorldFollowsResponse listWorldFollows()

Everybody you follow in Crossly World, newest first, each with mutual: true when they follow you back (a friend).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldFollowsResponse = apiInstance.listWorldFollows()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldFollows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldFollows")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldFollowsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldFriendHere"></a>
# **listWorldFriendHere**
> ListWorldFriendsResponse listWorldFriendHere()

Your friends in Crossly World right now, and where (when they share it).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldFriendsResponse = apiInstance.listWorldFriendHere()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldFriendHere")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldFriendHere")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldFriendsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldFriends"></a>
# **listWorldFriends**
> ListWorldFriendsResponse listWorldFriends()

Your friends (mutual follows), each with the PUBLIC room they are in right now when they chose to be seen by name there (else null), and their home address slug when they let friends visit. Invisible and anonymous friends are never located.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldFriendsResponse = apiInstance.listWorldFriends()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldFriends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldFriends")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldFriendsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldGamePackages"></a>
# **listWorldGamePackages**
> ListWorldGamePackagesResponse listWorldGamePackages()

Your game packages, each with its latest version and review state.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldGamePackagesResponse = apiInstance.listWorldGamePackages()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldGamePackages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldGamePackages")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldGamePackagesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldGameRewards"></a>
# **listWorldGameRewards**
> ListWorldGameRewardsResponse listWorldGameRewards()

Rewards you won in games: granted, or recorded as unfunded for COSM and CBX (a game prints no value).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldGameRewardsResponse = apiInstance.listWorldGameRewards()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldGameRewards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldGameRewards")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldGameRewardsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldGames"></a>
# **listWorldGames**
> ListWorldGamesResponse listWorldGames()

The Game Directory: every live, reviewed game package with its players, places, rewards, contests and the piece people place.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldGamesResponse = apiInstance.listWorldGames()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldGames")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldGames")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldGamesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldHomeBuilding"></a>
# **listWorldHomeBuilding**
> ListWorldHomeBuildingResponse listWorldHomeBuilding()

Homes whose owner made you a co-builder.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldHomeBuildingResponse = apiInstance.listWorldHomeBuilding()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldHomeBuilding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldHomeBuilding")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldHomeBuildingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldInteractiveCatalogue"></a>
# **listWorldInteractiveCatalogue**
> ListWorldInteractiveCatalogueResponse listWorldInteractiveCatalogue()

Interactive objects: every piece that runs a shared script in a room (first-party and approved creator designs). Per item: model (the piece key a home layout or boutique prop stores), decorValue (the home_prop value its SKU claims), source (first_party | creator), name, blurb, size [x, z] metres, fallbackMesh, cosmeticId (the SKU on the Decor Shop, null when not on sale) and version (a creator design: the approved version every copy runs). Read-only: buying is on crossly.net/shop/decor.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldInteractiveCatalogueResponse = apiInstance.listWorldInteractiveCatalogue()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldInteractiveCatalogue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldInteractiveCatalogue")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldInteractiveCatalogueResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldInteractiveDesigns"></a>
# **listWorldInteractiveDesigns**
> ListWorldInteractiveDesignsResponse listWorldInteractiveDesigns(archived)

Your interactive-object designs (MML documents you wrote), newest first: id, handle, name, footprint (s | m | l | f), tint, priceBaseUnits (COSM, base-unit string), maxSupply, model, decorValue, cosmeticId, liveVersion (the approved version every copy runs; null &#x3D; none), withdrawnReason, archivedAt (you archived it: off sale, owned copies keep running; null &#x3D; not archived), latestVersion { version, state: pending | approved | rejected | withdrawn | cancelled, decisionNote }, inReview. &#x60;archived&#x60;: exclude (default), include or only archived designs. Read-only: writing, previewing, submitting and archiving happen on crossly.net/shop/decor?tab&#x3D;interactive.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val archived : kotlin.String = archived_example // kotlin.String | 
try {
    val result : ListWorldInteractiveDesignsResponse = apiInstance.listWorldInteractiveDesigns(archived)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldInteractiveDesigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldInteractiveDesigns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **archived** | **kotlin.String**|  | [optional] [enum: exclude, include, only]

### Return type

**ListWorldInteractiveDesignsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldJobPosted"></a>
# **listWorldJobPosted**
> ListJobShiftsResponse listWorldJobPosted()

Shifts you posted for your rooms, with who claimed each and how it went.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListJobShiftsResponse = apiInstance.listWorldJobPosted()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldJobPosted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldJobPosted")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListJobShiftsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldOutfits"></a>
# **listWorldOutfits**
> ListWorldOutfitsResponse listWorldOutfits()

Your saved outfits (up to 6, oldest first): id, name, appearance (skin, hair, hairColour, eyes, build) and items -- each worn thing as the door it goes back on by (slot, door: cosmetic | receipt | stock, id, label). Put one on with POST /v1/world/outfits/:id/apply.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldOutfitsResponse = apiInstance.listWorldOutfits()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldOutfits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldOutfits")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldOutfitsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldPlaceBans"></a>
# **listWorldPlaceBans**
> ListWorldPlaceBansResponse listWorldPlaceBans(slug)

Who is banned from a place you own (your boutique or home).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListWorldPlaceBansResponse = apiInstance.listWorldPlaceBans(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldPlaceBans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldPlaceBans")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListWorldPlaceBansResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldPlaceBundles"></a>
# **listWorldPlaceBundles**
> ListWorldPlaceBundlesResponse listWorldPlaceBundles(slug)

The owner&#39;s bundle deals mapped onto this room&#39;s items (itemIds null &#x3D; any N from the shop). The discount is decided at checkout.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListWorldPlaceBundlesResponse = apiInstance.listWorldPlaceBundles(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldPlaceBundles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldPlaceBundles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListWorldPlaceBundlesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldPlaceCollections"></a>
# **listWorldPlaceCollections**
> ListWorldPlaceCollectionsResponse listWorldPlaceCollections(slug)

The owner&#39;s collection rooms: one per category, brand and model they collect.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListWorldPlaceCollectionsResponse = apiInstance.listWorldPlaceCollections(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldPlaceCollections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldPlaceCollections")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListWorldPlaceCollectionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldPlaceOffers"></a>
# **listWorldPlaceOffers**
> ListWorldPlaceOffersResponse listWorldPlaceOffers(slug)

What is for sale in a public room: price, condition and stock, with market references. 404 when no such room is shared.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListWorldPlaceOffersResponse = apiInstance.listWorldPlaceOffers(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldPlaceOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldPlaceOffers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListWorldPlaceOffersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldPlaceRadar"></a>
# **listWorldPlaceRadar**
> ListWorldPlaceRadarResponse listWorldPlaceRadar(slug)

What you have that someone here wants, and what is here that you want: matched on catalog ids.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListWorldPlaceRadarResponse = apiInstance.listWorldPlaceRadar(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldPlaceRadar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldPlaceRadar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListWorldPlaceRadarResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldPlaceTradeTables"></a>
# **listWorldPlaceTradeTables**
> ListWorldPlaceTradeTablesResponse listWorldPlaceTradeTables(slug)

The open trade tables in a place: who is sitting and what is laid on the mat.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListWorldPlaceTradeTablesResponse = apiInstance.listWorldPlaceTradeTables(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldPlaceTradeTables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldPlaceTradeTables")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListWorldPlaceTradeTablesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldPlaceTrades"></a>
# **listWorldPlaceTrades**
> ListWorldPlaceTradesResponse listWorldPlaceTrades(slug)

Items in this room open to trades, each with its trade post path.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListWorldPlaceTradesResponse = apiInstance.listWorldPlaceTrades(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldPlaceTrades")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldPlaceTrades")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListWorldPlaceTradesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldProvenance"></a>
# **listWorldProvenance**
> ListWorldProvenanceResponse listWorldProvenance()

Provenance trails: where in Crossly World your purchases were found, newest first (optionally ?listingIds&#x3D;a,b -- platform listing ids). data: [{ platformListingId, slug (the listing public slug), kind (room | window | stall | space | drop | auction | worn | agent), place (its name, or null when gone), at, line -- e.g. \&quot;Found at The Sneaker Vault, Oct 2026\&quot; }]. Yours only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldProvenanceResponse = apiInstance.listWorldProvenance()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldProvenance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldProvenance")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldProvenanceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldQuests"></a>
# **listWorldQuests**
> ListWorldQuestsResponse listWorldQuests()

Every world quest with your progress: key, the pin it earns, goal, target, count, done, colour. meta.wearing is the pin on your nameplate (or null); meta.streak your current and best daily visit streak. Progress only comes from what the server saw -- there is no write of it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldQuestsResponse = apiInstance.listWorldQuests()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldQuests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldQuests")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldQuestsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldSpaceMine"></a>
# **listWorldSpaceMine**
> ListWorldSpacesResponse listWorldSpaceMine()

Spaces you belong to.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldSpacesResponse = apiInstance.listWorldSpaceMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldSpaceMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldSpaceMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldSpacesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldSpaceRequests"></a>
# **listWorldSpaceRequests**
> ListWorldSpaceRequestsResponse listWorldSpaceRequests(slug)

As host or co-host, who asked to join.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListWorldSpaceRequestsResponse = apiInstance.listWorldSpaceRequests(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldSpaceRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldSpaceRequests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListWorldSpaceRequestsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldSpaceWhatsOn"></a>
# **listWorldSpaceWhatsOn**
> ListWorldSpaceWhatsOnResponse listWorldSpaceWhatsOn()

Live and upcoming events across Spaces (streets&#x3D;1 and stage&#x3D;1 add street and Main Stage events).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldSpaceWhatsOnResponse = apiInstance.listWorldSpaceWhatsOn()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldSpaceWhatsOn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldSpaceWhatsOn")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldSpaceWhatsOnResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldSpaces"></a>
# **listWorldSpaces**
> ListWorldSpacesResponse listWorldSpaces()

The Spaces directory: seller-hosted clubs with a venue, members and events (optional venue filter).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldSpacesResponse = apiInstance.listWorldSpaces()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldSpaces")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldSpaces")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldSpacesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldStreaks"></a>
# **listWorldStreaks**
> ListWorldStreaksResponse listWorldStreaks()

The longest current daily visit streaks (2+ days), top ten: name and days. Only people still choosing to be seen by name.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldStreaksResponse = apiInstance.listWorldStreaks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldStreaks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldStreaks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldStreaksResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldTradeMine"></a>
# **listWorldTradeMine**
> ListWorldTradeMineResponse listWorldTradeMine()

Your trades and each item progress through the authentication gate (verified or failed).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldTradeMineResponse = apiInstance.listWorldTradeMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldTradeMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldTradeMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldTradeMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldTradeTableBinder"></a>
# **listWorldTradeTableBinder**
> ListWorldTradeTableBinderResponse listWorldTradeTableBinder()

Your binder: unsold collection rows that are catalog items and may be laid on a trade mat -- key, variantId, condition, grade, portfolioId, name, image and valueCents (market value, cents).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldTradeTableBinderResponse = apiInstance.listWorldTradeTableBinder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldTradeTableBinder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldTradeTableBinder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldTradeTableBinderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldTradeTableListings"></a>
# **listWorldTradeTableListings**
> ListWorldTradeTableListingsResponse listWorldTradeTableListings()

Your open Trade Block trade listings a trade table can be opened on in the world, each with its items&#39; names.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : ListWorldTradeTableListingsResponse = apiInstance.listWorldTradeTableListings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#listWorldTradeTableListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#listWorldTradeTableListings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldTradeTableListingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpatialSceneCosmetic"></a>
# **updateSpatialSceneCosmetic**
> UpdateSpatialSceneCosmeticResponse updateSpatialSceneCosmetic(id)

Redecorate one of your rooms (wall, floor, lighting, trim...). Unknown keys are dropped; the response is what survived. &#x60;clear&#x60; lists keys to reset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateSpatialSceneCosmeticResponse = apiInstance.updateSpatialSceneCosmetic(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateSpatialSceneCosmetic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateSpatialSceneCosmetic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateSpatialSceneCosmeticResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpatialSceneNode"></a>
# **updateSpatialSceneNode**
> UpdateSpatialSceneNodeResponse updateSpatialSceneNode(id, nodeId)

Move a rack in one of your warehouse rooms (position in metres).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
val nodeId : kotlin.String = nodeId_example // kotlin.String | 
try {
    val result : UpdateSpatialSceneNodeResponse = apiInstance.updateSpatialSceneNode(id, nodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateSpatialSceneNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateSpatialSceneNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **nodeId** | **kotlin.String**|  |

### Return type

**UpdateSpatialSceneNodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpatialSceneSetting"></a>
# **updateSpatialSceneSetting**
> SpatialSceneResponse2 updateSpatialSceneSetting(id)

How one of your rooms is laid out and lit: grouping and sort keys, theme, overlay and the arrival camera. Cosmetics and the shop layout have their own writers.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : SpatialSceneResponse2 = apiInstance.updateSpatialSceneSetting(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateSpatialSceneSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateSpatialSceneSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**SpatialSceneResponse2**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpatialSceneShopLayout"></a>
# **updateSpatialSceneShopLayout**
> UpdateSpatialSceneShopLayoutResponse updateSpatialSceneShopLayout(id)

Save your shop room&#39;s sections and displays (validated server-side; the response is the stored layout).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateSpatialSceneShopLayoutResponse = apiInstance.updateSpatialSceneShopLayout(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateSpatialSceneShopLayout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateSpatialSceneShopLayout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateSpatialSceneShopLayoutResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpatialSceneWindow"></a>
# **updateSpatialSceneWindow**
> UpdateSpatialSceneWindowResponse updateSpatialSceneWindow(id)

Choose up to three of your live Crossly listings for the street window of your shop, in slot order. Picks that sell drop out and the newest fill in; an empty list goes back to newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateSpatialSceneWindowResponse = apiInstance.updateSpatialSceneWindow(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateSpatialSceneWindow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateSpatialSceneWindow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateSpatialSceneWindowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpatialStreetDecor"></a>
# **updateSpatialStreetDecor**
> GetSpatialStreetDecorResponse updateSpatialStreetDecor(slug)

Dress a street you own with decor you hold (validated against your inventory).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetSpatialStreetDecorResponse = apiInstance.updateSpatialStreetDecor(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateSpatialStreetDecor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateSpatialStreetDecor")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**GetSpatialStreetDecorResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpatialStreetOwned"></a>
# **updateSpatialStreetOwned**
> SpatialStreetResponse updateSpatialStreetOwned(id)

Who may open a shop on a street you own (open, apply or invite).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : SpatialStreetResponse = apiInstance.updateSpatialStreetOwned(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateSpatialStreetOwned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateSpatialStreetOwned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**SpatialStreetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldAutoShop"></a>
# **updateWorldAutoShop**
> GetWorldAutoShopResponse updateWorldAutoShop(updateWorldAutoShopRequest)

Turn your automatic world shop off ({ enabled: false } -- an auto-created shop is made private, never deleted) or back on. Answers the new status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val updateWorldAutoShopRequest : UpdateWorldAutoShopRequest =  // UpdateWorldAutoShopRequest | 
try {
    val result : GetWorldAutoShopResponse = apiInstance.updateWorldAutoShop(updateWorldAutoShopRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldAutoShop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldAutoShop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateWorldAutoShopRequest** | **UpdateWorldAutoShopRequest**|  |

### Return type

**GetWorldAutoShopResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorldAvatarIdentity"></a>
# **updateWorldAvatarIdentity**
> UpdateWorldAvatarIdentityResponse updateWorldAvatarIdentity()

Choose named or anonymous. Rooms you are already in keep the old answer until you rejoin.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : UpdateWorldAvatarIdentityResponse = apiInstance.updateWorldAvatarIdentity()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldAvatarIdentity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldAvatarIdentity")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateWorldAvatarIdentityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldAvatarLook"></a>
# **updateWorldAvatarLook**
> UpdateWorldAvatarLookResponse updateWorldAvatarLook()

Save your world look to the account, so every device starts from it. look: null stays anonymous.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : UpdateWorldAvatarLookResponse = apiInstance.updateWorldAvatarLook()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldAvatarLook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldAvatarLook")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateWorldAvatarLookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldAvatarNftBadge"></a>
# **updateWorldAvatarNftBadge**
> GetWorldAvatarNftBadgeResponse updateWorldAvatarNftBadge()

Wear an NFT you hold on your nameplate (null to take it off). Checked again each time you join a room.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldAvatarNftBadgeResponse = apiInstance.updateWorldAvatarNftBadge()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldAvatarNftBadge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldAvatarNftBadge")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldAvatarNftBadgeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldCapabilityWear"></a>
# **updateWorldCapabilityWear**
> GetWorldCapabilityWearResponse updateWorldCapabilityWear()

Wear a held token on an avatar slot (refId from GET /v1/world/capabilities), or pass refId null to take it off. Its collection must declare a wear capability for that slot.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : GetWorldCapabilityWearResponse = apiInstance.updateWorldCapabilityWear()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldCapabilityWear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldCapabilityWear")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldCapabilityWearResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldCollectionCapability"></a>
# **updateWorldCollectionCapability**
> GetWorldCollectionCapabilityResponse updateWorldCollectionCapability(chain, contract)

Declare what the tokens of a collection can do (the whole declaration, spec crossly.nft-capabilities/1). As its creator (launched on Crossly or claimed) any kind; as a holder, cosmetic kinds only. Replaces your previous declaration; pending if it names an uploaded asset or an always-reviewed kind.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val chain : kotlin.String = chain_example // kotlin.String | 
val contract : kotlin.String = contract_example // kotlin.String | 
try {
    val result : GetWorldCollectionCapabilityResponse = apiInstance.updateWorldCollectionCapability(chain, contract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldCollectionCapability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldCollectionCapability")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chain** | **kotlin.String**|  |
 **contract** | **kotlin.String**|  |

### Return type

**GetWorldCollectionCapabilityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldConventionStatus"></a>
# **updateWorldConventionStatus**
> UpdateWorldConventionStatusResponse updateWorldConventionStatus(id)

Open, start, end or cancel a convention you host.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateWorldConventionStatusResponse = apiInstance.updateWorldConventionStatus(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldConventionStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldConventionStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateWorldConventionStatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldCosmDesignChainAutoUnlock"></a>
# **updateWorldCosmDesignChainAutoUnlock**
> CreateCosmDesignerChainAutoUnlockResponse updateWorldCosmDesignChainAutoUnlock(id)

Opt one of your COSM designs in or out of the free chain unlock it earns when popular (on by default). Answers its popularity.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateCosmDesignerChainAutoUnlockResponse = apiInstance.updateWorldCosmDesignChainAutoUnlock(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldCosmDesignChainAutoUnlock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldCosmDesignChainAutoUnlock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateCosmDesignerChainAutoUnlockResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldEmoteWheel"></a>
# **updateWorldEmoteWheel**
> UpdateWorldEmoteWheelResponse updateWorldEmoteWheel(updateWorldEmoteWheelRequest)

Arrange your emote wheel: up to 8 slots, each an emote id, a moment slot or null. Returns the saved wheel (locked or unknown ids are dropped).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val updateWorldEmoteWheelRequest : UpdateWorldEmoteWheelRequest =  // UpdateWorldEmoteWheelRequest | 
try {
    val result : UpdateWorldEmoteWheelResponse = apiInstance.updateWorldEmoteWheel(updateWorldEmoteWheelRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldEmoteWheel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldEmoteWheel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateWorldEmoteWheelRequest** | **UpdateWorldEmoteWheelRequest**|  |

### Return type

**UpdateWorldEmoteWheelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorldFitValueShare"></a>
# **updateWorldFitValueShare**
> UpdateWorldFitValueShareResponse updateWorldFitValueShare()

Whether people in a room can see what your outfit is worth.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : UpdateWorldFitValueShareResponse = apiInstance.updateWorldFitValueShare()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldFitValueShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldFitValueShare")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateWorldFitValueShareResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldHome"></a>
# **updateWorldHome**
> WorldHomeResponse updateWorldHome()

Your home: privacy (open, friends, private), theme, and wall, floor and mood decor you hold.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : WorldHomeResponse = apiInstance.updateWorldHome()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldHome")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldHome")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**WorldHomeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldHomeBuilder"></a>
# **updateWorldHomeBuilder**
> UpdateWorldHomeBuilderResponse updateWorldHomeBuilder(updateWorldHomeBuilderRequest)

Set the co-builders of your home: { userIds } -- friends (mutual follows) only, at most 4, replacing the list ([] clears it). They may rearrange your home in the world with your things and add free furniture, never your bought pieces. New co-builders get a world notice.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val updateWorldHomeBuilderRequest : UpdateWorldHomeBuilderRequest =  // UpdateWorldHomeBuilderRequest | 
try {
    val result : UpdateWorldHomeBuilderResponse = apiInstance.updateWorldHomeBuilder(updateWorldHomeBuilderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldHomeBuilder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldHomeBuilder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateWorldHomeBuilderRequest** | **UpdateWorldHomeBuilderRequest**|  |

### Return type

**UpdateWorldHomeBuilderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorldHomeLayout"></a>
# **updateWorldHomeLayout**
> WorldHomeResponse updateWorldHomeLayout()

Arrange your home: the full layout (up to 200 pieces you own), validated server-side.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
try {
    val result : WorldHomeResponse = apiInstance.updateWorldHomeLayout()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldHomeLayout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldHomeLayout")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**WorldHomeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldHomeLayoutBySlug"></a>
# **updateWorldHomeLayoutBySlug**
> WorldHomeResponse updateWorldHomeLayoutBySlug(slug)

Rearrange a home you co-build (never adding the owner bought pieces).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : WorldHomeResponse = apiInstance.updateWorldHomeLayoutBySlug(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldHomeLayoutBySlug")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldHomeLayoutBySlug")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**WorldHomeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldInteractiveDesignDraft"></a>
# **updateWorldInteractiveDesignDraft**
> UpdateWorldInteractiveDesignDraftResponse updateWorldInteractiveDesignDraft(id)

Save the draft MML source (up to 64 KB); the response carries its static check.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateWorldInteractiveDesignDraftResponse = apiInstance.updateWorldInteractiveDesignDraft(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldInteractiveDesignDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldInteractiveDesignDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateWorldInteractiveDesignDraftResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldListingHoldersOnly"></a>
# **updateWorldListingHoldersOnly**
> UpdateWorldListingHoldersOnlyResponse updateWorldListingHoldersOnly(id)

Reserve one of your listings for holders of a collection you declared a holders_only perk for (or release it). Checkout refuses anybody else.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateWorldListingHoldersOnlyResponse = apiInstance.updateWorldListingHoldersOnly(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldListingHoldersOnly")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldListingHoldersOnly")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateWorldListingHoldersOnlyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldOutfit"></a>
# **updateWorldOutfit**
> UpdateWorldOutfitResponse updateWorldOutfit(id, updateWorldOutfitRequest)

Rename a saved look: { name (1-32 chars) }. 404 when it is not yours.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateWorldOutfitRequest : UpdateWorldOutfitRequest =  // UpdateWorldOutfitRequest | 
try {
    val result : UpdateWorldOutfitResponse = apiInstance.updateWorldOutfit(id, updateWorldOutfitRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldOutfit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldOutfit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **updateWorldOutfitRequest** | **UpdateWorldOutfitRequest**|  |

### Return type

**UpdateWorldOutfitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorldPetActive"></a>
# **updateWorldPetActive**
> UpdateWorldPetActiveResponse updateWorldPetActive(updateWorldPetActiveRequest)

Walk one of your pets with you in the world, or none (kind: null).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val updateWorldPetActiveRequest : UpdateWorldPetActiveRequest =  // UpdateWorldPetActiveRequest | 
try {
    val result : UpdateWorldPetActiveResponse = apiInstance.updateWorldPetActive(updateWorldPetActiveRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldPetActive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldPetActive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateWorldPetActiveRequest** | **UpdateWorldPetActiveRequest**|  |

### Return type

**UpdateWorldPetActiveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorldQuestPin"></a>
# **updateWorldQuestPin**
> UpdateWorldQuestPinResponse updateWorldQuestPin(updateWorldQuestPinRequest)

Wear a pin you EARNED from a quest on your nameplate, or { pin: null } to wear none. 403 for a pin you have not earned. Shows from the next room you walk into.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val updateWorldQuestPinRequest : UpdateWorldQuestPinRequest =  // UpdateWorldQuestPinRequest | 
try {
    val result : UpdateWorldQuestPinResponse = apiInstance.updateWorldQuestPin(updateWorldQuestPinRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldQuestPin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldQuestPin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateWorldQuestPinRequest** | **UpdateWorldQuestPinRequest**|  |

### Return type

**UpdateWorldQuestPinResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorldRoomHolderGate"></a>
# **updateWorldRoomHolderGate**
> UpdateWorldRoomHolderGateResponse updateWorldRoomHolderGate(id)

Make your room holders-only (its collection rooms follow). Send null to open it again. Returns &#x60;{ gate }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateWorldRoomHolderGateResponse = apiInstance.updateWorldRoomHolderGate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldRoomHolderGate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldRoomHolderGate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateWorldRoomHolderGateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldSpace"></a>
# **updateWorldSpace**
> UpdateWorldSpaceResponse updateWorldSpace(slug)

As host, change a Space name, about or membership.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : UpdateWorldSpaceResponse = apiInstance.updateWorldSpace(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldSpace")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldSpace")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**UpdateWorldSpaceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldSpaceHolderGate"></a>
# **updateWorldSpaceHolderGate**
> UpdateWorldRoomHolderGateResponse updateWorldSpaceHolderGate(slug)

Make your Space holders-only: only holders of an NFT collection join it (others can look in). Send null to open it again. Returns &#x60;{ gate }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : UpdateWorldRoomHolderGateResponse = apiInstance.updateWorldSpaceHolderGate(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldSpaceHolderGate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldSpaceHolderGate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**UpdateWorldRoomHolderGateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldStallBookingBooth"></a>
# **updateWorldStallBookingBooth**
> UpdateWorldStallBookingBoothResponse updateWorldStallBookingBooth(id)

Dress the booth of a stall you booked (decor you hold).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateWorldStallBookingBoothResponse = apiInstance.updateWorldStallBookingBooth(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldApi#updateWorldStallBookingBooth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldApi#updateWorldStallBookingBooth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateWorldStallBookingBoothResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

