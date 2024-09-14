package com.its.ecommerceApp.domain;

import java.time.LocalDate;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "merchant")
public class Merchant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "contact_info", nullable = false)
	private String contacInfo;

	@Column(name = "created_date")
	private LocalDate createdDate;
}
