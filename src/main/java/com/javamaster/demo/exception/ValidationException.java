package com.javamaster.demo.exception;

public class ValidationException extends Exception {

    private String message;

    public ValidationException(String message) {
        super(message);
    }

    public String getMessage() {
        return message;
    }
}
