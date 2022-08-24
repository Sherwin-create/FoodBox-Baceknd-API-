package com.sherwin.foodbox.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sherwin.foodbox.model.User;
import com.sherwin.foodbox.services.UserService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) throws Exception {
		Optional<User> tempUsername = userService.fetchByUsername(user); 
		if(tempUsername.toString() == user.getUsername()) {
			throw new Exception("similar username found exception");
		}
		
		User returnUser = userService.saveUser(user);
		return returnUser;
		
	}
	
	@GetMapping("/allUser")
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/byUsername")
	public Optional<User> getById(@RequestBody User user) {
		return userService.fetchByUsername(user);
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		
		String username = user.getUsername();
		String password = user.getPassword();
		
		User data = userService.fetchUserbyUsernameAndPassword(username, password);
		if(data != null) {
			return data;
		}
		else {
			throw new Exception("Incorrect credentials");
		}
	}
}
