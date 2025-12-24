package com.demo.data_structures.repository;


import com.demo.data_structures.entity.DataSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSetRepository extends JpaRepository<DataSet, Long> {
}
