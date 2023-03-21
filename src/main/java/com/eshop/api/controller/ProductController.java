package com.eshop.api.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.api.model.Product;
import com.eshop.api.service.ProductService;


@CrossOrigin
@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> allProd(){
    	return productService.findAllProd();
    }
    @PostMapping()
    public Product getProd(@RequestBody Product product){
    	return productService.saveProd(product);
    }
    @GetMapping("/{Id}")
    public Optional<Product> getbyId(@PathVariable Long Id) {
    	return productService.findProdById(Id);
    }
}