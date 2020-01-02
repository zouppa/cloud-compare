package com.primeList;

import java.util.*;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with HTTP Trigger.
 */
public class Function {
    /**
     * This function listens at endpoint "/api/PrimeListJava". Two ways to invoke it using "curl" command in bash:
     * 1. curl -d "HTTP Body" {your host}/api/PrimeListJava&code={your function key}
     * 2. curl "{your host}/api/PrimeListJava?name=HTTP%20Query&code={your function key}"
     * Function Key is not needed when running locally, it is used to invoke function deployed to Azure.
     * More details: https://aka.ms/functions_authorization_keys
     */
    @FunctionName("PrimeListJava")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.FUNCTION) HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        context.getLogger().info("Java HTTP trigger processed a request.");

        // Parse query parameter
        String query = request.getQueryParameters().get("name");
        String name = request.getBody().orElse(query);


        int max = 10;
        max = Integer.parseInt(name);
        int i = 0;
        int num = 0;
        String primeNumbers = "";


        for (i = 1; i <= max; i++) {
          int counter = 0;
          for (num = i; num >= 1; num--) {
            if (i % num == 0) {
              counter = counter + 1;
            }
          }
          if (counter == 2) {
            // Appended the Prime number to the String
            primeNumbers = primeNumbers + i + " ";
          }
        }




        if (name == null) {
            return request.createResponseBuilder(HttpStatus.BAD_REQUEST).body("Please pass a name on the query string or in the request body").build();
        } else {
            return request.createResponseBuilder(HttpStatus.OK).body(primeNumbers).build();
        }
    }
}