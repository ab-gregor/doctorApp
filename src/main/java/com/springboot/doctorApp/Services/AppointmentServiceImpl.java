package com.springboot.doctorApp.Services;

import com.springboot.doctorApp.Dao.AppoitmentDao;
import com.springboot.doctorApp.Schema.Appointment;
import com.springboot.doctorApp.Schema.Doctor_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AppointmentServiceImpl implements AppointmentService
{
    @Autowired
    AppoitmentDao appoitmentDao;
    @Override
    public Appointment addAppointment(Appointment appointment) {
        appoitmentDao.save(appointment);
        return appointment;
    }
    public List<Appointment> findAppointmentByPatientId(int patient_id){
        return appoitmentDao.findAppointmentByPatientId(patient_id);
    }



}
