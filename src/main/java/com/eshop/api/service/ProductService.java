package com.eshop.api.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.eshop.api.model.Product;

@Service
public interface ProductService {
	Product saveProd(Product product);
	List<Product> findAllProd();
	Optional<Product> findProdById(Long Id);
	
}
