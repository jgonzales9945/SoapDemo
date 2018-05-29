package com.revature.exceptions;

public class MegaBeatenException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MegaBeatenException() {
		super("Megaman destroyed!");
	}

	public MegaBeatenException(String message) {
		super(message);
	}

}
