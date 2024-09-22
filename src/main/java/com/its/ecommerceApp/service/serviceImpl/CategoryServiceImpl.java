package com.its.ecommerceApp.service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.its.ecommerceApp.entity.Category;
import com.its.ecommerceApp.entity.repository.CategoryRepository;
import com.its.ecommerceApp.mapper.CategoryMapper;
import com.its.ecommerceApp.model.CategoryModel;
import com.its.ecommerceApp.service.CategoryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j//used to enable log on this class level
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

	
	private final CategoryRepository categoryRepository;

	 private final CategoryMapper categoryMapper;	

	public List<CategoryModel> getAllCategories() {
		 
        List<Category> list = categoryRepository.findAll();
        log.info("category list retrived successfully");
        return list.stream().map(categoryMapper::toModel).collect(Collectors.toList());
	}

}
