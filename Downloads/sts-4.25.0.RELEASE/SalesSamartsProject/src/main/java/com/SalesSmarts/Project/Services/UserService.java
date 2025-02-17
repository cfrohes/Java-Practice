package com.SalesSmarts.Project.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.SalesSmarts.Project.Entites.Users;
import com.SalesSmarts.Project.Repositories.UserRepository;
	
@Service
public class UserService {

	    private final UserRepository userRepository;
	    private final BCryptPasswordEncoder passwordEncoder;

	    @Autowired
	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	        this.passwordEncoder = new BCryptPasswordEncoder();
	    }

	    public Users registerUser(Users user) {
	        // Check if username or email already exists
	        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
	            throw new RuntimeException("Username is already taken");
	        }

	        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
	            throw new RuntimeException("Email is already registered");
	        }

	        // Encode password before saving
	        user.setPassword(passwordEncoder.encode(user.getPassword()));

	        // Save the user
	        return userRepository.save(user);
	    }
	}

