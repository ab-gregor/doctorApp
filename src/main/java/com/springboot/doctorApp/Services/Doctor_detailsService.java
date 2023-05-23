package com.springboot.doctorApp.Services;

import com.springboot.doctorApp.Schema.Doctor_details;
import com.springboot.doctorApp.Schema.Patient_details;
//import org.springframework.security.core.userdetails

import java.util.Optional;

public interface Doctor_detailsService {
    public String addDoctor(Doctor_details doctor_details);


    //public Optional <Doctor_details> getDoctor(String spec);


}
