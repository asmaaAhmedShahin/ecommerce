package com.its.ecommerceApp.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.its.ecommerceApp.domain.Category;
import com.its.ecommerceApp.repository.CategoryRepository;
import com.its.ecommerceApp.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

}
