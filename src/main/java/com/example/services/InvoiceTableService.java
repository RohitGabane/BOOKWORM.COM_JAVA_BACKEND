package com.example.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.example.entities.CustomerMaster;
import com.example.entities.InvoiceTable;

public interface InvoiceTableService {

	Optional<InvoiceTable> getInvoiceById(Long invoiceId);

	void deleteByInvoiceId(Long id);

	void addInvoice(InvoiceTable invoice);

	List<InvoiceTable> getByCustomerId(CustomerMaster customerId);

	void deleteByCustomerId(CustomerMaster custId);

	List<InvoiceTable> getByInvoiceAmount(Double customerId);

	List<InvoiceTable> getInvoiceByDate(Date date);

	void deleteByInvoiceDate(Date date);
}