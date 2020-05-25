package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDao extends JpaRepository<Supplier,Integer> {
}
