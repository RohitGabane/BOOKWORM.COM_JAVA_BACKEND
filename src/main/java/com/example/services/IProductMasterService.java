package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.ProductMaster;
import com.example.exceptions.ProductNotExistException;

public interface IProductMasterService {
	public void addProduct(ProductMaster promaster);

	public List<ProductMaster> getAllProducts();
	
	public ProductMaster getProduct(long id) ;

	public Optional<ProductMaster> deleteById(long id) throws ProductNotExistException;

	public Optional<ProductMaster> updateById(long id, ProductMaster obj);
	
	//public void updateById(ProductMaster product,long id);
	
	List<ProductMaster> getByType(long id);

}