package com.bridgelabz.addressbookappdevelopement.service;

import com.bridgelabz.addressbookappdevelopement.dto.AddressBookDTO;
import com.bridgelabz.addressbookappdevelopement.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1, new AddressBookDTO("Neha",
                "Chougule", "9657475633", "nehach23@gmail.com", "Jain mandir",
                "Sangli", "Maharashtra", 416308)));
        return addressBookDataList;
    }

    public AddressBookData getAddressBookById(int personId) {
        AddressBookData addressBookData = new AddressBookData(personId, new AddressBookDTO("Neha",
                "Chougule", "9657475633", "nehach23@gmail.com", "Jain mandir",
                "Sangli", "Maharashtra", 416308));
        return addressBookData;
    }

    public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    public AddressBookData editAddressBookData(int personId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(personId, addressBookDTO);
        return addressBookData;
    }

    public void deleteAddressBookData(int personId){

    }

}


