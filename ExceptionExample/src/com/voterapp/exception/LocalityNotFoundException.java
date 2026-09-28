package com.voterapp.exception;

public class LocalityNotFoundException  extends NotEligibleException{

	public LocalityNotFoundException() {
		super();
	}

	public LocalityNotFoundException(String message) {
		super(message);
	}

}
