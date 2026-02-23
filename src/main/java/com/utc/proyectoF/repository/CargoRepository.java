package com.utc.proyectoF.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utc.proyectoF.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}