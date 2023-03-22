package com.eshop.api.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eshop.api.model.Subscriber;
import com.eshop.api.service.SubscribeService;
import com.eshop.api.repository.SubscribeRepository;
@Service
public class SubscriberServiceImp implements SubscribeService {
	SubscribeRepository subscribeRepository;
	
	public SubscriberServiceImp(SubscribeRepository subscribeRepository) {
		super();
		this.subscribeRepository = subscribeRepository;
	}

	@Override
	public Subscriber newSubscriber(Subscriber subscriber) {
		return subscribeRepository.save(subscriber);
	}

	@Override
	public List<Subscriber> showAllSubscribers() {
		return subscribeRepository.findAll();
	}

}
