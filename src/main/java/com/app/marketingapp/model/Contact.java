package com.app.marketingapp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class Contact implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 6681519764594946711L;
	
	@XmlElement
	private String name;
	
	@XmlElement
	private String emailAddress;

	@XmlElement
	private String addressLine1;

	@XmlElement
	private String addressLine2;
	
	@XmlElement
	private String city;
	
	@XmlElement
	private String state;
	
	@XmlElement
	private String postalcode;
	
	@XmlElement
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}