package com.example.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.ProductDto;
import com.example.entities.ProductMaster;
import com.example.exceptions.ProductNotExistException;
import com.example.services.IProductMasterService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductMasterController {
	@Autowired
	IProductMasterService proService;

	@PostMapping("/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody ProductMaster proMaster) {
		System.out.println("Hello " + proMaster);

		try {
			proService.addProduct(proMaster);
			return new ResponseEntity<String>("success", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Falied", HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/getProduct/{id}")
	public ResponseEntity<ProductMaster> getProduct(@PathVariable long id) {
		ProductMaster obj = null;

		try {
			obj = proService.getProduct(id);
			return new ResponseEntity<ProductMaster>(obj, HttpStatus.OK);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<ProductMaster>(obj, HttpStatus.BAD_REQUEST);

	}

	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<Optional<ProductMaster>> deleteById(@PathVariable long id) {
		Optional<ProductMaster> obj = null;

		try {
			obj = proService.deleteById(id);
			return new ResponseEntity<Optional<ProductMaster>>(obj, HttpStatus.OK);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<Optional<ProductMaster>>(obj, HttpStatus.BAD_REQUEST);

	}

	public ResponseEntity<Optional<ProductMaster>> updateById(@PathVariable long id, @RequestBody ProductMaster obj) {
		try {
			if (id == obj.getProductId())
				throw new ProductNotExistException("ProductIdDoesNotMatch");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@GetMapping("/getProducts")
	public ResponseEntity<List<ProductMaster>> getAllProducts() {
		List<ProductMaster> products = null;

		try {
			products = proService.getAllProducts();
			return new ResponseEntity<List<ProductMaster>>(products, HttpStatus.OK);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<List<ProductMaster>>(products, HttpStatus.BAD_REQUEST);

	}
	
	@GetMapping("/getByType/{id}")
	public List<ProductDto> getByType(@PathVariable int id) {
		System.out.println("hhhhhhhhhhhhh");
		List<ProductMaster> list = proService.getByType(id);
		List<ProductDto> sendList = new ArrayList<>();
		for (ProductMaster obj : list) {
			ProductDto newObje = new ProductDto();
			newObje.setId(obj.getProductId());
			newObje.setLibrary(obj.isLibrary());
			newObje.setMinRentDays(obj.getMinRentDays());
			newObje.setPrice(obj.getProductSpCost());
			newObje.setProductName(obj.getProductName());
			newObje.setRentable(obj.isRentable());
			newObje.setRentPerDay(obj.getRentPerDay());
			sendList.add(newObje);
			
		}
		System.out.println(list);
		return sendList;
	}

}