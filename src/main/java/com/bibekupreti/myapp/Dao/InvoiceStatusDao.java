package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusDao extends JpaRepository<InvoiceStatus,Integer> {
}
