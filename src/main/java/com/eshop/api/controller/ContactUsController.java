package com.eshop.api.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.api.model.ContactUs;
import com.eshop.api.service.ContactUsService;

@CrossOrigin
@RestController
@RequestMapping("api/contactUs")
public class ContactUsController {
    ContactUsService contactUsService;
    
    public ContactUsController(ContactUsService contactUsService) {
		super();
		this.contactUsService = contactUsService;
	}
    @GetMapping
    private ResponseEntity<List<ContactUs>> showAllSub(){
    	return new ResponseEntity<List<ContactUs>>(contactUsService.showAllContactMessages(),HttpStatus.ACCEPTED);
    }


	@PostMapping
	private ResponseEntity<ContactUs> create(@RequestBody ContactUs contactUs){
    	return new ResponseEntity<ContactUs>(contactUsService.newMessage(contactUs),HttpStatus.CREATED);
	}
}