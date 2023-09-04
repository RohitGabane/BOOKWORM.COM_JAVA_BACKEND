package com.example.controllers;

import java.util.List;
import java.util.Optional;


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

import com.example.services.InvoiceDetailService;


import com.example.entities.InvoiceDetails;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/invoiceDetails")
public class InvoiceDeatilsController {
	
	@Autowired
	private InvoiceDetailService service;
	
	@GetMapping("getAll")
	public List<InvoiceDetails> getAllInvoiceDetails()
	{
		return service.getAllInvoiceDetails();
	}
	

	@GetMapping("/getById/{Id}")
	public Optional<InvoiceDetails> getInvDtlId(@PathVariable Long id) 
	{
		return service.getByInvDtlId(id);
	}
	
	@GetMapping("/tranType/{tranType}")
	public List<InvoiceDetails> gettranType(@PathVariable String tranType) 
	{
		return service.getByTranType(tranType);
	}
	@GetMapping("/baseprice/{basePrice}")
	public List<InvoiceDetails> getByBasePrice(@PathVariable Double basePrice)
	{
		return service.getByBasePrice(basePrice);
	}
	@PostMapping("/add")
	public void setInvoiceDetails(@RequestBody InvoiceDetails invdtl) {
		service.setInvoiceDetails(invdtl);
	}
	@DeleteMapping("/delete/{Id}")
	public Optional<InvoiceDetails> deleteInvoiceDetailsById(@PathVariable Long id){
		Optional<InvoiceDetails> InvDtl = service.deleteInvoiceDetailsById(id);
		return InvDtl;
	}
	@PutMapping("/updateQuantity")
	public InvoiceDetails updateQuantity(@PathVariable Long Id,@RequestBody InvoiceDetails inv) {
		return service.updateQuantity(Id, inv);
	}
	@PutMapping("/updateTranType")
	public InvoiceDetails updateTranType(@PathVariable Long Id,@RequestBody InvoiceDetails inv) {
		return service.updateTranType(Id, inv);
	}
	
	
}