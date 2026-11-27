# FieldRulesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFieldRule**](FieldRulesApi.md#createFieldRule) | **POST** /v1/field-rules | Create a per-channel field rule.
[**createFieldRulePreview**](FieldRulesApi.md#createFieldRulePreview) | **POST** /v1/field-rules/preview | Preview field-rule output for a listing on one channel.
[**createFieldRuleReorder**](FieldRulesApi.md#createFieldRuleReorder) | **POST** /v1/field-rules/reorder | Set the run order of several field rules.
[**deleteFieldRule**](FieldRulesApi.md#deleteFieldRule) | **DELETE** /v1/field-rules/{id} | Delete a field rule.
[**getFieldRule**](FieldRulesApi.md#getFieldRule) | **GET** /v1/field-rules/{id} | Get one field rule.
[**listFieldRules**](FieldRulesApi.md#listFieldRules) | **GET** /v1/field-rules | List the seller&#39;s per-channel field rules.
[**updateFieldRule**](FieldRulesApi.md#updateFieldRule) | **PATCH** /v1/field-rules/{id} | Update a field rule.


<a name="createFieldRule"></a>
# **createFieldRule**
> ListFieldRulesItem createFieldRule()

Create a per-channel field rule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FieldRulesApi()
try {
    val result : ListFieldRulesItem = apiInstance.createFieldRule()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FieldRulesApi#createFieldRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FieldRulesApi#createFieldRule")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListFieldRulesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFieldRulePreview"></a>
# **createFieldRulePreview**
> CreateFieldRulePreviewResponse createFieldRulePreview()

Preview field-rule output for a listing on one channel.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FieldRulesApi()
try {
    val result : CreateFieldRulePreviewResponse = apiInstance.createFieldRulePreview()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FieldRulesApi#createFieldRulePreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FieldRulesApi#createFieldRulePreview")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFieldRulePreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFieldRuleReorder"></a>
# **createFieldRuleReorder**
> OkResponse createFieldRuleReorder()

Set the run order of several field rules.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FieldRulesApi()
try {
    val result : OkResponse = apiInstance.createFieldRuleReorder()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FieldRulesApi#createFieldRuleReorder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FieldRulesApi#createFieldRuleReorder")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFieldRule"></a>
# **deleteFieldRule**
> OkResponse deleteFieldRule(id)

Delete a field rule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FieldRulesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteFieldRule(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FieldRulesApi#deleteFieldRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FieldRulesApi#deleteFieldRule")
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

<a name="getFieldRule"></a>
# **getFieldRule**
> ListFieldRulesItem getFieldRule(id)

Get one field rule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FieldRulesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListFieldRulesItem = apiInstance.getFieldRule(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FieldRulesApi#getFieldRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FieldRulesApi#getFieldRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListFieldRulesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFieldRules"></a>
# **listFieldRules**
> ListFieldRulesResponse listFieldRules(platform)

List the seller&#39;s per-channel field rules.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FieldRulesApi()
val platform : kotlin.String = platform_example // kotlin.String | 
try {
    val result : ListFieldRulesResponse = apiInstance.listFieldRules(platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FieldRulesApi#listFieldRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FieldRulesApi#listFieldRules")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platform** | **kotlin.String**|  | [optional]

### Return type

**ListFieldRulesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFieldRule"></a>
# **updateFieldRule**
> ListFieldRulesItem updateFieldRule(id)

Update a field rule.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FieldRulesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ListFieldRulesItem = apiInstance.updateFieldRule(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FieldRulesApi#updateFieldRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FieldRulesApi#updateFieldRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

**ListFieldRulesItem**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

