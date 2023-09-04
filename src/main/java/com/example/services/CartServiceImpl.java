package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dtos.CartSendDto;
import com.example.entities.Cart;
import com.example.entities.CustomerMaster;
import com.example.repositories.CartRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartServiceImpl implements ICartService 
{
	@Autowired
	CartRepository cartRepo;
	

	@Override
	public Cart addToCart(Cart cart) 
	{
		return cartRepo.save(cart); 
		
		
	}


	@Override
	public ArrayList<Cart> getAllCartList() {
		return (ArrayList<Cart>) cartRepo.findAll();
		
	}


	@Override
	public List<Cart> getCartByCustomerId(CustomerMaster custObj) {
		return  cartRepo.findByCustomer(custObj);
		
	}


	@Override
	public void deleteAll() {
		cartRepo.deleteAll();
		
	}



	

}
