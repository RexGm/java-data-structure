package com.demo.data_structures.dto.response;


public class DataGenerateResponse {

    private boolean success;
    private int generatedSize;
    private String message;

    public DataGenerateResponse() {}

    public DataGenerateResponse(boolean success, int generatedSize, String message) {
        this.success = success;
        this.generatedSize = generatedSize;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getGeneratedSize() {
        return generatedSize;
    }

    public void setGeneratedSize(int generatedSize) {
        this.generatedSize = generatedSize;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
