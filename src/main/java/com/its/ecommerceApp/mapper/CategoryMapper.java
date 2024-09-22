 package com.its.ecommerceApp.mapper;
	

 

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.its.ecommerceApp.entity.Category;
import com.its.ecommerceApp.model.CategoryModel;

@Component
@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "createdDate", target = "createdDate")
            
 
            
    })
    Category toEntity(CategoryModel categoryModel);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "createdDate", target = "createdDate")
    })
    CategoryModel toModel(Category category);

}


 
 
