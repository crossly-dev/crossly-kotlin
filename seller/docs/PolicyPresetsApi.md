# PolicyPresetsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPolicyPreset**](PolicyPresetsApi.md#createPolicyPreset) | **POST** /v1/policy-presets | Create a return / shipping / payment policy preset.
[**deletePolicyPreset**](PolicyPresetsApi.md#deletePolicyPreset) | **DELETE** /v1/policy-presets/{id} | Delete a policy preset.
[**listPolicyPresets**](PolicyPresetsApi.md#listPolicyPresets) | **GET** /v1/policy-presets | List the seller&#39;s return / shipping / payment policy presets.
[**updatePolicyPreset**](PolicyPresetsApi.md#updatePolicyPreset) | **PATCH** /v1/policy-presets/{id} | Update a policy preset.


<a name="createPolicyPreset"></a>
# **createPolicyPreset**
> CreatePolicyPresetResponse createPolicyPreset()

Create a return / shipping / payment policy preset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PolicyPresetsApi()
try {
    val result : CreatePolicyPresetResponse = apiInstance.createPolicyPreset()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyPresetsApi#createPolicyPreset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyPresetsApi#createPolicyPreset")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreatePolicyPresetResponse**](CreatePolicyPresetResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePolicyPreset"></a>
# **deletePolicyPreset**
> DeletePolicyPresetResponse deletePolicyPreset(id)

Delete a policy preset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PolicyPresetsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeletePolicyPresetResponse = apiInstance.deletePolicyPreset(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyPresetsApi#deletePolicyPreset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyPresetsApi#deletePolicyPreset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**DeletePolicyPresetResponse**](DeletePolicyPresetResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPolicyPresets"></a>
# **listPolicyPresets**
> V1List listPolicyPresets(kind)

List the seller&#39;s return / shipping / payment policy presets.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PolicyPresetsApi()
val kind : kotlin.String = kind_example // kotlin.String | 
try {
    val result : V1List = apiInstance.listPolicyPresets(kind)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyPresetsApi#listPolicyPresets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyPresetsApi#listPolicyPresets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kind** | **kotlin.String**|  | [optional] [enum: return, shipping, payment]

### Return type

[**V1List**](V1List.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePolicyPreset"></a>
# **updatePolicyPreset**
> UpdatePolicyPresetResponse updatePolicyPreset(id)

Update a policy preset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PolicyPresetsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdatePolicyPresetResponse = apiInstance.updatePolicyPreset(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyPresetsApi#updatePolicyPreset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyPresetsApi#updatePolicyPreset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdatePolicyPresetResponse**](UpdatePolicyPresetResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

