package com.github.henriquedreyer.models.customers;

import java.util.List;

import com.github.henriquedreyer.models.dao.DAOFactoryManager;
import com.github.henriquedreyer.models.dao.DAOManager;

public class CustomerManager implements ModelManager<Customer>{
	private DAOManager daoManager;
	
	public CustomerManager() {
		daoManager = DAOFactoryManager.getFactory();
	}

	public void save(Customer obj) {
		
		daoManager.save(obj);
	}

	public void update(Customer obj) {
		
		daoManager.update(obj);
	}

	public void delete(Customer obj) {

		daoManager.delete(obj);
	}

	public Customer getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
