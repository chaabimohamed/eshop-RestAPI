package com.eshop.api.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.api.model.Product;
import com.eshop.api.service.ProductService;

@CrossOrigin
@RestController
@RequestMapping("api/products")
public class ProductController {
	ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping
	private ResponseEntity<List<Product>> getAllProd(){
		return new ResponseEntity<List<Product>>(productService.findAllProd(),HttpStatus.ACCEPTED);
	}
	@PostMapping
	private ResponseEntity<Product> newProd(Product product){
		System.out.println(product.getBrand());
		return new ResponseEntity<Product>(productService.saveProd(product),HttpStatus.ACCEPTED);
	}	
}
