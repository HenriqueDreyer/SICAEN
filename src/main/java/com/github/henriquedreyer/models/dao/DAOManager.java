package com.github.henriquedreyer.models.dao;

import java.io.Serializable;
import java.util.List;

import com.github.henriquedreyer.models.customers.Customer;

public interface DAOManager {
	
	void save(Object obj);
	
	void update(Object obj);
	
	void delete(Object obj);
	
	Object getById(Long id);
	
	List<? extends Serializable> getAll();

}
