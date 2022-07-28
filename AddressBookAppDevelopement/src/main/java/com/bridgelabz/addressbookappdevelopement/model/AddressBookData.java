package com.bridgelabz.addressbookappdevelopement.model;

import com.bridgelabz.addressbookappdevelopement.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AddressBook")
public class AddressBookData {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int personId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;
    private String state;
    private int zip;


    public AddressBookData() {
    }

//    public AddressBookData(AddressBookDTO addressBookDTO) {
//        this.firstName = addressBookDTO.firstName;
//        this.lastName = addressBookDTO.lastName;
//        this.phoneNumber = addressBookDTO.phoneNumber;
//        this.email = addressBookDTO.email;
//        this.address = addressBookDTO.address;
//        this.city = addressBookDTO.city;
//        this.state = addressBookDTO.state;
//        this.zip = addressBookDTO.zip;
//    }

//    public void updateData(AddressBookDTO addressBookDTO) {
//        this.firstName = addressBookDTO.firstName;
//        this.lastName = addressBookDTO.lastName;
//        this.phoneNumber = addressBookDTO.phoneNumber;
//        this.email = addressBookDTO.email;
//        this.address = addressBookDTO.address;
//        this.city = addressBookDTO.city;
//        this.state = addressBookDTO.state;
//        this.zip = addressBookDTO.zip;
//    }
}
