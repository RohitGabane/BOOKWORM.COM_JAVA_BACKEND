package com.example.services;

import java.util.ArrayList;
import java.util.List;

import com.example.dtos.CartSendDto;
import com.example.entities.Cart;
import com.example.entities.CustomerMaster;

public interface ICartService 
{
	public Cart addToCart(Cart cart);
	
	public ArrayList<Cart> getAllCartList();
	
	public List<Cart> getCartByCustomerId(CustomerMaster id);
	
	public void deleteAll();

}
