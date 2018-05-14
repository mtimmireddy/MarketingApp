package com.app.marketingapp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7388546907334010182L;

	
	@XmlElement
	private String companyName;
	
	@XmlElement
	private String addressLine1;
	
	@XmlElement
	private String addressLine2;
	
	@XmlElement
	private String city;
	
	@XmlElement
	private String state;
	
	@XmlElement
	private String postalCode;
	
	@XmlElement
	private String country;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
