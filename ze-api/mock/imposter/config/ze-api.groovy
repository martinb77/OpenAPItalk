import io.vertx.core.http.HttpHeaders

// applies to URIs ending with '/api'
if (context.request.uri.endsWith("/api/greeting")) {
    respond().withFile("greeting.json");
}
if (context.request.uri.contains("/api/greetingWithName")) {
    String name = context.request.params["greetingName"];
    respond {
        greeting = "Hello, " + name + "!"
        withData "{ \"greeting\": \"${greeting}\" }"
    }
}
