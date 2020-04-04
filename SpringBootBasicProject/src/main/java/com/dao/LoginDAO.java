package com.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.model.LoginDetails;

@Repository
public class LoginDAO {

	static Map<String, LoginDetails> loginMap = new HashMap<String, LoginDetails>();

	static {

		loginMap.put("1", new LoginDetails("1", "RAVISHANKAR","TEST"));
		loginMap.put("2", new LoginDetails("2", "NAGASRI", "TEST"));
		loginMap.put("3", new LoginDetails("3", "ISHANVI", "TEST"));
		loginMap.put("4", new LoginDetails("4", "TAMANVI", "TEST"));

	}

	public Map<String, LoginDetails> getLoginDetails(){
		return this.loginMap;
	}
	public LoginDetails getLoginDetails(String id) {
		System.out.println("id==dao===>" + id);
		System.out.println("this.loginMap==dao===>" + this.loginMap);

		return this.loginMap.get(id);
	}

}
