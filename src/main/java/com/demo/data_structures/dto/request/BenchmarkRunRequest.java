package com.demo.data_structures.dto.request;


public class BenchmarkRunRequest {

    private String dataStructure; // ARRAY, LINKED_LIST, BST, HASH_MAP
    private String algorithm;     // SEARCH_LINEAR, SEARCH_BINARY, SORT_QUICK
    private int dataSize;         // How many data
    private String dataSource;    // DB, MEMORY

    public BenchmarkRunRequest() {}

    public BenchmarkRunRequest(String dataStructure, String algorithm, int dataSize, String dataSource) {
        this.dataStructure = dataStructure;
        this.algorithm = algorithm;
        this.dataSize = dataSize;
        this.dataSource = dataSource;
    }

    public String getDataStructure() {
        return dataStructure;
    }

    public void setDataStructure(String dataStructure) {
        this.dataStructure = dataStructure;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public int getDataSize() {
        return dataSize;
    }

    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
}
