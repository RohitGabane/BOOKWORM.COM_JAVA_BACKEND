package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.ProductAttribute;
import com.example.repositories.ProductAttributeRepository; // Corrected import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductAttributeServiceImpl implements ProductAttributeService {

    private final ProductAttributeRepository productAttributeRepository;

    @Autowired
    public ProductAttributeServiceImpl(ProductAttributeRepository productAttributeRepository) {
        this.productAttributeRepository = productAttributeRepository;
    }

    @Override
    public List<ProductAttribute> getAllProductAttributes() {
        return productAttributeRepository.findAll();
    }

    @Override
    public Optional<ProductAttribute> getProductAttributeById(Long id) {
        return productAttributeRepository.findById(id);
    }

    @Override
    public ProductAttribute createProductAttribute(ProductAttribute productAttribute) {
    	
        
        return productAttributeRepository.save(productAttribute);
    }

    @Override
    public void updateProductAttribute(Long id, ProductAttribute updatedProductAttribute) {
               productAttributeRepository.update(updatedProductAttribute.getAttributeValue(),id);
    }

    @Override
    public void deleteProductAttribute(Long id) {
        productAttributeRepository.deleteById(id);
    }
}