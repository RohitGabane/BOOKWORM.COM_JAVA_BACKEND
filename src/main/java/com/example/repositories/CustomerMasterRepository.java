package com.example.repositories;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.CustomerMaster;
import java.util.List;


@Repository
public interface CustomerMasterRepository extends JpaRepository<CustomerMaster, Long> {
    @Query("SELECT c FROM CustomerMaster c WHERE c.customerId = ?1")
    CustomerMaster getById(Long id);
    
    public Optional<CustomerMaster> findByCustomerEmail(String customerEmail);
}
