package com.example.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BeneficiaryMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long benId;
    
    private String benName;
    private String benEmailId;
    private String benContactNo;
    private String benBankName;
    private String benBankBranch;
    public long getBenId() {
		return benId;
	}
	public void setBenId(long benId) {
		this.benId = benId;
	}
	public String getBenName() {
		return benName;
	}
	public void setBenName(String benName) {
		this.benName = benName;
	}
	public String getBenEmailId() {
		return benEmailId;
	}
	public void setBenEmailId(String benEmailId) {
		this.benEmailId = benEmailId;
	}
	public String getBenContactNo() {
		return benContactNo;
	}
	public void setBenContactNo(String benContactNo) {
		this.benContactNo = benContactNo;
	}
	public String getBenBankName() {
		return benBankName;
	}
	public void setBenBankName(String benBankName) {
		this.benBankName = benBankName;
	}
	public String getBenBankBranch() {
		return benBankBranch;
	}
	public void setBenBankBranch(String benBankBranch) {
		this.benBankBranch = benBankBranch;
	}
	public String getBenIFSC() {
		return benIFSC;
	}
	public void setBenIFSC(String benIFSC) {
		this.benIFSC = benIFSC;
	}
	public String getBenAccNo() {
		return benAccNo;
	}
	public void setBenAccNo(String benAccNo) {
		this.benAccNo = benAccNo;
	}
	public String getBenAccType() {
		return benAccType;
	}
	public void setBenAccType(String benAccType) {
		this.benAccType = benAccType;
	}
	public String getBenPAN() {
		return benPAN;
	}
	public void setBenPAN(String benPAN) {
		this.benPAN = benPAN;
	}
	private String benIFSC;
    private String benAccNo;
    private String benAccType;
    private String benPAN;
    
    // Getter and setter methods
}