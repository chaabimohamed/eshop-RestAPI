package com.eshop.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="image")
public class Image {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name="imageLink")
	private String imageLink;
}
