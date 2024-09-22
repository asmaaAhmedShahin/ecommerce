 package com.its.ecommerceApp.mapper;

 
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.its.ecommerceApp.entity.Merchant;
import com.its.ecommerceApp.model.MerchantModel;

@Component
@Mapper(componentModel = "spring")
public interface MerchantMapper {

    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "contacInfo", target = "contacInfo"),
        @Mapping(source = "createdDate", target = "createdDate")
    })
    Merchant toEntity(MerchantModel merchantModel);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "contacInfo", target = "contacInfo"),
            @Mapping(source = "createdDate", target = "createdDate")
            
          
            
    })
    MerchantModel toModel(Merchant merchant);

}
