# TaxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMileage**](TaxApi.md#createMileage) | **POST** /v1/mileage | Create a mileage entry.
[**deleteMileage**](TaxApi.md#deleteMileage) | **DELETE** /v1/mileage/{id} | Delete a mileage entry.
[**getBookTaxProfile**](TaxApi.md#getBookTaxProfile) | **GET** /v1/books/tax-profile | Your tax profile: time zone for books boundaries, filing status, state, set-aside and rate assumptions, accounting method, and business name, EIN and address.
[**getMileageSummary**](TaxApi.md#getMileageSummary) | **GET** /v1/mileage/summary | Annual mileage totals + IRS deduction. Each trip is priced at the IRS rate on its own date (2026 has two rates, listed in &#x60;rates&#x60;); &#x60;ratePerMile&#x60; is the January rate.
[**getOrderSalesTax**](TaxApi.md#getOrderSalesTax) | **GET** /v1/orders/{id}/sales-tax | Who collected sales tax on one Crossly marketplace order, where, and the seller notice.
[**getTaxSalesTax**](TaxApi.md#getTaxSalesTax) | **GET** /v1/tax/sales-tax | Crossly marketplace sales Crossly did not collect sales tax on, by jurisdiction.
[**getTaxScheduleC**](TaxApi.md#getTaxScheduleC) | **GET** /v1/tax/schedule-c | Schedule C JSON for a tax year (default the current year), from the same P&amp;L as GET /v1/books: line 1 gross receipts before refunds, line 2 refunds, COGS in Part III, completed sales only. GET /v1/books has the full P&amp;L by period.
[**listMileage**](TaxApi.md#listMileage) | **GET** /v1/mileage | List mileage entries, newest trip first, paged (limit up to 500). Narrow by year and/or an inclusive from/to date range.
[**listTaxCrosslyCollects**](TaxApi.md#listTaxCrosslyCollects) | **GET** /v1/tax/crossly-collects | Where Crossly collects sales tax today (its active Stripe Tax registrations).
[**listTaxSalesTaxNotCollected**](TaxApi.md#listTaxSalesTaxNotCollected) | **GET** /v1/tax/sales-tax/not-collected | The individual Crossly sales Crossly did not collect sales tax on, newest first.
[**updateBookTaxProfile**](TaxApi.md#updateBookTaxProfile) | **PUT** /v1/books/tax-profile | Update your tax profile: time zone, filing status, state, set-aside and rate assumptions (basis points), accounting method, business name, EIN and address. Fields left out are unchanged.
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

**CreateMileageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteMileage"></a>
# **deleteMileage**
> OkResponse deleteMileage(id)

Delete a mileage entry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteMileage(id)
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

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBookTaxProfile"></a>
# **getBookTaxProfile**
> GetBookTaxProfileResponse getBookTaxProfile()

Your tax profile: time zone for books boundaries, filing status, state, set-aside and rate assumptions, accounting method, and business name, EIN and address.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
try {
    val result : GetBookTaxProfileResponse = apiInstance.getBookTaxProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#getBookTaxProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#getBookTaxProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBookTaxProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMileageSummary"></a>
# **getMileageSummary**
> GetMileageSummaryResponse getMileageSummary(year)

Annual mileage totals + IRS deduction. Each trip is priced at the IRS rate on its own date (2026 has two rates, listed in &#x60;rates&#x60;); &#x60;ratePerMile&#x60; is the January rate.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
val year : kotlin.Int = 56 // kotlin.Int | Calendar tax year. Default the current year.
try {
    val result : GetMileageSummaryResponse = apiInstance.getMileageSummary(year)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **kotlin.Int**| Calendar tax year. Default the current year. | [optional]

### Return type

**GetMileageSummaryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrderSalesTax"></a>
# **getOrderSalesTax**
> GetOrderSalesTaxResponse getOrderSalesTax(id)

Who collected sales tax on one Crossly marketplace order, where, and the seller notice.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetOrderSalesTaxResponse = apiInstance.getOrderSalesTax(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#getOrderSalesTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#getOrderSalesTax")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetOrderSalesTaxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaxSalesTax"></a>
# **getTaxSalesTax**
> GetTaxSalesTaxResponse getTaxSalesTax(from, to)

Crossly marketplace sales Crossly did not collect sales tax on, by jurisdiction.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
val from : kotlin.String = from_example // kotlin.String | YYYY-MM-DD, inclusive. Default 1 January this year.
val to : kotlin.String = to_example // kotlin.String | YYYY-MM-DD, inclusive. Default now.
try {
    val result : GetTaxSalesTaxResponse = apiInstance.getTaxSalesTax(from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#getTaxSalesTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#getTaxSalesTax")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.String**| YYYY-MM-DD, inclusive. Default 1 January this year. | [optional]
 **to** | **kotlin.String**| YYYY-MM-DD, inclusive. Default now. | [optional]

### Return type

**GetTaxSalesTaxResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaxScheduleC"></a>
# **getTaxScheduleC**
> GetTaxScheduleCResponse getTaxScheduleC()

Schedule C JSON for a tax year (default the current year), from the same P&amp;L as GET /v1/books: line 1 gross receipts before refunds, line 2 refunds, COGS in Part III, completed sales only. GET /v1/books has the full P&amp;L by period.

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

**GetTaxScheduleCResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMileage"></a>
# **listMileage**
> ListMileageResponse listMileage(year, from, to, page, limit)

List mileage entries, newest trip first, paged (limit up to 500). Narrow by year and/or an inclusive from/to date range.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
val year : kotlin.Int = 56 // kotlin.Int | Only trips dated in this calendar year.
val from : kotlin.String = from_example // kotlin.String | YYYY-MM-DD, inclusive. Only trips on or after this date. Combines with year.
val to : kotlin.String = to_example // kotlin.String | YYYY-MM-DD, inclusive. Only trips on or before this date; from <= to.
val page : kotlin.Int = 56 // kotlin.Int | 1-indexed page. Default 1.
val limit : kotlin.Int = 56 // kotlin.Int | Rows per page, default 100, clamped to 500.
try {
    val result : ListMileageResponse = apiInstance.listMileage(year, from, to, page, limit)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **kotlin.Int**| Only trips dated in this calendar year. | [optional]
 **from** | **kotlin.String**| YYYY-MM-DD, inclusive. Only trips on or after this date. Combines with year. | [optional]
 **to** | **kotlin.String**| YYYY-MM-DD, inclusive. Only trips on or before this date; from &lt;&#x3D; to. | [optional]
 **page** | **kotlin.Int**| 1-indexed page. Default 1. | [optional]
 **limit** | **kotlin.Int**| Rows per page, default 100, clamped to 500. | [optional]

### Return type

**ListMileageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTaxCrosslyCollects"></a>
# **listTaxCrosslyCollects**
> ListTaxCrosslyCollectsResponse listTaxCrosslyCollects()

Where Crossly collects sales tax today (its active Stripe Tax registrations).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
try {
    val result : ListTaxCrosslyCollectsResponse = apiInstance.listTaxCrosslyCollects()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#listTaxCrosslyCollects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#listTaxCrosslyCollects")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListTaxCrosslyCollectsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTaxSalesTaxNotCollected"></a>
# **listTaxSalesTaxNotCollected**
> ListTaxSalesTaxNotCollectedResponse listTaxSalesTaxNotCollected(from, to, page, limit)

The individual Crossly sales Crossly did not collect sales tax on, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
val from : kotlin.String = from_example // kotlin.String | 
val to : kotlin.String = to_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ListTaxSalesTaxNotCollectedResponse = apiInstance.listTaxSalesTaxNotCollected(from, to, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#listTaxSalesTaxNotCollected")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#listTaxSalesTaxNotCollected")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.String**|  | [optional]
 **to** | **kotlin.String**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

**ListTaxSalesTaxNotCollectedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBookTaxProfile"></a>
# **updateBookTaxProfile**
> GetBookTaxProfileResponse updateBookTaxProfile()

Update your tax profile: time zone, filing status, state, set-aside and rate assumptions (basis points), accounting method, business name, EIN and address. Fields left out are unchanged.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
try {
    val result : GetBookTaxProfileResponse = apiInstance.updateBookTaxProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#updateBookTaxProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#updateBookTaxProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBookTaxProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMileage"></a>
# **updateMileage**
> CreateMileageResponse updateMileage(id)

Update a mileage entry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TaxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateMileageResponse = apiInstance.updateMileage(id)
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

**CreateMileageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

