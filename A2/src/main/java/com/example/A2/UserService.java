package com.example.A2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers(){
    	return userRepository.findAll();
    }
    public User getUserById(Long id) {
    	return userRepository.findById(id).orElse(null);
    }
    
}
