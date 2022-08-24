package com.sherwin.foodbox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherwin.foodbox.model.Admin;
import com.sherwin.foodbox.repositories.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	public AdminRepo repo;
	
	public Admin fetchAdminByAdminNameAndPassword(String adminName, String password) {
		Admin data = repo.findByAdminNameAndPassword(adminName, password);
		return data;
	}
}
