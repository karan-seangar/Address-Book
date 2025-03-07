package com.lcwd.bridgelabz.addressbook.controller;

import com.lcwd.bridgelabz.addressbook.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;


    @GetMapping("/api/test")
    public ResponseEntity<String> test(){
       return ResponseEntity.ok("Hello From Address Book Controller");
   }

   @GetMapping({ "","/","/get"})
    public ResponseEntity<String> getAll(){
       return ResponseEntity.ok("All contacts displayed");
   }
    @GetMapping("/get/{id}")
    public ResponseEntity<String> find(@PathVariable Long id) {
        return ResponseEntity.ok("Contact with ID " + id + " displayed");
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody String contactDetails) {
        return ResponseEntity.ok("Contact added: " + contactDetails);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody String updatedDetails) {
        return ResponseEntity.ok("Contact with ID " + id + " updated: " + updatedDetails);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return ResponseEntity.ok("Contact with ID " + id + " deleted");
    }

}
