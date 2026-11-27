# AccountApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountCancelDeletion**](AccountApi.md#createAccountCancelDeletion) | **POST** /v1/account/cancel-deletion | Cancel a pending account deletion.
[**createAccountIdentityVerificationStart**](AccountApi.md#createAccountIdentityVerificationStart) | **POST** /v1/account/identity-verification/start | Start the identity check (photo ID + selfie). Returns a Stripe-hosted URL the person completes.
[**createAccountLogoutAll**](AccountApi.md#createAccountLogoutAll) | **POST** /v1/account/logout-all | Revoke every browser auth session for this user.
[**createAccountReconfirmDeletion**](AccountApi.md#createAccountReconfirmDeletion) | **POST** /v1/account/reconfirm-deletion | Confirm again a deletion paused because the account was in use.
[**createAccountRequestDeletion**](AccountApi.md#createAccountRequestDeletion) | **POST** /v1/account/request-deletion | Schedule account deletion after a grace period. Requires confirmEmail.
[**deleteAuthSession**](AccountApi.md#deleteAuthSession) | **DELETE** /v1/auth/sessions | Revoke all active browser sessions.
[**deleteAuthSessionBySessionId**](AccountApi.md#deleteAuthSessionBySessionId) | **DELETE** /v1/auth/sessions/{sessionId} | Revoke a single browser session by id.
[**deleteConnectedApp**](AccountApi.md#deleteConnectedApp) | **DELETE** /v1/connected-apps/{grantId} | Disconnect a third-party app. Its tokens stop working immediately.
[**getAccountClosureChecklist**](AccountApi.md#getAccountClosureChecklist) | **GET** /v1/account/closure-checklist | What closing the account will and will not do, before you request it.
[**getAccountDeletionStatus**](AccountApi.md#getAccountDeletionStatus) | **GET** /v1/account/deletion-status | Get the currently-pending deletion request, if any.
[**getAccountIdentityVerification**](AccountApi.md#getAccountIdentityVerification) | **GET** /v1/account/identity-verification | Your identity verification: one status for the whole account, read by every feature that needs ID.
[**getMe**](AccountApi.md#getMe) | **GET** /v1/me | Identity check — authenticated user + PAT scopes + account state.
[**getMembership**](AccountApi.md#getMembership) | **GET** /v1/membership | The caller&#39;s Crossly One membership status and benefits.
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

**CreateAccountCancelDeletionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAccountIdentityVerificationStart"></a>
# **createAccountIdentityVerificationStart**
> CreateWorldMatureVerifyResponse createAccountIdentityVerificationStart(createAccountIdentityVerificationStartRequest)

Start the identity check (photo ID + selfie). Returns a Stripe-hosted URL the person completes.

alreadyVerified:true when there is nothing to do. Nothing is verified until a person completes the link.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
val createAccountIdentityVerificationStartRequest : CreateAccountIdentityVerificationStartRequest =  // CreateAccountIdentityVerificationStartRequest | 
try {
    val result : CreateWorldMatureVerifyResponse = apiInstance.createAccountIdentityVerificationStart(createAccountIdentityVerificationStartRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#createAccountIdentityVerificationStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#createAccountIdentityVerificationStart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAccountIdentityVerificationStartRequest** | **CreateAccountIdentityVerificationStartRequest**|  |

### Return type

**CreateWorldMatureVerifyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
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

**CreateAccountLogoutAllResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAccountReconfirmDeletion"></a>
# **createAccountReconfirmDeletion**
> CreateAccountReconfirmDeletionResponse createAccountReconfirmDeletion()

Confirm again a deletion paused because the account was in use.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : CreateAccountReconfirmDeletionResponse = apiInstance.createAccountReconfirmDeletion()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#createAccountReconfirmDeletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#createAccountReconfirmDeletion")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAccountReconfirmDeletionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAccountRequestDeletion"></a>
# **createAccountRequestDeletion**
> CreateAccountRequestDeletionResponse createAccountRequestDeletion()

Schedule account deletion after a grace period. Requires confirmEmail.

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

**CreateAccountRequestDeletionResponse**

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

**DeleteAuthSessionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAuthSessionBySessionId"></a>
# **deleteAuthSessionBySessionId**
> SuccessResponse deleteAuthSessionBySessionId(sessionId)

Revoke a single browser session by id.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
val sessionId : kotlin.String = sessionId_example // kotlin.String | 
try {
    val result : SuccessResponse = apiInstance.deleteAuthSessionBySessionId(sessionId)
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
 **sessionId** | **kotlin.String**|  |

### Return type

**SuccessResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteConnectedApp"></a>
# **deleteConnectedApp**
> OkResponse deleteConnectedApp(grantId)

Disconnect a third-party app. Its tokens stop working immediately.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
val grantId : kotlin.String = grantId_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.deleteConnectedApp(grantId)
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

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountClosureChecklist"></a>
# **getAccountClosureChecklist**
> GetAccountClosureChecklistResponse getAccountClosureChecklist()

What closing the account will and will not do, before you request it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : GetAccountClosureChecklistResponse = apiInstance.getAccountClosureChecklist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getAccountClosureChecklist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getAccountClosureChecklist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetAccountClosureChecklistResponse**

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

**GetAccountDeletionStatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountIdentityVerification"></a>
# **getAccountIdentityVerification**
> GetAccountIdentityVerificationResponse getAccountIdentityVerification()

Your identity verification: one status for the whole account, read by every feature that needs ID.

status is unverified, requires_input, processing, verified or canceled. requires_input with a lastError { code, reason } is a failed try the person can redo on the same link (start returns it); processing is being reviewed; neither is a decline, only canceled is. attempts counts the failed tries. ageVerified passes the age-restricted checkout gate. message is the next step in words (null once verified).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : GetAccountIdentityVerificationResponse = apiInstance.getAccountIdentityVerification()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getAccountIdentityVerification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getAccountIdentityVerification")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetAccountIdentityVerificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMe"></a>
# **getMe**
> GetMeResponse getMe()

Identity check — authenticated user + PAT scopes + account state.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : GetMeResponse = apiInstance.getMe()
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

**GetMeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMembership"></a>
# **getMembership**
> GetMembershipResponse getMembership()

The caller&#39;s Crossly One membership status and benefits.

Returns the active tier (or null), the period end, and the concrete benefit values for that tier. Benefits are the single source of truth shared with the web and mobile clients.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : GetMembershipResponse = apiInstance.getMembership()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getMembership")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getMembership")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetMembershipResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAuthSessions"></a>
# **listAuthSessions**
> ListAuthSessionsResponse listAuthSessions()

List active browser auth sessions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : ListAuthSessionsResponse = apiInstance.listAuthSessions()
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

**ListAuthSessionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listConnectedApps"></a>
# **listConnectedApps**
> ListConnectedAppsResponse listConnectedApps()

List third-party OAuth apps with access to this account.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AccountApi()
try {
    val result : ListConnectedAppsResponse = apiInstance.listConnectedApps()
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

**ListConnectedAppsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

