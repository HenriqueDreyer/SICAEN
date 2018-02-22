package com.github.henriquedreyer.models.dao;

import org.junit.Before;
import org.junit.Test;

import com.github.henriquedreyer.exceptions.CustomerException;
import com.github.henriquedreyer.models.customers.Customer;
import com.github.henriquedreyer.models.customers.CustomerManager;
import com.github.henriquedreyer.models.customers.ModelManager;

public class CustomerManagerTest {

	private ModelManager<Customer> modelManager;
	private Customer customer;
	
	@Before
	public void setup() {
		modelManager = new CustomerManager();		
	}
	
	@Test(expected = CustomerException.class)	
	public void AdicionarNullCustomer() throws CustomerException {
		modelManager.save(customer);
	}

}
