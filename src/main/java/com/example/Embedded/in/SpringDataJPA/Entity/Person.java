package com.example.Embedded.in.SpringDataJPA.Entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personId;
	
	private String pName;
	private String pGender;
	private long pAge;
	
	@Embedded
	private Address address;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpGender() {
		return pGender;
	}

	public void setpGender(String pGender) {
		this.pGender = pGender;
	}

	public long getpAge() {
		return pAge;
	}

	public void setpAge(long pAge) {
		this.pAge = pAge;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(int personId, String pName, String pGender, long pAge, Address address) {
		super();
		this.personId = personId;
		this.pName = pName;
		this.pGender = pGender;
		this.pAge = pAge;
		this.address = address;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
