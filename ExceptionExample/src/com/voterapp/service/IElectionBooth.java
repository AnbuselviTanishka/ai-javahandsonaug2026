package com.voterapp.service;

import com.voterapp.exception.NotEligibleException;

public interface IElectionBooth  {
boolean checkEligibility(int age,String locality,long voterId) throws NotEligibleException;
}
