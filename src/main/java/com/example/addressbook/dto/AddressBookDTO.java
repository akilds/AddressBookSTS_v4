package com.example.addressbook.dto;

import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{3,}$", message = "Invalid FirstName")
	public String firstName;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{3,}$", message = "Invalid LastName")
	public String lastName;
	
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Invalid Mobile Number")
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
