package com.revature.mocitodemo;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {

	@Override
	public List<String> getTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use Hibernate ", " Use Spring MVC ");
	}

}
