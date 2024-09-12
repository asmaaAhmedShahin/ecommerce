package com.its.ecommerceApp.model;

import java.time.LocalDate;
import java.util.List;

import com.its.ecommerceApp.domain.Customer;
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
	
	//private List<Long> productIds;

	private OrderStatus status;

	private LocalDate orderDate;
	
	/*
	{
	    "customerId": 2,
	    "orderDate": "2024-09-12T15:30:00",
	    "status": "PENDING" 
	}
*/
}
