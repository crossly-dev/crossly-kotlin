# DropsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerDropJoin**](DropsApi.md#createBuyerDropJoin) | **POST** /v1/buyer/drops/{id}/join | Join a drop&#39;s line while it is open: one entry per account, the same odds as joining in the world. Repeating it returns the same entry.
[**deleteBuyerDropJoin**](DropsApi.md#deleteBuyerDropJoin) | **DELETE** /v1/buyer/drops/{id}/join | Leave a drop&#39;s line before the draw.
[**getBuyerDropMe**](DropsApi.md#getBuyerDropMe) | **GET** /v1/buyer/drops/{id}/me | Your entry in a drop: in line or not, your draw rank and outcome, and the checkout path while your 15-minute hold is live.


<a name="createBuyerDropJoin"></a>
# **createBuyerDropJoin**
> CreateBuyerDropJoinResponse createBuyerDropJoin(id)

Join a drop&#39;s line while it is open: one entry per account, the same odds as joining in the world. Repeating it returns the same entry.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = DropsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBuyerDropJoinResponse = apiInstance.createBuyerDropJoin(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DropsApi#createBuyerDropJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DropsApi#createBuyerDropJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateBuyerDropJoinResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBuyerDropJoin"></a>
# **deleteBuyerDropJoin**
> DeleteBuyerDropJoinResponse deleteBuyerDropJoin(id)

Leave a drop&#39;s line before the draw.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = DropsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteBuyerDropJoinResponse = apiInstance.deleteBuyerDropJoin(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DropsApi#deleteBuyerDropJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DropsApi#deleteBuyerDropJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**DeleteBuyerDropJoinResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuyerDropMe"></a>
# **getBuyerDropMe**
> GetBuyerDropMeResponse getBuyerDropMe(id)

Your entry in a drop: in line or not, your draw rank and outcome, and the checkout path while your 15-minute hold is live.

### Example
```kotlin
// Import classes:
//import net.crossly.buyer.infrastructure.*
//import net.crossly.buyer.models.*

val apiInstance = DropsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetBuyerDropMeResponse = apiInstance.getBuyerDropMe(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DropsApi#getBuyerDropMe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DropsApi#getBuyerDropMe")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetBuyerDropMeResponse**

### Authorization


Configure BuyerOAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

