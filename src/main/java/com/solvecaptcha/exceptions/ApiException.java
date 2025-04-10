package com.solvecaptcha.exceptions;

public class ApiException extends Exception {

    public ApiException(String errorMessage) {
        super(errorMessage);
    }

}
