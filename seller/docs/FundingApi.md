# FundingApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFundingApply**](FundingApi.md#createFundingApply) | **POST** /v1/funding/apply | Apply for Crossly Funding. Decided at once on the checklist rules: approved opens your line (limit &#x3D; 25% of 90 days of settled Crossly payouts), declined lists why, needs_review goes to a person.
[**createFundingDraw**](FundingApi.md#createFundingDraw) | **POST** /v1/funding/draws | Draw on your line for a supplier order. Send the supplier, the invoice (an uploaded invoiceFileId from POST /v1/funding/invoice-files, a reference, or a URL) and the APR from the quote you accepted (acceptedAprBps); refused if your rate changed. The advance is held as in-platform Crossly balance, never cash. Idempotent on idempotencyKey.
[**createFundingDrawApprove**](FundingApi.md#createFundingDrawApprove) | **POST** /v1/funding/draws/{id}/approve | Approve a held draw. The two-person rule needs two distinct approvers; the requester never approves their own.
[**createFundingDrawQuote**](FundingApi.md#createFundingDrawQuote) | **POST** /v1/funding/draws/quote | The disclosure for a draw of amountCents: APR, the simple-interest fee for the full term, the total and the due date, plus your available headroom. Nothing is drawn.
[**createFundingDrawReject**](FundingApi.md#createFundingDrawReject) | **POST** /v1/funding/draws/{id}/reject | Reject a held draw. Nothing was drawn, so nothing is owed.
[**createFundingDrawUse**](FundingApi.md#createFundingDrawUse) | **POST** /v1/funding/draws/use | Request a draw for an approved use. Refused by the spend controls, held for approval (stage requested — no debt until disbursed), or disbursed at once as restricted funding CBX. A DEBT with interest: show the disclosure first.
[**createFundingInvoiceFile**](FundingApi.md#createFundingInvoiceFile) | **POST** /v1/funding/invoice-files | Sign an upload for a supplier invoice: a PDF or image (application/pdf, image/jpeg, image/png, image/webp, image/heic) of at most 15 MB. PUT the bytes to uploadUrl with the same Content-Type and exactly contentLength bytes, then draw with invoiceFileId &#x3D; file.id. Stored privately; one draw per file.
[**createFundingPayCrosslyFee**](FundingApi.md#createFundingPayCrosslyFee) | **POST** /v1/funding/pay/crossly-fees | Pay an open invoice of your Crossly plan with restricted funding CBX (no card is charged; the invoice is marked paid). Idempotent per invoice.
[**createFundingPayShippingLabel**](FundingApi.md#createFundingPayShippingLabel) | **POST** /v1/funding/pay/shipping-labels | Top up your shipping wallet with restricted funding CBX; labels you buy are then debited from it. Idempotent on idempotencyKey. Refused when the spend controls forbid shipping labels or it is over your approval threshold with no approved draw.
[**createFundingPayVaultFee**](FundingApi.md#createFundingPayVaultFee) | **POST** /v1/funding/pay/vault-fees | Ship a stored Vault unit home and pay its fee (shipping, storage owed, early withdrawal) with restricted funding CBX instead of your card.
[**createFundingPoolStake**](FundingApi.md#createFundingPoolStake) | **POST** /v1/funding/pool/stake | Stake earned CBX into the funding pool. Refused, with the reason, until the pool is live and staking is open.
[**createFundingPoolUnstake**](FundingApi.md#createFundingPoolUnstake) | **POST** /v1/funding/pool/unstake | Queue an unstake. Paid first-in first-out once your lockup has passed.
[**createFundingPoolUnstakeCancel**](FundingApi.md#createFundingPoolUnstakeCancel) | **POST** /v1/funding/pool/unstake/{id}/cancel | Cancel a queued unstake that has not been paid yet.
[**createFundingPoolWaitlist**](FundingApi.md#createFundingPoolWaitlist) | **POST** /v1/funding/pool/waitlist | Join the staker waitlist: told the moment staking into the funding pool opens.
[**createFundingRepay**](FundingApi.md#createFundingRepay) | **POST** /v1/funding/repay | Repay. source \&quot;balance\&quot; (default) takes it from your available Stripe payout balance and applies it at once. source \&quot;card\&quot; returns a PaymentIntent client secret to confirm with Stripe; source \&quot;checkout\&quot; returns checkoutUrl, a hosted Stripe Checkout page the seller pays on (no Stripe SDK needed). source \&quot;cbx\&quot; pays early from your EARNED CBX at the obligation rate (granted and funding CBX never repay a line) and applies at once. Card and checkout apply when the payment succeeds. Never more than you owe; idempotent on idempotencyKey.
[**deleteFundingMember**](FundingApi.md#deleteFundingMember) | **DELETE** /v1/funding/members/{memberUserId} | Remove a team member’s funding limit: they can no longer draw.
[**getFundingControl**](FundingApi.md#getFundingControl) | **GET** /v1/funding/controls | Your funding spend controls: approved uses, supplier allow/block lists, the approval threshold, the two-person rule and each team member’s funding limit.
[**getFundingDraw**](FundingApi.md#getFundingDraw) | **GET** /v1/funding/draws/{id} | One draw: amount, use, supplier, stage and its timeline (requested → approved → disbursed → spent → repaid).
[**getFundingDrawInvoice**](FundingApi.md#getFundingDrawInvoice) | **GET** /v1/funding/draws/{id}/invoice | A 15-minute signed link to a draw&#39;s uploaded supplier invoice, with the file&#39;s name, type and size. 404 when the draw has no uploaded file.
[**getFundingLine**](FundingApi.md#getFundingLine) | **GET** /v1/funding/line | Your line: limit, available, outstanding (principal + interest), APR, interest accrued since the last posting, the payoff figure, next due date, anything overdue, the per-draw schedule and your auto-repay share.
[**getFundingOffer**](FundingApi.md#getFundingOffer) | **GET** /v1/funding/offer | Your pre-qualified Crossly Funding limit and the eligibility checklist: each rule, whether you pass it, and what to do if not. Works with or without a line.
[**getFundingPool**](FundingApi.md#getFundingPool) | **GET** /v1/funding/pool | The Crossly Funding pool: live or not and why (no token yet, no pool, no price, no capacity), capacity, utilisation, the reserve, and the uses and suppliers it allows.
[**getFundingPoolStake**](FundingApi.md#getFundingPoolStake) | **GET** /v1/funding/pool/stake | Your position in the funding pool, the trailing APY reading (never a promise), lockup, unstake queue, history and the risk disclosure.
[**getFundingSpendable**](FundingApi.md#getFundingSpendable) | **GET** /v1/funding/spendable | What your restricted funding CBX can pay right now, in cents, for each Crossly use (shipping labels, Crossly fees, ads, Vault fees). 0 &#x3D; none, or your spend controls refuse that use.
[**getFundingStatement**](FundingApi.md#getFundingStatement) | **GET** /v1/funding/statements | A monthly statement (?month&#x3D;YYYY-MM, default the latest): opening balance, every draw, interest posting and payment, and the closing balance; plus the months available.
[**listFundingApprovals**](FundingApi.md#listFundingApprovals) | **GET** /v1/funding/approvals | Draws your spend controls hold for approval, with the approvals so far and how many are needed.
[**listFundingDraws**](FundingApi.md#listFundingDraws) | **GET** /v1/funding/draws | Every draw on your line: what it paid for (a supplier order, or a Crossly checkout), its APR, estimated fee and due date.
[**listFundingReceipts**](FundingApi.md#listFundingReceipts) | **GET** /v1/funding/receipts | Your funding payments to Crossly, newest first: the use, what it paid for, cents, status (pending, paid, failed) and the draw it was stamped against.
[**listFundingRepayments**](FundingApi.md#listFundingRepayments) | **GET** /v1/funding/repayments | Manual repayments (card / bank, or from your payout balance), newest first.
[**updateFundingAutorepay**](FundingApi.md#updateFundingAutorepay) | **PUT** /v1/funding/autorepay | Set the share of each Crossly payout applied to what you owe: a whole percent from 10 to 100 (default 20). Never more than you owe is taken.
[**updateFundingControl**](FundingApi.md#updateFundingControl) | **PUT** /v1/funding/controls | Change your funding spend controls. Enforced at every spend: wholesale checkout, labels, ads, Crossly and Vault fees.
[**updateFundingMember**](FundingApi.md#updateFundingMember) | **PUT** /v1/funding/members/{memberUserId} | Set a team member’s funding limit (per draw or per month).


<a name="createFundingApply"></a>
# **createFundingApply**
> CreateFundingApplyResponse createFundingApply()

Apply for Crossly Funding. Decided at once on the checklist rules: approved opens your line (limit &#x3D; 25% of 90 days of settled Crossly payouts), declined lists why, needs_review goes to a person.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : CreateFundingApplyResponse = apiInstance.createFundingApply()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingApply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingApply")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFundingApplyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingDraw"></a>
# **createFundingDraw**
> CreateFundingDrawResponse createFundingDraw()

Draw on your line for a supplier order. Send the supplier, the invoice (an uploaded invoiceFileId from POST /v1/funding/invoice-files, a reference, or a URL) and the APR from the quote you accepted (acceptedAprBps); refused if your rate changed. The advance is held as in-platform Crossly balance, never cash. Idempotent on idempotencyKey.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : CreateFundingDrawResponse = apiInstance.createFundingDraw()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingDraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingDraw")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFundingDrawResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingDrawApprove"></a>
# **createFundingDrawApprove**
> CreateFundingDrawRejectResponse createFundingDrawApprove(id)

Approve a held draw. The two-person rule needs two distinct approvers; the requester never approves their own.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateFundingDrawRejectResponse = apiInstance.createFundingDrawApprove(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingDrawApprove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingDrawApprove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateFundingDrawRejectResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingDrawQuote"></a>
# **createFundingDrawQuote**
> CreateFundingDrawQuoteResponse createFundingDrawQuote()

The disclosure for a draw of amountCents: APR, the simple-interest fee for the full term, the total and the due date, plus your available headroom. Nothing is drawn.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : CreateFundingDrawQuoteResponse = apiInstance.createFundingDrawQuote()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingDrawQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingDrawQuote")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFundingDrawQuoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingDrawReject"></a>
# **createFundingDrawReject**
> CreateFundingDrawRejectResponse createFundingDrawReject(id)

Reject a held draw. Nothing was drawn, so nothing is owed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateFundingDrawRejectResponse = apiInstance.createFundingDrawReject(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingDrawReject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingDrawReject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateFundingDrawRejectResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingDrawUse"></a>
# **createFundingDrawUse**
> CreateFundingDrawUseResponse createFundingDrawUse()

Request a draw for an approved use. Refused by the spend controls, held for approval (stage requested — no debt until disbursed), or disbursed at once as restricted funding CBX. A DEBT with interest: show the disclosure first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : CreateFundingDrawUseResponse = apiInstance.createFundingDrawUse()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingDrawUse")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingDrawUse")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFundingDrawUseResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingInvoiceFile"></a>
# **createFundingInvoiceFile**
> CreateFundingInvoiceFileResponse createFundingInvoiceFile()

Sign an upload for a supplier invoice: a PDF or image (application/pdf, image/jpeg, image/png, image/webp, image/heic) of at most 15 MB. PUT the bytes to uploadUrl with the same Content-Type and exactly contentLength bytes, then draw with invoiceFileId &#x3D; file.id. Stored privately; one draw per file.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : CreateFundingInvoiceFileResponse = apiInstance.createFundingInvoiceFile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingInvoiceFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingInvoiceFile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFundingInvoiceFileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingPayCrosslyFee"></a>
# **createFundingPayCrosslyFee**
> CreateFundingPayCrosslyFeeResponse createFundingPayCrosslyFee()

Pay an open invoice of your Crossly plan with restricted funding CBX (no card is charged; the invoice is marked paid). Idempotent per invoice.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : CreateFundingPayCrosslyFeeResponse = apiInstance.createFundingPayCrosslyFee()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingPayCrosslyFee")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingPayCrosslyFee")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFundingPayCrosslyFeeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingPayShippingLabel"></a>
# **createFundingPayShippingLabel**
> CreateFundingPayShippingLabelResponse createFundingPayShippingLabel()

Top up your shipping wallet with restricted funding CBX; labels you buy are then debited from it. Idempotent on idempotencyKey. Refused when the spend controls forbid shipping labels or it is over your approval threshold with no approved draw.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : CreateFundingPayShippingLabelResponse = apiInstance.createFundingPayShippingLabel()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingPayShippingLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingPayShippingLabel")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFundingPayShippingLabelResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingPayVaultFee"></a>
# **createFundingPayVaultFee**
> CreateFundingPayVaultFeeResponse createFundingPayVaultFee()

Ship a stored Vault unit home and pay its fee (shipping, storage owed, early withdrawal) with restricted funding CBX instead of your card.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : CreateFundingPayVaultFeeResponse = apiInstance.createFundingPayVaultFee()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingPayVaultFee")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingPayVaultFee")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFundingPayVaultFeeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingPoolStake"></a>
# **createFundingPoolStake**
> CreateFundingPoolStakeResponse createFundingPoolStake()

Stake earned CBX into the funding pool. Refused, with the reason, until the pool is live and staking is open.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : CreateFundingPoolStakeResponse = apiInstance.createFundingPoolStake()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingPoolStake")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingPoolStake")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFundingPoolStakeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingPoolUnstake"></a>
# **createFundingPoolUnstake**
> FundingPoolResponse createFundingPoolUnstake()

Queue an unstake. Paid first-in first-out once your lockup has passed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : FundingPoolResponse = apiInstance.createFundingPoolUnstake()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingPoolUnstake")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingPoolUnstake")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**FundingPoolResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingPoolUnstakeCancel"></a>
# **createFundingPoolUnstakeCancel**
> FundingPoolResponse createFundingPoolUnstakeCancel(id)

Cancel a queued unstake that has not been paid yet.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : FundingPoolResponse = apiInstance.createFundingPoolUnstakeCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingPoolUnstakeCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingPoolUnstakeCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**FundingPoolResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingPoolWaitlist"></a>
# **createFundingPoolWaitlist**
> FundingPoolResponse createFundingPoolWaitlist()

Join the staker waitlist: told the moment staking into the funding pool opens.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : FundingPoolResponse = apiInstance.createFundingPoolWaitlist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingPoolWaitlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingPoolWaitlist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**FundingPoolResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFundingRepay"></a>
# **createFundingRepay**
> CreateFundingRepayResponse createFundingRepay()

Repay. source \&quot;balance\&quot; (default) takes it from your available Stripe payout balance and applies it at once. source \&quot;card\&quot; returns a PaymentIntent client secret to confirm with Stripe; source \&quot;checkout\&quot; returns checkoutUrl, a hosted Stripe Checkout page the seller pays on (no Stripe SDK needed). source \&quot;cbx\&quot; pays early from your EARNED CBX at the obligation rate (granted and funding CBX never repay a line) and applies at once. Card and checkout apply when the payment succeeds. Never more than you owe; idempotent on idempotencyKey.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : CreateFundingRepayResponse = apiInstance.createFundingRepay()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#createFundingRepay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#createFundingRepay")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateFundingRepayResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFundingMember"></a>
# **deleteFundingMember**
> DeleteFundingMemberResponse deleteFundingMember(memberUserId)

Remove a team member’s funding limit: they can no longer draw.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
val memberUserId : kotlin.String = memberUserId_example // kotlin.String | 
try {
    val result : DeleteFundingMemberResponse = apiInstance.deleteFundingMember(memberUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#deleteFundingMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#deleteFundingMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberUserId** | **kotlin.String**|  |

### Return type

**DeleteFundingMemberResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFundingControl"></a>
# **getFundingControl**
> GetFundingControlResponse getFundingControl()

Your funding spend controls: approved uses, supplier allow/block lists, the approval threshold, the two-person rule and each team member’s funding limit.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : GetFundingControlResponse = apiInstance.getFundingControl()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#getFundingControl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#getFundingControl")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetFundingControlResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFundingDraw"></a>
# **getFundingDraw**
> GetFundingDrawResponse getFundingDraw(id)

One draw: amount, use, supplier, stage and its timeline (requested → approved → disbursed → spent → repaid).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetFundingDrawResponse = apiInstance.getFundingDraw(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#getFundingDraw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#getFundingDraw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetFundingDrawResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFundingDrawInvoice"></a>
# **getFundingDrawInvoice**
> GetFundingDrawInvoiceResponse getFundingDrawInvoice(id)

A 15-minute signed link to a draw&#39;s uploaded supplier invoice, with the file&#39;s name, type and size. 404 when the draw has no uploaded file.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetFundingDrawInvoiceResponse = apiInstance.getFundingDrawInvoice(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#getFundingDrawInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#getFundingDrawInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetFundingDrawInvoiceResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFundingLine"></a>
# **getFundingLine**
> GetFundingLineResponse getFundingLine()

Your line: limit, available, outstanding (principal + interest), APR, interest accrued since the last posting, the payoff figure, next due date, anything overdue, the per-draw schedule and your auto-repay share.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : GetFundingLineResponse = apiInstance.getFundingLine()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#getFundingLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#getFundingLine")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetFundingLineResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFundingOffer"></a>
# **getFundingOffer**
> GetFundingOfferResponse getFundingOffer()

Your pre-qualified Crossly Funding limit and the eligibility checklist: each rule, whether you pass it, and what to do if not. Works with or without a line.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : GetFundingOfferResponse = apiInstance.getFundingOffer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#getFundingOffer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#getFundingOffer")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetFundingOfferResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFundingPool"></a>
# **getFundingPool**
> GetFundingPoolResponse getFundingPool()

The Crossly Funding pool: live or not and why (no token yet, no pool, no price, no capacity), capacity, utilisation, the reserve, and the uses and suppliers it allows.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : GetFundingPoolResponse = apiInstance.getFundingPool()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#getFundingPool")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#getFundingPool")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetFundingPoolResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFundingPoolStake"></a>
# **getFundingPoolStake**
> FundingPoolResponse getFundingPoolStake()

Your position in the funding pool, the trailing APY reading (never a promise), lockup, unstake queue, history and the risk disclosure.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : FundingPoolResponse = apiInstance.getFundingPoolStake()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#getFundingPoolStake")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#getFundingPoolStake")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**FundingPoolResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFundingSpendable"></a>
# **getFundingSpendable**
> GetFundingSpendableResponse getFundingSpendable()

What your restricted funding CBX can pay right now, in cents, for each Crossly use (shipping labels, Crossly fees, ads, Vault fees). 0 &#x3D; none, or your spend controls refuse that use.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : GetFundingSpendableResponse = apiInstance.getFundingSpendable()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#getFundingSpendable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#getFundingSpendable")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetFundingSpendableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFundingStatement"></a>
# **getFundingStatement**
> GetFundingStatementResponse getFundingStatement()

A monthly statement (?month&#x3D;YYYY-MM, default the latest): opening balance, every draw, interest posting and payment, and the closing balance; plus the months available.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : GetFundingStatementResponse = apiInstance.getFundingStatement()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#getFundingStatement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#getFundingStatement")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetFundingStatementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFundingApprovals"></a>
# **listFundingApprovals**
> ListFundingApprovalsResponse listFundingApprovals()

Draws your spend controls hold for approval, with the approvals so far and how many are needed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : ListFundingApprovalsResponse = apiInstance.listFundingApprovals()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#listFundingApprovals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#listFundingApprovals")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListFundingApprovalsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFundingDraws"></a>
# **listFundingDraws**
> ListFundingDrawsResponse listFundingDraws()

Every draw on your line: what it paid for (a supplier order, or a Crossly checkout), its APR, estimated fee and due date.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : ListFundingDrawsResponse = apiInstance.listFundingDraws()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#listFundingDraws")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#listFundingDraws")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListFundingDrawsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFundingReceipts"></a>
# **listFundingReceipts**
> ListFundingReceiptsResponse listFundingReceipts()

Your funding payments to Crossly, newest first: the use, what it paid for, cents, status (pending, paid, failed) and the draw it was stamped against.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : ListFundingReceiptsResponse = apiInstance.listFundingReceipts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#listFundingReceipts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#listFundingReceipts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListFundingReceiptsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFundingRepayments"></a>
# **listFundingRepayments**
> ListFundingRepaymentsResponse listFundingRepayments()

Manual repayments (card / bank, or from your payout balance), newest first.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : ListFundingRepaymentsResponse = apiInstance.listFundingRepayments()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#listFundingRepayments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#listFundingRepayments")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListFundingRepaymentsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFundingAutorepay"></a>
# **updateFundingAutorepay**
> UpdateFundingAutorepayResponse updateFundingAutorepay()

Set the share of each Crossly payout applied to what you owe: a whole percent from 10 to 100 (default 20). Never more than you owe is taken.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : UpdateFundingAutorepayResponse = apiInstance.updateFundingAutorepay()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#updateFundingAutorepay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#updateFundingAutorepay")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateFundingAutorepayResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFundingControl"></a>
# **updateFundingControl**
> UpdateFundingControlResponse updateFundingControl()

Change your funding spend controls. Enforced at every spend: wholesale checkout, labels, ads, Crossly and Vault fees.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
try {
    val result : UpdateFundingControlResponse = apiInstance.updateFundingControl()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#updateFundingControl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#updateFundingControl")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateFundingControlResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFundingMember"></a>
# **updateFundingMember**
> UpdateFundingMemberResponse updateFundingMember(memberUserId)

Set a team member’s funding limit (per draw or per month).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = FundingApi()
val memberUserId : kotlin.String = memberUserId_example // kotlin.String | 
try {
    val result : UpdateFundingMemberResponse = apiInstance.updateFundingMember(memberUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FundingApi#updateFundingMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FundingApi#updateFundingMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberUserId** | **kotlin.String**|  |

### Return type

**UpdateFundingMemberResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

