package com.eshop.api.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.api.dto.ProductDTO;
import com.eshop.api.model.Product;
import com.eshop.api.service.ColorService;
import com.eshop.api.service.ImageService;
import com.eshop.api.service.ProductService;
import com.eshop.api.service.SizeService;

@CrossOrigin
@RestController
@RequestMapping("api/products")
public class ProductController {
	ProductService productService;
	ColorService colorService;
	ImageService imageService;
	SizeService sizeService;
	
	public ProductController(ProductService productService, ColorService colorService, ImageService imageService,
			SizeService sizeService) {
		super();
		this.productService = productService;
		this.colorService = colorService;
		this.imageService = imageService;
		this.sizeService = sizeService;
	}

	@GetMapping
	private ResponseEntity<List<Product>> getAllProd(){
		return new ResponseEntity<List<Product>>(productService.findAllProd(),HttpStatus.ACCEPTED);
	}
	@PostMapping
	private ResponseEntity<Product> newProd(@RequestBody ProductDTO newProduct){
		return new ResponseEntity<Product>(productService.saveProd(newProduct.getProduct()),HttpStatus.ACCEPTED);
	}
	@PostMapping("/category/{category}")
	private ResponseEntity<List<Product>> newProd(@PathVariable String category){
		return new ResponseEntity<List<Product>>(productService.findByCat(category),HttpStatus.ACCEPTED);
	}
	@PostMapping("/{id}")
	private ResponseEntity<Optional<Product>> newProd(@PathVariable Long id){
		return new ResponseEntity<Optional<Product>>(productService.findProdById(id),HttpStatus.ACCEPTED);
	}

}
