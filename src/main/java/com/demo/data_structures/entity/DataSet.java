package com.demo.data_structures.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "data_sets")
public class DataSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dataType;
    // INTEGER, STRING, DOUBLE vs

    private int size;
    // 10k, 100k, 1M gibi

    @Lob
    @Column(columnDefinition = "TEXT")
    private String rawData;
    // JSON / CSV / String olarak saklanacak

    @ManyToOne
    @JoinColumn(name = "experiment_id")
    private Experiment experiment;

    // --- GETTER / SETTER ---
    public Long getId() {
        return id;
    }

    public String getDataType() {
        return dataType;
    }

    public int getSize() {
        return size;
    }

    public String getRawData() {
        return rawData;
    }

    public Experiment getExperiment() {
        return experiment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public void setExperiment(Experiment experiment) {
        this.experiment = experiment;
    }
}
