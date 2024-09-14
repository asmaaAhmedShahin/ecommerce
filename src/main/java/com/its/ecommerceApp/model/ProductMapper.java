package com.its.ecommerceApp.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.its.ecommerceApp.domain.Product;

@Mapper
public interface ProductMapper {

	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

	ProductModel productToproductModel(Product product);

	Product productModelToProduct(ProductModel productModel);

}
