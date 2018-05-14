package com.app.marketingapp.service;

import java.util.List;

import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.AccountDetails;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.model.CustomerDetails;

public interface MarketingAppService {
	
	CustomerDetails getCustomerDetails(int customerId);
	
	CustomerDetails updateCustomerDetails(int customerId, List<Contact> customerDetailsList);
	
	CustomerDetails createCustomerDetails(List<Contact> customerDetailsList);
	
	AccountDetails getAccountDetails(int accountId);
	
	AccountDetails updateAccountDetails(int accountId, List<Account> accountDetailsList);
	
	AccountDetails createAccountDetails(List<Account> accountDetailsList);
	

}
