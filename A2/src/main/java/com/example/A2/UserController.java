package com.example.A2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
     @Autowired
     private UserService userService;
     @GetMapping("/users")
     public List<User> getAllUsers(){
    	 return userService.getAllUsers();
     }
     @GetMapping("/users/{id}")
     public User getUserById(@PathVariable Long id) {
    	 return userService.getUserById(id);
     }
}
