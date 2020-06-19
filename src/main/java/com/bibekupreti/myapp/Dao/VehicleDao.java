package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleDao extends JpaRepository<Vehicle,Integer> {
}
