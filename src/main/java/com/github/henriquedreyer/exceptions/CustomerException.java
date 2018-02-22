package com.github.henriquedreyer.exceptions;

public class CustomerException extends Exception {
	
	public static String NULL_CUSTOMER = "Não é possivel cadastrar um item nulo";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomerException(String message) {
		super(message);
	}

}
