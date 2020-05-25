package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
