package com.example.Embedded.in.SpringDataJPA.Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private String presentAddress;
	private String country;
	private long zipCode;
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public Address(String presentAddress, String country, long zipCode) {
		super();
		this.presentAddress = presentAddress;
		this.country = country;
		this.zipCode = zipCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
