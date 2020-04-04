package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	private Integer accountId;
	private Integer accountName;
	
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getAccountName() {
		return accountName;
	}
	public void setAccountName(Integer accountName) {
		this.accountName = accountName;
	}
	

}
