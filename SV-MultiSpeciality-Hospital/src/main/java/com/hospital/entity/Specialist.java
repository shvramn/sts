package com.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="specialist")
public class Specialist {
	
	@Id
	private Long id;
	
	private String specialistName;
	
	public Specialist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialist(Long id, String specialistName) {
		super();
		this.id = id;
		this.specialistName = specialistName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecialistName() {
		return specialistName;
	}

	public void setSpecialistName(String specialistName) {
		this.specialistName = specialistName;
	}
	
	


}
