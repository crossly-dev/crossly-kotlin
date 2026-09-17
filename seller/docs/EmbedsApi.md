# EmbedsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbedKey**](EmbedsApi.md#createEmbedKey) | **POST** /v1/embeds/keys | Mint a publishable key for a site.
[**deleteEmbedKey**](EmbedsApi.md#deleteEmbedKey) | **DELETE** /v1/embeds/keys/{id} | Revoke a publishable key.
[**listEmbedKeys**](EmbedsApi.md#listEmbedKeys) | **GET** /v1/embeds/keys | Your publishable keys.


<a name="createEmbedKey"></a>
# **createEmbedKey**
> CreateEmbedKeyResponse createEmbedKey(inlineObject3)

Mint a publishable key for a site.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = EmbedsApi()
val inlineObject3 : InlineObject3 =  // InlineObject3 | 
try {
    val result : CreateEmbedKeyResponse = apiInstance.createEmbedKey(inlineObject3)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmbedsApi#createEmbedKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmbedsApi#createEmbedKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  |

### Return type

[**CreateEmbedKeyResponse**](CreateEmbedKeyResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmbedKey"></a>
# **deleteEmbedKey**
> deleteEmbedKey(id)

Revoke a publishable key.

Takes effect immediately. Any site still using it will show an empty catalog, so replace the key in the page before revoking the old one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = EmbedsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    apiInstance.deleteEmbedKey(id)
} catch (e: ClientException) {
    println("4xx response calling EmbedsApi#deleteEmbedKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmbedsApi#deleteEmbedKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEmbedKeys"></a>
# **listEmbedKeys**
> V1List listEmbedKeys()

Your publishable keys.

Publishable keys are safe to put in a public web page — they can read your own active listings and start a checkout, and nothing else. The key is shown in full because it is not a secret.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = EmbedsApi()
try {
    val result : V1List = apiInstance.listEmbedKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmbedsApi#listEmbedKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmbedsApi#listEmbedKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

