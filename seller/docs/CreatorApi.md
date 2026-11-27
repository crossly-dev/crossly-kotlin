# CreatorApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCreatorExperienceKey**](CreatorApi.md#createCreatorExperienceKey) | **POST** /v1/creator/experience-keys | Issue an experience API key for a back-end or CI: name, creator scopes (worlds:*, items:write — only ones your token holds), an IP allowlist (CIDRs; 0.0.0.0/0 + ::/0 for anywhere), optional experienceIds and expiresInDays. The token is in the response ONCE.
[**createCreatorExperienceKeyRotate**](CreatorApi.md#createCreatorExperienceKeyRotate) | **POST** /v1/creator/experience-keys/{id}/rotate | Rotate a key: a replacement with the same settings (its token shown ONCE); the old key keeps working for overlapHours (default 24, 0 &#x3D; revoke now, max 168).
[**deleteCreatorExperienceKey**](CreatorApi.md#deleteCreatorExperienceKey) | **DELETE** /v1/creator/experience-keys/{id} | Revoke an experience key now. Never needs a plan: a credential must always be revocable.
[**getCreatorEntitlement**](CreatorApi.md#getCreatorEntitlement) | **GET** /v1/creator/entitlements | What you can do in Creator Studio: your plan, whether you can author, grandfathering, and every limit with used and remaining. Read by web, apps, SDK and MCP alike.
[**listCreatorExperienceKeys**](CreatorApi.md#listCreatorExperienceKeys) | **GET** /v1/creator/experience-keys | Your experience API keys, newest first (never the secret). ?includeRevoked&#x3D;true for the history; ?experienceId&#x3D; for the keys that reach one game (a game&#39;s own keys are narrowed to it alone). Cursor-paged: pass pagination.nextCursor back as ?cursor&#x3D;.


<a name="createCreatorExperienceKey"></a>
# **createCreatorExperienceKey**
> CreateCreatorExperienceKeyResponse createCreatorExperienceKey()

Issue an experience API key for a back-end or CI: name, creator scopes (worlds:*, items:write — only ones your token holds), an IP allowlist (CIDRs; 0.0.0.0/0 + ::/0 for anywhere), optional experienceIds and expiresInDays. The token is in the response ONCE.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorApi()
try {
    val result : CreateCreatorExperienceKeyResponse = apiInstance.createCreatorExperienceKey()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorApi#createCreatorExperienceKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorApi#createCreatorExperienceKey")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateCreatorExperienceKeyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCreatorExperienceKeyRotate"></a>
# **createCreatorExperienceKeyRotate**
> CreateCreatorExperienceKeyRotateResponse createCreatorExperienceKeyRotate(id)

Rotate a key: a replacement with the same settings (its token shown ONCE); the old key keeps working for overlapHours (default 24, 0 &#x3D; revoke now, max 168).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateCreatorExperienceKeyRotateResponse = apiInstance.createCreatorExperienceKeyRotate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorApi#createCreatorExperienceKeyRotate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorApi#createCreatorExperienceKeyRotate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateCreatorExperienceKeyRotateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCreatorExperienceKey"></a>
# **deleteCreatorExperienceKey**
> DeleteCreatorExperienceKeyResponse deleteCreatorExperienceKey(id)

Revoke an experience key now. Never needs a plan: a credential must always be revocable.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteCreatorExperienceKeyResponse = apiInstance.deleteCreatorExperienceKey(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorApi#deleteCreatorExperienceKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorApi#deleteCreatorExperienceKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteCreatorExperienceKeyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreatorEntitlement"></a>
# **getCreatorEntitlement**
> GetCreatorEntitlementResponse getCreatorEntitlement()

What you can do in Creator Studio: your plan, whether you can author, grandfathering, and every limit with used and remaining. Read by web, apps, SDK and MCP alike.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorApi()
try {
    val result : GetCreatorEntitlementResponse = apiInstance.getCreatorEntitlement()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorApi#getCreatorEntitlement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorApi#getCreatorEntitlement")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetCreatorEntitlementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCreatorExperienceKeys"></a>
# **listCreatorExperienceKeys**
> ListCreatorExperienceKeysResponse listCreatorExperienceKeys()

Your experience API keys, newest first (never the secret). ?includeRevoked&#x3D;true for the history; ?experienceId&#x3D; for the keys that reach one game (a game&#39;s own keys are narrowed to it alone). Cursor-paged: pass pagination.nextCursor back as ?cursor&#x3D;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CreatorApi()
try {
    val result : ListCreatorExperienceKeysResponse = apiInstance.listCreatorExperienceKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CreatorApi#listCreatorExperienceKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreatorApi#listCreatorExperienceKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListCreatorExperienceKeysResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

