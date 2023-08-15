package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Doctor;
import com.hospital.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	public List<Doctor> getAllDoctor() {
		return (List<Doctor>) doctorRepository.findAll();
	}

	public Doctor getDoctorById(Long id) {
		return null;
	}

}
