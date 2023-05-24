package com.springboot.doctorApp.Dao;

import com.springboot.doctorApp.Schema.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByEmail(String email);

}