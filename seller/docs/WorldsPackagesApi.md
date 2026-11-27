# WorldsPackagesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperiencePlacePackage**](WorldsPackagesApi.md#createWorldExperiencePlacePackage) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/packages | Insert a copy of a package (default: the newest version, auto-update on).
[**createWorldExperiencePlacePackageUpdate**](WorldsPackagesApi.md#createWorldExperiencePlacePackageUpdate) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/packages/{nodeId}/update | Update a copy to a version (default newest). A copy edited in the place needs force: true (its edits are replaced).
[**createWorldPackage**](WorldsPackagesApi.md#createWorldPackage) | **POST** /v1/worlds/packages | Create a package (v1) from one node (place JSON) or from a node in a place — which then becomes copy v1, auto-updating.
[**createWorldPackageToolbox**](WorldsPackagesApi.md#createWorldPackageToolbox) | **POST** /v1/worlds/packages/{packageId}/toolbox | List the latest version in the Toolbox as an asset of kind package (Toolbox review and pricing rules apply).
[**createWorldPackageVersion**](WorldsPackagesApi.md#createWorldPackageVersion) | **POST** /v1/worlds/packages/{packageId}/versions | Publish a new version; every auto-updating, unmodified copy in your places is updated through its co-editing session. Returns what happened per place.
[**deleteWorldPackage**](WorldsPackagesApi.md#deleteWorldPackage) | **DELETE** /v1/worlds/packages/{packageId} | Archive a package. Copies in places keep working; they just stop receiving updates.
[**getWorldPackage**](WorldsPackagesApi.md#getWorldPackage) | **GET** /v1/worlds/packages/{packageId} | A package with its versions.
[**getWorldPackageVersion**](WorldsPackagesApi.md#getWorldPackageVersion) | **GET** /v1/worlds/packages/{packageId}/versions/{number} | One version, with its payload (one root node in place JSON).
[**listWorldExperiencePlacePackages**](WorldsPackagesApi.md#listWorldExperiencePlacePackages) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/packages | Package copies in a place: version, newest version, modified, auto-update.
[**listWorldPackages**](WorldsPackagesApi.md#listWorldPackages) | **GET** /v1/worlds/packages | Your package library: reusable models and modules, newest first, with how many places hold copies.
[**updateWorldExperiencePlacePackage**](WorldsPackagesApi.md#updateWorldExperiencePlacePackage) | **PATCH** /v1/worlds/experiences/{experienceId}/places/{placeId}/packages/{nodeId} | Turn auto-update on or off for one copy.
[**updateWorldPackage**](WorldsPackagesApi.md#updateWorldPackage) | **PATCH** /v1/worlds/packages/{packageId} | Rename a package or change its description.


<a name="createWorldExperiencePlacePackage"></a>
# **createWorldExperiencePlacePackage**
> CreateWorldExperiencePlacePackageResponse createWorldExperiencePlacePackage(experienceId, placeId)

Insert a copy of a package (default: the newest version, auto-update on).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlacePackageResponse = apiInstance.createWorldExperiencePlacePackage(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#createWorldExperiencePlacePackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#createWorldExperiencePlacePackage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperiencePlacePackageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperiencePlacePackageUpdate"></a>
# **createWorldExperiencePlacePackageUpdate**
> CreateWorldExperiencePlacePackageUpdateResponse createWorldExperiencePlacePackageUpdate(experienceId, placeId, nodeId)

Update a copy to a version (default newest). A copy edited in the place needs force: true (its edits are replaced).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
val nodeId : kotlin.String = nodeId_example // kotlin.String | 
try {
    val result : CreateWorldExperiencePlacePackageUpdateResponse = apiInstance.createWorldExperiencePlacePackageUpdate(experienceId, placeId, nodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#createWorldExperiencePlacePackageUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#createWorldExperiencePlacePackageUpdate")
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

**CreateWorldExperiencePlacePackageUpdateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPackage"></a>
# **createWorldPackage**
> GetWorldPackageResponse createWorldPackage()

Create a package (v1) from one node (place JSON) or from a node in a place — which then becomes copy v1, auto-updating.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
try {
    val result : GetWorldPackageResponse = apiInstance.createWorldPackage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#createWorldPackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#createWorldPackage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldPackageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPackageToolbox"></a>
# **createWorldPackageToolbox**
> CreateWorldPackageToolboxResponse createWorldPackageToolbox(packageId)

List the latest version in the Toolbox as an asset of kind package (Toolbox review and pricing rules apply).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
val packageId : kotlin.String = packageId_example // kotlin.String | 
try {
    val result : CreateWorldPackageToolboxResponse = apiInstance.createWorldPackageToolbox(packageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#createWorldPackageToolbox")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#createWorldPackageToolbox")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **kotlin.String**|  |

### Return type

**CreateWorldPackageToolboxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldPackageVersion"></a>
# **createWorldPackageVersion**
> CreateWorldPackageVersionResponse createWorldPackageVersion(packageId)

Publish a new version; every auto-updating, unmodified copy in your places is updated through its co-editing session. Returns what happened per place.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
val packageId : kotlin.String = packageId_example // kotlin.String | 
try {
    val result : CreateWorldPackageVersionResponse = apiInstance.createWorldPackageVersion(packageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#createWorldPackageVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#createWorldPackageVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **kotlin.String**|  |

### Return type

**CreateWorldPackageVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldPackage"></a>
# **deleteWorldPackage**
> DeleteWorldPackageResponse deleteWorldPackage(packageId)

Archive a package. Copies in places keep working; they just stop receiving updates.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
val packageId : kotlin.String = packageId_example // kotlin.String | 
try {
    val result : DeleteWorldPackageResponse = apiInstance.deleteWorldPackage(packageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#deleteWorldPackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#deleteWorldPackage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **kotlin.String**|  |

### Return type

**DeleteWorldPackageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPackage"></a>
# **getWorldPackage**
> GetWorldPackageResponse getWorldPackage(packageId)

A package with its versions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
val packageId : kotlin.String = packageId_example // kotlin.String | 
try {
    val result : GetWorldPackageResponse = apiInstance.getWorldPackage(packageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#getWorldPackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#getWorldPackage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **kotlin.String**|  |

### Return type

**GetWorldPackageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPackageVersion"></a>
# **getWorldPackageVersion**
> GetWorldPackageVersionResponse getWorldPackageVersion(packageId, number)

One version, with its payload (one root node in place JSON).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
val packageId : kotlin.String = packageId_example // kotlin.String | 
val number : kotlin.String = number_example // kotlin.String | 
try {
    val result : GetWorldPackageVersionResponse = apiInstance.getWorldPackageVersion(packageId, number)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#getWorldPackageVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#getWorldPackageVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **kotlin.String**|  |
 **number** | **kotlin.String**|  |

### Return type

**GetWorldPackageVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperiencePlacePackages"></a>
# **listWorldExperiencePlacePackages**
> ListWorldExperiencePlacePackagesResponse listWorldExperiencePlacePackages(experienceId, placeId)

Package copies in a place: version, newest version, modified, auto-update.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
try {
    val result : ListWorldExperiencePlacePackagesResponse = apiInstance.listWorldExperiencePlacePackages(experienceId, placeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#listWorldExperiencePlacePackages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#listWorldExperiencePlacePackages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **placeId** | **kotlin.String**|  |

### Return type

**ListWorldExperiencePlacePackagesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldPackages"></a>
# **listWorldPackages**
> ListWorldPackagesResponse listWorldPackages()

Your package library: reusable models and modules, newest first, with how many places hold copies.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
try {
    val result : ListWorldPackagesResponse = apiInstance.listWorldPackages()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#listWorldPackages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#listWorldPackages")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorldPackagesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperiencePlacePackage"></a>
# **updateWorldExperiencePlacePackage**
> UpdateWorldExperiencePlacePackageResponse updateWorldExperiencePlacePackage(experienceId, placeId, nodeId)

Turn auto-update on or off for one copy.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val placeId : kotlin.String = placeId_example // kotlin.String | 
val nodeId : kotlin.String = nodeId_example // kotlin.String | 
try {
    val result : UpdateWorldExperiencePlacePackageResponse = apiInstance.updateWorldExperiencePlacePackage(experienceId, placeId, nodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#updateWorldExperiencePlacePackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#updateWorldExperiencePlacePackage")
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

**UpdateWorldExperiencePlacePackageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldPackage"></a>
# **updateWorldPackage**
> DeleteWorldPackageResponse updateWorldPackage(packageId)

Rename a package or change its description.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsPackagesApi()
val packageId : kotlin.String = packageId_example // kotlin.String | 
try {
    val result : DeleteWorldPackageResponse = apiInstance.updateWorldPackage(packageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsPackagesApi#updateWorldPackage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsPackagesApi#updateWorldPackage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **kotlin.String**|  |

### Return type

**DeleteWorldPackageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

