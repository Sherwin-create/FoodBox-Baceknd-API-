package com.sherwin.foodbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sherwin.foodbox.model.box.Cusines;

public interface CusinesRepo extends JpaRepository<Cusines, Long> {
	
}
