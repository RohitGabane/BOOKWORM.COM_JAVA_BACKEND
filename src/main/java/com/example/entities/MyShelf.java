package com.example.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class MyShelf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shelfId;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId" )
    private CustomerMaster customerId;
   
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private ProductMaster product;
    
    private String tranType;
    private LocalDate  productExpiryDate;
    private boolean isActive;
    
	public Long getShelfId() {
		return shelfId;
	}
	public void setShelfId(Long shelfId) {
		this.shelfId = shelfId;
	}
	public ProductMaster getProduct() {
		return product;
	}
	public void setProduct(ProductMaster product) {
		this.product = product;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public LocalDate getProductExpiryDate() {
		return productExpiryDate;
	}
	public void setProductExpiryDate(LocalDate localDate) {
		this.productExpiryDate = localDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public CustomerMaster getCustomerId() {
		return customerId;
	}
	public void setCustomerId(CustomerMaster customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "MyShelf [shelfId=" + shelfId + ", customerId=" + customerId + ", product=" + product + ", tranType="
				+ tranType + ", productExpiryDate=" + productExpiryDate + ", isActive=" + isActive + "]";
	}
	
	
	
}