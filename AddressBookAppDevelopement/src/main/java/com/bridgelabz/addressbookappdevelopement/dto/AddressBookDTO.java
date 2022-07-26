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

    @Pattern(regexp = "^[7-9]{1}[0-9]{9}$", message = "Invalid Phone Number")
    public String phoneNumber;

    @Pattern(regexp = "^[a-z0-9-+]*[.]{0,1}[0-9a-z]@[a-z0-9]+([.][a-z.]+){1,2}$", message = "Invalid Email")
    public String email;

    @Pattern(regexp = "^[A-Z]{1}[a-z]{1,}$", message = "Invalid Address")
    public String address;

    @Pattern(regexp = "^[A-Z]{1}[a-z]{1,}$", message = "Invalid City Name")
    public String city;

    @Pattern(regexp = "^[A-Z]{1}[a-z]{1,}$", message = "Invalid State Name")
    public String state;
    @Pattern(regexp = "^[1-8]{1}[0-9]{5}$", message = "Invalid Zip Code")
    public int zip;
}

