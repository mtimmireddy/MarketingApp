package com.app.marketingapp.dao;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import com.app.marketingapp.model.Account;
import com.app.marketingapp.model.Contact;
import com.app.marketingapp.service.impl.MarketingAppServiceImpl;


public class MarketingAppServiceImplTest {
	
	@InjectMocks
	MarketingAppServiceImpl marketingServiceImpl;
	
	@Before
	public void setup() {
		HashMap<String, List<Account>> accountDetailsMap = new HashMap<String, List<Account>>();
		HashMap<String, List<Contact>> customerDetailsMap = new HashMap<String, List<Contact>>();
		HashMap<String, List<Account>> accountMapWithContact = new HashMap<String, List<Account>>();
		List<Contact> customerDetailsList = new ArrayList<Contact>();
        List<Account> accountDetailsList = new ArrayList<Account>();
		
		
		
		Contact contact = new Contact();
		contact.setName("Adam");
		contact.setEmailAddress("adam@test.com");
		contact.setAddressLine1("2345 Dulles Station Blvd");
		contact.setAddressLine2("Apt# 2415");
		contact.setCity("Herndon");
		contact.setState("VA");
		contact.setCountry("USA");
		customerDetailsList.add(contact);
		
		
		Account account = new Account();
		account.setId("1234");
		account.setCompanyName("Microsoft");
		account.setAddressLine1("1 Microsoft Way");
		account.setAddressLine2("Suite 22 A");
		account.setCity("Redmond");
		account.setState("WA");
		account.setPostalCode("98045");
		account.setCountry("USA");
		accountDetailsList.add(account);
	}
	
	@Test
	public void getAccountDetails(){
		List<Account> expectedAccountList = new ArrayList<Account>();
		expectedAccountList = marketingServiceImpl.getAccountDetailsByCustomerId("1234");
	
		assertNotNull(expectedAccountList);
	
		
	}

}
