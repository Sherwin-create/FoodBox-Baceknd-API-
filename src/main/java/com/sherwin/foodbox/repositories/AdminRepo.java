package com.sherwin.foodbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sherwin.foodbox.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long>{
	Admin findByAdminNameAndPassword(String adminName, String password);
}
