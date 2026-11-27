# WorldsHttpApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceHttpDomain**](WorldsHttpApi.md#createWorldExperienceHttpDomain) | **POST** /v1/worlds/experiences/{experienceId}/http/domains | Declare a domain server scripts may call (example.com or *.example.com). It is reviewed by a person before it works.
[**deleteWorldExperienceHttpDomain**](WorldsHttpApi.md#deleteWorldExperienceHttpDomain) | **DELETE** /v1/worlds/experiences/{experienceId}/http/domains/{domainId} | Remove a domain: scripts lose access at once.
[**deleteWorldExperienceHttpSecret**](WorldsHttpApi.md#deleteWorldExperienceHttpSecret) | **DELETE** /v1/worlds/experiences/{experienceId}/http/secrets/{name} | Delete a secret.
[**getWorldExperienceHttp**](WorldsHttpApi.md#getWorldExperienceHttp) | **GET** /v1/worlds/experiences/{experienceId}/http | Http settings: declared domains with their review state, secret names (never values), limits and rules.
[**updateWorldExperienceHttpSecret**](WorldsHttpApi.md#updateWorldExperienceHttpSecret) | **PUT** /v1/worlds/experiences/{experienceId}/http/secrets/{name} | Set a secret (UPPER_SNAKE name). Scripts reference it as Http.secret(\&quot;NAME\&quot;); the value is never returned.


<a name="createWorldExperienceHttpDomain"></a>
# **createWorldExperienceHttpDomain**
> CreateWorldExperienceHttpDomainResponse createWorldExperienceHttpDomain(experienceId)

Declare a domain server scripts may call (example.com or *.example.com). It is reviewed by a person before it works.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsHttpApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceHttpDomainResponse = apiInstance.createWorldExperienceHttpDomain(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsHttpApi#createWorldExperienceHttpDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsHttpApi#createWorldExperienceHttpDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceHttpDomainResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperienceHttpDomain"></a>
# **deleteWorldExperienceHttpDomain**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceHttpDomain(experienceId, domainId)

Remove a domain: scripts lose access at once.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsHttpApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val domainId : kotlin.String = domainId_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneGrantResponse = apiInstance.deleteWorldExperienceHttpDomain(experienceId, domainId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsHttpApi#deleteWorldExperienceHttpDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsHttpApi#deleteWorldExperienceHttpDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **domainId** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperienceHttpSecret"></a>
# **deleteWorldExperienceHttpSecret**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceHttpSecret(experienceId, name)

Delete a secret.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsHttpApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneGrantResponse = apiInstance.deleteWorldExperienceHttpSecret(experienceId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsHttpApi#deleteWorldExperienceHttpSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsHttpApi#deleteWorldExperienceHttpSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceHttp"></a>
# **getWorldExperienceHttp**
> GetWorldExperienceHttpResponse getWorldExperienceHttp(experienceId)

Http settings: declared domains with their review state, secret names (never values), limits and rules.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsHttpApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceHttpResponse = apiInstance.getWorldExperienceHttp(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsHttpApi#getWorldExperienceHttp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsHttpApi#getWorldExperienceHttp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceHttpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceHttpSecret"></a>
# **updateWorldExperienceHttpSecret**
> UpdateWorldExperienceHttpSecretResponse updateWorldExperienceHttpSecret(experienceId, name)

Set a secret (UPPER_SNAKE name). Scripts reference it as Http.secret(\&quot;NAME\&quot;); the value is never returned.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsHttpApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceHttpSecretResponse = apiInstance.updateWorldExperienceHttpSecret(experienceId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsHttpApi#updateWorldExperienceHttpSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsHttpApi#updateWorldExperienceHttpSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceHttpSecretResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

