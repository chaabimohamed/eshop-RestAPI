package com.eshop.api.repository;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eshop.api.model.Product;

public interface ProductRepository  extends JpaRepository<Product,Long>{
	@Query("select u from product p where p.category = ?1")
	List<Product> findByCategory(String category); // men , women or kids
}
