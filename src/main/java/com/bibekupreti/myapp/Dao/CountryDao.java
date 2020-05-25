package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDao extends JpaRepository<Country,Integer> {
}
