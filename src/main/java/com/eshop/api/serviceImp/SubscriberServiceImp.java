package com.eshop.api.serviceImp;

import org.springframework.stereotype.Service;

import com.eshop.api.model.Subscriber;
import com.eshop.api.service.SubscribeService;
import com.eshop.api.repository.SubscribeRepository;
@Service
public class SubscriberServiceImp implements SubscribeService {
	SubscribeRepository subscribeRepositor;
	
	public SubscriberServiceImp(SubscribeRepository subscribeRepositor) {
		super();
		this.subscribeRepositor = subscribeRepositor;
	}

	@Override
	public Subscriber newSubscriber(Subscriber subscriber) {
		return subscribeRepositor.save(subscriber);
	}

}
