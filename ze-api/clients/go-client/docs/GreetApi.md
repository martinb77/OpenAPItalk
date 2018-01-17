# \GreetApi

All URIs are relative to *http://localhost:8002/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GreetingGet**](GreetApi.md#GreetingGet) | **Get** /greeting | the first service - greetings!
[**GreetingWithNameGet**](GreetApi.md#GreetingWithNameGet) | **Get** /greetingWithName | Greeting with name


# **GreetingGet**
> HelloDto GreetingGet()

the first service - greetings!

just say hello!


### Parameters
This endpoint does not need any parameter.

### Return type

[**HelloDto**](HelloDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GreetingWithNameGet**
> HelloDto GreetingWithNameGet($greetingName)

Greeting with name


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greetingName** | **string**|  | 

### Return type

[**HelloDto**](HelloDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

