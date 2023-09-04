package com.example.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.GenreMaster;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface GenreMasterRepository extends JpaRepository<GenreMaster, Long> {

    Optional<GenreMaster> findByGenreDesc(String name);
    
    @Modifying
    @Query("UPDATE GenreMaster g SET g.genreDesc = :genreDesc WHERE g.genreId = :genreId")
    void update(@Param("genreDesc") String genreDesc, @Param("genreId") Long id);
}
