package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.BeneficiaryMaster;
import com.example.repositories.BeneficiaryMasterRepository;

@Service
public class BeneficiaryMasterImpl implements IBenficiaryMaster {

	@Autowired
	private BeneficiaryMasterRepository repository;

	@Override
	public void addBeneficiary(BeneficiaryMaster b) {
		// TODO Auto-generated method stub
		repository.save(b);
	}

	@Override
	public List<BeneficiaryMaster> getAllBen() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<BeneficiaryMaster> getBen(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void update(long id, BeneficiaryMaster updatedBeneficiary) {
		BeneficiaryMaster beneficiary = repository.findById(id).orElse(null);
		if (beneficiary != null) {
			beneficiary.setBenName(updatedBeneficiary.getBenName());
			// Set other fields as needed
			repository.save(beneficiary);
		}
	}

}