# WorkflowsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflow**](WorkflowsApi.md#createWorkflow) | **POST** /v1/workflows | Create a workflow: from blank ({ name, graph? }), from a template ({ from: \&quot;template\&quot;, templateId, setup?, activate? }) or from an export document ({ from: \&quot;import\&quot;, document }). New workflows start paused; activate one with POST /v1/workflows/{id}/activate. Returns the workflow and its validation issues.
[**createWorkflowActivate**](WorkflowsApi.md#createWorkflowActivate) | **POST** /v1/workflows/{id}/activate | Activate a workflow: its triggers start firing. A graph with blocking issues is refused (422, details.issues).
[**createWorkflowApprovalDecide**](WorkflowsApi.md#createWorkflowApprovalDecide) | **POST** /v1/workflow-approvals/{id}/decide | Approve or reject a pending flow.approval request: the waiting run resumes down the approved or rejected port. 409 when it was already decided (another device, Telegram, or the timeout).
[**createWorkflowChain**](WorkflowsApi.md#createWorkflowChain) | **POST** /v1/workflow-chains | Create a multi-step workflow chain.
[**createWorkflowChainRunNow**](WorkflowsApi.md#createWorkflowChainRunNow) | **POST** /v1/workflow-chains/{id}/run-now | Enqueue an ad-hoc run of a workflow chain.
[**createWorkflowChainToggle**](WorkflowsApi.md#createWorkflowChainToggle) | **POST** /v1/workflow-chains/{id}/toggle | Flip a workflow chain between active and inactive.
[**createWorkflowDeactivate**](WorkflowsApi.md#createWorkflowDeactivate) | **POST** /v1/workflows/{id}/deactivate | Pause a workflow: its triggers stop firing. Runs already started finish.
[**createWorkflowDuplicate**](WorkflowsApi.md#createWorkflowDuplicate) | **POST** /v1/workflows/{id}/duplicate | Copy a workflow (graph, description, tags) into a new paused workflow.
[**createWorkflowExpressionPreview**](WorkflowsApi.md#createWorkflowExpressionPreview) | **POST** /v1/workflows/expressions/preview | Resolve one param value (\&quot;{{ $json.priceCents * 0.9 }}\&quot;) with the engine&#39;s evaluator against an item, the trigger item, earlier nodes&#39; items or a stored run. A bad expression is an answer (ok&#x3D;false with the message), not an HTTP error. Changes nothing.
[**createWorkflowImport**](WorkflowsApi.md#createWorkflowImport) | **POST** /v1/workflows/import | Import a crossly.workflow export document (or { document, name }) as a new, paused workflow. Integration and workflow references are cleared (they belong to the exporting account) and listed in stripped.
[**createWorkflowRun**](WorkflowsApi.md#createWorkflowRun) | **POST** /v1/workflows/{id}/run | Run a workflow (active or paused) live now, on items you pass or on selected listings / orders / inventory items (one kind per call, up to 1,000). The graph must validate (422 with issues otherwise).
[**createWorkflowRunCancel**](WorkflowsApi.md#createWorkflowRunCancel) | **POST** /v1/workflow-runs/{runId}/cancel | Cancel a queued, running or waiting run. 409 when it already finished.
[**createWorkflowRunOn**](WorkflowsApi.md#createWorkflowRunOn) | **POST** /v1/workflows/run-on | \&quot;Run workflow on…\&quot;: the same as POST /v1/workflows/{id}/run with the workflow named in the body.
[**createWorkflowRunRetry**](WorkflowsApi.md#createWorkflowRunRetry) | **POST** /v1/workflow-runs/{runId}/retry | Retry a failed run from the node that failed: a new run (retryOfRunId) seeded from the failed run&#39;s checkpoint, so nodes that succeeded are not repeated. 409 unless the run failed.
[**createWorkflowSaleEnd**](WorkflowsApi.md#createWorkflowSaleEnd) | **POST** /v1/workflows/sales/{saleEventId}/end | End a sale now. A sale that has not started is cancelled; a live one closes and every discounted price is put back now (reverted &#x3D; how many listings were restored). 404 for a sale that is not yours.
[**createWorkflowTemplateUse**](WorkflowsApi.md#createWorkflowTemplateUse) | **POST** /v1/workflows/templates/{id}/use | Create a workflow from a template, filling its setup fields; activate&#x3D;true activates it when it validates.
[**createWorkflowTest**](WorkflowsApi.md#createWorkflowTest) | **POST** /v1/workflows/{id}/test | Test a workflow (the saved graph, or a draft graph you pass). mode&#x3D;test runs it for real, using pinned data where a node has it; mode&#x3D;dry is a safe test: write, destructive and money nodes report what they would do and change nothing. Trigger items: the ones you pass, else pinned, else the last real ones, else the trigger sample.
[**createWorkflowValidate**](WorkflowsApi.md#createWorkflowValidate) | **POST** /v1/workflows/validate | Validate a graph without saving it: unknown node types, missing required params, bad ports, cycles, expression errors. blocking&#x3D;true means activation would be refused.
[**createWorkflowVersionRestore**](WorkflowsApi.md#createWorkflowVersionRestore) | **POST** /v1/workflows/{id}/versions/{v}/restore | Restore an earlier version&#39;s graph as a new version. Pass version (the current one you read) to refuse the restore when someone saved meanwhile (409). Body optional: { version?: integer }.
[**createWorkflowWebhookRotate**](WorkflowsApi.md#createWorkflowWebhookRotate) | **POST** /v1/workflows/{id}/webhooks/{nodeId}/rotate | Issue a new inbound URL for an on.webhook trigger node (the old one stops working). The URL, and the signing secret when withSecret&#x3D;true, are returned ONCE: store them now.
[**deleteWorkflow**](WorkflowsApi.md#deleteWorkflow) | **DELETE** /v1/workflows/{id} | Delete (archive) a workflow: its triggers stop, open runs are cancelled, run history stays readable.
[**deleteWorkflowChain**](WorkflowsApi.md#deleteWorkflowChain) | **DELETE** /v1/workflow-chains/{id} | Delete a workflow chain (cascades steps + runs).
[**getWorkflow**](WorkflowsApi.md#getWorkflow) | **GET** /v1/workflows/{id} | Get one workflow with its full graph and current version.
[**getWorkflowCatalog**](WorkflowsApi.md#getWorkflowCatalog) | **GET** /v1/workflows/catalog | Everything needed to build a workflow: every node type (params, ports, output fields, risk, platforms capability), which platforms each capability covers and which of those you have connected, the expression helpers and bindings ({{ $json.listingId }}…) and the condition operators. Read this before composing a graph rather than guessing node types or param keys.
[**getWorkflowChain**](WorkflowsApi.md#getWorkflowChain) | **GET** /v1/workflow-chains/{id} | Get one workflow chain with its steps.
[**getWorkflowExport**](WorkflowsApi.md#getWorkflowExport) | **GET** /v1/workflows/{id}/export | Export a workflow as a portable document (format crossly.workflow) that POST /v1/workflows/import accepts. Credentials and account handles are stripped; pinned test data only with pinnedData&#x3D;true.
[**getWorkflowRun**](WorkflowsApi.md#getWorkflowRun) | **GET** /v1/workflow-runs/{runId} | One run: its summary, the graph version it ran, and every node execution (status, item counts per port, timing, errors). Item data per node: GET …/nodes/{nodeId}.
[**getWorkflowRunNode**](WorkflowsApi.md#getWorkflowRunNode) | **GET** /v1/workflow-runs/{runId}/nodes/{nodeId} | Every execution of one node in a run with its input and output items (each port keeps the first 50 items, 16 KB per item; truncated&#x3D;true when cut). Data older than the retention window, or not kept by settings.saveSuccessData&#x3D;false, is pruned: that execution has input/output null and pruned&#x3D;true, and when every execution is pruned the response is { data: null, meta: { pruned: true } } (never an empty list).
[**listWorkflowApprovals**](WorkflowsApi.md#listWorkflowApprovals) | **GET** /v1/workflow-approvals | Approval requests from flow.approval nodes, newest first (pending only unless status says otherwise). Decide one with POST /v1/workflow-approvals/{id}/decide.
[**listWorkflowChains**](WorkflowsApi.md#listWorkflowChains) | **GET** /v1/workflow-chains | List workflow chains with their step graph.
[**listWorkflowRuns**](WorkflowsApi.md#listWorkflowRuns) | **GET** /v1/workflows/{id}/runs | Run history of one workflow, newest first, with per-node status and item counts.
[**listWorkflowRuns2**](WorkflowsApi.md#listWorkflowRuns2) | **GET** /v1/workflow-runs | Runs of every workflow, newest first. Filter by workflow, status, mode and time.
[**listWorkflowSaleActive**](WorkflowsApi.md#listWorkflowSaleActive) | **GET** /v1/workflows/sales/active | Every live or upcoming sale (a sales event started by a sale.start node) with the workflow that runs it: percent off, window, and how many listings it applies to.
[**listWorkflowTemplates**](WorkflowsApi.md#listWorkflowTemplates) | **GET** /v1/workflows/templates | Ready-made workflows (weekend sale, stale-listing markdowns, offer responder, ship-by alerts…), each a complete graph plus the setup fields its \&quot;use\&quot; call asks for.
[**listWorkflowVersions**](WorkflowsApi.md#listWorkflowVersions) | **GET** /v1/workflows/{id}/versions | The saved versions of a workflow, newest first (restore one with POST …/versions/{v}/restore).
[**listWorkflows**](WorkflowsApi.md#listWorkflows) | **GET** /v1/workflows | List workflows, newest change first. A workflow is a graph of nodes: one or more triggers, then actions, lookups and flow nodes (if, switch, wait, approval…). Each row carries its trigger and node types and a 7-day run sparkline, not the graph (GET /v1/workflows/{id} has it).
[**updateWorkflow**](WorkflowsApi.md#updateWorkflow) | **PUT** /v1/workflows/{id} | Save a workflow. Pass the version you edited: a save over a newer version is 409 version_conflict (re-read and merge). Saving an active workflow validates it like activation does (422 with issues).
[**updateWorkflowChain**](WorkflowsApi.md#updateWorkflowChain) | **PUT** /v1/workflow-chains/{id} | Replace a workflow chain wholesale.


<a name="createWorkflow"></a>
# **createWorkflow**
> CreateWorkflowResponse createWorkflow(createWorkflowRequest)

Create a workflow: from blank ({ name, graph? }), from a template ({ from: \&quot;template\&quot;, templateId, setup?, activate? }) or from an export document ({ from: \&quot;import\&quot;, document }). New workflows start paused; activate one with POST /v1/workflows/{id}/activate. Returns the workflow and its validation issues.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val createWorkflowRequest : CreateWorkflowRequest =  // CreateWorkflowRequest | 
try {
    val result : CreateWorkflowResponse = apiInstance.createWorkflow(createWorkflowRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorkflowRequest** | **CreateWorkflowRequest**|  |

### Return type

**CreateWorkflowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorkflowActivate"></a>
# **createWorkflowActivate**
> WorkflowResponse createWorkflowActivate(id)

Activate a workflow: its triggers start firing. A graph with blocking issues is refused (422, details.issues).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
try {
    val result : WorkflowResponse = apiInstance.createWorkflowActivate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowActivate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowActivate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |

### Return type

**WorkflowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorkflowApprovalDecide"></a>
# **createWorkflowApprovalDecide**
> CreateWorkflowApprovalDecideResponse createWorkflowApprovalDecide(id, createWorkflowApprovalDecideRequest)

Approve or reject a pending flow.approval request: the waiting run resumes down the approved or rejected port. 409 when it was already decided (another device, Telegram, or the timeout).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Approval id from GET /v1/workflow-approvals.
val createWorkflowApprovalDecideRequest : CreateWorkflowApprovalDecideRequest =  // CreateWorkflowApprovalDecideRequest | 
try {
    val result : CreateWorkflowApprovalDecideResponse = apiInstance.createWorkflowApprovalDecide(id, createWorkflowApprovalDecideRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowApprovalDecide")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowApprovalDecide")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Approval id from GET /v1/workflow-approvals. |
 **createWorkflowApprovalDecideRequest** | **CreateWorkflowApprovalDecideRequest**|  |

### Return type

**CreateWorkflowApprovalDecideResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorkflowChain"></a>
# **createWorkflowChain**
> IdResponse createWorkflowChain()

Create a multi-step workflow chain.

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
try {
    val result : IdResponse = apiInstance.createWorkflowChain()
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

**IdResponse**

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

Deprecated: workflow chains are workflows now. Use /v1/workflows.

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

**CreateWorkflowChainRunNowResponse**

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

Deprecated: workflow chains are workflows now. Use /v1/workflows.

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

**CreateWorkflowChainToggleResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorkflowDeactivate"></a>
# **createWorkflowDeactivate**
> WorkflowResponse createWorkflowDeactivate(id)

Pause a workflow: its triggers stop firing. Runs already started finish.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
try {
    val result : WorkflowResponse = apiInstance.createWorkflowDeactivate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowDeactivate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowDeactivate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |

### Return type

**WorkflowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorkflowDuplicate"></a>
# **createWorkflowDuplicate**
> CreateWorkflowDuplicateResponse createWorkflowDuplicate(id, createWorkflowDuplicateRequest)

Copy a workflow (graph, description, tags) into a new paused workflow.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
val createWorkflowDuplicateRequest : CreateWorkflowDuplicateRequest =  // CreateWorkflowDuplicateRequest | 
try {
    val result : CreateWorkflowDuplicateResponse = apiInstance.createWorkflowDuplicate(id, createWorkflowDuplicateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowDuplicate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowDuplicate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |
 **createWorkflowDuplicateRequest** | **CreateWorkflowDuplicateRequest**|  |

### Return type

**CreateWorkflowDuplicateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorkflowExpressionPreview"></a>
# **createWorkflowExpressionPreview**
> CreateWorkflowExpressionPreviewResponse createWorkflowExpressionPreview(createWorkflowExpressionPreviewRequest)

Resolve one param value (\&quot;{{ $json.priceCents * 0.9 }}\&quot;) with the engine&#39;s evaluator against an item, the trigger item, earlier nodes&#39; items or a stored run. A bad expression is an answer (ok&#x3D;false with the message), not an HTTP error. Changes nothing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val createWorkflowExpressionPreviewRequest : CreateWorkflowExpressionPreviewRequest =  // CreateWorkflowExpressionPreviewRequest | 
try {
    val result : CreateWorkflowExpressionPreviewResponse = apiInstance.createWorkflowExpressionPreview(createWorkflowExpressionPreviewRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowExpressionPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowExpressionPreview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorkflowExpressionPreviewRequest** | **CreateWorkflowExpressionPreviewRequest**|  |

### Return type

**CreateWorkflowExpressionPreviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorkflowImport"></a>
# **createWorkflowImport**
> CreateWorkflowImportResponse createWorkflowImport(requestBody)

Import a crossly.workflow export document (or { document, name }) as a new, paused workflow. Integration and workflow references are cleared (they belong to the exporting account) and listed in stripped.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> =  // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : CreateWorkflowImportResponse = apiInstance.createWorkflowImport(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**|  |

### Return type

**CreateWorkflowImportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorkflowRun"></a>
# **createWorkflowRun**
> CreateWorkflowRunResponse createWorkflowRun(id, createWorkflowRunRequest)

Run a workflow (active or paused) live now, on items you pass or on selected listings / orders / inventory items (one kind per call, up to 1,000). The graph must validate (422 with issues otherwise).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
val createWorkflowRunRequest : CreateWorkflowRunRequest =  // CreateWorkflowRunRequest | 
try {
    val result : CreateWorkflowRunResponse = apiInstance.createWorkflowRun(id, createWorkflowRunRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |
 **createWorkflowRunRequest** | **CreateWorkflowRunRequest**|  |

### Return type

**CreateWorkflowRunResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorkflowRunCancel"></a>
# **createWorkflowRunCancel**
> CreateWorkflowRunCancelResponse createWorkflowRunCancel(runId)

Cancel a queued, running or waiting run. 409 when it already finished.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val runId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow run id.
try {
    val result : CreateWorkflowRunCancelResponse = apiInstance.createWorkflowRunCancel(runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowRunCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowRunCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **java.util.UUID**| Workflow run id. |

### Return type

**CreateWorkflowRunCancelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorkflowRunOn"></a>
# **createWorkflowRunOn**
> CreateWorkflowRunOnResponse createWorkflowRunOn(createWorkflowRunOnRequest)

\&quot;Run workflow on…\&quot;: the same as POST /v1/workflows/{id}/run with the workflow named in the body.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val createWorkflowRunOnRequest : CreateWorkflowRunOnRequest =  // CreateWorkflowRunOnRequest | 
try {
    val result : CreateWorkflowRunOnResponse = apiInstance.createWorkflowRunOn(createWorkflowRunOnRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowRunOn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowRunOn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorkflowRunOnRequest** | **CreateWorkflowRunOnRequest**|  |

### Return type

**CreateWorkflowRunOnResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorkflowRunRetry"></a>
# **createWorkflowRunRetry**
> CreateWorkflowRunRetryResponse createWorkflowRunRetry(runId)

Retry a failed run from the node that failed: a new run (retryOfRunId) seeded from the failed run&#39;s checkpoint, so nodes that succeeded are not repeated. 409 unless the run failed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val runId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow run id.
try {
    val result : CreateWorkflowRunRetryResponse = apiInstance.createWorkflowRunRetry(runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowRunRetry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowRunRetry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **java.util.UUID**| Workflow run id. |

### Return type

**CreateWorkflowRunRetryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorkflowSaleEnd"></a>
# **createWorkflowSaleEnd**
> CreateWorkflowSaleEndResponse createWorkflowSaleEnd(saleEventId)

End a sale now. A sale that has not started is cancelled; a live one closes and every discounted price is put back now (reverted &#x3D; how many listings were restored). 404 for a sale that is not yours.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val saleEventId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Sale id from GET /v1/workflows/sales/active.
try {
    val result : CreateWorkflowSaleEndResponse = apiInstance.createWorkflowSaleEnd(saleEventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowSaleEnd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowSaleEnd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saleEventId** | **java.util.UUID**| Sale id from GET /v1/workflows/sales/active. |

### Return type

**CreateWorkflowSaleEndResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorkflowTemplateUse"></a>
# **createWorkflowTemplateUse**
> CreateWorkflowResponse createWorkflowTemplateUse(id, createWorkflowTemplateUseRequest)

Create a workflow from a template, filling its setup fields; activate&#x3D;true activates it when it validates.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : kotlin.String = id_example // kotlin.String | Template id from GET /v1/workflows/templates.
val createWorkflowTemplateUseRequest : CreateWorkflowTemplateUseRequest =  // CreateWorkflowTemplateUseRequest | 
try {
    val result : CreateWorkflowResponse = apiInstance.createWorkflowTemplateUse(id, createWorkflowTemplateUseRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowTemplateUse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowTemplateUse")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Template id from GET /v1/workflows/templates. |
 **createWorkflowTemplateUseRequest** | **CreateWorkflowTemplateUseRequest**|  |

### Return type

**CreateWorkflowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorkflowTest"></a>
# **createWorkflowTest**
> CreateWorkflowTestResponse createWorkflowTest(id, createWorkflowTestRequest)

Test a workflow (the saved graph, or a draft graph you pass). mode&#x3D;test runs it for real, using pinned data where a node has it; mode&#x3D;dry is a safe test: write, destructive and money nodes report what they would do and change nothing. Trigger items: the ones you pass, else pinned, else the last real ones, else the trigger sample.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
val createWorkflowTestRequest : CreateWorkflowTestRequest =  // CreateWorkflowTestRequest | 
try {
    val result : CreateWorkflowTestResponse = apiInstance.createWorkflowTest(id, createWorkflowTestRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |
 **createWorkflowTestRequest** | **CreateWorkflowTestRequest**|  |

### Return type

**CreateWorkflowTestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorkflowValidate"></a>
# **createWorkflowValidate**
> CreateWorkflowValidateResponse createWorkflowValidate(createWorkflowValidateRequest)

Validate a graph without saving it: unknown node types, missing required params, bad ports, cycles, expression errors. blocking&#x3D;true means activation would be refused.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val createWorkflowValidateRequest : CreateWorkflowValidateRequest =  // CreateWorkflowValidateRequest | 
try {
    val result : CreateWorkflowValidateResponse = apiInstance.createWorkflowValidate(createWorkflowValidateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowValidate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowValidate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorkflowValidateRequest** | **CreateWorkflowValidateRequest**|  |

### Return type

**CreateWorkflowValidateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWorkflowVersionRestore"></a>
# **createWorkflowVersionRestore**
> WorkflowResponse createWorkflowVersionRestore(id, v)

Restore an earlier version&#39;s graph as a new version. Pass version (the current one you read) to refuse the restore when someone saved meanwhile (409). Body optional: { version?: integer }.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
val v : kotlin.Int = 56 // kotlin.Int | The version number to restore.
try {
    val result : WorkflowResponse = apiInstance.createWorkflowVersionRestore(id, v)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowVersionRestore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowVersionRestore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |
 **v** | **kotlin.Int**| The version number to restore. |

### Return type

**WorkflowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorkflowWebhookRotate"></a>
# **createWorkflowWebhookRotate**
> CreateWorkflowWebhookRotateResponse createWorkflowWebhookRotate(id, nodeId, createWorkflowWebhookRotateRequest)

Issue a new inbound URL for an on.webhook trigger node (the old one stops working). The URL, and the signing secret when withSecret&#x3D;true, are returned ONCE: store them now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
val nodeId : kotlin.String = nodeId_example // kotlin.String | The on.webhook trigger node id.
val createWorkflowWebhookRotateRequest : CreateWorkflowWebhookRotateRequest =  // CreateWorkflowWebhookRotateRequest | 
try {
    val result : CreateWorkflowWebhookRotateResponse = apiInstance.createWorkflowWebhookRotate(id, nodeId, createWorkflowWebhookRotateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#createWorkflowWebhookRotate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#createWorkflowWebhookRotate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |
 **nodeId** | **kotlin.String**| The on.webhook trigger node id. |
 **createWorkflowWebhookRotateRequest** | **CreateWorkflowWebhookRotateRequest**|  |

### Return type

**CreateWorkflowWebhookRotateResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWorkflow"></a>
# **deleteWorkflow**
> DeleteWorkflowResponse deleteWorkflow(id)

Delete (archive) a workflow: its triggers stop, open runs are cancelled, run history stays readable.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
try {
    val result : DeleteWorkflowResponse = apiInstance.deleteWorkflow(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#deleteWorkflow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#deleteWorkflow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |

### Return type

**DeleteWorkflowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorkflowChain"></a>
# **deleteWorkflowChain**
> OkResponse deleteWorkflowChain(id)

Delete a workflow chain (cascades steps + runs).

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.deleteWorkflowChain(id)
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

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflow"></a>
# **getWorkflow**
> GetWorkflowResponse getWorkflow(id)

Get one workflow with its full graph and current version.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
try {
    val result : GetWorkflowResponse = apiInstance.getWorkflow(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#getWorkflow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#getWorkflow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |

### Return type

**GetWorkflowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowCatalog"></a>
# **getWorkflowCatalog**
> GetWorkflowCatalogResponse getWorkflowCatalog()

Everything needed to build a workflow: every node type (params, ports, output fields, risk, platforms capability), which platforms each capability covers and which of those you have connected, the expression helpers and bindings ({{ $json.listingId }}…) and the condition operators. Read this before composing a graph rather than guessing node types or param keys.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
try {
    val result : GetWorkflowCatalogResponse = apiInstance.getWorkflowCatalog()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#getWorkflowCatalog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#getWorkflowCatalog")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWorkflowCatalogResponse**

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

Deprecated: workflow chains are workflows now. Use /v1/workflows.

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

**GetWorkflowChainResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowExport"></a>
# **getWorkflowExport**
> GetWorkflowExportResponse getWorkflowExport(id, pinnedData)

Export a workflow as a portable document (format crossly.workflow) that POST /v1/workflows/import accepts. Credentials and account handles are stripped; pinned test data only with pinnedData&#x3D;true.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
val pinnedData : kotlin.String = pinnedData_example // kotlin.String | Keep the nodes' pinned test data.
try {
    val result : GetWorkflowExportResponse = apiInstance.getWorkflowExport(id, pinnedData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#getWorkflowExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#getWorkflowExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |
 **pinnedData** | **kotlin.String**| Keep the nodes&#39; pinned test data. | [optional] [enum: true, false]

### Return type

**GetWorkflowExportResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowRun"></a>
# **getWorkflowRun**
> GetWorkflowRunResponse getWorkflowRun(runId)

One run: its summary, the graph version it ran, and every node execution (status, item counts per port, timing, errors). Item data per node: GET …/nodes/{nodeId}.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val runId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow run id.
try {
    val result : GetWorkflowRunResponse = apiInstance.getWorkflowRun(runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#getWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#getWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **java.util.UUID**| Workflow run id. |

### Return type

**GetWorkflowRunResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowRunNode"></a>
# **getWorkflowRunNode**
> GetWorkflowRunNodeResponse getWorkflowRunNode(runId, nodeId)

Every execution of one node in a run with its input and output items (each port keeps the first 50 items, 16 KB per item; truncated&#x3D;true when cut). Data older than the retention window, or not kept by settings.saveSuccessData&#x3D;false, is pruned: that execution has input/output null and pruned&#x3D;true, and when every execution is pruned the response is { data: null, meta: { pruned: true } } (never an empty list).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val runId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow run id.
val nodeId : kotlin.String = nodeId_example // kotlin.String | Node id within the run's graph.
try {
    val result : GetWorkflowRunNodeResponse = apiInstance.getWorkflowRunNode(runId, nodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#getWorkflowRunNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#getWorkflowRunNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **java.util.UUID**| Workflow run id. |
 **nodeId** | **kotlin.String**| Node id within the run&#39;s graph. |

### Return type

**GetWorkflowRunNodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkflowApprovals"></a>
# **listWorkflowApprovals**
> ListWorkflowApprovalsResponse listWorkflowApprovals(status, workflowId, page, limit)

Approval requests from flow.approval nodes, newest first (pending only unless status says otherwise). Decide one with POST /v1/workflow-approvals/{id}/decide.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val status : kotlin.String = status_example // kotlin.String | Comma-separated: pending, approved, rejected, expired. Default pending.
val workflowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Only approvals of this workflow.
val page : kotlin.Int = 56 // kotlin.Int | 1-indexed page.
val limit : kotlin.Int = 56 // kotlin.Int | Rows per page (1-100).
try {
    val result : ListWorkflowApprovalsResponse = apiInstance.listWorkflowApprovals(status, workflowId, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#listWorkflowApprovals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#listWorkflowApprovals")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **kotlin.String**| Comma-separated: pending, approved, rejected, expired. Default pending. | [optional]
 **workflowId** | **java.util.UUID**| Only approvals of this workflow. | [optional]
 **page** | **kotlin.Int**| 1-indexed page. | [optional] [default to 1]
 **limit** | **kotlin.Int**| Rows per page (1-100). | [optional] [default to 25]

### Return type

**ListWorkflowApprovalsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkflowChains"></a>
# **listWorkflowChains**
> ListWorkflowChainsResponse listWorkflowChains()

List workflow chains with their step graph.

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
try {
    val result : ListWorkflowChainsResponse = apiInstance.listWorkflowChains()
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

**ListWorkflowChainsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkflowRuns"></a>
# **listWorkflowRuns**
> ListWorkflowRunsResponse listWorkflowRuns(id, status, mode, since, until, page, limit)

Run history of one workflow, newest first, with per-node status and item counts.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
val status : kotlin.String = status_example // kotlin.String | Comma-separated run statuses: queued, running, waiting, succeeded, failed, cancelled.
val mode : kotlin.String = mode_example // kotlin.String | live (triggers), test (editor test run) or dry (safe test: no writes).
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Runs queued at or after this time (ISO 8601).
val until : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Runs queued at or before this time (ISO 8601).
val page : kotlin.Int = 56 // kotlin.Int | 1-indexed page.
val limit : kotlin.Int = 56 // kotlin.Int | Rows per page (1-100).
try {
    val result : ListWorkflowRunsResponse = apiInstance.listWorkflowRuns(id, status, mode, since, until, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#listWorkflowRuns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#listWorkflowRuns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |
 **status** | **kotlin.String**| Comma-separated run statuses: queued, running, waiting, succeeded, failed, cancelled. | [optional]
 **mode** | **kotlin.String**| live (triggers), test (editor test run) or dry (safe test: no writes). | [optional] [enum: live, test, dry]
 **since** | **java.time.OffsetDateTime**| Runs queued at or after this time (ISO 8601). | [optional]
 **until** | **java.time.OffsetDateTime**| Runs queued at or before this time (ISO 8601). | [optional]
 **page** | **kotlin.Int**| 1-indexed page. | [optional] [default to 1]
 **limit** | **kotlin.Int**| Rows per page (1-100). | [optional] [default to 25]

### Return type

**ListWorkflowRunsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkflowRuns2"></a>
# **listWorkflowRuns2**
> ListWorkflowRunsResponse listWorkflowRuns2(workflowId, status, mode, since, until, page, limit)

Runs of every workflow, newest first. Filter by workflow, status, mode and time.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val workflowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Only runs of this workflow.
val status : kotlin.String = status_example // kotlin.String | Comma-separated run statuses: queued, running, waiting, succeeded, failed, cancelled.
val mode : kotlin.String = mode_example // kotlin.String | live (triggers), test (editor test run) or dry (safe test: no writes).
val since : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Runs queued at or after this time (ISO 8601).
val until : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Runs queued at or before this time (ISO 8601).
val page : kotlin.Int = 56 // kotlin.Int | 1-indexed page.
val limit : kotlin.Int = 56 // kotlin.Int | Rows per page (1-100).
try {
    val result : ListWorkflowRunsResponse = apiInstance.listWorkflowRuns2(workflowId, status, mode, since, until, page, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#listWorkflowRuns2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#listWorkflowRuns2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowId** | **java.util.UUID**| Only runs of this workflow. | [optional]
 **status** | **kotlin.String**| Comma-separated run statuses: queued, running, waiting, succeeded, failed, cancelled. | [optional]
 **mode** | **kotlin.String**| live (triggers), test (editor test run) or dry (safe test: no writes). | [optional] [enum: live, test, dry]
 **since** | **java.time.OffsetDateTime**| Runs queued at or after this time (ISO 8601). | [optional]
 **until** | **java.time.OffsetDateTime**| Runs queued at or before this time (ISO 8601). | [optional]
 **page** | **kotlin.Int**| 1-indexed page. | [optional] [default to 1]
 **limit** | **kotlin.Int**| Rows per page (1-100). | [optional] [default to 25]

### Return type

**ListWorkflowRunsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkflowSaleActive"></a>
# **listWorkflowSaleActive**
> ListWorkflowSaleActiveResponse listWorkflowSaleActive()

Every live or upcoming sale (a sales event started by a sale.start node) with the workflow that runs it: percent off, window, and how many listings it applies to.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
try {
    val result : ListWorkflowSaleActiveResponse = apiInstance.listWorkflowSaleActive()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#listWorkflowSaleActive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#listWorkflowSaleActive")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWorkflowSaleActiveResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkflowTemplates"></a>
# **listWorkflowTemplates**
> ListWorkflowTemplatesResponse listWorkflowTemplates(category, q)

Ready-made workflows (weekend sale, stale-listing markdowns, offer responder, ship-by alerts…), each a complete graph plus the setup fields its \&quot;use\&quot; call asks for.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val category : kotlin.String = category_example // kotlin.String | Exact template category, e.g. \"Sales & markdowns\".
val q : kotlin.String = q_example // kotlin.String | Matches name, description, category or tags.
try {
    val result : ListWorkflowTemplatesResponse = apiInstance.listWorkflowTemplates(category, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#listWorkflowTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#listWorkflowTemplates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **kotlin.String**| Exact template category, e.g. \&quot;Sales &amp; markdowns\&quot;. | [optional]
 **q** | **kotlin.String**| Matches name, description, category or tags. | [optional]

### Return type

**ListWorkflowTemplatesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkflowVersions"></a>
# **listWorkflowVersions**
> ListWorkflowVersionsResponse listWorkflowVersions(id)

The saved versions of a workflow, newest first (restore one with POST …/versions/{v}/restore).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
try {
    val result : ListWorkflowVersionsResponse = apiInstance.listWorkflowVersions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#listWorkflowVersions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#listWorkflowVersions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |

### Return type

**ListWorkflowVersionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorkflows"></a>
# **listWorkflows**
> ListWorkflowsResponse listWorkflows(active, tag, trigger, q, legacyRef)

List workflows, newest change first. A workflow is a graph of nodes: one or more triggers, then actions, lookups and flow nodes (if, switch, wait, approval…). Each row carries its trigger and node types and a 7-day run sparkline, not the graph (GET /v1/workflows/{id} has it).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val active : kotlin.String = active_example // kotlin.String | Only active (true) or paused (false) workflows.
val tag : kotlin.String = tag_example // kotlin.String | Only workflows carrying this tag.
val trigger : kotlin.String = trigger_example // kotlin.String | Only workflows started by this trigger node type, e.g. on.listing.sold.
val q : kotlin.String = q_example // kotlin.String | Name contains (case-insensitive).
val legacyRef : kotlin.String = legacyRef_example // kotlin.String | The workflow an old automation became: rule:<id>, chain:<id> or sale_event:<id>.
try {
    val result : ListWorkflowsResponse = apiInstance.listWorkflows(active, tag, trigger, q, legacyRef)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#listWorkflows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#listWorkflows")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **active** | **kotlin.String**| Only active (true) or paused (false) workflows. | [optional] [enum: true, false]
 **tag** | **kotlin.String**| Only workflows carrying this tag. | [optional]
 **trigger** | **kotlin.String**| Only workflows started by this trigger node type, e.g. on.listing.sold. | [optional]
 **q** | **kotlin.String**| Name contains (case-insensitive). | [optional]
 **legacyRef** | **kotlin.String**| The workflow an old automation became: rule:&lt;id&gt;, chain:&lt;id&gt; or sale_event:&lt;id&gt;. | [optional]

### Return type

**ListWorkflowsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorkflow"></a>
# **updateWorkflow**
> WorkflowResponse updateWorkflow(id, updateWorkflowRequest)

Save a workflow. Pass the version you edited: a save over a newer version is 409 version_conflict (re-read and merge). Saving an active workflow validates it like activation does (422 with issues).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Workflow id.
val updateWorkflowRequest : UpdateWorkflowRequest =  // UpdateWorkflowRequest | 
try {
    val result : WorkflowResponse = apiInstance.updateWorkflow(id, updateWorkflowRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#updateWorkflow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#updateWorkflow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**| Workflow id. |
 **updateWorkflowRequest** | **UpdateWorkflowRequest**|  |

### Return type

**WorkflowResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorkflowChain"></a>
# **updateWorkflowChain**
> OkResponse updateWorkflowChain(id)

Replace a workflow chain wholesale.

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OkResponse = apiInstance.updateWorkflowChain(id)
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

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

