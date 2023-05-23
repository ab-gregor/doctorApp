package com.springboot.doctorApp.Schema;
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
public class Patient_details {
    @Id
    @GeneratedValue
    int patient_details_id;
    String blood_group;
    int weight;

    @OneToOne
    Users patient;

    @OneToMany
    public List<Appointment> appointments;

//    @OneToMany(fetch = FetchType.LAZY,mappedBy = "patient_details")
//    private List<Appointment> appointment;

}
