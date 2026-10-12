# AccountsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](AccountsApi.md#createAccount) | **POST** /v1/accounts | Connect a new platform account (kicks off OAuth or extension handshake).
[**createConnectionEmailImap**](AccountsApi.md#createConnectionEmailImap) | **POST** /v1/connections/email/imap | Add an IMAP mailbox connection.
[**createConnectionEmailImapTest**](AccountsApi.md#createConnectionEmailImapTest) | **POST** /v1/connections/email/imap/test | Validate IMAP credentials without persisting.
[**createConnectionRequest**](AccountsApi.md#createConnectionRequest) | **POST** /v1/connections/{platform}/request | Express interest in a request_only platform.
[**createPlatformAccountConnect**](AccountsApi.md#createPlatformAccountConnect) | **POST** /v1/platform-accounts/{platform}/connect | Revive or initiate connection for a cookie platform.
[**createPlatformAccountDisconnect**](AccountsApi.md#createPlatformAccountDisconnect) | **POST** /v1/platform-accounts/{platform}/disconnect | Archive every active account row for a platform.
[**createPlatformAccountHistoryImport**](AccountsApi.md#createPlatformAccountHistoryImport) | **POST** /v1/platform-accounts/{platform}/history-import | Set how far back to backfill order history + active listings for a platform, and run it now.
[**createPlatformAccountRefreshStatus**](AccountsApi.md#createPlatformAccountRefreshStatus) | **POST** /v1/platform-accounts/refresh-status | Run on-demand healthchecks across cookie accounts.
[**deleteAccount**](AccountsApi.md#deleteAccount) | **DELETE** /v1/accounts/{id} | Disconnect a platform account.
[**deleteConnectionById**](AccountsApi.md#deleteConnectionById) | **DELETE** /v1/connections/by-id/{id} | Disconnect a specific OAuth connection by id.
[**deleteConnectionEmailImap**](AccountsApi.md#deleteConnectionEmailImap) | **DELETE** /v1/connections/email/imap/{id} | Remove an IMAP mailbox connection.
[**getConnectionEmail**](AccountsApi.md#getConnectionEmail) | **GET** /v1/connections/email | List IMAP and email-OAuth connections.
[**getConnectionExtensionOnline**](AccountsApi.md#getConnectionExtensionOnline) | **GET** /v1/connections/extension-online | Check if the browser extension is online.
[**getOauthInit**](AccountsApi.md#getOauthInit) | **GET** /v1/oauth/{platform}/init | Return the OAuth authorize URL for an API-track platform.
[**getPlatformLimit**](AccountsApi.md#getPlatformLimit) | **GET** /v1/platforms/limits | eBay free-tier + Etsy fees aggregate.
[**listAccounts**](AccountsApi.md#listAccounts) | **GET** /v1/accounts | List your connected platform accounts.
[**listConnections**](AccountsApi.md#listConnections) | **GET** /v1/connections | List OAuth-connected API platforms.
[**updateConnectionEmailImap**](AccountsApi.md#updateConnectionEmailImap) | **PATCH** /v1/connections/email/imap/{id} | Edit an IMAP mailbox connection.
[**updatePlatformPreference**](AccountsApi.md#updatePlatformPreference) | **PATCH** /v1/platforms/{platform}/preferences | Update per-platform connection preferences.


<a name="createAccount"></a>
# **createAccount**
> CreateAccountResponse createAccount()

Connect a new platform account (kicks off OAuth or extension handshake).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
try {
    val result : CreateAccountResponse = apiInstance.createAccount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createAccount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAccountResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createConnectionEmailImap"></a>
# **createConnectionEmailImap**
> CreateConnectionEmailImapResponse createConnectionEmailImap()

Add an IMAP mailbox connection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
try {
    val result : CreateConnectionEmailImapResponse = apiInstance.createConnectionEmailImap()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createConnectionEmailImap")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createConnectionEmailImap")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateConnectionEmailImapResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createConnectionEmailImapTest"></a>
# **createConnectionEmailImapTest**
> CreateConnectionEmailImapTestResponse createConnectionEmailImapTest()

Validate IMAP credentials without persisting.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
try {
    val result : CreateConnectionEmailImapTestResponse = apiInstance.createConnectionEmailImapTest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createConnectionEmailImapTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createConnectionEmailImapTest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateConnectionEmailImapTestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createConnectionRequest"></a>
# **createConnectionRequest**
> OkResponse createConnectionRequest(platform)

Express interest in a request_only platform.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createConnectionRequest(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createConnectionRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createConnectionRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPlatformAccountConnect"></a>
# **createPlatformAccountConnect**
> CreatePlatformAccountConnectResponse createPlatformAccountConnect(platform)

Revive or initiate connection for a cookie platform.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : CreatePlatformAccountConnectResponse = apiInstance.createPlatformAccountConnect(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createPlatformAccountConnect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createPlatformAccountConnect")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |

### Return type

**CreatePlatformAccountConnectResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPlatformAccountDisconnect"></a>
# **createPlatformAccountDisconnect**
> CreatePlatformAccountDisconnectResponse createPlatformAccountDisconnect(platform)

Archive every active account row for a platform.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : CreatePlatformAccountDisconnectResponse = apiInstance.createPlatformAccountDisconnect(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createPlatformAccountDisconnect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createPlatformAccountDisconnect")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |

### Return type

**CreatePlatformAccountDisconnectResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPlatformAccountHistoryImport"></a>
# **createPlatformAccountHistoryImport**
> CreatePlatformAccountHistoryImportResponse createPlatformAccountHistoryImport(platform, createPlatformAccountHistoryImportRequest)

Set how far back to backfill order history + active listings for a platform, and run it now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val createPlatformAccountHistoryImportRequest : CreatePlatformAccountHistoryImportRequest =  // CreatePlatformAccountHistoryImportRequest | 
try {
    val result : CreatePlatformAccountHistoryImportResponse = apiInstance.createPlatformAccountHistoryImport(platform, createPlatformAccountHistoryImportRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createPlatformAccountHistoryImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createPlatformAccountHistoryImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **createPlatformAccountHistoryImportRequest** | **CreatePlatformAccountHistoryImportRequest**|  |

### Return type

**CreatePlatformAccountHistoryImportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPlatformAccountRefreshStatus"></a>
# **createPlatformAccountRefreshStatus**
> CreatePlatformAccountRefreshStatusResponse createPlatformAccountRefreshStatus()

Run on-demand healthchecks across cookie accounts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
try {
    val result : CreatePlatformAccountRefreshStatusResponse = apiInstance.createPlatformAccountRefreshStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createPlatformAccountRefreshStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createPlatformAccountRefreshStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreatePlatformAccountRefreshStatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAccount"></a>
# **deleteAccount**
> OkResponse deleteAccount(id)

Disconnect a platform account.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteAccount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#deleteAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#deleteAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteConnectionById"></a>
# **deleteConnectionById**
> SuccessResponse deleteConnectionById(id)

Disconnect a specific OAuth connection by id.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SuccessResponse = apiInstance.deleteConnectionById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#deleteConnectionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#deleteConnectionById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**SuccessResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteConnectionEmailImap"></a>
# **deleteConnectionEmailImap**
> SuccessResponse deleteConnectionEmailImap(id)

Remove an IMAP mailbox connection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SuccessResponse = apiInstance.deleteConnectionEmailImap(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#deleteConnectionEmailImap")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#deleteConnectionEmailImap")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**SuccessResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionEmail"></a>
# **getConnectionEmail**
> GetConnectionEmailResponse getConnectionEmail()

List IMAP and email-OAuth connections.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
try {
    val result : GetConnectionEmailResponse = apiInstance.getConnectionEmail()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getConnectionEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getConnectionEmail")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetConnectionEmailResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionExtensionOnline"></a>
# **getConnectionExtensionOnline**
> GetConnectionExtensionOnlineResponse getConnectionExtensionOnline()

Check if the browser extension is online.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
try {
    val result : GetConnectionExtensionOnlineResponse = apiInstance.getConnectionExtensionOnline()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getConnectionExtensionOnline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getConnectionExtensionOnline")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetConnectionExtensionOnlineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOauthInit"></a>
# **getOauthInit**
> GetOauthInitResponse getOauthInit(platform, shop, region, siteUrl)

Return the OAuth authorize URL for an API-track platform.

Most platforms return &#x60;{ url }&#x60;. Etsy adds &#x60;{ correlationId }&#x60; (PKCE verifier stashed in Redis). Bonanza adds &#x60;{ oneShot: true }&#x60;. WooCommerce requires &#x60;?siteUrl&#x3D;...&#x60;. Walmart returns &#x60;{ status: \&quot;request_only\&quot;, requestUrl, message }&#x60; instead of a URL because per-seller OAuth needs Solution Provider approval.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val shop : kotlin.String = shop_example // kotlin.String | 
val region : kotlin.String = region_example // kotlin.String | 
val siteUrl : kotlin.String = siteUrl_example // kotlin.String | 
try {
    val result : GetOauthInitResponse = apiInstance.getOauthInit(platform, shop, region, siteUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getOauthInit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getOauthInit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **shop** | **kotlin.String**|  | [optional]
 **region** | **kotlin.String**|  | [optional]
 **siteUrl** | **kotlin.String**|  | [optional]

### Return type

**GetOauthInitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPlatformLimit"></a>
# **getPlatformLimit**
> GetPlatformLimitResponse getPlatformLimit()

eBay free-tier + Etsy fees aggregate.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
try {
    val result : GetPlatformLimitResponse = apiInstance.getPlatformLimit()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getPlatformLimit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getPlatformLimit")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetPlatformLimitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAccounts"></a>
# **listAccounts**
> ListAccountsResponse listAccounts()

List your connected platform accounts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
try {
    val result : ListAccountsResponse = apiInstance.listAccounts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#listAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#listAccounts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListAccountsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listConnections"></a>
# **listConnections**
> ListConnectionsResponse listConnections()

List OAuth-connected API platforms.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
try {
    val result : ListConnectionsResponse = apiInstance.listConnections()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#listConnections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#listConnections")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListConnectionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateConnectionEmailImap"></a>
# **updateConnectionEmailImap**
> SuccessResponse updateConnectionEmailImap(id)

Edit an IMAP mailbox connection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SuccessResponse = apiInstance.updateConnectionEmailImap(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#updateConnectionEmailImap")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#updateConnectionEmailImap")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**SuccessResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePlatformPreference"></a>
# **updatePlatformPreference**
> UpdatePlatformPreferenceResponse updatePlatformPreference(platform, connectionId)

Update per-platform connection preferences.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountsApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val connectionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdatePlatformPreferenceResponse = apiInstance.updatePlatformPreference(platform, connectionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#updatePlatformPreference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#updatePlatformPreference")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **connectionId** | **java.util.UUID**|  | [optional]

### Return type

**UpdatePlatformPreferenceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

