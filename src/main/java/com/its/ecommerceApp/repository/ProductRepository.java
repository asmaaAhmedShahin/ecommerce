package com.its.ecommerceApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.its.ecommerceApp.domain.Category;
import com.its.ecommerceApp.domain.Merchant;
import com.its.ecommerceApp.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByNameContaining(String name);

	Product findBySku(String sku);

	Page<Product> findByMerchantIdAndCategoryId(Merchant merchantId, Category categoryId, Pageable pageable);

	//List<Product> findByNameContainingOrSkuDescContaining(String name, String sku);

}
