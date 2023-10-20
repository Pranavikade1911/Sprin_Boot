package com.example.project3.services;

import java.util.List;

import com.example.project3.model.User;

public interface UserService {
     public User addUser(User user);
     public List<User> getAllUsers();    
}
