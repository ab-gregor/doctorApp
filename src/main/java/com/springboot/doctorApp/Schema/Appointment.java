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

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="patient_details_id")
//    Patient_details patient_details;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="doctor_details_id")
//    Doctor_details doctor_details;



}