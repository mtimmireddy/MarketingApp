package com.app.marketingapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.AccountDetails;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.model.CustomerDetails;
import com.app.marketingapp.model.IncomingAccountInfoPayload;
import com.app.marketingapp.model.IncomingCustomerContactPayload;

@Repository
public class MarketingAppDao {

	private static final Logger logger = LoggerFactory.getLogger(MarketingAppDao.class);

	HashMap<String, List<Account>> accountDetailsMap = new HashMap<String, List<Account>>();
	HashMap<String, List<Contact>> customerDetailsMap = new HashMap<String, List<Contact>>();
	HashMap<String, List<Account>> accountMapWithContact = new HashMap<String, List<Account>>();
	List<Contact> customerDetailsList = new ArrayList<Contact>();
	// CustomerDetails customerdetails = new CustomerDetails();
	List<Account> accountDetailsList = new ArrayList<Account>();
	AccountDetails accountDetails = new AccountDetails();

	public Boolean createCustomerDetails(IncomingCustomerContactPayload incomingCustomerPayload) {

		Boolean isCreateCustomerSuccess = true;

		if (incomingCustomerPayload != null) {

			Contact contact = new Contact();
			contact.setName(incomingCustomerPayload.getName());
			contact.setEmailAddress(incomingCustomerPayload.getEmailAddress());
			contact.setAddressLine1(incomingCustomerPayload.getAddressLine1());
			contact.setAddressLine2(incomingCustomerPayload.getAddressLine2());
			contact.setCity(incomingCustomerPayload.getCity());
			contact.setState(incomingCustomerPayload.getState());
			contact.setCountry(incomingCustomerPayload.getCountry());
			customerDetailsList.add(contact);

			customerDetailsMap.put(contact.getId(), customerDetailsList);

		}

		return isCreateCustomerSuccess;

	}

	public Boolean createAccountDetails(IncomingAccountInfoPayload incomingAccountInfoPayload) {

		Boolean isCreateAccountSuccess = true;

		if (incomingAccountInfoPayload != null) {

			Account account = new Account();
			Contact contact = new Contact();

			account.setId(incomingAccountInfoPayload.getId());
			account.setAddressLine1(incomingAccountInfoPayload.getAddressLine1());
			account.setAddressLine2(incomingAccountInfoPayload.getAddressLine2());
			account.setCity(incomingAccountInfoPayload.getCity());
			account.setState(incomingAccountInfoPayload.getState());
			account.setPostalCode(incomingAccountInfoPayload.getPostalCode());
			account.setCountry(incomingAccountInfoPayload.getCountry());
			account.setCompanyName(incomingAccountInfoPayload.getCompanyName());

			accountDetailsList.add(account);

			if (account.getId().equals(contact.getId())) {
				accountMapWithContact.put(contact.getId(), accountDetailsList);

			} else {
				accountDetailsMap.put(account.getCompanyName(), accountDetailsList);
			}

		}

		return isCreateAccountSuccess;

	}

	public List<Contact> getCustomerDetails(String id) {
		List<Contact> customerList = new ArrayList<Contact>();
		for (String key : customerDetailsMap.keySet()) {
			if (key.equals(id)) {
				customerList = customerDetailsMap.get(id);
			} else {
				logger.error("No entry exists with given customer id");
			}
		}

		return customerList;

	}

	public List<Account> getAccountDetailsByCompanyName(String companyName) {
		List<Account> accountList = new ArrayList<Account>();
		for (String key : accountDetailsMap.keySet()) {
			if (key.equals(companyName)) {
				accountList = accountDetailsMap.get(companyName);
			} else {
				logger.error("No entry exists with given customer id");
			}

		}
		return accountList;

	}

	public List<Account> getAccountDetailsByCustomerId(String id) {
		List<Account> accountList = new ArrayList<Account>();

		for (String key : accountMapWithContact.keySet()) {
			if (key.equals(id)) {
				accountList = accountDetailsMap.get(id);
			}
		}

		return accountList;

	}

	public Boolean updateCustomerDetails(String id, IncomingCustomerContactPayload incomingCustomerPayload) {
		Boolean isCustomerDetailUpdateSuccess = true;

		Contact contact = new Contact();
		contact.setName(incomingCustomerPayload.getName());
		contact.setEmailAddress(incomingCustomerPayload.getEmailAddress());
		contact.setAddressLine1(incomingCustomerPayload.getAddressLine1());
		contact.setAddressLine2(incomingCustomerPayload.getAddressLine2());
		contact.setCity(incomingCustomerPayload.getCity());
		contact.setState(incomingCustomerPayload.getState());
		contact.setCountry(incomingCustomerPayload.getCountry());
		customerDetailsList.add(contact);

		for (String key : customerDetailsMap.keySet()) {
			if (key.equals(id)) {
				customerDetailsMap.put(id, customerDetailsList);
			}
		}

		return isCustomerDetailUpdateSuccess;

	}

	public Boolean updateAccountDetails(String companyName, IncomingAccountInfoPayload incomingAccountInfoPayload) {
		boolean isUpdateAccountDetailsSuccess = true;

		Account account = new Account();
		account.setId(incomingAccountInfoPayload.getId());
		account.setAddressLine1(incomingAccountInfoPayload.getAddressLine1());
		account.setAddressLine2(incomingAccountInfoPayload.getAddressLine2());
		account.setCity(incomingAccountInfoPayload.getCity());
		account.setState(incomingAccountInfoPayload.getState());
		account.setPostalCode(incomingAccountInfoPayload.getPostalCode());
		account.setCountry(incomingAccountInfoPayload.getCountry());

		for (String key : accountDetailsMap.keySet()) {
			if (key.equals(companyName)) {
				accountDetailsMap.put(companyName, accountDetailsList);
			}
		}
		return isUpdateAccountDetailsSuccess;
	}

}
