package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.pojo.Address;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "BANK_BRANCH")
public class BankBranchEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BANK_BRANCH_ID")
	private int id;
	@Column(name = "BANK_BRANCH_NAME")
	private String bankBranchName;
	@Column(name = "BANK_BRANCH_PHONE")
	private String bankBranchPhone;
	@Column(name = "IFSC_NUMBER")
	private String ifscNumber;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "bankBranch")
	@JsonManagedReference
	private List<AddressEntity> bankBranchAddress;
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "BANK_ID")
	private BankDetailsEntity bank;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public List<AddressEntity> getBankBranchAddress() {
		return bankBranchAddress;
	}
	public void setBankBranchAddress(List<AddressEntity> bankBranchAddress) {
		this.bankBranchAddress = bankBranchAddress;
	}
	public BankDetailsEntity getBank() {
		return bank;
	}
	public void setBank(BankDetailsEntity bank) {
		this.bank = bank;
	}
	

}
