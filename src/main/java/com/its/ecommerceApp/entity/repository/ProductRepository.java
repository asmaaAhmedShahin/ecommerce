package com.its.ecommerceApp.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.its.ecommerceApp.entity.Category;
import com.its.ecommerceApp.entity.Merchant;
import com.its.ecommerceApp.entity.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByNameContaining(String name);

	Product findBySku(String sku);

	Page<Product> findByMerchantIdAndCategoryId(Merchant merchantId, Category categoryId, Pageable pageable);

	//List<Product> findByNameContainingOrSkuDescContaining(String name, String sku);
	
	//  @Query("SELECT p FROM Product p JOIN p.merchant m JOIN m.category c WHERE m.id = :merchantId")
	 //   Page<Product> groupByCaegory(@Param("merchantId") Long merchantId, Pageable pageable);

}
