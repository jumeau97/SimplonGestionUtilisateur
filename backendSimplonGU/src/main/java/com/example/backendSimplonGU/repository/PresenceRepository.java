package com.example.backendSimplonGU.repository;

import com.example.backendSimplonGU.model.Presence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresenceRepository extends JpaRepository<Presence, Long> {
}
