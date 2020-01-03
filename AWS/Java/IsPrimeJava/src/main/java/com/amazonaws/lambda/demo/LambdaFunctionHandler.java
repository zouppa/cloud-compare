package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<RequestClass, ResponseClass> {

    @Override
	public ResponseClass handleRequest(RequestClass request, Context context){
        //String greetingString = String.format("Hello %s %s", request.firstName, request.lastName);
    	int number = 2;
        boolean flag = false;
        String Isprime;
	    number = Integer.parseInt(request.number);
	    
	    if (number < 2) {
	        flag = true;
	      } else {
	        for (int i = 2; i <= number / 2; ++i) {
	          if (number % i == 0) {
	            flag = true;
	            break;
	          }
	        }
	      }
	      flag = !flag;
	      Isprime = String.valueOf(flag);
        return new ResponseClass(Isprime);
    }

}
