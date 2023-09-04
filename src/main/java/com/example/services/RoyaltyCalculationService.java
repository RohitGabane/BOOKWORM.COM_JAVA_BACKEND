package com.example.services;
import java.util.List;

import com.example.entities.*;
public interface RoyaltyCalculationService {
	void addRoyalty(RoyaltyCalculation royalty);
	List<RoyaltyCalculation> getByBeneficiary(long benId);
	List<RoyaltyCalculation> getByProduct(long productId);
	List<RoyaltyCalculation> getByInvoice(long invoiceId);
	List<RoyaltyCalculation> getRoyalties();
}
