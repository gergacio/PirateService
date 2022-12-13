package com.codeClan.example.pirateservice.repositories;

import com.codeClan.example.pirateservice.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository extends JpaRepository<Ship, Long> {
}
