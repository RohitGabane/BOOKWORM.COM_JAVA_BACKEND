package com.example.controllers;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.ShelfDto;
import com.example.entities.Cart;
import com.example.entities.CustomerMaster;
import com.example.entities.MyShelf;
import com.example.entities.ProductMaster;
import com.example.services.CustomerService;
import com.example.services.ICartService;
import com.example.services.MyShelfService;

@RestController
@RequestMapping("/api/myshelf")
public class MyShelfController {

    @Autowired
    MyShelfService myShelfService;
    
    @Autowired
    ICartService cartService;
    
    @Autowired
    CustomerService custService; 
    
    
    @GetMapping("/{id}")
    public ResponseEntity<MyShelf> getById(@PathVariable Long id) {
        MyShelf shelf = myShelfService.getById(id);
        if (shelf != null) {
            return ResponseEntity.ok(shelf);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/customer/{customerId}")
    public List<ShelfDto> getByCustomerId(@PathVariable Long customerId) 
    {
    	System.out.println("Hello");
    	ArrayList<MyShelf>list =  (ArrayList<MyShelf>) myShelfService.getByCustomerId(customerId);
    	ArrayList<ShelfDto> shelfList = new ArrayList<>();
    	System.out.println("In controller "+list);
    	
    	for (MyShelf myShelf : list) {
			ShelfDto obj = new ShelfDto();
			obj.setName(myShelf.getProduct().getProductName());
			obj.setFilePath(myShelf.getProduct().getFilePath());
			obj.setImagePath(myShelf.getProduct().getImagePath());
			shelfList.add(obj);
			
		}
    	return shelfList;
    }
    
    @PostMapping("/addtoshell/{id}")
    public String addToShell(@PathVariable Long id)
    {
    	System.out.println("Hello");
    	boolean flag = true;
    	 CustomerMaster user =  custService.getCustomerById(id);
    	System.out.println("USer"+ user);
    	
    	List<Cart> cartList =  cartService.getCartByCustomerId(user);
    	System.out.println("Cart list "+cartList );
    	
    	for (Cart cart : cartList) {
    		
			MyShelf obj = new MyShelf();
			obj.setActive(true);
			obj.setCustomerId(user);
			obj.setProduct(cart.getProduct());
			obj.setProductExpiryDate(java.time.LocalDate.now());
			obj.setTranType("upi");
			
			
			 MyShelf obj1 =  myShelfService.addToShelf(obj);
			 System.out.println("Myshelf obj "+obj1);
			 
			
			 if(obj1 == null)
				 flag = false;
			// cartService.deleteById(cart.getCartId());
			 
			 
			 if(obj1 == null)
				 return "Fail";
		}
    	
    	if(flag)
    	{
    		cartService.deleteAll();
    	}
    	
    	
    	return "Success";
    }
    
    
    
  
}
