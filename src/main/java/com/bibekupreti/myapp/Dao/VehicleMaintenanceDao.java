package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMaintenanceDao extends JpaRepository<VehicleMaintenance,Integer> {
}
