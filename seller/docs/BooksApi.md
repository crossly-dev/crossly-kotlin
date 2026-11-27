# BooksApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBookExpense**](BooksApi.md#createBookExpense) | **POST** /v1/books/expenses | Log a business expense: date, amountCents, a Schedule C category, vendor, description, receipt link, optionally recurring monthly or yearly.
[**deleteBookExpense**](BooksApi.md#deleteBookExpense) | **DELETE** /v1/books/expenses/{id} | Delete a logged expense. It leaves the P&amp;L and the exports.
[**getBook**](BooksApi.md#getBook) | **GET** /v1/books | Profit and loss for a year and period on the Schedule C lines: income, COGS, gross profit, expenses (marketplace fees, postage, mileage, your categories), net profit, monthly table, per-marketplace table with 1099-K expectations, Part III COGS, estimated tax and sales tax collected by marketplaces. Money in cents.
[**getBook1099k**](BooksApi.md#getBook1099k) | **GET** /v1/books/1099k | Per marketplace for a year: the 1099-K gross you recorded beside the gross Crossly computed, the difference, and whether a form is expected (federal: over $20,000 and over 200 transactions).
[**getBookExpense**](BooksApi.md#getBookExpense) | **GET** /v1/books/expenses | Your logged business expenses in a year and period (recurring ones expanded), with their Schedule C category. Amounts in cents.
[**getBookTaxProfile**](BooksApi.md#getBookTaxProfile) | **GET** /v1/books/tax-profile | Your tax profile: time zone for books boundaries, filing status, state, set-aside and rate assumptions, accounting method, and business name, EIN and address.
[**getBookTransaction**](BooksApi.md#getBookTransaction) | **GET** /v1/books/transactions | The sale rows behind any P&amp;L line, newest first: gross, refunded, fee and fee source, shipping, COGS, tax collected and net, in cents.
[**updateBook1099k**](BooksApi.md#updateBook1099k) | **PUT** /v1/books/1099k | Record what a marketplace reported on its 1099-K for a year (gross in cents, transactions, notes). Answers the year&#39;s reconciliation, as GET /v1/books/1099k does.
[**updateBookExpense**](BooksApi.md#updateBookExpense) | **PATCH** /v1/books/expenses/{id} | Change a logged expense.
[**updateBookTaxProfile**](BooksApi.md#updateBookTaxProfile) | **PUT** /v1/books/tax-profile | Update your tax profile: time zone, filing status, state, set-aside and rate assumptions (basis points), accounting method, business name, EIN and address. Fields left out are unchanged.


<a name="createBookExpense"></a>
# **createBookExpense**
> CreateBookExpenseResponse createBookExpense()

Log a business expense: date, amountCents, a Schedule C category, vendor, description, receipt link, optionally recurring monthly or yearly.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BooksApi()
try {
    val result : CreateBookExpenseResponse = apiInstance.createBookExpense()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BooksApi#createBookExpense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BooksApi#createBookExpense")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBookExpenseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBookExpense"></a>
# **deleteBookExpense**
> DeleteStoryResponse deleteBookExpense(id)

Delete a logged expense. It leaves the P&amp;L and the exports.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BooksApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The expense id.
try {
    val result : DeleteStoryResponse = apiInstance.deleteBookExpense(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BooksApi#deleteBookExpense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BooksApi#deleteBookExpense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The expense id. |

### Return type

**DeleteStoryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBook"></a>
# **getBook**
> GetBookResponse getBook(year, period, tz)

Profit and loss for a year and period on the Schedule C lines: income, COGS, gross profit, expenses (marketplace fees, postage, mileage, your categories), net profit, monthly table, per-marketplace table with 1099-K expectations, Part III COGS, estimated tax and sales tax collected by marketplaces. Money in cents.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BooksApi()
val year : kotlin.Int = 56 // kotlin.Int | Tax year. Default the current year.
val period : kotlin.String = period_example // kotlin.String | fy = full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone.
val tz : kotlin.String = tz_example // kotlin.String | IANA zone; default your tax profile zone.
try {
    val result : GetBookResponse = apiInstance.getBook(year, period, tz)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BooksApi#getBook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BooksApi#getBook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **kotlin.Int**| Tax year. Default the current year. | [optional]
 **period** | **kotlin.String**| fy &#x3D; full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone. | [optional] [enum: fy, ytd, q1, q2, q3, q4, m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12]
 **tz** | **kotlin.String**| IANA zone; default your tax profile zone. | [optional]

### Return type

**GetBookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBook1099k"></a>
# **getBook1099k**
> GetBook1099kResponse getBook1099k(year)

Per marketplace for a year: the 1099-K gross you recorded beside the gross Crossly computed, the difference, and whether a form is expected (federal: over $20,000 and over 200 transactions).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BooksApi()
val year : kotlin.Int = 56 // kotlin.Int | Tax year. Default the current year.
try {
    val result : GetBook1099kResponse = apiInstance.getBook1099k(year)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BooksApi#getBook1099k")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BooksApi#getBook1099k")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **kotlin.Int**| Tax year. Default the current year. | [optional]

### Return type

**GetBook1099kResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBookExpense"></a>
# **getBookExpense**
> GetBookExpenseResponse getBookExpense(year, period, category, page, size)

Your logged business expenses in a year and period (recurring ones expanded), with their Schedule C category. Amounts in cents.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BooksApi()
val year : kotlin.Int = 56 // kotlin.Int | Tax year. Default the current year.
val period : kotlin.String = period_example // kotlin.String | fy = full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone.
val category : kotlin.String = category_example // kotlin.String | An expense category id, e.g. supplies, postage, software_subscriptions.
val page : kotlin.Int = 56 // kotlin.Int | 1-indexed page. Default 1.
val size : kotlin.Int = 56 // kotlin.Int | Rows per page, at most 100. Default 25.
try {
    val result : GetBookExpenseResponse = apiInstance.getBookExpense(year, period, category, page, size)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BooksApi#getBookExpense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BooksApi#getBookExpense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **kotlin.Int**| Tax year. Default the current year. | [optional]
 **period** | **kotlin.String**| fy &#x3D; full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone. | [optional] [enum: fy, ytd, q1, q2, q3, q4, m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12]
 **category** | **kotlin.String**| An expense category id, e.g. supplies, postage, software_subscriptions. | [optional]
 **page** | **kotlin.Int**| 1-indexed page. Default 1. | [optional]
 **size** | **kotlin.Int**| Rows per page, at most 100. Default 25. | [optional]

### Return type

**GetBookExpenseResponse**

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

val apiInstance = BooksApi()
try {
    val result : GetBookTaxProfileResponse = apiInstance.getBookTaxProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BooksApi#getBookTaxProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BooksApi#getBookTaxProfile")
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

<a name="getBookTransaction"></a>
# **getBookTransaction**
> GetBookTransactionResponse getBookTransaction(year, period, tz, platform, status, page, size)

The sale rows behind any P&amp;L line, newest first: gross, refunded, fee and fee source, shipping, COGS, tax collected and net, in cents.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BooksApi()
val year : kotlin.Int = 56 // kotlin.Int | Tax year. Default the current year.
val period : kotlin.String = period_example // kotlin.String | fy = full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone.
val tz : kotlin.String = tz_example // kotlin.String | IANA zone; default your tax profile zone.
val platform : kotlin.String = platform_example // kotlin.String | One platform id.
val status : kotlin.String = status_example // kotlin.String | completed = counted in income; pending = details not in yet (no money); default all.
val page : kotlin.Int = 56 // kotlin.Int | 1-indexed page. Default 1.
val size : kotlin.Int = 56 // kotlin.Int | Rows per page, at most 100. Default 50.
try {
    val result : GetBookTransactionResponse = apiInstance.getBookTransaction(year, period, tz, platform, status, page, size)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BooksApi#getBookTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BooksApi#getBookTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **kotlin.Int**| Tax year. Default the current year. | [optional]
 **period** | **kotlin.String**| fy &#x3D; full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone. | [optional] [enum: fy, ytd, q1, q2, q3, q4, m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12]
 **tz** | **kotlin.String**| IANA zone; default your tax profile zone. | [optional]
 **platform** | **kotlin.String**| One platform id. | [optional]
 **status** | **kotlin.String**| completed &#x3D; counted in income; pending &#x3D; details not in yet (no money); default all. | [optional] [enum: completed, cancelled, refunded, pending, all]
 **page** | **kotlin.Int**| 1-indexed page. Default 1. | [optional]
 **size** | **kotlin.Int**| Rows per page, at most 100. Default 50. | [optional]

### Return type

**GetBookTransactionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBook1099k"></a>
# **updateBook1099k**
> GetBook1099kResponse updateBook1099k()

Record what a marketplace reported on its 1099-K for a year (gross in cents, transactions, notes). Answers the year&#39;s reconciliation, as GET /v1/books/1099k does.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BooksApi()
try {
    val result : GetBook1099kResponse = apiInstance.updateBook1099k()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BooksApi#updateBook1099k")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BooksApi#updateBook1099k")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBook1099kResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBookExpense"></a>
# **updateBookExpense**
> CreateBookExpenseResponse updateBookExpense(id)

Change a logged expense.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BooksApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The expense id.
try {
    val result : CreateBookExpenseResponse = apiInstance.updateBookExpense(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BooksApi#updateBookExpense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BooksApi#updateBookExpense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| The expense id. |

### Return type

**CreateBookExpenseResponse**

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

val apiInstance = BooksApi()
try {
    val result : GetBookTaxProfileResponse = apiInstance.updateBookTaxProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BooksApi#updateBookTaxProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BooksApi#updateBookTaxProfile")
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

