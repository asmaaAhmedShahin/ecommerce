package com.its.ecommerceApp.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "created_date", nullable = false)
	private LocalDate createdDate;
}
