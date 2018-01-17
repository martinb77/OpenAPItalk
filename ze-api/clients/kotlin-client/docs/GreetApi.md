# GreetApi

All URIs are relative to *http://localhost:8002/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**greetingGet**](GreetApi.md#greetingGet) | **GET** /greeting | the first service - greetings!
[**greetingWithNameGet**](GreetApi.md#greetingWithNameGet) | **GET** /greetingWithName | Greeting with name


<a name="greetingGet"></a>
# **greetingGet**
> HelloDTO greetingGet()

the first service - greetings!

just say hello!

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = GreetApi()
try {
    val result : HelloDTO = apiInstance.greetingGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GreetApi#greetingGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GreetApi#greetingGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HelloDTO**](HelloDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="greetingWithNameGet"></a>
# **greetingWithNameGet**
> HelloDTO greetingWithNameGet(greetingName)

Greeting with name

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = GreetApi()
val greetingName : kotlin.String = greetingName_example // kotlin.String | 
try {
    val result : HelloDTO = apiInstance.greetingWithNameGet(greetingName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GreetApi#greetingWithNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GreetApi#greetingWithNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greetingName** | **kotlin.String**|  |

### Return type

[**HelloDTO**](HelloDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

