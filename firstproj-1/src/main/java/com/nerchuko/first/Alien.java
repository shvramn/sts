package com.nerchuko.first;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
@Component
public class Alien {
	
	@Autowired
	Laptop lap;
	
	public void code()
	{
		lap.compile();
	}

}
