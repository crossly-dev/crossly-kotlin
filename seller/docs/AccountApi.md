# AccountApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountCancelDeletion**](AccountApi.md#createAccountCancelDeletion) | **POST** /v1/account/cancel-deletion | Cancel a pending account deletion.
[**createAccountLogoutAll**](AccountApi.md#createAccountLogoutAll) | **POST** /v1/account/logout-all | Revoke every browser auth session for this user.
[**createAccountRequestDeletion**](AccountApi.md#createAccountRequestDeletion) | **POST** /v1/account/request-deletion | Schedule account deletion after a grace period.
[**deleteAuthSession**](AccountApi.md#deleteAuthSession) | **DELETE** /v1/auth/sessions | Revoke all active browser sessions.
[**deleteAuthSessionBySessionId**](AccountApi.md#deleteAuthSessionBySessionId) | **DELETE** /v1/auth/sessions/{sessionId} | Revoke a single browser session by id.
[**deleteConnectedApp**](AccountApi.md#deleteConnectedApp) | **DELETE** /v1/connected-apps/{grantId} | Disconnect a third-party app. Its tokens stop working immediately.
[**getAccountDeletionStatus**](AccountApi.md#getAccountDeletionStatus) | **GET** /v1/account/deletion-status | Get the currently-pending deletion request, if any.
[**getMe**](AccountApi.md#getMe) | **GET** /v1/me | Identity check — authenticated user + PAT scopes + account state.
[**listAuthSessions**](AccountApi.md#listAuthSessions) | **GET** /v1/auth/sessions | List active browser auth sessions.
[**listConnectedApps**](AccountApi.md#listConnectedApps) | **GET** /v1/connected-apps | List third-party OAuth apps with access to this account.


<a name="createAccountCancelDeletion"></a>
# **createAccountCancelDeletion**
> CreateAccountCancelDeletionResponse createAccountCancelDeletion()

Cancel a pending account deletion.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : CreateAccountCancelDeletionResponse = apiInstance.createAccountCancelDeletion()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#createAccountCancelDeletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#createAccountCancelDeletion")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateAccountCancelDeletionResponse**](CreateAccountCancelDeletionResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAccountLogoutAll"></a>
# **createAccountLogoutAll**
> CreateAccountLogoutAllResponse createAccountLogoutAll()

Revoke every browser auth session for this user.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : CreateAccountLogoutAllResponse = apiInstance.createAccountLogoutAll()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#createAccountLogoutAll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#createAccountLogoutAll")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateAccountLogoutAllResponse**](CreateAccountLogoutAllResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAccountRequestDeletion"></a>
# **createAccountRequestDeletion**
> CreateAccountRequestDeletionResponse createAccountRequestDeletion()

Schedule account deletion after a grace period.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : CreateAccountRequestDeletionResponse = apiInstance.createAccountRequestDeletion()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#createAccountRequestDeletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#createAccountRequestDeletion")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateAccountRequestDeletionResponse**](CreateAccountRequestDeletionResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAuthSession"></a>
# **deleteAuthSession**
> DeleteAuthSessionResponse deleteAuthSession()

Revoke all active browser sessions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : DeleteAuthSessionResponse = apiInstance.deleteAuthSession()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#deleteAuthSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#deleteAuthSession")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeleteAuthSessionResponse**](DeleteAuthSessionResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAuthSessionBySessionId"></a>
# **deleteAuthSessionBySessionId**
> DeleteAuthSessionBySessionIdResponse deleteAuthSessionBySessionId(sessionId)

Revoke a single browser session by id.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
val sessionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteAuthSessionBySessionIdResponse = apiInstance.deleteAuthSessionBySessionId(sessionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#deleteAuthSessionBySessionId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#deleteAuthSessionBySessionId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **java.util.UUID**|  |

### Return type

[**DeleteAuthSessionBySessionIdResponse**](DeleteAuthSessionBySessionIdResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteConnectedApp"></a>
# **deleteConnectedApp**
> DeleteConnectedAppResponse deleteConnectedApp(grantId)

Disconnect a third-party app. Its tokens stop working immediately.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
val grantId : kotlin.String = grantId_example // kotlin.String | 
try {
    val result : DeleteConnectedAppResponse = apiInstance.deleteConnectedApp(grantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#deleteConnectedApp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#deleteConnectedApp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantId** | **kotlin.String**|  |

### Return type

[**DeleteConnectedAppResponse**](DeleteConnectedAppResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountDeletionStatus"></a>
# **getAccountDeletionStatus**
> GetAccountDeletionStatusResponse getAccountDeletionStatus()

Get the currently-pending deletion request, if any.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : GetAccountDeletionStatusResponse = apiInstance.getAccountDeletionStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getAccountDeletionStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getAccountDeletionStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountDeletionStatusResponse**](GetAccountDeletionStatusResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMe"></a>
# **getMe**
> InlineResponse200 getMe()

Identity check — authenticated user + PAT scopes + account state.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : InlineResponse200 = apiInstance.getMe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getMe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAuthSessions"></a>
# **listAuthSessions**
> V1List listAuthSessions()

List active browser auth sessions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : V1List = apiInstance.listAuthSessions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#listAuthSessions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#listAuthSessions")
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

<a name="listConnectedApps"></a>
# **listConnectedApps**
> V1List listConnectedApps()

List third-party OAuth apps with access to this account.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : V1List = apiInstance.listConnectedApps()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#listConnectedApps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#listConnectedApps")
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

