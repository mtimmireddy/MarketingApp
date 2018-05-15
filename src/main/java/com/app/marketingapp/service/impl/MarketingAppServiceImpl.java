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
		if(!customerId.isEmpty()) {
			
			marketingAppDao.getCustomerDetails(customerId);
			
		}
		return marketingAppDao.getCustomerDetails(customerId);
	}

	@Override
	public CustomerDetails updateCustomerDetails(String customerId, List<Contact> customerDetailsList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDetails createCustomerDetails(List<Contact> customerDetailsList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDetails getAccountDetails(String accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDetails updateAccountDetails(String accountId, List<Account> accountDetailsList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDetails createAccountDetails(List<Account> accountDetailsList) {
		// TODO Auto-generated method stub
		return null;
	}

}
