package com.example.repository;

import com.example.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepositroy extends JpaRepository<Guest,Long> {
}
