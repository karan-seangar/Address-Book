package com.lcwd.bridgelabz.addressbook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressBookController {

   @GetMapping("/api/test")
    public ResponseEntity<String> test(){
       return ResponseEntity.ok("Hello From Address Book Controller");
   }
}
