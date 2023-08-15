package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Doctor;
import com.hospital.service.DoctorService;

@RestController
@RequestMapping("api/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	

	@GetMapping("test")
	public String test()
	{
		return "success";
	}
	

	@GetMapping
	public List<Doctor> getAllDoctor()
	{
		return doctorService.getAllDoctor();
	}
}
