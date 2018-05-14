package com.app.marketingapp.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class CustomerDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6831053983913881923L;

	@XmlElement
	private String customerId;
	
	@XmlElement
	private List<Contact> contactDetailsList;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerid(String customerId) {
		this.customerId = customerId;
	}

	public List<Contact> getContactDetailsList() {
		return contactDetailsList;
	}

	public void setContactDetailsList(List<Contact> contactDetailsList) {
		this.contactDetailsList = contactDetailsList;
	}

}
