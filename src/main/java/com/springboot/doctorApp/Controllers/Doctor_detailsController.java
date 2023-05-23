package com.springboot.doctorApp.Controllers;

import com.springboot.doctorApp.Dao.Doctor_detailsDao;
import com.springboot.doctorApp.Schema.Doctor_details;
import com.springboot.doctorApp.Services.Doctor_detailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:3000")
public class Doctor_detailsController {
    @Autowired
    private Doctor_detailsServiceImpl doctor_detailsServiceImpl;
    @Autowired
    private Doctor_detailsDao doctor_detailsDao;
    @PostMapping("/addDoctor")
    public String addDoctor(@RequestBody Doctor_details doctor_details) {
        return doctor_detailsServiceImpl.addDoctor(doctor_details);
    }
    @GetMapping(value = {"findDoctor/{specialization}"})
    public List<Doctor_details> findByspecialization(@PathVariable String specialization){
        return doctor_detailsDao.findByspecialization(specialization);
    }
}