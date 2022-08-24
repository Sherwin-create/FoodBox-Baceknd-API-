package com.sherwin.foodbox.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherwin.foodbox.model.User;
import com.sherwin.foodbox.repositories.UserRepo;

@Service
public class UserService {

	@Autowired
	public UserRepo userRepo;
	
	public User saveUser(User user) {
		Optional<User> tempUsername = userRepo.findByUsername(user.getUsername());
		if(tempUsername.toString() != user.getUsername()) {
			
		}
		return userRepo.save(user);
	}
	
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	public Optional<User> fetchByUsername(User user) {
		return userRepo.findByUsername(user.getUsername());
	}
	
	public User fetchUserbyUsernameAndPassword(String username , String password) {
		User data =  userRepo.findByUsernameAndPassword(username, password);
			return data;	
	}
}
