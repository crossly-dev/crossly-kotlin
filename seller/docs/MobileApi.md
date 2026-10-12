# MobileApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMobilePushTest**](MobileApi.md#createMobilePushTest) | **POST** /v1/mobile/push-test | Fire a no-op test push to this user&#39;s devices.
[**createMobilePushToken**](MobileApi.md#createMobilePushToken) | **POST** /v1/mobile/push-token | Register an Expo push token for this user.
[**deleteMobilePushToken**](MobileApi.md#deleteMobilePushToken) | **DELETE** /v1/mobile/push-tokens | Clear ALL registered push tokens for this user.
[**listMobilePushTokens**](MobileApi.md#listMobilePushTokens) | **GET** /v1/mobile/push-tokens | List registered Expo push tokens (masked).


<a name="createMobilePushTest"></a>
# **createMobilePushTest**
> OkResponse createMobilePushTest()

Fire a no-op test push to this user&#39;s devices.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MobileApi()
try {
    val result : OkResponse = apiInstance.createMobilePushTest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MobileApi#createMobilePushTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MobileApi#createMobilePushTest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMobilePushToken"></a>
# **createMobilePushToken**
> OkResponse createMobilePushToken()

Register an Expo push token for this user.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MobileApi()
try {
    val result : OkResponse = apiInstance.createMobilePushToken()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MobileApi#createMobilePushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MobileApi#createMobilePushToken")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteMobilePushToken"></a>
# **deleteMobilePushToken**
> DeleteMobilePushTokenResponse deleteMobilePushToken()

Clear ALL registered push tokens for this user.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MobileApi()
try {
    val result : DeleteMobilePushTokenResponse = apiInstance.deleteMobilePushToken()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MobileApi#deleteMobilePushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MobileApi#deleteMobilePushToken")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**DeleteMobilePushTokenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMobilePushTokens"></a>
# **listMobilePushTokens**
> ListMobilePushTokensResponse listMobilePushTokens()

List registered Expo push tokens (masked).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = MobileApi()
try {
    val result : ListMobilePushTokensResponse = apiInstance.listMobilePushTokens()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MobileApi#listMobilePushTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MobileApi#listMobilePushTokens")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListMobilePushTokensResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

