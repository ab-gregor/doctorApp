package com.springboot.doctorApp.Dao;

import com.springboot.doctorApp.Schema.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByEmail(String email);
}