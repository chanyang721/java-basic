package com.inflearn.lecture.c_intermediate.exception.training;

public class NetworkClientException extends Exception {
    private String errorCode;

    public NetworkClientException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
