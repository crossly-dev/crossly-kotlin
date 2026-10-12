# CompWatchlistsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompWatchlist**](CompWatchlistsApi.md#createCompWatchlist) | **POST** /v1/comp-watchlists | Create a sold-comp watchlist.
[**createCompWatchlistScrape**](CompWatchlistsApi.md#createCompWatchlistScrape) | **POST** /v1/comp-watchlists/{id}/scrape | Manually trigger a watchlist scrape.
[**deleteCompWatchlist**](CompWatchlistsApi.md#deleteCompWatchlist) | **DELETE** /v1/comp-watchlists/{id} | Delete a sold-comp watchlist.
[**listCompWatchlistRecent**](CompWatchlistsApi.md#listCompWatchlistRecent) | **GET** /v1/comp-watchlists/{id}/recent | Recent external sold comps matching this watchlist.
[**listCompWatchlists**](CompWatchlistsApi.md#listCompWatchlists) | **GET** /v1/comp-watchlists | List the seller&#39;s sold-comp watchlists.


<a name="createCompWatchlist"></a>
# **createCompWatchlist**
> ListCompWatchlistsItem createCompWatchlist()

Create a sold-comp watchlist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CompWatchlistsApi()
try {
    val result : ListCompWatchlistsItem = apiInstance.createCompWatchlist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompWatchlistsApi#createCompWatchlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompWatchlistsApi#createCompWatchlist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListCompWatchlistsItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCompWatchlistScrape"></a>
# **createCompWatchlistScrape**
> CreateCompWatchlistScrapeResponse createCompWatchlistScrape(id)

Manually trigger a watchlist scrape.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CompWatchlistsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateCompWatchlistScrapeResponse = apiInstance.createCompWatchlistScrape(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompWatchlistsApi#createCompWatchlistScrape")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompWatchlistsApi#createCompWatchlistScrape")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateCompWatchlistScrapeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCompWatchlist"></a>
# **deleteCompWatchlist**
> OkResponse deleteCompWatchlist(id)

Delete a sold-comp watchlist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CompWatchlistsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteCompWatchlist(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompWatchlistsApi#deleteCompWatchlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompWatchlistsApi#deleteCompWatchlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCompWatchlistRecent"></a>
# **listCompWatchlistRecent**
> ListCompWatchlistRecentResponse listCompWatchlistRecent(id)

Recent external sold comps matching this watchlist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CompWatchlistsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListCompWatchlistRecentResponse = apiInstance.listCompWatchlistRecent(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompWatchlistsApi#listCompWatchlistRecent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompWatchlistsApi#listCompWatchlistRecent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListCompWatchlistRecentResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCompWatchlists"></a>
# **listCompWatchlists**
> ListCompWatchlistsResponse listCompWatchlists()

List the seller&#39;s sold-comp watchlists.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CompWatchlistsApi()
try {
    val result : ListCompWatchlistsResponse = apiInstance.listCompWatchlists()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompWatchlistsApi#listCompWatchlists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompWatchlistsApi#listCompWatchlists")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListCompWatchlistsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

