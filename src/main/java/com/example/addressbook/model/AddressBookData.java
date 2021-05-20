package com.example.addressbook.model;

import com.example.addressbook.dto.AddressBookDTO;

public class AddressBookData {
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNo;
	
	public AddressBookData() {}
	
	public AddressBookData(int id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.firstName = addressBookDTO.firstName;
		this.lastName = addressBookDTO.lastName;
		this.phoneNo = addressBookDTO.phoneNo;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
