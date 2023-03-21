package com.eshop.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eshop.api.model.Product;

public interface ProductRepository  extends JpaRepository<Product,Long>{
	

}
