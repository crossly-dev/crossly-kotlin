# CustomersApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerBulkDelete**](CustomersApi.md#createCustomerBulkDelete) | **POST** /v1/customers/bulk-delete | Bulk blocklist customer handles.
[**createCustomerBulkExport**](CustomersApi.md#createCustomerBulkExport) | **POST** /v1/customers/bulk-export | Bulk export aggregated customers as CSV.
[**getCustomer**](CustomersApi.md#getCustomer) | **GET** /v1/customers/{handle} | Get one customer with their recent 50 orders.
[**listCustomers**](CustomersApi.md#listCustomers) | **GET** /v1/customers | List aggregated customers (group-by lower(buyer_username)).


<a name="createCustomerBulkDelete"></a>
# **createCustomerBulkDelete**
> CreateCustomerBulkDeleteResponse createCustomerBulkDelete()

Bulk blocklist customer handles.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : CreateCustomerBulkDeleteResponse = apiInstance.createCustomerBulkDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createCustomerBulkDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createCustomerBulkDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateCustomerBulkDeleteResponse**](CreateCustomerBulkDeleteResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCustomerBulkExport"></a>
# **createCustomerBulkExport**
> kotlin.String createCustomerBulkExport()

Bulk export aggregated customers as CSV.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : kotlin.String = apiInstance.createCustomerBulkExport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createCustomerBulkExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createCustomerBulkExport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomer"></a>
# **getCustomer**
> GetCustomerResponse getCustomer(handle)

Get one customer with their recent 50 orders.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : GetCustomerResponse = apiInstance.getCustomer(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getCustomer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

[**GetCustomerResponse**](GetCustomerResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCustomers"></a>
# **listCustomers**
> V1List listCustomers()

List aggregated customers (group-by lower(buyer_username)).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : V1List = apiInstance.listCustomers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#listCustomers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#listCustomers")
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

