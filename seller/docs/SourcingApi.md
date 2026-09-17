# SourcingApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSourcingReceipt**](SourcingApi.md#createSourcingReceipt) | **POST** /v1/sourcing/receipts | Append a parsed receipt to the sourcing ledger.
[**getSourcingReceipt**](SourcingApi.md#getSourcingReceipt) | **GET** /v1/sourcing/receipts | List parsed sourcing receipts in this user&#39;s ledger.
[**listSourcingDemand**](SourcingApi.md#listSourcingDemand) | **GET** /v1/sourcing/demand | Items buyers looked for on other sites that Crossly did not have.
[**listSourcingDemandMine**](SourcingApi.md#listSourcingDemandMine) | **GET** /v1/sourcing/demand/mine | Unmet buyer demand for items you hold or have sold before.


<a name="createSourcingReceipt"></a>
# **createSourcingReceipt**
> CreateSourcingReceiptResponse createSourcingReceipt()

Append a parsed receipt to the sourcing ledger.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SourcingApi()
try {
    val result : CreateSourcingReceiptResponse = apiInstance.createSourcingReceipt()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcingApi#createSourcingReceipt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcingApi#createSourcingReceipt")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateSourcingReceiptResponse**](CreateSourcingReceiptResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSourcingReceipt"></a>
# **getSourcingReceipt**
> GetSourcingReceiptResponse getSourcingReceipt()

List parsed sourcing receipts in this user&#39;s ledger.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SourcingApi()
try {
    val result : GetSourcingReceiptResponse = apiInstance.getSourcingReceipt()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcingApi#getSourcingReceipt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcingApi#getSourcingReceipt")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSourcingReceiptResponse**](GetSourcingReceiptResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSourcingDemand"></a>
# **listSourcingDemand**
> V1List listSourcingDemand(days, minLooks, limit)

Items buyers looked for on other sites that Crossly did not have.

Aggregate demand observed by the Scout extension, ranked by MISSES — the times somebody asked and we had nothing. &#x60;medianPageCents&#x60; is what the retailers were charging, which is the number to source against. Anonymous in every case; there is no per-buyer view of this.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SourcingApi()
val days : kotlin.Int = 56 // kotlin.Int | 
val minLooks : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : V1List = apiInstance.listSourcingDemand(days, minLooks, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcingApi#listSourcingDemand")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcingApi#listSourcingDemand")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **days** | **kotlin.Int**|  | [optional] [default to 30]
 **minLooks** | **kotlin.Int**|  | [optional] [default to 3]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSourcingDemandMine"></a>
# **listSourcingDemandMine**
> V1List listSourcingDemandMine(days, minLookers, limit)

Unmet buyer demand for items you hold or have sold before.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SourcingApi()
val days : kotlin.Int = 56 // kotlin.Int | 
val minLookers : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : V1List = apiInstance.listSourcingDemandMine(days, minLookers, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SourcingApi#listSourcingDemandMine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SourcingApi#listSourcingDemandMine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **days** | **kotlin.Int**|  | [optional] [default to 60]
 **minLookers** | **kotlin.Int**|  | [optional] [default to 2]
 **limit** | **kotlin.Int**|  | [optional] [default to 25]

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

