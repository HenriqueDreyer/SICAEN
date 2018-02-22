package com.github.henriquedreyer.models.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InMemoryDao implements DAOManager{
	private static InMemoryDao instance;
	private static List<Object> dataSource;
	
	private InMemoryDao() {
		dataSource = new ArrayList<Object>();
	}
	
	protected static InMemoryDao getInstance() {
		if(instance == null)
			instance = new InMemoryDao();
		return instance;
	}

	public void save(Object obj) {
		// TODO Auto-generated method stub
		
	}

	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Object obj) {
		// TODO Auto-generated method stub
		
	}

	public Object getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<? extends Serializable> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
