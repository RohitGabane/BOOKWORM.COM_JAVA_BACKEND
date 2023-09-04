package com.example.repositories;
import com.example.entities.ProductAttribute;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, Long>
{
	@Modifying
	@Query("update ProductAttribute set attributeValue=:attributeValue where prodAttId=:prodAttId")
	void update(@Param ("attributeValue") String attributevalue,@Param("prodAttId")Long id);

}