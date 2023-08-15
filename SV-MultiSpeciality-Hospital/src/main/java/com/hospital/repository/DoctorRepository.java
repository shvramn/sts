package com.hospital.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.entity.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
