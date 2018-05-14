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
	private int customerid;
	
	@XmlElement
	private List<Contact> contactDetailsList;

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public List<Contact> getContactDetailsList() {
		return contactDetailsList;
	}

	public void setContactDetailsList(List<Contact> contactDetailsList) {
		this.contactDetailsList = contactDetailsList;
	}

}
