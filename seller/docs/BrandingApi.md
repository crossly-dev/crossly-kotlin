# BrandingApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBrandingDrop**](BrandingApi.md#createBrandingDrop) | **POST** /v1/branding/drops | Create a drop as a draft. &#x60;config&#x60; is the full drop config (what, where: shop|world|live|storefront|featured, format, access, limits, pricing, schedule, promotion, fulfilment). Returns rule problems to fix before publishing.
[**createBrandingDropControl**](BrandingApi.md#createBrandingDropControl) | **POST** /v1/branding/drops/{id}/controls/{control} | Live controls: pause, resume, extend (body endsAt), release-wave, end, draw (raffle).
[**createBrandingDropPublish**](BrandingApi.md#createBrandingDropPublish) | **POST** /v1/branding/drops/{id}/publish | Publish: scheduled, or pending_review for a brand partner without self-publish. Brand partners need a verified business on Stripe (403 business_verification_required).
[**createBrandingEventCancel**](BrandingApi.md#createBrandingEventCancel) | **POST** /v1/branding/events/{id}/cancel | Cancel a published event with the reason attendees see.
[**createBrandingEventCheckIn**](BrandingApi.md#createBrandingEventCheckIn) | **POST** /v1/branding/events/{id}/check-in | Check a ticket in at the door by its QR token.
[**createBrandingEventMessage**](BrandingApi.md#createBrandingEventMessage) | **POST** /v1/branding/events/{id}/messages | Message the event&#39;s attendees: all, going, or ticketed.
[**deleteBrandingDrop**](BrandingApi.md#deleteBrandingDrop) | **DELETE** /v1/branding/drops/{id} | Delete a draft, or cancel a scheduled drop. A live drop is ended with the end control.
[**getBrandingBrand**](BrandingApi.md#getBrandingBrand) | **GET** /v1/branding/brand | Your brand profile (approved brand partners).
[**getBrandingBusinessVerification**](BrandingApi.md#getBrandingBusinessVerification) | **GET** /v1/branding/business-verification | Whether your Stripe account is a verified business (company, EIN/tax id verified, payouts on), with reasons and the page to fix it.
[**getBrandingDrop**](BrandingApi.md#getBrandingDrop) | **GET** /v1/branding/drops/{id} | One of your drops.
[**getBrandingEvent**](BrandingApi.md#getBrandingEvent) | **GET** /v1/branding/events | Your events: upcoming grouped by date (today, this_week, later), or past.
[**getBrandingSetting**](BrandingApi.md#getBrandingSetting) | **GET** /v1/branding/settings | The store’s Branding defaults new drops start from: timezone, notifyFollowers, botQueue, botCaptcha, cartHoldMinutes, leftovers.
[**listBrandingDrops**](BrandingApi.md#listBrandingDrops) | **GET** /v1/branding/drops | Your drops, newest first, with config, waves, counts (entries, holding, sold, buyers) and phase. ?scope&#x3D;upcoming|live|past|drafts|all.
[**updateBrandingBrand**](BrandingApi.md#updateBrandingBrand) | **PATCH** /v1/branding/brand | Edit your brand profile: logoUrl, bannerUrl, story, links.
[**updateBrandingDrop**](BrandingApi.md#updateBrandingDrop) | **PATCH** /v1/branding/drops/{id} | Edit a drop that is not live yet. A published drop refuses rule problems (400 drop_config_problems).
[**updateBrandingEventSetting**](BrandingApi.md#updateBrandingEventSetting) | **PUT** /v1/branding/events/{id}/settings | Save an event&#39;s full settings (where, access, reminders, check-in, recording, linked drops) and ticket tiers.
[**updateBrandingSetting**](BrandingApi.md#updateBrandingSetting) | **PATCH** /v1/branding/settings | Change the store’s Branding defaults (any subset of the fields).


<a name="createBrandingDrop"></a>
# **createBrandingDrop**
> CreateBrandingDropResponse createBrandingDrop()

Create a drop as a draft. &#x60;config&#x60; is the full drop config (what, where: shop|world|live|storefront|featured, format, access, limits, pricing, schedule, promotion, fulfilment). Returns rule problems to fix before publishing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
try {
    val result : CreateBrandingDropResponse = apiInstance.createBrandingDrop()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#createBrandingDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#createBrandingDrop")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateBrandingDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBrandingDropControl"></a>
# **createBrandingDropControl**
> GetBrandingDropResponse createBrandingDropControl(id, control)

Live controls: pause, resume, extend (body endsAt), release-wave, end, draw (raffle).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
val id : kotlin.String = id_example // kotlin.String | 
val control : kotlin.String = control_example // kotlin.String | 
try {
    val result : GetBrandingDropResponse = apiInstance.createBrandingDropControl(id, control)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#createBrandingDropControl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#createBrandingDropControl")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **control** | **kotlin.String**|  |

### Return type

**GetBrandingDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBrandingDropPublish"></a>
# **createBrandingDropPublish**
> CreateBrandingDropPublishResponse createBrandingDropPublish(id)

Publish: scheduled, or pending_review for a brand partner without self-publish. Brand partners need a verified business on Stripe (403 business_verification_required).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBrandingDropPublishResponse = apiInstance.createBrandingDropPublish(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#createBrandingDropPublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#createBrandingDropPublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateBrandingDropPublishResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBrandingEventCancel"></a>
# **createBrandingEventCancel**
> CreateBrandingEventCancelResponse createBrandingEventCancel(id)

Cancel a published event with the reason attendees see.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBrandingEventCancelResponse = apiInstance.createBrandingEventCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#createBrandingEventCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#createBrandingEventCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateBrandingEventCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBrandingEventCheckIn"></a>
# **createBrandingEventCheckIn**
> CreateBrandingEventCheckInResponse createBrandingEventCheckIn(id)

Check a ticket in at the door by its QR token.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBrandingEventCheckInResponse = apiInstance.createBrandingEventCheckIn(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#createBrandingEventCheckIn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#createBrandingEventCheckIn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateBrandingEventCheckInResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBrandingEventMessage"></a>
# **createBrandingEventMessage**
> CreateBrandingEventMessageResponse createBrandingEventMessage(id)

Message the event&#39;s attendees: all, going, or ticketed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBrandingEventMessageResponse = apiInstance.createBrandingEventMessage(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#createBrandingEventMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#createBrandingEventMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateBrandingEventMessageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBrandingDrop"></a>
# **deleteBrandingDrop**
> DeleteBrandingDropResponse deleteBrandingDrop(id)

Delete a draft, or cancel a scheduled drop. A live drop is ended with the end control.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteBrandingDropResponse = apiInstance.deleteBrandingDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#deleteBrandingDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#deleteBrandingDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**DeleteBrandingDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBrandingBrand"></a>
# **getBrandingBrand**
> GetBrandingBrandResponse getBrandingBrand()

Your brand profile (approved brand partners).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
try {
    val result : GetBrandingBrandResponse = apiInstance.getBrandingBrand()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#getBrandingBrand")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#getBrandingBrand")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBrandingBrandResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBrandingBusinessVerification"></a>
# **getBrandingBusinessVerification**
> GetBrandingBusinessVerificationResponse getBrandingBusinessVerification()

Whether your Stripe account is a verified business (company, EIN/tax id verified, payouts on), with reasons and the page to fix it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
try {
    val result : GetBrandingBusinessVerificationResponse = apiInstance.getBrandingBusinessVerification()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#getBrandingBusinessVerification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#getBrandingBusinessVerification")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBrandingBusinessVerificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBrandingDrop"></a>
# **getBrandingDrop**
> GetBrandingDropResponse getBrandingDrop(id)

One of your drops.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetBrandingDropResponse = apiInstance.getBrandingDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#getBrandingDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#getBrandingDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**GetBrandingDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBrandingEvent"></a>
# **getBrandingEvent**
> GetBrandingEventResponse getBrandingEvent()

Your events: upcoming grouped by date (today, this_week, later), or past.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
try {
    val result : GetBrandingEventResponse = apiInstance.getBrandingEvent()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#getBrandingEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#getBrandingEvent")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBrandingEventResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBrandingSetting"></a>
# **getBrandingSetting**
> GetBrandingSettingResponse getBrandingSetting()

The store’s Branding defaults new drops start from: timezone, notifyFollowers, botQueue, botCaptcha, cartHoldMinutes, leftovers.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
try {
    val result : GetBrandingSettingResponse = apiInstance.getBrandingSetting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#getBrandingSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#getBrandingSetting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBrandingSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBrandingDrops"></a>
# **listBrandingDrops**
> ListBrandingDropsResponse listBrandingDrops()

Your drops, newest first, with config, waves, counts (entries, holding, sold, buyers) and phase. ?scope&#x3D;upcoming|live|past|drafts|all.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
try {
    val result : ListBrandingDropsResponse = apiInstance.listBrandingDrops()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#listBrandingDrops")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#listBrandingDrops")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListBrandingDropsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBrandingBrand"></a>
# **updateBrandingBrand**
> GetBrandingBrandResponse updateBrandingBrand()

Edit your brand profile: logoUrl, bannerUrl, story, links.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
try {
    val result : GetBrandingBrandResponse = apiInstance.updateBrandingBrand()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#updateBrandingBrand")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#updateBrandingBrand")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBrandingBrandResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBrandingDrop"></a>
# **updateBrandingDrop**
> CreateBrandingDropResponse updateBrandingDrop(id)

Edit a drop that is not live yet. A published drop refuses rule problems (400 drop_config_problems).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateBrandingDropResponse = apiInstance.updateBrandingDrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#updateBrandingDrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#updateBrandingDrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateBrandingDropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBrandingEventSetting"></a>
# **updateBrandingEventSetting**
> UpdateBrandingEventSettingResponse updateBrandingEventSetting(id)

Save an event&#39;s full settings (where, access, reminders, check-in, recording, linked drops) and ticket tiers.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateBrandingEventSettingResponse = apiInstance.updateBrandingEventSetting(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#updateBrandingEventSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#updateBrandingEventSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**UpdateBrandingEventSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBrandingSetting"></a>
# **updateBrandingSetting**
> GetBrandingSettingResponse updateBrandingSetting()

Change the store’s Branding defaults (any subset of the fields).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = BrandingApi()
try {
    val result : GetBrandingSettingResponse = apiInstance.updateBrandingSetting()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandingApi#updateBrandingSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandingApi#updateBrandingSetting")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetBrandingSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

