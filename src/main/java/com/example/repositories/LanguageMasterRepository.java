package com.example.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

import com.example.entities.LanguageMaster;

import jakarta.transaction.Transactional;
@Transactional
public interface LanguageMasterRepository extends JpaRepositoryImplementation<LanguageMaster, Long>{
	@Modifying
	@Query("update LanguageMaster l set l.languageDesc=:languageDesc where l.languageId=:id ")
 void update(@Param("languageDesc") String languageDesc,@Param("id") long languageId);
 @Query("SELECT lm.languageDesc FROM LanguageMaster lm WHERE lm.productType.typeDesc = :type_desc")

	Optional<LanguageMaster> listoflanguage(@Param("type_desc") String typeDesc);
	
	
}