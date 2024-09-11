package com.its.ecommerceApp.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.its.ecommerceApp.domain.Order;
import com.its.ecommerceApp.model.OrderModel;
import com.its.ecommerceApp.repository.OrderRepository;
import com.its.ecommerceApp.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	
	 @Autowired
	    private OrderRepository orderRepository;
	 
     @Override
	    public Order createOrder(OrderModel orderModel) {
	        Order order = new Order();
	    //    order.setCustomerId(orderDto.getCustomerId());
	    //    order.setProductIds(orderDto.getProductIds());
	        order.setStatus(orderModel.getStatus());
	        return orderRepository.save(order);
	    }



public Page<Order> getOrders(Pageable pageable) {
    return orderRepository.findAll(pageable);
}



}
