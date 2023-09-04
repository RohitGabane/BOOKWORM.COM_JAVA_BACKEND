package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.ProductMaster;
import com.example.exceptions.ProductNotExistException;
import com.example.repositories.IProductMasterRepository;

@Transactional
@Service
public class ProductMasterServiceImpl implements IProductMasterService {
	@Autowired
	IProductMasterRepository productMasterRepo;

	@Override
	public void addProduct(ProductMaster promaster) {

		System.out.println("Inside the service \n" + productMasterRepo.save(promaster));
	}

	@Override
	public ProductMaster getProduct(long id)  {
		ProductMaster obj = productMasterRepo.getById(id);
	
		return obj;

	}

	@Override
	public Optional<ProductMaster> deleteById(long id) throws ProductNotExistException {

		Optional<ProductMaster> obj = productMasterRepo.findById(id);
		if (!obj.isPresent()) {
			throw new ProductNotExistException("product is invalid " + id);
		}

		productMasterRepo.deleteById(id);
		return obj;

	}

	@Override
	public Optional<ProductMaster> updateById(long id, ProductMaster obj) {

		return Optional.empty();
	}

	@Override
	public List<ProductMaster> getAllProducts() {
		return productMasterRepo.findAll();
	}

	@Override
	public List<ProductMaster> getByType(long id) {
		return productMasterRepo.findByProductType(id);
	}

//	@Override
//	public void updateById(ProductMaster product, long id) {
//		productMasterRepo.updateById(product, id);
//	}

}