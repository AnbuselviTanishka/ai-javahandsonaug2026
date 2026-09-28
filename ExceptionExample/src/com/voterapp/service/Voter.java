package com.voterapp.service;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.VoterIdNotFoundException;
import com.voterapp.exception.NotEligibleException;

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IElectionBooth electionBooth=new ElectionBoothImpl();
		try
		{
			boolean isEligible=electionBooth.checkEligibility(19, "Whitefield", 1000);
			if(isEligible)
			{
				System.out.println("You are eligible to vote");
			}
		}
		catch(UnderAgeException | LocalityNotFoundException | VoterIdNotFoundException e) {
			System.out.println(e.getMessage());
			
						}
		catch(NotEligibleException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
