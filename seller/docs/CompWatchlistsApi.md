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
> CreateCompWatchlistResponse createCompWatchlist()

Create a sold-comp watchlist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CompWatchlistsApi()
try {
    val result : CreateCompWatchlistResponse = apiInstance.createCompWatchlist()
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

[**CreateCompWatchlistResponse**](CreateCompWatchlistResponse.md)

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

[**CreateCompWatchlistScrapeResponse**](CreateCompWatchlistScrapeResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCompWatchlist"></a>
# **deleteCompWatchlist**
> DeleteCompWatchlistResponse deleteCompWatchlist(id)

Delete a sold-comp watchlist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CompWatchlistsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteCompWatchlistResponse = apiInstance.deleteCompWatchlist(id)
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

[**DeleteCompWatchlistResponse**](DeleteCompWatchlistResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCompWatchlistRecent"></a>
# **listCompWatchlistRecent**
> V1List listCompWatchlistRecent(id)

Recent external sold comps matching this watchlist.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CompWatchlistsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : V1List = apiInstance.listCompWatchlistRecent(id)
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCompWatchlists"></a>
# **listCompWatchlists**
> V1List listCompWatchlists()

List the seller&#39;s sold-comp watchlists.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CompWatchlistsApi()
try {
    val result : V1List = apiInstance.listCompWatchlists()
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

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

