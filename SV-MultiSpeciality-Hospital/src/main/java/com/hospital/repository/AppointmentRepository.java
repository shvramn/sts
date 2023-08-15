package com.hospital.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.entity.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}
