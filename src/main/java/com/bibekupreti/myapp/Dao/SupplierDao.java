package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDao extends JpaRepository<Supplier,Integer> {
}
