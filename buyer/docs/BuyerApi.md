# BuyerApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerActivity**](BuyerApi.md#createBuyerActivity) | **POST** /v1/buyer/activity | Report an item your user is looking at, and get our answer.
[**createBuyerCartItem**](BuyerApi.md#createBuyerCartItem) | **POST** /v1/buyer/cart/items | Add a listing to your cart.
[**createBuyerCartQuote**](BuyerApi.md#createBuyerCartQuote) | **POST** /v1/buyer/cart/quote | Price the cart, delivered — item, shipping, tax, total.
[**createBuyerOffer**](BuyerApi.md#createBuyerOffer) | **POST** /v1/buyer/offers | Offer a price on a listing.
[**createBuyerWishlist**](BuyerApi.md#createBuyerWishlist) | **POST** /v1/buyer/wishlists | Create a wishlist.
[**createBuyerWishlistItem**](BuyerApi.md#createBuyerWishlistItem) | **POST** /v1/buyer/wishlists/{id}/items | Add a listing to a wishlist.
[**deleteBuyerCartItem**](BuyerApi.md#deleteBuyerCartItem) | **DELETE** /v1/buyer/cart/items/{id} | Remove a line from your cart.
[**getBuyerPreference**](BuyerApi.md#getBuyerPreference) | **GET** /v1/buyer/preferences | The shopping profile derived from that activity.
[**getBuyerProfile**](BuyerApi.md#getBuyerProfile) | **GET** /v1/buyer/profile | Your Crossly shopping profile — name, email, saved address, Bucks balance.
[**listBuyerActivity**](BuyerApi.md#listBuyerActivity) | **GET** /v1/buyer/activity | What this buyer has compared lately.
[**listBuyerCart**](BuyerApi.md#listBuyerCart) | **GET** /v1/buyer/cart | What is in your Crossly cart.
[**listBuyerCashback**](BuyerApi.md#listBuyerCashback) | **GET** /v1/buyer/cashback | Your Scout cashback — pending, confirmed, paid.
[**listBuyerOrders**](BuyerApi.md#listBuyerOrders) | **GET** /v1/buyer/orders | What you have bought on Crossly, newest first.
[**listBuyerWishlistItems**](BuyerApi.md#listBuyerWishlistItems) | **GET** /v1/buyer/wishlists/{id}/items | What is on one wishlist.
[**listBuyerWishlists**](BuyerApi.md#listBuyerWishlists) | **GET** /v1/buyer/wishlists | Your wishlists.


<a name="createBuyerActivity"></a>
# **createBuyerActivity**
> CreateBuyerActivityResponse createBuyerActivity(inlineObject4)

Report an item your user is looking at, and get our answer.

Records the look and returns whether Crossly has the item and at what price. Send an identifier and a store DOMAIN — a full URL is refused. Nothing about the page itself is stored.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val inlineObject4 : InlineObject4 =  // InlineObject4 | 
try {
    val result : CreateBuyerActivityResponse = apiInstance.createBuyerActivity(inlineObject4)
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  |

### Return type

[**CreateBuyerActivityResponse**](CreateBuyerActivityResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerCartItem"></a>
# **createBuyerCartItem**
> CreateBuyerCartItemResponse createBuyerCartItem(inlineObject2)

Add a listing to your cart.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val inlineObject2 : InlineObject2 =  // InlineObject2 | 
try {
    val result : CreateBuyerCartItemResponse = apiInstance.createBuyerCartItem(inlineObject2)
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  |

### Return type

[**CreateBuyerCartItemResponse**](CreateBuyerCartItemResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerCartQuote"></a>
# **createBuyerCartQuote**
> CreateBuyerCartQuoteResponse createBuyerCartQuote()

Price the cart, delivered — item, shipping, tax, total.

Runs the real checkout cascade and returns the totals instead of charging. Nothing is purchased. &#x60;taxComplete: false&#x60; means there is no saved delivery address, so the total is a floor rather than a final figure.

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

[**CreateBuyerCartQuoteResponse**](CreateBuyerCartQuoteResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBuyerOffer"></a>
# **createBuyerOffer**
> CreateBuyerOfferResponse createBuyerOffer(inlineObject3)

Offer a price on a listing.

Sends an offer to the seller. Spends nothing — a seller accepting still leaves you to complete checkout. Offers at or above the asking price are refused; buy it instead.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val inlineObject3 : InlineObject3 =  // InlineObject3 | 
try {
    val result : CreateBuyerOfferResponse = apiInstance.createBuyerOffer(inlineObject3)
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  |

### Return type

[**CreateBuyerOfferResponse**](CreateBuyerOfferResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerWishlist"></a>
# **createBuyerWishlist**
> CreateBuyerWishlistResponse createBuyerWishlist(inlineObject)

Create a wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val inlineObject : InlineObject =  // InlineObject | 
try {
    val result : CreateBuyerWishlistResponse = apiInstance.createBuyerWishlist(inlineObject)
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**CreateBuyerWishlistResponse**](CreateBuyerWishlistResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBuyerWishlistItem"></a>
# **createBuyerWishlistItem**
> CreateBuyerWishlistItemResponse createBuyerWishlistItem(id, inlineObject1)

Add a listing to a wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val inlineObject1 : InlineObject1 =  // InlineObject1 | 
try {
    val result : CreateBuyerWishlistItemResponse = apiInstance.createBuyerWishlistItem(id, inlineObject1)
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  |

### Return type

[**CreateBuyerWishlistItemResponse**](CreateBuyerWishlistItemResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
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

[**GetBuyerPreferenceResponse**](GetBuyerPreferenceResponse.md)

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

[**GetBuyerProfileResponse**](GetBuyerProfileResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerActivity"></a>
# **listBuyerActivity**
> V1List listBuyerActivity()

What this buyer has compared lately.

Newest first, and only as far back as the retention window — the link between a person and a comparison is dropped after 180 days, so this thins out rather than growing forever.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : V1List = apiInstance.listBuyerActivity()
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

[**V1List**](V1List.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCart"></a>
# **listBuyerCart**
> V1List listBuyerCart()

What is in your Crossly cart.

Line items with the price captured when each was added. This is NOT a quote — shipping, tax and any discounts are computed at checkout against a delivery address, and the sum of these lines is not what you will be charged.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : V1List = apiInstance.listBuyerCart()
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

[**V1List**](V1List.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerCashback"></a>
# **listBuyerCashback**
> V1List listBuyerCashback(status, page, limit)

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
    val result : V1List = apiInstance.listBuyerCashback(status, page, limit)
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

[**V1List**](V1List.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerOrders"></a>
# **listBuyerOrders**
> V1List listBuyerOrders(page, limit)

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
    val result : V1List = apiInstance.listBuyerOrders(page, limit)
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

[**V1List**](V1List.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerWishlistItems"></a>
# **listBuyerWishlistItems**
> V1List listBuyerWishlistItems(id)

What is on one wishlist.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : V1List = apiInstance.listBuyerWishlistItems(id)
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

[**V1List**](V1List.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerWishlists"></a>
# **listBuyerWishlists**
> V1List listBuyerWishlists()

Your wishlists.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerApi()
try {
    val result : V1List = apiInstance.listBuyerWishlists()
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

[**V1List**](V1List.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

