package com.example.addressbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.addressbook.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer>{
	@Query(value = "select * from address_book where city = :city", nativeQuery = true)
	List<AddressBookData> findEmployeeByDepartment(String city);
}
