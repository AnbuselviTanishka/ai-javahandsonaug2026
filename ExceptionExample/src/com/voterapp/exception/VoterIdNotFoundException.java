package com.voterapp.exception;

public class VoterIdNotFoundException extends NotEligibleException {

	public VoterIdNotFoundException() {
		super();
	}
	
	public VoterIdNotFoundException(String message) {
		super(message);
	}

}
