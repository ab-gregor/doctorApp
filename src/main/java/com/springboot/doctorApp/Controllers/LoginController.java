package com.springboot.doctorApp.Controllers;

import com.springboot.doctorApp.Dao.Doctor_detailsDao;
import com.springboot.doctorApp.Dao.Patient_detailsDao;
import com.springboot.doctorApp.Dao.UserRepository;
import com.springboot.doctorApp.Schema.Users;

import org.springframework.aop.AopInvocationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {



//    @Autowired
//    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Patient_detailsDao patient_detailsDao;

    @Autowired
    private Doctor_detailsDao doctor_detailsDao;


    @PostMapping("/loginAuth")
    public List<Integer> login(@RequestBody Map<String, String> loginData)throws UsernameNotFoundException {
        String email = loginData.get("email");
        String password = loginData.get("password");
        Users user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");

        }

        else {
//            System.out.println((user.getEmail()));
//            System.out.println((user.getPassword()));

            if ((email.equals(user.getEmail())) && (  password.equals(user.getPassword()))) {
                List<Integer> ids=new ArrayList<Integer>();

                ids.add(user.getUser_id());
                ids.add(user.user_type.getUser_type_id());
                Integer pat_det_id= patient_detailsDao.returnPatientId(user.getUser_id());
                Integer doc_det_id= doctor_detailsDao.returnDoctorId(user.getUser_id());

                    ids.add(pat_det_id);
                    ids.add(doc_det_id);

                return ids;
            }
            else{
                return null;
            }

        }


    }
}

