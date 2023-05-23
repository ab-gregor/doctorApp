package com.springboot.doctorApp.Dao;

import com.springboot.doctorApp.Schema.Appointment;
import com.springboot.doctorApp.Schema.Doctor_details;
import com.springboot.doctorApp.Schema.Patient_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppoitmentDao extends JpaRepository<Appointment,Integer> {
    @Query(nativeQuery= true, value="SELECT * FROM Appointment WHERE patient_details_patient_details_id =(?1)")
    List<Appointment> findAppointmentByPatientId(int patient_id);

    @Query(nativeQuery= true, value="SELECT * FROM Appointment WHERE doctor_details_doctor_details_id =(?1)")
    List<Appointment> findAppointmentByDoctorId(int doctor_id);

    @Query(nativeQuery= true, value="SELECT * FROM Appointment WHERE patient_details_patient_details_id =(?1) AND " +
            "start_time>=(?2)")
    List<Appointment> findAppointmentUpcoming(int patient_id,long start_time);


}
