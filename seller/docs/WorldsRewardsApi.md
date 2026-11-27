# WorldsRewardsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceRewardClose**](WorldsRewardsApi.md#createWorldExperienceRewardClose) | **POST** /v1/worlds/experiences/{experienceId}/rewards/close | Close the pool: the unspent balance returns to your Crossly Carnival earnings. Free rewards keep working.
[**createWorldExperienceRewardDefinition**](WorldsRewardsApi.md#createWorldExperienceRewardDefinition) | **POST** /v1/worlds/experiences/{experienceId}/rewards/definitions | Add a reward scripts can grant: pin, emote, decor, item (your own COSM design), cosm or cbx (with an amount).
[**createWorldExperienceRewardDeposit**](WorldsRewardsApi.md#createWorldExperienceRewardDeposit) | **POST** /v1/worlds/experiences/{experienceId}/rewards/deposits | Move available Crossly Carnival earnings into the pool ($1-$10,000). Owner only; idempotent on idempotencyKey.
[**createWorldExperienceRewardTopup**](WorldsRewardsApi.md#createWorldExperienceRewardTopup) | **POST** /v1/worlds/experiences/{experienceId}/rewards/topups | Open a card top-up ($5-$10,000 into the pool; the 2.9% + 30¢ card fee is added on top). Returns checkoutUrl, where the owner pays with Crossly checkout; the pool is credited once when the payment lands. Owner only.
[**createWorldRewardTopupCancel**](WorldsRewardsApi.md#createWorldRewardTopupCancel) | **POST** /v1/worlds/rewards/topups/{topupId}/cancel | Cancel an unpaid top-up sheet.
[**getWorldExperienceReward**](WorldsRewardsApi.md#getWorldExperienceReward) | **GET** /v1/worlds/experiences/{experienceId}/rewards | The funded reward pool: balance, reserved (owed) value, caps, today&#39;s grants, the reward catalogue and the published rates.
[**getWorldRewardTopup**](WorldsRewardsApi.md#getWorldRewardTopup) | **GET** /v1/worlds/rewards/topups/{topupId} | One card top-up: its status (open, paying, paid, cancelled, expired, refused), amounts and the pool it funds.
[**listWorldExperienceRewardGrants**](WorldsRewardsApi.md#listWorldExperienceRewardGrants) | **GET** /v1/worlds/experiences/{experienceId}/rewards/grants | Every grant, newest first: reward, player sub, amount, cost, status. Cursor-paged; ?sub&#x3D; for one player.
[**listWorldExperienceRewardLedger**](WorldsRewardsApi.md#listWorldExperienceRewardLedger) | **GET** /v1/worlds/experiences/{experienceId}/rewards/ledger | The pool&#39;s own ledger: deposits, grant draw-downs, refunds. Cursor-paged.
[**listWorldExperienceRewardTopups**](WorldsRewardsApi.md#listWorldExperienceRewardTopups) | **GET** /v1/worlds/experiences/{experienceId}/rewards/topups | Card top-ups of the reward pool, newest first: amount into the pool, card fee, status, what went back to the card.
[**updateWorldExperienceRewardDefinition**](WorldsRewardsApi.md#updateWorldExperienceRewardDefinition) | **PATCH** /v1/worlds/experiences/{experienceId}/rewards/definitions/{rewardId} | Edit a reward: name, description, image, amount, per-player daily cap, on/off. Key and kind never change.
[**updateWorldExperienceRewardPool**](WorldsRewardsApi.md#updateWorldExperienceRewardPool) | **PATCH** /v1/worlds/experiences/{experienceId}/rewards/pool | Set the pool&#39;s daily caps: total value per day, value and grant count per player per day.


<a name="createWorldExperienceRewardClose"></a>
# **createWorldExperienceRewardClose**
> CreateWorldExperienceRewardCloseResponse createWorldExperienceRewardClose(experienceId)

Close the pool: the unspent balance returns to your Crossly Carnival earnings. Free rewards keep working.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceRewardCloseResponse = apiInstance.createWorldExperienceRewardClose(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#createWorldExperienceRewardClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#createWorldExperienceRewardClose")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceRewardCloseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceRewardDefinition"></a>
# **createWorldExperienceRewardDefinition**
> CreateWorldExperienceRewardDefinitionResponse createWorldExperienceRewardDefinition(experienceId)

Add a reward scripts can grant: pin, emote, decor, item (your own COSM design), cosm or cbx (with an amount).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceRewardDefinitionResponse = apiInstance.createWorldExperienceRewardDefinition(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#createWorldExperienceRewardDefinition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#createWorldExperienceRewardDefinition")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceRewardDefinitionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceRewardDeposit"></a>
# **createWorldExperienceRewardDeposit**
> CreateWorldExperienceRewardDepositResponse createWorldExperienceRewardDeposit(experienceId)

Move available Crossly Carnival earnings into the pool ($1-$10,000). Owner only; idempotent on idempotencyKey.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceRewardDepositResponse = apiInstance.createWorldExperienceRewardDeposit(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#createWorldExperienceRewardDeposit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#createWorldExperienceRewardDeposit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceRewardDepositResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceRewardTopup"></a>
# **createWorldExperienceRewardTopup**
> CreateWorldExperienceRewardTopupResponse createWorldExperienceRewardTopup(experienceId)

Open a card top-up ($5-$10,000 into the pool; the 2.9% + 30¢ card fee is added on top). Returns checkoutUrl, where the owner pays with Crossly checkout; the pool is credited once when the payment lands. Owner only.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceRewardTopupResponse = apiInstance.createWorldExperienceRewardTopup(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#createWorldExperienceRewardTopup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#createWorldExperienceRewardTopup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceRewardTopupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldRewardTopupCancel"></a>
# **createWorldRewardTopupCancel**
> CreateWorldSpaceJoinResponse createWorldRewardTopupCancel(topupId)

Cancel an unpaid top-up sheet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val topupId : kotlin.String = topupId_example // kotlin.String | 
try {
    val result : CreateWorldSpaceJoinResponse = apiInstance.createWorldRewardTopupCancel(topupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#createWorldRewardTopupCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#createWorldRewardTopupCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topupId** | **kotlin.String**|  |

### Return type

**CreateWorldSpaceJoinResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceReward"></a>
# **getWorldExperienceReward**
> GetWorldExperienceRewardResponse getWorldExperienceReward(experienceId)

The funded reward pool: balance, reserved (owed) value, caps, today&#39;s grants, the reward catalogue and the published rates.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceRewardResponse = apiInstance.getWorldExperienceReward(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#getWorldExperienceReward")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#getWorldExperienceReward")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceRewardResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldRewardTopup"></a>
# **getWorldRewardTopup**
> GetWorldRewardTopupResponse getWorldRewardTopup(topupId)

One card top-up: its status (open, paying, paid, cancelled, expired, refused), amounts and the pool it funds.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val topupId : kotlin.String = topupId_example // kotlin.String | 
try {
    val result : GetWorldRewardTopupResponse = apiInstance.getWorldRewardTopup(topupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#getWorldRewardTopup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#getWorldRewardTopup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topupId** | **kotlin.String**|  |

### Return type

**GetWorldRewardTopupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceRewardGrants"></a>
# **listWorldExperienceRewardGrants**
> ListWorldExperienceRewardGrantsResponse listWorldExperienceRewardGrants(experienceId)

Every grant, newest first: reward, player sub, amount, cost, status. Cursor-paged; ?sub&#x3D; for one player.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceRewardGrantsResponse = apiInstance.listWorldExperienceRewardGrants(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#listWorldExperienceRewardGrants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#listWorldExperienceRewardGrants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceRewardGrantsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceRewardLedger"></a>
# **listWorldExperienceRewardLedger**
> ListWorldExperienceRewardLedgerResponse listWorldExperienceRewardLedger(experienceId)

The pool&#39;s own ledger: deposits, grant draw-downs, refunds. Cursor-paged.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceRewardLedgerResponse = apiInstance.listWorldExperienceRewardLedger(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#listWorldExperienceRewardLedger")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#listWorldExperienceRewardLedger")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceRewardLedgerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceRewardTopups"></a>
# **listWorldExperienceRewardTopups**
> ListWorldExperienceRewardTopupsResponse listWorldExperienceRewardTopups(experienceId)

Card top-ups of the reward pool, newest first: amount into the pool, card fee, status, what went back to the card.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceRewardTopupsResponse = apiInstance.listWorldExperienceRewardTopups(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#listWorldExperienceRewardTopups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#listWorldExperienceRewardTopups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceRewardTopupsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceRewardDefinition"></a>
# **updateWorldExperienceRewardDefinition**
> CreateWorldExperienceRewardDefinitionResponse updateWorldExperienceRewardDefinition(experienceId, rewardId)

Edit a reward: name, description, image, amount, per-player daily cap, on/off. Key and kind never change.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val rewardId : kotlin.String = rewardId_example // kotlin.String | 
try {
    val result : CreateWorldExperienceRewardDefinitionResponse = apiInstance.updateWorldExperienceRewardDefinition(experienceId, rewardId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#updateWorldExperienceRewardDefinition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#updateWorldExperienceRewardDefinition")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **rewardId** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceRewardDefinitionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceRewardPool"></a>
# **updateWorldExperienceRewardPool**
> UpdateWorldExperienceRewardPoolResponse updateWorldExperienceRewardPool(experienceId)

Set the pool&#39;s daily caps: total value per day, value and grant count per player per day.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsRewardsApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceRewardPoolResponse = apiInstance.updateWorldExperienceRewardPool(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsRewardsApi#updateWorldExperienceRewardPool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsRewardsApi#updateWorldExperienceRewardPool")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceRewardPoolResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

