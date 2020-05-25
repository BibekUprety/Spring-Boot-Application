package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationDao  extends JpaRepository<Location, Integer> {
}
