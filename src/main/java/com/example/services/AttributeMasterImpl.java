package com.example.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.AttributeMaster;
import com.example.repositories.AttributeMasterRepository;
import com.example.repositories.ProductTypeMasterRepository;

@Service
public class AttributeMasterImpl implements IAttributeMaster
{
	@Autowired
	private final AttributeMasterRepository repository;
	public AttributeMasterImpl(AttributeMasterRepository repository)
	{
		this.repository=repository;
	}
	@Override
	public List<AttributeMaster> getAllAttribute() {
		 return repository.findAll();
	}

	@Override
	public void addAttribute(AttributeMaster a) {
		 repository.save(a);
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public void update(AttributeMaster a,Long id) {
		repository.update(a.getAttributeDesc(),id);
		
	}

}