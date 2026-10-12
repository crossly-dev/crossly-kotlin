# StallsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStallBook**](StallsApi.md#createStallBook) | **POST** /v1/stalls/book | Book and pay for a pop-up stall: { street, spotIndex, rail, unit: \&quot;day\&quot;, startDate, days } or { ..., unit: \&quot;event\&quot;, eventIds }, optional booth { canopy, pattern, lights, counter, piece } (premium values need holding; checked before paying). Paid up front; full-access token and Idempotency-Key required.
[**createStallBookingCancel**](StallsApi.md#createStallBookingCancel) | **POST** /v1/stalls/bookings/{id}/cancel | Cancel a stall before it opens: a full refund on the rail it was paid on. Final once it has opened.
[**getStallQuote**](StallsApi.md#getStallQuote) | **GET** /v1/stalls/quote | Quote a stall: street, spot, and either unit&#x3D;day with start (YYYY-MM-DD) and days, or unit&#x3D;event with events (comma-separated event ids). Returns the line items in cents, the rails the spot accepts and whether it is bookable.
[**listStallMine**](StallsApi.md#listStallMine) | **GET** /v1/stalls/mine | Your stall bookings, newest first, with visits, offers and sales while the stall was up.
[**listStreetEvents**](StallsApi.md#listStreetEvents) | **GET** /v1/streets/{slug}/events | Current and upcoming street events (Night Market, Swap Meet) on a street, soonest first.
[**listStreetStalls**](StallsApi.md#listStreetStalls) | **GET** /v1/streets/{slug}/stalls | Today&#39;s pop-up stalls on a street (each with its live listings, awning, sign and seller), plus the spots still free today. meta carries the street, the phase (day / night_market / swap_meet) and the free spots.
[**updateStallBooking**](StallsApi.md#updateStallBooking) | **PATCH** /v1/stalls/bookings/{id} | Change a booked stall before or while it is up: listingIds (up to 6 of your live listings), awning { colour, pattern }, booth { canopy, pattern, lights, counter, piece } (premium values need holding), sign, attendant.


<a name="createStallBook"></a>
# **createStallBook**
> CreateStallBookResponse createStallBook()

Book and pay for a pop-up stall: { street, spotIndex, rail, unit: \&quot;day\&quot;, startDate, days } or { ..., unit: \&quot;event\&quot;, eventIds }, optional booth { canopy, pattern, lights, counter, piece } (premium values need holding; checked before paying). Paid up front; full-access token and Idempotency-Key required.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StallsApi()
try {
    val result : CreateStallBookResponse = apiInstance.createStallBook()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StallsApi#createStallBook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StallsApi#createStallBook")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStallBookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStallBookingCancel"></a>
# **createStallBookingCancel**
> CreateStallBookingCancelResponse createStallBookingCancel(id)

Cancel a stall before it opens: a full refund on the rail it was paid on. Final once it has opened.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StallsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateStallBookingCancelResponse = apiInstance.createStallBookingCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StallsApi#createStallBookingCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StallsApi#createStallBookingCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateStallBookingCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStallQuote"></a>
# **getStallQuote**
> GetStallQuoteResponse getStallQuote(street, spot, unit, start, days, events)

Quote a stall: street, spot, and either unit&#x3D;day with start (YYYY-MM-DD) and days, or unit&#x3D;event with events (comma-separated event ids). Returns the line items in cents, the rails the spot accepts and whether it is bookable.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StallsApi()
val street : kotlin.String = street_example // kotlin.String | 
val spot : kotlin.Int = 56 // kotlin.Int | 
val unit : kotlin.String = unit_example // kotlin.String | 
val start : kotlin.String = start_example // kotlin.String | YYYY-MM-DD (unit=day).
val days : kotlin.Int = 56 // kotlin.Int | How many days (unit=day).
val events : kotlin.String = events_example // kotlin.String | Comma-separated street event ids (unit=event).
try {
    val result : GetStallQuoteResponse = apiInstance.getStallQuote(street, spot, unit, start, days, events)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StallsApi#getStallQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StallsApi#getStallQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **street** | **kotlin.String**|  |
 **spot** | **kotlin.Int**|  |
 **unit** | **kotlin.String**|  | [optional] [enum: day, event]
 **start** | **kotlin.String**| YYYY-MM-DD (unit&#x3D;day). | [optional]
 **days** | **kotlin.Int**| How many days (unit&#x3D;day). | [optional]
 **events** | **kotlin.String**| Comma-separated street event ids (unit&#x3D;event). | [optional]

### Return type

**GetStallQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStallMine"></a>
# **listStallMine**
> ListStallMineResponse listStallMine()

Your stall bookings, newest first, with visits, offers and sales while the stall was up.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StallsApi()
try {
    val result : ListStallMineResponse = apiInstance.listStallMine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StallsApi#listStallMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StallsApi#listStallMine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStallMineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStreetEvents"></a>
# **listStreetEvents**
> ListStreetEventsResponse listStreetEvents(slug)

Current and upcoming street events (Night Market, Swap Meet) on a street, soonest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StallsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListStreetEventsResponse = apiInstance.listStreetEvents(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StallsApi#listStreetEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StallsApi#listStreetEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListStreetEventsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStreetStalls"></a>
# **listStreetStalls**
> ListStreetStallsResponse listStreetStalls(slug)

Today&#39;s pop-up stalls on a street (each with its live listings, awning, sign and seller), plus the spots still free today. meta carries the street, the phase (day / night_market / swap_meet) and the free spots.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StallsApi()
val slug : kotlin.String = slug_example // kotlin.String | 
try {
    val result : ListStreetStallsResponse = apiInstance.listStreetStalls(slug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StallsApi#listStreetStalls")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StallsApi#listStreetStalls")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **kotlin.String**|  |

### Return type

**ListStreetStallsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStallBooking"></a>
# **updateStallBooking**
> CreateStallBookResponse updateStallBooking(id)

Change a booked stall before or while it is up: listingIds (up to 6 of your live listings), awning { colour, pattern }, booth { canopy, pattern, lights, counter, piece } (premium values need holding), sign, attendant.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StallsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateStallBookResponse = apiInstance.updateStallBooking(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StallsApi#updateStallBooking")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StallsApi#updateStallBooking")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateStallBookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

