package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDTO;

public interface IAccountsService {
	
	/*
	 * 
	 * @param customerDTO - CustomerDTO Object
	 * @return create account
	 * */
	void createAccount(CustomerDTO customerDTO);
	
	/*
	 * 
	 * @param mobileNumber - Input Mobile Number
	 * @return Accounts Details based on a given mobileNumber
	 * */
	CustomerDTO fetchAccount(String mobileNumber);
	
	/*
	 * 
	 * @param customerDTO - CustomerDTO Object
	 * @return boolean indicating if the update of account details is successful or not
	 * */
	boolean updateAccount(CustomerDTO customerDTO);
	
	/*
	 * 
	 * @param mobileNumber - Input Mobile Number
	 * @return boolean indicating if the delete of account details is successful or not
	 * */
	boolean deleteAccount(String mobileNumber);
}
