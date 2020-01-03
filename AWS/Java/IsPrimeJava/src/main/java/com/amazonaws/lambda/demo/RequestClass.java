package com.amazonaws.lambda.demo;

public class RequestClass {
	String number;
    public String getnumber() {
        return number;
    }

    public void setnumber(String number) {
        this.number = number;
    }

    public RequestClass(String number, String lastName) {
        this.number = number;
    }

    public RequestClass() {
    }

}
