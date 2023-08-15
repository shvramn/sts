package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Appointment;
import com.hospital.service.AppointmentService;

@RestController
@RequestMapping("api/appointment")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;

	@GetMapping("test")
	public String test()
	{
		return "success";
	}
	

	@GetMapping
	public List<Appointment> getAllAppointment()
	{
		return appointmentService.getAllAppointment();
	}
}
