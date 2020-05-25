package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDao extends JpaRepository<Vehicle,Integer> {
}
