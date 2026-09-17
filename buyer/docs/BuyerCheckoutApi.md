# BuyerCheckoutApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerCheckout**](BuyerCheckoutApi.md#createBuyerCheckout) | **POST** /v1/buyer/checkout | Buy a listing without being present.
[**getBuyerCheckoutControl**](BuyerCheckoutApi.md#getBuyerCheckoutControl) | **GET** /v1/buyer/checkout/controls | What this key is allowed to spend.
[**updateBuyerCheckoutControl**](BuyerCheckoutApi.md#updateBuyerCheckoutControl) | **PUT** /v1/buyer/checkout/controls | Switch this key on for spending, and set its limits.


<a name="createBuyerCheckout"></a>
# **createBuyerCheckout**
> CreateBuyerCheckoutResponse createBuyerCheckout()

Buy a listing without being present.

An Idempotency-Key header is REQUIRED — this endpoint refuses without one, because a retried request would otherwise buy the item twice and a retry is the most likely thing an automated buyer does. Derive the key from what you are buying and reuse it across retries; a fresh random value per attempt satisfies the check and keeps the bug. The item is QUOTED first and the delivered total is checked against both your maxTotalCents and this key&#39;s limits before anything is charged. A card that demands 3-D Secure cannot be charged unattended; that answers 402 with &#x60;authentication_required&#x60; and the purchase must be finished on Crossly.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCheckoutApi()
try {
    val result : CreateBuyerCheckoutResponse = apiInstance.createBuyerCheckout()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCheckoutApi#createBuyerCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCheckoutApi#createBuyerCheckout")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateBuyerCheckoutResponse**](CreateBuyerCheckoutResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerCheckoutControl"></a>
# **getBuyerCheckoutControl**
> GetBuyerCheckoutControlResponse getBuyerCheckoutControl()

What this key is allowed to spend.

Reports the controls for the key making the call — not for your account. Every key has its own switch and its own limits.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCheckoutApi()
try {
    val result : GetBuyerCheckoutControlResponse = apiInstance.getBuyerCheckoutControl()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCheckoutApi#getBuyerCheckoutControl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCheckoutApi#getBuyerCheckoutControl")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBuyerCheckoutControlResponse**](GetBuyerCheckoutControlResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerCheckoutControl"></a>
# **updateBuyerCheckoutControl**
> UpdateBuyerCheckoutControlResponse updateBuyerCheckoutControl()

Switch this key on for spending, and set its limits.

A key can only ever raise or lower ITS OWN limits, and only if the token already carries buyer:checkout:write. Turning it off takes effect immediately.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerCheckoutApi()
try {
    val result : UpdateBuyerCheckoutControlResponse = apiInstance.updateBuyerCheckoutControl()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerCheckoutApi#updateBuyerCheckoutControl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerCheckoutApi#updateBuyerCheckoutControl")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UpdateBuyerCheckoutControlResponse**](UpdateBuyerCheckoutControlResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

