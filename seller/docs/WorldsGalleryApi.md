# WorldsGalleryApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceGallery**](WorldsGalleryApi.md#createWorldExperienceGallery) | **POST** /v1/worlds/experiences/{experienceId}/gallery | Add an uploaded screenshot or video (your own upload&#39;s publicUrl; a video may carry a poster image). Images are scanned at once; every item waits for a person and shows on the game&#39;s page once approved.
[**createWorldExperienceGalleryUploadUrl**](WorldsGalleryApi.md#createWorldExperienceGalleryUploadUrl) | **POST** /v1/worlds/experiences/{experienceId}/gallery/upload-url | A presigned upload for a gallery screenshot (JPEG/PNG/WebP/GIF, ≤ 10 MB) or video (MP4/QuickTime/WebM): PUT the file to uploadUrl with the same Content-Type and exact Content-Length, then add publicUrl to the gallery.
[**deleteWorldExperienceGallery**](WorldsGalleryApi.md#deleteWorldExperienceGallery) | **DELETE** /v1/worlds/experiences/{experienceId}/gallery/{mediaId} | Take an item off the game&#39;s page now.
[**getWorldExperienceGallery**](WorldsGalleryApi.md#getWorldExperienceGallery) | **GET** /v1/worlds/experiences/{experienceId}/gallery | The game&#39;s gallery: every screenshot and video with its review state (pending / approved / rejected with the reviewer&#39;s note), position and caption, plus the limits.
[**updateWorldExperienceGallery**](WorldsGalleryApi.md#updateWorldExperienceGallery) | **PATCH** /v1/worlds/experiences/{experienceId}/gallery/{mediaId} | Change an item&#39;s caption (filtered; an approved item with a new caption goes back to review).
[**updateWorldExperienceGalleryOrder**](WorldsGalleryApi.md#updateWorldExperienceGalleryOrder) | **PUT** /v1/worlds/experiences/{experienceId}/gallery/order | Set the order on the game&#39;s page: the ids you list first, the rest after in their current order.
[**updateWorldExperienceGalleryRole**](WorldsGalleryApi.md#updateWorldExperienceGalleryRole) | **PUT** /v1/worlds/experiences/{experienceId}/gallery/{mediaId}/role | Make an item the game&#39;s icon or thumbnail (an image), its trailer (a video), or put it back in the gallery. The previous holder of that role goes back to the gallery.
[**updateWorldExperienceGalleryTrailerUrl**](WorldsGalleryApi.md#updateWorldExperienceGalleryTrailerUrl) | **PUT** /v1/worlds/experiences/{experienceId}/gallery/trailer-url | Set the game&#39;s trailer to a YouTube or Vimeo video link (https; youtube.com, youtu.be, vimeo.com, player.vimeo.com only; any other host is 400 trailer_host_not_allowed). It waits for a person like any gallery item; the current trailer goes back to the gallery (an uploaded clip) or off the page (a link).


<a name="createWorldExperienceGallery"></a>
# **createWorldExperienceGallery**
> WorldExperienceGalleryResponse createWorldExperienceGallery(experienceId)

Add an uploaded screenshot or video (your own upload&#39;s publicUrl; a video may carry a poster image). Images are scanned at once; every item waits for a person and shows on the game&#39;s page once approved.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsGalleryApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceGalleryResponse = apiInstance.createWorldExperienceGallery(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsGalleryApi#createWorldExperienceGallery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsGalleryApi#createWorldExperienceGallery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceGalleryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceGalleryUploadUrl"></a>
# **createWorldExperienceGalleryUploadUrl**
> CreateWorldExperienceGalleryUploadUrlResponse createWorldExperienceGalleryUploadUrl(experienceId)

A presigned upload for a gallery screenshot (JPEG/PNG/WebP/GIF, ≤ 10 MB) or video (MP4/QuickTime/WebM): PUT the file to uploadUrl with the same Content-Type and exact Content-Length, then add publicUrl to the gallery.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsGalleryApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceGalleryUploadUrlResponse = apiInstance.createWorldExperienceGalleryUploadUrl(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsGalleryApi#createWorldExperienceGalleryUploadUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsGalleryApi#createWorldExperienceGalleryUploadUrl")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceGalleryUploadUrlResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperienceGallery"></a>
# **deleteWorldExperienceGallery**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceGallery(experienceId, mediaId)

Take an item off the game&#39;s page now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsGalleryApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val mediaId : kotlin.String = mediaId_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneGrantResponse = apiInstance.deleteWorldExperienceGallery(experienceId, mediaId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsGalleryApi#deleteWorldExperienceGallery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsGalleryApi#deleteWorldExperienceGallery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **mediaId** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceGallery"></a>
# **getWorldExperienceGallery**
> GetWorldExperienceGalleryResponse getWorldExperienceGallery(experienceId)

The game&#39;s gallery: every screenshot and video with its review state (pending / approved / rejected with the reviewer&#39;s note), position and caption, plus the limits.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsGalleryApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceGalleryResponse = apiInstance.getWorldExperienceGallery(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsGalleryApi#getWorldExperienceGallery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsGalleryApi#getWorldExperienceGallery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceGalleryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceGallery"></a>
# **updateWorldExperienceGallery**
> WorldExperienceGalleryResponse updateWorldExperienceGallery(experienceId, mediaId)

Change an item&#39;s caption (filtered; an approved item with a new caption goes back to review).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsGalleryApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val mediaId : kotlin.String = mediaId_example // kotlin.String | 
try {
    val result : WorldExperienceGalleryResponse = apiInstance.updateWorldExperienceGallery(experienceId, mediaId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsGalleryApi#updateWorldExperienceGallery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsGalleryApi#updateWorldExperienceGallery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **mediaId** | **kotlin.String**|  |

### Return type

**WorldExperienceGalleryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceGalleryOrder"></a>
# **updateWorldExperienceGalleryOrder**
> UpdateWorldExperienceGalleryRoleResponse updateWorldExperienceGalleryOrder(experienceId)

Set the order on the game&#39;s page: the ids you list first, the rest after in their current order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsGalleryApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceGalleryRoleResponse = apiInstance.updateWorldExperienceGalleryOrder(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsGalleryApi#updateWorldExperienceGalleryOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsGalleryApi#updateWorldExperienceGalleryOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceGalleryRoleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceGalleryRole"></a>
# **updateWorldExperienceGalleryRole**
> UpdateWorldExperienceGalleryRoleResponse updateWorldExperienceGalleryRole(experienceId, mediaId)

Make an item the game&#39;s icon or thumbnail (an image), its trailer (a video), or put it back in the gallery. The previous holder of that role goes back to the gallery.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsGalleryApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val mediaId : kotlin.String = mediaId_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceGalleryRoleResponse = apiInstance.updateWorldExperienceGalleryRole(experienceId, mediaId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsGalleryApi#updateWorldExperienceGalleryRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsGalleryApi#updateWorldExperienceGalleryRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **mediaId** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceGalleryRoleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceGalleryTrailerUrl"></a>
# **updateWorldExperienceGalleryTrailerUrl**
> WorldExperienceGalleryResponse updateWorldExperienceGalleryTrailerUrl(experienceId)

Set the game&#39;s trailer to a YouTube or Vimeo video link (https; youtube.com, youtu.be, vimeo.com, player.vimeo.com only; any other host is 400 trailer_host_not_allowed). It waits for a person like any gallery item; the current trailer goes back to the gallery (an uploaded clip) or off the page (a link).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsGalleryApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : WorldExperienceGalleryResponse = apiInstance.updateWorldExperienceGalleryTrailerUrl(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsGalleryApi#updateWorldExperienceGalleryTrailerUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsGalleryApi#updateWorldExperienceGalleryTrailerUrl")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**WorldExperienceGalleryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

