package com.sherwin.foodbox.model.box;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cusines")
public class Cusines {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cId;
	
	@Column(nullable = false, unique = true, length = 45)
	private String cName;
	
	private String description;
	
	@OneToMany(mappedBy = "cusines",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Food> food = new LinkedHashSet<>()	;
	
	public Cusines() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cusines(long cId, String cName, String description, Set<Food> food) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.description = description;
		this.food = food;
	}

	public long getcId() {
		return cId;
	}

	public void setcId(long cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Food> getFood() {
		return food;
	}

	public void setFood(Set<Food> food) {
		this.food = food;
	}
	
	
}
