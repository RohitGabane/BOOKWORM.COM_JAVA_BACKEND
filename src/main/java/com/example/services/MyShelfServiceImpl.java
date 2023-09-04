package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.MyShelf;
import com.example.entities.ProductMaster;
import com.example.repositories.MyShelfRepository;

@Service
public class MyShelfServiceImpl implements MyShelfService {

	@Autowired
	MyShelfRepository myShelfRepo;

	@Override
	public MyShelf getById(Long shelfId) {
		Optional<MyShelf> shelfOptional = myShelfRepo.findById(shelfId);
		return shelfOptional.orElse(null);
	}



	@Override
	public MyShelf addToShelf(MyShelf shelf) {
		MyShelf obj =  myShelfRepo.save(shelf);
		return obj;
	}



	@Override
	public List<MyShelf> getByCustomerId(long id) {
	    List<MyShelf> list =  myShelfRepo.getByCustomerId(id);
	    System.out.println("In service "+list);
		return list;
	}

}