package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<RequestClass, ResponseClass> {

	@Override
	public ResponseClass handleRequest(RequestClass request, Context context){
        //String greetingString = String.format("Hello %s %s", request.firstName, request.lastName);
		int max = 10;
	    int i = 0;
	    int num = 0;
	    String primeNumbers = "";
	    max = Integer.parseInt(request.max);
	    
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

        return new ResponseClass(primeNumbers);
    }

}
