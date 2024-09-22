package com.its.ecommerceApp.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MerchantModel {

    private Long id;

    private String name;

    private String contacInfo;

    	private LocalDate createdDate;
    
   

}
