package com.bridgelabz.addressbookappdevelopement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[A-Za-z]{1,}$", message = "Invalid First Name")
    public String firstName;

    @Pattern(regexp = "^[A-Z]{1}[A-Za-z]{1,}$", message = "Invalid Last Name")
    public String lastName;

    public String phoneNumber;

    public String email;

    @Pattern(regexp = "^[A-Z]{1}[a-z]{1,}$", message = "Invalid Address")
    public String address;

    @Pattern(regexp = "^[A-Z]{1}[a-z]{1,}$", message = "Invalid City Name")
    public String city;

    @Pattern(regexp = "^[A-Z]{1}[a-z]{1,}$", message = "Invalid State Name")
    public String state;

    public int zip;
}

