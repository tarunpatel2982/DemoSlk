package com.slk.task8;

import java.io.Serializable;

public class Address  implements Serializable  {

	
	String street;
	String country;
//	
//	public String getStreet() {
//		return street;
//	}
//	public void setStreet(String street) {
//		this.street = street;
//	}
//	public String getCountry() {
//		return country;
//	}
//	public void setCountry(String country) {
//		this.country = country;
//	}
	public Address(String street, String country) {
		
		this.street = street;
		this.country = country;
	}
	
	
	
}
