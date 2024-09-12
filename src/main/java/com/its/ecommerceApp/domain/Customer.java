
package com.its.ecommerceApp.domain;

import java.time.LocalDate;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	@Column(name = "created_date", nullable = false)
	private LocalDate createdDate;
}
