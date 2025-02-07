package com.example.repository;

import com.example.domain.Rezervation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RezervationRepository extends JpaRepository<Rezervation,Long> {
}
