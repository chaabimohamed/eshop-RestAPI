package com.eshop.api.serviceImp;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.eshop.api.model.Product;
import com.eshop.api.service.ProductService;
import com.eshop.api.repository.ProductRepository;

@Component
public class ProductServiceImp implements ProductService{
	ProductRepository productRepository;

	public ProductServiceImp(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAllProd() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findProdById(Long Id) {
		return productRepository.findById(Id);
	}

	@Override
	public Product saveProd(Product product) {
		return productRepository.save(product);
	}
	
	
}
