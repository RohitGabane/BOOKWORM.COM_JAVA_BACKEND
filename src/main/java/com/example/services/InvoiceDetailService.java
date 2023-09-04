package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.InvoiceDetails;

public interface InvoiceDetailService {

	public Optional<InvoiceDetails> getByInvDtlId(Long invDtlId);

	public List<InvoiceDetails> getAllInvoiceDetails();

	public List<InvoiceDetails> getByBasePrice(Double basePrice);

	public List<InvoiceDetails> getByTranType(String tranType);

	public Optional<InvoiceDetails> deleteInvoiceDetailsById(Long id);

	public void setInvoiceDetails(InvoiceDetails invdetails);

	public InvoiceDetails updateQuantity(Long id, InvoiceDetails invdetails);

	public InvoiceDetails updateTranType(Long id, InvoiceDetails invdetails);

}