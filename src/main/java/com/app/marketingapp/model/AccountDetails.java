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
	private int accountId;
	
	@XmlElement
	private List<Account> accountDetailsList;
	
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public List<Account> getAccountDetailsList() {
		return accountDetailsList;
	}
	public void setAccountDetailsList(List<Account> accountDetailsList) {
		this.accountDetailsList = accountDetailsList;
	}
	
	
	
	
	
	

}
