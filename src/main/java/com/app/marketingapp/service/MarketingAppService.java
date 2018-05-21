package com.app.marketingapp.service;

import java.util.List;

import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.model.IncomingAccountInfoPayload;
import com.app.marketingapp.model.IncomingCustomerContactPayload;

public interface MarketingAppService {
	
	List<Contact> getCustomerDetails(String id);
	
	Boolean updateCustomerDetails(String id, IncomingCustomerContactPayload incomingCustomerPayload);
	
	Boolean createCustomerDetails(IncomingCustomerContactPayload incomingCustomerPayload);
	
	List<Account> getAccountDetailsByCustomerId(String id);
	
	List<Account> getAccountDetailsByCompanyName(String companyName);
	
	
	Boolean updateAccountDetails(String companyName, IncomingAccountInfoPayload incomingAccountInfoPayload);
	
	Boolean createAccountDetails(IncomingAccountInfoPayload incomingAccountInfoPayload);
	

}
