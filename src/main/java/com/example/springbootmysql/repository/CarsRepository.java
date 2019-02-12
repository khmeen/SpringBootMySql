package com.example.springbootmysql.repository;

import com.example.springbootmysql.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer> {

}
