package com.example.entities;

import java.util.Optional;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long cartId;
@OneToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
private ProductMaster product;
@OneToOne(fetch = FetchType.EAGER, cascade =  CascadeType.ALL)
private CustomerMaster customer;
private String type ;

private int quantity;







public int getQuantity() {
	return quantity;
}







public void setQuantity(int quantity) {
	this.quantity = quantity;
}







public long getCartId() {
	return cartId;
}







public void setCartId(long cartId) {
	this.cartId = cartId;
}







public ProductMaster getProduct() {
	return product;
}







public void setProduct(ProductMaster product) {
	this.product = product;
}







public CustomerMaster getCustomer() {
	return customer;
}







public void setCustomer(CustomerMaster customer) {
	this.customer = customer;
}







public String getType() {
	return type;
}







public void setType(String type) {
	this.type = type;
}







@Override
public String toString() {
	return "Cart [cartId=" + cartId + ", product=" + product + ", customer=" + customer + ", type=" + type + "]";
}





}








