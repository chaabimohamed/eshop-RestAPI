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
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="size")
public class Size {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name="sizeName")
	private String sizeName;
}
