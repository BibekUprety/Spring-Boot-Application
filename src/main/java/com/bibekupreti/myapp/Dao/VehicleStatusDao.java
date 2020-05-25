package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleStatusDao extends JpaRepository<VehicleStatus,Integer> {
}
