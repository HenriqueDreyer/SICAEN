package com.github.henriquedreyer.models.customers;

import java.util.List;

public interface ModelManager<T> {
	
	void save(T obj);
	
	void update(T obj);
	
	void delete(T obj);
	
	T getById(Long id);
	
	List<T> getAll();

}
