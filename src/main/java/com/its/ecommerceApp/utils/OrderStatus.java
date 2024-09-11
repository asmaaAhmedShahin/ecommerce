package com.its.ecommerceApp.utils;

public enum OrderStatus {
	 
	    PENDING,        // Order has been created but not yet processed.
	    CONFIRMED,      // Order has been confirmed by the merchant.
	    SHIPPED,        // Order has been shipped to the customer.
	    DELIVERED,      // Order has been delivered to the customer.
	    CANCELED,       // Order has been canceled by the customer or merchant.
	    RETURNED        // Order has been returned by the customer.
 
}
