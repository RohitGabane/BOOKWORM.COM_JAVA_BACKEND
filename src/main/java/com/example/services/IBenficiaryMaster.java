package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.BeneficiaryMaster;

public interface IBenficiaryMaster {
	void addBeneficiary(BeneficiaryMaster b);

	List<BeneficiaryMaster> getAllBen();

	void deleteById(long id);

	Optional<BeneficiaryMaster> getBen(long id);

	void update(long id, BeneficiaryMaster updatedBeneficiary);

}