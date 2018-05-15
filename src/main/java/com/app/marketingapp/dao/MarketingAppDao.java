package com.app.marketingapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.AccountDetails;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.model.CustomerDetails;
import com.app.marketingapp.model.IncomingAccountInfoPayload;


@Repository
public class MarketingAppDao {
	
	private static final Logger logger = LoggerFactory.getLogger(MarketingAppDao.class);
	
	 public List<Contact> getCustomerDetails(String customerId) {
		 List<Contact> customerDetailsList = new ArrayList<Contact>();
		
		 HashMap<String, List<Contact>> customerDetailsMap = new HashMap<String, List<Contact>>();
		 CustomerDetails customerdetails = new CustomerDetails();
		 Contact contact = new Contact();
		 contact.setName(contact.getName());
		 contact.setEmailAddress(contact.getEmailAddress());
		 contact.setAddressLine1(contact.getAddressLine1());
		 contact.setAddressLine2(contact.getAddressLine2());
		 contact.setCity(contact.getCity());
		 contact.setState(contact.getState());
		 contact.setCountry(contact.getCountry());
		 customerDetailsList.add(contact);
		 
		 customerdetails.setCustomerid(contact.getId());
		 customerdetails.setContactDetailsList(customerDetailsList);
		 
		 customerDetailsMap.put(contact.getId(), customerDetailsList);
		 
		 
		 return customerDetailsMap.get(contact.getId());
		 
	 }
	
	 public List<Account> getAccountDetails(String accountId) {
		 
		 HashMap<String, List<Account>> accountDetailsMap = new HashMap<String, List<Account>>();
		 List<Account> accountDetailsList = new ArrayList<Account>();
		 AccountDetails accountDetails = new AccountDetails();
		 
		 Account account = new Account();
		 account.setAddressLine1(IncomingAccountInfoPayload.getAddressLine1());
		 account.setAddressLine2(IncomingAccountInfoPayload.getAddressLine2());
		 account.setCity(IncomingAccountInfoPayload.getCity());
		 account.setState(IncomingAccountInfoPayload.getState());
		 account.setPostalCode(IncomingAccountInfoPayload.getPostalCode());
		 account.setCountry(IncomingAccountInfoPayload.getCountry());
		 
		 accountDetailsList.add(account);
		 accountDetails.setAccountId(account.getAccountId());
		 accountDetails.setAccountDetailsList(accountDetailsList);
		 accountDetailsMap.put(account.getAccountId(), accountDetailsList);
		 
		 
		 return accountDetailsMap.get(account.getAccountId());
		 
	 }

}
