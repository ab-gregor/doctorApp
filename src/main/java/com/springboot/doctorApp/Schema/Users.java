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
public class Users {
    @Id
    @GeneratedValue
    int user_id;
    //int user_type_id ;
    String name;
    int age;
    String sex;
    String email;
    String password;
    String phone_num;
    //@Transient
    @ManyToOne
    public User_types user_type;

//    @OneToOne(mappedBy = "patient")  //address id one to many
//    private Patient_detsails patient_details;
//
//    @OneToOne(mappedBy = "doctor")  //address id one to many
//    private Doctor_details doctor_details;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="user_type_Id")
    //User_types user_types;
}