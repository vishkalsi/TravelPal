package com.example.travelpal.WebServices;

public class ApiResponse<T> {

    public Integer getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(Integer apiVersion) {
        this.apiVersion = apiVersion;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public GetError getError() {
        return error;
    }

    public void setError(GetError error) {
        this.error = error;
    }

    public int getErrorType() {
        return errorType;
    }

    public void setErrorType(int errorType) {
        this.errorType = errorType;
    }

    private Integer apiVersion;
    private T data;
    private boolean isError;
    private GetError error;
    private int errorType;

}