package com.hospital.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.entity.Specialist;

public interface SpecialistRepository extends CrudRepository<Specialist, Long> {

}
