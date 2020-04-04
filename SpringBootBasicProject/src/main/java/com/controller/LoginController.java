package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dao.LoginDAO;
import com.model.LoginDetails;

@Controller
public class LoginController {

	@Autowired
	LoginDAO logindao;
	
	public Map<String, LoginDetails> getLoginDetails() {
		return logindao.getLoginDetails();		
	}
	
	public LoginDetails getLoginDetails(String id) {
		return logindao.getLoginDetails(id);		
	}

}
