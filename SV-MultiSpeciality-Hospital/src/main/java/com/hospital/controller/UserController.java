package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.User;
import com.hospital.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired
	private UserService userService;
	

	@GetMapping("test")
	public String test()
	{
		return "success";
	}
	
	@GetMapping
	public List<User> getAllUser()
	{
		return userService.getAllUser();
	}
}
