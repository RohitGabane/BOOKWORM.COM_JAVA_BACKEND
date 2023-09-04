package com.example.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.CartDto;
import com.example.dtos.CartSendDto;
import com.example.entities.Cart;
import com.example.entities.CustomerMaster;
import com.example.entities.ProductMaster;
import com.example.services.CustomerService;
import com.example.services.ICartService;
import com.example.services.IProductMasterService;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin("*")
public class CartContoller {
	@Autowired
	ICartService cartService;
	@Autowired
	CustomerService custService;
	@Autowired
	IProductMasterService prodService;

	@PostMapping("/addtocart")
	public ResponseEntity<String> addToCart(@RequestBody CartDto cart) {
		System.out.println("Cart " + cart);
		try {
			CustomerMaster user = custService.getCustomerById(cart.getCustomerId());
			ProductMaster product = prodService.getProduct(cart.getProductId());
			Cart cartItem = new Cart();
			cartItem.setCustomer(user);
			cartItem.setProduct(product);
			cartItem.setType(cart.getType());
			cartItem.setQuantity(cart.getQuantity());

			cartService.addToCart(cartItem);

			return ResponseEntity.ok("Item added to cart successfully");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add item to cart");
		}
	}

	@GetMapping("/getallcart")
	public ArrayList<CartSendDto> getAllCartItem() {

		ArrayList<CartSendDto> list = new ArrayList<>();

		ArrayList<Cart> cartList = cartService.getAllCartList();

		for (Cart cartItem : cartList) {
			CartSendDto obj = new CartSendDto();
			obj.setId(cartItem.getCartId());
			obj.setPrice(cartItem.getProduct().getProductSpCost());
			obj.setProductName(cartItem.getProduct().getProductName());
			obj.setQuantity(cartItem.getQuantity());
			obj.setTotalPrice(cartItem.getQuantity() * cartItem.getProduct().getProductSpCost());
			obj.setType(cartItem.getType());

			list.add(obj);
		}

		return list;

	}
	
	
	

}
