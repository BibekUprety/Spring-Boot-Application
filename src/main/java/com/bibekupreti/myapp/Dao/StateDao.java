package com.bibekupreti.myapp.Dao;


import com.bibekupreti.myapp.Models.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateDao extends JpaRepository<State,Integer> {
}
