# WorldsBadgesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceBadge**](WorldsBadgesApi.md#createWorldExperienceBadge) | **POST** /v1/worlds/experiences/{experienceId}/badges | Add a badge (at most 100 per game). name 1-50 characters, description up to 1000, iconSha256 &#x3D; the sha256 a png upload answered (POST /v1/world/interactive/assets, kind png); a new icon is shown once a person approved it.
[**getWorldBadgeMine**](WorldsBadgesApi.md#getWorldBadgeMine) | **GET** /v1/worlds/badges/mine | Every game badge you hold, newest first, and whether your person page shows them.
[**getWorldExperienceBadge**](WorldsBadgesApi.md#getWorldExperienceBadge) | **GET** /v1/worlds/experiences/{experienceId}/badges | A game&#39;s badges, oldest first: name, description, icon and its review state, on/off, how many players hold each; plus the player count (the rarity denominator) and the limits. Scripts award them with BadgeService.AwardBadge(player, badgeId).
[**getWorldGameBadge**](WorldsBadgesApi.md#getWorldGameBadge) | **GET** /v1/worlds/games/{game}/badges | A Crossly Carnival game&#39;s badges as players see them: name, description, approved icon, how many hold it, rarity (% of the game&#39;s players) and, for you, when you earned it. :game is a Worlds experience id or key.
[**getWorldPlayerBadge**](WorldsBadgesApi.md#getWorldPlayerBadge) | **GET** /v1/worlds/players/{username}/badges | The game badges a person shows on their person page (only when they switched it on; Mature and non-public games never appear).
[**updateWorldBadgeProfile**](WorldsBadgesApi.md#updateWorldBadgeProfile) | **PUT** /v1/worlds/badges/profile | Show (or hide) the game badges you hold on your person page. Off by default.
[**updateWorldExperienceBadge**](WorldsBadgesApi.md#updateWorldExperienceBadge) | **PATCH** /v1/worlds/experiences/{experienceId}/badges/{badgeId} | Edit a badge: name, description, icon (null removes it), enabled. Badges are never deleted (players keep what they earned); turn one off to hide it and stop AwardBadge.


<a name="createWorldExperienceBadge"></a>
# **createWorldExperienceBadge**
> CreateWorldExperienceBadgeResponse createWorldExperienceBadge(experienceId)

Add a badge (at most 100 per game). name 1-50 characters, description up to 1000, iconSha256 &#x3D; the sha256 a png upload answered (POST /v1/world/interactive/assets, kind png); a new icon is shown once a person approved it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsBadgesApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceBadgeResponse = apiInstance.createWorldExperienceBadge(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsBadgesApi#createWorldExperienceBadge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsBadgesApi#createWorldExperienceBadge")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceBadgeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldBadgeMine"></a>
# **getWorldBadgeMine**
> GetWorldBadgeMineResponse getWorldBadgeMine()

Every game badge you hold, newest first, and whether your person page shows them.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsBadgesApi()
try {
    val result : GetWorldBadgeMineResponse = apiInstance.getWorldBadgeMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsBadgesApi#getWorldBadgeMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsBadgesApi#getWorldBadgeMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorldBadgeMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceBadge"></a>
# **getWorldExperienceBadge**
> GetWorldExperienceBadgeResponse getWorldExperienceBadge(experienceId)

A game&#39;s badges, oldest first: name, description, icon and its review state, on/off, how many players hold each; plus the player count (the rarity denominator) and the limits. Scripts award them with BadgeService.AwardBadge(player, badgeId).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsBadgesApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceBadgeResponse = apiInstance.getWorldExperienceBadge(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsBadgesApi#getWorldExperienceBadge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsBadgesApi#getWorldExperienceBadge")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceBadgeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldGameBadge"></a>
# **getWorldGameBadge**
> GetWorldGameBadgeResponse getWorldGameBadge(game)

A Crossly Carnival game&#39;s badges as players see them: name, description, approved icon, how many hold it, rarity (% of the game&#39;s players) and, for you, when you earned it. :game is a Worlds experience id or key.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsBadgesApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : GetWorldGameBadgeResponse = apiInstance.getWorldGameBadge(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsBadgesApi#getWorldGameBadge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsBadgesApi#getWorldGameBadge")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**GetWorldGameBadgeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPlayerBadge"></a>
# **getWorldPlayerBadge**
> GetWorldPlayerBadgeResponse getWorldPlayerBadge(username)

The game badges a person shows on their person page (only when they switched it on; Mature and non-public games never appear).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsBadgesApi()
val username : kotlin.String = username_example // kotlin.String | 
try {
    val result : GetWorldPlayerBadgeResponse = apiInstance.getWorldPlayerBadge(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsBadgesApi#getWorldPlayerBadge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsBadgesApi#getWorldPlayerBadge")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**|  |

### Return type

**GetWorldPlayerBadgeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldBadgeProfile"></a>
# **updateWorldBadgeProfile**
> UpdateWorldBadgeProfileResponse updateWorldBadgeProfile()

Show (or hide) the game badges you hold on your person page. Off by default.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsBadgesApi()
try {
    val result : UpdateWorldBadgeProfileResponse = apiInstance.updateWorldBadgeProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsBadgesApi#updateWorldBadgeProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsBadgesApi#updateWorldBadgeProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateWorldBadgeProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceBadge"></a>
# **updateWorldExperienceBadge**
> CreateWorldExperienceBadgeResponse updateWorldExperienceBadge(experienceId, badgeId)

Edit a badge: name, description, icon (null removes it), enabled. Badges are never deleted (players keep what they earned); turn one off to hide it and stop AwardBadge.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsBadgesApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val badgeId : kotlin.String = badgeId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceBadgeResponse = apiInstance.updateWorldExperienceBadge(experienceId, badgeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsBadgesApi#updateWorldExperienceBadge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsBadgesApi#updateWorldExperienceBadge")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **badgeId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceBadgeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

