package com.its.ecommerceApp.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.its.ecommerceApp.entity.Category;
import com.its.ecommerceApp.entity.Merchant;
import com.its.ecommerceApp.entity.Product;
import com.its.ecommerceApp.entity.repository.CategoryRepository;
import com.its.ecommerceApp.entity.repository.MerchantRepository;
import com.its.ecommerceApp.entity.repository.ProductRepository;
import com.its.ecommerceApp.mapper.ProductMapper;
import com.its.ecommerceApp.model.ProductModel;
import com.its.ecommerceApp.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@RequiredArgsConstructor
@Slf4j//used to enable log on this class level
@Service
public class ProductServiceImpl implements ProductService {
	  private final ProductRepository productRepository;

	  private final MerchantRepository merchantRepository;

 
	  private final CategoryRepository categoryRepository;
	
	  private final ProductMapper productMapper;

	 
 
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

	public Page<Product> getProductsByMerchant(Long merchantId, String categoryId, int page, int size, String version) {

		Pageable pageable = PageRequest.of(page, size);
		Merchant merchant = merchantRepository.findById(merchantId)
				.orElseThrow(() -> new IllegalArgumentException("Merchant not found"));
		Category category = categoryRepository.findById(Long.parseLong(categoryId))
				.orElseThrow(() -> new IllegalArgumentException("Category not found"));

		return productRepository.findByMerchantIdAndCategoryId(merchant, category, pageable);
	}

	/*
	 * @Autowired private ModelMapper mapper;
	 */
	public ProductModel getProductById(Long id) {
		Product  product = productRepository.findById(id).get();
		
		//Optional<Product> product1 = productRepository.findById(id);
		
	return	  productMapper.toModel(product);
		// product1.stream().map(productMapper::toModel).findFirst().orElseThrow(() -> new RuntimeException("non category fould with this id : " + id ));
 
		
	 

	}
 
}
