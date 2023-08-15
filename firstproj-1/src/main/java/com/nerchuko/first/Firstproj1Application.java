package com.nerchuko.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication

public class Firstproj1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Firstproj1Application.class, args);
		Alien obj = context.getBean(Alien.class);
		obj.code();
	
	}

}
  