package com.springboot.doctorApp.Controllers;

import com.springboot.doctorApp.Schema.Patient_details;
import com.springboot.doctorApp.Services.Patient_detailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin("http://localhost:3000")
public class Patient_detailsController {
    @Autowired
    private Patient_detailsServiceImpl patient_detailsServiceImpl;

    @PostMapping("/addPatient")
    public String addPatient(@RequestBody Patient_details patient_details) {
        return patient_detailsServiceImpl.addPatient(patient_details);
    }
}