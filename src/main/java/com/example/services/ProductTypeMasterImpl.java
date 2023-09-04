package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.ProductMaster;
import com.example.entities.ProductTypeMaster;
import com.example.repositories.ProductTypeMasterRepository;

@Service
public class ProductTypeMasterImpl implements IProductTypeMaster {

	@Autowired
	private final ProductTypeMasterRepository repository;

	public ProductTypeMasterImpl(ProductTypeMasterRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<ProductTypeMaster> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public void addProductType(ProductTypeMaster p) {
		repository.save(p);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void update(ProductTypeMaster p, Long id) {
		repository.update(p.getTypeDesc(), id);
	}

	public Optional<ProductTypeMaster> getByType(String type) {
		return repository.findByTypeDesc(type);
	}
}