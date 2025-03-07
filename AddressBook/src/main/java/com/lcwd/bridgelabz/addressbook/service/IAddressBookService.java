package com.lcwd.bridgelabz.addressbook.service;

import com.lcwd.bridgelabz.addressbook.dto.AddressBookDTO;
import com.lcwd.bridgelabz.addressbook.model.AddressBook;

import java.util.List;

public interface IAddressBookService {
    List<AddressBook> getAllContacts();
    AddressBook getContactById(Long id);
    AddressBook createAddressBookData(AddressBookDTO addressBookDTO);
    AddressBook updateContact(Long id, AddressBookDTO addressBookDTO);
    void deleteContact(Long id);
}
