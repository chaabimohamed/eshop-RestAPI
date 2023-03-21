package com.eshop.api.serviceImp;

import org.springframework.stereotype.Service;

import com.eshop.api.model.ContactUs;
import com.eshop.api.service.ContactUsService;
import com.eshop.api.repository.ContactUsRepository;
@Service
public class ContactUsServiceImp implements ContactUsService{
	
	ContactUsRepository contactUsRepository;
	
	public ContactUsServiceImp(ContactUsRepository contactUsRepository) {
		super();
		this.contactUsRepository = contactUsRepository;
	}

	@Override
	public ContactUs newMessage(ContactUs contactUs) {
		return contactUsRepository.save(contactUs);
	}

}
