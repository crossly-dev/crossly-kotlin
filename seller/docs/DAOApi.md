# DAOApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDaoProposal**](DAOApi.md#createDaoProposal) | **POST** /v1/dao/proposals | Raise a proposal. Starts as a draft.
[**createDaoProposalFinalise**](DAOApi.md#createDaoProposalFinalise) | **POST** /v1/dao/proposals/{id}/finalise | Close a proposal whose window has passed and record the outcome.
[**createDaoProposalOpen**](DAOApi.md#createDaoProposalOpen) | **POST** /v1/dao/proposals/{id}/open | Put your draft to a vote. Snapshots voting power.
[**createDaoProposalVeto**](DAOApi.md#createDaoProposalVeto) | **POST** /v1/dao/proposals/{id}/veto | Operator block. There is no matching power to PASS.
[**createDaoProposalVote**](DAOApi.md#createDaoProposalVote) | **POST** /v1/dao/proposals/{id}/vote | Cast or change a vote while the window is open.
[**deleteDaoProposal**](DAOApi.md#deleteDaoProposal) | **DELETE** /v1/dao/proposals/{id} | Withdraw your own DRAFT.
[**getDaoProposalTally**](DAOApi.md#getDaoProposalTally) | **GET** /v1/dao/proposals/{id}/tally | The live count.
[**listDaoProposals**](DAOApi.md#listDaoProposals) | **GET** /v1/dao/proposals | The proposal queue.


<a name="createDaoProposal"></a>
# **createDaoProposal**
> CreateDaoProposalResponse createDaoProposal()

Raise a proposal. Starts as a draft.

Requires staked CBX above &#x60;minProposeWeight&#x60;, and one in-flight proposal at a time. The limits bound a denial of ATTENTION rather than of service — attention is the resource a DAO actually runs on. &#x60;beneficiaryKind&#x60; is a CLOSED set and there is deliberately no stakers, holders, airdrop or distribution option. A proposal whose beneficiaries are the voters would be a self-payment, and a distribution decided by its own recipients is a dividend whatever it is called. The DAO decides WHAT to fund, never WHO gets paid. A &#x60;policy&#x60; proposal requests no funds and must omit the amount; every other kind must supply one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DAOApi()
try {
    val result : CreateDaoProposalResponse = apiInstance.createDaoProposal()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DAOApi#createDaoProposal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DAOApi#createDaoProposal")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateDaoProposalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDaoProposalFinalise"></a>
# **createDaoProposalFinalise**
> CreateDaoProposalFinaliseResponse createDaoProposalFinalise(id)

Close a proposal whose window has passed and record the outcome.

Normally unnecessary — the hourly sweep does it. Exposed so a result can be published immediately after a window closes rather than waiting for a tick. FINALISING RECORDS AN OUTCOME AND NOTHING ELSE. A passed proposal sets a status; disbursing still requires a campaign with a preview and a human approval, and there is no endpoint here that can move value.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DAOApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateDaoProposalFinaliseResponse = apiInstance.createDaoProposalFinalise(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DAOApi#createDaoProposalFinalise")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DAOApi#createDaoProposalFinalise")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateDaoProposalFinaliseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDaoProposalOpen"></a>
# **createDaoProposalOpen**
> CreateDaoProposalOpenResponse createDaoProposalOpen(id)

Put your draft to a vote. Snapshots voting power.

ONLY THE PROPOSER may open their own draft. Opening puts something to a binding vote in somebody&#39;s name, and authorship and that decision both belong to them. Opening writes a per-subject voting-power snapshot and freezes the quorum denominator. Nothing recomputes either afterwards, which is what stops acquire-vote-sell. Refuses when nobody holds enough staked CBX to vote — opening then would guarantee a failed quorum, waste a week and read as the feature being broken.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DAOApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateDaoProposalOpenResponse = apiInstance.createDaoProposalOpen(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DAOApi#createDaoProposalOpen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DAOApi#createDaoProposalOpen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateDaoProposalOpenResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDaoProposalVeto"></a>
# **createDaoProposalVeto**
> CreateDaoProposalVetoResponse createDaoProposalVeto(id)

Operator block. There is no matching power to PASS.

DELIBERATELY ASYMMETRIC. A veto exists for the illegal and the ruinous — funding something unlawful, or emptying the pool in a week. A power to pass would make every vote advisory theatre, because the outcome would always be whatever the operator preferred. An operator who can only say no cannot manufacture an outcome. The reason is MANDATORY and stored: an unexplained veto is indistinguishable from disliking the result, which is exactly what would destroy confidence in the mechanism. Expect it to be read.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DAOApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateDaoProposalVetoResponse = apiInstance.createDaoProposalVeto(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DAOApi#createDaoProposalVeto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DAOApi#createDaoProposalVeto")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateDaoProposalVetoResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDaoProposalVote"></a>
# **createDaoProposalVote**
> CreateDaoProposalVoteResponse createDaoProposalVote(id)

Cast or change a vote while the window is open.

Weight comes from the snapshot taken when the proposal opened, so staking afterwards grants no vote on it. Changing your mind is an UPDATE, not a second vote — a unique index makes double-counting impossible even if this logic were wrong. ABSTAIN counts toward turnout and not toward approval, which is the whole reason to offer it: it lets you help a proposal clear quorum without taking a side.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DAOApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateDaoProposalVoteResponse = apiInstance.createDaoProposalVote(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DAOApi#createDaoProposalVote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DAOApi#createDaoProposalVote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateDaoProposalVoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDaoProposal"></a>
# **deleteDaoProposal**
> DeleteDaoProposalResponse deleteDaoProposal(id)

Withdraw your own DRAFT.

Drafts only. Withdrawing an OPEN proposal would discard votes already cast, which is the proposer overruling the electorate — the thing the whole mechanism exists to prevent. An open proposal runs its window and gets a result. This exists so the one-in-flight limit is not a trap: without it a typo would lock somebody out of governance until the draft expired.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DAOApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : DeleteDaoProposalResponse = apiInstance.deleteDaoProposal(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DAOApi#deleteDaoProposal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DAOApi#deleteDaoProposal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**DeleteDaoProposalResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDaoProposalTally"></a>
# **getDaoProposalTally**
> GetDaoProposalTallyResponse getDaoProposalTally(id)

The live count.

&#x60;turnoutBps&#x60; is cast power over the frozen total, and counts abstentions. &#x60;approvalBps&#x60; is FOR over decisive votes, and does not. A proposal that misses quorum reports &#x60;expired&#x60; rather than &#x60;rejected&#x60; when finalised — \&quot;nobody turned up\&quot; and \&quot;the room said no\&quot; are different outcomes and a proposer deserves to know which happened.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DAOApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetDaoProposalTallyResponse = apiInstance.getDaoProposalTally(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DAOApi#getDaoProposalTally")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DAOApi#getDaoProposalTally")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetDaoProposalTallyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDaoProposals"></a>
# **listDaoProposals**
> ListDaoProposalsResponse listDaoProposals()

The proposal queue.

Staked CBX decides what the events pool funds. Voting power is size x tenure — the same weighting the earn multiplier uses — and it is SNAPSHOTTED when a proposal opens, so staking after seeing one grants no vote on it. &#x60;totalVotingPower&#x60; is the frozen quorum denominator; recomputing it would let somebody move the bar after votes were cast. Amounts are strings of base units.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = DAOApi()
try {
    val result : ListDaoProposalsResponse = apiInstance.listDaoProposals()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DAOApi#listDaoProposals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DAOApi#listDaoProposals")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListDaoProposalsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

