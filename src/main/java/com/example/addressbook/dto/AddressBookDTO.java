package com.example.addressbook.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{3,}$", message = "Invalid FirstName")
	public String firstName;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{3,}$", message = "Invalid LastName")
	public String lastName;
	
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Invalid Mobile Number")
	public String phoneNo;
	
	@NotBlank(message = "Address cannot be Empty")
	public String address;
	
	@NotBlank(message = "City cannot be Empty")
	public String city;
	
	@NotBlank(message = "State cannot be Empty")
	public String state;
	
	@NotBlank(message = "Zip cannot be Empty")
	public String zip;
	
	@Pattern(regexp = "((^[a-z]{1,}((([-]|[.]|[+])[0-9]{1,})|[0-9]{1,}))|(^[a-z]{1,}))[@](([a-z]{2,}[.][a-z]{2,})|([a-z]{2,}[.][a-z]{2,}[.][a-z]{2,})|([0-1][.][a-z]{2,}))", message = "Invalid Mail Address")
	public String email;
}
