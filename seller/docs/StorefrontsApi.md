# StorefrontsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStorefront**](StorefrontsApi.md#createStorefront) | **POST** /v1/storefronts | Create a store: name (1-60) and optional slug (3-40 lowercase letters, numbers, hyphens; derived from the name when omitted). Your first store becomes the default.
[**createStorefrontListingMove**](StorefrontsApi.md#createStorefrontListingMove) | **POST** /v1/storefronts/{id}/listings/{platformListingId}/move | Move a Crossly listing (by its platform_listing id) into this store.
[**createStorefrontOnboardingSkip**](StorefrontsApi.md#createStorefrontOnboardingSkip) | **POST** /v1/storefronts/onboarding/skip | Skip (or dismiss) the setup wizard: ensures your default store exists, with a generated name you can rename any time. Idempotent.
[**createStorefrontOnboardingSuggest**](StorefrontsApi.md#createStorefrontOnboardingSuggest) | **POST** /v1/storefronts/onboarding/suggest | Suggest another generated store name with a free matching slug.
[**createStorefrontPolicyFromTerm**](StorefrontsApi.md#createStorefrontPolicyFromTerm) | **POST** /v1/storefronts/{id}/policies/from-terms | Create a policy preset from this store&#39;s current terms (body: { kind: &#39;shipping&#39; | &#39;return&#39; | &#39;payment&#39; }) and assign it to the store. Returns { preset, policies }.
[**createStorefrontPolicyUseShared**](StorefrontsApi.md#createStorefrontPolicyUseShared) | **POST** /v1/storefronts/{id}/policies/use-shared | Make a store use your shared policies: a non-default store drops its own return/shipping/payment policy copies and shows your default policies from then on. No change on the default store. Returns the store settings (policySource per kind, usesOwnPolicy).
[**createStorefrontPublish**](StorefrontsApi.md#createStorefrontPublish) | **POST** /v1/storefronts/{id}/publish | Flip a store live. Fails with storefront_requirements_missing (and the missing list) when ship-from, shipping policy, return policy or payouts are not set.
[**createStorefrontSectionById**](StorefrontsApi.md#createStorefrontSectionById) | **POST** /v1/storefronts/{id}/sections | Add a section to a store (kind hero | listings | collections | about | policies | social | announcement | faq | creations).
[**deleteStorefront**](StorefrontsApi.md#deleteStorefront) | **DELETE** /v1/storefronts/{id} | Archive a store. If it was the default, your oldest remaining store becomes the default.
[**deleteStorefrontSectionBySectionId**](StorefrontsApi.md#deleteStorefrontSectionBySectionId) | **DELETE** /v1/storefronts/{id}/sections/{sectionId} | Remove a section from a store. Listings on a removed shelf stay live.
[**deleteStorefrontTeamAccess**](StorefrontsApi.md#deleteStorefrontTeamAccess) | **DELETE** /v1/storefronts/team-access | Revoke a team member&#39;s access to one store (or their all-stores grant).
[**getHubSetup**](StorefrontsApi.md#getHubSetup) | **GET** /v1/hub/setup/{section} | A Hub section&#39;s setup checklist: each step, whether it is done and the page that completes it. Derived from what exists, never stored.
[**getStorefrontById**](StorefrontsApi.md#getStorefrontById) | **GET** /v1/storefronts/{id} | One store: name, slug, status (draft|live|paused|archived), isDefault, nameAuto, onboardedAt.
[**getStorefrontOnboarding**](StorefrontsApi.md#getStorefrontOnboarding) | **GET** /v1/storefronts/onboarding | Crossly Shop setup state: whether you have a store, the generated name/slug a skip would use, each optional step and whether it is done, the listing-gate requirements, payouts readiness and the public URL once live.
[**getStorefrontPolicy**](StorefrontsApi.md#getStorefrontPolicy) | **GET** /v1/storefronts/{id}/policies | A store&#39;s policies: per kind (shipping, return, payment) the preset the store picked (presetId, null &#x3D; your default) and what the store resolves to (resolvedPresetId, resolvedPresetName, level: store | seller_default | legacy | default, body).
[**getStorefrontRequirement**](StorefrontsApi.md#getStorefrontRequirement) | **GET** /v1/storefronts/{id}/requirements | What this store still needs before a NEW Crossly listing can publish into it: ship_from, shipping_policy, return_policy, payouts — with where to fix each.
[**getStorefrontSetting**](StorefrontsApi.md#getStorefrontSetting) | **GET** /v1/storefronts/{id}/settings | A store&#39;s settings: design (banner, logo, theme, SEO, social, published), ship-from, return address, policies (storePolicies: the store&#39;s preset picks + what each kind resolves to), custom-order flag, featured listings, bundle discount, custom domain. DEPRECATED aliases, resolved through the policy cascade: offersFreeShipping, freeShippingThresholdCents, offersLocalPickup, localCourierEnabled, acceptsLayaway, sellerProtections, requestArrivalCondition, arrivalConditionWindowHours — use /v1/storefronts/:id/policies and the preset fields.
[**getStorefrontSlugAvailable**](StorefrontsApi.md#getStorefrontSlugAvailable) | **GET** /v1/storefronts/slug-available | Is this store slug free? Checks shape, reserved words, current slugs and retired ones.
[**listStorefrontSectionsById**](StorefrontsApi.md#listStorefrontSectionsById) | **GET** /v1/storefronts/{id}/sections | A store&#39;s sections in display order.
[**listStorefrontTeamAccess**](StorefrontsApi.md#listStorefrontTeamAccess) | **GET** /v1/storefronts/team-access | Every active per-store grant you have made to team members (storefrontId null &#x3D; all stores).
[**listStorefronts**](StorefrontsApi.md#listStorefronts) | **GET** /v1/storefronts | Your stores (default first). includeArchived&#x3D;true adds archived ones.
[**updateStorefrontById**](StorefrontsApi.md#updateStorefrontById) | **PATCH** /v1/storefronts/{id} | Rename a store. Never changes the slug or your @handle.
[**updateStorefrontDefault**](StorefrontsApi.md#updateStorefrontDefault) | **PUT** /v1/storefronts/{id}/default | Make this store your default (where a Crossly publish with no storefrontId lands).
[**updateStorefrontPolicy**](StorefrontsApi.md#updateStorefrontPolicy) | **PUT** /v1/storefronts/{id}/policies | Set a store&#39;s policies: shippingPresetId, returnPresetId, paymentPresetId (a policy preset of that kind you own, or null for your default). Omitted &#x3D; unchanged. Listings in the store with no preset of their own follow these.
[**updateStorefrontSectionBySectionId**](StorefrontsApi.md#updateStorefrontSectionBySectionId) | **PATCH** /v1/storefronts/{id}/sections/{sectionId} | Rename, show/hide, refill (listings shelves) or reconfigure one section of a store.
[**updateStorefrontSectionReorderById**](StorefrontsApi.md#updateStorefrontSectionReorderById) | **PUT** /v1/storefronts/{id}/sections/reorder | Set a store&#39;s section order in one atomic call: every section id, top to bottom.
[**updateStorefrontSetting**](StorefrontsApi.md#updateStorefrontSetting) | **PUT** /v1/storefronts/{id}/settings | Update a store&#39;s settings. Omitted fields are unchanged, null clears. Policies replace wholesale. shippingPresetId / returnPresetId / paymentPresetId pick the store&#39;s presets. The checkout-term fields (offersFreeShipping … arrivalConditionWindowHours) are DEPRECATED aliases: they are written into the store&#39;s preset.
[**updateStorefrontSlug**](StorefrontsApi.md#updateStorefrontSlug) | **PUT** /v1/storefronts/{id}/slug | Change a store&#39;s slug. The old slug keeps redirecting to the store.
[**updateStorefrontStatus**](StorefrontsApi.md#updateStorefrontStatus) | **PUT** /v1/storefronts/{id}/status | Set a store&#39;s status: draft | live | paused | archived. A live store is public once it has a live listing.
[**updateStorefrontTeamAccess**](StorefrontsApi.md#updateStorefrontTeamAccess) | **PUT** /v1/storefronts/team-access | Grant (or replace) a team member&#39;s access to one store, or to every store (storefrontId null), with scopes.


<a name="createStorefront"></a>
# **createStorefront**
> StorefrontResponse createStorefront()

Create a store: name (1-60) and optional slug (3-40 lowercase letters, numbers, hyphens; derived from the name when omitted). Your first store becomes the default.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
try {
    val result : StorefrontResponse = apiInstance.createStorefront()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#createStorefront")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#createStorefront")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontListingMove"></a>
# **createStorefrontListingMove**
> OkResponse createStorefrontListingMove(id, platformListingId)

Move a Crossly listing (by its platform_listing id) into this store.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
val platformListingId : kotlin.String = platformListingId_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.createStorefrontListingMove(id, platformListingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#createStorefrontListingMove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#createStorefrontListingMove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **platformListingId** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontOnboardingSkip"></a>
# **createStorefrontOnboardingSkip**
> StorefrontResponse createStorefrontOnboardingSkip()

Skip (or dismiss) the setup wizard: ensures your default store exists, with a generated name you can rename any time. Idempotent.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
try {
    val result : StorefrontResponse = apiInstance.createStorefrontOnboardingSkip()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#createStorefrontOnboardingSkip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#createStorefrontOnboardingSkip")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontOnboardingSuggest"></a>
# **createStorefrontOnboardingSuggest**
> CreateStorefrontOnboardingSuggestResponse createStorefrontOnboardingSuggest()

Suggest another generated store name with a free matching slug.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
try {
    val result : CreateStorefrontOnboardingSuggestResponse = apiInstance.createStorefrontOnboardingSuggest()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#createStorefrontOnboardingSuggest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#createStorefrontOnboardingSuggest")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontOnboardingSuggestResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontPolicyFromTerm"></a>
# **createStorefrontPolicyFromTerm**
> CreateStorefrontPolicyFromTermResponse createStorefrontPolicyFromTerm(id)

Create a policy preset from this store&#39;s current terms (body: { kind: &#39;shipping&#39; | &#39;return&#39; | &#39;payment&#39; }) and assign it to the store. Returns { preset, policies }.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : CreateStorefrontPolicyFromTermResponse = apiInstance.createStorefrontPolicyFromTerm(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#createStorefrontPolicyFromTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#createStorefrontPolicyFromTerm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**CreateStorefrontPolicyFromTermResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontPolicyUseShared"></a>
# **createStorefrontPolicyUseShared**
> UpdateStorefrontSettingResponse createStorefrontPolicyUseShared(id)

Make a store use your shared policies: a non-default store drops its own return/shipping/payment policy copies and shows your default policies from then on. No change on the default store. Returns the store settings (policySource per kind, usesOwnPolicy).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateStorefrontSettingResponse = apiInstance.createStorefrontPolicyUseShared(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#createStorefrontPolicyUseShared")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#createStorefrontPolicyUseShared")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateStorefrontSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontPublish"></a>
# **createStorefrontPublish**
> StorefrontResponse createStorefrontPublish(id)

Flip a store live. Fails with storefront_requirements_missing (and the missing list) when ship-from, shipping policy, return policy or payouts are not set.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontResponse = apiInstance.createStorefrontPublish(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#createStorefrontPublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#createStorefrontPublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStorefrontSectionById"></a>
# **createStorefrontSectionById**
> StorefrontSectionResponse createStorefrontSectionById(id)

Add a section to a store (kind hero | listings | collections | about | policies | social | announcement | faq | creations).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontSectionResponse = apiInstance.createStorefrontSectionById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#createStorefrontSectionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#createStorefrontSectionById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontSectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteStorefront"></a>
# **deleteStorefront**
> StorefrontResponse deleteStorefront(id)

Archive a store. If it was the default, your oldest remaining store becomes the default.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontResponse = apiInstance.deleteStorefront(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#deleteStorefront")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#deleteStorefront")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteStorefrontSectionBySectionId"></a>
# **deleteStorefrontSectionBySectionId**
> OkResponse deleteStorefrontSectionBySectionId(id, sectionId)

Remove a section from a store. Listings on a removed shelf stay live.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
val sectionId : kotlin.String = sectionId_example // kotlin.String | 
try {
    val result : OkResponse = apiInstance.deleteStorefrontSectionBySectionId(id, sectionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#deleteStorefrontSectionBySectionId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#deleteStorefrontSectionBySectionId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **sectionId** | **kotlin.String**|  |

### Return type

**OkResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteStorefrontTeamAccess"></a>
# **deleteStorefrontTeamAccess**
> OkResponse deleteStorefrontTeamAccess()

Revoke a team member&#39;s access to one store (or their all-stores grant).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
try {
    val result : OkResponse = apiInstance.deleteStorefrontTeamAccess()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#deleteStorefrontTeamAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#deleteStorefrontTeamAccess")
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

<a name="getHubSetup"></a>
# **getHubSetup**
> GetHubSetupResponse getHubSetup(section)

A Hub section&#39;s setup checklist: each step, whether it is done and the page that completes it. Derived from what exists, never stored.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val section : kotlin.String = section_example // kotlin.String | 
try {
    val result : GetHubSetupResponse = apiInstance.getHubSetup(section)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#getHubSetup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#getHubSetup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **section** | **kotlin.String**|  | [enum: storefront, wholesale, ads, rentals, funding, world, vault, discounts, branding, drops, events, market, payouts]

### Return type

**GetHubSetupResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontById"></a>
# **getStorefrontById**
> StorefrontResponse getStorefrontById(id)

One store: name, slug, status (draft|live|paused|archived), isDefault, nameAuto, onboardedAt.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontResponse = apiInstance.getStorefrontById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#getStorefrontById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#getStorefrontById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontOnboarding"></a>
# **getStorefrontOnboarding**
> GetStorefrontOnboardingResponse getStorefrontOnboarding()

Crossly Shop setup state: whether you have a store, the generated name/slug a skip would use, each optional step and whether it is done, the listing-gate requirements, payouts readiness and the public URL once live.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
try {
    val result : GetStorefrontOnboardingResponse = apiInstance.getStorefrontOnboarding()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#getStorefrontOnboarding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#getStorefrontOnboarding")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontOnboardingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontPolicy"></a>
# **getStorefrontPolicy**
> GetStorefrontPolicyResponse getStorefrontPolicy(id)

A store&#39;s policies: per kind (shipping, return, payment) the preset the store picked (presetId, null &#x3D; your default) and what the store resolves to (resolvedPresetId, resolvedPresetName, level: store | seller_default | legacy | default, body).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetStorefrontPolicyResponse = apiInstance.getStorefrontPolicy(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#getStorefrontPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#getStorefrontPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetStorefrontPolicyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontRequirement"></a>
# **getStorefrontRequirement**
> GetStorefrontRequirementResponse getStorefrontRequirement(id)

What this store still needs before a NEW Crossly listing can publish into it: ship_from, shipping_policy, return_policy, payouts — with where to fix each.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetStorefrontRequirementResponse = apiInstance.getStorefrontRequirement(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#getStorefrontRequirement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#getStorefrontRequirement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetStorefrontRequirementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontSetting"></a>
# **getStorefrontSetting**
> GetStorefrontSettingResponse getStorefrontSetting(id)

A store&#39;s settings: design (banner, logo, theme, SEO, social, published), ship-from, return address, policies (storePolicies: the store&#39;s preset picks + what each kind resolves to), custom-order flag, featured listings, bundle discount, custom domain. DEPRECATED aliases, resolved through the policy cascade: offersFreeShipping, freeShippingThresholdCents, offersLocalPickup, localCourierEnabled, acceptsLayaway, sellerProtections, requestArrivalCondition, arrivalConditionWindowHours — use /v1/storefronts/:id/policies and the preset fields.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetStorefrontSettingResponse = apiInstance.getStorefrontSetting(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#getStorefrontSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#getStorefrontSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetStorefrontSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStorefrontSlugAvailable"></a>
# **getStorefrontSlugAvailable**
> GetStorefrontSlugAvailableResponse getStorefrontSlugAvailable()

Is this store slug free? Checks shape, reserved words, current slugs and retired ones.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
try {
    val result : GetStorefrontSlugAvailableResponse = apiInstance.getStorefrontSlugAvailable()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#getStorefrontSlugAvailable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#getStorefrontSlugAvailable")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontSlugAvailableResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStorefrontSectionsById"></a>
# **listStorefrontSectionsById**
> StorefrontResponse4 listStorefrontSectionsById(id)

A store&#39;s sections in display order.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontResponse4 = apiInstance.listStorefrontSectionsById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#listStorefrontSectionsById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#listStorefrontSectionsById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontResponse4**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStorefrontTeamAccess"></a>
# **listStorefrontTeamAccess**
> ListStorefrontTeamAccessResponse listStorefrontTeamAccess()

Every active per-store grant you have made to team members (storefrontId null &#x3D; all stores).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
try {
    val result : ListStorefrontTeamAccessResponse = apiInstance.listStorefrontTeamAccess()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#listStorefrontTeamAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#listStorefrontTeamAccess")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStorefrontTeamAccessResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStorefronts"></a>
# **listStorefronts**
> ListStorefrontsResponse listStorefronts()

Your stores (default first). includeArchived&#x3D;true adds archived ones.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
try {
    val result : ListStorefrontsResponse = apiInstance.listStorefronts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#listStorefronts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#listStorefronts")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStorefrontsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontById"></a>
# **updateStorefrontById**
> StorefrontResponse updateStorefrontById(id)

Rename a store. Never changes the slug or your @handle.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontResponse = apiInstance.updateStorefrontById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#updateStorefrontById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#updateStorefrontById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontDefault"></a>
# **updateStorefrontDefault**
> StorefrontResponse updateStorefrontDefault(id)

Make this store your default (where a Crossly publish with no storefrontId lands).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontResponse = apiInstance.updateStorefrontDefault(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#updateStorefrontDefault")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#updateStorefrontDefault")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontPolicy"></a>
# **updateStorefrontPolicy**
> GetStorefrontPolicyResponse updateStorefrontPolicy(id)

Set a store&#39;s policies: shippingPresetId, returnPresetId, paymentPresetId (a policy preset of that kind you own, or null for your default). Omitted &#x3D; unchanged. Listings in the store with no preset of their own follow these.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : GetStorefrontPolicyResponse = apiInstance.updateStorefrontPolicy(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#updateStorefrontPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#updateStorefrontPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**GetStorefrontPolicyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontSectionBySectionId"></a>
# **updateStorefrontSectionBySectionId**
> StorefrontSectionResponse updateStorefrontSectionBySectionId(id, sectionId)

Rename, show/hide, refill (listings shelves) or reconfigure one section of a store.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
val sectionId : kotlin.String = sectionId_example // kotlin.String | 
try {
    val result : StorefrontSectionResponse = apiInstance.updateStorefrontSectionBySectionId(id, sectionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#updateStorefrontSectionBySectionId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#updateStorefrontSectionBySectionId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **sectionId** | **kotlin.String**|  |

### Return type

**StorefrontSectionResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontSectionReorderById"></a>
# **updateStorefrontSectionReorderById**
> StorefrontResponse4 updateStorefrontSectionReorderById(id)

Set a store&#39;s section order in one atomic call: every section id, top to bottom.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontResponse4 = apiInstance.updateStorefrontSectionReorderById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#updateStorefrontSectionReorderById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#updateStorefrontSectionReorderById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontResponse4**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontSetting"></a>
# **updateStorefrontSetting**
> UpdateStorefrontSettingResponse updateStorefrontSetting(id)

Update a store&#39;s settings. Omitted fields are unchanged, null clears. Policies replace wholesale. shippingPresetId / returnPresetId / paymentPresetId pick the store&#39;s presets. The checkout-term fields (offersFreeShipping … arrivalConditionWindowHours) are DEPRECATED aliases: they are written into the store&#39;s preset.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : UpdateStorefrontSettingResponse = apiInstance.updateStorefrontSetting(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#updateStorefrontSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#updateStorefrontSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**UpdateStorefrontSettingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontSlug"></a>
# **updateStorefrontSlug**
> StorefrontResponse updateStorefrontSlug(id)

Change a store&#39;s slug. The old slug keeps redirecting to the store.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontResponse = apiInstance.updateStorefrontSlug(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#updateStorefrontSlug")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#updateStorefrontSlug")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontStatus"></a>
# **updateStorefrontStatus**
> StorefrontResponse updateStorefrontStatus(id)

Set a store&#39;s status: draft | live | paused | archived. A live store is public once it has a live listing.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : StorefrontResponse = apiInstance.updateStorefrontStatus(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#updateStorefrontStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#updateStorefrontStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

**StorefrontResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStorefrontTeamAccess"></a>
# **updateStorefrontTeamAccess**
> OkResponse updateStorefrontTeamAccess()

Grant (or replace) a team member&#39;s access to one store, or to every store (storefrontId null), with scopes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = StorefrontsApi()
try {
    val result : OkResponse = apiInstance.updateStorefrontTeamAccess()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorefrontsApi#updateStorefrontTeamAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorefrontsApi#updateStorefrontTeamAccess")
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

