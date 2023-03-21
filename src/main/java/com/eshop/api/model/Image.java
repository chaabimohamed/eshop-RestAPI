package com.eshop.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="image")
@Data @AllArgsConstructor @NoArgsConstructor
public class Image {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name="imageLink")
	private String imageLink;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	
}
