package com.springboot.doctorApp.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Appointment {
    @Id
    @GeneratedValue
    int appointment_Id;

    long start_time;

    @ManyToOne
    public Patient_details patient_details;
    @ManyToOne
    public Doctor_details doctor_details;



}