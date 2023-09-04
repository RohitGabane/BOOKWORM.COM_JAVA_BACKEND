package com.example.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.AttributeMaster;
import com.example.services.IAttributeMaster;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/attribute")
public class AttributeMasterController {
    @Autowired
    IAttributeMaster attributeMaster;

    @GetMapping("/getAll")
    public ResponseEntity<List<AttributeMaster>> showAllAttributes() {
        List<AttributeMaster> attributes = attributeMaster.getAllAttribute();
        return new ResponseEntity<>(attributes, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAttribute(@PathVariable Long id) {
        try {
            attributeMaster.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateAttribute(@RequestBody AttributeMaster attribute, @PathVariable Long id) {
        try {
            attributeMaster.update(attribute, id);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addAttribute(@RequestBody AttributeMaster attribute) {
        try {
            attributeMaster.addAttribute(attribute);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
