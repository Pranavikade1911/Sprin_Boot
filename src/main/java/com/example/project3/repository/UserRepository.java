package com.example.project3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project3.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
     
}
