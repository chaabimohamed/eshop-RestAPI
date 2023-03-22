package com.eshop.api.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.eshop.api.model.Subscriber;


@Service
public interface SubscribeService {
	Subscriber newSubscriber(Subscriber subscriber);
	List<Subscriber> showAllSubscribers();
}
