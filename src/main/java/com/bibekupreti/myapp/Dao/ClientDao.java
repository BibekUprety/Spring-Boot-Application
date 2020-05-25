package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Integer> {
}
