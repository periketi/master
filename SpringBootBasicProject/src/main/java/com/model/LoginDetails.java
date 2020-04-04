package com.model;

import org.springframework.stereotype.Component;

@Component
public class LoginDetails {
	
	private String loginId;
	private String loginName;
	private String loginPassword;
	
	public LoginDetails(){
		
	}
	public LoginDetails(String loginId, String loginName, String loginPassword) {
		super();
		this.loginId = loginId;
		this.loginName = loginName;
		this.loginPassword = loginPassword;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

}
