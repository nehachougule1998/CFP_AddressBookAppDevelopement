package com.bridgelabz.addressbookappdevelopement.service;

import com.bridgelabz.addressbookappdevelopement.dto.AddressBookDTO;
import com.bridgelabz.addressbookappdevelopement.exception.AddressBookException;
import com.bridgelabz.addressbookappdevelopement.model.AddressBookData;
import com.bridgelabz.addressbookappdevelopement.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService {

    @Autowired
    AddressBookRepository addressBookRepository;

    public List<AddressBookData> getAddressBookData() {
        return addressBookRepository.findAll();
    }

    public AddressBookData getAddressBookById(int personId) {
        return addressBookRepository.findById(personId)
                .orElseThrow(() -> new AddressBookException("Address Book Contact Id not Found!!!"));
    }

    public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDTO);
        addressBookRepository.save(addressBookData);
        return addressBookData;
    }

    public AddressBookData editAddressBookData(int personId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookById(personId);
        addressBookData.updateData(addressBookDTO);
        return addressBookRepository.save(addressBookData);
    }

    public void deleteAddressBookData(int personId) {
        AddressBookData addressBookData = this.getAddressBookById(personId);
        addressBookRepository.delete(addressBookData);
    }
    public List<AddressBookData> getContactsByCity() {
        return addressBookRepository.findContactsByCity();
    }

    public List<AddressBookData> getContactsByState() {
        return addressBookRepository.findContactsByState();
    }

}

