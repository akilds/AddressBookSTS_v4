package com.example.addressbook.dto;

public class AddressBookDTO {
	public String firstName;
	public String lastName;
	public long phoneNo;
	
	public AddressBookDTO(String firstName, String lastName, long phoneNo) {
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
