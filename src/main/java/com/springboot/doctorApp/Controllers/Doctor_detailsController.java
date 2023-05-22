package com.springboot.doctorApp.Controllers;

import com.springboot.doctorApp.Schema.Doctor_details;
import com.springboot.doctorApp.Services.Doctor_detailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin("http://localhost:3000")
public class Doctor_detailsController {
    @Autowired
    private Doctor_detailsServiceImpl doctor_detailsServiceImpl;

    @PostMapping("/addDoctor")
    public String addDoctor(@RequestBody Doctor_details doctor_details) {
        return doctor_detailsServiceImpl.addDoctor(doctor_details);
    }
}