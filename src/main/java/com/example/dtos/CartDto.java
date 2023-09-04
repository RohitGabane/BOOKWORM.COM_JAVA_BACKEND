package com.example.dtos;

public class CartDto 
{
	private long productId;
	private long customerId;
	private String type;
	private int quantity;
	
	
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "CartDto [productId=" + productId + ", customerId=" + customerId + ", type=" + type + "]";
	}
	
	
	

}
