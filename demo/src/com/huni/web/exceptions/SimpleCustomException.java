package com.huni.web.exceptions;

public class SimpleCustomException extends RuntimeException {

    public SimpleCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
