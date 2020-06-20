package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMovementDao extends JpaRepository<VehicleMovement,Integer> {
}
