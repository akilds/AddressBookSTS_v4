package com.example.addressbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.addressbook.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name = "address_book")
public @Data class AddressBookData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "name")
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String email;
	
	public AddressBookData() {}
	
	public AddressBookData(AddressBookDTO addressBookDTO) {
		this.updateAddressBookData(addressBookDTO);
	}
	
	public void updateAddressBookData(AddressBookDTO addressBookDTO) {
		this.firstName = addressBookDTO.firstName;
		this.lastName = addressBookDTO.lastName;
		this.phoneNo = addressBookDTO.phoneNo;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zip = addressBookDTO.zip;
		this.email = addressBookDTO.email;
	}
}
