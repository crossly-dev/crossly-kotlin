# OffersApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOfferRespond**](OffersApi.md#createOfferRespond) | **POST** /v1/offers/{id}/respond | Accept, decline, or counter a buyer offer on a Crossly marketplace listing.
[**getOffer**](OffersApi.md#getOffer) | **GET** /v1/offers | List buyer offers on your Crossly marketplace listings, including bundles.


<a name="createOfferRespond"></a>
# **createOfferRespond**
> CreateOfferRespondResponse createOfferRespond(id, inlineObject2)

Accept, decline, or counter a buyer offer on a Crossly marketplace listing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OffersApi()
val id : kotlin.String = id_example // kotlin.String | Offer UUID.
val inlineObject2 : InlineObject2 =  // InlineObject2 | 
try {
    val result : CreateOfferRespondResponse = apiInstance.createOfferRespond(id, inlineObject2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OffersApi#createOfferRespond")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OffersApi#createOfferRespond")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Offer UUID. |
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  |

### Return type

[**CreateOfferRespondResponse**](CreateOfferRespondResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOffer"></a>
# **getOffer**
> GetOfferResponse getOffer(status, limit)

List buyer offers on your Crossly marketplace listings, including bundles.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = OffersApi()
val status : kotlin.String = status_example // kotlin.String | Filter to one status. Omit for all.
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : GetOfferResponse = apiInstance.getOffer(status, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OffersApi#getOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OffersApi#getOffer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **kotlin.String**| Filter to one status. Omit for all. | [optional] [enum: pending, accepted, declined, countered, expired, withdrawn]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]

### Return type

[**GetOfferResponse**](GetOfferResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

