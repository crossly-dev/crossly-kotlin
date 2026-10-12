# DropsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrop**](DropsApi.md#createDrop) | **POST** /v1/drops | Set up a drop: { title, listingIds (1-10 of your live Crossly listings), units (at most their stock), opensLineAt, releaseAt (ISO), eligibility: \&quot;signed_in\&quot; | \&quot;verified\&quot; }. The line opens at opensLineAt with a published seed commitment; the draw runs at releaseAt.
[**deleteDrop**](DropsApi.md#deleteDrop) | **DELETE** /v1/drops/{id} | Call a drop off before its line opens.
[**getDrop**](DropsApi.md#getDrop) | **GET** /v1/drops/{id} | A drop: its listings, units, times, eligibility, the sha256 seed commitment and the entry count. After release also the revealed seed, the sorted entry ids and the draw order (recompute it with drawWinners(seed, dropId, entryIds, units)).
[**listDropMine**](DropsApi.md#listDropMine) | **GET** /v1/drops/mine | Your drops, latest release first, with entries, winners, claims, the waitlist and expired holds.
[**listStreetDrops**](DropsApi.md#listStreetDrops) | **GET** /v1/streets/{slug}/drops | Upcoming, open and just-released drops on a Crossly World street, one per shop, soonest first, with the plot (or live stall spot) each line forms at.
[**updateDrop**](DropsApi.md#updateDrop) | **PATCH** /v1/drops/{id} | Change a drop before its line opens (any of the set-up fields).


<a name="createDrop"></a>
# **createDrop**
> CreateDropResponse createDrop()

Set up a drop: { title, listingIds (1-10 of your live Crossly listings), units (at most their stock), opensLineAt, releaseAt (ISO), eligibility: \&quot;signed_in\&quot; | \&quot;verified\&quot; }. The line opens at opensLineAt with a published seed commitment; the draw runs at releaseAt.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DropsApi()
try {
    val result : CreateDropResponse = apiInstance.createDrop()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DropsApi#createDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DropsApi#createDrop")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDrop"></a>
# **deleteDrop**
> DeleteDropResponse deleteDrop(id)

Call a drop off before its line opens.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DropsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteDropResponse = apiInstance.deleteDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DropsApi#deleteDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DropsApi#deleteDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**DeleteDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDrop"></a>
# **getDrop**
> GetDropResponse getDrop(id)

A drop: its listings, units, times, eligibility, the sha256 seed commitment and the entry count. After release also the revealed seed, the sorted entry ids and the draw order (recompute it with drawWinners(seed, dropId, entryIds, units)).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DropsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetDropResponse = apiInstance.getDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DropsApi#getDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DropsApi#getDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDropMine"></a>
# **listDropMine**
> ListDropMineResponse listDropMine()

Your drops, latest release first, with entries, winners, claims, the waitlist and expired holds.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DropsApi()
try {
    val result : ListDropMineResponse = apiInstance.listDropMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DropsApi#listDropMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DropsApi#listDropMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListDropMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStreetDrops"></a>
# **listStreetDrops**
> ListStreetDropsResponse listStreetDrops(slug)

Upcoming, open and just-released drops on a Crossly World street, one per shop, soonest first, with the plot (or live stall spot) each line forms at.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DropsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListStreetDropsResponse = apiInstance.listStreetDrops(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DropsApi#listStreetDrops")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DropsApi#listStreetDrops")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListStreetDropsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDrop"></a>
# **updateDrop**
> CreateDropResponse updateDrop(id)

Change a drop before its line opens (any of the set-up fields).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DropsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateDropResponse = apiInstance.updateDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DropsApi#updateDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DropsApi#updateDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

