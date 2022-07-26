package com.bridgelabz.addressbookappdevelopement;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.mappers.ModelMapper;

@SpringBootApplication
@Slf4j
public class AddressBookAppDevelopementApplication {

//    @Bean
//    public ModelMapper modelMapper(){
//        return new ModelMapper();
//
//    }
    public static void main(String[] args) {
        SpringApplication.run(AddressBookAppDevelopementApplication.class, args);
        log.info("Address Book Application started");
        System.out.println("Welcome to Address Book Program");
    }
}