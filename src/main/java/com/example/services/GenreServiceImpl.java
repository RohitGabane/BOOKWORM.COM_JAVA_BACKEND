package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.GenreMaster;
import com.example.repositories.*;

@Service
public class GenreServiceImpl implements GenreService {
    
    @Autowired
    private GenreMasterRepository repository;

    @Override
    public void addGenreMaster(GenreMaster genre) {
        repository.save(genre);
    }

    @Override
    public List<GenreMaster> getGenreMasters() {
        return repository.findAll();
    }

    @Override
    public void deleteGenreMaster(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void updateGenreMaster(GenreMaster genre, Long id) {
        repository.update(genre.getGenreDesc(), id);
    }

    @Override
    public Optional<GenreMaster> getGenreMaster(Long id) {
        return repository.findById(id);
    }

	@Override
	public Optional<GenreMaster> getGenreMasterByName(String name) {
		return repository.findByGenreDesc(name);
	}

    
}
