package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.GenreMaster;

public interface GenreService {
    void addGenreMaster(GenreMaster genre);
    List<GenreMaster> getGenreMasters(); // Correct method name
    void deleteGenreMaster(Long id);
    void updateGenreMaster(GenreMaster genre, Long id);
    Optional<GenreMaster> getGenreMaster(Long id); // Correct method name
    Optional<GenreMaster> getGenreMasterByName(String name);
}
