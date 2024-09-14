package com.its.ecommerceApp.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.its.ecommerceApp.domain.Product;
import com.its.ecommerceApp.model.ProductModel;
import com.its.ecommerceApp.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductResource {

	@Autowired
	private ProductService productService;

	@GetMapping("/search")
	public List<Product> searchProducts(@RequestParam(required = false) String name,
			@RequestParam(required = false) String sku) {
		return productService.searchProducts(name, sku);
	}

	@GetMapping("/merchants/{merchantId}")
	public Page<Product> getProductsByMerchant(@PathVariable Long merchantId,
			@RequestParam(defaultValue = "2", required = false) String category,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
			@RequestParam(defaultValue = "v1") String version) {
		return productService.getProductsByMerchant(merchantId, category, page, size, version);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProductModel> getProductById(@PathVariable Long id) {
		ProductModel productModel = productService.getProductById(id);

		return new ResponseEntity<ProductModel>(productModel, HttpStatus.OK);
	}

}
