package com.example.addressbook.services;

import java.util.List;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBookData;

public interface IAddressBookService {
	List<AddressBookData> getAddressBookData();
	AddressBookData getAddressBookDataById(int id);
	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);
	AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO);
	void deleteAddressBookData(int id);
}
