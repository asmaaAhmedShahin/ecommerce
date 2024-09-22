package com.its.ecommerceApp.entity;

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
	
	
	
	
	
	
	
	
	
	
	/*
	
	 @ManyToMany
	    @JoinTable(
	            name = "order_product", // Name of the join table
	            joinColumns = @JoinColumn(name = "order_id"), // Foreign key to the Order table
	            inverseJoinColumns = @JoinColumn(name = "product_id") // Foreign key to the Product table
	    )
	    private List<Product> product;

	    @ManyToMany
	    @JoinTable(
	            name = "merchant_product", // Name of the join table
	            joinColumns = @JoinColumn(name = "merchant_id"), // Foreign key to the merchant table
	            inverseJoinColumns = @JoinColumn(name = "product_id") // Foreign key to the Product table
	    )
	    private List<Merchant> merchant;
	    
	    */

}
