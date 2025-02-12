package com.janitri.assignment.repository;

import com.janitri.assignment.model.HeartRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeartRateRepository extends JpaRepository<HeartRate, Long> {
}
