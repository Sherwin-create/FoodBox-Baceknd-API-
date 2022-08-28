package com.sherwin.foodbox.services;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherwin.foodbox.model.box.Cusines;
import com.sherwin.foodbox.repositories.CusinesRepo;

@Service
public class CusinesService {
	
	@Autowired
	public CusinesRepo repo;
	
	public Cusines addCusine(Cusines cusine) {
		return repo.save(cusine);
	}
	
	public Cusines updateCusines(Cusines cusine) {
		return repo.save(cusine);
	}
	
	public void deleteCusineById(Long cId) {
		this.repo.deleteById(cId);
	}
	
	public Set<Cusines> getCusines() {
		return new LinkedHashSet<>(this.repo.findAll());
	}
}
