package com.eshop.api.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
	    private ContactUs create(@RequestBody ContactUs subscriber){
	    	ContactUs createdResource = contactUsService.newMessage(subscriber);
	    	return createdResource;
	    }
}