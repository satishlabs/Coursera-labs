package com.satishlabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satishlabs.model.User;
import com.satishlabs.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/hi")
	public String message() {
		return "Welcome ";
	}
	
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		userRepository.save(user);
		return "Hi "+ user.getName()+" Your registration is completed";
	}
	
	@GetMapping("/getAllUsers")
	public List<User> findAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/findUser/{email}")
	public List<User> findUser(@PathVariable String email){
		return userRepository.findByEmail(email);
	}
}
