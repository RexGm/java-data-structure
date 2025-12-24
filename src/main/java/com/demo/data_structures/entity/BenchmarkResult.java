package com.demo.data_structures.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "benchmark_results")
public class BenchmarkResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dataStructure;


    private String algorithm;


    private long executionTimeMs;

    private long memoryUsageKb;

    @ManyToOne
    @JoinColumn(name = "experiment_id")
    private Experiment experiment;

    // --- GETTER / SETTER ---
    public Long getId() {
        return id;
    }

    public String getDataStructure() {
        return dataStructure;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public long getExecutionTimeMs() {
        return executionTimeMs;
    }

    public long getMemoryUsageKb() {
        return memoryUsageKb;
    }

    public Experiment getExperiment() {
        return experiment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataStructure(String dataStructure) {
        this.dataStructure = dataStructure;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public void setExecutionTimeMs(long executionTimeMs) {
        this.executionTimeMs = executionTimeMs;
    }

    public void setMemoryUsageKb(long memoryUsageKb) {
        this.memoryUsageKb = memoryUsageKb;
    }

    public void setExperiment(Experiment experiment) {
        this.experiment = experiment;
    }
}
