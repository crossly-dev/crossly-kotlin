# BuyerMonitorsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerMonitor**](BuyerMonitorsApi.md#createBuyerMonitor) | **POST** /v1/buyer/monitors | Watch a search, and be told when it matches.
[**deleteBuyerMonitor**](BuyerMonitorsApi.md#deleteBuyerMonitor) | **DELETE** /v1/buyer/monitors/{id} | Delete a monitor.
[**listBuyerMonitorMatches**](BuyerMonitorsApi.md#listBuyerMonitorMatches) | **GET** /v1/buyer/monitors/{id}/matches | What this monitor has matched.
[**listBuyerMonitors**](BuyerMonitorsApi.md#listBuyerMonitors) | **GET** /v1/buyer/monitors | Your monitors.
[**updateBuyerMonitor**](BuyerMonitorsApi.md#updateBuyerMonitor) | **PATCH** /v1/buyer/monitors/{id} | Pause, resume or rename a monitor.


<a name="createBuyerMonitor"></a>
# **createBuyerMonitor**
> CreateBuyerMonitorResponse createBuyerMonitor()

Watch a search, and be told when it matches.

Works immediately — there is no review step. The signing secret is returned ONCE, here; it is never readable again. The first sweep SEEDS without firing: a restock alert created while the item is already in stock has not observed a restock, and a new-listing monitor would otherwise deliver the entire back catalogue.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerMonitorsApi()
try {
    val result : CreateBuyerMonitorResponse = apiInstance.createBuyerMonitor()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerMonitorsApi#createBuyerMonitor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerMonitorsApi#createBuyerMonitor")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateBuyerMonitorResponse**](CreateBuyerMonitorResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerMonitor"></a>
# **deleteBuyerMonitor**
> deleteBuyerMonitor(id)

Delete a monitor.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerMonitorsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteBuyerMonitor(id)
} catch (e: ClientException) {
    println("4xx response calling BuyerMonitorsApi#deleteBuyerMonitor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerMonitorsApi#deleteBuyerMonitor")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

null (empty response body)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerMonitorMatches"></a>
# **listBuyerMonitorMatches**
> V1List listBuyerMonitorMatches(id)

What this monitor has matched.

The read side of a &#x60;poll&#x60; monitor, and an audit trail for a &#x60;webhook&#x60; one — so a missed delivery does not mean lost data.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerMonitorsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : V1List = apiInstance.listBuyerMonitorMatches(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerMonitorsApi#listBuyerMonitorMatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerMonitorsApi#listBuyerMonitorMatches")
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


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuyerMonitors"></a>
# **listBuyerMonitors**
> V1List listBuyerMonitors()

Your monitors.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerMonitorsApi()
try {
    val result : V1List = apiInstance.listBuyerMonitors()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerMonitorsApi#listBuyerMonitors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerMonitorsApi#listBuyerMonitors")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1List**](V1List.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBuyerMonitor"></a>
# **updateBuyerMonitor**
> UpdateBuyerMonitorResponse updateBuyerMonitor(id)

Pause, resume or rename a monitor.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = BuyerMonitorsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateBuyerMonitorResponse = apiInstance.updateBuyerMonitor(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BuyerMonitorsApi#updateBuyerMonitor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BuyerMonitorsApi#updateBuyerMonitor")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdateBuyerMonitorResponse**](UpdateBuyerMonitorResponse.md)

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

