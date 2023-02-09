package com.data.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.rest.config.JwtService;
import com.data.rest.entities.AuthRequest;
import com.data.rest.entities.UserInfo;
import com.data.rest.service.UserInfoService;


@RestController
@RequestMapping("/users")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/add")
	public String adduser(@RequestBody UserInfo userInfo) {
		return userInfoService.addUser(userInfo);
	}
	
	@PostMapping("/auth")
	public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		if(authentication.isAuthenticated()) {
			// We will generate the token in the JwtService class
			return jwtService.generateToken(authRequest.getUsername());	
		} else {
			throw new UsernameNotFoundException("Invalid User Request.");
		}
	}
}

