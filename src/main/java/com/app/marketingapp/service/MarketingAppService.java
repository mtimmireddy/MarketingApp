package com.app.marketingapp.service;

import java.util.List;

import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.Contact;

public interface MarketingAppService {
	
	List<Contact> getCustomerDetails(String customerId);
	
	Boolean updateCustomerDetails(String customerId, List<Contact> customerDetailsList);
	
	Boolean createCustomerDetails(List<Contact> customerDetailsList);
	
	List<Account> getAccountDetails(String accountId);
	
	Boolean updateAccountDetails(String accountId, List<Account> accountDetailsList);
	
	Boolean createAccountDetails(List<Account> accountDetailsList);
	

}
