package com.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.LoginController;
import com.model.LoginDetails;

@Service
public class LoginService {

	@Autowired
	LoginController controller;
	
	public Map<String, LoginDetails> getLoginDetails() {
		return controller.getLoginDetails();
	}
	public LoginDetails getLoginDetails(String id) {
		return controller.getLoginDetails(id);
	}

}
