package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeDao extends JpaRepository<Employee,Integer> {
}
