# WorldsStudioApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceAssetMesh**](WorldsStudioApi.md#createWorldExperienceAssetMesh) | **POST** /v1/worlds/experiences/{experienceId}/assets/meshes | Import a .glb (base64) as a MeshPart: safety parse + budgets, stored on the Crossly CDN, a phone LOD over 5k triangles, collision Box or convex Hull. Returns the asset and the MeshPart node; with placeId it is inserted into that place through its co-editing session.
[**createWorldExperienceAssetMeshCheck**](WorldsStudioApi.md#createWorldExperienceAssetMeshCheck) | **POST** /v1/worlds/experiences/{experienceId}/assets/meshes/check | Check a .glb (base64) for import without storing it: the budget report per device, plain-English errors with a fix list, whether a phone LOD will be made, mesh bounds and hull points.
[**createWorldExperiencePlaceAssistant**](WorldsStudioApi.md#createWorldExperiencePlaceAssistant) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/assistant | Ask the Studio Assistant (mode explain | edit | build): returns an explanation and a proposed change set (scripts, inserts, edits) checked against your role and linted. Nothing is applied.
[**createWorldExperiencePlaceAssistantApply**](WorldsStudioApi.md#createWorldExperiencePlaceAssistantApply) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/assistant/apply | Apply accepted Assistant changes to the place as one co-editing batch (activity via assistant, revertible). Re-checked against the place as it is now.
[**createWorldExperiencePlaceStudioEdit**](WorldsStudioApi.md#createWorldExperiencePlaceStudioEdit) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/edits | Apply set / insert / move / delete steps by path as ONE batch through Team Create (live in every open Studio, one revertible activity entry). All-or-nothing: any bad step refuses the batch with every problem listed.
[**createWorldExperiencePlaceStudioInsertAsset**](WorldsStudioApi.md#createWorldExperiencePlaceStudioInsertAsset) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/insert-asset | Insert a Toolbox asset under a path (default Workspace; ServerScripts for scripts). Paid assets need the experience owner&#39;s licence.
[**createWorldExperiencePlaceStudioPlaytest**](WorldsStudioApi.md#createWorldExperiencePlaceStudioPlaytest) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/playtest | Cloud test: flush the session, freeze a private test version and start a fleet server for it. 201 ready (ticket) or 202 starting; outputCursor reads only this test&#39;s Output.
[**createWorldExperiencePlaceStudioPlaytestStop**](WorldsStudioApi.md#createWorldExperiencePlaceStudioPlaytestStop) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/playtest/stop | Stop this place&#39;s cloud-test servers now.
[**createWorldExperiencePlaceStudioPublish**](WorldsStudioApi.md#createWorldExperiencePlaceStudioPublish) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/publish | Prepare a publish from the live session: checks, details, rating answers, access. Never submits and never acknowledges the money review — the person does (or submit_worlds_publish).
[**createWorldExperiencePlaceStudioScriptCommit**](WorldsStudioApi.md#createWorldExperiencePlaceStudioScriptCommit) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/script/commit | Commit your draft with a three-way merge onto the script as it is now (collaborators&#39; edits kept). 409 merge_conflict carries merged text with conflict blocks and theirs.
[**deleteWorldExperiencePlaceStudioScript**](WorldsStudioApi.md#deleteWorldExperiencePlaceStudioScript) | **DELETE** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/script | Discard your draft of a script.
[**getWorldAssistantStatus**](WorldsStudioApi.md#getWorldAssistantStatus) | **GET** /v1/worlds/assistant/status | Studio Assistant status: whether Crossly&#39;s model key is configured, whether you have your own AI key, and your plan allowance (asks left today, budget left this month).
[**getWorldExperiencePlaceStudioFind**](WorldsStudioApi.md#getWorldExperiencePlaceStudioFind) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/find | Find instances by name (contains), exact class and/or tag.
[**getWorldExperiencePlaceStudioInstance**](WorldsStudioApi.md#getWorldExperiencePlaceStudioInstance) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/instance | One instance by path (or session id): class, properties, attributes, tags, children. Script source is read with …/studio/script.
[**getWorldExperiencePlaceStudioOutput**](WorldsStudioApi.md#getWorldExperiencePlaceStudioOutput) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/output | Server Output (print, warnings, errors) after a cursor: every line of cloud tests, errors of live servers (scope&#x3D;all). Kept 24 hours.
[**getWorldExperiencePlaceStudioProblem**](WorldsStudioApi.md#getWorldExperiencePlaceStudioProblem) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/problems | The publish checks on the place as the live session holds it: script lint, budgets per device, settings, shop listings, Toolbox licences. publishable &#x3D; no errors.
[**getWorldExperiencePlaceStudioScript**](WorldsStudioApi.md#getWorldExperiencePlaceStudioScript) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/script | A script&#39;s current source, your draft of it (if any, with whether someone committed since) and the lint of each.
[**getWorldExperiencePlaceStudioSnapshot**](WorldsStudioApi.md#getWorldExperiencePlaceStudioSnapshot) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/snapshot | A plan (top) or front drawing of the parts under a path as SVG, with bounds, spawns and unanchored parts that will fall.
[**getWorldExperiencePlaceStudioTree**](WorldsStudioApi.md#getWorldExperiencePlaceStudioTree) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/tree | The live instance tree (what every open Studio shows) by dotted path, depth levels down (default 3, max 12).
[**getWorldStudioClass**](WorldsStudioApi.md#getWorldStudioClass) | **GET** /v1/worlds/studio/classes | The engine&#39;s class table: insertable classes, services, and for ?name&#x3D; one class with every property, its type, default and the exact JSON a place (and a studio edit) takes.
[**listWorldExperienceAssets**](WorldsStudioApi.md#listWorldExperienceAssets) | **GET** /v1/worlds/experiences/{experienceId}/assets | Meshes imported into this experience, newest first: paths, phone LOD, bounds, hull size, budget report, moderation (pending until a reviewed publish uses them) and a URL you can load now.
[**updateWorldExperiencePlaceStudioScript**](WorldsStudioApi.md#updateWorldExperiencePlaceStudioScript) | **PUT** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/script | Save your draft of a script (the place does not change until you commit). Returns lint and the diff from the current source.


<a name="createWorldExperienceAssetMesh"></a>
# **createWorldExperienceAssetMesh**
> CreateWorldExperienceAssetMeshResponse createWorldExperienceAssetMesh(experienceId)

Import a .glb (base64) as a MeshPart: safety parse + budgets, stored on the Crossly CDN, a phone LOD over 5k triangles, collision Box or convex Hull. Returns the asset and the MeshPart node; with placeId it is inserted into that place through its co-editing session.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceAssetMeshResponse = apiInstance.createWorldExperienceAssetMesh(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#createWorldExperienceAssetMesh")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#createWorldExperienceAssetMesh")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceAssetMeshResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceAssetMeshCheck"></a>
# **createWorldExperienceAssetMeshCheck**
> CreateWorldExperienceAssetMeshCheckResponse createWorldExperienceAssetMeshCheck(experienceId)

Check a .glb (base64) for import without storing it: the budget report per device, plain-English errors with a fix list, whether a phone LOD will be made, mesh bounds and hull points.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceAssetMeshCheckResponse = apiInstance.createWorldExperienceAssetMeshCheck(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#createWorldExperienceAssetMeshCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#createWorldExperienceAssetMeshCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceAssetMeshCheckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceAssistant"></a>
# **createWorldExperiencePlaceAssistant**
> CreateWorldExperiencePlaceAssistantResponse createWorldExperiencePlaceAssistant(experienceId, placeId)

Ask the Studio Assistant (mode explain | edit | build): returns an explanation and a proposed change set (scripts, inserts, edits) checked against your role and linted. Nothing is applied.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceAssistantResponse = apiInstance.createWorldExperiencePlaceAssistant(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#createWorldExperiencePlaceAssistant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#createWorldExperiencePlaceAssistant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceAssistantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceAssistantApply"></a>
# **createWorldExperiencePlaceAssistantApply**
> CreateWorldExperiencePlaceAssistantApplyResponse createWorldExperiencePlaceAssistantApply(experienceId, placeId)

Apply accepted Assistant changes to the place as one co-editing batch (activity via assistant, revertible). Re-checked against the place as it is now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceAssistantApplyResponse = apiInstance.createWorldExperiencePlaceAssistantApply(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#createWorldExperiencePlaceAssistantApply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#createWorldExperiencePlaceAssistantApply")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceAssistantApplyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceStudioEdit"></a>
# **createWorldExperiencePlaceStudioEdit**
> CreateWorldExperiencePlaceStudioEditResponse createWorldExperiencePlaceStudioEdit(experienceId, placeId)

Apply set / insert / move / delete steps by path as ONE batch through Team Create (live in every open Studio, one revertible activity entry). All-or-nothing: any bad step refuses the batch with every problem listed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceStudioEditResponse = apiInstance.createWorldExperiencePlaceStudioEdit(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioEdit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioEdit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceStudioEditResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceStudioInsertAsset"></a>
# **createWorldExperiencePlaceStudioInsertAsset**
> CreateWorldExperiencePlaceStudioInsertAssetResponse createWorldExperiencePlaceStudioInsertAsset(experienceId, placeId)

Insert a Toolbox asset under a path (default Workspace; ServerScripts for scripts). Paid assets need the experience owner&#39;s licence.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceStudioInsertAssetResponse = apiInstance.createWorldExperiencePlaceStudioInsertAsset(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioInsertAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioInsertAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceStudioInsertAssetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceStudioPlaytest"></a>
# **createWorldExperiencePlaceStudioPlaytest**
> CreateWorldExperiencePlaceStudioPlaytestResponse createWorldExperiencePlaceStudioPlaytest(experienceId, placeId)

Cloud test: flush the session, freeze a private test version and start a fleet server for it. 201 ready (ticket) or 202 starting; outputCursor reads only this test&#39;s Output.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceStudioPlaytestResponse = apiInstance.createWorldExperiencePlaceStudioPlaytest(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioPlaytest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioPlaytest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceStudioPlaytestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceStudioPlaytestStop"></a>
# **createWorldExperiencePlaceStudioPlaytestStop**
> CreateWorldExperiencePlaceStudioPlaytestStopResponse createWorldExperiencePlaceStudioPlaytestStop(experienceId, placeId)

Stop this place&#39;s cloud-test servers now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceStudioPlaytestStopResponse = apiInstance.createWorldExperiencePlaceStudioPlaytestStop(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioPlaytestStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioPlaytestStop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceStudioPlaytestStopResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceStudioPublish"></a>
# **createWorldExperiencePlaceStudioPublish**
> CreateWorldExperiencePlaceStudioPublishResponse createWorldExperiencePlaceStudioPublish(experienceId, placeId)

Prepare a publish from the live session: checks, details, rating answers, access. Never submits and never acknowledges the money review — the person does (or submit_worlds_publish).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceStudioPublishResponse = apiInstance.createWorldExperiencePlaceStudioPublish(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioPublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioPublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceStudioPublishResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlaceStudioScriptCommit"></a>
# **createWorldExperiencePlaceStudioScriptCommit**
> CreateWorldExperiencePlaceStudioScriptCommitResponse createWorldExperiencePlaceStudioScriptCommit(experienceId, placeId)

Commit your draft with a three-way merge onto the script as it is now (collaborators&#39; edits kept). 409 merge_conflict carries merged text with conflict blocks and theirs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlaceStudioScriptCommitResponse = apiInstance.createWorldExperiencePlaceStudioScriptCommit(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioScriptCommit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#createWorldExperiencePlaceStudioScriptCommit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlaceStudioScriptCommitResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperiencePlaceStudioScript"></a>
# **deleteWorldExperiencePlaceStudioScript**
> DeleteWorldExperiencePlaceCollabScriptResponse deleteWorldExperiencePlaceStudioScript(experienceId, placeId)

Discard your draft of a script.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : DeleteWorldExperiencePlaceCollabScriptResponse = apiInstance.deleteWorldExperiencePlaceStudioScript(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#deleteWorldExperiencePlaceStudioScript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#deleteWorldExperiencePlaceStudioScript")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**DeleteWorldExperiencePlaceCollabScriptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldAssistantStatus"></a>
# **getWorldAssistantStatus**
> GetWorldAssistantStatusResponse getWorldAssistantStatus()

Studio Assistant status: whether Crossly&#39;s model key is configured, whether you have your own AI key, and your plan allowance (asks left today, budget left this month).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
try {
    val result : GetWorldAssistantStatusResponse = apiInstance.getWorldAssistantStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#getWorldAssistantStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#getWorldAssistantStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldAssistantStatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePlaceStudioFind"></a>
# **getWorldExperiencePlaceStudioFind**
> GetWorldExperiencePlaceStudioFindResponse getWorldExperiencePlaceStudioFind(experienceId, placeId)

Find instances by name (contains), exact class and/or tag.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceStudioFindResponse = apiInstance.getWorldExperiencePlaceStudioFind(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioFind")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioFind")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceStudioFindResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePlaceStudioInstance"></a>
# **getWorldExperiencePlaceStudioInstance**
> GetWorldExperiencePlaceStudioInstanceResponse getWorldExperiencePlaceStudioInstance(experienceId, placeId)

One instance by path (or session id): class, properties, attributes, tags, children. Script source is read with …/studio/script.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceStudioInstanceResponse = apiInstance.getWorldExperiencePlaceStudioInstance(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceStudioInstanceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePlaceStudioOutput"></a>
# **getWorldExperiencePlaceStudioOutput**
> GetWorldExperiencePlaceStudioOutputResponse getWorldExperiencePlaceStudioOutput(experienceId, placeId)

Server Output (print, warnings, errors) after a cursor: every line of cloud tests, errors of live servers (scope&#x3D;all). Kept 24 hours.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceStudioOutputResponse = apiInstance.getWorldExperiencePlaceStudioOutput(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioOutput")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioOutput")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceStudioOutputResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePlaceStudioProblem"></a>
# **getWorldExperiencePlaceStudioProblem**
> GetWorldExperiencePlaceStudioProblemResponse getWorldExperiencePlaceStudioProblem(experienceId, placeId)

The publish checks on the place as the live session holds it: script lint, budgets per device, settings, shop listings, Toolbox licences. publishable &#x3D; no errors.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceStudioProblemResponse = apiInstance.getWorldExperiencePlaceStudioProblem(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioProblem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioProblem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceStudioProblemResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePlaceStudioScript"></a>
# **getWorldExperiencePlaceStudioScript**
> GetWorldExperiencePlaceStudioScriptResponse getWorldExperiencePlaceStudioScript(experienceId, placeId)

A script&#39;s current source, your draft of it (if any, with whether someone committed since) and the lint of each.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceStudioScriptResponse = apiInstance.getWorldExperiencePlaceStudioScript(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioScript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioScript")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceStudioScriptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePlaceStudioSnapshot"></a>
# **getWorldExperiencePlaceStudioSnapshot**
> GetWorldExperiencePlaceStudioSnapshotResponse getWorldExperiencePlaceStudioSnapshot(experienceId, placeId)

A plan (top) or front drawing of the parts under a path as SVG, with bounds, spawns and unanchored parts that will fall.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceStudioSnapshotResponse = apiInstance.getWorldExperiencePlaceStudioSnapshot(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceStudioSnapshotResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperiencePlaceStudioTree"></a>
# **getWorldExperiencePlaceStudioTree**
> GetWorldExperiencePlaceStudioTreeResponse getWorldExperiencePlaceStudioTree(experienceId, placeId)

The live instance tree (what every open Studio shows) by dotted path, depth levels down (default 3, max 12).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : GetWorldExperiencePlaceStudioTreeResponse = apiInstance.getWorldExperiencePlaceStudioTree(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioTree")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#getWorldExperiencePlaceStudioTree")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**GetWorldExperiencePlaceStudioTreeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldStudioClass"></a>
# **getWorldStudioClass**
> GetWorldStudioClassResponse getWorldStudioClass()

The engine&#39;s class table: insertable classes, services, and for ?name&#x3D; one class with every property, its type, default and the exact JSON a place (and a studio edit) takes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
try {
    val result : GetWorldStudioClassResponse = apiInstance.getWorldStudioClass()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#getWorldStudioClass")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#getWorldStudioClass")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldStudioClassResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceAssets"></a>
# **listWorldExperienceAssets**
> ListWorldExperienceAssetsResponse listWorldExperienceAssets(experienceId)

Meshes imported into this experience, newest first: paths, phone LOD, bounds, hull size, budget report, moderation (pending until a reviewed publish uses them) and a URL you can load now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceAssetsResponse = apiInstance.listWorldExperienceAssets(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#listWorldExperienceAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#listWorldExperienceAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceAssetsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperiencePlaceStudioScript"></a>
# **updateWorldExperiencePlaceStudioScript**
> UpdateWorldExperiencePlaceStudioScriptResponse updateWorldExperiencePlaceStudioScript(experienceId, placeId)

Save your draft of a script (the place does not change until you commit). Returns lint and the diff from the current source.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsStudioApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : UpdateWorldExperiencePlaceStudioScriptResponse = apiInstance.updateWorldExperiencePlaceStudioScript(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsStudioApi#updateWorldExperiencePlaceStudioScript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsStudioApi#updateWorldExperiencePlaceStudioScript")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**UpdateWorldExperiencePlaceStudioScriptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

