package com.example.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.dao.UserMapper;
import com.example.myproject.domain.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}
}
