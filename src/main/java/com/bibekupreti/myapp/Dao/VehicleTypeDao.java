package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeDao extends JpaRepository<VehicleType,Integer> {
}
