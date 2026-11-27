# TCGCreatorsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTcgCreatorGame**](TCGCreatorsApi.md#createTcgCreatorGame) | **POST** /v1/tcg/creator/games | Submit a card-game package version for review: game.json, cards.json, rules/game.js, thumb.png, art/_*.png as { path, base64 }. Checked, conformance-run, art quarantined, then reviewed by a person.
[**createTcgCreatorGameCheck**](TCGCreatorsApi.md#createTcgCreatorGameCheck) | **POST** /v1/tcg/creator/games/check | Check a card-game package exactly as a submission is checked -- the static report and bot games played against your rules in the sandbox -- storing nothing. Files as { path, base64 }.
[**createTcgCreatorGamePackOpen**](TCGCreatorsApi.md#createTcgCreatorGamePackOpen) | **POST** /v1/tcg/creator/games/{id}/packs/{packId}/open | Open a booster you hold: the game&#39;s rules pick the pulls, the pack is used up, and one COSM copy per card joins your collection (logged with its seed).
[**createTcgCreatorGameStarter**](TCGCreatorsApi.md#createTcgCreatorGameStarter) | **POST** /v1/tcg/creator/games/{id}/starter | Claim a creator game&#39;s free starter deck by its key (once per account; account-bound, never tradeable).
[**createTcgCreatorGameVersionWithdraw**](TCGCreatorsApi.md#createTcgCreatorGameVersionWithdraw) | **POST** /v1/tcg/creator/games/{id}/versions/{v}/withdraw | Withdraw one of your versions that is still waiting for review.
[**getTcgCreatorGame**](TCGCreatorsApi.md#getTcgCreatorGame) | **GET** /v1/tcg/creator/games/{id} | One live creator card game: its set, every card (rules text, rarity, art URL, game data) and its COSM prices.
[**getTcgCreatorGameCollection**](TCGCreatorsApi.md#getTcgCreatorGameCollection) | **GET** /v1/tcg/creator/games/{id}/collection | Your playable copies of a creator game: card id -&gt; copies (free starter plus every COSM copy you hold).
[**getTcgCreatorGamePopularity**](TCGCreatorsApi.md#getTcgCreatorGamePopularity) | **GET** /v1/tcg/creator/games/{id}/popularity | The set&#39;s progress toward going on chain: distinct collectors, packs opened and resales against the bar; when it passes, every holder may mint their cards as NFTs.
[**getTcgCreatorGameShelf**](TCGCreatorsApi.md#getTcgCreatorGameShelf) | **GET** /v1/tcg/creator/games/{id}/shelf | The game&#39;s COSM shelf: the booster and every single, each with its COSM design id (buy via /api/v1/cosm/cosmetics/:id/buy), price, edition cap and copies issued.
[**listTcgCreatorGamePacks**](TCGCreatorsApi.md#listTcgCreatorGamePacks) | **GET** /v1/tcg/creator/games/{id}/packs | Your unopened boosters of a creator game.
[**listTcgCreatorGames**](TCGCreatorsApi.md#listTcgCreatorGames) | **GET** /v1/tcg/creator/games | Live creator card games: name, set, description, typical match length, frame colours, thumbnail.
[**listTcgCreatorMine**](TCGCreatorsApi.md#listTcgCreatorMine) | **GET** /v1/tcg/creator/mine | Your creator card games and every version with its review state and note.


<a name="createTcgCreatorGame"></a>
# **createTcgCreatorGame**
> CreateTcgCreatorGameResponse createTcgCreatorGame()

Submit a card-game package version for review: game.json, cards.json, rules/game.js, thumb.png, art/_*.png as { path, base64 }. Checked, conformance-run, art quarantined, then reviewed by a person.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
try {
    val result : CreateTcgCreatorGameResponse = apiInstance.createTcgCreatorGame()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#createTcgCreatorGame")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#createTcgCreatorGame")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateTcgCreatorGameResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgCreatorGameCheck"></a>
# **createTcgCreatorGameCheck**
> CreateTcgCreatorGameCheckResponse createTcgCreatorGameCheck()

Check a card-game package exactly as a submission is checked -- the static report and bot games played against your rules in the sandbox -- storing nothing. Files as { path, base64 }.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
try {
    val result : CreateTcgCreatorGameCheckResponse = apiInstance.createTcgCreatorGameCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#createTcgCreatorGameCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#createTcgCreatorGameCheck")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateTcgCreatorGameCheckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgCreatorGamePackOpen"></a>
# **createTcgCreatorGamePackOpen**
> CreateTcgCreatorGamePackOpenResponse createTcgCreatorGamePackOpen(id, packId)

Open a booster you hold: the game&#39;s rules pick the pulls, the pack is used up, and one COSM copy per card joins your collection (logged with its seed).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
val id : kotlin.String = id_example // kotlin.String | 
val packId : kotlin.String = packId_example // kotlin.String | 
try {
    val result : CreateTcgCreatorGamePackOpenResponse = apiInstance.createTcgCreatorGamePackOpen(id, packId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#createTcgCreatorGamePackOpen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#createTcgCreatorGamePackOpen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **packId** | **kotlin.String**|  |

### Return type

**CreateTcgCreatorGamePackOpenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgCreatorGameStarter"></a>
# **createTcgCreatorGameStarter**
> CreateTcgStarterResponse createTcgCreatorGameStarter(id)

Claim a creator game&#39;s free starter deck by its key (once per account; account-bound, never tradeable).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateTcgStarterResponse = apiInstance.createTcgCreatorGameStarter(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#createTcgCreatorGameStarter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#createTcgCreatorGameStarter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateTcgStarterResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgCreatorGameVersionWithdraw"></a>
# **createTcgCreatorGameVersionWithdraw**
> createTcgCreatorGameVersionWithdraw(id, v)

Withdraw one of your versions that is still waiting for review.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
val id : kotlin.String = id_example // kotlin.String | 
val v : kotlin.String = v_example // kotlin.String | 
try {
    apiInstance.createTcgCreatorGameVersionWithdraw(id, v)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#createTcgCreatorGameVersionWithdraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#createTcgCreatorGameVersionWithdraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **v** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgCreatorGame"></a>
# **getTcgCreatorGame**
> GetTcgCreatorGameResponse getTcgCreatorGame(id)

One live creator card game: its set, every card (rules text, rarity, art URL, game data) and its COSM prices.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetTcgCreatorGameResponse = apiInstance.getTcgCreatorGame(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#getTcgCreatorGame")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#getTcgCreatorGame")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetTcgCreatorGameResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgCreatorGameCollection"></a>
# **getTcgCreatorGameCollection**
> GetTcgCreatorGameCollectionResponse getTcgCreatorGameCollection(id)

Your playable copies of a creator game: card id -&gt; copies (free starter plus every COSM copy you hold).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetTcgCreatorGameCollectionResponse = apiInstance.getTcgCreatorGameCollection(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#getTcgCreatorGameCollection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#getTcgCreatorGameCollection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetTcgCreatorGameCollectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgCreatorGamePopularity"></a>
# **getTcgCreatorGamePopularity**
> GetTcgCreatorGamePopularityResponse getTcgCreatorGamePopularity(id)

The set&#39;s progress toward going on chain: distinct collectors, packs opened and resales against the bar; when it passes, every holder may mint their cards as NFTs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetTcgCreatorGamePopularityResponse = apiInstance.getTcgCreatorGamePopularity(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#getTcgCreatorGamePopularity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#getTcgCreatorGamePopularity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetTcgCreatorGamePopularityResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgCreatorGameShelf"></a>
# **getTcgCreatorGameShelf**
> GetTcgCreatorGameShelfResponse getTcgCreatorGameShelf(id)

The game&#39;s COSM shelf: the booster and every single, each with its COSM design id (buy via /api/v1/cosm/cosmetics/:id/buy), price, edition cap and copies issued.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetTcgCreatorGameShelfResponse = apiInstance.getTcgCreatorGameShelf(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#getTcgCreatorGameShelf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#getTcgCreatorGameShelf")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetTcgCreatorGameShelfResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTcgCreatorGamePacks"></a>
# **listTcgCreatorGamePacks**
> ListTcgCreatorGamePacksResponse listTcgCreatorGamePacks(id)

Your unopened boosters of a creator game.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListTcgCreatorGamePacksResponse = apiInstance.listTcgCreatorGamePacks(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#listTcgCreatorGamePacks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#listTcgCreatorGamePacks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListTcgCreatorGamePacksResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTcgCreatorGames"></a>
# **listTcgCreatorGames**
> ListTcgCreatorGamesResponse listTcgCreatorGames()

Live creator card games: name, set, description, typical match length, frame colours, thumbnail.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
try {
    val result : ListTcgCreatorGamesResponse = apiInstance.listTcgCreatorGames()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#listTcgCreatorGames")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#listTcgCreatorGames")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListTcgCreatorGamesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTcgCreatorMine"></a>
# **listTcgCreatorMine**
> ListTcgCreatorMineResponse listTcgCreatorMine()

Your creator card games and every version with its review state and note.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGCreatorsApi()
try {
    val result : ListTcgCreatorMineResponse = apiInstance.listTcgCreatorMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGCreatorsApi#listTcgCreatorMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGCreatorsApi#listTcgCreatorMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListTcgCreatorMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

