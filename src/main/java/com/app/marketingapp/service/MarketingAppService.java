package com.app.marketingapp.service;

import java.util.List;

import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.AccountDetails;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.model.CustomerDetails;

public interface MarketingAppService {
	
	List<Contact> getCustomerDetails(String customerId);
	
	CustomerDetails updateCustomerDetails(String customerId, List<Contact> customerDetailsList);
	
	CustomerDetails createCustomerDetails(List<Contact> customerDetailsList);
	
	List<Account> getAccountDetails(String accountId);
	
	AccountDetails updateAccountDetails(String accountId, List<Account> accountDetailsList);
	
	AccountDetails createAccountDetails(List<Account> accountDetailsList);
	

}
