package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.ProductAttribute;

public interface ProductAttributeService 
{
	 List<ProductAttribute> getAllProductAttributes();
	 Optional<ProductAttribute> getProductAttributeById(Long id);
	 ProductAttribute createProductAttribute(ProductAttribute productAttribute) ;
	 void updateProductAttribute(Long id, ProductAttribute updatedProductAttribute);
	 void deleteProductAttribute(Long id);

}