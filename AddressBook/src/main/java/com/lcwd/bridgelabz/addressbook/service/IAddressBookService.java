package com.lcwd.bridgelabz.addressbook.service;

import com.lcwd.bridgelabz.addressbook.dto.AddressBookDTO;
public interface IAddressBookService {
    String getAllContacts();
    String getContactById(Long id);
    String addContact(AddressBookDTO addressBookDTO);
    String updateContact(Long id, AddressBookDTO addressBookDTO);
    String deleteContact(Long id);
}
