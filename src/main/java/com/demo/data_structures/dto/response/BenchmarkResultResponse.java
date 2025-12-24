package com.demo.data_structures.dto.response;


public class BenchmarkResultResponse {

    private String dataStructure;
    private String algorithm;
    private long executionTimeMs;
    private long memoryUsageKb;

    public BenchmarkResultResponse() {}

    public BenchmarkResultResponse(String dataStructure, String algorithm,
                                   long executionTimeMs, long memoryUsageKb) {
        this.dataStructure = dataStructure;
        this.algorithm = algorithm;
        this.executionTimeMs = executionTimeMs;
        this.memoryUsageKb = memoryUsageKb;
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

    public long getExecutionTimeMs() {
        return executionTimeMs;
    }

    public void setExecutionTimeMs(long executionTimeMs) {
        this.executionTimeMs = executionTimeMs;
    }

    public long getMemoryUsageKb() {
        return memoryUsageKb;
    }

    public void setMemoryUsageKb(long memoryUsageKb) {
        this.memoryUsageKb = memoryUsageKb;
    }
}
