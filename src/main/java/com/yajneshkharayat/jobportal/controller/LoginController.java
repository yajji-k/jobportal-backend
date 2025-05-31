package com.yajneshkharayat.jobportal.controller;

import org.springframework.web.bind.annotation.RestController;

import com.yajneshkharayat.jobportal.DTO.LoginRequest;
import com.yajneshkharayat.jobportal.DTO.LoginResponse;
import com.yajneshkharayat.jobportal.entity.User;
import com.yajneshkharayat.jobportal.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public LoginResponse postMethodName(@RequestBody LoginRequest request) {
		//TODO: process POST request
		LoginResponse response = new LoginResponse();
		
		String userName = request.getUsername();
		String passWord = request.getPassword();
		
		try {
			User user = userService.login(userName, passWord);
			
			response.setMessage("Welcome " + user.getUsername() + "!!");
			response.setStatus("Access Granted!");
			
		} catch (RuntimeException e) {
			response.setMessage(e.getMessage());
            response.setStatus("Access Denied!!");
		}
		
		return response;
	}
	

}
