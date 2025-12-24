package com.demo.data_structures.repository;



import com.demo.data_structures.entity.Experiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperimentRepository extends JpaRepository<Experiment, Long> {
}
