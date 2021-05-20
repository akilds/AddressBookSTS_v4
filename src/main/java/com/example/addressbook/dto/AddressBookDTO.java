package com.example.addressbook.dto;

public class AddressBookDTO {
	public String firstName;
	public String lastName;
	public String phoneNo;
	
	public AddressBookDTO(String firstName, String lastName, String phoneNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Firstname : " + firstName + " Lastname : " + lastName + 
				"PhoneNo : " + phoneNo;
	}
}
