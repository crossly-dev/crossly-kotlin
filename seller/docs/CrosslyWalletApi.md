# CrosslyWalletApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTcgNftReconcile**](CrosslyWalletApi.md#createTcgNftReconcile) | **POST** /v1/tcg/nfts/reconcile | Re-read your wallets on chain so your card counts follow what you hold (cards you moved away leave; cards you received join).
[**createWalletCrossly**](CrosslyWalletApi.md#createWalletCrossly) | **POST** /v1/wallet/crossly | Create your Crossly wallet now (it is otherwise created for you in the background). Idempotent.
[**getWalletCrossly**](CrosslyWalletApi.md#getWalletCrossly) | **GET** /v1/wallet/crossly | Your Crossly wallet (self-custody Solana): status, address, whether it is configured, and your card NFT counts by status.
[**listTcgNfts**](CrosslyWalletApi.md#listTcgNfts) | **GET** /v1/tcg/{game}/nfts | Your card NFTs for a Crossly TCG game: each copy, its mint status, asset id and whether it is soulbound (starter).


<a name="createTcgNftReconcile"></a>
# **createTcgNftReconcile**
> CreateTcgNftReconcileResponse createTcgNftReconcile()

Re-read your wallets on chain so your card counts follow what you hold (cards you moved away leave; cards you received join).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CrosslyWalletApi()
try {
    val result : CreateTcgNftReconcileResponse = apiInstance.createTcgNftReconcile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrosslyWalletApi#createTcgNftReconcile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrosslyWalletApi#createTcgNftReconcile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateTcgNftReconcileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWalletCrossly"></a>
# **createWalletCrossly**
> GetWalletCrosslyResponse createWalletCrossly()

Create your Crossly wallet now (it is otherwise created for you in the background). Idempotent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CrosslyWalletApi()
try {
    val result : GetWalletCrosslyResponse = apiInstance.createWalletCrossly()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrosslyWalletApi#createWalletCrossly")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrosslyWalletApi#createWalletCrossly")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWalletCrosslyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWalletCrossly"></a>
# **getWalletCrossly**
> GetWalletCrosslyResponse getWalletCrossly()

Your Crossly wallet (self-custody Solana): status, address, whether it is configured, and your card NFT counts by status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CrosslyWalletApi()
try {
    val result : GetWalletCrosslyResponse = apiInstance.getWalletCrossly()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrosslyWalletApi#getWalletCrossly")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrosslyWalletApi#getWalletCrossly")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWalletCrosslyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTcgNfts"></a>
# **listTcgNfts**
> ListTcgNftsResponse listTcgNfts(game)

Your card NFTs for a Crossly TCG game: each copy, its mint status, asset id and whether it is soulbound (starter).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CrosslyWalletApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : ListTcgNftsResponse = apiInstance.listTcgNfts(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CrosslyWalletApi#listTcgNfts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CrosslyWalletApi#listTcgNfts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**ListTcgNftsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

