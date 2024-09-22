package com.its.ecommerceApp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.its.ecommerceApp.model.OrderModel;

public interface OrderService {

	public OrderModel createOrder(OrderModel orderModel);

	public Page<OrderModel> getOrders(Pageable pageable);
	
	OrderModel update(OrderModel orderModel);
	 
	 Boolean  delete(Long id);

}
