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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sherwin.foodbox.model.box.Food;
import com.sherwin.foodbox.services.FoodItemService;

@RestController
@CrossOrigin("*")
@RequestMapping("/food")
public class FoodItemController {
	
	@Autowired
	private FoodItemService service;
	
	@PostMapping("/addFood")
	public Food addFood(@RequestBody Food food) {
		return service.addFood(food);
	}
	
	@GetMapping("/getFood/{fId}")
	public Food getFoodById(@PathVariable("fId") long fId) {
		return service.fetchByFid(fId);
	}
	
	@GetMapping("/getAllFood")
	public ResponseEntity<?> getAllFood() {
		return  ResponseEntity.ok(this.service.getAllFood());
	}
	
	@DeleteMapping("/deleteFood/{fId}")
	public void deleteFood(@PathVariable("fId") Long fId) {
		this.service.deleteQuiz(fId);
	}
	
	@PutMapping("/updateFood")
	public ResponseEntity<Food> update(@RequestBody Food food) {
		return ResponseEntity.ok(this.service.updateFood(food));
	}
}
