package com.its.ecommerceApp.model;

import java.time.LocalDate;
import java.util.List;

import com.its.ecommerceApp.entity.Customer;
import com.its.ecommerceApp.utils.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderModel {

	private Long id;

	private CustomerModel customerId;

	// private List<Long> productIds;

	private OrderStatus status;

	private LocalDate orderDate;
	
	
  
    /*Json object for creating order

	 { 
	     "id":2,
	 "customerId": {
	   "id":1,
		"name":"asmaa",
		 "email":"asmaashahin2017@gmail.com",
		" address":"Damnhour",
	 "phoneNumber":"01226145325",
	 "createdDate":"2024-09-11"
	  },
	  
	 "orderDate": "2025-09-12T15:30:00", 
	 "status": "DELIVERED" }
	 */
}
