package com.example.addressbook.services;

import java.util.ArrayList;
import java.util.List;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBookData;

public class AddressBookService implements IAddressBookService{

	@Override
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> addressBookList = new ArrayList<>();
		addressBookList.add(new AddressBookData(1, new AddressBookDTO("Akil", "DS", "8098075050")));
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int id) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(id, new AddressBookDTO("Akil", "DS", "8098075050"));
		return addressBookData;
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(1, addressBookDTO);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(id, addressBookDTO);
		return addressBookData;
	}

	@Override
	public AddressBookData deleteAddressBookData(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
