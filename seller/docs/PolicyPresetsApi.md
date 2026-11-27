# PolicyPresetsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGeoLocationCheck**](PolicyPresetsApi.md#createGeoLocationCheck) | **POST** /v1/geo/location-check | Check whether a shipping policy ships to an address.
[**createPolicyPreset**](PolicyPresetsApi.md#createPolicyPreset) | **POST** /v1/policy-presets | Create a return / shipping / payment policy preset.
[**deletePolicyPreset**](PolicyPresetsApi.md#deletePolicyPreset) | **DELETE** /v1/policy-presets/{id} | Delete a policy preset. Listings that used it switch to the default preset of its kind.
[**getPolicy**](PolicyPresetsApi.md#getPolicy) | **GET** /v1/policies | The seller&#39;s shipping / return / payment policy presets by kind, with each kind&#39;s default.
[**listPolicyPresets**](PolicyPresetsApi.md#listPolicyPresets) | **GET** /v1/policy-presets | List the seller&#39;s return / shipping / payment policy presets. meta.migrationNotices lists defaults the policy migration demoted (kind still has no default).
[**updatePolicyPreset**](PolicyPresetsApi.md#updatePolicyPreset) | **PATCH** /v1/policy-presets/{id} | Update a policy preset.


<a name="createGeoLocationCheck"></a>
# **createGeoLocationCheck**
> CreateGeoLocationCheckResponse createGeoLocationCheck()

Check whether a shipping policy ships to an address.

Pass an unsaved &#x60;policy&#x60; draft or a &#x60;presetId&#x60; (neither &#x3D; your default shipping policy), an &#x60;address&#x60;, and optionally &#x60;consolidateVia&#x60; (a ship-together hub). Returns &#x60;ships&#x60;, and when it does not: &#x60;reason&#x60;, &#x60;stage&#x60; (buyer | hub), &#x60;message&#x60; and the deciding &#x60;rule&#x60;. &#x60;partial&#x60; means a fuller address (state, ZIP) could change the answer. A draft that is not a valid shipping policy is a 422; a presetId that is not yours is a 404.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PolicyPresetsApi()
try {
    val result : CreateGeoLocationCheckResponse = apiInstance.createGeoLocationCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyPresetsApi#createGeoLocationCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyPresetsApi#createGeoLocationCheck")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateGeoLocationCheckResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

**CreatePolicyPresetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePolicyPreset"></a>
# **deletePolicyPreset**
> DeletePolicyPresetResponse deletePolicyPreset(id)

Delete a policy preset. Listings that used it switch to the default preset of its kind.

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

**DeletePolicyPresetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPolicy"></a>
# **getPolicy**
> GetPolicyResponse getPolicy()

The seller&#39;s shipping / return / payment policy presets by kind, with each kind&#39;s default.

Pass a preset &#x60;id&#x60; as &#x60;policies.shippingPresetId&#x60; / &#x60;returnPresetId&#x60; / &#x60;paymentPresetId&#x60; on POST or PATCH /v1/listings (null &#x3D; the marketplace&#39;s own default). A kind you omit uses &#x60;defaultPresetId&#x60;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PolicyPresetsApi()
try {
    val result : GetPolicyResponse = apiInstance.getPolicy()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyPresetsApi#getPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyPresetsApi#getPolicy")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetPolicyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPolicyPresets"></a>
# **listPolicyPresets**
> ListPolicyPresetsResponse listPolicyPresets(kind)

List the seller&#39;s return / shipping / payment policy presets. meta.migrationNotices lists defaults the policy migration demoted (kind still has no default).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PolicyPresetsApi()
val kind : kotlin.String = kind_example // kotlin.String | 
try {
    val result : ListPolicyPresetsResponse = apiInstance.listPolicyPresets(kind)
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

**ListPolicyPresetsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePolicyPreset"></a>
# **updatePolicyPreset**
> CreatePolicyPresetResponse updatePolicyPreset(id)

Update a policy preset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = PolicyPresetsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreatePolicyPresetResponse = apiInstance.updatePolicyPreset(id)
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

**CreatePolicyPresetResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

