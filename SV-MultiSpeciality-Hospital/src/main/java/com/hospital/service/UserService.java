package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.User;
import com.hospital.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	

	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

	public User getUserById(Long id) {
		return null;
	}

}
