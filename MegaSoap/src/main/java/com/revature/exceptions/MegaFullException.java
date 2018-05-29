package com.revature.exceptions;

public class MegaFullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public MegaFullException() {
		super("too many bosses, not enough video memory!");
	}
	
	public MegaFullException(String message) {
		super(message);
	}
	
}
