package com.demo.data_structures.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "benchmark_results")
public class BenchmarkResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // milisaniye / nanosaniye
    @Column(nullable = false)
    private Long executionTimeNs;

    // Opsiyonel: memory ölçmek istersen
    private Long memoryUsageKb;

    @ManyToOne
    @JoinColumn(name = "experiment_id", nullable = false)
    private Experiment experiment;

    public BenchmarkResult() {
    }

    // getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExecutionTimeNs() {
        return executionTimeNs;
    }

    public void setExecutionTimeNs(Long executionTimeNs) {
        this.executionTimeNs = executionTimeNs;
    }

    public Long getMemoryUsageKb() {
        return memoryUsageKb;
    }

    public void setMemoryUsageKb(Long memoryUsageKb) {
        this.memoryUsageKb = memoryUsageKb;
    }

    public Experiment getExperiment() {
        return experiment;
    }

    public void setExperiment(Experiment experiment) {
        this.experiment = experiment;
    }
}
