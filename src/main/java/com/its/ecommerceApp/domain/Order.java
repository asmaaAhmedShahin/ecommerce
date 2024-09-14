package com.its.ecommerceApp.domain;

import java.time.LocalDate;
import java.util.List;

import com.its.ecommerceApp.utils.OrderStatus;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customerId;

	/*
	 * @ElementCollection private List<Long> productIds;
	 */

	@Enumerated(EnumType.STRING)
	private OrderStatus status;

	@Column(name = "order_date")
	private LocalDate orderDate;

}
