package com.bridgelabz.addressbookappdevelopement.repository;

import com.bridgelabz.addressbookappdevelopement.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {

    @Query(value = "select *from address_book order by city", nativeQuery = true)
    List<AddressBookData> findContactsByCity();
    @Query (value = "select *from address_book order by state", nativeQuery = true)
    List<AddressBookData> findContactsByState();
}


