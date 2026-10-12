# StorefrontApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStorefrontShipping**](StorefrontApi.md#getStorefrontShipping) | **GET** /v1/storefront/shipping | Your Crossly shipping policy (domestic and international services, which countries you ship to) and your default ship-from address.
[**updateStorefrontShipping**](StorefrontApi.md#updateStorefrontShipping) | **PUT** /v1/storefront/shipping | Set your shipping policy (international.enabled, shipsTo worldwide or ISO codes, excludes) and/or your default ship-from address (any country; 422 for a sanctioned origin).


<a name="getStorefrontShipping"></a>
# **getStorefrontShipping**
> GetStorefrontShippingResponse getStorefrontShipping()

Your Crossly shipping policy (domestic and international services, which countries you ship to) and your default ship-from address.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : GetStorefrontShippingResponse = apiInstance.getStorefrontShipping()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#getStorefrontShipping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#getStorefrontShipping")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontShippingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontShipping"></a>
# **updateStorefrontShipping**
> GetStorefrontShippingResponse updateStorefrontShipping()

Set your shipping policy (international.enabled, shipsTo worldwide or ISO codes, excludes) and/or your default ship-from address (any country; 422 for a sanctioned origin).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontApi()
try {
    val result : GetStorefrontShippingResponse = apiInstance.updateStorefrontShipping()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontApi#updateStorefrontShipping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontApi#updateStorefrontShipping")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontShippingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

