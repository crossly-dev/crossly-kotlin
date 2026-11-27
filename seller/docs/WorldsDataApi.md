# WorldsDataApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceDatastoreEntryIncrement**](WorldsDataApi.md#createWorldExperienceDatastoreEntryIncrement) | **POST** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key}/increment | Atomically add &#x60;by&#x60; to a numeric key (absent counts as 0).
[**createWorldExperienceMemoryQueueItem**](WorldsDataApi.md#createWorldExperienceMemoryQueueItem) | **POST** /v1/worlds/experiences/{experienceId}/memory/queues/{queue}/items | Add an item to a MemoryStore queue (ttlSeconds ≤ 45 days, priority 0-1000).
[**createWorldExperienceMemoryQueueRead**](WorldsDataApi.md#createWorldExperienceMemoryQueueRead) | **POST** /v1/worlds/experiences/{experienceId}/memory/queues/{queue}/read | Read and hide up to &#x60;count&#x60; queue items for invisibilitySeconds; remove them with the readId.
[**createWorldExperienceMessaging**](WorldsDataApi.md#createWorldExperienceMessaging) | **POST** /v1/worlds/experiences/{experienceId}/messaging/{topic} | Publish a message (≤ 1 KB) to every live server of the experience subscribed to the topic.
[**createWorldExperienceOrderedEntryIncrement**](WorldsDataApi.md#createWorldExperienceOrderedEntryIncrement) | **POST** /v1/worlds/experiences/{experienceId}/ordered/{store}/entries/{key}/increment | Atomically add &#x60;by&#x60; to an OrderedStore entry.
[**deleteWorldExperienceDatastoreEntry**](WorldsDataApi.md#deleteWorldExperienceDatastoreEntry) | **DELETE** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key} | Remove a key (a tombstone version; history stays readable for 30 days). Honours If-Match.
[**deleteWorldExperienceMemoryMap**](WorldsDataApi.md#deleteWorldExperienceMemoryMap) | **DELETE** /v1/worlds/experiences/{experienceId}/memory/maps/{map}/{key} | Remove a hash map item.
[**deleteWorldExperienceMemoryQueueRead**](WorldsDataApi.md#deleteWorldExperienceMemoryQueueRead) | **DELETE** /v1/worlds/experiences/{experienceId}/memory/queues/{queue}/reads/{readId} | Remove the items of one read (409 if the read lapsed).
[**deleteWorldExperienceMemorySorted**](WorldsDataApi.md#deleteWorldExperienceMemorySorted) | **DELETE** /v1/worlds/experiences/{experienceId}/memory/sorted/{map}/{key} | Remove a sorted map item.
[**deleteWorldExperienceOrderedEntry**](WorldsDataApi.md#deleteWorldExperienceOrderedEntry) | **DELETE** /v1/worlds/experiences/{experienceId}/ordered/{store}/entries/{key} | Remove an OrderedStore entry.
[**getWorldExperienceDataUsage**](WorldsDataApi.md#getWorldExperienceDataUsage) | **GET** /v1/worlds/experiences/{experienceId}/data/usage | Live quotas and usage: CCU, request budgets per minute, DataStore storage, MemoryStore memory.
[**getWorldExperienceDatastoreEntry**](WorldsDataApi.md#getWorldExperienceDatastoreEntry) | **GET** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key} | The current value of a key: version (ETag \&quot;v&lt;n&gt;\&quot;), userIds and attributes.
[**getWorldExperienceDatastoreEntryVersion**](WorldsDataApi.md#getWorldExperienceDatastoreEntryVersion) | **GET** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key}/versions/{version} | One version of a key, including a removed one.
[**getWorldExperienceMemoryMap**](WorldsDataApi.md#getWorldExperienceMemoryMap) | **GET** /v1/worlds/experiences/{experienceId}/memory/maps/{map} | Items of a MemoryStore hash map (cursor-paged, unordered).
[**getWorldExperienceMemoryMapByKey**](WorldsDataApi.md#getWorldExperienceMemoryMapByKey) | **GET** /v1/worlds/experiences/{experienceId}/memory/maps/{map}/{key} | One MemoryStore hash map item with its version and expiry.
[**getWorldExperienceMemoryQueue**](WorldsDataApi.md#getWorldExperienceMemoryQueue) | **GET** /v1/worlds/experiences/{experienceId}/memory/queues/{queue} | Queue length (visible, in flight) and the head, without hiding anything.
[**getWorldExperienceMemorySorted**](WorldsDataApi.md#getWorldExperienceMemorySorted) | **GET** /v1/worlds/experiences/{experienceId}/memory/sorted/{map} | A MemoryStore sorted map in order (sortKey, then key); ?order&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.
[**getWorldExperienceMemorySortedByKey**](WorldsDataApi.md#getWorldExperienceMemorySortedByKey) | **GET** /v1/worlds/experiences/{experienceId}/memory/sorted/{map}/{key} | One sorted map item.
[**getWorldExperienceOrdered**](WorldsDataApi.md#getWorldExperienceOrdered) | **GET** /v1/worlds/experiences/{experienceId}/ordered/{store} | An OrderedStore page ranked by value; ?order&#x3D;desc|asc&amp;min&#x3D;&amp;max&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.
[**getWorldExperienceOrderedEntry**](WorldsDataApi.md#getWorldExperienceOrderedEntry) | **GET** /v1/worlds/experiences/{experienceId}/ordered/{store}/entries/{key} | One OrderedStore entry.
[**listWorldExperienceDatastoreEntries**](WorldsDataApi.md#listWorldExperienceDatastoreEntries) | **GET** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries | Keys of a DataStore in key order; ?prefix&#x3D;&amp;scope&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.
[**listWorldExperienceDatastoreEntryVersions**](WorldsDataApi.md#listWorldExperienceDatastoreEntryVersions) | **GET** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key}/versions | Versions of a key, newest first (30-day history; the current version is kept).
[**listWorldExperienceDatastores**](WorldsDataApi.md#listWorldExperienceDatastores) | **GET** /v1/worlds/experiences/{experienceId}/datastores | The DataStores of an experience, with key counts and bytes.
[**updateWorldExperienceDatastoreEntry**](WorldsDataApi.md#updateWorldExperienceDatastoreEntry) | **PUT** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key} | Write a new version. If-Match \&quot;v&lt;n&gt;\&quot; (or ifVersion) writes only at that version; If-None-Match: * only if absent. 412 on a mismatch.
[**updateWorldExperienceMemoryMap**](WorldsDataApi.md#updateWorldExperienceMemoryMap) | **PUT** /v1/worlds/experiences/{experienceId}/memory/maps/{map}/{key} | Set a hash map item (ttlSeconds required; ifVersion for compare-and-set).
[**updateWorldExperienceMemorySorted**](WorldsDataApi.md#updateWorldExperienceMemorySorted) | **PUT** /v1/worlds/experiences/{experienceId}/memory/sorted/{map}/{key} | Set a sorted map item (ttlSeconds, optional sortKey and ifVersion).
[**updateWorldExperienceOrderedEntry**](WorldsDataApi.md#updateWorldExperienceOrderedEntry) | **PUT** /v1/worlds/experiences/{experienceId}/ordered/{store}/entries/{key} | Set an OrderedStore entry to a whole number.


<a name="createWorldExperienceDatastoreEntryIncrement"></a>
# **createWorldExperienceDatastoreEntryIncrement**
> CreateWorldExperienceDatastoreEntryIncrementResponse createWorldExperienceDatastoreEntryIncrement(experienceId, store, key)

Atomically add &#x60;by&#x60; to a numeric key (absent counts as 0).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : CreateWorldExperienceDatastoreEntryIncrementResponse = apiInstance.createWorldExperienceDatastoreEntryIncrement(experienceId, store, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#createWorldExperienceDatastoreEntryIncrement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#createWorldExperienceDatastoreEntryIncrement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceDatastoreEntryIncrementResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceMemoryQueueItem"></a>
# **createWorldExperienceMemoryQueueItem**
> CreateWorldPartyInviteResponse createWorldExperienceMemoryQueueItem(experienceId, queue)

Add an item to a MemoryStore queue (ttlSeconds ≤ 45 days, priority 0-1000).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val queue : kotlin.String = queue_example // kotlin.String | 
try {
    val result : CreateWorldPartyInviteResponse = apiInstance.createWorldExperienceMemoryQueueItem(experienceId, queue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#createWorldExperienceMemoryQueueItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#createWorldExperienceMemoryQueueItem")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **queue** | **kotlin.String**|  |

### Return type

**CreateWorldPartyInviteResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceMemoryQueueRead"></a>
# **createWorldExperienceMemoryQueueRead**
> CreateWorldExperienceMemoryQueueReadResponse createWorldExperienceMemoryQueueRead(experienceId, queue)

Read and hide up to &#x60;count&#x60; queue items for invisibilitySeconds; remove them with the readId.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val queue : kotlin.String = queue_example // kotlin.String | 
try {
    val result : CreateWorldExperienceMemoryQueueReadResponse = apiInstance.createWorldExperienceMemoryQueueRead(experienceId, queue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#createWorldExperienceMemoryQueueRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#createWorldExperienceMemoryQueueRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **queue** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceMemoryQueueReadResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceMessaging"></a>
# **createWorldExperienceMessaging**
> CreateWorldExperienceMessagingResponse createWorldExperienceMessaging(experienceId, topic)

Publish a message (≤ 1 KB) to every live server of the experience subscribed to the topic.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val topic : kotlin.String = topic_example // kotlin.String | 
try {
    val result : CreateWorldExperienceMessagingResponse = apiInstance.createWorldExperienceMessaging(experienceId, topic)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#createWorldExperienceMessaging")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#createWorldExperienceMessaging")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **topic** | **kotlin.String**|  |

### Return type

**CreateWorldExperienceMessagingResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWorldExperienceOrderedEntryIncrement"></a>
# **createWorldExperienceOrderedEntryIncrement**
> WorldExperienceOrderedEntryResponse createWorldExperienceOrderedEntryIncrement(experienceId, store, key)

Atomically add &#x60;by&#x60; to an OrderedStore entry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : WorldExperienceOrderedEntryResponse = apiInstance.createWorldExperienceOrderedEntryIncrement(experienceId, store, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#createWorldExperienceOrderedEntryIncrement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#createWorldExperienceOrderedEntryIncrement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**WorldExperienceOrderedEntryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperienceDatastoreEntry"></a>
# **deleteWorldExperienceDatastoreEntry**
> DeleteWorldExperienceDatastoreEntryResponse deleteWorldExperienceDatastoreEntry(experienceId, store, key)

Remove a key (a tombstone version; history stays readable for 30 days). Honours If-Match.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : DeleteWorldExperienceDatastoreEntryResponse = apiInstance.deleteWorldExperienceDatastoreEntry(experienceId, store, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#deleteWorldExperienceDatastoreEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#deleteWorldExperienceDatastoreEntry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**DeleteWorldExperienceDatastoreEntryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperienceMemoryMap"></a>
# **deleteWorldExperienceMemoryMap**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceMemoryMap(experienceId, map, key)

Remove a hash map item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val map : kotlin.String = map_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneGrantResponse = apiInstance.deleteWorldExperienceMemoryMap(experienceId, map, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#deleteWorldExperienceMemoryMap")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#deleteWorldExperienceMemoryMap")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **map** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperienceMemoryQueueRead"></a>
# **deleteWorldExperienceMemoryQueueRead**
> DeleteSpatialSceneNodeResponse deleteWorldExperienceMemoryQueueRead(experienceId, queue, readId)

Remove the items of one read (409 if the read lapsed).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val queue : kotlin.String = queue_example // kotlin.String | 
val readId : kotlin.String = readId_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneNodeResponse = apiInstance.deleteWorldExperienceMemoryQueueRead(experienceId, queue, readId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#deleteWorldExperienceMemoryQueueRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#deleteWorldExperienceMemoryQueueRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **queue** | **kotlin.String**|  |
 **readId** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneNodeResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperienceMemorySorted"></a>
# **deleteWorldExperienceMemorySorted**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceMemorySorted(experienceId, map, key)

Remove a sorted map item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val map : kotlin.String = map_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : DeleteSpatialSceneGrantResponse = apiInstance.deleteWorldExperienceMemorySorted(experienceId, map, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#deleteWorldExperienceMemorySorted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#deleteWorldExperienceMemorySorted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **map** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorldExperienceOrderedEntry"></a>
# **deleteWorldExperienceOrderedEntry**
> DeleteWorldExperienceOrderedEntryResponse deleteWorldExperienceOrderedEntry(experienceId, store, key)

Remove an OrderedStore entry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : DeleteWorldExperienceOrderedEntryResponse = apiInstance.deleteWorldExperienceOrderedEntry(experienceId, store, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#deleteWorldExperienceOrderedEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#deleteWorldExperienceOrderedEntry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**DeleteWorldExperienceOrderedEntryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceDataUsage"></a>
# **getWorldExperienceDataUsage**
> GetWorldExperienceDataUsageResponse getWorldExperienceDataUsage(experienceId)

Live quotas and usage: CCU, request budgets per minute, DataStore storage, MemoryStore memory.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : GetWorldExperienceDataUsageResponse = apiInstance.getWorldExperienceDataUsage(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#getWorldExperienceDataUsage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#getWorldExperienceDataUsage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**GetWorldExperienceDataUsageResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceDatastoreEntry"></a>
# **getWorldExperienceDatastoreEntry**
> GetWorldExperienceDatastoreEntryResponse getWorldExperienceDatastoreEntry(experienceId, store, key)

The current value of a key: version (ETag \&quot;v&lt;n&gt;\&quot;), userIds and attributes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : GetWorldExperienceDatastoreEntryResponse = apiInstance.getWorldExperienceDatastoreEntry(experienceId, store, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#getWorldExperienceDatastoreEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#getWorldExperienceDatastoreEntry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**GetWorldExperienceDatastoreEntryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceDatastoreEntryVersion"></a>
# **getWorldExperienceDatastoreEntryVersion**
> GetWorldExperienceDatastoreEntryResponse getWorldExperienceDatastoreEntryVersion(experienceId, store, key, version)

One version of a key, including a removed one.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
val version : kotlin.String = version_example // kotlin.String | 
try {
    val result : GetWorldExperienceDatastoreEntryResponse = apiInstance.getWorldExperienceDatastoreEntryVersion(experienceId, store, key, version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#getWorldExperienceDatastoreEntryVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#getWorldExperienceDatastoreEntryVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |
 **version** | **kotlin.String**|  |

### Return type

**GetWorldExperienceDatastoreEntryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceMemoryMap"></a>
# **getWorldExperienceMemoryMap**
> GetWorldExperienceMemoryMapResponse getWorldExperienceMemoryMap(experienceId, map)

Items of a MemoryStore hash map (cursor-paged, unordered).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val map : kotlin.String = map_example // kotlin.String | 
try {
    val result : GetWorldExperienceMemoryMapResponse = apiInstance.getWorldExperienceMemoryMap(experienceId, map)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#getWorldExperienceMemoryMap")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#getWorldExperienceMemoryMap")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **map** | **kotlin.String**|  |

### Return type

**GetWorldExperienceMemoryMapResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceMemoryMapByKey"></a>
# **getWorldExperienceMemoryMapByKey**
> GetWorldExperienceMemoryMapByKeyResponse getWorldExperienceMemoryMapByKey(experienceId, map, key)

One MemoryStore hash map item with its version and expiry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val map : kotlin.String = map_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : GetWorldExperienceMemoryMapByKeyResponse = apiInstance.getWorldExperienceMemoryMapByKey(experienceId, map, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#getWorldExperienceMemoryMapByKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#getWorldExperienceMemoryMapByKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **map** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**GetWorldExperienceMemoryMapByKeyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceMemoryQueue"></a>
# **getWorldExperienceMemoryQueue**
> GetWorldExperienceMemoryQueueResponse getWorldExperienceMemoryQueue(experienceId, queue)

Queue length (visible, in flight) and the head, without hiding anything.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val queue : kotlin.String = queue_example // kotlin.String | 
try {
    val result : GetWorldExperienceMemoryQueueResponse = apiInstance.getWorldExperienceMemoryQueue(experienceId, queue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#getWorldExperienceMemoryQueue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#getWorldExperienceMemoryQueue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **queue** | **kotlin.String**|  |

### Return type

**GetWorldExperienceMemoryQueueResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceMemorySorted"></a>
# **getWorldExperienceMemorySorted**
> GetWorldExperienceMemoryMapResponse getWorldExperienceMemorySorted(experienceId, map)

A MemoryStore sorted map in order (sortKey, then key); ?order&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val map : kotlin.String = map_example // kotlin.String | 
try {
    val result : GetWorldExperienceMemoryMapResponse = apiInstance.getWorldExperienceMemorySorted(experienceId, map)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#getWorldExperienceMemorySorted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#getWorldExperienceMemorySorted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **map** | **kotlin.String**|  |

### Return type

**GetWorldExperienceMemoryMapResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceMemorySortedByKey"></a>
# **getWorldExperienceMemorySortedByKey**
> GetWorldExperienceMemoryMapByKeyResponse getWorldExperienceMemorySortedByKey(experienceId, map, key)

One sorted map item.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val map : kotlin.String = map_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : GetWorldExperienceMemoryMapByKeyResponse = apiInstance.getWorldExperienceMemorySortedByKey(experienceId, map, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#getWorldExperienceMemorySortedByKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#getWorldExperienceMemorySortedByKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **map** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**GetWorldExperienceMemoryMapByKeyResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceOrdered"></a>
# **getWorldExperienceOrdered**
> GetWorldExperienceOrderedResponse getWorldExperienceOrdered(experienceId, store)

An OrderedStore page ranked by value; ?order&#x3D;desc|asc&amp;min&#x3D;&amp;max&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
try {
    val result : GetWorldExperienceOrderedResponse = apiInstance.getWorldExperienceOrdered(experienceId, store)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#getWorldExperienceOrdered")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#getWorldExperienceOrdered")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |

### Return type

**GetWorldExperienceOrderedResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldExperienceOrderedEntry"></a>
# **getWorldExperienceOrderedEntry**
> WorldExperienceOrderedEntryResponse getWorldExperienceOrderedEntry(experienceId, store, key)

One OrderedStore entry.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : WorldExperienceOrderedEntryResponse = apiInstance.getWorldExperienceOrderedEntry(experienceId, store, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#getWorldExperienceOrderedEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#getWorldExperienceOrderedEntry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**WorldExperienceOrderedEntryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceDatastoreEntries"></a>
# **listWorldExperienceDatastoreEntries**
> ListWorldExperienceDatastoreEntriesResponse listWorldExperienceDatastoreEntries(experienceId, store)

Keys of a DataStore in key order; ?prefix&#x3D;&amp;scope&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
try {
    val result : ListWorldExperienceDatastoreEntriesResponse = apiInstance.listWorldExperienceDatastoreEntries(experienceId, store)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#listWorldExperienceDatastoreEntries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#listWorldExperienceDatastoreEntries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |

### Return type

**ListWorldExperienceDatastoreEntriesResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceDatastoreEntryVersions"></a>
# **listWorldExperienceDatastoreEntryVersions**
> ListWorldExperienceDatastoreEntryVersionsResponse listWorldExperienceDatastoreEntryVersions(experienceId, store, key)

Versions of a key, newest first (30-day history; the current version is kept).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : ListWorldExperienceDatastoreEntryVersionsResponse = apiInstance.listWorldExperienceDatastoreEntryVersions(experienceId, store, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#listWorldExperienceDatastoreEntryVersions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#listWorldExperienceDatastoreEntryVersions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**ListWorldExperienceDatastoreEntryVersionsResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWorldExperienceDatastores"></a>
# **listWorldExperienceDatastores**
> ListWorldExperienceDatastoresResponse listWorldExperienceDatastores(experienceId)

The DataStores of an experience, with key counts and bytes.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
try {
    val result : ListWorldExperienceDatastoresResponse = apiInstance.listWorldExperienceDatastores(experienceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#listWorldExperienceDatastores")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#listWorldExperienceDatastores")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |

### Return type

**ListWorldExperienceDatastoresResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceDatastoreEntry"></a>
# **updateWorldExperienceDatastoreEntry**
> UpdateWorldExperienceDatastoreEntryResponse updateWorldExperienceDatastoreEntry(experienceId, store, key)

Write a new version. If-Match \&quot;v&lt;n&gt;\&quot; (or ifVersion) writes only at that version; If-None-Match: * only if absent. 412 on a mismatch.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceDatastoreEntryResponse = apiInstance.updateWorldExperienceDatastoreEntry(experienceId, store, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#updateWorldExperienceDatastoreEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#updateWorldExperienceDatastoreEntry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceDatastoreEntryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceMemoryMap"></a>
# **updateWorldExperienceMemoryMap**
> UpdateWorldExperienceMemoryMapResponse updateWorldExperienceMemoryMap(experienceId, map, key)

Set a hash map item (ttlSeconds required; ifVersion for compare-and-set).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val map : kotlin.String = map_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceMemoryMapResponse = apiInstance.updateWorldExperienceMemoryMap(experienceId, map, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#updateWorldExperienceMemoryMap")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#updateWorldExperienceMemoryMap")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **map** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceMemoryMapResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceMemorySorted"></a>
# **updateWorldExperienceMemorySorted**
> UpdateWorldExperienceMemoryMapResponse updateWorldExperienceMemorySorted(experienceId, map, key)

Set a sorted map item (ttlSeconds, optional sortKey and ifVersion).

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val map : kotlin.String = map_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : UpdateWorldExperienceMemoryMapResponse = apiInstance.updateWorldExperienceMemorySorted(experienceId, map, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#updateWorldExperienceMemorySorted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#updateWorldExperienceMemorySorted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **map** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**UpdateWorldExperienceMemoryMapResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorldExperienceOrderedEntry"></a>
# **updateWorldExperienceOrderedEntry**
> WorldExperienceOrderedEntryResponse updateWorldExperienceOrderedEntry(experienceId, store, key)

Set an OrderedStore entry to a whole number.

### Example
```kotlin
// Import classes:
//import net.crossly.infrastructure.*
//import net.crossly.models.*

val apiInstance = WorldsDataApi()
val experienceId : kotlin.String = experienceId_example // kotlin.String | 
val store : kotlin.String = store_example // kotlin.String | 
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : WorldExperienceOrderedEntryResponse = apiInstance.updateWorldExperienceOrderedEntry(experienceId, store, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsDataApi#updateWorldExperienceOrderedEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsDataApi#updateWorldExperienceOrderedEntry")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **experienceId** | **kotlin.String**|  |
 **store** | **kotlin.String**|  |
 **key** | **kotlin.String**|  |

### Return type

**WorldExperienceOrderedEntryResponse**

### Authorization


Configure PersonalAccessToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

