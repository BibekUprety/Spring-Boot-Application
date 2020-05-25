package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementDao extends JpaRepository<VehicleMovement,Integer> {
}
