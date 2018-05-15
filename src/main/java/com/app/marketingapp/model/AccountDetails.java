package com.app.marketingapp.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class AccountDetails implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 3337237843909844924L;
	@XmlElement
	private String accountId;
	
	@XmlElement
	private List<Account> accountDetailsList;
	
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public List<Account> getAccountDetailsList() {
		return accountDetailsList;
	}
	public void setAccountDetailsList(List<Account> accountDetailsList) {
		this.accountDetailsList = accountDetailsList;
	}
	
	
	
	
	
	

}
