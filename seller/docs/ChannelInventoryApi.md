# ChannelInventoryApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteChannelInventory**](ChannelInventoryApi.md#deleteChannelInventory) | **DELETE** /v1/channel-inventory/{platform}/{slot} | Reset a channel&#39;s inventory controls to the default (no cap, no buffer, sync on, end on sell-out).
[**getChannelInventory**](ChannelInventoryApi.md#getChannelInventory) | **GET** /v1/channel-inventory/{platform}/{slot} | Get one channel&#39;s inventory controls.
[**listChannelInventory**](ChannelInventoryApi.md#listChannelInventory) | **GET** /v1/channel-inventory | List every sales channel with its inventory controls (cap, buffer, sync, out-of-stock action, exclusions).
[**updateChannelInventory**](ChannelInventoryApi.md#updateChannelInventory) | **PUT** /v1/channel-inventory/{platform}/{slot} | Set a channel&#39;s quantity cap, buffer, sync toggle, out-of-stock action and exclusion lists (merge write).


<a name="deleteChannelInventory"></a>
# **deleteChannelInventory**
> ListChannelInventoryItem deleteChannelInventory(platform, slot)

Reset a channel&#39;s inventory controls to the default (no cap, no buffer, sync on, end on sell-out).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ChannelInventoryApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val slot : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListChannelInventoryItem = apiInstance.deleteChannelInventory(platform, slot)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelInventoryApi#deleteChannelInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelInventoryApi#deleteChannelInventory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **slot** | **kotlin.Int**|  |

### Return type

**ListChannelInventoryItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChannelInventory"></a>
# **getChannelInventory**
> ListChannelInventoryItem getChannelInventory(platform, slot)

Get one channel&#39;s inventory controls.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ChannelInventoryApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val slot : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListChannelInventoryItem = apiInstance.getChannelInventory(platform, slot)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelInventoryApi#getChannelInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelInventoryApi#getChannelInventory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **slot** | **kotlin.Int**|  |

### Return type

**ListChannelInventoryItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listChannelInventory"></a>
# **listChannelInventory**
> ListChannelInventoryResponse listChannelInventory()

List every sales channel with its inventory controls (cap, buffer, sync, out-of-stock action, exclusions).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ChannelInventoryApi()
try {
    val result : ListChannelInventoryResponse = apiInstance.listChannelInventory()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelInventoryApi#listChannelInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelInventoryApi#listChannelInventory")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListChannelInventoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateChannelInventory"></a>
# **updateChannelInventory**
> ListChannelInventoryItem updateChannelInventory(platform, slot)

Set a channel&#39;s quantity cap, buffer, sync toggle, out-of-stock action and exclusion lists (merge write).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = ChannelInventoryApi()
val platform : kotlin.String = platform_example // kotlin.String | 
val slot : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListChannelInventoryItem = apiInstance.updateChannelInventory(platform, slot)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChannelInventoryApi#updateChannelInventory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChannelInventoryApi#updateChannelInventory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  |
 **slot** | **kotlin.Int**|  |

### Return type

**ListChannelInventoryItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

