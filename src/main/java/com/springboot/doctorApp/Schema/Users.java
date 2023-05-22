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
    int user_Id;
    //int user_type_id ;
    String name;
    int age;
    String sex;
    String email;
    String password;
    String phone_num;

    //@ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn(name="userId",nullable = false)
   // private User user;

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "patient")  //address id one to many
    private Patient_details patient_details;
//
//    @OneToOne(fetch = FetchType.LAZY,mappedBy = "doctor")  //address id one to many
//    private Doctor_details doctor_details;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="user_type_Id")
    //User_types user_types;
}