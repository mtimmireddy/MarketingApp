package com.app.marketingapp.model;

import java.io.Serializable;

public class IncomingAccountInfoPayload implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static String accountId;

	private static String companyName;

	private static String addressLine1;

	private static String addressLine2;

	private static String city;

	private static String state;

	private static String postalCode;

	private static String country;
	
	

	public static String getAccountId() {
		return accountId;
	}

	public static void setAccountId(String accountId) {
		IncomingAccountInfoPayload.accountId = accountId;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		IncomingAccountInfoPayload.companyName = companyName;
	}

	public static String getAddressLine1() {
		return addressLine1;
	}

	public static void setAddressLine1(String addressLine1) {
		IncomingAccountInfoPayload.addressLine1 = addressLine1;
	}

	public static String getAddressLine2() {
		return addressLine2;
	}

	public static void setAddressLine2(String addressLine2) {
		IncomingAccountInfoPayload.addressLine2 = addressLine2;
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		IncomingAccountInfoPayload.city = city;
	}

	public static String getState() {
		return state;
	}

	public static void setState(String state) {
		IncomingAccountInfoPayload.state = state;
	}

	public static String getPostalCode() {
		return postalCode;
	}

	public static void setPostalCode(String postalCode) {
		IncomingAccountInfoPayload.postalCode = postalCode;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		IncomingAccountInfoPayload.country = country;
	}

}
