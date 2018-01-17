# ZeApi.GreetApi

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
```javascript
var ZeApi = require('ze_api');

var apiInstance = new ZeApi.GreetApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.greetingGet(callback);
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
```javascript
var ZeApi = require('ze_api');

var apiInstance = new ZeApi.GreetApi();

var greetingName = "greetingName_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.greetingWithNameGet(greetingName, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greetingName** | **String**|  | 

### Return type

[**HelloDTO**](HelloDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

