package com.janitri.assignment.service;

import com.janitri.assignment.model.User;
import com.janitri.assignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        return (user != null && user.getPassword().equals(password)) ? user : null;
    }
}
