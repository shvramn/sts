package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Specialist;
import com.hospital.repository.SpecialistRepository;

@Service
public class SpecialistService {
	
	@Autowired
	private SpecialistRepository specialistRepository;

	public List<Specialist> getAllSpecialist() {
		return (List<Specialist>) specialistRepository.findAll();
	}

	public Specialist getSpecialistById(Long id) {
		return null;
	}

}
