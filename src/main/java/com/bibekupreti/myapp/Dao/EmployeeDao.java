package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Country,Integer> {
}
