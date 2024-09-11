package com.its.ecommerceApp.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "sku", nullable = false)
	private String sku;

	@Column(name = "price", nullable = false)
	private BigDecimal price;

	@Column(name = "description", nullable = false)
	private String description;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category categoryId;

	@ManyToOne
	@JoinColumn(name = "merchant_id", nullable = false)
	private Merchant merchantId;

	@Column(name = "created_date", nullable = false)
	private LocalDate createdDate;

}
