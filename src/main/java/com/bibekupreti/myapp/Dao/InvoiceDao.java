package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDao extends JpaRepository<Invoice,Integer> {
}
