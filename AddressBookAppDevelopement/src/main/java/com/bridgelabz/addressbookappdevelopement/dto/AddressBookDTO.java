package com.bridgelabz.addressbookappdevelopement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class AddressBookDTO {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;
    public String address;
    public String city;
    public String state;
    public int zip;

}

