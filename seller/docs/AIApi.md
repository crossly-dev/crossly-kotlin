# AIApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAiCategorize**](AIApi.md#createAiCategorize) | **POST** /v1/ai/categorize | Taxonomy guess from a single image URL.
[**createAiCategorizeFromImage**](AIApi.md#createAiCategorizeFromImage) | **POST** /v1/ai/categorize-from-image | Taxonomy guess from a single base64 image.
[**createAiEnhanceDescription**](AIApi.md#createAiEnhanceDescription) | **POST** /v1/ai/enhance-description | SEO-rewrite a listing description.
[**createAiEnhanceListing**](AIApi.md#createAiEnhanceListing) | **POST** /v1/ai/enhance-listing | Rewrite title + description + tags in one call.
[**createAiEnhanceTitle**](AIApi.md#createAiEnhanceTitle) | **POST** /v1/ai/enhance-title | SEO-rewrite a listing title.
[**createAiExtractReceipt**](AIApi.md#createAiExtractReceipt) | **POST** /v1/ai/extract-receipt | Structured data extraction from a receipt photo.
[**createAiGenerateListing**](AIApi.md#createAiGenerateListing) | **POST** /v1/ai/generate-listing | Generate full listing fields from up to 4 image URLs.
[**createAiHelp**](AIApi.md#createAiHelp) | **POST** /v1/ai/help | In-app help Q&amp;A grounded in supplied docs.
[**createAiMagicListing**](AIApi.md#createAiMagicListing) | **POST** /v1/ai/magic-listing | Generate full listing fields from base64 photos.
[**createAiTestKey**](AIApi.md#createAiTestKey) | **POST** /v1/ai/test-key | Live-ping a candidate BYO-key.
[**createListingAiImage**](AIApi.md#createListingAiImage) | **POST** /v1/listings/ai-image | Generate a listing photo with the caller&#39;s own image-provider key; the result is marked AI-generated.
[**createListingAiImagePrompt**](AIApi.md#createListingAiImagePrompt) | **POST** /v1/listings/ai-image/prompt | Build the AI product-photo prompt for a listing (no image is generated).
[**deleteAiKey**](AIApi.md#deleteAiKey) | **DELETE** /v1/ai/key | Remove the BYO-key for a provider.
[**getAiProvider**](AIApi.md#getAiProvider) | **GET** /v1/ai/providers | Static catalog of supported AI providers.
[**getAiStatus**](AIApi.md#getAiStatus) | **GET** /v1/ai/status | BYO-key state for the calling user.
[**updateAiImageConfig**](AIApi.md#updateAiImageConfig) | **PUT** /v1/ai/image-config | Choose the AI image provider/model, independently of the text provider.
[**updateAiKey**](AIApi.md#updateAiKey) | **PUT** /v1/ai/key | Save an encrypted BYO-key for an AI provider.


<a name="createAiCategorize"></a>
# **createAiCategorize**
> CreateAiCategorizeResponse createAiCategorize()

Taxonomy guess from a single image URL.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateAiCategorizeResponse = apiInstance.createAiCategorize()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createAiCategorize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createAiCategorize")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAiCategorizeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAiCategorizeFromImage"></a>
# **createAiCategorizeFromImage**
> CreateAiCategorizeResponse createAiCategorizeFromImage()

Taxonomy guess from a single base64 image.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateAiCategorizeResponse = apiInstance.createAiCategorizeFromImage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createAiCategorizeFromImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createAiCategorizeFromImage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAiCategorizeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAiEnhanceDescription"></a>
# **createAiEnhanceDescription**
> CreateAiEnhanceDescriptionResponse createAiEnhanceDescription()

SEO-rewrite a listing description.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateAiEnhanceDescriptionResponse = apiInstance.createAiEnhanceDescription()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createAiEnhanceDescription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createAiEnhanceDescription")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAiEnhanceDescriptionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAiEnhanceListing"></a>
# **createAiEnhanceListing**
> CreateAiEnhanceListingResponse createAiEnhanceListing()

Rewrite title + description + tags in one call.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateAiEnhanceListingResponse = apiInstance.createAiEnhanceListing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createAiEnhanceListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createAiEnhanceListing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAiEnhanceListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAiEnhanceTitle"></a>
# **createAiEnhanceTitle**
> CreateAiEnhanceTitleResponse createAiEnhanceTitle()

SEO-rewrite a listing title.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateAiEnhanceTitleResponse = apiInstance.createAiEnhanceTitle()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createAiEnhanceTitle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createAiEnhanceTitle")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAiEnhanceTitleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAiExtractReceipt"></a>
# **createAiExtractReceipt**
> CreateAiExtractReceiptResponse createAiExtractReceipt()

Structured data extraction from a receipt photo.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateAiExtractReceiptResponse = apiInstance.createAiExtractReceipt()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createAiExtractReceipt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createAiExtractReceipt")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAiExtractReceiptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAiGenerateListing"></a>
# **createAiGenerateListing**
> CreateAiMagicListingResponse createAiGenerateListing()

Generate full listing fields from up to 4 image URLs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateAiMagicListingResponse = apiInstance.createAiGenerateListing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createAiGenerateListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createAiGenerateListing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAiMagicListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAiHelp"></a>
# **createAiHelp**
> CreateAiHelpResponse createAiHelp()

In-app help Q&amp;A grounded in supplied docs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateAiHelpResponse = apiInstance.createAiHelp()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createAiHelp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createAiHelp")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAiHelpResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAiMagicListing"></a>
# **createAiMagicListing**
> CreateAiMagicListingResponse createAiMagicListing()

Generate full listing fields from base64 photos.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateAiMagicListingResponse = apiInstance.createAiMagicListing()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createAiMagicListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createAiMagicListing")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAiMagicListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAiTestKey"></a>
# **createAiTestKey**
> CreateAiTestKeyResponse createAiTestKey()

Live-ping a candidate BYO-key.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateAiTestKeyResponse = apiInstance.createAiTestKey()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createAiTestKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createAiTestKey")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateAiTestKeyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingAiImage"></a>
# **createListingAiImage**
> CreateListingAiImageResponse createListingAiImage()

Generate a listing photo with the caller&#39;s own image-provider key; the result is marked AI-generated.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateListingAiImageResponse = apiInstance.createListingAiImage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createListingAiImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createListingAiImage")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateListingAiImageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createListingAiImagePrompt"></a>
# **createListingAiImagePrompt**
> CreateListingAiImagePromptResponse createListingAiImagePrompt()

Build the AI product-photo prompt for a listing (no image is generated).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : CreateListingAiImagePromptResponse = apiInstance.createListingAiImagePrompt()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#createListingAiImagePrompt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#createListingAiImagePrompt")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateListingAiImagePromptResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAiKey"></a>
# **deleteAiKey**
> SuccessResponse deleteAiKey()

Remove the BYO-key for a provider.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : SuccessResponse = apiInstance.deleteAiKey()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#deleteAiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#deleteAiKey")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**SuccessResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAiProvider"></a>
# **getAiProvider**
> GetAiProviderResponse getAiProvider()

Static catalog of supported AI providers.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : GetAiProviderResponse = apiInstance.getAiProvider()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#getAiProvider")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#getAiProvider")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetAiProviderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAiStatus"></a>
# **getAiStatus**
> GetAiStatusResponse getAiStatus()

BYO-key state for the calling user.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : GetAiStatusResponse = apiInstance.getAiStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#getAiStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#getAiStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetAiStatusResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAiImageConfig"></a>
# **updateAiImageConfig**
> UpdateAiImageConfigResponse updateAiImageConfig()

Choose the AI image provider/model, independently of the text provider.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : UpdateAiImageConfigResponse = apiInstance.updateAiImageConfig()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#updateAiImageConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#updateAiImageConfig")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateAiImageConfigResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAiKey"></a>
# **updateAiKey**
> SuccessResponse updateAiKey()

Save an encrypted BYO-key for an AI provider.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AIApi()
try {
    val result : SuccessResponse = apiInstance.updateAiKey()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIApi#updateAiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIApi#updateAiKey")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**SuccessResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

