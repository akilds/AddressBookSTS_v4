package com.example.addressbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.exceptions.AddressBookException;
import com.example.addressbook.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{

	private List<AddressBookData> addressBookList = new ArrayList<>();
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int id) {
		return addressBookList.stream()
				   .filter(addData -> addData.getId() == id)
				   .findFirst()
				   .orElseThrow(() -> new AddressBookException("Employee Not Found"));
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(addressBookList.size()+1, addressBookDTO);
		addressBookList.add(addressBookData);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = this.getAddressBookDataById(id);
		addressBookData.setFirstName(addressBookDTO.firstName);
		addressBookData.setLastName(addressBookDTO.lastName);
		addressBookData.setPhoneNo(addressBookDTO.phoneNo);
		addressBookList.set(id-1, addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookData(int id) {
		addressBookList.remove(id-1);
	}
}
