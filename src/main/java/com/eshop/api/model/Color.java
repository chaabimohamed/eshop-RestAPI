package com.eshop.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="color")
@Data @AllArgsConstructor @NoArgsConstructor
public class Color {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name="colorName")
	private String colorName;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
}
