package com.its.ecommerceApp.model;

import java.time.LocalDate;

import com.its.ecommerceApp.utils.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerModel {

	private Long id;

	private String name;

	private String email;

	private String address;

	private String phoneNumber;

	private LocalDate createdDate;
}
