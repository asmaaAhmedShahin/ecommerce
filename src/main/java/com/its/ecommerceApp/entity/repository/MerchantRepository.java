package com.its.ecommerceApp.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.its.ecommerceApp.entity.Merchant;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {
	
    @Query("select m from Merchant m order by m.id desc")
    List<Merchant> custom();
}
