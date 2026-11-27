# CustomersApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerBulkDelete**](CustomersApi.md#createCustomerBulkDelete) | **POST** /v1/customers/bulk-delete | Bulk blocklist customer handles.
[**createCustomerBulkExport**](CustomersApi.md#createCustomerBulkExport) | **POST** /v1/customers/bulk-export | Bulk export aggregated customers as CSV.
[**createCustomerRefreshProfile**](CustomersApi.md#createCustomerRefreshProfile) | **POST** /v1/customers/{handle}/refresh-profile | Queue a fresh read of a customer&#39;s buyer profiles on every platform they ordered on.
[**createLoyaltyAirdropCancel**](CustomersApi.md#createLoyaltyAirdropCancel) | **POST** /v1/loyalty/airdrops/{id}/cancel | Cancel a queued or failed airdrop (one already sent is the member’s).
[**createLoyaltyAirdropCheck**](CustomersApi.md#createLoyaltyAirdropCheck) | **POST** /v1/loyalty/airdrops/{id}/check | Read a submitted airdrop’s receipt again now.
[**createLoyaltyAirdropPrepare**](CustomersApi.md#createLoyaltyAirdropPrepare) | **POST** /v1/loyalty/airdrops/{id}/prepare | The mint transaction for your launch owner wallet to send: chain, from, to (your launch contract) and calldata, to the member’s verified wallet. Refused airdrop_not_sendable with a reason when it cannot be built.
[**createLoyaltyAirdropSubmit**](CustomersApi.md#createLoyaltyAirdropSubmit) | **POST** /v1/loyalty/airdrops/{id}/submit | Record the hash your wallet broadcast; Crossly reads the receipt (now, then on a schedule) and marks it sent or failed.
[**createLoyaltyProgramInvite**](CustomersApi.md#createLoyaltyProgramInvite) | **POST** /v1/loyalty/program/invite | Invite Crossly buyers to your loyalty program by user id (up to 500); returns how many were newly invited.
[**createLoyaltyProgramMemberOverride**](CustomersApi.md#createLoyaltyProgramMemberOverride) | **POST** /v1/loyalty/program/members/{id}/override | Pin a member to a tier (tierId null clears the pin), with a reason.
[**createLoyaltyTier**](CustomersApi.md#createLoyaltyTier) | **POST** /v1/loyalty/tiers | Add a tier: name, look, threshold and typed perks (% off, free shipping, early access, members-only listings, wholesale access, token gates, airdrops, Bucks, World items, event tickets, …).
[**deleteLoyaltyTier**](CustomersApi.md#deleteLoyaltyTier) | **DELETE** /v1/loyalty/tiers/{id} | Delete a tier; its members are re-evaluated.
[**getCustomer**](CustomersApi.md#getCustomer) | **GET** /v1/customers/{handle} | Get one customer: recent 50 orders, buyer profiles per platform, and stats over all of their orders.
[**getCustomerNote**](CustomersApi.md#getCustomerNote) | **GET** /v1/customers/{handle}/notes | Your private notes on a customer (empty when none). Works before their first order.
[**getLoyaltyAirdrop**](CustomersApi.md#getLoyaltyAirdrop) | **GET** /v1/loyalty/airdrops/{id} | One loyalty NFT airdrop: member, collection, recipient wallet, transaction hash and status.
[**getLoyaltyClub**](CustomersApi.md#getLoyaltyClub) | **GET** /v1/loyalty/club | Your loyalty club: tiers and how many members are in each.
[**getLoyaltyProgram**](CustomersApi.md#getLoyaltyProgram) | **GET** /v1/loyalty/program | Your loyalty program: qualification (spend, orders, points), window, joining, downgrade and grace, and its tiers with typed perks.
[**getLoyaltyProgramMember**](CustomersApi.md#getLoyaltyProgramMember) | **GET** /v1/loyalty/program/members/{id} | One member: standing, tier, progress, perks held, history and any override.
[**listCustomers**](CustomersApi.md#listCustomers) | **GET** /v1/customers | List aggregated customers (group-by lower(buyer_username)), each with its best avatar, display name and star rating.
[**listLoyaltyAirdrops**](CustomersApi.md#listLoyaltyAirdrops) | **GET** /v1/loyalty/airdrops | NFT airdrops your loyalty tiers earned members: queued to send, submitted (waiting on the receipt), sent, failed (with why) or cancelled.
[**listLoyaltyMembers**](CustomersApi.md#listLoyaltyMembers) | **GET** /v1/loyalty/members | Your loyalty club’s members, by spend with you.
[**listLoyaltyProgramInviteCandidates**](CustomersApi.md#listLoyaltyProgramInviteCandidates) | **GET** /v1/loyalty/program/invite-candidates | Crossly buyers who bought from you and are not loyalty members yet (q searches by name): who you can invite.
[**listLoyaltyProgramMembers**](CustomersApi.md#listLoyaltyProgramMembers) | **GET** /v1/loyalty/program/members | Your loyalty members with tier, standing, grace and overrides; search, tier, status and sort filters.
[**updateCustomerNote**](CustomersApi.md#updateCustomerNote) | **PUT** /v1/customers/{handle}/notes | Save your private notes on a customer (an empty string clears them).
[**updateLoyaltyClub**](CustomersApi.md#updateLoyaltyClub) | **PUT** /v1/loyalty/club | Create or update your loyalty club: name, on/off, and up to 6 spend tiers each with a discount (≤ 30%) and perks.
[**updateLoyaltyProgram**](CustomersApi.md#updateLoyaltyProgram) | **PUT** /v1/loyalty/program | Create or update your loyalty program settings.
[**updateLoyaltyTier**](CustomersApi.md#updateLoyaltyTier) | **PUT** /v1/loyalty/tiers/{id} | Replace a tier. Members holding it get the edited perks.


<a name="createCustomerBulkDelete"></a>
# **createCustomerBulkDelete**
> CreateCustomerBulkDeleteResponse createCustomerBulkDelete()

Bulk blocklist customer handles.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : CreateCustomerBulkDeleteResponse = apiInstance.createCustomerBulkDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createCustomerBulkDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createCustomerBulkDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateCustomerBulkDeleteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCustomerBulkExport"></a>
# **createCustomerBulkExport**
> kotlin.String createCustomerBulkExport()

Bulk export aggregated customers as CSV.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : kotlin.String = apiInstance.createCustomerBulkExport()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createCustomerBulkExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createCustomerBulkExport")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCustomerRefreshProfile"></a>
# **createCustomerRefreshProfile**
> CreateCustomerRefreshProfileResponse createCustomerRefreshProfile(handle)

Queue a fresh read of a customer&#39;s buyer profiles on every platform they ordered on.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : CreateCustomerRefreshProfileResponse = apiInstance.createCustomerRefreshProfile(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createCustomerRefreshProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createCustomerRefreshProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**CreateCustomerRefreshProfileResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLoyaltyAirdropCancel"></a>
# **createLoyaltyAirdropCancel**
> LoyaltyAirdropResponse createLoyaltyAirdropCancel(id)

Cancel a queued or failed airdrop (one already sent is the member’s).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : LoyaltyAirdropResponse = apiInstance.createLoyaltyAirdropCancel(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createLoyaltyAirdropCancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createLoyaltyAirdropCancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**LoyaltyAirdropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLoyaltyAirdropCheck"></a>
# **createLoyaltyAirdropCheck**
> LoyaltyAirdropResponse createLoyaltyAirdropCheck(id)

Read a submitted airdrop’s receipt again now.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : LoyaltyAirdropResponse = apiInstance.createLoyaltyAirdropCheck(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createLoyaltyAirdropCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createLoyaltyAirdropCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**LoyaltyAirdropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLoyaltyAirdropPrepare"></a>
# **createLoyaltyAirdropPrepare**
> CreateLoyaltyAirdropPrepareResponse createLoyaltyAirdropPrepare(id)

The mint transaction for your launch owner wallet to send: chain, from, to (your launch contract) and calldata, to the member’s verified wallet. Refused airdrop_not_sendable with a reason when it cannot be built.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateLoyaltyAirdropPrepareResponse = apiInstance.createLoyaltyAirdropPrepare(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createLoyaltyAirdropPrepare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createLoyaltyAirdropPrepare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateLoyaltyAirdropPrepareResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLoyaltyAirdropSubmit"></a>
# **createLoyaltyAirdropSubmit**
> LoyaltyAirdropResponse createLoyaltyAirdropSubmit(id)

Record the hash your wallet broadcast; Crossly reads the receipt (now, then on a schedule) and marks it sent or failed.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : LoyaltyAirdropResponse = apiInstance.createLoyaltyAirdropSubmit(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createLoyaltyAirdropSubmit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createLoyaltyAirdropSubmit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**LoyaltyAirdropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLoyaltyProgramInvite"></a>
# **createLoyaltyProgramInvite**
> CreateLoyaltyProgramInviteResponse createLoyaltyProgramInvite()

Invite Crossly buyers to your loyalty program by user id (up to 500); returns how many were newly invited.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : CreateLoyaltyProgramInviteResponse = apiInstance.createLoyaltyProgramInvite()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createLoyaltyProgramInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createLoyaltyProgramInvite")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateLoyaltyProgramInviteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLoyaltyProgramMemberOverride"></a>
# **createLoyaltyProgramMemberOverride**
> GetLoyaltyProgramMemberResponse createLoyaltyProgramMemberOverride(id)

Pin a member to a tier (tierId null clears the pin), with a reason.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetLoyaltyProgramMemberResponse = apiInstance.createLoyaltyProgramMemberOverride(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createLoyaltyProgramMemberOverride")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createLoyaltyProgramMemberOverride")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetLoyaltyProgramMemberResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLoyaltyTier"></a>
# **createLoyaltyTier**
> CreateLoyaltyTierResponse createLoyaltyTier()

Add a tier: name, look, threshold and typed perks (% off, free shipping, early access, members-only listings, wholesale access, token gates, airdrops, Bucks, World items, event tickets, …).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : CreateLoyaltyTierResponse = apiInstance.createLoyaltyTier()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createLoyaltyTier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createLoyaltyTier")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateLoyaltyTierResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteLoyaltyTier"></a>
# **deleteLoyaltyTier**
> UpdateGroupBuyResponse deleteLoyaltyTier(id)

Delete a tier; its members are re-evaluated.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateGroupBuyResponse = apiInstance.deleteLoyaltyTier(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#deleteLoyaltyTier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#deleteLoyaltyTier")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomer"></a>
# **getCustomer**
> GetCustomerResponse getCustomer(handle)

Get one customer: recent 50 orders, buyer profiles per platform, and stats over all of their orders.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : GetCustomerResponse = apiInstance.getCustomer(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getCustomer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**GetCustomerResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerNote"></a>
# **getCustomerNote**
> GetCustomerNoteResponse getCustomerNote(handle)

Your private notes on a customer (empty when none). Works before their first order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val handle : kotlin.String = handle_example // kotlin.String | 
try {
    val result : GetCustomerNoteResponse = apiInstance.getCustomerNote(handle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getCustomerNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getCustomerNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |

### Return type

**GetCustomerNoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoyaltyAirdrop"></a>
# **getLoyaltyAirdrop**
> LoyaltyAirdropResponse getLoyaltyAirdrop(id)

One loyalty NFT airdrop: member, collection, recipient wallet, transaction hash and status.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : LoyaltyAirdropResponse = apiInstance.getLoyaltyAirdrop(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getLoyaltyAirdrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getLoyaltyAirdrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**LoyaltyAirdropResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoyaltyClub"></a>
# **getLoyaltyClub**
> GetLoyaltyClubResponse getLoyaltyClub()

Your loyalty club: tiers and how many members are in each.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : GetLoyaltyClubResponse = apiInstance.getLoyaltyClub()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getLoyaltyClub")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getLoyaltyClub")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetLoyaltyClubResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoyaltyProgram"></a>
# **getLoyaltyProgram**
> GetLoyaltyProgramResponse getLoyaltyProgram()

Your loyalty program: qualification (spend, orders, points), window, joining, downgrade and grace, and its tiers with typed perks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : GetLoyaltyProgramResponse = apiInstance.getLoyaltyProgram()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getLoyaltyProgram")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getLoyaltyProgram")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetLoyaltyProgramResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoyaltyProgramMember"></a>
# **getLoyaltyProgramMember**
> GetLoyaltyProgramMemberResponse getLoyaltyProgramMember(id)

One member: standing, tier, progress, perks held, history and any override.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetLoyaltyProgramMemberResponse = apiInstance.getLoyaltyProgramMember(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getLoyaltyProgramMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getLoyaltyProgramMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetLoyaltyProgramMemberResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCustomers"></a>
# **listCustomers**
> ListCustomersResponse listCustomers()

List aggregated customers (group-by lower(buyer_username)), each with its best avatar, display name and star rating.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : ListCustomersResponse = apiInstance.listCustomers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#listCustomers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#listCustomers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListCustomersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoyaltyAirdrops"></a>
# **listLoyaltyAirdrops**
> ListLoyaltyAirdropsResponse listLoyaltyAirdrops()

NFT airdrops your loyalty tiers earned members: queued to send, submitted (waiting on the receipt), sent, failed (with why) or cancelled.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : ListLoyaltyAirdropsResponse = apiInstance.listLoyaltyAirdrops()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#listLoyaltyAirdrops")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#listLoyaltyAirdrops")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListLoyaltyAirdropsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoyaltyMembers"></a>
# **listLoyaltyMembers**
> ListLoyaltyMembersResponse listLoyaltyMembers()

Your loyalty club’s members, by spend with you.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : ListLoyaltyMembersResponse = apiInstance.listLoyaltyMembers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#listLoyaltyMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#listLoyaltyMembers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListLoyaltyMembersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoyaltyProgramInviteCandidates"></a>
# **listLoyaltyProgramInviteCandidates**
> ListLoyaltyProgramInviteCandidatesResponse listLoyaltyProgramInviteCandidates()

Crossly buyers who bought from you and are not loyalty members yet (q searches by name): who you can invite.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : ListLoyaltyProgramInviteCandidatesResponse = apiInstance.listLoyaltyProgramInviteCandidates()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#listLoyaltyProgramInviteCandidates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#listLoyaltyProgramInviteCandidates")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListLoyaltyProgramInviteCandidatesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoyaltyProgramMembers"></a>
# **listLoyaltyProgramMembers**
> ListLoyaltyProgramMembersResponse listLoyaltyProgramMembers()

Your loyalty members with tier, standing, grace and overrides; search, tier, status and sort filters.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : ListLoyaltyProgramMembersResponse = apiInstance.listLoyaltyProgramMembers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#listLoyaltyProgramMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#listLoyaltyProgramMembers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListLoyaltyProgramMembersResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomerNote"></a>
# **updateCustomerNote**
> GetCustomerNoteResponse updateCustomerNote(handle, updateCustomerNoteRequest)

Save your private notes on a customer (an empty string clears them).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val handle : kotlin.String = handle_example // kotlin.String | 
val updateCustomerNoteRequest : UpdateCustomerNoteRequest =  // UpdateCustomerNoteRequest | 
try {
    val result : GetCustomerNoteResponse = apiInstance.updateCustomerNote(handle, updateCustomerNoteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#updateCustomerNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#updateCustomerNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handle** | **kotlin.String**|  |
 **updateCustomerNoteRequest** | **UpdateCustomerNoteRequest**|  |

### Return type

**GetCustomerNoteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoyaltyClub"></a>
# **updateLoyaltyClub**
> GetLoyaltyClubResponse updateLoyaltyClub()

Create or update your loyalty club: name, on/off, and up to 6 spend tiers each with a discount (≤ 30%) and perks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : GetLoyaltyClubResponse = apiInstance.updateLoyaltyClub()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#updateLoyaltyClub")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#updateLoyaltyClub")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetLoyaltyClubResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLoyaltyProgram"></a>
# **updateLoyaltyProgram**
> UpdateLoyaltyProgramResponse updateLoyaltyProgram()

Create or update your loyalty program settings.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
try {
    val result : UpdateLoyaltyProgramResponse = apiInstance.updateLoyaltyProgram()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#updateLoyaltyProgram")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#updateLoyaltyProgram")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateLoyaltyProgramResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLoyaltyTier"></a>
# **updateLoyaltyTier**
> CreateLoyaltyTierResponse updateLoyaltyTier(id)

Replace a tier. Members holding it get the edited perks.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = CustomersApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateLoyaltyTierResponse = apiInstance.updateLoyaltyTier(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#updateLoyaltyTier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#updateLoyaltyTier")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateLoyaltyTierResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

