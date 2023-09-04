package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.entities.CustomerMaster;
import com.example.repositories.CustomerMasterRepository;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerMasterRepository customerRepository;
	@Autowired
    private PasswordEncoder passwordEncoder;
	@Override
	public void addCustomer(CustomerMaster customer) {
		customer.setPassword(passwordEncoder.encode(customer.getPassword()));
		customerRepository.save(customer);
	}
	@Override
	public CustomerMaster getCustomerById(long id) {
		
		return customerRepository.getById(id);
	}
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// load user from DATABASE
		return customerRepository.findByCustomerEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
	}
	
}
