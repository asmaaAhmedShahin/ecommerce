 package com.its.ecommerceApp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.its.ecommerceApp.entity.Product;
import com.its.ecommerceApp.model.ProductModel;



@Component
@Mapper(componentModel = "spring")
public interface ProductMapper {

	@Mappings({ @Mapping(source = "id", target = "id"), 
			@Mapping(source = "name", target = "name"),
			@Mapping(source = "sku", target = "sku"),
			@Mapping(source = "price", target = "price"),
			@Mapping(source = "description", target = "description"),
			@Mapping(source = "categoryId", target = "categoryId"),
			@Mapping(source = "merchantId", target = "merchantId"),
			@Mapping(source = "createdDate", target = "createdDate")
	})
	Product toEntity(ProductModel categoryModel);

	@Mappings({ @Mapping(source = "id", target = "id"), 
			@Mapping(source = "name", target = "name"),
			@Mapping(source = "sku", target = "sku"),
			@Mapping(source = "price", target = "price"),
			@Mapping(source = "description", target = "description"),
			@Mapping(source = "categoryId", target = "categoryId"),
			@Mapping(source = "merchantId", target = "merchantId"),
			@Mapping(source = "createdDate", target = "createdDate") })
	ProductModel toModel(Product product);

}
