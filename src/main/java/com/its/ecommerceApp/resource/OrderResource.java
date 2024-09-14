package com.its.ecommerceApp.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.its.ecommerceApp.domain.Order;
import com.its.ecommerceApp.model.OrderModel;
import com.its.ecommerceApp.service.OrderService;

@RestController
@RequestMapping("api/orders")
public class OrderResource {

	@Autowired
	private OrderService orderService;

	@PostMapping
	public Order createOrder(@RequestBody OrderModel orderModel) {
		return orderService.createOrder(orderModel);
	}

	@GetMapping
	public Page<Order> getOrders(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "id,desc") String sort) {
		Sort sortOrder = Sort.by(Sort.Order.by(sort.split(",")[0]).with(Sort.Direction.fromString(sort.split(",")[1])));

		Pageable pageable = PageRequest.of(page, size, sortOrder);
		return orderService.getOrders(pageable);
	}
}