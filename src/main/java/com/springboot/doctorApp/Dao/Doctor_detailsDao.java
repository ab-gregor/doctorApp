package com.springboot.doctorApp.Dao;

import com.springboot.doctorApp.Schema.Doctor_details;
import com.springboot.doctorApp.Schema.Patient_details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Doctor_detailsDao extends JpaRepository<Doctor_details,Integer> {

}
