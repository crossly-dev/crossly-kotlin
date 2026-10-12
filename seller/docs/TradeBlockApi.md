# TradeBlockApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTradeBlockEvolutionClaim**](TradeBlockApi.md#createTradeBlockEvolutionClaim) | **POST** /v1/trade-block/evolutions/{id}/claim | Burn COSM and mint the evolved (or set-master) NFT for one of your unlocks.
[**createTradeBlockEvolutionRecipe**](TradeBlockApi.md#createTradeBlockEvolutionRecipe) | **POST** /v1/trade-block/evolution-recipes | Author a Trade Evolution recipe (a graded item or pair that, when swapped, unlocks a cosmetic you designed). Born unreviewed until ops approves.
[**createTradeBlockOfferRespond**](TradeBlockApi.md#createTradeBlockOfferRespond) | **POST** /v1/trade-block/offers/{id}/respond | Accept, decline, counter, or withdraw a Trade Block offer.
[**createTradeBlockPostClose**](TradeBlockApi.md#createTradeBlockPostClose) | **POST** /v1/trade-block/posts/{id}/close | Close one of your posts so it stops taking offers.
[**createTradeBlockPostOffer**](TradeBlockApi.md#createTradeBlockPostOffer) | **POST** /v1/trade-block/posts/{id}/offers | Respond to a post with a concrete swap: items on each side (0..N), optional cash.
[**createTradeBlockSetRecipe**](TradeBlockApi.md#createTradeBlockSetRecipe) | **POST** /v1/trade-block/set-recipes | Author a set-completion recipe (a set of items that, once assembled through trading, unlocks a set-master cosmetic you designed). Born unreviewed until ops approves.
[**getTradeBlockEvolution**](TradeBlockApi.md#getTradeBlockEvolution) | **GET** /v1/trade-block/evolutions | List your Trade Evolution unlocks — completed swaps that unlocked an evolved or set-master NFT you can mint by burning COSM.
[**getTradeBlockPost**](TradeBlockApi.md#getTradeBlockPost) | **GET** /v1/trade-block/posts | Browse open Trade Block posts (wants + offers) on the Crossly Market.
[**getTradeBlockPostById**](TradeBlockApi.md#getTradeBlockPostById) | **GET** /v1/trade-block/posts/{id} | Get one Trade Block post with its items and open-offer count.
[**getTradeBlockTrade**](TradeBlockApi.md#getTradeBlockTrade) | **GET** /v1/trade-block/trades | List the trades you are a party to, newest first.


<a name="createTradeBlockEvolutionClaim"></a>
# **createTradeBlockEvolutionClaim**
> CreateTradeBlockEvolutionClaimResponse createTradeBlockEvolutionClaim(id)

Burn COSM and mint the evolved (or set-master) NFT for one of your unlocks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TradeBlockApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateTradeBlockEvolutionClaimResponse = apiInstance.createTradeBlockEvolutionClaim(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradeBlockApi#createTradeBlockEvolutionClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradeBlockApi#createTradeBlockEvolutionClaim")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateTradeBlockEvolutionClaimResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTradeBlockEvolutionRecipe"></a>
# **createTradeBlockEvolutionRecipe**
> CreateTradeBlockEvolutionRecipeResponse createTradeBlockEvolutionRecipe()

Author a Trade Evolution recipe (a graded item or pair that, when swapped, unlocks a cosmetic you designed). Born unreviewed until ops approves.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TradeBlockApi()
try {
    val result : CreateTradeBlockEvolutionRecipeResponse = apiInstance.createTradeBlockEvolutionRecipe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradeBlockApi#createTradeBlockEvolutionRecipe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradeBlockApi#createTradeBlockEvolutionRecipe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateTradeBlockEvolutionRecipeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTradeBlockOfferRespond"></a>
# **createTradeBlockOfferRespond**
> CreateTradeBlockOfferRespondResponse createTradeBlockOfferRespond(id)

Accept, decline, counter, or withdraw a Trade Block offer.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TradeBlockApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateTradeBlockOfferRespondResponse = apiInstance.createTradeBlockOfferRespond(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradeBlockApi#createTradeBlockOfferRespond")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradeBlockApi#createTradeBlockOfferRespond")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateTradeBlockOfferRespondResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTradeBlockPostClose"></a>
# **createTradeBlockPostClose**
> OkResponse createTradeBlockPostClose(id)

Close one of your posts so it stops taking offers.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TradeBlockApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createTradeBlockPostClose(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradeBlockApi#createTradeBlockPostClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradeBlockApi#createTradeBlockPostClose")
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

<a name="createTradeBlockPostOffer"></a>
# **createTradeBlockPostOffer**
> IdResponse createTradeBlockPostOffer(id)

Respond to a post with a concrete swap: items on each side (0..N), optional cash.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TradeBlockApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : IdResponse = apiInstance.createTradeBlockPostOffer(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradeBlockApi#createTradeBlockPostOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradeBlockApi#createTradeBlockPostOffer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**IdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTradeBlockSetRecipe"></a>
# **createTradeBlockSetRecipe**
> CreateTradeBlockSetRecipeResponse createTradeBlockSetRecipe()

Author a set-completion recipe (a set of items that, once assembled through trading, unlocks a set-master cosmetic you designed). Born unreviewed until ops approves.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TradeBlockApi()
try {
    val result : CreateTradeBlockSetRecipeResponse = apiInstance.createTradeBlockSetRecipe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradeBlockApi#createTradeBlockSetRecipe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradeBlockApi#createTradeBlockSetRecipe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateTradeBlockSetRecipeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTradeBlockEvolution"></a>
# **getTradeBlockEvolution**
> GetTradeBlockEvolutionResponse getTradeBlockEvolution()

List your Trade Evolution unlocks — completed swaps that unlocked an evolved or set-master NFT you can mint by burning COSM.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TradeBlockApi()
try {
    val result : GetTradeBlockEvolutionResponse = apiInstance.getTradeBlockEvolution()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradeBlockApi#getTradeBlockEvolution")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradeBlockApi#getTradeBlockEvolution")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetTradeBlockEvolutionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTradeBlockPost"></a>
# **getTradeBlockPost**
> GetTradeBlockPostResponse getTradeBlockPost(kind, categorySlug, brand, model, q, limit, offset)

Browse open Trade Block posts (wants + offers) on the Crossly Market.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TradeBlockApi()
val kind : kotlin.String = kind_example // kotlin.String | Filter to wants or offers.
val categorySlug : kotlin.String = categorySlug_example // kotlin.String | Filter to a market category.
val brand : kotlin.String = brand_example // kotlin.String | Filter to posts with a product of this brand (case-insensitive).
val model : kotlin.String = model_example // kotlin.String | Filter to posts with a product of this catalogue model (case-insensitive).
val q : kotlin.String = q_example // kotlin.String | Search title + want text.
val limit : kotlin.Int = 56 // kotlin.Int | 
val offset : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : GetTradeBlockPostResponse = apiInstance.getTradeBlockPost(kind, categorySlug, brand, model, q, limit, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradeBlockApi#getTradeBlockPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradeBlockApi#getTradeBlockPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kind** | **kotlin.String**| Filter to wants or offers. | [optional] [enum: want, offer]
 **categorySlug** | **kotlin.String**| Filter to a market category. | [optional]
 **brand** | **kotlin.String**| Filter to posts with a product of this brand (case-insensitive). | [optional]
 **model** | **kotlin.String**| Filter to posts with a product of this catalogue model (case-insensitive). | [optional]
 **q** | **kotlin.String**| Search title + want text. | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 40]
 **offset** | **kotlin.Int**|  | [optional] [default to 0]

### Return type

**GetTradeBlockPostResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTradeBlockPostById"></a>
# **getTradeBlockPostById**
> GetTradeBlockPostByIdResponse getTradeBlockPostById(id)

Get one Trade Block post with its items and open-offer count.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TradeBlockApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetTradeBlockPostByIdResponse = apiInstance.getTradeBlockPostById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradeBlockApi#getTradeBlockPostById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradeBlockApi#getTradeBlockPostById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetTradeBlockPostByIdResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTradeBlockTrade"></a>
# **getTradeBlockTrade**
> GetTradeBlockTradeResponse getTradeBlockTrade()

List the trades you are a party to, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TradeBlockApi()
try {
    val result : GetTradeBlockTradeResponse = apiInstance.getTradeBlockTrade()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradeBlockApi#getTradeBlockTrade")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradeBlockApi#getTradeBlockTrade")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetTradeBlockTradeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

