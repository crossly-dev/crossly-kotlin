# WorkflowsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflowChain**](WorkflowsApi.md#createWorkflowChain) | **POST** /v1/workflow-chains | Create a multi-step workflow chain.
[**createWorkflowChainRunNow**](WorkflowsApi.md#createWorkflowChainRunNow) | **POST** /v1/workflow-chains/{id}/run-now | Enqueue an ad-hoc run of a workflow chain.
[**createWorkflowChainToggle**](WorkflowsApi.md#createWorkflowChainToggle) | **POST** /v1/workflow-chains/{id}/toggle | Flip a workflow chain between active and inactive.
[**deleteWorkflowChain**](WorkflowsApi.md#deleteWorkflowChain) | **DELETE** /v1/workflow-chains/{id} | Delete a workflow chain (cascades steps + runs).
[**getWorkflowChain**](WorkflowsApi.md#getWorkflowChain) | **GET** /v1/workflow-chains/{id} | Get one workflow chain with its steps.
[**listWorkflowChains**](WorkflowsApi.md#listWorkflowChains) | **GET** /v1/workflow-chains | List workflow chains with their step graph.
[**updateWorkflowChain**](WorkflowsApi.md#updateWorkflowChain) | **PUT** /v1/workflow-chains/{id} | Replace a workflow chain wholesale.


<a name="createWorkflowChain"></a>
# **createWorkflowChain**
> CreateWorkflowChainResponse createWorkflowChain()

Create a multi-step workflow chain.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
try {
    val result : CreateWorkflowChainResponse = apiInstance.createWorkflowChain()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowChain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowChain")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CreateWorkflowChainResponse**](CreateWorkflowChainResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorkflowChainRunNow"></a>
# **createWorkflowChainRunNow**
> CreateWorkflowChainRunNowResponse createWorkflowChainRunNow(id)

Enqueue an ad-hoc run of a workflow chain.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateWorkflowChainRunNowResponse = apiInstance.createWorkflowChainRunNow(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowChainRunNow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowChainRunNow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateWorkflowChainRunNowResponse**](CreateWorkflowChainRunNowResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorkflowChainToggle"></a>
# **createWorkflowChainToggle**
> CreateWorkflowChainToggleResponse createWorkflowChainToggle(id)

Flip a workflow chain between active and inactive.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : CreateWorkflowChainToggleResponse = apiInstance.createWorkflowChainToggle(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowChainToggle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowChainToggle")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**CreateWorkflowChainToggleResponse**](CreateWorkflowChainToggleResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorkflowChain"></a>
# **deleteWorkflowChain**
> DeleteWorkflowChainResponse deleteWorkflowChain(id)

Delete a workflow chain (cascades steps + runs).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DeleteWorkflowChainResponse = apiInstance.deleteWorkflowChain(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#deleteWorkflowChain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#deleteWorkflowChain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**DeleteWorkflowChainResponse**](DeleteWorkflowChainResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowChain"></a>
# **getWorkflowChain**
> GetWorkflowChainResponse getWorkflowChain(id)

Get one workflow chain with its steps.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : GetWorkflowChainResponse = apiInstance.getWorkflowChain(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#getWorkflowChain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#getWorkflowChain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**GetWorkflowChainResponse**](GetWorkflowChainResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkflowChains"></a>
# **listWorkflowChains**
> V1List listWorkflowChains()

List workflow chains with their step graph.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
try {
    val result : V1List = apiInstance.listWorkflowChains()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#listWorkflowChains")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#listWorkflowChains")
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

<a name="updateWorkflowChain"></a>
# **updateWorkflowChain**
> UpdateWorkflowChainResponse updateWorkflowChain(id)

Replace a workflow chain wholesale.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UpdateWorkflowChainResponse = apiInstance.updateWorkflowChain(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#updateWorkflowChain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#updateWorkflowChain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**UpdateWorkflowChainResponse**](UpdateWorkflowChainResponse.md)

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

