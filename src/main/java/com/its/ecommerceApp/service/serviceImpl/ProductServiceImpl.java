package com.its.ecommerceApp.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.its.ecommerceApp.domain.Category;
import com.its.ecommerceApp.domain.Merchant;
import com.its.ecommerceApp.domain.Product;
import com.its.ecommerceApp.model.ProductModel;
import com.its.ecommerceApp.repository.CategoryRepository;
import com.its.ecommerceApp.repository.MerchantRepository;
import com.its.ecommerceApp.repository.ProductRepository;
import com.its.ecommerceApp.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private MerchantRepository merchantRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	/*
	 * private final ProductMapper productMapper = ProductMapper.INSTANCE;
	 * 
	 * @Autowired private ProductRepository productRepository;
	 * 
	 * @Autowired public ProductServiceImpl(ProductRepository productRepository) {
	 * this.productRepository = productRepository;
	 * 
	 * }
	 */

//	    @Autowired
//	    public ProductServiceImpl(ProductMapper productMapper, ProductRepository productRepository) {
//	        this.productMapper = productMapper;
//	        this.productRepository = productRepository;
//	    }

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
		Product product = productRepository.findById(id).get();
		ProductModel productModel = new ProductModel();
		productModel.setCategoryId(product.getCategoryId());
		productModel.setCreatedDate(product.getCreatedDate());
		productModel.setDescription(product.getDescription());
		productModel.setId(product.getId());
		productModel.setMerchantId(product.getMerchantId());
		productModel.setName(product.getName());
		productModel.setPrice(product.getPrice());
		productModel.setSku(product.getSku());
		// mapper.map(productRepository.findById(id).get(), productModel);
		return productModel;

	}

	/*----------mapping using MapStruct------------------*/

	// private final ProductMapper productMapper;
//		public ProductModel getProductById(Long id) {
//
//			Product Product = productRepository.findById(id).get();
//
//			return convertToDTO(Product);
//
//		}
//	    
//	    
//	    public ProductModel convertToDTO(Product product) {
//            return productMapper.productToproductModel(product);
//        }
//
//        public Product convertToEntity(ProductModel productModel) {
//            return productMapper.productModelToProduct(productModel);
//        }
}
