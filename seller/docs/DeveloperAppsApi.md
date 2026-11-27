# DeveloperAppsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeveloperAppCertificationSubmit**](DeveloperAppsApi.md#createDeveloperAppCertificationSubmit) | **POST** /v1/developer/apps/{appId}/certification/submit | Send the application to Crossly review. Needs a passing conformance run on this client version and report-menu evidence.
[**createDeveloperAppCertificationWithdraw**](DeveloperAppsApi.md#createDeveloperAppCertificationWithdraw) | **POST** /v1/developer/apps/{appId}/certification/withdraw | Take the application out of review to edit it.
[**createDeveloperAppClientVersion**](DeveloperAppsApi.md#createDeveloperAppClientVersion) | **POST** /v1/developer/apps/{appId}/client-versions | Register a new release of your certified client and start its conformance run. A pass on the same major version carries the certification automatically; a new major version goes to Crossly review; a failure keeps your previous certified version.
[**createDeveloperAppClientVersionRun**](DeveloperAppsApi.md#createDeveloperAppClientVersionRun) | **POST** /v1/developer/apps/{appId}/client-versions/{versionId}/run | Start a new conformance run for a release whose run failed, expired or was aborted.
[**createDeveloperAppConformanceRun**](DeveloperAppsApi.md#createDeveloperAppConformanceRun) | **POST** /v1/developer/apps/{appId}/conformance-runs | Start a conformance run: a test experience only your app, signed in as you, can join. Join it with POST /v1/worlds/experiences/{experienceId}/join and follow the instruction.
[**createDeveloperAppConformanceRunAbort**](DeveloperAppsApi.md#createDeveloperAppConformanceRunAbort) | **POST** /v1/developer/apps/{appId}/conformance-runs/{runId}/abort | Abort an open run.
[**createDeveloperAppVerificationCheckDomain**](DeveloperAppsApi.md#createDeveloperAppVerificationCheckDomain) | **POST** /v1/developer/apps/{appId}/verification/check-domain | Look up the DNS TXT record crossly-app-verification&#x3D;&lt;token&gt; on your domain (or _crossly.&lt;domain&gt;) now.
[**createDeveloperAppVerificationSubmit**](DeveloperAppsApi.md#createDeveloperAppVerificationSubmit) | **POST** /v1/developer/apps/{appId}/verification/submit | Send the verification to Crossly review (each scope is decided separately).
[**createDeveloperAppVerificationWithdraw**](DeveloperAppsApi.md#createDeveloperAppVerificationWithdraw) | **POST** /v1/developer/apps/{appId}/verification/withdraw | Take the verification out of review to edit it.
[**getDeveloperAppCertification**](DeveloperAppsApi.md#getDeveloperAppCertification) | **GET** /v1/developer/apps/{appId}/certification | The Crossly Carnival client certification application (null until you create it): status, client, evidence, the passing run and what still blocks submission.
[**getDeveloperAppClientVersion**](DeveloperAppsApi.md#getDeveloperAppClientVersion) | **GET** /v1/developer/apps/{appId}/client-versions/{versionId} | One client release and its re-certification.
[**getDeveloperAppConformanceRun**](DeveloperAppsApi.md#getDeveloperAppConformanceRun) | **GET** /v1/developer/apps/{appId}/conformance-runs/{runId} | A run&#39;s step, instruction and every check with its verdict.
[**getDeveloperAppHealth**](DeveloperAppsApi.md#getDeveloperAppHealth) | **GET** /v1/developer/apps/{appId}/health | Your app&#39;s API health: write-request counts by status class (24 h, 7 d) across every seller using it, top error codes with advice, a retry-storm flag, the last 50 failed requests (message and correlation id only on requests made with your own account), and from Atlas: how many people authorized the app and with which scopes (counts, never who) and the token endpoint&#39;s OAuth errors by code (e.g. invalid_grant) with the latest one.
[**getDeveloperAppProfile**](DeveloperAppsApi.md#getDeveloperAppProfile) | **GET** /v1/developer/apps/{appId}/profile | Your app&#39;s public directory profile: every editable field, the listing status, what still needs review, and &#x60;preview&#x60; — the profile exactly as /seller-apps or /buyer-apps will show it.
[**getDeveloperAppReview**](DeveloperAppsApi.md#getDeveloperAppReview) | **GET** /v1/developer/apps/{appId}/review | Your app&#39;s Crossly Carnival client certification, verification and review history in one read.
[**getDeveloperAppVerification**](DeveloperAppsApi.md#getDeveloperAppVerification) | **GET** /v1/developer/apps/{appId}/verification | The app verification for worlds:publish / worlds:monetize (null until created): domain proof, policies, justifications and per-scope decisions.
[**listDeveloperAppClientVersions**](DeveloperAppsApi.md#listDeveloperAppClientVersions) | **GET** /v1/developer/apps/{appId}/client-versions | Releases of your certified client, newest first: the re-certification status (awaiting_run, running, carried, ops_review, approved, rejected, failed, superseded), the rule that decided it and its checks.
[**listDeveloperAppConformanceRuns**](DeveloperAppsApi.md#listDeveloperAppConformanceRuns) | **GET** /v1/developer/apps/{appId}/conformance-runs | Your app&#39;s conformance runs, newest first.
[**updateDeveloperAppCertification**](DeveloperAppsApi.md#updateDeveloperAppCertification) | **PUT** /v1/developer/apps/{appId}/certification | Create or edit the application: client name, platform, version, build and source URLs, description and evidence (report menu, chat, Policy UI). Changing the client clears the passing run.
[**updateDeveloperAppListing**](DeveloperAppsApi.md#updateDeveloperAppListing) | **PUT** /v1/developer/apps/{appId}/listing | Turn \&quot;Listed publicly\&quot; on or off. On: an app Crossly approved whose name, scopes and audience are unchanged is listed at once; anything else goes to review (pending_review). Off: unlisted immediately.
[**updateDeveloperAppProfile**](DeveloperAppsApi.md#updateDeveloperAppProfile) | **PATCH** /v1/developer/apps/{appId}/profile | Edit your app&#39;s directory profile: name, slug, tagline, description, longDescription (markdown), category, audience (auto|seller|buyer|both), logoUrl, bannerUrl (4:1, 1600×400), screenshots (≤6), demoVideoUrl, homepageUrl, installUrl, support/privacy/terms links, docsLinks [{label,url}] and pricingNote. Absent keys are kept, null clears. Images not on Crossly&#39;s CDN are copied onto it. Renaming a listed app or changing its audience sends it back to review.
[**updateDeveloperAppVerification**](DeveloperAppsApi.md#updateDeveloperAppVerification) | **PUT** /v1/developer/apps/{appId}/verification | Create or edit the verification: domain, requested scopes with a justification each, privacy policy, terms, support email, demo.


<a name="createDeveloperAppCertificationSubmit"></a>
# **createDeveloperAppCertificationSubmit**
> DeveloperAppCertificationResponse createDeveloperAppCertificationSubmit(appId)

Send the application to Crossly review. Needs a passing conformance run on this client version and report-menu evidence.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : DeveloperAppCertificationResponse = apiInstance.createDeveloperAppCertificationSubmit(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#createDeveloperAppCertificationSubmit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#createDeveloperAppCertificationSubmit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**DeveloperAppCertificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDeveloperAppCertificationWithdraw"></a>
# **createDeveloperAppCertificationWithdraw**
> DeveloperAppCertificationResponse createDeveloperAppCertificationWithdraw(appId)

Take the application out of review to edit it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : DeveloperAppCertificationResponse = apiInstance.createDeveloperAppCertificationWithdraw(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#createDeveloperAppCertificationWithdraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#createDeveloperAppCertificationWithdraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**DeveloperAppCertificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDeveloperAppClientVersion"></a>
# **createDeveloperAppClientVersion**
> CreateDeveloperAppClientVersionResponse createDeveloperAppClientVersion(appId)

Register a new release of your certified client and start its conformance run. A pass on the same major version carries the certification automatically; a new major version goes to Crossly review; a failure keeps your previous certified version.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : CreateDeveloperAppClientVersionResponse = apiInstance.createDeveloperAppClientVersion(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#createDeveloperAppClientVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#createDeveloperAppClientVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**CreateDeveloperAppClientVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDeveloperAppClientVersionRun"></a>
# **createDeveloperAppClientVersionRun**
> CreateDeveloperAppClientVersionResponse createDeveloperAppClientVersionRun(appId, versionId)

Start a new conformance run for a release whose run failed, expired or was aborted.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
val versionId : kotlin.String = versionId_example // kotlin.String | 
try {
    val result : CreateDeveloperAppClientVersionResponse = apiInstance.createDeveloperAppClientVersionRun(appId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#createDeveloperAppClientVersionRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#createDeveloperAppClientVersionRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **versionId** | **kotlin.String**|  |

### Return type

**CreateDeveloperAppClientVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDeveloperAppConformanceRun"></a>
# **createDeveloperAppConformanceRun**
> GetDeveloperAppConformanceRunResponse createDeveloperAppConformanceRun(appId)

Start a conformance run: a test experience only your app, signed in as you, can join. Join it with POST /v1/worlds/experiences/{experienceId}/join and follow the instruction.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : GetDeveloperAppConformanceRunResponse = apiInstance.createDeveloperAppConformanceRun(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#createDeveloperAppConformanceRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#createDeveloperAppConformanceRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**GetDeveloperAppConformanceRunResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDeveloperAppConformanceRunAbort"></a>
# **createDeveloperAppConformanceRunAbort**
> CreateDeveloperAppConformanceRunAbortResponse createDeveloperAppConformanceRunAbort(appId, runId)

Abort an open run.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
val runId : kotlin.String = runId_example // kotlin.String | 
try {
    val result : CreateDeveloperAppConformanceRunAbortResponse = apiInstance.createDeveloperAppConformanceRunAbort(appId, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#createDeveloperAppConformanceRunAbort")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#createDeveloperAppConformanceRunAbort")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **runId** | **kotlin.String**|  |

### Return type

**CreateDeveloperAppConformanceRunAbortResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDeveloperAppVerificationCheckDomain"></a>
# **createDeveloperAppVerificationCheckDomain**
> DeveloperAppVerificationResponse createDeveloperAppVerificationCheckDomain(appId)

Look up the DNS TXT record crossly-app-verification&#x3D;&lt;token&gt; on your domain (or _crossly.&lt;domain&gt;) now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : DeveloperAppVerificationResponse = apiInstance.createDeveloperAppVerificationCheckDomain(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#createDeveloperAppVerificationCheckDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#createDeveloperAppVerificationCheckDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**DeveloperAppVerificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDeveloperAppVerificationSubmit"></a>
# **createDeveloperAppVerificationSubmit**
> DeveloperAppVerificationResponse createDeveloperAppVerificationSubmit(appId)

Send the verification to Crossly review (each scope is decided separately).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : DeveloperAppVerificationResponse = apiInstance.createDeveloperAppVerificationSubmit(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#createDeveloperAppVerificationSubmit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#createDeveloperAppVerificationSubmit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**DeveloperAppVerificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDeveloperAppVerificationWithdraw"></a>
# **createDeveloperAppVerificationWithdraw**
> DeveloperAppVerificationResponse createDeveloperAppVerificationWithdraw(appId)

Take the verification out of review to edit it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : DeveloperAppVerificationResponse = apiInstance.createDeveloperAppVerificationWithdraw(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#createDeveloperAppVerificationWithdraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#createDeveloperAppVerificationWithdraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**DeveloperAppVerificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeveloperAppCertification"></a>
# **getDeveloperAppCertification**
> GetDeveloperAppCertificationResponse getDeveloperAppCertification(appId)

The Crossly Carnival client certification application (null until you create it): status, client, evidence, the passing run and what still blocks submission.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : GetDeveloperAppCertificationResponse = apiInstance.getDeveloperAppCertification(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#getDeveloperAppCertification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#getDeveloperAppCertification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**GetDeveloperAppCertificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeveloperAppClientVersion"></a>
# **getDeveloperAppClientVersion**
> GetDeveloperAppClientVersionResponse getDeveloperAppClientVersion(appId, versionId)

One client release and its re-certification.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
val versionId : kotlin.String = versionId_example // kotlin.String | 
try {
    val result : GetDeveloperAppClientVersionResponse = apiInstance.getDeveloperAppClientVersion(appId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#getDeveloperAppClientVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#getDeveloperAppClientVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **versionId** | **kotlin.String**|  |

### Return type

**GetDeveloperAppClientVersionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeveloperAppConformanceRun"></a>
# **getDeveloperAppConformanceRun**
> GetDeveloperAppConformanceRunResponse getDeveloperAppConformanceRun(appId, runId)

A run&#39;s step, instruction and every check with its verdict.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
val runId : kotlin.String = runId_example // kotlin.String | 
try {
    val result : GetDeveloperAppConformanceRunResponse = apiInstance.getDeveloperAppConformanceRun(appId, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#getDeveloperAppConformanceRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#getDeveloperAppConformanceRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **runId** | **kotlin.String**|  |

### Return type

**GetDeveloperAppConformanceRunResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeveloperAppHealth"></a>
# **getDeveloperAppHealth**
> GetDeveloperAppHealthResponse getDeveloperAppHealth(appId)

Your app&#39;s API health: write-request counts by status class (24 h, 7 d) across every seller using it, top error codes with advice, a retry-storm flag, the last 50 failed requests (message and correlation id only on requests made with your own account), and from Atlas: how many people authorized the app and with which scopes (counts, never who) and the token endpoint&#39;s OAuth errors by code (e.g. invalid_grant) with the latest one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : GetDeveloperAppHealthResponse = apiInstance.getDeveloperAppHealth(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#getDeveloperAppHealth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#getDeveloperAppHealth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**GetDeveloperAppHealthResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeveloperAppProfile"></a>
# **getDeveloperAppProfile**
> GetDeveloperAppProfileResponse getDeveloperAppProfile(appId)

Your app&#39;s public directory profile: every editable field, the listing status, what still needs review, and &#x60;preview&#x60; — the profile exactly as /seller-apps or /buyer-apps will show it.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : GetDeveloperAppProfileResponse = apiInstance.getDeveloperAppProfile(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#getDeveloperAppProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#getDeveloperAppProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**GetDeveloperAppProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeveloperAppReview"></a>
# **getDeveloperAppReview**
> GetDeveloperAppReviewResponse getDeveloperAppReview(appId)

Your app&#39;s Crossly Carnival client certification, verification and review history in one read.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : GetDeveloperAppReviewResponse = apiInstance.getDeveloperAppReview(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#getDeveloperAppReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#getDeveloperAppReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**GetDeveloperAppReviewResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeveloperAppVerification"></a>
# **getDeveloperAppVerification**
> GetDeveloperAppVerificationResponse getDeveloperAppVerification(appId)

The app verification for worlds:publish / worlds:monetize (null until created): domain proof, policies, justifications and per-scope decisions.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : GetDeveloperAppVerificationResponse = apiInstance.getDeveloperAppVerification(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#getDeveloperAppVerification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#getDeveloperAppVerification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**GetDeveloperAppVerificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeveloperAppClientVersions"></a>
# **listDeveloperAppClientVersions**
> ListDeveloperAppClientVersionsResponse listDeveloperAppClientVersions(appId)

Releases of your certified client, newest first: the re-certification status (awaiting_run, running, carried, ops_review, approved, rejected, failed, superseded), the rule that decided it and its checks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : ListDeveloperAppClientVersionsResponse = apiInstance.listDeveloperAppClientVersions(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#listDeveloperAppClientVersions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#listDeveloperAppClientVersions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**ListDeveloperAppClientVersionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeveloperAppConformanceRuns"></a>
# **listDeveloperAppConformanceRuns**
> ListDeveloperAppConformanceRunsResponse listDeveloperAppConformanceRuns(appId)

Your app&#39;s conformance runs, newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : ListDeveloperAppConformanceRunsResponse = apiInstance.listDeveloperAppConformanceRuns(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#listDeveloperAppConformanceRuns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#listDeveloperAppConformanceRuns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**ListDeveloperAppConformanceRunsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDeveloperAppCertification"></a>
# **updateDeveloperAppCertification**
> DeveloperAppCertificationResponse updateDeveloperAppCertification(appId)

Create or edit the application: client name, platform, version, build and source URLs, description and evidence (report menu, chat, Policy UI). Changing the client clears the passing run.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : DeveloperAppCertificationResponse = apiInstance.updateDeveloperAppCertification(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#updateDeveloperAppCertification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#updateDeveloperAppCertification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**DeveloperAppCertificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDeveloperAppListing"></a>
# **updateDeveloperAppListing**
> UpdateDeveloperAppListingResponse updateDeveloperAppListing(appId)

Turn \&quot;Listed publicly\&quot; on or off. On: an app Crossly approved whose name, scopes and audience are unchanged is listed at once; anything else goes to review (pending_review). Off: unlisted immediately.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : UpdateDeveloperAppListingResponse = apiInstance.updateDeveloperAppListing(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#updateDeveloperAppListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#updateDeveloperAppListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**UpdateDeveloperAppListingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDeveloperAppProfile"></a>
# **updateDeveloperAppProfile**
> UpdateDeveloperAppProfileResponse updateDeveloperAppProfile(appId)

Edit your app&#39;s directory profile: name, slug, tagline, description, longDescription (markdown), category, audience (auto|seller|buyer|both), logoUrl, bannerUrl (4:1, 1600×400), screenshots (≤6), demoVideoUrl, homepageUrl, installUrl, support/privacy/terms links, docsLinks [{label,url}] and pricingNote. Absent keys are kept, null clears. Images not on Crossly&#39;s CDN are copied onto it. Renaming a listed app or changing its audience sends it back to review.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : UpdateDeveloperAppProfileResponse = apiInstance.updateDeveloperAppProfile(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#updateDeveloperAppProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#updateDeveloperAppProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**UpdateDeveloperAppProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDeveloperAppVerification"></a>
# **updateDeveloperAppVerification**
> DeveloperAppVerificationResponse updateDeveloperAppVerification(appId)

Create or edit the verification: domain, requested scopes with a justification each, privacy policy, terms, support email, demo.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DeveloperAppsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
try {
    val result : DeveloperAppVerificationResponse = apiInstance.updateDeveloperAppVerification(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeveloperAppsApi#updateDeveloperAppVerification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeveloperAppsApi#updateDeveloperAppVerification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |

### Return type

**DeveloperAppVerificationResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

