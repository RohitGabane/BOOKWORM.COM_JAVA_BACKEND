
package com.example.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.InvoiceTable;

import jakarta.transaction.Transactional;
import java.util.List;
import java.sql.Date;
import com.example.entities.CustomerMaster;

@Repository
@Transactional
public interface InvoiceTableRepository extends JpaRepository<InvoiceTable, Long> {

	Optional<InvoiceTable> getByInvoiceId(Long invoiceId);

	List<InvoiceTable> getByInvoiceDate(Date invoiceDate);

	List<InvoiceTable> getByInvoiceAmount(Double invoiceAmount);

	List<InvoiceTable> getByCustomerId(CustomerMaster customerId);

	void deleteByInvoiceId(Long invoiceId);

	void deleteByCustomerId(CustomerMaster customerId);

	void deleteByInvoiceDate(Date invoiceDate);

}