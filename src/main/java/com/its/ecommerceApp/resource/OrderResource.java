package com.its.ecommerceApp.resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.its.ecommerceApp.model.OrderModel;
import com.its.ecommerceApp.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/orders")
@RequiredArgsConstructor
public class OrderResource {

	private final OrderService orderService;

	@PostMapping
	public OrderModel createOrder(@RequestBody OrderModel orderModel) {
		return orderService.createOrder(orderModel);
	}

	    @PutMapping
	    public OrderModel update(@RequestBody OrderModel orderModel){
	        return orderService.update(orderModel);
	    }

	    @DeleteMapping
	    public Boolean delete(@PathVariable Long id){
	        return orderService.delete(id);
	    }
	    
	    
	    
//	@GetMapping
//	public Page<OrderModel> getOrders(@RequestParam(defaultValue = "0") int page,
//			@RequestParam(defaultValue = "10") int size,
	    //@RequestParam(defaultValue = "id,desc") String sort) {
//		Sort sortOrder = Sort.by(Sort.Order.by(sort.split(",")[0]).with(Sort.Direction.fromString(sort.split(",")[1])));
//
//		Pageable pageable = PageRequest.of(page, size, sortOrder);
//		return orderService.getOrders(pageable);
//	}
//	
	
	  @GetMapping     //http://localhost:8090/api/orders?page=0&sort=id
	    public Page<OrderModel> getOrders(Pageable pageable){
	        return  orderService.getOrders(pageable);
	    }
}