package com.springboot.doctorApp.Services;

import com.springboot.doctorApp.Schema.Users;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    public Users addUser(Users user);

    public Optional<Users> getUser(int user_id);

//    public Users getUser();
}