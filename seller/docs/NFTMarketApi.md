# NFTMarketApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNftMarketExternalResale**](NFTMarketApi.md#createNftMarketExternalResale) | **POST** /v1/nft-market/external-resale | Ops: record a Crossly NFT resold on ANY marketplace — maps mint → design and funds the pot. Admin PAT only.
[**createNftMarketListing**](NFTMarketApi.md#createNftMarketListing) | **POST** /v1/nft-market/listings | List an NFT you own for resale on the Crossly marketplace.
[**createNftMarketListingCancel**](NFTMarketApi.md#createNftMarketListingCancel) | **POST** /v1/nft-market/listings/{id}/cancel | Cancel one of your open NFT listings.
[**createNftMarketListingConfirmSale**](NFTMarketApi.md#createNftMarketListingConfirmSale) | **POST** /v1/nft-market/listings/{id}/confirm-sale | Ops: record a finalized on-Crossly NFT sale (verifies the royalty landed, funds the pot). Admin PAT only.
[**getNftMarketListing**](NFTMarketApi.md#getNftMarketListing) | **GET** /v1/nft-market/listings | Browse open on-platform NFT listings (Crossly cosmetics for resale in CBX/SOL).


<a name="createNftMarketExternalResale"></a>
# **createNftMarketExternalResale**
> CreateNftMarketExternalResaleResponse createNftMarketExternalResale()

Ops: record a Crossly NFT resold on ANY marketplace — maps mint → design and funds the pot. Admin PAT only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NFTMarketApi()
try {
    val result : CreateNftMarketExternalResaleResponse = apiInstance.createNftMarketExternalResale()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NFTMarketApi#createNftMarketExternalResale")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NFTMarketApi#createNftMarketExternalResale")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateNftMarketExternalResaleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNftMarketListing"></a>
# **createNftMarketListing**
> CreateNftMarketListingResponse createNftMarketListing()

List an NFT you own for resale on the Crossly marketplace.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NFTMarketApi()
try {
    val result : CreateNftMarketListingResponse = apiInstance.createNftMarketListing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NFTMarketApi#createNftMarketListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NFTMarketApi#createNftMarketListing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateNftMarketListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNftMarketListingCancel"></a>
# **createNftMarketListingCancel**
> OkResponse createNftMarketListingCancel(id)

Cancel one of your open NFT listings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NFTMarketApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createNftMarketListingCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NFTMarketApi#createNftMarketListingCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NFTMarketApi#createNftMarketListingCancel")
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

<a name="createNftMarketListingConfirmSale"></a>
# **createNftMarketListingConfirmSale**
> OkResponse createNftMarketListingConfirmSale(id)

Ops: record a finalized on-Crossly NFT sale (verifies the royalty landed, funds the pot). Admin PAT only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NFTMarketApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createNftMarketListingConfirmSale(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NFTMarketApi#createNftMarketListingConfirmSale")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NFTMarketApi#createNftMarketListingConfirmSale")
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

<a name="getNftMarketListing"></a>
# **getNftMarketListing**
> GetNftMarketListingResponse getNftMarketListing()

Browse open on-platform NFT listings (Crossly cosmetics for resale in CBX/SOL).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NFTMarketApi()
try {
    val result : GetNftMarketListingResponse = apiInstance.getNftMarketListing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NFTMarketApi#getNftMarketListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NFTMarketApi#getNftMarketListing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetNftMarketListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

