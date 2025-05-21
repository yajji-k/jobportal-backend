package com.yajneshkharayat.jobportal.controller;

import org.springframework.web.bind.annotation.RestController;

import com.yajneshkharayat.jobportal.DTO.LoginRequest;
import com.yajneshkharayat.jobportal.DTO.LoginResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class LoginController {
	
	@PostMapping("/login")
	public LoginResponse postMethodName(@RequestBody LoginRequest request) {
		//TODO: process POST request
		LoginResponse response = new LoginResponse();
		
		String dummyUsername = new String("admin");
		String dummyPassword = new String("admin");
		
		String userName = request.getUsername();
		String passWord = request.getPassword();
		
		if(userName.equals(dummyUsername) && passWord.equals(dummyPassword)) {
			response.setMessage("User Authorized");
			response.setStatus("Access Granted");
		}else {
			response.setMessage("User Invalid");
			response.setStatus("Access Denied");
		}
		return response;
	}
	

}
