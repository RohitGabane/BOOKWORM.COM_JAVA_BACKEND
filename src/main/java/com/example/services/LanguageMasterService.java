package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.LanguageMaster;

public interface LanguageMasterService {
	public void updatelanguage(long id,LanguageMaster language);
      public List<LanguageMaster> getalllanguage();
	public Optional<LanguageMaster> getlanguagebytypeid(Long id);
	public Optional<LanguageMaster> getlanguagebyitsType(String type);
      
      

}