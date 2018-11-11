package com.example.myproject.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.myproject.ApplicationTestsModel;
import com.example.myproject.domain.User;

public class UserServiceTest extends ApplicationTestsModel{

	@Autowired
	private UserService userService;
	
	@Test
	public void getUserById() {
		User user = userService.getUserById(1);
	}
}
