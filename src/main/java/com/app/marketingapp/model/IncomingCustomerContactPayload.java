package com.app.marketingapp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class IncomingCustomerContactPayload implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static String name;

	private static String id;

	private static String emailAddress;

	private static String addressLine1;

	private static String addressLine2;

	private static String city;

	private static String state;

	private static String postalcode;

	private static String country;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		IncomingCustomerContactPayload.name = name;
	}

	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		IncomingCustomerContactPayload.id = id;
	}

	public static String getEmailAddress() {
		return emailAddress;
	}

	public static void setEmailAddress(String emailAddress) {
		IncomingCustomerContactPayload.emailAddress = emailAddress;
	}

	public static String getAddressLine1() {
		return addressLine1;
	}

	public static void setAddressLine1(String addressLine1) {
		IncomingCustomerContactPayload.addressLine1 = addressLine1;
	}

	public static String getAddressLine2() {
		return addressLine2;
	}

	public static void setAddressLine2(String addressLine2) {
		IncomingCustomerContactPayload.addressLine2 = addressLine2;
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		IncomingCustomerContactPayload.city = city;
	}

	public static String getState() {
		return state;
	}

	public static void setState(String state) {
		IncomingCustomerContactPayload.state = state;
	}

	public static String getPostalcode() {
		return postalcode;
	}

	public static void setPostalcode(String postalcode) {
		IncomingCustomerContactPayload.postalcode = postalcode;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		IncomingCustomerContactPayload.country = country;
	}

}
