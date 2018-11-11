package com.example.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.domain.User;
import com.example.myproject.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUserById")
	public String getUserById() {
		User user = userService.getUserById(1);
		return user.getUsername();
	}
}
