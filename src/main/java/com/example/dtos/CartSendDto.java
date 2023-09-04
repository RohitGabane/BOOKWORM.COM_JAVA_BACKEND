package com.example.dtos;

public class CartSendDto 
{
	private long id;
	private String productName;
	private int quantity;
	private double price ;
	private double totalPrice;
	private String type;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "CartSendDto [id=" + id + ", productName=" + productName + ", quantity=" + quantity + ", price=" + price
				+ ", totalPrice=" + totalPrice + ", type=" + type + "]";
	}

	
	
	
	
	
	
	

}
