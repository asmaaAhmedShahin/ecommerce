package com.its.ecommerceApp.model;

import java.time.LocalDate;
import java.util.List;

import com.its.ecommerceApp.utils.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderModel {

	private Long id;

	private Long customerId;
	
	private List<Long> productIds;

	private OrderStatus status;

	private LocalDate orderDate;

}
