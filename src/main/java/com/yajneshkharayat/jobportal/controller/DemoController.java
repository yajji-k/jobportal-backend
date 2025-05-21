package com.yajneshkharayat.jobportal.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController // Tells the Spring to tell this class as a Rest/Web Controller and to Serialise return Values to json
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping
	public String sayHello() {
		return new String("Hello! Welcome to my Job Portal Project Backend Using Spring Boot.");
	}
	
}
