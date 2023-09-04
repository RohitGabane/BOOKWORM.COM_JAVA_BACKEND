package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.CustomerMaster;
import com.example.services.CustomerService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/customer")
public class CustomerMasterController {
	@Autowired
	private CustomerService customerSerivce;
	
	@PostMapping("/add")
	public void addCustomer(@RequestBody CustomerMaster customer) {
		customerSerivce.addCustomer(customer);
	}
}
