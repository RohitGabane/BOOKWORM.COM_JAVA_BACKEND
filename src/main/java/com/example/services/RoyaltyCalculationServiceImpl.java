package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.BeneficiaryMaster;
import com.example.entities.InvoiceTable;
import com.example.entities.ProductMaster;
import com.example.entities.RoyaltyCalculation;
import com.example.repositories.RoyaltyCalculationRepository;

@Service
public class RoyaltyCalculationServiceImpl implements RoyaltyCalculationService{
	
	@Autowired
	RoyaltyCalculationRepository repository;

	@Override
	public void addRoyalty(RoyaltyCalculation royalty) {
		// TODO Auto-generated method stub
		repository.save(royalty);
	}

	@Override
	public List<RoyaltyCalculation> getByBeneficiary(long benId) {
		// TODO Auto-generated method stub
		return repository.getByBeneficiaryId(benId);
	}

	@Override
	public List<RoyaltyCalculation> getByProduct(long productId) {
		// TODO Auto-generated method stub
		return repository.getByProductId(productId);
	}

	@Override
	public List<RoyaltyCalculation> getByInvoice(long invoiceId) {
		// TODO Auto-generated method stub
		return repository.getByInvoiceId(invoiceId);
	}

	@Override
	public List<RoyaltyCalculation> getRoyalties() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	

}
