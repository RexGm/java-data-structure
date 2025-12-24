package com.demo.data_structures.repository;


import com.demo.data_structures.entity.BenchmarkResult;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BenchmarkResultRepository extends JpaRepository<BenchmarkResult, Long> {
}

