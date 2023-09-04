package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.ProductMaster;
import com.example.entities.ProductTypeMaster;

public interface IProductTypeMaster {

	List<ProductTypeMaster> getAllProducts();

	void addProductType(ProductTypeMaster pro);

	void delete(Long id);

	void update(ProductTypeMaster p, Long id);
	
	Optional<ProductTypeMaster> getByType(String type);
}