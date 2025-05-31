package com.yajneshkharayat.jobportal.service;

import com.yajneshkharayat.jobportal.entity.User;

public interface UserService {
	User login(String username, String password);
}
