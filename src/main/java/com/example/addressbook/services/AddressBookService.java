package com.example.addressbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.exceptions.AddressBookException;
import com.example.addressbook.model.AddressBookData;
import com.example.addressbook.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService{

	@Autowired
	private AddressBookRepository addressRepository;
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressRepository.findAll();
	}

	@Override
	public AddressBookData getAddressBookDataById(int id) {
		return addressRepository
				   .findById(id)
				   .orElseThrow(() -> new AddressBookException("Employee with ID : " + id + "Not Found"));
	}

	@Override
	public List<AddressBookData> getAddressByCity(String city) {
		return addressRepository.findEmployeeByDepartment(city);
	}
	
	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(addressBookDTO);
		log.debug("Emp Data : " + addressBookData.toString());
		return addressRepository.save(addressBookData);
	}

	@Override
	public AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = this.getAddressBookDataById(id);
		addressBookData.updateAddressBookData(addressBookDTO);
		return addressRepository.save(addressBookData);
	}

	@Override
	public void deleteAddressBookData(int id) {
		AddressBookData addressBookData = this.getAddressBookDataById(id);
		addressRepository.delete(addressBookData);
	}
}
