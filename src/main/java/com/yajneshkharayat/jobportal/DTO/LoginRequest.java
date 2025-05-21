package com.yajneshkharayat.jobportal.DTO;

public class LoginRequest {
	
	private String Username;
	private String Password;
	
//	bellow constructor is not needed because spring uses Jackson which automatically creates empty 
//	Objects of the class and adds the values to it
//	if argument constructor is defined then create and empty constructor also with no arguments for Jackson to use
//	LoginRequest(String Username, String Password){
//		this.Username = Username;
//		this.Password = Password;
//	}
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
