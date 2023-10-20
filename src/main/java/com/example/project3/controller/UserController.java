package com.example.project3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.project3.model.User;
// import com.example.project3.services.UserService;
import com.example.project3.services.UserServiceImpl;

@Controller
public class UserController {

     @Autowired
     UserServiceImpl obj1;

     @GetMapping("/index")
     public String index(){
          return "index";
     }

     @PostMapping("/index")
     public String addUser(@ModelAttribute User b) {
          obj1.addUser(b);
          System.out.println("User Added");
          return "index";
     }

     @GetMapping("/users")
     public String showAllUsers(Model model) {
          List<User> users = obj1.getAllUsers();
          model.addAttribute("users", users);
          return "users";
     }
}
