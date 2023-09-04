package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.LanguageMaster;
import com.example.services.LanguageMasterService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/language")
public class LanguageMasterController {
	@Autowired
	private LanguageMasterService iservices;
	@PutMapping(value = "update/{id}")
	public void updatelanguage(@PathVariable int id,@RequestBody LanguageMaster language) {
	       iservices.updatelanguage(id, language);
	}
	 @GetMapping(value = "/getAll")
	public List<LanguageMaster> getalllanguage()
	{
	   return iservices.getalllanguage();
		
	}
	 @GetMapping(value="/getById/{id}")
	public Optional<LanguageMaster> getlanguagebytypeid(@PathVariable Long id)
	{
		return iservices.getlanguagebytypeid(id);
	}
	 @GetMapping(value = "/getByType/{type}")
	public Optional<LanguageMaster> getlanguagebyitsType(@PathVariable String type)
	{
		return iservices.getlanguagebyitsType(type);
	}
	

}