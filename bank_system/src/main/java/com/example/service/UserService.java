package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.mappr.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public User login(String id,String password) {
		return userDao.login(id, password);
	}
}
