package com.its.ecommerceApp.service.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.its.ecommerceApp.domain.Product;
import com.its.ecommerceApp.repository.ProductRepository;
import com.its.ecommerceApp.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
@Service
public class ProductServiceImpl  implements ProductService {
	
	
	 

	    @Autowired
	    private ProductRepository productRepository;

	    public List<Product> searchProducts(String name, String sku) {

			List<Product> products = new ArrayList<Product>();
			if (name != null) {
				products.addAll(productRepository.findByNameContaining(name));

			} else if (sku != null) {
				Product p = productRepository.findBySku(sku);
				products.add(p);

			}
			return products;

		}
	    
	    
	    
	    public Page<Product> getProductsByMerchant(Long merchantId, String category, int page, int size, String version) {
	    	
	        Pageable pageable = PageRequest.of(page, size);
	        
	        return productRepository.findByMerchantIdAndCategoryId(merchantId, Long.parseLong(category), pageable);
	    }

	    
	    
}
