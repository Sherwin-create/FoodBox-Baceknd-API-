package com.sherwin.foodbox.model.box;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="food")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long fId;
	
	@Column(nullable = false, unique = true, length = 45)
	private String fName;
	
	@Column(nullable = false, length = 255)
	private String fDescription;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Cusines cusines;
	
	@Column(nullable = false,length = 10)
	private String price;

	private String img;
	
	private boolean isEnabled;
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(long fId, String fName, String fDescription, Cusines cusines, String price,String img,boolean isEnabled) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.fDescription = fDescription;
		this.cusines = cusines;
		this.price = price;
		this.img = img;
		this.isEnabled = isEnabled;
	}

	public long getfId() {
		return fId;
	}

	public void setfId(long fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfDescription() {
		return fDescription;
	}

	public void setfDescription(String fDescription) {
		this.fDescription = fDescription;
	}

	public Cusines getCusines() {
		return cusines;
	}

	public void setCusines(Cusines cusines) {
		this.cusines = cusines;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	
}
