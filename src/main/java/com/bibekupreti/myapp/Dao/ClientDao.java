package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Client, Integer> {
}
