package com.example.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.CustomerMaster;
import com.example.entities.InvoiceTable;
import com.example.repositories.InvoiceTableRepository;

@Service
public class InvoiceTableServiceImpl implements InvoiceTableService {

	@Autowired
	InvoiceTableRepository repo;

	@Override
	public Optional<InvoiceTable> getInvoiceById(Long invoiceId) {
		return repo.getByInvoiceId(invoiceId);
	}

	@Override
	public void deleteByInvoiceId(Long id) {
		repo.deleteByInvoiceId(id);
	}

	@Override
	public void addInvoice(InvoiceTable invoice) {
		repo.save(invoice);
	}

	@Override
	public List<InvoiceTable> getByCustomerId(CustomerMaster customerId) {
		return repo.getByCustomerId(customerId);
	}

	@Override
	public void deleteByCustomerId(CustomerMaster custId) {

		repo.deleteByCustomerId(custId);
	}

	@Override
	public List<InvoiceTable> getByInvoiceAmount(Double amount) {
		return repo.getByInvoiceAmount(amount);
	}

	@Override
	public List<InvoiceTable> getInvoiceByDate(Date date) {
		return repo.getByInvoiceDate(date);
	}

	@Override
	public void deleteByInvoiceDate(Date date) {
		repo.deleteByInvoiceDate(date);
	}

}