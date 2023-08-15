package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Appointment;
import com.hospital.repository.AppointmentRepository;

@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public List<Appointment> getAllAppointment() {
		return (List<Appointment>) appointmentRepository.findAll();
	}

	public Appointment getAppointmentById(Long id) {
		return null;
	}

}
