package com.springboot.doctorApp.Schema;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Doctor_details {
    @Id
    @GeneratedValue
    int doctor_details_id;
    boolean is_verified;
    String specialization;
    String hospital_name;
    String location;
    String qualification;
    int experience;


    @OneToOne
    Users doctor;
//
//    @OneToMany(fetch = FetchType.LAZY,mappedBy = "doctor_details")
//    private List<Appointment> appointment;

    @OneToMany(fetch=FetchType.LAZY)
    public List<Appointment> appointments;
}