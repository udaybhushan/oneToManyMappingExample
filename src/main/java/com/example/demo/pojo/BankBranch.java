package com.example.demo.pojo;

import java.util.List;

public class BankBranch {
	
	private String bankBranchName;
	private String bankBranchPhone;
	private String ifscNumber;
	private List<Address> bankBranchAddress;

	public String getBankBranchName() {
		return bankBranchName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getBankBranchPhone() {
		return bankBranchPhone;
	}

	public void setBankBranchPhone(String bankBranchPhone) {
		this.bankBranchPhone = bankBranchPhone;
	}

	public String getIfscNumber() {
		return ifscNumber;
	}

	public void setIfscNumber(String ifscNumber) {
		this.ifscNumber = ifscNumber;
	}

	public List<Address> getBankBranchAddress() {
		return bankBranchAddress;
	}

	public void setBankBranchAddress(List<Address> bankBranchAddress) {
		this.bankBranchAddress = bankBranchAddress;
	}
}
