package com.its.ecommerceApp.domain;

import java.time.LocalDate;
import java.util.List;

import com.its.ecommerceApp.utils.OrderStatus;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
//asmaa join
    @Column(name = "customer_id")
	private Long customerId;
	// asmaa M-M join
 
	/*
	 * @ElementCollection 
	 * private List<Long> productIds;
	 */
    
	 @Enumerated(EnumType.STRING)
	 private OrderStatus status;
	 
		
		@Column(name = "order_date")
		private LocalDate orderDate;

		/*
		 * @Column(name = "status") private String status;
		 */
 

}
