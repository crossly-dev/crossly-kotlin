# BrandDropsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBrandDrop**](BrandDropsApi.md#createBrandDrop) | **POST** /v1/brand-drops | Create a brand drop as a draft (name, dropAt in the future, optional description, cover image and Crossly platform-listing ids). Approved partners only (403 drop_partner_required); counts against your monthly allowance (403 drop_quota_exhausted).
[**getBrandDrop**](BrandDropsApi.md#getBrandDrop) | **GET** /v1/brand-drops/{id} | One of your brand drops, with its status and any note from Crossly’s review.
[**getBrandDropPartner**](BrandDropsApi.md#getBrandDropPartner) | **GET** /v1/brand-drops/partner | Your drop-partner terms (fee, promotion tier, monthly allowance, whether you may schedule without review) and how many drops you have created this month. partner is null when you are not an approved partner — apply at crossly.net/drops/apply.
[**listBrandDropListings**](BrandDropsApi.md#listBrandDropListings) | **GET** /v1/brand-drops/{id}/listings | The listings a brand drop releases when it goes live.
[**listBrandDrops**](BrandDropsApi.md#listBrandDrops) | **GET** /v1/brand-drops | Your brand drops, newest start time first. Filter with ?status&#x3D;draft|pending_review|scheduled|live|sold_out|ended|cancelled. Empty when you are not a partner.
[**updateBrandDrop**](BrandDropsApi.md#updateBrandDrop) | **PATCH** /v1/brand-drops/{id} | Edit a brand drop and/or change its status: draft (withdraw / unschedule), pending_review (submit for review), scheduled (only with canSelfPublish — 403 drop_review_required otherwise), cancelled. Editing name, time or description of a reviewed drop sends it back to review. Live and finished drops cannot be changed.
[**updateBrandDropListing**](BrandDropsApi.md#updateBrandDropListing) | **PUT** /v1/brand-drops/{id}/listings | Replace the listings a brand drop releases, by master listing id (up to 100). Each must already be listed on Crossly — otherwise 400 listing_not_on_crossly naming them. Not allowed once the drop is live or finished.


<a name="createBrandDrop"></a>
# **createBrandDrop**
> BrandDropResponse createBrandDrop()

Create a brand drop as a draft (name, dropAt in the future, optional description, cover image and Crossly platform-listing ids). Approved partners only (403 drop_partner_required); counts against your monthly allowance (403 drop_quota_exhausted).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandDropsApi()
try {
    val result : BrandDropResponse = apiInstance.createBrandDrop()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandDropsApi#createBrandDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandDropsApi#createBrandDrop")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**BrandDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBrandDrop"></a>
# **getBrandDrop**
> BrandDropResponse getBrandDrop(id)

One of your brand drops, with its status and any note from Crossly’s review.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandDropsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : BrandDropResponse = apiInstance.getBrandDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandDropsApi#getBrandDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandDropsApi#getBrandDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**BrandDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBrandDropPartner"></a>
# **getBrandDropPartner**
> GetBrandDropPartnerResponse getBrandDropPartner()

Your drop-partner terms (fee, promotion tier, monthly allowance, whether you may schedule without review) and how many drops you have created this month. partner is null when you are not an approved partner — apply at crossly.net/drops/apply.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandDropsApi()
try {
    val result : GetBrandDropPartnerResponse = apiInstance.getBrandDropPartner()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandDropsApi#getBrandDropPartner")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandDropsApi#getBrandDropPartner")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBrandDropPartnerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBrandDropListings"></a>
# **listBrandDropListings**
> ListBrandDropListingsResponse listBrandDropListings(id)

The listings a brand drop releases when it goes live.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandDropsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListBrandDropListingsResponse = apiInstance.listBrandDropListings(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandDropsApi#listBrandDropListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandDropsApi#listBrandDropListings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListBrandDropListingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBrandDrops"></a>
# **listBrandDrops**
> ListBrandDropsResponse listBrandDrops()

Your brand drops, newest start time first. Filter with ?status&#x3D;draft|pending_review|scheduled|live|sold_out|ended|cancelled. Empty when you are not a partner.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandDropsApi()
try {
    val result : ListBrandDropsResponse = apiInstance.listBrandDrops()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandDropsApi#listBrandDrops")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandDropsApi#listBrandDrops")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBrandDropsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBrandDrop"></a>
# **updateBrandDrop**
> BrandDropResponse updateBrandDrop(id)

Edit a brand drop and/or change its status: draft (withdraw / unschedule), pending_review (submit for review), scheduled (only with canSelfPublish — 403 drop_review_required otherwise), cancelled. Editing name, time or description of a reviewed drop sends it back to review. Live and finished drops cannot be changed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandDropsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : BrandDropResponse = apiInstance.updateBrandDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandDropsApi#updateBrandDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandDropsApi#updateBrandDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**BrandDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBrandDropListing"></a>
# **updateBrandDropListing**
> ListBrandDropListingsResponse updateBrandDropListing(id)

Replace the listings a brand drop releases, by master listing id (up to 100). Each must already be listed on Crossly — otherwise 400 listing_not_on_crossly naming them. Not allowed once the drop is live or finished.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandDropsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListBrandDropListingsResponse = apiInstance.updateBrandDropListing(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandDropsApi#updateBrandDropListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandDropsApi#updateBrandDropListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListBrandDropListingsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

