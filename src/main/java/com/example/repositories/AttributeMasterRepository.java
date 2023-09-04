package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.AttributeMaster;



@Repository
@Transactional
public interface AttributeMasterRepository extends JpaRepository<AttributeMaster,Long> 
{
	@Modifying
	@Query("update AttributeMaster a set a.attributeDesc = :desc where a.attributeId = :id")
	void update(@Param("desc") String desc,@Param("id") Long id);


}