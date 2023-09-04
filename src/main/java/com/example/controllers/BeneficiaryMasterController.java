package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.BeneficiaryMaster;
import com.example.services.IBenficiaryMaster;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/beneficiary")
public class BeneficiaryMasterController {

	@Autowired
	private IBenficiaryMaster beneficiaryRepo;

	@GetMapping("/getBen")
	public ResponseEntity<List<BeneficiaryMaster>> showBeneficiaries() {
		List<BeneficiaryMaster> beneficiaries = beneficiaryRepo.getAllBen();
		return new ResponseEntity<>(beneficiaries, HttpStatus.OK);
	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<BeneficiaryMaster> getBeneficiaryById(@PathVariable long id) {
		Optional<BeneficiaryMaster> optionalBeneficiary = beneficiaryRepo.getBen(id);

		if (optionalBeneficiary.isPresent()) {
			return new ResponseEntity<>(optionalBeneficiary.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<Void> addBeneficiary(@RequestBody BeneficiaryMaster beneficiary) {
		try {
			beneficiaryRepo.addBeneficiary(beneficiary);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Void> updateBeneficiary(@PathVariable long id,
			@RequestBody BeneficiaryMaster updatedBeneficiary) {
		try {
			beneficiaryRepo.update(id, updatedBeneficiary);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
