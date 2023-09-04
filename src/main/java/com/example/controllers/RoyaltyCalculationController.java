package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.RoyaltyCalculation;
import com.example.services.RoyaltyCalculationService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/royalty")
public class RoyaltyCalculationController {
    
    @Autowired
    private RoyaltyCalculationService royaltyCalculationService;

    @PostMapping("/add")
    public ResponseEntity<String> addRoyalty(@RequestBody RoyaltyCalculation royalty) {
    	System.out.println(royalty);
        royaltyCalculationService.addRoyalty(royalty);
        return ResponseEntity.status(HttpStatus.CREATED).body("Royalty added successfully");
    }

    @GetMapping("/beneficiary/{benId}")
    public ResponseEntity<List<RoyaltyCalculation>> getRoyaltyByBeneficiary(@PathVariable long benId) {
        List<RoyaltyCalculation> royalties = royaltyCalculationService.getByBeneficiary(benId);
        return ResponseEntity.ok(royalties);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<RoyaltyCalculation>> getRoyaltyByProduct(@PathVariable int productId) {
        List<RoyaltyCalculation> royalties = royaltyCalculationService.getByProduct(productId);
        return ResponseEntity.ok(royalties);
    }

    @GetMapping("/invoice/{invoiceId}")
    public ResponseEntity<List<RoyaltyCalculation>> getRoyaltyByInvoice(@PathVariable int invoiceId) {
        List<RoyaltyCalculation> royalties = royaltyCalculationService.getByInvoice(invoiceId);
        return ResponseEntity.ok(royalties);
    }
    
    @GetMapping("/getAll")
    public ResponseEntity<List<RoyaltyCalculation>> getRoyalties() {
    	List<RoyaltyCalculation> royalties = royaltyCalculationService.getRoyalties();
    	return ResponseEntity.ok(royalties);
    }
}
