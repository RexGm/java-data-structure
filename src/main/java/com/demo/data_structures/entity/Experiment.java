package com.demo.data_structures.entity;



import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "experiments")
public class Experiment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Array, LinkedList, Stack, Tree vs.
    @Column(nullable = false)
    private String dataStructure;

    // INSERT, DELETE, SEARCH
    @Column(nullable = false)
    private String operationType;

    // Test edilen eleman sayısı
    @Column(nullable = false)
    private Integer elementCount;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "experiment", cascade = CascadeType.ALL)
    private List<BenchmarkResult> results;

    public Experiment() {
        this.createdAt = LocalDateTime.now();
    }

    // getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataStructure() {
        return dataStructure;
    }

    public void setDataStructure(String dataStructure) {
        this.dataStructure = dataStructure;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Integer getElementCount() {
        return elementCount;
    }

    public void setElementCount(Integer elementCount) {
        this.elementCount = elementCount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<BenchmarkResult> getResults() {
        return results;
    }

    public void setResults(List<BenchmarkResult> results) {
        this.results = results;
    }
}
