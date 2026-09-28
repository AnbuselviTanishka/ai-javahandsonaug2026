package com.voterapp.service;

import com.voterapp.exception.*;

public class ElectionBoothImpl implements IElectionBooth {

	@Override
	public boolean checkEligibility(int age, String locality, long voterId) throws NotEligibleException {
		// TODO Auto-generated method stub
		if(checkAge(age) && checkLocality(locality) && checkVoterId(voterId))
		{
			return true;
		}
		return false;
	}

private boolean checkAge(int age) throws UnderAgeException
{
	if(age>18)
		return true;
	throw new UnderAgeException("You are under age");
	
	
	
	
}
private boolean checkLocality(String locality)throws LocalityNotFoundException{
	String[] localities=new String[] {"JPNagar","Jaya Nagar","Bamashankari","Whitefield"};
	for(String nlocality : localities)
	{
		if(locality.equals(nlocality))
			return true;
	}
			throw new LocalityNotFoundException("Your locality is invalid");
	}
private boolean checkVoterId(long voterId) throws VoterIdNotFoundException {
	if(voterId >=10000 && voterId>99999)
		return true;
		throw new VoterIdNotFoundException("The voter id is not found");
	
	
}
}
