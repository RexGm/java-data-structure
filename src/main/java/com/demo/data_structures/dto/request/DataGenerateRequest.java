package com.demo.data_structures.dto.request;



public class DataGenerateRequest {

    private String dataType;      // INTEGER, STRING, OBJECT
    private int size;             // 10k, 100k, 1M
    private boolean saveToDb;     // true -> save to DB

    public DataGenerateRequest() {}

    public DataGenerateRequest(String dataType, int size, boolean saveToDb) {
        this.dataType = dataType;
        this.size = size;
        this.saveToDb = saveToDb;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSaveToDb() {
        return saveToDb;
    }

    public void setSaveToDb(boolean saveToDb) {
        this.saveToDb = saveToDb;
    }
}
