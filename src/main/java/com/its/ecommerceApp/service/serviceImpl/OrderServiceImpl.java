package com.its.ecommerceApp.service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.its.ecommerceApp.entity.Order;
import com.its.ecommerceApp.entity.repository.OrderRepository;
import com.its.ecommerceApp.mapper.OrderMapper;
import com.its.ecommerceApp.model.OrderModel;
import com.its.ecommerceApp.service.OrderService;
import com.its.ecommerceApp.service.serviceImpl.*; 

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j//used to enable log on this class level
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

 
	private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
	@Override
	public OrderModel createOrder(OrderModel orderModel) {
//		Order order = new Order();
//		Customer customer = new Customer();
//
//		customer.setId(orderModel.getCustomerId());
//		order.setCustomerId(customer);
//
//		order.setOrderDate(LocalDate.now());
//		order.setStatus(orderModel.getStatus());
//		return orderRepository.save(order);
		
		
	      Order order = orderMapper.toEntity(orderModel);
	        Order savedOrder = orderRepository.save(order);
	        log.info("order saved successfully");
	        return  orderMapper.toModel(savedOrder) ;
	        
	}
	@Override
 	public Page<OrderModel> getOrders(Pageable pageable) {
		
		
		 Page<Order> list = orderRepository.findAll(pageable);
	        List<OrderModel> model =  list.stream().map(orderMapper::toModel).collect(Collectors.toList());
	        return new PageImpl<>(model, pageable, list.getTotalElements());
	        
	        
		//return orderRepository.findAll(pageable);
	}

	
	
	@Override
    public  OrderModel  update( OrderModel orderModel) {
        if(!orderRepository.existsById(orderModel.getId())){
            log.error("No order found with this id: " + orderModel.getId());
            throw new RuntimeException("No order found with this id: " + orderModel.getId());
        }
        Order entity = orderMapper.toEntity(orderModel);
     
        Order update  = orderRepository.save(entity);
        return   orderMapper.toModel(update);
    }

    @Override
    public  Boolean delete(Long id) {
        if(!orderRepository.existsById(id)){
            log.error("No order found with this id: " + id);
            return   Boolean.FALSE ;
        }
        orderRepository.deleteById(id);
        return  Boolean.TRUE ;
    }
 
}
