package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Schema(
		name = "Customer",
		description = "Schema to hold Customer and Account Information"
		)
public class CustomerDTO {
	
	@Schema(
			description = "Name of the customer",
			example = "Eazy Bytes"
			)
	@NotEmpty(message="Name can not be a null or empty")
	@Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
	private String name;
	
	@Schema(
			description = "Email address of the customer",
			example = "test_user@gmail.com"
			)
	@NotEmpty(message="Email address can not be a null or empty")
	@Email(message = "Email address should be a valid value")
	private String email;
	
	@Schema(
			description = "Mobile number of the customer",
			example = "9645432123"
			)
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
	private String mobileNumber;
	
	@Schema(
			description = "Account detail of the customer"
			)
	private AccountsDTO accountsDTO;

	public AccountsDTO getAccountsDTO() {
		return accountsDTO;
	}

	public void setAccountsDTO(AccountsDTO accountsDTO) {
		this.accountsDTO = accountsDTO;
	}

	public CustomerDTO(String name, String email, String mobileNumber, AccountsDTO accountsDTO) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.accountsDTO = accountsDTO;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public CustomerDTO(String name, String email, String mobileNumber) {
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public CustomerDTO() {
	}
	
	
}
