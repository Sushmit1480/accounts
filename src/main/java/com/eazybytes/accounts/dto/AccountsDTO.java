package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Schema(
		name = "Accounts",
		description = "Schema to hold Account Information"
		)
public class AccountsDTO {
	
	@NotEmpty(message = "Account Number can not be a null or Empty")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
	@Schema(
			description = "Acccount Number of Eazy Bank Account",
			example = "3454433243"
			)
	private Long accountNumber;
	
	@NotEmpty(message = "Account Type can not be a null or Empty")
	@Schema(
			description = "Account type of Eazy Bank account",
			example = "Savings"
			)
	private String accountType;
	
	@NotEmpty(message = "Branch Address can not be a null or Empty")
	@Schema(
			description = "Eazy Bank branch address",
			example = "123 New York"
			)
	private String branchAddress;

	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	
	@Override
	public String toString() {
		return "AccountsDTO [accountNumber=" + accountNumber + ", accountType=" + accountType + ", branchAddress="
				+ branchAddress + "]";
	}
	
	public AccountsDTO(Long accountNumber, String accountType, String branchAddress) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.branchAddress = branchAddress;
	}
	
	public AccountsDTO() {
	}
	
	
}
