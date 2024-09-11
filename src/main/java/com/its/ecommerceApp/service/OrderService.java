package com.its.ecommerceApp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.its.ecommerceApp.domain.Order;
import com.its.ecommerceApp.model.OrderModel;

public interface OrderService {

	public Order createOrder(OrderModel orderModel);

	public Page<Order> getOrders(Pageable pageable);

}
