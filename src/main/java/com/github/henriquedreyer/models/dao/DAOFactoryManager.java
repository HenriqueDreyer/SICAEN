package com.github.henriquedreyer.models.dao;

public abstract class DAOFactoryManager{

	public static DAOManager getFactory() {		
		return InMemoryDao.getInstance();
	}

}
