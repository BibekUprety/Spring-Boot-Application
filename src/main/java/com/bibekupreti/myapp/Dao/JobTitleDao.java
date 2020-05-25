package com.bibekupreti.myapp.Dao;

import com.bibekupreti.myapp.Models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
