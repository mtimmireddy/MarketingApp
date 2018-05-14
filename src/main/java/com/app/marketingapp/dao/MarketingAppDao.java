package com.app.marketingapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.app.marketingapp.model.Contact;
import com.app.marketingapp.model.CustomerDetails;


@Repository
public class MarketingAppDao {
	
	private static final Logger logger = LoggerFactory.getLogger(MarketingAppDao.class);
	
	 public HashMap<String, List<Contact>> getCustomerDetails(int customerId) {
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
		 
		 
		return customerDetailsMap;
		 
	 }
	

}
