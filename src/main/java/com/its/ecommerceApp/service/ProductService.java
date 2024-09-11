package com.its.ecommerceApp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.its.ecommerceApp.domain.Product;
public interface ProductService {
    public List<Product> searchProducts(String name, String sku);
    
    public Page<Product> getProductsByMerchant(Long merchantId, String category, int page, int size, String version);
     
}
