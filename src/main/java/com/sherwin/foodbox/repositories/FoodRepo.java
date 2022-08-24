package com.sherwin.foodbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sherwin.foodbox.model.box.Food;

public interface FoodRepo extends JpaRepository<Food, Long>{

}
