package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.BeneficiaryMaster;



@Repository
public interface BeneficiaryMasterRepository extends JpaRepository<BeneficiaryMaster, Long> {

    @Modifying
    @Query("UPDATE BeneficiaryMaster b SET b.benName = :name WHERE b.benId = :id")
    void update(@Param("name") String name, @Param("id") long id);
}
