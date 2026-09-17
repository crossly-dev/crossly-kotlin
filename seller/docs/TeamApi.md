# TeamApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTeamAccept**](TeamApi.md#createTeamAccept) | **POST** /v1/team/accept | Accept a pending team invitation by raw token.
[**createTeamInvite**](TeamApi.md#createTeamInvite) | **POST** /v1/team/invite | Mint a team invitation; returns the one-time accept URL.
[**createTeamLeave**](TeamApi.md#createTeamLeave) | **POST** /v1/team/leave | Leave every team this user is currently a member of.
[**createTeamRevoke**](TeamApi.md#createTeamRevoke) | **POST** /v1/team/revoke | Revoke a pending invite OR an active team member.
[**getTeam**](TeamApi.md#getTeam) | **GET** /v1/team | List pending team invitations + active members.
[**updateTeam**](TeamApi.md#updateTeam) | **PATCH** /v1/team/{memberId} | Update a team member&#39;s scopes (owner only).


<a name="createTeamAccept"></a>
# **createTeamAccept**
> CreateTeamAcceptResponse createTeamAccept()

Accept a pending team invitation by raw token.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TeamApi()
try {
    val result : CreateTeamAcceptResponse = apiInstance.createTeamAccept()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#createTeamAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#createTeamAccept")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateTeamAcceptResponse**](CreateTeamAcceptResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTeamInvite"></a>
# **createTeamInvite**
> CreateTeamInviteResponse createTeamInvite()

Mint a team invitation; returns the one-time accept URL.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TeamApi()
try {
    val result : CreateTeamInviteResponse = apiInstance.createTeamInvite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#createTeamInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#createTeamInvite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateTeamInviteResponse**](CreateTeamInviteResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTeamLeave"></a>
# **createTeamLeave**
> CreateTeamLeaveResponse createTeamLeave()

Leave every team this user is currently a member of.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TeamApi()
try {
    val result : CreateTeamLeaveResponse = apiInstance.createTeamLeave()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#createTeamLeave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#createTeamLeave")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateTeamLeaveResponse**](CreateTeamLeaveResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTeamRevoke"></a>
# **createTeamRevoke**
> CreateTeamRevokeResponse createTeamRevoke()

Revoke a pending invite OR an active team member.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TeamApi()
try {
    val result : CreateTeamRevokeResponse = apiInstance.createTeamRevoke()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#createTeamRevoke")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#createTeamRevoke")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateTeamRevokeResponse**](CreateTeamRevokeResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeam"></a>
# **getTeam**
> GetTeamResponse getTeam()

List pending team invitations + active members.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TeamApi()
try {
    val result : GetTeamResponse = apiInstance.getTeam()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#getTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#getTeam")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetTeamResponse**](GetTeamResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTeam"></a>
# **updateTeam**
> UpdateTeamResponse updateTeam(memberId)

Update a team member&#39;s scopes (owner only).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TeamApi()
val memberId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateTeamResponse = apiInstance.updateTeam(memberId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#updateTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#updateTeam")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberId** | **java.util.UUID**|  |

### Return type

[**UpdateTeamResponse**](UpdateTeamResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

