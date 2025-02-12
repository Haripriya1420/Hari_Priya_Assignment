package com.janitri.assignment.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "heart_rates")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HeartRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    private int heartRate;
    private LocalDateTime timestamp;
}
