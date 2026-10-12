# TemplatesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMeTemplate**](TemplatesApi.md#createMeTemplate) | **POST** /v1/me/templates | Create a template.
[**createMeTemplateImport**](TemplatesApi.md#createMeTemplateImport) | **POST** /v1/me/templates/import | Bulk-create templates from an exported payload.
[**createMeTemplateRender**](TemplatesApi.md#createMeTemplateRender) | **POST** /v1/me/templates/{id}/render | Render a template&#39;s title + description against a context.
[**createMeTemplateShare**](TemplatesApi.md#createMeTemplateShare) | **POST** /v1/me/templates/{id}/share | Mint or return an existing share token for a template.
[**deleteMeTemplate**](TemplatesApi.md#deleteMeTemplate) | **DELETE** /v1/me/templates/{id} | Delete a template.
[**deleteMeTemplateShare**](TemplatesApi.md#deleteMeTemplateShare) | **DELETE** /v1/me/templates/{id}/share | Revoke a template share link.
[**getMeTemplate**](TemplatesApi.md#getMeTemplate) | **GET** /v1/me/templates/{id} | Fetch one template in full.
[**getMeTemplateSuggest**](TemplatesApi.md#getMeTemplateSuggest) | **GET** /v1/me/templates/suggest | The seller&#39;s default template for a category.
[**listMeTemplates**](TemplatesApi.md#listMeTemplates) | **GET** /v1/me/templates | List the seller&#39;s templates.
[**updateMeTemplate**](TemplatesApi.md#updateMeTemplate) | **PATCH** /v1/me/templates/{id} | Patch a template.


<a name="createMeTemplate"></a>
# **createMeTemplate**
> ListMeTemplatesItem createMeTemplate()

Create a template.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TemplatesApi()
try {
    val result : ListMeTemplatesItem = apiInstance.createMeTemplate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#createMeTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#createMeTemplate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListMeTemplatesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMeTemplateImport"></a>
# **createMeTemplateImport**
> CreateMeTemplateImportResponse createMeTemplateImport()

Bulk-create templates from an exported payload.

Accepts one template object or an array of them. Entries that fail validation are SKIPPED rather than failing the batch — an import is usually someone else&#39;s export, and rejecting fifty good templates over one bad row helps nobody. The response reports how many landed, so a short count is visible rather than silent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TemplatesApi()
try {
    val result : CreateMeTemplateImportResponse = apiInstance.createMeTemplateImport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#createMeTemplateImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#createMeTemplateImport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateMeTemplateImportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMeTemplateRender"></a>
# **createMeTemplateRender**
> CreateMeTemplateRenderResponse createMeTemplateRender(id)

Render a template&#39;s title + description against a context.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateMeTemplateRenderResponse = apiInstance.createMeTemplateRender(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#createMeTemplateRender")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#createMeTemplateRender")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateMeTemplateRenderResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMeTemplateShare"></a>
# **createMeTemplateShare**
> CreateMeTemplateShareResponse createMeTemplateShare(id)

Mint or return an existing share token for a template.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateMeTemplateShareResponse = apiInstance.createMeTemplateShare(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#createMeTemplateShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#createMeTemplateShare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**CreateMeTemplateShareResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteMeTemplate"></a>
# **deleteMeTemplate**
> OkResponse deleteMeTemplate(id)

Delete a template.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteMeTemplate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#deleteMeTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#deleteMeTemplate")
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

<a name="deleteMeTemplateShare"></a>
# **deleteMeTemplateShare**
> SuccessResponse deleteMeTemplateShare(id)

Revoke a template share link.

Clears the share token, so the public link stops resolving. The template itself is untouched. Sharing again mints a NEW token — the old link is dead for good, which is the point of revoking.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SuccessResponse = apiInstance.deleteMeTemplateShare(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#deleteMeTemplateShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#deleteMeTemplateShare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**SuccessResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMeTemplate"></a>
# **getMeTemplate**
> ListMeTemplatesItem getMeTemplate(id)

Fetch one template in full.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListMeTemplatesItem = apiInstance.getMeTemplate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#getMeTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#getMeTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListMeTemplatesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMeTemplateSuggest"></a>
# **getMeTemplateSuggest**
> GetMeTemplateSuggestResponse getMeTemplateSuggest()

The seller&#39;s default template for a category.

Returns { template: null } rather than 404 when the seller has no default for that category — \&quot;no default\&quot; is a normal answer, not an error, and callers hydrate a form from it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TemplatesApi()
try {
    val result : GetMeTemplateSuggestResponse = apiInstance.getMeTemplateSuggest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#getMeTemplateSuggest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#getMeTemplateSuggest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetMeTemplateSuggestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMeTemplates"></a>
# **listMeTemplates**
> ListMeTemplatesResponse listMeTemplates()

List the seller&#39;s templates.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TemplatesApi()
try {
    val result : ListMeTemplatesResponse = apiInstance.listMeTemplates()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#listMeTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#listMeTemplates")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListMeTemplatesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMeTemplate"></a>
# **updateMeTemplate**
> ListMeTemplatesItem updateMeTemplate(id)

Patch a template.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = TemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListMeTemplatesItem = apiInstance.updateMeTemplate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#updateMeTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#updateMeTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListMeTemplatesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

