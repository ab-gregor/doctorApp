package com.springboot.doctorApp.Services;

import com.springboot.doctorApp.Dao.Doctor_detailsDao;
import com.springboot.doctorApp.Dao.Patient_detailsDao;
import com.springboot.doctorApp.Schema.Patient_details;
import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.doctorApp.Schema.Doctor_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Doctor_detailsServiceImpl implements Doctor_detailsService {
    @Autowired
    private Doctor_detailsDao doctor_detailsDao;

    Doctor_details doc;

    @Override
    public Doctor_details addDoctor(Doctor_details doctor_details) {
        doctor_detailsDao.save(doctor_details);
        return doctor_details;
    }

    public List<Doctor_details> findByspecialization(String specialization){
            return doctor_detailsDao.findByspecialization(specialization);
        }
    @Override
    public Doctor_details verifyDoctor(int doctor_id)
    {
        doc=doctor_detailsDao.findDocbyId(doctor_id);
        doc.setIs_verified(1);
        doctor_detailsDao.save(doc);
        return doc;

     }

}
