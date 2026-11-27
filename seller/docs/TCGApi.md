# TCGApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTcgChallenge**](TCGApi.md#createTcgChallenge) | **POST** /v1/tcg/{game}/challenges | Open a 1v1 challenge with one of your decks; another player joins it.
[**createTcgDeck**](TCGApi.md#createTcgDeck) | **POST** /v1/tcg/{game}/decks | Create (no id) or update a deck: its lead (Crew Boss, Mastermind or Keeper) and 40 cards you own, checked against the deck rules of its game.
[**createTcgMatchAct**](TCGApi.md#createTcgMatchAct) | **POST** /v1/tcg/matches/{id}/act | Make one move: { action } as listed in the match&#39;s legal moves. The engine checks it.
[**createTcgMatchJoin**](TCGApi.md#createTcgMatchJoin) | **POST** /v1/tcg/matches/{id}/join | Join an open 1v1 challenge with one of your decks.
[**createTcgPackOpen**](TCGApi.md#createTcgPackOpen) | **POST** /v1/tcg/packs/{id}/open | Open one of your earned packs: its eight cards join your collection.
[**createTcgPractice**](TCGApi.md#createTcgPractice) | **POST** /v1/tcg/{game}/practice | Start a practice match against the house bot with one of your decks.
[**createTcgQueue**](TCGApi.md#createTcgQueue) | **POST** /v1/tcg/{game}/queue | Join the ranked queue with an owned, legal deck (free). Returns the match at once when an opponent fits.
[**createTcgStarter**](TCGApi.md#createTcgStarter) | **POST** /v1/tcg/{game}/starter | Claim the free starter deck for a game, choosing its faction (once per account; account-bound, untradeable).
[**createTcgTable**](TCGApi.md#createTcgTable) | **POST** /v1/tcg/{game}/table | Sit at a table with your free starter deck (claimed now if you never did: starter names it, else one is picked for you): joins the oldest open 1v1 challenge, or opens one; already waiting, your own seat back.
[**createTcgTournament**](TCGApi.md#createTcgTournament) | **POST** /v1/tcg/{game}/tournaments | Host a Swiss tournament: name, optional top cut (4 or 8), round length, player cap and start time.
[**createTcgTournamentDrop**](TCGApi.md#createTcgTournamentDrop) | **POST** /v1/tcg/tournaments/{id}/drop | Leave a tournament before it starts, or drop from it (your results stand).
[**createTcgTournamentRegister**](TCGApi.md#createTcgTournamentRegister) | **POST** /v1/tcg/tournaments/{id}/register | Enter a tournament with an owned, legal deck before it starts.
[**createTcgTournamentStart**](TCGApi.md#createTcgTournamentStart) | **POST** /v1/tcg/tournaments/{id}/start | As the host, start the tournament: Swiss rounds are sized to the field and round 1 is dealt.
[**deleteTcgDeck**](TCGApi.md#deleteTcgDeck) | **DELETE** /v1/tcg/decks/{id} | Delete one of your decks.
[**deleteTcgQueue**](TCGApi.md#deleteTcgQueue) | **DELETE** /v1/tcg/{game}/queue | Leave the ranked queue.
[**getTcgCreatorGamePrint**](TCGApi.md#getTcgCreatorGamePrint) | **GET** /v1/tcg/creator/games/{id}/print | Print file links for your own creator card game (owner only): the set&#39;s print file, home sheets and a proof, for its newest version.
[**getTcgCreatorGamePrintByKind**](TCGApi.md#getTcgCreatorGamePrintByKind) | **GET** /v1/tcg/creator/games/{id}/print/{kind} | A PDF of your own creator card game (owner only): kind set | sheet | proof; ?version&#x3D;, ?paper&#x3D;letter|a4, ?card&#x3D; for a proof. Binary (application/pdf).
[**getTcgLadder**](TCGApi.md#getTcgLadder) | **GET** /v1/tcg/{game}/ladder | The season&#39;s ranked leaderboard for a game: place, rating, tier and record (named only where the player chose to be).
[**getTcgLadderMe**](TCGApi.md#getTcgLadderMe) | **GET** /v1/tcg/{game}/ladder/me | Your ranked rating, tier, place and record this season, and whether you are queued.
[**getTcgMatch**](TCGApi.md#getTcgMatch) | **GET** /v1/tcg/{game}/matches | Your recent matches, and open challenges you could join.
[**getTcgMatchById**](TCGApi.md#getTcgMatchById) | **GET** /v1/tcg/matches/{id} | Your view of a match (no hidden information) and, on your turn, every legal move.
[**getTcgMe**](TCGApi.md#getTcgMe) | **GET** /v1/tcg/{game}/me | Your starter faction, collection (card id -&gt; copies), decks and earned packs.
[**getTcgPrint**](TCGApi.md#getTcgPrint) | **GET** /v1/tcg/{game}/print | Print files for one of Crossly&#39;s own card games: a card proof (template), 3 x 3 Letter/A4 home sheets with crop marks, and the set&#39;s print file (63 x 88 mm, 3 mm bleed).
[**getTcgTournament**](TCGApi.md#getTcgTournament) | **GET** /v1/tcg/tournaments/{id} | A tournament&#39;s standings (points, opponents&#39; and game win %), this round&#39;s pairings and your seat.
[**listTcgCards**](TCGApi.md#listTcgCards) | **GET** /v1/tcg/{game}/cards | The game&#39;s card pool: every card with its rules text, stats, rarity and collector number.
[**listTcgGames**](TCGApi.md#listTcgGames) | **GET** /v1/tcg/games | Crossly&#39;s own card games: id, name, seats and card count.
[**listTcgTournaments**](TCGApi.md#listTcgTournaments) | **GET** /v1/tcg/{game}/tournaments | A game&#39;s recent and upcoming Swiss tournaments (free to enter; prizes are earned packs).


<a name="createTcgChallenge"></a>
# **createTcgChallenge**
> TcgResponse createTcgChallenge(game)

Open a 1v1 challenge with one of your decks; another player joins it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : TcgResponse = apiInstance.createTcgChallenge(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgChallenge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgChallenge")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**TcgResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgDeck"></a>
# **createTcgDeck**
> CreateTcgDeckResponse createTcgDeck(game)

Create (no id) or update a deck: its lead (Crew Boss, Mastermind or Keeper) and 40 cards you own, checked against the deck rules of its game.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : CreateTcgDeckResponse = apiInstance.createTcgDeck(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgDeck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgDeck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**CreateTcgDeckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgMatchAct"></a>
# **createTcgMatchAct**
> TcgResponse createTcgMatchAct(id)

Make one move: { action } as listed in the match&#39;s legal moves. The engine checks it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : TcgResponse = apiInstance.createTcgMatchAct(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgMatchAct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgMatchAct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**TcgResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgMatchJoin"></a>
# **createTcgMatchJoin**
> TcgResponse createTcgMatchJoin(id)

Join an open 1v1 challenge with one of your decks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : TcgResponse = apiInstance.createTcgMatchJoin(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgMatchJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgMatchJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**TcgResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgPackOpen"></a>
# **createTcgPackOpen**
> CreateTcgPackOpenResponse createTcgPackOpen(id)

Open one of your earned packs: its eight cards join your collection.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateTcgPackOpenResponse = apiInstance.createTcgPackOpen(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgPackOpen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgPackOpen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateTcgPackOpenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgPractice"></a>
# **createTcgPractice**
> TcgResponse createTcgPractice(game)

Start a practice match against the house bot with one of your decks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : TcgResponse = apiInstance.createTcgPractice(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgPractice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgPractice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**TcgResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgQueue"></a>
# **createTcgQueue**
> CreateTcgQueueResponse createTcgQueue(game)

Join the ranked queue with an owned, legal deck (free). Returns the match at once when an opponent fits.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : CreateTcgQueueResponse = apiInstance.createTcgQueue(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgQueue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgQueue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**CreateTcgQueueResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgStarter"></a>
# **createTcgStarter**
> CreateTcgStarterResponse createTcgStarter(game)

Claim the free starter deck for a game, choosing its faction (once per account; account-bound, untradeable).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : CreateTcgStarterResponse = apiInstance.createTcgStarter(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgStarter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgStarter")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**CreateTcgStarterResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgTable"></a>
# **createTcgTable**
> TcgResponse createTcgTable(game)

Sit at a table with your free starter deck (claimed now if you never did: starter names it, else one is picked for you): joins the oldest open 1v1 challenge, or opens one; already waiting, your own seat back.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : TcgResponse = apiInstance.createTcgTable(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgTable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgTable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**TcgResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgTournament"></a>
# **createTcgTournament**
> CreateTcgTournamentResponse createTcgTournament(game)

Host a Swiss tournament: name, optional top cut (4 or 8), round length, player cap and start time.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : CreateTcgTournamentResponse = apiInstance.createTcgTournament(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgTournament")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgTournament")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**CreateTcgTournamentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgTournamentDrop"></a>
# **createTcgTournamentDrop**
> TcgTournamentResponse createTcgTournamentDrop(id)

Leave a tournament before it starts, or drop from it (your results stand).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : TcgTournamentResponse = apiInstance.createTcgTournamentDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgTournamentDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgTournamentDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**TcgTournamentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgTournamentRegister"></a>
# **createTcgTournamentRegister**
> TcgTournamentResponse createTcgTournamentRegister(id)

Enter a tournament with an owned, legal deck before it starts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : TcgTournamentResponse = apiInstance.createTcgTournamentRegister(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgTournamentRegister")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgTournamentRegister")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**TcgTournamentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTcgTournamentStart"></a>
# **createTcgTournamentStart**
> TcgTournamentResponse createTcgTournamentStart(id)

As the host, start the tournament: Swiss rounds are sized to the field and round 1 is dealt.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : TcgTournamentResponse = apiInstance.createTcgTournamentStart(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#createTcgTournamentStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#createTcgTournamentStart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**TcgTournamentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTcgDeck"></a>
# **deleteTcgDeck**
> deleteTcgDeck(id)

Delete one of your decks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    apiInstance.deleteTcgDeck(id)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#deleteTcgDeck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#deleteTcgDeck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTcgQueue"></a>
# **deleteTcgQueue**
> deleteTcgQueue(game)

Leave the ranked queue.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    apiInstance.deleteTcgQueue(game)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#deleteTcgQueue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#deleteTcgQueue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgCreatorGamePrint"></a>
# **getTcgCreatorGamePrint**
> GetTcgCreatorGamePrintResponse getTcgCreatorGamePrint(id)

Print file links for your own creator card game (owner only): the set&#39;s print file, home sheets and a proof, for its newest version.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetTcgCreatorGamePrintResponse = apiInstance.getTcgCreatorGamePrint(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#getTcgCreatorGamePrint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#getTcgCreatorGamePrint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetTcgCreatorGamePrintResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgCreatorGamePrintByKind"></a>
# **getTcgCreatorGamePrintByKind**
> java.io.File getTcgCreatorGamePrintByKind(id, kind)

A PDF of your own creator card game (owner only): kind set | sheet | proof; ?version&#x3D;, ?paper&#x3D;letter|a4, ?card&#x3D; for a proof. Binary (application/pdf).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
val kind : kotlin.String = kind_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.getTcgCreatorGamePrintByKind(id, kind)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#getTcgCreatorGamePrintByKind")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#getTcgCreatorGamePrintByKind")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **kind** | **kotlin.String**|  |

### Return type

**java.io.File**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgLadder"></a>
# **getTcgLadder**
> GetTcgLadderResponse getTcgLadder(game)

The season&#39;s ranked leaderboard for a game: place, rating, tier and record (named only where the player chose to be).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : GetTcgLadderResponse = apiInstance.getTcgLadder(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#getTcgLadder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#getTcgLadder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**GetTcgLadderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgLadderMe"></a>
# **getTcgLadderMe**
> GetTcgLadderMeResponse getTcgLadderMe(game)

Your ranked rating, tier, place and record this season, and whether you are queued.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : GetTcgLadderMeResponse = apiInstance.getTcgLadderMe(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#getTcgLadderMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#getTcgLadderMe")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**GetTcgLadderMeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgMatch"></a>
# **getTcgMatch**
> GetTcgMatchResponse getTcgMatch(game)

Your recent matches, and open challenges you could join.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : GetTcgMatchResponse = apiInstance.getTcgMatch(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#getTcgMatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#getTcgMatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**GetTcgMatchResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgMatchById"></a>
# **getTcgMatchById**
> TcgResponse getTcgMatchById(id)

Your view of a match (no hidden information) and, on your turn, every legal move.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : TcgResponse = apiInstance.getTcgMatchById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#getTcgMatchById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#getTcgMatchById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**TcgResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgMe"></a>
# **getTcgMe**
> GetTcgMeResponse getTcgMe(game)

Your starter faction, collection (card id -&gt; copies), decks and earned packs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : GetTcgMeResponse = apiInstance.getTcgMe(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#getTcgMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#getTcgMe")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**GetTcgMeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgPrint"></a>
# **getTcgPrint**
> GetTcgPrintResponse getTcgPrint(game)

Print files for one of Crossly&#39;s own card games: a card proof (template), 3 x 3 Letter/A4 home sheets with crop marks, and the set&#39;s print file (63 x 88 mm, 3 mm bleed).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : GetTcgPrintResponse = apiInstance.getTcgPrint(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#getTcgPrint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#getTcgPrint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**GetTcgPrintResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTcgTournament"></a>
# **getTcgTournament**
> TcgTournamentResponse getTcgTournament(id)

A tournament&#39;s standings (points, opponents&#39; and game win %), this round&#39;s pairings and your seat.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : TcgTournamentResponse = apiInstance.getTcgTournament(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#getTcgTournament")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#getTcgTournament")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**TcgTournamentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTcgCards"></a>
# **listTcgCards**
> ListTcgCardsResponse listTcgCards(game)

The game&#39;s card pool: every card with its rules text, stats, rarity and collector number.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : ListTcgCardsResponse = apiInstance.listTcgCards(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#listTcgCards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#listTcgCards")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**ListTcgCardsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTcgGames"></a>
# **listTcgGames**
> ListTcgGamesResponse listTcgGames()

Crossly&#39;s own card games: id, name, seats and card count.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
try {
    val result : ListTcgGamesResponse = apiInstance.listTcgGames()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#listTcgGames")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#listTcgGames")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListTcgGamesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTcgTournaments"></a>
# **listTcgTournaments**
> ListTcgTournamentsResponse listTcgTournaments(game)

A game&#39;s recent and upcoming Swiss tournaments (free to enter; prizes are earned packs).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TCGApi()
val game : kotlin.String = game_example // kotlin.String | 
try {
    val result : ListTcgTournamentsResponse = apiInstance.listTcgTournaments(game)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TCGApi#listTcgTournaments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TCGApi#listTcgTournaments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **game** | **kotlin.String**|  |

### Return type

**ListTcgTournamentsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

