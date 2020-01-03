package com.amazonaws.lambda.demo;

public class ResponseClass {
	String isPrime;

    public String getPayload() {
        return isPrime;
    }

    public void setPayload(String payload) {
        this.isPrime = payload;
    }

    public ResponseClass(String payload) {
        this.isPrime = payload;
    }

    public ResponseClass() {
    }

}
