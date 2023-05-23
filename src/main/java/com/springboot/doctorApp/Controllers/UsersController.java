package com.springboot.doctorApp.Controllers;

import com.springboot.doctorApp.Schema.Users;
import com.springboot.doctorApp.Services.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class UsersController {
    @Autowired
    private UsersServiceImp userServiceImp;

    @PostMapping("/addUser")
    public Users addUser(@RequestBody Users user) {
        return userServiceImp.addUser(user);
    }

    @GetMapping("/getUser/{user_id}")
    public Optional<Users> getUser(@PathVariable int user_id)
    {
        return userServiceImp.getUser(user_id);
    }

//    @GetMapping("/getUser")
//    public List<User> getUser(){
//        return userServiceImp.getUser();
//    }

}