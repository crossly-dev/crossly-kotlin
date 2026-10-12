# BuyerApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpatialAuctionRoomBid**](BuyerApi.md#createSpatialAuctionRoomBid) | **POST** /v1/spatial/auction/rooms/{sceneId}/bid | Bid on the lot currently up in a room.


<a name="createSpatialAuctionRoomBid"></a>
# **createSpatialAuctionRoomBid**
> CreateSpatialAuctionRoomBidResponse createSpatialAuctionRoomBid(sceneId)

Bid on the lot currently up in a room.

Bids on whatever the auctioneer has up RIGHT NOW. Pass &#x60;lotId&#x60; to say which lot you believe that is: it is checked against the rostrum rather than used in its place, and a mismatch answers 409 with the lot that is actually up, so a stale catalogue cannot buy you something you never looked at. &#x60;amountCents&#x60; is CENTS and must be at least the room state&#39;s &#x60;minimumNextBidCents&#x60; — do not compute that yourself, because the opening bid on a lot is floored at the START price rather than start + step. Below it you get 400 &#x60;bid_too_low&#x60; carrying &#x60;details.minimumNextBidCents&#x60;, which is the figure the transaction itself used; raise to that and retry. THIS AUCTION HOUSE SELLS DIGITAL GOODS ONLY. A physical lot is refused 403 &#x60;forbidden&#x60; with &#x60;details.reason: \&quot;physical_lot\&quot;&#x60;, checked against the listing on every single bid rather than once when the room was set up. Bids by one person on one lot are throttled to a few per second — 429 &#x60;bidding_too_fast&#x60; carries &#x60;retryInSeconds&#x60;. A hammered or skipped lot answers 409 &#x60;lot_closed&#x60;. A room you may not enter answers 404, the same as one that does not exist. Success is the bid RECORDED, not the lot won: the reply names the topic the price moves on, and somebody may outbid you on the next frame.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BuyerApi()
val sceneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateSpatialAuctionRoomBidResponse = apiInstance.createSpatialAuctionRoomBid(sceneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerApi#createSpatialAuctionRoomBid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerApi#createSpatialAuctionRoomBid")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sceneId** | **java.util.UUID**|  |

### Return type

**CreateSpatialAuctionRoomBidResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

