package com.example.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class RoyaltyCalculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roycalId;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "royalty_id")
    private InvoiceTable invoice;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ben_id")
    private BeneficiaryMaster beneficiary;
    
    private Date roycalTrandate;
    
    public long getRoycalId() {
		return roycalId;
	}
	public void setRoycalId(long roycalId) {
		this.roycalId = roycalId;
	}
	
	
	public InvoiceTable getInvoice() {
		return invoice;
	}
	public void setInvoice(InvoiceTable invoice) {
		this.invoice = invoice;
	}
	public ProductMaster getProduct() {
		return product;
	}
	public void setProduct(ProductMaster product) {
		this.product = product;
	}
	public BeneficiaryMaster getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(BeneficiaryMaster beneficiary) {
		this.beneficiary = beneficiary;
	}
	public Date getRoycalTrandate() {
		return roycalTrandate;
	}
	public void setRoycalTrandate(Date roycalTrandate) {
		this.roycalTrandate = roycalTrandate;
	}
	
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getRoyaltyOnBasePrice() {
		return royaltyOnBasePrice;
	}
	public void setRoyaltyOnBasePrice(double royaltyOnBasePrice) {
		this.royaltyOnBasePrice = royaltyOnBasePrice;
	}
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private ProductMaster product;
    
    @Override
	public String toString() {
		return "RoyaltyCalculation [roycalId=" + roycalId + ", invoice=" + invoice + ", beneficiary=" + beneficiary
				+ ", roycalTrandate=" + roycalTrandate + ", product=" + product + ", qty=" + qty + ", tranType="
				+ tranType + ", salePrice=" + salePrice + ", basePrice=" + basePrice + ", royaltyOnBasePrice="
				+ royaltyOnBasePrice + "]";
	}
	private int qty;
    private String tranType;
    private double salePrice;
    private double basePrice;
    private double royaltyOnBasePrice;
    
    // Getter and setter methods
}