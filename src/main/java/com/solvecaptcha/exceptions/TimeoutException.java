package com.solvecaptcha.exceptions;

public class TimeoutException extends Exception {

    public TimeoutException(String errorMessage) {
        super(errorMessage);
    }

}
