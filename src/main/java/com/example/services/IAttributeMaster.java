package com.example.services;

import java.util.List;

import com.example.entities.AttributeMaster;

public interface IAttributeMaster 
{
   List<AttributeMaster> getAllAttribute();
   void addAttribute(AttributeMaster a);
   void delete(Long id);
   void update(AttributeMaster a, Long id);
}