package com.yajneshkharayat.jobportal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yajneshkharayat.jobportal.entity.User;
import com.yajneshkharayat.jobportal.repository.UserRepository;
import com.yajneshkharayat.jobportal.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User login(String username, String password) {
		Optional<User> userList = userRepository.findByUsername(username);
		
		if(userList.isPresent()) {
			User user = userList.get();
			if(user.getPassword().equals(password)) {
				return user;
			}else {
                throw new RuntimeException("Invalid password");
			}
		}else {
            throw new RuntimeException("User not found");
		}			
	}

}
