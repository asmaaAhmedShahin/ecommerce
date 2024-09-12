package com.its.ecommerceApp.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.its.ecommerceApp.domain.Category;
import com.its.ecommerceApp.domain.Merchant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {

	private Long id;

	private String name;

	private String sku;

	private BigDecimal price;

	private String description;

	private Category categoryId;

	private Merchant merchantId;

	private LocalDate createdDate;

}
