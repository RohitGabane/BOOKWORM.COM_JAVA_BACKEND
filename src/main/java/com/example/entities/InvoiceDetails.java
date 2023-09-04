package com.example.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class InvoiceDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invDtlId;
    
    @ManyToOne
    @JoinColumn(name = "invoiceId")
    private InvoiceTable invoice;
    
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductMaster product;
    
    private int quantity;
    private double basePrice;
    private String tranType;
    private int rentNoOfDays;
	public Long getInvDtlId() {
		return invDtlId;
	}
	public void setInvDtlId(Long invDtlId) {
		this.invDtlId = invDtlId;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public int getRentNoOfDays() {
		return rentNoOfDays;
	}
	public void setRentNoOfDays(int rentNoOfDays) {
		this.rentNoOfDays = rentNoOfDays;
	}
    
    // Getter and setter methods
    
}