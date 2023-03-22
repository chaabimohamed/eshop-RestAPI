package com.eshop.api.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="product")
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
	@Column(name="category") 
	private String category;
	@Column(name="subCategory")
	private String subCategory;

	@ManyToMany(targetEntity=Color.class,cascade=CascadeType.ALL)
	@JoinColumn(name = "prodClrs_fk", referencedColumnName="id")
	private List<Color> colors = new ArrayList<Color>();
	
	@ManyToMany(targetEntity=Size.class,cascade=CascadeType.ALL)
	@JoinColumn(name = "prodSize_fk", referencedColumnName="id")
	private List<Size> sizes = new ArrayList<Size>();
	
	
	@OneToMany(targetEntity=Image.class,cascade=CascadeType.ALL)
	@JoinColumn(name = "prodImg_fk", referencedColumnName="id")
	private List<Image> images = new ArrayList<Image>();
	
}
