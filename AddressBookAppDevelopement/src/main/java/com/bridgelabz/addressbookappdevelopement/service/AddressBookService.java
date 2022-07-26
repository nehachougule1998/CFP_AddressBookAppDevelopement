package com.bridgelabz.addressbookappdevelopement.service;

import com.bridgelabz.addressbookappdevelopement.dto.AddressBookDTO;
import com.bridgelabz.addressbookappdevelopement.model.AddressBookData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.swagger2.mappers.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {

//    @Autowired
//    private ModelMapper modelMapper;
    List<AddressBookData> addressBookDataList = new ArrayList<>();

    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    public AddressBookData getAddressBookById(int personId) {
        return addressBookDataList.get(personId - 1);
    }

    public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDataList.size() + 1, addressBookDTO);
        addressBookDataList.add(addressBookData);
        //AddressBookData addressBookData = this.modelMapper.map(addressBookDTO,AddressBookData.class);
        return addressBookData;
    }

    public AddressBookData editAddressBookData(int personId, AddressBookDTO addressBookDTO) {
        // AddressBookData addressBookData = this.modelMapper.map(addressBookDTO,AddressBookData.class);
        AddressBookData addressBookData = this.getAddressBookById(personId);
        addressBookData.setFirstName(addressBookDTO.firstName);
        addressBookData.setLastName(addressBookDTO.lastName);
        addressBookData.setPhoneNumber(addressBookDTO.phoneNumber);
        addressBookData.setEmail(addressBookDTO.email);
        addressBookData.setAddress(addressBookDTO.address);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);
        addressBookData.setZip(addressBookDTO.zip);
        addressBookDataList.set(personId - 1, addressBookData);
        return addressBookData;
    }
    public void deleteAddressBookData(int personId) {
        addressBookDataList.remove(personId - 1);
    }

}

