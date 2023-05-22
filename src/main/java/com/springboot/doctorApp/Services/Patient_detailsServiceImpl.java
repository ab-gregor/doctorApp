package com.springboot.doctorApp.Services;

import com.springboot.doctorApp.Dao.Patient_detailsDao;
import com.springboot.doctorApp.Schema.Patient_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Patient_detailsServiceImpl implements Patient_detailsService {
    @Autowired
    private Patient_detailsDao patient_detailsDao;

    @Override
    public String addPatient(Patient_details patient_details) {
        patient_detailsDao.save(patient_details);
        return "patient added successfully";
    }
}