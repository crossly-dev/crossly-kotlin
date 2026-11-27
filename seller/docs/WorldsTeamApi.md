# WorldsTeamApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldCollaborationAccept**](WorldsTeamApi.md#createWorldCollaborationAccept) | **POST** /v1/worlds/collaborations/{experienceId}/accept | Accept an invitation.
[**createWorldCollaborationDecline**](WorldsTeamApi.md#createWorldCollaborationDecline) | **POST** /v1/worlds/collaborations/{experienceId}/decline | Decline an invitation.
[**createWorldExperienceActivityRevert**](WorldsTeamApi.md#createWorldExperienceActivityRevert) | **POST** /v1/worlds/experiences/{experienceId}/activity/{activityId}/revert | Revert an instance change: its undo is applied as a new edit by you; anything changed since by others is left alone.
[**createWorldExperienceCollaborator**](WorldsTeamApi.md#createWorldExperienceCollaborator) | **POST** /v1/worlds/experiences/{experienceId}/collaborators | Invite a Crossly handle with a role. Owner or admin; only the owner makes admins. Counts against the owner&#39;s plan cap.
[**createWorldExperiencePlaceCollabOp**](WorldsTeamApi.md#createWorldExperiencePlaceCollabOp) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/ops | Apply a batch of ops (insert, delete, move, prop, attr, name, tags, world) in server order. Each op is checked against your role; a retried batch id is answered, not re-applied.
[**createWorldExperiencePlaceCollabSave**](WorldsTeamApi.md#createWorldExperiencePlaceCollabSave) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/save | Write the session into the place draft now (publishing and cloud tests do this themselves).
[**createWorldExperiencePlaceCollabScriptCommit**](WorldsTeamApi.md#createWorldExperiencePlaceCollabScriptCommit) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/scripts/{nodeId}/commit | Commit your draft with a three-way merge. 409 merge_conflict carries the merged text with conflict blocks and the current source.
[**deleteWorldExperienceCollaborator**](WorldsTeamApi.md#deleteWorldExperienceCollaborator) | **DELETE** /v1/worlds/experiences/{experienceId}/collaborators/{userId} | Remove a collaborator, or leave (your own user id). Their revenue share returns to the owner from next month.
[**deleteWorldExperiencePlaceCollabScript**](WorldsTeamApi.md#deleteWorldExperiencePlaceCollabScript) | **DELETE** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/scripts/{nodeId} | Discard your draft of a script.
[**getWorldExperiencePlaceCollab**](WorldsTeamApi.md#getWorldExperiencePlaceCollab) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab | The live co-editing document of a place (node ids every editor shares), its op sequence and your role.
[**getWorldExperiencePlaceCollabOp**](WorldsTeamApi.md#getWorldExperiencePlaceCollabOp) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/ops | Ops after a sequence number, grouped by batch. 409 resync when they are no longer kept: reload the session.
[**getWorldExperienceSplit**](WorldsTeamApi.md#getWorldExperienceSplit) | **GET** /v1/worlds/experiences/{experienceId}/splits | Revenue split of the creator share: current, scheduled, history.
[**getWorldExperienceTeam**](WorldsTeamApi.md#getWorldExperienceTeam) | **GET** /v1/worlds/experiences/{experienceId}/team | The team: owner, collaborators with roles (owner, admin, editor, scripter, builder, tester, analyst), your role and permissions, the plan cap.
[**listWorldCollaborations**](WorldsTeamApi.md#listWorldCollaborations) | **GET** /v1/worlds/collaborations | Experiences you are invited to or work on, with your role.
[**listWorldExperienceActivity**](WorldsTeamApi.md#listWorldExperienceActivity) | **GET** /v1/worlds/experiences/{experienceId}/activity | Activity history, newest first: who changed what, when, from where (studio, api, mcp, cli); instance changes are revertible.
[**listWorldExperiencePlaceCollabScripts**](WorldsTeamApi.md#listWorldExperiencePlaceCollabScripts) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/scripts | Your script drafts in this place, with whether someone committed since you started.
[**updateWorldExperienceCollaborator**](WorldsTeamApi.md#updateWorldExperienceCollaborator) | **PATCH** /v1/worlds/experiences/{experienceId}/collaborators/{userId} | Change a collaborator&#39;s role.
[**updateWorldExperiencePlaceCollabScript**](WorldsTeamApi.md#updateWorldExperiencePlaceCollabScript) | **PUT** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/scripts/{nodeId} | Save your own draft of a script (needs edit scripts).
[**updateWorldExperienceSplit**](WorldsTeamApi.md#updateWorldExperienceSplit) | **PUT** /v1/worlds/experiences/{experienceId}/splits | Owner only: split the creator share (70% of net) in basis points summing to 10000. Takes effect the 1st of next month; every party is notified. The 70% total never changes.


<a name="createWorldCollaborationAccept"></a>
# **createWorldCollaborationAccept**
> CreateWorldCollaborationAcceptResponse createWorldCollaborationAccept(experienceId)

Accept an invitation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldCollaborationAcceptResponse = apiInstance.createWorldCollaborationAccept(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#createWorldCollaborationAccept")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#createWorldCollaborationAccept")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldCollaborationAcceptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldCollaborationDecline"></a>
# **createWorldCollaborationDecline**
> CreateWorldCollaborationDeclineResponse createWorldCollaborationDecline(experienceId)

Decline an invitation.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldCollaborationDeclineResponse = apiInstance.createWorldCollaborationDecline(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#createWorldCollaborationDecline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#createWorldCollaborationDecline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldCollaborationDeclineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceActivityRevert"></a>
# **createWorldExperienceActivityRevert**
> CreateWorldExperienceActivityRevertResponse createWorldExperienceActivityRevert(experienceId, activityId)

Revert an instance change: its undo is applied as a new edit by you; anything changed since by others is left alone.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val activityId : kotlin.String = activityId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceActivityRevertResponse = apiInstance.createWorldExperienceActivityRevert(experienceId, activityId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#createWorldExperienceActivityRevert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#createWorldExperienceActivityRevert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **activityId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceActivityRevertResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceCollaborator"></a>
# **createWorldExperienceCollaborator**
> CreateWorldExperienceCollaboratorResponse createWorldExperienceCollaborator(experienceId)

Invite a Crossly handle with a role. Owner or admin; only the owner makes admins. Counts against the owner&#39;s plan cap.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceCollaboratorResponse = apiInstance.createWorldExperienceCollaborator(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#createWorldExperienceCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#createWorldExperienceCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceCollaboratorResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceCollabOp"></a>
# **createWorldExperiencePlaceCollabOp**
> CreateWorldExperiencePlaceCollabOpResponse createWorldExperiencePlaceCollabOp(experienceId, placeId)

Apply a batch of ops (insert, delete, move, prop, attr, name, tags, world) in server order. Each op is checked against your role; a retried batch id is answered, not re-applied.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceCollabOpResponse = apiInstance.createWorldExperiencePlaceCollabOp(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#createWorldExperiencePlaceCollabOp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#createWorldExperiencePlaceCollabOp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceCollabOpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceCollabSave"></a>
# **createWorldExperiencePlaceCollabSave**
> CreateWorldExperiencePlaceCollabSaveResponse createWorldExperiencePlaceCollabSave(experienceId, placeId)

Write the session into the place draft now (publishing and cloud tests do this themselves).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceCollabSaveResponse = apiInstance.createWorldExperiencePlaceCollabSave(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#createWorldExperiencePlaceCollabSave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#createWorldExperiencePlaceCollabSave")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceCollabSaveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceCollabScriptCommit"></a>
# **createWorldExperiencePlaceCollabScriptCommit**
> CreateWorldExperiencePlaceCollabScriptCommitResponse createWorldExperiencePlaceCollabScriptCommit(experienceId, placeId, nodeId)

Commit your draft with a three-way merge. 409 merge_conflict carries the merged text with conflict blocks and the current source.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
val nodeId : kotlin.String = nodeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceCollabScriptCommitResponse = apiInstance.createWorldExperiencePlaceCollabScriptCommit(experienceId, placeId, nodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#createWorldExperiencePlaceCollabScriptCommit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#createWorldExperiencePlaceCollabScriptCommit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |
 **nodeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceCollabScriptCommitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperienceCollaborator"></a>
# **deleteWorldExperienceCollaborator**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceCollaborator(experienceId, userId)

Remove a collaborator, or leave (your own user id). Their revenue share returns to the owner from next month.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneGrantResponse = apiInstance.deleteWorldExperienceCollaborator(experienceId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#deleteWorldExperienceCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#deleteWorldExperienceCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **userId** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperiencePlaceCollabScript"></a>
# **deleteWorldExperiencePlaceCollabScript**
> DeleteWorldExperiencePlaceCollabScriptResponse deleteWorldExperiencePlaceCollabScript(experienceId, placeId, nodeId)

Discard your draft of a script.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
val nodeId : kotlin.String = nodeId_example // kotlin.String | 
try {
    val result : DeleteWorldExperiencePlaceCollabScriptResponse = apiInstance.deleteWorldExperiencePlaceCollabScript(experienceId, placeId, nodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#deleteWorldExperiencePlaceCollabScript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#deleteWorldExperiencePlaceCollabScript")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |
 **nodeId** | **kotlin.String**|  |

### Return type

**DeleteWorldExperiencePlaceCollabScriptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePlaceCollab"></a>
# **getWorldExperiencePlaceCollab**
> GetWorldExperiencePlaceCollabResponse getWorldExperiencePlaceCollab(experienceId, placeId)

The live co-editing document of a place (node ids every editor shares), its op sequence and your role.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceCollabResponse = apiInstance.getWorldExperiencePlaceCollab(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#getWorldExperiencePlaceCollab")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#getWorldExperiencePlaceCollab")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceCollabResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePlaceCollabOp"></a>
# **getWorldExperiencePlaceCollabOp**
> GetWorldExperiencePlaceCollabOpResponse getWorldExperiencePlaceCollabOp(experienceId, placeId)

Ops after a sequence number, grouped by batch. 409 resync when they are no longer kept: reload the session.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceCollabOpResponse = apiInstance.getWorldExperiencePlaceCollabOp(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#getWorldExperiencePlaceCollabOp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#getWorldExperiencePlaceCollabOp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceCollabOpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceSplit"></a>
# **getWorldExperienceSplit**
> GetWorldExperienceSplitResponse getWorldExperienceSplit(experienceId)

Revenue split of the creator share: current, scheduled, history.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceSplitResponse = apiInstance.getWorldExperienceSplit(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#getWorldExperienceSplit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#getWorldExperienceSplit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceSplitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceTeam"></a>
# **getWorldExperienceTeam**
> GetWorldExperienceTeamResponse getWorldExperienceTeam(experienceId)

The team: owner, collaborators with roles (owner, admin, editor, scripter, builder, tester, analyst), your role and permissions, the plan cap.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceTeamResponse = apiInstance.getWorldExperienceTeam(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#getWorldExperienceTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#getWorldExperienceTeam")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceTeamResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldCollaborations"></a>
# **listWorldCollaborations**
> ListWorldCollaborationsResponse listWorldCollaborations()

Experiences you are invited to or work on, with your role.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
try {
    val result : ListWorldCollaborationsResponse = apiInstance.listWorldCollaborations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#listWorldCollaborations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#listWorldCollaborations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldCollaborationsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceActivity"></a>
# **listWorldExperienceActivity**
> ListWorldExperienceActivityResponse listWorldExperienceActivity(experienceId)

Activity history, newest first: who changed what, when, from where (studio, api, mcp, cli); instance changes are revertible.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceActivityResponse = apiInstance.listWorldExperienceActivity(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#listWorldExperienceActivity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#listWorldExperienceActivity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceActivityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperiencePlaceCollabScripts"></a>
# **listWorldExperiencePlaceCollabScripts**
> ListWorldExperiencePlaceCollabScriptsResponse listWorldExperiencePlaceCollabScripts(experienceId, placeId)

Your script drafts in this place, with whether someone committed since you started.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : ListWorldExperiencePlaceCollabScriptsResponse = apiInstance.listWorldExperiencePlaceCollabScripts(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#listWorldExperiencePlaceCollabScripts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#listWorldExperiencePlaceCollabScripts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**ListWorldExperiencePlaceCollabScriptsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceCollaborator"></a>
# **updateWorldExperienceCollaborator**
> CreateWorldExperienceCollaboratorResponse updateWorldExperienceCollaborator(experienceId, userId)

Change a collaborator&#39;s role.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceCollaboratorResponse = apiInstance.updateWorldExperienceCollaborator(experienceId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#updateWorldExperienceCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#updateWorldExperienceCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **userId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceCollaboratorResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperiencePlaceCollabScript"></a>
# **updateWorldExperiencePlaceCollabScript**
> UpdateWorldExperiencePlaceCollabScriptResponse updateWorldExperiencePlaceCollabScript(experienceId, placeId, nodeId)

Save your own draft of a script (needs edit scripts).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
val nodeId : kotlin.String = nodeId_example // kotlin.String | 
try {
    val result : UpdateWorldExperiencePlaceCollabScriptResponse = apiInstance.updateWorldExperiencePlaceCollabScript(experienceId, placeId, nodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#updateWorldExperiencePlaceCollabScript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#updateWorldExperiencePlaceCollabScript")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |
 **nodeId** | **kotlin.String**|  |

### Return type

**UpdateWorldExperiencePlaceCollabScriptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceSplit"></a>
# **updateWorldExperienceSplit**
> GetWorldExperienceSplitResponse updateWorldExperienceSplit(experienceId)

Owner only: split the creator share (70% of net) in basis points summing to 10000. Takes effect the 1st of next month; every party is notified. The 70% total never changes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsTeamApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceSplitResponse = apiInstance.updateWorldExperienceSplit(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsTeamApi#updateWorldExperienceSplit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsTeamApi#updateWorldExperienceSplit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceSplitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

