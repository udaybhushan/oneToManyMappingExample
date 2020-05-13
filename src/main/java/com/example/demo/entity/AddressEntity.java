package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ADDRESS")
public class AddressEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private int Id;
	@Column(name="ADDRESS_1")
	private String address1;
	@Column(name="ADDRESS_2")
	private String address2;
	@Column(name="AREA")
	private String area;
	@Column(name="CITY")
	private String city;
	@ManyToOne
	@JoinColumn(name = "BANK_BRANCH_ID")
	@JsonBackReference
	private BankBranchEntity bankBranch;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public BankBranchEntity getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(BankBranchEntity bankBranch) {
		this.bankBranch = bankBranch;
	}
	
}
