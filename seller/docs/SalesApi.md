# SalesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSaleBulkDelete**](SalesApi.md#createSaleBulkDelete) | **POST** /v1/sales/bulk-delete | Bulk soft-delete sales rows.
[**listSales**](SalesApi.md#listSales) | **GET** /v1/sales | List sales (each unique sale event).


<a name="createSaleBulkDelete"></a>
# **createSaleBulkDelete**
> CreateSaleBulkDeleteResponse createSaleBulkDelete()

Bulk soft-delete sales rows.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SalesApi()
try {
    val result : CreateSaleBulkDeleteResponse = apiInstance.createSaleBulkDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesApi#createSaleBulkDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesApi#createSaleBulkDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateSaleBulkDeleteResponse**](CreateSaleBulkDeleteResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSales"></a>
# **listSales**
> V1List listSales()

List sales (each unique sale event).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = SalesApi()
try {
    val result : V1List = apiInstance.listSales()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesApi#listSales")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesApi#listSales")
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

