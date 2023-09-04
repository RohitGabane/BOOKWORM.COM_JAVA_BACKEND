package com.example.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.InvoiceTable;
import com.example.services.InvoiceTableService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/invoiceTable")
public class InvoiceTableController {

	@Autowired
	InvoiceTableService itService;

	@GetMapping("/getById/{id}")
	public Optional<InvoiceTable> getById(@PathVariable Long id) {
		System.out.println("");
		Optional<InvoiceTable> l = itService.getInvoiceById(id);
		System.out.println(l);
		return l;

	}

	@PostMapping("/add")
	public ResponseEntity<String> addInvoice(@RequestBody InvoiceTable inv) {
		System.out.println("inv added by post");
		itService.addInvoice(inv);
		return ResponseEntity.status(HttpStatus.CREATED).body("Invoice added succesfully");
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Long id) {
		itService.deleteByInvoiceId(id);
	}

}