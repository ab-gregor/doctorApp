package com.springboot.doctorApp.Controllers;

import com.springboot.doctorApp.Dao.AppoitmentDao;

import com.springboot.doctorApp.Schema.Appointment;

import com.springboot.doctorApp.Services.AppointmentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.Instant;
import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentServiceImpl appointmentServiceImpl;
    @Autowired
    private AppoitmentDao appoitmentDao;
    @PostMapping("/addAppointment")
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return appointmentServiceImpl.addAppointment(appointment);
    }
    @GetMapping(value = {"getAppointmentByPatientId/{patient_id}"})
    public List<Appointment> findAppointmentByPatientid(@PathVariable int patient_id){
        return appoitmentDao.findAppointmentByPatientId(patient_id);
    }

    @GetMapping(value = {"getAppointmentByDoctorId/{doctor_id}"})
    public List<Appointment> findAppointmentByDoctorid(@PathVariable int doctor_id){
        return appoitmentDao.findAppointmentByDoctorId(doctor_id);
    }

    @GetMapping(value = {"getAppointmentUpcoming/{patient_id}"})
    public List<Appointment> findAppointmentUpcoming(@PathVariable int patient_id){

        long unixTimestamp = Instant.now().getEpochSecond();
        //System.out.println(unixTimestamp);
        return appoitmentDao.findAppointmentUpcoming(patient_id,unixTimestamp);
    }

}

