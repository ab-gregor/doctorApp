package com.springboot.doctorApp.Dao;

import com.springboot.doctorApp.Schema.Patient_details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Patient_detailsDao extends JpaRepository<Patient_details,Integer> {
}