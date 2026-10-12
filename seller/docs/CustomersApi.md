# CustomersApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerBulkDelete**](CustomersApi.md#createCustomerBulkDelete) | **POST** /v1/customers/bulk-delete | Bulk blocklist customer handles.
[**createCustomerBulkExport**](CustomersApi.md#createCustomerBulkExport) | **POST** /v1/customers/bulk-export | Bulk export aggregated customers as CSV.
[**createCustomerRefreshProfile**](CustomersApi.md#createCustomerRefreshProfile) | **POST** /v1/customers/{handle}/refresh-profile | Queue a fresh read of a customer&#39;s buyer profiles on every platform they ordered on.
[**getCustomer**](CustomersApi.md#getCustomer) | **GET** /v1/customers/{handle} | Get one customer: recent 50 orders, buyer profiles per platform, and stats over all of their orders.
[**getLoyaltyClub**](CustomersApi.md#getLoyaltyClub) | **GET** /v1/loyalty/club | Your loyalty club: tiers and how many members are in each.
[**listCustomers**](CustomersApi.md#listCustomers) | **GET** /v1/customers | List aggregated customers (group-by lower(buyer_username)), each with its best avatar, display name and star rating.
[**listLoyaltyMembers**](CustomersApi.md#listLoyaltyMembers) | **GET** /v1/loyalty/members | Your loyalty club’s members, by spend with you.
[**updateLoyaltyClub**](CustomersApi.md#updateLoyaltyClub) | **PUT** /v1/loyalty/club | Create or update your loyalty club: name, on/off, and up to 6 spend tiers each with a discount (≤ 30%) and perks.


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

**CreateCustomerBulkDeleteResponse**

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

<a name="createCustomerRefreshProfile"></a>
# **createCustomerRefreshProfile**
> CreateCustomerRefreshProfileResponse createCustomerRefreshProfile(handle)

Queue a fresh read of a customer&#39;s buyer profiles on every platform they ordered on.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : CreateCustomerRefreshProfileResponse = apiInstance.createCustomerRefreshProfile(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createCustomerRefreshProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createCustomerRefreshProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**CreateCustomerRefreshProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomer"></a>
# **getCustomer**
> GetCustomerResponse getCustomer(handle)

Get one customer: recent 50 orders, buyer profiles per platform, and stats over all of their orders.

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

**GetCustomerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoyaltyClub"></a>
# **getLoyaltyClub**
> GetLoyaltyClubResponse getLoyaltyClub()

Your loyalty club: tiers and how many members are in each.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : GetLoyaltyClubResponse = apiInstance.getLoyaltyClub()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getLoyaltyClub")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getLoyaltyClub")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetLoyaltyClubResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCustomers"></a>
# **listCustomers**
> ListCustomersResponse listCustomers()

List aggregated customers (group-by lower(buyer_username)), each with its best avatar, display name and star rating.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : ListCustomersResponse = apiInstance.listCustomers()
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

**ListCustomersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoyaltyMembers"></a>
# **listLoyaltyMembers**
> ListLoyaltyMembersResponse listLoyaltyMembers()

Your loyalty club’s members, by spend with you.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : ListLoyaltyMembersResponse = apiInstance.listLoyaltyMembers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#listLoyaltyMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#listLoyaltyMembers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListLoyaltyMembersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLoyaltyClub"></a>
# **updateLoyaltyClub**
> GetLoyaltyClubResponse updateLoyaltyClub()

Create or update your loyalty club: name, on/off, and up to 6 spend tiers each with a discount (≤ 30%) and perks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : GetLoyaltyClubResponse = apiInstance.updateLoyaltyClub()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#updateLoyaltyClub")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#updateLoyaltyClub")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetLoyaltyClubResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

