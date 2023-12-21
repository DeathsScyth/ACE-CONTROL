package com.touzani.voitureservice.repository;

import com.touzani.voitureservice.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
