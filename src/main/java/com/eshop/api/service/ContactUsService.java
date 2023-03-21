package com.eshop.api.service;

import org.springframework.stereotype.Service;

import com.eshop.api.model.ContactUs;

@Service
public interface ContactUsService { 
	 ContactUs newMessage(ContactUs contactUs);
}
