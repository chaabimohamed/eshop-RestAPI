package com.eshop.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eshop.api.model.Subscriber;

public interface SubscribeRepository  extends JpaRepository<Subscriber,Long>{
	

}