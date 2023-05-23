package com.springboot.doctorApp.Services;

import com.springboot.doctorApp.Schema.Doctor_details;
import com.springboot.doctorApp.Schema.Patient_details;
//import org.springframework.security.core.userdetails

import java.util.Optional;

public interface Doctor_detailsService {
    public Doctor_details addDoctor(Doctor_details doctor_details);
    public Doctor_details verifyDoctor(int doctor_id);


    //public Optional <Doctor_details> getDoctor(String spec);


}
