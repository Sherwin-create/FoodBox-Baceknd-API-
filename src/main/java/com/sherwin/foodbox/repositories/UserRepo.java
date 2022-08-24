package com.sherwin.foodbox.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sherwin.foodbox.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
	   Optional<User> findByUsername(String username);
	   User findByUsernameAndPassword(String username, String password);
}
