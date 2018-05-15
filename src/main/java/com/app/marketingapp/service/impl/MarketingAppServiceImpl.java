package com.app.marketingapp.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import com.app.marketingapp.dao.MarketingAppDao;
import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.AccountDetails;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.model.CustomerDetails;
import com.app.marketingapp.service.MarketingAppService;

public class MarketingAppServiceImpl implements MarketingAppService {
	
	@Inject
	MarketingAppDao marketingAppDao;

	@Override
	public List<Contact> getCustomerDetails(String customerId) {
		if(!customerId.equals(null)) {
			
			marketingAppDao.getCustomerDetails(customerId);
			
		}
		return marketingAppDao.getCustomerDetails(customerId);
	}
	

	@Override
	public List<Account> getAccountDetails(String accountId) {
		if(!accountId.equals(null)) {
			marketingAppDao.getAccountDetails(accountId);
			
		}
		
		return marketingAppDao.getAccountDetails(accountId);
	}

	@Override
	public Boolean updateCustomerDetails(String customerId, List<Contact> customerDetailsList) {
		// please see attached documentation for approach
		return null;
	}

	@Override
	public Boolean createCustomerDetails(List<Contact> customerDetailsList) {
		//  please see attached documentation for approach
		return null;
	}


	@Override
	public Boolean updateAccountDetails(String accountId, List<Account> accountDetailsList) {
		//  please see attached documentation for approach
		return null;
	}

	@Override
	public Boolean createAccountDetails(List<Account> accountDetailsList) {
		//  please see attached documentation for approach
		return null;
	}

}
