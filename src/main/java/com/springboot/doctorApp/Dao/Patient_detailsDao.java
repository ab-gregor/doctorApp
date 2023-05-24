package com.springboot.doctorApp.Dao;

import com.springboot.doctorApp.Schema.Patient_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Patient_detailsDao extends JpaRepository<Patient_details,Integer> {

    @Query(nativeQuery= true, value="SELECT patient_details_id FROM Patient_details WHERE patient_user_id =(?1)")
    int returnPatientId(int user_id);
}