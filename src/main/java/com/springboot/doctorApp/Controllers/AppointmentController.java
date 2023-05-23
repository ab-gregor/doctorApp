package com.springboot.doctorApp.Controllers;

import com.springboot.doctorApp.Dao.AppoitmentDao;

import com.springboot.doctorApp.Schema.Appointment;

import com.springboot.doctorApp.Services.AppointmentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = {"getAppoitmentByPatientId/{patient_id}"})
    public List<Appointment> findAppoitmentByPatientid(@PathVariable int patient_id){
        return appoitmentDao.findAppointmentByPatientId(patient_id);
    }
}

