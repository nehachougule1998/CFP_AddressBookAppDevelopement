package com.bridgelabz.addressbookappdevelopement.repository;

import com.bridgelabz.addressbookappdevelopement.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {

}
