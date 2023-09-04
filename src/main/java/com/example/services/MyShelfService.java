package com.example.services;

import java.util.List;

import com.example.entities.MyShelf;
import com.example.entities.ProductMaster;

public interface MyShelfService {
    MyShelf getById(Long shelfId);

    public List<MyShelf> getByCustomerId(long id);
    
   public MyShelf addToShelf(MyShelf shelf);
    
   

}