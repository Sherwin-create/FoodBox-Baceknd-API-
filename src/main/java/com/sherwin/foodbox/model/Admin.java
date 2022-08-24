package com.sherwin.foodbox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Column(nullable = false, unique = true, length = 45)
	private String adminName;
	
	@Column(nullable = false, unique = true, length = 45)
	private String password;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Admin(String adminName, String password, Long id) {
		super();
		this.adminName = adminName;
		this.password = password;
		this.id = id;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAdminName() {
		return adminName;
	}
	
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
