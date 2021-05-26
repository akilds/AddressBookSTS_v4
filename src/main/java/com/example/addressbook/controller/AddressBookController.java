package com.example.addressbook.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.dto.ResponseDTO;
import com.example.addressbook.model.AddressBookData;
import com.example.addressbook.services.IAddressBookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/addressbook")
@Slf4j
public class AddressBookController {
	
	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping(value = {"", "/", "/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		List<AddressBookData> addressDataList = null;
		addressDataList = addressBookService.getAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Success", addressDataList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("id") int id) {
		AddressBookData addressBookData = addressBookService.getAddressBookDataById(id);
		ResponseDTO respDTO = new ResponseDTO("Get Call for ID Successful", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/city/{city}")
	public ResponseEntity<ResponseDTO> getAddressBookDataByCity(@PathVariable("city") String city) {
		List<AddressBookData> empDataList = null;
		empDataList = addressBookService.getAddressByCity(city);
		ResponseDTO respDTO = new ResponseDTO("Get Call for ID Successful", empDataList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
		log.debug("Address Data : " + addressBookDTO.toString());
		AddressBookData addressBookData = addressBookService.createAddressBookData(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Address Book Data Successfully", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("id") int id,
			                                                 @Valid @RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = addressBookService.updateAddressBookData(id, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated Address Book Data Successfully", addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") int id) {
		addressBookService.deleteAddressBookData(id);
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted Id : " + id);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	
}
