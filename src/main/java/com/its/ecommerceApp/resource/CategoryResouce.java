package com.its.ecommerceApp.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.its.ecommerceApp.domain.Category;
import com.its.ecommerceApp.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryResouce {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public List<Category> getAllCategories() {
		List<Category> cat = categoryService.getAllCategories();

		return cat;

	}

}
