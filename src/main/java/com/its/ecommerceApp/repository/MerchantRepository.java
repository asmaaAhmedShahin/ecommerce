package com.its.ecommerceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.its.ecommerceApp.domain.Merchant;

@Repository
	public interface MerchantRepository extends JpaRepository<Merchant, Long> {
	}

 
