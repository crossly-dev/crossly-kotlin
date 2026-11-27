# DiscountsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutomaticDiscount**](DiscountsApi.md#createAutomaticDiscount) | **POST** /v1/automatic-discounts | Create an automatic discount.
[**createAutomaticDiscountPreview**](DiscountsApi.md#createAutomaticDiscountPreview) | **POST** /v1/automatic-discounts/preview | Preview a hypothetical cart of your listings against your automatic discounts (or an unsaved draft): what each line gets.
[**createDiscountCode**](DiscountsApi.md#createDiscountCode) | **POST** /v1/discount-codes | Create a discount code: percent, fixed, free shipping, buy X get Y, spend tiers or a set price, with requirements, item scope, limits (total, per buyer, per day, budget, regions), schedule and stacking.
[**createDiscountCodeGenerate**](DiscountsApi.md#createDiscountCodeGenerate) | **POST** /v1/discount-codes/{id}/generate | Generate up to 5,000 unique single-use codes with this code’s rules (their uses count toward its limits).
[**createDiscountCodeStatus**](DiscountsApi.md#createDiscountCodeStatus) | **POST** /v1/discount-codes/{id}/status | Pause, resume (active) or archive a discount code.
[**createDiscountHolder**](DiscountsApi.md#createDiscountHolder) | **POST** /v1/discounts/holders | Create a Collection holders deal in the store (X-Storefront-Id; default store when omitted).
[**deleteAutomaticDiscount**](DiscountsApi.md#deleteAutomaticDiscount) | **DELETE** /v1/automatic-discounts/{id} | Delete an automatic discount.
[**deleteDiscountHolder**](DiscountsApi.md#deleteDiscountHolder) | **DELETE** /v1/discounts/holders/{id} | Delete a Collection holders deal. Returns &#x60;{ ok }&#x60;.
[**getDiscountCode**](DiscountsApi.md#getDiscountCode) | **GET** /v1/discount-codes/{id} | One discount code with its rules and usage.
[**getDiscountCodeShare**](DiscountsApi.md#getDiscountCodeShare) | **GET** /v1/discount-codes/{id}/share | The share link that pre-applies the code at checkout (the store page with ?code&#x3D;) and a QR code of it as a PNG data URL.
[**getDiscountHolder**](DiscountsApi.md#getDiscountHolder) | **GET** /v1/discounts/holders/{id} | One Collection holders deal with its usage (uses, cents given).
[**listAutomaticDiscounts**](DiscountsApi.md#listAutomaticDiscounts) | **GET** /v1/automatic-discounts | Your automatic discounts (buy more, save more): quantity and mixed-item tiers, scope, channels and schedule.
[**listDiscountCodeRedemptions**](DiscountsApi.md#listDiscountCodeRedemptions) | **GET** /v1/discount-codes/{id}/redemptions | A code’s usage history: orders, masked buyers, region, channel and the amount given, newest first.
[**listDiscountCodes**](DiscountsApi.md#listDiscountCodes) | **GET** /v1/discount-codes | Your discount codes: kind, status (active, scheduled, paused, expired, exhausted, archived), every rule, and usage.
[**listDiscountHolders**](DiscountsApi.md#listDiscountHolders) | **GET** /v1/discounts/holders | The store’s Collection holders deals: a percent off for buyers holding any token of a collection (by chain + contract), with scope, channels, schedule, stacking and limits.
[**updateAutomaticDiscount**](DiscountsApi.md#updateAutomaticDiscount) | **PUT** /v1/automatic-discounts/{id} | Replace an automatic discount.
[**updateDiscountCode**](DiscountsApi.md#updateDiscountCode) | **PATCH** /v1/discount-codes/{id} | Update a discount code. The code itself can be renamed only until it is first used.
[**updateDiscountHolder**](DiscountsApi.md#updateDiscountHolder) | **PUT** /v1/discounts/holders/{id} | Replace a Collection holders deal.


<a name="createAutomaticDiscount"></a>
# **createAutomaticDiscount**
> CreateAutomaticDiscountResponse createAutomaticDiscount()

Create an automatic discount.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
try {
    val result : CreateAutomaticDiscountResponse = apiInstance.createAutomaticDiscount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#createAutomaticDiscount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#createAutomaticDiscount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAutomaticDiscountResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAutomaticDiscountPreview"></a>
# **createAutomaticDiscountPreview**
> CreateAutomaticDiscountPreviewResponse createAutomaticDiscountPreview()

Preview a hypothetical cart of your listings against your automatic discounts (or an unsaved draft): what each line gets.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
try {
    val result : CreateAutomaticDiscountPreviewResponse = apiInstance.createAutomaticDiscountPreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#createAutomaticDiscountPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#createAutomaticDiscountPreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAutomaticDiscountPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDiscountCode"></a>
# **createDiscountCode**
> DiscountCodeResponse createDiscountCode()

Create a discount code: percent, fixed, free shipping, buy X get Y, spend tiers or a set price, with requirements, item scope, limits (total, per buyer, per day, budget, regions), schedule and stacking.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
try {
    val result : DiscountCodeResponse = apiInstance.createDiscountCode()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#createDiscountCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#createDiscountCode")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**DiscountCodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDiscountCodeGenerate"></a>
# **createDiscountCodeGenerate**
> CreateDiscountCodeGenerateResponse createDiscountCodeGenerate(id)

Generate up to 5,000 unique single-use codes with this code’s rules (their uses count toward its limits).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateDiscountCodeGenerateResponse = apiInstance.createDiscountCodeGenerate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#createDiscountCodeGenerate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#createDiscountCodeGenerate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateDiscountCodeGenerateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDiscountCodeStatus"></a>
# **createDiscountCodeStatus**
> DiscountCodeResponse createDiscountCodeStatus(id)

Pause, resume (active) or archive a discount code.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DiscountCodeResponse = apiInstance.createDiscountCodeStatus(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#createDiscountCodeStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#createDiscountCodeStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DiscountCodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDiscountHolder"></a>
# **createDiscountHolder**
> CreateDiscountHolderResponse createDiscountHolder()

Create a Collection holders deal in the store (X-Storefront-Id; default store when omitted).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
try {
    val result : CreateDiscountHolderResponse = apiInstance.createDiscountHolder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#createDiscountHolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#createDiscountHolder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateDiscountHolderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAutomaticDiscount"></a>
# **deleteAutomaticDiscount**
> UpdateGroupBuyResponse deleteAutomaticDiscount(id)

Delete an automatic discount.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.deleteAutomaticDiscount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#deleteAutomaticDiscount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#deleteAutomaticDiscount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDiscountHolder"></a>
# **deleteDiscountHolder**
> OkResponse deleteDiscountHolder(id)

Delete a Collection holders deal. Returns &#x60;{ ok }&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteDiscountHolder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#deleteDiscountHolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#deleteDiscountHolder")
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

<a name="getDiscountCode"></a>
# **getDiscountCode**
> GetDiscountCodeResponse getDiscountCode(id)

One discount code with its rules and usage.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetDiscountCodeResponse = apiInstance.getDiscountCode(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#getDiscountCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#getDiscountCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetDiscountCodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDiscountCodeShare"></a>
# **getDiscountCodeShare**
> GetDiscountCodeShareResponse getDiscountCodeShare(id)

The share link that pre-applies the code at checkout (the store page with ?code&#x3D;) and a QR code of it as a PNG data URL.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetDiscountCodeShareResponse = apiInstance.getDiscountCodeShare(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#getDiscountCodeShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#getDiscountCodeShare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetDiscountCodeShareResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDiscountHolder"></a>
# **getDiscountHolder**
> GetDiscountHolderResponse getDiscountHolder(id)

One Collection holders deal with its usage (uses, cents given).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetDiscountHolderResponse = apiInstance.getDiscountHolder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#getDiscountHolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#getDiscountHolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetDiscountHolderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAutomaticDiscounts"></a>
# **listAutomaticDiscounts**
> ListAutomaticDiscountsResponse listAutomaticDiscounts()

Your automatic discounts (buy more, save more): quantity and mixed-item tiers, scope, channels and schedule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
try {
    val result : ListAutomaticDiscountsResponse = apiInstance.listAutomaticDiscounts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#listAutomaticDiscounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#listAutomaticDiscounts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListAutomaticDiscountsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDiscountCodeRedemptions"></a>
# **listDiscountCodeRedemptions**
> ListDiscountCodeRedemptionsResponse listDiscountCodeRedemptions(id)

A code’s usage history: orders, masked buyers, region, channel and the amount given, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListDiscountCodeRedemptionsResponse = apiInstance.listDiscountCodeRedemptions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#listDiscountCodeRedemptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#listDiscountCodeRedemptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListDiscountCodeRedemptionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDiscountCodes"></a>
# **listDiscountCodes**
> ListDiscountCodesResponse listDiscountCodes()

Your discount codes: kind, status (active, scheduled, paused, expired, exhausted, archived), every rule, and usage.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
try {
    val result : ListDiscountCodesResponse = apiInstance.listDiscountCodes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#listDiscountCodes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#listDiscountCodes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListDiscountCodesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDiscountHolders"></a>
# **listDiscountHolders**
> ListDiscountHoldersResponse listDiscountHolders()

The store’s Collection holders deals: a percent off for buyers holding any token of a collection (by chain + contract), with scope, channels, schedule, stacking and limits.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
try {
    val result : ListDiscountHoldersResponse = apiInstance.listDiscountHolders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#listDiscountHolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#listDiscountHolders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListDiscountHoldersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAutomaticDiscount"></a>
# **updateAutomaticDiscount**
> CreateAutomaticDiscountResponse updateAutomaticDiscount(id)

Replace an automatic discount.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateAutomaticDiscountResponse = apiInstance.updateAutomaticDiscount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#updateAutomaticDiscount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#updateAutomaticDiscount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateAutomaticDiscountResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDiscountCode"></a>
# **updateDiscountCode**
> DiscountCodeResponse updateDiscountCode(id)

Update a discount code. The code itself can be renamed only until it is first used.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DiscountCodeResponse = apiInstance.updateDiscountCode(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#updateDiscountCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#updateDiscountCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DiscountCodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDiscountHolder"></a>
# **updateDiscountHolder**
> CreateDiscountHolderResponse updateDiscountHolder(id)

Replace a Collection holders deal.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DiscountsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateDiscountHolderResponse = apiInstance.updateDiscountHolder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#updateDiscountHolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#updateDiscountHolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateDiscountHolderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

