package com.app.marketingapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.app.marketingapp.dao.MarketingAppDao;
import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.model.IncomingAccountInfoPayload;
import com.app.marketingapp.model.IncomingCustomerContactPayload;
import com.app.marketingapp.service.MarketingAppService;

public class MarketingAppServiceImpl implements MarketingAppService {
	
	@Inject
	MarketingAppDao marketingAppDao;

	@Override
	public List<Contact> getCustomerDetails(String id) {
		List<Contact> customersList = new ArrayList<Contact>();
		customersList = marketingAppDao.getCustomerDetails(id);
		
		return customersList;
	
	}
	

	
	@Override
	public Boolean updateCustomerDetails(String id, IncomingCustomerContactPayload incomingCustomerPayload) {
		Boolean isUpdateCustomerDetailsSuccess = true;
		isUpdateCustomerDetailsSuccess = marketingAppDao.updateCustomerDetails(id, incomingCustomerPayload);
		return isUpdateCustomerDetailsSuccess;
	}

	@Override
	public Boolean createCustomerDetails(IncomingCustomerContactPayload incomingCustomerPayload) {
		Boolean isCreateCustomerDetailsSuccess = true;
		isCreateCustomerDetailsSuccess =  marketingAppDao.createCustomerDetails(incomingCustomerPayload);
		return isCreateCustomerDetailsSuccess;
	}


	@Override
	public Boolean updateAccountDetails(String companyName, IncomingAccountInfoPayload incomingAccountInfoPayload) {
		Boolean isUpdateAccountDetailsSuccess = true ;
		isUpdateAccountDetailsSuccess = marketingAppDao.updateAccountDetails(companyName, incomingAccountInfoPayload);
		return isUpdateAccountDetailsSuccess;
	}

	@Override
	public Boolean createAccountDetails(IncomingAccountInfoPayload incomingAccountInfoPayload) {
		Boolean isCreateAccountDetailsSuccess = true;
		isCreateAccountDetailsSuccess = marketingAppDao.createAccountDetails(incomingAccountInfoPayload);
		return isCreateAccountDetailsSuccess;
	}


	@Override
	public List<Account> getAccountDetailsByCustomerId(String id) {
		List<Account> accountList = new ArrayList<Account>();
		accountList = marketingAppDao.getAccountDetailsByCustomerId(id);
		return accountList;
	}



	@Override
	public List<Account> getAccountDetailsByCompanyName(String companyName) {
	   List<Account> accountList = new ArrayList<Account>();
	   accountList = marketingAppDao.getAccountDetailsByCompanyName(companyName);
	   
		return accountList;
	}

}
