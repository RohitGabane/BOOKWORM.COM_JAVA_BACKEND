package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.MyShelf;
import com.example.entities.ProductMaster;

@Repository
public interface MyShelfRepository extends JpaRepository<MyShelf, Long> {

	@Query(value = "SELECT * FROM my_shelf WHERE customer_id = :id", nativeQuery = true)

	List<MyShelf> getByCustomerId(@Param("id") Long customerId);

}