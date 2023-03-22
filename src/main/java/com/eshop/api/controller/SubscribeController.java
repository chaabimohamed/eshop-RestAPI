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

import com.eshop.api.model.Subscriber;
import com.eshop.api.service.SubscribeService;

@CrossOrigin
@RestController
@RequestMapping("api/subscriber")
public class SubscribeController {
    SubscribeService subscribeService;
      
	
    public SubscribeController(SubscribeService subscribeService) {
		super();
		this.subscribeService = subscribeService;
	}
    @GetMapping
    private ResponseEntity<List<Subscriber>> showAllSub(){
    	return new ResponseEntity<List<Subscriber>>(subscribeService.showAllSubscribers(),HttpStatus.ACCEPTED);
    }

	@PostMapping
	private ResponseEntity<Subscriber> create(@RequestBody Subscriber subscriber){
    	return new ResponseEntity<Subscriber>(subscribeService.newSubscriber(subscriber),HttpStatus.CREATED);
	}
}