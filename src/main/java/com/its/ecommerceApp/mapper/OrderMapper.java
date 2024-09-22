package com.its.ecommerceApp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.its.ecommerceApp.entity.Order;
import com.its.ecommerceApp.model.OrderModel;

@Component
@Mapper(componentModel = "spring", uses = { ProductMapper.class, MerchantMapper.class })
public interface OrderMapper {

		@Mappings({ @Mapping(source = "id", target = "id"),
		@Mapping(source = "customerId", target = "customerId"),
		@Mapping(source = "orderDate", target = "orderDate"),
		@Mapping(source = "status", target = "status")

	})
	Order toEntity(OrderModel orderModel);

	@Mappings({ @Mapping(source = "id", target = "id"), 
	@Mapping(source = "customerId", target = "customerId"),
	@Mapping(source = "orderDate", target = "orderDate"),
	@Mapping(source = "status", target = "status")

	})
	OrderModel toModel(Order order);

}
