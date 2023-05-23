package com.springboot.doctorApp.Dao;

import com.springboot.doctorApp.Schema.Doctor_details;
import com.springboot.doctorApp.Schema.Patient_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Doctor_detailsDao extends JpaRepository<Doctor_details,Integer> {
    @Query(nativeQuery= true, value="SELECT * FROM Doctor_details WHERE specialization like CONCAT('%', ?1, '%')")
    List<Doctor_details> findByspecialization(String specialization);

    @Query(nativeQuery= true, value="SELECT * FROM Doctor_details WHERE is_verified =0")
    List<Doctor_details> findUnVerified();

    @Query(nativeQuery= true, value="SELECT * FROM Doctor_details WHERE doctor_details_id =(?1)")
    Doctor_details findDocbyId(int doctor_details_id);


}
