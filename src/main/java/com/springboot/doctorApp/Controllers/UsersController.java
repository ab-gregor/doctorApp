package com.springboot.doctorApp.Controllers;

import com.springboot.doctorApp.Schema.Users;
import com.springboot.doctorApp.Services.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:3000")
public class UsersController {
    @Autowired
    private UsersServiceImp userServiceImp;

    @PostMapping("/addUser")
    public Users addUser(@RequestBody Users user) {
        return userServiceImp.addUser(user);
    }

//    @GetMapping("/getUser")
//    public List<User> getUser(){
//        return userServiceImp.getUser();
//    }

}