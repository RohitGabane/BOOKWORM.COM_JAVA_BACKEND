package com.example.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ProductTypeMaster;
import com.example.services.IProductTypeMaster;


@RestController 
@RequestMapping("/api/productType")
@CrossOrigin("*")
public class ProductTypeMasterController {
	


	
		@Autowired
		IProductTypeMaster p;
		
		
		 @GetMapping(value = "/getAll")
		 public List<ProductTypeMaster> showAllProducts()
		 {
			  return p.getAllProducts(); 
			
		 }
		
		 @DeleteMapping(value = "/delete/{pid}")
		 public void deleteProduct(@PathVariable Long pid)
		 {
			p.delete(pid);
		 }
		 @PutMapping(value = "/update/{pid}")
		 public void updateProduct(@RequestBody ProductTypeMaster product,@PathVariable Long pid)
		 {
			System.out.println("inside updatepro of controller");
			p.update(product, pid);
		 }
		 @PostMapping(value = "/add")
		 public void addpro(@RequestBody ProductTypeMaster product)
		 {
			System.out.println("addpro called");
			p.addProductType(product);
		 }
		 
		 @GetMapping("/getByType/{type}")
		 public void getByType(@PathVariable String type) {
			 p.getByType(type);
		 }
	

}