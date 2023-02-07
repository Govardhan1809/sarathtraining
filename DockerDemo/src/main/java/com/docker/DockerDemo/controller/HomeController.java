package com.docker.DockerDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/send/{name}")
	public String sendingMsg(@PathVariable String name) {
		
		return "Happy newyear"+ name;
		
	}
	

}
