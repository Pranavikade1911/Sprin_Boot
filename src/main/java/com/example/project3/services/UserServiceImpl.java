package com.example.project3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project3.model.User;
import com.example.project3.repository.UserRepository;

@Service
public class UserServiceImpl implements com.example.project3.services.UserService {

     @Autowired
     UserRepository obj;

     @Override
     public User addUser(User user) {
         return obj.save(user);
     }
     
     @Override
     public List<User> getAllUsers() {
         return obj.findAll();
     }
}
