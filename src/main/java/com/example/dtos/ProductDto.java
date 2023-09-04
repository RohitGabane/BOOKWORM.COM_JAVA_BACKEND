package com.example.dtos;

public class ProductDto 
{
	private long id;
	private String productName;
	private double price;
	private boolean isRentable;
	private boolean isLibrary;
	private double rentPerDay;
	private double minRentDays;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isRentable() {
		return isRentable;
	}
	public void setRentable(boolean isRentable) {
		this.isRentable = isRentable;
	}
	public boolean isLibrary() {
		return isLibrary;
	}
	public void setLibrary(boolean isLibrary) {
		this.isLibrary = isLibrary;
	}
	public double getRentPerDay() {
		return rentPerDay;
	}
	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	public double getMinRentDays() {
		return minRentDays;
	}
	public void setMinRentDays(double minRentDays) {
		this.minRentDays = minRentDays;
	}
	
	
	
	

}
