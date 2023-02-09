package com.data.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.data.rest.dao.UserInfoRepository;
import com.data.rest.entities.UserInfo;

@Service
public class UserInfoService {
	
	@Autowired
	private UserInfoRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public String addUser(UserInfo userInfo) {
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		
		repository.save(userInfo);
		return "User added in the system.";
	}

}
