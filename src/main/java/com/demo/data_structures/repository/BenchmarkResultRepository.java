package com.demo.data_structures.repository;


import com.demo.data_structures.entity.BenchmarkResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BenchmarkResultRepository extends JpaRepository<BenchmarkResult, Long> {

    List<BenchmarkResult> findByExperimentId(Long experimentId);
}
