# io.swagger.client - Kotlin client library for Ze API

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:8002/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GreetApi* | [**greetingGet**](docs/GreetApi.md#greetingget) | **GET** /greeting | the first service - greetings!
*GreetApi* | [**greetingWithNameGet**](docs/GreetApi.md#greetingwithnameget) | **GET** /greetingWithName | Greeting with name


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.HelloDTO](docs/HelloDTO.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
