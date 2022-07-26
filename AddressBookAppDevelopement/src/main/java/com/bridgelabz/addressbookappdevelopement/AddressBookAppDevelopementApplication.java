package com.bridgelabz.addressbookappdevelopement;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AddressBookAppDevelopementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressBookAppDevelopementApplication.class, args);
        log.info("Address Book Application Started!!!");
        System.out.println("Welcome to Address Book Program");
    }

}