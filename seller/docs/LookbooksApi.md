# LookbooksApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLookbook**](LookbooksApi.md#createLookbook) | **POST** /v1/lookbooks | Create a lookbook. Pass templateId (classic, editorial, hero, magazine, drop, sale, postcard) to start it from a template styled with your storefront brand kit.
[**createLookbookCampaign**](LookbooksApi.md#createLookbookCampaign) | **POST** /v1/lookbook-campaigns | Email a lookbook to customers now or at scheduledAt. Audience kind subscribers | all | repeat | segment {filters} | handles {handles}; only people with marketing consent who have not unsubscribed receive it.
[**createLookbookCampaignCancel**](LookbooksApi.md#createLookbookCampaignCancel) | **POST** /v1/lookbook-campaigns/{id}/cancel | Cancel a scheduled campaign or stop one that is sending (emails already sent stay sent).
[**createLookbookCampaignPreview**](LookbooksApi.md#createLookbookCampaignPreview) | **POST** /v1/lookbook-campaigns/preview | Preview a lookbook email campaign without sending: how many of the audience can receive it (opted in, not suppressed) and the rendered HTML/text.
[**createLookbookShareLink**](LookbooksApi.md#createLookbookShareLink) | **POST** /v1/lookbooks/{id}/share-links | Make a share link for someone without a Crossly login: role view, comment or edit; expires after ttlHours (1 to 2160, default 168). The url is shown once.
[**createPrintMailJob**](LookbooksApi.md#createPrintMailJob) | **POST** /v1/print-mail/jobs | Draft a printed lookbook mailing (beta): renders the print-ready PDF with bleed and estimates the cost from your per-piece price. Mails nothing until confirmed.
[**createPrintMailJobConfirm**](LookbooksApi.md#createPrintMailJobConfirm) | **POST** /v1/print-mail/jobs/{id}/confirm | Confirm a drafted print job: acknowledgeCharges must be true and pieces must equal the job&#39;s piece count. Your Lob or PostGrid account is billed.
[**getLookbookCampaign**](LookbooksApi.md#getLookbookCampaign) | **GET** /v1/lookbook-campaigns/{id} | One lookbook campaign and its counts.
[**getLookbookDesign**](LookbooksApi.md#getLookbookDesign) | **GET** /v1/lookbooks/{id}/design | A lookbook design document (pages of text, photo, listing, shape and sticker elements) with live listing title/price/photo, your brand kit and rendered page images.
[**listEmailProviders**](LookbooksApi.md#listEmailProviders) | **GET** /v1/email-providers | Your BYOK email providers (SMTP, Mailgun, SendGrid, SES, Resend, Postmark, Brevo, Mailjet, SparkPost, MailerSend, Mandrill, Plunk and more): label, from address, default, last test. Secrets are never returned.
[**listLookbookCampaignRecipients**](LookbooksApi.md#listLookbookCampaignRecipients) | **GET** /v1/lookbook-campaigns/{id}/recipients | Per-recipient results for a campaign: status (queued, sent, failed, skipped + reason), provider message id, opens, clicks, bounce, unsubscribe.
[**listLookbookCampaigns**](LookbooksApi.md#listLookbookCampaigns) | **GET** /v1/lookbook-campaigns | Your lookbook campaigns, newest first, with sent / failed / skipped / opened / clicked / bounced / unsubscribed counts.
[**listLookbooks**](LookbooksApi.md#listLookbooks) | **GET** /v1/lookbooks | Your lookbooks: id, slug, title, published, current design version and item count.
[**listPrintMailJobs**](LookbooksApi.md#listPrintMailJobs) | **GET** /v1/print-mail/jobs | Print-and-mail jobs (beta): provider, format, pieces, estimate, status and per-piece results.
[**updateLookbookDesign**](LookbooksApi.md#updateLookbookDesign) | **PUT** /v1/lookbooks/{id}/design | Save a new design version. Images must already be on the Crossly CDN; listings must be your own Crossly listings. Pass baseVersion to get a 409 instead of overwriting a newer save.


<a name="createLookbook"></a>
# **createLookbook**
> CreateLookbookResponse createLookbook()

Create a lookbook. Pass templateId (classic, editorial, hero, magazine, drop, sale, postcard) to start it from a template styled with your storefront brand kit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
try {
    val result : CreateLookbookResponse = apiInstance.createLookbook()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#createLookbook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#createLookbook")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateLookbookResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLookbookCampaign"></a>
# **createLookbookCampaign**
> LookbookCampaignResponse createLookbookCampaign()

Email a lookbook to customers now or at scheduledAt. Audience kind subscribers | all | repeat | segment {filters} | handles {handles}; only people with marketing consent who have not unsubscribed receive it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
try {
    val result : LookbookCampaignResponse = apiInstance.createLookbookCampaign()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#createLookbookCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#createLookbookCampaign")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**LookbookCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLookbookCampaignCancel"></a>
# **createLookbookCampaignCancel**
> LookbookCampaignResponse createLookbookCampaignCancel(id)

Cancel a scheduled campaign or stop one that is sending (emails already sent stay sent).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : LookbookCampaignResponse = apiInstance.createLookbookCampaignCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#createLookbookCampaignCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#createLookbookCampaignCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**LookbookCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLookbookCampaignPreview"></a>
# **createLookbookCampaignPreview**
> CreateLookbookCampaignPreviewResponse createLookbookCampaignPreview()

Preview a lookbook email campaign without sending: how many of the audience can receive it (opted in, not suppressed) and the rendered HTML/text.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
try {
    val result : CreateLookbookCampaignPreviewResponse = apiInstance.createLookbookCampaignPreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#createLookbookCampaignPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#createLookbookCampaignPreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateLookbookCampaignPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLookbookShareLink"></a>
# **createLookbookShareLink**
> CreateLookbookShareLinkResponse createLookbookShareLink(id)

Make a share link for someone without a Crossly login: role view, comment or edit; expires after ttlHours (1 to 2160, default 168). The url is shown once.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateLookbookShareLinkResponse = apiInstance.createLookbookShareLink(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#createLookbookShareLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#createLookbookShareLink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateLookbookShareLinkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPrintMailJob"></a>
# **createPrintMailJob**
> CreatePrintMailJobResponse createPrintMailJob()

Draft a printed lookbook mailing (beta): renders the print-ready PDF with bleed and estimates the cost from your per-piece price. Mails nothing until confirmed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
try {
    val result : CreatePrintMailJobResponse = apiInstance.createPrintMailJob()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#createPrintMailJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#createPrintMailJob")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreatePrintMailJobResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPrintMailJobConfirm"></a>
# **createPrintMailJobConfirm**
> CreatePrintMailJobConfirmResponse createPrintMailJobConfirm(id)

Confirm a drafted print job: acknowledgeCharges must be true and pieces must equal the job&#39;s piece count. Your Lob or PostGrid account is billed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreatePrintMailJobConfirmResponse = apiInstance.createPrintMailJobConfirm(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#createPrintMailJobConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#createPrintMailJobConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreatePrintMailJobConfirmResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLookbookCampaign"></a>
# **getLookbookCampaign**
> LookbookCampaignResponse getLookbookCampaign(id)

One lookbook campaign and its counts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : LookbookCampaignResponse = apiInstance.getLookbookCampaign(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#getLookbookCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#getLookbookCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**LookbookCampaignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLookbookDesign"></a>
# **getLookbookDesign**
> GetLookbookDesignResponse getLookbookDesign(id)

A lookbook design document (pages of text, photo, listing, shape and sticker elements) with live listing title/price/photo, your brand kit and rendered page images.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetLookbookDesignResponse = apiInstance.getLookbookDesign(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#getLookbookDesign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#getLookbookDesign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetLookbookDesignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEmailProviders"></a>
# **listEmailProviders**
> ListEmailProvidersResponse listEmailProviders()

Your BYOK email providers (SMTP, Mailgun, SendGrid, SES, Resend, Postmark, Brevo, Mailjet, SparkPost, MailerSend, Mandrill, Plunk and more): label, from address, default, last test. Secrets are never returned.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
try {
    val result : ListEmailProvidersResponse = apiInstance.listEmailProviders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#listEmailProviders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#listEmailProviders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListEmailProvidersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLookbookCampaignRecipients"></a>
# **listLookbookCampaignRecipients**
> ListLookbookCampaignRecipientsResponse listLookbookCampaignRecipients(id)

Per-recipient results for a campaign: status (queued, sent, failed, skipped + reason), provider message id, opens, clicks, bounce, unsubscribe.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ListLookbookCampaignRecipientsResponse = apiInstance.listLookbookCampaignRecipients(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#listLookbookCampaignRecipients")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#listLookbookCampaignRecipients")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**ListLookbookCampaignRecipientsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLookbookCampaigns"></a>
# **listLookbookCampaigns**
> ListLookbookCampaignsResponse listLookbookCampaigns()

Your lookbook campaigns, newest first, with sent / failed / skipped / opened / clicked / bounced / unsubscribed counts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
try {
    val result : ListLookbookCampaignsResponse = apiInstance.listLookbookCampaigns()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#listLookbookCampaigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#listLookbookCampaigns")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListLookbookCampaignsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLookbooks"></a>
# **listLookbooks**
> ListLookbooksResponse listLookbooks()

Your lookbooks: id, slug, title, published, current design version and item count.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
try {
    val result : ListLookbooksResponse = apiInstance.listLookbooks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#listLookbooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#listLookbooks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListLookbooksResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPrintMailJobs"></a>
# **listPrintMailJobs**
> ListPrintMailJobsResponse listPrintMailJobs()

Print-and-mail jobs (beta): provider, format, pieces, estimate, status and per-piece results.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
try {
    val result : ListPrintMailJobsResponse = apiInstance.listPrintMailJobs()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#listPrintMailJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#listPrintMailJobs")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListPrintMailJobsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLookbookDesign"></a>
# **updateLookbookDesign**
> UpdateLookbookDesignResponse updateLookbookDesign(id)

Save a new design version. Images must already be on the Crossly CDN; listings must be your own Crossly listings. Pass baseVersion to get a 409 instead of overwriting a newer save.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = LookbooksApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateLookbookDesignResponse = apiInstance.updateLookbookDesign(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookbooksApi#updateLookbookDesign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookbooksApi#updateLookbookDesign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateLookbookDesignResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

