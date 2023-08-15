package com.hospital.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
