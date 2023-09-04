package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.InvoiceDetails;
import com.example.repositories.*;

@Service
public class InvoiceDetailServiceImpl implements InvoiceDetailService {

	@Autowired
	InvoiceDetailRepository repository;

	@Override
	public Optional<InvoiceDetails> getByInvDtlId(Long invDtlId) {
		return repository.findById(invDtlId);
	}

	@Override
	public List<InvoiceDetails> getAllInvoiceDetails() {
		return repository.findAll();
	}

	@Override
	public List<InvoiceDetails> getByBasePrice(Double basePrice) {
		return repository.findByBasePrice(basePrice);
	}

	@Override
	public List<InvoiceDetails> getByTranType(String tranType) {
		return repository.findByTranType(tranType);
	}

	@Override
	public InvoiceDetails updateQuantity(Long id, InvoiceDetails invdetails) {
		InvoiceDetails existingInvoice = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Invoice not found with ID: " + id));

		existingInvoice.setQuantity(invdetails.getQuantity());
		return repository.save(existingInvoice);
	}

	@Override
	public InvoiceDetails updateTranType(Long id, InvoiceDetails inv) {
		InvoiceDetails existingInvoice = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Invoice not found with ID: " + id));

		existingInvoice.setTranType(inv.getTranType());
		return repository.save(existingInvoice);
	}

	

	@Override
	public Optional<InvoiceDetails> deleteInvoiceDetailsById(Long id) {
		Optional<InvoiceDetails> invdtl = repository.findById(id);
		repository.deleteById(id);
		return invdtl;
	}

	@Override
	public void setInvoiceDetails(InvoiceDetails invdetails) {
		repository.save(invdetails);
	}
}