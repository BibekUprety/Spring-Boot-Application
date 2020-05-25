package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDao extends JpaRepository<Contact,Integer> {
}
