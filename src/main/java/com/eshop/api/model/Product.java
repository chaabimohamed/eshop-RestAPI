package com.eshop.api.model;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import java.util.Collection;
@Entity
@Table(name="product")
@Data @AllArgsConstructor @NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="title")
	private String title;
	@Column(name="price")
	private int price;
	@Column(name="rating")//stars
	private int rating;
	@Column(name="brand")
	private String brand;
	@Column(name="description")
	private String description;
	@ManyToMany
	@Column(name="color")
	private Collection<Color> colors;
	@Column(name="size")
	@ManyToMany
	private Collection<Size> sizes;
	@Column(name="category") 
	private String category;
	@Column(name="image")
	@OneToMany
	private Collection<Image> images;
	@Column(name="subCategory")
	private String subCategory;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Collection<Color> getColors() {
		return colors;
	}
	public void setColors(Collection<Color> colors) {
		this.colors = colors;
	}
	public Collection<Size> getSizes() {
		return sizes;
	}
	public void setSizes(Collection<Size> sizes) {
		this.sizes = sizes;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Collection<Image> getImages() {
		return images;
	}
	public void setImages(Collection<Image> images) {
		this.images = images;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	
}
