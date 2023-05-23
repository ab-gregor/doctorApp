package com.springboot.doctorApp.Dao;

import com.springboot.doctorApp.Schema.Appointment;
import com.springboot.doctorApp.Schema.Doctor_details;
import com.springboot.doctorApp.Schema.Patient_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppoitmentDao extends JpaRepository<Appointment,Integer> {
    @Query(nativeQuery= true, value="SELECT * FROM Appointment WHERE us like CONCAT('%', ?1, '%')")
    List<Doctor_details> findByspecialization(String specialization);

}
