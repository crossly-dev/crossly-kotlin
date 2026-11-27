# WalletApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWalletDefault**](WalletApi.md#deleteWalletDefault) | **DELETE** /v1/wallet/defaults | Clear a default (the purpose falls back to your only wallet, or none) or one override (&#x60;refKind&#x60; + &#x60;refKey&#x60;).
[**listWalletDefaults**](WalletApi.md#listWalletDefaults) | **GET** /v1/wallet/defaults | Your default wallet per purpose (royalties, deploys, drops, game rewards, staking, CBX withdrawals), with per-collection and per-game overrides and what each resolves to today.
[**updateWalletDefault**](WalletApi.md#updateWalletDefault) | **PUT** /v1/wallet/defaults | Set the default wallet for a purpose, or an override for one collection (&#x60;ref: { kind: \&quot;collection\&quot;, chain, contract }&#x60;) or game (&#x60;ref: { kind: \&quot;game\&quot;, experienceId }&#x60;). The wallet must be yours, verified, and on a network the purpose accepts.


<a name="deleteWalletDefault"></a>
# **deleteWalletDefault**
> WalletResponse deleteWalletDefault()

Clear a default (the purpose falls back to your only wallet, or none) or one override (&#x60;refKind&#x60; + &#x60;refKey&#x60;).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WalletApi()
try {
    val result : WalletResponse = apiInstance.deleteWalletDefault()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#deleteWalletDefault")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#deleteWalletDefault")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**WalletResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWalletDefaults"></a>
# **listWalletDefaults**
> WalletResponse listWalletDefaults()

Your default wallet per purpose (royalties, deploys, drops, game rewards, staking, CBX withdrawals), with per-collection and per-game overrides and what each resolves to today.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WalletApi()
try {
    val result : WalletResponse = apiInstance.listWalletDefaults()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#listWalletDefaults")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#listWalletDefaults")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**WalletResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWalletDefault"></a>
# **updateWalletDefault**
> WalletResponse updateWalletDefault()

Set the default wallet for a purpose, or an override for one collection (&#x60;ref: { kind: \&quot;collection\&quot;, chain, contract }&#x60;) or game (&#x60;ref: { kind: \&quot;game\&quot;, experienceId }&#x60;). The wallet must be yours, verified, and on a network the purpose accepts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WalletApi()
try {
    val result : WalletResponse = apiInstance.updateWalletDefault()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#updateWalletDefault")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#updateWalletDefault")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**WalletResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

