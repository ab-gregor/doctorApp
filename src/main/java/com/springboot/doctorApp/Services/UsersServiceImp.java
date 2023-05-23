package com.springboot.doctorApp.Services;

import com.springboot.doctorApp.Dao.UsersDao;
import com.springboot.doctorApp.Schema.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UsersServiceImp implements UsersService{
    @Autowired
    private UsersDao usersDao;
    @Override
    public String addUser(Users user) {
        usersDao.save(user);
        return "User added successfully";
    }

//    @Override
//    public Users getUser() {
//        return usersDao.findAll();
//    }
}