# NeighbourhoodsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNeighbourhood**](NeighbourhoodsApi.md#getNeighbourhood) | **GET** /v1/neighbourhoods/{slug} | One neighbourhood street by slug.
[**listNeighbourhoods**](NeighbourhoodsApi.md#listNeighbourhoods) | **GET** /v1/neighbourhoods | Every neighbourhood street (Sneaker Row, Card District, Vintage Alley, Vinyl Lane): open or \&quot;opening soon\&quot; (6 shops + open stalls, or a live street event), shops, stalls today, the next street event and its /c/&lt;slug&gt; URL.


<a name="getNeighbourhood"></a>
# **getNeighbourhood**
> GetNeighbourhoodResponse getNeighbourhood(slug)

One neighbourhood street by slug.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NeighbourhoodsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : GetNeighbourhoodResponse = apiInstance.getNeighbourhood(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NeighbourhoodsApi#getNeighbourhood")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NeighbourhoodsApi#getNeighbourhood")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  | [enum: sneaker-row, card-district, vintage-alley, vinyl-lane]

### Return type

**GetNeighbourhoodResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNeighbourhoods"></a>
# **listNeighbourhoods**
> ListNeighbourhoodsResponse listNeighbourhoods()

Every neighbourhood street (Sneaker Row, Card District, Vintage Alley, Vinyl Lane): open or \&quot;opening soon\&quot; (6 shops + open stalls, or a live street event), shops, stalls today, the next street event and its /c/&lt;slug&gt; URL.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = NeighbourhoodsApi()
try {
    val result : ListNeighbourhoodsResponse = apiInstance.listNeighbourhoods()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NeighbourhoodsApi#listNeighbourhoods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NeighbourhoodsApi#listNeighbourhoods")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListNeighbourhoodsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

