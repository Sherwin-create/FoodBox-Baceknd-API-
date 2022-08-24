package com.sherwin.foodbox.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherwin.foodbox.model.box.Food;
import com.sherwin.foodbox.repositories.FoodRepo;

@Service
public class FoodItemService {
	
	@Autowired
	public FoodRepo foodRepo;
	
	public Food addFood(Food food) {
		return foodRepo.save(food);
	}
	
	public Set<Food> getAllFood() {
		return new HashSet<>(this.foodRepo.findAll());
	}
	
	public Food fetchByFid(long id) {
		return this.foodRepo.findById(id).get();
	}
	
	public void deleteQuiz(Long fId) {
		 this.foodRepo.deleteById(fId);
	}
	
	public Food updateFood(Food food) {
		return this.foodRepo.save(food);
	}
}
