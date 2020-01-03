package com.amazonaws.lambda.demo;

public class ResponseClass {
	String primeNumbers;

    public String getPayload() {
        return primeNumbers;
    }

    public void setPayload(String payload) {
        this.primeNumbers = payload;
    }

    public ResponseClass(String payload) {
        this.primeNumbers = payload;
    }

    public ResponseClass() {
    }

}
