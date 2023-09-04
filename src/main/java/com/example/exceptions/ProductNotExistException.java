package com.example.exceptions;

public class ProductNotExistException extends Exception
{
	   public ProductNotExistException(String msg) {
	        super(msg);
	    }

}