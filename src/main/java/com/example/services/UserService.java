package com.example.services;

import java.util.ArrayList;
import java.util.List;

public class UserService {

	private List<String> list = new ArrayList<>();
	
	public UserService() {
		list.add("hello");
		list.add("hello");
		list.add("hello");
	}
	
	public List getList() {
		return list;
	}
}
