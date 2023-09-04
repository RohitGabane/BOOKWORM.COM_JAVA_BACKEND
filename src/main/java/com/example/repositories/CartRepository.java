package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Cart;
import com.example.entities.CustomerMaster;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> 
{
	
	List<Cart> findByCustomer(CustomerMaster customer);
	
	

}
