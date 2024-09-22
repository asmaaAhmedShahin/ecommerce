package com.its.ecommerceApp.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.its.ecommerceApp.model.CategoryModel;
import com.its.ecommerceApp.service.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryResouce {

	 
	private final CategoryService categoryService;

	@GetMapping
	public List<CategoryModel> getAllCategories() {
	 

		return categoryService.getAllCategories();

	}

}
