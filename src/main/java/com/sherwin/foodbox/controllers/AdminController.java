package com.sherwin.foodbox.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sherwin.foodbox.model.Admin;
import com.sherwin.foodbox.model.box.Cusines;
import com.sherwin.foodbox.services.AdminService;
import com.sherwin.foodbox.services.CusinesService;

@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private CusinesService cusineService;
	
	@PostMapping("/adminLogin")
	public Admin loginAdmin(@RequestBody Admin admin) throws Exception {
		String adminName = admin.getAdminName();
		String password = admin.getPassword();
		
		Admin data = adminService.fetchAdminByAdminNameAndPassword(adminName, password);
		if(data != null) {
			return data;
		}
		else {
			throw new Exception("Incorrect credentials");
		}
	}
	
	@PostMapping("/addCusine")
	public void addCusines(@RequestBody Cusines cusine) {
		cusine.getcName();
		cusine.getDescription(); 
		cusineService.addCusine(cusine);
	}
	
	@DeleteMapping("/deleteCusine/{cId}")
	public void deleteCuisine(@PathVariable("cId") Long cId) {
		cusineService.deleteCusineById(cId);
	}
	
	@GetMapping("/getCusines") 
	public ResponseEntity<?> getCategories() {
		return ResponseEntity.ok(this.cusineService.getCusines());
	}
	
	@PutMapping("/updateCusine")
	public void updateCusines(@RequestBody Cusines cusine) {
		cusineService.updateCusines(cusine);
	}
}
