 package com.its.ecommerceApp.mapper;

 
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.its.ecommerceApp.entity.Customer;
import com.its.ecommerceApp.model.CustomerModel;

@Component
@Mapper(componentModel = "spring", uses = {OrderMapper.class})
public interface CustomerMapper {

    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "email", target = "email"),
        @Mapping(source = "address", target = "address"),
        @Mapping(source = "phoneNumber", target = "phoneNumber"),
        @Mapping(source = "createdDate", target = "createdDate")
    })
    Customer toEntity(CustomerModel customerModel);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "createdDate", target = "createdDate")
             
    })
    CustomerModel toModel(Customer customer);
 
}
