package com.example.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AddressBookApplication.class, args);
		log.info("Address Book App Started in {} Environment", 
				  context.getEnvironment().getProperty("environment"));
		log.info("Address Book DB User is {}",
				  context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
