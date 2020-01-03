package com.amazonaws.lambda.demo;

public class RequestClass {
	String max;
    public String getmax() {
        return max;
    }

    public void setmax(String max) {
        this.max = max;
    }

    public RequestClass(String max, String lastName) {
        this.max = max;
    }

    public RequestClass() {
    }

}
