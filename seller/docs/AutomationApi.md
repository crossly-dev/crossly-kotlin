# AutomationApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutomationRule**](AutomationApi.md#createAutomationRule) | **POST** /v1/automation/rules | Create an automation rule.
[**createAutomationRuleImport**](AutomationApi.md#createAutomationRuleImport) | **POST** /v1/automation/rules/import | Import one or more rules from recipe JSON (single or bundle).
[**createAutomationRuleRunNow**](AutomationApi.md#createAutomationRuleRunNow) | **POST** /v1/automation/rules/{id}/run-now | Fire an automation rule immediately.
[**createAutomationRuleToggle**](AutomationApi.md#createAutomationRuleToggle) | **POST** /v1/automation/rules/{id}/toggle | Flip an automation rule between active and inactive.
[**createAutomationRuleValidateRecipe**](AutomationApi.md#createAutomationRuleValidateRecipe) | **POST** /v1/automation/rules/validate-recipe | Dry-run validate one or more recipes against the live catalog.
[**deleteAutomationRule**](AutomationApi.md#deleteAutomationRule) | **DELETE** /v1/automation/rules/{id} | Delete an automation rule.
[**getAutomationCatalog**](AutomationApi.md#getAutomationCatalog) | **GET** /v1/automation/catalog | Supported triggerType / actionType / conditionType values for automation rules.
[**getAutomationRule**](AutomationApi.md#getAutomationRule) | **GET** /v1/automation/rules/{id} | Get a single automation rule.
[**getAutomationRuleExport**](AutomationApi.md#getAutomationRuleExport) | **GET** /v1/automation/rules/export | Export the user&#39;s full rule library as a portable recipe bundle.
[**getAutomationRuleExportById**](AutomationApi.md#getAutomationRuleExportById) | **GET** /v1/automation/rules/{id}/export | Export a single automation rule as a portable recipe.
[**listAutomationRules**](AutomationApi.md#listAutomationRules) | **GET** /v1/automation/rules | List automation rules.
[**listAutomationRuns**](AutomationApi.md#listAutomationRuns) | **GET** /v1/automation/runs | Per-fire history for automation rules and workflow chain runs.
[**updateAutomationRule**](AutomationApi.md#updateAutomationRule) | **PUT** /v1/automation/rules/{id} | Update an automation rule (full replace).


<a name="createAutomationRule"></a>
# **createAutomationRule**
> CreateAutomationRuleResponse createAutomationRule()

Create an automation rule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
try {
    val result : CreateAutomationRuleResponse = apiInstance.createAutomationRule()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#createAutomationRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#createAutomationRule")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateAutomationRuleResponse**](CreateAutomationRuleResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAutomationRuleImport"></a>
# **createAutomationRuleImport**
> CreateAutomationRuleImportResponse createAutomationRuleImport(activate)

Import one or more rules from recipe JSON (single or bundle).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
val activate : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : CreateAutomationRuleImportResponse = apiInstance.createAutomationRuleImport(activate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#createAutomationRuleImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#createAutomationRuleImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activate** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**CreateAutomationRuleImportResponse**](CreateAutomationRuleImportResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAutomationRuleRunNow"></a>
# **createAutomationRuleRunNow**
> CreateAutomationRuleRunNowResponse createAutomationRuleRunNow(id)

Fire an automation rule immediately.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateAutomationRuleRunNowResponse = apiInstance.createAutomationRuleRunNow(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#createAutomationRuleRunNow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#createAutomationRuleRunNow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateAutomationRuleRunNowResponse**](CreateAutomationRuleRunNowResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAutomationRuleToggle"></a>
# **createAutomationRuleToggle**
> CreateAutomationRuleToggleResponse createAutomationRuleToggle(id)

Flip an automation rule between active and inactive.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateAutomationRuleToggleResponse = apiInstance.createAutomationRuleToggle(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#createAutomationRuleToggle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#createAutomationRuleToggle")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateAutomationRuleToggleResponse**](CreateAutomationRuleToggleResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAutomationRuleValidateRecipe"></a>
# **createAutomationRuleValidateRecipe**
> CreateAutomationRuleValidateRecipeResponse createAutomationRuleValidateRecipe()

Dry-run validate one or more recipes against the live catalog.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
try {
    val result : CreateAutomationRuleValidateRecipeResponse = apiInstance.createAutomationRuleValidateRecipe()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#createAutomationRuleValidateRecipe")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#createAutomationRuleValidateRecipe")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateAutomationRuleValidateRecipeResponse**](CreateAutomationRuleValidateRecipeResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAutomationRule"></a>
# **deleteAutomationRule**
> DeleteAutomationRuleResponse deleteAutomationRule(id)

Delete an automation rule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteAutomationRuleResponse = apiInstance.deleteAutomationRule(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#deleteAutomationRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#deleteAutomationRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**DeleteAutomationRuleResponse**](DeleteAutomationRuleResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutomationCatalog"></a>
# **getAutomationCatalog**
> GetAutomationCatalogResponse getAutomationCatalog()

Supported triggerType / actionType / conditionType values for automation rules.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
try {
    val result : GetAutomationCatalogResponse = apiInstance.getAutomationCatalog()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#getAutomationCatalog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#getAutomationCatalog")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAutomationCatalogResponse**](GetAutomationCatalogResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutomationRule"></a>
# **getAutomationRule**
> GetAutomationRuleResponse getAutomationRule(id)

Get a single automation rule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetAutomationRuleResponse = apiInstance.getAutomationRule(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#getAutomationRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#getAutomationRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetAutomationRuleResponse**](GetAutomationRuleResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutomationRuleExport"></a>
# **getAutomationRuleExport**
> GetAutomationRuleExportResponse getAutomationRuleExport()

Export the user&#39;s full rule library as a portable recipe bundle.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
try {
    val result : GetAutomationRuleExportResponse = apiInstance.getAutomationRuleExport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#getAutomationRuleExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#getAutomationRuleExport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAutomationRuleExportResponse**](GetAutomationRuleExportResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutomationRuleExportById"></a>
# **getAutomationRuleExportById**
> GetAutomationRuleExportByIdResponse getAutomationRuleExportById(id)

Export a single automation rule as a portable recipe.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetAutomationRuleExportByIdResponse = apiInstance.getAutomationRuleExportById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#getAutomationRuleExportById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#getAutomationRuleExportById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetAutomationRuleExportByIdResponse**](GetAutomationRuleExportByIdResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAutomationRules"></a>
# **listAutomationRules**
> V1List listAutomationRules()

List automation rules.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
try {
    val result : V1List = apiInstance.listAutomationRules()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#listAutomationRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#listAutomationRules")
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

<a name="listAutomationRuns"></a>
# **listAutomationRuns**
> V1List listAutomationRuns(ruleId, chainId, limit)

Per-fire history for automation rules and workflow chain runs.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
val ruleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val chainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : V1List = apiInstance.listAutomationRuns(ruleId, chainId, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#listAutomationRuns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#listAutomationRuns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **java.util.UUID**|  | [optional]
 **chainId** | **java.util.UUID**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 100]

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAutomationRule"></a>
# **updateAutomationRule**
> UpdateAutomationRuleResponse updateAutomationRule(id)

Update an automation rule (full replace).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = AutomationApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateAutomationRuleResponse = apiInstance.updateAutomationRule(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutomationApi#updateAutomationRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutomationApi#updateAutomationRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdateAutomationRuleResponse**](UpdateAutomationRuleResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

