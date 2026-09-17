# TaxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMileage**](TaxApi.md#createMileage) | **POST** /v1/mileage | Create a mileage entry.
[**deleteMileage**](TaxApi.md#deleteMileage) | **DELETE** /v1/mileage/{id} | Delete a mileage entry.
[**getMileageSummary**](TaxApi.md#getMileageSummary) | **GET** /v1/mileage/summary | Annual mileage totals + IRS deduction.
[**getTaxScheduleC**](TaxApi.md#getTaxScheduleC) | **GET** /v1/tax/schedule-c | Schedule C JSON for a tax year.
[**listMileage**](TaxApi.md#listMileage) | **GET** /v1/mileage | List mileage entries.
[**updateMileage**](TaxApi.md#updateMileage) | **PATCH** /v1/mileage/{id} | Update a mileage entry.


<a name="createMileage"></a>
# **createMileage**
> CreateMileageResponse createMileage()

Create a mileage entry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
try {
    val result : CreateMileageResponse = apiInstance.createMileage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#createMileage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#createMileage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateMileageResponse**](CreateMileageResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteMileage"></a>
# **deleteMileage**
> DeleteMileageResponse deleteMileage(id)

Delete a mileage entry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteMileageResponse = apiInstance.deleteMileage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#deleteMileage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#deleteMileage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**DeleteMileageResponse**](DeleteMileageResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMileageSummary"></a>
# **getMileageSummary**
> GetMileageSummaryResponse getMileageSummary()

Annual mileage totals + IRS deduction.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
try {
    val result : GetMileageSummaryResponse = apiInstance.getMileageSummary()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#getMileageSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#getMileageSummary")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetMileageSummaryResponse**](GetMileageSummaryResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaxScheduleC"></a>
# **getTaxScheduleC**
> GetTaxScheduleCResponse getTaxScheduleC()

Schedule C JSON for a tax year.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
try {
    val result : GetTaxScheduleCResponse = apiInstance.getTaxScheduleC()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#getTaxScheduleC")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#getTaxScheduleC")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetTaxScheduleCResponse**](GetTaxScheduleCResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMileage"></a>
# **listMileage**
> V1List listMileage()

List mileage entries.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
try {
    val result : V1List = apiInstance.listMileage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#listMileage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#listMileage")
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

<a name="updateMileage"></a>
# **updateMileage**
> UpdateMileageResponse updateMileage(id)

Update a mileage entry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateMileageResponse = apiInstance.updateMileage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#updateMileage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#updateMileage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdateMileageResponse**](UpdateMileageResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

